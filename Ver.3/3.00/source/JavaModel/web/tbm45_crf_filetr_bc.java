/*
               File: tbm45_crf_filetr_bc
        Description: CRFフィルターマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:24.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm45_crf_filetr_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm45_crf_filetr_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm45_crf_filetr_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm45_crf_filetr_bc.class ));
   }

   public tbm45_crf_filetr_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1N65( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1N65( ) ;
      standaloneModal( ) ;
      addRow1N65( ) ;
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
            Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
            Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
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

   public void confirm_1N0( )
   {
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1N65( ) ;
         }
         else
         {
            checkExtendedTable1N65( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1N65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1N65( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z980TBM45_FILETR_NM = A980TBM45_FILETR_NM ;
         Z981TBM45_IN_CRF_ID = A981TBM45_IN_CRF_ID ;
         Z982TBM45_DEL_FLG = A982TBM45_DEL_FLG ;
         Z983TBM45_CRT_DATETIME = A983TBM45_CRT_DATETIME ;
         Z984TBM45_CRT_USER_ID = A984TBM45_CRT_USER_ID ;
         Z985TBM45_CRT_PROG_NM = A985TBM45_CRT_PROG_NM ;
         Z986TBM45_UPD_DATETIME = A986TBM45_UPD_DATETIME ;
         Z987TBM45_UPD_USER_ID = A987TBM45_UPD_USER_ID ;
         Z988TBM45_UPD_PROG_NM = A988TBM45_UPD_PROG_NM ;
         Z989TBM45_UPD_CNT = A989TBM45_UPD_CNT ;
      }
      if ( GX_JID == -3 )
      {
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
         Z980TBM45_FILETR_NM = A980TBM45_FILETR_NM ;
         Z981TBM45_IN_CRF_ID = A981TBM45_IN_CRF_ID ;
         Z982TBM45_DEL_FLG = A982TBM45_DEL_FLG ;
         Z983TBM45_CRT_DATETIME = A983TBM45_CRT_DATETIME ;
         Z984TBM45_CRT_USER_ID = A984TBM45_CRT_USER_ID ;
         Z985TBM45_CRT_PROG_NM = A985TBM45_CRT_PROG_NM ;
         Z986TBM45_UPD_DATETIME = A986TBM45_UPD_DATETIME ;
         Z987TBM45_UPD_USER_ID = A987TBM45_UPD_USER_ID ;
         Z988TBM45_UPD_PROG_NM = A988TBM45_UPD_PROG_NM ;
         Z989TBM45_UPD_CNT = A989TBM45_UPD_CNT ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1N65( )
   {
      /* Using cursor BC001N4 */
      pr_default.execute(2, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A980TBM45_FILETR_NM = BC001N4_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = BC001N4_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = BC001N4_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = BC001N4_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = BC001N4_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = BC001N4_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = BC001N4_A983TBM45_CRT_DATETIME[0] ;
         n983TBM45_CRT_DATETIME = BC001N4_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = BC001N4_A984TBM45_CRT_USER_ID[0] ;
         n984TBM45_CRT_USER_ID = BC001N4_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = BC001N4_A985TBM45_CRT_PROG_NM[0] ;
         n985TBM45_CRT_PROG_NM = BC001N4_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = BC001N4_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = BC001N4_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = BC001N4_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = BC001N4_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = BC001N4_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = BC001N4_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = BC001N4_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = BC001N4_n989TBM45_UPD_CNT[0] ;
         zm1N65( -3) ;
      }
      pr_default.close(2);
      onLoadActions1N65( ) ;
   }

   public void onLoadActions1N65( )
   {
   }

   public void checkExtendedTable1N65( )
   {
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A983TBM45_CRT_DATETIME) || (( A983TBM45_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A983TBM45_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A986TBM45_UPD_DATETIME) || (( A986TBM45_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A986TBM45_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1N65( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1N65( )
   {
      /* Using cursor BC001N5 */
      pr_default.execute(3, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001N3 */
      pr_default.execute(1, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1N65( 3) ;
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = BC001N3_A977TBM45_STUDY_ID[0] ;
         A978TBM45_FILTER_NO = BC001N3_A978TBM45_FILTER_NO[0] ;
         A980TBM45_FILETR_NM = BC001N3_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = BC001N3_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = BC001N3_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = BC001N3_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = BC001N3_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = BC001N3_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = BC001N3_A983TBM45_CRT_DATETIME[0] ;
         n983TBM45_CRT_DATETIME = BC001N3_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = BC001N3_A984TBM45_CRT_USER_ID[0] ;
         n984TBM45_CRT_USER_ID = BC001N3_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = BC001N3_A985TBM45_CRT_PROG_NM[0] ;
         n985TBM45_CRT_PROG_NM = BC001N3_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = BC001N3_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = BC001N3_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = BC001N3_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = BC001N3_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = BC001N3_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = BC001N3_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = BC001N3_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = BC001N3_n989TBM45_UPD_CNT[0] ;
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1N65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1N65( ) ;
         }
         Gx_mode = sMode65 ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1N65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1N65( ) ;
      if ( RcdFound65 == 0 )
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
      confirm_1N0( ) ;
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

   public void checkOptimisticConcurrency1N65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001N2 */
         pr_default.execute(0, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM45_CRF_FILETR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z980TBM45_FILETR_NM, BC001N2_A980TBM45_FILETR_NM[0]) != 0 ) || ( GXutil.strcmp(Z981TBM45_IN_CRF_ID, BC001N2_A981TBM45_IN_CRF_ID[0]) != 0 ) || ( GXutil.strcmp(Z982TBM45_DEL_FLG, BC001N2_A982TBM45_DEL_FLG[0]) != 0 ) || !( Z983TBM45_CRT_DATETIME.equals( BC001N2_A983TBM45_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z984TBM45_CRT_USER_ID, BC001N2_A984TBM45_CRT_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z985TBM45_CRT_PROG_NM, BC001N2_A985TBM45_CRT_PROG_NM[0]) != 0 ) || !( Z986TBM45_UPD_DATETIME.equals( BC001N2_A986TBM45_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z987TBM45_UPD_USER_ID, BC001N2_A987TBM45_UPD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z988TBM45_UPD_PROG_NM, BC001N2_A988TBM45_UPD_PROG_NM[0]) != 0 ) || ( Z989TBM45_UPD_CNT != BC001N2_A989TBM45_UPD_CNT[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM45_CRF_FILETR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N65( )
   {
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N65( 0) ;
         checkOptimisticConcurrency1N65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001N6 */
                  pr_default.execute(4, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO), new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
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
            load1N65( ) ;
         }
         endLevel1N65( ) ;
      }
      closeExtendedTableCursors1N65( ) ;
   }

   public void update1N65( )
   {
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001N7 */
                  pr_default.execute(5, new Object[] {new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT), new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM45_CRF_FILETR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N65( ) ;
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
         endLevel1N65( ) ;
      }
      closeExtendedTableCursors1N65( ) ;
   }

   public void deferredUpdate1N65( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N65( ) ;
         afterConfirm1N65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N65( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001N8 */
               pr_default.execute(6, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1N65( ) ;
      Gx_mode = sMode65 ;
   }

   public void onDeleteControls1N65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1N65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N65( ) ;
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

   public void scanKeyStart1N65( )
   {
      /* Using cursor BC001N9 */
      pr_default.execute(7, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = BC001N9_A977TBM45_STUDY_ID[0] ;
         A978TBM45_FILTER_NO = BC001N9_A978TBM45_FILTER_NO[0] ;
         A980TBM45_FILETR_NM = BC001N9_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = BC001N9_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = BC001N9_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = BC001N9_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = BC001N9_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = BC001N9_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = BC001N9_A983TBM45_CRT_DATETIME[0] ;
         n983TBM45_CRT_DATETIME = BC001N9_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = BC001N9_A984TBM45_CRT_USER_ID[0] ;
         n984TBM45_CRT_USER_ID = BC001N9_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = BC001N9_A985TBM45_CRT_PROG_NM[0] ;
         n985TBM45_CRT_PROG_NM = BC001N9_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = BC001N9_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = BC001N9_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = BC001N9_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = BC001N9_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = BC001N9_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = BC001N9_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = BC001N9_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = BC001N9_n989TBM45_UPD_CNT[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1N65( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound65 = (short)(0) ;
      scanKeyLoad1N65( ) ;
   }

   public void scanKeyLoad1N65( )
   {
      sMode65 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = BC001N9_A977TBM45_STUDY_ID[0] ;
         A978TBM45_FILTER_NO = BC001N9_A978TBM45_FILTER_NO[0] ;
         A980TBM45_FILETR_NM = BC001N9_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = BC001N9_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = BC001N9_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = BC001N9_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = BC001N9_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = BC001N9_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = BC001N9_A983TBM45_CRT_DATETIME[0] ;
         n983TBM45_CRT_DATETIME = BC001N9_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = BC001N9_A984TBM45_CRT_USER_ID[0] ;
         n984TBM45_CRT_USER_ID = BC001N9_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = BC001N9_A985TBM45_CRT_PROG_NM[0] ;
         n985TBM45_CRT_PROG_NM = BC001N9_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = BC001N9_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = BC001N9_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = BC001N9_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = BC001N9_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = BC001N9_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = BC001N9_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = BC001N9_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = BC001N9_n989TBM45_UPD_CNT[0] ;
      }
      Gx_mode = sMode65 ;
   }

   public void scanKeyEnd1N65( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1N65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N65( )
   {
   }

   public void addRow1N65( )
   {
      VarsToRow65( bcTBM45_CRF_FILETR) ;
   }

   public void readRow1N65( )
   {
      RowToVars65( bcTBM45_CRF_FILETR, 1) ;
   }

   public void initializeNonKey1N65( )
   {
      A980TBM45_FILETR_NM = "" ;
      n980TBM45_FILETR_NM = false ;
      A981TBM45_IN_CRF_ID = "" ;
      n981TBM45_IN_CRF_ID = false ;
      A982TBM45_DEL_FLG = "" ;
      n982TBM45_DEL_FLG = false ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n983TBM45_CRT_DATETIME = false ;
      A984TBM45_CRT_USER_ID = "" ;
      n984TBM45_CRT_USER_ID = false ;
      A985TBM45_CRT_PROG_NM = "" ;
      n985TBM45_CRT_PROG_NM = false ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n986TBM45_UPD_DATETIME = false ;
      A987TBM45_UPD_USER_ID = "" ;
      n987TBM45_UPD_USER_ID = false ;
      A988TBM45_UPD_PROG_NM = "" ;
      n988TBM45_UPD_PROG_NM = false ;
      A989TBM45_UPD_CNT = 0 ;
      n989TBM45_UPD_CNT = false ;
   }

   public void initAll1N65( )
   {
      A977TBM45_STUDY_ID = 0 ;
      A978TBM45_FILTER_NO = (short)(0) ;
      initializeNonKey1N65( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow65( SdtTBM45_CRF_FILETR obj65 )
   {
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Mode( Gx_mode );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm( A980TBM45_FILETR_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id( A981TBM45_IN_CRF_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg( A982TBM45_DEL_FLG );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime( A983TBM45_CRT_DATETIME );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id( A984TBM45_CRT_USER_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm( A985TBM45_CRT_PROG_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime( A986TBM45_UPD_DATETIME );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id( A987TBM45_UPD_USER_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm( A988TBM45_UPD_PROG_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt( A989TBM45_UPD_CNT );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id( A977TBM45_STUDY_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no( A978TBM45_FILTER_NO );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z( Z977TBM45_STUDY_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z( Z978TBM45_FILTER_NO );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z( Z980TBM45_FILETR_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z( Z981TBM45_IN_CRF_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z( Z982TBM45_DEL_FLG );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z( Z983TBM45_CRT_DATETIME );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z( Z984TBM45_CRT_USER_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z( Z985TBM45_CRT_PROG_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z( Z986TBM45_UPD_DATETIME );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z( Z987TBM45_UPD_USER_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z( Z988TBM45_UPD_PROG_NM );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z( Z989TBM45_UPD_CNT );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N( (byte)((byte)((n980TBM45_FILETR_NM)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N( (byte)((byte)((n981TBM45_IN_CRF_ID)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N( (byte)((byte)((n982TBM45_DEL_FLG)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N( (byte)((byte)((n983TBM45_CRT_DATETIME)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N( (byte)((byte)((n984TBM45_CRT_USER_ID)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N( (byte)((byte)((n985TBM45_CRT_PROG_NM)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N( (byte)((byte)((n986TBM45_UPD_DATETIME)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N( (byte)((byte)((n987TBM45_UPD_USER_ID)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N( (byte)((byte)((n988TBM45_UPD_PROG_NM)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N( (byte)((byte)((n989TBM45_UPD_CNT)?1:0)) );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Mode( Gx_mode );
   }

   public void KeyVarsToRow65( SdtTBM45_CRF_FILETR obj65 )
   {
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id( A977TBM45_STUDY_ID );
      obj65.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no( A978TBM45_FILTER_NO );
   }

   public void RowToVars65( SdtTBM45_CRF_FILETR obj65 ,
                            int forceLoad )
   {
      Gx_mode = obj65.getgxTv_SdtTBM45_CRF_FILETR_Mode() ;
      A980TBM45_FILETR_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm() ;
      n980TBM45_FILETR_NM = false ;
      A981TBM45_IN_CRF_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id() ;
      n981TBM45_IN_CRF_ID = false ;
      A982TBM45_DEL_FLG = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg() ;
      n982TBM45_DEL_FLG = false ;
      A983TBM45_CRT_DATETIME = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime() ;
      n983TBM45_CRT_DATETIME = false ;
      A984TBM45_CRT_USER_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id() ;
      n984TBM45_CRT_USER_ID = false ;
      A985TBM45_CRT_PROG_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm() ;
      n985TBM45_CRT_PROG_NM = false ;
      A986TBM45_UPD_DATETIME = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime() ;
      n986TBM45_UPD_DATETIME = false ;
      A987TBM45_UPD_USER_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id() ;
      n987TBM45_UPD_USER_ID = false ;
      A988TBM45_UPD_PROG_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm() ;
      n988TBM45_UPD_PROG_NM = false ;
      A989TBM45_UPD_CNT = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt() ;
      n989TBM45_UPD_CNT = false ;
      A977TBM45_STUDY_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id() ;
      A978TBM45_FILTER_NO = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no() ;
      Z977TBM45_STUDY_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z() ;
      Z978TBM45_FILTER_NO = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z() ;
      Z980TBM45_FILETR_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z() ;
      Z981TBM45_IN_CRF_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z() ;
      Z982TBM45_DEL_FLG = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z() ;
      Z983TBM45_CRT_DATETIME = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z() ;
      Z984TBM45_CRT_USER_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z() ;
      Z985TBM45_CRT_PROG_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z() ;
      Z986TBM45_UPD_DATETIME = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z() ;
      Z987TBM45_UPD_USER_ID = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z() ;
      Z988TBM45_UPD_PROG_NM = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z() ;
      Z989TBM45_UPD_CNT = obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z() ;
      n980TBM45_FILETR_NM = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N()==0)?false:true) ;
      n981TBM45_IN_CRF_ID = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N()==0)?false:true) ;
      n982TBM45_DEL_FLG = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N()==0)?false:true) ;
      n983TBM45_CRT_DATETIME = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N()==0)?false:true) ;
      n984TBM45_CRT_USER_ID = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N()==0)?false:true) ;
      n985TBM45_CRT_PROG_NM = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N()==0)?false:true) ;
      n986TBM45_UPD_DATETIME = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N()==0)?false:true) ;
      n987TBM45_UPD_USER_ID = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N()==0)?false:true) ;
      n988TBM45_UPD_PROG_NM = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N()==0)?false:true) ;
      n989TBM45_UPD_CNT = (boolean)((obj65.getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj65.getgxTv_SdtTBM45_CRF_FILETR_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A977TBM45_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A978TBM45_FILTER_NO = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1N65( ) ;
      scanKeyStart1N65( ) ;
      if ( RcdFound65 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
      }
      zm1N65( -3) ;
      onLoadActions1N65( ) ;
      addRow1N65( ) ;
      scanKeyEnd1N65( ) ;
      if ( RcdFound65 == 0 )
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
      RowToVars65( bcTBM45_CRF_FILETR, 0) ;
      scanKeyStart1N65( ) ;
      if ( RcdFound65 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
      }
      zm1N65( -3) ;
      onLoadActions1N65( ) ;
      addRow1N65( ) ;
      scanKeyEnd1N65( ) ;
      if ( RcdFound65 == 0 )
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
      RowToVars65( bcTBM45_CRF_FILETR, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1N65( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1N65( ) ;
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
            {
               A977TBM45_STUDY_ID = Z977TBM45_STUDY_ID ;
               A978TBM45_FILTER_NO = Z978TBM45_FILTER_NO ;
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
               update1N65( ) ;
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
               if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
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
                     insert1N65( ) ;
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
                     insert1N65( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow65( bcTBM45_CRF_FILETR) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars65( bcTBM45_CRF_FILETR, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1N65( ) ;
      if ( RcdFound65 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
         {
            A977TBM45_STUDY_ID = Z977TBM45_STUDY_ID ;
            A978TBM45_FILTER_NO = Z978TBM45_FILTER_NO ;
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
         if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm45_crf_filetr_bc");
      VarsToRow65( bcTBM45_CRF_FILETR) ;
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
      Gx_mode = bcTBM45_CRF_FILETR.getgxTv_SdtTBM45_CRF_FILETR_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM45_CRF_FILETR.setgxTv_SdtTBM45_CRF_FILETR_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM45_CRF_FILETR sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM45_CRF_FILETR )
      {
         bcTBM45_CRF_FILETR = sdt ;
         if ( GXutil.strcmp(bcTBM45_CRF_FILETR.getgxTv_SdtTBM45_CRF_FILETR_Mode(), "") == 0 )
         {
            bcTBM45_CRF_FILETR.setgxTv_SdtTBM45_CRF_FILETR_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow65( bcTBM45_CRF_FILETR) ;
         }
         else
         {
            RowToVars65( bcTBM45_CRF_FILETR, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM45_CRF_FILETR.getgxTv_SdtTBM45_CRF_FILETR_Mode(), "") == 0 )
         {
            bcTBM45_CRF_FILETR.setgxTv_SdtTBM45_CRF_FILETR_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars65( bcTBM45_CRF_FILETR, 1) ;
   }

   public SdtTBM45_CRF_FILETR getTBM45_CRF_FILETR_BC( )
   {
      return bcTBM45_CRF_FILETR ;
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
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z980TBM45_FILETR_NM = "" ;
      A980TBM45_FILETR_NM = "" ;
      Z981TBM45_IN_CRF_ID = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      Z982TBM45_DEL_FLG = "" ;
      A982TBM45_DEL_FLG = "" ;
      Z983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z984TBM45_CRT_USER_ID = "" ;
      A984TBM45_CRT_USER_ID = "" ;
      Z985TBM45_CRT_PROG_NM = "" ;
      A985TBM45_CRT_PROG_NM = "" ;
      Z986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z987TBM45_UPD_USER_ID = "" ;
      A987TBM45_UPD_USER_ID = "" ;
      Z988TBM45_UPD_PROG_NM = "" ;
      A988TBM45_UPD_PROG_NM = "" ;
      BC001N4_A977TBM45_STUDY_ID = new long[1] ;
      BC001N4_A978TBM45_FILTER_NO = new short[1] ;
      BC001N4_A980TBM45_FILETR_NM = new String[] {""} ;
      BC001N4_n980TBM45_FILETR_NM = new boolean[] {false} ;
      BC001N4_A981TBM45_IN_CRF_ID = new String[] {""} ;
      BC001N4_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      BC001N4_A982TBM45_DEL_FLG = new String[] {""} ;
      BC001N4_n982TBM45_DEL_FLG = new boolean[] {false} ;
      BC001N4_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N4_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      BC001N4_A984TBM45_CRT_USER_ID = new String[] {""} ;
      BC001N4_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      BC001N4_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      BC001N4_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      BC001N4_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N4_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      BC001N4_A987TBM45_UPD_USER_ID = new String[] {""} ;
      BC001N4_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      BC001N4_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      BC001N4_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      BC001N4_A989TBM45_UPD_CNT = new long[1] ;
      BC001N4_n989TBM45_UPD_CNT = new boolean[] {false} ;
      BC001N5_A977TBM45_STUDY_ID = new long[1] ;
      BC001N5_A978TBM45_FILTER_NO = new short[1] ;
      BC001N3_A977TBM45_STUDY_ID = new long[1] ;
      BC001N3_A978TBM45_FILTER_NO = new short[1] ;
      BC001N3_A980TBM45_FILETR_NM = new String[] {""} ;
      BC001N3_n980TBM45_FILETR_NM = new boolean[] {false} ;
      BC001N3_A981TBM45_IN_CRF_ID = new String[] {""} ;
      BC001N3_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      BC001N3_A982TBM45_DEL_FLG = new String[] {""} ;
      BC001N3_n982TBM45_DEL_FLG = new boolean[] {false} ;
      BC001N3_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N3_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      BC001N3_A984TBM45_CRT_USER_ID = new String[] {""} ;
      BC001N3_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      BC001N3_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      BC001N3_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      BC001N3_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N3_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      BC001N3_A987TBM45_UPD_USER_ID = new String[] {""} ;
      BC001N3_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      BC001N3_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      BC001N3_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      BC001N3_A989TBM45_UPD_CNT = new long[1] ;
      BC001N3_n989TBM45_UPD_CNT = new boolean[] {false} ;
      sMode65 = "" ;
      BC001N2_A977TBM45_STUDY_ID = new long[1] ;
      BC001N2_A978TBM45_FILTER_NO = new short[1] ;
      BC001N2_A980TBM45_FILETR_NM = new String[] {""} ;
      BC001N2_n980TBM45_FILETR_NM = new boolean[] {false} ;
      BC001N2_A981TBM45_IN_CRF_ID = new String[] {""} ;
      BC001N2_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      BC001N2_A982TBM45_DEL_FLG = new String[] {""} ;
      BC001N2_n982TBM45_DEL_FLG = new boolean[] {false} ;
      BC001N2_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N2_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      BC001N2_A984TBM45_CRT_USER_ID = new String[] {""} ;
      BC001N2_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      BC001N2_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      BC001N2_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      BC001N2_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N2_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      BC001N2_A987TBM45_UPD_USER_ID = new String[] {""} ;
      BC001N2_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      BC001N2_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      BC001N2_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      BC001N2_A989TBM45_UPD_CNT = new long[1] ;
      BC001N2_n989TBM45_UPD_CNT = new boolean[] {false} ;
      BC001N9_A977TBM45_STUDY_ID = new long[1] ;
      BC001N9_A978TBM45_FILTER_NO = new short[1] ;
      BC001N9_A980TBM45_FILETR_NM = new String[] {""} ;
      BC001N9_n980TBM45_FILETR_NM = new boolean[] {false} ;
      BC001N9_A981TBM45_IN_CRF_ID = new String[] {""} ;
      BC001N9_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      BC001N9_A982TBM45_DEL_FLG = new String[] {""} ;
      BC001N9_n982TBM45_DEL_FLG = new boolean[] {false} ;
      BC001N9_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N9_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      BC001N9_A984TBM45_CRT_USER_ID = new String[] {""} ;
      BC001N9_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      BC001N9_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      BC001N9_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      BC001N9_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001N9_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      BC001N9_A987TBM45_UPD_USER_ID = new String[] {""} ;
      BC001N9_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      BC001N9_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      BC001N9_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      BC001N9_A989TBM45_UPD_CNT = new long[1] ;
      BC001N9_n989TBM45_UPD_CNT = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm45_crf_filetr_bc__default(),
         new Object[] {
             new Object[] {
            BC001N2_A977TBM45_STUDY_ID, BC001N2_A978TBM45_FILTER_NO, BC001N2_A980TBM45_FILETR_NM, BC001N2_n980TBM45_FILETR_NM, BC001N2_A981TBM45_IN_CRF_ID, BC001N2_n981TBM45_IN_CRF_ID, BC001N2_A982TBM45_DEL_FLG, BC001N2_n982TBM45_DEL_FLG, BC001N2_A983TBM45_CRT_DATETIME, BC001N2_n983TBM45_CRT_DATETIME,
            BC001N2_A984TBM45_CRT_USER_ID, BC001N2_n984TBM45_CRT_USER_ID, BC001N2_A985TBM45_CRT_PROG_NM, BC001N2_n985TBM45_CRT_PROG_NM, BC001N2_A986TBM45_UPD_DATETIME, BC001N2_n986TBM45_UPD_DATETIME, BC001N2_A987TBM45_UPD_USER_ID, BC001N2_n987TBM45_UPD_USER_ID, BC001N2_A988TBM45_UPD_PROG_NM, BC001N2_n988TBM45_UPD_PROG_NM,
            BC001N2_A989TBM45_UPD_CNT, BC001N2_n989TBM45_UPD_CNT
            }
            , new Object[] {
            BC001N3_A977TBM45_STUDY_ID, BC001N3_A978TBM45_FILTER_NO, BC001N3_A980TBM45_FILETR_NM, BC001N3_n980TBM45_FILETR_NM, BC001N3_A981TBM45_IN_CRF_ID, BC001N3_n981TBM45_IN_CRF_ID, BC001N3_A982TBM45_DEL_FLG, BC001N3_n982TBM45_DEL_FLG, BC001N3_A983TBM45_CRT_DATETIME, BC001N3_n983TBM45_CRT_DATETIME,
            BC001N3_A984TBM45_CRT_USER_ID, BC001N3_n984TBM45_CRT_USER_ID, BC001N3_A985TBM45_CRT_PROG_NM, BC001N3_n985TBM45_CRT_PROG_NM, BC001N3_A986TBM45_UPD_DATETIME, BC001N3_n986TBM45_UPD_DATETIME, BC001N3_A987TBM45_UPD_USER_ID, BC001N3_n987TBM45_UPD_USER_ID, BC001N3_A988TBM45_UPD_PROG_NM, BC001N3_n988TBM45_UPD_PROG_NM,
            BC001N3_A989TBM45_UPD_CNT, BC001N3_n989TBM45_UPD_CNT
            }
            , new Object[] {
            BC001N4_A977TBM45_STUDY_ID, BC001N4_A978TBM45_FILTER_NO, BC001N4_A980TBM45_FILETR_NM, BC001N4_n980TBM45_FILETR_NM, BC001N4_A981TBM45_IN_CRF_ID, BC001N4_n981TBM45_IN_CRF_ID, BC001N4_A982TBM45_DEL_FLG, BC001N4_n982TBM45_DEL_FLG, BC001N4_A983TBM45_CRT_DATETIME, BC001N4_n983TBM45_CRT_DATETIME,
            BC001N4_A984TBM45_CRT_USER_ID, BC001N4_n984TBM45_CRT_USER_ID, BC001N4_A985TBM45_CRT_PROG_NM, BC001N4_n985TBM45_CRT_PROG_NM, BC001N4_A986TBM45_UPD_DATETIME, BC001N4_n986TBM45_UPD_DATETIME, BC001N4_A987TBM45_UPD_USER_ID, BC001N4_n987TBM45_UPD_USER_ID, BC001N4_A988TBM45_UPD_PROG_NM, BC001N4_n988TBM45_UPD_PROG_NM,
            BC001N4_A989TBM45_UPD_CNT, BC001N4_n989TBM45_UPD_CNT
            }
            , new Object[] {
            BC001N5_A977TBM45_STUDY_ID, BC001N5_A978TBM45_FILTER_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001N9_A977TBM45_STUDY_ID, BC001N9_A978TBM45_FILTER_NO, BC001N9_A980TBM45_FILETR_NM, BC001N9_n980TBM45_FILETR_NM, BC001N9_A981TBM45_IN_CRF_ID, BC001N9_n981TBM45_IN_CRF_ID, BC001N9_A982TBM45_DEL_FLG, BC001N9_n982TBM45_DEL_FLG, BC001N9_A983TBM45_CRT_DATETIME, BC001N9_n983TBM45_CRT_DATETIME,
            BC001N9_A984TBM45_CRT_USER_ID, BC001N9_n984TBM45_CRT_USER_ID, BC001N9_A985TBM45_CRT_PROG_NM, BC001N9_n985TBM45_CRT_PROG_NM, BC001N9_A986TBM45_UPD_DATETIME, BC001N9_n986TBM45_UPD_DATETIME, BC001N9_A987TBM45_UPD_USER_ID, BC001N9_n987TBM45_UPD_USER_ID, BC001N9_A988TBM45_UPD_PROG_NM, BC001N9_n988TBM45_UPD_PROG_NM,
            BC001N9_A989TBM45_UPD_CNT, BC001N9_n989TBM45_UPD_CNT
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z978TBM45_FILTER_NO ;
   private short A978TBM45_FILTER_NO ;
   private short RcdFound65 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z977TBM45_STUDY_ID ;
   private long A977TBM45_STUDY_ID ;
   private long Z989TBM45_UPD_CNT ;
   private long A989TBM45_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String sMode65 ;
   private java.util.Date Z983TBM45_CRT_DATETIME ;
   private java.util.Date A983TBM45_CRT_DATETIME ;
   private java.util.Date Z986TBM45_UPD_DATETIME ;
   private java.util.Date A986TBM45_UPD_DATETIME ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n983TBM45_CRT_DATETIME ;
   private boolean n984TBM45_CRT_USER_ID ;
   private boolean n985TBM45_CRT_PROG_NM ;
   private boolean n986TBM45_UPD_DATETIME ;
   private boolean n987TBM45_UPD_USER_ID ;
   private boolean n988TBM45_UPD_PROG_NM ;
   private boolean n989TBM45_UPD_CNT ;
   private boolean Gx_longc ;
   private String Z980TBM45_FILETR_NM ;
   private String A980TBM45_FILETR_NM ;
   private String Z981TBM45_IN_CRF_ID ;
   private String A981TBM45_IN_CRF_ID ;
   private String Z982TBM45_DEL_FLG ;
   private String A982TBM45_DEL_FLG ;
   private String Z984TBM45_CRT_USER_ID ;
   private String A984TBM45_CRT_USER_ID ;
   private String Z985TBM45_CRT_PROG_NM ;
   private String A985TBM45_CRT_PROG_NM ;
   private String Z987TBM45_UPD_USER_ID ;
   private String A987TBM45_UPD_USER_ID ;
   private String Z988TBM45_UPD_PROG_NM ;
   private String A988TBM45_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM45_CRF_FILETR bcTBM45_CRF_FILETR ;
   private IDataStoreProvider pr_default ;
   private long[] BC001N4_A977TBM45_STUDY_ID ;
   private short[] BC001N4_A978TBM45_FILTER_NO ;
   private String[] BC001N4_A980TBM45_FILETR_NM ;
   private boolean[] BC001N4_n980TBM45_FILETR_NM ;
   private String[] BC001N4_A981TBM45_IN_CRF_ID ;
   private boolean[] BC001N4_n981TBM45_IN_CRF_ID ;
   private String[] BC001N4_A982TBM45_DEL_FLG ;
   private boolean[] BC001N4_n982TBM45_DEL_FLG ;
   private java.util.Date[] BC001N4_A983TBM45_CRT_DATETIME ;
   private boolean[] BC001N4_n983TBM45_CRT_DATETIME ;
   private String[] BC001N4_A984TBM45_CRT_USER_ID ;
   private boolean[] BC001N4_n984TBM45_CRT_USER_ID ;
   private String[] BC001N4_A985TBM45_CRT_PROG_NM ;
   private boolean[] BC001N4_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] BC001N4_A986TBM45_UPD_DATETIME ;
   private boolean[] BC001N4_n986TBM45_UPD_DATETIME ;
   private String[] BC001N4_A987TBM45_UPD_USER_ID ;
   private boolean[] BC001N4_n987TBM45_UPD_USER_ID ;
   private String[] BC001N4_A988TBM45_UPD_PROG_NM ;
   private boolean[] BC001N4_n988TBM45_UPD_PROG_NM ;
   private long[] BC001N4_A989TBM45_UPD_CNT ;
   private boolean[] BC001N4_n989TBM45_UPD_CNT ;
   private long[] BC001N5_A977TBM45_STUDY_ID ;
   private short[] BC001N5_A978TBM45_FILTER_NO ;
   private long[] BC001N3_A977TBM45_STUDY_ID ;
   private short[] BC001N3_A978TBM45_FILTER_NO ;
   private String[] BC001N3_A980TBM45_FILETR_NM ;
   private boolean[] BC001N3_n980TBM45_FILETR_NM ;
   private String[] BC001N3_A981TBM45_IN_CRF_ID ;
   private boolean[] BC001N3_n981TBM45_IN_CRF_ID ;
   private String[] BC001N3_A982TBM45_DEL_FLG ;
   private boolean[] BC001N3_n982TBM45_DEL_FLG ;
   private java.util.Date[] BC001N3_A983TBM45_CRT_DATETIME ;
   private boolean[] BC001N3_n983TBM45_CRT_DATETIME ;
   private String[] BC001N3_A984TBM45_CRT_USER_ID ;
   private boolean[] BC001N3_n984TBM45_CRT_USER_ID ;
   private String[] BC001N3_A985TBM45_CRT_PROG_NM ;
   private boolean[] BC001N3_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] BC001N3_A986TBM45_UPD_DATETIME ;
   private boolean[] BC001N3_n986TBM45_UPD_DATETIME ;
   private String[] BC001N3_A987TBM45_UPD_USER_ID ;
   private boolean[] BC001N3_n987TBM45_UPD_USER_ID ;
   private String[] BC001N3_A988TBM45_UPD_PROG_NM ;
   private boolean[] BC001N3_n988TBM45_UPD_PROG_NM ;
   private long[] BC001N3_A989TBM45_UPD_CNT ;
   private boolean[] BC001N3_n989TBM45_UPD_CNT ;
   private long[] BC001N2_A977TBM45_STUDY_ID ;
   private short[] BC001N2_A978TBM45_FILTER_NO ;
   private String[] BC001N2_A980TBM45_FILETR_NM ;
   private boolean[] BC001N2_n980TBM45_FILETR_NM ;
   private String[] BC001N2_A981TBM45_IN_CRF_ID ;
   private boolean[] BC001N2_n981TBM45_IN_CRF_ID ;
   private String[] BC001N2_A982TBM45_DEL_FLG ;
   private boolean[] BC001N2_n982TBM45_DEL_FLG ;
   private java.util.Date[] BC001N2_A983TBM45_CRT_DATETIME ;
   private boolean[] BC001N2_n983TBM45_CRT_DATETIME ;
   private String[] BC001N2_A984TBM45_CRT_USER_ID ;
   private boolean[] BC001N2_n984TBM45_CRT_USER_ID ;
   private String[] BC001N2_A985TBM45_CRT_PROG_NM ;
   private boolean[] BC001N2_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] BC001N2_A986TBM45_UPD_DATETIME ;
   private boolean[] BC001N2_n986TBM45_UPD_DATETIME ;
   private String[] BC001N2_A987TBM45_UPD_USER_ID ;
   private boolean[] BC001N2_n987TBM45_UPD_USER_ID ;
   private String[] BC001N2_A988TBM45_UPD_PROG_NM ;
   private boolean[] BC001N2_n988TBM45_UPD_PROG_NM ;
   private long[] BC001N2_A989TBM45_UPD_CNT ;
   private boolean[] BC001N2_n989TBM45_UPD_CNT ;
   private long[] BC001N9_A977TBM45_STUDY_ID ;
   private short[] BC001N9_A978TBM45_FILTER_NO ;
   private String[] BC001N9_A980TBM45_FILETR_NM ;
   private boolean[] BC001N9_n980TBM45_FILETR_NM ;
   private String[] BC001N9_A981TBM45_IN_CRF_ID ;
   private boolean[] BC001N9_n981TBM45_IN_CRF_ID ;
   private String[] BC001N9_A982TBM45_DEL_FLG ;
   private boolean[] BC001N9_n982TBM45_DEL_FLG ;
   private java.util.Date[] BC001N9_A983TBM45_CRT_DATETIME ;
   private boolean[] BC001N9_n983TBM45_CRT_DATETIME ;
   private String[] BC001N9_A984TBM45_CRT_USER_ID ;
   private boolean[] BC001N9_n984TBM45_CRT_USER_ID ;
   private String[] BC001N9_A985TBM45_CRT_PROG_NM ;
   private boolean[] BC001N9_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] BC001N9_A986TBM45_UPD_DATETIME ;
   private boolean[] BC001N9_n986TBM45_UPD_DATETIME ;
   private String[] BC001N9_A987TBM45_UPD_USER_ID ;
   private boolean[] BC001N9_n987TBM45_UPD_USER_ID ;
   private String[] BC001N9_A988TBM45_UPD_PROG_NM ;
   private boolean[] BC001N9_n988TBM45_UPD_PROG_NM ;
   private long[] BC001N9_A989TBM45_UPD_CNT ;
   private boolean[] BC001N9_n989TBM45_UPD_CNT ;
}

final  class tbm45_crf_filetr_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001N2", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001N3", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001N4", "SELECT TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO`, TM1.`TBM45_FILETR_NM`, TM1.`TBM45_IN_CRF_ID`, TM1.`TBM45_DEL_FLG`, TM1.`TBM45_CRT_DATETIME`, TM1.`TBM45_CRT_USER_ID`, TM1.`TBM45_CRT_PROG_NM`, TM1.`TBM45_UPD_DATETIME`, TM1.`TBM45_UPD_USER_ID`, TM1.`TBM45_UPD_PROG_NM`, TM1.`TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` TM1 WHERE TM1.`TBM45_STUDY_ID` = ? and TM1.`TBM45_FILTER_NO` = ? ORDER BY TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001N5", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001N6", "INSERT INTO `TBM45_CRF_FILETR`(`TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001N7", "UPDATE `TBM45_CRF_FILETR` SET `TBM45_FILETR_NM`=?, `TBM45_IN_CRF_ID`=?, `TBM45_DEL_FLG`=?, `TBM45_CRT_DATETIME`=?, `TBM45_CRT_USER_ID`=?, `TBM45_CRT_PROG_NM`=?, `TBM45_UPD_DATETIME`=?, `TBM45_UPD_USER_ID`=?, `TBM45_UPD_PROG_NM`=?, `TBM45_UPD_CNT`=?  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001N8", "DELETE FROM `TBM45_CRF_FILETR`  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001N9", "SELECT TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO`, TM1.`TBM45_FILETR_NM`, TM1.`TBM45_IN_CRF_ID`, TM1.`TBM45_DEL_FLG`, TM1.`TBM45_CRT_DATETIME`, TM1.`TBM45_CRT_USER_ID`, TM1.`TBM45_CRT_PROG_NM`, TM1.`TBM45_UPD_DATETIME`, TM1.`TBM45_UPD_USER_ID`, TM1.`TBM45_UPD_PROG_NM`, TM1.`TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` TM1 WHERE TM1.`TBM45_STUDY_ID` = ? and TM1.`TBM45_FILTER_NO` = ? ORDER BY TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[21]).longValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setShort(12, ((Number) parms[21]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

