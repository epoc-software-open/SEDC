/*
               File: ab402_pc25_study_domain_csv_impl
        Description: 試験別ドメインマスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:21.1
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
      /* Execute user subroutine: S11129 */
      S11129 ();
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
      /* Using cursor P006J2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A186TBM21_STUDY_ID = P006J2_A186TBM21_STUDY_ID[0] ;
         A187TBM21_STUDY_NM = P006J2_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = P006J2_n187TBM21_STUDY_NM[0] ;
         AV22W_TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
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
      /* Using cursor P006J3 */
      pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A886TBM42_STUDY_ID = P006J3_A886TBM42_STUDY_ID[0] ;
         A893TBM42_DOM_CD = P006J3_A893TBM42_DOM_CD[0] ;
         A888TBM42_DOM_ENM = P006J3_A888TBM42_DOM_ENM[0] ;
         n888TBM42_DOM_ENM = P006J3_n888TBM42_DOM_ENM[0] ;
         A889TBM42_DOM_JNM = P006J3_A889TBM42_DOM_JNM[0] ;
         n889TBM42_DOM_JNM = P006J3_n889TBM42_DOM_JNM[0] ;
         A890TBM42_DOM_GRP_NM = P006J3_A890TBM42_DOM_GRP_NM[0] ;
         n890TBM42_DOM_GRP_NM = P006J3_n890TBM42_DOM_GRP_NM[0] ;
         A891TBM42_NOTE = P006J3_A891TBM42_NOTE[0] ;
         n891TBM42_NOTE = P006J3_n891TBM42_NOTE[0] ;
         A887TBM42_DEL_FLG = P006J3_A887TBM42_DEL_FLG[0] ;
         n887TBM42_DEL_FLG = P006J3_n887TBM42_DEL_FLG[0] ;
         A892TBM42_ORDER = P006J3_A892TBM42_ORDER[0] ;
         n892TBM42_ORDER = P006J3_n892TBM42_ORDER[0] ;
         AV13W_CSV_CNT = (long)(AV13W_CSV_CNT+1) ;
         AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(AV22W_TBM21_STUDY_NM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A893TBM42_DOM_CD, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A888TBM42_DOM_ENM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A889TBM42_DOM_JNM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A890TBM42_DOM_GRP_NM, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A891TBM42_NOTE, 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A892TBM42_ORDER, 10, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A887TBM42_DEL_FLG, 0);
         AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV13W_CSV_CNT > 0 )
      {
         /* Execute user subroutine: S12147 */
         S12147 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13167 */
         S13167 ();
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

   public void S11129( )
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12147( )
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

   public void S13167( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV23W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char4) ;
      ab402_pc25_study_domain_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23W_DOWNLOAD_NM = "試験別ドメインマスタ_" + GXt_char1 + AV16W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV23W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S14180( )
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
                  /* Execute user subroutine: S14180 */
                  S14180 ();
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
      P006J2_A186TBM21_STUDY_ID = new long[1] ;
      P006J2_A187TBM21_STUDY_NM = new String[] {""} ;
      P006J2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      AV22W_TBM21_STUDY_NM = "" ;
      AV11W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      P006J3_A886TBM42_STUDY_ID = new long[1] ;
      P006J3_A893TBM42_DOM_CD = new String[] {""} ;
      P006J3_A888TBM42_DOM_ENM = new String[] {""} ;
      P006J3_n888TBM42_DOM_ENM = new boolean[] {false} ;
      P006J3_A889TBM42_DOM_JNM = new String[] {""} ;
      P006J3_n889TBM42_DOM_JNM = new boolean[] {false} ;
      P006J3_A890TBM42_DOM_GRP_NM = new String[] {""} ;
      P006J3_n890TBM42_DOM_GRP_NM = new boolean[] {false} ;
      P006J3_A891TBM42_NOTE = new String[] {""} ;
      P006J3_n891TBM42_NOTE = new boolean[] {false} ;
      P006J3_A887TBM42_DEL_FLG = new String[] {""} ;
      P006J3_n887TBM42_DEL_FLG = new boolean[] {false} ;
      P006J3_A892TBM42_ORDER = new int[1] ;
      P006J3_n892TBM42_ORDER = new boolean[] {false} ;
      A893TBM42_DOM_CD = "" ;
      A888TBM42_DOM_ENM = "" ;
      A889TBM42_DOM_JNM = "" ;
      A890TBM42_DOM_GRP_NM = "" ;
      A891TBM42_NOTE = "" ;
      A887TBM42_DEL_FLG = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV18W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV20W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV23W_DOWNLOAD_NM = "" ;
      GXv_char4 = new String [1] ;
      AV28Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab402_pc25_study_domain_csv__default(),
         new Object[] {
             new Object[] {
            P006J2_A186TBM21_STUDY_ID, P006J2_A187TBM21_STUDY_NM, P006J2_n187TBM21_STUDY_NM
            }
            , new Object[] {
            P006J3_A886TBM42_STUDY_ID, P006J3_A893TBM42_DOM_CD, P006J3_A888TBM42_DOM_ENM, P006J3_n888TBM42_DOM_ENM, P006J3_A889TBM42_DOM_JNM, P006J3_n889TBM42_DOM_JNM, P006J3_A890TBM42_DOM_GRP_NM, P006J3_n890TBM42_DOM_GRP_NM, P006J3_A891TBM42_NOTE, P006J3_n891TBM42_NOTE,
            P006J3_A887TBM42_DEL_FLG, P006J3_n887TBM42_DEL_FLG, P006J3_A892TBM42_ORDER, P006J3_n892TBM42_ORDER
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
   private int A892TBM42_ORDER ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long AV13W_CSV_CNT ;
   private long A186TBM21_STUDY_ID ;
   private long A886TBM42_STUDY_ID ;
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
   private boolean n187TBM21_STUDY_NM ;
   private boolean n888TBM42_DOM_ENM ;
   private boolean n889TBM42_DOM_JNM ;
   private boolean n890TBM42_DOM_GRP_NM ;
   private boolean n891TBM42_NOTE ;
   private boolean n887TBM42_DEL_FLG ;
   private boolean n892TBM42_ORDER ;
   private String AV21W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV17W_CSV_SDEL ;
   private String AV15W_CSV_FDEL ;
   private String AV16W_CSV_KAK ;
   private String AV19W_FILE_NAME ;
   private String A187TBM21_STUDY_NM ;
   private String AV22W_TBM21_STUDY_NM ;
   private String A893TBM42_DOM_CD ;
   private String A888TBM42_DOM_ENM ;
   private String A889TBM42_DOM_JNM ;
   private String A890TBM42_DOM_GRP_NM ;
   private String A891TBM42_NOTE ;
   private String A887TBM42_DEL_FLG ;
   private String AV18W_ERRCD ;
   private String AV20W_FILE_PATH ;
   private String AV23W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private long[] P006J2_A186TBM21_STUDY_ID ;
   private String[] P006J2_A187TBM21_STUDY_NM ;
   private boolean[] P006J2_n187TBM21_STUDY_NM ;
   private long[] P006J3_A886TBM42_STUDY_ID ;
   private String[] P006J3_A893TBM42_DOM_CD ;
   private String[] P006J3_A888TBM42_DOM_ENM ;
   private boolean[] P006J3_n888TBM42_DOM_ENM ;
   private String[] P006J3_A889TBM42_DOM_JNM ;
   private boolean[] P006J3_n889TBM42_DOM_JNM ;
   private String[] P006J3_A890TBM42_DOM_GRP_NM ;
   private boolean[] P006J3_n890TBM42_DOM_GRP_NM ;
   private String[] P006J3_A891TBM42_NOTE ;
   private boolean[] P006J3_n891TBM42_NOTE ;
   private String[] P006J3_A887TBM42_DEL_FLG ;
   private boolean[] P006J3_n887TBM42_DEL_FLG ;
   private int[] P006J3_A892TBM42_ORDER ;
   private boolean[] P006J3_n892TBM42_ORDER ;
   private GxObjectCollection AV11W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV12W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class ab402_pc25_study_domain_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006J2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006J3", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_DEL_FLG`, `TBM42_ORDER` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

