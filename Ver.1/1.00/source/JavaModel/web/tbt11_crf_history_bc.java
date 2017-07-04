/*
               File: tbt11_crf_history_bc
        Description: CRF修正履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:30.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt11_crf_history_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt11_crf_history_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt11_crf_history_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt11_crf_history_bc.class ));
   }

   public tbt11_crf_history_bc( int remoteHandle ,
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
         /* Execute user event: e120Q2 */
         e120Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
            Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
            Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
            Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
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

   public void confirm_0Q0( )
   {
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Q25( ) ;
         }
         else
         {
            checkExtendedTable0Q25( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0Q25( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110Q2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      AV8W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120Q2( )
   {
      /* After Trn Routine */
   }

   public void S1179( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0Q25( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z308TBT11_CRT_DATETIME = A308TBT11_CRT_DATETIME ;
         Z309TBT11_CRT_USER_ID = A309TBT11_CRT_USER_ID ;
         Z311TBT11_UPD_DATETIME = A311TBT11_UPD_DATETIME ;
         Z312TBT11_UPD_USER_ID = A312TBT11_UPD_USER_ID ;
         Z314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         Z573TBT11_CRF_INPUT_LEVEL = A573TBT11_CRF_INPUT_LEVEL ;
         Z574TBT11_UPLOAD_DATETIME = A574TBT11_UPLOAD_DATETIME ;
         Z575TBT11_UPLOAD_USER_ID = A575TBT11_UPLOAD_USER_ID ;
         Z576TBT11_UPLOAD_AUTH_CD = A576TBT11_UPLOAD_AUTH_CD ;
         Z577TBT11_DM_ARRIVAL_FLG = A577TBT11_DM_ARRIVAL_FLG ;
         Z578TBT11_DM_ARRIVAL_DATETIME = A578TBT11_DM_ARRIVAL_DATETIME ;
         Z579TBT11_APPROVAL_FLG = A579TBT11_APPROVAL_FLG ;
         Z580TBT11_APPROVAL_DATETIME = A580TBT11_APPROVAL_DATETIME ;
         Z581TBT11_APPROVAL_USER_ID = A581TBT11_APPROVAL_USER_ID ;
         Z582TBT11_APPROVAL_AUTH_CD = A582TBT11_APPROVAL_AUTH_CD ;
         Z583TBT11_INPUT_END_FLG = A583TBT11_INPUT_END_FLG ;
         Z584TBT11_INPUT_END_DATETIME = A584TBT11_INPUT_END_DATETIME ;
         Z585TBT11_INPUT_END_USER_ID = A585TBT11_INPUT_END_USER_ID ;
         Z586TBT11_INPUT_END_AUTH_CD = A586TBT11_INPUT_END_AUTH_CD ;
         Z884TBT11_UPD_RIYU = A884TBT11_UPD_RIYU ;
         Z307TBT11_DEL_FLG = A307TBT11_DEL_FLG ;
         Z310TBT11_CRT_PROG_NM = A310TBT11_CRT_PROG_NM ;
         Z313TBT11_UPD_PROG_NM = A313TBT11_UPD_PROG_NM ;
      }
      if ( GX_JID == -12 )
      {
         Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
         Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
         Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
         Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         Z308TBT11_CRT_DATETIME = A308TBT11_CRT_DATETIME ;
         Z309TBT11_CRT_USER_ID = A309TBT11_CRT_USER_ID ;
         Z311TBT11_UPD_DATETIME = A311TBT11_UPD_DATETIME ;
         Z312TBT11_UPD_USER_ID = A312TBT11_UPD_USER_ID ;
         Z314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         Z573TBT11_CRF_INPUT_LEVEL = A573TBT11_CRF_INPUT_LEVEL ;
         Z574TBT11_UPLOAD_DATETIME = A574TBT11_UPLOAD_DATETIME ;
         Z575TBT11_UPLOAD_USER_ID = A575TBT11_UPLOAD_USER_ID ;
         Z576TBT11_UPLOAD_AUTH_CD = A576TBT11_UPLOAD_AUTH_CD ;
         Z577TBT11_DM_ARRIVAL_FLG = A577TBT11_DM_ARRIVAL_FLG ;
         Z578TBT11_DM_ARRIVAL_DATETIME = A578TBT11_DM_ARRIVAL_DATETIME ;
         Z579TBT11_APPROVAL_FLG = A579TBT11_APPROVAL_FLG ;
         Z580TBT11_APPROVAL_DATETIME = A580TBT11_APPROVAL_DATETIME ;
         Z581TBT11_APPROVAL_USER_ID = A581TBT11_APPROVAL_USER_ID ;
         Z582TBT11_APPROVAL_AUTH_CD = A582TBT11_APPROVAL_AUTH_CD ;
         Z583TBT11_INPUT_END_FLG = A583TBT11_INPUT_END_FLG ;
         Z584TBT11_INPUT_END_DATETIME = A584TBT11_INPUT_END_DATETIME ;
         Z585TBT11_INPUT_END_USER_ID = A585TBT11_INPUT_END_USER_ID ;
         Z586TBT11_INPUT_END_AUTH_CD = A586TBT11_INPUT_END_AUTH_CD ;
         Z884TBT11_UPD_RIYU = A884TBT11_UPD_RIYU ;
         Z307TBT11_DEL_FLG = A307TBT11_DEL_FLG ;
         Z310TBT11_CRT_PROG_NM = A310TBT11_CRT_PROG_NM ;
         Z313TBT11_UPD_PROG_NM = A313TBT11_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0Q25( )
   {
      /* Using cursor BC000Q4 */
      pr_default.execute(2, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A308TBT11_CRT_DATETIME = BC000Q4_A308TBT11_CRT_DATETIME[0] ;
         n308TBT11_CRT_DATETIME = BC000Q4_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = BC000Q4_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = BC000Q4_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = BC000Q4_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = BC000Q4_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = BC000Q4_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = BC000Q4_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = BC000Q4_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = BC000Q4_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = BC000Q4_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = BC000Q4_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = BC000Q4_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = BC000Q4_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = BC000Q4_A575TBT11_UPLOAD_USER_ID[0] ;
         n575TBT11_UPLOAD_USER_ID = BC000Q4_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = BC000Q4_A576TBT11_UPLOAD_AUTH_CD[0] ;
         n576TBT11_UPLOAD_AUTH_CD = BC000Q4_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = BC000Q4_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = BC000Q4_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = BC000Q4_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = BC000Q4_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = BC000Q4_A579TBT11_APPROVAL_FLG[0] ;
         n579TBT11_APPROVAL_FLG = BC000Q4_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = BC000Q4_A580TBT11_APPROVAL_DATETIME[0] ;
         n580TBT11_APPROVAL_DATETIME = BC000Q4_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = BC000Q4_A581TBT11_APPROVAL_USER_ID[0] ;
         n581TBT11_APPROVAL_USER_ID = BC000Q4_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = BC000Q4_A582TBT11_APPROVAL_AUTH_CD[0] ;
         n582TBT11_APPROVAL_AUTH_CD = BC000Q4_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = BC000Q4_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = BC000Q4_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = BC000Q4_A584TBT11_INPUT_END_DATETIME[0] ;
         n584TBT11_INPUT_END_DATETIME = BC000Q4_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = BC000Q4_A585TBT11_INPUT_END_USER_ID[0] ;
         n585TBT11_INPUT_END_USER_ID = BC000Q4_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = BC000Q4_A586TBT11_INPUT_END_AUTH_CD[0] ;
         n586TBT11_INPUT_END_AUTH_CD = BC000Q4_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = BC000Q4_A884TBT11_UPD_RIYU[0] ;
         n884TBT11_UPD_RIYU = BC000Q4_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = BC000Q4_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = BC000Q4_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = BC000Q4_A310TBT11_CRT_PROG_NM[0] ;
         n310TBT11_CRT_PROG_NM = BC000Q4_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = BC000Q4_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = BC000Q4_n313TBT11_UPD_PROG_NM[0] ;
         zm0Q25( -12) ;
      }
      pr_default.close(2);
      onLoadActions0Q25( ) ;
   }

   public void onLoadActions0Q25( )
   {
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
   }

   public void checkExtendedTable0Q25( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      if ( ! ( GXutil.nullDate().equals(A574TBT11_UPLOAD_DATETIME) || (( A574TBT11_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A574TBT11_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A578TBT11_DM_ARRIVAL_DATETIME) || (( A578TBT11_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A578TBT11_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A580TBT11_APPROVAL_DATETIME) || (( A580TBT11_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A580TBT11_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A584TBT11_INPUT_END_DATETIME) || (( A584TBT11_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A584TBT11_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A308TBT11_CRT_DATETIME) || (( A308TBT11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A308TBT11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A311TBT11_UPD_DATETIME) || (( A311TBT11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A311TBT11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Q25( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Q25( )
   {
      /* Using cursor BC000Q5 */
      pr_default.execute(3, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound25 = (short)(1) ;
      }
      else
      {
         RcdFound25 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000Q3 */
      pr_default.execute(1, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Q25( 12) ;
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = BC000Q3_A303TBT11_STUDY_ID[0] ;
         A304TBT11_SUBJECT_ID = BC000Q3_A304TBT11_SUBJECT_ID[0] ;
         A305TBT11_CRF_ID = BC000Q3_A305TBT11_CRF_ID[0] ;
         A306TBT11_CRF_VERSION = BC000Q3_A306TBT11_CRF_VERSION[0] ;
         A308TBT11_CRT_DATETIME = BC000Q3_A308TBT11_CRT_DATETIME[0] ;
         n308TBT11_CRT_DATETIME = BC000Q3_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = BC000Q3_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = BC000Q3_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = BC000Q3_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = BC000Q3_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = BC000Q3_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = BC000Q3_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = BC000Q3_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = BC000Q3_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = BC000Q3_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = BC000Q3_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = BC000Q3_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = BC000Q3_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = BC000Q3_A575TBT11_UPLOAD_USER_ID[0] ;
         n575TBT11_UPLOAD_USER_ID = BC000Q3_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = BC000Q3_A576TBT11_UPLOAD_AUTH_CD[0] ;
         n576TBT11_UPLOAD_AUTH_CD = BC000Q3_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = BC000Q3_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = BC000Q3_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = BC000Q3_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = BC000Q3_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = BC000Q3_A579TBT11_APPROVAL_FLG[0] ;
         n579TBT11_APPROVAL_FLG = BC000Q3_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = BC000Q3_A580TBT11_APPROVAL_DATETIME[0] ;
         n580TBT11_APPROVAL_DATETIME = BC000Q3_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = BC000Q3_A581TBT11_APPROVAL_USER_ID[0] ;
         n581TBT11_APPROVAL_USER_ID = BC000Q3_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = BC000Q3_A582TBT11_APPROVAL_AUTH_CD[0] ;
         n582TBT11_APPROVAL_AUTH_CD = BC000Q3_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = BC000Q3_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = BC000Q3_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = BC000Q3_A584TBT11_INPUT_END_DATETIME[0] ;
         n584TBT11_INPUT_END_DATETIME = BC000Q3_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = BC000Q3_A585TBT11_INPUT_END_USER_ID[0] ;
         n585TBT11_INPUT_END_USER_ID = BC000Q3_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = BC000Q3_A586TBT11_INPUT_END_AUTH_CD[0] ;
         n586TBT11_INPUT_END_AUTH_CD = BC000Q3_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = BC000Q3_A884TBT11_UPD_RIYU[0] ;
         n884TBT11_UPD_RIYU = BC000Q3_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = BC000Q3_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = BC000Q3_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = BC000Q3_A310TBT11_CRT_PROG_NM[0] ;
         n310TBT11_CRT_PROG_NM = BC000Q3_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = BC000Q3_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = BC000Q3_n313TBT11_UPD_PROG_NM[0] ;
         O314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         n314TBT11_UPD_CNT = false ;
         Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
         Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
         Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
         Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0Q25( ) ;
         Gx_mode = sMode25 ;
      }
      else
      {
         RcdFound25 = (short)(0) ;
         initializeNonKey0Q25( ) ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode25 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Q25( ) ;
      if ( RcdFound25 == 0 )
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
      confirm_0Q0( ) ;
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

   public void checkOptimisticConcurrency0Q25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000Q2 */
         pr_default.execute(0, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z308TBT11_CRT_DATETIME.equals( BC000Q2_A308TBT11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z309TBT11_CRT_USER_ID, BC000Q2_A309TBT11_CRT_USER_ID[0]) != 0 ) || !( Z311TBT11_UPD_DATETIME.equals( BC000Q2_A311TBT11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z312TBT11_UPD_USER_ID, BC000Q2_A312TBT11_UPD_USER_ID[0]) != 0 ) || ( Z314TBT11_UPD_CNT != BC000Q2_A314TBT11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z573TBT11_CRF_INPUT_LEVEL != BC000Q2_A573TBT11_CRF_INPUT_LEVEL[0] ) || !( Z574TBT11_UPLOAD_DATETIME.equals( BC000Q2_A574TBT11_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z575TBT11_UPLOAD_USER_ID, BC000Q2_A575TBT11_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z576TBT11_UPLOAD_AUTH_CD, BC000Q2_A576TBT11_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z577TBT11_DM_ARRIVAL_FLG, BC000Q2_A577TBT11_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z578TBT11_DM_ARRIVAL_DATETIME.equals( BC000Q2_A578TBT11_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z579TBT11_APPROVAL_FLG, BC000Q2_A579TBT11_APPROVAL_FLG[0]) != 0 ) || !( Z580TBT11_APPROVAL_DATETIME.equals( BC000Q2_A580TBT11_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z581TBT11_APPROVAL_USER_ID, BC000Q2_A581TBT11_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z582TBT11_APPROVAL_AUTH_CD, BC000Q2_A582TBT11_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z583TBT11_INPUT_END_FLG, BC000Q2_A583TBT11_INPUT_END_FLG[0]) != 0 ) || !( Z584TBT11_INPUT_END_DATETIME.equals( BC000Q2_A584TBT11_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z585TBT11_INPUT_END_USER_ID, BC000Q2_A585TBT11_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z586TBT11_INPUT_END_AUTH_CD, BC000Q2_A586TBT11_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z884TBT11_UPD_RIYU, BC000Q2_A884TBT11_UPD_RIYU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z307TBT11_DEL_FLG, BC000Q2_A307TBT11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z310TBT11_CRT_PROG_NM, BC000Q2_A310TBT11_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z313TBT11_UPD_PROG_NM, BC000Q2_A313TBT11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT11_CRF_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q25( )
   {
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q25( 0) ;
         checkOptimisticConcurrency0Q25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q25( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Q6 */
                  pr_default.execute(4, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION), new Boolean(n308TBT11_CRT_DATETIME), A308TBT11_CRT_DATETIME, new Boolean(n309TBT11_CRT_USER_ID), A309TBT11_CRT_USER_ID, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Boolean(n573TBT11_CRF_INPUT_LEVEL), new Byte(A573TBT11_CRF_INPUT_LEVEL), new Boolean(n574TBT11_UPLOAD_DATETIME), A574TBT11_UPLOAD_DATETIME, new Boolean(n575TBT11_UPLOAD_USER_ID), A575TBT11_UPLOAD_USER_ID, new Boolean(n576TBT11_UPLOAD_AUTH_CD), A576TBT11_UPLOAD_AUTH_CD, new Boolean(n577TBT11_DM_ARRIVAL_FLG), A577TBT11_DM_ARRIVAL_FLG, new Boolean(n578TBT11_DM_ARRIVAL_DATETIME), A578TBT11_DM_ARRIVAL_DATETIME, new Boolean(n579TBT11_APPROVAL_FLG), A579TBT11_APPROVAL_FLG, new Boolean(n580TBT11_APPROVAL_DATETIME), A580TBT11_APPROVAL_DATETIME, new Boolean(n581TBT11_APPROVAL_USER_ID), A581TBT11_APPROVAL_USER_ID, new Boolean(n582TBT11_APPROVAL_AUTH_CD), A582TBT11_APPROVAL_AUTH_CD, new Boolean(n583TBT11_INPUT_END_FLG), A583TBT11_INPUT_END_FLG, new Boolean(n584TBT11_INPUT_END_DATETIME), A584TBT11_INPUT_END_DATETIME, new Boolean(n585TBT11_INPUT_END_USER_ID), A585TBT11_INPUT_END_USER_ID, new Boolean(n586TBT11_INPUT_END_AUTH_CD), A586TBT11_INPUT_END_AUTH_CD, new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n307TBT11_DEL_FLG), A307TBT11_DEL_FLG, new Boolean(n310TBT11_CRT_PROG_NM), A310TBT11_CRT_PROG_NM, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM});
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
            load0Q25( ) ;
         }
         endLevel0Q25( ) ;
      }
      closeExtendedTableCursors0Q25( ) ;
   }

   public void update0Q25( )
   {
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q25( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Q7 */
                  pr_default.execute(5, new Object[] {new Boolean(n308TBT11_CRT_DATETIME), A308TBT11_CRT_DATETIME, new Boolean(n309TBT11_CRT_USER_ID), A309TBT11_CRT_USER_ID, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Boolean(n573TBT11_CRF_INPUT_LEVEL), new Byte(A573TBT11_CRF_INPUT_LEVEL), new Boolean(n574TBT11_UPLOAD_DATETIME), A574TBT11_UPLOAD_DATETIME, new Boolean(n575TBT11_UPLOAD_USER_ID), A575TBT11_UPLOAD_USER_ID, new Boolean(n576TBT11_UPLOAD_AUTH_CD), A576TBT11_UPLOAD_AUTH_CD, new Boolean(n577TBT11_DM_ARRIVAL_FLG), A577TBT11_DM_ARRIVAL_FLG, new Boolean(n578TBT11_DM_ARRIVAL_DATETIME), A578TBT11_DM_ARRIVAL_DATETIME, new Boolean(n579TBT11_APPROVAL_FLG), A579TBT11_APPROVAL_FLG, new Boolean(n580TBT11_APPROVAL_DATETIME), A580TBT11_APPROVAL_DATETIME, new Boolean(n581TBT11_APPROVAL_USER_ID), A581TBT11_APPROVAL_USER_ID, new Boolean(n582TBT11_APPROVAL_AUTH_CD), A582TBT11_APPROVAL_AUTH_CD, new Boolean(n583TBT11_INPUT_END_FLG), A583TBT11_INPUT_END_FLG, new Boolean(n584TBT11_INPUT_END_DATETIME), A584TBT11_INPUT_END_DATETIME, new Boolean(n585TBT11_INPUT_END_USER_ID), A585TBT11_INPUT_END_USER_ID, new Boolean(n586TBT11_INPUT_END_AUTH_CD), A586TBT11_INPUT_END_AUTH_CD, new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n307TBT11_DEL_FLG), A307TBT11_DEL_FLG, new Boolean(n310TBT11_CRT_PROG_NM), A310TBT11_CRT_PROG_NM, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q25( ) ;
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
         endLevel0Q25( ) ;
      }
      closeExtendedTableCursors0Q25( ) ;
   }

   public void deferredUpdate0Q25( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q25( ) ;
         afterConfirm0Q25( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q25( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000Q8 */
               pr_default.execute(6, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
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
      sMode25 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0Q25( ) ;
      Gx_mode = sMode25 ;
   }

   public void onDeleteControls0Q25( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      }
   }

   public void endLevel0Q25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Q25( ) ;
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

   public void scanKeyStart0Q25( )
   {
      /* Using cursor BC000Q9 */
      pr_default.execute(7, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      RcdFound25 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = BC000Q9_A303TBT11_STUDY_ID[0] ;
         A304TBT11_SUBJECT_ID = BC000Q9_A304TBT11_SUBJECT_ID[0] ;
         A305TBT11_CRF_ID = BC000Q9_A305TBT11_CRF_ID[0] ;
         A306TBT11_CRF_VERSION = BC000Q9_A306TBT11_CRF_VERSION[0] ;
         A308TBT11_CRT_DATETIME = BC000Q9_A308TBT11_CRT_DATETIME[0] ;
         n308TBT11_CRT_DATETIME = BC000Q9_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = BC000Q9_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = BC000Q9_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = BC000Q9_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = BC000Q9_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = BC000Q9_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = BC000Q9_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = BC000Q9_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = BC000Q9_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = BC000Q9_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = BC000Q9_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = BC000Q9_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = BC000Q9_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = BC000Q9_A575TBT11_UPLOAD_USER_ID[0] ;
         n575TBT11_UPLOAD_USER_ID = BC000Q9_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = BC000Q9_A576TBT11_UPLOAD_AUTH_CD[0] ;
         n576TBT11_UPLOAD_AUTH_CD = BC000Q9_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = BC000Q9_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = BC000Q9_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = BC000Q9_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = BC000Q9_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = BC000Q9_A579TBT11_APPROVAL_FLG[0] ;
         n579TBT11_APPROVAL_FLG = BC000Q9_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = BC000Q9_A580TBT11_APPROVAL_DATETIME[0] ;
         n580TBT11_APPROVAL_DATETIME = BC000Q9_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = BC000Q9_A581TBT11_APPROVAL_USER_ID[0] ;
         n581TBT11_APPROVAL_USER_ID = BC000Q9_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = BC000Q9_A582TBT11_APPROVAL_AUTH_CD[0] ;
         n582TBT11_APPROVAL_AUTH_CD = BC000Q9_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = BC000Q9_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = BC000Q9_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = BC000Q9_A584TBT11_INPUT_END_DATETIME[0] ;
         n584TBT11_INPUT_END_DATETIME = BC000Q9_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = BC000Q9_A585TBT11_INPUT_END_USER_ID[0] ;
         n585TBT11_INPUT_END_USER_ID = BC000Q9_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = BC000Q9_A586TBT11_INPUT_END_AUTH_CD[0] ;
         n586TBT11_INPUT_END_AUTH_CD = BC000Q9_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = BC000Q9_A884TBT11_UPD_RIYU[0] ;
         n884TBT11_UPD_RIYU = BC000Q9_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = BC000Q9_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = BC000Q9_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = BC000Q9_A310TBT11_CRT_PROG_NM[0] ;
         n310TBT11_CRT_PROG_NM = BC000Q9_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = BC000Q9_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = BC000Q9_n313TBT11_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0Q25( )
   {
      pr_default.readNext(7);
      RcdFound25 = (short)(0) ;
      scanKeyLoad0Q25( ) ;
   }

   public void scanKeyLoad0Q25( )
   {
      sMode25 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = BC000Q9_A303TBT11_STUDY_ID[0] ;
         A304TBT11_SUBJECT_ID = BC000Q9_A304TBT11_SUBJECT_ID[0] ;
         A305TBT11_CRF_ID = BC000Q9_A305TBT11_CRF_ID[0] ;
         A306TBT11_CRF_VERSION = BC000Q9_A306TBT11_CRF_VERSION[0] ;
         A308TBT11_CRT_DATETIME = BC000Q9_A308TBT11_CRT_DATETIME[0] ;
         n308TBT11_CRT_DATETIME = BC000Q9_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = BC000Q9_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = BC000Q9_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = BC000Q9_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = BC000Q9_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = BC000Q9_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = BC000Q9_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = BC000Q9_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = BC000Q9_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = BC000Q9_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = BC000Q9_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = BC000Q9_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = BC000Q9_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = BC000Q9_A575TBT11_UPLOAD_USER_ID[0] ;
         n575TBT11_UPLOAD_USER_ID = BC000Q9_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = BC000Q9_A576TBT11_UPLOAD_AUTH_CD[0] ;
         n576TBT11_UPLOAD_AUTH_CD = BC000Q9_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = BC000Q9_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = BC000Q9_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = BC000Q9_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = BC000Q9_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = BC000Q9_A579TBT11_APPROVAL_FLG[0] ;
         n579TBT11_APPROVAL_FLG = BC000Q9_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = BC000Q9_A580TBT11_APPROVAL_DATETIME[0] ;
         n580TBT11_APPROVAL_DATETIME = BC000Q9_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = BC000Q9_A581TBT11_APPROVAL_USER_ID[0] ;
         n581TBT11_APPROVAL_USER_ID = BC000Q9_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = BC000Q9_A582TBT11_APPROVAL_AUTH_CD[0] ;
         n582TBT11_APPROVAL_AUTH_CD = BC000Q9_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = BC000Q9_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = BC000Q9_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = BC000Q9_A584TBT11_INPUT_END_DATETIME[0] ;
         n584TBT11_INPUT_END_DATETIME = BC000Q9_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = BC000Q9_A585TBT11_INPUT_END_USER_ID[0] ;
         n585TBT11_INPUT_END_USER_ID = BC000Q9_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = BC000Q9_A586TBT11_INPUT_END_AUTH_CD[0] ;
         n586TBT11_INPUT_END_AUTH_CD = BC000Q9_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = BC000Q9_A884TBT11_UPD_RIYU[0] ;
         n884TBT11_UPD_RIYU = BC000Q9_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = BC000Q9_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = BC000Q9_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = BC000Q9_A310TBT11_CRT_PROG_NM[0] ;
         n310TBT11_CRT_PROG_NM = BC000Q9_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = BC000Q9_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = BC000Q9_n313TBT11_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode25 ;
   }

   public void scanKeyEnd0Q25( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0Q25( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q25( )
   {
      /* Before Insert Rules */
      A308TBT11_CRT_DATETIME = GXutil.now( ) ;
      n308TBT11_CRT_DATETIME = false ;
      GXt_char1 = A309TBT11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A309TBT11_CRT_USER_ID = GXt_char1 ;
      n309TBT11_CRT_USER_ID = false ;
      A311TBT11_UPD_DATETIME = GXutil.now( ) ;
      n311TBT11_UPD_DATETIME = false ;
      GXt_char1 = A312TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A312TBT11_UPD_USER_ID = GXt_char1 ;
      n312TBT11_UPD_USER_ID = false ;
      A314TBT11_UPD_CNT = (long)(O314TBT11_UPD_CNT+1) ;
      n314TBT11_UPD_CNT = false ;
   }

   public void beforeUpdate0Q25( )
   {
      /* Before Update Rules */
      A311TBT11_UPD_DATETIME = GXutil.now( ) ;
      n311TBT11_UPD_DATETIME = false ;
      GXt_char1 = A312TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A312TBT11_UPD_USER_ID = GXt_char1 ;
      n312TBT11_UPD_USER_ID = false ;
      A314TBT11_UPD_CNT = (long)(O314TBT11_UPD_CNT+1) ;
      n314TBT11_UPD_CNT = false ;
   }

   public void beforeDelete0Q25( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q25( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q25( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q25( )
   {
   }

   public void addRow0Q25( )
   {
      VarsToRow25( bcTBT11_CRF_HISTORY) ;
   }

   public void readRow0Q25( )
   {
      RowToVars25( bcTBT11_CRF_HISTORY, 1) ;
   }

   public void initializeNonKey0Q25( )
   {
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n308TBT11_CRT_DATETIME = false ;
      A309TBT11_CRT_USER_ID = "" ;
      n309TBT11_CRT_USER_ID = false ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n311TBT11_UPD_DATETIME = false ;
      A312TBT11_UPD_USER_ID = "" ;
      n312TBT11_UPD_USER_ID = false ;
      A314TBT11_UPD_CNT = 0 ;
      n314TBT11_UPD_CNT = false ;
      A573TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
      n573TBT11_CRF_INPUT_LEVEL = false ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n574TBT11_UPLOAD_DATETIME = false ;
      A575TBT11_UPLOAD_USER_ID = "" ;
      n575TBT11_UPLOAD_USER_ID = false ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      n576TBT11_UPLOAD_AUTH_CD = false ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      n577TBT11_DM_ARRIVAL_FLG = false ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n578TBT11_DM_ARRIVAL_DATETIME = false ;
      A579TBT11_APPROVAL_FLG = "" ;
      n579TBT11_APPROVAL_FLG = false ;
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n580TBT11_APPROVAL_DATETIME = false ;
      A581TBT11_APPROVAL_USER_ID = "" ;
      n581TBT11_APPROVAL_USER_ID = false ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      n582TBT11_APPROVAL_AUTH_CD = false ;
      A583TBT11_INPUT_END_FLG = "" ;
      n583TBT11_INPUT_END_FLG = false ;
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n584TBT11_INPUT_END_DATETIME = false ;
      A585TBT11_INPUT_END_USER_ID = "" ;
      n585TBT11_INPUT_END_USER_ID = false ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      n586TBT11_INPUT_END_AUTH_CD = false ;
      A884TBT11_UPD_RIYU = "" ;
      n884TBT11_UPD_RIYU = false ;
      A307TBT11_DEL_FLG = "" ;
      n307TBT11_DEL_FLG = false ;
      A310TBT11_CRT_PROG_NM = "" ;
      n310TBT11_CRT_PROG_NM = false ;
      A313TBT11_UPD_PROG_NM = "" ;
      n313TBT11_UPD_PROG_NM = false ;
      O314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
      n314TBT11_UPD_CNT = false ;
   }

   public void initAll0Q25( )
   {
      A303TBT11_STUDY_ID = 0 ;
      A304TBT11_SUBJECT_ID = 0 ;
      A305TBT11_CRF_ID = (short)(0) ;
      A306TBT11_CRF_VERSION = (short)(0) ;
      initializeNonKey0Q25( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow25( SdtTBT11_CRF_HISTORY obj25 )
   {
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Mode( Gx_mode );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime( A308TBT11_CRT_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id( A309TBT11_CRT_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime( A311TBT11_UPD_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id( A312TBT11_UPD_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt( A314TBT11_UPD_CNT );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( A573TBT11_CRF_INPUT_LEVEL );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( A574TBT11_UPLOAD_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( A575TBT11_UPLOAD_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( A576TBT11_UPLOAD_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( A577TBT11_DM_ARRIVAL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A578TBT11_DM_ARRIVAL_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A579TBT11_APPROVAL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A580TBT11_APPROVAL_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A581TBT11_APPROVAL_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A582TBT11_APPROVAL_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( A583TBT11_INPUT_END_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( A584TBT11_INPUT_END_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( A585TBT11_INPUT_END_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( A586TBT11_INPUT_END_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( A884TBT11_UPD_RIYU );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( A307TBT11_DEL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( A310TBT11_CRT_PROG_NM );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( A313TBT11_UPD_PROG_NM );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A303TBT11_STUDY_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A304TBT11_SUBJECT_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A305TBT11_CRF_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( A306TBT11_CRF_VERSION );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z( Z303TBT11_STUDY_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z( Z304TBT11_SUBJECT_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z( Z305TBT11_CRF_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z( Z306TBT11_CRF_VERSION );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z( Z573TBT11_CRF_INPUT_LEVEL );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z( Z574TBT11_UPLOAD_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z( Z575TBT11_UPLOAD_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z( Z576TBT11_UPLOAD_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z( Z577TBT11_DM_ARRIVAL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z( Z578TBT11_DM_ARRIVAL_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z( Z579TBT11_APPROVAL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z( Z580TBT11_APPROVAL_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z( Z581TBT11_APPROVAL_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z( Z582TBT11_APPROVAL_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z( Z583TBT11_INPUT_END_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z( Z584TBT11_INPUT_END_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z( Z585TBT11_INPUT_END_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z( Z586TBT11_INPUT_END_AUTH_CD );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z( Z884TBT11_UPD_RIYU );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z( Z307TBT11_DEL_FLG );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z( Z308TBT11_CRT_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z( Z309TBT11_CRT_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z( Z310TBT11_CRT_PROG_NM );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z( Z311TBT11_UPD_DATETIME );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z( Z312TBT11_UPD_USER_ID );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z( Z313TBT11_UPD_PROG_NM );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z( Z314TBT11_UPD_CNT );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N( (byte)((byte)((n573TBT11_CRF_INPUT_LEVEL)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N( (byte)((byte)((n574TBT11_UPLOAD_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N( (byte)((byte)((n575TBT11_UPLOAD_USER_ID)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N( (byte)((byte)((n576TBT11_UPLOAD_AUTH_CD)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N( (byte)((byte)((n577TBT11_DM_ARRIVAL_FLG)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N( (byte)((byte)((n578TBT11_DM_ARRIVAL_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N( (byte)((byte)((n579TBT11_APPROVAL_FLG)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N( (byte)((byte)((n580TBT11_APPROVAL_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N( (byte)((byte)((n581TBT11_APPROVAL_USER_ID)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N( (byte)((byte)((n582TBT11_APPROVAL_AUTH_CD)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N( (byte)((byte)((n583TBT11_INPUT_END_FLG)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N( (byte)((byte)((n584TBT11_INPUT_END_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N( (byte)((byte)((n585TBT11_INPUT_END_USER_ID)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N( (byte)((byte)((n586TBT11_INPUT_END_AUTH_CD)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N( (byte)((byte)((n884TBT11_UPD_RIYU)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N( (byte)((byte)((n307TBT11_DEL_FLG)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N( (byte)((byte)((n308TBT11_CRT_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N( (byte)((byte)((n309TBT11_CRT_USER_ID)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N( (byte)((byte)((n310TBT11_CRT_PROG_NM)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N( (byte)((byte)((n311TBT11_UPD_DATETIME)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N( (byte)((byte)((n312TBT11_UPD_USER_ID)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N( (byte)((byte)((n313TBT11_UPD_PROG_NM)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N( (byte)((byte)((n314TBT11_UPD_CNT)?1:0)) );
      obj25.setgxTv_SdtTBT11_CRF_HISTORY_Mode( Gx_mode );
   }

   public void RowToVars25( SdtTBT11_CRF_HISTORY obj25 ,
                            int forceLoad )
   {
      Gx_mode = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Mode() ;
      A308TBT11_CRT_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime() ;
      n308TBT11_CRT_DATETIME = false ;
      A309TBT11_CRT_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id() ;
      n309TBT11_CRT_USER_ID = false ;
      A311TBT11_UPD_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime() ;
      n311TBT11_UPD_DATETIME = false ;
      A312TBT11_UPD_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id() ;
      n312TBT11_UPD_USER_ID = false ;
      A314TBT11_UPD_CNT = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt() ;
      n314TBT11_UPD_CNT = false ;
      A573TBT11_CRF_INPUT_LEVEL = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level() ;
      n573TBT11_CRF_INPUT_LEVEL = false ;
      A574TBT11_UPLOAD_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime() ;
      n574TBT11_UPLOAD_DATETIME = false ;
      A575TBT11_UPLOAD_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id() ;
      n575TBT11_UPLOAD_USER_ID = false ;
      A576TBT11_UPLOAD_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd() ;
      n576TBT11_UPLOAD_AUTH_CD = false ;
      A577TBT11_DM_ARRIVAL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg() ;
      n577TBT11_DM_ARRIVAL_FLG = false ;
      A578TBT11_DM_ARRIVAL_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime() ;
      n578TBT11_DM_ARRIVAL_DATETIME = false ;
      A579TBT11_APPROVAL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg() ;
      n579TBT11_APPROVAL_FLG = false ;
      A580TBT11_APPROVAL_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime() ;
      n580TBT11_APPROVAL_DATETIME = false ;
      A581TBT11_APPROVAL_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id() ;
      n581TBT11_APPROVAL_USER_ID = false ;
      A582TBT11_APPROVAL_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd() ;
      n582TBT11_APPROVAL_AUTH_CD = false ;
      A583TBT11_INPUT_END_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg() ;
      n583TBT11_INPUT_END_FLG = false ;
      A584TBT11_INPUT_END_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime() ;
      n584TBT11_INPUT_END_DATETIME = false ;
      A585TBT11_INPUT_END_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id() ;
      n585TBT11_INPUT_END_USER_ID = false ;
      A586TBT11_INPUT_END_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd() ;
      n586TBT11_INPUT_END_AUTH_CD = false ;
      A884TBT11_UPD_RIYU = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu() ;
      n884TBT11_UPD_RIYU = false ;
      A307TBT11_DEL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg() ;
      n307TBT11_DEL_FLG = false ;
      A310TBT11_CRT_PROG_NM = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm() ;
      n310TBT11_CRT_PROG_NM = false ;
      A313TBT11_UPD_PROG_NM = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm() ;
      n313TBT11_UPD_PROG_NM = false ;
      A303TBT11_STUDY_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id() ;
      A304TBT11_SUBJECT_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id() ;
      A305TBT11_CRF_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id() ;
      A306TBT11_CRF_VERSION = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version() ;
      Z303TBT11_STUDY_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z() ;
      Z304TBT11_SUBJECT_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z() ;
      Z305TBT11_CRF_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z() ;
      Z306TBT11_CRF_VERSION = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z() ;
      Z573TBT11_CRF_INPUT_LEVEL = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z() ;
      Z574TBT11_UPLOAD_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z() ;
      Z575TBT11_UPLOAD_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z() ;
      Z576TBT11_UPLOAD_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z() ;
      Z577TBT11_DM_ARRIVAL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z() ;
      Z578TBT11_DM_ARRIVAL_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z() ;
      Z579TBT11_APPROVAL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z() ;
      Z580TBT11_APPROVAL_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z() ;
      Z581TBT11_APPROVAL_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z() ;
      Z582TBT11_APPROVAL_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z() ;
      Z583TBT11_INPUT_END_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z() ;
      Z584TBT11_INPUT_END_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z() ;
      Z585TBT11_INPUT_END_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z() ;
      Z586TBT11_INPUT_END_AUTH_CD = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z() ;
      Z884TBT11_UPD_RIYU = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z() ;
      Z307TBT11_DEL_FLG = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z() ;
      Z308TBT11_CRT_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z() ;
      Z309TBT11_CRT_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z() ;
      Z310TBT11_CRT_PROG_NM = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z() ;
      Z311TBT11_UPD_DATETIME = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z() ;
      Z312TBT11_UPD_USER_ID = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z() ;
      Z313TBT11_UPD_PROG_NM = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z() ;
      Z314TBT11_UPD_CNT = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z() ;
      O314TBT11_UPD_CNT = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z() ;
      n573TBT11_CRF_INPUT_LEVEL = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N()==0)?false:true) ;
      n574TBT11_UPLOAD_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N()==0)?false:true) ;
      n575TBT11_UPLOAD_USER_ID = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N()==0)?false:true) ;
      n576TBT11_UPLOAD_AUTH_CD = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N()==0)?false:true) ;
      n577TBT11_DM_ARRIVAL_FLG = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N()==0)?false:true) ;
      n578TBT11_DM_ARRIVAL_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N()==0)?false:true) ;
      n579TBT11_APPROVAL_FLG = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N()==0)?false:true) ;
      n580TBT11_APPROVAL_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N()==0)?false:true) ;
      n581TBT11_APPROVAL_USER_ID = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N()==0)?false:true) ;
      n582TBT11_APPROVAL_AUTH_CD = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N()==0)?false:true) ;
      n583TBT11_INPUT_END_FLG = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N()==0)?false:true) ;
      n584TBT11_INPUT_END_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N()==0)?false:true) ;
      n585TBT11_INPUT_END_USER_ID = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N()==0)?false:true) ;
      n586TBT11_INPUT_END_AUTH_CD = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N()==0)?false:true) ;
      n884TBT11_UPD_RIYU = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N()==0)?false:true) ;
      n307TBT11_DEL_FLG = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N()==0)?false:true) ;
      n308TBT11_CRT_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N()==0)?false:true) ;
      n309TBT11_CRT_USER_ID = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N()==0)?false:true) ;
      n310TBT11_CRT_PROG_NM = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N()==0)?false:true) ;
      n311TBT11_UPD_DATETIME = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N()==0)?false:true) ;
      n312TBT11_UPD_USER_ID = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N()==0)?false:true) ;
      n313TBT11_UPD_PROG_NM = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N()==0)?false:true) ;
      n314TBT11_UPD_CNT = (boolean)((obj25.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj25.getgxTv_SdtTBT11_CRF_HISTORY_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A303TBT11_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A304TBT11_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A305TBT11_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A306TBT11_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0Q25( ) ;
      scanKeyStart0Q25( ) ;
      if ( RcdFound25 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
         Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
         Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
         Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         O314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         n314TBT11_UPD_CNT = false ;
      }
      zm0Q25( -12) ;
      sMode25 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0Q25( ) ;
      Gx_mode = sMode25 ;
      addRow0Q25( ) ;
      scanKeyEnd0Q25( ) ;
      if ( RcdFound25 == 0 )
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
      RowToVars25( bcTBT11_CRF_HISTORY, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0Q25( ) ;
      if ( RcdFound25 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
         {
            A303TBT11_STUDY_ID = Z303TBT11_STUDY_ID ;
            A304TBT11_SUBJECT_ID = Z304TBT11_SUBJECT_ID ;
            A305TBT11_CRF_ID = Z305TBT11_CRF_ID ;
            A306TBT11_CRF_VERSION = Z306TBT11_CRF_VERSION ;
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
            update0Q25( ) ;
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
            if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
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
                  insert0Q25( ) ;
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
                  insert0Q25( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow25( bcTBT11_CRF_HISTORY) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars25( bcTBT11_CRF_HISTORY, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0Q25( ) ;
      if ( RcdFound25 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
         {
            A303TBT11_STUDY_ID = Z303TBT11_STUDY_ID ;
            A304TBT11_SUBJECT_ID = Z304TBT11_SUBJECT_ID ;
            A305TBT11_CRF_ID = Z305TBT11_CRF_ID ;
            A306TBT11_CRF_VERSION = Z306TBT11_CRF_VERSION ;
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
         if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt11_crf_history_bc");
      VarsToRow25( bcTBT11_CRF_HISTORY) ;
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
      Gx_mode = bcTBT11_CRF_HISTORY.getgxTv_SdtTBT11_CRF_HISTORY_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT11_CRF_HISTORY sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT11_CRF_HISTORY )
      {
         bcTBT11_CRF_HISTORY = sdt ;
         if ( GXutil.strcmp(bcTBT11_CRF_HISTORY.getgxTv_SdtTBT11_CRF_HISTORY_Mode(), "") == 0 )
         {
            bcTBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow25( bcTBT11_CRF_HISTORY) ;
         }
         else
         {
            RowToVars25( bcTBT11_CRF_HISTORY, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT11_CRF_HISTORY.getgxTv_SdtTBT11_CRF_HISTORY_Mode(), "") == 0 )
         {
            bcTBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars25( bcTBT11_CRF_HISTORY, 1) ;
   }

   public SdtTBT11_CRF_HISTORY getTBT11_CRF_HISTORY_BC( )
   {
      return bcTBT11_CRF_HISTORY ;
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
                  /* Execute user subroutine: S1179 */
                  S1179 ();
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
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = "" ;
      Z308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z309TBT11_CRT_USER_ID = "" ;
      A309TBT11_CRT_USER_ID = "" ;
      Z311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z312TBT11_UPD_USER_ID = "" ;
      A312TBT11_UPD_USER_ID = "" ;
      Z574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z575TBT11_UPLOAD_USER_ID = "" ;
      A575TBT11_UPLOAD_USER_ID = "" ;
      Z576TBT11_UPLOAD_AUTH_CD = "" ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      Z577TBT11_DM_ARRIVAL_FLG = "" ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      Z578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z579TBT11_APPROVAL_FLG = "" ;
      A579TBT11_APPROVAL_FLG = "" ;
      Z580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z581TBT11_APPROVAL_USER_ID = "" ;
      A581TBT11_APPROVAL_USER_ID = "" ;
      Z582TBT11_APPROVAL_AUTH_CD = "" ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      Z583TBT11_INPUT_END_FLG = "" ;
      A583TBT11_INPUT_END_FLG = "" ;
      Z584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z585TBT11_INPUT_END_USER_ID = "" ;
      A585TBT11_INPUT_END_USER_ID = "" ;
      Z586TBT11_INPUT_END_AUTH_CD = "" ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      Z884TBT11_UPD_RIYU = "" ;
      A884TBT11_UPD_RIYU = "" ;
      Z307TBT11_DEL_FLG = "" ;
      A307TBT11_DEL_FLG = "" ;
      Z310TBT11_CRT_PROG_NM = "" ;
      A310TBT11_CRT_PROG_NM = "" ;
      Z313TBT11_UPD_PROG_NM = "" ;
      A313TBT11_UPD_PROG_NM = "" ;
      BC000Q4_A303TBT11_STUDY_ID = new long[1] ;
      BC000Q4_A304TBT11_SUBJECT_ID = new int[1] ;
      BC000Q4_A305TBT11_CRF_ID = new short[1] ;
      BC000Q4_A306TBT11_CRF_VERSION = new short[1] ;
      BC000Q4_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q4_A309TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q4_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q4_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q4_A312TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q4_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q4_A314TBT11_UPD_CNT = new long[1] ;
      BC000Q4_n314TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q4_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q4_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q4_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q4_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q4_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q4_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q4_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q4_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q4_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q4_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q4_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q4_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q4_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q4_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q4_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q4_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q4_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q4_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q4_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q4_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q4_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q4_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A884TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q4_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q4_A307TBT11_DEL_FLG = new String[] {""} ;
      BC000Q4_n307TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q4_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q4_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q4_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q4_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      BC000Q5_A303TBT11_STUDY_ID = new long[1] ;
      BC000Q5_A304TBT11_SUBJECT_ID = new int[1] ;
      BC000Q5_A305TBT11_CRF_ID = new short[1] ;
      BC000Q5_A306TBT11_CRF_VERSION = new short[1] ;
      BC000Q3_A303TBT11_STUDY_ID = new long[1] ;
      BC000Q3_A304TBT11_SUBJECT_ID = new int[1] ;
      BC000Q3_A305TBT11_CRF_ID = new short[1] ;
      BC000Q3_A306TBT11_CRF_VERSION = new short[1] ;
      BC000Q3_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q3_A309TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q3_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q3_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q3_A312TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q3_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q3_A314TBT11_UPD_CNT = new long[1] ;
      BC000Q3_n314TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q3_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q3_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q3_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q3_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q3_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q3_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q3_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q3_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q3_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q3_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q3_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q3_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q3_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q3_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q3_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q3_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q3_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q3_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q3_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q3_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q3_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q3_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A884TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q3_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q3_A307TBT11_DEL_FLG = new String[] {""} ;
      BC000Q3_n307TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q3_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q3_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q3_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q3_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      sMode25 = "" ;
      BC000Q2_A303TBT11_STUDY_ID = new long[1] ;
      BC000Q2_A304TBT11_SUBJECT_ID = new int[1] ;
      BC000Q2_A305TBT11_CRF_ID = new short[1] ;
      BC000Q2_A306TBT11_CRF_VERSION = new short[1] ;
      BC000Q2_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q2_A309TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q2_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q2_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q2_A312TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q2_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q2_A314TBT11_UPD_CNT = new long[1] ;
      BC000Q2_n314TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q2_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q2_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q2_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q2_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q2_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q2_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q2_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q2_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q2_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q2_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q2_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q2_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q2_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q2_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q2_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q2_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q2_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q2_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q2_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q2_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q2_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q2_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A884TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q2_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q2_A307TBT11_DEL_FLG = new String[] {""} ;
      BC000Q2_n307TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q2_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q2_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q2_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q2_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      BC000Q9_A303TBT11_STUDY_ID = new long[1] ;
      BC000Q9_A304TBT11_SUBJECT_ID = new int[1] ;
      BC000Q9_A305TBT11_CRF_ID = new short[1] ;
      BC000Q9_A306TBT11_CRF_VERSION = new short[1] ;
      BC000Q9_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q9_A309TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q9_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q9_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q9_A312TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q9_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q9_A314TBT11_UPD_CNT = new long[1] ;
      BC000Q9_n314TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q9_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q9_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q9_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q9_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q9_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q9_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q9_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q9_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q9_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q9_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q9_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q9_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q9_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q9_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q9_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q9_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q9_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q9_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q9_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q9_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q9_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q9_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A884TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q9_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q9_A307TBT11_DEL_FLG = new String[] {""} ;
      BC000Q9_n307TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q9_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q9_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q9_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q9_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt11_crf_history_bc__default(),
         new Object[] {
             new Object[] {
            BC000Q2_A303TBT11_STUDY_ID, BC000Q2_A304TBT11_SUBJECT_ID, BC000Q2_A305TBT11_CRF_ID, BC000Q2_A306TBT11_CRF_VERSION, BC000Q2_A308TBT11_CRT_DATETIME, BC000Q2_n308TBT11_CRT_DATETIME, BC000Q2_A309TBT11_CRT_USER_ID, BC000Q2_n309TBT11_CRT_USER_ID, BC000Q2_A311TBT11_UPD_DATETIME, BC000Q2_n311TBT11_UPD_DATETIME,
            BC000Q2_A312TBT11_UPD_USER_ID, BC000Q2_n312TBT11_UPD_USER_ID, BC000Q2_A314TBT11_UPD_CNT, BC000Q2_n314TBT11_UPD_CNT, BC000Q2_A573TBT11_CRF_INPUT_LEVEL, BC000Q2_n573TBT11_CRF_INPUT_LEVEL, BC000Q2_A574TBT11_UPLOAD_DATETIME, BC000Q2_n574TBT11_UPLOAD_DATETIME, BC000Q2_A575TBT11_UPLOAD_USER_ID, BC000Q2_n575TBT11_UPLOAD_USER_ID,
            BC000Q2_A576TBT11_UPLOAD_AUTH_CD, BC000Q2_n576TBT11_UPLOAD_AUTH_CD, BC000Q2_A577TBT11_DM_ARRIVAL_FLG, BC000Q2_n577TBT11_DM_ARRIVAL_FLG, BC000Q2_A578TBT11_DM_ARRIVAL_DATETIME, BC000Q2_n578TBT11_DM_ARRIVAL_DATETIME, BC000Q2_A579TBT11_APPROVAL_FLG, BC000Q2_n579TBT11_APPROVAL_FLG, BC000Q2_A580TBT11_APPROVAL_DATETIME, BC000Q2_n580TBT11_APPROVAL_DATETIME,
            BC000Q2_A581TBT11_APPROVAL_USER_ID, BC000Q2_n581TBT11_APPROVAL_USER_ID, BC000Q2_A582TBT11_APPROVAL_AUTH_CD, BC000Q2_n582TBT11_APPROVAL_AUTH_CD, BC000Q2_A583TBT11_INPUT_END_FLG, BC000Q2_n583TBT11_INPUT_END_FLG, BC000Q2_A584TBT11_INPUT_END_DATETIME, BC000Q2_n584TBT11_INPUT_END_DATETIME, BC000Q2_A585TBT11_INPUT_END_USER_ID, BC000Q2_n585TBT11_INPUT_END_USER_ID,
            BC000Q2_A586TBT11_INPUT_END_AUTH_CD, BC000Q2_n586TBT11_INPUT_END_AUTH_CD, BC000Q2_A884TBT11_UPD_RIYU, BC000Q2_n884TBT11_UPD_RIYU, BC000Q2_A307TBT11_DEL_FLG, BC000Q2_n307TBT11_DEL_FLG, BC000Q2_A310TBT11_CRT_PROG_NM, BC000Q2_n310TBT11_CRT_PROG_NM, BC000Q2_A313TBT11_UPD_PROG_NM, BC000Q2_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q3_A303TBT11_STUDY_ID, BC000Q3_A304TBT11_SUBJECT_ID, BC000Q3_A305TBT11_CRF_ID, BC000Q3_A306TBT11_CRF_VERSION, BC000Q3_A308TBT11_CRT_DATETIME, BC000Q3_n308TBT11_CRT_DATETIME, BC000Q3_A309TBT11_CRT_USER_ID, BC000Q3_n309TBT11_CRT_USER_ID, BC000Q3_A311TBT11_UPD_DATETIME, BC000Q3_n311TBT11_UPD_DATETIME,
            BC000Q3_A312TBT11_UPD_USER_ID, BC000Q3_n312TBT11_UPD_USER_ID, BC000Q3_A314TBT11_UPD_CNT, BC000Q3_n314TBT11_UPD_CNT, BC000Q3_A573TBT11_CRF_INPUT_LEVEL, BC000Q3_n573TBT11_CRF_INPUT_LEVEL, BC000Q3_A574TBT11_UPLOAD_DATETIME, BC000Q3_n574TBT11_UPLOAD_DATETIME, BC000Q3_A575TBT11_UPLOAD_USER_ID, BC000Q3_n575TBT11_UPLOAD_USER_ID,
            BC000Q3_A576TBT11_UPLOAD_AUTH_CD, BC000Q3_n576TBT11_UPLOAD_AUTH_CD, BC000Q3_A577TBT11_DM_ARRIVAL_FLG, BC000Q3_n577TBT11_DM_ARRIVAL_FLG, BC000Q3_A578TBT11_DM_ARRIVAL_DATETIME, BC000Q3_n578TBT11_DM_ARRIVAL_DATETIME, BC000Q3_A579TBT11_APPROVAL_FLG, BC000Q3_n579TBT11_APPROVAL_FLG, BC000Q3_A580TBT11_APPROVAL_DATETIME, BC000Q3_n580TBT11_APPROVAL_DATETIME,
            BC000Q3_A581TBT11_APPROVAL_USER_ID, BC000Q3_n581TBT11_APPROVAL_USER_ID, BC000Q3_A582TBT11_APPROVAL_AUTH_CD, BC000Q3_n582TBT11_APPROVAL_AUTH_CD, BC000Q3_A583TBT11_INPUT_END_FLG, BC000Q3_n583TBT11_INPUT_END_FLG, BC000Q3_A584TBT11_INPUT_END_DATETIME, BC000Q3_n584TBT11_INPUT_END_DATETIME, BC000Q3_A585TBT11_INPUT_END_USER_ID, BC000Q3_n585TBT11_INPUT_END_USER_ID,
            BC000Q3_A586TBT11_INPUT_END_AUTH_CD, BC000Q3_n586TBT11_INPUT_END_AUTH_CD, BC000Q3_A884TBT11_UPD_RIYU, BC000Q3_n884TBT11_UPD_RIYU, BC000Q3_A307TBT11_DEL_FLG, BC000Q3_n307TBT11_DEL_FLG, BC000Q3_A310TBT11_CRT_PROG_NM, BC000Q3_n310TBT11_CRT_PROG_NM, BC000Q3_A313TBT11_UPD_PROG_NM, BC000Q3_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q4_A303TBT11_STUDY_ID, BC000Q4_A304TBT11_SUBJECT_ID, BC000Q4_A305TBT11_CRF_ID, BC000Q4_A306TBT11_CRF_VERSION, BC000Q4_A308TBT11_CRT_DATETIME, BC000Q4_n308TBT11_CRT_DATETIME, BC000Q4_A309TBT11_CRT_USER_ID, BC000Q4_n309TBT11_CRT_USER_ID, BC000Q4_A311TBT11_UPD_DATETIME, BC000Q4_n311TBT11_UPD_DATETIME,
            BC000Q4_A312TBT11_UPD_USER_ID, BC000Q4_n312TBT11_UPD_USER_ID, BC000Q4_A314TBT11_UPD_CNT, BC000Q4_n314TBT11_UPD_CNT, BC000Q4_A573TBT11_CRF_INPUT_LEVEL, BC000Q4_n573TBT11_CRF_INPUT_LEVEL, BC000Q4_A574TBT11_UPLOAD_DATETIME, BC000Q4_n574TBT11_UPLOAD_DATETIME, BC000Q4_A575TBT11_UPLOAD_USER_ID, BC000Q4_n575TBT11_UPLOAD_USER_ID,
            BC000Q4_A576TBT11_UPLOAD_AUTH_CD, BC000Q4_n576TBT11_UPLOAD_AUTH_CD, BC000Q4_A577TBT11_DM_ARRIVAL_FLG, BC000Q4_n577TBT11_DM_ARRIVAL_FLG, BC000Q4_A578TBT11_DM_ARRIVAL_DATETIME, BC000Q4_n578TBT11_DM_ARRIVAL_DATETIME, BC000Q4_A579TBT11_APPROVAL_FLG, BC000Q4_n579TBT11_APPROVAL_FLG, BC000Q4_A580TBT11_APPROVAL_DATETIME, BC000Q4_n580TBT11_APPROVAL_DATETIME,
            BC000Q4_A581TBT11_APPROVAL_USER_ID, BC000Q4_n581TBT11_APPROVAL_USER_ID, BC000Q4_A582TBT11_APPROVAL_AUTH_CD, BC000Q4_n582TBT11_APPROVAL_AUTH_CD, BC000Q4_A583TBT11_INPUT_END_FLG, BC000Q4_n583TBT11_INPUT_END_FLG, BC000Q4_A584TBT11_INPUT_END_DATETIME, BC000Q4_n584TBT11_INPUT_END_DATETIME, BC000Q4_A585TBT11_INPUT_END_USER_ID, BC000Q4_n585TBT11_INPUT_END_USER_ID,
            BC000Q4_A586TBT11_INPUT_END_AUTH_CD, BC000Q4_n586TBT11_INPUT_END_AUTH_CD, BC000Q4_A884TBT11_UPD_RIYU, BC000Q4_n884TBT11_UPD_RIYU, BC000Q4_A307TBT11_DEL_FLG, BC000Q4_n307TBT11_DEL_FLG, BC000Q4_A310TBT11_CRT_PROG_NM, BC000Q4_n310TBT11_CRT_PROG_NM, BC000Q4_A313TBT11_UPD_PROG_NM, BC000Q4_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q5_A303TBT11_STUDY_ID, BC000Q5_A304TBT11_SUBJECT_ID, BC000Q5_A305TBT11_CRF_ID, BC000Q5_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000Q9_A303TBT11_STUDY_ID, BC000Q9_A304TBT11_SUBJECT_ID, BC000Q9_A305TBT11_CRF_ID, BC000Q9_A306TBT11_CRF_VERSION, BC000Q9_A308TBT11_CRT_DATETIME, BC000Q9_n308TBT11_CRT_DATETIME, BC000Q9_A309TBT11_CRT_USER_ID, BC000Q9_n309TBT11_CRT_USER_ID, BC000Q9_A311TBT11_UPD_DATETIME, BC000Q9_n311TBT11_UPD_DATETIME,
            BC000Q9_A312TBT11_UPD_USER_ID, BC000Q9_n312TBT11_UPD_USER_ID, BC000Q9_A314TBT11_UPD_CNT, BC000Q9_n314TBT11_UPD_CNT, BC000Q9_A573TBT11_CRF_INPUT_LEVEL, BC000Q9_n573TBT11_CRF_INPUT_LEVEL, BC000Q9_A574TBT11_UPLOAD_DATETIME, BC000Q9_n574TBT11_UPLOAD_DATETIME, BC000Q9_A575TBT11_UPLOAD_USER_ID, BC000Q9_n575TBT11_UPLOAD_USER_ID,
            BC000Q9_A576TBT11_UPLOAD_AUTH_CD, BC000Q9_n576TBT11_UPLOAD_AUTH_CD, BC000Q9_A577TBT11_DM_ARRIVAL_FLG, BC000Q9_n577TBT11_DM_ARRIVAL_FLG, BC000Q9_A578TBT11_DM_ARRIVAL_DATETIME, BC000Q9_n578TBT11_DM_ARRIVAL_DATETIME, BC000Q9_A579TBT11_APPROVAL_FLG, BC000Q9_n579TBT11_APPROVAL_FLG, BC000Q9_A580TBT11_APPROVAL_DATETIME, BC000Q9_n580TBT11_APPROVAL_DATETIME,
            BC000Q9_A581TBT11_APPROVAL_USER_ID, BC000Q9_n581TBT11_APPROVAL_USER_ID, BC000Q9_A582TBT11_APPROVAL_AUTH_CD, BC000Q9_n582TBT11_APPROVAL_AUTH_CD, BC000Q9_A583TBT11_INPUT_END_FLG, BC000Q9_n583TBT11_INPUT_END_FLG, BC000Q9_A584TBT11_INPUT_END_DATETIME, BC000Q9_n584TBT11_INPUT_END_DATETIME, BC000Q9_A585TBT11_INPUT_END_USER_ID, BC000Q9_n585TBT11_INPUT_END_USER_ID,
            BC000Q9_A586TBT11_INPUT_END_AUTH_CD, BC000Q9_n586TBT11_INPUT_END_AUTH_CD, BC000Q9_A884TBT11_UPD_RIYU, BC000Q9_n884TBT11_UPD_RIYU, BC000Q9_A307TBT11_DEL_FLG, BC000Q9_n307TBT11_DEL_FLG, BC000Q9_A310TBT11_CRT_PROG_NM, BC000Q9_n310TBT11_CRT_PROG_NM, BC000Q9_A313TBT11_UPD_PROG_NM, BC000Q9_n313TBT11_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110Q2 */
      e110Q2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N ;
   private byte Z573TBT11_CRF_INPUT_LEVEL ;
   private byte A573TBT11_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z305TBT11_CRF_ID ;
   private short A305TBT11_CRF_ID ;
   private short Z306TBT11_CRF_VERSION ;
   private short A306TBT11_CRF_VERSION ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z ;
   private short RcdFound25 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z304TBT11_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z303TBT11_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z ;
   private long Z314TBT11_UPD_CNT ;
   private long A314TBT11_UPD_CNT ;
   private long O314TBT11_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode25 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
   private java.util.Date Z308TBT11_CRT_DATETIME ;
   private java.util.Date A308TBT11_CRT_DATETIME ;
   private java.util.Date Z311TBT11_UPD_DATETIME ;
   private java.util.Date A311TBT11_UPD_DATETIME ;
   private java.util.Date Z574TBT11_UPLOAD_DATETIME ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private java.util.Date Z578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z580TBT11_APPROVAL_DATETIME ;
   private java.util.Date A580TBT11_APPROVAL_DATETIME ;
   private java.util.Date Z584TBT11_INPUT_END_DATETIME ;
   private java.util.Date A584TBT11_INPUT_END_DATETIME ;
   private boolean n308TBT11_CRT_DATETIME ;
   private boolean n309TBT11_CRT_USER_ID ;
   private boolean n311TBT11_UPD_DATETIME ;
   private boolean n312TBT11_UPD_USER_ID ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean n573TBT11_CRF_INPUT_LEVEL ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n575TBT11_UPLOAD_USER_ID ;
   private boolean n576TBT11_UPLOAD_AUTH_CD ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n579TBT11_APPROVAL_FLG ;
   private boolean n580TBT11_APPROVAL_DATETIME ;
   private boolean n581TBT11_APPROVAL_USER_ID ;
   private boolean n582TBT11_APPROVAL_AUTH_CD ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n584TBT11_INPUT_END_DATETIME ;
   private boolean n585TBT11_INPUT_END_USER_ID ;
   private boolean n586TBT11_INPUT_END_AUTH_CD ;
   private boolean n884TBT11_UPD_RIYU ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n310TBT11_CRT_PROG_NM ;
   private boolean n313TBT11_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z ;
   private String Z309TBT11_CRT_USER_ID ;
   private String A309TBT11_CRT_USER_ID ;
   private String Z312TBT11_UPD_USER_ID ;
   private String A312TBT11_UPD_USER_ID ;
   private String Z575TBT11_UPLOAD_USER_ID ;
   private String A575TBT11_UPLOAD_USER_ID ;
   private String Z576TBT11_UPLOAD_AUTH_CD ;
   private String A576TBT11_UPLOAD_AUTH_CD ;
   private String Z577TBT11_DM_ARRIVAL_FLG ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String Z579TBT11_APPROVAL_FLG ;
   private String A579TBT11_APPROVAL_FLG ;
   private String Z581TBT11_APPROVAL_USER_ID ;
   private String A581TBT11_APPROVAL_USER_ID ;
   private String Z582TBT11_APPROVAL_AUTH_CD ;
   private String A582TBT11_APPROVAL_AUTH_CD ;
   private String Z583TBT11_INPUT_END_FLG ;
   private String A583TBT11_INPUT_END_FLG ;
   private String Z585TBT11_INPUT_END_USER_ID ;
   private String A585TBT11_INPUT_END_USER_ID ;
   private String Z586TBT11_INPUT_END_AUTH_CD ;
   private String A586TBT11_INPUT_END_AUTH_CD ;
   private String Z884TBT11_UPD_RIYU ;
   private String A884TBT11_UPD_RIYU ;
   private String Z307TBT11_DEL_FLG ;
   private String A307TBT11_DEL_FLG ;
   private String Z310TBT11_CRT_PROG_NM ;
   private String A310TBT11_CRT_PROG_NM ;
   private String Z313TBT11_UPD_PROG_NM ;
   private String A313TBT11_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT11_CRF_HISTORY bcTBT11_CRF_HISTORY ;
   private IDataStoreProvider pr_default ;
   private long[] BC000Q4_A303TBT11_STUDY_ID ;
   private int[] BC000Q4_A304TBT11_SUBJECT_ID ;
   private short[] BC000Q4_A305TBT11_CRF_ID ;
   private short[] BC000Q4_A306TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q4_A308TBT11_CRT_DATETIME ;
   private boolean[] BC000Q4_n308TBT11_CRT_DATETIME ;
   private String[] BC000Q4_A309TBT11_CRT_USER_ID ;
   private boolean[] BC000Q4_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q4_A311TBT11_UPD_DATETIME ;
   private boolean[] BC000Q4_n311TBT11_UPD_DATETIME ;
   private String[] BC000Q4_A312TBT11_UPD_USER_ID ;
   private boolean[] BC000Q4_n312TBT11_UPD_USER_ID ;
   private long[] BC000Q4_A314TBT11_UPD_CNT ;
   private boolean[] BC000Q4_n314TBT11_UPD_CNT ;
   private byte[] BC000Q4_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q4_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q4_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q4_n574TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q4_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q4_n575TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q4_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q4_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q4_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q4_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q4_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q4_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q4_A579TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q4_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q4_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q4_n580TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q4_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q4_n581TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q4_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q4_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q4_A583TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q4_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q4_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q4_n584TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q4_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q4_n585TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q4_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q4_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q4_A884TBT11_UPD_RIYU ;
   private boolean[] BC000Q4_n884TBT11_UPD_RIYU ;
   private String[] BC000Q4_A307TBT11_DEL_FLG ;
   private boolean[] BC000Q4_n307TBT11_DEL_FLG ;
   private String[] BC000Q4_A310TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q4_n310TBT11_CRT_PROG_NM ;
   private String[] BC000Q4_A313TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q4_n313TBT11_UPD_PROG_NM ;
   private long[] BC000Q5_A303TBT11_STUDY_ID ;
   private int[] BC000Q5_A304TBT11_SUBJECT_ID ;
   private short[] BC000Q5_A305TBT11_CRF_ID ;
   private short[] BC000Q5_A306TBT11_CRF_VERSION ;
   private long[] BC000Q3_A303TBT11_STUDY_ID ;
   private int[] BC000Q3_A304TBT11_SUBJECT_ID ;
   private short[] BC000Q3_A305TBT11_CRF_ID ;
   private short[] BC000Q3_A306TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q3_A308TBT11_CRT_DATETIME ;
   private boolean[] BC000Q3_n308TBT11_CRT_DATETIME ;
   private String[] BC000Q3_A309TBT11_CRT_USER_ID ;
   private boolean[] BC000Q3_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q3_A311TBT11_UPD_DATETIME ;
   private boolean[] BC000Q3_n311TBT11_UPD_DATETIME ;
   private String[] BC000Q3_A312TBT11_UPD_USER_ID ;
   private boolean[] BC000Q3_n312TBT11_UPD_USER_ID ;
   private long[] BC000Q3_A314TBT11_UPD_CNT ;
   private boolean[] BC000Q3_n314TBT11_UPD_CNT ;
   private byte[] BC000Q3_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q3_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q3_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q3_n574TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q3_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q3_n575TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q3_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q3_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q3_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q3_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q3_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q3_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q3_A579TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q3_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q3_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q3_n580TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q3_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q3_n581TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q3_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q3_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q3_A583TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q3_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q3_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q3_n584TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q3_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q3_n585TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q3_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q3_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q3_A884TBT11_UPD_RIYU ;
   private boolean[] BC000Q3_n884TBT11_UPD_RIYU ;
   private String[] BC000Q3_A307TBT11_DEL_FLG ;
   private boolean[] BC000Q3_n307TBT11_DEL_FLG ;
   private String[] BC000Q3_A310TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q3_n310TBT11_CRT_PROG_NM ;
   private String[] BC000Q3_A313TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q3_n313TBT11_UPD_PROG_NM ;
   private long[] BC000Q2_A303TBT11_STUDY_ID ;
   private int[] BC000Q2_A304TBT11_SUBJECT_ID ;
   private short[] BC000Q2_A305TBT11_CRF_ID ;
   private short[] BC000Q2_A306TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q2_A308TBT11_CRT_DATETIME ;
   private boolean[] BC000Q2_n308TBT11_CRT_DATETIME ;
   private String[] BC000Q2_A309TBT11_CRT_USER_ID ;
   private boolean[] BC000Q2_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q2_A311TBT11_UPD_DATETIME ;
   private boolean[] BC000Q2_n311TBT11_UPD_DATETIME ;
   private String[] BC000Q2_A312TBT11_UPD_USER_ID ;
   private boolean[] BC000Q2_n312TBT11_UPD_USER_ID ;
   private long[] BC000Q2_A314TBT11_UPD_CNT ;
   private boolean[] BC000Q2_n314TBT11_UPD_CNT ;
   private byte[] BC000Q2_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q2_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q2_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q2_n574TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q2_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q2_n575TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q2_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q2_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q2_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q2_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q2_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q2_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q2_A579TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q2_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q2_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q2_n580TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q2_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q2_n581TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q2_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q2_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q2_A583TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q2_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q2_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q2_n584TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q2_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q2_n585TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q2_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q2_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q2_A884TBT11_UPD_RIYU ;
   private boolean[] BC000Q2_n884TBT11_UPD_RIYU ;
   private String[] BC000Q2_A307TBT11_DEL_FLG ;
   private boolean[] BC000Q2_n307TBT11_DEL_FLG ;
   private String[] BC000Q2_A310TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q2_n310TBT11_CRT_PROG_NM ;
   private String[] BC000Q2_A313TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q2_n313TBT11_UPD_PROG_NM ;
   private long[] BC000Q9_A303TBT11_STUDY_ID ;
   private int[] BC000Q9_A304TBT11_SUBJECT_ID ;
   private short[] BC000Q9_A305TBT11_CRF_ID ;
   private short[] BC000Q9_A306TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q9_A308TBT11_CRT_DATETIME ;
   private boolean[] BC000Q9_n308TBT11_CRT_DATETIME ;
   private String[] BC000Q9_A309TBT11_CRT_USER_ID ;
   private boolean[] BC000Q9_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q9_A311TBT11_UPD_DATETIME ;
   private boolean[] BC000Q9_n311TBT11_UPD_DATETIME ;
   private String[] BC000Q9_A312TBT11_UPD_USER_ID ;
   private boolean[] BC000Q9_n312TBT11_UPD_USER_ID ;
   private long[] BC000Q9_A314TBT11_UPD_CNT ;
   private boolean[] BC000Q9_n314TBT11_UPD_CNT ;
   private byte[] BC000Q9_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q9_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q9_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q9_n574TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q9_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q9_n575TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q9_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q9_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q9_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q9_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q9_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q9_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q9_A579TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q9_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q9_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q9_n580TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q9_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q9_n581TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q9_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q9_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q9_A583TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q9_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q9_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q9_n584TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q9_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q9_n585TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q9_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q9_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q9_A884TBT11_UPD_RIYU ;
   private boolean[] BC000Q9_n884TBT11_UPD_RIYU ;
   private String[] BC000Q9_A307TBT11_DEL_FLG ;
   private boolean[] BC000Q9_n307TBT11_DEL_FLG ;
   private String[] BC000Q9_A310TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q9_n310TBT11_CRT_PROG_NM ;
   private String[] BC000Q9_A313TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q9_n313TBT11_UPD_PROG_NM ;
}

final  class tbt11_crf_history_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000Q2", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Q3", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Q4", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000Q5", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000Q6", "INSERT INTO `TBT11_CRF_HISTORY` (`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000Q7", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_CRT_DATETIME`=?, `TBT11_CRT_USER_ID`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_CNT`=?, `TBT11_CRF_INPUT_LEVEL`=?, `TBT11_UPLOAD_DATETIME`=?, `TBT11_UPLOAD_USER_ID`=?, `TBT11_UPLOAD_AUTH_CD`=?, `TBT11_DM_ARRIVAL_FLG`=?, `TBT11_DM_ARRIVAL_DATETIME`=?, `TBT11_APPROVAL_FLG`=?, `TBT11_APPROVAL_DATETIME`=?, `TBT11_APPROVAL_USER_ID`=?, `TBT11_APPROVAL_AUTH_CD`=?, `TBT11_INPUT_END_FLG`=?, `TBT11_INPUT_END_DATETIME`=?, `TBT11_INPUT_END_USER_ID`=?, `TBT11_INPUT_END_AUTH_CD`=?, `TBT11_UPD_RIYU`=?, `TBT11_DEL_FLG`=?, `TBT11_CRT_PROG_NM`=?, `TBT11_UPD_PROG_NM`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000Q8", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000Q9", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 128);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[43], 2000);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 40);
               }
               break;
            case 5 :
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
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
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
                  stmt.setVarchar(20, (String)parms[39], 2000);
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
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 40);
               }
               stmt.setLong(24, ((Number) parms[46]).longValue());
               stmt.setInt(25, ((Number) parms[47]).intValue());
               stmt.setShort(26, ((Number) parms[48]).shortValue());
               stmt.setShort(27, ((Number) parms[49]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

