/*
               File: tbm03_cdisc_item_bc
        Description: CDISC項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:20.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm03_cdisc_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm03_cdisc_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm03_cdisc_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm03_cdisc_item_bc.class ));
   }

   public tbm03_cdisc_item_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0F14( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0F14( ) ;
      standaloneModal( ) ;
      addRow0F14( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120F2 */
         e120F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
            Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
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

   public void confirm_0F0( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0F14( ) ;
         }
         else
         {
            checkExtendedTable0F14( ) ;
            if ( AnyError == 0 )
            {
               zm0F14( 9) ;
            }
            closeExtendedTableCursors0F14( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110F2( )
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

   public void e120F2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A59TBM03_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A60TBM03_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A346TBM03_VAR_DESC + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A347TBM03_SDTM_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A348TBM03_CDASH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A532TBM03_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A349TBM03_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A688TBM03_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A350TBM03_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A61TBM03_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A359TBM03_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A360TBM03_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A361TBM03_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A362TBM03_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A363TBM03_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A364TBM03_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A365TBM03_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0F14( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z360TBM03_CRT_DATETIME = A360TBM03_CRT_DATETIME ;
         Z361TBM03_CRT_USER_ID = A361TBM03_CRT_USER_ID ;
         Z363TBM03_UPD_DATETIME = A363TBM03_UPD_DATETIME ;
         Z364TBM03_UPD_USER_ID = A364TBM03_UPD_USER_ID ;
         Z366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         Z346TBM03_VAR_DESC = A346TBM03_VAR_DESC ;
         Z347TBM03_SDTM_FLG = A347TBM03_SDTM_FLG ;
         Z348TBM03_CDASH_FLG = A348TBM03_CDASH_FLG ;
         Z532TBM03_INPUT_TYPE_DIV = A532TBM03_INPUT_TYPE_DIV ;
         Z349TBM03_REQUIRED_FLG = A349TBM03_REQUIRED_FLG ;
         Z688TBM03_SAS_FIELD_NM = A688TBM03_SAS_FIELD_NM ;
         Z709TBM03_ODM_DATA_TYPE = A709TBM03_ODM_DATA_TYPE ;
         Z350TBM03_NOTE = A350TBM03_NOTE ;
         Z61TBM03_ORDER = A61TBM03_ORDER ;
         Z932TBM03_VERSION = A932TBM03_VERSION ;
         Z359TBM03_DEL_FLG = A359TBM03_DEL_FLG ;
         Z362TBM03_CRT_PROG_NM = A362TBM03_CRT_PROG_NM ;
         Z365TBM03_UPD_PROG_NM = A365TBM03_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         Z360TBM03_CRT_DATETIME = A360TBM03_CRT_DATETIME ;
         Z361TBM03_CRT_USER_ID = A361TBM03_CRT_USER_ID ;
         Z363TBM03_UPD_DATETIME = A363TBM03_UPD_DATETIME ;
         Z364TBM03_UPD_USER_ID = A364TBM03_UPD_USER_ID ;
         Z366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         Z346TBM03_VAR_DESC = A346TBM03_VAR_DESC ;
         Z347TBM03_SDTM_FLG = A347TBM03_SDTM_FLG ;
         Z348TBM03_CDASH_FLG = A348TBM03_CDASH_FLG ;
         Z532TBM03_INPUT_TYPE_DIV = A532TBM03_INPUT_TYPE_DIV ;
         Z349TBM03_REQUIRED_FLG = A349TBM03_REQUIRED_FLG ;
         Z688TBM03_SAS_FIELD_NM = A688TBM03_SAS_FIELD_NM ;
         Z709TBM03_ODM_DATA_TYPE = A709TBM03_ODM_DATA_TYPE ;
         Z350TBM03_NOTE = A350TBM03_NOTE ;
         Z61TBM03_ORDER = A61TBM03_ORDER ;
         Z932TBM03_VERSION = A932TBM03_VERSION ;
         Z359TBM03_DEL_FLG = A359TBM03_DEL_FLG ;
         Z362TBM03_CRT_PROG_NM = A362TBM03_CRT_PROG_NM ;
         Z365TBM03_UPD_PROG_NM = A365TBM03_UPD_PROG_NM ;
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0F14( )
   {
      /* Using cursor BC000F5 */
      pr_default.execute(3, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A360TBM03_CRT_DATETIME = BC000F5_A360TBM03_CRT_DATETIME[0] ;
         n360TBM03_CRT_DATETIME = BC000F5_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = BC000F5_A361TBM03_CRT_USER_ID[0] ;
         n361TBM03_CRT_USER_ID = BC000F5_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = BC000F5_A363TBM03_UPD_DATETIME[0] ;
         n363TBM03_UPD_DATETIME = BC000F5_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = BC000F5_A364TBM03_UPD_USER_ID[0] ;
         n364TBM03_UPD_USER_ID = BC000F5_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = BC000F5_A366TBM03_UPD_CNT[0] ;
         n366TBM03_UPD_CNT = BC000F5_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = BC000F5_A346TBM03_VAR_DESC[0] ;
         n346TBM03_VAR_DESC = BC000F5_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = BC000F5_A347TBM03_SDTM_FLG[0] ;
         n347TBM03_SDTM_FLG = BC000F5_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = BC000F5_A348TBM03_CDASH_FLG[0] ;
         n348TBM03_CDASH_FLG = BC000F5_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = BC000F5_A532TBM03_INPUT_TYPE_DIV[0] ;
         n532TBM03_INPUT_TYPE_DIV = BC000F5_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = BC000F5_A349TBM03_REQUIRED_FLG[0] ;
         n349TBM03_REQUIRED_FLG = BC000F5_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = BC000F5_A688TBM03_SAS_FIELD_NM[0] ;
         n688TBM03_SAS_FIELD_NM = BC000F5_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = BC000F5_A709TBM03_ODM_DATA_TYPE[0] ;
         n709TBM03_ODM_DATA_TYPE = BC000F5_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = BC000F5_A350TBM03_NOTE[0] ;
         n350TBM03_NOTE = BC000F5_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = BC000F5_A61TBM03_ORDER[0] ;
         n61TBM03_ORDER = BC000F5_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = BC000F5_A932TBM03_VERSION[0] ;
         n932TBM03_VERSION = BC000F5_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = BC000F5_A359TBM03_DEL_FLG[0] ;
         n359TBM03_DEL_FLG = BC000F5_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = BC000F5_A362TBM03_CRT_PROG_NM[0] ;
         n362TBM03_CRT_PROG_NM = BC000F5_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = BC000F5_A365TBM03_UPD_PROG_NM[0] ;
         n365TBM03_UPD_PROG_NM = BC000F5_n365TBM03_UPD_PROG_NM[0] ;
         zm0F14( -8) ;
      }
      pr_default.close(3);
      onLoadActions0F14( ) ;
   }

   public void onLoadActions0F14( )
   {
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
   }

   public void checkExtendedTable0F14( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      /* Using cursor BC000F4 */
      pr_default.execute(2, new Object[] {A59TBM03_DOM_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A360TBM03_CRT_DATETIME) || (( A360TBM03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A360TBM03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A363TBM03_UPD_DATETIME) || (( A363TBM03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A363TBM03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0F14( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0F14( )
   {
      /* Using cursor BC000F6 */
      pr_default.execute(4, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000F3 */
      pr_default.execute(1, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F14( 8) ;
         RcdFound14 = (short)(1) ;
         A60TBM03_DOM_VAR_NM = BC000F3_A60TBM03_DOM_VAR_NM[0] ;
         A360TBM03_CRT_DATETIME = BC000F3_A360TBM03_CRT_DATETIME[0] ;
         n360TBM03_CRT_DATETIME = BC000F3_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = BC000F3_A361TBM03_CRT_USER_ID[0] ;
         n361TBM03_CRT_USER_ID = BC000F3_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = BC000F3_A363TBM03_UPD_DATETIME[0] ;
         n363TBM03_UPD_DATETIME = BC000F3_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = BC000F3_A364TBM03_UPD_USER_ID[0] ;
         n364TBM03_UPD_USER_ID = BC000F3_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = BC000F3_A366TBM03_UPD_CNT[0] ;
         n366TBM03_UPD_CNT = BC000F3_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = BC000F3_A346TBM03_VAR_DESC[0] ;
         n346TBM03_VAR_DESC = BC000F3_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = BC000F3_A347TBM03_SDTM_FLG[0] ;
         n347TBM03_SDTM_FLG = BC000F3_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = BC000F3_A348TBM03_CDASH_FLG[0] ;
         n348TBM03_CDASH_FLG = BC000F3_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = BC000F3_A532TBM03_INPUT_TYPE_DIV[0] ;
         n532TBM03_INPUT_TYPE_DIV = BC000F3_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = BC000F3_A349TBM03_REQUIRED_FLG[0] ;
         n349TBM03_REQUIRED_FLG = BC000F3_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = BC000F3_A688TBM03_SAS_FIELD_NM[0] ;
         n688TBM03_SAS_FIELD_NM = BC000F3_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = BC000F3_A709TBM03_ODM_DATA_TYPE[0] ;
         n709TBM03_ODM_DATA_TYPE = BC000F3_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = BC000F3_A350TBM03_NOTE[0] ;
         n350TBM03_NOTE = BC000F3_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = BC000F3_A61TBM03_ORDER[0] ;
         n61TBM03_ORDER = BC000F3_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = BC000F3_A932TBM03_VERSION[0] ;
         n932TBM03_VERSION = BC000F3_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = BC000F3_A359TBM03_DEL_FLG[0] ;
         n359TBM03_DEL_FLG = BC000F3_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = BC000F3_A362TBM03_CRT_PROG_NM[0] ;
         n362TBM03_CRT_PROG_NM = BC000F3_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = BC000F3_A365TBM03_UPD_PROG_NM[0] ;
         n365TBM03_UPD_PROG_NM = BC000F3_n365TBM03_UPD_PROG_NM[0] ;
         A59TBM03_DOM_CD = BC000F3_A59TBM03_DOM_CD[0] ;
         O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         n366TBM03_UPD_CNT = false ;
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0F14( ) ;
         if ( AnyError == 1 )
         {
            RcdFound14 = (short)(0) ;
            initializeNonKey0F14( ) ;
         }
         Gx_mode = sMode14 ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKey0F14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode14 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0F14( ) ;
      if ( RcdFound14 == 0 )
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
      confirm_0F0( ) ;
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

   public void checkOptimisticConcurrency0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000F2 */
         pr_default.execute(0, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z360TBM03_CRT_DATETIME.equals( BC000F2_A360TBM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z361TBM03_CRT_USER_ID, BC000F2_A361TBM03_CRT_USER_ID[0]) != 0 ) || !( Z363TBM03_UPD_DATETIME.equals( BC000F2_A363TBM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z364TBM03_UPD_USER_ID, BC000F2_A364TBM03_UPD_USER_ID[0]) != 0 ) || ( Z366TBM03_UPD_CNT != BC000F2_A366TBM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z346TBM03_VAR_DESC, BC000F2_A346TBM03_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z347TBM03_SDTM_FLG, BC000F2_A347TBM03_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z348TBM03_CDASH_FLG, BC000F2_A348TBM03_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z532TBM03_INPUT_TYPE_DIV, BC000F2_A532TBM03_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z349TBM03_REQUIRED_FLG, BC000F2_A349TBM03_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z688TBM03_SAS_FIELD_NM, BC000F2_A688TBM03_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z709TBM03_ODM_DATA_TYPE, BC000F2_A709TBM03_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z350TBM03_NOTE, BC000F2_A350TBM03_NOTE[0]) != 0 ) || ( Z61TBM03_ORDER != BC000F2_A61TBM03_ORDER[0] ) || ( GXutil.strcmp(Z932TBM03_VERSION, BC000F2_A932TBM03_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z359TBM03_DEL_FLG, BC000F2_A359TBM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z362TBM03_CRT_PROG_NM, BC000F2_A362TBM03_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z365TBM03_UPD_PROG_NM, BC000F2_A365TBM03_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM03_CDISC_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F14( 0) ;
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000F7 */
                  pr_default.execute(5, new Object[] {A60TBM03_DOM_VAR_NM, new Boolean(n360TBM03_CRT_DATETIME), A360TBM03_CRT_DATETIME, new Boolean(n361TBM03_CRT_USER_ID), A361TBM03_CRT_USER_ID, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT), new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n362TBM03_CRT_PROG_NM), A362TBM03_CRT_PROG_NM, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, A59TBM03_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
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
            load0F14( ) ;
         }
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void update0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000F8 */
                  pr_default.execute(6, new Object[] {new Boolean(n360TBM03_CRT_DATETIME), A360TBM03_CRT_DATETIME, new Boolean(n361TBM03_CRT_USER_ID), A361TBM03_CRT_USER_ID, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT), new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n362TBM03_CRT_PROG_NM), A362TBM03_CRT_PROG_NM, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F14( ) ;
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
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void deferredUpdate0F14( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F14( ) ;
         afterConfirm0F14( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F14( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000F9 */
               pr_default.execute(7, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
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
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0F14( ) ;
      Gx_mode = sMode14 ;
   }

   public void onDeleteControls0F14( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      }
   }

   public void endLevel0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0F14( ) ;
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

   public void scanKeyStart0F14( )
   {
      /* Scan By routine */
      /* Using cursor BC000F10 */
      pr_default.execute(8, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A60TBM03_DOM_VAR_NM = BC000F10_A60TBM03_DOM_VAR_NM[0] ;
         A360TBM03_CRT_DATETIME = BC000F10_A360TBM03_CRT_DATETIME[0] ;
         n360TBM03_CRT_DATETIME = BC000F10_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = BC000F10_A361TBM03_CRT_USER_ID[0] ;
         n361TBM03_CRT_USER_ID = BC000F10_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = BC000F10_A363TBM03_UPD_DATETIME[0] ;
         n363TBM03_UPD_DATETIME = BC000F10_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = BC000F10_A364TBM03_UPD_USER_ID[0] ;
         n364TBM03_UPD_USER_ID = BC000F10_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = BC000F10_A366TBM03_UPD_CNT[0] ;
         n366TBM03_UPD_CNT = BC000F10_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = BC000F10_A346TBM03_VAR_DESC[0] ;
         n346TBM03_VAR_DESC = BC000F10_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = BC000F10_A347TBM03_SDTM_FLG[0] ;
         n347TBM03_SDTM_FLG = BC000F10_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = BC000F10_A348TBM03_CDASH_FLG[0] ;
         n348TBM03_CDASH_FLG = BC000F10_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = BC000F10_A532TBM03_INPUT_TYPE_DIV[0] ;
         n532TBM03_INPUT_TYPE_DIV = BC000F10_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = BC000F10_A349TBM03_REQUIRED_FLG[0] ;
         n349TBM03_REQUIRED_FLG = BC000F10_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = BC000F10_A688TBM03_SAS_FIELD_NM[0] ;
         n688TBM03_SAS_FIELD_NM = BC000F10_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = BC000F10_A709TBM03_ODM_DATA_TYPE[0] ;
         n709TBM03_ODM_DATA_TYPE = BC000F10_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = BC000F10_A350TBM03_NOTE[0] ;
         n350TBM03_NOTE = BC000F10_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = BC000F10_A61TBM03_ORDER[0] ;
         n61TBM03_ORDER = BC000F10_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = BC000F10_A932TBM03_VERSION[0] ;
         n932TBM03_VERSION = BC000F10_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = BC000F10_A359TBM03_DEL_FLG[0] ;
         n359TBM03_DEL_FLG = BC000F10_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = BC000F10_A362TBM03_CRT_PROG_NM[0] ;
         n362TBM03_CRT_PROG_NM = BC000F10_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = BC000F10_A365TBM03_UPD_PROG_NM[0] ;
         n365TBM03_UPD_PROG_NM = BC000F10_n365TBM03_UPD_PROG_NM[0] ;
         A59TBM03_DOM_CD = BC000F10_A59TBM03_DOM_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0F14( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound14 = (short)(0) ;
      scanKeyLoad0F14( ) ;
   }

   public void scanKeyLoad0F14( )
   {
      sMode14 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A60TBM03_DOM_VAR_NM = BC000F10_A60TBM03_DOM_VAR_NM[0] ;
         A360TBM03_CRT_DATETIME = BC000F10_A360TBM03_CRT_DATETIME[0] ;
         n360TBM03_CRT_DATETIME = BC000F10_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = BC000F10_A361TBM03_CRT_USER_ID[0] ;
         n361TBM03_CRT_USER_ID = BC000F10_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = BC000F10_A363TBM03_UPD_DATETIME[0] ;
         n363TBM03_UPD_DATETIME = BC000F10_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = BC000F10_A364TBM03_UPD_USER_ID[0] ;
         n364TBM03_UPD_USER_ID = BC000F10_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = BC000F10_A366TBM03_UPD_CNT[0] ;
         n366TBM03_UPD_CNT = BC000F10_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = BC000F10_A346TBM03_VAR_DESC[0] ;
         n346TBM03_VAR_DESC = BC000F10_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = BC000F10_A347TBM03_SDTM_FLG[0] ;
         n347TBM03_SDTM_FLG = BC000F10_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = BC000F10_A348TBM03_CDASH_FLG[0] ;
         n348TBM03_CDASH_FLG = BC000F10_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = BC000F10_A532TBM03_INPUT_TYPE_DIV[0] ;
         n532TBM03_INPUT_TYPE_DIV = BC000F10_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = BC000F10_A349TBM03_REQUIRED_FLG[0] ;
         n349TBM03_REQUIRED_FLG = BC000F10_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = BC000F10_A688TBM03_SAS_FIELD_NM[0] ;
         n688TBM03_SAS_FIELD_NM = BC000F10_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = BC000F10_A709TBM03_ODM_DATA_TYPE[0] ;
         n709TBM03_ODM_DATA_TYPE = BC000F10_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = BC000F10_A350TBM03_NOTE[0] ;
         n350TBM03_NOTE = BC000F10_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = BC000F10_A61TBM03_ORDER[0] ;
         n61TBM03_ORDER = BC000F10_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = BC000F10_A932TBM03_VERSION[0] ;
         n932TBM03_VERSION = BC000F10_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = BC000F10_A359TBM03_DEL_FLG[0] ;
         n359TBM03_DEL_FLG = BC000F10_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = BC000F10_A362TBM03_CRT_PROG_NM[0] ;
         n362TBM03_CRT_PROG_NM = BC000F10_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = BC000F10_A365TBM03_UPD_PROG_NM[0] ;
         n365TBM03_UPD_PROG_NM = BC000F10_n365TBM03_UPD_PROG_NM[0] ;
         A59TBM03_DOM_CD = BC000F10_A59TBM03_DOM_CD[0] ;
      }
      Gx_mode = sMode14 ;
   }

   public void scanKeyEnd0F14( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0F14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F14( )
   {
      /* Before Insert Rules */
      A360TBM03_CRT_DATETIME = GXutil.now( ) ;
      n360TBM03_CRT_DATETIME = false ;
      GXt_char1 = A361TBM03_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A361TBM03_CRT_USER_ID = GXt_char1 ;
      n361TBM03_CRT_USER_ID = false ;
      A363TBM03_UPD_DATETIME = GXutil.now( ) ;
      n363TBM03_UPD_DATETIME = false ;
      GXt_char1 = A364TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A364TBM03_UPD_USER_ID = GXt_char1 ;
      n364TBM03_UPD_USER_ID = false ;
      A366TBM03_UPD_CNT = (long)(O366TBM03_UPD_CNT+1) ;
      n366TBM03_UPD_CNT = false ;
   }

   public void beforeUpdate0F14( )
   {
      /* Before Update Rules */
      A363TBM03_UPD_DATETIME = GXutil.now( ) ;
      n363TBM03_UPD_DATETIME = false ;
      GXt_char1 = A364TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A364TBM03_UPD_USER_ID = GXt_char1 ;
      n364TBM03_UPD_USER_ID = false ;
      A366TBM03_UPD_CNT = (long)(O366TBM03_UPD_CNT+1) ;
      n366TBM03_UPD_CNT = false ;
   }

   public void beforeDelete0F14( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F14( )
   {
   }

   public void addRow0F14( )
   {
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
   }

   public void readRow0F14( )
   {
      RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
   }

   public void initializeNonKey0F14( )
   {
      A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n360TBM03_CRT_DATETIME = false ;
      A361TBM03_CRT_USER_ID = "" ;
      n361TBM03_CRT_USER_ID = false ;
      A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n363TBM03_UPD_DATETIME = false ;
      A364TBM03_UPD_USER_ID = "" ;
      n364TBM03_UPD_USER_ID = false ;
      A366TBM03_UPD_CNT = 0 ;
      n366TBM03_UPD_CNT = false ;
      A346TBM03_VAR_DESC = "" ;
      n346TBM03_VAR_DESC = false ;
      A347TBM03_SDTM_FLG = "" ;
      n347TBM03_SDTM_FLG = false ;
      A348TBM03_CDASH_FLG = "" ;
      n348TBM03_CDASH_FLG = false ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      n532TBM03_INPUT_TYPE_DIV = false ;
      A349TBM03_REQUIRED_FLG = "" ;
      n349TBM03_REQUIRED_FLG = false ;
      A688TBM03_SAS_FIELD_NM = "" ;
      n688TBM03_SAS_FIELD_NM = false ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      n709TBM03_ODM_DATA_TYPE = false ;
      A350TBM03_NOTE = "" ;
      n350TBM03_NOTE = false ;
      A61TBM03_ORDER = 0 ;
      n61TBM03_ORDER = false ;
      A932TBM03_VERSION = "" ;
      n932TBM03_VERSION = false ;
      A359TBM03_DEL_FLG = "" ;
      n359TBM03_DEL_FLG = false ;
      A362TBM03_CRT_PROG_NM = "" ;
      n362TBM03_CRT_PROG_NM = false ;
      A365TBM03_UPD_PROG_NM = "" ;
      n365TBM03_UPD_PROG_NM = false ;
      O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
      n366TBM03_UPD_CNT = false ;
   }

   public void initAll0F14( )
   {
      A59TBM03_DOM_CD = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      initializeNonKey0F14( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow14( SdtTBM03_CDISC_ITEM obj14 )
   {
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime( A360TBM03_CRT_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id( A361TBM03_CRT_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime( A363TBM03_UPD_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id( A364TBM03_UPD_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt( A366TBM03_UPD_CNT );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc( A346TBM03_VAR_DESC );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg( A347TBM03_SDTM_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg( A348TBM03_CDASH_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div( A532TBM03_INPUT_TYPE_DIV );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg( A349TBM03_REQUIRED_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm( A688TBM03_SAS_FIELD_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type( A709TBM03_ODM_DATA_TYPE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note( A350TBM03_NOTE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order( A61TBM03_ORDER );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version( A932TBM03_VERSION );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg( A359TBM03_DEL_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm( A362TBM03_CRT_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( A365TBM03_UPD_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( A59TBM03_DOM_CD );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm( A60TBM03_DOM_VAR_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z( Z59TBM03_DOM_CD );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z( Z60TBM03_DOM_VAR_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z( Z346TBM03_VAR_DESC );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z( Z347TBM03_SDTM_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z( Z348TBM03_CDASH_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z( Z532TBM03_INPUT_TYPE_DIV );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z( Z349TBM03_REQUIRED_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z( Z688TBM03_SAS_FIELD_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z( Z709TBM03_ODM_DATA_TYPE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z( Z350TBM03_NOTE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z( Z61TBM03_ORDER );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z( Z932TBM03_VERSION );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z( Z359TBM03_DEL_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z( Z360TBM03_CRT_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z( Z361TBM03_CRT_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z( Z362TBM03_CRT_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z( Z363TBM03_UPD_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z( Z364TBM03_UPD_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z( Z365TBM03_UPD_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z( Z366TBM03_UPD_CNT );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N( (byte)((byte)((n346TBM03_VAR_DESC)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N( (byte)((byte)((n347TBM03_SDTM_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N( (byte)((byte)((n348TBM03_CDASH_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N( (byte)((byte)((n532TBM03_INPUT_TYPE_DIV)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N( (byte)((byte)((n349TBM03_REQUIRED_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N( (byte)((byte)((n688TBM03_SAS_FIELD_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N( (byte)((byte)((n709TBM03_ODM_DATA_TYPE)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N( (byte)((byte)((n350TBM03_NOTE)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N( (byte)((byte)((n61TBM03_ORDER)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N( (byte)((byte)((n932TBM03_VERSION)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N( (byte)((byte)((n359TBM03_DEL_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N( (byte)((byte)((n360TBM03_CRT_DATETIME)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N( (byte)((byte)((n361TBM03_CRT_USER_ID)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N( (byte)((byte)((n362TBM03_CRT_PROG_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N( (byte)((byte)((n363TBM03_UPD_DATETIME)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N( (byte)((byte)((n364TBM03_UPD_USER_ID)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N( (byte)((byte)((n365TBM03_UPD_PROG_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N( (byte)((byte)((n366TBM03_UPD_CNT)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
   }

   public void KeyVarsToRow14( SdtTBM03_CDISC_ITEM obj14 )
   {
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( A59TBM03_DOM_CD );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm( A60TBM03_DOM_VAR_NM );
   }

   public void RowToVars14( SdtTBM03_CDISC_ITEM obj14 ,
                            int forceLoad )
   {
      Gx_mode = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
      A360TBM03_CRT_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime() ;
      n360TBM03_CRT_DATETIME = false ;
      A361TBM03_CRT_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id() ;
      n361TBM03_CRT_USER_ID = false ;
      A363TBM03_UPD_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime() ;
      n363TBM03_UPD_DATETIME = false ;
      A364TBM03_UPD_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id() ;
      n364TBM03_UPD_USER_ID = false ;
      A366TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt() ;
      n366TBM03_UPD_CNT = false ;
      A346TBM03_VAR_DESC = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc() ;
      n346TBM03_VAR_DESC = false ;
      A347TBM03_SDTM_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg() ;
      n347TBM03_SDTM_FLG = false ;
      A348TBM03_CDASH_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg() ;
      n348TBM03_CDASH_FLG = false ;
      A532TBM03_INPUT_TYPE_DIV = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div() ;
      n532TBM03_INPUT_TYPE_DIV = false ;
      A349TBM03_REQUIRED_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg() ;
      n349TBM03_REQUIRED_FLG = false ;
      A688TBM03_SAS_FIELD_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm() ;
      n688TBM03_SAS_FIELD_NM = false ;
      A709TBM03_ODM_DATA_TYPE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type() ;
      n709TBM03_ODM_DATA_TYPE = false ;
      A350TBM03_NOTE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note() ;
      n350TBM03_NOTE = false ;
      A61TBM03_ORDER = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order() ;
      n61TBM03_ORDER = false ;
      A932TBM03_VERSION = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version() ;
      n932TBM03_VERSION = false ;
      A359TBM03_DEL_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg() ;
      n359TBM03_DEL_FLG = false ;
      A362TBM03_CRT_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm() ;
      n362TBM03_CRT_PROG_NM = false ;
      A365TBM03_UPD_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm() ;
      n365TBM03_UPD_PROG_NM = false ;
      A59TBM03_DOM_CD = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd() ;
      A60TBM03_DOM_VAR_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm() ;
      Z59TBM03_DOM_CD = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z() ;
      Z60TBM03_DOM_VAR_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z() ;
      Z346TBM03_VAR_DESC = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z() ;
      Z347TBM03_SDTM_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z() ;
      Z348TBM03_CDASH_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z() ;
      Z532TBM03_INPUT_TYPE_DIV = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z() ;
      Z349TBM03_REQUIRED_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z() ;
      Z688TBM03_SAS_FIELD_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z() ;
      Z709TBM03_ODM_DATA_TYPE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z() ;
      Z350TBM03_NOTE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z() ;
      Z61TBM03_ORDER = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z() ;
      Z932TBM03_VERSION = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z() ;
      Z359TBM03_DEL_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z() ;
      Z360TBM03_CRT_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z() ;
      Z361TBM03_CRT_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z() ;
      Z362TBM03_CRT_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z() ;
      Z363TBM03_UPD_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z() ;
      Z364TBM03_UPD_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z() ;
      Z365TBM03_UPD_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z() ;
      Z366TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z() ;
      O366TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z() ;
      n346TBM03_VAR_DESC = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N()==0)?false:true) ;
      n347TBM03_SDTM_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N()==0)?false:true) ;
      n348TBM03_CDASH_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N()==0)?false:true) ;
      n532TBM03_INPUT_TYPE_DIV = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N()==0)?false:true) ;
      n349TBM03_REQUIRED_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N()==0)?false:true) ;
      n688TBM03_SAS_FIELD_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N()==0)?false:true) ;
      n709TBM03_ODM_DATA_TYPE = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N()==0)?false:true) ;
      n350TBM03_NOTE = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N()==0)?false:true) ;
      n61TBM03_ORDER = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N()==0)?false:true) ;
      n932TBM03_VERSION = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N()==0)?false:true) ;
      n359TBM03_DEL_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N()==0)?false:true) ;
      n360TBM03_CRT_DATETIME = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N()==0)?false:true) ;
      n361TBM03_CRT_USER_ID = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N()==0)?false:true) ;
      n362TBM03_CRT_PROG_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N()==0)?false:true) ;
      n363TBM03_UPD_DATETIME = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N()==0)?false:true) ;
      n364TBM03_UPD_USER_ID = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N()==0)?false:true) ;
      n365TBM03_UPD_PROG_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N()==0)?false:true) ;
      n366TBM03_UPD_CNT = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A59TBM03_DOM_CD = (String)getParm(obj,0) ;
      A60TBM03_DOM_VAR_NM = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0F14( ) ;
      scanKeyStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000F4 */
         pr_default.execute(2, new Object[] {A59TBM03_DOM_CD});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         n366TBM03_UPD_CNT = false ;
      }
      zm0F14( -8) ;
      onLoadActions0F14( ) ;
      addRow0F14( ) ;
      scanKeyEnd0F14( ) ;
      if ( RcdFound14 == 0 )
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
      RowToVars14( bcTBM03_CDISC_ITEM, 0) ;
      scanKeyStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000F4 */
         pr_default.execute(2, new Object[] {A59TBM03_DOM_CD});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         n366TBM03_UPD_CNT = false ;
      }
      zm0F14( -8) ;
      onLoadActions0F14( ) ;
      addRow0F14( ) ;
      scanKeyEnd0F14( ) ;
      if ( RcdFound14 == 0 )
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
      RowToVars14( bcTBM03_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0F14( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0F14( ) ;
      }
      else
      {
         if ( RcdFound14 == 1 )
         {
            if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
            {
               A59TBM03_DOM_CD = Z59TBM03_DOM_CD ;
               A60TBM03_DOM_VAR_NM = Z60TBM03_DOM_VAR_NM ;
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
               update0F14( ) ;
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
               if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
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
                     insert0F14( ) ;
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
                     insert0F14( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars14( bcTBM03_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0F14( ) ;
      if ( RcdFound14 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
         {
            A59TBM03_DOM_CD = Z59TBM03_DOM_CD ;
            A60TBM03_DOM_VAR_NM = Z60TBM03_DOM_VAR_NM ;
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
         if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm03_cdisc_item_bc");
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
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
      Gx_mode = bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM03_CDISC_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM03_CDISC_ITEM )
      {
         bcTBM03_CDISC_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow14( bcTBM03_CDISC_ITEM) ;
         }
         else
         {
            RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
   }

   public SdtTBM03_CDISC_ITEM getTBM03_CDISC_ITEM_BC( )
   {
      return bcTBM03_CDISC_ITEM ;
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
      Z59TBM03_DOM_CD = "" ;
      A59TBM03_DOM_CD = "" ;
      Z60TBM03_DOM_VAR_NM = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A346TBM03_VAR_DESC = "" ;
      A347TBM03_SDTM_FLG = "" ;
      A348TBM03_CDASH_FLG = "" ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      A349TBM03_REQUIRED_FLG = "" ;
      A688TBM03_SAS_FIELD_NM = "" ;
      A350TBM03_NOTE = "" ;
      A359TBM03_DEL_FLG = "" ;
      A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A361TBM03_CRT_USER_ID = "" ;
      A362TBM03_CRT_PROG_NM = "" ;
      A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A364TBM03_UPD_USER_ID = "" ;
      A365TBM03_UPD_PROG_NM = "" ;
      Z360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z361TBM03_CRT_USER_ID = "" ;
      Z363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z364TBM03_UPD_USER_ID = "" ;
      Z346TBM03_VAR_DESC = "" ;
      Z347TBM03_SDTM_FLG = "" ;
      Z348TBM03_CDASH_FLG = "" ;
      Z532TBM03_INPUT_TYPE_DIV = "" ;
      Z349TBM03_REQUIRED_FLG = "" ;
      Z688TBM03_SAS_FIELD_NM = "" ;
      Z709TBM03_ODM_DATA_TYPE = "" ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      Z350TBM03_NOTE = "" ;
      Z932TBM03_VERSION = "" ;
      A932TBM03_VERSION = "" ;
      Z359TBM03_DEL_FLG = "" ;
      Z362TBM03_CRT_PROG_NM = "" ;
      Z365TBM03_UPD_PROG_NM = "" ;
      BC000F5_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F5_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F5_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F5_A361TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F5_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F5_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F5_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F5_A364TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F5_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F5_A366TBM03_UPD_CNT = new long[1] ;
      BC000F5_n366TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F5_A346TBM03_VAR_DESC = new String[] {""} ;
      BC000F5_n346TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F5_A347TBM03_SDTM_FLG = new String[] {""} ;
      BC000F5_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F5_A348TBM03_CDASH_FLG = new String[] {""} ;
      BC000F5_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F5_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F5_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F5_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F5_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F5_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F5_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F5_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F5_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F5_A350TBM03_NOTE = new String[] {""} ;
      BC000F5_n350TBM03_NOTE = new boolean[] {false} ;
      BC000F5_A61TBM03_ORDER = new int[1] ;
      BC000F5_n61TBM03_ORDER = new boolean[] {false} ;
      BC000F5_A932TBM03_VERSION = new String[] {""} ;
      BC000F5_n932TBM03_VERSION = new boolean[] {false} ;
      BC000F5_A359TBM03_DEL_FLG = new String[] {""} ;
      BC000F5_n359TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F5_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F5_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F5_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F5_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F5_A59TBM03_DOM_CD = new String[] {""} ;
      BC000F4_A59TBM03_DOM_CD = new String[] {""} ;
      BC000F6_A59TBM03_DOM_CD = new String[] {""} ;
      BC000F6_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F3_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F3_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F3_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F3_A361TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F3_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F3_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F3_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F3_A364TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F3_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F3_A366TBM03_UPD_CNT = new long[1] ;
      BC000F3_n366TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F3_A346TBM03_VAR_DESC = new String[] {""} ;
      BC000F3_n346TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F3_A347TBM03_SDTM_FLG = new String[] {""} ;
      BC000F3_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F3_A348TBM03_CDASH_FLG = new String[] {""} ;
      BC000F3_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F3_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F3_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F3_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F3_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F3_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F3_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F3_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F3_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F3_A350TBM03_NOTE = new String[] {""} ;
      BC000F3_n350TBM03_NOTE = new boolean[] {false} ;
      BC000F3_A61TBM03_ORDER = new int[1] ;
      BC000F3_n61TBM03_ORDER = new boolean[] {false} ;
      BC000F3_A932TBM03_VERSION = new String[] {""} ;
      BC000F3_n932TBM03_VERSION = new boolean[] {false} ;
      BC000F3_A359TBM03_DEL_FLG = new String[] {""} ;
      BC000F3_n359TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F3_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F3_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F3_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F3_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F3_A59TBM03_DOM_CD = new String[] {""} ;
      sMode14 = "" ;
      BC000F2_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F2_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F2_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F2_A361TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F2_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F2_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F2_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F2_A364TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F2_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F2_A366TBM03_UPD_CNT = new long[1] ;
      BC000F2_n366TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F2_A346TBM03_VAR_DESC = new String[] {""} ;
      BC000F2_n346TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F2_A347TBM03_SDTM_FLG = new String[] {""} ;
      BC000F2_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F2_A348TBM03_CDASH_FLG = new String[] {""} ;
      BC000F2_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F2_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F2_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F2_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F2_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F2_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F2_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F2_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F2_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F2_A350TBM03_NOTE = new String[] {""} ;
      BC000F2_n350TBM03_NOTE = new boolean[] {false} ;
      BC000F2_A61TBM03_ORDER = new int[1] ;
      BC000F2_n61TBM03_ORDER = new boolean[] {false} ;
      BC000F2_A932TBM03_VERSION = new String[] {""} ;
      BC000F2_n932TBM03_VERSION = new boolean[] {false} ;
      BC000F2_A359TBM03_DEL_FLG = new String[] {""} ;
      BC000F2_n359TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F2_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F2_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F2_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F2_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F2_A59TBM03_DOM_CD = new String[] {""} ;
      BC000F10_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F10_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F10_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F10_A361TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F10_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F10_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F10_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F10_A364TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F10_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F10_A366TBM03_UPD_CNT = new long[1] ;
      BC000F10_n366TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F10_A346TBM03_VAR_DESC = new String[] {""} ;
      BC000F10_n346TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F10_A347TBM03_SDTM_FLG = new String[] {""} ;
      BC000F10_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F10_A348TBM03_CDASH_FLG = new String[] {""} ;
      BC000F10_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F10_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F10_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F10_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F10_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F10_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F10_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F10_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F10_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F10_A350TBM03_NOTE = new String[] {""} ;
      BC000F10_n350TBM03_NOTE = new boolean[] {false} ;
      BC000F10_A61TBM03_ORDER = new int[1] ;
      BC000F10_n61TBM03_ORDER = new boolean[] {false} ;
      BC000F10_A932TBM03_VERSION = new String[] {""} ;
      BC000F10_n932TBM03_VERSION = new boolean[] {false} ;
      BC000F10_A359TBM03_DEL_FLG = new String[] {""} ;
      BC000F10_n359TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F10_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F10_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F10_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F10_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F10_A59TBM03_DOM_CD = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm03_cdisc_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000F2_A60TBM03_DOM_VAR_NM, BC000F2_A360TBM03_CRT_DATETIME, BC000F2_n360TBM03_CRT_DATETIME, BC000F2_A361TBM03_CRT_USER_ID, BC000F2_n361TBM03_CRT_USER_ID, BC000F2_A363TBM03_UPD_DATETIME, BC000F2_n363TBM03_UPD_DATETIME, BC000F2_A364TBM03_UPD_USER_ID, BC000F2_n364TBM03_UPD_USER_ID, BC000F2_A366TBM03_UPD_CNT,
            BC000F2_n366TBM03_UPD_CNT, BC000F2_A346TBM03_VAR_DESC, BC000F2_n346TBM03_VAR_DESC, BC000F2_A347TBM03_SDTM_FLG, BC000F2_n347TBM03_SDTM_FLG, BC000F2_A348TBM03_CDASH_FLG, BC000F2_n348TBM03_CDASH_FLG, BC000F2_A532TBM03_INPUT_TYPE_DIV, BC000F2_n532TBM03_INPUT_TYPE_DIV, BC000F2_A349TBM03_REQUIRED_FLG,
            BC000F2_n349TBM03_REQUIRED_FLG, BC000F2_A688TBM03_SAS_FIELD_NM, BC000F2_n688TBM03_SAS_FIELD_NM, BC000F2_A709TBM03_ODM_DATA_TYPE, BC000F2_n709TBM03_ODM_DATA_TYPE, BC000F2_A350TBM03_NOTE, BC000F2_n350TBM03_NOTE, BC000F2_A61TBM03_ORDER, BC000F2_n61TBM03_ORDER, BC000F2_A932TBM03_VERSION,
            BC000F2_n932TBM03_VERSION, BC000F2_A359TBM03_DEL_FLG, BC000F2_n359TBM03_DEL_FLG, BC000F2_A362TBM03_CRT_PROG_NM, BC000F2_n362TBM03_CRT_PROG_NM, BC000F2_A365TBM03_UPD_PROG_NM, BC000F2_n365TBM03_UPD_PROG_NM, BC000F2_A59TBM03_DOM_CD
            }
            , new Object[] {
            BC000F3_A60TBM03_DOM_VAR_NM, BC000F3_A360TBM03_CRT_DATETIME, BC000F3_n360TBM03_CRT_DATETIME, BC000F3_A361TBM03_CRT_USER_ID, BC000F3_n361TBM03_CRT_USER_ID, BC000F3_A363TBM03_UPD_DATETIME, BC000F3_n363TBM03_UPD_DATETIME, BC000F3_A364TBM03_UPD_USER_ID, BC000F3_n364TBM03_UPD_USER_ID, BC000F3_A366TBM03_UPD_CNT,
            BC000F3_n366TBM03_UPD_CNT, BC000F3_A346TBM03_VAR_DESC, BC000F3_n346TBM03_VAR_DESC, BC000F3_A347TBM03_SDTM_FLG, BC000F3_n347TBM03_SDTM_FLG, BC000F3_A348TBM03_CDASH_FLG, BC000F3_n348TBM03_CDASH_FLG, BC000F3_A532TBM03_INPUT_TYPE_DIV, BC000F3_n532TBM03_INPUT_TYPE_DIV, BC000F3_A349TBM03_REQUIRED_FLG,
            BC000F3_n349TBM03_REQUIRED_FLG, BC000F3_A688TBM03_SAS_FIELD_NM, BC000F3_n688TBM03_SAS_FIELD_NM, BC000F3_A709TBM03_ODM_DATA_TYPE, BC000F3_n709TBM03_ODM_DATA_TYPE, BC000F3_A350TBM03_NOTE, BC000F3_n350TBM03_NOTE, BC000F3_A61TBM03_ORDER, BC000F3_n61TBM03_ORDER, BC000F3_A932TBM03_VERSION,
            BC000F3_n932TBM03_VERSION, BC000F3_A359TBM03_DEL_FLG, BC000F3_n359TBM03_DEL_FLG, BC000F3_A362TBM03_CRT_PROG_NM, BC000F3_n362TBM03_CRT_PROG_NM, BC000F3_A365TBM03_UPD_PROG_NM, BC000F3_n365TBM03_UPD_PROG_NM, BC000F3_A59TBM03_DOM_CD
            }
            , new Object[] {
            BC000F4_A59TBM03_DOM_CD
            }
            , new Object[] {
            BC000F5_A60TBM03_DOM_VAR_NM, BC000F5_A360TBM03_CRT_DATETIME, BC000F5_n360TBM03_CRT_DATETIME, BC000F5_A361TBM03_CRT_USER_ID, BC000F5_n361TBM03_CRT_USER_ID, BC000F5_A363TBM03_UPD_DATETIME, BC000F5_n363TBM03_UPD_DATETIME, BC000F5_A364TBM03_UPD_USER_ID, BC000F5_n364TBM03_UPD_USER_ID, BC000F5_A366TBM03_UPD_CNT,
            BC000F5_n366TBM03_UPD_CNT, BC000F5_A346TBM03_VAR_DESC, BC000F5_n346TBM03_VAR_DESC, BC000F5_A347TBM03_SDTM_FLG, BC000F5_n347TBM03_SDTM_FLG, BC000F5_A348TBM03_CDASH_FLG, BC000F5_n348TBM03_CDASH_FLG, BC000F5_A532TBM03_INPUT_TYPE_DIV, BC000F5_n532TBM03_INPUT_TYPE_DIV, BC000F5_A349TBM03_REQUIRED_FLG,
            BC000F5_n349TBM03_REQUIRED_FLG, BC000F5_A688TBM03_SAS_FIELD_NM, BC000F5_n688TBM03_SAS_FIELD_NM, BC000F5_A709TBM03_ODM_DATA_TYPE, BC000F5_n709TBM03_ODM_DATA_TYPE, BC000F5_A350TBM03_NOTE, BC000F5_n350TBM03_NOTE, BC000F5_A61TBM03_ORDER, BC000F5_n61TBM03_ORDER, BC000F5_A932TBM03_VERSION,
            BC000F5_n932TBM03_VERSION, BC000F5_A359TBM03_DEL_FLG, BC000F5_n359TBM03_DEL_FLG, BC000F5_A362TBM03_CRT_PROG_NM, BC000F5_n362TBM03_CRT_PROG_NM, BC000F5_A365TBM03_UPD_PROG_NM, BC000F5_n365TBM03_UPD_PROG_NM, BC000F5_A59TBM03_DOM_CD
            }
            , new Object[] {
            BC000F6_A59TBM03_DOM_CD, BC000F6_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000F10_A60TBM03_DOM_VAR_NM, BC000F10_A360TBM03_CRT_DATETIME, BC000F10_n360TBM03_CRT_DATETIME, BC000F10_A361TBM03_CRT_USER_ID, BC000F10_n361TBM03_CRT_USER_ID, BC000F10_A363TBM03_UPD_DATETIME, BC000F10_n363TBM03_UPD_DATETIME, BC000F10_A364TBM03_UPD_USER_ID, BC000F10_n364TBM03_UPD_USER_ID, BC000F10_A366TBM03_UPD_CNT,
            BC000F10_n366TBM03_UPD_CNT, BC000F10_A346TBM03_VAR_DESC, BC000F10_n346TBM03_VAR_DESC, BC000F10_A347TBM03_SDTM_FLG, BC000F10_n347TBM03_SDTM_FLG, BC000F10_A348TBM03_CDASH_FLG, BC000F10_n348TBM03_CDASH_FLG, BC000F10_A532TBM03_INPUT_TYPE_DIV, BC000F10_n532TBM03_INPUT_TYPE_DIV, BC000F10_A349TBM03_REQUIRED_FLG,
            BC000F10_n349TBM03_REQUIRED_FLG, BC000F10_A688TBM03_SAS_FIELD_NM, BC000F10_n688TBM03_SAS_FIELD_NM, BC000F10_A709TBM03_ODM_DATA_TYPE, BC000F10_n709TBM03_ODM_DATA_TYPE, BC000F10_A350TBM03_NOTE, BC000F10_n350TBM03_NOTE, BC000F10_A61TBM03_ORDER, BC000F10_n61TBM03_ORDER, BC000F10_A932TBM03_VERSION,
            BC000F10_n932TBM03_VERSION, BC000F10_A359TBM03_DEL_FLG, BC000F10_n359TBM03_DEL_FLG, BC000F10_A362TBM03_CRT_PROG_NM, BC000F10_n362TBM03_CRT_PROG_NM, BC000F10_A365TBM03_UPD_PROG_NM, BC000F10_n365TBM03_UPD_PROG_NM, BC000F10_A59TBM03_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110F2 */
      e110F2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound14 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A61TBM03_ORDER ;
   private int GX_JID ;
   private int Z61TBM03_ORDER ;
   private int GXActiveErrHndl ;
   private long A366TBM03_UPD_CNT ;
   private long Z366TBM03_UPD_CNT ;
   private long O366TBM03_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A360TBM03_CRT_DATETIME ;
   private java.util.Date A363TBM03_UPD_DATETIME ;
   private java.util.Date Z360TBM03_CRT_DATETIME ;
   private java.util.Date Z363TBM03_UPD_DATETIME ;
   private boolean n360TBM03_CRT_DATETIME ;
   private boolean n361TBM03_CRT_USER_ID ;
   private boolean n363TBM03_UPD_DATETIME ;
   private boolean n364TBM03_UPD_USER_ID ;
   private boolean n366TBM03_UPD_CNT ;
   private boolean n346TBM03_VAR_DESC ;
   private boolean n347TBM03_SDTM_FLG ;
   private boolean n348TBM03_CDASH_FLG ;
   private boolean n532TBM03_INPUT_TYPE_DIV ;
   private boolean n349TBM03_REQUIRED_FLG ;
   private boolean n688TBM03_SAS_FIELD_NM ;
   private boolean n709TBM03_ODM_DATA_TYPE ;
   private boolean n350TBM03_NOTE ;
   private boolean n61TBM03_ORDER ;
   private boolean n932TBM03_VERSION ;
   private boolean n359TBM03_DEL_FLG ;
   private boolean n362TBM03_CRT_PROG_NM ;
   private boolean n365TBM03_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z59TBM03_DOM_CD ;
   private String A59TBM03_DOM_CD ;
   private String Z60TBM03_DOM_VAR_NM ;
   private String A60TBM03_DOM_VAR_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A346TBM03_VAR_DESC ;
   private String A347TBM03_SDTM_FLG ;
   private String A348TBM03_CDASH_FLG ;
   private String A532TBM03_INPUT_TYPE_DIV ;
   private String A349TBM03_REQUIRED_FLG ;
   private String A688TBM03_SAS_FIELD_NM ;
   private String A350TBM03_NOTE ;
   private String A359TBM03_DEL_FLG ;
   private String A361TBM03_CRT_USER_ID ;
   private String A362TBM03_CRT_PROG_NM ;
   private String A364TBM03_UPD_USER_ID ;
   private String A365TBM03_UPD_PROG_NM ;
   private String Z361TBM03_CRT_USER_ID ;
   private String Z364TBM03_UPD_USER_ID ;
   private String Z346TBM03_VAR_DESC ;
   private String Z347TBM03_SDTM_FLG ;
   private String Z348TBM03_CDASH_FLG ;
   private String Z532TBM03_INPUT_TYPE_DIV ;
   private String Z349TBM03_REQUIRED_FLG ;
   private String Z688TBM03_SAS_FIELD_NM ;
   private String Z709TBM03_ODM_DATA_TYPE ;
   private String A709TBM03_ODM_DATA_TYPE ;
   private String Z350TBM03_NOTE ;
   private String Z932TBM03_VERSION ;
   private String A932TBM03_VERSION ;
   private String Z359TBM03_DEL_FLG ;
   private String Z362TBM03_CRT_PROG_NM ;
   private String Z365TBM03_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM03_CDISC_ITEM bcTBM03_CDISC_ITEM ;
   private IDataStoreProvider pr_default ;
   private String[] BC000F5_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F5_A360TBM03_CRT_DATETIME ;
   private boolean[] BC000F5_n360TBM03_CRT_DATETIME ;
   private String[] BC000F5_A361TBM03_CRT_USER_ID ;
   private boolean[] BC000F5_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F5_A363TBM03_UPD_DATETIME ;
   private boolean[] BC000F5_n363TBM03_UPD_DATETIME ;
   private String[] BC000F5_A364TBM03_UPD_USER_ID ;
   private boolean[] BC000F5_n364TBM03_UPD_USER_ID ;
   private long[] BC000F5_A366TBM03_UPD_CNT ;
   private boolean[] BC000F5_n366TBM03_UPD_CNT ;
   private String[] BC000F5_A346TBM03_VAR_DESC ;
   private boolean[] BC000F5_n346TBM03_VAR_DESC ;
   private String[] BC000F5_A347TBM03_SDTM_FLG ;
   private boolean[] BC000F5_n347TBM03_SDTM_FLG ;
   private String[] BC000F5_A348TBM03_CDASH_FLG ;
   private boolean[] BC000F5_n348TBM03_CDASH_FLG ;
   private String[] BC000F5_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F5_n532TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F5_A349TBM03_REQUIRED_FLG ;
   private boolean[] BC000F5_n349TBM03_REQUIRED_FLG ;
   private String[] BC000F5_A688TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F5_n688TBM03_SAS_FIELD_NM ;
   private String[] BC000F5_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F5_n709TBM03_ODM_DATA_TYPE ;
   private String[] BC000F5_A350TBM03_NOTE ;
   private boolean[] BC000F5_n350TBM03_NOTE ;
   private int[] BC000F5_A61TBM03_ORDER ;
   private boolean[] BC000F5_n61TBM03_ORDER ;
   private String[] BC000F5_A932TBM03_VERSION ;
   private boolean[] BC000F5_n932TBM03_VERSION ;
   private String[] BC000F5_A359TBM03_DEL_FLG ;
   private boolean[] BC000F5_n359TBM03_DEL_FLG ;
   private String[] BC000F5_A362TBM03_CRT_PROG_NM ;
   private boolean[] BC000F5_n362TBM03_CRT_PROG_NM ;
   private String[] BC000F5_A365TBM03_UPD_PROG_NM ;
   private boolean[] BC000F5_n365TBM03_UPD_PROG_NM ;
   private String[] BC000F5_A59TBM03_DOM_CD ;
   private String[] BC000F4_A59TBM03_DOM_CD ;
   private String[] BC000F6_A59TBM03_DOM_CD ;
   private String[] BC000F6_A60TBM03_DOM_VAR_NM ;
   private String[] BC000F3_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F3_A360TBM03_CRT_DATETIME ;
   private boolean[] BC000F3_n360TBM03_CRT_DATETIME ;
   private String[] BC000F3_A361TBM03_CRT_USER_ID ;
   private boolean[] BC000F3_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F3_A363TBM03_UPD_DATETIME ;
   private boolean[] BC000F3_n363TBM03_UPD_DATETIME ;
   private String[] BC000F3_A364TBM03_UPD_USER_ID ;
   private boolean[] BC000F3_n364TBM03_UPD_USER_ID ;
   private long[] BC000F3_A366TBM03_UPD_CNT ;
   private boolean[] BC000F3_n366TBM03_UPD_CNT ;
   private String[] BC000F3_A346TBM03_VAR_DESC ;
   private boolean[] BC000F3_n346TBM03_VAR_DESC ;
   private String[] BC000F3_A347TBM03_SDTM_FLG ;
   private boolean[] BC000F3_n347TBM03_SDTM_FLG ;
   private String[] BC000F3_A348TBM03_CDASH_FLG ;
   private boolean[] BC000F3_n348TBM03_CDASH_FLG ;
   private String[] BC000F3_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F3_n532TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F3_A349TBM03_REQUIRED_FLG ;
   private boolean[] BC000F3_n349TBM03_REQUIRED_FLG ;
   private String[] BC000F3_A688TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F3_n688TBM03_SAS_FIELD_NM ;
   private String[] BC000F3_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F3_n709TBM03_ODM_DATA_TYPE ;
   private String[] BC000F3_A350TBM03_NOTE ;
   private boolean[] BC000F3_n350TBM03_NOTE ;
   private int[] BC000F3_A61TBM03_ORDER ;
   private boolean[] BC000F3_n61TBM03_ORDER ;
   private String[] BC000F3_A932TBM03_VERSION ;
   private boolean[] BC000F3_n932TBM03_VERSION ;
   private String[] BC000F3_A359TBM03_DEL_FLG ;
   private boolean[] BC000F3_n359TBM03_DEL_FLG ;
   private String[] BC000F3_A362TBM03_CRT_PROG_NM ;
   private boolean[] BC000F3_n362TBM03_CRT_PROG_NM ;
   private String[] BC000F3_A365TBM03_UPD_PROG_NM ;
   private boolean[] BC000F3_n365TBM03_UPD_PROG_NM ;
   private String[] BC000F3_A59TBM03_DOM_CD ;
   private String[] BC000F2_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F2_A360TBM03_CRT_DATETIME ;
   private boolean[] BC000F2_n360TBM03_CRT_DATETIME ;
   private String[] BC000F2_A361TBM03_CRT_USER_ID ;
   private boolean[] BC000F2_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F2_A363TBM03_UPD_DATETIME ;
   private boolean[] BC000F2_n363TBM03_UPD_DATETIME ;
   private String[] BC000F2_A364TBM03_UPD_USER_ID ;
   private boolean[] BC000F2_n364TBM03_UPD_USER_ID ;
   private long[] BC000F2_A366TBM03_UPD_CNT ;
   private boolean[] BC000F2_n366TBM03_UPD_CNT ;
   private String[] BC000F2_A346TBM03_VAR_DESC ;
   private boolean[] BC000F2_n346TBM03_VAR_DESC ;
   private String[] BC000F2_A347TBM03_SDTM_FLG ;
   private boolean[] BC000F2_n347TBM03_SDTM_FLG ;
   private String[] BC000F2_A348TBM03_CDASH_FLG ;
   private boolean[] BC000F2_n348TBM03_CDASH_FLG ;
   private String[] BC000F2_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F2_n532TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F2_A349TBM03_REQUIRED_FLG ;
   private boolean[] BC000F2_n349TBM03_REQUIRED_FLG ;
   private String[] BC000F2_A688TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F2_n688TBM03_SAS_FIELD_NM ;
   private String[] BC000F2_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F2_n709TBM03_ODM_DATA_TYPE ;
   private String[] BC000F2_A350TBM03_NOTE ;
   private boolean[] BC000F2_n350TBM03_NOTE ;
   private int[] BC000F2_A61TBM03_ORDER ;
   private boolean[] BC000F2_n61TBM03_ORDER ;
   private String[] BC000F2_A932TBM03_VERSION ;
   private boolean[] BC000F2_n932TBM03_VERSION ;
   private String[] BC000F2_A359TBM03_DEL_FLG ;
   private boolean[] BC000F2_n359TBM03_DEL_FLG ;
   private String[] BC000F2_A362TBM03_CRT_PROG_NM ;
   private boolean[] BC000F2_n362TBM03_CRT_PROG_NM ;
   private String[] BC000F2_A365TBM03_UPD_PROG_NM ;
   private boolean[] BC000F2_n365TBM03_UPD_PROG_NM ;
   private String[] BC000F2_A59TBM03_DOM_CD ;
   private String[] BC000F10_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F10_A360TBM03_CRT_DATETIME ;
   private boolean[] BC000F10_n360TBM03_CRT_DATETIME ;
   private String[] BC000F10_A361TBM03_CRT_USER_ID ;
   private boolean[] BC000F10_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F10_A363TBM03_UPD_DATETIME ;
   private boolean[] BC000F10_n363TBM03_UPD_DATETIME ;
   private String[] BC000F10_A364TBM03_UPD_USER_ID ;
   private boolean[] BC000F10_n364TBM03_UPD_USER_ID ;
   private long[] BC000F10_A366TBM03_UPD_CNT ;
   private boolean[] BC000F10_n366TBM03_UPD_CNT ;
   private String[] BC000F10_A346TBM03_VAR_DESC ;
   private boolean[] BC000F10_n346TBM03_VAR_DESC ;
   private String[] BC000F10_A347TBM03_SDTM_FLG ;
   private boolean[] BC000F10_n347TBM03_SDTM_FLG ;
   private String[] BC000F10_A348TBM03_CDASH_FLG ;
   private boolean[] BC000F10_n348TBM03_CDASH_FLG ;
   private String[] BC000F10_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F10_n532TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F10_A349TBM03_REQUIRED_FLG ;
   private boolean[] BC000F10_n349TBM03_REQUIRED_FLG ;
   private String[] BC000F10_A688TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F10_n688TBM03_SAS_FIELD_NM ;
   private String[] BC000F10_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F10_n709TBM03_ODM_DATA_TYPE ;
   private String[] BC000F10_A350TBM03_NOTE ;
   private boolean[] BC000F10_n350TBM03_NOTE ;
   private int[] BC000F10_A61TBM03_ORDER ;
   private boolean[] BC000F10_n61TBM03_ORDER ;
   private String[] BC000F10_A932TBM03_VERSION ;
   private boolean[] BC000F10_n932TBM03_VERSION ;
   private String[] BC000F10_A359TBM03_DEL_FLG ;
   private boolean[] BC000F10_n359TBM03_DEL_FLG ;
   private String[] BC000F10_A362TBM03_CRT_PROG_NM ;
   private boolean[] BC000F10_n362TBM03_CRT_PROG_NM ;
   private String[] BC000F10_A365TBM03_UPD_PROG_NM ;
   private boolean[] BC000F10_n365TBM03_UPD_PROG_NM ;
   private String[] BC000F10_A59TBM03_DOM_CD ;
}

final  class tbm03_cdisc_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000F2", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F3", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F4", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F5", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000F6", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000F7", "INSERT INTO `TBM03_CDISC_ITEM`(`TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000F8", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_CRT_DATETIME`=?, `TBM03_CRT_USER_ID`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_CNT`=?, `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_CRT_PROG_NM`=?, `TBM03_UPD_PROG_NM`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000F9", "DELETE FROM `TBM03_CDISC_ITEM`  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000F10", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 50);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 20);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               stmt.setVarchar(20, (String)parms[37], 2, false);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 20);
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
               stmt.setVarchar(19, (String)parms[36], 2, false);
               stmt.setVarchar(20, (String)parms[37], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
      }
   }

}

