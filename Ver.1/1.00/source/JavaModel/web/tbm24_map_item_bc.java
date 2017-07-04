/*
               File: tbm24_map_item_bc
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:57.68
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
            Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
            Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
            Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
            Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120W2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A423TBM24_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A424TBM24_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A617TBM24_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A620TBM24_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A425TBM24_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A543TBM24_IDENTIFICATION_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A545TBM24_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A547TBM24_TEXT + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A548TBM24_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A549TBM24_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A621TBM24_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A622TBM24_MIN_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A623TBM24_MAX_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A426TBM24_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A427TBM24_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A428TBM24_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A429TBM24_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A430TBM24_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A431TBM24_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A432TBM24_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A433TBM24_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1180( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0W31( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z428TBM24_CRT_DATETIME = A428TBM24_CRT_DATETIME ;
         Z429TBM24_CRT_USER_ID = A429TBM24_CRT_USER_ID ;
         Z431TBM24_UPD_DATETIME = A431TBM24_UPD_DATETIME ;
         Z432TBM24_UPD_USER_ID = A432TBM24_UPD_USER_ID ;
         Z434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         Z617TBM24_DOM_ITM_GRP_OID = A617TBM24_DOM_ITM_GRP_OID ;
         Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z619TBM24_DOM_ITM_GRP_ROWNO = A619TBM24_DOM_ITM_GRP_ROWNO ;
         Z620TBM24_CRF_ITEM_NM = A620TBM24_CRF_ITEM_NM ;
         Z543TBM24_IDENTIFICATION_CD = A543TBM24_IDENTIFICATION_CD ;
         Z544TBM24_TEXT_MAXLENGTH = A544TBM24_TEXT_MAXLENGTH ;
         Z545TBM24_TEXT_MAXROWS = A545TBM24_TEXT_MAXROWS ;
         Z546TBM24_DECIMAL_DIGITS = A546TBM24_DECIMAL_DIGITS ;
         Z547TBM24_TEXT = A547TBM24_TEXT ;
         Z548TBM24_FIXED_VALUE = A548TBM24_FIXED_VALUE ;
         Z549TBM24_CHK_FALSE_INNER_VALUE = A549TBM24_CHK_FALSE_INNER_VALUE ;
         Z621TBM24_REQUIRED_INPUT_FLG = A621TBM24_REQUIRED_INPUT_FLG ;
         Z622TBM24_MIN_VALUE = A622TBM24_MIN_VALUE ;
         Z623TBM24_MAX_VALUE = A623TBM24_MAX_VALUE ;
         Z426TBM24_ORDER = A426TBM24_ORDER ;
         Z427TBM24_DEL_FLG = A427TBM24_DEL_FLG ;
         Z430TBM24_CRT_PROG_NM = A430TBM24_CRT_PROG_NM ;
         Z433TBM24_UPD_PROG_NM = A433TBM24_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
         Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
         Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
         Z428TBM24_CRT_DATETIME = A428TBM24_CRT_DATETIME ;
         Z429TBM24_CRT_USER_ID = A429TBM24_CRT_USER_ID ;
         Z431TBM24_UPD_DATETIME = A431TBM24_UPD_DATETIME ;
         Z432TBM24_UPD_USER_ID = A432TBM24_UPD_USER_ID ;
         Z434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         Z617TBM24_DOM_ITM_GRP_OID = A617TBM24_DOM_ITM_GRP_OID ;
         Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z619TBM24_DOM_ITM_GRP_ROWNO = A619TBM24_DOM_ITM_GRP_ROWNO ;
         Z620TBM24_CRF_ITEM_NM = A620TBM24_CRF_ITEM_NM ;
         Z543TBM24_IDENTIFICATION_CD = A543TBM24_IDENTIFICATION_CD ;
         Z544TBM24_TEXT_MAXLENGTH = A544TBM24_TEXT_MAXLENGTH ;
         Z545TBM24_TEXT_MAXROWS = A545TBM24_TEXT_MAXROWS ;
         Z546TBM24_DECIMAL_DIGITS = A546TBM24_DECIMAL_DIGITS ;
         Z547TBM24_TEXT = A547TBM24_TEXT ;
         Z548TBM24_FIXED_VALUE = A548TBM24_FIXED_VALUE ;
         Z549TBM24_CHK_FALSE_INNER_VALUE = A549TBM24_CHK_FALSE_INNER_VALUE ;
         Z621TBM24_REQUIRED_INPUT_FLG = A621TBM24_REQUIRED_INPUT_FLG ;
         Z622TBM24_MIN_VALUE = A622TBM24_MIN_VALUE ;
         Z623TBM24_MAX_VALUE = A623TBM24_MAX_VALUE ;
         Z426TBM24_ORDER = A426TBM24_ORDER ;
         Z427TBM24_DEL_FLG = A427TBM24_DEL_FLG ;
         Z430TBM24_CRT_PROG_NM = A430TBM24_CRT_PROG_NM ;
         Z433TBM24_UPD_PROG_NM = A433TBM24_UPD_PROG_NM ;
         Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
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
      pr_default.execute(3, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A428TBM24_CRT_DATETIME = BC000W5_A428TBM24_CRT_DATETIME[0] ;
         n428TBM24_CRT_DATETIME = BC000W5_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = BC000W5_A429TBM24_CRT_USER_ID[0] ;
         n429TBM24_CRT_USER_ID = BC000W5_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = BC000W5_A431TBM24_UPD_DATETIME[0] ;
         n431TBM24_UPD_DATETIME = BC000W5_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = BC000W5_A432TBM24_UPD_USER_ID[0] ;
         n432TBM24_UPD_USER_ID = BC000W5_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = BC000W5_A434TBM24_UPD_CNT[0] ;
         n434TBM24_UPD_CNT = BC000W5_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = BC000W5_A617TBM24_DOM_ITM_GRP_OID[0] ;
         n617TBM24_DOM_ITM_GRP_OID = BC000W5_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = BC000W5_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n619TBM24_DOM_ITM_GRP_ROWNO = BC000W5_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = BC000W5_A620TBM24_CRF_ITEM_NM[0] ;
         n620TBM24_CRF_ITEM_NM = BC000W5_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = BC000W5_A543TBM24_IDENTIFICATION_CD[0] ;
         n543TBM24_IDENTIFICATION_CD = BC000W5_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = BC000W5_A544TBM24_TEXT_MAXLENGTH[0] ;
         n544TBM24_TEXT_MAXLENGTH = BC000W5_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = BC000W5_A545TBM24_TEXT_MAXROWS[0] ;
         n545TBM24_TEXT_MAXROWS = BC000W5_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = BC000W5_A546TBM24_DECIMAL_DIGITS[0] ;
         n546TBM24_DECIMAL_DIGITS = BC000W5_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = BC000W5_A547TBM24_TEXT[0] ;
         n547TBM24_TEXT = BC000W5_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = BC000W5_A548TBM24_FIXED_VALUE[0] ;
         n548TBM24_FIXED_VALUE = BC000W5_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = BC000W5_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n549TBM24_CHK_FALSE_INNER_VALUE = BC000W5_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = BC000W5_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         n621TBM24_REQUIRED_INPUT_FLG = BC000W5_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = BC000W5_A622TBM24_MIN_VALUE[0] ;
         n622TBM24_MIN_VALUE = BC000W5_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = BC000W5_A623TBM24_MAX_VALUE[0] ;
         n623TBM24_MAX_VALUE = BC000W5_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = BC000W5_A426TBM24_ORDER[0] ;
         n426TBM24_ORDER = BC000W5_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = BC000W5_A427TBM24_DEL_FLG[0] ;
         n427TBM24_DEL_FLG = BC000W5_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = BC000W5_A430TBM24_CRT_PROG_NM[0] ;
         n430TBM24_CRT_PROG_NM = BC000W5_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = BC000W5_A433TBM24_UPD_PROG_NM[0] ;
         n433TBM24_UPD_PROG_NM = BC000W5_n433TBM24_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A422TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError422 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError422 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A428TBM24_CRT_DATETIME) || (( A428TBM24_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A428TBM24_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A431TBM24_UPD_DATETIME) || (( A431TBM24_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A431TBM24_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0W31( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0W31( )
   {
      /* Using cursor BC000W6 */
      pr_default.execute(4, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
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
      pr_default.execute(1, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0W31( 8) ;
         RcdFound31 = (short)(1) ;
         A423TBM24_DOM_CD = BC000W3_A423TBM24_DOM_CD[0] ;
         A424TBM24_DOM_VAR_NM = BC000W3_A424TBM24_DOM_VAR_NM[0] ;
         A425TBM24_CRF_ITEM_DIV = BC000W3_A425TBM24_CRF_ITEM_DIV[0] ;
         A428TBM24_CRT_DATETIME = BC000W3_A428TBM24_CRT_DATETIME[0] ;
         n428TBM24_CRT_DATETIME = BC000W3_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = BC000W3_A429TBM24_CRT_USER_ID[0] ;
         n429TBM24_CRT_USER_ID = BC000W3_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = BC000W3_A431TBM24_UPD_DATETIME[0] ;
         n431TBM24_UPD_DATETIME = BC000W3_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = BC000W3_A432TBM24_UPD_USER_ID[0] ;
         n432TBM24_UPD_USER_ID = BC000W3_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = BC000W3_A434TBM24_UPD_CNT[0] ;
         n434TBM24_UPD_CNT = BC000W3_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = BC000W3_A617TBM24_DOM_ITM_GRP_OID[0] ;
         n617TBM24_DOM_ITM_GRP_OID = BC000W3_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = BC000W3_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n619TBM24_DOM_ITM_GRP_ROWNO = BC000W3_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = BC000W3_A620TBM24_CRF_ITEM_NM[0] ;
         n620TBM24_CRF_ITEM_NM = BC000W3_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = BC000W3_A543TBM24_IDENTIFICATION_CD[0] ;
         n543TBM24_IDENTIFICATION_CD = BC000W3_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = BC000W3_A544TBM24_TEXT_MAXLENGTH[0] ;
         n544TBM24_TEXT_MAXLENGTH = BC000W3_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = BC000W3_A545TBM24_TEXT_MAXROWS[0] ;
         n545TBM24_TEXT_MAXROWS = BC000W3_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = BC000W3_A546TBM24_DECIMAL_DIGITS[0] ;
         n546TBM24_DECIMAL_DIGITS = BC000W3_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = BC000W3_A547TBM24_TEXT[0] ;
         n547TBM24_TEXT = BC000W3_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = BC000W3_A548TBM24_FIXED_VALUE[0] ;
         n548TBM24_FIXED_VALUE = BC000W3_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = BC000W3_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n549TBM24_CHK_FALSE_INNER_VALUE = BC000W3_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = BC000W3_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         n621TBM24_REQUIRED_INPUT_FLG = BC000W3_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = BC000W3_A622TBM24_MIN_VALUE[0] ;
         n622TBM24_MIN_VALUE = BC000W3_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = BC000W3_A623TBM24_MAX_VALUE[0] ;
         n623TBM24_MAX_VALUE = BC000W3_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = BC000W3_A426TBM24_ORDER[0] ;
         n426TBM24_ORDER = BC000W3_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = BC000W3_A427TBM24_DEL_FLG[0] ;
         n427TBM24_DEL_FLG = BC000W3_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = BC000W3_A430TBM24_CRT_PROG_NM[0] ;
         n430TBM24_CRT_PROG_NM = BC000W3_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = BC000W3_A433TBM24_UPD_PROG_NM[0] ;
         n433TBM24_UPD_PROG_NM = BC000W3_n433TBM24_UPD_PROG_NM[0] ;
         A422TBM24_STUDY_ID = BC000W3_A422TBM24_STUDY_ID[0] ;
         O434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         n434TBM24_UPD_CNT = false ;
         Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
         Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
         Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
         Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0W31( ) ;
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
         pr_default.execute(0, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z428TBM24_CRT_DATETIME.equals( BC000W2_A428TBM24_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z429TBM24_CRT_USER_ID, BC000W2_A429TBM24_CRT_USER_ID[0]) != 0 ) || !( Z431TBM24_UPD_DATETIME.equals( BC000W2_A431TBM24_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z432TBM24_UPD_USER_ID, BC000W2_A432TBM24_UPD_USER_ID[0]) != 0 ) || ( Z434TBM24_UPD_CNT != BC000W2_A434TBM24_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z617TBM24_DOM_ITM_GRP_OID, BC000W2_A617TBM24_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z618TBM24_DOM_ITM_GRP_ATTR_SEQ != BC000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ) || ( Z619TBM24_DOM_ITM_GRP_ROWNO != BC000W2_A619TBM24_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z620TBM24_CRF_ITEM_NM, BC000W2_A620TBM24_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z543TBM24_IDENTIFICATION_CD, BC000W2_A543TBM24_IDENTIFICATION_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z544TBM24_TEXT_MAXLENGTH != BC000W2_A544TBM24_TEXT_MAXLENGTH[0] ) || ( Z545TBM24_TEXT_MAXROWS != BC000W2_A545TBM24_TEXT_MAXROWS[0] ) || ( Z546TBM24_DECIMAL_DIGITS != BC000W2_A546TBM24_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z547TBM24_TEXT, BC000W2_A547TBM24_TEXT[0]) != 0 ) || ( GXutil.strcmp(Z548TBM24_FIXED_VALUE, BC000W2_A548TBM24_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z549TBM24_CHK_FALSE_INNER_VALUE, BC000W2_A549TBM24_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z621TBM24_REQUIRED_INPUT_FLG, BC000W2_A621TBM24_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z622TBM24_MIN_VALUE, BC000W2_A622TBM24_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z623TBM24_MAX_VALUE, BC000W2_A623TBM24_MAX_VALUE[0]) != 0 ) || ( Z426TBM24_ORDER != BC000W2_A426TBM24_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z427TBM24_DEL_FLG, BC000W2_A427TBM24_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z430TBM24_CRT_PROG_NM, BC000W2_A430TBM24_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z433TBM24_UPD_PROG_NM, BC000W2_A433TBM24_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(5, new Object[] {A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV, new Boolean(n428TBM24_CRT_DATETIME), A428TBM24_CRT_DATETIME, new Boolean(n429TBM24_CRT_USER_ID), A429TBM24_CRT_USER_ID, new Boolean(n431TBM24_UPD_DATETIME), A431TBM24_UPD_DATETIME, new Boolean(n432TBM24_UPD_USER_ID), A432TBM24_UPD_USER_ID, new Boolean(n434TBM24_UPD_CNT), new Long(A434TBM24_UPD_CNT), new Boolean(n617TBM24_DOM_ITM_GRP_OID), A617TBM24_DOM_ITM_GRP_OID, new Boolean(n618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n619TBM24_DOM_ITM_GRP_ROWNO), new Short(A619TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n620TBM24_CRF_ITEM_NM), A620TBM24_CRF_ITEM_NM, new Boolean(n543TBM24_IDENTIFICATION_CD), A543TBM24_IDENTIFICATION_CD, new Boolean(n544TBM24_TEXT_MAXLENGTH), new Short(A544TBM24_TEXT_MAXLENGTH), new Boolean(n545TBM24_TEXT_MAXROWS), new Byte(A545TBM24_TEXT_MAXROWS), new Boolean(n546TBM24_DECIMAL_DIGITS), new Byte(A546TBM24_DECIMAL_DIGITS), new Boolean(n547TBM24_TEXT), A547TBM24_TEXT, new Boolean(n548TBM24_FIXED_VALUE), A548TBM24_FIXED_VALUE, new Boolean(n549TBM24_CHK_FALSE_INNER_VALUE), A549TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n621TBM24_REQUIRED_INPUT_FLG), A621TBM24_REQUIRED_INPUT_FLG, new Boolean(n622TBM24_MIN_VALUE), A622TBM24_MIN_VALUE, new Boolean(n623TBM24_MAX_VALUE), A623TBM24_MAX_VALUE, new Boolean(n426TBM24_ORDER), new Integer(A426TBM24_ORDER), new Boolean(n427TBM24_DEL_FLG), A427TBM24_DEL_FLG, new Boolean(n430TBM24_CRT_PROG_NM), A430TBM24_CRT_PROG_NM, new Boolean(n433TBM24_UPD_PROG_NM), A433TBM24_UPD_PROG_NM, new Long(A422TBM24_STUDY_ID)});
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
                  pr_default.execute(6, new Object[] {new Boolean(n428TBM24_CRT_DATETIME), A428TBM24_CRT_DATETIME, new Boolean(n429TBM24_CRT_USER_ID), A429TBM24_CRT_USER_ID, new Boolean(n431TBM24_UPD_DATETIME), A431TBM24_UPD_DATETIME, new Boolean(n432TBM24_UPD_USER_ID), A432TBM24_UPD_USER_ID, new Boolean(n434TBM24_UPD_CNT), new Long(A434TBM24_UPD_CNT), new Boolean(n617TBM24_DOM_ITM_GRP_OID), A617TBM24_DOM_ITM_GRP_OID, new Boolean(n618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n619TBM24_DOM_ITM_GRP_ROWNO), new Short(A619TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n620TBM24_CRF_ITEM_NM), A620TBM24_CRF_ITEM_NM, new Boolean(n543TBM24_IDENTIFICATION_CD), A543TBM24_IDENTIFICATION_CD, new Boolean(n544TBM24_TEXT_MAXLENGTH), new Short(A544TBM24_TEXT_MAXLENGTH), new Boolean(n545TBM24_TEXT_MAXROWS), new Byte(A545TBM24_TEXT_MAXROWS), new Boolean(n546TBM24_DECIMAL_DIGITS), new Byte(A546TBM24_DECIMAL_DIGITS), new Boolean(n547TBM24_TEXT), A547TBM24_TEXT, new Boolean(n548TBM24_FIXED_VALUE), A548TBM24_FIXED_VALUE, new Boolean(n549TBM24_CHK_FALSE_INNER_VALUE), A549TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n621TBM24_REQUIRED_INPUT_FLG), A621TBM24_REQUIRED_INPUT_FLG, new Boolean(n622TBM24_MIN_VALUE), A622TBM24_MIN_VALUE, new Boolean(n623TBM24_MAX_VALUE), A623TBM24_MAX_VALUE, new Boolean(n426TBM24_ORDER), new Integer(A426TBM24_ORDER), new Boolean(n427TBM24_DEL_FLG), A427TBM24_DEL_FLG, new Boolean(n430TBM24_CRT_PROG_NM), A430TBM24_CRT_PROG_NM, new Boolean(n433TBM24_UPD_PROG_NM), A433TBM24_UPD_PROG_NM, new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
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
               pr_default.execute(7, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
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
      /* Using cursor BC000W10 */
      pr_default.execute(8, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A423TBM24_DOM_CD = BC000W10_A423TBM24_DOM_CD[0] ;
         A424TBM24_DOM_VAR_NM = BC000W10_A424TBM24_DOM_VAR_NM[0] ;
         A425TBM24_CRF_ITEM_DIV = BC000W10_A425TBM24_CRF_ITEM_DIV[0] ;
         A428TBM24_CRT_DATETIME = BC000W10_A428TBM24_CRT_DATETIME[0] ;
         n428TBM24_CRT_DATETIME = BC000W10_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = BC000W10_A429TBM24_CRT_USER_ID[0] ;
         n429TBM24_CRT_USER_ID = BC000W10_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = BC000W10_A431TBM24_UPD_DATETIME[0] ;
         n431TBM24_UPD_DATETIME = BC000W10_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = BC000W10_A432TBM24_UPD_USER_ID[0] ;
         n432TBM24_UPD_USER_ID = BC000W10_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = BC000W10_A434TBM24_UPD_CNT[0] ;
         n434TBM24_UPD_CNT = BC000W10_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = BC000W10_A617TBM24_DOM_ITM_GRP_OID[0] ;
         n617TBM24_DOM_ITM_GRP_OID = BC000W10_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = BC000W10_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n619TBM24_DOM_ITM_GRP_ROWNO = BC000W10_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = BC000W10_A620TBM24_CRF_ITEM_NM[0] ;
         n620TBM24_CRF_ITEM_NM = BC000W10_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = BC000W10_A543TBM24_IDENTIFICATION_CD[0] ;
         n543TBM24_IDENTIFICATION_CD = BC000W10_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = BC000W10_A544TBM24_TEXT_MAXLENGTH[0] ;
         n544TBM24_TEXT_MAXLENGTH = BC000W10_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = BC000W10_A545TBM24_TEXT_MAXROWS[0] ;
         n545TBM24_TEXT_MAXROWS = BC000W10_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = BC000W10_A546TBM24_DECIMAL_DIGITS[0] ;
         n546TBM24_DECIMAL_DIGITS = BC000W10_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = BC000W10_A547TBM24_TEXT[0] ;
         n547TBM24_TEXT = BC000W10_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = BC000W10_A548TBM24_FIXED_VALUE[0] ;
         n548TBM24_FIXED_VALUE = BC000W10_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = BC000W10_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n549TBM24_CHK_FALSE_INNER_VALUE = BC000W10_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = BC000W10_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         n621TBM24_REQUIRED_INPUT_FLG = BC000W10_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = BC000W10_A622TBM24_MIN_VALUE[0] ;
         n622TBM24_MIN_VALUE = BC000W10_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = BC000W10_A623TBM24_MAX_VALUE[0] ;
         n623TBM24_MAX_VALUE = BC000W10_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = BC000W10_A426TBM24_ORDER[0] ;
         n426TBM24_ORDER = BC000W10_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = BC000W10_A427TBM24_DEL_FLG[0] ;
         n427TBM24_DEL_FLG = BC000W10_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = BC000W10_A430TBM24_CRT_PROG_NM[0] ;
         n430TBM24_CRT_PROG_NM = BC000W10_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = BC000W10_A433TBM24_UPD_PROG_NM[0] ;
         n433TBM24_UPD_PROG_NM = BC000W10_n433TBM24_UPD_PROG_NM[0] ;
         A422TBM24_STUDY_ID = BC000W10_A422TBM24_STUDY_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0W31( )
   {
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
         A423TBM24_DOM_CD = BC000W10_A423TBM24_DOM_CD[0] ;
         A424TBM24_DOM_VAR_NM = BC000W10_A424TBM24_DOM_VAR_NM[0] ;
         A425TBM24_CRF_ITEM_DIV = BC000W10_A425TBM24_CRF_ITEM_DIV[0] ;
         A428TBM24_CRT_DATETIME = BC000W10_A428TBM24_CRT_DATETIME[0] ;
         n428TBM24_CRT_DATETIME = BC000W10_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = BC000W10_A429TBM24_CRT_USER_ID[0] ;
         n429TBM24_CRT_USER_ID = BC000W10_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = BC000W10_A431TBM24_UPD_DATETIME[0] ;
         n431TBM24_UPD_DATETIME = BC000W10_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = BC000W10_A432TBM24_UPD_USER_ID[0] ;
         n432TBM24_UPD_USER_ID = BC000W10_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = BC000W10_A434TBM24_UPD_CNT[0] ;
         n434TBM24_UPD_CNT = BC000W10_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = BC000W10_A617TBM24_DOM_ITM_GRP_OID[0] ;
         n617TBM24_DOM_ITM_GRP_OID = BC000W10_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = BC000W10_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = BC000W10_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n619TBM24_DOM_ITM_GRP_ROWNO = BC000W10_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = BC000W10_A620TBM24_CRF_ITEM_NM[0] ;
         n620TBM24_CRF_ITEM_NM = BC000W10_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = BC000W10_A543TBM24_IDENTIFICATION_CD[0] ;
         n543TBM24_IDENTIFICATION_CD = BC000W10_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = BC000W10_A544TBM24_TEXT_MAXLENGTH[0] ;
         n544TBM24_TEXT_MAXLENGTH = BC000W10_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = BC000W10_A545TBM24_TEXT_MAXROWS[0] ;
         n545TBM24_TEXT_MAXROWS = BC000W10_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = BC000W10_A546TBM24_DECIMAL_DIGITS[0] ;
         n546TBM24_DECIMAL_DIGITS = BC000W10_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = BC000W10_A547TBM24_TEXT[0] ;
         n547TBM24_TEXT = BC000W10_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = BC000W10_A548TBM24_FIXED_VALUE[0] ;
         n548TBM24_FIXED_VALUE = BC000W10_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = BC000W10_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n549TBM24_CHK_FALSE_INNER_VALUE = BC000W10_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = BC000W10_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         n621TBM24_REQUIRED_INPUT_FLG = BC000W10_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = BC000W10_A622TBM24_MIN_VALUE[0] ;
         n622TBM24_MIN_VALUE = BC000W10_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = BC000W10_A623TBM24_MAX_VALUE[0] ;
         n623TBM24_MAX_VALUE = BC000W10_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = BC000W10_A426TBM24_ORDER[0] ;
         n426TBM24_ORDER = BC000W10_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = BC000W10_A427TBM24_DEL_FLG[0] ;
         n427TBM24_DEL_FLG = BC000W10_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = BC000W10_A430TBM24_CRT_PROG_NM[0] ;
         n430TBM24_CRT_PROG_NM = BC000W10_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = BC000W10_A433TBM24_UPD_PROG_NM[0] ;
         n433TBM24_UPD_PROG_NM = BC000W10_n433TBM24_UPD_PROG_NM[0] ;
         A422TBM24_STUDY_ID = BC000W10_A422TBM24_STUDY_ID[0] ;
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
      A428TBM24_CRT_DATETIME = GXutil.now( ) ;
      n428TBM24_CRT_DATETIME = false ;
      GXt_char1 = A429TBM24_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A429TBM24_CRT_USER_ID = GXt_char1 ;
      n429TBM24_CRT_USER_ID = false ;
      A431TBM24_UPD_DATETIME = GXutil.now( ) ;
      n431TBM24_UPD_DATETIME = false ;
      GXt_char1 = A432TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A432TBM24_UPD_USER_ID = GXt_char1 ;
      n432TBM24_UPD_USER_ID = false ;
      A434TBM24_UPD_CNT = (long)(O434TBM24_UPD_CNT+1) ;
      n434TBM24_UPD_CNT = false ;
   }

   public void beforeUpdate0W31( )
   {
      /* Before Update Rules */
      A431TBM24_UPD_DATETIME = GXutil.now( ) ;
      n431TBM24_UPD_DATETIME = false ;
      GXt_char1 = A432TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A432TBM24_UPD_USER_ID = GXt_char1 ;
      n432TBM24_UPD_USER_ID = false ;
      A434TBM24_UPD_CNT = (long)(O434TBM24_UPD_CNT+1) ;
      n434TBM24_UPD_CNT = false ;
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
      A428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n428TBM24_CRT_DATETIME = false ;
      A429TBM24_CRT_USER_ID = "" ;
      n429TBM24_CRT_USER_ID = false ;
      A431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n431TBM24_UPD_DATETIME = false ;
      A432TBM24_UPD_USER_ID = "" ;
      n432TBM24_UPD_USER_ID = false ;
      A434TBM24_UPD_CNT = 0 ;
      n434TBM24_UPD_CNT = false ;
      A617TBM24_DOM_ITM_GRP_OID = "" ;
      n617TBM24_DOM_ITM_GRP_OID = false ;
      A618TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A619TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n619TBM24_DOM_ITM_GRP_ROWNO = false ;
      A620TBM24_CRF_ITEM_NM = "" ;
      n620TBM24_CRF_ITEM_NM = false ;
      A543TBM24_IDENTIFICATION_CD = "" ;
      n543TBM24_IDENTIFICATION_CD = false ;
      A544TBM24_TEXT_MAXLENGTH = (short)(0) ;
      n544TBM24_TEXT_MAXLENGTH = false ;
      A545TBM24_TEXT_MAXROWS = (byte)(0) ;
      n545TBM24_TEXT_MAXROWS = false ;
      A546TBM24_DECIMAL_DIGITS = (byte)(0) ;
      n546TBM24_DECIMAL_DIGITS = false ;
      A547TBM24_TEXT = "" ;
      n547TBM24_TEXT = false ;
      A548TBM24_FIXED_VALUE = "" ;
      n548TBM24_FIXED_VALUE = false ;
      A549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      n549TBM24_CHK_FALSE_INNER_VALUE = false ;
      A621TBM24_REQUIRED_INPUT_FLG = "" ;
      n621TBM24_REQUIRED_INPUT_FLG = false ;
      A622TBM24_MIN_VALUE = "" ;
      n622TBM24_MIN_VALUE = false ;
      A623TBM24_MAX_VALUE = "" ;
      n623TBM24_MAX_VALUE = false ;
      A426TBM24_ORDER = 0 ;
      n426TBM24_ORDER = false ;
      A427TBM24_DEL_FLG = "" ;
      n427TBM24_DEL_FLG = false ;
      A430TBM24_CRT_PROG_NM = "" ;
      n430TBM24_CRT_PROG_NM = false ;
      A433TBM24_UPD_PROG_NM = "" ;
      n433TBM24_UPD_PROG_NM = false ;
      O434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
      n434TBM24_UPD_CNT = false ;
   }

   public void initAll0W31( )
   {
      A422TBM24_STUDY_ID = 0 ;
      A423TBM24_DOM_CD = "" ;
      A424TBM24_DOM_VAR_NM = "" ;
      A425TBM24_CRF_ITEM_DIV = "" ;
      initializeNonKey0W31( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow31( SdtTBM24_MAP_ITEM obj31 )
   {
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Mode( Gx_mode );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime( A428TBM24_CRT_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id( A429TBM24_CRT_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime( A431TBM24_UPD_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id( A432TBM24_UPD_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt( A434TBM24_UPD_CNT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid( A617TBM24_DOM_ITM_GRP_OID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq( A618TBM24_DOM_ITM_GRP_ATTR_SEQ );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno( A619TBM24_DOM_ITM_GRP_ROWNO );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm( A620TBM24_CRF_ITEM_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd( A543TBM24_IDENTIFICATION_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength( A544TBM24_TEXT_MAXLENGTH );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows( A545TBM24_TEXT_MAXROWS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits( A546TBM24_DECIMAL_DIGITS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text( A547TBM24_TEXT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value( A548TBM24_FIXED_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value( A549TBM24_CHK_FALSE_INNER_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg( A621TBM24_REQUIRED_INPUT_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value( A622TBM24_MIN_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value( A623TBM24_MAX_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order( A426TBM24_ORDER );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg( A427TBM24_DEL_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm( A430TBM24_CRT_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm( A433TBM24_UPD_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( A422TBM24_STUDY_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( A423TBM24_DOM_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( A424TBM24_DOM_VAR_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( A425TBM24_CRF_ITEM_DIV );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z( Z422TBM24_STUDY_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z( Z423TBM24_DOM_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z( Z424TBM24_DOM_VAR_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z( Z617TBM24_DOM_ITM_GRP_OID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z( Z618TBM24_DOM_ITM_GRP_ATTR_SEQ );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z( Z619TBM24_DOM_ITM_GRP_ROWNO );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z( Z620TBM24_CRF_ITEM_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z( Z425TBM24_CRF_ITEM_DIV );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z( Z543TBM24_IDENTIFICATION_CD );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z( Z544TBM24_TEXT_MAXLENGTH );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z( Z545TBM24_TEXT_MAXROWS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z( Z546TBM24_DECIMAL_DIGITS );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z( Z547TBM24_TEXT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z( Z548TBM24_FIXED_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z( Z549TBM24_CHK_FALSE_INNER_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z( Z621TBM24_REQUIRED_INPUT_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z( Z622TBM24_MIN_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z( Z623TBM24_MAX_VALUE );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z( Z426TBM24_ORDER );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z( Z427TBM24_DEL_FLG );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z( Z428TBM24_CRT_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z( Z429TBM24_CRT_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z( Z430TBM24_CRT_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z( Z431TBM24_UPD_DATETIME );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z( Z432TBM24_UPD_USER_ID );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z( Z433TBM24_UPD_PROG_NM );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z( Z434TBM24_UPD_CNT );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N( (byte)((byte)((n617TBM24_DOM_ITM_GRP_OID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N( (byte)((byte)((n618TBM24_DOM_ITM_GRP_ATTR_SEQ)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N( (byte)((byte)((n619TBM24_DOM_ITM_GRP_ROWNO)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N( (byte)((byte)((n620TBM24_CRF_ITEM_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N( (byte)((byte)((n543TBM24_IDENTIFICATION_CD)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N( (byte)((byte)((n544TBM24_TEXT_MAXLENGTH)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N( (byte)((byte)((n545TBM24_TEXT_MAXROWS)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N( (byte)((byte)((n546TBM24_DECIMAL_DIGITS)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N( (byte)((byte)((n547TBM24_TEXT)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N( (byte)((byte)((n548TBM24_FIXED_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N( (byte)((byte)((n549TBM24_CHK_FALSE_INNER_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N( (byte)((byte)((n621TBM24_REQUIRED_INPUT_FLG)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N( (byte)((byte)((n622TBM24_MIN_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N( (byte)((byte)((n623TBM24_MAX_VALUE)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N( (byte)((byte)((n426TBM24_ORDER)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N( (byte)((byte)((n427TBM24_DEL_FLG)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N( (byte)((byte)((n428TBM24_CRT_DATETIME)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N( (byte)((byte)((n429TBM24_CRT_USER_ID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N( (byte)((byte)((n430TBM24_CRT_PROG_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N( (byte)((byte)((n431TBM24_UPD_DATETIME)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N( (byte)((byte)((n432TBM24_UPD_USER_ID)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N( (byte)((byte)((n433TBM24_UPD_PROG_NM)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N( (byte)((byte)((n434TBM24_UPD_CNT)?1:0)) );
      obj31.setgxTv_SdtTBM24_MAP_ITEM_Mode( Gx_mode );
   }

   public void RowToVars31( SdtTBM24_MAP_ITEM obj31 ,
                            int forceLoad )
   {
      Gx_mode = obj31.getgxTv_SdtTBM24_MAP_ITEM_Mode() ;
      A428TBM24_CRT_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime() ;
      n428TBM24_CRT_DATETIME = false ;
      A429TBM24_CRT_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id() ;
      n429TBM24_CRT_USER_ID = false ;
      A431TBM24_UPD_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime() ;
      n431TBM24_UPD_DATETIME = false ;
      A432TBM24_UPD_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id() ;
      n432TBM24_UPD_USER_ID = false ;
      A434TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt() ;
      n434TBM24_UPD_CNT = false ;
      A617TBM24_DOM_ITM_GRP_OID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid() ;
      n617TBM24_DOM_ITM_GRP_OID = false ;
      A618TBM24_DOM_ITM_GRP_ATTR_SEQ = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq() ;
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A619TBM24_DOM_ITM_GRP_ROWNO = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno() ;
      n619TBM24_DOM_ITM_GRP_ROWNO = false ;
      A620TBM24_CRF_ITEM_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm() ;
      n620TBM24_CRF_ITEM_NM = false ;
      A543TBM24_IDENTIFICATION_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd() ;
      n543TBM24_IDENTIFICATION_CD = false ;
      A544TBM24_TEXT_MAXLENGTH = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength() ;
      n544TBM24_TEXT_MAXLENGTH = false ;
      A545TBM24_TEXT_MAXROWS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows() ;
      n545TBM24_TEXT_MAXROWS = false ;
      A546TBM24_DECIMAL_DIGITS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits() ;
      n546TBM24_DECIMAL_DIGITS = false ;
      A547TBM24_TEXT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text() ;
      n547TBM24_TEXT = false ;
      A548TBM24_FIXED_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value() ;
      n548TBM24_FIXED_VALUE = false ;
      A549TBM24_CHK_FALSE_INNER_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value() ;
      n549TBM24_CHK_FALSE_INNER_VALUE = false ;
      A621TBM24_REQUIRED_INPUT_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg() ;
      n621TBM24_REQUIRED_INPUT_FLG = false ;
      A622TBM24_MIN_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value() ;
      n622TBM24_MIN_VALUE = false ;
      A623TBM24_MAX_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value() ;
      n623TBM24_MAX_VALUE = false ;
      A426TBM24_ORDER = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order() ;
      n426TBM24_ORDER = false ;
      A427TBM24_DEL_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg() ;
      n427TBM24_DEL_FLG = false ;
      A430TBM24_CRT_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm() ;
      n430TBM24_CRT_PROG_NM = false ;
      A433TBM24_UPD_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm() ;
      n433TBM24_UPD_PROG_NM = false ;
      A422TBM24_STUDY_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id() ;
      A423TBM24_DOM_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd() ;
      A424TBM24_DOM_VAR_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm() ;
      A425TBM24_CRF_ITEM_DIV = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div() ;
      Z422TBM24_STUDY_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z() ;
      Z423TBM24_DOM_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z() ;
      Z424TBM24_DOM_VAR_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z() ;
      Z617TBM24_DOM_ITM_GRP_OID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z() ;
      Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z() ;
      Z619TBM24_DOM_ITM_GRP_ROWNO = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z() ;
      Z620TBM24_CRF_ITEM_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z() ;
      Z425TBM24_CRF_ITEM_DIV = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z() ;
      Z543TBM24_IDENTIFICATION_CD = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z() ;
      Z544TBM24_TEXT_MAXLENGTH = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z() ;
      Z545TBM24_TEXT_MAXROWS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z() ;
      Z546TBM24_DECIMAL_DIGITS = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z() ;
      Z547TBM24_TEXT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z() ;
      Z548TBM24_FIXED_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z() ;
      Z549TBM24_CHK_FALSE_INNER_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z() ;
      Z621TBM24_REQUIRED_INPUT_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z() ;
      Z622TBM24_MIN_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z() ;
      Z623TBM24_MAX_VALUE = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z() ;
      Z426TBM24_ORDER = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z() ;
      Z427TBM24_DEL_FLG = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z() ;
      Z428TBM24_CRT_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z() ;
      Z429TBM24_CRT_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z() ;
      Z430TBM24_CRT_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z() ;
      Z431TBM24_UPD_DATETIME = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z() ;
      Z432TBM24_UPD_USER_ID = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z() ;
      Z433TBM24_UPD_PROG_NM = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z() ;
      Z434TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z() ;
      O434TBM24_UPD_CNT = obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z() ;
      n617TBM24_DOM_ITM_GRP_OID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N()==0)?false:true) ;
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N()==0)?false:true) ;
      n619TBM24_DOM_ITM_GRP_ROWNO = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N()==0)?false:true) ;
      n620TBM24_CRF_ITEM_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N()==0)?false:true) ;
      n543TBM24_IDENTIFICATION_CD = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N()==0)?false:true) ;
      n544TBM24_TEXT_MAXLENGTH = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N()==0)?false:true) ;
      n545TBM24_TEXT_MAXROWS = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N()==0)?false:true) ;
      n546TBM24_DECIMAL_DIGITS = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N()==0)?false:true) ;
      n547TBM24_TEXT = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N()==0)?false:true) ;
      n548TBM24_FIXED_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N()==0)?false:true) ;
      n549TBM24_CHK_FALSE_INNER_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N()==0)?false:true) ;
      n621TBM24_REQUIRED_INPUT_FLG = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N()==0)?false:true) ;
      n622TBM24_MIN_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N()==0)?false:true) ;
      n623TBM24_MAX_VALUE = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N()==0)?false:true) ;
      n426TBM24_ORDER = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N()==0)?false:true) ;
      n427TBM24_DEL_FLG = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N()==0)?false:true) ;
      n428TBM24_CRT_DATETIME = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N()==0)?false:true) ;
      n429TBM24_CRT_USER_ID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N()==0)?false:true) ;
      n430TBM24_CRT_PROG_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N()==0)?false:true) ;
      n431TBM24_UPD_DATETIME = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N()==0)?false:true) ;
      n432TBM24_UPD_USER_ID = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N()==0)?false:true) ;
      n433TBM24_UPD_PROG_NM = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N()==0)?false:true) ;
      n434TBM24_UPD_CNT = (boolean)((obj31.getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj31.getgxTv_SdtTBM24_MAP_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A422TBM24_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A423TBM24_DOM_CD = (String)getParm(obj,1) ;
      A424TBM24_DOM_VAR_NM = (String)getParm(obj,2) ;
      A425TBM24_CRF_ITEM_DIV = (String)getParm(obj,3) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0W31( ) ;
      scanKeyStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000W11 */
         pr_default.execute(9, new Object[] {new Long(A422TBM24_STUDY_ID)});
         if ( (pr_default.getStatus(9) == 101) )
         {
            AnyError422 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( AnyError422 == 0 )
         {
         }
         pr_default.close(9);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
         Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
         Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
         Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
         O434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         n434TBM24_UPD_CNT = false ;
      }
      zm0W31( -8) ;
      sMode31 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0W31( ) ;
      Gx_mode = sMode31 ;
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
      if ( RcdFound31 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
         {
            A422TBM24_STUDY_ID = Z422TBM24_STUDY_ID ;
            A423TBM24_DOM_CD = Z423TBM24_DOM_CD ;
            A424TBM24_DOM_VAR_NM = Z424TBM24_DOM_VAR_NM ;
            A425TBM24_CRF_ITEM_DIV = Z425TBM24_CRF_ITEM_DIV ;
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
            if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
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
         else if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
         {
            A422TBM24_STUDY_ID = Z422TBM24_STUDY_ID ;
            A423TBM24_DOM_CD = Z423TBM24_DOM_CD ;
            A424TBM24_DOM_VAR_NM = Z424TBM24_DOM_VAR_NM ;
            A425TBM24_CRF_ITEM_DIV = Z425TBM24_CRF_ITEM_DIV ;
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
         if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
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
      pr_default.close(9);
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
                  /* Execute user subroutine: S1180 */
                  S1180 ();
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
      Z423TBM24_DOM_CD = "" ;
      A423TBM24_DOM_CD = "" ;
      Z424TBM24_DOM_VAR_NM = "" ;
      A424TBM24_DOM_VAR_NM = "" ;
      Z425TBM24_CRF_ITEM_DIV = "" ;
      A425TBM24_CRF_ITEM_DIV = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A617TBM24_DOM_ITM_GRP_OID = "" ;
      A620TBM24_CRF_ITEM_NM = "" ;
      A543TBM24_IDENTIFICATION_CD = "" ;
      A547TBM24_TEXT = "" ;
      A548TBM24_FIXED_VALUE = "" ;
      A549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      A621TBM24_REQUIRED_INPUT_FLG = "" ;
      A622TBM24_MIN_VALUE = "" ;
      A623TBM24_MAX_VALUE = "" ;
      A427TBM24_DEL_FLG = "" ;
      A428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A429TBM24_CRT_USER_ID = "" ;
      A430TBM24_CRT_PROG_NM = "" ;
      A431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A432TBM24_UPD_USER_ID = "" ;
      A433TBM24_UPD_PROG_NM = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z = "" ;
      Z428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z429TBM24_CRT_USER_ID = "" ;
      Z431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z432TBM24_UPD_USER_ID = "" ;
      Z617TBM24_DOM_ITM_GRP_OID = "" ;
      Z620TBM24_CRF_ITEM_NM = "" ;
      Z543TBM24_IDENTIFICATION_CD = "" ;
      Z547TBM24_TEXT = "" ;
      Z548TBM24_FIXED_VALUE = "" ;
      Z549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      Z621TBM24_REQUIRED_INPUT_FLG = "" ;
      Z622TBM24_MIN_VALUE = "" ;
      Z623TBM24_MAX_VALUE = "" ;
      Z427TBM24_DEL_FLG = "" ;
      Z430TBM24_CRT_PROG_NM = "" ;
      Z433TBM24_UPD_PROG_NM = "" ;
      BC000W5_A423TBM24_DOM_CD = new String[] {""} ;
      BC000W5_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W5_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W5_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W5_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W5_A429TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W5_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W5_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W5_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W5_A432TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W5_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W5_A434TBM24_UPD_CNT = new long[1] ;
      BC000W5_n434TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W5_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W5_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W5_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W5_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W5_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W5_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W5_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W5_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W5_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W5_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W5_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W5_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W5_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W5_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W5_A547TBM24_TEXT = new String[] {""} ;
      BC000W5_n547TBM24_TEXT = new boolean[] {false} ;
      BC000W5_A548TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W5_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W5_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W5_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W5_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W5_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W5_A622TBM24_MIN_VALUE = new String[] {""} ;
      BC000W5_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W5_A623TBM24_MAX_VALUE = new String[] {""} ;
      BC000W5_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W5_A426TBM24_ORDER = new int[1] ;
      BC000W5_n426TBM24_ORDER = new boolean[] {false} ;
      BC000W5_A427TBM24_DEL_FLG = new String[] {""} ;
      BC000W5_n427TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W5_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W5_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W5_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W5_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W5_A422TBM24_STUDY_ID = new long[1] ;
      BC000W4_A422TBM24_STUDY_ID = new long[1] ;
      BC000W6_A422TBM24_STUDY_ID = new long[1] ;
      BC000W6_A423TBM24_DOM_CD = new String[] {""} ;
      BC000W6_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W6_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W3_A423TBM24_DOM_CD = new String[] {""} ;
      BC000W3_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W3_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W3_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W3_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W3_A429TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W3_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W3_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W3_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W3_A432TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W3_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W3_A434TBM24_UPD_CNT = new long[1] ;
      BC000W3_n434TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W3_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W3_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W3_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W3_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W3_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W3_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W3_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W3_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W3_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W3_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W3_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W3_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W3_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W3_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W3_A547TBM24_TEXT = new String[] {""} ;
      BC000W3_n547TBM24_TEXT = new boolean[] {false} ;
      BC000W3_A548TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W3_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W3_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W3_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W3_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W3_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W3_A622TBM24_MIN_VALUE = new String[] {""} ;
      BC000W3_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W3_A623TBM24_MAX_VALUE = new String[] {""} ;
      BC000W3_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W3_A426TBM24_ORDER = new int[1] ;
      BC000W3_n426TBM24_ORDER = new boolean[] {false} ;
      BC000W3_A427TBM24_DEL_FLG = new String[] {""} ;
      BC000W3_n427TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W3_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W3_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W3_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W3_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W3_A422TBM24_STUDY_ID = new long[1] ;
      sMode31 = "" ;
      BC000W2_A423TBM24_DOM_CD = new String[] {""} ;
      BC000W2_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W2_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W2_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W2_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W2_A429TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W2_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W2_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W2_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W2_A432TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W2_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W2_A434TBM24_UPD_CNT = new long[1] ;
      BC000W2_n434TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W2_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W2_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W2_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W2_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W2_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W2_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W2_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W2_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W2_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W2_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W2_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W2_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W2_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W2_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W2_A547TBM24_TEXT = new String[] {""} ;
      BC000W2_n547TBM24_TEXT = new boolean[] {false} ;
      BC000W2_A548TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W2_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W2_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W2_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W2_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W2_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W2_A622TBM24_MIN_VALUE = new String[] {""} ;
      BC000W2_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W2_A623TBM24_MAX_VALUE = new String[] {""} ;
      BC000W2_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W2_A426TBM24_ORDER = new int[1] ;
      BC000W2_n426TBM24_ORDER = new boolean[] {false} ;
      BC000W2_A427TBM24_DEL_FLG = new String[] {""} ;
      BC000W2_n427TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W2_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W2_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W2_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W2_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W2_A422TBM24_STUDY_ID = new long[1] ;
      BC000W10_A423TBM24_DOM_CD = new String[] {""} ;
      BC000W10_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000W10_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000W10_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W10_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      BC000W10_A429TBM24_CRT_USER_ID = new String[] {""} ;
      BC000W10_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      BC000W10_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000W10_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      BC000W10_A432TBM24_UPD_USER_ID = new String[] {""} ;
      BC000W10_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      BC000W10_A434TBM24_UPD_CNT = new long[1] ;
      BC000W10_n434TBM24_UPD_CNT = new boolean[] {false} ;
      BC000W10_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000W10_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000W10_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000W10_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000W10_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000W10_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000W10_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      BC000W10_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      BC000W10_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      BC000W10_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      BC000W10_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      BC000W10_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000W10_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      BC000W10_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      BC000W10_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      BC000W10_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000W10_A547TBM24_TEXT = new String[] {""} ;
      BC000W10_n547TBM24_TEXT = new boolean[] {false} ;
      BC000W10_A548TBM24_FIXED_VALUE = new String[] {""} ;
      BC000W10_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      BC000W10_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000W10_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000W10_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000W10_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000W10_A622TBM24_MIN_VALUE = new String[] {""} ;
      BC000W10_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      BC000W10_A623TBM24_MAX_VALUE = new String[] {""} ;
      BC000W10_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      BC000W10_A426TBM24_ORDER = new int[1] ;
      BC000W10_n426TBM24_ORDER = new boolean[] {false} ;
      BC000W10_A427TBM24_DEL_FLG = new String[] {""} ;
      BC000W10_n427TBM24_DEL_FLG = new boolean[] {false} ;
      BC000W10_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      BC000W10_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      BC000W10_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      BC000W10_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      BC000W10_A422TBM24_STUDY_ID = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000W11_A422TBM24_STUDY_ID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm24_map_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000W2_A423TBM24_DOM_CD, BC000W2_A424TBM24_DOM_VAR_NM, BC000W2_A425TBM24_CRF_ITEM_DIV, BC000W2_A428TBM24_CRT_DATETIME, BC000W2_n428TBM24_CRT_DATETIME, BC000W2_A429TBM24_CRT_USER_ID, BC000W2_n429TBM24_CRT_USER_ID, BC000W2_A431TBM24_UPD_DATETIME, BC000W2_n431TBM24_UPD_DATETIME, BC000W2_A432TBM24_UPD_USER_ID,
            BC000W2_n432TBM24_UPD_USER_ID, BC000W2_A434TBM24_UPD_CNT, BC000W2_n434TBM24_UPD_CNT, BC000W2_A617TBM24_DOM_ITM_GRP_OID, BC000W2_n617TBM24_DOM_ITM_GRP_OID, BC000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W2_A619TBM24_DOM_ITM_GRP_ROWNO, BC000W2_n619TBM24_DOM_ITM_GRP_ROWNO, BC000W2_A620TBM24_CRF_ITEM_NM,
            BC000W2_n620TBM24_CRF_ITEM_NM, BC000W2_A543TBM24_IDENTIFICATION_CD, BC000W2_n543TBM24_IDENTIFICATION_CD, BC000W2_A544TBM24_TEXT_MAXLENGTH, BC000W2_n544TBM24_TEXT_MAXLENGTH, BC000W2_A545TBM24_TEXT_MAXROWS, BC000W2_n545TBM24_TEXT_MAXROWS, BC000W2_A546TBM24_DECIMAL_DIGITS, BC000W2_n546TBM24_DECIMAL_DIGITS, BC000W2_A547TBM24_TEXT,
            BC000W2_n547TBM24_TEXT, BC000W2_A548TBM24_FIXED_VALUE, BC000W2_n548TBM24_FIXED_VALUE, BC000W2_A549TBM24_CHK_FALSE_INNER_VALUE, BC000W2_n549TBM24_CHK_FALSE_INNER_VALUE, BC000W2_A621TBM24_REQUIRED_INPUT_FLG, BC000W2_n621TBM24_REQUIRED_INPUT_FLG, BC000W2_A622TBM24_MIN_VALUE, BC000W2_n622TBM24_MIN_VALUE, BC000W2_A623TBM24_MAX_VALUE,
            BC000W2_n623TBM24_MAX_VALUE, BC000W2_A426TBM24_ORDER, BC000W2_n426TBM24_ORDER, BC000W2_A427TBM24_DEL_FLG, BC000W2_n427TBM24_DEL_FLG, BC000W2_A430TBM24_CRT_PROG_NM, BC000W2_n430TBM24_CRT_PROG_NM, BC000W2_A433TBM24_UPD_PROG_NM, BC000W2_n433TBM24_UPD_PROG_NM, BC000W2_A422TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W3_A423TBM24_DOM_CD, BC000W3_A424TBM24_DOM_VAR_NM, BC000W3_A425TBM24_CRF_ITEM_DIV, BC000W3_A428TBM24_CRT_DATETIME, BC000W3_n428TBM24_CRT_DATETIME, BC000W3_A429TBM24_CRT_USER_ID, BC000W3_n429TBM24_CRT_USER_ID, BC000W3_A431TBM24_UPD_DATETIME, BC000W3_n431TBM24_UPD_DATETIME, BC000W3_A432TBM24_UPD_USER_ID,
            BC000W3_n432TBM24_UPD_USER_ID, BC000W3_A434TBM24_UPD_CNT, BC000W3_n434TBM24_UPD_CNT, BC000W3_A617TBM24_DOM_ITM_GRP_OID, BC000W3_n617TBM24_DOM_ITM_GRP_OID, BC000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W3_A619TBM24_DOM_ITM_GRP_ROWNO, BC000W3_n619TBM24_DOM_ITM_GRP_ROWNO, BC000W3_A620TBM24_CRF_ITEM_NM,
            BC000W3_n620TBM24_CRF_ITEM_NM, BC000W3_A543TBM24_IDENTIFICATION_CD, BC000W3_n543TBM24_IDENTIFICATION_CD, BC000W3_A544TBM24_TEXT_MAXLENGTH, BC000W3_n544TBM24_TEXT_MAXLENGTH, BC000W3_A545TBM24_TEXT_MAXROWS, BC000W3_n545TBM24_TEXT_MAXROWS, BC000W3_A546TBM24_DECIMAL_DIGITS, BC000W3_n546TBM24_DECIMAL_DIGITS, BC000W3_A547TBM24_TEXT,
            BC000W3_n547TBM24_TEXT, BC000W3_A548TBM24_FIXED_VALUE, BC000W3_n548TBM24_FIXED_VALUE, BC000W3_A549TBM24_CHK_FALSE_INNER_VALUE, BC000W3_n549TBM24_CHK_FALSE_INNER_VALUE, BC000W3_A621TBM24_REQUIRED_INPUT_FLG, BC000W3_n621TBM24_REQUIRED_INPUT_FLG, BC000W3_A622TBM24_MIN_VALUE, BC000W3_n622TBM24_MIN_VALUE, BC000W3_A623TBM24_MAX_VALUE,
            BC000W3_n623TBM24_MAX_VALUE, BC000W3_A426TBM24_ORDER, BC000W3_n426TBM24_ORDER, BC000W3_A427TBM24_DEL_FLG, BC000W3_n427TBM24_DEL_FLG, BC000W3_A430TBM24_CRT_PROG_NM, BC000W3_n430TBM24_CRT_PROG_NM, BC000W3_A433TBM24_UPD_PROG_NM, BC000W3_n433TBM24_UPD_PROG_NM, BC000W3_A422TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W4_A422TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W5_A423TBM24_DOM_CD, BC000W5_A424TBM24_DOM_VAR_NM, BC000W5_A425TBM24_CRF_ITEM_DIV, BC000W5_A428TBM24_CRT_DATETIME, BC000W5_n428TBM24_CRT_DATETIME, BC000W5_A429TBM24_CRT_USER_ID, BC000W5_n429TBM24_CRT_USER_ID, BC000W5_A431TBM24_UPD_DATETIME, BC000W5_n431TBM24_UPD_DATETIME, BC000W5_A432TBM24_UPD_USER_ID,
            BC000W5_n432TBM24_UPD_USER_ID, BC000W5_A434TBM24_UPD_CNT, BC000W5_n434TBM24_UPD_CNT, BC000W5_A617TBM24_DOM_ITM_GRP_OID, BC000W5_n617TBM24_DOM_ITM_GRP_OID, BC000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W5_A619TBM24_DOM_ITM_GRP_ROWNO, BC000W5_n619TBM24_DOM_ITM_GRP_ROWNO, BC000W5_A620TBM24_CRF_ITEM_NM,
            BC000W5_n620TBM24_CRF_ITEM_NM, BC000W5_A543TBM24_IDENTIFICATION_CD, BC000W5_n543TBM24_IDENTIFICATION_CD, BC000W5_A544TBM24_TEXT_MAXLENGTH, BC000W5_n544TBM24_TEXT_MAXLENGTH, BC000W5_A545TBM24_TEXT_MAXROWS, BC000W5_n545TBM24_TEXT_MAXROWS, BC000W5_A546TBM24_DECIMAL_DIGITS, BC000W5_n546TBM24_DECIMAL_DIGITS, BC000W5_A547TBM24_TEXT,
            BC000W5_n547TBM24_TEXT, BC000W5_A548TBM24_FIXED_VALUE, BC000W5_n548TBM24_FIXED_VALUE, BC000W5_A549TBM24_CHK_FALSE_INNER_VALUE, BC000W5_n549TBM24_CHK_FALSE_INNER_VALUE, BC000W5_A621TBM24_REQUIRED_INPUT_FLG, BC000W5_n621TBM24_REQUIRED_INPUT_FLG, BC000W5_A622TBM24_MIN_VALUE, BC000W5_n622TBM24_MIN_VALUE, BC000W5_A623TBM24_MAX_VALUE,
            BC000W5_n623TBM24_MAX_VALUE, BC000W5_A426TBM24_ORDER, BC000W5_n426TBM24_ORDER, BC000W5_A427TBM24_DEL_FLG, BC000W5_n427TBM24_DEL_FLG, BC000W5_A430TBM24_CRT_PROG_NM, BC000W5_n430TBM24_CRT_PROG_NM, BC000W5_A433TBM24_UPD_PROG_NM, BC000W5_n433TBM24_UPD_PROG_NM, BC000W5_A422TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W6_A422TBM24_STUDY_ID, BC000W6_A423TBM24_DOM_CD, BC000W6_A424TBM24_DOM_VAR_NM, BC000W6_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000W10_A423TBM24_DOM_CD, BC000W10_A424TBM24_DOM_VAR_NM, BC000W10_A425TBM24_CRF_ITEM_DIV, BC000W10_A428TBM24_CRT_DATETIME, BC000W10_n428TBM24_CRT_DATETIME, BC000W10_A429TBM24_CRT_USER_ID, BC000W10_n429TBM24_CRT_USER_ID, BC000W10_A431TBM24_UPD_DATETIME, BC000W10_n431TBM24_UPD_DATETIME, BC000W10_A432TBM24_UPD_USER_ID,
            BC000W10_n432TBM24_UPD_USER_ID, BC000W10_A434TBM24_UPD_CNT, BC000W10_n434TBM24_UPD_CNT, BC000W10_A617TBM24_DOM_ITM_GRP_OID, BC000W10_n617TBM24_DOM_ITM_GRP_OID, BC000W10_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W10_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, BC000W10_A619TBM24_DOM_ITM_GRP_ROWNO, BC000W10_n619TBM24_DOM_ITM_GRP_ROWNO, BC000W10_A620TBM24_CRF_ITEM_NM,
            BC000W10_n620TBM24_CRF_ITEM_NM, BC000W10_A543TBM24_IDENTIFICATION_CD, BC000W10_n543TBM24_IDENTIFICATION_CD, BC000W10_A544TBM24_TEXT_MAXLENGTH, BC000W10_n544TBM24_TEXT_MAXLENGTH, BC000W10_A545TBM24_TEXT_MAXROWS, BC000W10_n545TBM24_TEXT_MAXROWS, BC000W10_A546TBM24_DECIMAL_DIGITS, BC000W10_n546TBM24_DECIMAL_DIGITS, BC000W10_A547TBM24_TEXT,
            BC000W10_n547TBM24_TEXT, BC000W10_A548TBM24_FIXED_VALUE, BC000W10_n548TBM24_FIXED_VALUE, BC000W10_A549TBM24_CHK_FALSE_INNER_VALUE, BC000W10_n549TBM24_CHK_FALSE_INNER_VALUE, BC000W10_A621TBM24_REQUIRED_INPUT_FLG, BC000W10_n621TBM24_REQUIRED_INPUT_FLG, BC000W10_A622TBM24_MIN_VALUE, BC000W10_n622TBM24_MIN_VALUE, BC000W10_A623TBM24_MAX_VALUE,
            BC000W10_n623TBM24_MAX_VALUE, BC000W10_A426TBM24_ORDER, BC000W10_n426TBM24_ORDER, BC000W10_A427TBM24_DEL_FLG, BC000W10_n427TBM24_DEL_FLG, BC000W10_A430TBM24_CRT_PROG_NM, BC000W10_n430TBM24_CRT_PROG_NM, BC000W10_A433TBM24_UPD_PROG_NM, BC000W10_n433TBM24_UPD_PROG_NM, BC000W10_A422TBM24_STUDY_ID
            }
            , new Object[] {
            BC000W11_A422TBM24_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM24_MAP_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110W2 */
      e110W2 ();
   }

   private byte nKeyPressed ;
   private byte A545TBM24_TEXT_MAXROWS ;
   private byte A546TBM24_DECIMAL_DIGITS ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N ;
   private byte Z545TBM24_TEXT_MAXROWS ;
   private byte Z546TBM24_DECIMAL_DIGITS ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A619TBM24_DOM_ITM_GRP_ROWNO ;
   private short A544TBM24_TEXT_MAXLENGTH ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z ;
   private short Z618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z619TBM24_DOM_ITM_GRP_ROWNO ;
   private short Z544TBM24_TEXT_MAXLENGTH ;
   private short RcdFound31 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A426TBM24_ORDER ;
   private int gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z ;
   private int GX_JID ;
   private int Z426TBM24_ORDER ;
   private int AnyError422 ;
   private int GXActiveErrHndl ;
   private long Z422TBM24_STUDY_ID ;
   private long A422TBM24_STUDY_ID ;
   private long A434TBM24_UPD_CNT ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z ;
   private long Z434TBM24_UPD_CNT ;
   private long O434TBM24_UPD_CNT ;
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
   private java.util.Date A428TBM24_CRT_DATETIME ;
   private java.util.Date A431TBM24_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z ;
   private java.util.Date Z428TBM24_CRT_DATETIME ;
   private java.util.Date Z431TBM24_UPD_DATETIME ;
   private boolean n428TBM24_CRT_DATETIME ;
   private boolean n429TBM24_CRT_USER_ID ;
   private boolean n431TBM24_UPD_DATETIME ;
   private boolean n432TBM24_UPD_USER_ID ;
   private boolean n434TBM24_UPD_CNT ;
   private boolean n617TBM24_DOM_ITM_GRP_OID ;
   private boolean n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n620TBM24_CRF_ITEM_NM ;
   private boolean n543TBM24_IDENTIFICATION_CD ;
   private boolean n544TBM24_TEXT_MAXLENGTH ;
   private boolean n545TBM24_TEXT_MAXROWS ;
   private boolean n546TBM24_DECIMAL_DIGITS ;
   private boolean n547TBM24_TEXT ;
   private boolean n548TBM24_FIXED_VALUE ;
   private boolean n549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n621TBM24_REQUIRED_INPUT_FLG ;
   private boolean n622TBM24_MIN_VALUE ;
   private boolean n623TBM24_MAX_VALUE ;
   private boolean n426TBM24_ORDER ;
   private boolean n427TBM24_DEL_FLG ;
   private boolean n430TBM24_CRT_PROG_NM ;
   private boolean n433TBM24_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z423TBM24_DOM_CD ;
   private String A423TBM24_DOM_CD ;
   private String Z424TBM24_DOM_VAR_NM ;
   private String A424TBM24_DOM_VAR_NM ;
   private String Z425TBM24_CRF_ITEM_DIV ;
   private String A425TBM24_CRF_ITEM_DIV ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A617TBM24_DOM_ITM_GRP_OID ;
   private String A620TBM24_CRF_ITEM_NM ;
   private String A543TBM24_IDENTIFICATION_CD ;
   private String A547TBM24_TEXT ;
   private String A548TBM24_FIXED_VALUE ;
   private String A549TBM24_CHK_FALSE_INNER_VALUE ;
   private String A621TBM24_REQUIRED_INPUT_FLG ;
   private String A622TBM24_MIN_VALUE ;
   private String A623TBM24_MAX_VALUE ;
   private String A427TBM24_DEL_FLG ;
   private String A429TBM24_CRT_USER_ID ;
   private String A430TBM24_CRT_PROG_NM ;
   private String A432TBM24_UPD_USER_ID ;
   private String A433TBM24_UPD_PROG_NM ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z ;
   private String Z429TBM24_CRT_USER_ID ;
   private String Z432TBM24_UPD_USER_ID ;
   private String Z617TBM24_DOM_ITM_GRP_OID ;
   private String Z620TBM24_CRF_ITEM_NM ;
   private String Z543TBM24_IDENTIFICATION_CD ;
   private String Z547TBM24_TEXT ;
   private String Z548TBM24_FIXED_VALUE ;
   private String Z549TBM24_CHK_FALSE_INNER_VALUE ;
   private String Z621TBM24_REQUIRED_INPUT_FLG ;
   private String Z622TBM24_MIN_VALUE ;
   private String Z623TBM24_MAX_VALUE ;
   private String Z427TBM24_DEL_FLG ;
   private String Z430TBM24_CRT_PROG_NM ;
   private String Z433TBM24_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM24_MAP_ITEM bcTBM24_MAP_ITEM ;
   private IDataStoreProvider pr_default ;
   private String[] BC000W5_A423TBM24_DOM_CD ;
   private String[] BC000W5_A424TBM24_DOM_VAR_NM ;
   private String[] BC000W5_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W5_A428TBM24_CRT_DATETIME ;
   private boolean[] BC000W5_n428TBM24_CRT_DATETIME ;
   private String[] BC000W5_A429TBM24_CRT_USER_ID ;
   private boolean[] BC000W5_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W5_A431TBM24_UPD_DATETIME ;
   private boolean[] BC000W5_n431TBM24_UPD_DATETIME ;
   private String[] BC000W5_A432TBM24_UPD_USER_ID ;
   private boolean[] BC000W5_n432TBM24_UPD_USER_ID ;
   private long[] BC000W5_A434TBM24_UPD_CNT ;
   private boolean[] BC000W5_n434TBM24_UPD_CNT ;
   private String[] BC000W5_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W5_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W5_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W5_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W5_A620TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W5_n620TBM24_CRF_ITEM_NM ;
   private String[] BC000W5_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W5_n543TBM24_IDENTIFICATION_CD ;
   private short[] BC000W5_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W5_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W5_A545TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W5_n545TBM24_TEXT_MAXROWS ;
   private byte[] BC000W5_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W5_n546TBM24_DECIMAL_DIGITS ;
   private String[] BC000W5_A547TBM24_TEXT ;
   private boolean[] BC000W5_n547TBM24_TEXT ;
   private String[] BC000W5_A548TBM24_FIXED_VALUE ;
   private boolean[] BC000W5_n548TBM24_FIXED_VALUE ;
   private String[] BC000W5_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W5_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W5_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W5_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W5_A622TBM24_MIN_VALUE ;
   private boolean[] BC000W5_n622TBM24_MIN_VALUE ;
   private String[] BC000W5_A623TBM24_MAX_VALUE ;
   private boolean[] BC000W5_n623TBM24_MAX_VALUE ;
   private int[] BC000W5_A426TBM24_ORDER ;
   private boolean[] BC000W5_n426TBM24_ORDER ;
   private String[] BC000W5_A427TBM24_DEL_FLG ;
   private boolean[] BC000W5_n427TBM24_DEL_FLG ;
   private String[] BC000W5_A430TBM24_CRT_PROG_NM ;
   private boolean[] BC000W5_n430TBM24_CRT_PROG_NM ;
   private String[] BC000W5_A433TBM24_UPD_PROG_NM ;
   private boolean[] BC000W5_n433TBM24_UPD_PROG_NM ;
   private long[] BC000W5_A422TBM24_STUDY_ID ;
   private long[] BC000W4_A422TBM24_STUDY_ID ;
   private long[] BC000W6_A422TBM24_STUDY_ID ;
   private String[] BC000W6_A423TBM24_DOM_CD ;
   private String[] BC000W6_A424TBM24_DOM_VAR_NM ;
   private String[] BC000W6_A425TBM24_CRF_ITEM_DIV ;
   private String[] BC000W3_A423TBM24_DOM_CD ;
   private String[] BC000W3_A424TBM24_DOM_VAR_NM ;
   private String[] BC000W3_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W3_A428TBM24_CRT_DATETIME ;
   private boolean[] BC000W3_n428TBM24_CRT_DATETIME ;
   private String[] BC000W3_A429TBM24_CRT_USER_ID ;
   private boolean[] BC000W3_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W3_A431TBM24_UPD_DATETIME ;
   private boolean[] BC000W3_n431TBM24_UPD_DATETIME ;
   private String[] BC000W3_A432TBM24_UPD_USER_ID ;
   private boolean[] BC000W3_n432TBM24_UPD_USER_ID ;
   private long[] BC000W3_A434TBM24_UPD_CNT ;
   private boolean[] BC000W3_n434TBM24_UPD_CNT ;
   private String[] BC000W3_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W3_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W3_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W3_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W3_A620TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W3_n620TBM24_CRF_ITEM_NM ;
   private String[] BC000W3_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W3_n543TBM24_IDENTIFICATION_CD ;
   private short[] BC000W3_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W3_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W3_A545TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W3_n545TBM24_TEXT_MAXROWS ;
   private byte[] BC000W3_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W3_n546TBM24_DECIMAL_DIGITS ;
   private String[] BC000W3_A547TBM24_TEXT ;
   private boolean[] BC000W3_n547TBM24_TEXT ;
   private String[] BC000W3_A548TBM24_FIXED_VALUE ;
   private boolean[] BC000W3_n548TBM24_FIXED_VALUE ;
   private String[] BC000W3_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W3_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W3_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W3_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W3_A622TBM24_MIN_VALUE ;
   private boolean[] BC000W3_n622TBM24_MIN_VALUE ;
   private String[] BC000W3_A623TBM24_MAX_VALUE ;
   private boolean[] BC000W3_n623TBM24_MAX_VALUE ;
   private int[] BC000W3_A426TBM24_ORDER ;
   private boolean[] BC000W3_n426TBM24_ORDER ;
   private String[] BC000W3_A427TBM24_DEL_FLG ;
   private boolean[] BC000W3_n427TBM24_DEL_FLG ;
   private String[] BC000W3_A430TBM24_CRT_PROG_NM ;
   private boolean[] BC000W3_n430TBM24_CRT_PROG_NM ;
   private String[] BC000W3_A433TBM24_UPD_PROG_NM ;
   private boolean[] BC000W3_n433TBM24_UPD_PROG_NM ;
   private long[] BC000W3_A422TBM24_STUDY_ID ;
   private String[] BC000W2_A423TBM24_DOM_CD ;
   private String[] BC000W2_A424TBM24_DOM_VAR_NM ;
   private String[] BC000W2_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W2_A428TBM24_CRT_DATETIME ;
   private boolean[] BC000W2_n428TBM24_CRT_DATETIME ;
   private String[] BC000W2_A429TBM24_CRT_USER_ID ;
   private boolean[] BC000W2_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W2_A431TBM24_UPD_DATETIME ;
   private boolean[] BC000W2_n431TBM24_UPD_DATETIME ;
   private String[] BC000W2_A432TBM24_UPD_USER_ID ;
   private boolean[] BC000W2_n432TBM24_UPD_USER_ID ;
   private long[] BC000W2_A434TBM24_UPD_CNT ;
   private boolean[] BC000W2_n434TBM24_UPD_CNT ;
   private String[] BC000W2_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W2_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W2_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W2_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W2_A620TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W2_n620TBM24_CRF_ITEM_NM ;
   private String[] BC000W2_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W2_n543TBM24_IDENTIFICATION_CD ;
   private short[] BC000W2_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W2_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W2_A545TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W2_n545TBM24_TEXT_MAXROWS ;
   private byte[] BC000W2_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W2_n546TBM24_DECIMAL_DIGITS ;
   private String[] BC000W2_A547TBM24_TEXT ;
   private boolean[] BC000W2_n547TBM24_TEXT ;
   private String[] BC000W2_A548TBM24_FIXED_VALUE ;
   private boolean[] BC000W2_n548TBM24_FIXED_VALUE ;
   private String[] BC000W2_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W2_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W2_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W2_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W2_A622TBM24_MIN_VALUE ;
   private boolean[] BC000W2_n622TBM24_MIN_VALUE ;
   private String[] BC000W2_A623TBM24_MAX_VALUE ;
   private boolean[] BC000W2_n623TBM24_MAX_VALUE ;
   private int[] BC000W2_A426TBM24_ORDER ;
   private boolean[] BC000W2_n426TBM24_ORDER ;
   private String[] BC000W2_A427TBM24_DEL_FLG ;
   private boolean[] BC000W2_n427TBM24_DEL_FLG ;
   private String[] BC000W2_A430TBM24_CRT_PROG_NM ;
   private boolean[] BC000W2_n430TBM24_CRT_PROG_NM ;
   private String[] BC000W2_A433TBM24_UPD_PROG_NM ;
   private boolean[] BC000W2_n433TBM24_UPD_PROG_NM ;
   private long[] BC000W2_A422TBM24_STUDY_ID ;
   private String[] BC000W10_A423TBM24_DOM_CD ;
   private String[] BC000W10_A424TBM24_DOM_VAR_NM ;
   private String[] BC000W10_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] BC000W10_A428TBM24_CRT_DATETIME ;
   private boolean[] BC000W10_n428TBM24_CRT_DATETIME ;
   private String[] BC000W10_A429TBM24_CRT_USER_ID ;
   private boolean[] BC000W10_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] BC000W10_A431TBM24_UPD_DATETIME ;
   private boolean[] BC000W10_n431TBM24_UPD_DATETIME ;
   private String[] BC000W10_A432TBM24_UPD_USER_ID ;
   private boolean[] BC000W10_n432TBM24_UPD_USER_ID ;
   private long[] BC000W10_A434TBM24_UPD_CNT ;
   private boolean[] BC000W10_n434TBM24_UPD_CNT ;
   private String[] BC000W10_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] BC000W10_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] BC000W10_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000W10_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000W10_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000W10_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] BC000W10_A620TBM24_CRF_ITEM_NM ;
   private boolean[] BC000W10_n620TBM24_CRF_ITEM_NM ;
   private String[] BC000W10_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] BC000W10_n543TBM24_IDENTIFICATION_CD ;
   private short[] BC000W10_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] BC000W10_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] BC000W10_A545TBM24_TEXT_MAXROWS ;
   private boolean[] BC000W10_n545TBM24_TEXT_MAXROWS ;
   private byte[] BC000W10_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] BC000W10_n546TBM24_DECIMAL_DIGITS ;
   private String[] BC000W10_A547TBM24_TEXT ;
   private boolean[] BC000W10_n547TBM24_TEXT ;
   private String[] BC000W10_A548TBM24_FIXED_VALUE ;
   private boolean[] BC000W10_n548TBM24_FIXED_VALUE ;
   private String[] BC000W10_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000W10_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] BC000W10_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] BC000W10_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] BC000W10_A622TBM24_MIN_VALUE ;
   private boolean[] BC000W10_n622TBM24_MIN_VALUE ;
   private String[] BC000W10_A623TBM24_MAX_VALUE ;
   private boolean[] BC000W10_n623TBM24_MAX_VALUE ;
   private int[] BC000W10_A426TBM24_ORDER ;
   private boolean[] BC000W10_n426TBM24_ORDER ;
   private String[] BC000W10_A427TBM24_DEL_FLG ;
   private boolean[] BC000W10_n427TBM24_DEL_FLG ;
   private String[] BC000W10_A430TBM24_CRT_PROG_NM ;
   private boolean[] BC000W10_n430TBM24_CRT_PROG_NM ;
   private String[] BC000W10_A433TBM24_UPD_PROG_NM ;
   private boolean[] BC000W10_n433TBM24_UPD_PROG_NM ;
   private long[] BC000W10_A422TBM24_STUDY_ID ;
   private long[] BC000W11_A422TBM24_STUDY_ID ;
}

final  class tbm24_map_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000W2", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W3", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W4", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000W5", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000W6", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000W7", "INSERT INTO `TBM24_MAP_ITEM` (`TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000W8", "UPDATE `TBM24_MAP_ITEM` SET `TBM24_CRT_DATETIME`=?, `TBM24_CRT_USER_ID`=?, `TBM24_UPD_DATETIME`=?, `TBM24_UPD_USER_ID`=?, `TBM24_UPD_CNT`=?, `TBM24_DOM_ITM_GRP_OID`=?, `TBM24_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM24_DOM_ITM_GRP_ROWNO`=?, `TBM24_CRF_ITEM_NM`=?, `TBM24_IDENTIFICATION_CD`=?, `TBM24_TEXT_MAXLENGTH`=?, `TBM24_TEXT_MAXROWS`=?, `TBM24_DECIMAL_DIGITS`=?, `TBM24_TEXT`=?, `TBM24_FIXED_VALUE`=?, `TBM24_CHK_FALSE_INNER_VALUE`=?, `TBM24_REQUIRED_INPUT_FLG`=?, `TBM24_MIN_VALUE`=?, `TBM24_MAX_VALUE`=?, `TBM24_ORDER`=?, `TBM24_DEL_FLG`=?, `TBM24_CRT_PROG_NM`=?, `TBM24_UPD_PROG_NM`=?  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000W9", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000W10", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000W11", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               break;
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
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
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
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
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
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
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
               break;
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
               stmt.setVarchar(25, (String)parms[47], 2, false);
               stmt.setVarchar(26, (String)parms[48], 50, false);
               stmt.setVarchar(27, (String)parms[49], 20, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

