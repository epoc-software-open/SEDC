/*
               File: tbw07_crf_memo_loc_bc
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:13.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw07_crf_memo_loc_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw07_crf_memo_loc_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw07_crf_memo_loc_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw07_crf_memo_loc_bc.class ));
   }

   public tbw07_crf_memo_loc_bc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z714TBW07_SESSION_ID = A714TBW07_SESSION_ID ;
            Z715TBW07_APP_ID = A715TBW07_APP_ID ;
            Z716TBW07_DISP_DATETIME = A716TBW07_DISP_DATETIME ;
            Z717TBW07_STUDY_ID = A717TBW07_STUDY_ID ;
            Z718TBW07_SUBJECT_ID = A718TBW07_SUBJECT_ID ;
            Z719TBW07_INS_NO = A719TBW07_INS_NO ;
            Z720TBW07_CRF_ID = A720TBW07_CRF_ID ;
            Z721TBW07_CRF_VERSION = A721TBW07_CRF_VERSION ;
            Z722TBW07_X = A722TBW07_X ;
            Z723TBW07_Y = A723TBW07_Y ;
            SetMode( "UPD") ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_1A0( )
   {
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1A45( ) ;
         }
         else
         {
            checkExtendedTable1A45( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1A45( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e111A2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1A45( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z724TBW07_EDIT_REQUEST_FLG = A724TBW07_EDIT_REQUEST_FLG ;
         Z725TBW07_COLOR_DIV = A725TBW07_COLOR_DIV ;
      }
      if ( GX_JID == -1 )
      {
         Z714TBW07_SESSION_ID = A714TBW07_SESSION_ID ;
         Z715TBW07_APP_ID = A715TBW07_APP_ID ;
         Z716TBW07_DISP_DATETIME = A716TBW07_DISP_DATETIME ;
         Z717TBW07_STUDY_ID = A717TBW07_STUDY_ID ;
         Z718TBW07_SUBJECT_ID = A718TBW07_SUBJECT_ID ;
         Z719TBW07_INS_NO = A719TBW07_INS_NO ;
         Z720TBW07_CRF_ID = A720TBW07_CRF_ID ;
         Z721TBW07_CRF_VERSION = A721TBW07_CRF_VERSION ;
         Z722TBW07_X = A722TBW07_X ;
         Z723TBW07_Y = A723TBW07_Y ;
         Z724TBW07_EDIT_REQUEST_FLG = A724TBW07_EDIT_REQUEST_FLG ;
         Z725TBW07_COLOR_DIV = A725TBW07_COLOR_DIV ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1A45( )
   {
      /* Using cursor BC001A4 */
      pr_default.execute(2, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A724TBW07_EDIT_REQUEST_FLG = BC001A4_A724TBW07_EDIT_REQUEST_FLG[0] ;
         n724TBW07_EDIT_REQUEST_FLG = BC001A4_n724TBW07_EDIT_REQUEST_FLG[0] ;
         A725TBW07_COLOR_DIV = BC001A4_A725TBW07_COLOR_DIV[0] ;
         n725TBW07_COLOR_DIV = BC001A4_n725TBW07_COLOR_DIV[0] ;
         zm1A45( -1) ;
      }
      pr_default.close(2);
      onLoadActions1A45( ) ;
   }

   public void onLoadActions1A45( )
   {
      AV8Pgmname = "TBW07_CRF_MEMO_LOC_BC" ;
   }

   public void checkExtendedTable1A45( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW07_CRF_MEMO_LOC_BC" ;
   }

   public void closeExtendedTableCursors1A45( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1A45( )
   {
      /* Using cursor BC001A5 */
      pr_default.execute(3, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001A3 */
      pr_default.execute(1, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1A45( 1) ;
         RcdFound45 = (short)(1) ;
         A714TBW07_SESSION_ID = BC001A3_A714TBW07_SESSION_ID[0] ;
         A715TBW07_APP_ID = BC001A3_A715TBW07_APP_ID[0] ;
         A716TBW07_DISP_DATETIME = BC001A3_A716TBW07_DISP_DATETIME[0] ;
         A717TBW07_STUDY_ID = BC001A3_A717TBW07_STUDY_ID[0] ;
         A718TBW07_SUBJECT_ID = BC001A3_A718TBW07_SUBJECT_ID[0] ;
         A719TBW07_INS_NO = BC001A3_A719TBW07_INS_NO[0] ;
         A720TBW07_CRF_ID = BC001A3_A720TBW07_CRF_ID[0] ;
         A721TBW07_CRF_VERSION = BC001A3_A721TBW07_CRF_VERSION[0] ;
         A722TBW07_X = BC001A3_A722TBW07_X[0] ;
         A723TBW07_Y = BC001A3_A723TBW07_Y[0] ;
         A724TBW07_EDIT_REQUEST_FLG = BC001A3_A724TBW07_EDIT_REQUEST_FLG[0] ;
         n724TBW07_EDIT_REQUEST_FLG = BC001A3_n724TBW07_EDIT_REQUEST_FLG[0] ;
         A725TBW07_COLOR_DIV = BC001A3_A725TBW07_COLOR_DIV[0] ;
         n725TBW07_COLOR_DIV = BC001A3_n725TBW07_COLOR_DIV[0] ;
         Z714TBW07_SESSION_ID = A714TBW07_SESSION_ID ;
         Z715TBW07_APP_ID = A715TBW07_APP_ID ;
         Z716TBW07_DISP_DATETIME = A716TBW07_DISP_DATETIME ;
         Z717TBW07_STUDY_ID = A717TBW07_STUDY_ID ;
         Z718TBW07_SUBJECT_ID = A718TBW07_SUBJECT_ID ;
         Z719TBW07_INS_NO = A719TBW07_INS_NO ;
         Z720TBW07_CRF_ID = A720TBW07_CRF_ID ;
         Z721TBW07_CRF_VERSION = A721TBW07_CRF_VERSION ;
         Z722TBW07_X = A722TBW07_X ;
         Z723TBW07_Y = A723TBW07_Y ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1A45( ) ;
         Gx_mode = sMode45 ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey1A45( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_1A0( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency1A45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001A2 */
         pr_default.execute(0, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z724TBW07_EDIT_REQUEST_FLG, BC001A2_A724TBW07_EDIT_REQUEST_FLG[0]) != 0 ) || ( GXutil.strcmp(Z725TBW07_COLOR_DIV, BC001A2_A725TBW07_COLOR_DIV[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A45( )
   {
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A45( 0) ;
         checkOptimisticConcurrency1A45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A45( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001A6 */
                  pr_default.execute(4, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y), new Boolean(n724TBW07_EDIT_REQUEST_FLG), A724TBW07_EDIT_REQUEST_FLG, new Boolean(n725TBW07_COLOR_DIV), A725TBW07_COLOR_DIV});
                  if ( (pr_default.getStatus(4) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1A45( ) ;
         }
         endLevel1A45( ) ;
      }
      closeExtendedTableCursors1A45( ) ;
   }

   public void update1A45( )
   {
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A45( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001A7 */
                  pr_default.execute(5, new Object[] {new Boolean(n724TBW07_EDIT_REQUEST_FLG), A724TBW07_EDIT_REQUEST_FLG, new Boolean(n725TBW07_COLOR_DIV), A725TBW07_COLOR_DIV, A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A45( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1A45( ) ;
      }
      closeExtendedTableCursors1A45( ) ;
   }

   public void deferredUpdate1A45( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A45( ) ;
         afterConfirm1A45( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A45( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001A8 */
               pr_default.execute(6, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1A45( ) ;
      Gx_mode = sMode45 ;
   }

   public void onDeleteControls1A45( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW07_CRF_MEMO_LOC_BC" ;
      }
   }

   public void endLevel1A45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1A45( )
   {
      /* Using cursor BC001A9 */
      pr_default.execute(7, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y)});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A714TBW07_SESSION_ID = BC001A9_A714TBW07_SESSION_ID[0] ;
         A715TBW07_APP_ID = BC001A9_A715TBW07_APP_ID[0] ;
         A716TBW07_DISP_DATETIME = BC001A9_A716TBW07_DISP_DATETIME[0] ;
         A717TBW07_STUDY_ID = BC001A9_A717TBW07_STUDY_ID[0] ;
         A718TBW07_SUBJECT_ID = BC001A9_A718TBW07_SUBJECT_ID[0] ;
         A719TBW07_INS_NO = BC001A9_A719TBW07_INS_NO[0] ;
         A720TBW07_CRF_ID = BC001A9_A720TBW07_CRF_ID[0] ;
         A721TBW07_CRF_VERSION = BC001A9_A721TBW07_CRF_VERSION[0] ;
         A722TBW07_X = BC001A9_A722TBW07_X[0] ;
         A723TBW07_Y = BC001A9_A723TBW07_Y[0] ;
         A724TBW07_EDIT_REQUEST_FLG = BC001A9_A724TBW07_EDIT_REQUEST_FLG[0] ;
         n724TBW07_EDIT_REQUEST_FLG = BC001A9_n724TBW07_EDIT_REQUEST_FLG[0] ;
         A725TBW07_COLOR_DIV = BC001A9_A725TBW07_COLOR_DIV[0] ;
         n725TBW07_COLOR_DIV = BC001A9_n725TBW07_COLOR_DIV[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1A45( )
   {
      pr_default.readNext(7);
      RcdFound45 = (short)(0) ;
      scanKeyLoad1A45( ) ;
   }

   public void scanKeyLoad1A45( )
   {
      sMode45 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A714TBW07_SESSION_ID = BC001A9_A714TBW07_SESSION_ID[0] ;
         A715TBW07_APP_ID = BC001A9_A715TBW07_APP_ID[0] ;
         A716TBW07_DISP_DATETIME = BC001A9_A716TBW07_DISP_DATETIME[0] ;
         A717TBW07_STUDY_ID = BC001A9_A717TBW07_STUDY_ID[0] ;
         A718TBW07_SUBJECT_ID = BC001A9_A718TBW07_SUBJECT_ID[0] ;
         A719TBW07_INS_NO = BC001A9_A719TBW07_INS_NO[0] ;
         A720TBW07_CRF_ID = BC001A9_A720TBW07_CRF_ID[0] ;
         A721TBW07_CRF_VERSION = BC001A9_A721TBW07_CRF_VERSION[0] ;
         A722TBW07_X = BC001A9_A722TBW07_X[0] ;
         A723TBW07_Y = BC001A9_A723TBW07_Y[0] ;
         A724TBW07_EDIT_REQUEST_FLG = BC001A9_A724TBW07_EDIT_REQUEST_FLG[0] ;
         n724TBW07_EDIT_REQUEST_FLG = BC001A9_n724TBW07_EDIT_REQUEST_FLG[0] ;
         A725TBW07_COLOR_DIV = BC001A9_A725TBW07_COLOR_DIV[0] ;
         n725TBW07_COLOR_DIV = BC001A9_n725TBW07_COLOR_DIV[0] ;
      }
      Gx_mode = sMode45 ;
   }

   public void scanKeyEnd1A45( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1A45( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A45( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A45( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A45( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A45( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A45( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A45( )
   {
   }

   public void addRow1A45( )
   {
      VarsToRow45( bcTBW07_CRF_MEMO_LOC) ;
   }

   public void readRow1A45( )
   {
      RowToVars45( bcTBW07_CRF_MEMO_LOC, 1) ;
   }

   public void initializeNonKey1A45( )
   {
      A724TBW07_EDIT_REQUEST_FLG = "" ;
      n724TBW07_EDIT_REQUEST_FLG = false ;
      A725TBW07_COLOR_DIV = "" ;
      n725TBW07_COLOR_DIV = false ;
   }

   public void initAll1A45( )
   {
      A714TBW07_SESSION_ID = "" ;
      A715TBW07_APP_ID = "" ;
      A716TBW07_DISP_DATETIME = "" ;
      A717TBW07_STUDY_ID = 0 ;
      A718TBW07_SUBJECT_ID = 0 ;
      A719TBW07_INS_NO = (short)(0) ;
      A720TBW07_CRF_ID = (short)(0) ;
      A721TBW07_CRF_VERSION = (short)(0) ;
      A722TBW07_X = (short)(0) ;
      A723TBW07_Y = (short)(0) ;
      initializeNonKey1A45( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow45( SdtTBW07_CRF_MEMO_LOC obj45 )
   {
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( Gx_mode );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg( A724TBW07_EDIT_REQUEST_FLG );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div( A725TBW07_COLOR_DIV );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id( A714TBW07_SESSION_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id( A715TBW07_APP_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime( A716TBW07_DISP_DATETIME );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id( A717TBW07_STUDY_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id( A718TBW07_SUBJECT_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no( A719TBW07_INS_NO );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id( A720TBW07_CRF_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version( A721TBW07_CRF_VERSION );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x( A722TBW07_X );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y( A723TBW07_Y );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z( Z714TBW07_SESSION_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z( Z715TBW07_APP_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z( Z716TBW07_DISP_DATETIME );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z( Z717TBW07_STUDY_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z( Z718TBW07_SUBJECT_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z( Z719TBW07_INS_NO );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z( Z720TBW07_CRF_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z( Z721TBW07_CRF_VERSION );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z( Z722TBW07_X );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z( Z723TBW07_Y );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z( Z724TBW07_EDIT_REQUEST_FLG );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z( Z725TBW07_COLOR_DIV );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N( (byte)((byte)((n724TBW07_EDIT_REQUEST_FLG)?1:0)) );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N( (byte)((byte)((n725TBW07_COLOR_DIV)?1:0)) );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void RowToVars45( SdtTBW07_CRF_MEMO_LOC obj45 ,
                            int forceLoad )
   {
      Gx_mode = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode() ;
      A724TBW07_EDIT_REQUEST_FLG = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg() ;
      n724TBW07_EDIT_REQUEST_FLG = false ;
      A725TBW07_COLOR_DIV = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div() ;
      n725TBW07_COLOR_DIV = false ;
      A714TBW07_SESSION_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id() ;
      A715TBW07_APP_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id() ;
      A716TBW07_DISP_DATETIME = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime() ;
      A717TBW07_STUDY_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id() ;
      A718TBW07_SUBJECT_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id() ;
      A719TBW07_INS_NO = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no() ;
      A720TBW07_CRF_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id() ;
      A721TBW07_CRF_VERSION = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version() ;
      A722TBW07_X = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x() ;
      A723TBW07_Y = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y() ;
      Z714TBW07_SESSION_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z() ;
      Z715TBW07_APP_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z() ;
      Z716TBW07_DISP_DATETIME = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z() ;
      Z717TBW07_STUDY_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z() ;
      Z718TBW07_SUBJECT_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z() ;
      Z719TBW07_INS_NO = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z() ;
      Z720TBW07_CRF_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z() ;
      Z721TBW07_CRF_VERSION = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z() ;
      Z722TBW07_X = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z() ;
      Z723TBW07_Y = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z() ;
      Z724TBW07_EDIT_REQUEST_FLG = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z() ;
      Z725TBW07_COLOR_DIV = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z() ;
      n724TBW07_EDIT_REQUEST_FLG = (boolean)((obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N()==0)?false:true) ;
      n725TBW07_COLOR_DIV = (boolean)((obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N()==0)?false:true) ;
      Gx_mode = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A714TBW07_SESSION_ID = (String)getParm(obj,0) ;
      A715TBW07_APP_ID = (String)getParm(obj,1) ;
      A716TBW07_DISP_DATETIME = (String)getParm(obj,2) ;
      A717TBW07_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A718TBW07_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A719TBW07_INS_NO = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      A720TBW07_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      A721TBW07_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      A722TBW07_X = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.SHORT)).shortValue() ;
      A723TBW07_Y = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1A45( ) ;
      scanKeyStart1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z714TBW07_SESSION_ID = A714TBW07_SESSION_ID ;
         Z715TBW07_APP_ID = A715TBW07_APP_ID ;
         Z716TBW07_DISP_DATETIME = A716TBW07_DISP_DATETIME ;
         Z717TBW07_STUDY_ID = A717TBW07_STUDY_ID ;
         Z718TBW07_SUBJECT_ID = A718TBW07_SUBJECT_ID ;
         Z719TBW07_INS_NO = A719TBW07_INS_NO ;
         Z720TBW07_CRF_ID = A720TBW07_CRF_ID ;
         Z721TBW07_CRF_VERSION = A721TBW07_CRF_VERSION ;
         Z722TBW07_X = A722TBW07_X ;
         Z723TBW07_Y = A723TBW07_Y ;
      }
      zm1A45( -1) ;
      sMode45 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1A45( ) ;
      Gx_mode = sMode45 ;
      addRow1A45( ) ;
      scanKeyEnd1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars45( bcTBW07_CRF_MEMO_LOC, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1A45( ) ;
      if ( RcdFound45 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A714TBW07_SESSION_ID, Z714TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A715TBW07_APP_ID, Z715TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A716TBW07_DISP_DATETIME, Z716TBW07_DISP_DATETIME) != 0 ) || ( A717TBW07_STUDY_ID != Z717TBW07_STUDY_ID ) || ( A718TBW07_SUBJECT_ID != Z718TBW07_SUBJECT_ID ) || ( A719TBW07_INS_NO != Z719TBW07_INS_NO ) || ( A720TBW07_CRF_ID != Z720TBW07_CRF_ID ) || ( A721TBW07_CRF_VERSION != Z721TBW07_CRF_VERSION ) || ( A722TBW07_X != Z722TBW07_X ) || ( A723TBW07_Y != Z723TBW07_Y ) )
         {
            A714TBW07_SESSION_ID = Z714TBW07_SESSION_ID ;
            A715TBW07_APP_ID = Z715TBW07_APP_ID ;
            A716TBW07_DISP_DATETIME = Z716TBW07_DISP_DATETIME ;
            A717TBW07_STUDY_ID = Z717TBW07_STUDY_ID ;
            A718TBW07_SUBJECT_ID = Z718TBW07_SUBJECT_ID ;
            A719TBW07_INS_NO = Z719TBW07_INS_NO ;
            A720TBW07_CRF_ID = Z720TBW07_CRF_ID ;
            A721TBW07_CRF_VERSION = Z721TBW07_CRF_VERSION ;
            A722TBW07_X = Z722TBW07_X ;
            A723TBW07_Y = Z723TBW07_Y ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            /* Update record */
            update1A45( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
         else
         {
            if ( ( GXutil.strcmp(A714TBW07_SESSION_ID, Z714TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A715TBW07_APP_ID, Z715TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A716TBW07_DISP_DATETIME, Z716TBW07_DISP_DATETIME) != 0 ) || ( A717TBW07_STUDY_ID != Z717TBW07_STUDY_ID ) || ( A718TBW07_SUBJECT_ID != Z718TBW07_SUBJECT_ID ) || ( A719TBW07_INS_NO != Z719TBW07_INS_NO ) || ( A720TBW07_CRF_ID != Z720TBW07_CRF_ID ) || ( A721TBW07_CRF_VERSION != Z721TBW07_CRF_VERSION ) || ( A722TBW07_X != Z722TBW07_X ) || ( A723TBW07_Y != Z723TBW07_Y ) )
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  Gx_mode = "INS" ;
                  /* Insert record */
                  insert1A45( ) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  Gx_mode = "INS" ;
                  /* Insert record */
                  insert1A45( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow45( bcTBW07_CRF_MEMO_LOC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars45( bcTBW07_CRF_MEMO_LOC, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1A45( ) ;
      if ( RcdFound45 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A714TBW07_SESSION_ID, Z714TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A715TBW07_APP_ID, Z715TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A716TBW07_DISP_DATETIME, Z716TBW07_DISP_DATETIME) != 0 ) || ( A717TBW07_STUDY_ID != Z717TBW07_STUDY_ID ) || ( A718TBW07_SUBJECT_ID != Z718TBW07_SUBJECT_ID ) || ( A719TBW07_INS_NO != Z719TBW07_INS_NO ) || ( A720TBW07_CRF_ID != Z720TBW07_CRF_ID ) || ( A721TBW07_CRF_VERSION != Z721TBW07_CRF_VERSION ) || ( A722TBW07_X != Z722TBW07_X ) || ( A723TBW07_Y != Z723TBW07_Y ) )
         {
            A714TBW07_SESSION_ID = Z714TBW07_SESSION_ID ;
            A715TBW07_APP_ID = Z715TBW07_APP_ID ;
            A716TBW07_DISP_DATETIME = Z716TBW07_DISP_DATETIME ;
            A717TBW07_STUDY_ID = Z717TBW07_STUDY_ID ;
            A718TBW07_SUBJECT_ID = Z718TBW07_SUBJECT_ID ;
            A719TBW07_INS_NO = Z719TBW07_INS_NO ;
            A720TBW07_CRF_ID = Z720TBW07_CRF_ID ;
            A721TBW07_CRF_VERSION = Z721TBW07_CRF_VERSION ;
            A722TBW07_X = Z722TBW07_X ;
            A723TBW07_Y = Z723TBW07_Y ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A714TBW07_SESSION_ID, Z714TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A715TBW07_APP_ID, Z715TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A716TBW07_DISP_DATETIME, Z716TBW07_DISP_DATETIME) != 0 ) || ( A717TBW07_STUDY_ID != Z717TBW07_STUDY_ID ) || ( A718TBW07_SUBJECT_ID != Z718TBW07_SUBJECT_ID ) || ( A719TBW07_INS_NO != Z719TBW07_INS_NO ) || ( A720TBW07_CRF_ID != Z720TBW07_CRF_ID ) || ( A721TBW07_CRF_VERSION != Z721TBW07_CRF_VERSION ) || ( A722TBW07_X != Z722TBW07_X ) || ( A723TBW07_Y != Z723TBW07_Y ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw07_crf_memo_loc_bc");
      VarsToRow45( bcTBW07_CRF_MEMO_LOC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcTBW07_CRF_MEMO_LOC.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW07_CRF_MEMO_LOC.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW07_CRF_MEMO_LOC sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW07_CRF_MEMO_LOC )
      {
         bcTBW07_CRF_MEMO_LOC = sdt ;
         if ( GXutil.strcmp(bcTBW07_CRF_MEMO_LOC.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode(), "") == 0 )
         {
            bcTBW07_CRF_MEMO_LOC.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow45( bcTBW07_CRF_MEMO_LOC) ;
         }
         else
         {
            RowToVars45( bcTBW07_CRF_MEMO_LOC, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW07_CRF_MEMO_LOC.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode(), "") == 0 )
         {
            bcTBW07_CRF_MEMO_LOC.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars45( bcTBW07_CRF_MEMO_LOC, 1) ;
   }

   public SdtTBW07_CRF_MEMO_LOC getTBW07_CRF_MEMO_LOC_BC( )
   {
      return bcTBW07_CRF_MEMO_LOC ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   /* Error handler code */
   public void handleError( )
   {
      if ( context.globals.getErr( ) != 0 )
      {
         Gx_err = context.globals.getErr( ) ;
         Gx_emsg = context.globals.getErrMsg( ) ;
         switch ( GXActiveErrHndl )
         {
               default:
                  /* Execute user subroutine: S1132 */
                  S1132 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z714TBW07_SESSION_ID = "" ;
      A714TBW07_SESSION_ID = "" ;
      Z715TBW07_APP_ID = "" ;
      A715TBW07_APP_ID = "" ;
      Z716TBW07_DISP_DATETIME = "" ;
      A716TBW07_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z = "" ;
      Z724TBW07_EDIT_REQUEST_FLG = "" ;
      A724TBW07_EDIT_REQUEST_FLG = "" ;
      Z725TBW07_COLOR_DIV = "" ;
      A725TBW07_COLOR_DIV = "" ;
      BC001A4_A714TBW07_SESSION_ID = new String[] {""} ;
      BC001A4_A715TBW07_APP_ID = new String[] {""} ;
      BC001A4_A716TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A4_A717TBW07_STUDY_ID = new long[1] ;
      BC001A4_A718TBW07_SUBJECT_ID = new int[1] ;
      BC001A4_A719TBW07_INS_NO = new short[1] ;
      BC001A4_A720TBW07_CRF_ID = new short[1] ;
      BC001A4_A721TBW07_CRF_VERSION = new short[1] ;
      BC001A4_A722TBW07_X = new short[1] ;
      BC001A4_A723TBW07_Y = new short[1] ;
      BC001A4_A724TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A4_n724TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A4_A725TBW07_COLOR_DIV = new String[] {""} ;
      BC001A4_n725TBW07_COLOR_DIV = new boolean[] {false} ;
      BC001A5_A714TBW07_SESSION_ID = new String[] {""} ;
      BC001A5_A715TBW07_APP_ID = new String[] {""} ;
      BC001A5_A716TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A5_A717TBW07_STUDY_ID = new long[1] ;
      BC001A5_A718TBW07_SUBJECT_ID = new int[1] ;
      BC001A5_A719TBW07_INS_NO = new short[1] ;
      BC001A5_A720TBW07_CRF_ID = new short[1] ;
      BC001A5_A721TBW07_CRF_VERSION = new short[1] ;
      BC001A5_A722TBW07_X = new short[1] ;
      BC001A5_A723TBW07_Y = new short[1] ;
      BC001A3_A714TBW07_SESSION_ID = new String[] {""} ;
      BC001A3_A715TBW07_APP_ID = new String[] {""} ;
      BC001A3_A716TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A3_A717TBW07_STUDY_ID = new long[1] ;
      BC001A3_A718TBW07_SUBJECT_ID = new int[1] ;
      BC001A3_A719TBW07_INS_NO = new short[1] ;
      BC001A3_A720TBW07_CRF_ID = new short[1] ;
      BC001A3_A721TBW07_CRF_VERSION = new short[1] ;
      BC001A3_A722TBW07_X = new short[1] ;
      BC001A3_A723TBW07_Y = new short[1] ;
      BC001A3_A724TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A3_n724TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A3_A725TBW07_COLOR_DIV = new String[] {""} ;
      BC001A3_n725TBW07_COLOR_DIV = new boolean[] {false} ;
      sMode45 = "" ;
      BC001A2_A714TBW07_SESSION_ID = new String[] {""} ;
      BC001A2_A715TBW07_APP_ID = new String[] {""} ;
      BC001A2_A716TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A2_A717TBW07_STUDY_ID = new long[1] ;
      BC001A2_A718TBW07_SUBJECT_ID = new int[1] ;
      BC001A2_A719TBW07_INS_NO = new short[1] ;
      BC001A2_A720TBW07_CRF_ID = new short[1] ;
      BC001A2_A721TBW07_CRF_VERSION = new short[1] ;
      BC001A2_A722TBW07_X = new short[1] ;
      BC001A2_A723TBW07_Y = new short[1] ;
      BC001A2_A724TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A2_n724TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A2_A725TBW07_COLOR_DIV = new String[] {""} ;
      BC001A2_n725TBW07_COLOR_DIV = new boolean[] {false} ;
      BC001A9_A714TBW07_SESSION_ID = new String[] {""} ;
      BC001A9_A715TBW07_APP_ID = new String[] {""} ;
      BC001A9_A716TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A9_A717TBW07_STUDY_ID = new long[1] ;
      BC001A9_A718TBW07_SUBJECT_ID = new int[1] ;
      BC001A9_A719TBW07_INS_NO = new short[1] ;
      BC001A9_A720TBW07_CRF_ID = new short[1] ;
      BC001A9_A721TBW07_CRF_VERSION = new short[1] ;
      BC001A9_A722TBW07_X = new short[1] ;
      BC001A9_A723TBW07_Y = new short[1] ;
      BC001A9_A724TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A9_n724TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A9_A725TBW07_COLOR_DIV = new String[] {""} ;
      BC001A9_n725TBW07_COLOR_DIV = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw07_crf_memo_loc_bc__default(),
         new Object[] {
             new Object[] {
            BC001A2_A714TBW07_SESSION_ID, BC001A2_A715TBW07_APP_ID, BC001A2_A716TBW07_DISP_DATETIME, BC001A2_A717TBW07_STUDY_ID, BC001A2_A718TBW07_SUBJECT_ID, BC001A2_A719TBW07_INS_NO, BC001A2_A720TBW07_CRF_ID, BC001A2_A721TBW07_CRF_VERSION, BC001A2_A722TBW07_X, BC001A2_A723TBW07_Y,
            BC001A2_A724TBW07_EDIT_REQUEST_FLG, BC001A2_n724TBW07_EDIT_REQUEST_FLG, BC001A2_A725TBW07_COLOR_DIV, BC001A2_n725TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A3_A714TBW07_SESSION_ID, BC001A3_A715TBW07_APP_ID, BC001A3_A716TBW07_DISP_DATETIME, BC001A3_A717TBW07_STUDY_ID, BC001A3_A718TBW07_SUBJECT_ID, BC001A3_A719TBW07_INS_NO, BC001A3_A720TBW07_CRF_ID, BC001A3_A721TBW07_CRF_VERSION, BC001A3_A722TBW07_X, BC001A3_A723TBW07_Y,
            BC001A3_A724TBW07_EDIT_REQUEST_FLG, BC001A3_n724TBW07_EDIT_REQUEST_FLG, BC001A3_A725TBW07_COLOR_DIV, BC001A3_n725TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A4_A714TBW07_SESSION_ID, BC001A4_A715TBW07_APP_ID, BC001A4_A716TBW07_DISP_DATETIME, BC001A4_A717TBW07_STUDY_ID, BC001A4_A718TBW07_SUBJECT_ID, BC001A4_A719TBW07_INS_NO, BC001A4_A720TBW07_CRF_ID, BC001A4_A721TBW07_CRF_VERSION, BC001A4_A722TBW07_X, BC001A4_A723TBW07_Y,
            BC001A4_A724TBW07_EDIT_REQUEST_FLG, BC001A4_n724TBW07_EDIT_REQUEST_FLG, BC001A4_A725TBW07_COLOR_DIV, BC001A4_n725TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A5_A714TBW07_SESSION_ID, BC001A5_A715TBW07_APP_ID, BC001A5_A716TBW07_DISP_DATETIME, BC001A5_A717TBW07_STUDY_ID, BC001A5_A718TBW07_SUBJECT_ID, BC001A5_A719TBW07_INS_NO, BC001A5_A720TBW07_CRF_ID, BC001A5_A721TBW07_CRF_VERSION, BC001A5_A722TBW07_X, BC001A5_A723TBW07_Y
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001A9_A714TBW07_SESSION_ID, BC001A9_A715TBW07_APP_ID, BC001A9_A716TBW07_DISP_DATETIME, BC001A9_A717TBW07_STUDY_ID, BC001A9_A718TBW07_SUBJECT_ID, BC001A9_A719TBW07_INS_NO, BC001A9_A720TBW07_CRF_ID, BC001A9_A721TBW07_CRF_VERSION, BC001A9_A722TBW07_X, BC001A9_A723TBW07_Y,
            BC001A9_A724TBW07_EDIT_REQUEST_FLG, BC001A9_n724TBW07_EDIT_REQUEST_FLG, BC001A9_A725TBW07_COLOR_DIV, BC001A9_n725TBW07_COLOR_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW07_CRF_MEMO_LOC_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111A2 */
      e111A2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N ;
   private byte gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z719TBW07_INS_NO ;
   private short A719TBW07_INS_NO ;
   private short Z720TBW07_CRF_ID ;
   private short A720TBW07_CRF_ID ;
   private short Z721TBW07_CRF_VERSION ;
   private short A721TBW07_CRF_VERSION ;
   private short Z722TBW07_X ;
   private short A722TBW07_X ;
   private short Z723TBW07_Y ;
   private short A723TBW07_Y ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z ;
   private short RcdFound45 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z718TBW07_SUBJECT_ID ;
   private int A718TBW07_SUBJECT_ID ;
   private int gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z717TBW07_STUDY_ID ;
   private long A717TBW07_STUDY_ID ;
   private long gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String sMode45 ;
   private String Gx_emsg ;
   private boolean n724TBW07_EDIT_REQUEST_FLG ;
   private boolean n725TBW07_COLOR_DIV ;
   private String Z714TBW07_SESSION_ID ;
   private String A714TBW07_SESSION_ID ;
   private String Z715TBW07_APP_ID ;
   private String A715TBW07_APP_ID ;
   private String Z716TBW07_DISP_DATETIME ;
   private String A716TBW07_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z ;
   private String Z724TBW07_EDIT_REQUEST_FLG ;
   private String A724TBW07_EDIT_REQUEST_FLG ;
   private String Z725TBW07_COLOR_DIV ;
   private String A725TBW07_COLOR_DIV ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW07_CRF_MEMO_LOC bcTBW07_CRF_MEMO_LOC ;
   private IDataStoreProvider pr_default ;
   private String[] BC001A4_A714TBW07_SESSION_ID ;
   private String[] BC001A4_A715TBW07_APP_ID ;
   private String[] BC001A4_A716TBW07_DISP_DATETIME ;
   private long[] BC001A4_A717TBW07_STUDY_ID ;
   private int[] BC001A4_A718TBW07_SUBJECT_ID ;
   private short[] BC001A4_A719TBW07_INS_NO ;
   private short[] BC001A4_A720TBW07_CRF_ID ;
   private short[] BC001A4_A721TBW07_CRF_VERSION ;
   private short[] BC001A4_A722TBW07_X ;
   private short[] BC001A4_A723TBW07_Y ;
   private String[] BC001A4_A724TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A4_n724TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A4_A725TBW07_COLOR_DIV ;
   private boolean[] BC001A4_n725TBW07_COLOR_DIV ;
   private String[] BC001A5_A714TBW07_SESSION_ID ;
   private String[] BC001A5_A715TBW07_APP_ID ;
   private String[] BC001A5_A716TBW07_DISP_DATETIME ;
   private long[] BC001A5_A717TBW07_STUDY_ID ;
   private int[] BC001A5_A718TBW07_SUBJECT_ID ;
   private short[] BC001A5_A719TBW07_INS_NO ;
   private short[] BC001A5_A720TBW07_CRF_ID ;
   private short[] BC001A5_A721TBW07_CRF_VERSION ;
   private short[] BC001A5_A722TBW07_X ;
   private short[] BC001A5_A723TBW07_Y ;
   private String[] BC001A3_A714TBW07_SESSION_ID ;
   private String[] BC001A3_A715TBW07_APP_ID ;
   private String[] BC001A3_A716TBW07_DISP_DATETIME ;
   private long[] BC001A3_A717TBW07_STUDY_ID ;
   private int[] BC001A3_A718TBW07_SUBJECT_ID ;
   private short[] BC001A3_A719TBW07_INS_NO ;
   private short[] BC001A3_A720TBW07_CRF_ID ;
   private short[] BC001A3_A721TBW07_CRF_VERSION ;
   private short[] BC001A3_A722TBW07_X ;
   private short[] BC001A3_A723TBW07_Y ;
   private String[] BC001A3_A724TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A3_n724TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A3_A725TBW07_COLOR_DIV ;
   private boolean[] BC001A3_n725TBW07_COLOR_DIV ;
   private String[] BC001A2_A714TBW07_SESSION_ID ;
   private String[] BC001A2_A715TBW07_APP_ID ;
   private String[] BC001A2_A716TBW07_DISP_DATETIME ;
   private long[] BC001A2_A717TBW07_STUDY_ID ;
   private int[] BC001A2_A718TBW07_SUBJECT_ID ;
   private short[] BC001A2_A719TBW07_INS_NO ;
   private short[] BC001A2_A720TBW07_CRF_ID ;
   private short[] BC001A2_A721TBW07_CRF_VERSION ;
   private short[] BC001A2_A722TBW07_X ;
   private short[] BC001A2_A723TBW07_Y ;
   private String[] BC001A2_A724TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A2_n724TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A2_A725TBW07_COLOR_DIV ;
   private boolean[] BC001A2_n725TBW07_COLOR_DIV ;
   private String[] BC001A9_A714TBW07_SESSION_ID ;
   private String[] BC001A9_A715TBW07_APP_ID ;
   private String[] BC001A9_A716TBW07_DISP_DATETIME ;
   private long[] BC001A9_A717TBW07_STUDY_ID ;
   private int[] BC001A9_A718TBW07_SUBJECT_ID ;
   private short[] BC001A9_A719TBW07_INS_NO ;
   private short[] BC001A9_A720TBW07_CRF_ID ;
   private short[] BC001A9_A721TBW07_CRF_VERSION ;
   private short[] BC001A9_A722TBW07_X ;
   private short[] BC001A9_A723TBW07_Y ;
   private String[] BC001A9_A724TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A9_n724TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A9_A725TBW07_COLOR_DIV ;
   private boolean[] BC001A9_n725TBW07_COLOR_DIV ;
}

final  class tbw07_crf_memo_loc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001A2", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A3", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A4", "SELECT TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y`, TM1.`TBW07_EDIT_REQUEST_FLG`, TM1.`TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` TM1 WHERE TM1.`TBW07_SESSION_ID` = ? and TM1.`TBW07_APP_ID` = ? and TM1.`TBW07_DISP_DATETIME` = ? and TM1.`TBW07_STUDY_ID` = ? and TM1.`TBW07_SUBJECT_ID` = ? and TM1.`TBW07_INS_NO` = ? and TM1.`TBW07_CRF_ID` = ? and TM1.`TBW07_CRF_VERSION` = ? and TM1.`TBW07_X` = ? and TM1.`TBW07_Y` = ? ORDER BY TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC001A5", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001A6", "INSERT INTO `TBW07_CRF_MEMO_LOC` (`TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001A7", "UPDATE `TBW07_CRF_MEMO_LOC` SET `TBW07_EDIT_REQUEST_FLG`=?, `TBW07_COLOR_DIV`=?  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001A8", "DELETE FROM `TBW07_CRF_MEMO_LOC`  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001A9", "SELECT TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y`, TM1.`TBW07_EDIT_REQUEST_FLG`, TM1.`TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` TM1 WHERE TM1.`TBW07_SESSION_ID` = ? and TM1.`TBW07_APP_ID` = ? and TM1.`TBW07_DISP_DATETIME` = ? and TM1.`TBW07_STUDY_ID` = ? and TM1.`TBW07_SUBJECT_ID` = ? and TM1.`TBW07_INS_NO` = ? and TM1.`TBW07_CRF_ID` = ? and TM1.`TBW07_CRF_VERSION` = ? and TM1.`TBW07_X` = ? and TM1.`TBW07_Y` = ? ORDER BY TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y` ",true, GX_NOMASK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[13], 2);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setShort(12, ((Number) parms[13]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
      }
   }

}

