/*
               File: A213_PC01_CDISC_ITEM_MST_CHK
        Description: ドメイン変数マスタ入力チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:24.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a213_pc01_cdisc_item_mst_chk extends GXProcedure
{
   public a213_pc01_cdisc_item_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a213_pc01_cdisc_item_mst_chk.class ), "" );
   }

   public a213_pc01_cdisc_item_mst_chk( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTBM03_CDISC_ITEM aP0 ,
                                         GxObjectCollection[] aP1 )
   {
      a213_pc01_cdisc_item_mst_chk.this.AV13P_BC_CDISC_ITEM = aP0;
      a213_pc01_cdisc_item_mst_chk.this.aP2 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( SdtTBM03_CDISC_ITEM aP0 ,
                        GxObjectCollection[] aP1 ,
                        GxObjectCollection[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtTBM03_CDISC_ITEM aP0 ,
                             GxObjectCollection[] aP1 ,
                             GxObjectCollection[] aP2 )
   {
      a213_pc01_cdisc_item_mst_chk.this.AV13P_BC_CDISC_ITEM = aP0;
      a213_pc01_cdisc_item_mst_chk.this.aP1 = aP1;
      a213_pc01_cdisc_item_mst_chk.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM020_APP_ID = "A213" ;
      /* Execute user subroutine: S14205 */
      S14205 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_A_CHK_INFO_SDT.clear();
      AV11P_A_CHK_RESULT_SDT.clear();
      AV12P_A_RESULT_MSG_SDT.clear();
      AV22W_FOCUS_FLG = true ;
      /* Execute user subroutine: S1181 */
      S1181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] = AV14W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1) ;
      AV14W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] ;
      AV23W_INPUT_TYPE_DIV_ERR_FLG = false ;
      AV28GXV1 = 1 ;
      while ( AV28GXV1 <= AV14W_A_CHK_INFO_SDT.size() )
      {
         AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV14W_A_CHK_INFO_SDT.elementAt(-1+AV28GXV1));
         if ( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV22W_FOCUS_FLG );
            AV11P_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
            AV18W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV18W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV12P_A_RESULT_MSG_SDT.add(AV18W_A_RESULT_MSG_SDT_ITEM, 0);
            AV22W_FOCUS_FLG = false ;
            if ( GXutil.strcmp(AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id(), "TBM03_INPUT_TYPE_DIV") == 0 )
            {
               AV23W_INPUT_TYPE_DIV_ERR_FLG = true ;
            }
         }
         AV28GXV1 = (int)(AV28GXV1+1) ;
      }
      /* Execute user subroutine: S12169 */
      S12169 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S13176 */
      S13176 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S1181( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV19W_CHK_NO = (short)(1) ;
      while ( AV19W_CHK_NO <= 9 )
      {
         AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
         if ( AV19W_CHK_NO == 1 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_DOM_CD" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメインコード" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
         }
         else if ( AV19W_CHK_NO == 2 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_DOM_VAR_NM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン変数名" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
         }
         else if ( AV19W_CHK_NO == 3 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_VAR_DESC" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン変数説明" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
         }
         else if ( AV19W_CHK_NO == 4 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_INPUT_TYPE_DIV" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "入力値型区分" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_NUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
         }
         else if ( AV19W_CHK_NO == 5 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_SAS_FIELD_NM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "SASフィールド名" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
         }
         else if ( AV19W_CHK_NO == 6 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_ODM_DATA_TYPE" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ODMデータタイプ" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
         }
         else if ( AV19W_CHK_NO == 7 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_NOTE" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "備考" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1000) );
         }
         else if ( AV19W_CHK_NO == 8 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_ORDER" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "表示順" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order()) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
         }
         else if ( AV19W_CHK_NO == 9 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM03_VERSION" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "Version" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half( (byte)(1) );
         }
         AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
         AV19W_CHK_NO = (short)(AV19W_CHK_NO+1) ;
      }
   }

   public void S12169( )
   {
      /* 'SUB_MSTR_CHK' Routine */
   }

   public void S13176( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
      if ( ! (GXutil.strcmp("", AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div())==0) )
      {
         if ( ! AV23W_INPUT_TYPE_DIV_ERR_FLG )
         {
            if ( ( GXutil.strcmp(AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div(), "0") == 0 ) || ( GXutil.strcmp(AV13P_BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div(), "1") == 0 ) )
            {
            }
            else
            {
               AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM03_INPUT_TYPE_DIV" );
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV22W_FOCUS_FLG );
               AV11P_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
               AV18W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char2 = "" ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "入力値型区分", "", "", "", "", GXv_char3) ;
               a213_pc01_cdisc_item_mst_chk.this.GXt_char2 = GXv_char3[0] ;
               AV18W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char2 );
               AV12P_A_RESULT_MSG_SDT.add(AV18W_A_RESULT_MSG_SDT_ITEM, 0);
            }
         }
      }
   }

   public void S14205( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV17W_A_LOGIN_SDT;
      GXv_char3[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      a213_pc01_cdisc_item_mst_chk.this.AV21W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S15223( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV29Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = a213_pc01_cdisc_item_mst_chk.this.AV11P_A_CHK_RESULT_SDT;
      this.aP2[0] = a213_pc01_cdisc_item_mst_chk.this.AV12P_A_RESULT_MSG_SDT;
      CloseOpenCursors();
      exitApplication();
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
               case 1 :
                  /* Execute user subroutine: S15223 */
                  S15223 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV11P_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV12P_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV10C_TAM020_APP_ID = "" ;
      AV14W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1 = new GxObjectCollection [1] ;
      AV15W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV18W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV29Pgmname = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      AV29Pgmname = "A213_PC01_CDISC_ITEM_MST_CHK" ;
      /* GeneXus formulas. */
      AV29Pgmname = "A213_PC01_CDISC_ITEM_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private short AV19W_CHK_NO ;
   private short Gx_err ;
   private int AV28GXV1 ;
   private int GXActiveErrHndl ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV29Pgmname ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV22W_FOCUS_FLG ;
   private boolean AV23W_INPUT_TYPE_DIV_ERR_FLG ;
   private String AV10C_TAM020_APP_ID ;
   private String AV21W_ERRCD ;
   private GxObjectCollection[] aP1 ;
   private GxObjectCollection[] aP2 ;
   private GxObjectCollection AV11P_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV12P_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV14W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV18W_A_RESULT_MSG_SDT_ITEM ;
   private SdtTBM03_CDISC_ITEM AV13P_BC_CDISC_ITEM ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV15W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

