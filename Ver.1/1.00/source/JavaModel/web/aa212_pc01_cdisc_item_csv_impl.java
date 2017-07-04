/*
               File: aa212_pc01_cdisc_item_csv_impl
        Description: ドメイン変数マスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:20.27
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa212_pc01_cdisc_item_csv_impl extends GXWebProcedure
{
   public aa212_pc01_cdisc_item_csv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( ( GxWebError == 0 ) && ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
      {
         GXKey = context.getSiteKey( ) ;
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 )
         {
            httpContext.setQueryString( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6)) ;
         }
         else
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
         }
      }
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV9P_TBM03_DOM_CD = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10P_TBM03_DOM_VAR_NM = httpContext.GetNextPar( ) ;
            AV11P_TBM03_VAR_DESC = httpContext.GetNextPar( ) ;
            AV23W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "A212" ;
      /* Execute user subroutine: S11130 */
      S11130 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV23W_MSG = "" ;
      AV19W_CSV_SDEL = "\"" ;
      AV17W_CSV_FDEL = "," ;
      AV18W_CSV_KAK = ".CSV" ;
      AV15W_CSV_CNT = 0 ;
      GXt_char1 = AV21W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      aa212_pc01_cdisc_item_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21W_FILE_NAME = AV12W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV18W_CSV_KAK ;
      AV13W_A812_SD01_CSV_OUTPUT.clear();
      AV14W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメインコード", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン変数名", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン変数説明", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("SDTM定義フラグ（0:OFF 1:ON）", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CDASH定義フラグ（0:OFF 1:ON）", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("入力値型区分（0:文字列型 1:数値型）", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("必須入力フラグ（0:OFF 1:ON）", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("SASフィールド名", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ODMデータタイプ", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("備考", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("表示順", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("バージョン", 0);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("削除フラグ（0:利用可能 1:利用不可）", 0);
      AV13W_A812_SD01_CSV_OUTPUT.add(AV14W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_TBM03_DOM_CD ,
                                           AV10P_TBM03_DOM_VAR_NM ,
                                           AV11P_TBM03_VAR_DESC ,
                                           A162TBM03_DOM_CD ,
                                           A163TBM03_DOM_VAR_NM ,
                                           A164TBM03_VAR_DESC },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV9P_TBM03_DOM_CD = GXutil.padr( GXutil.rtrim( AV9P_TBM03_DOM_CD), 2, "%") ;
      lV10P_TBM03_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV10P_TBM03_DOM_VAR_NM), 50, "%") ;
      lV11P_TBM03_VAR_DESC = GXutil.padr( GXutil.rtrim( AV11P_TBM03_VAR_DESC), 100, "%") ;
      /* Using cursor P006H2 */
      pr_default.execute(0, new Object[] {lV9P_TBM03_DOM_CD, lV10P_TBM03_DOM_VAR_NM, lV11P_TBM03_VAR_DESC});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A164TBM03_VAR_DESC = P006H2_A164TBM03_VAR_DESC[0] ;
         n164TBM03_VAR_DESC = P006H2_n164TBM03_VAR_DESC[0] ;
         A163TBM03_DOM_VAR_NM = P006H2_A163TBM03_DOM_VAR_NM[0] ;
         A162TBM03_DOM_CD = P006H2_A162TBM03_DOM_CD[0] ;
         A165TBM03_SDTM_FLG = P006H2_A165TBM03_SDTM_FLG[0] ;
         n165TBM03_SDTM_FLG = P006H2_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = P006H2_A166TBM03_CDASH_FLG[0] ;
         n166TBM03_CDASH_FLG = P006H2_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = P006H2_A410TBM03_INPUT_TYPE_DIV[0] ;
         n410TBM03_INPUT_TYPE_DIV = P006H2_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = P006H2_A167TBM03_REQUIRED_FLG[0] ;
         n167TBM03_REQUIRED_FLG = P006H2_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = P006H2_A602TBM03_SAS_FIELD_NM[0] ;
         n602TBM03_SAS_FIELD_NM = P006H2_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = P006H2_A624TBM03_ODM_DATA_TYPE[0] ;
         n624TBM03_ODM_DATA_TYPE = P006H2_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = P006H2_A168TBM03_NOTE[0] ;
         n168TBM03_NOTE = P006H2_n168TBM03_NOTE[0] ;
         A885TBM03_VERSION = P006H2_A885TBM03_VERSION[0] ;
         n885TBM03_VERSION = P006H2_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = P006H2_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = P006H2_n178TBM03_DEL_FLG[0] ;
         A169TBM03_ORDER = P006H2_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = P006H2_n169TBM03_ORDER[0] ;
         AV15W_CSV_CNT = (long)(AV15W_CSV_CNT+1) ;
         AV14W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A162TBM03_DOM_CD, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A163TBM03_DOM_VAR_NM, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A164TBM03_VAR_DESC, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A165TBM03_SDTM_FLG, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A166TBM03_CDASH_FLG, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A410TBM03_INPUT_TYPE_DIV, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A167TBM03_REQUIRED_FLG, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A602TBM03_SAS_FIELD_NM, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A624TBM03_ODM_DATA_TYPE, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A168TBM03_NOTE, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A169TBM03_ORDER, 10, 0)), 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A885TBM03_VERSION, 0);
         AV14W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A178TBM03_DEL_FLG, 0);
         AV13W_A812_SD01_CSV_OUTPUT.add(AV14W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15W_CSV_CNT > 0 )
      {
         /* Execute user subroutine: S12148 */
         S12148 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13168 */
         S13168 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         GXt_char1 = AV23W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         aa212_pc01_cdisc_item_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23W_MSG = GXt_char1 ;
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11130( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV12W_A_LOGIN_SDT;
      GXv_char2[0] = AV20W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV12W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      aa212_pc01_cdisc_item_csv_impl.this.AV20W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12148( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV22W_FILE_PATH ;
      GXv_char4[0] = AV23W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV12W_A_LOGIN_SDT, "", AV13W_A812_SD01_CSV_OUTPUT, AV21W_FILE_NAME, GXv_char2, GXv_char4) ;
      aa212_pc01_cdisc_item_csv_impl.this.AV22W_FILE_PATH = GXv_char2[0] ;
      aa212_pc01_cdisc_item_csv_impl.this.AV23W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV23W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S13168( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV24W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDD", GXv_char4) ;
      aa212_pc01_cdisc_item_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24W_DOWNLOAD_NM = "ドメイン変数マスタ_" + GXt_char1 + AV18W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV22W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV21W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV24W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S14181( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
                  /* Execute user subroutine: S14181 */
                  S14181 ();
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
      GXKey = "" ;
      GXDecQS = "" ;
      gxfirstwebparm = "" ;
      AV9P_TBM03_DOM_CD = "" ;
      AV10P_TBM03_DOM_VAR_NM = "" ;
      AV11P_TBM03_VAR_DESC = "" ;
      AV23W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV19W_CSV_SDEL = "" ;
      AV17W_CSV_FDEL = "" ;
      AV18W_CSV_KAK = "" ;
      AV21W_FILE_NAME = "" ;
      AV12W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV13W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV14W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      scmdbuf = "" ;
      lV9P_TBM03_DOM_CD = "" ;
      lV10P_TBM03_DOM_VAR_NM = "" ;
      lV11P_TBM03_VAR_DESC = "" ;
      A162TBM03_DOM_CD = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      A164TBM03_VAR_DESC = "" ;
      P006H2_A164TBM03_VAR_DESC = new String[] {""} ;
      P006H2_n164TBM03_VAR_DESC = new boolean[] {false} ;
      P006H2_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      P006H2_A162TBM03_DOM_CD = new String[] {""} ;
      P006H2_A165TBM03_SDTM_FLG = new String[] {""} ;
      P006H2_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      P006H2_A166TBM03_CDASH_FLG = new String[] {""} ;
      P006H2_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      P006H2_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      P006H2_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      P006H2_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      P006H2_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      P006H2_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      P006H2_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      P006H2_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      P006H2_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      P006H2_A168TBM03_NOTE = new String[] {""} ;
      P006H2_n168TBM03_NOTE = new boolean[] {false} ;
      P006H2_A885TBM03_VERSION = new String[] {""} ;
      P006H2_n885TBM03_VERSION = new boolean[] {false} ;
      P006H2_A178TBM03_DEL_FLG = new String[] {""} ;
      P006H2_n178TBM03_DEL_FLG = new boolean[] {false} ;
      P006H2_A169TBM03_ORDER = new int[1] ;
      P006H2_n169TBM03_ORDER = new boolean[] {false} ;
      A165TBM03_SDTM_FLG = "" ;
      A166TBM03_CDASH_FLG = "" ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      A167TBM03_REQUIRED_FLG = "" ;
      A602TBM03_SAS_FIELD_NM = "" ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      A168TBM03_NOTE = "" ;
      A885TBM03_VERSION = "" ;
      A178TBM03_DEL_FLG = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV20W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV22W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV24W_DOWNLOAD_NM = "" ;
      GXv_char4 = new String [1] ;
      AV28Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new aa212_pc01_cdisc_item_csv__default(),
         new Object[] {
             new Object[] {
            P006H2_A164TBM03_VAR_DESC, P006H2_n164TBM03_VAR_DESC, P006H2_A163TBM03_DOM_VAR_NM, P006H2_A162TBM03_DOM_CD, P006H2_A165TBM03_SDTM_FLG, P006H2_n165TBM03_SDTM_FLG, P006H2_A166TBM03_CDASH_FLG, P006H2_n166TBM03_CDASH_FLG, P006H2_A410TBM03_INPUT_TYPE_DIV, P006H2_n410TBM03_INPUT_TYPE_DIV,
            P006H2_A167TBM03_REQUIRED_FLG, P006H2_n167TBM03_REQUIRED_FLG, P006H2_A602TBM03_SAS_FIELD_NM, P006H2_n602TBM03_SAS_FIELD_NM, P006H2_A624TBM03_ODM_DATA_TYPE, P006H2_n624TBM03_ODM_DATA_TYPE, P006H2_A168TBM03_NOTE, P006H2_n168TBM03_NOTE, P006H2_A885TBM03_VERSION, P006H2_n885TBM03_VERSION,
            P006H2_A178TBM03_DEL_FLG, P006H2_n178TBM03_DEL_FLG, P006H2_A169TBM03_ORDER, P006H2_n169TBM03_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "AA212_PC01_CDISC_ITEM_CSV" ;
      /* GeneXus formulas. */
      AV28Pgmname = "AA212_PC01_CDISC_ITEM_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private int A169TBM03_ORDER ;
   private int GXActiveErrHndl ;
   private long AV15W_CSV_CNT ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV28Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n164TBM03_VAR_DESC ;
   private boolean n165TBM03_SDTM_FLG ;
   private boolean n166TBM03_CDASH_FLG ;
   private boolean n410TBM03_INPUT_TYPE_DIV ;
   private boolean n167TBM03_REQUIRED_FLG ;
   private boolean n602TBM03_SAS_FIELD_NM ;
   private boolean n624TBM03_ODM_DATA_TYPE ;
   private boolean n168TBM03_NOTE ;
   private boolean n885TBM03_VERSION ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n169TBM03_ORDER ;
   private String AV9P_TBM03_DOM_CD ;
   private String AV10P_TBM03_DOM_VAR_NM ;
   private String AV11P_TBM03_VAR_DESC ;
   private String AV23W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV19W_CSV_SDEL ;
   private String AV17W_CSV_FDEL ;
   private String AV18W_CSV_KAK ;
   private String AV21W_FILE_NAME ;
   private String lV9P_TBM03_DOM_CD ;
   private String lV10P_TBM03_DOM_VAR_NM ;
   private String lV11P_TBM03_VAR_DESC ;
   private String A162TBM03_DOM_CD ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A164TBM03_VAR_DESC ;
   private String A165TBM03_SDTM_FLG ;
   private String A166TBM03_CDASH_FLG ;
   private String A410TBM03_INPUT_TYPE_DIV ;
   private String A167TBM03_REQUIRED_FLG ;
   private String A602TBM03_SAS_FIELD_NM ;
   private String A624TBM03_ODM_DATA_TYPE ;
   private String A168TBM03_NOTE ;
   private String A885TBM03_VERSION ;
   private String A178TBM03_DEL_FLG ;
   private String AV20W_ERRCD ;
   private String AV22W_FILE_PATH ;
   private String AV24W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV12W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P006H2_A164TBM03_VAR_DESC ;
   private boolean[] P006H2_n164TBM03_VAR_DESC ;
   private String[] P006H2_A163TBM03_DOM_VAR_NM ;
   private String[] P006H2_A162TBM03_DOM_CD ;
   private String[] P006H2_A165TBM03_SDTM_FLG ;
   private boolean[] P006H2_n165TBM03_SDTM_FLG ;
   private String[] P006H2_A166TBM03_CDASH_FLG ;
   private boolean[] P006H2_n166TBM03_CDASH_FLG ;
   private String[] P006H2_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] P006H2_n410TBM03_INPUT_TYPE_DIV ;
   private String[] P006H2_A167TBM03_REQUIRED_FLG ;
   private boolean[] P006H2_n167TBM03_REQUIRED_FLG ;
   private String[] P006H2_A602TBM03_SAS_FIELD_NM ;
   private boolean[] P006H2_n602TBM03_SAS_FIELD_NM ;
   private String[] P006H2_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] P006H2_n624TBM03_ODM_DATA_TYPE ;
   private String[] P006H2_A168TBM03_NOTE ;
   private boolean[] P006H2_n168TBM03_NOTE ;
   private String[] P006H2_A885TBM03_VERSION ;
   private boolean[] P006H2_n885TBM03_VERSION ;
   private String[] P006H2_A178TBM03_DEL_FLG ;
   private boolean[] P006H2_n178TBM03_DEL_FLG ;
   private int[] P006H2_A169TBM03_ORDER ;
   private boolean[] P006H2_n169TBM03_ORDER ;
   private GxObjectCollection AV13W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV14W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class aa212_pc01_cdisc_item_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P006H2( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_TBM03_DOM_CD ,
                                          String AV10P_TBM03_DOM_VAR_NM ,
                                          String AV11P_TBM03_VAR_DESC ,
                                          String A162TBM03_DOM_CD ,
                                          String A163TBM03_DOM_VAR_NM ,
                                          String A164TBM03_VAR_DESC )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [3] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM03_VAR_DESC`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`," ;
      scmdbuf = scmdbuf + " `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`," ;
      scmdbuf = scmdbuf + " `TBM03_NOTE`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_ORDER` FROM `TBM03_CDISC_ITEM`" ;
      if ( ! (GXutil.strcmp("", AV9P_TBM03_DOM_CD)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_TBM03_DOM_VAR_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11P_TBM03_VAR_DESC)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
         }
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE " + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_ORDER`" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P006H2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 100);
               }
               break;
      }
   }

}

