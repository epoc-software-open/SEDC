/*
               File: tbw06_crf_memo_bc
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:10.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw06_crf_memo_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw06_crf_memo_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw06_crf_memo_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw06_crf_memo_bc.class ));
   }

   public tbw06_crf_memo_bc( int remoteHandle ,
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
            Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
            Z699TBW06_APP_ID = A699TBW06_APP_ID ;
            Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
            Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
            Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
            Z703TBW06_INS_NO = A703TBW06_INS_NO ;
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

   public void confirm_190( )
   {
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1944( ) ;
         }
         else
         {
            checkExtendedTable1944( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1944( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11192( )
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

   public void zm1944( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z704TBW06_CRF_ID = A704TBW06_CRF_ID ;
         Z705TBW06_CRF_VERSION = A705TBW06_CRF_VERSION ;
         Z706TBW06_MEMO = A706TBW06_MEMO ;
         Z707TBW06_STYDY_AUTH_CD = A707TBW06_STYDY_AUTH_CD ;
         Z708TBW06_REQUEST_USER_ID = A708TBW06_REQUEST_USER_ID ;
         Z709TBW06_EDIT_REQUEST_FLG = A709TBW06_EDIT_REQUEST_FLG ;
         Z710TBW06_EDIT_REQUEST_END_FLG = A710TBW06_EDIT_REQUEST_END_FLG ;
         Z711TBW06_EDIT_REQ_END_DATETIME = A711TBW06_EDIT_REQ_END_DATETIME ;
         Z712TBW06_EDIT_REQUEST_END_USER_ID = A712TBW06_EDIT_REQUEST_END_USER_ID ;
         Z713TBW06_PROC_DIV = A713TBW06_PROC_DIV ;
      }
      if ( GX_JID == -2 )
      {
         Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
         Z699TBW06_APP_ID = A699TBW06_APP_ID ;
         Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
         Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
         Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
         Z703TBW06_INS_NO = A703TBW06_INS_NO ;
         Z704TBW06_CRF_ID = A704TBW06_CRF_ID ;
         Z705TBW06_CRF_VERSION = A705TBW06_CRF_VERSION ;
         Z706TBW06_MEMO = A706TBW06_MEMO ;
         Z707TBW06_STYDY_AUTH_CD = A707TBW06_STYDY_AUTH_CD ;
         Z708TBW06_REQUEST_USER_ID = A708TBW06_REQUEST_USER_ID ;
         Z709TBW06_EDIT_REQUEST_FLG = A709TBW06_EDIT_REQUEST_FLG ;
         Z710TBW06_EDIT_REQUEST_END_FLG = A710TBW06_EDIT_REQUEST_END_FLG ;
         Z711TBW06_EDIT_REQ_END_DATETIME = A711TBW06_EDIT_REQ_END_DATETIME ;
         Z712TBW06_EDIT_REQUEST_END_USER_ID = A712TBW06_EDIT_REQUEST_END_USER_ID ;
         Z713TBW06_PROC_DIV = A713TBW06_PROC_DIV ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1944( )
   {
      /* Using cursor BC00194 */
      pr_default.execute(2, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A704TBW06_CRF_ID = BC00194_A704TBW06_CRF_ID[0] ;
         n704TBW06_CRF_ID = BC00194_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = BC00194_A705TBW06_CRF_VERSION[0] ;
         n705TBW06_CRF_VERSION = BC00194_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = BC00194_A706TBW06_MEMO[0] ;
         n706TBW06_MEMO = BC00194_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = BC00194_A707TBW06_STYDY_AUTH_CD[0] ;
         n707TBW06_STYDY_AUTH_CD = BC00194_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = BC00194_A708TBW06_REQUEST_USER_ID[0] ;
         n708TBW06_REQUEST_USER_ID = BC00194_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = BC00194_A709TBW06_EDIT_REQUEST_FLG[0] ;
         n709TBW06_EDIT_REQUEST_FLG = BC00194_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = BC00194_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         n710TBW06_EDIT_REQUEST_END_FLG = BC00194_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = BC00194_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         n711TBW06_EDIT_REQ_END_DATETIME = BC00194_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = BC00194_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         n712TBW06_EDIT_REQUEST_END_USER_ID = BC00194_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = BC00194_A713TBW06_PROC_DIV[0] ;
         n713TBW06_PROC_DIV = BC00194_n713TBW06_PROC_DIV[0] ;
         zm1944( -2) ;
      }
      pr_default.close(2);
      onLoadActions1944( ) ;
   }

   public void onLoadActions1944( )
   {
      AV8Pgmname = "TBW06_CRF_MEMO_BC" ;
   }

   public void checkExtendedTable1944( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW06_CRF_MEMO_BC" ;
      if ( ! ( GXutil.nullDate().equals(A711TBW06_EDIT_REQ_END_DATETIME) || (( A711TBW06_EDIT_REQ_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A711TBW06_EDIT_REQ_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　クエリー依頼完了フラグ操作日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1944( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1944( )
   {
      /* Using cursor BC00195 */
      pr_default.execute(3, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00193 */
      pr_default.execute(1, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1944( 2) ;
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = BC00193_A698TBW06_SESSION_ID[0] ;
         A699TBW06_APP_ID = BC00193_A699TBW06_APP_ID[0] ;
         A700TBW06_DISP_DATETIME = BC00193_A700TBW06_DISP_DATETIME[0] ;
         A701TBW06_STUDY_ID = BC00193_A701TBW06_STUDY_ID[0] ;
         A702TBW06_SUBJECT_ID = BC00193_A702TBW06_SUBJECT_ID[0] ;
         A703TBW06_INS_NO = BC00193_A703TBW06_INS_NO[0] ;
         A704TBW06_CRF_ID = BC00193_A704TBW06_CRF_ID[0] ;
         n704TBW06_CRF_ID = BC00193_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = BC00193_A705TBW06_CRF_VERSION[0] ;
         n705TBW06_CRF_VERSION = BC00193_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = BC00193_A706TBW06_MEMO[0] ;
         n706TBW06_MEMO = BC00193_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = BC00193_A707TBW06_STYDY_AUTH_CD[0] ;
         n707TBW06_STYDY_AUTH_CD = BC00193_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = BC00193_A708TBW06_REQUEST_USER_ID[0] ;
         n708TBW06_REQUEST_USER_ID = BC00193_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = BC00193_A709TBW06_EDIT_REQUEST_FLG[0] ;
         n709TBW06_EDIT_REQUEST_FLG = BC00193_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = BC00193_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         n710TBW06_EDIT_REQUEST_END_FLG = BC00193_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = BC00193_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         n711TBW06_EDIT_REQ_END_DATETIME = BC00193_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = BC00193_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         n712TBW06_EDIT_REQUEST_END_USER_ID = BC00193_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = BC00193_A713TBW06_PROC_DIV[0] ;
         n713TBW06_PROC_DIV = BC00193_n713TBW06_PROC_DIV[0] ;
         Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
         Z699TBW06_APP_ID = A699TBW06_APP_ID ;
         Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
         Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
         Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
         Z703TBW06_INS_NO = A703TBW06_INS_NO ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1944( ) ;
         Gx_mode = sMode44 ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey1944( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode44 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1944( ) ;
      if ( RcdFound44 == 0 )
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
      confirm_190( ) ;
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

   public void checkOptimisticConcurrency1944( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00192 */
         pr_default.execute(0, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW06_CRF_MEMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z704TBW06_CRF_ID != BC00192_A704TBW06_CRF_ID[0] ) || ( Z705TBW06_CRF_VERSION != BC00192_A705TBW06_CRF_VERSION[0] ) || ( GXutil.strcmp(Z706TBW06_MEMO, BC00192_A706TBW06_MEMO[0]) != 0 ) || ( GXutil.strcmp(Z707TBW06_STYDY_AUTH_CD, BC00192_A707TBW06_STYDY_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z708TBW06_REQUEST_USER_ID, BC00192_A708TBW06_REQUEST_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z709TBW06_EDIT_REQUEST_FLG, BC00192_A709TBW06_EDIT_REQUEST_FLG[0]) != 0 ) || ( GXutil.strcmp(Z710TBW06_EDIT_REQUEST_END_FLG, BC00192_A710TBW06_EDIT_REQUEST_END_FLG[0]) != 0 ) || !( Z711TBW06_EDIT_REQ_END_DATETIME.equals( BC00192_A711TBW06_EDIT_REQ_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z712TBW06_EDIT_REQUEST_END_USER_ID, BC00192_A712TBW06_EDIT_REQUEST_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z713TBW06_PROC_DIV, BC00192_A713TBW06_PROC_DIV[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW06_CRF_MEMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1944( )
   {
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1944( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1944( 0) ;
         checkOptimisticConcurrency1944( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1944( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1944( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00196 */
                  pr_default.execute(4, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO), new Boolean(n704TBW06_CRF_ID), new Short(A704TBW06_CRF_ID), new Boolean(n705TBW06_CRF_VERSION), new Short(A705TBW06_CRF_VERSION), new Boolean(n706TBW06_MEMO), A706TBW06_MEMO, new Boolean(n707TBW06_STYDY_AUTH_CD), A707TBW06_STYDY_AUTH_CD, new Boolean(n708TBW06_REQUEST_USER_ID), A708TBW06_REQUEST_USER_ID, new Boolean(n709TBW06_EDIT_REQUEST_FLG), A709TBW06_EDIT_REQUEST_FLG, new Boolean(n710TBW06_EDIT_REQUEST_END_FLG), A710TBW06_EDIT_REQUEST_END_FLG, new Boolean(n711TBW06_EDIT_REQ_END_DATETIME), A711TBW06_EDIT_REQ_END_DATETIME, new Boolean(n712TBW06_EDIT_REQUEST_END_USER_ID), A712TBW06_EDIT_REQUEST_END_USER_ID, new Boolean(n713TBW06_PROC_DIV), A713TBW06_PROC_DIV});
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
            load1944( ) ;
         }
         endLevel1944( ) ;
      }
      closeExtendedTableCursors1944( ) ;
   }

   public void update1944( )
   {
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1944( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1944( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1944( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1944( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00197 */
                  pr_default.execute(5, new Object[] {new Boolean(n704TBW06_CRF_ID), new Short(A704TBW06_CRF_ID), new Boolean(n705TBW06_CRF_VERSION), new Short(A705TBW06_CRF_VERSION), new Boolean(n706TBW06_MEMO), A706TBW06_MEMO, new Boolean(n707TBW06_STYDY_AUTH_CD), A707TBW06_STYDY_AUTH_CD, new Boolean(n708TBW06_REQUEST_USER_ID), A708TBW06_REQUEST_USER_ID, new Boolean(n709TBW06_EDIT_REQUEST_FLG), A709TBW06_EDIT_REQUEST_FLG, new Boolean(n710TBW06_EDIT_REQUEST_END_FLG), A710TBW06_EDIT_REQUEST_END_FLG, new Boolean(n711TBW06_EDIT_REQ_END_DATETIME), A711TBW06_EDIT_REQ_END_DATETIME, new Boolean(n712TBW06_EDIT_REQUEST_END_USER_ID), A712TBW06_EDIT_REQUEST_END_USER_ID, new Boolean(n713TBW06_PROC_DIV), A713TBW06_PROC_DIV, A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW06_CRF_MEMO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1944( ) ;
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
         endLevel1944( ) ;
      }
      closeExtendedTableCursors1944( ) ;
   }

   public void deferredUpdate1944( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1944( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1944( ) ;
         afterConfirm1944( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1944( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00198 */
               pr_default.execute(6, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1944( ) ;
      Gx_mode = sMode44 ;
   }

   public void onDeleteControls1944( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW06_CRF_MEMO_BC" ;
      }
   }

   public void endLevel1944( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1944( ) ;
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

   public void scanKeyStart1944( )
   {
      /* Using cursor BC00199 */
      pr_default.execute(7, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = BC00199_A698TBW06_SESSION_ID[0] ;
         A699TBW06_APP_ID = BC00199_A699TBW06_APP_ID[0] ;
         A700TBW06_DISP_DATETIME = BC00199_A700TBW06_DISP_DATETIME[0] ;
         A701TBW06_STUDY_ID = BC00199_A701TBW06_STUDY_ID[0] ;
         A702TBW06_SUBJECT_ID = BC00199_A702TBW06_SUBJECT_ID[0] ;
         A703TBW06_INS_NO = BC00199_A703TBW06_INS_NO[0] ;
         A704TBW06_CRF_ID = BC00199_A704TBW06_CRF_ID[0] ;
         n704TBW06_CRF_ID = BC00199_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = BC00199_A705TBW06_CRF_VERSION[0] ;
         n705TBW06_CRF_VERSION = BC00199_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = BC00199_A706TBW06_MEMO[0] ;
         n706TBW06_MEMO = BC00199_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = BC00199_A707TBW06_STYDY_AUTH_CD[0] ;
         n707TBW06_STYDY_AUTH_CD = BC00199_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = BC00199_A708TBW06_REQUEST_USER_ID[0] ;
         n708TBW06_REQUEST_USER_ID = BC00199_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = BC00199_A709TBW06_EDIT_REQUEST_FLG[0] ;
         n709TBW06_EDIT_REQUEST_FLG = BC00199_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = BC00199_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         n710TBW06_EDIT_REQUEST_END_FLG = BC00199_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = BC00199_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         n711TBW06_EDIT_REQ_END_DATETIME = BC00199_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = BC00199_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         n712TBW06_EDIT_REQUEST_END_USER_ID = BC00199_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = BC00199_A713TBW06_PROC_DIV[0] ;
         n713TBW06_PROC_DIV = BC00199_n713TBW06_PROC_DIV[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1944( )
   {
      pr_default.readNext(7);
      RcdFound44 = (short)(0) ;
      scanKeyLoad1944( ) ;
   }

   public void scanKeyLoad1944( )
   {
      sMode44 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = BC00199_A698TBW06_SESSION_ID[0] ;
         A699TBW06_APP_ID = BC00199_A699TBW06_APP_ID[0] ;
         A700TBW06_DISP_DATETIME = BC00199_A700TBW06_DISP_DATETIME[0] ;
         A701TBW06_STUDY_ID = BC00199_A701TBW06_STUDY_ID[0] ;
         A702TBW06_SUBJECT_ID = BC00199_A702TBW06_SUBJECT_ID[0] ;
         A703TBW06_INS_NO = BC00199_A703TBW06_INS_NO[0] ;
         A704TBW06_CRF_ID = BC00199_A704TBW06_CRF_ID[0] ;
         n704TBW06_CRF_ID = BC00199_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = BC00199_A705TBW06_CRF_VERSION[0] ;
         n705TBW06_CRF_VERSION = BC00199_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = BC00199_A706TBW06_MEMO[0] ;
         n706TBW06_MEMO = BC00199_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = BC00199_A707TBW06_STYDY_AUTH_CD[0] ;
         n707TBW06_STYDY_AUTH_CD = BC00199_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = BC00199_A708TBW06_REQUEST_USER_ID[0] ;
         n708TBW06_REQUEST_USER_ID = BC00199_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = BC00199_A709TBW06_EDIT_REQUEST_FLG[0] ;
         n709TBW06_EDIT_REQUEST_FLG = BC00199_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = BC00199_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         n710TBW06_EDIT_REQUEST_END_FLG = BC00199_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = BC00199_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         n711TBW06_EDIT_REQ_END_DATETIME = BC00199_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = BC00199_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         n712TBW06_EDIT_REQUEST_END_USER_ID = BC00199_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = BC00199_A713TBW06_PROC_DIV[0] ;
         n713TBW06_PROC_DIV = BC00199_n713TBW06_PROC_DIV[0] ;
      }
      Gx_mode = sMode44 ;
   }

   public void scanKeyEnd1944( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1944( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1944( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1944( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1944( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1944( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1944( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1944( )
   {
   }

   public void addRow1944( )
   {
      VarsToRow44( bcTBW06_CRF_MEMO) ;
   }

   public void readRow1944( )
   {
      RowToVars44( bcTBW06_CRF_MEMO, 1) ;
   }

   public void initializeNonKey1944( )
   {
      A704TBW06_CRF_ID = (short)(0) ;
      n704TBW06_CRF_ID = false ;
      A705TBW06_CRF_VERSION = (short)(0) ;
      n705TBW06_CRF_VERSION = false ;
      A706TBW06_MEMO = "" ;
      n706TBW06_MEMO = false ;
      A707TBW06_STYDY_AUTH_CD = "" ;
      n707TBW06_STYDY_AUTH_CD = false ;
      A708TBW06_REQUEST_USER_ID = "" ;
      n708TBW06_REQUEST_USER_ID = false ;
      A709TBW06_EDIT_REQUEST_FLG = "" ;
      n709TBW06_EDIT_REQUEST_FLG = false ;
      A710TBW06_EDIT_REQUEST_END_FLG = "" ;
      n710TBW06_EDIT_REQUEST_END_FLG = false ;
      A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n711TBW06_EDIT_REQ_END_DATETIME = false ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
      A713TBW06_PROC_DIV = "" ;
      n713TBW06_PROC_DIV = false ;
   }

   public void initAll1944( )
   {
      A698TBW06_SESSION_ID = "" ;
      A699TBW06_APP_ID = "" ;
      A700TBW06_DISP_DATETIME = "" ;
      A701TBW06_STUDY_ID = 0 ;
      A702TBW06_SUBJECT_ID = 0 ;
      A703TBW06_INS_NO = (short)(0) ;
      initializeNonKey1944( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow44( SdtTBW06_CRF_MEMO obj44 )
   {
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Mode( Gx_mode );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id( A704TBW06_CRF_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version( A705TBW06_CRF_VERSION );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo( A706TBW06_MEMO );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd( A707TBW06_STYDY_AUTH_CD );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id( A708TBW06_REQUEST_USER_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg( A709TBW06_EDIT_REQUEST_FLG );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg( A710TBW06_EDIT_REQUEST_END_FLG );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime( A711TBW06_EDIT_REQ_END_DATETIME );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id( A712TBW06_EDIT_REQUEST_END_USER_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div( A713TBW06_PROC_DIV );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id( A698TBW06_SESSION_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id( A699TBW06_APP_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime( A700TBW06_DISP_DATETIME );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id( A701TBW06_STUDY_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id( A702TBW06_SUBJECT_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no( A703TBW06_INS_NO );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z( Z698TBW06_SESSION_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z( Z699TBW06_APP_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z( Z700TBW06_DISP_DATETIME );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z( Z701TBW06_STUDY_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z( Z702TBW06_SUBJECT_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z( Z703TBW06_INS_NO );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z( Z704TBW06_CRF_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z( Z705TBW06_CRF_VERSION );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z( Z706TBW06_MEMO );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z( Z707TBW06_STYDY_AUTH_CD );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z( Z708TBW06_REQUEST_USER_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z( Z709TBW06_EDIT_REQUEST_FLG );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z( Z710TBW06_EDIT_REQUEST_END_FLG );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z( Z711TBW06_EDIT_REQ_END_DATETIME );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z( Z712TBW06_EDIT_REQUEST_END_USER_ID );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z( Z713TBW06_PROC_DIV );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N( (byte)((byte)((n704TBW06_CRF_ID)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N( (byte)((byte)((n705TBW06_CRF_VERSION)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N( (byte)((byte)((n706TBW06_MEMO)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N( (byte)((byte)((n707TBW06_STYDY_AUTH_CD)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N( (byte)((byte)((n708TBW06_REQUEST_USER_ID)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N( (byte)((byte)((n709TBW06_EDIT_REQUEST_FLG)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N( (byte)((byte)((n710TBW06_EDIT_REQUEST_END_FLG)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N( (byte)((byte)((n711TBW06_EDIT_REQ_END_DATETIME)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N( (byte)((byte)((n712TBW06_EDIT_REQUEST_END_USER_ID)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N( (byte)((byte)((n713TBW06_PROC_DIV)?1:0)) );
      obj44.setgxTv_SdtTBW06_CRF_MEMO_Mode( Gx_mode );
   }

   public void RowToVars44( SdtTBW06_CRF_MEMO obj44 ,
                            int forceLoad )
   {
      Gx_mode = obj44.getgxTv_SdtTBW06_CRF_MEMO_Mode() ;
      A704TBW06_CRF_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id() ;
      n704TBW06_CRF_ID = false ;
      A705TBW06_CRF_VERSION = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version() ;
      n705TBW06_CRF_VERSION = false ;
      A706TBW06_MEMO = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo() ;
      n706TBW06_MEMO = false ;
      A707TBW06_STYDY_AUTH_CD = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd() ;
      n707TBW06_STYDY_AUTH_CD = false ;
      A708TBW06_REQUEST_USER_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id() ;
      n708TBW06_REQUEST_USER_ID = false ;
      A709TBW06_EDIT_REQUEST_FLG = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg() ;
      n709TBW06_EDIT_REQUEST_FLG = false ;
      A710TBW06_EDIT_REQUEST_END_FLG = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg() ;
      n710TBW06_EDIT_REQUEST_END_FLG = false ;
      A711TBW06_EDIT_REQ_END_DATETIME = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime() ;
      n711TBW06_EDIT_REQ_END_DATETIME = false ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id() ;
      n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
      A713TBW06_PROC_DIV = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div() ;
      n713TBW06_PROC_DIV = false ;
      A698TBW06_SESSION_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id() ;
      A699TBW06_APP_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id() ;
      A700TBW06_DISP_DATETIME = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime() ;
      A701TBW06_STUDY_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id() ;
      A702TBW06_SUBJECT_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id() ;
      A703TBW06_INS_NO = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no() ;
      Z698TBW06_SESSION_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z() ;
      Z699TBW06_APP_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z() ;
      Z700TBW06_DISP_DATETIME = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z() ;
      Z701TBW06_STUDY_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z() ;
      Z702TBW06_SUBJECT_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z() ;
      Z703TBW06_INS_NO = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z() ;
      Z704TBW06_CRF_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z() ;
      Z705TBW06_CRF_VERSION = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z() ;
      Z706TBW06_MEMO = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z() ;
      Z707TBW06_STYDY_AUTH_CD = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z() ;
      Z708TBW06_REQUEST_USER_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z() ;
      Z709TBW06_EDIT_REQUEST_FLG = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z() ;
      Z710TBW06_EDIT_REQUEST_END_FLG = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z() ;
      Z711TBW06_EDIT_REQ_END_DATETIME = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z() ;
      Z712TBW06_EDIT_REQUEST_END_USER_ID = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z() ;
      Z713TBW06_PROC_DIV = obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z() ;
      n704TBW06_CRF_ID = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N()==0)?false:true) ;
      n705TBW06_CRF_VERSION = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N()==0)?false:true) ;
      n706TBW06_MEMO = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N()==0)?false:true) ;
      n707TBW06_STYDY_AUTH_CD = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N()==0)?false:true) ;
      n708TBW06_REQUEST_USER_ID = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N()==0)?false:true) ;
      n709TBW06_EDIT_REQUEST_FLG = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N()==0)?false:true) ;
      n710TBW06_EDIT_REQUEST_END_FLG = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N()==0)?false:true) ;
      n711TBW06_EDIT_REQ_END_DATETIME = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N()==0)?false:true) ;
      n712TBW06_EDIT_REQUEST_END_USER_ID = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N()==0)?false:true) ;
      n713TBW06_PROC_DIV = (boolean)((obj44.getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N()==0)?false:true) ;
      Gx_mode = obj44.getgxTv_SdtTBW06_CRF_MEMO_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A698TBW06_SESSION_ID = (String)getParm(obj,0) ;
      A699TBW06_APP_ID = (String)getParm(obj,1) ;
      A700TBW06_DISP_DATETIME = (String)getParm(obj,2) ;
      A701TBW06_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A702TBW06_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A703TBW06_INS_NO = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1944( ) ;
      scanKeyStart1944( ) ;
      if ( RcdFound44 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
         Z699TBW06_APP_ID = A699TBW06_APP_ID ;
         Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
         Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
         Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
         Z703TBW06_INS_NO = A703TBW06_INS_NO ;
      }
      zm1944( -2) ;
      sMode44 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1944( ) ;
      Gx_mode = sMode44 ;
      addRow1944( ) ;
      scanKeyEnd1944( ) ;
      if ( RcdFound44 == 0 )
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
      RowToVars44( bcTBW06_CRF_MEMO, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1944( ) ;
      if ( RcdFound44 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
         {
            A698TBW06_SESSION_ID = Z698TBW06_SESSION_ID ;
            A699TBW06_APP_ID = Z699TBW06_APP_ID ;
            A700TBW06_DISP_DATETIME = Z700TBW06_DISP_DATETIME ;
            A701TBW06_STUDY_ID = Z701TBW06_STUDY_ID ;
            A702TBW06_SUBJECT_ID = Z702TBW06_SUBJECT_ID ;
            A703TBW06_INS_NO = Z703TBW06_INS_NO ;
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
            update1944( ) ;
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
            if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
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
                  insert1944( ) ;
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
                  insert1944( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow44( bcTBW06_CRF_MEMO) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars44( bcTBW06_CRF_MEMO, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1944( ) ;
      if ( RcdFound44 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
         {
            A698TBW06_SESSION_ID = Z698TBW06_SESSION_ID ;
            A699TBW06_APP_ID = Z699TBW06_APP_ID ;
            A700TBW06_DISP_DATETIME = Z700TBW06_DISP_DATETIME ;
            A701TBW06_STUDY_ID = Z701TBW06_STUDY_ID ;
            A702TBW06_SUBJECT_ID = Z702TBW06_SUBJECT_ID ;
            A703TBW06_INS_NO = Z703TBW06_INS_NO ;
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
         if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw06_crf_memo_bc");
      VarsToRow44( bcTBW06_CRF_MEMO) ;
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
      Gx_mode = bcTBW06_CRF_MEMO.getgxTv_SdtTBW06_CRF_MEMO_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW06_CRF_MEMO.setgxTv_SdtTBW06_CRF_MEMO_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW06_CRF_MEMO sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW06_CRF_MEMO )
      {
         bcTBW06_CRF_MEMO = sdt ;
         if ( GXutil.strcmp(bcTBW06_CRF_MEMO.getgxTv_SdtTBW06_CRF_MEMO_Mode(), "") == 0 )
         {
            bcTBW06_CRF_MEMO.setgxTv_SdtTBW06_CRF_MEMO_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow44( bcTBW06_CRF_MEMO) ;
         }
         else
         {
            RowToVars44( bcTBW06_CRF_MEMO, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW06_CRF_MEMO.getgxTv_SdtTBW06_CRF_MEMO_Mode(), "") == 0 )
         {
            bcTBW06_CRF_MEMO.setgxTv_SdtTBW06_CRF_MEMO_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars44( bcTBW06_CRF_MEMO, 1) ;
   }

   public SdtTBW06_CRF_MEMO getTBW06_CRF_MEMO_BC( )
   {
      return bcTBW06_CRF_MEMO ;
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
      Z698TBW06_SESSION_ID = "" ;
      A698TBW06_SESSION_ID = "" ;
      Z699TBW06_APP_ID = "" ;
      A699TBW06_APP_ID = "" ;
      Z700TBW06_DISP_DATETIME = "" ;
      A700TBW06_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = "" ;
      Z706TBW06_MEMO = "" ;
      A706TBW06_MEMO = "" ;
      Z707TBW06_STYDY_AUTH_CD = "" ;
      A707TBW06_STYDY_AUTH_CD = "" ;
      Z708TBW06_REQUEST_USER_ID = "" ;
      A708TBW06_REQUEST_USER_ID = "" ;
      Z709TBW06_EDIT_REQUEST_FLG = "" ;
      A709TBW06_EDIT_REQUEST_FLG = "" ;
      Z710TBW06_EDIT_REQUEST_END_FLG = "" ;
      A710TBW06_EDIT_REQUEST_END_FLG = "" ;
      Z711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      Z713TBW06_PROC_DIV = "" ;
      A713TBW06_PROC_DIV = "" ;
      BC00194_A698TBW06_SESSION_ID = new String[] {""} ;
      BC00194_A699TBW06_APP_ID = new String[] {""} ;
      BC00194_A700TBW06_DISP_DATETIME = new String[] {""} ;
      BC00194_A701TBW06_STUDY_ID = new long[1] ;
      BC00194_A702TBW06_SUBJECT_ID = new int[1] ;
      BC00194_A703TBW06_INS_NO = new short[1] ;
      BC00194_A704TBW06_CRF_ID = new short[1] ;
      BC00194_n704TBW06_CRF_ID = new boolean[] {false} ;
      BC00194_A705TBW06_CRF_VERSION = new short[1] ;
      BC00194_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      BC00194_A706TBW06_MEMO = new String[] {""} ;
      BC00194_n706TBW06_MEMO = new boolean[] {false} ;
      BC00194_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      BC00194_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      BC00194_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      BC00194_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      BC00194_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      BC00194_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC00194_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      BC00194_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      BC00194_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00194_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      BC00194_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      BC00194_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      BC00194_A713TBW06_PROC_DIV = new String[] {""} ;
      BC00194_n713TBW06_PROC_DIV = new boolean[] {false} ;
      BC00195_A698TBW06_SESSION_ID = new String[] {""} ;
      BC00195_A699TBW06_APP_ID = new String[] {""} ;
      BC00195_A700TBW06_DISP_DATETIME = new String[] {""} ;
      BC00195_A701TBW06_STUDY_ID = new long[1] ;
      BC00195_A702TBW06_SUBJECT_ID = new int[1] ;
      BC00195_A703TBW06_INS_NO = new short[1] ;
      BC00193_A698TBW06_SESSION_ID = new String[] {""} ;
      BC00193_A699TBW06_APP_ID = new String[] {""} ;
      BC00193_A700TBW06_DISP_DATETIME = new String[] {""} ;
      BC00193_A701TBW06_STUDY_ID = new long[1] ;
      BC00193_A702TBW06_SUBJECT_ID = new int[1] ;
      BC00193_A703TBW06_INS_NO = new short[1] ;
      BC00193_A704TBW06_CRF_ID = new short[1] ;
      BC00193_n704TBW06_CRF_ID = new boolean[] {false} ;
      BC00193_A705TBW06_CRF_VERSION = new short[1] ;
      BC00193_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      BC00193_A706TBW06_MEMO = new String[] {""} ;
      BC00193_n706TBW06_MEMO = new boolean[] {false} ;
      BC00193_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      BC00193_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      BC00193_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      BC00193_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      BC00193_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      BC00193_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC00193_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      BC00193_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      BC00193_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00193_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      BC00193_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      BC00193_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      BC00193_A713TBW06_PROC_DIV = new String[] {""} ;
      BC00193_n713TBW06_PROC_DIV = new boolean[] {false} ;
      sMode44 = "" ;
      BC00192_A698TBW06_SESSION_ID = new String[] {""} ;
      BC00192_A699TBW06_APP_ID = new String[] {""} ;
      BC00192_A700TBW06_DISP_DATETIME = new String[] {""} ;
      BC00192_A701TBW06_STUDY_ID = new long[1] ;
      BC00192_A702TBW06_SUBJECT_ID = new int[1] ;
      BC00192_A703TBW06_INS_NO = new short[1] ;
      BC00192_A704TBW06_CRF_ID = new short[1] ;
      BC00192_n704TBW06_CRF_ID = new boolean[] {false} ;
      BC00192_A705TBW06_CRF_VERSION = new short[1] ;
      BC00192_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      BC00192_A706TBW06_MEMO = new String[] {""} ;
      BC00192_n706TBW06_MEMO = new boolean[] {false} ;
      BC00192_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      BC00192_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      BC00192_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      BC00192_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      BC00192_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      BC00192_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC00192_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      BC00192_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      BC00192_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00192_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      BC00192_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      BC00192_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      BC00192_A713TBW06_PROC_DIV = new String[] {""} ;
      BC00192_n713TBW06_PROC_DIV = new boolean[] {false} ;
      BC00199_A698TBW06_SESSION_ID = new String[] {""} ;
      BC00199_A699TBW06_APP_ID = new String[] {""} ;
      BC00199_A700TBW06_DISP_DATETIME = new String[] {""} ;
      BC00199_A701TBW06_STUDY_ID = new long[1] ;
      BC00199_A702TBW06_SUBJECT_ID = new int[1] ;
      BC00199_A703TBW06_INS_NO = new short[1] ;
      BC00199_A704TBW06_CRF_ID = new short[1] ;
      BC00199_n704TBW06_CRF_ID = new boolean[] {false} ;
      BC00199_A705TBW06_CRF_VERSION = new short[1] ;
      BC00199_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      BC00199_A706TBW06_MEMO = new String[] {""} ;
      BC00199_n706TBW06_MEMO = new boolean[] {false} ;
      BC00199_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      BC00199_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      BC00199_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      BC00199_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      BC00199_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      BC00199_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      BC00199_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      BC00199_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      BC00199_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00199_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      BC00199_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      BC00199_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      BC00199_A713TBW06_PROC_DIV = new String[] {""} ;
      BC00199_n713TBW06_PROC_DIV = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw06_crf_memo_bc__default(),
         new Object[] {
             new Object[] {
            BC00192_A698TBW06_SESSION_ID, BC00192_A699TBW06_APP_ID, BC00192_A700TBW06_DISP_DATETIME, BC00192_A701TBW06_STUDY_ID, BC00192_A702TBW06_SUBJECT_ID, BC00192_A703TBW06_INS_NO, BC00192_A704TBW06_CRF_ID, BC00192_n704TBW06_CRF_ID, BC00192_A705TBW06_CRF_VERSION, BC00192_n705TBW06_CRF_VERSION,
            BC00192_A706TBW06_MEMO, BC00192_n706TBW06_MEMO, BC00192_A707TBW06_STYDY_AUTH_CD, BC00192_n707TBW06_STYDY_AUTH_CD, BC00192_A708TBW06_REQUEST_USER_ID, BC00192_n708TBW06_REQUEST_USER_ID, BC00192_A709TBW06_EDIT_REQUEST_FLG, BC00192_n709TBW06_EDIT_REQUEST_FLG, BC00192_A710TBW06_EDIT_REQUEST_END_FLG, BC00192_n710TBW06_EDIT_REQUEST_END_FLG,
            BC00192_A711TBW06_EDIT_REQ_END_DATETIME, BC00192_n711TBW06_EDIT_REQ_END_DATETIME, BC00192_A712TBW06_EDIT_REQUEST_END_USER_ID, BC00192_n712TBW06_EDIT_REQUEST_END_USER_ID, BC00192_A713TBW06_PROC_DIV, BC00192_n713TBW06_PROC_DIV
            }
            , new Object[] {
            BC00193_A698TBW06_SESSION_ID, BC00193_A699TBW06_APP_ID, BC00193_A700TBW06_DISP_DATETIME, BC00193_A701TBW06_STUDY_ID, BC00193_A702TBW06_SUBJECT_ID, BC00193_A703TBW06_INS_NO, BC00193_A704TBW06_CRF_ID, BC00193_n704TBW06_CRF_ID, BC00193_A705TBW06_CRF_VERSION, BC00193_n705TBW06_CRF_VERSION,
            BC00193_A706TBW06_MEMO, BC00193_n706TBW06_MEMO, BC00193_A707TBW06_STYDY_AUTH_CD, BC00193_n707TBW06_STYDY_AUTH_CD, BC00193_A708TBW06_REQUEST_USER_ID, BC00193_n708TBW06_REQUEST_USER_ID, BC00193_A709TBW06_EDIT_REQUEST_FLG, BC00193_n709TBW06_EDIT_REQUEST_FLG, BC00193_A710TBW06_EDIT_REQUEST_END_FLG, BC00193_n710TBW06_EDIT_REQUEST_END_FLG,
            BC00193_A711TBW06_EDIT_REQ_END_DATETIME, BC00193_n711TBW06_EDIT_REQ_END_DATETIME, BC00193_A712TBW06_EDIT_REQUEST_END_USER_ID, BC00193_n712TBW06_EDIT_REQUEST_END_USER_ID, BC00193_A713TBW06_PROC_DIV, BC00193_n713TBW06_PROC_DIV
            }
            , new Object[] {
            BC00194_A698TBW06_SESSION_ID, BC00194_A699TBW06_APP_ID, BC00194_A700TBW06_DISP_DATETIME, BC00194_A701TBW06_STUDY_ID, BC00194_A702TBW06_SUBJECT_ID, BC00194_A703TBW06_INS_NO, BC00194_A704TBW06_CRF_ID, BC00194_n704TBW06_CRF_ID, BC00194_A705TBW06_CRF_VERSION, BC00194_n705TBW06_CRF_VERSION,
            BC00194_A706TBW06_MEMO, BC00194_n706TBW06_MEMO, BC00194_A707TBW06_STYDY_AUTH_CD, BC00194_n707TBW06_STYDY_AUTH_CD, BC00194_A708TBW06_REQUEST_USER_ID, BC00194_n708TBW06_REQUEST_USER_ID, BC00194_A709TBW06_EDIT_REQUEST_FLG, BC00194_n709TBW06_EDIT_REQUEST_FLG, BC00194_A710TBW06_EDIT_REQUEST_END_FLG, BC00194_n710TBW06_EDIT_REQUEST_END_FLG,
            BC00194_A711TBW06_EDIT_REQ_END_DATETIME, BC00194_n711TBW06_EDIT_REQ_END_DATETIME, BC00194_A712TBW06_EDIT_REQUEST_END_USER_ID, BC00194_n712TBW06_EDIT_REQUEST_END_USER_ID, BC00194_A713TBW06_PROC_DIV, BC00194_n713TBW06_PROC_DIV
            }
            , new Object[] {
            BC00195_A698TBW06_SESSION_ID, BC00195_A699TBW06_APP_ID, BC00195_A700TBW06_DISP_DATETIME, BC00195_A701TBW06_STUDY_ID, BC00195_A702TBW06_SUBJECT_ID, BC00195_A703TBW06_INS_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00199_A698TBW06_SESSION_ID, BC00199_A699TBW06_APP_ID, BC00199_A700TBW06_DISP_DATETIME, BC00199_A701TBW06_STUDY_ID, BC00199_A702TBW06_SUBJECT_ID, BC00199_A703TBW06_INS_NO, BC00199_A704TBW06_CRF_ID, BC00199_n704TBW06_CRF_ID, BC00199_A705TBW06_CRF_VERSION, BC00199_n705TBW06_CRF_VERSION,
            BC00199_A706TBW06_MEMO, BC00199_n706TBW06_MEMO, BC00199_A707TBW06_STYDY_AUTH_CD, BC00199_n707TBW06_STYDY_AUTH_CD, BC00199_A708TBW06_REQUEST_USER_ID, BC00199_n708TBW06_REQUEST_USER_ID, BC00199_A709TBW06_EDIT_REQUEST_FLG, BC00199_n709TBW06_EDIT_REQUEST_FLG, BC00199_A710TBW06_EDIT_REQUEST_END_FLG, BC00199_n710TBW06_EDIT_REQUEST_END_FLG,
            BC00199_A711TBW06_EDIT_REQ_END_DATETIME, BC00199_n711TBW06_EDIT_REQ_END_DATETIME, BC00199_A712TBW06_EDIT_REQUEST_END_USER_ID, BC00199_n712TBW06_EDIT_REQUEST_END_USER_ID, BC00199_A713TBW06_PROC_DIV, BC00199_n713TBW06_PROC_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW06_CRF_MEMO_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11192 */
      e11192 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z703TBW06_INS_NO ;
   private short A703TBW06_INS_NO ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z ;
   private short Z704TBW06_CRF_ID ;
   private short A704TBW06_CRF_ID ;
   private short Z705TBW06_CRF_VERSION ;
   private short A705TBW06_CRF_VERSION ;
   private short RcdFound44 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z702TBW06_SUBJECT_ID ;
   private int A702TBW06_SUBJECT_ID ;
   private int gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z701TBW06_STUDY_ID ;
   private long A701TBW06_STUDY_ID ;
   private long gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String sMode44 ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
   private java.util.Date Z711TBW06_EDIT_REQ_END_DATETIME ;
   private java.util.Date A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean n704TBW06_CRF_ID ;
   private boolean n705TBW06_CRF_VERSION ;
   private boolean n706TBW06_MEMO ;
   private boolean n707TBW06_STYDY_AUTH_CD ;
   private boolean n708TBW06_REQUEST_USER_ID ;
   private boolean n709TBW06_EDIT_REQUEST_FLG ;
   private boolean n710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean n711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean n713TBW06_PROC_DIV ;
   private boolean Gx_longc ;
   private String Z698TBW06_SESSION_ID ;
   private String A698TBW06_SESSION_ID ;
   private String Z699TBW06_APP_ID ;
   private String A699TBW06_APP_ID ;
   private String Z700TBW06_DISP_DATETIME ;
   private String A700TBW06_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z ;
   private String Z706TBW06_MEMO ;
   private String A706TBW06_MEMO ;
   private String Z707TBW06_STYDY_AUTH_CD ;
   private String A707TBW06_STYDY_AUTH_CD ;
   private String Z708TBW06_REQUEST_USER_ID ;
   private String A708TBW06_REQUEST_USER_ID ;
   private String Z709TBW06_EDIT_REQUEST_FLG ;
   private String A709TBW06_EDIT_REQUEST_FLG ;
   private String Z710TBW06_EDIT_REQUEST_END_FLG ;
   private String A710TBW06_EDIT_REQUEST_END_FLG ;
   private String Z712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String Z713TBW06_PROC_DIV ;
   private String A713TBW06_PROC_DIV ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW06_CRF_MEMO bcTBW06_CRF_MEMO ;
   private IDataStoreProvider pr_default ;
   private String[] BC00194_A698TBW06_SESSION_ID ;
   private String[] BC00194_A699TBW06_APP_ID ;
   private String[] BC00194_A700TBW06_DISP_DATETIME ;
   private long[] BC00194_A701TBW06_STUDY_ID ;
   private int[] BC00194_A702TBW06_SUBJECT_ID ;
   private short[] BC00194_A703TBW06_INS_NO ;
   private short[] BC00194_A704TBW06_CRF_ID ;
   private boolean[] BC00194_n704TBW06_CRF_ID ;
   private short[] BC00194_A705TBW06_CRF_VERSION ;
   private boolean[] BC00194_n705TBW06_CRF_VERSION ;
   private String[] BC00194_A706TBW06_MEMO ;
   private boolean[] BC00194_n706TBW06_MEMO ;
   private String[] BC00194_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] BC00194_n707TBW06_STYDY_AUTH_CD ;
   private String[] BC00194_A708TBW06_REQUEST_USER_ID ;
   private boolean[] BC00194_n708TBW06_REQUEST_USER_ID ;
   private String[] BC00194_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] BC00194_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] BC00194_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] BC00194_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] BC00194_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] BC00194_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] BC00194_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] BC00194_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] BC00194_A713TBW06_PROC_DIV ;
   private boolean[] BC00194_n713TBW06_PROC_DIV ;
   private String[] BC00195_A698TBW06_SESSION_ID ;
   private String[] BC00195_A699TBW06_APP_ID ;
   private String[] BC00195_A700TBW06_DISP_DATETIME ;
   private long[] BC00195_A701TBW06_STUDY_ID ;
   private int[] BC00195_A702TBW06_SUBJECT_ID ;
   private short[] BC00195_A703TBW06_INS_NO ;
   private String[] BC00193_A698TBW06_SESSION_ID ;
   private String[] BC00193_A699TBW06_APP_ID ;
   private String[] BC00193_A700TBW06_DISP_DATETIME ;
   private long[] BC00193_A701TBW06_STUDY_ID ;
   private int[] BC00193_A702TBW06_SUBJECT_ID ;
   private short[] BC00193_A703TBW06_INS_NO ;
   private short[] BC00193_A704TBW06_CRF_ID ;
   private boolean[] BC00193_n704TBW06_CRF_ID ;
   private short[] BC00193_A705TBW06_CRF_VERSION ;
   private boolean[] BC00193_n705TBW06_CRF_VERSION ;
   private String[] BC00193_A706TBW06_MEMO ;
   private boolean[] BC00193_n706TBW06_MEMO ;
   private String[] BC00193_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] BC00193_n707TBW06_STYDY_AUTH_CD ;
   private String[] BC00193_A708TBW06_REQUEST_USER_ID ;
   private boolean[] BC00193_n708TBW06_REQUEST_USER_ID ;
   private String[] BC00193_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] BC00193_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] BC00193_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] BC00193_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] BC00193_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] BC00193_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] BC00193_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] BC00193_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] BC00193_A713TBW06_PROC_DIV ;
   private boolean[] BC00193_n713TBW06_PROC_DIV ;
   private String[] BC00192_A698TBW06_SESSION_ID ;
   private String[] BC00192_A699TBW06_APP_ID ;
   private String[] BC00192_A700TBW06_DISP_DATETIME ;
   private long[] BC00192_A701TBW06_STUDY_ID ;
   private int[] BC00192_A702TBW06_SUBJECT_ID ;
   private short[] BC00192_A703TBW06_INS_NO ;
   private short[] BC00192_A704TBW06_CRF_ID ;
   private boolean[] BC00192_n704TBW06_CRF_ID ;
   private short[] BC00192_A705TBW06_CRF_VERSION ;
   private boolean[] BC00192_n705TBW06_CRF_VERSION ;
   private String[] BC00192_A706TBW06_MEMO ;
   private boolean[] BC00192_n706TBW06_MEMO ;
   private String[] BC00192_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] BC00192_n707TBW06_STYDY_AUTH_CD ;
   private String[] BC00192_A708TBW06_REQUEST_USER_ID ;
   private boolean[] BC00192_n708TBW06_REQUEST_USER_ID ;
   private String[] BC00192_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] BC00192_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] BC00192_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] BC00192_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] BC00192_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] BC00192_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] BC00192_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] BC00192_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] BC00192_A713TBW06_PROC_DIV ;
   private boolean[] BC00192_n713TBW06_PROC_DIV ;
   private String[] BC00199_A698TBW06_SESSION_ID ;
   private String[] BC00199_A699TBW06_APP_ID ;
   private String[] BC00199_A700TBW06_DISP_DATETIME ;
   private long[] BC00199_A701TBW06_STUDY_ID ;
   private int[] BC00199_A702TBW06_SUBJECT_ID ;
   private short[] BC00199_A703TBW06_INS_NO ;
   private short[] BC00199_A704TBW06_CRF_ID ;
   private boolean[] BC00199_n704TBW06_CRF_ID ;
   private short[] BC00199_A705TBW06_CRF_VERSION ;
   private boolean[] BC00199_n705TBW06_CRF_VERSION ;
   private String[] BC00199_A706TBW06_MEMO ;
   private boolean[] BC00199_n706TBW06_MEMO ;
   private String[] BC00199_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] BC00199_n707TBW06_STYDY_AUTH_CD ;
   private String[] BC00199_A708TBW06_REQUEST_USER_ID ;
   private boolean[] BC00199_n708TBW06_REQUEST_USER_ID ;
   private String[] BC00199_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] BC00199_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] BC00199_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] BC00199_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] BC00199_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] BC00199_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] BC00199_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] BC00199_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] BC00199_A713TBW06_PROC_DIV ;
   private boolean[] BC00199_n713TBW06_PROC_DIV ;
}

final  class tbw06_crf_memo_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00192", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00193", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00194", "SELECT TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO`, TM1.`TBW06_CRF_ID`, TM1.`TBW06_CRF_VERSION`, TM1.`TBW06_MEMO`, TM1.`TBW06_STYDY_AUTH_CD`, TM1.`TBW06_REQUEST_USER_ID`, TM1.`TBW06_EDIT_REQUEST_FLG`, TM1.`TBW06_EDIT_REQUEST_END_FLG`, TM1.`TBW06_EDIT_REQ_END_DATETIME`, TM1.`TBW06_EDIT_REQUEST_END_USER_ID`, TM1.`TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` TM1 WHERE TM1.`TBW06_SESSION_ID` = ? and TM1.`TBW06_APP_ID` = ? and TM1.`TBW06_DISP_DATETIME` = ? and TM1.`TBW06_STUDY_ID` = ? and TM1.`TBW06_SUBJECT_ID` = ? and TM1.`TBW06_INS_NO` = ? ORDER BY TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00195", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00196", "INSERT INTO `TBW06_CRF_MEMO` (`TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00197", "UPDATE `TBW06_CRF_MEMO` SET `TBW06_CRF_ID`=?, `TBW06_CRF_VERSION`=?, `TBW06_MEMO`=?, `TBW06_STYDY_AUTH_CD`=?, `TBW06_REQUEST_USER_ID`=?, `TBW06_EDIT_REQUEST_FLG`=?, `TBW06_EDIT_REQUEST_END_FLG`=?, `TBW06_EDIT_REQ_END_DATETIME`=?, `TBW06_EDIT_REQUEST_END_USER_ID`=?, `TBW06_PROC_DIV`=?  WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00198", "DELETE FROM `TBW06_CRF_MEMO`  WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00199", "SELECT TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO`, TM1.`TBW06_CRF_ID`, TM1.`TBW06_CRF_VERSION`, TM1.`TBW06_MEMO`, TM1.`TBW06_STYDY_AUTH_CD`, TM1.`TBW06_REQUEST_USER_ID`, TM1.`TBW06_EDIT_REQUEST_FLG`, TM1.`TBW06_EDIT_REQUEST_END_FLG`, TM1.`TBW06_EDIT_REQ_END_DATETIME`, TM1.`TBW06_EDIT_REQUEST_END_USER_ID`, TM1.`TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` TM1 WHERE TM1.`TBW06_SESSION_ID` = ? and TM1.`TBW06_APP_ID` = ? and TM1.`TBW06_DISP_DATETIME` = ? and TM1.`TBW06_STUDY_ID` = ? and TM1.`TBW06_SUBJECT_ID` = ? and TM1.`TBW06_INS_NO` = ? ORDER BY TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 128);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 2000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 2);
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               stmt.setVarchar(11, (String)parms[20], 50, false);
               stmt.setVarchar(12, (String)parms[21], 7, false);
               stmt.setVarchar(13, (String)parms[22], 14, false);
               stmt.setLong(14, ((Number) parms[23]).longValue());
               stmt.setInt(15, ((Number) parms[24]).intValue());
               stmt.setShort(16, ((Number) parms[25]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
      }
   }

}

