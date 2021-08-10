/*
               File: tbw07_crf_memo_loc_bc
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:56.86
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

   public void getInsDefault( )
   {
      readRow1A45( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1A45( ) ;
      standaloneModal( ) ;
      addRow1A45( ) ;
      Gx_mode = "INS" ;
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
            Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
            Z147TBW07_APP_ID = A147TBW07_APP_ID ;
            Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
            Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
            Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
            Z154TBW07_INS_NO = A154TBW07_INS_NO ;
            Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
            Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
            Z160TBW07_X = A160TBW07_X ;
            Z162TBW07_Y = A162TBW07_Y ;
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1A45( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z768TBW07_EDIT_REQUEST_FLG = A768TBW07_EDIT_REQUEST_FLG ;
         Z769TBW07_COLOR_DIV = A769TBW07_COLOR_DIV ;
      }
      if ( GX_JID == -1 )
      {
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
         Z768TBW07_EDIT_REQUEST_FLG = A768TBW07_EDIT_REQUEST_FLG ;
         Z769TBW07_COLOR_DIV = A769TBW07_COLOR_DIV ;
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
      pr_default.execute(2, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A768TBW07_EDIT_REQUEST_FLG = BC001A4_A768TBW07_EDIT_REQUEST_FLG[0] ;
         n768TBW07_EDIT_REQUEST_FLG = BC001A4_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = BC001A4_A769TBW07_COLOR_DIV[0] ;
         n769TBW07_COLOR_DIV = BC001A4_n769TBW07_COLOR_DIV[0] ;
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
      pr_default.execute(3, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
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
      pr_default.execute(1, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1A45( 1) ;
         RcdFound45 = (short)(1) ;
         A146TBW07_SESSION_ID = BC001A3_A146TBW07_SESSION_ID[0] ;
         A147TBW07_APP_ID = BC001A3_A147TBW07_APP_ID[0] ;
         A148TBW07_DISP_DATETIME = BC001A3_A148TBW07_DISP_DATETIME[0] ;
         A150TBW07_STUDY_ID = BC001A3_A150TBW07_STUDY_ID[0] ;
         A152TBW07_SUBJECT_ID = BC001A3_A152TBW07_SUBJECT_ID[0] ;
         A154TBW07_INS_NO = BC001A3_A154TBW07_INS_NO[0] ;
         A156TBW07_CRF_ID = BC001A3_A156TBW07_CRF_ID[0] ;
         A158TBW07_CRF_VERSION = BC001A3_A158TBW07_CRF_VERSION[0] ;
         A160TBW07_X = BC001A3_A160TBW07_X[0] ;
         A162TBW07_Y = BC001A3_A162TBW07_Y[0] ;
         A768TBW07_EDIT_REQUEST_FLG = BC001A3_A768TBW07_EDIT_REQUEST_FLG[0] ;
         n768TBW07_EDIT_REQUEST_FLG = BC001A3_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = BC001A3_A769TBW07_COLOR_DIV[0] ;
         n769TBW07_COLOR_DIV = BC001A3_n769TBW07_COLOR_DIV[0] ;
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1A45( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey1A45( ) ;
         }
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
         pr_default.execute(0, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z768TBW07_EDIT_REQUEST_FLG, BC001A2_A768TBW07_EDIT_REQUEST_FLG[0]) != 0 ) || ( GXutil.strcmp(Z769TBW07_COLOR_DIV, BC001A2_A769TBW07_COLOR_DIV[0]) != 0 ) )
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
                  pr_default.execute(4, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y), new Boolean(n768TBW07_EDIT_REQUEST_FLG), A768TBW07_EDIT_REQUEST_FLG, new Boolean(n769TBW07_COLOR_DIV), A769TBW07_COLOR_DIV});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
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
                  pr_default.execute(5, new Object[] {new Boolean(n768TBW07_EDIT_REQUEST_FLG), A768TBW07_EDIT_REQUEST_FLG, new Boolean(n769TBW07_COLOR_DIV), A769TBW07_COLOR_DIV, A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
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
               pr_default.execute(6, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "", true);
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
      /* Scan By routine */
      /* Using cursor BC001A9 */
      pr_default.execute(7, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A146TBW07_SESSION_ID = BC001A9_A146TBW07_SESSION_ID[0] ;
         A147TBW07_APP_ID = BC001A9_A147TBW07_APP_ID[0] ;
         A148TBW07_DISP_DATETIME = BC001A9_A148TBW07_DISP_DATETIME[0] ;
         A150TBW07_STUDY_ID = BC001A9_A150TBW07_STUDY_ID[0] ;
         A152TBW07_SUBJECT_ID = BC001A9_A152TBW07_SUBJECT_ID[0] ;
         A154TBW07_INS_NO = BC001A9_A154TBW07_INS_NO[0] ;
         A156TBW07_CRF_ID = BC001A9_A156TBW07_CRF_ID[0] ;
         A158TBW07_CRF_VERSION = BC001A9_A158TBW07_CRF_VERSION[0] ;
         A160TBW07_X = BC001A9_A160TBW07_X[0] ;
         A162TBW07_Y = BC001A9_A162TBW07_Y[0] ;
         A768TBW07_EDIT_REQUEST_FLG = BC001A9_A768TBW07_EDIT_REQUEST_FLG[0] ;
         n768TBW07_EDIT_REQUEST_FLG = BC001A9_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = BC001A9_A769TBW07_COLOR_DIV[0] ;
         n769TBW07_COLOR_DIV = BC001A9_n769TBW07_COLOR_DIV[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1A45( )
   {
      /* Scan next routine */
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
         A146TBW07_SESSION_ID = BC001A9_A146TBW07_SESSION_ID[0] ;
         A147TBW07_APP_ID = BC001A9_A147TBW07_APP_ID[0] ;
         A148TBW07_DISP_DATETIME = BC001A9_A148TBW07_DISP_DATETIME[0] ;
         A150TBW07_STUDY_ID = BC001A9_A150TBW07_STUDY_ID[0] ;
         A152TBW07_SUBJECT_ID = BC001A9_A152TBW07_SUBJECT_ID[0] ;
         A154TBW07_INS_NO = BC001A9_A154TBW07_INS_NO[0] ;
         A156TBW07_CRF_ID = BC001A9_A156TBW07_CRF_ID[0] ;
         A158TBW07_CRF_VERSION = BC001A9_A158TBW07_CRF_VERSION[0] ;
         A160TBW07_X = BC001A9_A160TBW07_X[0] ;
         A162TBW07_Y = BC001A9_A162TBW07_Y[0] ;
         A768TBW07_EDIT_REQUEST_FLG = BC001A9_A768TBW07_EDIT_REQUEST_FLG[0] ;
         n768TBW07_EDIT_REQUEST_FLG = BC001A9_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = BC001A9_A769TBW07_COLOR_DIV[0] ;
         n769TBW07_COLOR_DIV = BC001A9_n769TBW07_COLOR_DIV[0] ;
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
      A768TBW07_EDIT_REQUEST_FLG = "" ;
      n768TBW07_EDIT_REQUEST_FLG = false ;
      A769TBW07_COLOR_DIV = "" ;
      n769TBW07_COLOR_DIV = false ;
   }

   public void initAll1A45( )
   {
      A146TBW07_SESSION_ID = "" ;
      A147TBW07_APP_ID = "" ;
      A148TBW07_DISP_DATETIME = "" ;
      A150TBW07_STUDY_ID = 0 ;
      A152TBW07_SUBJECT_ID = 0 ;
      A154TBW07_INS_NO = (short)(0) ;
      A156TBW07_CRF_ID = (short)(0) ;
      A158TBW07_CRF_VERSION = (short)(0) ;
      A160TBW07_X = (short)(0) ;
      A162TBW07_Y = (short)(0) ;
      initializeNonKey1A45( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow45( SdtTBW07_CRF_MEMO_LOC obj45 )
   {
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( Gx_mode );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg( A768TBW07_EDIT_REQUEST_FLG );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div( A769TBW07_COLOR_DIV );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id( A146TBW07_SESSION_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id( A147TBW07_APP_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime( A148TBW07_DISP_DATETIME );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id( A150TBW07_STUDY_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id( A152TBW07_SUBJECT_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no( A154TBW07_INS_NO );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id( A156TBW07_CRF_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version( A158TBW07_CRF_VERSION );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x( A160TBW07_X );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y( A162TBW07_Y );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z( Z146TBW07_SESSION_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z( Z147TBW07_APP_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z( Z148TBW07_DISP_DATETIME );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z( Z150TBW07_STUDY_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z( Z152TBW07_SUBJECT_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z( Z154TBW07_INS_NO );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z( Z156TBW07_CRF_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z( Z158TBW07_CRF_VERSION );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z( Z160TBW07_X );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z( Z162TBW07_Y );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z( Z768TBW07_EDIT_REQUEST_FLG );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z( Z769TBW07_COLOR_DIV );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N( (byte)((byte)((n768TBW07_EDIT_REQUEST_FLG)?1:0)) );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N( (byte)((byte)((n769TBW07_COLOR_DIV)?1:0)) );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void KeyVarsToRow45( SdtTBW07_CRF_MEMO_LOC obj45 )
   {
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id( A146TBW07_SESSION_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id( A147TBW07_APP_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime( A148TBW07_DISP_DATETIME );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id( A150TBW07_STUDY_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id( A152TBW07_SUBJECT_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no( A154TBW07_INS_NO );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id( A156TBW07_CRF_ID );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version( A158TBW07_CRF_VERSION );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x( A160TBW07_X );
      obj45.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y( A162TBW07_Y );
   }

   public void RowToVars45( SdtTBW07_CRF_MEMO_LOC obj45 ,
                            int forceLoad )
   {
      Gx_mode = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode() ;
      A768TBW07_EDIT_REQUEST_FLG = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg() ;
      n768TBW07_EDIT_REQUEST_FLG = false ;
      A769TBW07_COLOR_DIV = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div() ;
      n769TBW07_COLOR_DIV = false ;
      A146TBW07_SESSION_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id() ;
      A147TBW07_APP_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id() ;
      A148TBW07_DISP_DATETIME = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime() ;
      A150TBW07_STUDY_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id() ;
      A152TBW07_SUBJECT_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id() ;
      A154TBW07_INS_NO = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no() ;
      A156TBW07_CRF_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id() ;
      A158TBW07_CRF_VERSION = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version() ;
      A160TBW07_X = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x() ;
      A162TBW07_Y = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y() ;
      Z146TBW07_SESSION_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z() ;
      Z147TBW07_APP_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z() ;
      Z148TBW07_DISP_DATETIME = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z() ;
      Z150TBW07_STUDY_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z() ;
      Z152TBW07_SUBJECT_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z() ;
      Z154TBW07_INS_NO = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z() ;
      Z156TBW07_CRF_ID = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z() ;
      Z158TBW07_CRF_VERSION = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z() ;
      Z160TBW07_X = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z() ;
      Z162TBW07_Y = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z() ;
      Z768TBW07_EDIT_REQUEST_FLG = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z() ;
      Z769TBW07_COLOR_DIV = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z() ;
      n768TBW07_EDIT_REQUEST_FLG = (boolean)((obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N()==0)?false:true) ;
      n769TBW07_COLOR_DIV = (boolean)((obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N()==0)?false:true) ;
      Gx_mode = obj45.getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A146TBW07_SESSION_ID = (String)getParm(obj,0) ;
      A147TBW07_APP_ID = (String)getParm(obj,1) ;
      A148TBW07_DISP_DATETIME = (String)getParm(obj,2) ;
      A150TBW07_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A152TBW07_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A154TBW07_INS_NO = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      A156TBW07_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      A158TBW07_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      A160TBW07_X = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.SHORT)).shortValue() ;
      A162TBW07_Y = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
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
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
      }
      zm1A45( -1) ;
      onLoadActions1A45( ) ;
      addRow1A45( ) ;
      scanKeyEnd1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars45( bcTBW07_CRF_MEMO_LOC, 0) ;
      scanKeyStart1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
      }
      zm1A45( -1) ;
      onLoadActions1A45( ) ;
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1A45( ) ;
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
            {
               A146TBW07_SESSION_ID = Z146TBW07_SESSION_ID ;
               A147TBW07_APP_ID = Z147TBW07_APP_ID ;
               A148TBW07_DISP_DATETIME = Z148TBW07_DISP_DATETIME ;
               A150TBW07_STUDY_ID = Z150TBW07_STUDY_ID ;
               A152TBW07_SUBJECT_ID = Z152TBW07_SUBJECT_ID ;
               A154TBW07_INS_NO = Z154TBW07_INS_NO ;
               A156TBW07_CRF_ID = Z156TBW07_CRF_ID ;
               A158TBW07_CRF_VERSION = Z158TBW07_CRF_VERSION ;
               A160TBW07_X = Z160TBW07_X ;
               A162TBW07_Y = Z162TBW07_Y ;
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
               if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
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
         else if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
         {
            A146TBW07_SESSION_ID = Z146TBW07_SESSION_ID ;
            A147TBW07_APP_ID = Z147TBW07_APP_ID ;
            A148TBW07_DISP_DATETIME = Z148TBW07_DISP_DATETIME ;
            A150TBW07_STUDY_ID = Z150TBW07_STUDY_ID ;
            A152TBW07_SUBJECT_ID = Z152TBW07_SUBJECT_ID ;
            A154TBW07_INS_NO = Z154TBW07_INS_NO ;
            A156TBW07_CRF_ID = Z156TBW07_CRF_ID ;
            A158TBW07_CRF_VERSION = Z158TBW07_CRF_VERSION ;
            A160TBW07_X = Z160TBW07_X ;
            A162TBW07_Y = Z162TBW07_Y ;
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
         if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
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
                  /* Execute user subroutine: S112 */
                  S112 ();
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
      Z146TBW07_SESSION_ID = "" ;
      A146TBW07_SESSION_ID = "" ;
      Z147TBW07_APP_ID = "" ;
      A147TBW07_APP_ID = "" ;
      Z148TBW07_DISP_DATETIME = "" ;
      A148TBW07_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z768TBW07_EDIT_REQUEST_FLG = "" ;
      A768TBW07_EDIT_REQUEST_FLG = "" ;
      Z769TBW07_COLOR_DIV = "" ;
      A769TBW07_COLOR_DIV = "" ;
      BC001A4_A146TBW07_SESSION_ID = new String[] {""} ;
      BC001A4_A147TBW07_APP_ID = new String[] {""} ;
      BC001A4_A148TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A4_A150TBW07_STUDY_ID = new long[1] ;
      BC001A4_A152TBW07_SUBJECT_ID = new int[1] ;
      BC001A4_A154TBW07_INS_NO = new short[1] ;
      BC001A4_A156TBW07_CRF_ID = new short[1] ;
      BC001A4_A158TBW07_CRF_VERSION = new short[1] ;
      BC001A4_A160TBW07_X = new short[1] ;
      BC001A4_A162TBW07_Y = new short[1] ;
      BC001A4_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A4_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A4_A769TBW07_COLOR_DIV = new String[] {""} ;
      BC001A4_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      BC001A5_A146TBW07_SESSION_ID = new String[] {""} ;
      BC001A5_A147TBW07_APP_ID = new String[] {""} ;
      BC001A5_A148TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A5_A150TBW07_STUDY_ID = new long[1] ;
      BC001A5_A152TBW07_SUBJECT_ID = new int[1] ;
      BC001A5_A154TBW07_INS_NO = new short[1] ;
      BC001A5_A156TBW07_CRF_ID = new short[1] ;
      BC001A5_A158TBW07_CRF_VERSION = new short[1] ;
      BC001A5_A160TBW07_X = new short[1] ;
      BC001A5_A162TBW07_Y = new short[1] ;
      BC001A3_A146TBW07_SESSION_ID = new String[] {""} ;
      BC001A3_A147TBW07_APP_ID = new String[] {""} ;
      BC001A3_A148TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A3_A150TBW07_STUDY_ID = new long[1] ;
      BC001A3_A152TBW07_SUBJECT_ID = new int[1] ;
      BC001A3_A154TBW07_INS_NO = new short[1] ;
      BC001A3_A156TBW07_CRF_ID = new short[1] ;
      BC001A3_A158TBW07_CRF_VERSION = new short[1] ;
      BC001A3_A160TBW07_X = new short[1] ;
      BC001A3_A162TBW07_Y = new short[1] ;
      BC001A3_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A3_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A3_A769TBW07_COLOR_DIV = new String[] {""} ;
      BC001A3_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      sMode45 = "" ;
      BC001A2_A146TBW07_SESSION_ID = new String[] {""} ;
      BC001A2_A147TBW07_APP_ID = new String[] {""} ;
      BC001A2_A148TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A2_A150TBW07_STUDY_ID = new long[1] ;
      BC001A2_A152TBW07_SUBJECT_ID = new int[1] ;
      BC001A2_A154TBW07_INS_NO = new short[1] ;
      BC001A2_A156TBW07_CRF_ID = new short[1] ;
      BC001A2_A158TBW07_CRF_VERSION = new short[1] ;
      BC001A2_A160TBW07_X = new short[1] ;
      BC001A2_A162TBW07_Y = new short[1] ;
      BC001A2_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A2_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A2_A769TBW07_COLOR_DIV = new String[] {""} ;
      BC001A2_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      BC001A9_A146TBW07_SESSION_ID = new String[] {""} ;
      BC001A9_A147TBW07_APP_ID = new String[] {""} ;
      BC001A9_A148TBW07_DISP_DATETIME = new String[] {""} ;
      BC001A9_A150TBW07_STUDY_ID = new long[1] ;
      BC001A9_A152TBW07_SUBJECT_ID = new int[1] ;
      BC001A9_A154TBW07_INS_NO = new short[1] ;
      BC001A9_A156TBW07_CRF_ID = new short[1] ;
      BC001A9_A158TBW07_CRF_VERSION = new short[1] ;
      BC001A9_A160TBW07_X = new short[1] ;
      BC001A9_A162TBW07_Y = new short[1] ;
      BC001A9_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      BC001A9_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC001A9_A769TBW07_COLOR_DIV = new String[] {""} ;
      BC001A9_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw07_crf_memo_loc_bc__default(),
         new Object[] {
             new Object[] {
            BC001A2_A146TBW07_SESSION_ID, BC001A2_A147TBW07_APP_ID, BC001A2_A148TBW07_DISP_DATETIME, BC001A2_A150TBW07_STUDY_ID, BC001A2_A152TBW07_SUBJECT_ID, BC001A2_A154TBW07_INS_NO, BC001A2_A156TBW07_CRF_ID, BC001A2_A158TBW07_CRF_VERSION, BC001A2_A160TBW07_X, BC001A2_A162TBW07_Y,
            BC001A2_A768TBW07_EDIT_REQUEST_FLG, BC001A2_n768TBW07_EDIT_REQUEST_FLG, BC001A2_A769TBW07_COLOR_DIV, BC001A2_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A3_A146TBW07_SESSION_ID, BC001A3_A147TBW07_APP_ID, BC001A3_A148TBW07_DISP_DATETIME, BC001A3_A150TBW07_STUDY_ID, BC001A3_A152TBW07_SUBJECT_ID, BC001A3_A154TBW07_INS_NO, BC001A3_A156TBW07_CRF_ID, BC001A3_A158TBW07_CRF_VERSION, BC001A3_A160TBW07_X, BC001A3_A162TBW07_Y,
            BC001A3_A768TBW07_EDIT_REQUEST_FLG, BC001A3_n768TBW07_EDIT_REQUEST_FLG, BC001A3_A769TBW07_COLOR_DIV, BC001A3_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A4_A146TBW07_SESSION_ID, BC001A4_A147TBW07_APP_ID, BC001A4_A148TBW07_DISP_DATETIME, BC001A4_A150TBW07_STUDY_ID, BC001A4_A152TBW07_SUBJECT_ID, BC001A4_A154TBW07_INS_NO, BC001A4_A156TBW07_CRF_ID, BC001A4_A158TBW07_CRF_VERSION, BC001A4_A160TBW07_X, BC001A4_A162TBW07_Y,
            BC001A4_A768TBW07_EDIT_REQUEST_FLG, BC001A4_n768TBW07_EDIT_REQUEST_FLG, BC001A4_A769TBW07_COLOR_DIV, BC001A4_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            BC001A5_A146TBW07_SESSION_ID, BC001A5_A147TBW07_APP_ID, BC001A5_A148TBW07_DISP_DATETIME, BC001A5_A150TBW07_STUDY_ID, BC001A5_A152TBW07_SUBJECT_ID, BC001A5_A154TBW07_INS_NO, BC001A5_A156TBW07_CRF_ID, BC001A5_A158TBW07_CRF_VERSION, BC001A5_A160TBW07_X, BC001A5_A162TBW07_Y
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001A9_A146TBW07_SESSION_ID, BC001A9_A147TBW07_APP_ID, BC001A9_A148TBW07_DISP_DATETIME, BC001A9_A150TBW07_STUDY_ID, BC001A9_A152TBW07_SUBJECT_ID, BC001A9_A154TBW07_INS_NO, BC001A9_A156TBW07_CRF_ID, BC001A9_A158TBW07_CRF_VERSION, BC001A9_A160TBW07_X, BC001A9_A162TBW07_Y,
            BC001A9_A768TBW07_EDIT_REQUEST_FLG, BC001A9_n768TBW07_EDIT_REQUEST_FLG, BC001A9_A769TBW07_COLOR_DIV, BC001A9_n769TBW07_COLOR_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW07_CRF_MEMO_LOC_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111A2 */
      e111A2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z154TBW07_INS_NO ;
   private short A154TBW07_INS_NO ;
   private short Z156TBW07_CRF_ID ;
   private short A156TBW07_CRF_ID ;
   private short Z158TBW07_CRF_VERSION ;
   private short A158TBW07_CRF_VERSION ;
   private short Z160TBW07_X ;
   private short A160TBW07_X ;
   private short Z162TBW07_Y ;
   private short A162TBW07_Y ;
   private short RcdFound45 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z152TBW07_SUBJECT_ID ;
   private int A152TBW07_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z150TBW07_STUDY_ID ;
   private long A150TBW07_STUDY_ID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode45 ;
   private String Gx_emsg ;
   private boolean n768TBW07_EDIT_REQUEST_FLG ;
   private boolean n769TBW07_COLOR_DIV ;
   private String Z146TBW07_SESSION_ID ;
   private String A146TBW07_SESSION_ID ;
   private String Z147TBW07_APP_ID ;
   private String A147TBW07_APP_ID ;
   private String Z148TBW07_DISP_DATETIME ;
   private String A148TBW07_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String Z768TBW07_EDIT_REQUEST_FLG ;
   private String A768TBW07_EDIT_REQUEST_FLG ;
   private String Z769TBW07_COLOR_DIV ;
   private String A769TBW07_COLOR_DIV ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW07_CRF_MEMO_LOC bcTBW07_CRF_MEMO_LOC ;
   private IDataStoreProvider pr_default ;
   private String[] BC001A4_A146TBW07_SESSION_ID ;
   private String[] BC001A4_A147TBW07_APP_ID ;
   private String[] BC001A4_A148TBW07_DISP_DATETIME ;
   private long[] BC001A4_A150TBW07_STUDY_ID ;
   private int[] BC001A4_A152TBW07_SUBJECT_ID ;
   private short[] BC001A4_A154TBW07_INS_NO ;
   private short[] BC001A4_A156TBW07_CRF_ID ;
   private short[] BC001A4_A158TBW07_CRF_VERSION ;
   private short[] BC001A4_A160TBW07_X ;
   private short[] BC001A4_A162TBW07_Y ;
   private String[] BC001A4_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A4_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A4_A769TBW07_COLOR_DIV ;
   private boolean[] BC001A4_n769TBW07_COLOR_DIV ;
   private String[] BC001A5_A146TBW07_SESSION_ID ;
   private String[] BC001A5_A147TBW07_APP_ID ;
   private String[] BC001A5_A148TBW07_DISP_DATETIME ;
   private long[] BC001A5_A150TBW07_STUDY_ID ;
   private int[] BC001A5_A152TBW07_SUBJECT_ID ;
   private short[] BC001A5_A154TBW07_INS_NO ;
   private short[] BC001A5_A156TBW07_CRF_ID ;
   private short[] BC001A5_A158TBW07_CRF_VERSION ;
   private short[] BC001A5_A160TBW07_X ;
   private short[] BC001A5_A162TBW07_Y ;
   private String[] BC001A3_A146TBW07_SESSION_ID ;
   private String[] BC001A3_A147TBW07_APP_ID ;
   private String[] BC001A3_A148TBW07_DISP_DATETIME ;
   private long[] BC001A3_A150TBW07_STUDY_ID ;
   private int[] BC001A3_A152TBW07_SUBJECT_ID ;
   private short[] BC001A3_A154TBW07_INS_NO ;
   private short[] BC001A3_A156TBW07_CRF_ID ;
   private short[] BC001A3_A158TBW07_CRF_VERSION ;
   private short[] BC001A3_A160TBW07_X ;
   private short[] BC001A3_A162TBW07_Y ;
   private String[] BC001A3_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A3_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A3_A769TBW07_COLOR_DIV ;
   private boolean[] BC001A3_n769TBW07_COLOR_DIV ;
   private String[] BC001A2_A146TBW07_SESSION_ID ;
   private String[] BC001A2_A147TBW07_APP_ID ;
   private String[] BC001A2_A148TBW07_DISP_DATETIME ;
   private long[] BC001A2_A150TBW07_STUDY_ID ;
   private int[] BC001A2_A152TBW07_SUBJECT_ID ;
   private short[] BC001A2_A154TBW07_INS_NO ;
   private short[] BC001A2_A156TBW07_CRF_ID ;
   private short[] BC001A2_A158TBW07_CRF_VERSION ;
   private short[] BC001A2_A160TBW07_X ;
   private short[] BC001A2_A162TBW07_Y ;
   private String[] BC001A2_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A2_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A2_A769TBW07_COLOR_DIV ;
   private boolean[] BC001A2_n769TBW07_COLOR_DIV ;
   private String[] BC001A9_A146TBW07_SESSION_ID ;
   private String[] BC001A9_A147TBW07_APP_ID ;
   private String[] BC001A9_A148TBW07_DISP_DATETIME ;
   private long[] BC001A9_A150TBW07_STUDY_ID ;
   private int[] BC001A9_A152TBW07_SUBJECT_ID ;
   private short[] BC001A9_A154TBW07_INS_NO ;
   private short[] BC001A9_A156TBW07_CRF_ID ;
   private short[] BC001A9_A158TBW07_CRF_VERSION ;
   private short[] BC001A9_A160TBW07_X ;
   private short[] BC001A9_A162TBW07_Y ;
   private String[] BC001A9_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] BC001A9_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] BC001A9_A769TBW07_COLOR_DIV ;
   private boolean[] BC001A9_n769TBW07_COLOR_DIV ;
}

final  class tbw07_crf_memo_loc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001A2", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A3", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A4", "SELECT TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y`, TM1.`TBW07_EDIT_REQUEST_FLG`, TM1.`TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` TM1 WHERE TM1.`TBW07_SESSION_ID` = ? and TM1.`TBW07_APP_ID` = ? and TM1.`TBW07_DISP_DATETIME` = ? and TM1.`TBW07_STUDY_ID` = ? and TM1.`TBW07_SUBJECT_ID` = ? and TM1.`TBW07_INS_NO` = ? and TM1.`TBW07_CRF_ID` = ? and TM1.`TBW07_CRF_VERSION` = ? and TM1.`TBW07_X` = ? and TM1.`TBW07_Y` = ? ORDER BY TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001A5", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001A6", "INSERT INTO `TBW07_CRF_MEMO_LOC`(`TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001A7", "UPDATE `TBW07_CRF_MEMO_LOC` SET `TBW07_EDIT_REQUEST_FLG`=?, `TBW07_COLOR_DIV`=?  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001A8", "DELETE FROM `TBW07_CRF_MEMO_LOC`  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001A9", "SELECT TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y`, TM1.`TBW07_EDIT_REQUEST_FLG`, TM1.`TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` TM1 WHERE TM1.`TBW07_SESSION_ID` = ? and TM1.`TBW07_APP_ID` = ? and TM1.`TBW07_DISP_DATETIME` = ? and TM1.`TBW07_STUDY_ID` = ? and TM1.`TBW07_SUBJECT_ID` = ? and TM1.`TBW07_INS_NO` = ? and TM1.`TBW07_CRF_ID` = ? and TM1.`TBW07_CRF_VERSION` = ? and TM1.`TBW07_X` = ? and TM1.`TBW07_Y` = ? ORDER BY TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y` ",true, GX_NOMASK, false, this,100,0,false )
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
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
               return;
      }
   }

}

