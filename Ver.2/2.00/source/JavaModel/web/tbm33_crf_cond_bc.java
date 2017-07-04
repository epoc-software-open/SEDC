/*
               File: tbm33_crf_cond_bc
        Description: CRF条件マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:0.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm33_crf_cond_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm33_crf_cond_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm33_crf_cond_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm33_crf_cond_bc.class ));
   }

   public tbm33_crf_cond_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0L20( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0L20( ) ;
      standaloneModal( ) ;
      addRow0L20( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120L2 */
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z76TBM33_STUDY_ID = A76TBM33_STUDY_ID ;
            Z77TBM33_CRF_ID = A77TBM33_CRF_ID ;
            Z78TBM33_COND_NO = A78TBM33_COND_NO ;
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

   public void confirm_0L0( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0L20( ) ;
         }
         else
         {
            checkExtendedTable0L20( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0L20( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110L2( )
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

   public void e120L2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A77TBM33_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A78TBM33_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A502TBM33_COND_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A414TBM33_EXPRESSION + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A503TBM33_COND_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A504TBM33_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A415TBM33_PRIOR_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A505TBM33_ERR_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A506TBM33_ERR_MSG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A646TBM33_ENABLED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A696TBM33_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A697TBM33_NUMERIC_RANGE_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A416TBM33_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A417TBM33_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A418TBM33_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A419TBM33_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A420TBM33_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A421TBM33_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A422TBM33_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A423TBM33_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
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

   public void zm0L20( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z417TBM33_CRT_DATETIME = A417TBM33_CRT_DATETIME ;
         Z418TBM33_CRT_USER_ID = A418TBM33_CRT_USER_ID ;
         Z420TBM33_UPD_DATETIME = A420TBM33_UPD_DATETIME ;
         Z421TBM33_UPD_USER_ID = A421TBM33_UPD_USER_ID ;
         Z423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
         Z502TBM33_COND_NM = A502TBM33_COND_NM ;
         Z414TBM33_EXPRESSION = A414TBM33_EXPRESSION ;
         Z503TBM33_COND_DIV = A503TBM33_COND_DIV ;
         Z504TBM33_CRF_ITEM_CD = A504TBM33_CRF_ITEM_CD ;
         Z415TBM33_PRIOR_NO = A415TBM33_PRIOR_NO ;
         Z505TBM33_ERR_DIV = A505TBM33_ERR_DIV ;
         Z506TBM33_ERR_MSG = A506TBM33_ERR_MSG ;
         Z646TBM33_ENABLED_FLG = A646TBM33_ENABLED_FLG ;
         Z696TBM33_REQUIRED_INPUT_FLG = A696TBM33_REQUIRED_INPUT_FLG ;
         Z697TBM33_NUMERIC_RANGE_FLG = A697TBM33_NUMERIC_RANGE_FLG ;
         Z416TBM33_DEL_FLG = A416TBM33_DEL_FLG ;
         Z419TBM33_CRT_PROG_NM = A419TBM33_CRT_PROG_NM ;
         Z422TBM33_UPD_PROG_NM = A422TBM33_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z76TBM33_STUDY_ID = A76TBM33_STUDY_ID ;
         Z77TBM33_CRF_ID = A77TBM33_CRF_ID ;
         Z78TBM33_COND_NO = A78TBM33_COND_NO ;
         Z417TBM33_CRT_DATETIME = A417TBM33_CRT_DATETIME ;
         Z418TBM33_CRT_USER_ID = A418TBM33_CRT_USER_ID ;
         Z420TBM33_UPD_DATETIME = A420TBM33_UPD_DATETIME ;
         Z421TBM33_UPD_USER_ID = A421TBM33_UPD_USER_ID ;
         Z423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
         Z502TBM33_COND_NM = A502TBM33_COND_NM ;
         Z414TBM33_EXPRESSION = A414TBM33_EXPRESSION ;
         Z503TBM33_COND_DIV = A503TBM33_COND_DIV ;
         Z504TBM33_CRF_ITEM_CD = A504TBM33_CRF_ITEM_CD ;
         Z415TBM33_PRIOR_NO = A415TBM33_PRIOR_NO ;
         Z505TBM33_ERR_DIV = A505TBM33_ERR_DIV ;
         Z506TBM33_ERR_MSG = A506TBM33_ERR_MSG ;
         Z646TBM33_ENABLED_FLG = A646TBM33_ENABLED_FLG ;
         Z696TBM33_REQUIRED_INPUT_FLG = A696TBM33_REQUIRED_INPUT_FLG ;
         Z697TBM33_NUMERIC_RANGE_FLG = A697TBM33_NUMERIC_RANGE_FLG ;
         Z416TBM33_DEL_FLG = A416TBM33_DEL_FLG ;
         Z419TBM33_CRT_PROG_NM = A419TBM33_CRT_PROG_NM ;
         Z422TBM33_UPD_PROG_NM = A422TBM33_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0L20( )
   {
      /* Using cursor BC000L4 */
      pr_default.execute(2, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A417TBM33_CRT_DATETIME = BC000L4_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = BC000L4_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = BC000L4_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = BC000L4_n418TBM33_CRT_USER_ID[0] ;
         A420TBM33_UPD_DATETIME = BC000L4_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = BC000L4_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = BC000L4_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = BC000L4_n421TBM33_UPD_USER_ID[0] ;
         A423TBM33_UPD_CNT = BC000L4_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = BC000L4_n423TBM33_UPD_CNT[0] ;
         A502TBM33_COND_NM = BC000L4_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = BC000L4_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = BC000L4_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = BC000L4_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = BC000L4_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = BC000L4_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = BC000L4_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = BC000L4_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = BC000L4_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = BC000L4_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = BC000L4_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = BC000L4_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = BC000L4_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = BC000L4_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = BC000L4_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = BC000L4_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = BC000L4_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = BC000L4_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = BC000L4_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = BC000L4_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = BC000L4_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = BC000L4_n416TBM33_DEL_FLG[0] ;
         A419TBM33_CRT_PROG_NM = BC000L4_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = BC000L4_n419TBM33_CRT_PROG_NM[0] ;
         A422TBM33_UPD_PROG_NM = BC000L4_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = BC000L4_n422TBM33_UPD_PROG_NM[0] ;
         zm0L20( -8) ;
      }
      pr_default.close(2);
      onLoadActions0L20( ) ;
   }

   public void onLoadActions0L20( )
   {
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
   }

   public void checkExtendedTable0L20( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
      if ( ! ( GXutil.nullDate().equals(A417TBM33_CRT_DATETIME) || (( A417TBM33_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A417TBM33_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A420TBM33_UPD_DATETIME) || (( A420TBM33_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A420TBM33_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0L20( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0L20( )
   {
      /* Using cursor BC000L5 */
      pr_default.execute(3, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound20 = (short)(1) ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000L3 */
      pr_default.execute(1, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0L20( 8) ;
         RcdFound20 = (short)(1) ;
         A76TBM33_STUDY_ID = BC000L3_A76TBM33_STUDY_ID[0] ;
         A77TBM33_CRF_ID = BC000L3_A77TBM33_CRF_ID[0] ;
         A78TBM33_COND_NO = BC000L3_A78TBM33_COND_NO[0] ;
         A417TBM33_CRT_DATETIME = BC000L3_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = BC000L3_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = BC000L3_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = BC000L3_n418TBM33_CRT_USER_ID[0] ;
         A420TBM33_UPD_DATETIME = BC000L3_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = BC000L3_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = BC000L3_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = BC000L3_n421TBM33_UPD_USER_ID[0] ;
         A423TBM33_UPD_CNT = BC000L3_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = BC000L3_n423TBM33_UPD_CNT[0] ;
         A502TBM33_COND_NM = BC000L3_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = BC000L3_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = BC000L3_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = BC000L3_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = BC000L3_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = BC000L3_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = BC000L3_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = BC000L3_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = BC000L3_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = BC000L3_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = BC000L3_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = BC000L3_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = BC000L3_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = BC000L3_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = BC000L3_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = BC000L3_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = BC000L3_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = BC000L3_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = BC000L3_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = BC000L3_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = BC000L3_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = BC000L3_n416TBM33_DEL_FLG[0] ;
         A419TBM33_CRT_PROG_NM = BC000L3_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = BC000L3_n419TBM33_CRT_PROG_NM[0] ;
         A422TBM33_UPD_PROG_NM = BC000L3_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = BC000L3_n422TBM33_UPD_PROG_NM[0] ;
         O423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
         n423TBM33_UPD_CNT = false ;
         Z76TBM33_STUDY_ID = A76TBM33_STUDY_ID ;
         Z77TBM33_CRF_ID = A77TBM33_CRF_ID ;
         Z78TBM33_COND_NO = A78TBM33_COND_NO ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0L20( ) ;
         if ( AnyError == 1 )
         {
            RcdFound20 = (short)(0) ;
            initializeNonKey0L20( ) ;
         }
         Gx_mode = sMode20 ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
         initializeNonKey0L20( ) ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode20 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0L20( ) ;
      if ( RcdFound20 == 0 )
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
      confirm_0L0( ) ;
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

   public void checkOptimisticConcurrency0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000L2 */
         pr_default.execute(0, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z417TBM33_CRT_DATETIME.equals( BC000L2_A417TBM33_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z418TBM33_CRT_USER_ID, BC000L2_A418TBM33_CRT_USER_ID[0]) != 0 ) || !( Z420TBM33_UPD_DATETIME.equals( BC000L2_A420TBM33_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z421TBM33_UPD_USER_ID, BC000L2_A421TBM33_UPD_USER_ID[0]) != 0 ) || ( Z423TBM33_UPD_CNT != BC000L2_A423TBM33_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z502TBM33_COND_NM, BC000L2_A502TBM33_COND_NM[0]) != 0 ) || ( GXutil.strcmp(Z414TBM33_EXPRESSION, BC000L2_A414TBM33_EXPRESSION[0]) != 0 ) || ( GXutil.strcmp(Z503TBM33_COND_DIV, BC000L2_A503TBM33_COND_DIV[0]) != 0 ) || ( GXutil.strcmp(Z504TBM33_CRF_ITEM_CD, BC000L2_A504TBM33_CRF_ITEM_CD[0]) != 0 ) || ( Z415TBM33_PRIOR_NO != BC000L2_A415TBM33_PRIOR_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z505TBM33_ERR_DIV, BC000L2_A505TBM33_ERR_DIV[0]) != 0 ) || ( GXutil.strcmp(Z506TBM33_ERR_MSG, BC000L2_A506TBM33_ERR_MSG[0]) != 0 ) || ( GXutil.strcmp(Z646TBM33_ENABLED_FLG, BC000L2_A646TBM33_ENABLED_FLG[0]) != 0 ) || ( GXutil.strcmp(Z696TBM33_REQUIRED_INPUT_FLG, BC000L2_A696TBM33_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z697TBM33_NUMERIC_RANGE_FLG, BC000L2_A697TBM33_NUMERIC_RANGE_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z416TBM33_DEL_FLG, BC000L2_A416TBM33_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z419TBM33_CRT_PROG_NM, BC000L2_A419TBM33_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z422TBM33_UPD_PROG_NM, BC000L2_A422TBM33_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM33_CRF_COND"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L20( 0) ;
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000L6 */
                  pr_default.execute(4, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO), new Boolean(n417TBM33_CRT_DATETIME), A417TBM33_CRT_DATETIME, new Boolean(n418TBM33_CRT_USER_ID), A418TBM33_CRT_USER_ID, new Boolean(n420TBM33_UPD_DATETIME), A420TBM33_UPD_DATETIME, new Boolean(n421TBM33_UPD_USER_ID), A421TBM33_UPD_USER_ID, new Boolean(n423TBM33_UPD_CNT), new Long(A423TBM33_UPD_CNT), new Boolean(n502TBM33_COND_NM), A502TBM33_COND_NM, new Boolean(n414TBM33_EXPRESSION), A414TBM33_EXPRESSION, new Boolean(n503TBM33_COND_DIV), A503TBM33_COND_DIV, new Boolean(n504TBM33_CRF_ITEM_CD), A504TBM33_CRF_ITEM_CD, new Boolean(n415TBM33_PRIOR_NO), new Byte(A415TBM33_PRIOR_NO), new Boolean(n505TBM33_ERR_DIV), A505TBM33_ERR_DIV, new Boolean(n506TBM33_ERR_MSG), A506TBM33_ERR_MSG, new Boolean(n646TBM33_ENABLED_FLG), A646TBM33_ENABLED_FLG, new Boolean(n696TBM33_REQUIRED_INPUT_FLG), A696TBM33_REQUIRED_INPUT_FLG, new Boolean(n697TBM33_NUMERIC_RANGE_FLG), A697TBM33_NUMERIC_RANGE_FLG, new Boolean(n416TBM33_DEL_FLG), A416TBM33_DEL_FLG, new Boolean(n419TBM33_CRT_PROG_NM), A419TBM33_CRT_PROG_NM, new Boolean(n422TBM33_UPD_PROG_NM), A422TBM33_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
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
            load0L20( ) ;
         }
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void update0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000L7 */
                  pr_default.execute(5, new Object[] {new Boolean(n417TBM33_CRT_DATETIME), A417TBM33_CRT_DATETIME, new Boolean(n418TBM33_CRT_USER_ID), A418TBM33_CRT_USER_ID, new Boolean(n420TBM33_UPD_DATETIME), A420TBM33_UPD_DATETIME, new Boolean(n421TBM33_UPD_USER_ID), A421TBM33_UPD_USER_ID, new Boolean(n423TBM33_UPD_CNT), new Long(A423TBM33_UPD_CNT), new Boolean(n502TBM33_COND_NM), A502TBM33_COND_NM, new Boolean(n414TBM33_EXPRESSION), A414TBM33_EXPRESSION, new Boolean(n503TBM33_COND_DIV), A503TBM33_COND_DIV, new Boolean(n504TBM33_CRF_ITEM_CD), A504TBM33_CRF_ITEM_CD, new Boolean(n415TBM33_PRIOR_NO), new Byte(A415TBM33_PRIOR_NO), new Boolean(n505TBM33_ERR_DIV), A505TBM33_ERR_DIV, new Boolean(n506TBM33_ERR_MSG), A506TBM33_ERR_MSG, new Boolean(n646TBM33_ENABLED_FLG), A646TBM33_ENABLED_FLG, new Boolean(n696TBM33_REQUIRED_INPUT_FLG), A696TBM33_REQUIRED_INPUT_FLG, new Boolean(n697TBM33_NUMERIC_RANGE_FLG), A697TBM33_NUMERIC_RANGE_FLG, new Boolean(n416TBM33_DEL_FLG), A416TBM33_DEL_FLG, new Boolean(n419TBM33_CRT_PROG_NM), A419TBM33_CRT_PROG_NM, new Boolean(n422TBM33_UPD_PROG_NM), A422TBM33_UPD_PROG_NM, new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0L20( ) ;
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
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void deferredUpdate0L20( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L20( ) ;
         afterConfirm0L20( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L20( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000L8 */
               pr_default.execute(6, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
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
      sMode20 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0L20( ) ;
      Gx_mode = sMode20 ;
   }

   public void onDeleteControls0L20( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM33_CRF_COND_BC" ;
      }
   }

   public void endLevel0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0L20( ) ;
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

   public void scanKeyStart0L20( )
   {
      /* Scan By routine */
      /* Using cursor BC000L9 */
      pr_default.execute(7, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A76TBM33_STUDY_ID = BC000L9_A76TBM33_STUDY_ID[0] ;
         A77TBM33_CRF_ID = BC000L9_A77TBM33_CRF_ID[0] ;
         A78TBM33_COND_NO = BC000L9_A78TBM33_COND_NO[0] ;
         A417TBM33_CRT_DATETIME = BC000L9_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = BC000L9_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = BC000L9_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = BC000L9_n418TBM33_CRT_USER_ID[0] ;
         A420TBM33_UPD_DATETIME = BC000L9_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = BC000L9_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = BC000L9_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = BC000L9_n421TBM33_UPD_USER_ID[0] ;
         A423TBM33_UPD_CNT = BC000L9_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = BC000L9_n423TBM33_UPD_CNT[0] ;
         A502TBM33_COND_NM = BC000L9_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = BC000L9_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = BC000L9_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = BC000L9_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = BC000L9_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = BC000L9_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = BC000L9_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = BC000L9_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = BC000L9_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = BC000L9_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = BC000L9_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = BC000L9_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = BC000L9_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = BC000L9_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = BC000L9_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = BC000L9_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = BC000L9_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = BC000L9_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = BC000L9_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = BC000L9_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = BC000L9_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = BC000L9_n416TBM33_DEL_FLG[0] ;
         A419TBM33_CRT_PROG_NM = BC000L9_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = BC000L9_n419TBM33_CRT_PROG_NM[0] ;
         A422TBM33_UPD_PROG_NM = BC000L9_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = BC000L9_n422TBM33_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0L20( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound20 = (short)(0) ;
      scanKeyLoad0L20( ) ;
   }

   public void scanKeyLoad0L20( )
   {
      sMode20 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A76TBM33_STUDY_ID = BC000L9_A76TBM33_STUDY_ID[0] ;
         A77TBM33_CRF_ID = BC000L9_A77TBM33_CRF_ID[0] ;
         A78TBM33_COND_NO = BC000L9_A78TBM33_COND_NO[0] ;
         A417TBM33_CRT_DATETIME = BC000L9_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = BC000L9_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = BC000L9_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = BC000L9_n418TBM33_CRT_USER_ID[0] ;
         A420TBM33_UPD_DATETIME = BC000L9_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = BC000L9_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = BC000L9_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = BC000L9_n421TBM33_UPD_USER_ID[0] ;
         A423TBM33_UPD_CNT = BC000L9_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = BC000L9_n423TBM33_UPD_CNT[0] ;
         A502TBM33_COND_NM = BC000L9_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = BC000L9_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = BC000L9_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = BC000L9_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = BC000L9_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = BC000L9_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = BC000L9_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = BC000L9_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = BC000L9_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = BC000L9_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = BC000L9_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = BC000L9_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = BC000L9_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = BC000L9_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = BC000L9_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = BC000L9_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = BC000L9_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = BC000L9_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = BC000L9_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = BC000L9_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = BC000L9_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = BC000L9_n416TBM33_DEL_FLG[0] ;
         A419TBM33_CRT_PROG_NM = BC000L9_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = BC000L9_n419TBM33_CRT_PROG_NM[0] ;
         A422TBM33_UPD_PROG_NM = BC000L9_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = BC000L9_n422TBM33_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode20 ;
   }

   public void scanKeyEnd0L20( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0L20( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0L20( )
   {
      /* Before Insert Rules */
      A417TBM33_CRT_DATETIME = GXutil.now( ) ;
      n417TBM33_CRT_DATETIME = false ;
      GXt_char1 = A418TBM33_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A418TBM33_CRT_USER_ID = GXt_char1 ;
      n418TBM33_CRT_USER_ID = false ;
      A420TBM33_UPD_DATETIME = GXutil.now( ) ;
      n420TBM33_UPD_DATETIME = false ;
      GXt_char1 = A421TBM33_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A421TBM33_UPD_USER_ID = GXt_char1 ;
      n421TBM33_UPD_USER_ID = false ;
      A423TBM33_UPD_CNT = (long)(O423TBM33_UPD_CNT+1) ;
      n423TBM33_UPD_CNT = false ;
   }

   public void beforeUpdate0L20( )
   {
      /* Before Update Rules */
      A420TBM33_UPD_DATETIME = GXutil.now( ) ;
      n420TBM33_UPD_DATETIME = false ;
      GXt_char1 = A421TBM33_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A421TBM33_UPD_USER_ID = GXt_char1 ;
      n421TBM33_UPD_USER_ID = false ;
      A423TBM33_UPD_CNT = (long)(O423TBM33_UPD_CNT+1) ;
      n423TBM33_UPD_CNT = false ;
   }

   public void beforeDelete0L20( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L20( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L20( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L20( )
   {
   }

   public void addRow0L20( )
   {
      VarsToRow20( bcTBM33_CRF_COND) ;
   }

   public void readRow0L20( )
   {
      RowToVars20( bcTBM33_CRF_COND, 1) ;
   }

   public void initializeNonKey0L20( )
   {
      A417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n417TBM33_CRT_DATETIME = false ;
      A418TBM33_CRT_USER_ID = "" ;
      n418TBM33_CRT_USER_ID = false ;
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n420TBM33_UPD_DATETIME = false ;
      A421TBM33_UPD_USER_ID = "" ;
      n421TBM33_UPD_USER_ID = false ;
      A423TBM33_UPD_CNT = 0 ;
      n423TBM33_UPD_CNT = false ;
      A502TBM33_COND_NM = "" ;
      n502TBM33_COND_NM = false ;
      A414TBM33_EXPRESSION = "" ;
      n414TBM33_EXPRESSION = false ;
      A503TBM33_COND_DIV = "" ;
      n503TBM33_COND_DIV = false ;
      A504TBM33_CRF_ITEM_CD = "" ;
      n504TBM33_CRF_ITEM_CD = false ;
      A415TBM33_PRIOR_NO = (byte)(0) ;
      n415TBM33_PRIOR_NO = false ;
      A505TBM33_ERR_DIV = "" ;
      n505TBM33_ERR_DIV = false ;
      A506TBM33_ERR_MSG = "" ;
      n506TBM33_ERR_MSG = false ;
      A646TBM33_ENABLED_FLG = "" ;
      n646TBM33_ENABLED_FLG = false ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      n696TBM33_REQUIRED_INPUT_FLG = false ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      n697TBM33_NUMERIC_RANGE_FLG = false ;
      A416TBM33_DEL_FLG = "" ;
      n416TBM33_DEL_FLG = false ;
      A419TBM33_CRT_PROG_NM = "" ;
      n419TBM33_CRT_PROG_NM = false ;
      A422TBM33_UPD_PROG_NM = "" ;
      n422TBM33_UPD_PROG_NM = false ;
      O423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
      n423TBM33_UPD_CNT = false ;
   }

   public void initAll0L20( )
   {
      A76TBM33_STUDY_ID = 0 ;
      A77TBM33_CRF_ID = (short)(0) ;
      A78TBM33_COND_NO = (short)(0) ;
      initializeNonKey0L20( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow20( SdtTBM33_CRF_COND obj20 )
   {
      obj20.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( A417TBM33_CRT_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( A418TBM33_CRT_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( A420TBM33_UPD_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id( A421TBM33_UPD_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt( A423TBM33_UPD_CNT );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( A502TBM33_COND_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( A414TBM33_EXPRESSION );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( A503TBM33_COND_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( A504TBM33_CRF_ITEM_CD );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( A415TBM33_PRIOR_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( A505TBM33_ERR_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( A506TBM33_ERR_MSG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( A646TBM33_ENABLED_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( A696TBM33_REQUIRED_INPUT_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( A697TBM33_NUMERIC_RANGE_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( A416TBM33_DEL_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( A419TBM33_CRT_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( A422TBM33_UPD_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( A76TBM33_STUDY_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( A77TBM33_CRF_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( A78TBM33_COND_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z( Z76TBM33_STUDY_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z( Z77TBM33_CRF_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z( Z78TBM33_COND_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z( Z502TBM33_COND_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z( Z414TBM33_EXPRESSION );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z( Z503TBM33_COND_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z( Z504TBM33_CRF_ITEM_CD );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z( Z415TBM33_PRIOR_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z( Z505TBM33_ERR_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z( Z506TBM33_ERR_MSG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z( Z646TBM33_ENABLED_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z( Z696TBM33_REQUIRED_INPUT_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z( Z697TBM33_NUMERIC_RANGE_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z( Z416TBM33_DEL_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z( Z417TBM33_CRT_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z( Z418TBM33_CRT_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z( Z419TBM33_CRT_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z( Z420TBM33_UPD_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z( Z421TBM33_UPD_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z( Z422TBM33_UPD_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z( Z423TBM33_UPD_CNT );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N( (byte)((byte)((n502TBM33_COND_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N( (byte)((byte)((n414TBM33_EXPRESSION)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N( (byte)((byte)((n503TBM33_COND_DIV)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N( (byte)((byte)((n504TBM33_CRF_ITEM_CD)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N( (byte)((byte)((n415TBM33_PRIOR_NO)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N( (byte)((byte)((n505TBM33_ERR_DIV)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N( (byte)((byte)((n506TBM33_ERR_MSG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N( (byte)((byte)((n646TBM33_ENABLED_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N( (byte)((byte)((n696TBM33_REQUIRED_INPUT_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N( (byte)((byte)((n697TBM33_NUMERIC_RANGE_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N( (byte)((byte)((n416TBM33_DEL_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N( (byte)((byte)((n417TBM33_CRT_DATETIME)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N( (byte)((byte)((n418TBM33_CRT_USER_ID)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N( (byte)((byte)((n419TBM33_CRT_PROG_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N( (byte)((byte)((n420TBM33_UPD_DATETIME)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N( (byte)((byte)((n421TBM33_UPD_USER_ID)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N( (byte)((byte)((n422TBM33_UPD_PROG_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N( (byte)((byte)((n423TBM33_UPD_CNT)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
   }

   public void KeyVarsToRow20( SdtTBM33_CRF_COND obj20 )
   {
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( A76TBM33_STUDY_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( A77TBM33_CRF_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( A78TBM33_COND_NO );
   }

   public void RowToVars20( SdtTBM33_CRF_COND obj20 ,
                            int forceLoad )
   {
      Gx_mode = obj20.getgxTv_SdtTBM33_CRF_COND_Mode() ;
      A417TBM33_CRT_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime() ;
      n417TBM33_CRT_DATETIME = false ;
      A418TBM33_CRT_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id() ;
      n418TBM33_CRT_USER_ID = false ;
      A420TBM33_UPD_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime() ;
      n420TBM33_UPD_DATETIME = false ;
      A421TBM33_UPD_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id() ;
      n421TBM33_UPD_USER_ID = false ;
      A423TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt() ;
      n423TBM33_UPD_CNT = false ;
      A502TBM33_COND_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm() ;
      n502TBM33_COND_NM = false ;
      A414TBM33_EXPRESSION = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression() ;
      n414TBM33_EXPRESSION = false ;
      A503TBM33_COND_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div() ;
      n503TBM33_COND_DIV = false ;
      A504TBM33_CRF_ITEM_CD = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd() ;
      n504TBM33_CRF_ITEM_CD = false ;
      A415TBM33_PRIOR_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no() ;
      n415TBM33_PRIOR_NO = false ;
      A505TBM33_ERR_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div() ;
      n505TBM33_ERR_DIV = false ;
      A506TBM33_ERR_MSG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg() ;
      n506TBM33_ERR_MSG = false ;
      A646TBM33_ENABLED_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg() ;
      n646TBM33_ENABLED_FLG = false ;
      A696TBM33_REQUIRED_INPUT_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg() ;
      n696TBM33_REQUIRED_INPUT_FLG = false ;
      A697TBM33_NUMERIC_RANGE_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg() ;
      n697TBM33_NUMERIC_RANGE_FLG = false ;
      A416TBM33_DEL_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg() ;
      n416TBM33_DEL_FLG = false ;
      A419TBM33_CRT_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm() ;
      n419TBM33_CRT_PROG_NM = false ;
      A422TBM33_UPD_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm() ;
      n422TBM33_UPD_PROG_NM = false ;
      A76TBM33_STUDY_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id() ;
      A77TBM33_CRF_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id() ;
      A78TBM33_COND_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no() ;
      Z76TBM33_STUDY_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z() ;
      Z77TBM33_CRF_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z() ;
      Z78TBM33_COND_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z() ;
      Z502TBM33_COND_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z() ;
      Z414TBM33_EXPRESSION = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z() ;
      Z503TBM33_COND_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z() ;
      Z504TBM33_CRF_ITEM_CD = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z() ;
      Z415TBM33_PRIOR_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z() ;
      Z505TBM33_ERR_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z() ;
      Z506TBM33_ERR_MSG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z() ;
      Z646TBM33_ENABLED_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z() ;
      Z696TBM33_REQUIRED_INPUT_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z() ;
      Z697TBM33_NUMERIC_RANGE_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z() ;
      Z416TBM33_DEL_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z() ;
      Z417TBM33_CRT_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z() ;
      Z418TBM33_CRT_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z() ;
      Z419TBM33_CRT_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z() ;
      Z420TBM33_UPD_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z() ;
      Z421TBM33_UPD_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z() ;
      Z422TBM33_UPD_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z() ;
      Z423TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z() ;
      O423TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z() ;
      n502TBM33_COND_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N()==0)?false:true) ;
      n414TBM33_EXPRESSION = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N()==0)?false:true) ;
      n503TBM33_COND_DIV = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N()==0)?false:true) ;
      n504TBM33_CRF_ITEM_CD = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N()==0)?false:true) ;
      n415TBM33_PRIOR_NO = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N()==0)?false:true) ;
      n505TBM33_ERR_DIV = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N()==0)?false:true) ;
      n506TBM33_ERR_MSG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N()==0)?false:true) ;
      n646TBM33_ENABLED_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N()==0)?false:true) ;
      n696TBM33_REQUIRED_INPUT_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N()==0)?false:true) ;
      n697TBM33_NUMERIC_RANGE_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N()==0)?false:true) ;
      n416TBM33_DEL_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N()==0)?false:true) ;
      n417TBM33_CRT_DATETIME = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N()==0)?false:true) ;
      n418TBM33_CRT_USER_ID = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N()==0)?false:true) ;
      n419TBM33_CRT_PROG_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N()==0)?false:true) ;
      n420TBM33_UPD_DATETIME = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N()==0)?false:true) ;
      n421TBM33_UPD_USER_ID = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N()==0)?false:true) ;
      n422TBM33_UPD_PROG_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N()==0)?false:true) ;
      n423TBM33_UPD_CNT = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj20.getgxTv_SdtTBM33_CRF_COND_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A76TBM33_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A77TBM33_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A78TBM33_COND_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0L20( ) ;
      scanKeyStart0L20( ) ;
      if ( RcdFound20 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z76TBM33_STUDY_ID = A76TBM33_STUDY_ID ;
         Z77TBM33_CRF_ID = A77TBM33_CRF_ID ;
         Z78TBM33_COND_NO = A78TBM33_COND_NO ;
         O423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
         n423TBM33_UPD_CNT = false ;
      }
      zm0L20( -8) ;
      onLoadActions0L20( ) ;
      addRow0L20( ) ;
      scanKeyEnd0L20( ) ;
      if ( RcdFound20 == 0 )
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
      RowToVars20( bcTBM33_CRF_COND, 0) ;
      scanKeyStart0L20( ) ;
      if ( RcdFound20 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z76TBM33_STUDY_ID = A76TBM33_STUDY_ID ;
         Z77TBM33_CRF_ID = A77TBM33_CRF_ID ;
         Z78TBM33_COND_NO = A78TBM33_COND_NO ;
         O423TBM33_UPD_CNT = A423TBM33_UPD_CNT ;
         n423TBM33_UPD_CNT = false ;
      }
      zm0L20( -8) ;
      onLoadActions0L20( ) ;
      addRow0L20( ) ;
      scanKeyEnd0L20( ) ;
      if ( RcdFound20 == 0 )
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
      RowToVars20( bcTBM33_CRF_COND, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0L20( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0L20( ) ;
      }
      else
      {
         if ( RcdFound20 == 1 )
         {
            if ( ( A76TBM33_STUDY_ID != Z76TBM33_STUDY_ID ) || ( A77TBM33_CRF_ID != Z77TBM33_CRF_ID ) || ( A78TBM33_COND_NO != Z78TBM33_COND_NO ) )
            {
               A76TBM33_STUDY_ID = Z76TBM33_STUDY_ID ;
               A77TBM33_CRF_ID = Z77TBM33_CRF_ID ;
               A78TBM33_COND_NO = Z78TBM33_COND_NO ;
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
               update0L20( ) ;
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
               if ( ( A76TBM33_STUDY_ID != Z76TBM33_STUDY_ID ) || ( A77TBM33_CRF_ID != Z77TBM33_CRF_ID ) || ( A78TBM33_COND_NO != Z78TBM33_COND_NO ) )
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
                     insert0L20( ) ;
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
                     insert0L20( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow20( bcTBM33_CRF_COND) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars20( bcTBM33_CRF_COND, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0L20( ) ;
      if ( RcdFound20 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A76TBM33_STUDY_ID != Z76TBM33_STUDY_ID ) || ( A77TBM33_CRF_ID != Z77TBM33_CRF_ID ) || ( A78TBM33_COND_NO != Z78TBM33_COND_NO ) )
         {
            A76TBM33_STUDY_ID = Z76TBM33_STUDY_ID ;
            A77TBM33_CRF_ID = Z77TBM33_CRF_ID ;
            A78TBM33_COND_NO = Z78TBM33_COND_NO ;
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
         if ( ( A76TBM33_STUDY_ID != Z76TBM33_STUDY_ID ) || ( A77TBM33_CRF_ID != Z77TBM33_CRF_ID ) || ( A78TBM33_COND_NO != Z78TBM33_COND_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm33_crf_cond_bc");
      VarsToRow20( bcTBM33_CRF_COND) ;
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
      Gx_mode = bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM33_CRF_COND sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM33_CRF_COND )
      {
         bcTBM33_CRF_COND = sdt ;
         if ( GXutil.strcmp(bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode(), "") == 0 )
         {
            bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow20( bcTBM33_CRF_COND) ;
         }
         else
         {
            RowToVars20( bcTBM33_CRF_COND, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode(), "") == 0 )
         {
            bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars20( bcTBM33_CRF_COND, 1) ;
   }

   public SdtTBM33_CRF_COND getTBM33_CRF_COND_BC( )
   {
      return bcTBM33_CRF_COND ;
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
      AV7W_TXT = "" ;
      A502TBM33_COND_NM = "" ;
      A414TBM33_EXPRESSION = "" ;
      A503TBM33_COND_DIV = "" ;
      A504TBM33_CRF_ITEM_CD = "" ;
      A505TBM33_ERR_DIV = "" ;
      A506TBM33_ERR_MSG = "" ;
      A646TBM33_ENABLED_FLG = "" ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      A416TBM33_DEL_FLG = "" ;
      A417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A418TBM33_CRT_USER_ID = "" ;
      A419TBM33_CRT_PROG_NM = "" ;
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A421TBM33_UPD_USER_ID = "" ;
      A422TBM33_UPD_PROG_NM = "" ;
      Z417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z418TBM33_CRT_USER_ID = "" ;
      Z420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z421TBM33_UPD_USER_ID = "" ;
      Z502TBM33_COND_NM = "" ;
      Z414TBM33_EXPRESSION = "" ;
      Z503TBM33_COND_DIV = "" ;
      Z504TBM33_CRF_ITEM_CD = "" ;
      Z505TBM33_ERR_DIV = "" ;
      Z506TBM33_ERR_MSG = "" ;
      Z646TBM33_ENABLED_FLG = "" ;
      Z696TBM33_REQUIRED_INPUT_FLG = "" ;
      Z697TBM33_NUMERIC_RANGE_FLG = "" ;
      Z416TBM33_DEL_FLG = "" ;
      Z419TBM33_CRT_PROG_NM = "" ;
      Z422TBM33_UPD_PROG_NM = "" ;
      BC000L4_A76TBM33_STUDY_ID = new long[1] ;
      BC000L4_A77TBM33_CRF_ID = new short[1] ;
      BC000L4_A78TBM33_COND_NO = new short[1] ;
      BC000L4_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L4_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L4_A418TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L4_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L4_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L4_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L4_A421TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L4_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L4_A423TBM33_UPD_CNT = new long[1] ;
      BC000L4_n423TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L4_A502TBM33_COND_NM = new String[] {""} ;
      BC000L4_n502TBM33_COND_NM = new boolean[] {false} ;
      BC000L4_A414TBM33_EXPRESSION = new String[] {""} ;
      BC000L4_n414TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L4_A503TBM33_COND_DIV = new String[] {""} ;
      BC000L4_n503TBM33_COND_DIV = new boolean[] {false} ;
      BC000L4_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L4_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L4_A415TBM33_PRIOR_NO = new byte[1] ;
      BC000L4_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L4_A505TBM33_ERR_DIV = new String[] {""} ;
      BC000L4_n505TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L4_A506TBM33_ERR_MSG = new String[] {""} ;
      BC000L4_n506TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L4_A646TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L4_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L4_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L4_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L4_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L4_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L4_A416TBM33_DEL_FLG = new String[] {""} ;
      BC000L4_n416TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L4_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L4_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L4_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L4_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      BC000L5_A76TBM33_STUDY_ID = new long[1] ;
      BC000L5_A77TBM33_CRF_ID = new short[1] ;
      BC000L5_A78TBM33_COND_NO = new short[1] ;
      BC000L3_A76TBM33_STUDY_ID = new long[1] ;
      BC000L3_A77TBM33_CRF_ID = new short[1] ;
      BC000L3_A78TBM33_COND_NO = new short[1] ;
      BC000L3_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L3_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L3_A418TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L3_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L3_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L3_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L3_A421TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L3_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L3_A423TBM33_UPD_CNT = new long[1] ;
      BC000L3_n423TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L3_A502TBM33_COND_NM = new String[] {""} ;
      BC000L3_n502TBM33_COND_NM = new boolean[] {false} ;
      BC000L3_A414TBM33_EXPRESSION = new String[] {""} ;
      BC000L3_n414TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L3_A503TBM33_COND_DIV = new String[] {""} ;
      BC000L3_n503TBM33_COND_DIV = new boolean[] {false} ;
      BC000L3_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L3_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L3_A415TBM33_PRIOR_NO = new byte[1] ;
      BC000L3_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L3_A505TBM33_ERR_DIV = new String[] {""} ;
      BC000L3_n505TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L3_A506TBM33_ERR_MSG = new String[] {""} ;
      BC000L3_n506TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L3_A646TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L3_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L3_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L3_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L3_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L3_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L3_A416TBM33_DEL_FLG = new String[] {""} ;
      BC000L3_n416TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L3_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L3_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L3_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L3_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      sMode20 = "" ;
      BC000L2_A76TBM33_STUDY_ID = new long[1] ;
      BC000L2_A77TBM33_CRF_ID = new short[1] ;
      BC000L2_A78TBM33_COND_NO = new short[1] ;
      BC000L2_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L2_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L2_A418TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L2_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L2_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L2_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L2_A421TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L2_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L2_A423TBM33_UPD_CNT = new long[1] ;
      BC000L2_n423TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L2_A502TBM33_COND_NM = new String[] {""} ;
      BC000L2_n502TBM33_COND_NM = new boolean[] {false} ;
      BC000L2_A414TBM33_EXPRESSION = new String[] {""} ;
      BC000L2_n414TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L2_A503TBM33_COND_DIV = new String[] {""} ;
      BC000L2_n503TBM33_COND_DIV = new boolean[] {false} ;
      BC000L2_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L2_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L2_A415TBM33_PRIOR_NO = new byte[1] ;
      BC000L2_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L2_A505TBM33_ERR_DIV = new String[] {""} ;
      BC000L2_n505TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L2_A506TBM33_ERR_MSG = new String[] {""} ;
      BC000L2_n506TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L2_A646TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L2_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L2_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L2_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L2_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L2_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L2_A416TBM33_DEL_FLG = new String[] {""} ;
      BC000L2_n416TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L2_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L2_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L2_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L2_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      BC000L9_A76TBM33_STUDY_ID = new long[1] ;
      BC000L9_A77TBM33_CRF_ID = new short[1] ;
      BC000L9_A78TBM33_COND_NO = new short[1] ;
      BC000L9_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L9_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L9_A418TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L9_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L9_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L9_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L9_A421TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L9_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L9_A423TBM33_UPD_CNT = new long[1] ;
      BC000L9_n423TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L9_A502TBM33_COND_NM = new String[] {""} ;
      BC000L9_n502TBM33_COND_NM = new boolean[] {false} ;
      BC000L9_A414TBM33_EXPRESSION = new String[] {""} ;
      BC000L9_n414TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L9_A503TBM33_COND_DIV = new String[] {""} ;
      BC000L9_n503TBM33_COND_DIV = new boolean[] {false} ;
      BC000L9_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L9_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L9_A415TBM33_PRIOR_NO = new byte[1] ;
      BC000L9_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L9_A505TBM33_ERR_DIV = new String[] {""} ;
      BC000L9_n505TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L9_A506TBM33_ERR_MSG = new String[] {""} ;
      BC000L9_n506TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L9_A646TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L9_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L9_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L9_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L9_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L9_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L9_A416TBM33_DEL_FLG = new String[] {""} ;
      BC000L9_n416TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L9_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L9_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L9_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L9_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm33_crf_cond_bc__default(),
         new Object[] {
             new Object[] {
            BC000L2_A76TBM33_STUDY_ID, BC000L2_A77TBM33_CRF_ID, BC000L2_A78TBM33_COND_NO, BC000L2_A417TBM33_CRT_DATETIME, BC000L2_n417TBM33_CRT_DATETIME, BC000L2_A418TBM33_CRT_USER_ID, BC000L2_n418TBM33_CRT_USER_ID, BC000L2_A420TBM33_UPD_DATETIME, BC000L2_n420TBM33_UPD_DATETIME, BC000L2_A421TBM33_UPD_USER_ID,
            BC000L2_n421TBM33_UPD_USER_ID, BC000L2_A423TBM33_UPD_CNT, BC000L2_n423TBM33_UPD_CNT, BC000L2_A502TBM33_COND_NM, BC000L2_n502TBM33_COND_NM, BC000L2_A414TBM33_EXPRESSION, BC000L2_n414TBM33_EXPRESSION, BC000L2_A503TBM33_COND_DIV, BC000L2_n503TBM33_COND_DIV, BC000L2_A504TBM33_CRF_ITEM_CD,
            BC000L2_n504TBM33_CRF_ITEM_CD, BC000L2_A415TBM33_PRIOR_NO, BC000L2_n415TBM33_PRIOR_NO, BC000L2_A505TBM33_ERR_DIV, BC000L2_n505TBM33_ERR_DIV, BC000L2_A506TBM33_ERR_MSG, BC000L2_n506TBM33_ERR_MSG, BC000L2_A646TBM33_ENABLED_FLG, BC000L2_n646TBM33_ENABLED_FLG, BC000L2_A696TBM33_REQUIRED_INPUT_FLG,
            BC000L2_n696TBM33_REQUIRED_INPUT_FLG, BC000L2_A697TBM33_NUMERIC_RANGE_FLG, BC000L2_n697TBM33_NUMERIC_RANGE_FLG, BC000L2_A416TBM33_DEL_FLG, BC000L2_n416TBM33_DEL_FLG, BC000L2_A419TBM33_CRT_PROG_NM, BC000L2_n419TBM33_CRT_PROG_NM, BC000L2_A422TBM33_UPD_PROG_NM, BC000L2_n422TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L3_A76TBM33_STUDY_ID, BC000L3_A77TBM33_CRF_ID, BC000L3_A78TBM33_COND_NO, BC000L3_A417TBM33_CRT_DATETIME, BC000L3_n417TBM33_CRT_DATETIME, BC000L3_A418TBM33_CRT_USER_ID, BC000L3_n418TBM33_CRT_USER_ID, BC000L3_A420TBM33_UPD_DATETIME, BC000L3_n420TBM33_UPD_DATETIME, BC000L3_A421TBM33_UPD_USER_ID,
            BC000L3_n421TBM33_UPD_USER_ID, BC000L3_A423TBM33_UPD_CNT, BC000L3_n423TBM33_UPD_CNT, BC000L3_A502TBM33_COND_NM, BC000L3_n502TBM33_COND_NM, BC000L3_A414TBM33_EXPRESSION, BC000L3_n414TBM33_EXPRESSION, BC000L3_A503TBM33_COND_DIV, BC000L3_n503TBM33_COND_DIV, BC000L3_A504TBM33_CRF_ITEM_CD,
            BC000L3_n504TBM33_CRF_ITEM_CD, BC000L3_A415TBM33_PRIOR_NO, BC000L3_n415TBM33_PRIOR_NO, BC000L3_A505TBM33_ERR_DIV, BC000L3_n505TBM33_ERR_DIV, BC000L3_A506TBM33_ERR_MSG, BC000L3_n506TBM33_ERR_MSG, BC000L3_A646TBM33_ENABLED_FLG, BC000L3_n646TBM33_ENABLED_FLG, BC000L3_A696TBM33_REQUIRED_INPUT_FLG,
            BC000L3_n696TBM33_REQUIRED_INPUT_FLG, BC000L3_A697TBM33_NUMERIC_RANGE_FLG, BC000L3_n697TBM33_NUMERIC_RANGE_FLG, BC000L3_A416TBM33_DEL_FLG, BC000L3_n416TBM33_DEL_FLG, BC000L3_A419TBM33_CRT_PROG_NM, BC000L3_n419TBM33_CRT_PROG_NM, BC000L3_A422TBM33_UPD_PROG_NM, BC000L3_n422TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L4_A76TBM33_STUDY_ID, BC000L4_A77TBM33_CRF_ID, BC000L4_A78TBM33_COND_NO, BC000L4_A417TBM33_CRT_DATETIME, BC000L4_n417TBM33_CRT_DATETIME, BC000L4_A418TBM33_CRT_USER_ID, BC000L4_n418TBM33_CRT_USER_ID, BC000L4_A420TBM33_UPD_DATETIME, BC000L4_n420TBM33_UPD_DATETIME, BC000L4_A421TBM33_UPD_USER_ID,
            BC000L4_n421TBM33_UPD_USER_ID, BC000L4_A423TBM33_UPD_CNT, BC000L4_n423TBM33_UPD_CNT, BC000L4_A502TBM33_COND_NM, BC000L4_n502TBM33_COND_NM, BC000L4_A414TBM33_EXPRESSION, BC000L4_n414TBM33_EXPRESSION, BC000L4_A503TBM33_COND_DIV, BC000L4_n503TBM33_COND_DIV, BC000L4_A504TBM33_CRF_ITEM_CD,
            BC000L4_n504TBM33_CRF_ITEM_CD, BC000L4_A415TBM33_PRIOR_NO, BC000L4_n415TBM33_PRIOR_NO, BC000L4_A505TBM33_ERR_DIV, BC000L4_n505TBM33_ERR_DIV, BC000L4_A506TBM33_ERR_MSG, BC000L4_n506TBM33_ERR_MSG, BC000L4_A646TBM33_ENABLED_FLG, BC000L4_n646TBM33_ENABLED_FLG, BC000L4_A696TBM33_REQUIRED_INPUT_FLG,
            BC000L4_n696TBM33_REQUIRED_INPUT_FLG, BC000L4_A697TBM33_NUMERIC_RANGE_FLG, BC000L4_n697TBM33_NUMERIC_RANGE_FLG, BC000L4_A416TBM33_DEL_FLG, BC000L4_n416TBM33_DEL_FLG, BC000L4_A419TBM33_CRT_PROG_NM, BC000L4_n419TBM33_CRT_PROG_NM, BC000L4_A422TBM33_UPD_PROG_NM, BC000L4_n422TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L5_A76TBM33_STUDY_ID, BC000L5_A77TBM33_CRF_ID, BC000L5_A78TBM33_COND_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000L9_A76TBM33_STUDY_ID, BC000L9_A77TBM33_CRF_ID, BC000L9_A78TBM33_COND_NO, BC000L9_A417TBM33_CRT_DATETIME, BC000L9_n417TBM33_CRT_DATETIME, BC000L9_A418TBM33_CRT_USER_ID, BC000L9_n418TBM33_CRT_USER_ID, BC000L9_A420TBM33_UPD_DATETIME, BC000L9_n420TBM33_UPD_DATETIME, BC000L9_A421TBM33_UPD_USER_ID,
            BC000L9_n421TBM33_UPD_USER_ID, BC000L9_A423TBM33_UPD_CNT, BC000L9_n423TBM33_UPD_CNT, BC000L9_A502TBM33_COND_NM, BC000L9_n502TBM33_COND_NM, BC000L9_A414TBM33_EXPRESSION, BC000L9_n414TBM33_EXPRESSION, BC000L9_A503TBM33_COND_DIV, BC000L9_n503TBM33_COND_DIV, BC000L9_A504TBM33_CRF_ITEM_CD,
            BC000L9_n504TBM33_CRF_ITEM_CD, BC000L9_A415TBM33_PRIOR_NO, BC000L9_n415TBM33_PRIOR_NO, BC000L9_A505TBM33_ERR_DIV, BC000L9_n505TBM33_ERR_DIV, BC000L9_A506TBM33_ERR_MSG, BC000L9_n506TBM33_ERR_MSG, BC000L9_A646TBM33_ENABLED_FLG, BC000L9_n646TBM33_ENABLED_FLG, BC000L9_A696TBM33_REQUIRED_INPUT_FLG,
            BC000L9_n696TBM33_REQUIRED_INPUT_FLG, BC000L9_A697TBM33_NUMERIC_RANGE_FLG, BC000L9_n697TBM33_NUMERIC_RANGE_FLG, BC000L9_A416TBM33_DEL_FLG, BC000L9_n416TBM33_DEL_FLG, BC000L9_A419TBM33_CRT_PROG_NM, BC000L9_n419TBM33_CRT_PROG_NM, BC000L9_A422TBM33_UPD_PROG_NM, BC000L9_n422TBM33_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110L2 */
      e110L2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A415TBM33_PRIOR_NO ;
   private byte Z415TBM33_PRIOR_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z77TBM33_CRF_ID ;
   private short A77TBM33_CRF_ID ;
   private short Z78TBM33_COND_NO ;
   private short A78TBM33_COND_NO ;
   private short RcdFound20 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z76TBM33_STUDY_ID ;
   private long A76TBM33_STUDY_ID ;
   private long A423TBM33_UPD_CNT ;
   private long Z423TBM33_UPD_CNT ;
   private long O423TBM33_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode20 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private java.util.Date Z417TBM33_CRT_DATETIME ;
   private java.util.Date Z420TBM33_UPD_DATETIME ;
   private boolean n417TBM33_CRT_DATETIME ;
   private boolean n418TBM33_CRT_USER_ID ;
   private boolean n420TBM33_UPD_DATETIME ;
   private boolean n421TBM33_UPD_USER_ID ;
   private boolean n423TBM33_UPD_CNT ;
   private boolean n502TBM33_COND_NM ;
   private boolean n414TBM33_EXPRESSION ;
   private boolean n503TBM33_COND_DIV ;
   private boolean n504TBM33_CRF_ITEM_CD ;
   private boolean n415TBM33_PRIOR_NO ;
   private boolean n505TBM33_ERR_DIV ;
   private boolean n506TBM33_ERR_MSG ;
   private boolean n646TBM33_ENABLED_FLG ;
   private boolean n696TBM33_REQUIRED_INPUT_FLG ;
   private boolean n697TBM33_NUMERIC_RANGE_FLG ;
   private boolean n416TBM33_DEL_FLG ;
   private boolean n419TBM33_CRT_PROG_NM ;
   private boolean n422TBM33_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A502TBM33_COND_NM ;
   private String A414TBM33_EXPRESSION ;
   private String A503TBM33_COND_DIV ;
   private String A504TBM33_CRF_ITEM_CD ;
   private String A505TBM33_ERR_DIV ;
   private String A506TBM33_ERR_MSG ;
   private String A646TBM33_ENABLED_FLG ;
   private String A696TBM33_REQUIRED_INPUT_FLG ;
   private String A697TBM33_NUMERIC_RANGE_FLG ;
   private String A416TBM33_DEL_FLG ;
   private String A418TBM33_CRT_USER_ID ;
   private String A419TBM33_CRT_PROG_NM ;
   private String A421TBM33_UPD_USER_ID ;
   private String A422TBM33_UPD_PROG_NM ;
   private String Z418TBM33_CRT_USER_ID ;
   private String Z421TBM33_UPD_USER_ID ;
   private String Z502TBM33_COND_NM ;
   private String Z414TBM33_EXPRESSION ;
   private String Z503TBM33_COND_DIV ;
   private String Z504TBM33_CRF_ITEM_CD ;
   private String Z505TBM33_ERR_DIV ;
   private String Z506TBM33_ERR_MSG ;
   private String Z646TBM33_ENABLED_FLG ;
   private String Z696TBM33_REQUIRED_INPUT_FLG ;
   private String Z697TBM33_NUMERIC_RANGE_FLG ;
   private String Z416TBM33_DEL_FLG ;
   private String Z419TBM33_CRT_PROG_NM ;
   private String Z422TBM33_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM33_CRF_COND bcTBM33_CRF_COND ;
   private IDataStoreProvider pr_default ;
   private long[] BC000L4_A76TBM33_STUDY_ID ;
   private short[] BC000L4_A77TBM33_CRF_ID ;
   private short[] BC000L4_A78TBM33_COND_NO ;
   private java.util.Date[] BC000L4_A417TBM33_CRT_DATETIME ;
   private boolean[] BC000L4_n417TBM33_CRT_DATETIME ;
   private String[] BC000L4_A418TBM33_CRT_USER_ID ;
   private boolean[] BC000L4_n418TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L4_A420TBM33_UPD_DATETIME ;
   private boolean[] BC000L4_n420TBM33_UPD_DATETIME ;
   private String[] BC000L4_A421TBM33_UPD_USER_ID ;
   private boolean[] BC000L4_n421TBM33_UPD_USER_ID ;
   private long[] BC000L4_A423TBM33_UPD_CNT ;
   private boolean[] BC000L4_n423TBM33_UPD_CNT ;
   private String[] BC000L4_A502TBM33_COND_NM ;
   private boolean[] BC000L4_n502TBM33_COND_NM ;
   private String[] BC000L4_A414TBM33_EXPRESSION ;
   private boolean[] BC000L4_n414TBM33_EXPRESSION ;
   private String[] BC000L4_A503TBM33_COND_DIV ;
   private boolean[] BC000L4_n503TBM33_COND_DIV ;
   private String[] BC000L4_A504TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L4_n504TBM33_CRF_ITEM_CD ;
   private byte[] BC000L4_A415TBM33_PRIOR_NO ;
   private boolean[] BC000L4_n415TBM33_PRIOR_NO ;
   private String[] BC000L4_A505TBM33_ERR_DIV ;
   private boolean[] BC000L4_n505TBM33_ERR_DIV ;
   private String[] BC000L4_A506TBM33_ERR_MSG ;
   private boolean[] BC000L4_n506TBM33_ERR_MSG ;
   private String[] BC000L4_A646TBM33_ENABLED_FLG ;
   private boolean[] BC000L4_n646TBM33_ENABLED_FLG ;
   private String[] BC000L4_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L4_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L4_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L4_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L4_A416TBM33_DEL_FLG ;
   private boolean[] BC000L4_n416TBM33_DEL_FLG ;
   private String[] BC000L4_A419TBM33_CRT_PROG_NM ;
   private boolean[] BC000L4_n419TBM33_CRT_PROG_NM ;
   private String[] BC000L4_A422TBM33_UPD_PROG_NM ;
   private boolean[] BC000L4_n422TBM33_UPD_PROG_NM ;
   private long[] BC000L5_A76TBM33_STUDY_ID ;
   private short[] BC000L5_A77TBM33_CRF_ID ;
   private short[] BC000L5_A78TBM33_COND_NO ;
   private long[] BC000L3_A76TBM33_STUDY_ID ;
   private short[] BC000L3_A77TBM33_CRF_ID ;
   private short[] BC000L3_A78TBM33_COND_NO ;
   private java.util.Date[] BC000L3_A417TBM33_CRT_DATETIME ;
   private boolean[] BC000L3_n417TBM33_CRT_DATETIME ;
   private String[] BC000L3_A418TBM33_CRT_USER_ID ;
   private boolean[] BC000L3_n418TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L3_A420TBM33_UPD_DATETIME ;
   private boolean[] BC000L3_n420TBM33_UPD_DATETIME ;
   private String[] BC000L3_A421TBM33_UPD_USER_ID ;
   private boolean[] BC000L3_n421TBM33_UPD_USER_ID ;
   private long[] BC000L3_A423TBM33_UPD_CNT ;
   private boolean[] BC000L3_n423TBM33_UPD_CNT ;
   private String[] BC000L3_A502TBM33_COND_NM ;
   private boolean[] BC000L3_n502TBM33_COND_NM ;
   private String[] BC000L3_A414TBM33_EXPRESSION ;
   private boolean[] BC000L3_n414TBM33_EXPRESSION ;
   private String[] BC000L3_A503TBM33_COND_DIV ;
   private boolean[] BC000L3_n503TBM33_COND_DIV ;
   private String[] BC000L3_A504TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L3_n504TBM33_CRF_ITEM_CD ;
   private byte[] BC000L3_A415TBM33_PRIOR_NO ;
   private boolean[] BC000L3_n415TBM33_PRIOR_NO ;
   private String[] BC000L3_A505TBM33_ERR_DIV ;
   private boolean[] BC000L3_n505TBM33_ERR_DIV ;
   private String[] BC000L3_A506TBM33_ERR_MSG ;
   private boolean[] BC000L3_n506TBM33_ERR_MSG ;
   private String[] BC000L3_A646TBM33_ENABLED_FLG ;
   private boolean[] BC000L3_n646TBM33_ENABLED_FLG ;
   private String[] BC000L3_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L3_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L3_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L3_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L3_A416TBM33_DEL_FLG ;
   private boolean[] BC000L3_n416TBM33_DEL_FLG ;
   private String[] BC000L3_A419TBM33_CRT_PROG_NM ;
   private boolean[] BC000L3_n419TBM33_CRT_PROG_NM ;
   private String[] BC000L3_A422TBM33_UPD_PROG_NM ;
   private boolean[] BC000L3_n422TBM33_UPD_PROG_NM ;
   private long[] BC000L2_A76TBM33_STUDY_ID ;
   private short[] BC000L2_A77TBM33_CRF_ID ;
   private short[] BC000L2_A78TBM33_COND_NO ;
   private java.util.Date[] BC000L2_A417TBM33_CRT_DATETIME ;
   private boolean[] BC000L2_n417TBM33_CRT_DATETIME ;
   private String[] BC000L2_A418TBM33_CRT_USER_ID ;
   private boolean[] BC000L2_n418TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L2_A420TBM33_UPD_DATETIME ;
   private boolean[] BC000L2_n420TBM33_UPD_DATETIME ;
   private String[] BC000L2_A421TBM33_UPD_USER_ID ;
   private boolean[] BC000L2_n421TBM33_UPD_USER_ID ;
   private long[] BC000L2_A423TBM33_UPD_CNT ;
   private boolean[] BC000L2_n423TBM33_UPD_CNT ;
   private String[] BC000L2_A502TBM33_COND_NM ;
   private boolean[] BC000L2_n502TBM33_COND_NM ;
   private String[] BC000L2_A414TBM33_EXPRESSION ;
   private boolean[] BC000L2_n414TBM33_EXPRESSION ;
   private String[] BC000L2_A503TBM33_COND_DIV ;
   private boolean[] BC000L2_n503TBM33_COND_DIV ;
   private String[] BC000L2_A504TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L2_n504TBM33_CRF_ITEM_CD ;
   private byte[] BC000L2_A415TBM33_PRIOR_NO ;
   private boolean[] BC000L2_n415TBM33_PRIOR_NO ;
   private String[] BC000L2_A505TBM33_ERR_DIV ;
   private boolean[] BC000L2_n505TBM33_ERR_DIV ;
   private String[] BC000L2_A506TBM33_ERR_MSG ;
   private boolean[] BC000L2_n506TBM33_ERR_MSG ;
   private String[] BC000L2_A646TBM33_ENABLED_FLG ;
   private boolean[] BC000L2_n646TBM33_ENABLED_FLG ;
   private String[] BC000L2_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L2_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L2_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L2_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L2_A416TBM33_DEL_FLG ;
   private boolean[] BC000L2_n416TBM33_DEL_FLG ;
   private String[] BC000L2_A419TBM33_CRT_PROG_NM ;
   private boolean[] BC000L2_n419TBM33_CRT_PROG_NM ;
   private String[] BC000L2_A422TBM33_UPD_PROG_NM ;
   private boolean[] BC000L2_n422TBM33_UPD_PROG_NM ;
   private long[] BC000L9_A76TBM33_STUDY_ID ;
   private short[] BC000L9_A77TBM33_CRF_ID ;
   private short[] BC000L9_A78TBM33_COND_NO ;
   private java.util.Date[] BC000L9_A417TBM33_CRT_DATETIME ;
   private boolean[] BC000L9_n417TBM33_CRT_DATETIME ;
   private String[] BC000L9_A418TBM33_CRT_USER_ID ;
   private boolean[] BC000L9_n418TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L9_A420TBM33_UPD_DATETIME ;
   private boolean[] BC000L9_n420TBM33_UPD_DATETIME ;
   private String[] BC000L9_A421TBM33_UPD_USER_ID ;
   private boolean[] BC000L9_n421TBM33_UPD_USER_ID ;
   private long[] BC000L9_A423TBM33_UPD_CNT ;
   private boolean[] BC000L9_n423TBM33_UPD_CNT ;
   private String[] BC000L9_A502TBM33_COND_NM ;
   private boolean[] BC000L9_n502TBM33_COND_NM ;
   private String[] BC000L9_A414TBM33_EXPRESSION ;
   private boolean[] BC000L9_n414TBM33_EXPRESSION ;
   private String[] BC000L9_A503TBM33_COND_DIV ;
   private boolean[] BC000L9_n503TBM33_COND_DIV ;
   private String[] BC000L9_A504TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L9_n504TBM33_CRF_ITEM_CD ;
   private byte[] BC000L9_A415TBM33_PRIOR_NO ;
   private boolean[] BC000L9_n415TBM33_PRIOR_NO ;
   private String[] BC000L9_A505TBM33_ERR_DIV ;
   private boolean[] BC000L9_n505TBM33_ERR_DIV ;
   private String[] BC000L9_A506TBM33_ERR_MSG ;
   private boolean[] BC000L9_n506TBM33_ERR_MSG ;
   private String[] BC000L9_A646TBM33_ENABLED_FLG ;
   private boolean[] BC000L9_n646TBM33_ENABLED_FLG ;
   private String[] BC000L9_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L9_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L9_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L9_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L9_A416TBM33_DEL_FLG ;
   private boolean[] BC000L9_n416TBM33_DEL_FLG ;
   private String[] BC000L9_A419TBM33_CRT_PROG_NM ;
   private boolean[] BC000L9_n419TBM33_CRT_PROG_NM ;
   private String[] BC000L9_A422TBM33_UPD_PROG_NM ;
   private boolean[] BC000L9_n422TBM33_UPD_PROG_NM ;
}

final  class tbm33_crf_cond_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000L2", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000L3", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000L4", "SELECT TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO`, TM1.`TBM33_CRT_DATETIME`, TM1.`TBM33_CRT_USER_ID`, TM1.`TBM33_UPD_DATETIME`, TM1.`TBM33_UPD_USER_ID`, TM1.`TBM33_UPD_CNT`, TM1.`TBM33_COND_NM`, TM1.`TBM33_EXPRESSION`, TM1.`TBM33_COND_DIV`, TM1.`TBM33_CRF_ITEM_CD`, TM1.`TBM33_PRIOR_NO`, TM1.`TBM33_ERR_DIV`, TM1.`TBM33_ERR_MSG`, TM1.`TBM33_ENABLED_FLG`, TM1.`TBM33_REQUIRED_INPUT_FLG`, TM1.`TBM33_NUMERIC_RANGE_FLG`, TM1.`TBM33_DEL_FLG`, TM1.`TBM33_CRT_PROG_NM`, TM1.`TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` TM1 WHERE TM1.`TBM33_STUDY_ID` = ? and TM1.`TBM33_CRF_ID` = ? and TM1.`TBM33_COND_NO` = ? ORDER BY TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000L5", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000L6", "INSERT INTO `TBM33_CRF_COND`(`TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000L7", "UPDATE `TBM33_CRF_COND` SET `TBM33_CRT_DATETIME`=?, `TBM33_CRT_USER_ID`=?, `TBM33_UPD_DATETIME`=?, `TBM33_UPD_USER_ID`=?, `TBM33_UPD_CNT`=?, `TBM33_COND_NM`=?, `TBM33_EXPRESSION`=?, `TBM33_COND_DIV`=?, `TBM33_CRF_ITEM_CD`=?, `TBM33_PRIOR_NO`=?, `TBM33_ERR_DIV`=?, `TBM33_ERR_MSG`=?, `TBM33_ENABLED_FLG`=?, `TBM33_REQUIRED_INPUT_FLG`=?, `TBM33_NUMERIC_RANGE_FLG`=?, `TBM33_DEL_FLG`=?, `TBM33_CRT_PROG_NM`=?, `TBM33_UPD_PROG_NM`=?  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000L8", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000L9", "SELECT TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO`, TM1.`TBM33_CRT_DATETIME`, TM1.`TBM33_CRT_USER_ID`, TM1.`TBM33_UPD_DATETIME`, TM1.`TBM33_UPD_USER_ID`, TM1.`TBM33_UPD_CNT`, TM1.`TBM33_COND_NM`, TM1.`TBM33_EXPRESSION`, TM1.`TBM33_COND_DIV`, TM1.`TBM33_CRF_ITEM_CD`, TM1.`TBM33_PRIOR_NO`, TM1.`TBM33_ERR_DIV`, TM1.`TBM33_ERR_MSG`, TM1.`TBM33_ENABLED_FLG`, TM1.`TBM33_REQUIRED_INPUT_FLG`, TM1.`TBM33_NUMERIC_RANGE_FLG`, TM1.`TBM33_DEL_FLG`, TM1.`TBM33_CRT_PROG_NM`, TM1.`TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` TM1 WHERE TM1.`TBM33_STUDY_ID` = ? and TM1.`TBM33_CRF_ID` = ? and TM1.`TBM33_COND_NO` = ? ORDER BY TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1000);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 50);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 200);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1000);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 1);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setLong(19, ((Number) parms[36]).longValue());
               stmt.setShort(20, ((Number) parms[37]).shortValue());
               stmt.setShort(21, ((Number) parms[38]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

