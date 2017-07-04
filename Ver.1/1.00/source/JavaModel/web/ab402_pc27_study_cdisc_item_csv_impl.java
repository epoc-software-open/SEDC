/*
               File: ab402_pc27_study_cdisc_item_csv_impl
        Description: 試験別ドメイン変数マスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:21.91
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab402_pc27_study_cdisc_item_csv_impl extends GXWebProcedure
{
   public ab402_pc27_study_cdisc_item_csv_impl( com.genexus.internet.HttpContext context )
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
         AV11P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9P_DOM_CD = httpContext.GetNextPar( ) ;
            AV10P_DOM_VAR_NM = httpContext.GetNextPar( ) ;
            AV12P_VAR_DESC = httpContext.GetNextPar( ) ;
            AV24W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B402" ;
      /* Execute user subroutine: S11144 */
      S11144 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV24W_MSG = "" ;
      AV20W_CSV_SDEL = "\"" ;
      AV18W_CSV_FDEL = "," ;
      AV19W_CSV_KAK = ".CSV" ;
      AV16W_CSV_CNT = 0 ;
      GXt_char1 = AV22W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      ab402_pc27_study_cdisc_item_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22W_FILE_NAME = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV19W_CSV_KAK ;
      /* Using cursor P006L2 */
      pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A186TBM21_STUDY_ID = P006L2_A186TBM21_STUDY_ID[0] ;
         A187TBM21_STUDY_NM = P006L2_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = P006L2_n187TBM21_STUDY_NM[0] ;
         AV25W_TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV14W_A812_SD01_CSV_OUTPUT.clear();
      AV15W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験ID", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験名", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメインコード", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン変数名", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン変数説明", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("SDTM定義フラグ（0:OFF 1:ON）", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CDASH定義フラグ（0:OFF 1:ON）", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("入力値型区分（0:文字列型 1:数値型）", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("必須入力フラグ（0:OFF 1:ON）", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("SASフィールド名", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ODMデータタイプ", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("備考", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("表示順", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("バージョン", 0);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("削除フラグ（0:利用可能 1:利用不可）", 0);
      AV14W_A812_SD01_CSV_OUTPUT.add(AV15W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV9P_DOM_CD ,
                                           AV10P_DOM_VAR_NM ,
                                           AV12P_VAR_DESC ,
                                           A895TBM43_DOM_CD ,
                                           A896TBM43_DOM_VAR_NM ,
                                           A897TBM43_VAR_DESC ,
                                           new Long(A894TBM43_STUDY_ID) ,
                                           new Long(AV11P_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV10P_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV10P_DOM_VAR_NM), 50, "%") ;
      lV12P_VAR_DESC = GXutil.padr( GXutil.rtrim( AV12P_VAR_DESC), 100, "%") ;
      /* Using cursor P006L3 */
      pr_default.execute(1, new Object[] {new Long(AV11P_STUDY_ID), AV9P_DOM_CD, lV10P_DOM_VAR_NM, lV12P_VAR_DESC});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A894TBM43_STUDY_ID = P006L3_A894TBM43_STUDY_ID[0] ;
         A897TBM43_VAR_DESC = P006L3_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = P006L3_n897TBM43_VAR_DESC[0] ;
         A896TBM43_DOM_VAR_NM = P006L3_A896TBM43_DOM_VAR_NM[0] ;
         A895TBM43_DOM_CD = P006L3_A895TBM43_DOM_CD[0] ;
         A898TBM43_SDTM_FLG = P006L3_A898TBM43_SDTM_FLG[0] ;
         n898TBM43_SDTM_FLG = P006L3_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = P006L3_A899TBM43_CDASH_FLG[0] ;
         n899TBM43_CDASH_FLG = P006L3_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = P006L3_A900TBM43_INPUT_TYPE_DIV[0] ;
         n900TBM43_INPUT_TYPE_DIV = P006L3_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = P006L3_A901TBM43_REQUIRED_FLG[0] ;
         n901TBM43_REQUIRED_FLG = P006L3_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = P006L3_A902TBM43_SAS_FIELD_NM[0] ;
         n902TBM43_SAS_FIELD_NM = P006L3_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = P006L3_A903TBM43_ODM_DATA_TYPE[0] ;
         n903TBM43_ODM_DATA_TYPE = P006L3_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = P006L3_A904TBM43_NOTE[0] ;
         n904TBM43_NOTE = P006L3_n904TBM43_NOTE[0] ;
         A907TBM43_VERSION = P006L3_A907TBM43_VERSION[0] ;
         n907TBM43_VERSION = P006L3_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = P006L3_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = P006L3_n906TBM43_DEL_FLG[0] ;
         A905TBM43_ORDER = P006L3_A905TBM43_ORDER[0] ;
         n905TBM43_ORDER = P006L3_n905TBM43_ORDER[0] ;
         AV16W_CSV_CNT = (long)(AV16W_CSV_CNT+1) ;
         AV15W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)), 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(AV25W_TBM21_STUDY_NM, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A895TBM43_DOM_CD, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A896TBM43_DOM_VAR_NM, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A897TBM43_VAR_DESC, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A898TBM43_SDTM_FLG, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A899TBM43_CDASH_FLG, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A900TBM43_INPUT_TYPE_DIV, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A901TBM43_REQUIRED_FLG, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A902TBM43_SAS_FIELD_NM, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A903TBM43_ODM_DATA_TYPE, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A904TBM43_NOTE, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A905TBM43_ORDER, 10, 0)), 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A907TBM43_VERSION, 0);
         AV15W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A906TBM43_DEL_FLG, 0);
         AV14W_A812_SD01_CSV_OUTPUT.add(AV15W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV16W_CSV_CNT > 0 )
      {
         /* Execute user subroutine: S12162 */
         S12162 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13182 */
         S13182 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         ab402_pc27_study_cdisc_item_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11144( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab402_pc27_study_cdisc_item_csv_impl.this.AV21W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12162( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV23W_FILE_PATH ;
      GXv_char4[0] = AV24W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV13W_A_LOGIN_SDT, "", AV14W_A812_SD01_CSV_OUTPUT, AV22W_FILE_NAME, GXv_char2, GXv_char4) ;
      ab402_pc27_study_cdisc_item_csv_impl.this.AV23W_FILE_PATH = GXv_char2[0] ;
      ab402_pc27_study_cdisc_item_csv_impl.this.AV24W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV24W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S13182( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV26W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char4) ;
      ab402_pc27_study_cdisc_item_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26W_DOWNLOAD_NM = "試験別ドメイン変数マスタ_" + GXt_char1 + AV19W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV23W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV22W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV26W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S14195( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
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
                  /* Execute user subroutine: S14195 */
                  S14195 ();
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
      AV9P_DOM_CD = "" ;
      AV10P_DOM_VAR_NM = "" ;
      AV12P_VAR_DESC = "" ;
      AV24W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV20W_CSV_SDEL = "" ;
      AV18W_CSV_FDEL = "" ;
      AV19W_CSV_KAK = "" ;
      AV22W_FILE_NAME = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P006L2_A186TBM21_STUDY_ID = new long[1] ;
      P006L2_A187TBM21_STUDY_NM = new String[] {""} ;
      P006L2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      AV25W_TBM21_STUDY_NM = "" ;
      AV14W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV15W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      lV10P_DOM_VAR_NM = "" ;
      lV12P_VAR_DESC = "" ;
      A895TBM43_DOM_CD = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      A897TBM43_VAR_DESC = "" ;
      P006L3_A894TBM43_STUDY_ID = new long[1] ;
      P006L3_A897TBM43_VAR_DESC = new String[] {""} ;
      P006L3_n897TBM43_VAR_DESC = new boolean[] {false} ;
      P006L3_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      P006L3_A895TBM43_DOM_CD = new String[] {""} ;
      P006L3_A898TBM43_SDTM_FLG = new String[] {""} ;
      P006L3_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      P006L3_A899TBM43_CDASH_FLG = new String[] {""} ;
      P006L3_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      P006L3_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      P006L3_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      P006L3_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      P006L3_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      P006L3_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      P006L3_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      P006L3_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      P006L3_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      P006L3_A904TBM43_NOTE = new String[] {""} ;
      P006L3_n904TBM43_NOTE = new boolean[] {false} ;
      P006L3_A907TBM43_VERSION = new String[] {""} ;
      P006L3_n907TBM43_VERSION = new boolean[] {false} ;
      P006L3_A906TBM43_DEL_FLG = new String[] {""} ;
      P006L3_n906TBM43_DEL_FLG = new boolean[] {false} ;
      P006L3_A905TBM43_ORDER = new int[1] ;
      P006L3_n905TBM43_ORDER = new boolean[] {false} ;
      A898TBM43_SDTM_FLG = "" ;
      A899TBM43_CDASH_FLG = "" ;
      A900TBM43_INPUT_TYPE_DIV = "" ;
      A901TBM43_REQUIRED_FLG = "" ;
      A902TBM43_SAS_FIELD_NM = "" ;
      A903TBM43_ODM_DATA_TYPE = "" ;
      A904TBM43_NOTE = "" ;
      A907TBM43_VERSION = "" ;
      A906TBM43_DEL_FLG = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV23W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV26W_DOWNLOAD_NM = "" ;
      GXv_char4 = new String [1] ;
      AV31Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab402_pc27_study_cdisc_item_csv__default(),
         new Object[] {
             new Object[] {
            P006L2_A186TBM21_STUDY_ID, P006L2_A187TBM21_STUDY_NM, P006L2_n187TBM21_STUDY_NM
            }
            , new Object[] {
            P006L3_A894TBM43_STUDY_ID, P006L3_A897TBM43_VAR_DESC, P006L3_n897TBM43_VAR_DESC, P006L3_A896TBM43_DOM_VAR_NM, P006L3_A895TBM43_DOM_CD, P006L3_A898TBM43_SDTM_FLG, P006L3_n898TBM43_SDTM_FLG, P006L3_A899TBM43_CDASH_FLG, P006L3_n899TBM43_CDASH_FLG, P006L3_A900TBM43_INPUT_TYPE_DIV,
            P006L3_n900TBM43_INPUT_TYPE_DIV, P006L3_A901TBM43_REQUIRED_FLG, P006L3_n901TBM43_REQUIRED_FLG, P006L3_A902TBM43_SAS_FIELD_NM, P006L3_n902TBM43_SAS_FIELD_NM, P006L3_A903TBM43_ODM_DATA_TYPE, P006L3_n903TBM43_ODM_DATA_TYPE, P006L3_A904TBM43_NOTE, P006L3_n904TBM43_NOTE, P006L3_A907TBM43_VERSION,
            P006L3_n907TBM43_VERSION, P006L3_A906TBM43_DEL_FLG, P006L3_n906TBM43_DEL_FLG, P006L3_A905TBM43_ORDER, P006L3_n905TBM43_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV31Pgmname = "AB402_PC27_STUDY_CDISC_ITEM_CSV" ;
      /* GeneXus formulas. */
      AV31Pgmname = "AB402_PC27_STUDY_CDISC_ITEM_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private int A905TBM43_ORDER ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long AV16W_CSV_CNT ;
   private long A186TBM21_STUDY_ID ;
   private long A894TBM43_STUDY_ID ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV31Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n897TBM43_VAR_DESC ;
   private boolean n898TBM43_SDTM_FLG ;
   private boolean n899TBM43_CDASH_FLG ;
   private boolean n900TBM43_INPUT_TYPE_DIV ;
   private boolean n901TBM43_REQUIRED_FLG ;
   private boolean n902TBM43_SAS_FIELD_NM ;
   private boolean n903TBM43_ODM_DATA_TYPE ;
   private boolean n904TBM43_NOTE ;
   private boolean n907TBM43_VERSION ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean n905TBM43_ORDER ;
   private String AV9P_DOM_CD ;
   private String AV10P_DOM_VAR_NM ;
   private String AV12P_VAR_DESC ;
   private String AV24W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV20W_CSV_SDEL ;
   private String AV18W_CSV_FDEL ;
   private String AV19W_CSV_KAK ;
   private String AV22W_FILE_NAME ;
   private String A187TBM21_STUDY_NM ;
   private String AV25W_TBM21_STUDY_NM ;
   private String lV10P_DOM_VAR_NM ;
   private String lV12P_VAR_DESC ;
   private String A895TBM43_DOM_CD ;
   private String A896TBM43_DOM_VAR_NM ;
   private String A897TBM43_VAR_DESC ;
   private String A898TBM43_SDTM_FLG ;
   private String A899TBM43_CDASH_FLG ;
   private String A900TBM43_INPUT_TYPE_DIV ;
   private String A901TBM43_REQUIRED_FLG ;
   private String A902TBM43_SAS_FIELD_NM ;
   private String A903TBM43_ODM_DATA_TYPE ;
   private String A904TBM43_NOTE ;
   private String A907TBM43_VERSION ;
   private String A906TBM43_DEL_FLG ;
   private String AV21W_ERRCD ;
   private String AV23W_FILE_PATH ;
   private String AV26W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private long[] P006L2_A186TBM21_STUDY_ID ;
   private String[] P006L2_A187TBM21_STUDY_NM ;
   private boolean[] P006L2_n187TBM21_STUDY_NM ;
   private long[] P006L3_A894TBM43_STUDY_ID ;
   private String[] P006L3_A897TBM43_VAR_DESC ;
   private boolean[] P006L3_n897TBM43_VAR_DESC ;
   private String[] P006L3_A896TBM43_DOM_VAR_NM ;
   private String[] P006L3_A895TBM43_DOM_CD ;
   private String[] P006L3_A898TBM43_SDTM_FLG ;
   private boolean[] P006L3_n898TBM43_SDTM_FLG ;
   private String[] P006L3_A899TBM43_CDASH_FLG ;
   private boolean[] P006L3_n899TBM43_CDASH_FLG ;
   private String[] P006L3_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] P006L3_n900TBM43_INPUT_TYPE_DIV ;
   private String[] P006L3_A901TBM43_REQUIRED_FLG ;
   private boolean[] P006L3_n901TBM43_REQUIRED_FLG ;
   private String[] P006L3_A902TBM43_SAS_FIELD_NM ;
   private boolean[] P006L3_n902TBM43_SAS_FIELD_NM ;
   private String[] P006L3_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] P006L3_n903TBM43_ODM_DATA_TYPE ;
   private String[] P006L3_A904TBM43_NOTE ;
   private boolean[] P006L3_n904TBM43_NOTE ;
   private String[] P006L3_A907TBM43_VERSION ;
   private boolean[] P006L3_n907TBM43_VERSION ;
   private String[] P006L3_A906TBM43_DEL_FLG ;
   private boolean[] P006L3_n906TBM43_DEL_FLG ;
   private int[] P006L3_A905TBM43_ORDER ;
   private boolean[] P006L3_n905TBM43_ORDER ;
   private GxObjectCollection AV14W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV15W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class ab402_pc27_study_cdisc_item_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P006L3( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_DOM_CD ,
                                          String AV10P_DOM_VAR_NM ,
                                          String AV12P_VAR_DESC ,
                                          String A895TBM43_DOM_CD ,
                                          String A896TBM43_DOM_VAR_NM ,
                                          String A897TBM43_VAR_DESC ,
                                          long A894TBM43_STUDY_ID ,
                                          long AV11P_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [4] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM43_STUDY_ID`, `TBM43_VAR_DESC`, `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`, `TBM43_SDTM_FLG`," ;
      scmdbuf = scmdbuf + " `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`," ;
      scmdbuf = scmdbuf + " `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_ORDER`" ;
      scmdbuf = scmdbuf + " FROM `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV9P_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12P_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM43_DOM_CD`, `TBM43_ORDER`" ;
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
            case 1 :
                  return conditional_P006L3(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006L2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               break;
      }
   }

}

