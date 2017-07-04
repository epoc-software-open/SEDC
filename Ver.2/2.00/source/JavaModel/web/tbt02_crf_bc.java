/*
               File: tbt02_crf_bc
        Description: CRFテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:3.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt02_crf_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt02_crf_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt02_crf_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt02_crf_bc.class ));
   }

   public tbt02_crf_bc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0P55( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0P55( ) ;
      standaloneModal( ) ;
      addRow0P55( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120P2 */
         e120P2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
            Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
            Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
            Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
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

   public void confirm_0P0( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0P55( ) ;
         }
         else
         {
            checkExtendedTable0P55( ) ;
            if ( AnyError == 0 )
            {
               zm0P55( 14) ;
            }
            closeExtendedTableCursors0P55( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110P2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      AV8W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120P2( )
   {
      /* After Trn Routine */
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0P55( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         Z450TBT02_CRT_DATETIME = A450TBT02_CRT_DATETIME ;
         Z451TBT02_CRT_USER_ID = A451TBT02_CRT_USER_ID ;
         Z453TBT02_UPD_DATETIME = A453TBT02_UPD_DATETIME ;
         Z454TBT02_UPD_USER_ID = A454TBT02_UPD_USER_ID ;
         Z456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         Z498TBT02_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
         Z499TBT02_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
         Z648TBT02_LOCK_FLG = A648TBT02_LOCK_FLG ;
         Z649TBT02_LOCK_DATETIME = A649TBT02_LOCK_DATETIME ;
         Z650TBT02_LOCK_USER_ID = A650TBT02_LOCK_USER_ID ;
         Z651TBT02_LOCK_AUTH_CD = A651TBT02_LOCK_AUTH_CD ;
         Z652TBT02_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
         Z653TBT02_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
         Z654TBT02_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
         Z655TBT02_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
         Z656TBT02_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
         Z657TBT02_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
         Z658TBT02_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
         Z659TBT02_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
         Z660TBT02_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
         Z661TBT02_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
         Z662TBT02_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
         Z663TBT02_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
         Z664TBT02_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
         Z449TBT02_DEL_FLG = A449TBT02_DEL_FLG ;
         Z452TBT02_CRT_PROG_NM = A452TBT02_CRT_PROG_NM ;
         Z455TBT02_UPD_PROG_NM = A455TBT02_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -13 )
      {
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         Z450TBT02_CRT_DATETIME = A450TBT02_CRT_DATETIME ;
         Z451TBT02_CRT_USER_ID = A451TBT02_CRT_USER_ID ;
         Z453TBT02_UPD_DATETIME = A453TBT02_UPD_DATETIME ;
         Z454TBT02_UPD_USER_ID = A454TBT02_UPD_USER_ID ;
         Z456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         Z498TBT02_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
         Z499TBT02_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
         Z648TBT02_LOCK_FLG = A648TBT02_LOCK_FLG ;
         Z649TBT02_LOCK_DATETIME = A649TBT02_LOCK_DATETIME ;
         Z650TBT02_LOCK_USER_ID = A650TBT02_LOCK_USER_ID ;
         Z651TBT02_LOCK_AUTH_CD = A651TBT02_LOCK_AUTH_CD ;
         Z652TBT02_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
         Z653TBT02_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
         Z654TBT02_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
         Z655TBT02_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
         Z656TBT02_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
         Z657TBT02_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
         Z658TBT02_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
         Z659TBT02_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
         Z660TBT02_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
         Z661TBT02_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
         Z662TBT02_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
         Z663TBT02_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
         Z664TBT02_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
         Z449TBT02_DEL_FLG = A449TBT02_DEL_FLG ;
         Z452TBT02_CRT_PROG_NM = A452TBT02_CRT_PROG_NM ;
         Z455TBT02_UPD_PROG_NM = A455TBT02_UPD_PROG_NM ;
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0P55( )
   {
      /* Using cursor BC000P5 */
      pr_default.execute(3, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A450TBT02_CRT_DATETIME = BC000P5_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = BC000P5_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = BC000P5_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = BC000P5_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = BC000P5_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = BC000P5_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = BC000P5_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = BC000P5_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = BC000P5_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = BC000P5_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = BC000P5_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = BC000P5_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = BC000P5_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = BC000P5_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = BC000P5_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = BC000P5_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = BC000P5_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = BC000P5_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = BC000P5_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = BC000P5_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = BC000P5_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = BC000P5_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = BC000P5_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = BC000P5_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = BC000P5_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = BC000P5_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = BC000P5_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = BC000P5_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = BC000P5_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = BC000P5_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = BC000P5_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = BC000P5_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = BC000P5_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = BC000P5_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = BC000P5_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = BC000P5_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = BC000P5_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = BC000P5_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = BC000P5_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = BC000P5_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = BC000P5_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = BC000P5_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = BC000P5_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = BC000P5_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = BC000P5_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = BC000P5_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = BC000P5_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = BC000P5_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = BC000P5_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = BC000P5_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = BC000P5_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = BC000P5_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = BC000P5_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = BC000P5_n455TBT02_UPD_PROG_NM[0] ;
         zm0P55( -13) ;
      }
      pr_default.close(3);
      onLoadActions0P55( ) ;
   }

   public void onLoadActions0P55( )
   {
      AV9Pgmname = "TBT02_CRF_BC" ;
   }

   public void checkExtendedTable0P55( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT02_CRF_BC" ;
      /* Using cursor BC000P4 */
      pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A649TBT02_LOCK_DATETIME) || (( A649TBT02_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A649TBT02_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A652TBT02_UPLOAD_DATETIME) || (( A652TBT02_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A652TBT02_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) || (( A656TBT02_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A656TBT02_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A658TBT02_APPROVAL_DATETIME) || (( A658TBT02_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A658TBT02_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A662TBT02_INPUT_END_DATETIME) || (( A662TBT02_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A662TBT02_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A450TBT02_CRT_DATETIME) || (( A450TBT02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A450TBT02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A453TBT02_UPD_DATETIME) || (( A453TBT02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A453TBT02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0P55( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0P55( )
   {
      /* Using cursor BC000P6 */
      pr_default.execute(4, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound55 = (short)(1) ;
      }
      else
      {
         RcdFound55 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000P3 */
      pr_default.execute(1, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0P55( 13) ;
         RcdFound55 = (short)(1) ;
         A91TBT02_CRF_ID = BC000P3_A91TBT02_CRF_ID[0] ;
         A935TBT02_CRF_EDA_NO = BC000P3_A935TBT02_CRF_EDA_NO[0] ;
         A450TBT02_CRT_DATETIME = BC000P3_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = BC000P3_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = BC000P3_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = BC000P3_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = BC000P3_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = BC000P3_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = BC000P3_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = BC000P3_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = BC000P3_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = BC000P3_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = BC000P3_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = BC000P3_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = BC000P3_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = BC000P3_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = BC000P3_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = BC000P3_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = BC000P3_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = BC000P3_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = BC000P3_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = BC000P3_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = BC000P3_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = BC000P3_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = BC000P3_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = BC000P3_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = BC000P3_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = BC000P3_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = BC000P3_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = BC000P3_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = BC000P3_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = BC000P3_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = BC000P3_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = BC000P3_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = BC000P3_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = BC000P3_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = BC000P3_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = BC000P3_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = BC000P3_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = BC000P3_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = BC000P3_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = BC000P3_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = BC000P3_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = BC000P3_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = BC000P3_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = BC000P3_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = BC000P3_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = BC000P3_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = BC000P3_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = BC000P3_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = BC000P3_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = BC000P3_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = BC000P3_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = BC000P3_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = BC000P3_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = BC000P3_n455TBT02_UPD_PROG_NM[0] ;
         A89TBT02_STUDY_ID = BC000P3_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = BC000P3_A90TBT02_SUBJECT_ID[0] ;
         O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         n456TBT02_UPD_CNT = false ;
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0P55( ) ;
         if ( AnyError == 1 )
         {
            RcdFound55 = (short)(0) ;
            initializeNonKey0P55( ) ;
         }
         Gx_mode = sMode55 ;
      }
      else
      {
         RcdFound55 = (short)(0) ;
         initializeNonKey0P55( ) ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode55 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0P55( ) ;
      if ( RcdFound55 == 0 )
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
      confirm_0P0( ) ;
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

   public void checkOptimisticConcurrency0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000P2 */
         pr_default.execute(0, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z450TBT02_CRT_DATETIME.equals( BC000P2_A450TBT02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z451TBT02_CRT_USER_ID, BC000P2_A451TBT02_CRT_USER_ID[0]) != 0 ) || !( Z453TBT02_UPD_DATETIME.equals( BC000P2_A453TBT02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z454TBT02_UPD_USER_ID, BC000P2_A454TBT02_UPD_USER_ID[0]) != 0 ) || ( Z456TBT02_UPD_CNT != BC000P2_A456TBT02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z498TBT02_CRF_LATEST_VERSION != BC000P2_A498TBT02_CRF_LATEST_VERSION[0] ) || ( Z499TBT02_CRF_INPUT_LEVEL != BC000P2_A499TBT02_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z648TBT02_LOCK_FLG, BC000P2_A648TBT02_LOCK_FLG[0]) != 0 ) || !( Z649TBT02_LOCK_DATETIME.equals( BC000P2_A649TBT02_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z650TBT02_LOCK_USER_ID, BC000P2_A650TBT02_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z651TBT02_LOCK_AUTH_CD, BC000P2_A651TBT02_LOCK_AUTH_CD[0]) != 0 ) || !( Z652TBT02_UPLOAD_DATETIME.equals( BC000P2_A652TBT02_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z653TBT02_UPLOAD_USER_ID, BC000P2_A653TBT02_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z654TBT02_UPLOAD_AUTH_CD, BC000P2_A654TBT02_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z655TBT02_DM_ARRIVAL_FLG, BC000P2_A655TBT02_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z656TBT02_DM_ARRIVAL_DATETIME.equals( BC000P2_A656TBT02_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z657TBT02_APPROVAL_FLG, BC000P2_A657TBT02_APPROVAL_FLG[0]) != 0 ) || !( Z658TBT02_APPROVAL_DATETIME.equals( BC000P2_A658TBT02_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z659TBT02_APPROVAL_USER_ID, BC000P2_A659TBT02_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z660TBT02_APPROVAL_AUTH_CD, BC000P2_A660TBT02_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z661TBT02_INPUT_END_FLG, BC000P2_A661TBT02_INPUT_END_FLG[0]) != 0 ) || !( Z662TBT02_INPUT_END_DATETIME.equals( BC000P2_A662TBT02_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z663TBT02_INPUT_END_USER_ID, BC000P2_A663TBT02_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z664TBT02_INPUT_END_AUTH_CD, BC000P2_A664TBT02_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z449TBT02_DEL_FLG, BC000P2_A449TBT02_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z452TBT02_CRT_PROG_NM, BC000P2_A452TBT02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z455TBT02_UPD_PROG_NM, BC000P2_A455TBT02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT02_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P55( 0) ;
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000P7 */
                  pr_default.execute(5, new Object[] {new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO), new Boolean(n450TBT02_CRT_DATETIME), A450TBT02_CRT_DATETIME, new Boolean(n451TBT02_CRT_USER_ID), A451TBT02_CRT_USER_ID, new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n648TBT02_LOCK_FLG), A648TBT02_LOCK_FLG, new Boolean(n649TBT02_LOCK_DATETIME), A649TBT02_LOCK_DATETIME, new Boolean(n650TBT02_LOCK_USER_ID), A650TBT02_LOCK_USER_ID, new Boolean(n651TBT02_LOCK_AUTH_CD), A651TBT02_LOCK_AUTH_CD, new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n657TBT02_APPROVAL_FLG), A657TBT02_APPROVAL_FLG, new Boolean(n658TBT02_APPROVAL_DATETIME), A658TBT02_APPROVAL_DATETIME, new Boolean(n659TBT02_APPROVAL_USER_ID), A659TBT02_APPROVAL_USER_ID, new Boolean(n660TBT02_APPROVAL_AUTH_CD), A660TBT02_APPROVAL_AUTH_CD, new Boolean(n661TBT02_INPUT_END_FLG), A661TBT02_INPUT_END_FLG, new Boolean(n662TBT02_INPUT_END_DATETIME), A662TBT02_INPUT_END_DATETIME, new Boolean(n663TBT02_INPUT_END_USER_ID), A663TBT02_INPUT_END_USER_ID, new Boolean(n664TBT02_INPUT_END_AUTH_CD), A664TBT02_INPUT_END_AUTH_CD, new Boolean(n449TBT02_DEL_FLG), A449TBT02_DEL_FLG, new Boolean(n452TBT02_CRT_PROG_NM), A452TBT02_CRT_PROG_NM, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
                  if ( (pr_default.getStatus(5) == 1) )
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
            load0P55( ) ;
         }
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void update0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000P8 */
                  pr_default.execute(6, new Object[] {new Boolean(n450TBT02_CRT_DATETIME), A450TBT02_CRT_DATETIME, new Boolean(n451TBT02_CRT_USER_ID), A451TBT02_CRT_USER_ID, new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n648TBT02_LOCK_FLG), A648TBT02_LOCK_FLG, new Boolean(n649TBT02_LOCK_DATETIME), A649TBT02_LOCK_DATETIME, new Boolean(n650TBT02_LOCK_USER_ID), A650TBT02_LOCK_USER_ID, new Boolean(n651TBT02_LOCK_AUTH_CD), A651TBT02_LOCK_AUTH_CD, new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n657TBT02_APPROVAL_FLG), A657TBT02_APPROVAL_FLG, new Boolean(n658TBT02_APPROVAL_DATETIME), A658TBT02_APPROVAL_DATETIME, new Boolean(n659TBT02_APPROVAL_USER_ID), A659TBT02_APPROVAL_USER_ID, new Boolean(n660TBT02_APPROVAL_AUTH_CD), A660TBT02_APPROVAL_AUTH_CD, new Boolean(n661TBT02_INPUT_END_FLG), A661TBT02_INPUT_END_FLG, new Boolean(n662TBT02_INPUT_END_DATETIME), A662TBT02_INPUT_END_DATETIME, new Boolean(n663TBT02_INPUT_END_USER_ID), A663TBT02_INPUT_END_USER_ID, new Boolean(n664TBT02_INPUT_END_AUTH_CD), A664TBT02_INPUT_END_AUTH_CD, new Boolean(n449TBT02_DEL_FLG), A449TBT02_DEL_FLG, new Boolean(n452TBT02_CRT_PROG_NM), A452TBT02_CRT_PROG_NM, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P55( ) ;
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
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void deferredUpdate0P55( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P55( ) ;
         afterConfirm0P55( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P55( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000P9 */
               pr_default.execute(7, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
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
      sMode55 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0P55( ) ;
      Gx_mode = sMode55 ;
   }

   public void onDeleteControls0P55( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT02_CRF_BC" ;
      }
   }

   public void endLevel0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0P55( ) ;
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

   public void scanKeyStart0P55( )
   {
      /* Scan By routine */
      /* Using cursor BC000P10 */
      pr_default.execute(8, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      RcdFound55 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A91TBT02_CRF_ID = BC000P10_A91TBT02_CRF_ID[0] ;
         A935TBT02_CRF_EDA_NO = BC000P10_A935TBT02_CRF_EDA_NO[0] ;
         A450TBT02_CRT_DATETIME = BC000P10_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = BC000P10_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = BC000P10_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = BC000P10_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = BC000P10_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = BC000P10_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = BC000P10_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = BC000P10_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = BC000P10_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = BC000P10_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = BC000P10_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = BC000P10_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = BC000P10_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = BC000P10_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = BC000P10_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = BC000P10_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = BC000P10_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = BC000P10_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = BC000P10_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = BC000P10_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = BC000P10_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = BC000P10_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = BC000P10_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = BC000P10_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = BC000P10_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = BC000P10_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = BC000P10_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = BC000P10_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = BC000P10_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = BC000P10_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = BC000P10_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = BC000P10_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = BC000P10_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = BC000P10_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = BC000P10_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = BC000P10_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = BC000P10_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = BC000P10_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = BC000P10_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = BC000P10_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = BC000P10_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = BC000P10_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = BC000P10_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = BC000P10_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = BC000P10_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = BC000P10_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = BC000P10_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = BC000P10_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = BC000P10_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = BC000P10_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = BC000P10_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = BC000P10_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = BC000P10_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = BC000P10_n455TBT02_UPD_PROG_NM[0] ;
         A89TBT02_STUDY_ID = BC000P10_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = BC000P10_A90TBT02_SUBJECT_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0P55( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound55 = (short)(0) ;
      scanKeyLoad0P55( ) ;
   }

   public void scanKeyLoad0P55( )
   {
      sMode55 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A91TBT02_CRF_ID = BC000P10_A91TBT02_CRF_ID[0] ;
         A935TBT02_CRF_EDA_NO = BC000P10_A935TBT02_CRF_EDA_NO[0] ;
         A450TBT02_CRT_DATETIME = BC000P10_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = BC000P10_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = BC000P10_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = BC000P10_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = BC000P10_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = BC000P10_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = BC000P10_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = BC000P10_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = BC000P10_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = BC000P10_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = BC000P10_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = BC000P10_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = BC000P10_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = BC000P10_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = BC000P10_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = BC000P10_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = BC000P10_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = BC000P10_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = BC000P10_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = BC000P10_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = BC000P10_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = BC000P10_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = BC000P10_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = BC000P10_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = BC000P10_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = BC000P10_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = BC000P10_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = BC000P10_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = BC000P10_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = BC000P10_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = BC000P10_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = BC000P10_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = BC000P10_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = BC000P10_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = BC000P10_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = BC000P10_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = BC000P10_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = BC000P10_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = BC000P10_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = BC000P10_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = BC000P10_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = BC000P10_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = BC000P10_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = BC000P10_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = BC000P10_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = BC000P10_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = BC000P10_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = BC000P10_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = BC000P10_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = BC000P10_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = BC000P10_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = BC000P10_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = BC000P10_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = BC000P10_n455TBT02_UPD_PROG_NM[0] ;
         A89TBT02_STUDY_ID = BC000P10_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = BC000P10_A90TBT02_SUBJECT_ID[0] ;
      }
      Gx_mode = sMode55 ;
   }

   public void scanKeyEnd0P55( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0P55( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P55( )
   {
      /* Before Insert Rules */
      A450TBT02_CRT_DATETIME = GXutil.now( ) ;
      n450TBT02_CRT_DATETIME = false ;
      GXt_char1 = A451TBT02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A451TBT02_CRT_USER_ID = GXt_char1 ;
      n451TBT02_CRT_USER_ID = false ;
      A453TBT02_UPD_DATETIME = GXutil.now( ) ;
      n453TBT02_UPD_DATETIME = false ;
      GXt_char1 = A454TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A454TBT02_UPD_USER_ID = GXt_char1 ;
      n454TBT02_UPD_USER_ID = false ;
      A456TBT02_UPD_CNT = (long)(O456TBT02_UPD_CNT+1) ;
      n456TBT02_UPD_CNT = false ;
   }

   public void beforeUpdate0P55( )
   {
      /* Before Update Rules */
      A453TBT02_UPD_DATETIME = GXutil.now( ) ;
      n453TBT02_UPD_DATETIME = false ;
      GXt_char1 = A454TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A454TBT02_UPD_USER_ID = GXt_char1 ;
      n454TBT02_UPD_USER_ID = false ;
      A456TBT02_UPD_CNT = (long)(O456TBT02_UPD_CNT+1) ;
      n456TBT02_UPD_CNT = false ;
   }

   public void beforeDelete0P55( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P55( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P55( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P55( )
   {
   }

   public void addRow0P55( )
   {
      VarsToRow55( bcTBT02_CRF) ;
   }

   public void readRow0P55( )
   {
      RowToVars55( bcTBT02_CRF, 1) ;
   }

   public void initializeNonKey0P55( )
   {
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n450TBT02_CRT_DATETIME = false ;
      A451TBT02_CRT_USER_ID = "" ;
      n451TBT02_CRT_USER_ID = false ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n453TBT02_UPD_DATETIME = false ;
      A454TBT02_UPD_USER_ID = "" ;
      n454TBT02_UPD_USER_ID = false ;
      A456TBT02_UPD_CNT = 0 ;
      n456TBT02_UPD_CNT = false ;
      A498TBT02_CRF_LATEST_VERSION = (short)(0) ;
      n498TBT02_CRF_LATEST_VERSION = false ;
      A499TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
      n499TBT02_CRF_INPUT_LEVEL = false ;
      A648TBT02_LOCK_FLG = "" ;
      n648TBT02_LOCK_FLG = false ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n649TBT02_LOCK_DATETIME = false ;
      A650TBT02_LOCK_USER_ID = "" ;
      n650TBT02_LOCK_USER_ID = false ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      n651TBT02_LOCK_AUTH_CD = false ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n652TBT02_UPLOAD_DATETIME = false ;
      A653TBT02_UPLOAD_USER_ID = "" ;
      n653TBT02_UPLOAD_USER_ID = false ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      n654TBT02_UPLOAD_AUTH_CD = false ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      n655TBT02_DM_ARRIVAL_FLG = false ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n656TBT02_DM_ARRIVAL_DATETIME = false ;
      A657TBT02_APPROVAL_FLG = "" ;
      n657TBT02_APPROVAL_FLG = false ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n658TBT02_APPROVAL_DATETIME = false ;
      A659TBT02_APPROVAL_USER_ID = "" ;
      n659TBT02_APPROVAL_USER_ID = false ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      n660TBT02_APPROVAL_AUTH_CD = false ;
      A661TBT02_INPUT_END_FLG = "" ;
      n661TBT02_INPUT_END_FLG = false ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n662TBT02_INPUT_END_DATETIME = false ;
      A663TBT02_INPUT_END_USER_ID = "" ;
      n663TBT02_INPUT_END_USER_ID = false ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      n664TBT02_INPUT_END_AUTH_CD = false ;
      A449TBT02_DEL_FLG = "" ;
      n449TBT02_DEL_FLG = false ;
      A452TBT02_CRT_PROG_NM = "" ;
      n452TBT02_CRT_PROG_NM = false ;
      A455TBT02_UPD_PROG_NM = "" ;
      n455TBT02_UPD_PROG_NM = false ;
      O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
      n456TBT02_UPD_CNT = false ;
   }

   public void initAll0P55( )
   {
      A89TBT02_STUDY_ID = 0 ;
      A90TBT02_SUBJECT_ID = 0 ;
      A91TBT02_CRF_ID = (short)(0) ;
      A935TBT02_CRF_EDA_NO = (byte)(0) ;
      initializeNonKey0P55( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow55( SdtTBT02_CRF obj55 )
   {
      obj55.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime( A450TBT02_CRT_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id( A451TBT02_CRT_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime( A453TBT02_UPD_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id( A454TBT02_UPD_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt( A456TBT02_UPD_CNT );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( A498TBT02_CRF_LATEST_VERSION );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( A499TBT02_CRF_INPUT_LEVEL );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg( A648TBT02_LOCK_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime( A649TBT02_LOCK_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id( A650TBT02_LOCK_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd( A651TBT02_LOCK_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( A652TBT02_UPLOAD_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( A653TBT02_UPLOAD_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( A654TBT02_UPLOAD_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( A655TBT02_DM_ARRIVAL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime( A656TBT02_DM_ARRIVAL_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( A657TBT02_APPROVAL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime( A658TBT02_APPROVAL_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id( A659TBT02_APPROVAL_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd( A660TBT02_APPROVAL_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( A661TBT02_INPUT_END_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime( A662TBT02_INPUT_END_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id( A663TBT02_INPUT_END_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd( A664TBT02_INPUT_END_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( A449TBT02_DEL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( A452TBT02_CRT_PROG_NM );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( A455TBT02_UPD_PROG_NM );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_study_id( A89TBT02_STUDY_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( A90TBT02_SUBJECT_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( A91TBT02_CRF_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( A935TBT02_CRF_EDA_NO );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z( Z89TBT02_STUDY_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z( Z90TBT02_SUBJECT_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z( Z91TBT02_CRF_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no_Z( Z935TBT02_CRF_EDA_NO );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z( Z498TBT02_CRF_LATEST_VERSION );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z( Z499TBT02_CRF_INPUT_LEVEL );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z( Z648TBT02_LOCK_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z( Z649TBT02_LOCK_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z( Z650TBT02_LOCK_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z( Z651TBT02_LOCK_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z( Z652TBT02_UPLOAD_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z( Z653TBT02_UPLOAD_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z( Z654TBT02_UPLOAD_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z( Z655TBT02_DM_ARRIVAL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z( Z656TBT02_DM_ARRIVAL_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z( Z657TBT02_APPROVAL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z( Z658TBT02_APPROVAL_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z( Z659TBT02_APPROVAL_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z( Z660TBT02_APPROVAL_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z( Z661TBT02_INPUT_END_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z( Z662TBT02_INPUT_END_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z( Z663TBT02_INPUT_END_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z( Z664TBT02_INPUT_END_AUTH_CD );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z( Z449TBT02_DEL_FLG );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z( Z450TBT02_CRT_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z( Z451TBT02_CRT_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z( Z452TBT02_CRT_PROG_NM );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z( Z453TBT02_UPD_DATETIME );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z( Z454TBT02_UPD_USER_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z( Z455TBT02_UPD_PROG_NM );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z( Z456TBT02_UPD_CNT );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N( (byte)((byte)((n498TBT02_CRF_LATEST_VERSION)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N( (byte)((byte)((n499TBT02_CRF_INPUT_LEVEL)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N( (byte)((byte)((n648TBT02_LOCK_FLG)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N( (byte)((byte)((n649TBT02_LOCK_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N( (byte)((byte)((n650TBT02_LOCK_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N( (byte)((byte)((n651TBT02_LOCK_AUTH_CD)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N( (byte)((byte)((n652TBT02_UPLOAD_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N( (byte)((byte)((n653TBT02_UPLOAD_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N( (byte)((byte)((n654TBT02_UPLOAD_AUTH_CD)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N( (byte)((byte)((n655TBT02_DM_ARRIVAL_FLG)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N( (byte)((byte)((n656TBT02_DM_ARRIVAL_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N( (byte)((byte)((n657TBT02_APPROVAL_FLG)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N( (byte)((byte)((n658TBT02_APPROVAL_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N( (byte)((byte)((n659TBT02_APPROVAL_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N( (byte)((byte)((n660TBT02_APPROVAL_AUTH_CD)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N( (byte)((byte)((n661TBT02_INPUT_END_FLG)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N( (byte)((byte)((n662TBT02_INPUT_END_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N( (byte)((byte)((n663TBT02_INPUT_END_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N( (byte)((byte)((n664TBT02_INPUT_END_AUTH_CD)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_N( (byte)((byte)((n449TBT02_DEL_FLG)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N( (byte)((byte)((n450TBT02_CRT_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N( (byte)((byte)((n451TBT02_CRT_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N( (byte)((byte)((n452TBT02_CRT_PROG_NM)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N( (byte)((byte)((n453TBT02_UPD_DATETIME)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N( (byte)((byte)((n454TBT02_UPD_USER_ID)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N( (byte)((byte)((n455TBT02_UPD_PROG_NM)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N( (byte)((byte)((n456TBT02_UPD_CNT)?1:0)) );
      obj55.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
   }

   public void KeyVarsToRow55( SdtTBT02_CRF obj55 )
   {
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_study_id( A89TBT02_STUDY_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( A90TBT02_SUBJECT_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( A91TBT02_CRF_ID );
      obj55.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( A935TBT02_CRF_EDA_NO );
   }

   public void RowToVars55( SdtTBT02_CRF obj55 ,
                            int forceLoad )
   {
      Gx_mode = obj55.getgxTv_SdtTBT02_CRF_Mode() ;
      A450TBT02_CRT_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime() ;
      n450TBT02_CRT_DATETIME = false ;
      A451TBT02_CRT_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id() ;
      n451TBT02_CRT_USER_ID = false ;
      A453TBT02_UPD_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime() ;
      n453TBT02_UPD_DATETIME = false ;
      A454TBT02_UPD_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id() ;
      n454TBT02_UPD_USER_ID = false ;
      A456TBT02_UPD_CNT = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt() ;
      n456TBT02_UPD_CNT = false ;
      A498TBT02_CRF_LATEST_VERSION = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() ;
      n498TBT02_CRF_LATEST_VERSION = false ;
      A499TBT02_CRF_INPUT_LEVEL = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level() ;
      n499TBT02_CRF_INPUT_LEVEL = false ;
      A648TBT02_LOCK_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg() ;
      n648TBT02_LOCK_FLG = false ;
      A649TBT02_LOCK_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime() ;
      n649TBT02_LOCK_DATETIME = false ;
      A650TBT02_LOCK_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id() ;
      n650TBT02_LOCK_USER_ID = false ;
      A651TBT02_LOCK_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd() ;
      n651TBT02_LOCK_AUTH_CD = false ;
      A652TBT02_UPLOAD_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() ;
      n652TBT02_UPLOAD_DATETIME = false ;
      A653TBT02_UPLOAD_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() ;
      n653TBT02_UPLOAD_USER_ID = false ;
      A654TBT02_UPLOAD_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() ;
      n654TBT02_UPLOAD_AUTH_CD = false ;
      A655TBT02_DM_ARRIVAL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg() ;
      n655TBT02_DM_ARRIVAL_FLG = false ;
      A656TBT02_DM_ARRIVAL_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime() ;
      n656TBT02_DM_ARRIVAL_DATETIME = false ;
      A657TBT02_APPROVAL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg() ;
      n657TBT02_APPROVAL_FLG = false ;
      A658TBT02_APPROVAL_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime() ;
      n658TBT02_APPROVAL_DATETIME = false ;
      A659TBT02_APPROVAL_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id() ;
      n659TBT02_APPROVAL_USER_ID = false ;
      A660TBT02_APPROVAL_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd() ;
      n660TBT02_APPROVAL_AUTH_CD = false ;
      A661TBT02_INPUT_END_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg() ;
      n661TBT02_INPUT_END_FLG = false ;
      A662TBT02_INPUT_END_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime() ;
      n662TBT02_INPUT_END_DATETIME = false ;
      A663TBT02_INPUT_END_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id() ;
      n663TBT02_INPUT_END_USER_ID = false ;
      A664TBT02_INPUT_END_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd() ;
      n664TBT02_INPUT_END_AUTH_CD = false ;
      A449TBT02_DEL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_del_flg() ;
      n449TBT02_DEL_FLG = false ;
      A452TBT02_CRT_PROG_NM = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm() ;
      n452TBT02_CRT_PROG_NM = false ;
      A455TBT02_UPD_PROG_NM = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm() ;
      n455TBT02_UPD_PROG_NM = false ;
      A89TBT02_STUDY_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_study_id() ;
      A90TBT02_SUBJECT_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_subject_id() ;
      A91TBT02_CRF_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_id() ;
      A935TBT02_CRF_EDA_NO = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no() ;
      Z89TBT02_STUDY_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_study_id_Z() ;
      Z90TBT02_SUBJECT_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z() ;
      Z91TBT02_CRF_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z() ;
      Z935TBT02_CRF_EDA_NO = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no_Z() ;
      Z498TBT02_CRF_LATEST_VERSION = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z() ;
      Z499TBT02_CRF_INPUT_LEVEL = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z() ;
      Z648TBT02_LOCK_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z() ;
      Z649TBT02_LOCK_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z() ;
      Z650TBT02_LOCK_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z() ;
      Z651TBT02_LOCK_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z() ;
      Z652TBT02_UPLOAD_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z() ;
      Z653TBT02_UPLOAD_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z() ;
      Z654TBT02_UPLOAD_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z() ;
      Z655TBT02_DM_ARRIVAL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z() ;
      Z656TBT02_DM_ARRIVAL_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z() ;
      Z657TBT02_APPROVAL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z() ;
      Z658TBT02_APPROVAL_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z() ;
      Z659TBT02_APPROVAL_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z() ;
      Z660TBT02_APPROVAL_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z() ;
      Z661TBT02_INPUT_END_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z() ;
      Z662TBT02_INPUT_END_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z() ;
      Z663TBT02_INPUT_END_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z() ;
      Z664TBT02_INPUT_END_AUTH_CD = obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z() ;
      Z449TBT02_DEL_FLG = obj55.getgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z() ;
      Z450TBT02_CRT_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z() ;
      Z451TBT02_CRT_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z() ;
      Z452TBT02_CRT_PROG_NM = obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z() ;
      Z453TBT02_UPD_DATETIME = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z() ;
      Z454TBT02_UPD_USER_ID = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z() ;
      Z455TBT02_UPD_PROG_NM = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z() ;
      Z456TBT02_UPD_CNT = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z() ;
      O456TBT02_UPD_CNT = obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z() ;
      n498TBT02_CRF_LATEST_VERSION = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N()==0)?false:true) ;
      n499TBT02_CRF_INPUT_LEVEL = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N()==0)?false:true) ;
      n648TBT02_LOCK_FLG = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N()==0)?false:true) ;
      n649TBT02_LOCK_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N()==0)?false:true) ;
      n650TBT02_LOCK_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N()==0)?false:true) ;
      n651TBT02_LOCK_AUTH_CD = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N()==0)?false:true) ;
      n652TBT02_UPLOAD_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N()==0)?false:true) ;
      n653TBT02_UPLOAD_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N()==0)?false:true) ;
      n654TBT02_UPLOAD_AUTH_CD = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N()==0)?false:true) ;
      n655TBT02_DM_ARRIVAL_FLG = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N()==0)?false:true) ;
      n656TBT02_DM_ARRIVAL_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N()==0)?false:true) ;
      n657TBT02_APPROVAL_FLG = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N()==0)?false:true) ;
      n658TBT02_APPROVAL_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N()==0)?false:true) ;
      n659TBT02_APPROVAL_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N()==0)?false:true) ;
      n660TBT02_APPROVAL_AUTH_CD = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N()==0)?false:true) ;
      n661TBT02_INPUT_END_FLG = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N()==0)?false:true) ;
      n662TBT02_INPUT_END_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N()==0)?false:true) ;
      n663TBT02_INPUT_END_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N()==0)?false:true) ;
      n664TBT02_INPUT_END_AUTH_CD = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N()==0)?false:true) ;
      n449TBT02_DEL_FLG = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_del_flg_N()==0)?false:true) ;
      n450TBT02_CRT_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N()==0)?false:true) ;
      n451TBT02_CRT_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N()==0)?false:true) ;
      n452TBT02_CRT_PROG_NM = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N()==0)?false:true) ;
      n453TBT02_UPD_DATETIME = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N()==0)?false:true) ;
      n454TBT02_UPD_USER_ID = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N()==0)?false:true) ;
      n455TBT02_UPD_PROG_NM = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N()==0)?false:true) ;
      n456TBT02_UPD_CNT = (boolean)((obj55.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj55.getgxTv_SdtTBT02_CRF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A89TBT02_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A90TBT02_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A91TBT02_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A935TBT02_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0P55( ) ;
      scanKeyStart0P55( ) ;
      if ( RcdFound55 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000P4 */
         pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         n456TBT02_UPD_CNT = false ;
      }
      zm0P55( -13) ;
      onLoadActions0P55( ) ;
      addRow0P55( ) ;
      scanKeyEnd0P55( ) ;
      if ( RcdFound55 == 0 )
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
      RowToVars55( bcTBT02_CRF, 0) ;
      scanKeyStart0P55( ) ;
      if ( RcdFound55 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000P4 */
         pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         n456TBT02_UPD_CNT = false ;
      }
      zm0P55( -13) ;
      onLoadActions0P55( ) ;
      addRow0P55( ) ;
      scanKeyEnd0P55( ) ;
      if ( RcdFound55 == 0 )
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
      RowToVars55( bcTBT02_CRF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0P55( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0P55( ) ;
      }
      else
      {
         if ( RcdFound55 == 1 )
         {
            if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
            {
               A89TBT02_STUDY_ID = Z89TBT02_STUDY_ID ;
               A90TBT02_SUBJECT_ID = Z90TBT02_SUBJECT_ID ;
               A91TBT02_CRF_ID = Z91TBT02_CRF_ID ;
               A935TBT02_CRF_EDA_NO = Z935TBT02_CRF_EDA_NO ;
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
               update0P55( ) ;
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
               if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
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
                     insert0P55( ) ;
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
                     insert0P55( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow55( bcTBT02_CRF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars55( bcTBT02_CRF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0P55( ) ;
      if ( RcdFound55 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
         {
            A89TBT02_STUDY_ID = Z89TBT02_STUDY_ID ;
            A90TBT02_SUBJECT_ID = Z90TBT02_SUBJECT_ID ;
            A91TBT02_CRF_ID = Z91TBT02_CRF_ID ;
            A935TBT02_CRF_EDA_NO = Z935TBT02_CRF_EDA_NO ;
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
         if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt02_crf_bc");
      VarsToRow55( bcTBT02_CRF) ;
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
      Gx_mode = bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT02_CRF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT02_CRF )
      {
         bcTBT02_CRF = sdt ;
         if ( GXutil.strcmp(bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode(), "") == 0 )
         {
            bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow55( bcTBT02_CRF) ;
         }
         else
         {
            RowToVars55( bcTBT02_CRF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode(), "") == 0 )
         {
            bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars55( bcTBT02_CRF, 1) ;
   }

   public SdtTBT02_CRF getTBT02_CRF_BC( )
   {
      return bcTBT02_CRF ;
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
      pr_default.close(2);
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z451TBT02_CRT_USER_ID = "" ;
      A451TBT02_CRT_USER_ID = "" ;
      Z453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z454TBT02_UPD_USER_ID = "" ;
      A454TBT02_UPD_USER_ID = "" ;
      Z648TBT02_LOCK_FLG = "" ;
      A648TBT02_LOCK_FLG = "" ;
      Z649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z650TBT02_LOCK_USER_ID = "" ;
      A650TBT02_LOCK_USER_ID = "" ;
      Z651TBT02_LOCK_AUTH_CD = "" ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      Z652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z653TBT02_UPLOAD_USER_ID = "" ;
      A653TBT02_UPLOAD_USER_ID = "" ;
      Z654TBT02_UPLOAD_AUTH_CD = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      Z655TBT02_DM_ARRIVAL_FLG = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      Z656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z657TBT02_APPROVAL_FLG = "" ;
      A657TBT02_APPROVAL_FLG = "" ;
      Z658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z659TBT02_APPROVAL_USER_ID = "" ;
      A659TBT02_APPROVAL_USER_ID = "" ;
      Z660TBT02_APPROVAL_AUTH_CD = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      Z661TBT02_INPUT_END_FLG = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      Z662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z663TBT02_INPUT_END_USER_ID = "" ;
      A663TBT02_INPUT_END_USER_ID = "" ;
      Z664TBT02_INPUT_END_AUTH_CD = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      Z449TBT02_DEL_FLG = "" ;
      A449TBT02_DEL_FLG = "" ;
      Z452TBT02_CRT_PROG_NM = "" ;
      A452TBT02_CRT_PROG_NM = "" ;
      Z455TBT02_UPD_PROG_NM = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      BC000P5_A91TBT02_CRF_ID = new short[1] ;
      BC000P5_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000P5_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P5_A451TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P5_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P5_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P5_A454TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P5_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P5_A456TBT02_UPD_CNT = new long[1] ;
      BC000P5_n456TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P5_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P5_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P5_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P5_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P5_A648TBT02_LOCK_FLG = new String[] {""} ;
      BC000P5_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P5_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P5_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P5_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P5_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P5_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P5_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P5_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P5_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P5_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P5_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P5_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P5_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P5_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P5_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P5_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P5_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P5_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P5_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P5_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P5_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P5_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P5_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P5_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P5_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P5_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P5_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P5_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P5_A449TBT02_DEL_FLG = new String[] {""} ;
      BC000P5_n449TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P5_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P5_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P5_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P5_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P5_A89TBT02_STUDY_ID = new long[1] ;
      BC000P5_A90TBT02_SUBJECT_ID = new int[1] ;
      BC000P4_A89TBT02_STUDY_ID = new long[1] ;
      BC000P6_A89TBT02_STUDY_ID = new long[1] ;
      BC000P6_A90TBT02_SUBJECT_ID = new int[1] ;
      BC000P6_A91TBT02_CRF_ID = new short[1] ;
      BC000P6_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000P3_A91TBT02_CRF_ID = new short[1] ;
      BC000P3_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000P3_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P3_A451TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P3_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P3_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P3_A454TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P3_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P3_A456TBT02_UPD_CNT = new long[1] ;
      BC000P3_n456TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P3_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P3_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P3_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P3_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P3_A648TBT02_LOCK_FLG = new String[] {""} ;
      BC000P3_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P3_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P3_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P3_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P3_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P3_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P3_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P3_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P3_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P3_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P3_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P3_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P3_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P3_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P3_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P3_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P3_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P3_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P3_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P3_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P3_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P3_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P3_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P3_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P3_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P3_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P3_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P3_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P3_A449TBT02_DEL_FLG = new String[] {""} ;
      BC000P3_n449TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P3_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P3_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P3_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P3_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P3_A89TBT02_STUDY_ID = new long[1] ;
      BC000P3_A90TBT02_SUBJECT_ID = new int[1] ;
      sMode55 = "" ;
      BC000P2_A91TBT02_CRF_ID = new short[1] ;
      BC000P2_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000P2_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P2_A451TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P2_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P2_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P2_A454TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P2_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P2_A456TBT02_UPD_CNT = new long[1] ;
      BC000P2_n456TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P2_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P2_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P2_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P2_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P2_A648TBT02_LOCK_FLG = new String[] {""} ;
      BC000P2_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P2_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P2_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P2_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P2_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P2_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P2_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P2_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P2_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P2_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P2_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P2_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P2_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P2_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P2_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P2_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P2_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P2_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P2_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P2_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P2_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P2_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P2_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P2_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P2_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P2_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P2_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P2_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P2_A449TBT02_DEL_FLG = new String[] {""} ;
      BC000P2_n449TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P2_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P2_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P2_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P2_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P2_A89TBT02_STUDY_ID = new long[1] ;
      BC000P2_A90TBT02_SUBJECT_ID = new int[1] ;
      BC000P10_A91TBT02_CRF_ID = new short[1] ;
      BC000P10_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000P10_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P10_A451TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P10_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P10_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P10_A454TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P10_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P10_A456TBT02_UPD_CNT = new long[1] ;
      BC000P10_n456TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P10_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P10_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P10_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P10_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P10_A648TBT02_LOCK_FLG = new String[] {""} ;
      BC000P10_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P10_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P10_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P10_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P10_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P10_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P10_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P10_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P10_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P10_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P10_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P10_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P10_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P10_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P10_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P10_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P10_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P10_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P10_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P10_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P10_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P10_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P10_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P10_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P10_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P10_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P10_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P10_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P10_A449TBT02_DEL_FLG = new String[] {""} ;
      BC000P10_n449TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P10_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P10_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P10_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P10_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P10_A89TBT02_STUDY_ID = new long[1] ;
      BC000P10_A90TBT02_SUBJECT_ID = new int[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt02_crf_bc__default(),
         new Object[] {
             new Object[] {
            BC000P2_A91TBT02_CRF_ID, BC000P2_A935TBT02_CRF_EDA_NO, BC000P2_A450TBT02_CRT_DATETIME, BC000P2_n450TBT02_CRT_DATETIME, BC000P2_A451TBT02_CRT_USER_ID, BC000P2_n451TBT02_CRT_USER_ID, BC000P2_A453TBT02_UPD_DATETIME, BC000P2_n453TBT02_UPD_DATETIME, BC000P2_A454TBT02_UPD_USER_ID, BC000P2_n454TBT02_UPD_USER_ID,
            BC000P2_A456TBT02_UPD_CNT, BC000P2_n456TBT02_UPD_CNT, BC000P2_A498TBT02_CRF_LATEST_VERSION, BC000P2_n498TBT02_CRF_LATEST_VERSION, BC000P2_A499TBT02_CRF_INPUT_LEVEL, BC000P2_n499TBT02_CRF_INPUT_LEVEL, BC000P2_A648TBT02_LOCK_FLG, BC000P2_n648TBT02_LOCK_FLG, BC000P2_A649TBT02_LOCK_DATETIME, BC000P2_n649TBT02_LOCK_DATETIME,
            BC000P2_A650TBT02_LOCK_USER_ID, BC000P2_n650TBT02_LOCK_USER_ID, BC000P2_A651TBT02_LOCK_AUTH_CD, BC000P2_n651TBT02_LOCK_AUTH_CD, BC000P2_A652TBT02_UPLOAD_DATETIME, BC000P2_n652TBT02_UPLOAD_DATETIME, BC000P2_A653TBT02_UPLOAD_USER_ID, BC000P2_n653TBT02_UPLOAD_USER_ID, BC000P2_A654TBT02_UPLOAD_AUTH_CD, BC000P2_n654TBT02_UPLOAD_AUTH_CD,
            BC000P2_A655TBT02_DM_ARRIVAL_FLG, BC000P2_n655TBT02_DM_ARRIVAL_FLG, BC000P2_A656TBT02_DM_ARRIVAL_DATETIME, BC000P2_n656TBT02_DM_ARRIVAL_DATETIME, BC000P2_A657TBT02_APPROVAL_FLG, BC000P2_n657TBT02_APPROVAL_FLG, BC000P2_A658TBT02_APPROVAL_DATETIME, BC000P2_n658TBT02_APPROVAL_DATETIME, BC000P2_A659TBT02_APPROVAL_USER_ID, BC000P2_n659TBT02_APPROVAL_USER_ID,
            BC000P2_A660TBT02_APPROVAL_AUTH_CD, BC000P2_n660TBT02_APPROVAL_AUTH_CD, BC000P2_A661TBT02_INPUT_END_FLG, BC000P2_n661TBT02_INPUT_END_FLG, BC000P2_A662TBT02_INPUT_END_DATETIME, BC000P2_n662TBT02_INPUT_END_DATETIME, BC000P2_A663TBT02_INPUT_END_USER_ID, BC000P2_n663TBT02_INPUT_END_USER_ID, BC000P2_A664TBT02_INPUT_END_AUTH_CD, BC000P2_n664TBT02_INPUT_END_AUTH_CD,
            BC000P2_A449TBT02_DEL_FLG, BC000P2_n449TBT02_DEL_FLG, BC000P2_A452TBT02_CRT_PROG_NM, BC000P2_n452TBT02_CRT_PROG_NM, BC000P2_A455TBT02_UPD_PROG_NM, BC000P2_n455TBT02_UPD_PROG_NM, BC000P2_A89TBT02_STUDY_ID, BC000P2_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P3_A91TBT02_CRF_ID, BC000P3_A935TBT02_CRF_EDA_NO, BC000P3_A450TBT02_CRT_DATETIME, BC000P3_n450TBT02_CRT_DATETIME, BC000P3_A451TBT02_CRT_USER_ID, BC000P3_n451TBT02_CRT_USER_ID, BC000P3_A453TBT02_UPD_DATETIME, BC000P3_n453TBT02_UPD_DATETIME, BC000P3_A454TBT02_UPD_USER_ID, BC000P3_n454TBT02_UPD_USER_ID,
            BC000P3_A456TBT02_UPD_CNT, BC000P3_n456TBT02_UPD_CNT, BC000P3_A498TBT02_CRF_LATEST_VERSION, BC000P3_n498TBT02_CRF_LATEST_VERSION, BC000P3_A499TBT02_CRF_INPUT_LEVEL, BC000P3_n499TBT02_CRF_INPUT_LEVEL, BC000P3_A648TBT02_LOCK_FLG, BC000P3_n648TBT02_LOCK_FLG, BC000P3_A649TBT02_LOCK_DATETIME, BC000P3_n649TBT02_LOCK_DATETIME,
            BC000P3_A650TBT02_LOCK_USER_ID, BC000P3_n650TBT02_LOCK_USER_ID, BC000P3_A651TBT02_LOCK_AUTH_CD, BC000P3_n651TBT02_LOCK_AUTH_CD, BC000P3_A652TBT02_UPLOAD_DATETIME, BC000P3_n652TBT02_UPLOAD_DATETIME, BC000P3_A653TBT02_UPLOAD_USER_ID, BC000P3_n653TBT02_UPLOAD_USER_ID, BC000P3_A654TBT02_UPLOAD_AUTH_CD, BC000P3_n654TBT02_UPLOAD_AUTH_CD,
            BC000P3_A655TBT02_DM_ARRIVAL_FLG, BC000P3_n655TBT02_DM_ARRIVAL_FLG, BC000P3_A656TBT02_DM_ARRIVAL_DATETIME, BC000P3_n656TBT02_DM_ARRIVAL_DATETIME, BC000P3_A657TBT02_APPROVAL_FLG, BC000P3_n657TBT02_APPROVAL_FLG, BC000P3_A658TBT02_APPROVAL_DATETIME, BC000P3_n658TBT02_APPROVAL_DATETIME, BC000P3_A659TBT02_APPROVAL_USER_ID, BC000P3_n659TBT02_APPROVAL_USER_ID,
            BC000P3_A660TBT02_APPROVAL_AUTH_CD, BC000P3_n660TBT02_APPROVAL_AUTH_CD, BC000P3_A661TBT02_INPUT_END_FLG, BC000P3_n661TBT02_INPUT_END_FLG, BC000P3_A662TBT02_INPUT_END_DATETIME, BC000P3_n662TBT02_INPUT_END_DATETIME, BC000P3_A663TBT02_INPUT_END_USER_ID, BC000P3_n663TBT02_INPUT_END_USER_ID, BC000P3_A664TBT02_INPUT_END_AUTH_CD, BC000P3_n664TBT02_INPUT_END_AUTH_CD,
            BC000P3_A449TBT02_DEL_FLG, BC000P3_n449TBT02_DEL_FLG, BC000P3_A452TBT02_CRT_PROG_NM, BC000P3_n452TBT02_CRT_PROG_NM, BC000P3_A455TBT02_UPD_PROG_NM, BC000P3_n455TBT02_UPD_PROG_NM, BC000P3_A89TBT02_STUDY_ID, BC000P3_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P4_A89TBT02_STUDY_ID
            }
            , new Object[] {
            BC000P5_A91TBT02_CRF_ID, BC000P5_A935TBT02_CRF_EDA_NO, BC000P5_A450TBT02_CRT_DATETIME, BC000P5_n450TBT02_CRT_DATETIME, BC000P5_A451TBT02_CRT_USER_ID, BC000P5_n451TBT02_CRT_USER_ID, BC000P5_A453TBT02_UPD_DATETIME, BC000P5_n453TBT02_UPD_DATETIME, BC000P5_A454TBT02_UPD_USER_ID, BC000P5_n454TBT02_UPD_USER_ID,
            BC000P5_A456TBT02_UPD_CNT, BC000P5_n456TBT02_UPD_CNT, BC000P5_A498TBT02_CRF_LATEST_VERSION, BC000P5_n498TBT02_CRF_LATEST_VERSION, BC000P5_A499TBT02_CRF_INPUT_LEVEL, BC000P5_n499TBT02_CRF_INPUT_LEVEL, BC000P5_A648TBT02_LOCK_FLG, BC000P5_n648TBT02_LOCK_FLG, BC000P5_A649TBT02_LOCK_DATETIME, BC000P5_n649TBT02_LOCK_DATETIME,
            BC000P5_A650TBT02_LOCK_USER_ID, BC000P5_n650TBT02_LOCK_USER_ID, BC000P5_A651TBT02_LOCK_AUTH_CD, BC000P5_n651TBT02_LOCK_AUTH_CD, BC000P5_A652TBT02_UPLOAD_DATETIME, BC000P5_n652TBT02_UPLOAD_DATETIME, BC000P5_A653TBT02_UPLOAD_USER_ID, BC000P5_n653TBT02_UPLOAD_USER_ID, BC000P5_A654TBT02_UPLOAD_AUTH_CD, BC000P5_n654TBT02_UPLOAD_AUTH_CD,
            BC000P5_A655TBT02_DM_ARRIVAL_FLG, BC000P5_n655TBT02_DM_ARRIVAL_FLG, BC000P5_A656TBT02_DM_ARRIVAL_DATETIME, BC000P5_n656TBT02_DM_ARRIVAL_DATETIME, BC000P5_A657TBT02_APPROVAL_FLG, BC000P5_n657TBT02_APPROVAL_FLG, BC000P5_A658TBT02_APPROVAL_DATETIME, BC000P5_n658TBT02_APPROVAL_DATETIME, BC000P5_A659TBT02_APPROVAL_USER_ID, BC000P5_n659TBT02_APPROVAL_USER_ID,
            BC000P5_A660TBT02_APPROVAL_AUTH_CD, BC000P5_n660TBT02_APPROVAL_AUTH_CD, BC000P5_A661TBT02_INPUT_END_FLG, BC000P5_n661TBT02_INPUT_END_FLG, BC000P5_A662TBT02_INPUT_END_DATETIME, BC000P5_n662TBT02_INPUT_END_DATETIME, BC000P5_A663TBT02_INPUT_END_USER_ID, BC000P5_n663TBT02_INPUT_END_USER_ID, BC000P5_A664TBT02_INPUT_END_AUTH_CD, BC000P5_n664TBT02_INPUT_END_AUTH_CD,
            BC000P5_A449TBT02_DEL_FLG, BC000P5_n449TBT02_DEL_FLG, BC000P5_A452TBT02_CRT_PROG_NM, BC000P5_n452TBT02_CRT_PROG_NM, BC000P5_A455TBT02_UPD_PROG_NM, BC000P5_n455TBT02_UPD_PROG_NM, BC000P5_A89TBT02_STUDY_ID, BC000P5_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P6_A89TBT02_STUDY_ID, BC000P6_A90TBT02_SUBJECT_ID, BC000P6_A91TBT02_CRF_ID, BC000P6_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000P10_A91TBT02_CRF_ID, BC000P10_A935TBT02_CRF_EDA_NO, BC000P10_A450TBT02_CRT_DATETIME, BC000P10_n450TBT02_CRT_DATETIME, BC000P10_A451TBT02_CRT_USER_ID, BC000P10_n451TBT02_CRT_USER_ID, BC000P10_A453TBT02_UPD_DATETIME, BC000P10_n453TBT02_UPD_DATETIME, BC000P10_A454TBT02_UPD_USER_ID, BC000P10_n454TBT02_UPD_USER_ID,
            BC000P10_A456TBT02_UPD_CNT, BC000P10_n456TBT02_UPD_CNT, BC000P10_A498TBT02_CRF_LATEST_VERSION, BC000P10_n498TBT02_CRF_LATEST_VERSION, BC000P10_A499TBT02_CRF_INPUT_LEVEL, BC000P10_n499TBT02_CRF_INPUT_LEVEL, BC000P10_A648TBT02_LOCK_FLG, BC000P10_n648TBT02_LOCK_FLG, BC000P10_A649TBT02_LOCK_DATETIME, BC000P10_n649TBT02_LOCK_DATETIME,
            BC000P10_A650TBT02_LOCK_USER_ID, BC000P10_n650TBT02_LOCK_USER_ID, BC000P10_A651TBT02_LOCK_AUTH_CD, BC000P10_n651TBT02_LOCK_AUTH_CD, BC000P10_A652TBT02_UPLOAD_DATETIME, BC000P10_n652TBT02_UPLOAD_DATETIME, BC000P10_A653TBT02_UPLOAD_USER_ID, BC000P10_n653TBT02_UPLOAD_USER_ID, BC000P10_A654TBT02_UPLOAD_AUTH_CD, BC000P10_n654TBT02_UPLOAD_AUTH_CD,
            BC000P10_A655TBT02_DM_ARRIVAL_FLG, BC000P10_n655TBT02_DM_ARRIVAL_FLG, BC000P10_A656TBT02_DM_ARRIVAL_DATETIME, BC000P10_n656TBT02_DM_ARRIVAL_DATETIME, BC000P10_A657TBT02_APPROVAL_FLG, BC000P10_n657TBT02_APPROVAL_FLG, BC000P10_A658TBT02_APPROVAL_DATETIME, BC000P10_n658TBT02_APPROVAL_DATETIME, BC000P10_A659TBT02_APPROVAL_USER_ID, BC000P10_n659TBT02_APPROVAL_USER_ID,
            BC000P10_A660TBT02_APPROVAL_AUTH_CD, BC000P10_n660TBT02_APPROVAL_AUTH_CD, BC000P10_A661TBT02_INPUT_END_FLG, BC000P10_n661TBT02_INPUT_END_FLG, BC000P10_A662TBT02_INPUT_END_DATETIME, BC000P10_n662TBT02_INPUT_END_DATETIME, BC000P10_A663TBT02_INPUT_END_USER_ID, BC000P10_n663TBT02_INPUT_END_USER_ID, BC000P10_A664TBT02_INPUT_END_AUTH_CD, BC000P10_n664TBT02_INPUT_END_AUTH_CD,
            BC000P10_A449TBT02_DEL_FLG, BC000P10_n449TBT02_DEL_FLG, BC000P10_A452TBT02_CRT_PROG_NM, BC000P10_n452TBT02_CRT_PROG_NM, BC000P10_A455TBT02_UPD_PROG_NM, BC000P10_n455TBT02_UPD_PROG_NM, BC000P10_A89TBT02_STUDY_ID, BC000P10_A90TBT02_SUBJECT_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT02_CRF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110P2 */
      e110P2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z935TBT02_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte Z499TBT02_CRF_INPUT_LEVEL ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z91TBT02_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short Z498TBT02_CRF_LATEST_VERSION ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short RcdFound55 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z90TBT02_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z89TBT02_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long Z456TBT02_UPD_CNT ;
   private long A456TBT02_UPD_CNT ;
   private long O456TBT02_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode55 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z450TBT02_CRT_DATETIME ;
   private java.util.Date A450TBT02_CRT_DATETIME ;
   private java.util.Date Z453TBT02_UPD_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private java.util.Date Z649TBT02_LOCK_DATETIME ;
   private java.util.Date A649TBT02_LOCK_DATETIME ;
   private java.util.Date Z652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date Z656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date Z662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private boolean n450TBT02_CRT_DATETIME ;
   private boolean n451TBT02_CRT_USER_ID ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n648TBT02_LOCK_FLG ;
   private boolean n649TBT02_LOCK_DATETIME ;
   private boolean n650TBT02_LOCK_USER_ID ;
   private boolean n651TBT02_LOCK_AUTH_CD ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n452TBT02_CRT_PROG_NM ;
   private boolean n455TBT02_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String Z451TBT02_CRT_USER_ID ;
   private String A451TBT02_CRT_USER_ID ;
   private String Z454TBT02_UPD_USER_ID ;
   private String A454TBT02_UPD_USER_ID ;
   private String Z648TBT02_LOCK_FLG ;
   private String A648TBT02_LOCK_FLG ;
   private String Z650TBT02_LOCK_USER_ID ;
   private String A650TBT02_LOCK_USER_ID ;
   private String Z651TBT02_LOCK_AUTH_CD ;
   private String A651TBT02_LOCK_AUTH_CD ;
   private String Z653TBT02_UPLOAD_USER_ID ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String Z654TBT02_UPLOAD_AUTH_CD ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String Z655TBT02_DM_ARRIVAL_FLG ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String Z657TBT02_APPROVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String Z659TBT02_APPROVAL_USER_ID ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String Z660TBT02_APPROVAL_AUTH_CD ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String Z661TBT02_INPUT_END_FLG ;
   private String A661TBT02_INPUT_END_FLG ;
   private String Z663TBT02_INPUT_END_USER_ID ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String Z664TBT02_INPUT_END_AUTH_CD ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String Z449TBT02_DEL_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String Z452TBT02_CRT_PROG_NM ;
   private String A452TBT02_CRT_PROG_NM ;
   private String Z455TBT02_UPD_PROG_NM ;
   private String A455TBT02_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT02_CRF bcTBT02_CRF ;
   private IDataStoreProvider pr_default ;
   private short[] BC000P5_A91TBT02_CRF_ID ;
   private byte[] BC000P5_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] BC000P5_A450TBT02_CRT_DATETIME ;
   private boolean[] BC000P5_n450TBT02_CRT_DATETIME ;
   private String[] BC000P5_A451TBT02_CRT_USER_ID ;
   private boolean[] BC000P5_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P5_A453TBT02_UPD_DATETIME ;
   private boolean[] BC000P5_n453TBT02_UPD_DATETIME ;
   private String[] BC000P5_A454TBT02_UPD_USER_ID ;
   private boolean[] BC000P5_n454TBT02_UPD_USER_ID ;
   private long[] BC000P5_A456TBT02_UPD_CNT ;
   private boolean[] BC000P5_n456TBT02_UPD_CNT ;
   private short[] BC000P5_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P5_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P5_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P5_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P5_A648TBT02_LOCK_FLG ;
   private boolean[] BC000P5_n648TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P5_A649TBT02_LOCK_DATETIME ;
   private boolean[] BC000P5_n649TBT02_LOCK_DATETIME ;
   private String[] BC000P5_A650TBT02_LOCK_USER_ID ;
   private boolean[] BC000P5_n650TBT02_LOCK_USER_ID ;
   private String[] BC000P5_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P5_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P5_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P5_n652TBT02_UPLOAD_DATETIME ;
   private String[] BC000P5_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P5_n653TBT02_UPLOAD_USER_ID ;
   private String[] BC000P5_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P5_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P5_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P5_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P5_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P5_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P5_A657TBT02_APPROVAL_FLG ;
   private boolean[] BC000P5_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P5_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P5_n658TBT02_APPROVAL_DATETIME ;
   private String[] BC000P5_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P5_n659TBT02_APPROVAL_USER_ID ;
   private String[] BC000P5_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P5_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P5_A661TBT02_INPUT_END_FLG ;
   private boolean[] BC000P5_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P5_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P5_n662TBT02_INPUT_END_DATETIME ;
   private String[] BC000P5_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P5_n663TBT02_INPUT_END_USER_ID ;
   private String[] BC000P5_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P5_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P5_A449TBT02_DEL_FLG ;
   private boolean[] BC000P5_n449TBT02_DEL_FLG ;
   private String[] BC000P5_A452TBT02_CRT_PROG_NM ;
   private boolean[] BC000P5_n452TBT02_CRT_PROG_NM ;
   private String[] BC000P5_A455TBT02_UPD_PROG_NM ;
   private boolean[] BC000P5_n455TBT02_UPD_PROG_NM ;
   private long[] BC000P5_A89TBT02_STUDY_ID ;
   private int[] BC000P5_A90TBT02_SUBJECT_ID ;
   private long[] BC000P4_A89TBT02_STUDY_ID ;
   private long[] BC000P6_A89TBT02_STUDY_ID ;
   private int[] BC000P6_A90TBT02_SUBJECT_ID ;
   private short[] BC000P6_A91TBT02_CRF_ID ;
   private byte[] BC000P6_A935TBT02_CRF_EDA_NO ;
   private short[] BC000P3_A91TBT02_CRF_ID ;
   private byte[] BC000P3_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] BC000P3_A450TBT02_CRT_DATETIME ;
   private boolean[] BC000P3_n450TBT02_CRT_DATETIME ;
   private String[] BC000P3_A451TBT02_CRT_USER_ID ;
   private boolean[] BC000P3_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P3_A453TBT02_UPD_DATETIME ;
   private boolean[] BC000P3_n453TBT02_UPD_DATETIME ;
   private String[] BC000P3_A454TBT02_UPD_USER_ID ;
   private boolean[] BC000P3_n454TBT02_UPD_USER_ID ;
   private long[] BC000P3_A456TBT02_UPD_CNT ;
   private boolean[] BC000P3_n456TBT02_UPD_CNT ;
   private short[] BC000P3_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P3_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P3_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P3_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P3_A648TBT02_LOCK_FLG ;
   private boolean[] BC000P3_n648TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P3_A649TBT02_LOCK_DATETIME ;
   private boolean[] BC000P3_n649TBT02_LOCK_DATETIME ;
   private String[] BC000P3_A650TBT02_LOCK_USER_ID ;
   private boolean[] BC000P3_n650TBT02_LOCK_USER_ID ;
   private String[] BC000P3_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P3_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P3_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P3_n652TBT02_UPLOAD_DATETIME ;
   private String[] BC000P3_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P3_n653TBT02_UPLOAD_USER_ID ;
   private String[] BC000P3_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P3_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P3_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P3_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P3_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P3_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P3_A657TBT02_APPROVAL_FLG ;
   private boolean[] BC000P3_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P3_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P3_n658TBT02_APPROVAL_DATETIME ;
   private String[] BC000P3_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P3_n659TBT02_APPROVAL_USER_ID ;
   private String[] BC000P3_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P3_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P3_A661TBT02_INPUT_END_FLG ;
   private boolean[] BC000P3_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P3_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P3_n662TBT02_INPUT_END_DATETIME ;
   private String[] BC000P3_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P3_n663TBT02_INPUT_END_USER_ID ;
   private String[] BC000P3_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P3_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P3_A449TBT02_DEL_FLG ;
   private boolean[] BC000P3_n449TBT02_DEL_FLG ;
   private String[] BC000P3_A452TBT02_CRT_PROG_NM ;
   private boolean[] BC000P3_n452TBT02_CRT_PROG_NM ;
   private String[] BC000P3_A455TBT02_UPD_PROG_NM ;
   private boolean[] BC000P3_n455TBT02_UPD_PROG_NM ;
   private long[] BC000P3_A89TBT02_STUDY_ID ;
   private int[] BC000P3_A90TBT02_SUBJECT_ID ;
   private short[] BC000P2_A91TBT02_CRF_ID ;
   private byte[] BC000P2_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] BC000P2_A450TBT02_CRT_DATETIME ;
   private boolean[] BC000P2_n450TBT02_CRT_DATETIME ;
   private String[] BC000P2_A451TBT02_CRT_USER_ID ;
   private boolean[] BC000P2_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P2_A453TBT02_UPD_DATETIME ;
   private boolean[] BC000P2_n453TBT02_UPD_DATETIME ;
   private String[] BC000P2_A454TBT02_UPD_USER_ID ;
   private boolean[] BC000P2_n454TBT02_UPD_USER_ID ;
   private long[] BC000P2_A456TBT02_UPD_CNT ;
   private boolean[] BC000P2_n456TBT02_UPD_CNT ;
   private short[] BC000P2_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P2_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P2_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P2_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P2_A648TBT02_LOCK_FLG ;
   private boolean[] BC000P2_n648TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P2_A649TBT02_LOCK_DATETIME ;
   private boolean[] BC000P2_n649TBT02_LOCK_DATETIME ;
   private String[] BC000P2_A650TBT02_LOCK_USER_ID ;
   private boolean[] BC000P2_n650TBT02_LOCK_USER_ID ;
   private String[] BC000P2_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P2_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P2_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P2_n652TBT02_UPLOAD_DATETIME ;
   private String[] BC000P2_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P2_n653TBT02_UPLOAD_USER_ID ;
   private String[] BC000P2_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P2_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P2_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P2_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P2_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P2_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P2_A657TBT02_APPROVAL_FLG ;
   private boolean[] BC000P2_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P2_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P2_n658TBT02_APPROVAL_DATETIME ;
   private String[] BC000P2_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P2_n659TBT02_APPROVAL_USER_ID ;
   private String[] BC000P2_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P2_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P2_A661TBT02_INPUT_END_FLG ;
   private boolean[] BC000P2_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P2_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P2_n662TBT02_INPUT_END_DATETIME ;
   private String[] BC000P2_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P2_n663TBT02_INPUT_END_USER_ID ;
   private String[] BC000P2_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P2_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P2_A449TBT02_DEL_FLG ;
   private boolean[] BC000P2_n449TBT02_DEL_FLG ;
   private String[] BC000P2_A452TBT02_CRT_PROG_NM ;
   private boolean[] BC000P2_n452TBT02_CRT_PROG_NM ;
   private String[] BC000P2_A455TBT02_UPD_PROG_NM ;
   private boolean[] BC000P2_n455TBT02_UPD_PROG_NM ;
   private long[] BC000P2_A89TBT02_STUDY_ID ;
   private int[] BC000P2_A90TBT02_SUBJECT_ID ;
   private short[] BC000P10_A91TBT02_CRF_ID ;
   private byte[] BC000P10_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] BC000P10_A450TBT02_CRT_DATETIME ;
   private boolean[] BC000P10_n450TBT02_CRT_DATETIME ;
   private String[] BC000P10_A451TBT02_CRT_USER_ID ;
   private boolean[] BC000P10_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P10_A453TBT02_UPD_DATETIME ;
   private boolean[] BC000P10_n453TBT02_UPD_DATETIME ;
   private String[] BC000P10_A454TBT02_UPD_USER_ID ;
   private boolean[] BC000P10_n454TBT02_UPD_USER_ID ;
   private long[] BC000P10_A456TBT02_UPD_CNT ;
   private boolean[] BC000P10_n456TBT02_UPD_CNT ;
   private short[] BC000P10_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P10_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P10_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P10_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P10_A648TBT02_LOCK_FLG ;
   private boolean[] BC000P10_n648TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P10_A649TBT02_LOCK_DATETIME ;
   private boolean[] BC000P10_n649TBT02_LOCK_DATETIME ;
   private String[] BC000P10_A650TBT02_LOCK_USER_ID ;
   private boolean[] BC000P10_n650TBT02_LOCK_USER_ID ;
   private String[] BC000P10_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P10_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P10_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P10_n652TBT02_UPLOAD_DATETIME ;
   private String[] BC000P10_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P10_n653TBT02_UPLOAD_USER_ID ;
   private String[] BC000P10_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P10_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P10_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P10_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P10_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P10_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P10_A657TBT02_APPROVAL_FLG ;
   private boolean[] BC000P10_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P10_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P10_n658TBT02_APPROVAL_DATETIME ;
   private String[] BC000P10_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P10_n659TBT02_APPROVAL_USER_ID ;
   private String[] BC000P10_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P10_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P10_A661TBT02_INPUT_END_FLG ;
   private boolean[] BC000P10_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P10_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P10_n662TBT02_INPUT_END_DATETIME ;
   private String[] BC000P10_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P10_n663TBT02_INPUT_END_USER_ID ;
   private String[] BC000P10_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P10_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P10_A449TBT02_DEL_FLG ;
   private boolean[] BC000P10_n449TBT02_DEL_FLG ;
   private String[] BC000P10_A452TBT02_CRT_PROG_NM ;
   private boolean[] BC000P10_n452TBT02_CRT_PROG_NM ;
   private String[] BC000P10_A455TBT02_UPD_PROG_NM ;
   private boolean[] BC000P10_n455TBT02_UPD_PROG_NM ;
   private long[] BC000P10_A89TBT02_STUDY_ID ;
   private int[] BC000P10_A90TBT02_SUBJECT_ID ;
}

final  class tbt02_crf_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000P2", "SELECT `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P3", "SELECT `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P4", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P5", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? and TM1.`TBT02_CRF_EDA_NO` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000P6", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000P7", "INSERT INTO `TBT02_CRF`(`TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000P8", "UPDATE `TBT02_CRF` SET `TBT02_CRT_DATETIME`=?, `TBT02_CRT_USER_ID`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_CNT`=?, `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_LOCK_FLG`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_APPROVAL_FLG`=?, `TBT02_APPROVAL_DATETIME`=?, `TBT02_APPROVAL_USER_ID`=?, `TBT02_APPROVAL_AUTH_CD`=?, `TBT02_INPUT_END_FLG`=?, `TBT02_INPUT_END_DATETIME`=?, `TBT02_INPUT_END_USER_ID`=?, `TBT02_INPUT_END_AUTH_CD`=?, `TBT02_DEL_FLG`=?, `TBT02_CRT_PROG_NM`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000P9", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000P10", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? and TM1.`TBT02_CRF_EDA_NO` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((long[]) buf[56])[0] = rslt.getLong(30) ;
               ((int[]) buf[57])[0] = rslt.getInt(31) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((long[]) buf[56])[0] = rslt.getLong(30) ;
               ((int[]) buf[57])[0] = rslt.getInt(31) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((long[]) buf[56])[0] = rslt.getLong(30) ;
               ((int[]) buf[57])[0] = rslt.getInt(31) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((long[]) buf[56])[0] = rslt.getLong(30) ;
               ((int[]) buf[57])[0] = rslt.getInt(31) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[11]).longValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[45], false);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[47], 128);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[53], 40);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[55], 40);
               }
               stmt.setLong(30, ((Number) parms[56]).longValue());
               stmt.setInt(31, ((Number) parms[57]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 128);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 128);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 128);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 128);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 40);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 40);
               }
               stmt.setLong(28, ((Number) parms[54]).longValue());
               stmt.setInt(29, ((Number) parms[55]).intValue());
               stmt.setShort(30, ((Number) parms[56]).shortValue());
               stmt.setByte(31, ((Number) parms[57]).byteValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

