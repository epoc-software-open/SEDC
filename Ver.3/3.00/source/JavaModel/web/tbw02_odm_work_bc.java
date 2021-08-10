/*
               File: tbw02_odm_work_bc
        Description: ODM�o�͗p���[�N
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:23.90
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw02_odm_work_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw02_odm_work_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw02_odm_work_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw02_odm_work_bc.class ));
   }

   public tbw02_odm_work_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0U29( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0U29( ) ;
      standaloneModal( ) ;
      addRow0U29( ) ;
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
            Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
            Z40TBW02_APP_ID = A40TBW02_APP_ID ;
            Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
            Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
            Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
            Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
            Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
            Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
            Z47TBW02_ORDER = A47TBW02_ORDER ;
            Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
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

   public void confirm_0U0( )
   {
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0U29( ) ;
         }
         else
         {
            checkExtendedTable0U29( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0U29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110U2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "�֎~�@�\") ;
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

   public void zm0U29( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z496TBW02_CRF_ITEM_CD = A496TBW02_CRF_ITEM_CD ;
         Z497TBW02_CRF_VALUE = A497TBW02_CRF_VALUE ;
      }
      if ( GX_JID == -1 )
      {
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
         Z496TBW02_CRF_ITEM_CD = A496TBW02_CRF_ITEM_CD ;
         Z497TBW02_CRF_VALUE = A497TBW02_CRF_VALUE ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0U29( )
   {
      /* Using cursor BC000U4 */
      pr_default.execute(2, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A496TBW02_CRF_ITEM_CD = BC000U4_A496TBW02_CRF_ITEM_CD[0] ;
         n496TBW02_CRF_ITEM_CD = BC000U4_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = BC000U4_A497TBW02_CRF_VALUE[0] ;
         n497TBW02_CRF_VALUE = BC000U4_n497TBW02_CRF_VALUE[0] ;
         zm0U29( -1) ;
      }
      pr_default.close(2);
      onLoadActions0U29( ) ;
   }

   public void onLoadActions0U29( )
   {
      AV8Pgmname = "TBW02_ODM_WORK_BC" ;
   }

   public void checkExtendedTable0U29( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW02_ODM_WORK_BC" ;
   }

   public void closeExtendedTableCursors0U29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0U29( )
   {
      /* Using cursor BC000U5 */
      pr_default.execute(3, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000U3 */
      pr_default.execute(1, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0U29( 1) ;
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = BC000U3_A39TBW02_SESSION_ID[0] ;
         A40TBW02_APP_ID = BC000U3_A40TBW02_APP_ID[0] ;
         A41TBW02_DISP_DATETIME = BC000U3_A41TBW02_DISP_DATETIME[0] ;
         A42TBW02_STUDY_ID = BC000U3_A42TBW02_STUDY_ID[0] ;
         A43TBW02_SUBJECT_ID = BC000U3_A43TBW02_SUBJECT_ID[0] ;
         A44TBW02_VISIT_NO = BC000U3_A44TBW02_VISIT_NO[0] ;
         A45TBW02_DOM_CD = BC000U3_A45TBW02_DOM_CD[0] ;
         A46TBW02_REPEAT_KEY = BC000U3_A46TBW02_REPEAT_KEY[0] ;
         A47TBW02_ORDER = BC000U3_A47TBW02_ORDER[0] ;
         A48TBW02_DOM_VAR_NM = BC000U3_A48TBW02_DOM_VAR_NM[0] ;
         A496TBW02_CRF_ITEM_CD = BC000U3_A496TBW02_CRF_ITEM_CD[0] ;
         n496TBW02_CRF_ITEM_CD = BC000U3_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = BC000U3_A497TBW02_CRF_VALUE[0] ;
         n497TBW02_CRF_VALUE = BC000U3_n497TBW02_CRF_VALUE[0] ;
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0U29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey0U29( ) ;
         }
         Gx_mode = sMode29 ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey0U29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0U29( ) ;
      if ( RcdFound29 == 0 )
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
      confirm_0U0( ) ;
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

   public void checkOptimisticConcurrency0U29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000U2 */
         pr_default.execute(0, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW02_ODM_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z496TBW02_CRF_ITEM_CD, BC000U2_A496TBW02_CRF_ITEM_CD[0]) != 0 ) || ( GXutil.strcmp(Z497TBW02_CRF_VALUE, BC000U2_A497TBW02_CRF_VALUE[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW02_ODM_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0U29( )
   {
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0U29( 0) ;
         checkOptimisticConcurrency0U29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0U29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000U6 */
                  pr_default.execute(4, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM, new Boolean(n496TBW02_CRF_ITEM_CD), A496TBW02_CRF_ITEM_CD, new Boolean(n497TBW02_CRF_VALUE), A497TBW02_CRF_VALUE});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
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
            load0U29( ) ;
         }
         endLevel0U29( ) ;
      }
      closeExtendedTableCursors0U29( ) ;
   }

   public void update0U29( )
   {
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0U29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000U7 */
                  pr_default.execute(5, new Object[] {new Boolean(n496TBW02_CRF_ITEM_CD), A496TBW02_CRF_ITEM_CD, new Boolean(n497TBW02_CRF_VALUE), A497TBW02_CRF_VALUE, A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW02_ODM_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0U29( ) ;
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
         endLevel0U29( ) ;
      }
      closeExtendedTableCursors0U29( ) ;
   }

   public void deferredUpdate0U29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0U29( ) ;
         afterConfirm0U29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0U29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000U8 */
               pr_default.execute(6, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0U29( ) ;
      Gx_mode = sMode29 ;
   }

   public void onDeleteControls0U29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW02_ODM_WORK_BC" ;
      }
   }

   public void endLevel0U29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0U29( ) ;
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

   public void scanKeyStart0U29( )
   {
      /* Scan By routine */
      /* Using cursor BC000U9 */
      pr_default.execute(7, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = BC000U9_A39TBW02_SESSION_ID[0] ;
         A40TBW02_APP_ID = BC000U9_A40TBW02_APP_ID[0] ;
         A41TBW02_DISP_DATETIME = BC000U9_A41TBW02_DISP_DATETIME[0] ;
         A42TBW02_STUDY_ID = BC000U9_A42TBW02_STUDY_ID[0] ;
         A43TBW02_SUBJECT_ID = BC000U9_A43TBW02_SUBJECT_ID[0] ;
         A44TBW02_VISIT_NO = BC000U9_A44TBW02_VISIT_NO[0] ;
         A45TBW02_DOM_CD = BC000U9_A45TBW02_DOM_CD[0] ;
         A46TBW02_REPEAT_KEY = BC000U9_A46TBW02_REPEAT_KEY[0] ;
         A47TBW02_ORDER = BC000U9_A47TBW02_ORDER[0] ;
         A48TBW02_DOM_VAR_NM = BC000U9_A48TBW02_DOM_VAR_NM[0] ;
         A496TBW02_CRF_ITEM_CD = BC000U9_A496TBW02_CRF_ITEM_CD[0] ;
         n496TBW02_CRF_ITEM_CD = BC000U9_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = BC000U9_A497TBW02_CRF_VALUE[0] ;
         n497TBW02_CRF_VALUE = BC000U9_n497TBW02_CRF_VALUE[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0U29( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound29 = (short)(0) ;
      scanKeyLoad0U29( ) ;
   }

   public void scanKeyLoad0U29( )
   {
      sMode29 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = BC000U9_A39TBW02_SESSION_ID[0] ;
         A40TBW02_APP_ID = BC000U9_A40TBW02_APP_ID[0] ;
         A41TBW02_DISP_DATETIME = BC000U9_A41TBW02_DISP_DATETIME[0] ;
         A42TBW02_STUDY_ID = BC000U9_A42TBW02_STUDY_ID[0] ;
         A43TBW02_SUBJECT_ID = BC000U9_A43TBW02_SUBJECT_ID[0] ;
         A44TBW02_VISIT_NO = BC000U9_A44TBW02_VISIT_NO[0] ;
         A45TBW02_DOM_CD = BC000U9_A45TBW02_DOM_CD[0] ;
         A46TBW02_REPEAT_KEY = BC000U9_A46TBW02_REPEAT_KEY[0] ;
         A47TBW02_ORDER = BC000U9_A47TBW02_ORDER[0] ;
         A48TBW02_DOM_VAR_NM = BC000U9_A48TBW02_DOM_VAR_NM[0] ;
         A496TBW02_CRF_ITEM_CD = BC000U9_A496TBW02_CRF_ITEM_CD[0] ;
         n496TBW02_CRF_ITEM_CD = BC000U9_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = BC000U9_A497TBW02_CRF_VALUE[0] ;
         n497TBW02_CRF_VALUE = BC000U9_n497TBW02_CRF_VALUE[0] ;
      }
      Gx_mode = sMode29 ;
   }

   public void scanKeyEnd0U29( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0U29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0U29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0U29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0U29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0U29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0U29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0U29( )
   {
   }

   public void addRow0U29( )
   {
      VarsToRow29( bcTBW02_ODM_WORK) ;
   }

   public void readRow0U29( )
   {
      RowToVars29( bcTBW02_ODM_WORK, 1) ;
   }

   public void initializeNonKey0U29( )
   {
      A496TBW02_CRF_ITEM_CD = "" ;
      n496TBW02_CRF_ITEM_CD = false ;
      A497TBW02_CRF_VALUE = "" ;
      n497TBW02_CRF_VALUE = false ;
   }

   public void initAll0U29( )
   {
      A39TBW02_SESSION_ID = "" ;
      A40TBW02_APP_ID = "" ;
      A41TBW02_DISP_DATETIME = "" ;
      A42TBW02_STUDY_ID = 0 ;
      A43TBW02_SUBJECT_ID = 0 ;
      A44TBW02_VISIT_NO = 0 ;
      A45TBW02_DOM_CD = "" ;
      A46TBW02_REPEAT_KEY = (short)(0) ;
      A47TBW02_ORDER = 0 ;
      A48TBW02_DOM_VAR_NM = "" ;
      initializeNonKey0U29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow29( SdtTBW02_ODM_WORK obj29 )
   {
      obj29.setgxTv_SdtTBW02_ODM_WORK_Mode( Gx_mode );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd( A496TBW02_CRF_ITEM_CD );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value( A497TBW02_CRF_VALUE );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id( A39TBW02_SESSION_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id( A40TBW02_APP_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime( A41TBW02_DISP_DATETIME );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id( A42TBW02_STUDY_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id( A43TBW02_SUBJECT_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no( A44TBW02_VISIT_NO );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd( A45TBW02_DOM_CD );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key( A46TBW02_REPEAT_KEY );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order( A47TBW02_ORDER );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm( A48TBW02_DOM_VAR_NM );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z( Z39TBW02_SESSION_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z( Z40TBW02_APP_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z( Z41TBW02_DISP_DATETIME );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z( Z42TBW02_STUDY_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z( Z43TBW02_SUBJECT_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z( Z44TBW02_VISIT_NO );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z( Z45TBW02_DOM_CD );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z( Z46TBW02_REPEAT_KEY );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z( Z47TBW02_ORDER );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z( Z48TBW02_DOM_VAR_NM );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z( Z496TBW02_CRF_ITEM_CD );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z( Z497TBW02_CRF_VALUE );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N( (byte)((byte)((n496TBW02_CRF_ITEM_CD)?1:0)) );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N( (byte)((byte)((n497TBW02_CRF_VALUE)?1:0)) );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Mode( Gx_mode );
   }

   public void KeyVarsToRow29( SdtTBW02_ODM_WORK obj29 )
   {
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id( A39TBW02_SESSION_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id( A40TBW02_APP_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime( A41TBW02_DISP_DATETIME );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id( A42TBW02_STUDY_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id( A43TBW02_SUBJECT_ID );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no( A44TBW02_VISIT_NO );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd( A45TBW02_DOM_CD );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key( A46TBW02_REPEAT_KEY );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order( A47TBW02_ORDER );
      obj29.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm( A48TBW02_DOM_VAR_NM );
   }

   public void RowToVars29( SdtTBW02_ODM_WORK obj29 ,
                            int forceLoad )
   {
      Gx_mode = obj29.getgxTv_SdtTBW02_ODM_WORK_Mode() ;
      A496TBW02_CRF_ITEM_CD = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd() ;
      n496TBW02_CRF_ITEM_CD = false ;
      A497TBW02_CRF_VALUE = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value() ;
      n497TBW02_CRF_VALUE = false ;
      A39TBW02_SESSION_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id() ;
      A40TBW02_APP_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id() ;
      A41TBW02_DISP_DATETIME = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime() ;
      A42TBW02_STUDY_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id() ;
      A43TBW02_SUBJECT_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id() ;
      A44TBW02_VISIT_NO = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no() ;
      A45TBW02_DOM_CD = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd() ;
      A46TBW02_REPEAT_KEY = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key() ;
      A47TBW02_ORDER = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_order() ;
      A48TBW02_DOM_VAR_NM = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm() ;
      Z39TBW02_SESSION_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z() ;
      Z40TBW02_APP_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z() ;
      Z41TBW02_DISP_DATETIME = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z() ;
      Z42TBW02_STUDY_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z() ;
      Z43TBW02_SUBJECT_ID = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z() ;
      Z44TBW02_VISIT_NO = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z() ;
      Z45TBW02_DOM_CD = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z() ;
      Z46TBW02_REPEAT_KEY = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z() ;
      Z47TBW02_ORDER = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z() ;
      Z48TBW02_DOM_VAR_NM = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z() ;
      Z496TBW02_CRF_ITEM_CD = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z() ;
      Z497TBW02_CRF_VALUE = obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z() ;
      n496TBW02_CRF_ITEM_CD = (boolean)((obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N()==0)?false:true) ;
      n497TBW02_CRF_VALUE = (boolean)((obj29.getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N()==0)?false:true) ;
      Gx_mode = obj29.getgxTv_SdtTBW02_ODM_WORK_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A39TBW02_SESSION_ID = (String)getParm(obj,0) ;
      A40TBW02_APP_ID = (String)getParm(obj,1) ;
      A41TBW02_DISP_DATETIME = (String)getParm(obj,2) ;
      A42TBW02_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A43TBW02_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A44TBW02_VISIT_NO = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      A45TBW02_DOM_CD = (String)getParm(obj,6) ;
      A46TBW02_REPEAT_KEY = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      A47TBW02_ORDER = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      A48TBW02_DOM_VAR_NM = (String)getParm(obj,9) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0U29( ) ;
      scanKeyStart0U29( ) ;
      if ( RcdFound29 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
      }
      zm0U29( -1) ;
      onLoadActions0U29( ) ;
      addRow0U29( ) ;
      scanKeyEnd0U29( ) ;
      if ( RcdFound29 == 0 )
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
      RowToVars29( bcTBW02_ODM_WORK, 0) ;
      scanKeyStart0U29( ) ;
      if ( RcdFound29 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
      }
      zm0U29( -1) ;
      onLoadActions0U29( ) ;
      addRow0U29( ) ;
      scanKeyEnd0U29( ) ;
      if ( RcdFound29 == 0 )
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
      RowToVars29( bcTBW02_ODM_WORK, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0U29( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0U29( ) ;
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
            {
               A39TBW02_SESSION_ID = Z39TBW02_SESSION_ID ;
               A40TBW02_APP_ID = Z40TBW02_APP_ID ;
               A41TBW02_DISP_DATETIME = Z41TBW02_DISP_DATETIME ;
               A42TBW02_STUDY_ID = Z42TBW02_STUDY_ID ;
               A43TBW02_SUBJECT_ID = Z43TBW02_SUBJECT_ID ;
               A44TBW02_VISIT_NO = Z44TBW02_VISIT_NO ;
               A45TBW02_DOM_CD = Z45TBW02_DOM_CD ;
               A46TBW02_REPEAT_KEY = Z46TBW02_REPEAT_KEY ;
               A47TBW02_ORDER = Z47TBW02_ORDER ;
               A48TBW02_DOM_VAR_NM = Z48TBW02_DOM_VAR_NM ;
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
               update0U29( ) ;
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
               if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
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
                     insert0U29( ) ;
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
                     insert0U29( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow29( bcTBW02_ODM_WORK) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars29( bcTBW02_ODM_WORK, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0U29( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
         {
            A39TBW02_SESSION_ID = Z39TBW02_SESSION_ID ;
            A40TBW02_APP_ID = Z40TBW02_APP_ID ;
            A41TBW02_DISP_DATETIME = Z41TBW02_DISP_DATETIME ;
            A42TBW02_STUDY_ID = Z42TBW02_STUDY_ID ;
            A43TBW02_SUBJECT_ID = Z43TBW02_SUBJECT_ID ;
            A44TBW02_VISIT_NO = Z44TBW02_VISIT_NO ;
            A45TBW02_DOM_CD = Z45TBW02_DOM_CD ;
            A46TBW02_REPEAT_KEY = Z46TBW02_REPEAT_KEY ;
            A47TBW02_ORDER = Z47TBW02_ORDER ;
            A48TBW02_DOM_VAR_NM = Z48TBW02_DOM_VAR_NM ;
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
         if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw02_odm_work_bc");
      VarsToRow29( bcTBW02_ODM_WORK) ;
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
      Gx_mode = bcTBW02_ODM_WORK.getgxTv_SdtTBW02_ODM_WORK_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW02_ODM_WORK.setgxTv_SdtTBW02_ODM_WORK_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW02_ODM_WORK sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW02_ODM_WORK )
      {
         bcTBW02_ODM_WORK = sdt ;
         if ( GXutil.strcmp(bcTBW02_ODM_WORK.getgxTv_SdtTBW02_ODM_WORK_Mode(), "") == 0 )
         {
            bcTBW02_ODM_WORK.setgxTv_SdtTBW02_ODM_WORK_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow29( bcTBW02_ODM_WORK) ;
         }
         else
         {
            RowToVars29( bcTBW02_ODM_WORK, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW02_ODM_WORK.getgxTv_SdtTBW02_ODM_WORK_Mode(), "") == 0 )
         {
            bcTBW02_ODM_WORK.setgxTv_SdtTBW02_ODM_WORK_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars29( bcTBW02_ODM_WORK, 1) ;
   }

   public SdtTBW02_ODM_WORK getTBW02_ODM_WORK_BC( )
   {
      return bcTBW02_ODM_WORK ;
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
      Z39TBW02_SESSION_ID = "" ;
      A39TBW02_SESSION_ID = "" ;
      Z40TBW02_APP_ID = "" ;
      A40TBW02_APP_ID = "" ;
      Z41TBW02_DISP_DATETIME = "" ;
      A41TBW02_DISP_DATETIME = "" ;
      Z45TBW02_DOM_CD = "" ;
      A45TBW02_DOM_CD = "" ;
      Z48TBW02_DOM_VAR_NM = "" ;
      A48TBW02_DOM_VAR_NM = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z496TBW02_CRF_ITEM_CD = "" ;
      A496TBW02_CRF_ITEM_CD = "" ;
      Z497TBW02_CRF_VALUE = "" ;
      A497TBW02_CRF_VALUE = "" ;
      BC000U4_A39TBW02_SESSION_ID = new String[] {""} ;
      BC000U4_A40TBW02_APP_ID = new String[] {""} ;
      BC000U4_A41TBW02_DISP_DATETIME = new String[] {""} ;
      BC000U4_A42TBW02_STUDY_ID = new long[1] ;
      BC000U4_A43TBW02_SUBJECT_ID = new int[1] ;
      BC000U4_A44TBW02_VISIT_NO = new int[1] ;
      BC000U4_A45TBW02_DOM_CD = new String[] {""} ;
      BC000U4_A46TBW02_REPEAT_KEY = new short[1] ;
      BC000U4_A47TBW02_ORDER = new int[1] ;
      BC000U4_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      BC000U4_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      BC000U4_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      BC000U4_A497TBW02_CRF_VALUE = new String[] {""} ;
      BC000U4_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      BC000U5_A39TBW02_SESSION_ID = new String[] {""} ;
      BC000U5_A40TBW02_APP_ID = new String[] {""} ;
      BC000U5_A41TBW02_DISP_DATETIME = new String[] {""} ;
      BC000U5_A42TBW02_STUDY_ID = new long[1] ;
      BC000U5_A43TBW02_SUBJECT_ID = new int[1] ;
      BC000U5_A44TBW02_VISIT_NO = new int[1] ;
      BC000U5_A45TBW02_DOM_CD = new String[] {""} ;
      BC000U5_A46TBW02_REPEAT_KEY = new short[1] ;
      BC000U5_A47TBW02_ORDER = new int[1] ;
      BC000U5_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      BC000U3_A39TBW02_SESSION_ID = new String[] {""} ;
      BC000U3_A40TBW02_APP_ID = new String[] {""} ;
      BC000U3_A41TBW02_DISP_DATETIME = new String[] {""} ;
      BC000U3_A42TBW02_STUDY_ID = new long[1] ;
      BC000U3_A43TBW02_SUBJECT_ID = new int[1] ;
      BC000U3_A44TBW02_VISIT_NO = new int[1] ;
      BC000U3_A45TBW02_DOM_CD = new String[] {""} ;
      BC000U3_A46TBW02_REPEAT_KEY = new short[1] ;
      BC000U3_A47TBW02_ORDER = new int[1] ;
      BC000U3_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      BC000U3_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      BC000U3_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      BC000U3_A497TBW02_CRF_VALUE = new String[] {""} ;
      BC000U3_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      sMode29 = "" ;
      BC000U2_A39TBW02_SESSION_ID = new String[] {""} ;
      BC000U2_A40TBW02_APP_ID = new String[] {""} ;
      BC000U2_A41TBW02_DISP_DATETIME = new String[] {""} ;
      BC000U2_A42TBW02_STUDY_ID = new long[1] ;
      BC000U2_A43TBW02_SUBJECT_ID = new int[1] ;
      BC000U2_A44TBW02_VISIT_NO = new int[1] ;
      BC000U2_A45TBW02_DOM_CD = new String[] {""} ;
      BC000U2_A46TBW02_REPEAT_KEY = new short[1] ;
      BC000U2_A47TBW02_ORDER = new int[1] ;
      BC000U2_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      BC000U2_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      BC000U2_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      BC000U2_A497TBW02_CRF_VALUE = new String[] {""} ;
      BC000U2_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      BC000U9_A39TBW02_SESSION_ID = new String[] {""} ;
      BC000U9_A40TBW02_APP_ID = new String[] {""} ;
      BC000U9_A41TBW02_DISP_DATETIME = new String[] {""} ;
      BC000U9_A42TBW02_STUDY_ID = new long[1] ;
      BC000U9_A43TBW02_SUBJECT_ID = new int[1] ;
      BC000U9_A44TBW02_VISIT_NO = new int[1] ;
      BC000U9_A45TBW02_DOM_CD = new String[] {""} ;
      BC000U9_A46TBW02_REPEAT_KEY = new short[1] ;
      BC000U9_A47TBW02_ORDER = new int[1] ;
      BC000U9_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      BC000U9_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      BC000U9_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      BC000U9_A497TBW02_CRF_VALUE = new String[] {""} ;
      BC000U9_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw02_odm_work_bc__default(),
         new Object[] {
             new Object[] {
            BC000U2_A39TBW02_SESSION_ID, BC000U2_A40TBW02_APP_ID, BC000U2_A41TBW02_DISP_DATETIME, BC000U2_A42TBW02_STUDY_ID, BC000U2_A43TBW02_SUBJECT_ID, BC000U2_A44TBW02_VISIT_NO, BC000U2_A45TBW02_DOM_CD, BC000U2_A46TBW02_REPEAT_KEY, BC000U2_A47TBW02_ORDER, BC000U2_A48TBW02_DOM_VAR_NM,
            BC000U2_A496TBW02_CRF_ITEM_CD, BC000U2_n496TBW02_CRF_ITEM_CD, BC000U2_A497TBW02_CRF_VALUE, BC000U2_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            BC000U3_A39TBW02_SESSION_ID, BC000U3_A40TBW02_APP_ID, BC000U3_A41TBW02_DISP_DATETIME, BC000U3_A42TBW02_STUDY_ID, BC000U3_A43TBW02_SUBJECT_ID, BC000U3_A44TBW02_VISIT_NO, BC000U3_A45TBW02_DOM_CD, BC000U3_A46TBW02_REPEAT_KEY, BC000U3_A47TBW02_ORDER, BC000U3_A48TBW02_DOM_VAR_NM,
            BC000U3_A496TBW02_CRF_ITEM_CD, BC000U3_n496TBW02_CRF_ITEM_CD, BC000U3_A497TBW02_CRF_VALUE, BC000U3_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            BC000U4_A39TBW02_SESSION_ID, BC000U4_A40TBW02_APP_ID, BC000U4_A41TBW02_DISP_DATETIME, BC000U4_A42TBW02_STUDY_ID, BC000U4_A43TBW02_SUBJECT_ID, BC000U4_A44TBW02_VISIT_NO, BC000U4_A45TBW02_DOM_CD, BC000U4_A46TBW02_REPEAT_KEY, BC000U4_A47TBW02_ORDER, BC000U4_A48TBW02_DOM_VAR_NM,
            BC000U4_A496TBW02_CRF_ITEM_CD, BC000U4_n496TBW02_CRF_ITEM_CD, BC000U4_A497TBW02_CRF_VALUE, BC000U4_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            BC000U5_A39TBW02_SESSION_ID, BC000U5_A40TBW02_APP_ID, BC000U5_A41TBW02_DISP_DATETIME, BC000U5_A42TBW02_STUDY_ID, BC000U5_A43TBW02_SUBJECT_ID, BC000U5_A44TBW02_VISIT_NO, BC000U5_A45TBW02_DOM_CD, BC000U5_A46TBW02_REPEAT_KEY, BC000U5_A47TBW02_ORDER, BC000U5_A48TBW02_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000U9_A39TBW02_SESSION_ID, BC000U9_A40TBW02_APP_ID, BC000U9_A41TBW02_DISP_DATETIME, BC000U9_A42TBW02_STUDY_ID, BC000U9_A43TBW02_SUBJECT_ID, BC000U9_A44TBW02_VISIT_NO, BC000U9_A45TBW02_DOM_CD, BC000U9_A46TBW02_REPEAT_KEY, BC000U9_A47TBW02_ORDER, BC000U9_A48TBW02_DOM_VAR_NM,
            BC000U9_A496TBW02_CRF_ITEM_CD, BC000U9_n496TBW02_CRF_ITEM_CD, BC000U9_A497TBW02_CRF_VALUE, BC000U9_n497TBW02_CRF_VALUE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW02_ODM_WORK_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110U2 */
      e110U2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z46TBW02_REPEAT_KEY ;
   private short A46TBW02_REPEAT_KEY ;
   private short RcdFound29 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z43TBW02_SUBJECT_ID ;
   private int A43TBW02_SUBJECT_ID ;
   private int Z44TBW02_VISIT_NO ;
   private int A44TBW02_VISIT_NO ;
   private int Z47TBW02_ORDER ;
   private int A47TBW02_ORDER ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z42TBW02_STUDY_ID ;
   private long A42TBW02_STUDY_ID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode29 ;
   private String Gx_emsg ;
   private boolean n496TBW02_CRF_ITEM_CD ;
   private boolean n497TBW02_CRF_VALUE ;
   private String Z39TBW02_SESSION_ID ;
   private String A39TBW02_SESSION_ID ;
   private String Z40TBW02_APP_ID ;
   private String A40TBW02_APP_ID ;
   private String Z41TBW02_DISP_DATETIME ;
   private String A41TBW02_DISP_DATETIME ;
   private String Z45TBW02_DOM_CD ;
   private String A45TBW02_DOM_CD ;
   private String Z48TBW02_DOM_VAR_NM ;
   private String A48TBW02_DOM_VAR_NM ;
   private String AV7W_BC_FLG ;
   private String Z496TBW02_CRF_ITEM_CD ;
   private String A496TBW02_CRF_ITEM_CD ;
   private String Z497TBW02_CRF_VALUE ;
   private String A497TBW02_CRF_VALUE ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW02_ODM_WORK bcTBW02_ODM_WORK ;
   private IDataStoreProvider pr_default ;
   private String[] BC000U4_A39TBW02_SESSION_ID ;
   private String[] BC000U4_A40TBW02_APP_ID ;
   private String[] BC000U4_A41TBW02_DISP_DATETIME ;
   private long[] BC000U4_A42TBW02_STUDY_ID ;
   private int[] BC000U4_A43TBW02_SUBJECT_ID ;
   private int[] BC000U4_A44TBW02_VISIT_NO ;
   private String[] BC000U4_A45TBW02_DOM_CD ;
   private short[] BC000U4_A46TBW02_REPEAT_KEY ;
   private int[] BC000U4_A47TBW02_ORDER ;
   private String[] BC000U4_A48TBW02_DOM_VAR_NM ;
   private String[] BC000U4_A496TBW02_CRF_ITEM_CD ;
   private boolean[] BC000U4_n496TBW02_CRF_ITEM_CD ;
   private String[] BC000U4_A497TBW02_CRF_VALUE ;
   private boolean[] BC000U4_n497TBW02_CRF_VALUE ;
   private String[] BC000U5_A39TBW02_SESSION_ID ;
   private String[] BC000U5_A40TBW02_APP_ID ;
   private String[] BC000U5_A41TBW02_DISP_DATETIME ;
   private long[] BC000U5_A42TBW02_STUDY_ID ;
   private int[] BC000U5_A43TBW02_SUBJECT_ID ;
   private int[] BC000U5_A44TBW02_VISIT_NO ;
   private String[] BC000U5_A45TBW02_DOM_CD ;
   private short[] BC000U5_A46TBW02_REPEAT_KEY ;
   private int[] BC000U5_A47TBW02_ORDER ;
   private String[] BC000U5_A48TBW02_DOM_VAR_NM ;
   private String[] BC000U3_A39TBW02_SESSION_ID ;
   private String[] BC000U3_A40TBW02_APP_ID ;
   private String[] BC000U3_A41TBW02_DISP_DATETIME ;
   private long[] BC000U3_A42TBW02_STUDY_ID ;
   private int[] BC000U3_A43TBW02_SUBJECT_ID ;
   private int[] BC000U3_A44TBW02_VISIT_NO ;
   private String[] BC000U3_A45TBW02_DOM_CD ;
   private short[] BC000U3_A46TBW02_REPEAT_KEY ;
   private int[] BC000U3_A47TBW02_ORDER ;
   private String[] BC000U3_A48TBW02_DOM_VAR_NM ;
   private String[] BC000U3_A496TBW02_CRF_ITEM_CD ;
   private boolean[] BC000U3_n496TBW02_CRF_ITEM_CD ;
   private String[] BC000U3_A497TBW02_CRF_VALUE ;
   private boolean[] BC000U3_n497TBW02_CRF_VALUE ;
   private String[] BC000U2_A39TBW02_SESSION_ID ;
   private String[] BC000U2_A40TBW02_APP_ID ;
   private String[] BC000U2_A41TBW02_DISP_DATETIME ;
   private long[] BC000U2_A42TBW02_STUDY_ID ;
   private int[] BC000U2_A43TBW02_SUBJECT_ID ;
   private int[] BC000U2_A44TBW02_VISIT_NO ;
   private String[] BC000U2_A45TBW02_DOM_CD ;
   private short[] BC000U2_A46TBW02_REPEAT_KEY ;
   private int[] BC000U2_A47TBW02_ORDER ;
   private String[] BC000U2_A48TBW02_DOM_VAR_NM ;
   private String[] BC000U2_A496TBW02_CRF_ITEM_CD ;
   private boolean[] BC000U2_n496TBW02_CRF_ITEM_CD ;
   private String[] BC000U2_A497TBW02_CRF_VALUE ;
   private boolean[] BC000U2_n497TBW02_CRF_VALUE ;
   private String[] BC000U9_A39TBW02_SESSION_ID ;
   private String[] BC000U9_A40TBW02_APP_ID ;
   private String[] BC000U9_A41TBW02_DISP_DATETIME ;
   private long[] BC000U9_A42TBW02_STUDY_ID ;
   private int[] BC000U9_A43TBW02_SUBJECT_ID ;
   private int[] BC000U9_A44TBW02_VISIT_NO ;
   private String[] BC000U9_A45TBW02_DOM_CD ;
   private short[] BC000U9_A46TBW02_REPEAT_KEY ;
   private int[] BC000U9_A47TBW02_ORDER ;
   private String[] BC000U9_A48TBW02_DOM_VAR_NM ;
   private String[] BC000U9_A496TBW02_CRF_ITEM_CD ;
   private boolean[] BC000U9_n496TBW02_CRF_ITEM_CD ;
   private String[] BC000U9_A497TBW02_CRF_VALUE ;
   private boolean[] BC000U9_n497TBW02_CRF_VALUE ;
}

final  class tbw02_odm_work_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000U2", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000U3", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000U4", "SELECT TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM`, TM1.`TBW02_CRF_ITEM_CD`, TM1.`TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` TM1 WHERE TM1.`TBW02_SESSION_ID` = ? and TM1.`TBW02_APP_ID` = ? and TM1.`TBW02_DISP_DATETIME` = ? and TM1.`TBW02_STUDY_ID` = ? and TM1.`TBW02_SUBJECT_ID` = ? and TM1.`TBW02_VISIT_NO` = ? and TM1.`TBW02_DOM_CD` = ? and TM1.`TBW02_REPEAT_KEY` = ? and TM1.`TBW02_ORDER` = ? and TM1.`TBW02_DOM_VAR_NM` = ? ORDER BY TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000U5", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000U6", "INSERT INTO `TBW02_ODM_WORK`(`TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000U7", "UPDATE `TBW02_ODM_WORK` SET `TBW02_CRF_ITEM_CD`=?, `TBW02_CRF_VALUE`=?  WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000U8", "DELETE FROM `TBW02_ODM_WORK`  WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000U9", "SELECT TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM`, TM1.`TBW02_CRF_ITEM_CD`, TM1.`TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` TM1 WHERE TM1.`TBW02_SESSION_ID` = ? and TM1.`TBW02_APP_ID` = ? and TM1.`TBW02_DISP_DATETIME` = ? and TM1.`TBW02_STUDY_ID` = ? and TM1.`TBW02_SUBJECT_ID` = ? and TM1.`TBW02_VISIT_NO` = ? and TM1.`TBW02_DOM_CD` = ? and TM1.`TBW02_REPEAT_KEY` = ? and TM1.`TBW02_ORDER` = ? and TM1.`TBW02_DOM_VAR_NM` = ? ORDER BY TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[13], 2000);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 50);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2000);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setVarchar(9, (String)parms[10], 16, false);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setInt(11, ((Number) parms[12]).intValue());
               stmt.setVarchar(12, (String)parms[13], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
      }
   }

}

