/*
               File: tbt11_crf_history_bc
        Description: CRF修正履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:9.4
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

   public void getInsDefault( )
   {
      readRow0Q56( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0Q56( ) ;
      standaloneModal( ) ;
      addRow0Q56( ) ;
      Gx_mode = "INS" ;
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
            Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
            Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
            Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
            Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
            Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
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
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Q56( ) ;
         }
         else
         {
            checkExtendedTable0Q56( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0Q56( ) ;
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120Q2( )
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

   public void zm0Q56( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z458TBT11_CRT_DATETIME = A458TBT11_CRT_DATETIME ;
         Z459TBT11_CRT_USER_ID = A459TBT11_CRT_USER_ID ;
         Z461TBT11_UPD_DATETIME = A461TBT11_UPD_DATETIME ;
         Z462TBT11_UPD_USER_ID = A462TBT11_UPD_USER_ID ;
         Z464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         Z665TBT11_CRF_INPUT_LEVEL = A665TBT11_CRF_INPUT_LEVEL ;
         Z666TBT11_UPLOAD_DATETIME = A666TBT11_UPLOAD_DATETIME ;
         Z667TBT11_UPLOAD_USER_ID = A667TBT11_UPLOAD_USER_ID ;
         Z668TBT11_UPLOAD_AUTH_CD = A668TBT11_UPLOAD_AUTH_CD ;
         Z669TBT11_DM_ARRIVAL_FLG = A669TBT11_DM_ARRIVAL_FLG ;
         Z670TBT11_DM_ARRIVAL_DATETIME = A670TBT11_DM_ARRIVAL_DATETIME ;
         Z671TBT11_APPROVAL_FLG = A671TBT11_APPROVAL_FLG ;
         Z672TBT11_APPROVAL_DATETIME = A672TBT11_APPROVAL_DATETIME ;
         Z673TBT11_APPROVAL_USER_ID = A673TBT11_APPROVAL_USER_ID ;
         Z674TBT11_APPROVAL_AUTH_CD = A674TBT11_APPROVAL_AUTH_CD ;
         Z675TBT11_INPUT_END_FLG = A675TBT11_INPUT_END_FLG ;
         Z676TBT11_INPUT_END_DATETIME = A676TBT11_INPUT_END_DATETIME ;
         Z677TBT11_INPUT_END_USER_ID = A677TBT11_INPUT_END_USER_ID ;
         Z678TBT11_INPUT_END_AUTH_CD = A678TBT11_INPUT_END_AUTH_CD ;
         Z891TBT11_UPD_RIYU = A891TBT11_UPD_RIYU ;
         Z457TBT11_DEL_FLG = A457TBT11_DEL_FLG ;
         Z460TBT11_CRT_PROG_NM = A460TBT11_CRT_PROG_NM ;
         Z463TBT11_UPD_PROG_NM = A463TBT11_UPD_PROG_NM ;
      }
      if ( GX_JID == -12 )
      {
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         Z458TBT11_CRT_DATETIME = A458TBT11_CRT_DATETIME ;
         Z459TBT11_CRT_USER_ID = A459TBT11_CRT_USER_ID ;
         Z461TBT11_UPD_DATETIME = A461TBT11_UPD_DATETIME ;
         Z462TBT11_UPD_USER_ID = A462TBT11_UPD_USER_ID ;
         Z464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         Z665TBT11_CRF_INPUT_LEVEL = A665TBT11_CRF_INPUT_LEVEL ;
         Z666TBT11_UPLOAD_DATETIME = A666TBT11_UPLOAD_DATETIME ;
         Z667TBT11_UPLOAD_USER_ID = A667TBT11_UPLOAD_USER_ID ;
         Z668TBT11_UPLOAD_AUTH_CD = A668TBT11_UPLOAD_AUTH_CD ;
         Z669TBT11_DM_ARRIVAL_FLG = A669TBT11_DM_ARRIVAL_FLG ;
         Z670TBT11_DM_ARRIVAL_DATETIME = A670TBT11_DM_ARRIVAL_DATETIME ;
         Z671TBT11_APPROVAL_FLG = A671TBT11_APPROVAL_FLG ;
         Z672TBT11_APPROVAL_DATETIME = A672TBT11_APPROVAL_DATETIME ;
         Z673TBT11_APPROVAL_USER_ID = A673TBT11_APPROVAL_USER_ID ;
         Z674TBT11_APPROVAL_AUTH_CD = A674TBT11_APPROVAL_AUTH_CD ;
         Z675TBT11_INPUT_END_FLG = A675TBT11_INPUT_END_FLG ;
         Z676TBT11_INPUT_END_DATETIME = A676TBT11_INPUT_END_DATETIME ;
         Z677TBT11_INPUT_END_USER_ID = A677TBT11_INPUT_END_USER_ID ;
         Z678TBT11_INPUT_END_AUTH_CD = A678TBT11_INPUT_END_AUTH_CD ;
         Z891TBT11_UPD_RIYU = A891TBT11_UPD_RIYU ;
         Z457TBT11_DEL_FLG = A457TBT11_DEL_FLG ;
         Z460TBT11_CRT_PROG_NM = A460TBT11_CRT_PROG_NM ;
         Z463TBT11_UPD_PROG_NM = A463TBT11_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0Q56( )
   {
      /* Using cursor BC000Q4 */
      pr_default.execute(2, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A458TBT11_CRT_DATETIME = BC000Q4_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = BC000Q4_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = BC000Q4_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = BC000Q4_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = BC000Q4_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = BC000Q4_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = BC000Q4_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = BC000Q4_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = BC000Q4_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = BC000Q4_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = BC000Q4_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = BC000Q4_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = BC000Q4_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = BC000Q4_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = BC000Q4_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = BC000Q4_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = BC000Q4_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = BC000Q4_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = BC000Q4_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = BC000Q4_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = BC000Q4_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = BC000Q4_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = BC000Q4_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = BC000Q4_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = BC000Q4_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = BC000Q4_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = BC000Q4_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = BC000Q4_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = BC000Q4_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = BC000Q4_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A675TBT11_INPUT_END_FLG = BC000Q4_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = BC000Q4_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = BC000Q4_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = BC000Q4_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = BC000Q4_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = BC000Q4_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = BC000Q4_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = BC000Q4_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = BC000Q4_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = BC000Q4_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = BC000Q4_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = BC000Q4_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = BC000Q4_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = BC000Q4_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = BC000Q4_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = BC000Q4_n463TBT11_UPD_PROG_NM[0] ;
         zm0Q56( -12) ;
      }
      pr_default.close(2);
      onLoadActions0Q56( ) ;
   }

   public void onLoadActions0Q56( )
   {
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
   }

   public void checkExtendedTable0Q56( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      if ( ! ( GXutil.nullDate().equals(A666TBT11_UPLOAD_DATETIME) || (( A666TBT11_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A666TBT11_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A670TBT11_DM_ARRIVAL_DATETIME) || (( A670TBT11_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A670TBT11_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A672TBT11_APPROVAL_DATETIME) || (( A672TBT11_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A672TBT11_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A676TBT11_INPUT_END_DATETIME) || (( A676TBT11_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A676TBT11_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A458TBT11_CRT_DATETIME) || (( A458TBT11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A458TBT11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A461TBT11_UPD_DATETIME) || (( A461TBT11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A461TBT11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Q56( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Q56( )
   {
      /* Using cursor BC000Q5 */
      pr_default.execute(3, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound56 = (short)(1) ;
      }
      else
      {
         RcdFound56 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000Q3 */
      pr_default.execute(1, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Q56( 12) ;
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = BC000Q3_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = BC000Q3_A93TBT11_SUBJECT_ID[0] ;
         A94TBT11_CRF_ID = BC000Q3_A94TBT11_CRF_ID[0] ;
         A936TBT11_CRF_EDA_NO = BC000Q3_A936TBT11_CRF_EDA_NO[0] ;
         A95TBT11_CRF_VERSION = BC000Q3_A95TBT11_CRF_VERSION[0] ;
         A458TBT11_CRT_DATETIME = BC000Q3_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = BC000Q3_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = BC000Q3_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = BC000Q3_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = BC000Q3_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = BC000Q3_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = BC000Q3_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = BC000Q3_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = BC000Q3_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = BC000Q3_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = BC000Q3_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = BC000Q3_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = BC000Q3_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = BC000Q3_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = BC000Q3_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = BC000Q3_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = BC000Q3_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = BC000Q3_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = BC000Q3_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = BC000Q3_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = BC000Q3_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = BC000Q3_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = BC000Q3_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = BC000Q3_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = BC000Q3_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = BC000Q3_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = BC000Q3_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = BC000Q3_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = BC000Q3_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = BC000Q3_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A675TBT11_INPUT_END_FLG = BC000Q3_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = BC000Q3_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = BC000Q3_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = BC000Q3_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = BC000Q3_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = BC000Q3_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = BC000Q3_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = BC000Q3_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = BC000Q3_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = BC000Q3_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = BC000Q3_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = BC000Q3_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = BC000Q3_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = BC000Q3_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = BC000Q3_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = BC000Q3_n463TBT11_UPD_PROG_NM[0] ;
         O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         n464TBT11_UPD_CNT = false ;
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0Q56( ) ;
         if ( AnyError == 1 )
         {
            RcdFound56 = (short)(0) ;
            initializeNonKey0Q56( ) ;
         }
         Gx_mode = sMode56 ;
      }
      else
      {
         RcdFound56 = (short)(0) ;
         initializeNonKey0Q56( ) ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode56 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Q56( ) ;
      if ( RcdFound56 == 0 )
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

   public void checkOptimisticConcurrency0Q56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000Q2 */
         pr_default.execute(0, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z458TBT11_CRT_DATETIME.equals( BC000Q2_A458TBT11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z459TBT11_CRT_USER_ID, BC000Q2_A459TBT11_CRT_USER_ID[0]) != 0 ) || !( Z461TBT11_UPD_DATETIME.equals( BC000Q2_A461TBT11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z462TBT11_UPD_USER_ID, BC000Q2_A462TBT11_UPD_USER_ID[0]) != 0 ) || ( Z464TBT11_UPD_CNT != BC000Q2_A464TBT11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z665TBT11_CRF_INPUT_LEVEL != BC000Q2_A665TBT11_CRF_INPUT_LEVEL[0] ) || !( Z666TBT11_UPLOAD_DATETIME.equals( BC000Q2_A666TBT11_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z667TBT11_UPLOAD_USER_ID, BC000Q2_A667TBT11_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z668TBT11_UPLOAD_AUTH_CD, BC000Q2_A668TBT11_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z669TBT11_DM_ARRIVAL_FLG, BC000Q2_A669TBT11_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z670TBT11_DM_ARRIVAL_DATETIME.equals( BC000Q2_A670TBT11_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z671TBT11_APPROVAL_FLG, BC000Q2_A671TBT11_APPROVAL_FLG[0]) != 0 ) || !( Z672TBT11_APPROVAL_DATETIME.equals( BC000Q2_A672TBT11_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z673TBT11_APPROVAL_USER_ID, BC000Q2_A673TBT11_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z674TBT11_APPROVAL_AUTH_CD, BC000Q2_A674TBT11_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z675TBT11_INPUT_END_FLG, BC000Q2_A675TBT11_INPUT_END_FLG[0]) != 0 ) || !( Z676TBT11_INPUT_END_DATETIME.equals( BC000Q2_A676TBT11_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z677TBT11_INPUT_END_USER_ID, BC000Q2_A677TBT11_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z678TBT11_INPUT_END_AUTH_CD, BC000Q2_A678TBT11_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z891TBT11_UPD_RIYU, BC000Q2_A891TBT11_UPD_RIYU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457TBT11_DEL_FLG, BC000Q2_A457TBT11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z460TBT11_CRT_PROG_NM, BC000Q2_A460TBT11_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z463TBT11_UPD_PROG_NM, BC000Q2_A463TBT11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT11_CRF_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q56( )
   {
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q56( 0) ;
         checkOptimisticConcurrency0Q56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q56( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Q6 */
                  pr_default.execute(4, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION), new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
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
            load0Q56( ) ;
         }
         endLevel0Q56( ) ;
      }
      closeExtendedTableCursors0Q56( ) ;
   }

   public void update0Q56( )
   {
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q56( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Q7 */
                  pr_default.execute(5, new Object[] {new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q56( ) ;
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
         endLevel0Q56( ) ;
      }
      closeExtendedTableCursors0Q56( ) ;
   }

   public void deferredUpdate0Q56( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q56( ) ;
         afterConfirm0Q56( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q56( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000Q8 */
               pr_default.execute(6, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
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
      sMode56 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0Q56( ) ;
      Gx_mode = sMode56 ;
   }

   public void onDeleteControls0Q56( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      }
   }

   public void endLevel0Q56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Q56( ) ;
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

   public void scanKeyStart0Q56( )
   {
      /* Scan By routine */
      /* Using cursor BC000Q9 */
      pr_default.execute(7, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      RcdFound56 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = BC000Q9_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = BC000Q9_A93TBT11_SUBJECT_ID[0] ;
         A94TBT11_CRF_ID = BC000Q9_A94TBT11_CRF_ID[0] ;
         A936TBT11_CRF_EDA_NO = BC000Q9_A936TBT11_CRF_EDA_NO[0] ;
         A95TBT11_CRF_VERSION = BC000Q9_A95TBT11_CRF_VERSION[0] ;
         A458TBT11_CRT_DATETIME = BC000Q9_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = BC000Q9_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = BC000Q9_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = BC000Q9_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = BC000Q9_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = BC000Q9_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = BC000Q9_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = BC000Q9_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = BC000Q9_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = BC000Q9_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = BC000Q9_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = BC000Q9_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = BC000Q9_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = BC000Q9_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = BC000Q9_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = BC000Q9_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = BC000Q9_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = BC000Q9_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = BC000Q9_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = BC000Q9_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = BC000Q9_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = BC000Q9_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = BC000Q9_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = BC000Q9_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = BC000Q9_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = BC000Q9_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = BC000Q9_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = BC000Q9_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = BC000Q9_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = BC000Q9_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A675TBT11_INPUT_END_FLG = BC000Q9_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = BC000Q9_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = BC000Q9_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = BC000Q9_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = BC000Q9_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = BC000Q9_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = BC000Q9_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = BC000Q9_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = BC000Q9_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = BC000Q9_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = BC000Q9_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = BC000Q9_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = BC000Q9_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = BC000Q9_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = BC000Q9_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = BC000Q9_n463TBT11_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0Q56( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound56 = (short)(0) ;
      scanKeyLoad0Q56( ) ;
   }

   public void scanKeyLoad0Q56( )
   {
      sMode56 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = BC000Q9_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = BC000Q9_A93TBT11_SUBJECT_ID[0] ;
         A94TBT11_CRF_ID = BC000Q9_A94TBT11_CRF_ID[0] ;
         A936TBT11_CRF_EDA_NO = BC000Q9_A936TBT11_CRF_EDA_NO[0] ;
         A95TBT11_CRF_VERSION = BC000Q9_A95TBT11_CRF_VERSION[0] ;
         A458TBT11_CRT_DATETIME = BC000Q9_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = BC000Q9_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = BC000Q9_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = BC000Q9_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = BC000Q9_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = BC000Q9_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = BC000Q9_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = BC000Q9_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = BC000Q9_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = BC000Q9_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = BC000Q9_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = BC000Q9_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = BC000Q9_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = BC000Q9_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = BC000Q9_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = BC000Q9_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = BC000Q9_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = BC000Q9_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = BC000Q9_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = BC000Q9_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = BC000Q9_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = BC000Q9_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = BC000Q9_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = BC000Q9_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = BC000Q9_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = BC000Q9_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = BC000Q9_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = BC000Q9_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = BC000Q9_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = BC000Q9_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A675TBT11_INPUT_END_FLG = BC000Q9_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = BC000Q9_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = BC000Q9_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = BC000Q9_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = BC000Q9_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = BC000Q9_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = BC000Q9_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = BC000Q9_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = BC000Q9_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = BC000Q9_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = BC000Q9_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = BC000Q9_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = BC000Q9_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = BC000Q9_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = BC000Q9_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = BC000Q9_n463TBT11_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode56 ;
   }

   public void scanKeyEnd0Q56( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0Q56( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q56( )
   {
      /* Before Insert Rules */
      A458TBT11_CRT_DATETIME = GXutil.now( ) ;
      n458TBT11_CRT_DATETIME = false ;
      GXt_char1 = A459TBT11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A459TBT11_CRT_USER_ID = GXt_char1 ;
      n459TBT11_CRT_USER_ID = false ;
      A461TBT11_UPD_DATETIME = GXutil.now( ) ;
      n461TBT11_UPD_DATETIME = false ;
      GXt_char1 = A462TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A462TBT11_UPD_USER_ID = GXt_char1 ;
      n462TBT11_UPD_USER_ID = false ;
      A464TBT11_UPD_CNT = (long)(O464TBT11_UPD_CNT+1) ;
      n464TBT11_UPD_CNT = false ;
   }

   public void beforeUpdate0Q56( )
   {
      /* Before Update Rules */
      A461TBT11_UPD_DATETIME = GXutil.now( ) ;
      n461TBT11_UPD_DATETIME = false ;
      GXt_char1 = A462TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A462TBT11_UPD_USER_ID = GXt_char1 ;
      n462TBT11_UPD_USER_ID = false ;
      A464TBT11_UPD_CNT = (long)(O464TBT11_UPD_CNT+1) ;
      n464TBT11_UPD_CNT = false ;
   }

   public void beforeDelete0Q56( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q56( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q56( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q56( )
   {
   }

   public void addRow0Q56( )
   {
      VarsToRow56( bcTBT11_CRF_HISTORY) ;
   }

   public void readRow0Q56( )
   {
      RowToVars56( bcTBT11_CRF_HISTORY, 1) ;
   }

   public void initializeNonKey0Q56( )
   {
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n458TBT11_CRT_DATETIME = false ;
      A459TBT11_CRT_USER_ID = "" ;
      n459TBT11_CRT_USER_ID = false ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n461TBT11_UPD_DATETIME = false ;
      A462TBT11_UPD_USER_ID = "" ;
      n462TBT11_UPD_USER_ID = false ;
      A464TBT11_UPD_CNT = 0 ;
      n464TBT11_UPD_CNT = false ;
      A665TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
      n665TBT11_CRF_INPUT_LEVEL = false ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n666TBT11_UPLOAD_DATETIME = false ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      n667TBT11_UPLOAD_USER_ID = false ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      n668TBT11_UPLOAD_AUTH_CD = false ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      n669TBT11_DM_ARRIVAL_FLG = false ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n670TBT11_DM_ARRIVAL_DATETIME = false ;
      A671TBT11_APPROVAL_FLG = "" ;
      n671TBT11_APPROVAL_FLG = false ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n672TBT11_APPROVAL_DATETIME = false ;
      A673TBT11_APPROVAL_USER_ID = "" ;
      n673TBT11_APPROVAL_USER_ID = false ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      n674TBT11_APPROVAL_AUTH_CD = false ;
      A675TBT11_INPUT_END_FLG = "" ;
      n675TBT11_INPUT_END_FLG = false ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n676TBT11_INPUT_END_DATETIME = false ;
      A677TBT11_INPUT_END_USER_ID = "" ;
      n677TBT11_INPUT_END_USER_ID = false ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      n678TBT11_INPUT_END_AUTH_CD = false ;
      A891TBT11_UPD_RIYU = "" ;
      n891TBT11_UPD_RIYU = false ;
      A457TBT11_DEL_FLG = "" ;
      n457TBT11_DEL_FLG = false ;
      A460TBT11_CRT_PROG_NM = "" ;
      n460TBT11_CRT_PROG_NM = false ;
      A463TBT11_UPD_PROG_NM = "" ;
      n463TBT11_UPD_PROG_NM = false ;
      O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
      n464TBT11_UPD_CNT = false ;
   }

   public void initAll0Q56( )
   {
      A92TBT11_STUDY_ID = 0 ;
      A93TBT11_SUBJECT_ID = 0 ;
      A94TBT11_CRF_ID = (short)(0) ;
      A936TBT11_CRF_EDA_NO = (byte)(0) ;
      A95TBT11_CRF_VERSION = (short)(0) ;
      initializeNonKey0Q56( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow56( SdtTBT11_CRF_HISTORY obj56 )
   {
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Mode( Gx_mode );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime( A458TBT11_CRT_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id( A459TBT11_CRT_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime( A461TBT11_UPD_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id( A462TBT11_UPD_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt( A464TBT11_UPD_CNT );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( A665TBT11_CRF_INPUT_LEVEL );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( A666TBT11_UPLOAD_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( A667TBT11_UPLOAD_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( A668TBT11_UPLOAD_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( A669TBT11_DM_ARRIVAL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A670TBT11_DM_ARRIVAL_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A671TBT11_APPROVAL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A672TBT11_APPROVAL_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A673TBT11_APPROVAL_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A674TBT11_APPROVAL_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( A675TBT11_INPUT_END_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( A676TBT11_INPUT_END_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( A677TBT11_INPUT_END_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( A678TBT11_INPUT_END_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( A891TBT11_UPD_RIYU );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( A457TBT11_DEL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( A460TBT11_CRT_PROG_NM );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( A463TBT11_UPD_PROG_NM );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A92TBT11_STUDY_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A93TBT11_SUBJECT_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A94TBT11_CRF_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( A936TBT11_CRF_EDA_NO );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( A95TBT11_CRF_VERSION );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z( Z92TBT11_STUDY_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z( Z93TBT11_SUBJECT_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z( Z94TBT11_CRF_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z( Z936TBT11_CRF_EDA_NO );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z( Z95TBT11_CRF_VERSION );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z( Z665TBT11_CRF_INPUT_LEVEL );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z( Z666TBT11_UPLOAD_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z( Z667TBT11_UPLOAD_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z( Z668TBT11_UPLOAD_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z( Z669TBT11_DM_ARRIVAL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z( Z670TBT11_DM_ARRIVAL_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z( Z671TBT11_APPROVAL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z( Z672TBT11_APPROVAL_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z( Z673TBT11_APPROVAL_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z( Z674TBT11_APPROVAL_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z( Z675TBT11_INPUT_END_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z( Z676TBT11_INPUT_END_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z( Z677TBT11_INPUT_END_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z( Z678TBT11_INPUT_END_AUTH_CD );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z( Z891TBT11_UPD_RIYU );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z( Z457TBT11_DEL_FLG );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z( Z458TBT11_CRT_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z( Z459TBT11_CRT_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z( Z460TBT11_CRT_PROG_NM );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z( Z461TBT11_UPD_DATETIME );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z( Z462TBT11_UPD_USER_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z( Z463TBT11_UPD_PROG_NM );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z( Z464TBT11_UPD_CNT );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N( (byte)((byte)((n665TBT11_CRF_INPUT_LEVEL)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N( (byte)((byte)((n666TBT11_UPLOAD_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N( (byte)((byte)((n667TBT11_UPLOAD_USER_ID)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N( (byte)((byte)((n668TBT11_UPLOAD_AUTH_CD)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N( (byte)((byte)((n669TBT11_DM_ARRIVAL_FLG)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N( (byte)((byte)((n670TBT11_DM_ARRIVAL_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N( (byte)((byte)((n671TBT11_APPROVAL_FLG)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N( (byte)((byte)((n672TBT11_APPROVAL_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N( (byte)((byte)((n673TBT11_APPROVAL_USER_ID)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N( (byte)((byte)((n674TBT11_APPROVAL_AUTH_CD)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N( (byte)((byte)((n675TBT11_INPUT_END_FLG)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N( (byte)((byte)((n676TBT11_INPUT_END_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N( (byte)((byte)((n677TBT11_INPUT_END_USER_ID)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N( (byte)((byte)((n678TBT11_INPUT_END_AUTH_CD)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N( (byte)((byte)((n891TBT11_UPD_RIYU)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N( (byte)((byte)((n457TBT11_DEL_FLG)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N( (byte)((byte)((n458TBT11_CRT_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N( (byte)((byte)((n459TBT11_CRT_USER_ID)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N( (byte)((byte)((n460TBT11_CRT_PROG_NM)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N( (byte)((byte)((n461TBT11_UPD_DATETIME)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N( (byte)((byte)((n462TBT11_UPD_USER_ID)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N( (byte)((byte)((n463TBT11_UPD_PROG_NM)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N( (byte)((byte)((n464TBT11_UPD_CNT)?1:0)) );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Mode( Gx_mode );
   }

   public void KeyVarsToRow56( SdtTBT11_CRF_HISTORY obj56 )
   {
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A92TBT11_STUDY_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A93TBT11_SUBJECT_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A94TBT11_CRF_ID );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( A936TBT11_CRF_EDA_NO );
      obj56.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( A95TBT11_CRF_VERSION );
   }

   public void RowToVars56( SdtTBT11_CRF_HISTORY obj56 ,
                            int forceLoad )
   {
      Gx_mode = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Mode() ;
      A458TBT11_CRT_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime() ;
      n458TBT11_CRT_DATETIME = false ;
      A459TBT11_CRT_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id() ;
      n459TBT11_CRT_USER_ID = false ;
      A461TBT11_UPD_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime() ;
      n461TBT11_UPD_DATETIME = false ;
      A462TBT11_UPD_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id() ;
      n462TBT11_UPD_USER_ID = false ;
      A464TBT11_UPD_CNT = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt() ;
      n464TBT11_UPD_CNT = false ;
      A665TBT11_CRF_INPUT_LEVEL = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level() ;
      n665TBT11_CRF_INPUT_LEVEL = false ;
      A666TBT11_UPLOAD_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime() ;
      n666TBT11_UPLOAD_DATETIME = false ;
      A667TBT11_UPLOAD_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id() ;
      n667TBT11_UPLOAD_USER_ID = false ;
      A668TBT11_UPLOAD_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd() ;
      n668TBT11_UPLOAD_AUTH_CD = false ;
      A669TBT11_DM_ARRIVAL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg() ;
      n669TBT11_DM_ARRIVAL_FLG = false ;
      A670TBT11_DM_ARRIVAL_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime() ;
      n670TBT11_DM_ARRIVAL_DATETIME = false ;
      A671TBT11_APPROVAL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg() ;
      n671TBT11_APPROVAL_FLG = false ;
      A672TBT11_APPROVAL_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime() ;
      n672TBT11_APPROVAL_DATETIME = false ;
      A673TBT11_APPROVAL_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id() ;
      n673TBT11_APPROVAL_USER_ID = false ;
      A674TBT11_APPROVAL_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd() ;
      n674TBT11_APPROVAL_AUTH_CD = false ;
      A675TBT11_INPUT_END_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg() ;
      n675TBT11_INPUT_END_FLG = false ;
      A676TBT11_INPUT_END_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime() ;
      n676TBT11_INPUT_END_DATETIME = false ;
      A677TBT11_INPUT_END_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id() ;
      n677TBT11_INPUT_END_USER_ID = false ;
      A678TBT11_INPUT_END_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd() ;
      n678TBT11_INPUT_END_AUTH_CD = false ;
      A891TBT11_UPD_RIYU = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu() ;
      n891TBT11_UPD_RIYU = false ;
      A457TBT11_DEL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg() ;
      n457TBT11_DEL_FLG = false ;
      A460TBT11_CRT_PROG_NM = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm() ;
      n460TBT11_CRT_PROG_NM = false ;
      A463TBT11_UPD_PROG_NM = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm() ;
      n463TBT11_UPD_PROG_NM = false ;
      A92TBT11_STUDY_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id() ;
      A93TBT11_SUBJECT_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id() ;
      A94TBT11_CRF_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id() ;
      A936TBT11_CRF_EDA_NO = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no() ;
      A95TBT11_CRF_VERSION = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version() ;
      Z92TBT11_STUDY_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z() ;
      Z93TBT11_SUBJECT_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z() ;
      Z94TBT11_CRF_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z() ;
      Z936TBT11_CRF_EDA_NO = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z() ;
      Z95TBT11_CRF_VERSION = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z() ;
      Z665TBT11_CRF_INPUT_LEVEL = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z() ;
      Z666TBT11_UPLOAD_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z() ;
      Z667TBT11_UPLOAD_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z() ;
      Z668TBT11_UPLOAD_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z() ;
      Z669TBT11_DM_ARRIVAL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z() ;
      Z670TBT11_DM_ARRIVAL_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z() ;
      Z671TBT11_APPROVAL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z() ;
      Z672TBT11_APPROVAL_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z() ;
      Z673TBT11_APPROVAL_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z() ;
      Z674TBT11_APPROVAL_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z() ;
      Z675TBT11_INPUT_END_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z() ;
      Z676TBT11_INPUT_END_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z() ;
      Z677TBT11_INPUT_END_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z() ;
      Z678TBT11_INPUT_END_AUTH_CD = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z() ;
      Z891TBT11_UPD_RIYU = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z() ;
      Z457TBT11_DEL_FLG = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z() ;
      Z458TBT11_CRT_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z() ;
      Z459TBT11_CRT_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z() ;
      Z460TBT11_CRT_PROG_NM = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z() ;
      Z461TBT11_UPD_DATETIME = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z() ;
      Z462TBT11_UPD_USER_ID = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z() ;
      Z463TBT11_UPD_PROG_NM = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z() ;
      Z464TBT11_UPD_CNT = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z() ;
      O464TBT11_UPD_CNT = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z() ;
      n665TBT11_CRF_INPUT_LEVEL = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N()==0)?false:true) ;
      n666TBT11_UPLOAD_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N()==0)?false:true) ;
      n667TBT11_UPLOAD_USER_ID = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N()==0)?false:true) ;
      n668TBT11_UPLOAD_AUTH_CD = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N()==0)?false:true) ;
      n669TBT11_DM_ARRIVAL_FLG = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N()==0)?false:true) ;
      n670TBT11_DM_ARRIVAL_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N()==0)?false:true) ;
      n671TBT11_APPROVAL_FLG = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N()==0)?false:true) ;
      n672TBT11_APPROVAL_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N()==0)?false:true) ;
      n673TBT11_APPROVAL_USER_ID = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N()==0)?false:true) ;
      n674TBT11_APPROVAL_AUTH_CD = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N()==0)?false:true) ;
      n675TBT11_INPUT_END_FLG = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N()==0)?false:true) ;
      n676TBT11_INPUT_END_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N()==0)?false:true) ;
      n677TBT11_INPUT_END_USER_ID = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N()==0)?false:true) ;
      n678TBT11_INPUT_END_AUTH_CD = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N()==0)?false:true) ;
      n891TBT11_UPD_RIYU = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N()==0)?false:true) ;
      n457TBT11_DEL_FLG = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N()==0)?false:true) ;
      n458TBT11_CRT_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N()==0)?false:true) ;
      n459TBT11_CRT_USER_ID = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N()==0)?false:true) ;
      n460TBT11_CRT_PROG_NM = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N()==0)?false:true) ;
      n461TBT11_UPD_DATETIME = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N()==0)?false:true) ;
      n462TBT11_UPD_USER_ID = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N()==0)?false:true) ;
      n463TBT11_UPD_PROG_NM = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N()==0)?false:true) ;
      n464TBT11_UPD_CNT = (boolean)((obj56.getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj56.getgxTv_SdtTBT11_CRF_HISTORY_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A92TBT11_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A93TBT11_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A94TBT11_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A936TBT11_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      A95TBT11_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0Q56( ) ;
      scanKeyStart0Q56( ) ;
      if ( RcdFound56 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         n464TBT11_UPD_CNT = false ;
      }
      zm0Q56( -12) ;
      onLoadActions0Q56( ) ;
      addRow0Q56( ) ;
      scanKeyEnd0Q56( ) ;
      if ( RcdFound56 == 0 )
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
      RowToVars56( bcTBT11_CRF_HISTORY, 0) ;
      scanKeyStart0Q56( ) ;
      if ( RcdFound56 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         n464TBT11_UPD_CNT = false ;
      }
      zm0Q56( -12) ;
      onLoadActions0Q56( ) ;
      addRow0Q56( ) ;
      scanKeyEnd0Q56( ) ;
      if ( RcdFound56 == 0 )
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
      RowToVars56( bcTBT11_CRF_HISTORY, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0Q56( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0Q56( ) ;
      }
      else
      {
         if ( RcdFound56 == 1 )
         {
            if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
            {
               A92TBT11_STUDY_ID = Z92TBT11_STUDY_ID ;
               A93TBT11_SUBJECT_ID = Z93TBT11_SUBJECT_ID ;
               A94TBT11_CRF_ID = Z94TBT11_CRF_ID ;
               A936TBT11_CRF_EDA_NO = Z936TBT11_CRF_EDA_NO ;
               A95TBT11_CRF_VERSION = Z95TBT11_CRF_VERSION ;
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
               update0Q56( ) ;
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
               if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
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
                     insert0Q56( ) ;
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
                     insert0Q56( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow56( bcTBT11_CRF_HISTORY) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars56( bcTBT11_CRF_HISTORY, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0Q56( ) ;
      if ( RcdFound56 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
         {
            A92TBT11_STUDY_ID = Z92TBT11_STUDY_ID ;
            A93TBT11_SUBJECT_ID = Z93TBT11_SUBJECT_ID ;
            A94TBT11_CRF_ID = Z94TBT11_CRF_ID ;
            A936TBT11_CRF_EDA_NO = Z936TBT11_CRF_EDA_NO ;
            A95TBT11_CRF_VERSION = Z95TBT11_CRF_VERSION ;
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
         if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
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
      VarsToRow56( bcTBT11_CRF_HISTORY) ;
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
            VarsToRow56( bcTBT11_CRF_HISTORY) ;
         }
         else
         {
            RowToVars56( bcTBT11_CRF_HISTORY, 1) ;
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
      RowToVars56( bcTBT11_CRF_HISTORY, 1) ;
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
      Z458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z459TBT11_CRT_USER_ID = "" ;
      A459TBT11_CRT_USER_ID = "" ;
      Z461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z462TBT11_UPD_USER_ID = "" ;
      A462TBT11_UPD_USER_ID = "" ;
      Z666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z667TBT11_UPLOAD_USER_ID = "" ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      Z668TBT11_UPLOAD_AUTH_CD = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      Z669TBT11_DM_ARRIVAL_FLG = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      Z670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z671TBT11_APPROVAL_FLG = "" ;
      A671TBT11_APPROVAL_FLG = "" ;
      Z672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z673TBT11_APPROVAL_USER_ID = "" ;
      A673TBT11_APPROVAL_USER_ID = "" ;
      Z674TBT11_APPROVAL_AUTH_CD = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      Z675TBT11_INPUT_END_FLG = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      Z676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z677TBT11_INPUT_END_USER_ID = "" ;
      A677TBT11_INPUT_END_USER_ID = "" ;
      Z678TBT11_INPUT_END_AUTH_CD = "" ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      Z891TBT11_UPD_RIYU = "" ;
      A891TBT11_UPD_RIYU = "" ;
      Z457TBT11_DEL_FLG = "" ;
      A457TBT11_DEL_FLG = "" ;
      Z460TBT11_CRT_PROG_NM = "" ;
      A460TBT11_CRT_PROG_NM = "" ;
      Z463TBT11_UPD_PROG_NM = "" ;
      A463TBT11_UPD_PROG_NM = "" ;
      BC000Q4_A92TBT11_STUDY_ID = new long[1] ;
      BC000Q4_A93TBT11_SUBJECT_ID = new int[1] ;
      BC000Q4_A94TBT11_CRF_ID = new short[1] ;
      BC000Q4_A936TBT11_CRF_EDA_NO = new byte[1] ;
      BC000Q4_A95TBT11_CRF_VERSION = new short[1] ;
      BC000Q4_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q4_A459TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q4_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q4_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q4_A462TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q4_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q4_A464TBT11_UPD_CNT = new long[1] ;
      BC000Q4_n464TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q4_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q4_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q4_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q4_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q4_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q4_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q4_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q4_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q4_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q4_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q4_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q4_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q4_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q4_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q4_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q4_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q4_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q4_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q4_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q4_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q4_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q4_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q4_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q4_A891TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q4_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q4_A457TBT11_DEL_FLG = new String[] {""} ;
      BC000Q4_n457TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q4_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q4_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q4_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q4_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      BC000Q5_A92TBT11_STUDY_ID = new long[1] ;
      BC000Q5_A93TBT11_SUBJECT_ID = new int[1] ;
      BC000Q5_A94TBT11_CRF_ID = new short[1] ;
      BC000Q5_A936TBT11_CRF_EDA_NO = new byte[1] ;
      BC000Q5_A95TBT11_CRF_VERSION = new short[1] ;
      BC000Q3_A92TBT11_STUDY_ID = new long[1] ;
      BC000Q3_A93TBT11_SUBJECT_ID = new int[1] ;
      BC000Q3_A94TBT11_CRF_ID = new short[1] ;
      BC000Q3_A936TBT11_CRF_EDA_NO = new byte[1] ;
      BC000Q3_A95TBT11_CRF_VERSION = new short[1] ;
      BC000Q3_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q3_A459TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q3_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q3_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q3_A462TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q3_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q3_A464TBT11_UPD_CNT = new long[1] ;
      BC000Q3_n464TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q3_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q3_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q3_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q3_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q3_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q3_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q3_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q3_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q3_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q3_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q3_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q3_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q3_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q3_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q3_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q3_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q3_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q3_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q3_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q3_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q3_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q3_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q3_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q3_A891TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q3_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q3_A457TBT11_DEL_FLG = new String[] {""} ;
      BC000Q3_n457TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q3_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q3_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q3_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q3_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      sMode56 = "" ;
      BC000Q2_A92TBT11_STUDY_ID = new long[1] ;
      BC000Q2_A93TBT11_SUBJECT_ID = new int[1] ;
      BC000Q2_A94TBT11_CRF_ID = new short[1] ;
      BC000Q2_A936TBT11_CRF_EDA_NO = new byte[1] ;
      BC000Q2_A95TBT11_CRF_VERSION = new short[1] ;
      BC000Q2_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q2_A459TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q2_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q2_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q2_A462TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q2_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q2_A464TBT11_UPD_CNT = new long[1] ;
      BC000Q2_n464TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q2_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q2_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q2_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q2_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q2_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q2_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q2_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q2_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q2_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q2_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q2_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q2_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q2_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q2_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q2_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q2_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q2_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q2_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q2_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q2_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q2_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q2_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q2_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q2_A891TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q2_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q2_A457TBT11_DEL_FLG = new String[] {""} ;
      BC000Q2_n457TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q2_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q2_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q2_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q2_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      BC000Q9_A92TBT11_STUDY_ID = new long[1] ;
      BC000Q9_A93TBT11_SUBJECT_ID = new int[1] ;
      BC000Q9_A94TBT11_CRF_ID = new short[1] ;
      BC000Q9_A936TBT11_CRF_EDA_NO = new byte[1] ;
      BC000Q9_A95TBT11_CRF_VERSION = new short[1] ;
      BC000Q9_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      BC000Q9_A459TBT11_CRT_USER_ID = new String[] {""} ;
      BC000Q9_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      BC000Q9_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      BC000Q9_A462TBT11_UPD_USER_ID = new String[] {""} ;
      BC000Q9_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      BC000Q9_A464TBT11_UPD_CNT = new long[1] ;
      BC000Q9_n464TBT11_UPD_CNT = new boolean[] {false} ;
      BC000Q9_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      BC000Q9_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000Q9_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000Q9_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      BC000Q9_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000Q9_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000Q9_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000Q9_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000Q9_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000Q9_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      BC000Q9_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      BC000Q9_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000Q9_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      BC000Q9_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000Q9_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000Q9_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      BC000Q9_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      BC000Q9_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Q9_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000Q9_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      BC000Q9_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000Q9_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000Q9_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000Q9_A891TBT11_UPD_RIYU = new String[] {""} ;
      BC000Q9_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      BC000Q9_A457TBT11_DEL_FLG = new String[] {""} ;
      BC000Q9_n457TBT11_DEL_FLG = new boolean[] {false} ;
      BC000Q9_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      BC000Q9_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      BC000Q9_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      BC000Q9_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt11_crf_history_bc__default(),
         new Object[] {
             new Object[] {
            BC000Q2_A92TBT11_STUDY_ID, BC000Q2_A93TBT11_SUBJECT_ID, BC000Q2_A94TBT11_CRF_ID, BC000Q2_A936TBT11_CRF_EDA_NO, BC000Q2_A95TBT11_CRF_VERSION, BC000Q2_A458TBT11_CRT_DATETIME, BC000Q2_n458TBT11_CRT_DATETIME, BC000Q2_A459TBT11_CRT_USER_ID, BC000Q2_n459TBT11_CRT_USER_ID, BC000Q2_A461TBT11_UPD_DATETIME,
            BC000Q2_n461TBT11_UPD_DATETIME, BC000Q2_A462TBT11_UPD_USER_ID, BC000Q2_n462TBT11_UPD_USER_ID, BC000Q2_A464TBT11_UPD_CNT, BC000Q2_n464TBT11_UPD_CNT, BC000Q2_A665TBT11_CRF_INPUT_LEVEL, BC000Q2_n665TBT11_CRF_INPUT_LEVEL, BC000Q2_A666TBT11_UPLOAD_DATETIME, BC000Q2_n666TBT11_UPLOAD_DATETIME, BC000Q2_A667TBT11_UPLOAD_USER_ID,
            BC000Q2_n667TBT11_UPLOAD_USER_ID, BC000Q2_A668TBT11_UPLOAD_AUTH_CD, BC000Q2_n668TBT11_UPLOAD_AUTH_CD, BC000Q2_A669TBT11_DM_ARRIVAL_FLG, BC000Q2_n669TBT11_DM_ARRIVAL_FLG, BC000Q2_A670TBT11_DM_ARRIVAL_DATETIME, BC000Q2_n670TBT11_DM_ARRIVAL_DATETIME, BC000Q2_A671TBT11_APPROVAL_FLG, BC000Q2_n671TBT11_APPROVAL_FLG, BC000Q2_A672TBT11_APPROVAL_DATETIME,
            BC000Q2_n672TBT11_APPROVAL_DATETIME, BC000Q2_A673TBT11_APPROVAL_USER_ID, BC000Q2_n673TBT11_APPROVAL_USER_ID, BC000Q2_A674TBT11_APPROVAL_AUTH_CD, BC000Q2_n674TBT11_APPROVAL_AUTH_CD, BC000Q2_A675TBT11_INPUT_END_FLG, BC000Q2_n675TBT11_INPUT_END_FLG, BC000Q2_A676TBT11_INPUT_END_DATETIME, BC000Q2_n676TBT11_INPUT_END_DATETIME, BC000Q2_A677TBT11_INPUT_END_USER_ID,
            BC000Q2_n677TBT11_INPUT_END_USER_ID, BC000Q2_A678TBT11_INPUT_END_AUTH_CD, BC000Q2_n678TBT11_INPUT_END_AUTH_CD, BC000Q2_A891TBT11_UPD_RIYU, BC000Q2_n891TBT11_UPD_RIYU, BC000Q2_A457TBT11_DEL_FLG, BC000Q2_n457TBT11_DEL_FLG, BC000Q2_A460TBT11_CRT_PROG_NM, BC000Q2_n460TBT11_CRT_PROG_NM, BC000Q2_A463TBT11_UPD_PROG_NM,
            BC000Q2_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q3_A92TBT11_STUDY_ID, BC000Q3_A93TBT11_SUBJECT_ID, BC000Q3_A94TBT11_CRF_ID, BC000Q3_A936TBT11_CRF_EDA_NO, BC000Q3_A95TBT11_CRF_VERSION, BC000Q3_A458TBT11_CRT_DATETIME, BC000Q3_n458TBT11_CRT_DATETIME, BC000Q3_A459TBT11_CRT_USER_ID, BC000Q3_n459TBT11_CRT_USER_ID, BC000Q3_A461TBT11_UPD_DATETIME,
            BC000Q3_n461TBT11_UPD_DATETIME, BC000Q3_A462TBT11_UPD_USER_ID, BC000Q3_n462TBT11_UPD_USER_ID, BC000Q3_A464TBT11_UPD_CNT, BC000Q3_n464TBT11_UPD_CNT, BC000Q3_A665TBT11_CRF_INPUT_LEVEL, BC000Q3_n665TBT11_CRF_INPUT_LEVEL, BC000Q3_A666TBT11_UPLOAD_DATETIME, BC000Q3_n666TBT11_UPLOAD_DATETIME, BC000Q3_A667TBT11_UPLOAD_USER_ID,
            BC000Q3_n667TBT11_UPLOAD_USER_ID, BC000Q3_A668TBT11_UPLOAD_AUTH_CD, BC000Q3_n668TBT11_UPLOAD_AUTH_CD, BC000Q3_A669TBT11_DM_ARRIVAL_FLG, BC000Q3_n669TBT11_DM_ARRIVAL_FLG, BC000Q3_A670TBT11_DM_ARRIVAL_DATETIME, BC000Q3_n670TBT11_DM_ARRIVAL_DATETIME, BC000Q3_A671TBT11_APPROVAL_FLG, BC000Q3_n671TBT11_APPROVAL_FLG, BC000Q3_A672TBT11_APPROVAL_DATETIME,
            BC000Q3_n672TBT11_APPROVAL_DATETIME, BC000Q3_A673TBT11_APPROVAL_USER_ID, BC000Q3_n673TBT11_APPROVAL_USER_ID, BC000Q3_A674TBT11_APPROVAL_AUTH_CD, BC000Q3_n674TBT11_APPROVAL_AUTH_CD, BC000Q3_A675TBT11_INPUT_END_FLG, BC000Q3_n675TBT11_INPUT_END_FLG, BC000Q3_A676TBT11_INPUT_END_DATETIME, BC000Q3_n676TBT11_INPUT_END_DATETIME, BC000Q3_A677TBT11_INPUT_END_USER_ID,
            BC000Q3_n677TBT11_INPUT_END_USER_ID, BC000Q3_A678TBT11_INPUT_END_AUTH_CD, BC000Q3_n678TBT11_INPUT_END_AUTH_CD, BC000Q3_A891TBT11_UPD_RIYU, BC000Q3_n891TBT11_UPD_RIYU, BC000Q3_A457TBT11_DEL_FLG, BC000Q3_n457TBT11_DEL_FLG, BC000Q3_A460TBT11_CRT_PROG_NM, BC000Q3_n460TBT11_CRT_PROG_NM, BC000Q3_A463TBT11_UPD_PROG_NM,
            BC000Q3_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q4_A92TBT11_STUDY_ID, BC000Q4_A93TBT11_SUBJECT_ID, BC000Q4_A94TBT11_CRF_ID, BC000Q4_A936TBT11_CRF_EDA_NO, BC000Q4_A95TBT11_CRF_VERSION, BC000Q4_A458TBT11_CRT_DATETIME, BC000Q4_n458TBT11_CRT_DATETIME, BC000Q4_A459TBT11_CRT_USER_ID, BC000Q4_n459TBT11_CRT_USER_ID, BC000Q4_A461TBT11_UPD_DATETIME,
            BC000Q4_n461TBT11_UPD_DATETIME, BC000Q4_A462TBT11_UPD_USER_ID, BC000Q4_n462TBT11_UPD_USER_ID, BC000Q4_A464TBT11_UPD_CNT, BC000Q4_n464TBT11_UPD_CNT, BC000Q4_A665TBT11_CRF_INPUT_LEVEL, BC000Q4_n665TBT11_CRF_INPUT_LEVEL, BC000Q4_A666TBT11_UPLOAD_DATETIME, BC000Q4_n666TBT11_UPLOAD_DATETIME, BC000Q4_A667TBT11_UPLOAD_USER_ID,
            BC000Q4_n667TBT11_UPLOAD_USER_ID, BC000Q4_A668TBT11_UPLOAD_AUTH_CD, BC000Q4_n668TBT11_UPLOAD_AUTH_CD, BC000Q4_A669TBT11_DM_ARRIVAL_FLG, BC000Q4_n669TBT11_DM_ARRIVAL_FLG, BC000Q4_A670TBT11_DM_ARRIVAL_DATETIME, BC000Q4_n670TBT11_DM_ARRIVAL_DATETIME, BC000Q4_A671TBT11_APPROVAL_FLG, BC000Q4_n671TBT11_APPROVAL_FLG, BC000Q4_A672TBT11_APPROVAL_DATETIME,
            BC000Q4_n672TBT11_APPROVAL_DATETIME, BC000Q4_A673TBT11_APPROVAL_USER_ID, BC000Q4_n673TBT11_APPROVAL_USER_ID, BC000Q4_A674TBT11_APPROVAL_AUTH_CD, BC000Q4_n674TBT11_APPROVAL_AUTH_CD, BC000Q4_A675TBT11_INPUT_END_FLG, BC000Q4_n675TBT11_INPUT_END_FLG, BC000Q4_A676TBT11_INPUT_END_DATETIME, BC000Q4_n676TBT11_INPUT_END_DATETIME, BC000Q4_A677TBT11_INPUT_END_USER_ID,
            BC000Q4_n677TBT11_INPUT_END_USER_ID, BC000Q4_A678TBT11_INPUT_END_AUTH_CD, BC000Q4_n678TBT11_INPUT_END_AUTH_CD, BC000Q4_A891TBT11_UPD_RIYU, BC000Q4_n891TBT11_UPD_RIYU, BC000Q4_A457TBT11_DEL_FLG, BC000Q4_n457TBT11_DEL_FLG, BC000Q4_A460TBT11_CRT_PROG_NM, BC000Q4_n460TBT11_CRT_PROG_NM, BC000Q4_A463TBT11_UPD_PROG_NM,
            BC000Q4_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            BC000Q5_A92TBT11_STUDY_ID, BC000Q5_A93TBT11_SUBJECT_ID, BC000Q5_A94TBT11_CRF_ID, BC000Q5_A936TBT11_CRF_EDA_NO, BC000Q5_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000Q9_A92TBT11_STUDY_ID, BC000Q9_A93TBT11_SUBJECT_ID, BC000Q9_A94TBT11_CRF_ID, BC000Q9_A936TBT11_CRF_EDA_NO, BC000Q9_A95TBT11_CRF_VERSION, BC000Q9_A458TBT11_CRT_DATETIME, BC000Q9_n458TBT11_CRT_DATETIME, BC000Q9_A459TBT11_CRT_USER_ID, BC000Q9_n459TBT11_CRT_USER_ID, BC000Q9_A461TBT11_UPD_DATETIME,
            BC000Q9_n461TBT11_UPD_DATETIME, BC000Q9_A462TBT11_UPD_USER_ID, BC000Q9_n462TBT11_UPD_USER_ID, BC000Q9_A464TBT11_UPD_CNT, BC000Q9_n464TBT11_UPD_CNT, BC000Q9_A665TBT11_CRF_INPUT_LEVEL, BC000Q9_n665TBT11_CRF_INPUT_LEVEL, BC000Q9_A666TBT11_UPLOAD_DATETIME, BC000Q9_n666TBT11_UPLOAD_DATETIME, BC000Q9_A667TBT11_UPLOAD_USER_ID,
            BC000Q9_n667TBT11_UPLOAD_USER_ID, BC000Q9_A668TBT11_UPLOAD_AUTH_CD, BC000Q9_n668TBT11_UPLOAD_AUTH_CD, BC000Q9_A669TBT11_DM_ARRIVAL_FLG, BC000Q9_n669TBT11_DM_ARRIVAL_FLG, BC000Q9_A670TBT11_DM_ARRIVAL_DATETIME, BC000Q9_n670TBT11_DM_ARRIVAL_DATETIME, BC000Q9_A671TBT11_APPROVAL_FLG, BC000Q9_n671TBT11_APPROVAL_FLG, BC000Q9_A672TBT11_APPROVAL_DATETIME,
            BC000Q9_n672TBT11_APPROVAL_DATETIME, BC000Q9_A673TBT11_APPROVAL_USER_ID, BC000Q9_n673TBT11_APPROVAL_USER_ID, BC000Q9_A674TBT11_APPROVAL_AUTH_CD, BC000Q9_n674TBT11_APPROVAL_AUTH_CD, BC000Q9_A675TBT11_INPUT_END_FLG, BC000Q9_n675TBT11_INPUT_END_FLG, BC000Q9_A676TBT11_INPUT_END_DATETIME, BC000Q9_n676TBT11_INPUT_END_DATETIME, BC000Q9_A677TBT11_INPUT_END_USER_ID,
            BC000Q9_n677TBT11_INPUT_END_USER_ID, BC000Q9_A678TBT11_INPUT_END_AUTH_CD, BC000Q9_n678TBT11_INPUT_END_AUTH_CD, BC000Q9_A891TBT11_UPD_RIYU, BC000Q9_n891TBT11_UPD_RIYU, BC000Q9_A457TBT11_DEL_FLG, BC000Q9_n457TBT11_DEL_FLG, BC000Q9_A460TBT11_CRT_PROG_NM, BC000Q9_n460TBT11_CRT_PROG_NM, BC000Q9_A463TBT11_UPD_PROG_NM,
            BC000Q9_n463TBT11_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT11_CRF_HISTORY_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110Q2 */
      e110Q2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z936TBT11_CRF_EDA_NO ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte Z665TBT11_CRF_INPUT_LEVEL ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z94TBT11_CRF_ID ;
   private short A94TBT11_CRF_ID ;
   private short Z95TBT11_CRF_VERSION ;
   private short A95TBT11_CRF_VERSION ;
   private short RcdFound56 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z93TBT11_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z92TBT11_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long Z464TBT11_UPD_CNT ;
   private long A464TBT11_UPD_CNT ;
   private long O464TBT11_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode56 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z458TBT11_CRT_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date Z461TBT11_UPD_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date Z666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date Z670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date Z676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private boolean n458TBT11_CRT_DATETIME ;
   private boolean n459TBT11_CRT_USER_ID ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n462TBT11_UPD_USER_ID ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n668TBT11_UPLOAD_AUTH_CD ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n671TBT11_APPROVAL_FLG ;
   private boolean n672TBT11_APPROVAL_DATETIME ;
   private boolean n673TBT11_APPROVAL_USER_ID ;
   private boolean n674TBT11_APPROVAL_AUTH_CD ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n676TBT11_INPUT_END_DATETIME ;
   private boolean n677TBT11_INPUT_END_USER_ID ;
   private boolean n678TBT11_INPUT_END_AUTH_CD ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n460TBT11_CRT_PROG_NM ;
   private boolean n463TBT11_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String Z459TBT11_CRT_USER_ID ;
   private String A459TBT11_CRT_USER_ID ;
   private String Z462TBT11_UPD_USER_ID ;
   private String A462TBT11_UPD_USER_ID ;
   private String Z667TBT11_UPLOAD_USER_ID ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String Z668TBT11_UPLOAD_AUTH_CD ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String Z669TBT11_DM_ARRIVAL_FLG ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String Z671TBT11_APPROVAL_FLG ;
   private String A671TBT11_APPROVAL_FLG ;
   private String Z673TBT11_APPROVAL_USER_ID ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String Z674TBT11_APPROVAL_AUTH_CD ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String Z675TBT11_INPUT_END_FLG ;
   private String A675TBT11_INPUT_END_FLG ;
   private String Z677TBT11_INPUT_END_USER_ID ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String Z678TBT11_INPUT_END_AUTH_CD ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String Z891TBT11_UPD_RIYU ;
   private String A891TBT11_UPD_RIYU ;
   private String Z457TBT11_DEL_FLG ;
   private String A457TBT11_DEL_FLG ;
   private String Z460TBT11_CRT_PROG_NM ;
   private String A460TBT11_CRT_PROG_NM ;
   private String Z463TBT11_UPD_PROG_NM ;
   private String A463TBT11_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT11_CRF_HISTORY bcTBT11_CRF_HISTORY ;
   private IDataStoreProvider pr_default ;
   private long[] BC000Q4_A92TBT11_STUDY_ID ;
   private int[] BC000Q4_A93TBT11_SUBJECT_ID ;
   private short[] BC000Q4_A94TBT11_CRF_ID ;
   private byte[] BC000Q4_A936TBT11_CRF_EDA_NO ;
   private short[] BC000Q4_A95TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q4_A458TBT11_CRT_DATETIME ;
   private boolean[] BC000Q4_n458TBT11_CRT_DATETIME ;
   private String[] BC000Q4_A459TBT11_CRT_USER_ID ;
   private boolean[] BC000Q4_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q4_A461TBT11_UPD_DATETIME ;
   private boolean[] BC000Q4_n461TBT11_UPD_DATETIME ;
   private String[] BC000Q4_A462TBT11_UPD_USER_ID ;
   private boolean[] BC000Q4_n462TBT11_UPD_USER_ID ;
   private long[] BC000Q4_A464TBT11_UPD_CNT ;
   private boolean[] BC000Q4_n464TBT11_UPD_CNT ;
   private byte[] BC000Q4_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q4_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q4_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q4_n666TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q4_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q4_n667TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q4_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q4_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q4_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q4_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q4_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q4_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q4_A671TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q4_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q4_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q4_n672TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q4_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q4_n673TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q4_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q4_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q4_A675TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q4_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q4_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q4_n676TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q4_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q4_n677TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q4_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q4_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q4_A891TBT11_UPD_RIYU ;
   private boolean[] BC000Q4_n891TBT11_UPD_RIYU ;
   private String[] BC000Q4_A457TBT11_DEL_FLG ;
   private boolean[] BC000Q4_n457TBT11_DEL_FLG ;
   private String[] BC000Q4_A460TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q4_n460TBT11_CRT_PROG_NM ;
   private String[] BC000Q4_A463TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q4_n463TBT11_UPD_PROG_NM ;
   private long[] BC000Q5_A92TBT11_STUDY_ID ;
   private int[] BC000Q5_A93TBT11_SUBJECT_ID ;
   private short[] BC000Q5_A94TBT11_CRF_ID ;
   private byte[] BC000Q5_A936TBT11_CRF_EDA_NO ;
   private short[] BC000Q5_A95TBT11_CRF_VERSION ;
   private long[] BC000Q3_A92TBT11_STUDY_ID ;
   private int[] BC000Q3_A93TBT11_SUBJECT_ID ;
   private short[] BC000Q3_A94TBT11_CRF_ID ;
   private byte[] BC000Q3_A936TBT11_CRF_EDA_NO ;
   private short[] BC000Q3_A95TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q3_A458TBT11_CRT_DATETIME ;
   private boolean[] BC000Q3_n458TBT11_CRT_DATETIME ;
   private String[] BC000Q3_A459TBT11_CRT_USER_ID ;
   private boolean[] BC000Q3_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q3_A461TBT11_UPD_DATETIME ;
   private boolean[] BC000Q3_n461TBT11_UPD_DATETIME ;
   private String[] BC000Q3_A462TBT11_UPD_USER_ID ;
   private boolean[] BC000Q3_n462TBT11_UPD_USER_ID ;
   private long[] BC000Q3_A464TBT11_UPD_CNT ;
   private boolean[] BC000Q3_n464TBT11_UPD_CNT ;
   private byte[] BC000Q3_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q3_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q3_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q3_n666TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q3_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q3_n667TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q3_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q3_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q3_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q3_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q3_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q3_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q3_A671TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q3_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q3_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q3_n672TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q3_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q3_n673TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q3_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q3_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q3_A675TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q3_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q3_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q3_n676TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q3_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q3_n677TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q3_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q3_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q3_A891TBT11_UPD_RIYU ;
   private boolean[] BC000Q3_n891TBT11_UPD_RIYU ;
   private String[] BC000Q3_A457TBT11_DEL_FLG ;
   private boolean[] BC000Q3_n457TBT11_DEL_FLG ;
   private String[] BC000Q3_A460TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q3_n460TBT11_CRT_PROG_NM ;
   private String[] BC000Q3_A463TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q3_n463TBT11_UPD_PROG_NM ;
   private long[] BC000Q2_A92TBT11_STUDY_ID ;
   private int[] BC000Q2_A93TBT11_SUBJECT_ID ;
   private short[] BC000Q2_A94TBT11_CRF_ID ;
   private byte[] BC000Q2_A936TBT11_CRF_EDA_NO ;
   private short[] BC000Q2_A95TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q2_A458TBT11_CRT_DATETIME ;
   private boolean[] BC000Q2_n458TBT11_CRT_DATETIME ;
   private String[] BC000Q2_A459TBT11_CRT_USER_ID ;
   private boolean[] BC000Q2_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q2_A461TBT11_UPD_DATETIME ;
   private boolean[] BC000Q2_n461TBT11_UPD_DATETIME ;
   private String[] BC000Q2_A462TBT11_UPD_USER_ID ;
   private boolean[] BC000Q2_n462TBT11_UPD_USER_ID ;
   private long[] BC000Q2_A464TBT11_UPD_CNT ;
   private boolean[] BC000Q2_n464TBT11_UPD_CNT ;
   private byte[] BC000Q2_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q2_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q2_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q2_n666TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q2_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q2_n667TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q2_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q2_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q2_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q2_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q2_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q2_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q2_A671TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q2_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q2_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q2_n672TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q2_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q2_n673TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q2_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q2_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q2_A675TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q2_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q2_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q2_n676TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q2_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q2_n677TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q2_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q2_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q2_A891TBT11_UPD_RIYU ;
   private boolean[] BC000Q2_n891TBT11_UPD_RIYU ;
   private String[] BC000Q2_A457TBT11_DEL_FLG ;
   private boolean[] BC000Q2_n457TBT11_DEL_FLG ;
   private String[] BC000Q2_A460TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q2_n460TBT11_CRT_PROG_NM ;
   private String[] BC000Q2_A463TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q2_n463TBT11_UPD_PROG_NM ;
   private long[] BC000Q9_A92TBT11_STUDY_ID ;
   private int[] BC000Q9_A93TBT11_SUBJECT_ID ;
   private short[] BC000Q9_A94TBT11_CRF_ID ;
   private byte[] BC000Q9_A936TBT11_CRF_EDA_NO ;
   private short[] BC000Q9_A95TBT11_CRF_VERSION ;
   private java.util.Date[] BC000Q9_A458TBT11_CRT_DATETIME ;
   private boolean[] BC000Q9_n458TBT11_CRT_DATETIME ;
   private String[] BC000Q9_A459TBT11_CRT_USER_ID ;
   private boolean[] BC000Q9_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] BC000Q9_A461TBT11_UPD_DATETIME ;
   private boolean[] BC000Q9_n461TBT11_UPD_DATETIME ;
   private String[] BC000Q9_A462TBT11_UPD_USER_ID ;
   private boolean[] BC000Q9_n462TBT11_UPD_USER_ID ;
   private long[] BC000Q9_A464TBT11_UPD_CNT ;
   private boolean[] BC000Q9_n464TBT11_UPD_CNT ;
   private byte[] BC000Q9_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] BC000Q9_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] BC000Q9_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] BC000Q9_n666TBT11_UPLOAD_DATETIME ;
   private String[] BC000Q9_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] BC000Q9_n667TBT11_UPLOAD_USER_ID ;
   private String[] BC000Q9_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] BC000Q9_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] BC000Q9_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] BC000Q9_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000Q9_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000Q9_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] BC000Q9_A671TBT11_APPROVAL_FLG ;
   private boolean[] BC000Q9_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] BC000Q9_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] BC000Q9_n672TBT11_APPROVAL_DATETIME ;
   private String[] BC000Q9_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] BC000Q9_n673TBT11_APPROVAL_USER_ID ;
   private String[] BC000Q9_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] BC000Q9_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] BC000Q9_A675TBT11_INPUT_END_FLG ;
   private boolean[] BC000Q9_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] BC000Q9_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] BC000Q9_n676TBT11_INPUT_END_DATETIME ;
   private String[] BC000Q9_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] BC000Q9_n677TBT11_INPUT_END_USER_ID ;
   private String[] BC000Q9_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] BC000Q9_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] BC000Q9_A891TBT11_UPD_RIYU ;
   private boolean[] BC000Q9_n891TBT11_UPD_RIYU ;
   private String[] BC000Q9_A457TBT11_DEL_FLG ;
   private boolean[] BC000Q9_n457TBT11_DEL_FLG ;
   private String[] BC000Q9_A460TBT11_CRT_PROG_NM ;
   private boolean[] BC000Q9_n460TBT11_CRT_PROG_NM ;
   private String[] BC000Q9_A463TBT11_UPD_PROG_NM ;
   private boolean[] BC000Q9_n463TBT11_UPD_PROG_NM ;
}

final  class tbt11_crf_history_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000Q2", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Q3", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Q4", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_EDA_NO` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000Q5", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000Q6", "INSERT INTO `TBT11_CRF_HISTORY`(`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000Q7", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_CRT_DATETIME`=?, `TBT11_CRT_USER_ID`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_CNT`=?, `TBT11_CRF_INPUT_LEVEL`=?, `TBT11_UPLOAD_DATETIME`=?, `TBT11_UPLOAD_USER_ID`=?, `TBT11_UPLOAD_AUTH_CD`=?, `TBT11_DM_ARRIVAL_FLG`=?, `TBT11_DM_ARRIVAL_DATETIME`=?, `TBT11_APPROVAL_FLG`=?, `TBT11_APPROVAL_DATETIME`=?, `TBT11_APPROVAL_USER_ID`=?, `TBT11_APPROVAL_AUTH_CD`=?, `TBT11_INPUT_END_FLG`=?, `TBT11_INPUT_END_DATETIME`=?, `TBT11_INPUT_END_USER_ID`=?, `TBT11_INPUT_END_AUTH_CD`=?, `TBT11_UPD_RIYU`=?, `TBT11_DEL_FLG`=?, `TBT11_CRT_PROG_NM`=?, `TBT11_UPD_PROG_NM`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000Q8", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000Q9", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_EDA_NO` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[14]).longValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[32], 128);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[40], 128);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[44], 2000);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[48], 40);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[50], 40);
               }
               return;
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
               stmt.setByte(27, ((Number) parms[49]).byteValue());
               stmt.setShort(28, ((Number) parms[50]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

