/*
               File: ab705_pc03_signature_user_chk_impl
        Description: CRF署名ユーザチェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.31
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab705_pc03_signature_user_chk_impl extends GXWebProcedure
{
   public ab705_pc03_signature_user_chk_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV30P_IN_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV31P_IN_USER_ID = httpContext.GetNextPar( ) ;
            AV32P_IN_PASSWORD = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV38C_RTN_CD_OK = "0" ;
      AV36C_RTN_CD_NG = "1" ;
      AV37C_RTN_CD_DB_ERR = "9" ;
      AV33P_OUT_RESULT_CD = AV38C_RTN_CD_OK ;
      AV34P_OUT_ERR_MSG = "" ;
      if ( GXutil.strcmp(AV33P_OUT_RESULT_CD, AV38C_RTN_CD_OK) == 0 )
      {
         if ( (0==AV30P_IN_STUDY_ID) )
         {
            AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
            GXt_char1 = AV34P_OUT_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34P_OUT_ERR_MSG = GXt_char1 ;
         }
      }
      if ( GXutil.strcmp(AV33P_OUT_RESULT_CD, AV38C_RTN_CD_OK) == 0 )
      {
         if ( (GXutil.strcmp("", AV31P_IN_USER_ID)==0) )
         {
            AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
            GXt_char1 = AV34P_OUT_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "ユーザーID", "", "", "", "", GXv_char2) ;
            ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34P_OUT_ERR_MSG = GXt_char1 ;
         }
      }
      if ( GXutil.strcmp(AV33P_OUT_RESULT_CD, AV38C_RTN_CD_OK) == 0 )
      {
         if ( (GXutil.strcmp("", AV32P_IN_PASSWORD)==0) )
         {
            AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
            GXt_char1 = AV34P_OUT_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "パスワード", "", "", "", "", GXv_char2) ;
            ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34P_OUT_ERR_MSG = GXt_char1 ;
         }
      }
      if ( GXutil.strcmp(AV33P_OUT_RESULT_CD, AV38C_RTN_CD_OK) == 0 )
      {
         AV44GXLvl68 = (byte)(0) ;
         /* Using cursor P00702 */
         pr_default.execute(0, new Object[] {AV31P_IN_USER_ID, AV32P_IN_PASSWORD});
         if ( Gx_err != 0 )
         {
            AV44GXLvl68 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A214TAM07_DEL_FLG = P00702_A214TAM07_DEL_FLG[0] ;
            n214TAM07_DEL_FLG = P00702_n214TAM07_DEL_FLG[0] ;
            A210TAM07_PWD = P00702_A210TAM07_PWD[0] ;
            n210TAM07_PWD = P00702_n210TAM07_PWD[0] ;
            A55TAM07_USER_ID = P00702_A55TAM07_USER_ID[0] ;
            AV44GXLvl68 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV44GXLvl68 == 0 )
         {
            AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
            GXt_char1 = AV34P_OUT_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00029", "", "", "", "", "", GXv_char2) ;
            ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34P_OUT_ERR_MSG = GXt_char1 ;
         }
      }
      if ( GXutil.strcmp(AV33P_OUT_RESULT_CD, AV38C_RTN_CD_OK) == 0 )
      {
         AV39SD_B705_SD05_C.clear();
         /* Using cursor P00703 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            A300TAS01_DEL_FLG = P00703_A300TAS01_DEL_FLG[0] ;
            n300TAS01_DEL_FLG = P00703_n300TAS01_DEL_FLG[0] ;
            A7TAS01_DATA_KIND = P00703_A7TAS01_DATA_KIND[0] ;
            A9TAS01_ITEM_NM = P00703_A9TAS01_ITEM_NM[0] ;
            n9TAS01_ITEM_NM = P00703_n9TAS01_ITEM_NM[0] ;
            A8TAS01_ITEM_CD = P00703_A8TAS01_ITEM_CD[0] ;
            AV40SD_B705_SD05_I = "" ;
            AV40SD_B705_SD05_I = A9TAS01_ITEM_NM ;
            AV39SD_B705_SD05_C.add(AV40SD_B705_SD05_I, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.strcmp(AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), AV31P_IN_USER_ID) == 0 )
         {
            if ( (AV39SD_B705_SD05_C.indexof(AV19SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd())>0) )
            {
            }
            else
            {
               AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
               GXt_char1 = AV34P_OUT_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00095", "", "", "", "", "", GXv_char2) ;
               ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
               AV34P_OUT_ERR_MSG = GXt_char1 ;
            }
         }
         else
         {
            AV46GXLvl118 = (byte)(0) ;
            pr_default.dynParam(2, new Object[]{ new Object[]{
                                                 A109TBM23_STYDY_AUTH_CD ,
                                                 AV39SD_B705_SD05_C ,
                                                 A385TBM23_DEL_FLG ,
                                                 new Long(AV30P_IN_STUDY_ID) ,
                                                 AV31P_IN_USER_ID ,
                                                 new Long(A107TBM23_STUDY_ID) ,
                                                 A108TBM23_USER_ID },
                                                 new int[] {
                                                 TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P00704 */
            pr_default.execute(2, new Object[] {new Long(AV30P_IN_STUDY_ID), AV31P_IN_USER_ID});
            if ( Gx_err != 0 )
            {
               AV46GXLvl118 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(2) != 101) )
            {
               A385TBM23_DEL_FLG = P00704_A385TBM23_DEL_FLG[0] ;
               n385TBM23_DEL_FLG = P00704_n385TBM23_DEL_FLG[0] ;
               A109TBM23_STYDY_AUTH_CD = P00704_A109TBM23_STYDY_AUTH_CD[0] ;
               A108TBM23_USER_ID = P00704_A108TBM23_USER_ID[0] ;
               A107TBM23_STUDY_ID = P00704_A107TBM23_STUDY_ID[0] ;
               AV46GXLvl118 = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV46GXLvl118 == 0 )
            {
               AV33P_OUT_RESULT_CD = AV36C_RTN_CD_NG ;
               GXt_char1 = AV34P_OUT_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00095", "", "", "", "", "", GXv_char2) ;
               ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
               AV34P_OUT_ERR_MSG = GXt_char1 ;
            }
         }
         AV39SD_B705_SD05_C.clear();
      }
      AV41SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( AV33P_OUT_RESULT_CD );
      AV41SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( AV34P_OUT_ERR_MSG );
      AV8HttpResponse.addString(AV41SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
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
      GXv_SdtA_LOGIN_SDT3[0] = AV22W_A_LOGIN_SDT;
      GXv_char2[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab705_pc03_signature_user_chk_impl.this.AV24W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         AV41SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "9" );
         AV8HttpResponse.addString(AV41SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV28W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      ab705_pc03_signature_user_chk_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28W_SESSION_KEY = GXt_char1 ;
      AV19SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV27W_SESSION.getValue(AV28W_SESSION_KEY), "");
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV47Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV41SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( AV37C_RTN_CD_DB_ERR );
      AV8HttpResponse.addString(AV41SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      gxfirstwebparm = "" ;
      AV31P_IN_USER_ID = "" ;
      AV32P_IN_PASSWORD = "" ;
      AV38C_RTN_CD_OK = "" ;
      AV36C_RTN_CD_NG = "" ;
      AV37C_RTN_CD_DB_ERR = "" ;
      AV33P_OUT_RESULT_CD = "" ;
      AV34P_OUT_ERR_MSG = "" ;
      scmdbuf = "" ;
      P00702_A214TAM07_DEL_FLG = new String[] {""} ;
      P00702_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P00702_A210TAM07_PWD = new String[] {""} ;
      P00702_n210TAM07_PWD = new boolean[] {false} ;
      P00702_A55TAM07_USER_ID = new String[] {""} ;
      A214TAM07_DEL_FLG = "" ;
      A210TAM07_PWD = "" ;
      A55TAM07_USER_ID = "" ;
      AV39SD_B705_SD05_C = new GxObjectCollection(String.class, "internal", "");
      P00703_A300TAS01_DEL_FLG = new String[] {""} ;
      P00703_n300TAS01_DEL_FLG = new boolean[] {false} ;
      P00703_A7TAS01_DATA_KIND = new String[] {""} ;
      P00703_A9TAS01_ITEM_NM = new String[] {""} ;
      P00703_n9TAS01_ITEM_NM = new boolean[] {false} ;
      P00703_A8TAS01_ITEM_CD = new String[] {""} ;
      A300TAS01_DEL_FLG = "" ;
      A7TAS01_DATA_KIND = "" ;
      A9TAS01_ITEM_NM = "" ;
      A8TAS01_ITEM_CD = "" ;
      AV40SD_B705_SD05_I = "" ;
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV19SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      A108TBM23_USER_ID = "" ;
      P00704_A385TBM23_DEL_FLG = new String[] {""} ;
      P00704_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P00704_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P00704_A108TBM23_USER_ID = new String[] {""} ;
      P00704_A107TBM23_STUDY_ID = new long[1] ;
      AV41SD_B706_SD01_CRF_REG_RTN = new SdtB706_SD01_CRF_REG_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV28W_SESSION_KEY = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV27W_SESSION = httpContext.getWebSession();
      AV47Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab705_pc03_signature_user_chk__default(),
         new Object[] {
             new Object[] {
            P00702_A214TAM07_DEL_FLG, P00702_n214TAM07_DEL_FLG, P00702_A210TAM07_PWD, P00702_n210TAM07_PWD, P00702_A55TAM07_USER_ID
            }
            , new Object[] {
            P00703_A300TAS01_DEL_FLG, P00703_n300TAS01_DEL_FLG, P00703_A7TAS01_DATA_KIND, P00703_A9TAS01_ITEM_NM, P00703_n9TAS01_ITEM_NM, P00703_A8TAS01_ITEM_CD
            }
            , new Object[] {
            P00704_A385TBM23_DEL_FLG, P00704_n385TBM23_DEL_FLG, P00704_A109TBM23_STYDY_AUTH_CD, P00704_A108TBM23_USER_ID, P00704_A107TBM23_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV47Pgmname = "AB705_PC03_SIGNATURE_USER_CHK" ;
      /* GeneXus formulas. */
      AV47Pgmname = "AB705_PC03_SIGNATURE_USER_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV44GXLvl68 ;
   private byte AV46GXLvl118 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV30P_IN_STUDY_ID ;
   private long A107TBM23_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV47Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n210TAM07_PWD ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n385TBM23_DEL_FLG ;
   private String AV31P_IN_USER_ID ;
   private String AV32P_IN_PASSWORD ;
   private String AV38C_RTN_CD_OK ;
   private String AV36C_RTN_CD_NG ;
   private String AV37C_RTN_CD_DB_ERR ;
   private String AV33P_OUT_RESULT_CD ;
   private String AV34P_OUT_ERR_MSG ;
   private String A214TAM07_DEL_FLG ;
   private String A210TAM07_PWD ;
   private String A55TAM07_USER_ID ;
   private String A300TAS01_DEL_FLG ;
   private String A7TAS01_DATA_KIND ;
   private String A9TAS01_ITEM_NM ;
   private String A8TAS01_ITEM_CD ;
   private String AV40SD_B705_SD05_I ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A108TBM23_USER_ID ;
   private String AV24W_ERRCD ;
   private String AV28W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV27W_SESSION ;
   private SdtB706_SD01_CRF_REG_RTN AV41SD_B706_SD01_CRF_REG_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV19SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P00702_A214TAM07_DEL_FLG ;
   private boolean[] P00702_n214TAM07_DEL_FLG ;
   private String[] P00702_A210TAM07_PWD ;
   private boolean[] P00702_n210TAM07_PWD ;
   private String[] P00702_A55TAM07_USER_ID ;
   private String[] P00703_A300TAS01_DEL_FLG ;
   private boolean[] P00703_n300TAS01_DEL_FLG ;
   private String[] P00703_A7TAS01_DATA_KIND ;
   private String[] P00703_A9TAS01_ITEM_NM ;
   private boolean[] P00703_n9TAS01_ITEM_NM ;
   private String[] P00703_A8TAS01_ITEM_CD ;
   private String[] P00704_A385TBM23_DEL_FLG ;
   private boolean[] P00704_n385TBM23_DEL_FLG ;
   private String[] P00704_A109TBM23_STYDY_AUTH_CD ;
   private String[] P00704_A108TBM23_USER_ID ;
   private long[] P00704_A107TBM23_STUDY_ID ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private GxObjectCollection AV39SD_B705_SD05_C ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class ab705_pc03_signature_user_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00704( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A109TBM23_STYDY_AUTH_CD ,
                                          GxObjectCollection AV39SD_B705_SD05_C ,
                                          String A385TBM23_DEL_FLG ,
                                          long AV30P_IN_STUDY_ID ,
                                          String AV31P_IN_USER_ID ,
                                          long A107TBM23_STUDY_ID ,
                                          String A108TBM23_USER_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int4 ;
      GXv_int4 = new byte [2] ;
      Object[] GXv_Object5 ;
      GXv_Object5 = new Object [2] ;
      scmdbuf = "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID`" ;
      scmdbuf = scmdbuf + " FROM `TBM23_STUDY_STAFF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV39SD_B705_SD05_C, "`TBM23_STYDY_AUTH_CD` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (`TBM23_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P00704(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00702", "SELECT `TAM07_DEL_FLG`, `TAM07_PWD`, `TAM07_USER_ID` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_PWD` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00703", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B12') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00704", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(1, (String)parms[0], 256);
               stmt.setVarchar(2, (String)parms[1], 500);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 256);
               }
               return;
      }
   }

}

