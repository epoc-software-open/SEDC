/*
               File: tbw04_crf_bc
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:47.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw04_crf_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw04_crf_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw04_crf_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw04_crf_bc.class ));
   }

   public tbw04_crf_bc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1742( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1742( ) ;
      standaloneModal( ) ;
      addRow1742( ) ;
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
            Z123TBW04_SESSION_ID = A123TBW04_SESSION_ID ;
            Z124TBW04_APP_ID = A124TBW04_APP_ID ;
            Z125TBW04_DISP_DATETIME = A125TBW04_DISP_DATETIME ;
            Z126TBW04_STUDY_ID = A126TBW04_STUDY_ID ;
            Z127TBW04_SUBJECT_ID = A127TBW04_SUBJECT_ID ;
            Z128TBW04_CRF_ID = A128TBW04_CRF_ID ;
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

   public void confirm_170( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1742( ) ;
         }
         else
         {
            checkExtendedTable1742( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1742( ) ;
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

   public void zm1742( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z735TBW04_CRF_LATEST_VERSION = A735TBW04_CRF_LATEST_VERSION ;
         Z736TBW04_CRF_INPUT_LEVEL = A736TBW04_CRF_INPUT_LEVEL ;
         Z737TBW04_LOCK_FLG = A737TBW04_LOCK_FLG ;
         Z738TBW04_LOCK_DATETIME = A738TBW04_LOCK_DATETIME ;
         Z739TBW04_LOCK_USER_ID = A739TBW04_LOCK_USER_ID ;
         Z740TBW04_LOCK_AUTH_CD = A740TBW04_LOCK_AUTH_CD ;
         Z741TBW04_UPLOAD_DATETIME = A741TBW04_UPLOAD_DATETIME ;
         Z742TBW04_UPLOAD_USER_ID = A742TBW04_UPLOAD_USER_ID ;
         Z743TBW04_UPLOAD_AUTH_CD = A743TBW04_UPLOAD_AUTH_CD ;
         Z744TBW04_DM_ARRIVAL_FLG = A744TBW04_DM_ARRIVAL_FLG ;
         Z745TBW04_DM_ARRIVAL_DATETIME = A745TBW04_DM_ARRIVAL_DATETIME ;
         Z746TBW04_APPROVAL_FLG = A746TBW04_APPROVAL_FLG ;
         Z747TBW04_APPROVAL_DATETIME = A747TBW04_APPROVAL_DATETIME ;
         Z748TBW04_APPROVAL_USER_ID = A748TBW04_APPROVAL_USER_ID ;
         Z749TBW04_APPROVAL_AUTH_CD = A749TBW04_APPROVAL_AUTH_CD ;
         Z750TBW04_INPUT_END_FLG = A750TBW04_INPUT_END_FLG ;
         Z751TBW04_INPUT_END_DATETIME = A751TBW04_INPUT_END_DATETIME ;
         Z752TBW04_INPUT_END_USER_ID = A752TBW04_INPUT_END_USER_ID ;
         Z753TBW04_INPUT_END_AUTH_CD = A753TBW04_INPUT_END_AUTH_CD ;
         Z754TBW04_COMPLETION_FLG = A754TBW04_COMPLETION_FLG ;
         Z755TBW04_EDIT_FLG = A755TBW04_EDIT_FLG ;
      }
      if ( GX_JID == -6 )
      {
         Z123TBW04_SESSION_ID = A123TBW04_SESSION_ID ;
         Z124TBW04_APP_ID = A124TBW04_APP_ID ;
         Z125TBW04_DISP_DATETIME = A125TBW04_DISP_DATETIME ;
         Z126TBW04_STUDY_ID = A126TBW04_STUDY_ID ;
         Z127TBW04_SUBJECT_ID = A127TBW04_SUBJECT_ID ;
         Z128TBW04_CRF_ID = A128TBW04_CRF_ID ;
         Z735TBW04_CRF_LATEST_VERSION = A735TBW04_CRF_LATEST_VERSION ;
         Z736TBW04_CRF_INPUT_LEVEL = A736TBW04_CRF_INPUT_LEVEL ;
         Z737TBW04_LOCK_FLG = A737TBW04_LOCK_FLG ;
         Z738TBW04_LOCK_DATETIME = A738TBW04_LOCK_DATETIME ;
         Z739TBW04_LOCK_USER_ID = A739TBW04_LOCK_USER_ID ;
         Z740TBW04_LOCK_AUTH_CD = A740TBW04_LOCK_AUTH_CD ;
         Z741TBW04_UPLOAD_DATETIME = A741TBW04_UPLOAD_DATETIME ;
         Z742TBW04_UPLOAD_USER_ID = A742TBW04_UPLOAD_USER_ID ;
         Z743TBW04_UPLOAD_AUTH_CD = A743TBW04_UPLOAD_AUTH_CD ;
         Z744TBW04_DM_ARRIVAL_FLG = A744TBW04_DM_ARRIVAL_FLG ;
         Z745TBW04_DM_ARRIVAL_DATETIME = A745TBW04_DM_ARRIVAL_DATETIME ;
         Z746TBW04_APPROVAL_FLG = A746TBW04_APPROVAL_FLG ;
         Z747TBW04_APPROVAL_DATETIME = A747TBW04_APPROVAL_DATETIME ;
         Z748TBW04_APPROVAL_USER_ID = A748TBW04_APPROVAL_USER_ID ;
         Z749TBW04_APPROVAL_AUTH_CD = A749TBW04_APPROVAL_AUTH_CD ;
         Z750TBW04_INPUT_END_FLG = A750TBW04_INPUT_END_FLG ;
         Z751TBW04_INPUT_END_DATETIME = A751TBW04_INPUT_END_DATETIME ;
         Z752TBW04_INPUT_END_USER_ID = A752TBW04_INPUT_END_USER_ID ;
         Z753TBW04_INPUT_END_AUTH_CD = A753TBW04_INPUT_END_AUTH_CD ;
         Z754TBW04_COMPLETION_FLG = A754TBW04_COMPLETION_FLG ;
         Z755TBW04_EDIT_FLG = A755TBW04_EDIT_FLG ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1742( )
   {
      /* Using cursor BC00174 */
      pr_default.execute(2, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A735TBW04_CRF_LATEST_VERSION = BC00174_A735TBW04_CRF_LATEST_VERSION[0] ;
         n735TBW04_CRF_LATEST_VERSION = BC00174_n735TBW04_CRF_LATEST_VERSION[0] ;
         A736TBW04_CRF_INPUT_LEVEL = BC00174_A736TBW04_CRF_INPUT_LEVEL[0] ;
         n736TBW04_CRF_INPUT_LEVEL = BC00174_n736TBW04_CRF_INPUT_LEVEL[0] ;
         A737TBW04_LOCK_FLG = BC00174_A737TBW04_LOCK_FLG[0] ;
         n737TBW04_LOCK_FLG = BC00174_n737TBW04_LOCK_FLG[0] ;
         A738TBW04_LOCK_DATETIME = BC00174_A738TBW04_LOCK_DATETIME[0] ;
         n738TBW04_LOCK_DATETIME = BC00174_n738TBW04_LOCK_DATETIME[0] ;
         A739TBW04_LOCK_USER_ID = BC00174_A739TBW04_LOCK_USER_ID[0] ;
         n739TBW04_LOCK_USER_ID = BC00174_n739TBW04_LOCK_USER_ID[0] ;
         A740TBW04_LOCK_AUTH_CD = BC00174_A740TBW04_LOCK_AUTH_CD[0] ;
         n740TBW04_LOCK_AUTH_CD = BC00174_n740TBW04_LOCK_AUTH_CD[0] ;
         A741TBW04_UPLOAD_DATETIME = BC00174_A741TBW04_UPLOAD_DATETIME[0] ;
         n741TBW04_UPLOAD_DATETIME = BC00174_n741TBW04_UPLOAD_DATETIME[0] ;
         A742TBW04_UPLOAD_USER_ID = BC00174_A742TBW04_UPLOAD_USER_ID[0] ;
         n742TBW04_UPLOAD_USER_ID = BC00174_n742TBW04_UPLOAD_USER_ID[0] ;
         A743TBW04_UPLOAD_AUTH_CD = BC00174_A743TBW04_UPLOAD_AUTH_CD[0] ;
         n743TBW04_UPLOAD_AUTH_CD = BC00174_n743TBW04_UPLOAD_AUTH_CD[0] ;
         A744TBW04_DM_ARRIVAL_FLG = BC00174_A744TBW04_DM_ARRIVAL_FLG[0] ;
         n744TBW04_DM_ARRIVAL_FLG = BC00174_n744TBW04_DM_ARRIVAL_FLG[0] ;
         A745TBW04_DM_ARRIVAL_DATETIME = BC00174_A745TBW04_DM_ARRIVAL_DATETIME[0] ;
         n745TBW04_DM_ARRIVAL_DATETIME = BC00174_n745TBW04_DM_ARRIVAL_DATETIME[0] ;
         A746TBW04_APPROVAL_FLG = BC00174_A746TBW04_APPROVAL_FLG[0] ;
         n746TBW04_APPROVAL_FLG = BC00174_n746TBW04_APPROVAL_FLG[0] ;
         A747TBW04_APPROVAL_DATETIME = BC00174_A747TBW04_APPROVAL_DATETIME[0] ;
         n747TBW04_APPROVAL_DATETIME = BC00174_n747TBW04_APPROVAL_DATETIME[0] ;
         A748TBW04_APPROVAL_USER_ID = BC00174_A748TBW04_APPROVAL_USER_ID[0] ;
         n748TBW04_APPROVAL_USER_ID = BC00174_n748TBW04_APPROVAL_USER_ID[0] ;
         A749TBW04_APPROVAL_AUTH_CD = BC00174_A749TBW04_APPROVAL_AUTH_CD[0] ;
         n749TBW04_APPROVAL_AUTH_CD = BC00174_n749TBW04_APPROVAL_AUTH_CD[0] ;
         A750TBW04_INPUT_END_FLG = BC00174_A750TBW04_INPUT_END_FLG[0] ;
         n750TBW04_INPUT_END_FLG = BC00174_n750TBW04_INPUT_END_FLG[0] ;
         A751TBW04_INPUT_END_DATETIME = BC00174_A751TBW04_INPUT_END_DATETIME[0] ;
         n751TBW04_INPUT_END_DATETIME = BC00174_n751TBW04_INPUT_END_DATETIME[0] ;
         A752TBW04_INPUT_END_USER_ID = BC00174_A752TBW04_INPUT_END_USER_ID[0] ;
         n752TBW04_INPUT_END_USER_ID = BC00174_n752TBW04_INPUT_END_USER_ID[0] ;
         A753TBW04_INPUT_END_AUTH_CD = BC00174_A753TBW04_INPUT_END_AUTH_CD[0] ;
         n753TBW04_INPUT_END_AUTH_CD = BC00174_n753TBW04_INPUT_END_AUTH_CD[0] ;
         A754TBW04_COMPLETION_FLG = BC00174_A754TBW04_COMPLETION_FLG[0] ;
         n754TBW04_COMPLETION_FLG = BC00174_n754TBW04_COMPLETION_FLG[0] ;
         A755TBW04_EDIT_FLG = BC00174_A755TBW04_EDIT_FLG[0] ;
         n755TBW04_EDIT_FLG = BC00174_n755TBW04_EDIT_FLG[0] ;
         zm1742( -6) ;
      }
      pr_default.close(2);
      onLoadActions1742( ) ;
   }

   public void onLoadActions1742( )
   {
      AV8Pgmname = "TBW04_CRF_BC" ;
   }

   public void checkExtendedTable1742( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW04_CRF_BC" ;
      if ( ! ( GXutil.nullDate().equals(A738TBW04_LOCK_DATETIME) || (( A738TBW04_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A738TBW04_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A741TBW04_UPLOAD_DATETIME) || (( A741TBW04_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A741TBW04_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A745TBW04_DM_ARRIVAL_DATETIME) || (( A745TBW04_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A745TBW04_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A747TBW04_APPROVAL_DATETIME) || (( A747TBW04_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A747TBW04_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A751TBW04_INPUT_END_DATETIME) || (( A751TBW04_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A751TBW04_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1742( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1742( )
   {
      /* Using cursor BC00175 */
      pr_default.execute(3, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00173 */
      pr_default.execute(1, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1742( 6) ;
         RcdFound42 = (short)(1) ;
         A123TBW04_SESSION_ID = BC00173_A123TBW04_SESSION_ID[0] ;
         A124TBW04_APP_ID = BC00173_A124TBW04_APP_ID[0] ;
         A125TBW04_DISP_DATETIME = BC00173_A125TBW04_DISP_DATETIME[0] ;
         A126TBW04_STUDY_ID = BC00173_A126TBW04_STUDY_ID[0] ;
         A127TBW04_SUBJECT_ID = BC00173_A127TBW04_SUBJECT_ID[0] ;
         A128TBW04_CRF_ID = BC00173_A128TBW04_CRF_ID[0] ;
         A735TBW04_CRF_LATEST_VERSION = BC00173_A735TBW04_CRF_LATEST_VERSION[0] ;
         n735TBW04_CRF_LATEST_VERSION = BC00173_n735TBW04_CRF_LATEST_VERSION[0] ;
         A736TBW04_CRF_INPUT_LEVEL = BC00173_A736TBW04_CRF_INPUT_LEVEL[0] ;
         n736TBW04_CRF_INPUT_LEVEL = BC00173_n736TBW04_CRF_INPUT_LEVEL[0] ;
         A737TBW04_LOCK_FLG = BC00173_A737TBW04_LOCK_FLG[0] ;
         n737TBW04_LOCK_FLG = BC00173_n737TBW04_LOCK_FLG[0] ;
         A738TBW04_LOCK_DATETIME = BC00173_A738TBW04_LOCK_DATETIME[0] ;
         n738TBW04_LOCK_DATETIME = BC00173_n738TBW04_LOCK_DATETIME[0] ;
         A739TBW04_LOCK_USER_ID = BC00173_A739TBW04_LOCK_USER_ID[0] ;
         n739TBW04_LOCK_USER_ID = BC00173_n739TBW04_LOCK_USER_ID[0] ;
         A740TBW04_LOCK_AUTH_CD = BC00173_A740TBW04_LOCK_AUTH_CD[0] ;
         n740TBW04_LOCK_AUTH_CD = BC00173_n740TBW04_LOCK_AUTH_CD[0] ;
         A741TBW04_UPLOAD_DATETIME = BC00173_A741TBW04_UPLOAD_DATETIME[0] ;
         n741TBW04_UPLOAD_DATETIME = BC00173_n741TBW04_UPLOAD_DATETIME[0] ;
         A742TBW04_UPLOAD_USER_ID = BC00173_A742TBW04_UPLOAD_USER_ID[0] ;
         n742TBW04_UPLOAD_USER_ID = BC00173_n742TBW04_UPLOAD_USER_ID[0] ;
         A743TBW04_UPLOAD_AUTH_CD = BC00173_A743TBW04_UPLOAD_AUTH_CD[0] ;
         n743TBW04_UPLOAD_AUTH_CD = BC00173_n743TBW04_UPLOAD_AUTH_CD[0] ;
         A744TBW04_DM_ARRIVAL_FLG = BC00173_A744TBW04_DM_ARRIVAL_FLG[0] ;
         n744TBW04_DM_ARRIVAL_FLG = BC00173_n744TBW04_DM_ARRIVAL_FLG[0] ;
         A745TBW04_DM_ARRIVAL_DATETIME = BC00173_A745TBW04_DM_ARRIVAL_DATETIME[0] ;
         n745TBW04_DM_ARRIVAL_DATETIME = BC00173_n745TBW04_DM_ARRIVAL_DATETIME[0] ;
         A746TBW04_APPROVAL_FLG = BC00173_A746TBW04_APPROVAL_FLG[0] ;
         n746TBW04_APPROVAL_FLG = BC00173_n746TBW04_APPROVAL_FLG[0] ;
         A747TBW04_APPROVAL_DATETIME = BC00173_A747TBW04_APPROVAL_DATETIME[0] ;
         n747TBW04_APPROVAL_DATETIME = BC00173_n747TBW04_APPROVAL_DATETIME[0] ;
         A748TBW04_APPROVAL_USER_ID = BC00173_A748TBW04_APPROVAL_USER_ID[0] ;
         n748TBW04_APPROVAL_USER_ID = BC00173_n748TBW04_APPROVAL_USER_ID[0] ;
         A749TBW04_APPROVAL_AUTH_CD = BC00173_A749TBW04_APPROVAL_AUTH_CD[0] ;
         n749TBW04_APPROVAL_AUTH_CD = BC00173_n749TBW04_APPROVAL_AUTH_CD[0] ;
         A750TBW04_INPUT_END_FLG = BC00173_A750TBW04_INPUT_END_FLG[0] ;
         n750TBW04_INPUT_END_FLG = BC00173_n750TBW04_INPUT_END_FLG[0] ;
         A751TBW04_INPUT_END_DATETIME = BC00173_A751TBW04_INPUT_END_DATETIME[0] ;
         n751TBW04_INPUT_END_DATETIME = BC00173_n751TBW04_INPUT_END_DATETIME[0] ;
         A752TBW04_INPUT_END_USER_ID = BC00173_A752TBW04_INPUT_END_USER_ID[0] ;
         n752TBW04_INPUT_END_USER_ID = BC00173_n752TBW04_INPUT_END_USER_ID[0] ;
         A753TBW04_INPUT_END_AUTH_CD = BC00173_A753TBW04_INPUT_END_AUTH_CD[0] ;
         n753TBW04_INPUT_END_AUTH_CD = BC00173_n753TBW04_INPUT_END_AUTH_CD[0] ;
         A754TBW04_COMPLETION_FLG = BC00173_A754TBW04_COMPLETION_FLG[0] ;
         n754TBW04_COMPLETION_FLG = BC00173_n754TBW04_COMPLETION_FLG[0] ;
         A755TBW04_EDIT_FLG = BC00173_A755TBW04_EDIT_FLG[0] ;
         n755TBW04_EDIT_FLG = BC00173_n755TBW04_EDIT_FLG[0] ;
         Z123TBW04_SESSION_ID = A123TBW04_SESSION_ID ;
         Z124TBW04_APP_ID = A124TBW04_APP_ID ;
         Z125TBW04_DISP_DATETIME = A125TBW04_DISP_DATETIME ;
         Z126TBW04_STUDY_ID = A126TBW04_STUDY_ID ;
         Z127TBW04_SUBJECT_ID = A127TBW04_SUBJECT_ID ;
         Z128TBW04_CRF_ID = A128TBW04_CRF_ID ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1742( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1742( ) ;
         }
         Gx_mode = sMode42 ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1742( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1742( ) ;
      if ( RcdFound42 == 0 )
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
      confirm_170( ) ;
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

   public void checkOptimisticConcurrency1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00172 */
         pr_default.execute(0, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z735TBW04_CRF_LATEST_VERSION != BC00172_A735TBW04_CRF_LATEST_VERSION[0] ) || ( Z736TBW04_CRF_INPUT_LEVEL != BC00172_A736TBW04_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z737TBW04_LOCK_FLG, BC00172_A737TBW04_LOCK_FLG[0]) != 0 ) || !( Z738TBW04_LOCK_DATETIME.equals( BC00172_A738TBW04_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z739TBW04_LOCK_USER_ID, BC00172_A739TBW04_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z740TBW04_LOCK_AUTH_CD, BC00172_A740TBW04_LOCK_AUTH_CD[0]) != 0 ) || !( Z741TBW04_UPLOAD_DATETIME.equals( BC00172_A741TBW04_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z742TBW04_UPLOAD_USER_ID, BC00172_A742TBW04_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z743TBW04_UPLOAD_AUTH_CD, BC00172_A743TBW04_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z744TBW04_DM_ARRIVAL_FLG, BC00172_A744TBW04_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z745TBW04_DM_ARRIVAL_DATETIME.equals( BC00172_A745TBW04_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z746TBW04_APPROVAL_FLG, BC00172_A746TBW04_APPROVAL_FLG[0]) != 0 ) || !( Z747TBW04_APPROVAL_DATETIME.equals( BC00172_A747TBW04_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z748TBW04_APPROVAL_USER_ID, BC00172_A748TBW04_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z749TBW04_APPROVAL_AUTH_CD, BC00172_A749TBW04_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z750TBW04_INPUT_END_FLG, BC00172_A750TBW04_INPUT_END_FLG[0]) != 0 ) || !( Z751TBW04_INPUT_END_DATETIME.equals( BC00172_A751TBW04_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z752TBW04_INPUT_END_USER_ID, BC00172_A752TBW04_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z753TBW04_INPUT_END_AUTH_CD, BC00172_A753TBW04_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z754TBW04_COMPLETION_FLG, BC00172_A754TBW04_COMPLETION_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z755TBW04_EDIT_FLG, BC00172_A755TBW04_EDIT_FLG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW04_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1742( 0) ;
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00176 */
                  pr_default.execute(4, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID), new Boolean(n735TBW04_CRF_LATEST_VERSION), new Short(A735TBW04_CRF_LATEST_VERSION), new Boolean(n736TBW04_CRF_INPUT_LEVEL), new Byte(A736TBW04_CRF_INPUT_LEVEL), new Boolean(n737TBW04_LOCK_FLG), A737TBW04_LOCK_FLG, new Boolean(n738TBW04_LOCK_DATETIME), A738TBW04_LOCK_DATETIME, new Boolean(n739TBW04_LOCK_USER_ID), A739TBW04_LOCK_USER_ID, new Boolean(n740TBW04_LOCK_AUTH_CD), A740TBW04_LOCK_AUTH_CD, new Boolean(n741TBW04_UPLOAD_DATETIME), A741TBW04_UPLOAD_DATETIME, new Boolean(n742TBW04_UPLOAD_USER_ID), A742TBW04_UPLOAD_USER_ID, new Boolean(n743TBW04_UPLOAD_AUTH_CD), A743TBW04_UPLOAD_AUTH_CD, new Boolean(n744TBW04_DM_ARRIVAL_FLG), A744TBW04_DM_ARRIVAL_FLG, new Boolean(n745TBW04_DM_ARRIVAL_DATETIME), A745TBW04_DM_ARRIVAL_DATETIME, new Boolean(n746TBW04_APPROVAL_FLG), A746TBW04_APPROVAL_FLG, new Boolean(n747TBW04_APPROVAL_DATETIME), A747TBW04_APPROVAL_DATETIME, new Boolean(n748TBW04_APPROVAL_USER_ID), A748TBW04_APPROVAL_USER_ID, new Boolean(n749TBW04_APPROVAL_AUTH_CD), A749TBW04_APPROVAL_AUTH_CD, new Boolean(n750TBW04_INPUT_END_FLG), A750TBW04_INPUT_END_FLG, new Boolean(n751TBW04_INPUT_END_DATETIME), A751TBW04_INPUT_END_DATETIME, new Boolean(n752TBW04_INPUT_END_USER_ID), A752TBW04_INPUT_END_USER_ID, new Boolean(n753TBW04_INPUT_END_AUTH_CD), A753TBW04_INPUT_END_AUTH_CD, new Boolean(n754TBW04_COMPLETION_FLG), A754TBW04_COMPLETION_FLG, new Boolean(n755TBW04_EDIT_FLG), A755TBW04_EDIT_FLG});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW04_CRF") ;
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
            load1742( ) ;
         }
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void update1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00177 */
                  pr_default.execute(5, new Object[] {new Boolean(n735TBW04_CRF_LATEST_VERSION), new Short(A735TBW04_CRF_LATEST_VERSION), new Boolean(n736TBW04_CRF_INPUT_LEVEL), new Byte(A736TBW04_CRF_INPUT_LEVEL), new Boolean(n737TBW04_LOCK_FLG), A737TBW04_LOCK_FLG, new Boolean(n738TBW04_LOCK_DATETIME), A738TBW04_LOCK_DATETIME, new Boolean(n739TBW04_LOCK_USER_ID), A739TBW04_LOCK_USER_ID, new Boolean(n740TBW04_LOCK_AUTH_CD), A740TBW04_LOCK_AUTH_CD, new Boolean(n741TBW04_UPLOAD_DATETIME), A741TBW04_UPLOAD_DATETIME, new Boolean(n742TBW04_UPLOAD_USER_ID), A742TBW04_UPLOAD_USER_ID, new Boolean(n743TBW04_UPLOAD_AUTH_CD), A743TBW04_UPLOAD_AUTH_CD, new Boolean(n744TBW04_DM_ARRIVAL_FLG), A744TBW04_DM_ARRIVAL_FLG, new Boolean(n745TBW04_DM_ARRIVAL_DATETIME), A745TBW04_DM_ARRIVAL_DATETIME, new Boolean(n746TBW04_APPROVAL_FLG), A746TBW04_APPROVAL_FLG, new Boolean(n747TBW04_APPROVAL_DATETIME), A747TBW04_APPROVAL_DATETIME, new Boolean(n748TBW04_APPROVAL_USER_ID), A748TBW04_APPROVAL_USER_ID, new Boolean(n749TBW04_APPROVAL_AUTH_CD), A749TBW04_APPROVAL_AUTH_CD, new Boolean(n750TBW04_INPUT_END_FLG), A750TBW04_INPUT_END_FLG, new Boolean(n751TBW04_INPUT_END_DATETIME), A751TBW04_INPUT_END_DATETIME, new Boolean(n752TBW04_INPUT_END_USER_ID), A752TBW04_INPUT_END_USER_ID, new Boolean(n753TBW04_INPUT_END_AUTH_CD), A753TBW04_INPUT_END_AUTH_CD, new Boolean(n754TBW04_COMPLETION_FLG), A754TBW04_COMPLETION_FLG, new Boolean(n755TBW04_EDIT_FLG), A755TBW04_EDIT_FLG, A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW04_CRF") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1742( ) ;
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
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void deferredUpdate1742( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1742( ) ;
         afterConfirm1742( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1742( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00178 */
               pr_default.execute(6, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW04_CRF") ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1742( ) ;
      Gx_mode = sMode42 ;
   }

   public void onDeleteControls1742( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW04_CRF_BC" ;
      }
   }

   public void endLevel1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1742( ) ;
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

   public void scanKeyStart1742( )
   {
      /* Scan By routine */
      /* Using cursor BC00179 */
      pr_default.execute(7, new Object[] {A123TBW04_SESSION_ID, A124TBW04_APP_ID, A125TBW04_DISP_DATETIME, new Long(A126TBW04_STUDY_ID), new Integer(A127TBW04_SUBJECT_ID), new Short(A128TBW04_CRF_ID)});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A123TBW04_SESSION_ID = BC00179_A123TBW04_SESSION_ID[0] ;
         A124TBW04_APP_ID = BC00179_A124TBW04_APP_ID[0] ;
         A125TBW04_DISP_DATETIME = BC00179_A125TBW04_DISP_DATETIME[0] ;
         A126TBW04_STUDY_ID = BC00179_A126TBW04_STUDY_ID[0] ;
         A127TBW04_SUBJECT_ID = BC00179_A127TBW04_SUBJECT_ID[0] ;
         A128TBW04_CRF_ID = BC00179_A128TBW04_CRF_ID[0] ;
         A735TBW04_CRF_LATEST_VERSION = BC00179_A735TBW04_CRF_LATEST_VERSION[0] ;
         n735TBW04_CRF_LATEST_VERSION = BC00179_n735TBW04_CRF_LATEST_VERSION[0] ;
         A736TBW04_CRF_INPUT_LEVEL = BC00179_A736TBW04_CRF_INPUT_LEVEL[0] ;
         n736TBW04_CRF_INPUT_LEVEL = BC00179_n736TBW04_CRF_INPUT_LEVEL[0] ;
         A737TBW04_LOCK_FLG = BC00179_A737TBW04_LOCK_FLG[0] ;
         n737TBW04_LOCK_FLG = BC00179_n737TBW04_LOCK_FLG[0] ;
         A738TBW04_LOCK_DATETIME = BC00179_A738TBW04_LOCK_DATETIME[0] ;
         n738TBW04_LOCK_DATETIME = BC00179_n738TBW04_LOCK_DATETIME[0] ;
         A739TBW04_LOCK_USER_ID = BC00179_A739TBW04_LOCK_USER_ID[0] ;
         n739TBW04_LOCK_USER_ID = BC00179_n739TBW04_LOCK_USER_ID[0] ;
         A740TBW04_LOCK_AUTH_CD = BC00179_A740TBW04_LOCK_AUTH_CD[0] ;
         n740TBW04_LOCK_AUTH_CD = BC00179_n740TBW04_LOCK_AUTH_CD[0] ;
         A741TBW04_UPLOAD_DATETIME = BC00179_A741TBW04_UPLOAD_DATETIME[0] ;
         n741TBW04_UPLOAD_DATETIME = BC00179_n741TBW04_UPLOAD_DATETIME[0] ;
         A742TBW04_UPLOAD_USER_ID = BC00179_A742TBW04_UPLOAD_USER_ID[0] ;
         n742TBW04_UPLOAD_USER_ID = BC00179_n742TBW04_UPLOAD_USER_ID[0] ;
         A743TBW04_UPLOAD_AUTH_CD = BC00179_A743TBW04_UPLOAD_AUTH_CD[0] ;
         n743TBW04_UPLOAD_AUTH_CD = BC00179_n743TBW04_UPLOAD_AUTH_CD[0] ;
         A744TBW04_DM_ARRIVAL_FLG = BC00179_A744TBW04_DM_ARRIVAL_FLG[0] ;
         n744TBW04_DM_ARRIVAL_FLG = BC00179_n744TBW04_DM_ARRIVAL_FLG[0] ;
         A745TBW04_DM_ARRIVAL_DATETIME = BC00179_A745TBW04_DM_ARRIVAL_DATETIME[0] ;
         n745TBW04_DM_ARRIVAL_DATETIME = BC00179_n745TBW04_DM_ARRIVAL_DATETIME[0] ;
         A746TBW04_APPROVAL_FLG = BC00179_A746TBW04_APPROVAL_FLG[0] ;
         n746TBW04_APPROVAL_FLG = BC00179_n746TBW04_APPROVAL_FLG[0] ;
         A747TBW04_APPROVAL_DATETIME = BC00179_A747TBW04_APPROVAL_DATETIME[0] ;
         n747TBW04_APPROVAL_DATETIME = BC00179_n747TBW04_APPROVAL_DATETIME[0] ;
         A748TBW04_APPROVAL_USER_ID = BC00179_A748TBW04_APPROVAL_USER_ID[0] ;
         n748TBW04_APPROVAL_USER_ID = BC00179_n748TBW04_APPROVAL_USER_ID[0] ;
         A749TBW04_APPROVAL_AUTH_CD = BC00179_A749TBW04_APPROVAL_AUTH_CD[0] ;
         n749TBW04_APPROVAL_AUTH_CD = BC00179_n749TBW04_APPROVAL_AUTH_CD[0] ;
         A750TBW04_INPUT_END_FLG = BC00179_A750TBW04_INPUT_END_FLG[0] ;
         n750TBW04_INPUT_END_FLG = BC00179_n750TBW04_INPUT_END_FLG[0] ;
         A751TBW04_INPUT_END_DATETIME = BC00179_A751TBW04_INPUT_END_DATETIME[0] ;
         n751TBW04_INPUT_END_DATETIME = BC00179_n751TBW04_INPUT_END_DATETIME[0] ;
         A752TBW04_INPUT_END_USER_ID = BC00179_A752TBW04_INPUT_END_USER_ID[0] ;
         n752TBW04_INPUT_END_USER_ID = BC00179_n752TBW04_INPUT_END_USER_ID[0] ;
         A753TBW04_INPUT_END_AUTH_CD = BC00179_A753TBW04_INPUT_END_AUTH_CD[0] ;
         n753TBW04_INPUT_END_AUTH_CD = BC00179_n753TBW04_INPUT_END_AUTH_CD[0] ;
         A754TBW04_COMPLETION_FLG = BC00179_A754TBW04_COMPLETION_FLG[0] ;
         n754TBW04_COMPLETION_FLG = BC00179_n754TBW04_COMPLETION_FLG[0] ;
         A755TBW04_EDIT_FLG = BC00179_A755TBW04_EDIT_FLG[0] ;
         n755TBW04_EDIT_FLG = BC00179_n755TBW04_EDIT_FLG[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1742( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound42 = (short)(0) ;
      scanKeyLoad1742( ) ;
   }

   public void scanKeyLoad1742( )
   {
      sMode42 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A123TBW04_SESSION_ID = BC00179_A123TBW04_SESSION_ID[0] ;
         A124TBW04_APP_ID = BC00179_A124TBW04_APP_ID[0] ;
         A125TBW04_DISP_DATETIME = BC00179_A125TBW04_DISP_DATETIME[0] ;
         A126TBW04_STUDY_ID = BC00179_A126TBW04_STUDY_ID[0] ;
         A127TBW04_SUBJECT_ID = BC00179_A127TBW04_SUBJECT_ID[0] ;
         A128TBW04_CRF_ID = BC00179_A128TBW04_CRF_ID[0] ;
         A735TBW04_CRF_LATEST_VERSION = BC00179_A735TBW04_CRF_LATEST_VERSION[0] ;
         n735TBW04_CRF_LATEST_VERSION = BC00179_n735TBW04_CRF_LATEST_VERSION[0] ;
         A736TBW04_CRF_INPUT_LEVEL = BC00179_A736TBW04_CRF_INPUT_LEVEL[0] ;
         n736TBW04_CRF_INPUT_LEVEL = BC00179_n736TBW04_CRF_INPUT_LEVEL[0] ;
         A737TBW04_LOCK_FLG = BC00179_A737TBW04_LOCK_FLG[0] ;
         n737TBW04_LOCK_FLG = BC00179_n737TBW04_LOCK_FLG[0] ;
         A738TBW04_LOCK_DATETIME = BC00179_A738TBW04_LOCK_DATETIME[0] ;
         n738TBW04_LOCK_DATETIME = BC00179_n738TBW04_LOCK_DATETIME[0] ;
         A739TBW04_LOCK_USER_ID = BC00179_A739TBW04_LOCK_USER_ID[0] ;
         n739TBW04_LOCK_USER_ID = BC00179_n739TBW04_LOCK_USER_ID[0] ;
         A740TBW04_LOCK_AUTH_CD = BC00179_A740TBW04_LOCK_AUTH_CD[0] ;
         n740TBW04_LOCK_AUTH_CD = BC00179_n740TBW04_LOCK_AUTH_CD[0] ;
         A741TBW04_UPLOAD_DATETIME = BC00179_A741TBW04_UPLOAD_DATETIME[0] ;
         n741TBW04_UPLOAD_DATETIME = BC00179_n741TBW04_UPLOAD_DATETIME[0] ;
         A742TBW04_UPLOAD_USER_ID = BC00179_A742TBW04_UPLOAD_USER_ID[0] ;
         n742TBW04_UPLOAD_USER_ID = BC00179_n742TBW04_UPLOAD_USER_ID[0] ;
         A743TBW04_UPLOAD_AUTH_CD = BC00179_A743TBW04_UPLOAD_AUTH_CD[0] ;
         n743TBW04_UPLOAD_AUTH_CD = BC00179_n743TBW04_UPLOAD_AUTH_CD[0] ;
         A744TBW04_DM_ARRIVAL_FLG = BC00179_A744TBW04_DM_ARRIVAL_FLG[0] ;
         n744TBW04_DM_ARRIVAL_FLG = BC00179_n744TBW04_DM_ARRIVAL_FLG[0] ;
         A745TBW04_DM_ARRIVAL_DATETIME = BC00179_A745TBW04_DM_ARRIVAL_DATETIME[0] ;
         n745TBW04_DM_ARRIVAL_DATETIME = BC00179_n745TBW04_DM_ARRIVAL_DATETIME[0] ;
         A746TBW04_APPROVAL_FLG = BC00179_A746TBW04_APPROVAL_FLG[0] ;
         n746TBW04_APPROVAL_FLG = BC00179_n746TBW04_APPROVAL_FLG[0] ;
         A747TBW04_APPROVAL_DATETIME = BC00179_A747TBW04_APPROVAL_DATETIME[0] ;
         n747TBW04_APPROVAL_DATETIME = BC00179_n747TBW04_APPROVAL_DATETIME[0] ;
         A748TBW04_APPROVAL_USER_ID = BC00179_A748TBW04_APPROVAL_USER_ID[0] ;
         n748TBW04_APPROVAL_USER_ID = BC00179_n748TBW04_APPROVAL_USER_ID[0] ;
         A749TBW04_APPROVAL_AUTH_CD = BC00179_A749TBW04_APPROVAL_AUTH_CD[0] ;
         n749TBW04_APPROVAL_AUTH_CD = BC00179_n749TBW04_APPROVAL_AUTH_CD[0] ;
         A750TBW04_INPUT_END_FLG = BC00179_A750TBW04_INPUT_END_FLG[0] ;
         n750TBW04_INPUT_END_FLG = BC00179_n750TBW04_INPUT_END_FLG[0] ;
         A751TBW04_INPUT_END_DATETIME = BC00179_A751TBW04_INPUT_END_DATETIME[0] ;
         n751TBW04_INPUT_END_DATETIME = BC00179_n751TBW04_INPUT_END_DATETIME[0] ;
         A752TBW04_INPUT_END_USER_ID = BC00179_A752TBW04_INPUT_END_USER_ID[0] ;
         n752TBW04_INPUT_END_USER_ID = BC00179_n752TBW04_INPUT_END_USER_ID[0] ;
         A753TBW04_INPUT_END_AUTH_CD = BC00179_A753TBW04_INPUT_END_AUTH_CD[0] ;
         n753TBW04_INPUT_END_AUTH_CD = BC00179_n753TBW04_INPUT_END_AUTH_CD[0] ;
         A754TBW04_COMPLETION_FLG = BC00179_A754TBW04_COMPLETION_FLG[0] ;
         n754TBW04_COMPLETION_FLG = BC00179_n754TBW04_COMPLETION_FLG[0] ;
         A755TBW04_EDIT_FLG = BC00179_A755TBW04_EDIT_FLG[0] ;
         n755TBW04_EDIT_FLG = BC00179_n755TBW04_EDIT_FLG[0] ;
      }
      Gx_mode = sMode42 ;
   }

   public void scanKeyEnd1742( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1742( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1742( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1742( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1742( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1742( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1742( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1742( )
   {
   }

   public void addRow1742( )
   {
      VarsToRow42( bcTBW04_CRF) ;
   }

   public void readRow1742( )
   {
      RowToVars42( bcTBW04_CRF, 1) ;
   }

   public void initializeNonKey1742( )
   {
      A735TBW04_CRF_LATEST_VERSION = (short)(0) ;
      n735TBW04_CRF_LATEST_VERSION = false ;
      A736TBW04_CRF_INPUT_LEVEL = (byte)(0) ;
      n736TBW04_CRF_INPUT_LEVEL = false ;
      A737TBW04_LOCK_FLG = "" ;
      n737TBW04_LOCK_FLG = false ;
      A738TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n738TBW04_LOCK_DATETIME = false ;
      A739TBW04_LOCK_USER_ID = "" ;
      n739TBW04_LOCK_USER_ID = false ;
      A740TBW04_LOCK_AUTH_CD = "" ;
      n740TBW04_LOCK_AUTH_CD = false ;
      A741TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n741TBW04_UPLOAD_DATETIME = false ;
      A742TBW04_UPLOAD_USER_ID = "" ;
      n742TBW04_UPLOAD_USER_ID = false ;
      A743TBW04_UPLOAD_AUTH_CD = "" ;
      n743TBW04_UPLOAD_AUTH_CD = false ;
      A744TBW04_DM_ARRIVAL_FLG = "" ;
      n744TBW04_DM_ARRIVAL_FLG = false ;
      A745TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n745TBW04_DM_ARRIVAL_DATETIME = false ;
      A746TBW04_APPROVAL_FLG = "" ;
      n746TBW04_APPROVAL_FLG = false ;
      A747TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n747TBW04_APPROVAL_DATETIME = false ;
      A748TBW04_APPROVAL_USER_ID = "" ;
      n748TBW04_APPROVAL_USER_ID = false ;
      A749TBW04_APPROVAL_AUTH_CD = "" ;
      n749TBW04_APPROVAL_AUTH_CD = false ;
      A750TBW04_INPUT_END_FLG = "" ;
      n750TBW04_INPUT_END_FLG = false ;
      A751TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n751TBW04_INPUT_END_DATETIME = false ;
      A752TBW04_INPUT_END_USER_ID = "" ;
      n752TBW04_INPUT_END_USER_ID = false ;
      A753TBW04_INPUT_END_AUTH_CD = "" ;
      n753TBW04_INPUT_END_AUTH_CD = false ;
      A754TBW04_COMPLETION_FLG = "" ;
      n754TBW04_COMPLETION_FLG = false ;
      A755TBW04_EDIT_FLG = "" ;
      n755TBW04_EDIT_FLG = false ;
   }

   public void initAll1742( )
   {
      A123TBW04_SESSION_ID = "" ;
      A124TBW04_APP_ID = "" ;
      A125TBW04_DISP_DATETIME = "" ;
      A126TBW04_STUDY_ID = 0 ;
      A127TBW04_SUBJECT_ID = 0 ;
      A128TBW04_CRF_ID = (short)(0) ;
      initializeNonKey1742( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow42( SdtTBW04_CRF obj42 )
   {
      obj42.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version( A735TBW04_CRF_LATEST_VERSION );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level( A736TBW04_CRF_INPUT_LEVEL );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg( A737TBW04_LOCK_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime( A738TBW04_LOCK_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id( A739TBW04_LOCK_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd( A740TBW04_LOCK_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime( A741TBW04_UPLOAD_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id( A742TBW04_UPLOAD_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd( A743TBW04_UPLOAD_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg( A744TBW04_DM_ARRIVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime( A745TBW04_DM_ARRIVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg( A746TBW04_APPROVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime( A747TBW04_APPROVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id( A748TBW04_APPROVAL_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd( A749TBW04_APPROVAL_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg( A750TBW04_INPUT_END_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime( A751TBW04_INPUT_END_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id( A752TBW04_INPUT_END_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd( A753TBW04_INPUT_END_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg( A754TBW04_COMPLETION_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg( A755TBW04_EDIT_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_session_id( A123TBW04_SESSION_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_app_id( A124TBW04_APP_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_disp_datetime( A125TBW04_DISP_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_study_id( A126TBW04_STUDY_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_subject_id( A127TBW04_SUBJECT_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_id( A128TBW04_CRF_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_session_id_Z( Z123TBW04_SESSION_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_app_id_Z( Z124TBW04_APP_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z( Z125TBW04_DISP_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_study_id_Z( Z126TBW04_STUDY_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_subject_id_Z( Z127TBW04_SUBJECT_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_id_Z( Z128TBW04_CRF_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z( Z735TBW04_CRF_LATEST_VERSION );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z( Z736TBW04_CRF_INPUT_LEVEL );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z( Z737TBW04_LOCK_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z( Z738TBW04_LOCK_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z( Z739TBW04_LOCK_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z( Z740TBW04_LOCK_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z( Z741TBW04_UPLOAD_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z( Z742TBW04_UPLOAD_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z( Z743TBW04_UPLOAD_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z( Z744TBW04_DM_ARRIVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z( Z745TBW04_DM_ARRIVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z( Z746TBW04_APPROVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z( Z747TBW04_APPROVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z( Z748TBW04_APPROVAL_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z( Z749TBW04_APPROVAL_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z( Z750TBW04_INPUT_END_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z( Z751TBW04_INPUT_END_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z( Z752TBW04_INPUT_END_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z( Z753TBW04_INPUT_END_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z( Z754TBW04_COMPLETION_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z( Z755TBW04_EDIT_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N( (byte)((byte)((n735TBW04_CRF_LATEST_VERSION)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N( (byte)((byte)((n736TBW04_CRF_INPUT_LEVEL)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg_N( (byte)((byte)((n737TBW04_LOCK_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N( (byte)((byte)((n738TBW04_LOCK_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N( (byte)((byte)((n739TBW04_LOCK_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N( (byte)((byte)((n740TBW04_LOCK_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N( (byte)((byte)((n741TBW04_UPLOAD_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N( (byte)((byte)((n742TBW04_UPLOAD_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N( (byte)((byte)((n743TBW04_UPLOAD_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N( (byte)((byte)((n744TBW04_DM_ARRIVAL_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N( (byte)((byte)((n745TBW04_DM_ARRIVAL_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg_N( (byte)((byte)((n746TBW04_APPROVAL_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N( (byte)((byte)((n747TBW04_APPROVAL_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N( (byte)((byte)((n748TBW04_APPROVAL_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N( (byte)((byte)((n749TBW04_APPROVAL_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N( (byte)((byte)((n750TBW04_INPUT_END_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N( (byte)((byte)((n751TBW04_INPUT_END_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N( (byte)((byte)((n752TBW04_INPUT_END_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N( (byte)((byte)((n753TBW04_INPUT_END_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg_N( (byte)((byte)((n754TBW04_COMPLETION_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg_N( (byte)((byte)((n755TBW04_EDIT_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
   }

   public void KeyVarsToRow42( SdtTBW04_CRF obj42 )
   {
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_session_id( A123TBW04_SESSION_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_app_id( A124TBW04_APP_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_disp_datetime( A125TBW04_DISP_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_study_id( A126TBW04_STUDY_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_subject_id( A127TBW04_SUBJECT_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_id( A128TBW04_CRF_ID );
   }

   public void RowToVars42( SdtTBW04_CRF obj42 ,
                            int forceLoad )
   {
      Gx_mode = obj42.getgxTv_SdtTBW04_CRF_Mode() ;
      A735TBW04_CRF_LATEST_VERSION = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version() ;
      n735TBW04_CRF_LATEST_VERSION = false ;
      A736TBW04_CRF_INPUT_LEVEL = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level() ;
      n736TBW04_CRF_INPUT_LEVEL = false ;
      A737TBW04_LOCK_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg() ;
      n737TBW04_LOCK_FLG = false ;
      A738TBW04_LOCK_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime() ;
      n738TBW04_LOCK_DATETIME = false ;
      A739TBW04_LOCK_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id() ;
      n739TBW04_LOCK_USER_ID = false ;
      A740TBW04_LOCK_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd() ;
      n740TBW04_LOCK_AUTH_CD = false ;
      A741TBW04_UPLOAD_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime() ;
      n741TBW04_UPLOAD_DATETIME = false ;
      A742TBW04_UPLOAD_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id() ;
      n742TBW04_UPLOAD_USER_ID = false ;
      A743TBW04_UPLOAD_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd() ;
      n743TBW04_UPLOAD_AUTH_CD = false ;
      A744TBW04_DM_ARRIVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg() ;
      n744TBW04_DM_ARRIVAL_FLG = false ;
      A745TBW04_DM_ARRIVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime() ;
      n745TBW04_DM_ARRIVAL_DATETIME = false ;
      A746TBW04_APPROVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg() ;
      n746TBW04_APPROVAL_FLG = false ;
      A747TBW04_APPROVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime() ;
      n747TBW04_APPROVAL_DATETIME = false ;
      A748TBW04_APPROVAL_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id() ;
      n748TBW04_APPROVAL_USER_ID = false ;
      A749TBW04_APPROVAL_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd() ;
      n749TBW04_APPROVAL_AUTH_CD = false ;
      A750TBW04_INPUT_END_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg() ;
      n750TBW04_INPUT_END_FLG = false ;
      A751TBW04_INPUT_END_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime() ;
      n751TBW04_INPUT_END_DATETIME = false ;
      A752TBW04_INPUT_END_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id() ;
      n752TBW04_INPUT_END_USER_ID = false ;
      A753TBW04_INPUT_END_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd() ;
      n753TBW04_INPUT_END_AUTH_CD = false ;
      A754TBW04_COMPLETION_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg() ;
      n754TBW04_COMPLETION_FLG = false ;
      A755TBW04_EDIT_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg() ;
      n755TBW04_EDIT_FLG = false ;
      A123TBW04_SESSION_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_session_id() ;
      A124TBW04_APP_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_app_id() ;
      A125TBW04_DISP_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_disp_datetime() ;
      A126TBW04_STUDY_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_study_id() ;
      A127TBW04_SUBJECT_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_subject_id() ;
      A128TBW04_CRF_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_id() ;
      Z123TBW04_SESSION_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_session_id_Z() ;
      Z124TBW04_APP_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_app_id_Z() ;
      Z125TBW04_DISP_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z() ;
      Z126TBW04_STUDY_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_study_id_Z() ;
      Z127TBW04_SUBJECT_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_subject_id_Z() ;
      Z128TBW04_CRF_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_id_Z() ;
      Z735TBW04_CRF_LATEST_VERSION = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z() ;
      Z736TBW04_CRF_INPUT_LEVEL = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z() ;
      Z737TBW04_LOCK_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z() ;
      Z738TBW04_LOCK_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z() ;
      Z739TBW04_LOCK_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z() ;
      Z740TBW04_LOCK_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z() ;
      Z741TBW04_UPLOAD_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z() ;
      Z742TBW04_UPLOAD_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z() ;
      Z743TBW04_UPLOAD_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z() ;
      Z744TBW04_DM_ARRIVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z() ;
      Z745TBW04_DM_ARRIVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z() ;
      Z746TBW04_APPROVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z() ;
      Z747TBW04_APPROVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z() ;
      Z748TBW04_APPROVAL_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z() ;
      Z749TBW04_APPROVAL_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z() ;
      Z750TBW04_INPUT_END_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z() ;
      Z751TBW04_INPUT_END_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z() ;
      Z752TBW04_INPUT_END_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z() ;
      Z753TBW04_INPUT_END_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z() ;
      Z754TBW04_COMPLETION_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z() ;
      Z755TBW04_EDIT_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z() ;
      n735TBW04_CRF_LATEST_VERSION = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N()==0)?false:true) ;
      n736TBW04_CRF_INPUT_LEVEL = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N()==0)?false:true) ;
      n737TBW04_LOCK_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg_N()==0)?false:true) ;
      n738TBW04_LOCK_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N()==0)?false:true) ;
      n739TBW04_LOCK_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N()==0)?false:true) ;
      n740TBW04_LOCK_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N()==0)?false:true) ;
      n741TBW04_UPLOAD_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N()==0)?false:true) ;
      n742TBW04_UPLOAD_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N()==0)?false:true) ;
      n743TBW04_UPLOAD_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N()==0)?false:true) ;
      n744TBW04_DM_ARRIVAL_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N()==0)?false:true) ;
      n745TBW04_DM_ARRIVAL_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N()==0)?false:true) ;
      n746TBW04_APPROVAL_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg_N()==0)?false:true) ;
      n747TBW04_APPROVAL_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N()==0)?false:true) ;
      n748TBW04_APPROVAL_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N()==0)?false:true) ;
      n749TBW04_APPROVAL_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N()==0)?false:true) ;
      n750TBW04_INPUT_END_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N()==0)?false:true) ;
      n751TBW04_INPUT_END_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N()==0)?false:true) ;
      n752TBW04_INPUT_END_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N()==0)?false:true) ;
      n753TBW04_INPUT_END_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N()==0)?false:true) ;
      n754TBW04_COMPLETION_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg_N()==0)?false:true) ;
      n755TBW04_EDIT_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg_N()==0)?false:true) ;
      Gx_mode = obj42.getgxTv_SdtTBW04_CRF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A123TBW04_SESSION_ID = (String)getParm(obj,0) ;
      A124TBW04_APP_ID = (String)getParm(obj,1) ;
      A125TBW04_DISP_DATETIME = (String)getParm(obj,2) ;
      A126TBW04_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A127TBW04_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A128TBW04_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1742( ) ;
      scanKeyStart1742( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z123TBW04_SESSION_ID = A123TBW04_SESSION_ID ;
         Z124TBW04_APP_ID = A124TBW04_APP_ID ;
         Z125TBW04_DISP_DATETIME = A125TBW04_DISP_DATETIME ;
         Z126TBW04_STUDY_ID = A126TBW04_STUDY_ID ;
         Z127TBW04_SUBJECT_ID = A127TBW04_SUBJECT_ID ;
         Z128TBW04_CRF_ID = A128TBW04_CRF_ID ;
      }
      zm1742( -6) ;
      onLoadActions1742( ) ;
      addRow1742( ) ;
      scanKeyEnd1742( ) ;
      if ( RcdFound42 == 0 )
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
      RowToVars42( bcTBW04_CRF, 0) ;
      scanKeyStart1742( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z123TBW04_SESSION_ID = A123TBW04_SESSION_ID ;
         Z124TBW04_APP_ID = A124TBW04_APP_ID ;
         Z125TBW04_DISP_DATETIME = A125TBW04_DISP_DATETIME ;
         Z126TBW04_STUDY_ID = A126TBW04_STUDY_ID ;
         Z127TBW04_SUBJECT_ID = A127TBW04_SUBJECT_ID ;
         Z128TBW04_CRF_ID = A128TBW04_CRF_ID ;
      }
      zm1742( -6) ;
      onLoadActions1742( ) ;
      addRow1742( ) ;
      scanKeyEnd1742( ) ;
      if ( RcdFound42 == 0 )
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
      RowToVars42( bcTBW04_CRF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1742( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1742( ) ;
      }
      else
      {
         if ( RcdFound42 == 1 )
         {
            if ( ( GXutil.strcmp(A123TBW04_SESSION_ID, Z123TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A124TBW04_APP_ID, Z124TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A125TBW04_DISP_DATETIME, Z125TBW04_DISP_DATETIME) != 0 ) || ( A126TBW04_STUDY_ID != Z126TBW04_STUDY_ID ) || ( A127TBW04_SUBJECT_ID != Z127TBW04_SUBJECT_ID ) || ( A128TBW04_CRF_ID != Z128TBW04_CRF_ID ) )
            {
               A123TBW04_SESSION_ID = Z123TBW04_SESSION_ID ;
               A124TBW04_APP_ID = Z124TBW04_APP_ID ;
               A125TBW04_DISP_DATETIME = Z125TBW04_DISP_DATETIME ;
               A126TBW04_STUDY_ID = Z126TBW04_STUDY_ID ;
               A127TBW04_SUBJECT_ID = Z127TBW04_SUBJECT_ID ;
               A128TBW04_CRF_ID = Z128TBW04_CRF_ID ;
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
               update1742( ) ;
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
               if ( ( GXutil.strcmp(A123TBW04_SESSION_ID, Z123TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A124TBW04_APP_ID, Z124TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A125TBW04_DISP_DATETIME, Z125TBW04_DISP_DATETIME) != 0 ) || ( A126TBW04_STUDY_ID != Z126TBW04_STUDY_ID ) || ( A127TBW04_SUBJECT_ID != Z127TBW04_SUBJECT_ID ) || ( A128TBW04_CRF_ID != Z128TBW04_CRF_ID ) )
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
                     insert1742( ) ;
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
                     insert1742( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow42( bcTBW04_CRF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars42( bcTBW04_CRF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1742( ) ;
      if ( RcdFound42 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A123TBW04_SESSION_ID, Z123TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A124TBW04_APP_ID, Z124TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A125TBW04_DISP_DATETIME, Z125TBW04_DISP_DATETIME) != 0 ) || ( A126TBW04_STUDY_ID != Z126TBW04_STUDY_ID ) || ( A127TBW04_SUBJECT_ID != Z127TBW04_SUBJECT_ID ) || ( A128TBW04_CRF_ID != Z128TBW04_CRF_ID ) )
         {
            A123TBW04_SESSION_ID = Z123TBW04_SESSION_ID ;
            A124TBW04_APP_ID = Z124TBW04_APP_ID ;
            A125TBW04_DISP_DATETIME = Z125TBW04_DISP_DATETIME ;
            A126TBW04_STUDY_ID = Z126TBW04_STUDY_ID ;
            A127TBW04_SUBJECT_ID = Z127TBW04_SUBJECT_ID ;
            A128TBW04_CRF_ID = Z128TBW04_CRF_ID ;
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
         if ( ( GXutil.strcmp(A123TBW04_SESSION_ID, Z123TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A124TBW04_APP_ID, Z124TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A125TBW04_DISP_DATETIME, Z125TBW04_DISP_DATETIME) != 0 ) || ( A126TBW04_STUDY_ID != Z126TBW04_STUDY_ID ) || ( A127TBW04_SUBJECT_ID != Z127TBW04_SUBJECT_ID ) || ( A128TBW04_CRF_ID != Z128TBW04_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw04_crf_bc");
      VarsToRow42( bcTBW04_CRF) ;
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
      Gx_mode = bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW04_CRF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW04_CRF )
      {
         bcTBW04_CRF = sdt ;
         if ( GXutil.strcmp(bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode(), "") == 0 )
         {
            bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow42( bcTBW04_CRF) ;
         }
         else
         {
            RowToVars42( bcTBW04_CRF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode(), "") == 0 )
         {
            bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars42( bcTBW04_CRF, 1) ;
   }

   public SdtTBW04_CRF getTBW04_CRF_BC( )
   {
      return bcTBW04_CRF ;
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
      Z123TBW04_SESSION_ID = "" ;
      A123TBW04_SESSION_ID = "" ;
      Z124TBW04_APP_ID = "" ;
      A124TBW04_APP_ID = "" ;
      Z125TBW04_DISP_DATETIME = "" ;
      A125TBW04_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z737TBW04_LOCK_FLG = "" ;
      A737TBW04_LOCK_FLG = "" ;
      Z738TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A738TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z739TBW04_LOCK_USER_ID = "" ;
      A739TBW04_LOCK_USER_ID = "" ;
      Z740TBW04_LOCK_AUTH_CD = "" ;
      A740TBW04_LOCK_AUTH_CD = "" ;
      Z741TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A741TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z742TBW04_UPLOAD_USER_ID = "" ;
      A742TBW04_UPLOAD_USER_ID = "" ;
      Z743TBW04_UPLOAD_AUTH_CD = "" ;
      A743TBW04_UPLOAD_AUTH_CD = "" ;
      Z744TBW04_DM_ARRIVAL_FLG = "" ;
      A744TBW04_DM_ARRIVAL_FLG = "" ;
      Z745TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A745TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z746TBW04_APPROVAL_FLG = "" ;
      A746TBW04_APPROVAL_FLG = "" ;
      Z747TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A747TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z748TBW04_APPROVAL_USER_ID = "" ;
      A748TBW04_APPROVAL_USER_ID = "" ;
      Z749TBW04_APPROVAL_AUTH_CD = "" ;
      A749TBW04_APPROVAL_AUTH_CD = "" ;
      Z750TBW04_INPUT_END_FLG = "" ;
      A750TBW04_INPUT_END_FLG = "" ;
      Z751TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A751TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z752TBW04_INPUT_END_USER_ID = "" ;
      A752TBW04_INPUT_END_USER_ID = "" ;
      Z753TBW04_INPUT_END_AUTH_CD = "" ;
      A753TBW04_INPUT_END_AUTH_CD = "" ;
      Z754TBW04_COMPLETION_FLG = "" ;
      A754TBW04_COMPLETION_FLG = "" ;
      Z755TBW04_EDIT_FLG = "" ;
      A755TBW04_EDIT_FLG = "" ;
      BC00174_A123TBW04_SESSION_ID = new String[] {""} ;
      BC00174_A124TBW04_APP_ID = new String[] {""} ;
      BC00174_A125TBW04_DISP_DATETIME = new String[] {""} ;
      BC00174_A126TBW04_STUDY_ID = new long[1] ;
      BC00174_A127TBW04_SUBJECT_ID = new int[1] ;
      BC00174_A128TBW04_CRF_ID = new short[1] ;
      BC00174_A735TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00174_n735TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00174_A736TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00174_n736TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00174_A737TBW04_LOCK_FLG = new String[] {""} ;
      BC00174_n737TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00174_A738TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n738TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00174_A739TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00174_n739TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00174_A740TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00174_n740TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00174_A741TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n741TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00174_A742TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00174_n742TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00174_A743TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00174_n743TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00174_A744TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00174_n744TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00174_A745TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n745TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00174_A746TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00174_n746TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00174_A747TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n747TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00174_A748TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00174_n748TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00174_A749TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00174_n749TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00174_A750TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00174_n750TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00174_A751TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n751TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00174_A752TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00174_n752TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00174_A753TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00174_n753TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00174_A754TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00174_n754TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00174_A755TBW04_EDIT_FLG = new String[] {""} ;
      BC00174_n755TBW04_EDIT_FLG = new boolean[] {false} ;
      BC00175_A123TBW04_SESSION_ID = new String[] {""} ;
      BC00175_A124TBW04_APP_ID = new String[] {""} ;
      BC00175_A125TBW04_DISP_DATETIME = new String[] {""} ;
      BC00175_A126TBW04_STUDY_ID = new long[1] ;
      BC00175_A127TBW04_SUBJECT_ID = new int[1] ;
      BC00175_A128TBW04_CRF_ID = new short[1] ;
      BC00173_A123TBW04_SESSION_ID = new String[] {""} ;
      BC00173_A124TBW04_APP_ID = new String[] {""} ;
      BC00173_A125TBW04_DISP_DATETIME = new String[] {""} ;
      BC00173_A126TBW04_STUDY_ID = new long[1] ;
      BC00173_A127TBW04_SUBJECT_ID = new int[1] ;
      BC00173_A128TBW04_CRF_ID = new short[1] ;
      BC00173_A735TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00173_n735TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00173_A736TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00173_n736TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00173_A737TBW04_LOCK_FLG = new String[] {""} ;
      BC00173_n737TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00173_A738TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n738TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00173_A739TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00173_n739TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00173_A740TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00173_n740TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00173_A741TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n741TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00173_A742TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00173_n742TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00173_A743TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00173_n743TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00173_A744TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00173_n744TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00173_A745TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n745TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00173_A746TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00173_n746TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00173_A747TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n747TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00173_A748TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00173_n748TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00173_A749TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00173_n749TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00173_A750TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00173_n750TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00173_A751TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n751TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00173_A752TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00173_n752TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00173_A753TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00173_n753TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00173_A754TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00173_n754TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00173_A755TBW04_EDIT_FLG = new String[] {""} ;
      BC00173_n755TBW04_EDIT_FLG = new boolean[] {false} ;
      sMode42 = "" ;
      BC00172_A123TBW04_SESSION_ID = new String[] {""} ;
      BC00172_A124TBW04_APP_ID = new String[] {""} ;
      BC00172_A125TBW04_DISP_DATETIME = new String[] {""} ;
      BC00172_A126TBW04_STUDY_ID = new long[1] ;
      BC00172_A127TBW04_SUBJECT_ID = new int[1] ;
      BC00172_A128TBW04_CRF_ID = new short[1] ;
      BC00172_A735TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00172_n735TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00172_A736TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00172_n736TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00172_A737TBW04_LOCK_FLG = new String[] {""} ;
      BC00172_n737TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00172_A738TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n738TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00172_A739TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00172_n739TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00172_A740TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00172_n740TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00172_A741TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n741TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00172_A742TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00172_n742TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00172_A743TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00172_n743TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00172_A744TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00172_n744TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00172_A745TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n745TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00172_A746TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00172_n746TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00172_A747TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n747TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00172_A748TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00172_n748TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00172_A749TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00172_n749TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00172_A750TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00172_n750TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00172_A751TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n751TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00172_A752TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00172_n752TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00172_A753TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00172_n753TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00172_A754TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00172_n754TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00172_A755TBW04_EDIT_FLG = new String[] {""} ;
      BC00172_n755TBW04_EDIT_FLG = new boolean[] {false} ;
      BC00179_A123TBW04_SESSION_ID = new String[] {""} ;
      BC00179_A124TBW04_APP_ID = new String[] {""} ;
      BC00179_A125TBW04_DISP_DATETIME = new String[] {""} ;
      BC00179_A126TBW04_STUDY_ID = new long[1] ;
      BC00179_A127TBW04_SUBJECT_ID = new int[1] ;
      BC00179_A128TBW04_CRF_ID = new short[1] ;
      BC00179_A735TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00179_n735TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00179_A736TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00179_n736TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00179_A737TBW04_LOCK_FLG = new String[] {""} ;
      BC00179_n737TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00179_A738TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n738TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00179_A739TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00179_n739TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00179_A740TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00179_n740TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00179_A741TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n741TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00179_A742TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00179_n742TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00179_A743TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00179_n743TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00179_A744TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00179_n744TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00179_A745TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n745TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00179_A746TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00179_n746TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00179_A747TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n747TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00179_A748TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00179_n748TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00179_A749TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00179_n749TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00179_A750TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00179_n750TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00179_A751TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n751TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00179_A752TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00179_n752TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00179_A753TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00179_n753TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00179_A754TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00179_n754TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00179_A755TBW04_EDIT_FLG = new String[] {""} ;
      BC00179_n755TBW04_EDIT_FLG = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw04_crf_bc__default(),
         new Object[] {
             new Object[] {
            BC00172_A123TBW04_SESSION_ID, BC00172_A124TBW04_APP_ID, BC00172_A125TBW04_DISP_DATETIME, BC00172_A126TBW04_STUDY_ID, BC00172_A127TBW04_SUBJECT_ID, BC00172_A128TBW04_CRF_ID, BC00172_A735TBW04_CRF_LATEST_VERSION, BC00172_n735TBW04_CRF_LATEST_VERSION, BC00172_A736TBW04_CRF_INPUT_LEVEL, BC00172_n736TBW04_CRF_INPUT_LEVEL,
            BC00172_A737TBW04_LOCK_FLG, BC00172_n737TBW04_LOCK_FLG, BC00172_A738TBW04_LOCK_DATETIME, BC00172_n738TBW04_LOCK_DATETIME, BC00172_A739TBW04_LOCK_USER_ID, BC00172_n739TBW04_LOCK_USER_ID, BC00172_A740TBW04_LOCK_AUTH_CD, BC00172_n740TBW04_LOCK_AUTH_CD, BC00172_A741TBW04_UPLOAD_DATETIME, BC00172_n741TBW04_UPLOAD_DATETIME,
            BC00172_A742TBW04_UPLOAD_USER_ID, BC00172_n742TBW04_UPLOAD_USER_ID, BC00172_A743TBW04_UPLOAD_AUTH_CD, BC00172_n743TBW04_UPLOAD_AUTH_CD, BC00172_A744TBW04_DM_ARRIVAL_FLG, BC00172_n744TBW04_DM_ARRIVAL_FLG, BC00172_A745TBW04_DM_ARRIVAL_DATETIME, BC00172_n745TBW04_DM_ARRIVAL_DATETIME, BC00172_A746TBW04_APPROVAL_FLG, BC00172_n746TBW04_APPROVAL_FLG,
            BC00172_A747TBW04_APPROVAL_DATETIME, BC00172_n747TBW04_APPROVAL_DATETIME, BC00172_A748TBW04_APPROVAL_USER_ID, BC00172_n748TBW04_APPROVAL_USER_ID, BC00172_A749TBW04_APPROVAL_AUTH_CD, BC00172_n749TBW04_APPROVAL_AUTH_CD, BC00172_A750TBW04_INPUT_END_FLG, BC00172_n750TBW04_INPUT_END_FLG, BC00172_A751TBW04_INPUT_END_DATETIME, BC00172_n751TBW04_INPUT_END_DATETIME,
            BC00172_A752TBW04_INPUT_END_USER_ID, BC00172_n752TBW04_INPUT_END_USER_ID, BC00172_A753TBW04_INPUT_END_AUTH_CD, BC00172_n753TBW04_INPUT_END_AUTH_CD, BC00172_A754TBW04_COMPLETION_FLG, BC00172_n754TBW04_COMPLETION_FLG, BC00172_A755TBW04_EDIT_FLG, BC00172_n755TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00173_A123TBW04_SESSION_ID, BC00173_A124TBW04_APP_ID, BC00173_A125TBW04_DISP_DATETIME, BC00173_A126TBW04_STUDY_ID, BC00173_A127TBW04_SUBJECT_ID, BC00173_A128TBW04_CRF_ID, BC00173_A735TBW04_CRF_LATEST_VERSION, BC00173_n735TBW04_CRF_LATEST_VERSION, BC00173_A736TBW04_CRF_INPUT_LEVEL, BC00173_n736TBW04_CRF_INPUT_LEVEL,
            BC00173_A737TBW04_LOCK_FLG, BC00173_n737TBW04_LOCK_FLG, BC00173_A738TBW04_LOCK_DATETIME, BC00173_n738TBW04_LOCK_DATETIME, BC00173_A739TBW04_LOCK_USER_ID, BC00173_n739TBW04_LOCK_USER_ID, BC00173_A740TBW04_LOCK_AUTH_CD, BC00173_n740TBW04_LOCK_AUTH_CD, BC00173_A741TBW04_UPLOAD_DATETIME, BC00173_n741TBW04_UPLOAD_DATETIME,
            BC00173_A742TBW04_UPLOAD_USER_ID, BC00173_n742TBW04_UPLOAD_USER_ID, BC00173_A743TBW04_UPLOAD_AUTH_CD, BC00173_n743TBW04_UPLOAD_AUTH_CD, BC00173_A744TBW04_DM_ARRIVAL_FLG, BC00173_n744TBW04_DM_ARRIVAL_FLG, BC00173_A745TBW04_DM_ARRIVAL_DATETIME, BC00173_n745TBW04_DM_ARRIVAL_DATETIME, BC00173_A746TBW04_APPROVAL_FLG, BC00173_n746TBW04_APPROVAL_FLG,
            BC00173_A747TBW04_APPROVAL_DATETIME, BC00173_n747TBW04_APPROVAL_DATETIME, BC00173_A748TBW04_APPROVAL_USER_ID, BC00173_n748TBW04_APPROVAL_USER_ID, BC00173_A749TBW04_APPROVAL_AUTH_CD, BC00173_n749TBW04_APPROVAL_AUTH_CD, BC00173_A750TBW04_INPUT_END_FLG, BC00173_n750TBW04_INPUT_END_FLG, BC00173_A751TBW04_INPUT_END_DATETIME, BC00173_n751TBW04_INPUT_END_DATETIME,
            BC00173_A752TBW04_INPUT_END_USER_ID, BC00173_n752TBW04_INPUT_END_USER_ID, BC00173_A753TBW04_INPUT_END_AUTH_CD, BC00173_n753TBW04_INPUT_END_AUTH_CD, BC00173_A754TBW04_COMPLETION_FLG, BC00173_n754TBW04_COMPLETION_FLG, BC00173_A755TBW04_EDIT_FLG, BC00173_n755TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00174_A123TBW04_SESSION_ID, BC00174_A124TBW04_APP_ID, BC00174_A125TBW04_DISP_DATETIME, BC00174_A126TBW04_STUDY_ID, BC00174_A127TBW04_SUBJECT_ID, BC00174_A128TBW04_CRF_ID, BC00174_A735TBW04_CRF_LATEST_VERSION, BC00174_n735TBW04_CRF_LATEST_VERSION, BC00174_A736TBW04_CRF_INPUT_LEVEL, BC00174_n736TBW04_CRF_INPUT_LEVEL,
            BC00174_A737TBW04_LOCK_FLG, BC00174_n737TBW04_LOCK_FLG, BC00174_A738TBW04_LOCK_DATETIME, BC00174_n738TBW04_LOCK_DATETIME, BC00174_A739TBW04_LOCK_USER_ID, BC00174_n739TBW04_LOCK_USER_ID, BC00174_A740TBW04_LOCK_AUTH_CD, BC00174_n740TBW04_LOCK_AUTH_CD, BC00174_A741TBW04_UPLOAD_DATETIME, BC00174_n741TBW04_UPLOAD_DATETIME,
            BC00174_A742TBW04_UPLOAD_USER_ID, BC00174_n742TBW04_UPLOAD_USER_ID, BC00174_A743TBW04_UPLOAD_AUTH_CD, BC00174_n743TBW04_UPLOAD_AUTH_CD, BC00174_A744TBW04_DM_ARRIVAL_FLG, BC00174_n744TBW04_DM_ARRIVAL_FLG, BC00174_A745TBW04_DM_ARRIVAL_DATETIME, BC00174_n745TBW04_DM_ARRIVAL_DATETIME, BC00174_A746TBW04_APPROVAL_FLG, BC00174_n746TBW04_APPROVAL_FLG,
            BC00174_A747TBW04_APPROVAL_DATETIME, BC00174_n747TBW04_APPROVAL_DATETIME, BC00174_A748TBW04_APPROVAL_USER_ID, BC00174_n748TBW04_APPROVAL_USER_ID, BC00174_A749TBW04_APPROVAL_AUTH_CD, BC00174_n749TBW04_APPROVAL_AUTH_CD, BC00174_A750TBW04_INPUT_END_FLG, BC00174_n750TBW04_INPUT_END_FLG, BC00174_A751TBW04_INPUT_END_DATETIME, BC00174_n751TBW04_INPUT_END_DATETIME,
            BC00174_A752TBW04_INPUT_END_USER_ID, BC00174_n752TBW04_INPUT_END_USER_ID, BC00174_A753TBW04_INPUT_END_AUTH_CD, BC00174_n753TBW04_INPUT_END_AUTH_CD, BC00174_A754TBW04_COMPLETION_FLG, BC00174_n754TBW04_COMPLETION_FLG, BC00174_A755TBW04_EDIT_FLG, BC00174_n755TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00175_A123TBW04_SESSION_ID, BC00175_A124TBW04_APP_ID, BC00175_A125TBW04_DISP_DATETIME, BC00175_A126TBW04_STUDY_ID, BC00175_A127TBW04_SUBJECT_ID, BC00175_A128TBW04_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00179_A123TBW04_SESSION_ID, BC00179_A124TBW04_APP_ID, BC00179_A125TBW04_DISP_DATETIME, BC00179_A126TBW04_STUDY_ID, BC00179_A127TBW04_SUBJECT_ID, BC00179_A128TBW04_CRF_ID, BC00179_A735TBW04_CRF_LATEST_VERSION, BC00179_n735TBW04_CRF_LATEST_VERSION, BC00179_A736TBW04_CRF_INPUT_LEVEL, BC00179_n736TBW04_CRF_INPUT_LEVEL,
            BC00179_A737TBW04_LOCK_FLG, BC00179_n737TBW04_LOCK_FLG, BC00179_A738TBW04_LOCK_DATETIME, BC00179_n738TBW04_LOCK_DATETIME, BC00179_A739TBW04_LOCK_USER_ID, BC00179_n739TBW04_LOCK_USER_ID, BC00179_A740TBW04_LOCK_AUTH_CD, BC00179_n740TBW04_LOCK_AUTH_CD, BC00179_A741TBW04_UPLOAD_DATETIME, BC00179_n741TBW04_UPLOAD_DATETIME,
            BC00179_A742TBW04_UPLOAD_USER_ID, BC00179_n742TBW04_UPLOAD_USER_ID, BC00179_A743TBW04_UPLOAD_AUTH_CD, BC00179_n743TBW04_UPLOAD_AUTH_CD, BC00179_A744TBW04_DM_ARRIVAL_FLG, BC00179_n744TBW04_DM_ARRIVAL_FLG, BC00179_A745TBW04_DM_ARRIVAL_DATETIME, BC00179_n745TBW04_DM_ARRIVAL_DATETIME, BC00179_A746TBW04_APPROVAL_FLG, BC00179_n746TBW04_APPROVAL_FLG,
            BC00179_A747TBW04_APPROVAL_DATETIME, BC00179_n747TBW04_APPROVAL_DATETIME, BC00179_A748TBW04_APPROVAL_USER_ID, BC00179_n748TBW04_APPROVAL_USER_ID, BC00179_A749TBW04_APPROVAL_AUTH_CD, BC00179_n749TBW04_APPROVAL_AUTH_CD, BC00179_A750TBW04_INPUT_END_FLG, BC00179_n750TBW04_INPUT_END_FLG, BC00179_A751TBW04_INPUT_END_DATETIME, BC00179_n751TBW04_INPUT_END_DATETIME,
            BC00179_A752TBW04_INPUT_END_USER_ID, BC00179_n752TBW04_INPUT_END_USER_ID, BC00179_A753TBW04_INPUT_END_AUTH_CD, BC00179_n753TBW04_INPUT_END_AUTH_CD, BC00179_A754TBW04_COMPLETION_FLG, BC00179_n754TBW04_COMPLETION_FLG, BC00179_A755TBW04_EDIT_FLG, BC00179_n755TBW04_EDIT_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW04_CRF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11172 */
      e11172 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z736TBW04_CRF_INPUT_LEVEL ;
   private byte A736TBW04_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z128TBW04_CRF_ID ;
   private short A128TBW04_CRF_ID ;
   private short Z735TBW04_CRF_LATEST_VERSION ;
   private short A735TBW04_CRF_LATEST_VERSION ;
   private short RcdFound42 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z127TBW04_SUBJECT_ID ;
   private int A127TBW04_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z126TBW04_STUDY_ID ;
   private long A126TBW04_STUDY_ID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode42 ;
   private String Gx_emsg ;
   private java.util.Date Z738TBW04_LOCK_DATETIME ;
   private java.util.Date A738TBW04_LOCK_DATETIME ;
   private java.util.Date Z741TBW04_UPLOAD_DATETIME ;
   private java.util.Date A741TBW04_UPLOAD_DATETIME ;
   private java.util.Date Z745TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date A745TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z747TBW04_APPROVAL_DATETIME ;
   private java.util.Date A747TBW04_APPROVAL_DATETIME ;
   private java.util.Date Z751TBW04_INPUT_END_DATETIME ;
   private java.util.Date A751TBW04_INPUT_END_DATETIME ;
   private boolean n735TBW04_CRF_LATEST_VERSION ;
   private boolean n736TBW04_CRF_INPUT_LEVEL ;
   private boolean n737TBW04_LOCK_FLG ;
   private boolean n738TBW04_LOCK_DATETIME ;
   private boolean n739TBW04_LOCK_USER_ID ;
   private boolean n740TBW04_LOCK_AUTH_CD ;
   private boolean n741TBW04_UPLOAD_DATETIME ;
   private boolean n742TBW04_UPLOAD_USER_ID ;
   private boolean n743TBW04_UPLOAD_AUTH_CD ;
   private boolean n744TBW04_DM_ARRIVAL_FLG ;
   private boolean n745TBW04_DM_ARRIVAL_DATETIME ;
   private boolean n746TBW04_APPROVAL_FLG ;
   private boolean n747TBW04_APPROVAL_DATETIME ;
   private boolean n748TBW04_APPROVAL_USER_ID ;
   private boolean n749TBW04_APPROVAL_AUTH_CD ;
   private boolean n750TBW04_INPUT_END_FLG ;
   private boolean n751TBW04_INPUT_END_DATETIME ;
   private boolean n752TBW04_INPUT_END_USER_ID ;
   private boolean n753TBW04_INPUT_END_AUTH_CD ;
   private boolean n754TBW04_COMPLETION_FLG ;
   private boolean n755TBW04_EDIT_FLG ;
   private boolean Gx_longc ;
   private String Z123TBW04_SESSION_ID ;
   private String A123TBW04_SESSION_ID ;
   private String Z124TBW04_APP_ID ;
   private String A124TBW04_APP_ID ;
   private String Z125TBW04_DISP_DATETIME ;
   private String A125TBW04_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String Z737TBW04_LOCK_FLG ;
   private String A737TBW04_LOCK_FLG ;
   private String Z739TBW04_LOCK_USER_ID ;
   private String A739TBW04_LOCK_USER_ID ;
   private String Z740TBW04_LOCK_AUTH_CD ;
   private String A740TBW04_LOCK_AUTH_CD ;
   private String Z742TBW04_UPLOAD_USER_ID ;
   private String A742TBW04_UPLOAD_USER_ID ;
   private String Z743TBW04_UPLOAD_AUTH_CD ;
   private String A743TBW04_UPLOAD_AUTH_CD ;
   private String Z744TBW04_DM_ARRIVAL_FLG ;
   private String A744TBW04_DM_ARRIVAL_FLG ;
   private String Z746TBW04_APPROVAL_FLG ;
   private String A746TBW04_APPROVAL_FLG ;
   private String Z748TBW04_APPROVAL_USER_ID ;
   private String A748TBW04_APPROVAL_USER_ID ;
   private String Z749TBW04_APPROVAL_AUTH_CD ;
   private String A749TBW04_APPROVAL_AUTH_CD ;
   private String Z750TBW04_INPUT_END_FLG ;
   private String A750TBW04_INPUT_END_FLG ;
   private String Z752TBW04_INPUT_END_USER_ID ;
   private String A752TBW04_INPUT_END_USER_ID ;
   private String Z753TBW04_INPUT_END_AUTH_CD ;
   private String A753TBW04_INPUT_END_AUTH_CD ;
   private String Z754TBW04_COMPLETION_FLG ;
   private String A754TBW04_COMPLETION_FLG ;
   private String Z755TBW04_EDIT_FLG ;
   private String A755TBW04_EDIT_FLG ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW04_CRF bcTBW04_CRF ;
   private IDataStoreProvider pr_default ;
   private String[] BC00174_A123TBW04_SESSION_ID ;
   private String[] BC00174_A124TBW04_APP_ID ;
   private String[] BC00174_A125TBW04_DISP_DATETIME ;
   private long[] BC00174_A126TBW04_STUDY_ID ;
   private int[] BC00174_A127TBW04_SUBJECT_ID ;
   private short[] BC00174_A128TBW04_CRF_ID ;
   private short[] BC00174_A735TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00174_n735TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00174_A736TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00174_n736TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00174_A737TBW04_LOCK_FLG ;
   private boolean[] BC00174_n737TBW04_LOCK_FLG ;
   private java.util.Date[] BC00174_A738TBW04_LOCK_DATETIME ;
   private boolean[] BC00174_n738TBW04_LOCK_DATETIME ;
   private String[] BC00174_A739TBW04_LOCK_USER_ID ;
   private boolean[] BC00174_n739TBW04_LOCK_USER_ID ;
   private String[] BC00174_A740TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00174_n740TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00174_A741TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00174_n741TBW04_UPLOAD_DATETIME ;
   private String[] BC00174_A742TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00174_n742TBW04_UPLOAD_USER_ID ;
   private String[] BC00174_A743TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00174_n743TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00174_A744TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00174_n744TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00174_A745TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00174_n745TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00174_A746TBW04_APPROVAL_FLG ;
   private boolean[] BC00174_n746TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00174_A747TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00174_n747TBW04_APPROVAL_DATETIME ;
   private String[] BC00174_A748TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00174_n748TBW04_APPROVAL_USER_ID ;
   private String[] BC00174_A749TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00174_n749TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00174_A750TBW04_INPUT_END_FLG ;
   private boolean[] BC00174_n750TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00174_A751TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00174_n751TBW04_INPUT_END_DATETIME ;
   private String[] BC00174_A752TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00174_n752TBW04_INPUT_END_USER_ID ;
   private String[] BC00174_A753TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00174_n753TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00174_A754TBW04_COMPLETION_FLG ;
   private boolean[] BC00174_n754TBW04_COMPLETION_FLG ;
   private String[] BC00174_A755TBW04_EDIT_FLG ;
   private boolean[] BC00174_n755TBW04_EDIT_FLG ;
   private String[] BC00175_A123TBW04_SESSION_ID ;
   private String[] BC00175_A124TBW04_APP_ID ;
   private String[] BC00175_A125TBW04_DISP_DATETIME ;
   private long[] BC00175_A126TBW04_STUDY_ID ;
   private int[] BC00175_A127TBW04_SUBJECT_ID ;
   private short[] BC00175_A128TBW04_CRF_ID ;
   private String[] BC00173_A123TBW04_SESSION_ID ;
   private String[] BC00173_A124TBW04_APP_ID ;
   private String[] BC00173_A125TBW04_DISP_DATETIME ;
   private long[] BC00173_A126TBW04_STUDY_ID ;
   private int[] BC00173_A127TBW04_SUBJECT_ID ;
   private short[] BC00173_A128TBW04_CRF_ID ;
   private short[] BC00173_A735TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00173_n735TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00173_A736TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00173_n736TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00173_A737TBW04_LOCK_FLG ;
   private boolean[] BC00173_n737TBW04_LOCK_FLG ;
   private java.util.Date[] BC00173_A738TBW04_LOCK_DATETIME ;
   private boolean[] BC00173_n738TBW04_LOCK_DATETIME ;
   private String[] BC00173_A739TBW04_LOCK_USER_ID ;
   private boolean[] BC00173_n739TBW04_LOCK_USER_ID ;
   private String[] BC00173_A740TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00173_n740TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00173_A741TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00173_n741TBW04_UPLOAD_DATETIME ;
   private String[] BC00173_A742TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00173_n742TBW04_UPLOAD_USER_ID ;
   private String[] BC00173_A743TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00173_n743TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00173_A744TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00173_n744TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00173_A745TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00173_n745TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00173_A746TBW04_APPROVAL_FLG ;
   private boolean[] BC00173_n746TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00173_A747TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00173_n747TBW04_APPROVAL_DATETIME ;
   private String[] BC00173_A748TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00173_n748TBW04_APPROVAL_USER_ID ;
   private String[] BC00173_A749TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00173_n749TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00173_A750TBW04_INPUT_END_FLG ;
   private boolean[] BC00173_n750TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00173_A751TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00173_n751TBW04_INPUT_END_DATETIME ;
   private String[] BC00173_A752TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00173_n752TBW04_INPUT_END_USER_ID ;
   private String[] BC00173_A753TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00173_n753TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00173_A754TBW04_COMPLETION_FLG ;
   private boolean[] BC00173_n754TBW04_COMPLETION_FLG ;
   private String[] BC00173_A755TBW04_EDIT_FLG ;
   private boolean[] BC00173_n755TBW04_EDIT_FLG ;
   private String[] BC00172_A123TBW04_SESSION_ID ;
   private String[] BC00172_A124TBW04_APP_ID ;
   private String[] BC00172_A125TBW04_DISP_DATETIME ;
   private long[] BC00172_A126TBW04_STUDY_ID ;
   private int[] BC00172_A127TBW04_SUBJECT_ID ;
   private short[] BC00172_A128TBW04_CRF_ID ;
   private short[] BC00172_A735TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00172_n735TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00172_A736TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00172_n736TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00172_A737TBW04_LOCK_FLG ;
   private boolean[] BC00172_n737TBW04_LOCK_FLG ;
   private java.util.Date[] BC00172_A738TBW04_LOCK_DATETIME ;
   private boolean[] BC00172_n738TBW04_LOCK_DATETIME ;
   private String[] BC00172_A739TBW04_LOCK_USER_ID ;
   private boolean[] BC00172_n739TBW04_LOCK_USER_ID ;
   private String[] BC00172_A740TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00172_n740TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00172_A741TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00172_n741TBW04_UPLOAD_DATETIME ;
   private String[] BC00172_A742TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00172_n742TBW04_UPLOAD_USER_ID ;
   private String[] BC00172_A743TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00172_n743TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00172_A744TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00172_n744TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00172_A745TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00172_n745TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00172_A746TBW04_APPROVAL_FLG ;
   private boolean[] BC00172_n746TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00172_A747TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00172_n747TBW04_APPROVAL_DATETIME ;
   private String[] BC00172_A748TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00172_n748TBW04_APPROVAL_USER_ID ;
   private String[] BC00172_A749TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00172_n749TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00172_A750TBW04_INPUT_END_FLG ;
   private boolean[] BC00172_n750TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00172_A751TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00172_n751TBW04_INPUT_END_DATETIME ;
   private String[] BC00172_A752TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00172_n752TBW04_INPUT_END_USER_ID ;
   private String[] BC00172_A753TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00172_n753TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00172_A754TBW04_COMPLETION_FLG ;
   private boolean[] BC00172_n754TBW04_COMPLETION_FLG ;
   private String[] BC00172_A755TBW04_EDIT_FLG ;
   private boolean[] BC00172_n755TBW04_EDIT_FLG ;
   private String[] BC00179_A123TBW04_SESSION_ID ;
   private String[] BC00179_A124TBW04_APP_ID ;
   private String[] BC00179_A125TBW04_DISP_DATETIME ;
   private long[] BC00179_A126TBW04_STUDY_ID ;
   private int[] BC00179_A127TBW04_SUBJECT_ID ;
   private short[] BC00179_A128TBW04_CRF_ID ;
   private short[] BC00179_A735TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00179_n735TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00179_A736TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00179_n736TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00179_A737TBW04_LOCK_FLG ;
   private boolean[] BC00179_n737TBW04_LOCK_FLG ;
   private java.util.Date[] BC00179_A738TBW04_LOCK_DATETIME ;
   private boolean[] BC00179_n738TBW04_LOCK_DATETIME ;
   private String[] BC00179_A739TBW04_LOCK_USER_ID ;
   private boolean[] BC00179_n739TBW04_LOCK_USER_ID ;
   private String[] BC00179_A740TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00179_n740TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00179_A741TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00179_n741TBW04_UPLOAD_DATETIME ;
   private String[] BC00179_A742TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00179_n742TBW04_UPLOAD_USER_ID ;
   private String[] BC00179_A743TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00179_n743TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00179_A744TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00179_n744TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00179_A745TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00179_n745TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00179_A746TBW04_APPROVAL_FLG ;
   private boolean[] BC00179_n746TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00179_A747TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00179_n747TBW04_APPROVAL_DATETIME ;
   private String[] BC00179_A748TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00179_n748TBW04_APPROVAL_USER_ID ;
   private String[] BC00179_A749TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00179_n749TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00179_A750TBW04_INPUT_END_FLG ;
   private boolean[] BC00179_n750TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00179_A751TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00179_n751TBW04_INPUT_END_DATETIME ;
   private String[] BC00179_A752TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00179_n752TBW04_INPUT_END_USER_ID ;
   private String[] BC00179_A753TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00179_n753TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00179_A754TBW04_COMPLETION_FLG ;
   private boolean[] BC00179_n754TBW04_COMPLETION_FLG ;
   private String[] BC00179_A755TBW04_EDIT_FLG ;
   private boolean[] BC00179_n755TBW04_EDIT_FLG ;
}

final  class tbw04_crf_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00172", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00173", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00174", "SELECT TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID`, TM1.`TBW04_CRF_LATEST_VERSION`, TM1.`TBW04_CRF_INPUT_LEVEL`, TM1.`TBW04_LOCK_FLG`, TM1.`TBW04_LOCK_DATETIME`, TM1.`TBW04_LOCK_USER_ID`, TM1.`TBW04_LOCK_AUTH_CD`, TM1.`TBW04_UPLOAD_DATETIME`, TM1.`TBW04_UPLOAD_USER_ID`, TM1.`TBW04_UPLOAD_AUTH_CD`, TM1.`TBW04_DM_ARRIVAL_FLG`, TM1.`TBW04_DM_ARRIVAL_DATETIME`, TM1.`TBW04_APPROVAL_FLG`, TM1.`TBW04_APPROVAL_DATETIME`, TM1.`TBW04_APPROVAL_USER_ID`, TM1.`TBW04_APPROVAL_AUTH_CD`, TM1.`TBW04_INPUT_END_FLG`, TM1.`TBW04_INPUT_END_DATETIME`, TM1.`TBW04_INPUT_END_USER_ID`, TM1.`TBW04_INPUT_END_AUTH_CD`, TM1.`TBW04_COMPLETION_FLG`, TM1.`TBW04_EDIT_FLG` FROM `TBW04_CRF` TM1 WHERE TM1.`TBW04_SESSION_ID` = ? and TM1.`TBW04_APP_ID` = ? and TM1.`TBW04_DISP_DATETIME` = ? and TM1.`TBW04_STUDY_ID` = ? and TM1.`TBW04_SUBJECT_ID` = ? and TM1.`TBW04_CRF_ID` = ? ORDER BY TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00175", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00176", "INSERT INTO `TBW04_CRF`(`TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00177", "UPDATE `TBW04_CRF` SET `TBW04_CRF_LATEST_VERSION`=?, `TBW04_CRF_INPUT_LEVEL`=?, `TBW04_LOCK_FLG`=?, `TBW04_LOCK_DATETIME`=?, `TBW04_LOCK_USER_ID`=?, `TBW04_LOCK_AUTH_CD`=?, `TBW04_UPLOAD_DATETIME`=?, `TBW04_UPLOAD_USER_ID`=?, `TBW04_UPLOAD_AUTH_CD`=?, `TBW04_DM_ARRIVAL_FLG`=?, `TBW04_DM_ARRIVAL_DATETIME`=?, `TBW04_APPROVAL_FLG`=?, `TBW04_APPROVAL_DATETIME`=?, `TBW04_APPROVAL_USER_ID`=?, `TBW04_APPROVAL_AUTH_CD`=?, `TBW04_INPUT_END_FLG`=?, `TBW04_INPUT_END_DATETIME`=?, `TBW04_INPUT_END_USER_ID`=?, `TBW04_INPUT_END_AUTH_CD`=?, `TBW04_COMPLETION_FLG`=?, `TBW04_EDIT_FLG`=?  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00178", "DELETE FROM `TBW04_CRF`  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00179", "SELECT TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID`, TM1.`TBW04_CRF_LATEST_VERSION`, TM1.`TBW04_CRF_INPUT_LEVEL`, TM1.`TBW04_LOCK_FLG`, TM1.`TBW04_LOCK_DATETIME`, TM1.`TBW04_LOCK_USER_ID`, TM1.`TBW04_LOCK_AUTH_CD`, TM1.`TBW04_UPLOAD_DATETIME`, TM1.`TBW04_UPLOAD_USER_ID`, TM1.`TBW04_UPLOAD_AUTH_CD`, TM1.`TBW04_DM_ARRIVAL_FLG`, TM1.`TBW04_DM_ARRIVAL_DATETIME`, TM1.`TBW04_APPROVAL_FLG`, TM1.`TBW04_APPROVAL_DATETIME`, TM1.`TBW04_APPROVAL_USER_ID`, TM1.`TBW04_APPROVAL_AUTH_CD`, TM1.`TBW04_INPUT_END_FLG`, TM1.`TBW04_INPUT_END_DATETIME`, TM1.`TBW04_INPUT_END_USER_ID`, TM1.`TBW04_INPUT_END_AUTH_CD`, TM1.`TBW04_COMPLETION_FLG`, TM1.`TBW04_EDIT_FLG` FROM `TBW04_CRF` TM1 WHERE TM1.`TBW04_SESSION_ID` = ? and TM1.`TBW04_APP_ID` = ? and TM1.`TBW04_DISP_DATETIME` = ? and TM1.`TBW04_STUDY_ID` = ? and TM1.`TBW04_SUBJECT_ID` = ? and TM1.`TBW04_CRF_ID` = ? ORDER BY TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
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
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
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
                  stmt.setVarchar(12, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[41], 128);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[47], 1);
               }
               return;
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setVarchar(6, (String)parms[11], 2);
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
                  stmt.setVarchar(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               stmt.setVarchar(22, (String)parms[42], 50, false);
               stmt.setVarchar(23, (String)parms[43], 7, false);
               stmt.setVarchar(24, (String)parms[44], 14, false);
               stmt.setLong(25, ((Number) parms[45]).longValue());
               stmt.setInt(26, ((Number) parms[46]).intValue());
               stmt.setShort(27, ((Number) parms[47]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

