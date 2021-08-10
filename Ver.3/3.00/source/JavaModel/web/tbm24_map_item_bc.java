/*
               File: tbm24_map_item_bc
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:31.81
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm24_map_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm24_map_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm24_map_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm24_map_item_bc.class ));
   }

   public tbm24_map_item_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0W31( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0W31( ) ;
      standaloneModal( ) ;
      addRow0W31( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120W2 */
         e120W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
            Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
            Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
            Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
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

   public void confirm_0W0( )
   {
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0W31( ) ;
         }
         else
         {
            checkExtendedTable0W31( ) ;
            if ( AnyError == 0 )
            {
               zm0W31( 9) ;
            }
            closeExtendedTableCursors0W31( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110W2( )
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

   public void e120W2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A65TBM24_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A66TBM24_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A702TBM24_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A705TBM24_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A67TBM24_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A635TBM24_IDENTIFICATION_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A637TBM24_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A639TBM24_TEXT + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A640TBM24_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A641TBM24_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A706TBM24_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A707TBM24_MIN_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A708TBM24_MAX_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A543TBM24_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A544TBM24_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A545TBM24_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A546TBM24_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A547TBM24_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A548TBM24_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A549TBM24_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A550TBM24_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0W31( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z545TBM24_CRT_DATETIME = A545TBM24_CRT_DATETIME ;
         Z546TBM24_CRT_USER_ID = A546TBM24_CRT_USER_ID ;
         Z548TBM24_UPD_DATETIME = A548TBM24_UPD_DATETIME ;
         Z549TBM24_UPD_USER_ID = A549TBM24_UPD_USER_ID ;
         Z551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         Z702TBM24_DOM_ITM_GRP_OID = A702TBM24_DOM_ITM_GRP_OID ;
         Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z704TBM24_DOM_ITM_GRP_ROWNO = A704TBM24_DOM_ITM_GRP_ROWNO ;
         Z705TBM24_CRF_ITEM_NM = A705TBM24_CRF_ITEM_NM ;
         Z635TBM24_IDENTIFICATION_CD = A635TBM24_IDENTIFICATION_CD ;
         Z636TBM24_TEXT_MAXLENGTH = A636TBM24_TEXT_MAXLENGTH ;
         Z637TBM24_TEXT_MAXROWS = A637TBM24_TEXT_MAXROWS ;
         Z638TBM24_DECIMAL_DIGITS = A638TBM24_DECIMAL_DIGITS ;
         Z639TBM24_TEXT = A639TBM24_TEXT ;
         Z640TBM24_FIXED_VALUE = A640TBM24_FIXED_VALUE ;
         Z641TBM24_CHK_FALSE_INNER_VALUE = A641TBM24_CHK_FALSE_INNER_VALUE ;
         Z706TBM24_REQUIRED_INPUT_FLG = A706TBM24_REQUIRED_INPUT_FLG ;
         Z707TBM24_MIN_VALUE = A707TBM24_MIN_VALUE ;
         Z708TBM24_MAX_VALUE = A708TBM24_MAX_VALUE ;
         Z543TBM24_ORDER = A543TBM24_ORDER ;
         Z544TBM24_DEL_FLG = A544TBM24_DEL_FLG ;
         Z547TBM24_CRT_PROG_NM = A547TBM24_CRT_PROG_NM ;
         Z550TBM24_UPD_PROG_NM = A550TBM24_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         Z545TBM24_CRT_DATETIME = A545TBM24_CRT_DATETIME ;
         Z546TBM24_CRT_USER_ID = A546TBM24_CRT_USER_ID ;
         Z548TBM24_UPD_DATETIME = A548TBM24_UPD_DATETIME ;
         Z549TBM24_UPD_USER_ID = A549TBM24_UPD_USER_ID ;
         Z551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         Z702TBM24_DOM_ITM_GRP_OID = A702TBM24_DOM_ITM_GRP_OID ;
         Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z704TBM24_DOM_ITM_GRP_ROWNO = A704TBM24_DOM_ITM_GRP_ROWNO ;
         Z705TBM24_CRF_ITEM_NM = A705TBM24_CRF_ITEM_NM ;
         Z635TBM24_IDENTIFICATION_CD = A635TBM24_IDENTIFICATION_CD ;
         Z636TBM24_TEXT_MAXLENGTH = A636TBM24_TEXT_MAXLENGTH ;
         Z637TBM24_TEXT_MAXROWS = A637TBM24_TEXT_MAXROWS ;
         Z638TBM24_DECIMAL_DIGITS = A638TBM24_DECIMAL_DIGITS ;
         Z639TBM24_TEXT = A639TBM24_TEXT ;
         Z640TBM24_FIXED_VALUE = A640TBM24_FIXED_VALUE ;
         Z641TBM24_CHK_FALSE_INNER_VALUE = A641TBM24_CHK_FALSE_INNER_VALUE ;
         Z706TBM24_REQUIRED_INPUT_FLG = A706TBM24_REQUIRED_INPUT_FLG ;
         Z707TBM24_MIN_VALUE = A707TBM24_MIN_VALUE ;
         Z708TBM24_MAX_VALUE = A708TBM24_MAX_VALUE ;
         Z543TBM24_ORDER = A543TBM24_ORDER ;
         Z544TBM24_DEL_FLG = A544TBM24_DEL_FLG ;
         Z547TBM24_CRT_PROG_NM = A547TBM24_CRT_PROG_NM ;
         Z550TBM24_UPD_PROG_NM = A550TBM24_UPD_PROG_NM ;
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0W31( )
   {
      /* Using cursor BC000W5 */
      pr_default.execute(3, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A545TBM24_CRT_DATETIME = BC000W5_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = BC000W5_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = BC000W5_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = BC000W5_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = BC000W5_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = BC000W5_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = BC000W5_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = BC000W5_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = BC000W5_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = BC000W5_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = BC000W5_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = BC000W5_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = BC000W5_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = BC000W5_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = BC000W5_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = BC000W5_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = BC000W5_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = BC000W5_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = BC000W5_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = BC000W5_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = BC000W5_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = BC000W5_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = BC000W5_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = BC000W5_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = BC000W5_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = BC000W5_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = BC000W5_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = BC000W5_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = BC000W5_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = BC000W5_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = BC000W5_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = BC000W5_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = BC000W5_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = BC000W5_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = BC000W5_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = BC000W5_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = BC000W5_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = BC000W5_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = BC000W5_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = BC000W5_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = BC000W5_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = BC000W5_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = BC000W5_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = BC000W5_n550TBM24_UPD_PROG_NM[0] ;
         zm0W31( -8) ;
      }
      pr_default.close(3);
      onLoadActions0W31( ) ;
   }

   public void onLoadActions0W31( )
   {
      AV9Pgmname = "TBM24_MAP_ITEM_BC" ;
   }

   public void checkExtendedTable0W31( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM24_MAP_ITEM_BC" ;
      /* Using cursor BC000W4 */
      pr_default.execute(2, new Object[] {new Long(A64TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A545TBM24_CRT_DATETIME) || (( A545TBM24_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A545TBM24_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A548TBM24_UPD_DATETIME) || (( A548TBM24_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A548TBM24_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0W31( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0W31( )
   {
      /* Using cursor BC000W6 */
      pr_default.execute(4, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000W3 */
      pr_default.execute(1, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0W31( 8) ;
         RcdFound31 = (short)(1) ;
         A65TBM24_DOM_CD = BC000W3_A65TBM24_DOM_CD[0] ;
         A66TBM24_DOM_VAR_NM = BC000W3_A66TBM24_DOM_VAR_NM[0] ;
         A67TBM24_CRF_ITEM_DIV = BC000W3_A67TBM24_CRF_ITEM_DIV[0] ;
         A545TBM24_CRT_DATETIME = BC000W3_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = BC000W3_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = BC000W3_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = BC000W3_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = BC000W3_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = BC000W3_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = BC000W3_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = BC000W3_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = BC000W3_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = BC000W3_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = BC000W3_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = BC000W3_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = BC000W3_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = BC000W3_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = BC000W3_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = BC000W3_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = BC000W3_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = BC000W3_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = BC000W3_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = BC000W3_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = BC000W3_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = BC000W3_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = BC000W3_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = BC000W3_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = BC000W3_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = BC000W3_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = BC000W3_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = BC000W3_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = BC000W3_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = BC000W3_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = BC000W3_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = BC000W3_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = BC000W3_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = BC000W3_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = BC000W3_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = BC000W3_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = BC000W3_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = BC000W3_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = BC000W3_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = BC000W3_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = BC000W3_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = BC000W3_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = BC000W3_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = BC000W3_n550TBM24_UPD_PROG_NM[0] ;
         A64TBM24_STUDY_ID = BC000W3_A64TBM24_STUDY_ID[0] ;
         O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         n551TBM24_UPD_CNT = false ;
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0W31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey0W31( ) ;
         }
         Gx_mode = sMode31 ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey0W31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0W31( ) ;
      if ( RcdFound31 == 0 )
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
      confirm_0W0( ) ;
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

   public void checkOptimisticConcurrency0W31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000W2 */
         pr_default.execute(0, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z545TBM24_CRT_DATETIME.equals( BC000W2_A545TBM24_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z546TBM24_CRT_USER_ID, BC000W2_A546TBM24_CRT_USER_ID[0]) != 0 ) || !( Z548TBM24_UPD_DATETIME.equals( BC000W2_A548TBM24_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z549TBM24_UPD_USER_ID, BC000W2_A549TBM24_UPD_USER_ID[0]) != 0 ) || ( Z551TBM24_UPD_CNT != BC000W2_A551TBM24_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z702TBM24_DOM_ITM_GRP_OID, BC000W2_A702TBM24_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z703TBM24_DOM_ITM_GRP_ATTR_SEQ != BC000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ) || ( Z704TBM24_DOM_ITM_GRP_ROWNO != BC000W2_A704TBM24_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z705TBM24_CRF_ITEM_NM, BC000W2_A705TBM24_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z635TBM24_IDENTIFICATION_CD, BC000W2_A635TBM24_IDENTIFICATION_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z636TBM24_TEXT_MAXLENGTH != BC000W2_A636TBM24_TEXT_MAXLENGTH[0] ) || ( Z637TBM24_TEXT_MAXROWS != BC000W2_A637TBM24_TEXT_MAXROWS[0] ) || ( Z638TBM24_DECIMAL_DIGITS != BC000W2_A638TBM24_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z639TBM24_TEXT, BC000W2_A639TBM24_TEXT[0]) != 0 ) || ( GXutil.strcmp(Z640TBM24_FIXED_VALUE, BC000W2_A640TBM24_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z641TBM24_CHK_FALSE_INNER_VALUE, BC000W2_A641TBM24_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z706TBM24_REQUIRED_INPUT_FLG, BC000W2_A706TBM24_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z707TBM24_MIN_VALUE, BC000W2_A707TBM24_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z708TBM24_MAX_VALUE, BC000W2_A708TBM24_MAX_VALUE[0]) != 0 ) || ( Z543TBM24_ORDER != BC000W2_A543TBM24_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z544TBM24_DEL_FLG, BC000W2_A544TBM24_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z547TBM24_CRT_PROG_NM, BC000W2_A547TBM24_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z550TBM24_UPD_PROG_NM, BC000W2_A550TBM24_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM24_MAP_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0W31( )
   {
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0W31( 0) ;
         checkOptimisticConcurrency0W31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0W31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000W7 */
                  pr_default.execute(5, new Object[] {A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV, new Boolean(n545TBM24_CRT_DATETIME), A545TBM24_CRT_DATETIME, new Boolean(n546TBM24_CRT_USER_ID), A546TBM24_CRT_USER_ID, new Boolean(n548TBM24_UPD_DATETIME), A548TBM24_UPD_DATETIME, new Boolean(n549TBM24_UPD_USER_ID), A549TBM24_UPD_USER_ID, new Boolean(n551TBM24_UPD_CNT), new Long(A551TBM24_UPD_CNT), new Boolean(n702TBM24_DOM_ITM_GRP_OID), A702TBM24_DOM_ITM_GRP_OID, new Boolean(n703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n704TBM24_DOM_ITM_GRP_ROWNO), new Short(A704TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n705TBM24_CRF_ITEM_NM), A705TBM24_CRF_ITEM_NM, new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD, new Boolean(n636TBM24_TEXT_MAXLENGTH), new Short(A636TBM24_TEXT_MAXLENGTH), new Boolean(n637TBM24_TEXT_MAXROWS), new Byte(A637TBM24_TEXT_MAXROWS), new Boolean(n638TBM24_DECIMAL_DIGITS), new Byte(A638TBM24_DECIMAL_DIGITS), new Boolean(n639TBM24_TEXT), A639TBM24_TEXT, new Boolean(n640TBM24_FIXED_VALUE), A640TBM24_FIXED_VALUE, new Boolean(n641TBM24_CHK_FALSE_INNER_VALUE), A641TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n706TBM24_REQUIRED_INPUT_FLG), A706TBM24_REQUIRED_INPUT_FLG, new Boolean(n707TBM24_MIN_VALUE), A707TBM24_MIN_VALUE, new Boolean(n708TBM24_MAX_VALUE), A708TBM24_MAX_VALUE, new Boolean(n543TBM24_ORDER), new Integer(A543TBM24_ORDER), new Boolean(n544TBM24_DEL_FLG), A544TBM24_DEL_FLG, new Boolean(n547TBM24_CRT_PROG_NM), A547TBM24_CRT_PROG_NM, new Boolean(n550TBM24_UPD_PROG_NM), A550TBM24_UPD_PROG_NM, new Long(A64TBM24_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
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
            load0W31( ) ;
         }
         endLevel0W31( ) ;
      }
      closeExtendedTableCursors0W31( ) ;
   }

   public void update0W31( )
   {
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0W31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000W8 */
                  pr_default.execute(6, new Object[] {new Boolean(n545TBM24_CRT_DATETIME), A545TBM24_CRT_DATETIME, new Boolean(n546TBM24_CRT_USER_ID), A546TBM24_CRT_USER_ID, new Boolean(n548TBM24_UPD_DATETIME), A548TBM24_UPD_DATETIME, new Boolean(n549TBM24_UPD_USER_ID), A549TBM24_UPD_USER_ID, new Boolean(n551TBM24_UPD_CNT), new Long(A551TBM24_UPD_CNT), new Boolean(n702TBM24_DOM_ITM_GRP_OID), A702TBM24_DOM_ITM_GRP_OID, new Boolean(n703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n704TBM24_DOM_ITM_GRP_ROWNO), new Short(A704TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n705TBM24_CRF_ITEM_NM), A705TBM24_CRF_ITEM_NM, new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD, new Boolean(n636TBM24_TEXT_MAXLENGTH), new Short(A636TBM24_TEXT_MAXLENGTH), new Boolean(n637TBM24_TEXT_MAXROWS), new Byte(A637TBM24_TEXT_MAXROWS), new Boolean(n638TBM24_DECIMAL_DIGITS), new Byte(A638TBM24_DECIMAL_DIGITS), new Boolean(n639TBM24_TEXT), A639TBM24_TEXT, new Boolean(n640TBM24_FIXED_VALUE), A640TBM24_FIXED_VALUE, new Boolean(n641TBM24_CHK_FALSE_INNER_VALUE), A641TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n706TBM24_REQUIRED_INPUT_FLG), A706TBM24_REQUIRED_INPUT_FLG, new Boolean(n707TBM24_MIN_VALUE), A707TBM24_MIN_VALUE, new Boolean(n708TBM24_MAX_VALUE), A708TBM24_MAX_VALUE, new Boolean(n543TBM24_ORDER), new Integer(A543TBM24_ORDER), new Boolean(n544TBM24_DEL_FLG), A544TBM24_DEL_FLG, new Boolean(n547TBM24_CRT_PROG_NM), A547TBM24_CRT_PROG_NM, new Boolean(n550TBM24_UPD_PROG_NM), A550TBM24_UPD_PROG_NM, new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0W31( ) ;
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
         endLevel0W31( ) ;
      }
      closeExtendedTableCursors0W31( ) ;
   }

   public void deferredUpdate0W31( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0W31( ) ;
         afterConfirm0W31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0W31( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000W9 */
               pr_default.execute(7, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0W31( ) ;
      Gx_mode = sMode31 ;
   }

   public void onDeleteControls0W31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM24_MAP_ITEM_BC" ;
      }
   }

   public void endLevel0W31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0W31( ) ;
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

   public void scanKeyStart0W31( )
   {
      /* Scan By routine */
      /* Using cursor BC000W10 */
      pr_default.execute(8, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A65TBM24_DOM_CD = BC000W10_A65TBM24_DOM_CD[0] ;
         A66TBM24_DOM_VAR_NM = BC000W10_A66TBM24_DOM_VAR_NM[0] ;
         A67TBM24_CRF_ITEM_DIV = BC000W10_A67TBM24_CRF_ITEM_DIV[0] ;
         A545TBM24_CRT_DATETIME = BC000W10_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = BC000W10_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = BC000W10_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = BC000W10_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = BC000W10_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = BC000W10_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = BC000W10_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = BC000W10_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = BC000W10_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = BC000W10_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = BC000W10_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = BC000W10_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = BC000W10_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = BC000W10_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = BC000W10_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = BC000W10_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = BC000W10_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = BC000W10_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = BC000W10_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = BC000W10_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = BC000W10_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = BC000W10_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = BC000W10_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = BC000W10_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = BC000W10_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = BC000W10_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = BC000W10_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = BC000W10_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = BC000W10_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = BC000W10_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = BC000W10_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = BC000W10_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = BC000W10_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = BC000W10_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = BC000W10_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = BC000W10_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = BC000W10_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = BC000W10_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = BC000W10_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = BC000W10_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = BC000W10_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = BC000W10_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = BC000W10_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = BC000W10_n550TBM24_UPD_PROG_NM[0] ;
         A64TBM24_STUDY_ID = BC000W10_A64TBM24_STUDY_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0W31( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound31 = (short)(0) ;
      scanKeyLoad0W31( ) ;
   }

   public void scanKeyLoad0W31( )
   {
      sMode31 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A65TBM24_DOM_CD = BC000W10_A65TBM24_DOM_CD[0] ;
         A66TBM24_DOM_VAR_NM = BC000W10_A66TBM24_DOM_VAR_NM[0] ;
         A67TBM24_CRF_ITEM_DIV = BC000W10_A67TBM24_CRF_ITEM_DIV[0] ;
         A545TBM24_CRT_DATETIME = BC000W10_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = BC000W10_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = BC000W10_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = BC000W10_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = BC000W10_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = BC000W10_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = BC000W10_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = BC000W10_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = BC000W10_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = BC000W10_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = BC000W10_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = BC000W10_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = BC000W10_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = BC000W10_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = BC000W10_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = BC000W10_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = BC000W10_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = BC000W10_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = BC000W10_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = BC000W10_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = BC000W10_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = BC000W10_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = BC000W10_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = BC000W10_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = BC000W10_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = BC000W10_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = BC000W10_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = BC000W10_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = BC000W10_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = BC000W10_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = BC000W10_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = BC000W10_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = BC000W10_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = BC000W10_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = BC000W10_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = BC000W10_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = BC000W10_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = BC000W10_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = BC000W10_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = BC000W10_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = BC000W10_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = BC000W10_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = BC000W10_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = BC000W10_n550TBM24_UPD_PROG_NM[0] ;
         A64TBM24_STUDY_ID = BC000W10_A64TBM24_STUDY_ID[0] ;
      }
      Gx_mode = sMode31 ;
   }

   public void scanKeyEnd0W31( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0W31( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0W31( )
   {
      /* Before Insert Rules */
      A545TBM24_CRT_DATETIME = GXutil.now( ) ;
      n545TBM24_CRT_DATETIME = false ;
      GXt_char1 = A546TBM24_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A546TBM24_CRT_USER_ID = GXt_char1 ;
      n546TBM24_CRT_USER_ID = false ;
      A548TBM24_UPD_DATETIME = GXutil.now( ) ;
      n548TBM24_UPD_DATETIME = false ;
      GXt_char1 = A549TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A549TBM24_UPD_USER_ID = GXt_char1 ;
      n549TBM24_UPD_USER_ID = false ;
      A551TBM24_UPD_CNT = (long)(O551TBM24_UPD_CNT+1) ;
      n551TBM24_UPD_CNT = false ;
   }

   public void beforeUpdate0W31( )
   {
      /* Before Update Rules */
      A548TBM24_UPD_DATETIME = GXutil.now( ) ;
      n548TBM24_UPD_DATETIME = false ;
      GXt_char1 = A549TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A549TBM24_UPD_USER_ID = GXt_char1 ;
      n549TBM24_UPD_USER_ID = false ;
      A551TBM24_UPD_CNT = (long)(O551TBM24_UPD_CNT+1) ;
      n551TBM24_UPD_CNT = false ;
   }

   public void beforeDelete0W31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0W31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0W31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0W31( )
   {
   }

   public void addRow0W31( )
   {
      VarsToRow31( bcTBM24_MAP_ITEM) ;
   }

   public void readRow0W31( )
   {
      RowToVars31( bcTBM24_MAP_ITEM, 1) ;
   }

   public void initializeNonKey0W31( )
   {
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n545TBM24_CRT_DATETIME = false ;
      A546TBM24_CRT_USER_ID = "" ;
      n546TBM24_CRT_USER_ID = false ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n548TBM24_UPD_DATETIME = false ;
      A549TBM24_UPD_USER_ID = "" ;
      n549TBM24_UPD_USER_ID = false ;
      A551TBM24_UPD_CNT = 0 ;
      n551TBM24_UPD_CNT = false ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      n702TBM24_DOM_ITM_GRP_OID = false ;
      A703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A704TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n704TBM24_DOM_ITM_GRP_ROWNO = false ;
      A705TBM24_CRF_ITEM_NM = "" ;
      n705TBM24_CRF_ITEM_NM = false ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      n635TBM24_IDENTIFICATION_CD = false ;
      A636TBM24_TEXT_MAXLENGTH = (short)(0) ;
      n636TBM24_TEXT_MAXLENGTH = false ;
      A637TBM24_TEXT_MAXROWS = (byte)(0) ;
      n637TBM24_TEXT_MAXROWS = false ;
      A638TBM24_DECIMAL_DIGITS = (byte)(0) ;
      n638TBM24_DECIMAL_DIGITS = false ;
      A639TBM24_TEXT = "" ;
      n639TBM24_TEXT = false ;
      A640TBM24_FIXED_VALUE = "" ;
      n640TBM24_FIXED_VALUE = false ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      n641TBM24_CHK_FALSE_INNER_VALUE = false ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      n706TBM24_REQUIRED_INPUT_FLG = false ;
      A707TBM24_MIN_VALUE = "" ;
      n707TBM24_MIN_VALUE = false ;
      A708TBM24_MAX_VALUE = "" ;
      n708TBM24_MAX_VALUE = false ;
      A543TBM24_ORDER = 0 ;
      n543TBM24_ORDER = false ;
      A544TBM24_DEL_FLG = "" ;
      n544TBM24_DEL_FLG = false ;
      A547TBM24_CRT_PROG_NM = "" ;
      n547TBM24_CRT_PROG_NM = false ;
      A550TBM24_UPD_PROG_NM = "" ;
      n550TBM24_UPD_PROG_NM = false ;
      O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
      n551TBM24_UPD_CNT = false ;
   }

   public void initAll0W31( )
   {
      A64TBM24_STUDY_ID = 0 ;
      A65TBM24_DOM_CD = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      initializeNonKey0W31( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow31( SdtTBM24_MAP_ITEM obj31 )
   {
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Mode( Gx_mode );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime( A545TBM24_CRT_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id( A546TBM24_CRT_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime( A548TBM24_UPD_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id( A549TBM24_UPD_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt( A551TBM24_UPD_CNT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid( A702TBM24_DOM_ITM_GRP_OID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq( A703TBM24_DOM_ITM_GRP_ATTR_SEQ );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno( A704TBM24_DOM_ITM_GRP_ROWNO );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm( A705TBM24_CRF_ITEM_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd( A635TBM24_IDENTIFICATION_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength( A636TBM24_TEXT_MAXLENGTH );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows( A637TBM24_TEXT_MAXROWS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits( A638TBM24_DECIMAL_DIGITS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text( A639TBM24_TEXT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value( A640TBM24_FIXED_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value( A641TBM24_CHK_FALSE_INNER_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg( A706TBM24_REQUIRED_INPUT_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value( A707TBM24_MIN_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value( A708TBM24_MAX_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order( A543TBM24_ORDER );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg( A544TBM24_DEL_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm( A547TBM24_CRT_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm( A550TBM24_UPD_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( A64TBM24_STUDY_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( A65TBM24_DOM_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( A66TBM24_DOM_VAR_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( A67TBM24_CRF_ITEM_DIV );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z( Z64TBM24_STUDY_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z( Z65TBM24_DOM_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z( Z66TBM24_DOM_VAR_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z( Z702TBM24_DOM_ITM_GRP_OID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z( Z703TBM24_DOM_ITM_GRP_ATTR_SEQ );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z( Z704TBM24_DOM_ITM_GRP_ROWNO );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z( Z705TBM24_CRF_ITEM_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z( Z67TBM24_CRF_ITEM_DIV );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z( Z635TBM24_IDENTIFICATION_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z( Z636TBM24_TEXT_MAXLENGTH );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z( Z637TBM24_TEXT_MAXROWS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z( Z638TBM24_DECIMAL_DIGITS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z( Z639TBM24_TEXT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z( Z640TBM24_FIXED_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z( Z641TBM24_CHK_FALSE_INNER_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z( Z706TBM24_REQUIRED_INPUT_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z( Z707TBM24_MIN_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z( Z708TBM24_MAX_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z( Z543TBM24_ORDER );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z( Z544TBM24_DEL_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z( Z545TBM24_CRT_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z( Z546TBM24_CRT_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z( Z547TBM24_CRT_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z( Z548TBM24_UPD_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z( Z549TBM24_UPD_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z( Z550TBM24_UPD_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z( Z551TBM24_UPD_CNT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N( (byte)((byte)((n702TBM24_DOM_ITM_GRP_OID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N( (byte)((byte)((n703TBM24_DOM_ITM_GRP_ATTR_SEQ)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N( (byte)((byte)((n704TBM24_DOM_ITM_GRP_ROWNO)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N( (byte)((byte)((n705TBM24_CRF_ITEM_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N( (byte)((byte)((n635TBM24_IDENTIFICATION_CD)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N( (byte)((byte)((n636TBM24_TEXT_MAXLENGTH)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N( (byte)((byte)((n637TBM24_TEXT_MAXROWS)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N( (byte)((byte)((n638TBM24_DECIMAL_DIGITS)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N( (byte)((byte)((n639TBM24_TEXT)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N( (byte)((byte)((n640TBM24_FIXED_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N( (byte)((byte)((n641TBM24_CHK_FALSE_INNER_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N( (byte)((byte)((n706TBM24_REQUIRED_INPUT_FLG)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N( (byte)((byte)((n707TBM24_MIN_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N( (byte)((byte)((n708TBM24_MAX_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N( (byte)((byte)((n543TBM24_ORDER)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N( (byte)((byte)((n544TBM24_DEL_FLG)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N( (byte)((byte)((n545TBM24_CRT_DATETIME)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N( (byte)((byte)((n546TBM24_CRT_USER_ID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N( (byte)((byte)((n547TBM24_CRT_PROG_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N( (byte)((byte)((n548TBM24_UPD_DATETIME)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N( (byte)((byte)((n549TBM24_UPD_USER_ID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N( (byte)((byte)((n550TBM24_UPD_PROG_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N( (byte)((byte)((n551TBM24_UPD_CNT)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Mode( Gx_mode );
   }

   public void KeyVarsToRow31( SdtTBM24_MAP_ITEM obj31 )
   {
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( A64TBM24_STUDY_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( A65TBM24_DOM_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( A66TBM24_DOM_VAR_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( A67TBM24_CRF_ITEM_DIV );
   }

   public void RowToVars31( SdtTBM24_MAP_ITEM obj31 ,
                            int forceLoad )
   {
      Gx_mode = obj31.getgxTv_SdtTBM24_MAP_ITEM_Mode() ;
      A545TBM24_CRT_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime() ;
      n545TBM24_CRT_DATETIME = false ;
      A546TBM24_CRT_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id() ;
      n546TBM24_CRT_USER_ID = false ;
      A548TBM24_UPD_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime() ;
      n548TBM24_UPD_DATETIME = false ;
      A549TBM24_UPD_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id() ;
      n549TBM24_UPD_USER_ID = false ;
      A551TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt() ;
      n551TBM24_UPD_CNT = false ;
      A702TBM24_DOM_ITM_GRP_OID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid() ;
      n702TBM24_DOM_ITM_GRP_OID = false ;
      A703TBM24_DOM_ITM_GRP_ATTR_SEQ = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq() ;
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A704TBM24_DOM_ITM_GRP_ROWNO = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno() ;
      n704TBM24_DOM_ITM_GRP_ROWNO = false ;
      A705TBM24_CRF_ITEM_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm() ;
      n705TBM24_CRF_ITEM_NM = false ;
      A635TBM24_IDENTIFICATION_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd() ;
      n635TBM24_IDENTIFICATION_CD = false ;
      A636TBM24_TEXT_MAXLENGTH = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength() ;
      n636TBM24_TEXT_MAXLENGTH = false ;
      A637TBM24_TEXT_MAXROWS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows() ;
      n637TBM24_TEXT_MAXROWS = false ;
      A638TBM24_DECIMAL_DIGITS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits() ;
      n638TBM24_DECIMAL_DIGITS = false ;
      A639TBM24_TEXT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text() ;
      n639TBM24_TEXT = false ;
      A640TBM24_FIXED_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value() ;
      n640TBM24_FIXED_VALUE = false ;
      A641TBM24_CHK_FALSE_INNER_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value() ;
      n641TBM24_CHK_FALSE_INNER_VALUE = false ;
      A706TBM24_REQUIRED_INPUT_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg() ;
      n706TBM24_REQUIRED_INPUT_FLG = false ;
      A707TBM24_MIN_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value() ;
      n707TBM24_MIN_VALUE = false ;
      A708TBM24_MAX_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value() ;
      n708TBM24_MAX_VALUE = false ;
      A543TBM24_ORDER = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order() ;
      n543TBM24_ORDER = false ;
      A544TBM24_DEL_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg() ;
      n544TBM24_DEL_FLG = false ;
      A547TBM24_CRT_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm() ;
      n547TBM24_CRT_PROG_NM = false ;
      A550TBM24_UPD_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm() ;
      n550TBM24_UPD_PROG_NM = false ;
      A64TBM24_STUDY_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id() ;
      A65TBM24_DOM_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd() ;
      A66TBM24_DOM_VAR_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm() ;
      A67TBM24_CRF_ITEM_DIV = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div() ;
      Z64TBM24_STUDY_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z() ;
      Z65TBM24_DOM_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z() ;
      Z66TBM24_DOM_VAR_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z() ;
      Z702TBM24_DOM_ITM_GRP_OID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z() ;
      Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z() ;
      Z704TBM24_DOM_ITM_GRP_ROWNO = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z() ;
      Z705TBM24_CRF_ITEM_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z() ;
      Z67TBM24_CRF_ITEM_DIV = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z() ;
      Z635TBM24_IDENTIFICATION_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z() ;
      Z636TBM24_TEXT_MAXLENGTH = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z() ;
      Z637TBM24_TEXT_MAXROWS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z() ;
      Z638TBM24_DECIMAL_DIGITS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z() ;
      Z639TBM24_TEXT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z() ;
      Z640TBM24_FIXED_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z() ;
      Z641TBM24_CHK_FALSE_INNER_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z() ;
      Z706TBM24_REQUIRED_INPUT_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z() ;
      Z707TBM24_MIN_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z() ;
      Z708TBM24_MAX_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z() ;
      Z543TBM24_ORDER = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z() ;
      Z544TBM24_DEL_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z() ;
      Z545TBM24_CRT_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z() ;
      Z546TBM24_CRT_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z() ;
      Z547TBM24_CRT_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z() ;
      Z548TBM24_UPD_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z() ;
      Z549TBM24_UPD_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z() ;
      Z550TBM24_UPD_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z() ;
      Z551TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z() ;
      O551TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z() ;
      n702TBM24_DOM_ITM_GRP_OID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N()==0)?false:true) ;
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N()==0)?false:true) ;
      n704TBM24_DOM_ITM_GRP_ROWNO = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N()==0)?false:true) ;
      n705TBM24_CRF_ITEM_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N()==0)?false:true) ;
      n635TBM24_IDENTIFICATION_CD = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N()==0)?false:true) ;
      n636TBM24_TEXT_MAXLENGTH = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N()==0)?false:true) ;
      n637TBM24_TEXT_MAXROWS = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N()==0)?false:true) ;
      n638TBM24_DECIMAL_DIGITS = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N()==0)?false:true) ;
      n639TBM24_TEXT = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N()==0)?false:true) ;
      n640TBM24_FIXED_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N()==0)?false:true) ;
      n641TBM24_CHK_FALSE_INNER_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N()==0)?false:true) ;
      n706TBM24_REQUIRED_INPUT_FLG = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N()==0)?false:true) ;
      n707TBM24_MIN_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N()==0)?false:true) ;
      n708TBM24_MAX_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N()==0)?false:true) ;
      n543TBM24_ORDER = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N()==0)?false:true) ;
      n544TBM24_DEL_FLG = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N()==0)?false:true) ;
      n545TBM24_CRT_DATETIME = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N()==0)?false:true) ;
      n546TBM24_CRT_USER_ID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N()==0)?false:true) ;
      n547TBM24_CRT_PROG_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N()==0)?false:true) ;
      n548TBM24_UPD_DATETIME = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N()==0)?false:true) ;
      n549TBM24_UPD_USER_ID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N()==0)?false:true) ;
      n550TBM24_UPD_PROG_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N()==0)?false:true) ;
      n551TBM24_UPD_CNT = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj31.getgxTv_SdtTBM24_MAP_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A64TBM24_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A65TBM24_DOM_CD = (String)getParm(obj,1) ;
      A66TBM24_DOM_VAR_NM = (String)getParm(obj,2) ;
      A67TBM24_CRF_ITEM_DIV = (String)getParm(obj,3) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0W31( ) ;
      scanKeyStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000W4 */
         pr_default.execute(2, new Object[] {new Long(A64TBM24_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         n551TBM24_UPD_CNT = false ;
      }
      zm0W31( -8) ;
      onLoadActions0W31( ) ;
      addRow0W31( ) ;
      scanKeyEnd0W31( ) ;
      if ( RcdFound31 == 0 )
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
      RowToVars31( bcTBM24_MAP_ITEM, 0) ;
      scanKeyStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000W4 */
         pr_default.execute(2, new Object[] {new Long(A64TBM24_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         n551TBM24_UPD_CNT = false ;
      }
      zm0W31( -8) ;
      onLoadActions0W31( ) ;
      addRow0W31( ) ;
      scanKeyEnd0W31( ) ;
      if ( RcdFound31 == 0 )
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
      RowToVars31( bcTBM24_MAP_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0W31( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0W31( ) ;
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
            {
               A64TBM24_STUDY_ID = Z64TBM24_STUDY_ID ;
               A65TBM24_DOM_CD = Z65TBM24_DOM_CD ;
               A66TBM24_DOM_VAR_NM = Z66TBM24_DOM_VAR_NM ;
               A67TBM24_CRF_ITEM_DIV = Z67TBM24_CRF_ITEM_DIV ;
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
               update0W31( ) ;
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
               if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
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
                     insert0W31( ) ;
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
                     insert0W31( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow31( bcTBM24_MAP_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars31( bcTBM24_MAP_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0W31( ) ;
      if ( RcdFound31 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
         {
            A64TBM24_STUDY_ID = Z64TBM24_STUDY_ID ;
            A65TBM24_DOM_CD = Z65TBM24_DOM_CD ;
            A66TBM24_DOM_VAR_NM = Z66TBM24_DOM_VAR_NM ;
            A67TBM24_CRF_ITEM_DIV = Z67TBM24_CRF_ITEM_DIV ;
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
         if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm24_map_item_bc");
      VarsToRow31( bcTBM24_MAP_ITEM) ;
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
      Gx_mode = bcTBM24_MAP_ITEM.getgxTv_SdtTBM24_MAP_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM24_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM24_MAP_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM24_MAP_ITEM )
      {
         bcTBM24_MAP_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM24_MAP_ITEM.getgxTv_SdtTBM24_MAP_ITEM_Mode(), "") == 0 )
         {
            bcTBM24_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow31( bcTBM24_MAP_ITEM) ;
         }
         else
         {
            RowToVars31( bcTBM24_MAP_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM24_MAP_ITEM.getgxTv_SdtTBM24_MAP_ITEM_Mode(), "") == 0 )
         {
            bcTBM24_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars31( bcTBM24_MAP_ITEM, 1) ;
   }

   public SdtTBM24_MAP_ITEM getTBM24_MAP_ITEM_BC( )
   {
      return bcTBM24_MAP_ITEM ;
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
      Z65TBM24_DOM_CD = "" ;
      A65TBM24_DOM_CD = "" ;
      Z66TBM24_DOM_VAR_NM = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      Z67TBM24_CRF_ITEM_DIV = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      A705TBM24_CRF_ITEM_NM = "" ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      A639TBM24_TEXT = "" ;
      A640TBM24_FIXED_VALUE = "" ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      A707TBM24_MIN_VALUE = "" ;
      A708TBM24_MAX_VALUE = "" ;
      A544TBM24_DEL_FLG = "" ;
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A546TBM24_CRT_USER_ID = "" ;
      A547TBM24_CRT_PROG_NM = "" ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A549TBM24_UPD_USER_ID = "" ;
      A550TBM24_UPD_PROG_NM = "" ;
      Z545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z546TBM24_CRT_USER_ID = "" ;
      Z548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z549TBM24_UPD_USER_ID = "" ;
      Z702TBM24_DOM_ITM_GRP_OID = "" ;
      Z705TBM24_CRF_ITEM_NM = "" ;
      Z635TBM24_IDENTIFICATION_CD = "" ;
      Z639TBM24_TEXT = "" ;
      Z640TBM24_FIXED_VALUE = "" ;
      Z641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      Z706TBM24_REQUIRED_INPUT_FLG = "" ;
      Z707TBM24_MIN_VALUE = "" ;
      Z708TBM24_MAX_VALUE = "" ;
      Z544TBM24_DEL_FLG = "" ;
      Z547TBM24_CRT_PROG_NM = "" ;
      Z550TBM24_UPD_PROG_NM = "" ;
      BC000W5_A65TBM24_DOM_CD = new String[] {""} ;
      BC000W5_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W5_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W5_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W5_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W5_A546TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W5_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W5_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W5_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W5_A549TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W5_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W5_A551TBM24_UPD_CNT = new long[1] ;
      BC000W5_n551TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W5_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W5_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W5_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W5_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W5_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W5_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W5_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W5_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W5_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W5_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W5_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W5_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W5_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W5_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W5_A639TBM24_TEXT = new String[] {""} ;
      BC000W5_n639TBM24_TEXT = new boolean[] {false} ;
      BC000W5_A640TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W5_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W5_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W5_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W5_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W5_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W5_A707TBM24_MIN_VALUE = new String[] {""} ;
      BC000W5_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W5_A708TBM24_MAX_VALUE = new String[] {""} ;
      BC000W5_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W5_A543TBM24_ORDER = new int[1] ;
      BC000W5_n543TBM24_ORDER = new boolean[] {false} ;
      BC000W5_A544TBM24_DEL_FLG = new String[] {""} ;
      BC000W5_n544TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W5_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W5_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W5_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W5_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W5_A64TBM24_STUDY_ID = new long[1] ;
      BC000W4_A64TBM24_STUDY_ID = new long[1] ;
      BC000W6_A64TBM24_STUDY_ID = new long[1] ;
      BC000W6_A65TBM24_DOM_CD = new String[] {""} ;
      BC000W6_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W6_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W3_A65TBM24_DOM_CD = new String[] {""} ;
      BC000W3_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W3_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W3_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W3_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W3_A546TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W3_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W3_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W3_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W3_A549TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W3_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W3_A551TBM24_UPD_CNT = new long[1] ;
      BC000W3_n551TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W3_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W3_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W3_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W3_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W3_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W3_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W3_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W3_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W3_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W3_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W3_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W3_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W3_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W3_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W3_A639TBM24_TEXT = new String[] {""} ;
      BC000W3_n639TBM24_TEXT = new boolean[] {false} ;
      BC000W3_A640TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W3_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W3_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W3_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W3_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W3_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W3_A707TBM24_MIN_VALUE = new String[] {""} ;
      BC000W3_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W3_A708TBM24_MAX_VALUE = new String[] {""} ;
      BC000W3_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W3_A543TBM24_ORDER = new int[1] ;
      BC000W3_n543TBM24_ORDER = new boolean[] {false} ;
      BC000W3_A544TBM24_DEL_FLG = new String[] {""} ;
      BC000W3_n544TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W3_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W3_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W3_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W3_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W3_A64TBM24_STUDY_ID = new long[1] ;
      sMode31 = "" ;
      BC000W2_A65TBM24_DOM_CD = new String[] {""} ;
      BC000W2_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W2_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W2_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W2_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W2_A546TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W2_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W2_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W2_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W2_A549TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W2_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W2_A551TBM24_UPD_CNT = new long[1] ;
      BC000W2_n551TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W2_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W2_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W2_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W2_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W2_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W2_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W2_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W2_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W2_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W2_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W2_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W2_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W2_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W2_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W2_A639TBM24_TEXT = new String[] {""} ;
      BC000W2_n639TBM24_TEXT = new boolean[] {false} ;
      BC000W2_A640TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W2_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W2_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W2_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W2_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W2_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W2_A707TBM24_MIN_VALUE = new String[] {""} ;
      BC000W2_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W2_A708TBM24_MAX_VALUE = new String[] {""} ;
      BC000W2_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W2_A543TBM24_ORDER = new int[1] ;
      BC000W2_n543TBM24_ORDER = new boolean[] {false} ;
      BC000W2_A544TBM24_DEL_FLG = new String[] {""} ;
      BC000W2_n544TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W2_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W2_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W2_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W2_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W2_A64TBM24_STUDY_ID = new long[1] ;
      BC000W10_A65TBM24_DOM_CD = new String[] {""} ;
      BC000W10_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W10_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W10_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W10_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W10_A546TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W10_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W10_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W10_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W10_A549TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W10_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W10_A551TBM24_UPD_CNT = new long[1] ;
      BC000W10_n551TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W10_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W10_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W10_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W10_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W10_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W10_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W10_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W10_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W10_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W10_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W10_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W10_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W10_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W10_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W10_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W10_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W10_A639TBM24_TEXT = new String[] {""} ;
      BC000W10_n639TBM24_TEXT = new boolean[] {false} ;
      BC000W10_A640TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W10_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W10_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W10_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W10_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W10_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W10_A707TBM24_MIN_VALUE = new String[] {""} ;
      BC000W10_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W10_A708TBM24_MAX_VALUE = new String[] {""} ;
      BC000W10_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W10_A543TBM24_ORDER = new int[1] ;
      BC000W10_n543TBM24_ORDER = new boolean[] {false} ;
      BC000W10_A544TBM24_DEL_FLG = new String[] {""} ;
      BC000W10_n544TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W10_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W10_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W10_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W10_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W10_A64TBM24_STUDY_ID = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm24_map_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000W2_A65TBM24_DOM_CD, BC000W2_A66TBM24_DOM_VAR_NM, BC000W2_A67TBM24_CRF_ITEM_DIV, BC000W2_A545TBM24_CRT_DATETIME, BC000W2_n545TBM24_CRT_DATETIME, BC000W2_A546TBM24_CRT_USER_ID, BC000W2_n546TBM24_CRT_USER_ID, BC000W2_A548TBM24_UPD_DATETIME, BC000W2_n548TBM24_UPD_DATETIME, BC000W2_A549TBM24_UPD_USER_ID,
            BC000W2_n549TBM24_UPD_USER_ID, BC000W2_A551TBM24_UPD_CNT, BC000W2_n551TBM24_UPD_CNT, BC000W2_A702TBM24_DOM_ITM_GRP_OID, BC000W2_n702TBM24_DOM_ITM_GRP_OID, BC000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W2_A704TBM24_DOM_ITM_GRP_ROWNO, BC000W2_n704TBM24_DOM_ITM_GRP_ROWNO, BC000W2_A705TBM24_CRF_ITEM_NM,
            BC000W2_n705TBM24_CRF_ITEM_NM, BC000W2_A635TBM24_IDENTIFICATION_CD, BC000W2_n635TBM24_IDENTIFICATION_CD, BC000W2_A636TBM24_TEXT_MAXLENGTH, BC000W2_n636TBM24_TEXT_MAXLENGTH, BC000W2_A637TBM24_TEXT_MAXROWS, BC000W2_n637TBM24_TEXT_MAXROWS, BC000W2_A638TBM24_DECIMAL_DIGITS, BC000W2_n638TBM24_DECIMAL_DIGITS, BC000W2_A639TBM24_TEXT,
            BC000W2_n639TBM24_TEXT, BC000W2_A640TBM24_FIXED_VALUE, BC000W2_n640TBM24_FIXED_VALUE, BC000W2_A641TBM24_CHK_FALSE_INNER_VALUE, BC000W2_n641TBM24_CHK_FALSE_INNER_VALUE, BC000W2_A706TBM24_REQUIRED_INPUT_FLG, BC000W2_n706TBM24_REQUIRED_INPUT_FLG, BC000W2_A707TBM24_MIN_VALUE, BC000W2_n707TBM24_MIN_VALUE, BC000W2_A708TBM24_MAX_VALUE,
            BC000W2_n708TBM24_MAX_VALUE, BC000W2_A543TBM24_ORDER, BC000W2_n543TBM24_ORDER, BC000W2_A544TBM24_DEL_FLG, BC000W2_n544TBM24_DEL_FLG, BC000W2_A547TBM24_CRT_PROG_NM, BC000W2_n547TBM24_CRT_PROG_NM, BC000W2_A550TBM24_UPD_PROG_NM, BC000W2_n550TBM24_UPD_PROG_NM, BC000W2_A64TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W3_A65TBM24_DOM_CD, BC000W3_A66TBM24_DOM_VAR_NM, BC000W3_A67TBM24_CRF_ITEM_DIV, BC000W3_A545TBM24_CRT_DATETIME, BC000W3_n545TBM24_CRT_DATETIME, BC000W3_A546TBM24_CRT_USER_ID, BC000W3_n546TBM24_CRT_USER_ID, BC000W3_A548TBM24_UPD_DATETIME, BC000W3_n548TBM24_UPD_DATETIME, BC000W3_A549TBM24_UPD_USER_ID,
            BC000W3_n549TBM24_UPD_USER_ID, BC000W3_A551TBM24_UPD_CNT, BC000W3_n551TBM24_UPD_CNT, BC000W3_A702TBM24_DOM_ITM_GRP_OID, BC000W3_n702TBM24_DOM_ITM_GRP_OID, BC000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W3_A704TBM24_DOM_ITM_GRP_ROWNO, BC000W3_n704TBM24_DOM_ITM_GRP_ROWNO, BC000W3_A705TBM24_CRF_ITEM_NM,
            BC000W3_n705TBM24_CRF_ITEM_NM, BC000W3_A635TBM24_IDENTIFICATION_CD, BC000W3_n635TBM24_IDENTIFICATION_CD, BC000W3_A636TBM24_TEXT_MAXLENGTH, BC000W3_n636TBM24_TEXT_MAXLENGTH, BC000W3_A637TBM24_TEXT_MAXROWS, BC000W3_n637TBM24_TEXT_MAXROWS, BC000W3_A638TBM24_DECIMAL_DIGITS, BC000W3_n638TBM24_DECIMAL_DIGITS, BC000W3_A639TBM24_TEXT,
            BC000W3_n639TBM24_TEXT, BC000W3_A640TBM24_FIXED_VALUE, BC000W3_n640TBM24_FIXED_VALUE, BC000W3_A641TBM24_CHK_FALSE_INNER_VALUE, BC000W3_n641TBM24_CHK_FALSE_INNER_VALUE, BC000W3_A706TBM24_REQUIRED_INPUT_FLG, BC000W3_n706TBM24_REQUIRED_INPUT_FLG, BC000W3_A707TBM24_MIN_VALUE, BC000W3_n707TBM24_MIN_VALUE, BC000W3_A708TBM24_MAX_VALUE,
            BC000W3_n708TBM24_MAX_VALUE, BC000W3_A543TBM24_ORDER, BC000W3_n543TBM24_ORDER, BC000W3_A544TBM24_DEL_FLG, BC000W3_n544TBM24_DEL_FLG, BC000W3_A547TBM24_CRT_PROG_NM, BC000W3_n547TBM24_CRT_PROG_NM, BC000W3_A550TBM24_UPD_PROG_NM, BC000W3_n550TBM24_UPD_PROG_NM, BC000W3_A64TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W4_A64TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W5_A65TBM24_DOM_CD, BC000W5_A66TBM24_DOM_VAR_NM, BC000W5_A67TBM24_CRF_ITEM_DIV, BC000W5_A545TBM24_CRT_DATETIME, BC000W5_n545TBM24_CRT_DATETIME, BC000W5_A546TBM24_CRT_USER_ID, BC000W5_n546TBM24_CRT_USER_ID, BC000W5_A548TBM24_UPD_DATETIME, BC000W5_n548TBM24_UPD_DATETIME, BC000W5_A549TBM24_UPD_USER_ID,
            BC000W5_n549TBM24_UPD_USER_ID, BC000W5_A551TBM24_UPD_CNT, BC000W5_n551TBM24_UPD_CNT, BC000W5_A702TBM24_DOM_ITM_GRP_OID, BC000W5_n702TBM24_DOM_ITM_GRP_OID, BC000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W5_A704TBM24_DOM_ITM_GRP_ROWNO, BC000W5_n704TBM24_DOM_ITM_GRP_ROWNO, BC000W5_A705TBM24_CRF_ITEM_NM,
            BC000W5_n705TBM24_CRF_ITEM_NM, BC000W5_A635TBM24_IDENTIFICATION_CD, BC000W5_n635TBM24_IDENTIFICATION_CD, BC000W5_A636TBM24_TEXT_MAXLENGTH, BC000W5_n636TBM24_TEXT_MAXLENGTH, BC000W5_A637TBM24_TEXT_MAXROWS, BC000W5_n637TBM24_TEXT_MAXROWS, BC000W5_A638TBM24_DECIMAL_DIGITS, BC000W5_n638TBM24_DECIMAL_DIGITS, BC000W5_A639TBM24_TEXT,
            BC000W5_n639TBM24_TEXT, BC000W5_A640TBM24_FIXED_VALUE, BC000W5_n640TBM24_FIXED_VALUE, BC000W5_A641TBM24_CHK_FALSE_INNER_VALUE, BC000W5_n641TBM24_CHK_FALSE_INNER_VALUE, BC000W5_A706TBM24_REQUIRED_INPUT_FLG, BC000W5_n706TBM24_REQUIRED_INPUT_FLG, BC000W5_A707TBM24_MIN_VALUE, BC000W5_n707TBM24_MIN_VALUE, BC000W5_A708TBM24_MAX_VALUE,
            BC000W5_n708TBM24_MAX_VALUE, BC000W5_A543TBM24_ORDER, BC000W5_n543TBM24_ORDER, BC000W5_A544TBM24_DEL_FLG, BC000W5_n544TBM24_DEL_FLG, BC000W5_A547TBM24_CRT_PROG_NM, BC000W5_n547TBM24_CRT_PROG_NM, BC000W5_A550TBM24_UPD_PROG_NM, BC000W5_n550TBM24_UPD_PROG_NM, BC000W5_A64TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W6_A64TBM24_STUDY_ID, BC000W6_A65TBM24_DOM_CD, BC000W6_A66TBM24_DOM_VAR_NM, BC000W6_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000W10_A65TBM24_DOM_CD, BC000W10_A66TBM24_DOM_VAR_NM, BC000W10_A67TBM24_CRF_ITEM_DIV, BC000W10_A545TBM24_CRT_DATETIME, BC000W10_n545TBM24_CRT_DATETIME, BC000W10_A546TBM24_CRT_USER_ID, BC000W10_n546TBM24_CRT_USER_ID, BC000W10_A548TBM24_UPD_DATETIME, BC000W10_n548TBM24_UPD_DATETIME, BC000W10_A549TBM24_UPD_USER_ID,
            BC000W10_n549TBM24_UPD_USER_ID, BC000W10_A551TBM24_UPD_CNT, BC000W10_n551TBM24_UPD_CNT, BC000W10_A702TBM24_DOM_ITM_GRP_OID, BC000W10_n702TBM24_DOM_ITM_GRP_OID, BC000W10_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W10_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W10_A704TBM24_DOM_ITM_GRP_ROWNO, BC000W10_n704TBM24_DOM_ITM_GRP_ROWNO, BC000W10_A705TBM24_CRF_ITEM_NM,
            BC000W10_n705TBM24_CRF_ITEM_NM, BC000W10_A635TBM24_IDENTIFICATION_CD, BC000W10_n635TBM24_IDENTIFICATION_CD, BC000W10_A636TBM24_TEXT_MAXLENGTH, BC000W10_n636TBM24_TEXT_MAXLENGTH, BC000W10_A637TBM24_TEXT_MAXROWS, BC000W10_n637TBM24_TEXT_MAXROWS, BC000W10_A638TBM24_DECIMAL_DIGITS, BC000W10_n638TBM24_DECIMAL_DIGITS, BC000W10_A639TBM24_TEXT,
            BC000W10_n639TBM24_TEXT, BC000W10_A640TBM24_FIXED_VALUE, BC000W10_n640TBM24_FIXED_VALUE, BC000W10_A641TBM24_CHK_FALSE_INNER_VALUE, BC000W10_n641TBM24_CHK_FALSE_INNER_VALUE, BC000W10_A706TBM24_REQUIRED_INPUT_FLG, BC000W10_n706TBM24_REQUIRED_INPUT_FLG, BC000W10_A707TBM24_MIN_VALUE, BC000W10_n707TBM24_MIN_VALUE, BC000W10_A708TBM24_MAX_VALUE,
            BC000W10_n708TBM24_MAX_VALUE, BC000W10_A543TBM24_ORDER, BC000W10_n543TBM24_ORDER, BC000W10_A544TBM24_DEL_FLG, BC000W10_n544TBM24_DEL_FLG, BC000W10_A547TBM24_CRT_PROG_NM, BC000W10_n547TBM24_CRT_PROG_NM, BC000W10_A550TBM24_UPD_PROG_NM, BC000W10_n550TBM24_UPD_PROG_NM, BC000W10_A64TBM24_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM24_MAP_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110W2 */
      e110W2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A637TBM24_TEXT_MAXROWS ;
   private byte A638TBM24_DECIMAL_DIGITS ;
   private byte Z637TBM24_TEXT_MAXROWS ;
   private byte Z638TBM24_DECIMAL_DIGITS ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A704TBM24_DOM_ITM_GRP_ROWNO ;
   private short A636TBM24_TEXT_MAXLENGTH ;
   private short Z703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z704TBM24_DOM_ITM_GRP_ROWNO ;
   private short Z636TBM24_TEXT_MAXLENGTH ;
   private short RcdFound31 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A543TBM24_ORDER ;
   private int GX_JID ;
   private int Z543TBM24_ORDER ;
   private int GXActiveErrHndl ;
   private long Z64TBM24_STUDY_ID ;
   private long A64TBM24_STUDY_ID ;
   private long A551TBM24_UPD_CNT ;
   private long Z551TBM24_UPD_CNT ;
   private long O551TBM24_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode31 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A545TBM24_CRT_DATETIME ;
   private java.util.Date A548TBM24_UPD_DATETIME ;
   private java.util.Date Z545TBM24_CRT_DATETIME ;
   private java.util.Date Z548TBM24_UPD_DATETIME ;
   private boolean n545TBM24_CRT_DATETIME ;
   private boolean n546TBM24_CRT_USER_ID ;
   private boolean n548TBM24_UPD_DATETIME ;
   private boolean n549TBM24_UPD_USER_ID ;
   private boolean n551TBM24_UPD_CNT ;
   private boolean n702TBM24_DOM_ITM_GRP_OID ;
   private boolean n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n705TBM24_CRF_ITEM_NM ;
   private boolean n635TBM24_IDENTIFICATION_CD ;
   private boolean n636TBM24_TEXT_MAXLENGTH ;
   private boolean n637TBM24_TEXT_MAXROWS ;
   private boolean n638TBM24_DECIMAL_DIGITS ;
   private boolean n639TBM24_TEXT ;
   private boolean n640TBM24_FIXED_VALUE ;
   private boolean n641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n706TBM24_REQUIRED_INPUT_FLG ;
   private boolean n707TBM24_MIN_VALUE ;
   private boolean n708TBM24_MAX_VALUE ;
   private boolean n543TBM24_ORDER ;
   private boolean n544TBM24_DEL_FLG ;
   private boolean n547TBM24_CRT_PROG_NM ;
   private boolean n550TBM24_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z65TBM24_DOM_CD ;
   private String A65TBM24_DOM_CD ;
   private String Z66TBM24_DOM_VAR_NM ;
   private String A66TBM24_DOM_VAR_NM ;
   private String Z67TBM24_CRF_ITEM_DIV ;
   private String A67TBM24_CRF_ITEM_DIV ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A702TBM24_DOM_ITM_GRP_OID ;
   private String A705TBM24_CRF_ITEM_NM ;
   private String A635TBM24_IDENTIFICATION_CD ;
   private String A639TBM24_TEXT ;
   private String A640TBM24_FIXED_VALUE ;
   private String A641TBM24_CHK_FALSE_INNER_VALUE ;
   private String A706TBM24_REQUIRED_INPUT_FLG ;
   private String A707TBM24_MIN_VALUE ;
   private String A708TBM24_MAX_VALUE ;
   private String A544TBM24_DEL_FLG ;
   private String A546TBM24_CRT_USER_ID ;
   private String A547TBM24_CRT_PROG_NM ;
   private String A549TBM24_UPD_USER_ID ;
   private String A550TBM24_UPD_PROG_NM ;
   private String Z546TBM24_CRT_USER_ID ;
   private String Z549TBM24_UPD_USER_ID ;
   private String Z702TBM24_DOM_ITM_GRP_OID ;
   private String Z705TBM24_CRF_ITEM_NM ;
   private String Z635TBM24_IDENTIFICATION_CD ;
   private String Z639TBM24_TEXT ;
   private String Z640TBM24_FIXED_VALUE ;
   private String Z641TBM24_CHK_FALSE_INNER_VALUE ;
   private String Z706TBM24_REQUIRED_INPUT_FLG ;
   private String Z707TBM24_MIN_VALUE ;
   private String Z708TBM24_MAX_VALUE ;
   private String Z544TBM24_DEL_FLG ;
   private String Z547TBM24_CRT_PROG_NM ;
   private String Z550TBM24_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM24_MAP_ITEM bcTBM24_MAP_ITEM ;
   private IDataStoreProvider pr_default ;
   private String[] BC000W5_A65TBM24_DOM_CD ;
   private String[] BC000W5_A66TBM24_DOM_VAR_NM ;
   private String[] BC000W5_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W5_A545TBM24_CRT_DATETIME ;
   private boolean[] BC000W5_n545TBM24_CRT_DATETIME ;
   private String[] BC000W5_A546TBM24_CRT_USER_ID ;
   private boolean[] BC000W5_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W5_A548TBM24_UPD_DATETIME ;
   private boolean[] BC000W5_n548TBM24_UPD_DATETIME ;
   private String[] BC000W5_A549TBM24_UPD_USER_ID ;
   private boolean[] BC000W5_n549TBM24_UPD_USER_ID ;
   private long[] BC000W5_A551TBM24_UPD_CNT ;
   private boolean[] BC000W5_n551TBM24_UPD_CNT ;
   private String[] BC000W5_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W5_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W5_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W5_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W5_A705TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W5_n705TBM24_CRF_ITEM_NM ;
   private String[] BC000W5_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W5_n635TBM24_IDENTIFICATION_CD ;
   private short[] BC000W5_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W5_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W5_A637TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W5_n637TBM24_TEXT_MAXROWS ;
   private byte[] BC000W5_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W5_n638TBM24_DECIMAL_DIGITS ;
   private String[] BC000W5_A639TBM24_TEXT ;
   private boolean[] BC000W5_n639TBM24_TEXT ;
   private String[] BC000W5_A640TBM24_FIXED_VALUE ;
   private boolean[] BC000W5_n640TBM24_FIXED_VALUE ;
   private String[] BC000W5_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W5_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W5_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W5_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W5_A707TBM24_MIN_VALUE ;
   private boolean[] BC000W5_n707TBM24_MIN_VALUE ;
   private String[] BC000W5_A708TBM24_MAX_VALUE ;
   private boolean[] BC000W5_n708TBM24_MAX_VALUE ;
   private int[] BC000W5_A543TBM24_ORDER ;
   private boolean[] BC000W5_n543TBM24_ORDER ;
   private String[] BC000W5_A544TBM24_DEL_FLG ;
   private boolean[] BC000W5_n544TBM24_DEL_FLG ;
   private String[] BC000W5_A547TBM24_CRT_PROG_NM ;
   private boolean[] BC000W5_n547TBM24_CRT_PROG_NM ;
   private String[] BC000W5_A550TBM24_UPD_PROG_NM ;
   private boolean[] BC000W5_n550TBM24_UPD_PROG_NM ;
   private long[] BC000W5_A64TBM24_STUDY_ID ;
   private long[] BC000W4_A64TBM24_STUDY_ID ;
   private long[] BC000W6_A64TBM24_STUDY_ID ;
   private String[] BC000W6_A65TBM24_DOM_CD ;
   private String[] BC000W6_A66TBM24_DOM_VAR_NM ;
   private String[] BC000W6_A67TBM24_CRF_ITEM_DIV ;
   private String[] BC000W3_A65TBM24_DOM_CD ;
   private String[] BC000W3_A66TBM24_DOM_VAR_NM ;
   private String[] BC000W3_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W3_A545TBM24_CRT_DATETIME ;
   private boolean[] BC000W3_n545TBM24_CRT_DATETIME ;
   private String[] BC000W3_A546TBM24_CRT_USER_ID ;
   private boolean[] BC000W3_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W3_A548TBM24_UPD_DATETIME ;
   private boolean[] BC000W3_n548TBM24_UPD_DATETIME ;
   private String[] BC000W3_A549TBM24_UPD_USER_ID ;
   private boolean[] BC000W3_n549TBM24_UPD_USER_ID ;
   private long[] BC000W3_A551TBM24_UPD_CNT ;
   private boolean[] BC000W3_n551TBM24_UPD_CNT ;
   private String[] BC000W3_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W3_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W3_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W3_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W3_A705TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W3_n705TBM24_CRF_ITEM_NM ;
   private String[] BC000W3_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W3_n635TBM24_IDENTIFICATION_CD ;
   private short[] BC000W3_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W3_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W3_A637TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W3_n637TBM24_TEXT_MAXROWS ;
   private byte[] BC000W3_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W3_n638TBM24_DECIMAL_DIGITS ;
   private String[] BC000W3_A639TBM24_TEXT ;
   private boolean[] BC000W3_n639TBM24_TEXT ;
   private String[] BC000W3_A640TBM24_FIXED_VALUE ;
   private boolean[] BC000W3_n640TBM24_FIXED_VALUE ;
   private String[] BC000W3_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W3_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W3_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W3_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W3_A707TBM24_MIN_VALUE ;
   private boolean[] BC000W3_n707TBM24_MIN_VALUE ;
   private String[] BC000W3_A708TBM24_MAX_VALUE ;
   private boolean[] BC000W3_n708TBM24_MAX_VALUE ;
   private int[] BC000W3_A543TBM24_ORDER ;
   private boolean[] BC000W3_n543TBM24_ORDER ;
   private String[] BC000W3_A544TBM24_DEL_FLG ;
   private boolean[] BC000W3_n544TBM24_DEL_FLG ;
   private String[] BC000W3_A547TBM24_CRT_PROG_NM ;
   private boolean[] BC000W3_n547TBM24_CRT_PROG_NM ;
   private String[] BC000W3_A550TBM24_UPD_PROG_NM ;
   private boolean[] BC000W3_n550TBM24_UPD_PROG_NM ;
   private long[] BC000W3_A64TBM24_STUDY_ID ;
   private String[] BC000W2_A65TBM24_DOM_CD ;
   private String[] BC000W2_A66TBM24_DOM_VAR_NM ;
   private String[] BC000W2_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W2_A545TBM24_CRT_DATETIME ;
   private boolean[] BC000W2_n545TBM24_CRT_DATETIME ;
   private String[] BC000W2_A546TBM24_CRT_USER_ID ;
   private boolean[] BC000W2_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W2_A548TBM24_UPD_DATETIME ;
   private boolean[] BC000W2_n548TBM24_UPD_DATETIME ;
   private String[] BC000W2_A549TBM24_UPD_USER_ID ;
   private boolean[] BC000W2_n549TBM24_UPD_USER_ID ;
   private long[] BC000W2_A551TBM24_UPD_CNT ;
   private boolean[] BC000W2_n551TBM24_UPD_CNT ;
   private String[] BC000W2_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W2_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W2_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W2_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W2_A705TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W2_n705TBM24_CRF_ITEM_NM ;
   private String[] BC000W2_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W2_n635TBM24_IDENTIFICATION_CD ;
   private short[] BC000W2_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W2_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W2_A637TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W2_n637TBM24_TEXT_MAXROWS ;
   private byte[] BC000W2_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W2_n638TBM24_DECIMAL_DIGITS ;
   private String[] BC000W2_A639TBM24_TEXT ;
   private boolean[] BC000W2_n639TBM24_TEXT ;
   private String[] BC000W2_A640TBM24_FIXED_VALUE ;
   private boolean[] BC000W2_n640TBM24_FIXED_VALUE ;
   private String[] BC000W2_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W2_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W2_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W2_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W2_A707TBM24_MIN_VALUE ;
   private boolean[] BC000W2_n707TBM24_MIN_VALUE ;
   private String[] BC000W2_A708TBM24_MAX_VALUE ;
   private boolean[] BC000W2_n708TBM24_MAX_VALUE ;
   private int[] BC000W2_A543TBM24_ORDER ;
   private boolean[] BC000W2_n543TBM24_ORDER ;
   private String[] BC000W2_A544TBM24_DEL_FLG ;
   private boolean[] BC000W2_n544TBM24_DEL_FLG ;
   private String[] BC000W2_A547TBM24_CRT_PROG_NM ;
   private boolean[] BC000W2_n547TBM24_CRT_PROG_NM ;
   private String[] BC000W2_A550TBM24_UPD_PROG_NM ;
   private boolean[] BC000W2_n550TBM24_UPD_PROG_NM ;
   private long[] BC000W2_A64TBM24_STUDY_ID ;
   private String[] BC000W10_A65TBM24_DOM_CD ;
   private String[] BC000W10_A66TBM24_DOM_VAR_NM ;
   private String[] BC000W10_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W10_A545TBM24_CRT_DATETIME ;
   private boolean[] BC000W10_n545TBM24_CRT_DATETIME ;
   private String[] BC000W10_A546TBM24_CRT_USER_ID ;
   private boolean[] BC000W10_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W10_A548TBM24_UPD_DATETIME ;
   private boolean[] BC000W10_n548TBM24_UPD_DATETIME ;
   private String[] BC000W10_A549TBM24_UPD_USER_ID ;
   private boolean[] BC000W10_n549TBM24_UPD_USER_ID ;
   private long[] BC000W10_A551TBM24_UPD_CNT ;
   private boolean[] BC000W10_n551TBM24_UPD_CNT ;
   private String[] BC000W10_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W10_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W10_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W10_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W10_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W10_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W10_A705TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W10_n705TBM24_CRF_ITEM_NM ;
   private String[] BC000W10_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W10_n635TBM24_IDENTIFICATION_CD ;
   private short[] BC000W10_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W10_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W10_A637TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W10_n637TBM24_TEXT_MAXROWS ;
   private byte[] BC000W10_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W10_n638TBM24_DECIMAL_DIGITS ;
   private String[] BC000W10_A639TBM24_TEXT ;
   private boolean[] BC000W10_n639TBM24_TEXT ;
   private String[] BC000W10_A640TBM24_FIXED_VALUE ;
   private boolean[] BC000W10_n640TBM24_FIXED_VALUE ;
   private String[] BC000W10_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W10_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W10_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W10_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W10_A707TBM24_MIN_VALUE ;
   private boolean[] BC000W10_n707TBM24_MIN_VALUE ;
   private String[] BC000W10_A708TBM24_MAX_VALUE ;
   private boolean[] BC000W10_n708TBM24_MAX_VALUE ;
   private int[] BC000W10_A543TBM24_ORDER ;
   private boolean[] BC000W10_n543TBM24_ORDER ;
   private String[] BC000W10_A544TBM24_DEL_FLG ;
   private boolean[] BC000W10_n544TBM24_DEL_FLG ;
   private String[] BC000W10_A547TBM24_CRT_PROG_NM ;
   private boolean[] BC000W10_n547TBM24_CRT_PROG_NM ;
   private String[] BC000W10_A550TBM24_UPD_PROG_NM ;
   private boolean[] BC000W10_n550TBM24_UPD_PROG_NM ;
   private long[] BC000W10_A64TBM24_STUDY_ID ;
}

final  class tbm24_map_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000W2", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W3", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W4", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W5", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000W6", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000W7", "INSERT INTO `TBM24_MAP_ITEM`(`TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000W8", "UPDATE `TBM24_MAP_ITEM` SET `TBM24_CRT_DATETIME`=?, `TBM24_CRT_USER_ID`=?, `TBM24_UPD_DATETIME`=?, `TBM24_UPD_USER_ID`=?, `TBM24_UPD_CNT`=?, `TBM24_DOM_ITM_GRP_OID`=?, `TBM24_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM24_DOM_ITM_GRP_ROWNO`=?, `TBM24_CRF_ITEM_NM`=?, `TBM24_IDENTIFICATION_CD`=?, `TBM24_TEXT_MAXLENGTH`=?, `TBM24_TEXT_MAXROWS`=?, `TBM24_DECIMAL_DIGITS`=?, `TBM24_TEXT`=?, `TBM24_FIXED_VALUE`=?, `TBM24_CHK_FALSE_INNER_VALUE`=?, `TBM24_REQUIRED_INPUT_FLG`=?, `TBM24_MIN_VALUE`=?, `TBM24_MAX_VALUE`=?, `TBM24_ORDER`=?, `TBM24_DEL_FLG`=?, `TBM24_CRT_PROG_NM`=?, `TBM24_UPD_PROG_NM`=?  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000W9", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000W10", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
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
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
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
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
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
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
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
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
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
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 20, false);
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
                  stmt.setVarchar(9, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 200);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 50);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 100);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 10);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 40);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[48], 40);
               }
               stmt.setLong(27, ((Number) parms[49]).longValue());
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 100);
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
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
               stmt.setVarchar(25, (String)parms[47], 16, false);
               stmt.setVarchar(26, (String)parms[48], 50, false);
               stmt.setVarchar(27, (String)parms[49], 20, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
      }
   }

}

