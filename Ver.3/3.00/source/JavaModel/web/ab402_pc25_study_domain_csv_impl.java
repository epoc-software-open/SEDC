/*
               File: ab402_pc25_study_domain_csv_impl
        Description: 試験別ドメインマスタCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:31.4
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab402_pc25_study_domain_csv_impl extends GXWebProcedure
{
   public ab402_pc25_study_domain_csv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      if ( GxWebError == 0 )
      {
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "ab402_pc25_study_domain_csv")), "ab402_pc25_study_domain_csv") == 0 ) )
         {
            httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "ab402_pc25_study_domain_csv"))) ;
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
         AV9P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV21W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B402" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_MSG = "" ;
      AV17W_CSV_SDEL = "\"" ;
      AV15W_CSV_FDEL = "," ;
      AV16W_CSV_KAK = ".CSV" ;
      AV13W_CSV_CNT = 0 ;
      GXt_char1 = AV19W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      ab402_pc25_study_domain_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19W_FILE_NAME = AV10W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV16W_CSV_KAK ;
      /* Using cursor P006O2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63TBM21_STUDY_ID = P006O2_A63TBM21_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P006O2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P006O2_n367TBM21_STUDY_NM[0] ;
         AV22W_TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11W_A812_SD01_CSV_OUTPUT.clear();
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験ID", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメインコード", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン英語名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイン日本語名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("ドメイングループ名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("備考", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("表示順", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("削除フラグ（0:利用可能 1:利用不可）", 0);
      AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      /* Using cursor P006O3 */
      pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A203TBM42_STUDY_ID = P006O3_A203TBM42_STUDY_ID[0] ;
         A204TBM42_DOM_CD = P006O3_A204TBM42_DOM_CD[0] ;
         A905TBM42_DOM_ENM = P006O3_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = P006O3_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = P006O3_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = P006O3_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = P006O3_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = P006O3_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = P006O3_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = P006O3_n908TBM42_NOTE[0] ;
         A893TBM42_DEL_FLG = P006O3_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = P006O3_n893TBM42_DEL_FLG[0] ;
         A909TBM42_ORDER = P006O3_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = P006O3_n909TBM42_ORDER[0] ;
         AV13W_CSV_CNT = (long)(AV13W_CSV_CNT+1) ;
         AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(AV22W_TBM21_STUDY_NM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A204TBM42_DOM_CD, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A905TBM42_DOM_ENM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A906TBM42_DOM_JNM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A907TBM42_DOM_GRP_NM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A908TBM42_NOTE, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A909TBM42_ORDER, 10, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A893TBM42_DEL_FLG, 0);
         AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV13W_CSV_CNT > 0 )
      {
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
         GXt_char1 = AV21W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         ab402_pc25_study_domain_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21W_MSG = GXt_char1 ;
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
      GXv_SdtA_LOGIN_SDT3[0] = AV10W_A_LOGIN_SDT;
      GXv_char2[0] = AV18W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab402_pc25_study_domain_csv_impl.this.AV18W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV18W_ERRCD, "0") != 0 )
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
      GXv_char2[0] = AV20W_FILE_PATH ;
      GXv_char4[0] = AV21W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV10W_A_LOGIN_SDT, "", AV11W_A812_SD01_CSV_OUTPUT, AV19W_FILE_NAME, GXv_char2, GXv_char4) ;
      ab402_pc25_study_domain_csv_impl.this.AV20W_FILE_PATH = GXv_char2[0] ;
      ab402_pc25_study_domain_csv_impl.this.AV21W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV21W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV23W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char4) ;
      ab402_pc25_study_domain_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23W_DOWNLOAD_NM = "試験別ドメインマスタ_" + GXt_char1 + AV16W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "aa811_pc02_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV23W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(0) ;
   }

   public void S141( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
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
      AV21W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV17W_CSV_SDEL = "" ;
      AV15W_CSV_FDEL = "" ;
      AV16W_CSV_KAK = "" ;
      AV19W_FILE_NAME = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P006O2_A63TBM21_STUDY_ID = new long[1] ;
      P006O2_A367TBM21_STUDY_NM = new String[] {""} ;
      P006O2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      AV22W_TBM21_STUDY_NM = "" ;
      AV11W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      P006O3_A203TBM42_STUDY_ID = new long[1] ;
      P006O3_A204TBM42_DOM_CD = new String[] {""} ;
      P006O3_A905TBM42_DOM_ENM = new String[] {""} ;
      P006O3_n905TBM42_DOM_ENM = new boolean[] {false} ;
      P006O3_A906TBM42_DOM_JNM = new String[] {""} ;
      P006O3_n906TBM42_DOM_JNM = new boolean[] {false} ;
      P006O3_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      P006O3_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      P006O3_A908TBM42_NOTE = new String[] {""} ;
      P006O3_n908TBM42_NOTE = new boolean[] {false} ;
      P006O3_A893TBM42_DEL_FLG = new String[] {""} ;
      P006O3_n893TBM42_DEL_FLG = new boolean[] {false} ;
      P006O3_A909TBM42_ORDER = new int[1] ;
      P006O3_n909TBM42_ORDER = new boolean[] {false} ;
      A204TBM42_DOM_CD = "" ;
      A905TBM42_DOM_ENM = "" ;
      A906TBM42_DOM_JNM = "" ;
      A907TBM42_DOM_GRP_NM = "" ;
      A908TBM42_NOTE = "" ;
      A893TBM42_DEL_FLG = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV18W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV20W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV23W_DOWNLOAD_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      AV28Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab402_pc25_study_domain_csv__default(),
         new Object[] {
             new Object[] {
            P006O2_A63TBM21_STUDY_ID, P006O2_A367TBM21_STUDY_NM, P006O2_n367TBM21_STUDY_NM
            }
            , new Object[] {
            P006O3_A203TBM42_STUDY_ID, P006O3_A204TBM42_DOM_CD, P006O3_A905TBM42_DOM_ENM, P006O3_n905TBM42_DOM_ENM, P006O3_A906TBM42_DOM_JNM, P006O3_n906TBM42_DOM_JNM, P006O3_A907TBM42_DOM_GRP_NM, P006O3_n907TBM42_DOM_GRP_NM, P006O3_A908TBM42_NOTE, P006O3_n908TBM42_NOTE,
            P006O3_A893TBM42_DEL_FLG, P006O3_n893TBM42_DEL_FLG, P006O3_A909TBM42_ORDER, P006O3_n909TBM42_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "AB402_PC25_STUDY_DOMAIN_CSV" ;
      /* GeneXus formulas. */
      AV28Pgmname = "AB402_PC25_STUDY_DOMAIN_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private int A909TBM42_ORDER ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long AV13W_CSV_CNT ;
   private long A63TBM21_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV28Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n905TBM42_DOM_ENM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n907TBM42_DOM_GRP_NM ;
   private boolean n908TBM42_NOTE ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n909TBM42_ORDER ;
   private String AV21W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV17W_CSV_SDEL ;
   private String AV15W_CSV_FDEL ;
   private String AV16W_CSV_KAK ;
   private String AV19W_FILE_NAME ;
   private String A367TBM21_STUDY_NM ;
   private String AV22W_TBM21_STUDY_NM ;
   private String A204TBM42_DOM_CD ;
   private String A905TBM42_DOM_ENM ;
   private String A906TBM42_DOM_JNM ;
   private String A907TBM42_DOM_GRP_NM ;
   private String A908TBM42_NOTE ;
   private String A893TBM42_DEL_FLG ;
   private String AV18W_ERRCD ;
   private String AV20W_FILE_PATH ;
   private String AV23W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private long[] P006O2_A63TBM21_STUDY_ID ;
   private String[] P006O2_A367TBM21_STUDY_NM ;
   private boolean[] P006O2_n367TBM21_STUDY_NM ;
   private long[] P006O3_A203TBM42_STUDY_ID ;
   private String[] P006O3_A204TBM42_DOM_CD ;
   private String[] P006O3_A905TBM42_DOM_ENM ;
   private boolean[] P006O3_n905TBM42_DOM_ENM ;
   private String[] P006O3_A906TBM42_DOM_JNM ;
   private boolean[] P006O3_n906TBM42_DOM_JNM ;
   private String[] P006O3_A907TBM42_DOM_GRP_NM ;
   private boolean[] P006O3_n907TBM42_DOM_GRP_NM ;
   private String[] P006O3_A908TBM42_NOTE ;
   private boolean[] P006O3_n908TBM42_NOTE ;
   private String[] P006O3_A893TBM42_DEL_FLG ;
   private boolean[] P006O3_n893TBM42_DEL_FLG ;
   private int[] P006O3_A909TBM42_ORDER ;
   private boolean[] P006O3_n909TBM42_ORDER ;
   private GxObjectCollection AV11W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV12W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class ab402_pc25_study_domain_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006O2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006O3", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_DEL_FLG`, `TBM42_ORDER` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

