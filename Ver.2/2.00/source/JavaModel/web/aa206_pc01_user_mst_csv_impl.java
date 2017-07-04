/*
               File: aa206_pc01_user_mst_csv_impl
        Description: ユーザーマスタCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:48.85
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa206_pc01_user_mst_csv_impl extends GXWebProcedure
{
   public aa206_pc01_user_mst_csv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      if ( GxWebError == 0 )
      {
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "aa206_pc01_user_mst_csv")), "aa206_pc01_user_mst_csv") == 0 ) )
         {
            httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "aa206_pc01_user_mst_csv"))) ;
         }
         else
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
         }
      }
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV9P_TAM07_USER_ID = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10P_TAM07_USER_NM = httpContext.GetNextPar( ) ;
            AV22W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "A204" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_MSG = "" ;
      AV18W_CSV_SDEL = "\"" ;
      AV16W_CSV_FDEL = "," ;
      AV17W_CSV_KAK = ".CSV" ;
      AV14W_CSV_CNT = 0 ;
      GXt_char1 = AV20W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      aa206_pc01_user_mst_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20W_FILE_NAME = AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV17W_CSV_KAK ;
      AV12W_A812_SD01_CSV_OUTPUT.clear();
      AV13W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ユーザーID", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("氏名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("氏名（カナ）", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("権限パターン区分", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("施設ID", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("EMAILアドレス", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("削除フラグ", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("作成日時", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("作成者ユーザID", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("作成プログラム名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("更新日時", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("更新者ユーザID", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("更新プログラム名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("更新カウント", 0);
      AV12W_A812_SD01_CSV_OUTPUT.add(AV13W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_TAM07_USER_ID ,
                                           AV10P_TAM07_USER_NM ,
                                           A55TAM07_USER_ID ,
                                           A205TAM07_USER_NM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV9P_TAM07_USER_ID = GXutil.padr( GXutil.rtrim( AV9P_TAM07_USER_ID), 128, "%") ;
      lV10P_TAM07_USER_NM = GXutil.padr( GXutil.rtrim( AV10P_TAM07_USER_NM), 30, "%") ;
      /* Using cursor P001N2 */
      pr_default.execute(0, new Object[] {lV9P_TAM07_USER_ID, lV10P_TAM07_USER_NM});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A205TAM07_USER_NM = P001N2_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = P001N2_n205TAM07_USER_NM[0] ;
         A55TAM07_USER_ID = P001N2_A55TAM07_USER_ID[0] ;
         A313TAM07_USER_KANA_NM = P001N2_A313TAM07_USER_KANA_NM[0] ;
         n313TAM07_USER_KANA_NM = P001N2_n313TAM07_USER_KANA_NM[0] ;
         A56TAM07_AUTH_CD = P001N2_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = P001N2_n56TAM07_AUTH_CD[0] ;
         A333TAM07_SITE_ID = P001N2_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = P001N2_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = P001N2_A683TAM07_EMAIL[0] ;
         n683TAM07_EMAIL = P001N2_n683TAM07_EMAIL[0] ;
         A214TAM07_DEL_FLG = P001N2_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = P001N2_n214TAM07_DEL_FLG[0] ;
         A229TAM07_CRT_DATETIME = P001N2_A229TAM07_CRT_DATETIME[0] ;
         n229TAM07_CRT_DATETIME = P001N2_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = P001N2_A264TAM07_CRT_USER_ID[0] ;
         n264TAM07_CRT_USER_ID = P001N2_n264TAM07_CRT_USER_ID[0] ;
         A230TAM07_CRT_PROG_NM = P001N2_A230TAM07_CRT_PROG_NM[0] ;
         n230TAM07_CRT_PROG_NM = P001N2_n230TAM07_CRT_PROG_NM[0] ;
         A231TAM07_UPD_DATETIME = P001N2_A231TAM07_UPD_DATETIME[0] ;
         n231TAM07_UPD_DATETIME = P001N2_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = P001N2_A265TAM07_UPD_USER_ID[0] ;
         n265TAM07_UPD_USER_ID = P001N2_n265TAM07_UPD_USER_ID[0] ;
         A232TAM07_UPD_PROG_NM = P001N2_A232TAM07_UPD_PROG_NM[0] ;
         n232TAM07_UPD_PROG_NM = P001N2_n232TAM07_UPD_PROG_NM[0] ;
         A299TAM07_UPD_CNT = P001N2_A299TAM07_UPD_CNT[0] ;
         n299TAM07_UPD_CNT = P001N2_n299TAM07_UPD_CNT[0] ;
         AV14W_CSV_CNT = (long)(AV14W_CSV_CNT+1) ;
         AV13W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A55TAM07_USER_ID, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A205TAM07_USER_NM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A313TAM07_USER_KANA_NM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A56TAM07_AUTH_CD, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A333TAM07_SITE_ID, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A683TAM07_EMAIL, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A214TAM07_DEL_FLG, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A264TAM07_CRT_USER_ID, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A230TAM07_CRT_PROG_NM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A265TAM07_UPD_USER_ID, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A232TAM07_UPD_PROG_NM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT.add(AV13W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14W_CSV_CNT > 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV26Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         GXt_char1 = AV22W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         aa206_pc01_user_mst_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22W_MSG = GXt_char1 ;
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      aa206_pc01_user_mst_csv_impl.this.AV19W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV21W_FILE_PATH ;
      GXv_char4[0] = AV22W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV11W_A_LOGIN_SDT, "", AV12W_A812_SD01_CSV_OUTPUT, AV20W_FILE_NAME, GXv_char2, GXv_char4) ;
      aa206_pc01_user_mst_csv_impl.this.AV21W_FILE_PATH = GXv_char2[0] ;
      aa206_pc01_user_mst_csv_impl.this.AV22W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV22W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV21W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_NAME)) ;
      httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(0) ;
   }

   public void S141( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV26Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
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
                  /* Execute user subroutine: S141 */
                  S141 ();
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
      AV9P_TAM07_USER_ID = "" ;
      AV10P_TAM07_USER_NM = "" ;
      AV22W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV18W_CSV_SDEL = "" ;
      AV16W_CSV_FDEL = "" ;
      AV17W_CSV_KAK = "" ;
      AV20W_FILE_NAME = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV12W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      scmdbuf = "" ;
      lV9P_TAM07_USER_ID = "" ;
      lV10P_TAM07_USER_NM = "" ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      P001N2_A205TAM07_USER_NM = new String[] {""} ;
      P001N2_n205TAM07_USER_NM = new boolean[] {false} ;
      P001N2_A55TAM07_USER_ID = new String[] {""} ;
      P001N2_A313TAM07_USER_KANA_NM = new String[] {""} ;
      P001N2_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      P001N2_A56TAM07_AUTH_CD = new String[] {""} ;
      P001N2_n56TAM07_AUTH_CD = new boolean[] {false} ;
      P001N2_A333TAM07_SITE_ID = new String[] {""} ;
      P001N2_n333TAM07_SITE_ID = new boolean[] {false} ;
      P001N2_A683TAM07_EMAIL = new String[] {""} ;
      P001N2_n683TAM07_EMAIL = new boolean[] {false} ;
      P001N2_A214TAM07_DEL_FLG = new String[] {""} ;
      P001N2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P001N2_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001N2_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      P001N2_A264TAM07_CRT_USER_ID = new String[] {""} ;
      P001N2_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      P001N2_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      P001N2_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      P001N2_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001N2_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      P001N2_A265TAM07_UPD_USER_ID = new String[] {""} ;
      P001N2_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      P001N2_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      P001N2_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      P001N2_A299TAM07_UPD_CNT = new long[1] ;
      P001N2_n299TAM07_UPD_CNT = new boolean[] {false} ;
      A313TAM07_USER_KANA_NM = "" ;
      A56TAM07_AUTH_CD = "" ;
      A333TAM07_SITE_ID = "" ;
      A683TAM07_EMAIL = "" ;
      A214TAM07_DEL_FLG = "" ;
      A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A264TAM07_CRT_USER_ID = "" ;
      A230TAM07_CRT_PROG_NM = "" ;
      A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A265TAM07_UPD_USER_ID = "" ;
      A232TAM07_UPD_PROG_NM = "" ;
      AV26Pgmname = "" ;
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV21W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      GXv_char4 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new aa206_pc01_user_mst_csv__default(),
         new Object[] {
             new Object[] {
            P001N2_A205TAM07_USER_NM, P001N2_n205TAM07_USER_NM, P001N2_A55TAM07_USER_ID, P001N2_A313TAM07_USER_KANA_NM, P001N2_n313TAM07_USER_KANA_NM, P001N2_A56TAM07_AUTH_CD, P001N2_n56TAM07_AUTH_CD, P001N2_A333TAM07_SITE_ID, P001N2_n333TAM07_SITE_ID, P001N2_A683TAM07_EMAIL,
            P001N2_n683TAM07_EMAIL, P001N2_A214TAM07_DEL_FLG, P001N2_n214TAM07_DEL_FLG, P001N2_A229TAM07_CRT_DATETIME, P001N2_n229TAM07_CRT_DATETIME, P001N2_A264TAM07_CRT_USER_ID, P001N2_n264TAM07_CRT_USER_ID, P001N2_A230TAM07_CRT_PROG_NM, P001N2_n230TAM07_CRT_PROG_NM, P001N2_A231TAM07_UPD_DATETIME,
            P001N2_n231TAM07_UPD_DATETIME, P001N2_A265TAM07_UPD_USER_ID, P001N2_n265TAM07_UPD_USER_ID, P001N2_A232TAM07_UPD_PROG_NM, P001N2_n232TAM07_UPD_PROG_NM, P001N2_A299TAM07_UPD_CNT, P001N2_n299TAM07_UPD_CNT
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV26Pgmname = "AA206_PC01_USER_MST_CSV" ;
      /* GeneXus formulas. */
      AV26Pgmname = "AA206_PC01_USER_MST_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV14W_CSV_CNT ;
   private long A299TAM07_UPD_CNT ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String AV26Pgmname ;
   private String GXt_char1 ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Gx_emsg ;
   private java.util.Date A229TAM07_CRT_DATETIME ;
   private java.util.Date A231TAM07_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n205TAM07_USER_NM ;
   private boolean n313TAM07_USER_KANA_NM ;
   private boolean n56TAM07_AUTH_CD ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n683TAM07_EMAIL ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n229TAM07_CRT_DATETIME ;
   private boolean n264TAM07_CRT_USER_ID ;
   private boolean n230TAM07_CRT_PROG_NM ;
   private boolean n231TAM07_UPD_DATETIME ;
   private boolean n265TAM07_UPD_USER_ID ;
   private boolean n232TAM07_UPD_PROG_NM ;
   private boolean n299TAM07_UPD_CNT ;
   private String AV9P_TAM07_USER_ID ;
   private String AV10P_TAM07_USER_NM ;
   private String AV22W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV18W_CSV_SDEL ;
   private String AV16W_CSV_FDEL ;
   private String AV17W_CSV_KAK ;
   private String AV20W_FILE_NAME ;
   private String lV9P_TAM07_USER_ID ;
   private String lV10P_TAM07_USER_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A313TAM07_USER_KANA_NM ;
   private String A56TAM07_AUTH_CD ;
   private String A333TAM07_SITE_ID ;
   private String A683TAM07_EMAIL ;
   private String A214TAM07_DEL_FLG ;
   private String A264TAM07_CRT_USER_ID ;
   private String A230TAM07_CRT_PROG_NM ;
   private String A265TAM07_UPD_USER_ID ;
   private String A232TAM07_UPD_PROG_NM ;
   private String AV19W_ERRCD ;
   private String AV21W_FILE_PATH ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P001N2_A205TAM07_USER_NM ;
   private boolean[] P001N2_n205TAM07_USER_NM ;
   private String[] P001N2_A55TAM07_USER_ID ;
   private String[] P001N2_A313TAM07_USER_KANA_NM ;
   private boolean[] P001N2_n313TAM07_USER_KANA_NM ;
   private String[] P001N2_A56TAM07_AUTH_CD ;
   private boolean[] P001N2_n56TAM07_AUTH_CD ;
   private String[] P001N2_A333TAM07_SITE_ID ;
   private boolean[] P001N2_n333TAM07_SITE_ID ;
   private String[] P001N2_A683TAM07_EMAIL ;
   private boolean[] P001N2_n683TAM07_EMAIL ;
   private String[] P001N2_A214TAM07_DEL_FLG ;
   private boolean[] P001N2_n214TAM07_DEL_FLG ;
   private java.util.Date[] P001N2_A229TAM07_CRT_DATETIME ;
   private boolean[] P001N2_n229TAM07_CRT_DATETIME ;
   private String[] P001N2_A264TAM07_CRT_USER_ID ;
   private boolean[] P001N2_n264TAM07_CRT_USER_ID ;
   private String[] P001N2_A230TAM07_CRT_PROG_NM ;
   private boolean[] P001N2_n230TAM07_CRT_PROG_NM ;
   private java.util.Date[] P001N2_A231TAM07_UPD_DATETIME ;
   private boolean[] P001N2_n231TAM07_UPD_DATETIME ;
   private String[] P001N2_A265TAM07_UPD_USER_ID ;
   private boolean[] P001N2_n265TAM07_UPD_USER_ID ;
   private String[] P001N2_A232TAM07_UPD_PROG_NM ;
   private boolean[] P001N2_n232TAM07_UPD_PROG_NM ;
   private long[] P001N2_A299TAM07_UPD_CNT ;
   private boolean[] P001N2_n299TAM07_UPD_CNT ;
   private GxObjectCollection AV12W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV13W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class aa206_pc01_user_mst_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_TAM07_USER_ID ,
                                          String AV10P_TAM07_USER_NM ,
                                          String A55TAM07_USER_ID ,
                                          String A205TAM07_USER_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [2] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TAM07_USER_NM`, `TAM07_USER_ID`, `TAM07_USER_KANA_NM`, `TAM07_AUTH_CD`, `TAM07_SITE_ID`," ;
      scmdbuf = scmdbuf + " `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_PROG_NM`, `TAM07_UPD_CNT`" ;
      scmdbuf = scmdbuf + " FROM `TAM07_USER`" ;
      if ( ! (GXutil.strcmp("", AV9P_TAM07_USER_ID)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM07_USER_ID` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM07_USER_ID` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_TAM07_USER_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TAM07_USER_ID`" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P001N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
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
                  stmt.setVarchar(sIdx, (String)parms[2], 128);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 30);
               }
               return;
      }
   }

}

