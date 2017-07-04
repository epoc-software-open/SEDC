/*
               File: aa208_pc01_domain_mst_csv_impl
        Description: ドメインマスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:18.7
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa208_pc01_domain_mst_csv_impl extends GXWebProcedure
{
   public aa208_pc01_domain_mst_csv_impl( com.genexus.internet.HttpContext context )
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
         AV9P_TBM02_DOM_CD = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10P_TBM02_DOM_JNM = httpContext.GetNextPar( ) ;
            AV22W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "A208" ;
      /* Execute user subroutine: S11117 */
      S11117 ();
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
      aa208_pc01_domain_mst_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20W_FILE_NAME = AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV17W_CSV_KAK ;
      AV12W_A812_SD01_CSV_OUTPUT.clear();
      AV13W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメインコード", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン英語名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン日本語名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイングループ名", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("備考", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("表示順", 0);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("削除フラグ（0:利用可能 1:利用不可）", 0);
      AV12W_A812_SD01_CSV_OUTPUT.add(AV13W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_TBM02_DOM_CD ,
                                           AV10P_TBM02_DOM_JNM ,
                                           A516TBM02_DOM_CD ,
                                           A518TBM02_DOM_JNM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV9P_TBM02_DOM_CD = GXutil.padr( GXutil.rtrim( AV9P_TBM02_DOM_CD), 2, "%") ;
      lV10P_TBM02_DOM_JNM = GXutil.padr( GXutil.rtrim( AV10P_TBM02_DOM_JNM), 50, "%") ;
      /* Using cursor P006D2 */
      pr_default.execute(0, new Object[] {lV9P_TBM02_DOM_CD, lV10P_TBM02_DOM_JNM});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A518TBM02_DOM_JNM = P006D2_A518TBM02_DOM_JNM[0] ;
         n518TBM02_DOM_JNM = P006D2_n518TBM02_DOM_JNM[0] ;
         A516TBM02_DOM_CD = P006D2_A516TBM02_DOM_CD[0] ;
         A517TBM02_DOM_ENM = P006D2_A517TBM02_DOM_ENM[0] ;
         n517TBM02_DOM_ENM = P006D2_n517TBM02_DOM_ENM[0] ;
         A519TBM02_DOM_GRP_NM = P006D2_A519TBM02_DOM_GRP_NM[0] ;
         n519TBM02_DOM_GRP_NM = P006D2_n519TBM02_DOM_GRP_NM[0] ;
         A520TBM02_NOTE = P006D2_A520TBM02_NOTE[0] ;
         n520TBM02_NOTE = P006D2_n520TBM02_NOTE[0] ;
         A522TBM02_DEL_FLG = P006D2_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = P006D2_n522TBM02_DEL_FLG[0] ;
         A521TBM02_ORDER = P006D2_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = P006D2_n521TBM02_ORDER[0] ;
         AV14W_CSV_CNT = (long)(AV14W_CSV_CNT+1) ;
         AV13W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A516TBM02_DOM_CD, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A517TBM02_DOM_ENM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A518TBM02_DOM_JNM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A519TBM02_DOM_GRP_NM, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A520TBM02_NOTE, 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A521TBM02_ORDER, 10, 0)), 0);
         AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A522TBM02_DEL_FLG, 0);
         AV12W_A812_SD01_CSV_OUTPUT.add(AV13W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14W_CSV_CNT > 0 )
      {
         /* Execute user subroutine: S12135 */
         S12135 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13155 */
         S13155 ();
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
         aa208_pc01_domain_mst_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22W_MSG = GXt_char1 ;
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11117( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      aa208_pc01_domain_mst_csv_impl.this.AV19W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12135( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV21W_FILE_PATH ;
      GXv_char4[0] = AV22W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV11W_A_LOGIN_SDT, "", AV12W_A812_SD01_CSV_OUTPUT, AV20W_FILE_NAME, GXv_char2, GXv_char4) ;
      aa208_pc01_domain_mst_csv_impl.this.AV21W_FILE_PATH = GXv_char2[0] ;
      aa208_pc01_domain_mst_csv_impl.this.AV22W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV22W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S13155( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV23W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDD", GXv_char4) ;
      aa208_pc01_domain_mst_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23W_DOWNLOAD_NM = "ドメインマスタ_" + GXt_char1 + AV17W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV21W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV23W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S14168( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV27Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
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
                  /* Execute user subroutine: S14168 */
                  S14168 ();
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
      AV9P_TBM02_DOM_CD = "" ;
      AV10P_TBM02_DOM_JNM = "" ;
      AV22W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV18W_CSV_SDEL = "" ;
      AV16W_CSV_FDEL = "" ;
      AV17W_CSV_KAK = "" ;
      AV20W_FILE_NAME = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV12W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV13W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      scmdbuf = "" ;
      lV9P_TBM02_DOM_CD = "" ;
      lV10P_TBM02_DOM_JNM = "" ;
      A516TBM02_DOM_CD = "" ;
      A518TBM02_DOM_JNM = "" ;
      P006D2_A518TBM02_DOM_JNM = new String[] {""} ;
      P006D2_n518TBM02_DOM_JNM = new boolean[] {false} ;
      P006D2_A516TBM02_DOM_CD = new String[] {""} ;
      P006D2_A517TBM02_DOM_ENM = new String[] {""} ;
      P006D2_n517TBM02_DOM_ENM = new boolean[] {false} ;
      P006D2_A519TBM02_DOM_GRP_NM = new String[] {""} ;
      P006D2_n519TBM02_DOM_GRP_NM = new boolean[] {false} ;
      P006D2_A520TBM02_NOTE = new String[] {""} ;
      P006D2_n520TBM02_NOTE = new boolean[] {false} ;
      P006D2_A522TBM02_DEL_FLG = new String[] {""} ;
      P006D2_n522TBM02_DEL_FLG = new boolean[] {false} ;
      P006D2_A521TBM02_ORDER = new int[1] ;
      P006D2_n521TBM02_ORDER = new boolean[] {false} ;
      A517TBM02_DOM_ENM = "" ;
      A519TBM02_DOM_GRP_NM = "" ;
      A520TBM02_NOTE = "" ;
      A522TBM02_DEL_FLG = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV21W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV23W_DOWNLOAD_NM = "" ;
      GXv_char4 = new String [1] ;
      AV27Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new aa208_pc01_domain_mst_csv__default(),
         new Object[] {
             new Object[] {
            P006D2_A518TBM02_DOM_JNM, P006D2_n518TBM02_DOM_JNM, P006D2_A516TBM02_DOM_CD, P006D2_A517TBM02_DOM_ENM, P006D2_n517TBM02_DOM_ENM, P006D2_A519TBM02_DOM_GRP_NM, P006D2_n519TBM02_DOM_GRP_NM, P006D2_A520TBM02_NOTE, P006D2_n520TBM02_NOTE, P006D2_A522TBM02_DEL_FLG,
            P006D2_n522TBM02_DEL_FLG, P006D2_A521TBM02_ORDER, P006D2_n521TBM02_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV27Pgmname = "AA208_PC01_DOMAIN_MST_CSV" ;
      /* GeneXus formulas. */
      AV27Pgmname = "AA208_PC01_DOMAIN_MST_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private int A521TBM02_ORDER ;
   private int GXActiveErrHndl ;
   private long AV14W_CSV_CNT ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV27Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n518TBM02_DOM_JNM ;
   private boolean n517TBM02_DOM_ENM ;
   private boolean n519TBM02_DOM_GRP_NM ;
   private boolean n520TBM02_NOTE ;
   private boolean n522TBM02_DEL_FLG ;
   private boolean n521TBM02_ORDER ;
   private String AV9P_TBM02_DOM_CD ;
   private String AV10P_TBM02_DOM_JNM ;
   private String AV22W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV18W_CSV_SDEL ;
   private String AV16W_CSV_FDEL ;
   private String AV17W_CSV_KAK ;
   private String AV20W_FILE_NAME ;
   private String lV9P_TBM02_DOM_CD ;
   private String lV10P_TBM02_DOM_JNM ;
   private String A516TBM02_DOM_CD ;
   private String A518TBM02_DOM_JNM ;
   private String A517TBM02_DOM_ENM ;
   private String A519TBM02_DOM_GRP_NM ;
   private String A520TBM02_NOTE ;
   private String A522TBM02_DEL_FLG ;
   private String AV19W_ERRCD ;
   private String AV21W_FILE_PATH ;
   private String AV23W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P006D2_A518TBM02_DOM_JNM ;
   private boolean[] P006D2_n518TBM02_DOM_JNM ;
   private String[] P006D2_A516TBM02_DOM_CD ;
   private String[] P006D2_A517TBM02_DOM_ENM ;
   private boolean[] P006D2_n517TBM02_DOM_ENM ;
   private String[] P006D2_A519TBM02_DOM_GRP_NM ;
   private boolean[] P006D2_n519TBM02_DOM_GRP_NM ;
   private String[] P006D2_A520TBM02_NOTE ;
   private boolean[] P006D2_n520TBM02_NOTE ;
   private String[] P006D2_A522TBM02_DEL_FLG ;
   private boolean[] P006D2_n522TBM02_DEL_FLG ;
   private int[] P006D2_A521TBM02_ORDER ;
   private boolean[] P006D2_n521TBM02_ORDER ;
   private GxObjectCollection AV12W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV13W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class aa208_pc01_domain_mst_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P006D2( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_TBM02_DOM_CD ,
                                          String AV10P_TBM02_DOM_JNM ,
                                          String A516TBM02_DOM_CD ,
                                          String A518TBM02_DOM_JNM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [2] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM02_DOM_JNM`, `TBM02_DOM_CD`, `TBM02_DOM_ENM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`," ;
      scmdbuf = scmdbuf + " `TBM02_DEL_FLG`, `TBM02_ORDER` FROM `TBM02_CDISC_DOMAIN`" ;
      if ( ! (GXutil.strcmp("", AV9P_TBM02_DOM_CD)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_TBM02_DOM_JNM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM02_DOM_JNM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM02_DOM_JNM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE " + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM02_ORDER`" ;
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
                  return conditional_P006D2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((int[]) buf[11])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[2], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 50);
               }
               break;
      }
   }

}

