/*
               File: tbw05_crf_result_bc
        Description: CRF入力結果テーブルワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:19.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw05_crf_result_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw05_crf_result_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw05_crf_result_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw05_crf_result_bc.class ));
   }

   public tbw05_crf_result_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1843( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1843( ) ;
      standaloneModal( ) ;
      addRow1843( ) ;
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
            Z129TBW05_SESSION_ID = A129TBW05_SESSION_ID ;
            Z130TBW05_APP_ID = A130TBW05_APP_ID ;
            Z131TBW05_DISP_DATETIME = A131TBW05_DISP_DATETIME ;
            Z132TBW05_STUDY_ID = A132TBW05_STUDY_ID ;
            Z133TBW05_SUBJECT_ID = A133TBW05_SUBJECT_ID ;
            Z134TBW05_CRF_ID = A134TBW05_CRF_ID ;
            Z135TBW05_CRF_ITEM_GRP_DIV = A135TBW05_CRF_ITEM_GRP_DIV ;
            Z136TBW05_CRF_ITEM_GRP_CD = A136TBW05_CRF_ITEM_GRP_CD ;
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

   public void confirm_180( )
   {
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1843( ) ;
         }
         else
         {
            checkExtendedTable1843( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1843( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11172( )
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

   public void zm1843( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z756TBW05_CRF_VALUE = A756TBW05_CRF_VALUE ;
         Z757TBW05_EDIT_FLG = A757TBW05_EDIT_FLG ;
      }
      if ( GX_JID == -1 )
      {
         Z129TBW05_SESSION_ID = A129TBW05_SESSION_ID ;
         Z130TBW05_APP_ID = A130TBW05_APP_ID ;
         Z131TBW05_DISP_DATETIME = A131TBW05_DISP_DATETIME ;
         Z132TBW05_STUDY_ID = A132TBW05_STUDY_ID ;
         Z133TBW05_SUBJECT_ID = A133TBW05_SUBJECT_ID ;
         Z134TBW05_CRF_ID = A134TBW05_CRF_ID ;
         Z135TBW05_CRF_ITEM_GRP_DIV = A135TBW05_CRF_ITEM_GRP_DIV ;
         Z136TBW05_CRF_ITEM_GRP_CD = A136TBW05_CRF_ITEM_GRP_CD ;
         Z756TBW05_CRF_VALUE = A756TBW05_CRF_VALUE ;
         Z757TBW05_EDIT_FLG = A757TBW05_EDIT_FLG ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1843( )
   {
      /* Using cursor BC00184 */
      pr_default.execute(2, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A756TBW05_CRF_VALUE = BC00184_A756TBW05_CRF_VALUE[0] ;
         n756TBW05_CRF_VALUE = BC00184_n756TBW05_CRF_VALUE[0] ;
         A757TBW05_EDIT_FLG = BC00184_A757TBW05_EDIT_FLG[0] ;
         n757TBW05_EDIT_FLG = BC00184_n757TBW05_EDIT_FLG[0] ;
         zm1843( -1) ;
      }
      pr_default.close(2);
      onLoadActions1843( ) ;
   }

   public void onLoadActions1843( )
   {
      AV8Pgmname = "TBW05_CRF_RESULT_BC" ;
   }

   public void checkExtendedTable1843( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW05_CRF_RESULT_BC" ;
   }

   public void closeExtendedTableCursors1843( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1843( )
   {
      /* Using cursor BC00185 */
      pr_default.execute(3, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00186 */
      pr_default.execute(4, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1843( 1) ;
         RcdFound43 = (short)(1) ;
         A129TBW05_SESSION_ID = BC00186_A129TBW05_SESSION_ID[0] ;
         A130TBW05_APP_ID = BC00186_A130TBW05_APP_ID[0] ;
         A131TBW05_DISP_DATETIME = BC00186_A131TBW05_DISP_DATETIME[0] ;
         A132TBW05_STUDY_ID = BC00186_A132TBW05_STUDY_ID[0] ;
         A133TBW05_SUBJECT_ID = BC00186_A133TBW05_SUBJECT_ID[0] ;
         A134TBW05_CRF_ID = BC00186_A134TBW05_CRF_ID[0] ;
         A135TBW05_CRF_ITEM_GRP_DIV = BC00186_A135TBW05_CRF_ITEM_GRP_DIV[0] ;
         A136TBW05_CRF_ITEM_GRP_CD = BC00186_A136TBW05_CRF_ITEM_GRP_CD[0] ;
         A756TBW05_CRF_VALUE = BC00186_A756TBW05_CRF_VALUE[0] ;
         n756TBW05_CRF_VALUE = BC00186_n756TBW05_CRF_VALUE[0] ;
         A757TBW05_EDIT_FLG = BC00186_A757TBW05_EDIT_FLG[0] ;
         n757TBW05_EDIT_FLG = BC00186_n757TBW05_EDIT_FLG[0] ;
         Z129TBW05_SESSION_ID = A129TBW05_SESSION_ID ;
         Z130TBW05_APP_ID = A130TBW05_APP_ID ;
         Z131TBW05_DISP_DATETIME = A131TBW05_DISP_DATETIME ;
         Z132TBW05_STUDY_ID = A132TBW05_STUDY_ID ;
         Z133TBW05_SUBJECT_ID = A133TBW05_SUBJECT_ID ;
         Z134TBW05_CRF_ID = A134TBW05_CRF_ID ;
         Z135TBW05_CRF_ITEM_GRP_DIV = A135TBW05_CRF_ITEM_GRP_DIV ;
         Z136TBW05_CRF_ITEM_GRP_CD = A136TBW05_CRF_ITEM_GRP_CD ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1843( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKey1843( ) ;
         }
         Gx_mode = sMode43 ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey1843( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1843( ) ;
      if ( RcdFound43 == 0 )
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
      confirm_180( ) ;
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

   public void checkOptimisticConcurrency1843( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00187 */
         pr_default.execute(5, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW05_CRF_RESULT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z756TBW05_CRF_VALUE, BC00187_A756TBW05_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z757TBW05_EDIT_FLG, BC00187_A757TBW05_EDIT_FLG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW05_CRF_RESULT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1843( )
   {
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1843( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1843( 0) ;
         checkOptimisticConcurrency1843( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1843( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00188 */
                  pr_default.execute(6, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD, new Boolean(n756TBW05_CRF_VALUE), A756TBW05_CRF_VALUE, new Boolean(n757TBW05_EDIT_FLG), A757TBW05_EDIT_FLG});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW05_CRF_RESULT") ;
                  if ( (pr_default.getStatus(6) == 1) )
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
            load1843( ) ;
         }
         endLevel1843( ) ;
      }
      closeExtendedTableCursors1843( ) ;
   }

   public void update1843( )
   {
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1843( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1843( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1843( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00189 */
                  pr_default.execute(7, new Object[] {new Boolean(n756TBW05_CRF_VALUE), A756TBW05_CRF_VALUE, new Boolean(n757TBW05_EDIT_FLG), A757TBW05_EDIT_FLG, A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW05_CRF_RESULT") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW05_CRF_RESULT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1843( ) ;
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
         endLevel1843( ) ;
      }
      closeExtendedTableCursors1843( ) ;
   }

   public void deferredUpdate1843( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1843( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1843( ) ;
         afterConfirm1843( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1843( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001810 */
               pr_default.execute(8, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW05_CRF_RESULT") ;
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1843( ) ;
      Gx_mode = sMode43 ;
   }

   public void onDeleteControls1843( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW05_CRF_RESULT_BC" ;
      }
   }

   public void endLevel1843( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1843( ) ;
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

   public void scanKeyStart1843( )
   {
      /* Scan By routine */
      /* Using cursor BC001811 */
      pr_default.execute(9, new Object[] {A129TBW05_SESSION_ID, A130TBW05_APP_ID, A131TBW05_DISP_DATETIME, new Long(A132TBW05_STUDY_ID), new Integer(A133TBW05_SUBJECT_ID), new Short(A134TBW05_CRF_ID), A135TBW05_CRF_ITEM_GRP_DIV, A136TBW05_CRF_ITEM_GRP_CD});
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A129TBW05_SESSION_ID = BC001811_A129TBW05_SESSION_ID[0] ;
         A130TBW05_APP_ID = BC001811_A130TBW05_APP_ID[0] ;
         A131TBW05_DISP_DATETIME = BC001811_A131TBW05_DISP_DATETIME[0] ;
         A132TBW05_STUDY_ID = BC001811_A132TBW05_STUDY_ID[0] ;
         A133TBW05_SUBJECT_ID = BC001811_A133TBW05_SUBJECT_ID[0] ;
         A134TBW05_CRF_ID = BC001811_A134TBW05_CRF_ID[0] ;
         A135TBW05_CRF_ITEM_GRP_DIV = BC001811_A135TBW05_CRF_ITEM_GRP_DIV[0] ;
         A136TBW05_CRF_ITEM_GRP_CD = BC001811_A136TBW05_CRF_ITEM_GRP_CD[0] ;
         A756TBW05_CRF_VALUE = BC001811_A756TBW05_CRF_VALUE[0] ;
         n756TBW05_CRF_VALUE = BC001811_n756TBW05_CRF_VALUE[0] ;
         A757TBW05_EDIT_FLG = BC001811_A757TBW05_EDIT_FLG[0] ;
         n757TBW05_EDIT_FLG = BC001811_n757TBW05_EDIT_FLG[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1843( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound43 = (short)(0) ;
      scanKeyLoad1843( ) ;
   }

   public void scanKeyLoad1843( )
   {
      sMode43 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A129TBW05_SESSION_ID = BC001811_A129TBW05_SESSION_ID[0] ;
         A130TBW05_APP_ID = BC001811_A130TBW05_APP_ID[0] ;
         A131TBW05_DISP_DATETIME = BC001811_A131TBW05_DISP_DATETIME[0] ;
         A132TBW05_STUDY_ID = BC001811_A132TBW05_STUDY_ID[0] ;
         A133TBW05_SUBJECT_ID = BC001811_A133TBW05_SUBJECT_ID[0] ;
         A134TBW05_CRF_ID = BC001811_A134TBW05_CRF_ID[0] ;
         A135TBW05_CRF_ITEM_GRP_DIV = BC001811_A135TBW05_CRF_ITEM_GRP_DIV[0] ;
         A136TBW05_CRF_ITEM_GRP_CD = BC001811_A136TBW05_CRF_ITEM_GRP_CD[0] ;
         A756TBW05_CRF_VALUE = BC001811_A756TBW05_CRF_VALUE[0] ;
         n756TBW05_CRF_VALUE = BC001811_n756TBW05_CRF_VALUE[0] ;
         A757TBW05_EDIT_FLG = BC001811_A757TBW05_EDIT_FLG[0] ;
         n757TBW05_EDIT_FLG = BC001811_n757TBW05_EDIT_FLG[0] ;
      }
      Gx_mode = sMode43 ;
   }

   public void scanKeyEnd1843( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1843( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1843( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1843( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1843( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1843( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1843( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1843( )
   {
   }

   public void addRow1843( )
   {
      VarsToRow43( bcTBW05_CRF_RESULT) ;
   }

   public void readRow1843( )
   {
      RowToVars43( bcTBW05_CRF_RESULT, 1) ;
   }

   public void initializeNonKey1843( )
   {
      A756TBW05_CRF_VALUE = "" ;
      n756TBW05_CRF_VALUE = false ;
      A757TBW05_EDIT_FLG = "" ;
      n757TBW05_EDIT_FLG = false ;
   }

   public void initAll1843( )
   {
      A129TBW05_SESSION_ID = "" ;
      A130TBW05_APP_ID = "" ;
      A131TBW05_DISP_DATETIME = "" ;
      A132TBW05_STUDY_ID = 0 ;
      A133TBW05_SUBJECT_ID = 0 ;
      A134TBW05_CRF_ID = (short)(0) ;
      A135TBW05_CRF_ITEM_GRP_DIV = "" ;
      A136TBW05_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey1843( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow43( SdtTBW05_CRF_RESULT obj43 )
   {
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Mode( Gx_mode );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value( A756TBW05_CRF_VALUE );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg( A757TBW05_EDIT_FLG );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id( A129TBW05_SESSION_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id( A130TBW05_APP_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime( A131TBW05_DISP_DATETIME );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id( A132TBW05_STUDY_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id( A133TBW05_SUBJECT_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id( A134TBW05_CRF_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div( A135TBW05_CRF_ITEM_GRP_DIV );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd( A136TBW05_CRF_ITEM_GRP_CD );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z( Z129TBW05_SESSION_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z( Z130TBW05_APP_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z( Z131TBW05_DISP_DATETIME );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z( Z132TBW05_STUDY_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z( Z133TBW05_SUBJECT_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z( Z134TBW05_CRF_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z( Z135TBW05_CRF_ITEM_GRP_DIV );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z( Z136TBW05_CRF_ITEM_GRP_CD );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z( Z756TBW05_CRF_VALUE );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z( Z757TBW05_EDIT_FLG );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N( (byte)((byte)((n756TBW05_CRF_VALUE)?1:0)) );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N( (byte)((byte)((n757TBW05_EDIT_FLG)?1:0)) );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Mode( Gx_mode );
   }

   public void KeyVarsToRow43( SdtTBW05_CRF_RESULT obj43 )
   {
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id( A129TBW05_SESSION_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id( A130TBW05_APP_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime( A131TBW05_DISP_DATETIME );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id( A132TBW05_STUDY_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id( A133TBW05_SUBJECT_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id( A134TBW05_CRF_ID );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div( A135TBW05_CRF_ITEM_GRP_DIV );
      obj43.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd( A136TBW05_CRF_ITEM_GRP_CD );
   }

   public void RowToVars43( SdtTBW05_CRF_RESULT obj43 ,
                            int forceLoad )
   {
      Gx_mode = obj43.getgxTv_SdtTBW05_CRF_RESULT_Mode() ;
      A756TBW05_CRF_VALUE = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value() ;
      n756TBW05_CRF_VALUE = false ;
      A757TBW05_EDIT_FLG = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg() ;
      n757TBW05_EDIT_FLG = false ;
      A129TBW05_SESSION_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id() ;
      A130TBW05_APP_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id() ;
      A131TBW05_DISP_DATETIME = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime() ;
      A132TBW05_STUDY_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id() ;
      A133TBW05_SUBJECT_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id() ;
      A134TBW05_CRF_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id() ;
      A135TBW05_CRF_ITEM_GRP_DIV = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div() ;
      A136TBW05_CRF_ITEM_GRP_CD = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd() ;
      Z129TBW05_SESSION_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z() ;
      Z130TBW05_APP_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z() ;
      Z131TBW05_DISP_DATETIME = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z() ;
      Z132TBW05_STUDY_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z() ;
      Z133TBW05_SUBJECT_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z() ;
      Z134TBW05_CRF_ID = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z() ;
      Z135TBW05_CRF_ITEM_GRP_DIV = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z() ;
      Z136TBW05_CRF_ITEM_GRP_CD = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z() ;
      Z756TBW05_CRF_VALUE = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z() ;
      Z757TBW05_EDIT_FLG = obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z() ;
      n756TBW05_CRF_VALUE = (boolean)((obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N()==0)?false:true) ;
      n757TBW05_EDIT_FLG = (boolean)((obj43.getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N()==0)?false:true) ;
      Gx_mode = obj43.getgxTv_SdtTBW05_CRF_RESULT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A129TBW05_SESSION_ID = (String)getParm(obj,0) ;
      A130TBW05_APP_ID = (String)getParm(obj,1) ;
      A131TBW05_DISP_DATETIME = (String)getParm(obj,2) ;
      A132TBW05_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A133TBW05_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A134TBW05_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      A135TBW05_CRF_ITEM_GRP_DIV = (String)getParm(obj,6) ;
      A136TBW05_CRF_ITEM_GRP_CD = (String)getParm(obj,7) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1843( ) ;
      scanKeyStart1843( ) ;
      if ( RcdFound43 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z129TBW05_SESSION_ID = A129TBW05_SESSION_ID ;
         Z130TBW05_APP_ID = A130TBW05_APP_ID ;
         Z131TBW05_DISP_DATETIME = A131TBW05_DISP_DATETIME ;
         Z132TBW05_STUDY_ID = A132TBW05_STUDY_ID ;
         Z133TBW05_SUBJECT_ID = A133TBW05_SUBJECT_ID ;
         Z134TBW05_CRF_ID = A134TBW05_CRF_ID ;
         Z135TBW05_CRF_ITEM_GRP_DIV = A135TBW05_CRF_ITEM_GRP_DIV ;
         Z136TBW05_CRF_ITEM_GRP_CD = A136TBW05_CRF_ITEM_GRP_CD ;
      }
      zm1843( -1) ;
      onLoadActions1843( ) ;
      addRow1843( ) ;
      scanKeyEnd1843( ) ;
      if ( RcdFound43 == 0 )
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
      RowToVars43( bcTBW05_CRF_RESULT, 0) ;
      scanKeyStart1843( ) ;
      if ( RcdFound43 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z129TBW05_SESSION_ID = A129TBW05_SESSION_ID ;
         Z130TBW05_APP_ID = A130TBW05_APP_ID ;
         Z131TBW05_DISP_DATETIME = A131TBW05_DISP_DATETIME ;
         Z132TBW05_STUDY_ID = A132TBW05_STUDY_ID ;
         Z133TBW05_SUBJECT_ID = A133TBW05_SUBJECT_ID ;
         Z134TBW05_CRF_ID = A134TBW05_CRF_ID ;
         Z135TBW05_CRF_ITEM_GRP_DIV = A135TBW05_CRF_ITEM_GRP_DIV ;
         Z136TBW05_CRF_ITEM_GRP_CD = A136TBW05_CRF_ITEM_GRP_CD ;
      }
      zm1843( -1) ;
      onLoadActions1843( ) ;
      addRow1843( ) ;
      scanKeyEnd1843( ) ;
      if ( RcdFound43 == 0 )
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
      RowToVars43( bcTBW05_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1843( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1843( ) ;
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( ( GXutil.strcmp(A129TBW05_SESSION_ID, Z129TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A130TBW05_APP_ID, Z130TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A131TBW05_DISP_DATETIME, Z131TBW05_DISP_DATETIME) != 0 ) || ( A132TBW05_STUDY_ID != Z132TBW05_STUDY_ID ) || ( A133TBW05_SUBJECT_ID != Z133TBW05_SUBJECT_ID ) || ( A134TBW05_CRF_ID != Z134TBW05_CRF_ID ) || ( GXutil.strcmp(A135TBW05_CRF_ITEM_GRP_DIV, Z135TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A136TBW05_CRF_ITEM_GRP_CD, Z136TBW05_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A129TBW05_SESSION_ID = Z129TBW05_SESSION_ID ;
               A130TBW05_APP_ID = Z130TBW05_APP_ID ;
               A131TBW05_DISP_DATETIME = Z131TBW05_DISP_DATETIME ;
               A132TBW05_STUDY_ID = Z132TBW05_STUDY_ID ;
               A133TBW05_SUBJECT_ID = Z133TBW05_SUBJECT_ID ;
               A134TBW05_CRF_ID = Z134TBW05_CRF_ID ;
               A135TBW05_CRF_ITEM_GRP_DIV = Z135TBW05_CRF_ITEM_GRP_DIV ;
               A136TBW05_CRF_ITEM_GRP_CD = Z136TBW05_CRF_ITEM_GRP_CD ;
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
               update1843( ) ;
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
               if ( ( GXutil.strcmp(A129TBW05_SESSION_ID, Z129TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A130TBW05_APP_ID, Z130TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A131TBW05_DISP_DATETIME, Z131TBW05_DISP_DATETIME) != 0 ) || ( A132TBW05_STUDY_ID != Z132TBW05_STUDY_ID ) || ( A133TBW05_SUBJECT_ID != Z133TBW05_SUBJECT_ID ) || ( A134TBW05_CRF_ID != Z134TBW05_CRF_ID ) || ( GXutil.strcmp(A135TBW05_CRF_ITEM_GRP_DIV, Z135TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A136TBW05_CRF_ITEM_GRP_CD, Z136TBW05_CRF_ITEM_GRP_CD) != 0 ) )
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
                     insert1843( ) ;
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
                     insert1843( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow43( bcTBW05_CRF_RESULT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars43( bcTBW05_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1843( ) ;
      if ( RcdFound43 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A129TBW05_SESSION_ID, Z129TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A130TBW05_APP_ID, Z130TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A131TBW05_DISP_DATETIME, Z131TBW05_DISP_DATETIME) != 0 ) || ( A132TBW05_STUDY_ID != Z132TBW05_STUDY_ID ) || ( A133TBW05_SUBJECT_ID != Z133TBW05_SUBJECT_ID ) || ( A134TBW05_CRF_ID != Z134TBW05_CRF_ID ) || ( GXutil.strcmp(A135TBW05_CRF_ITEM_GRP_DIV, Z135TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A136TBW05_CRF_ITEM_GRP_CD, Z136TBW05_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A129TBW05_SESSION_ID = Z129TBW05_SESSION_ID ;
            A130TBW05_APP_ID = Z130TBW05_APP_ID ;
            A131TBW05_DISP_DATETIME = Z131TBW05_DISP_DATETIME ;
            A132TBW05_STUDY_ID = Z132TBW05_STUDY_ID ;
            A133TBW05_SUBJECT_ID = Z133TBW05_SUBJECT_ID ;
            A134TBW05_CRF_ID = Z134TBW05_CRF_ID ;
            A135TBW05_CRF_ITEM_GRP_DIV = Z135TBW05_CRF_ITEM_GRP_DIV ;
            A136TBW05_CRF_ITEM_GRP_CD = Z136TBW05_CRF_ITEM_GRP_CD ;
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
         if ( ( GXutil.strcmp(A129TBW05_SESSION_ID, Z129TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A130TBW05_APP_ID, Z130TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A131TBW05_DISP_DATETIME, Z131TBW05_DISP_DATETIME) != 0 ) || ( A132TBW05_STUDY_ID != Z132TBW05_STUDY_ID ) || ( A133TBW05_SUBJECT_ID != Z133TBW05_SUBJECT_ID ) || ( A134TBW05_CRF_ID != Z134TBW05_CRF_ID ) || ( GXutil.strcmp(A135TBW05_CRF_ITEM_GRP_DIV, Z135TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A136TBW05_CRF_ITEM_GRP_CD, Z136TBW05_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw05_crf_result_bc");
      VarsToRow43( bcTBW05_CRF_RESULT) ;
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
      Gx_mode = bcTBW05_CRF_RESULT.getgxTv_SdtTBW05_CRF_RESULT_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW05_CRF_RESULT.setgxTv_SdtTBW05_CRF_RESULT_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW05_CRF_RESULT sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW05_CRF_RESULT )
      {
         bcTBW05_CRF_RESULT = sdt ;
         if ( GXutil.strcmp(bcTBW05_CRF_RESULT.getgxTv_SdtTBW05_CRF_RESULT_Mode(), "") == 0 )
         {
            bcTBW05_CRF_RESULT.setgxTv_SdtTBW05_CRF_RESULT_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow43( bcTBW05_CRF_RESULT) ;
         }
         else
         {
            RowToVars43( bcTBW05_CRF_RESULT, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW05_CRF_RESULT.getgxTv_SdtTBW05_CRF_RESULT_Mode(), "") == 0 )
         {
            bcTBW05_CRF_RESULT.setgxTv_SdtTBW05_CRF_RESULT_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars43( bcTBW05_CRF_RESULT, 1) ;
   }

   public SdtTBW05_CRF_RESULT getTBW05_CRF_RESULT_BC( )
   {
      return bcTBW05_CRF_RESULT ;
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
      Z129TBW05_SESSION_ID = "" ;
      A129TBW05_SESSION_ID = "" ;
      Z130TBW05_APP_ID = "" ;
      A130TBW05_APP_ID = "" ;
      Z131TBW05_DISP_DATETIME = "" ;
      A131TBW05_DISP_DATETIME = "" ;
      Z135TBW05_CRF_ITEM_GRP_DIV = "" ;
      A135TBW05_CRF_ITEM_GRP_DIV = "" ;
      Z136TBW05_CRF_ITEM_GRP_CD = "" ;
      A136TBW05_CRF_ITEM_GRP_CD = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z756TBW05_CRF_VALUE = "" ;
      A756TBW05_CRF_VALUE = "" ;
      Z757TBW05_EDIT_FLG = "" ;
      A757TBW05_EDIT_FLG = "" ;
      BC00184_A129TBW05_SESSION_ID = new String[] {""} ;
      BC00184_A130TBW05_APP_ID = new String[] {""} ;
      BC00184_A131TBW05_DISP_DATETIME = new String[] {""} ;
      BC00184_A132TBW05_STUDY_ID = new long[1] ;
      BC00184_A133TBW05_SUBJECT_ID = new int[1] ;
      BC00184_A134TBW05_CRF_ID = new short[1] ;
      BC00184_A135TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00184_A136TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00184_A756TBW05_CRF_VALUE = new String[] {""} ;
      BC00184_n756TBW05_CRF_VALUE = new boolean[] {false} ;
      BC00184_A757TBW05_EDIT_FLG = new String[] {""} ;
      BC00184_n757TBW05_EDIT_FLG = new boolean[] {false} ;
      BC00185_A129TBW05_SESSION_ID = new String[] {""} ;
      BC00185_A130TBW05_APP_ID = new String[] {""} ;
      BC00185_A131TBW05_DISP_DATETIME = new String[] {""} ;
      BC00185_A132TBW05_STUDY_ID = new long[1] ;
      BC00185_A133TBW05_SUBJECT_ID = new int[1] ;
      BC00185_A134TBW05_CRF_ID = new short[1] ;
      BC00185_A135TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00185_A136TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00186_A129TBW05_SESSION_ID = new String[] {""} ;
      BC00186_A130TBW05_APP_ID = new String[] {""} ;
      BC00186_A131TBW05_DISP_DATETIME = new String[] {""} ;
      BC00186_A132TBW05_STUDY_ID = new long[1] ;
      BC00186_A133TBW05_SUBJECT_ID = new int[1] ;
      BC00186_A134TBW05_CRF_ID = new short[1] ;
      BC00186_A135TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00186_A136TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00186_A756TBW05_CRF_VALUE = new String[] {""} ;
      BC00186_n756TBW05_CRF_VALUE = new boolean[] {false} ;
      BC00186_A757TBW05_EDIT_FLG = new String[] {""} ;
      BC00186_n757TBW05_EDIT_FLG = new boolean[] {false} ;
      sMode43 = "" ;
      BC00187_A129TBW05_SESSION_ID = new String[] {""} ;
      BC00187_A130TBW05_APP_ID = new String[] {""} ;
      BC00187_A131TBW05_DISP_DATETIME = new String[] {""} ;
      BC00187_A132TBW05_STUDY_ID = new long[1] ;
      BC00187_A133TBW05_SUBJECT_ID = new int[1] ;
      BC00187_A134TBW05_CRF_ID = new short[1] ;
      BC00187_A135TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00187_A136TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00187_A756TBW05_CRF_VALUE = new String[] {""} ;
      BC00187_n756TBW05_CRF_VALUE = new boolean[] {false} ;
      BC00187_A757TBW05_EDIT_FLG = new String[] {""} ;
      BC00187_n757TBW05_EDIT_FLG = new boolean[] {false} ;
      BC001811_A129TBW05_SESSION_ID = new String[] {""} ;
      BC001811_A130TBW05_APP_ID = new String[] {""} ;
      BC001811_A131TBW05_DISP_DATETIME = new String[] {""} ;
      BC001811_A132TBW05_STUDY_ID = new long[1] ;
      BC001811_A133TBW05_SUBJECT_ID = new int[1] ;
      BC001811_A134TBW05_CRF_ID = new short[1] ;
      BC001811_A135TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC001811_A136TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC001811_A756TBW05_CRF_VALUE = new String[] {""} ;
      BC001811_n756TBW05_CRF_VALUE = new boolean[] {false} ;
      BC001811_A757TBW05_EDIT_FLG = new String[] {""} ;
      BC001811_n757TBW05_EDIT_FLG = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw05_crf_result_bc__default(),
         new Object[] {
             new Object[] {
            BC00182_A129TBW05_SESSION_ID, BC00182_A130TBW05_APP_ID, BC00182_A131TBW05_DISP_DATETIME, BC00182_A132TBW05_STUDY_ID, BC00182_A133TBW05_SUBJECT_ID, BC00182_A134TBW05_CRF_ID, BC00182_A135TBW05_CRF_ITEM_GRP_DIV, BC00182_A136TBW05_CRF_ITEM_GRP_CD, BC00182_A756TBW05_CRF_VALUE, BC00182_n756TBW05_CRF_VALUE,
            BC00182_A757TBW05_EDIT_FLG, BC00182_n757TBW05_EDIT_FLG
            }
            , new Object[] {
            BC00183_A129TBW05_SESSION_ID, BC00183_A130TBW05_APP_ID, BC00183_A131TBW05_DISP_DATETIME, BC00183_A132TBW05_STUDY_ID, BC00183_A133TBW05_SUBJECT_ID, BC00183_A134TBW05_CRF_ID, BC00183_A135TBW05_CRF_ITEM_GRP_DIV, BC00183_A136TBW05_CRF_ITEM_GRP_CD, BC00183_A756TBW05_CRF_VALUE, BC00183_n756TBW05_CRF_VALUE,
            BC00183_A757TBW05_EDIT_FLG, BC00183_n757TBW05_EDIT_FLG
            }
            , new Object[] {
            BC00184_A129TBW05_SESSION_ID, BC00184_A130TBW05_APP_ID, BC00184_A131TBW05_DISP_DATETIME, BC00184_A132TBW05_STUDY_ID, BC00184_A133TBW05_SUBJECT_ID, BC00184_A134TBW05_CRF_ID, BC00184_A135TBW05_CRF_ITEM_GRP_DIV, BC00184_A136TBW05_CRF_ITEM_GRP_CD, BC00184_A756TBW05_CRF_VALUE, BC00184_n756TBW05_CRF_VALUE,
            BC00184_A757TBW05_EDIT_FLG, BC00184_n757TBW05_EDIT_FLG
            }
            , new Object[] {
            BC00185_A129TBW05_SESSION_ID, BC00185_A130TBW05_APP_ID, BC00185_A131TBW05_DISP_DATETIME, BC00185_A132TBW05_STUDY_ID, BC00185_A133TBW05_SUBJECT_ID, BC00185_A134TBW05_CRF_ID, BC00185_A135TBW05_CRF_ITEM_GRP_DIV, BC00185_A136TBW05_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            BC00186_A129TBW05_SESSION_ID, BC00186_A130TBW05_APP_ID, BC00186_A131TBW05_DISP_DATETIME, BC00186_A132TBW05_STUDY_ID, BC00186_A133TBW05_SUBJECT_ID, BC00186_A134TBW05_CRF_ID, BC00186_A135TBW05_CRF_ITEM_GRP_DIV, BC00186_A136TBW05_CRF_ITEM_GRP_CD, BC00186_A756TBW05_CRF_VALUE, BC00186_n756TBW05_CRF_VALUE,
            BC00186_A757TBW05_EDIT_FLG, BC00186_n757TBW05_EDIT_FLG
            }
            , new Object[] {
            BC00187_A129TBW05_SESSION_ID, BC00187_A130TBW05_APP_ID, BC00187_A131TBW05_DISP_DATETIME, BC00187_A132TBW05_STUDY_ID, BC00187_A133TBW05_SUBJECT_ID, BC00187_A134TBW05_CRF_ID, BC00187_A135TBW05_CRF_ITEM_GRP_DIV, BC00187_A136TBW05_CRF_ITEM_GRP_CD, BC00187_A756TBW05_CRF_VALUE, BC00187_n756TBW05_CRF_VALUE,
            BC00187_A757TBW05_EDIT_FLG, BC00187_n757TBW05_EDIT_FLG
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001811_A129TBW05_SESSION_ID, BC001811_A130TBW05_APP_ID, BC001811_A131TBW05_DISP_DATETIME, BC001811_A132TBW05_STUDY_ID, BC001811_A133TBW05_SUBJECT_ID, BC001811_A134TBW05_CRF_ID, BC001811_A135TBW05_CRF_ITEM_GRP_DIV, BC001811_A136TBW05_CRF_ITEM_GRP_CD, BC001811_A756TBW05_CRF_VALUE, BC001811_n756TBW05_CRF_VALUE,
            BC001811_A757TBW05_EDIT_FLG, BC001811_n757TBW05_EDIT_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW05_CRF_RESULT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11172 */
      e11172 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z134TBW05_CRF_ID ;
   private short A134TBW05_CRF_ID ;
   private short RcdFound43 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z133TBW05_SUBJECT_ID ;
   private int A133TBW05_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z132TBW05_STUDY_ID ;
   private long A132TBW05_STUDY_ID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode43 ;
   private String Gx_emsg ;
   private boolean n756TBW05_CRF_VALUE ;
   private boolean n757TBW05_EDIT_FLG ;
   private String Z129TBW05_SESSION_ID ;
   private String A129TBW05_SESSION_ID ;
   private String Z130TBW05_APP_ID ;
   private String A130TBW05_APP_ID ;
   private String Z131TBW05_DISP_DATETIME ;
   private String A131TBW05_DISP_DATETIME ;
   private String Z135TBW05_CRF_ITEM_GRP_DIV ;
   private String A135TBW05_CRF_ITEM_GRP_DIV ;
   private String Z136TBW05_CRF_ITEM_GRP_CD ;
   private String A136TBW05_CRF_ITEM_GRP_CD ;
   private String AV7W_BC_FLG ;
   private String Z756TBW05_CRF_VALUE ;
   private String A756TBW05_CRF_VALUE ;
   private String Z757TBW05_EDIT_FLG ;
   private String A757TBW05_EDIT_FLG ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW05_CRF_RESULT bcTBW05_CRF_RESULT ;
   private IDataStoreProvider pr_default ;
   private String[] BC00184_A129TBW05_SESSION_ID ;
   private String[] BC00184_A130TBW05_APP_ID ;
   private String[] BC00184_A131TBW05_DISP_DATETIME ;
   private long[] BC00184_A132TBW05_STUDY_ID ;
   private int[] BC00184_A133TBW05_SUBJECT_ID ;
   private short[] BC00184_A134TBW05_CRF_ID ;
   private String[] BC00184_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00184_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00184_A756TBW05_CRF_VALUE ;
   private boolean[] BC00184_n756TBW05_CRF_VALUE ;
   private String[] BC00184_A757TBW05_EDIT_FLG ;
   private boolean[] BC00184_n757TBW05_EDIT_FLG ;
   private String[] BC00185_A129TBW05_SESSION_ID ;
   private String[] BC00185_A130TBW05_APP_ID ;
   private String[] BC00185_A131TBW05_DISP_DATETIME ;
   private long[] BC00185_A132TBW05_STUDY_ID ;
   private int[] BC00185_A133TBW05_SUBJECT_ID ;
   private short[] BC00185_A134TBW05_CRF_ID ;
   private String[] BC00185_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00185_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00186_A129TBW05_SESSION_ID ;
   private String[] BC00186_A130TBW05_APP_ID ;
   private String[] BC00186_A131TBW05_DISP_DATETIME ;
   private long[] BC00186_A132TBW05_STUDY_ID ;
   private int[] BC00186_A133TBW05_SUBJECT_ID ;
   private short[] BC00186_A134TBW05_CRF_ID ;
   private String[] BC00186_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00186_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00186_A756TBW05_CRF_VALUE ;
   private boolean[] BC00186_n756TBW05_CRF_VALUE ;
   private String[] BC00186_A757TBW05_EDIT_FLG ;
   private boolean[] BC00186_n757TBW05_EDIT_FLG ;
   private String[] BC00187_A129TBW05_SESSION_ID ;
   private String[] BC00187_A130TBW05_APP_ID ;
   private String[] BC00187_A131TBW05_DISP_DATETIME ;
   private long[] BC00187_A132TBW05_STUDY_ID ;
   private int[] BC00187_A133TBW05_SUBJECT_ID ;
   private short[] BC00187_A134TBW05_CRF_ID ;
   private String[] BC00187_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00187_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00187_A756TBW05_CRF_VALUE ;
   private boolean[] BC00187_n756TBW05_CRF_VALUE ;
   private String[] BC00187_A757TBW05_EDIT_FLG ;
   private boolean[] BC00187_n757TBW05_EDIT_FLG ;
   private String[] BC001811_A129TBW05_SESSION_ID ;
   private String[] BC001811_A130TBW05_APP_ID ;
   private String[] BC001811_A131TBW05_DISP_DATETIME ;
   private long[] BC001811_A132TBW05_STUDY_ID ;
   private int[] BC001811_A133TBW05_SUBJECT_ID ;
   private short[] BC001811_A134TBW05_CRF_ID ;
   private String[] BC001811_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC001811_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC001811_A756TBW05_CRF_VALUE ;
   private boolean[] BC001811_n756TBW05_CRF_VALUE ;
   private String[] BC001811_A757TBW05_EDIT_FLG ;
   private boolean[] BC001811_n757TBW05_EDIT_FLG ;
   private String[] BC00182_A129TBW05_SESSION_ID ;
   private String[] BC00182_A130TBW05_APP_ID ;
   private String[] BC00182_A131TBW05_DISP_DATETIME ;
   private long[] BC00182_A132TBW05_STUDY_ID ;
   private int[] BC00182_A133TBW05_SUBJECT_ID ;
   private short[] BC00182_A134TBW05_CRF_ID ;
   private String[] BC00182_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00182_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00182_A756TBW05_CRF_VALUE ;
   private String[] BC00182_A757TBW05_EDIT_FLG ;
   private String[] BC00183_A129TBW05_SESSION_ID ;
   private String[] BC00183_A130TBW05_APP_ID ;
   private String[] BC00183_A131TBW05_DISP_DATETIME ;
   private long[] BC00183_A132TBW05_STUDY_ID ;
   private int[] BC00183_A133TBW05_SUBJECT_ID ;
   private short[] BC00183_A134TBW05_CRF_ID ;
   private String[] BC00183_A135TBW05_CRF_ITEM_GRP_DIV ;
   private String[] BC00183_A136TBW05_CRF_ITEM_GRP_CD ;
   private String[] BC00183_A756TBW05_CRF_VALUE ;
   private String[] BC00183_A757TBW05_EDIT_FLG ;
   private boolean[] BC00182_n756TBW05_CRF_VALUE ;
   private boolean[] BC00182_n757TBW05_EDIT_FLG ;
   private boolean[] BC00183_n756TBW05_CRF_VALUE ;
   private boolean[] BC00183_n757TBW05_EDIT_FLG ;
}

final  class tbw05_crf_result_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00182", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00183", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00184", "SELECT TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD`, TM1.`TBW05_CRF_VALUE`, TM1.`TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` TM1 WHERE TM1.`TBW05_SESSION_ID` = ? and TM1.`TBW05_APP_ID` = ? and TM1.`TBW05_DISP_DATETIME` = ? and TM1.`TBW05_STUDY_ID` = ? and TM1.`TBW05_SUBJECT_ID` = ? and TM1.`TBW05_CRF_ID` = ? and TM1.`TBW05_CRF_ITEM_GRP_DIV` = ? and TM1.`TBW05_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00185", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00186", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00187", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00188", "INSERT INTO `TBW05_CRF_RESULT`(`TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00189", "UPDATE `TBW05_CRF_RESULT` SET `TBW05_CRF_VALUE`=?, `TBW05_EDIT_FLG`=?  WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001810", "DELETE FROM `TBW05_CRF_RESULT`  WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001811", "SELECT TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD`, TM1.`TBW05_CRF_VALUE`, TM1.`TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` TM1 WHERE TM1.`TBW05_SESSION_ID` = ? and TM1.`TBW05_APP_ID` = ? and TM1.`TBW05_DISP_DATETIME` = ? and TM1.`TBW05_STUDY_ID` = ? and TM1.`TBW05_SUBJECT_ID` = ? and TM1.`TBW05_CRF_ID` = ? and TM1.`TBW05_CRF_ITEM_GRP_DIV` = ? and TM1.`TBW05_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[9], 2000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[11], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setVarchar(9, (String)parms[10], 1, false);
               stmt.setVarchar(10, (String)parms[11], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
      }
   }

}

