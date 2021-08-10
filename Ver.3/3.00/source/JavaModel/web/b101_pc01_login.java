/*
               File: B101_PC01_LOGIN
        Description: ログイン処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:27.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b101_pc01_login extends GXProcedure
{
   public b101_pc01_login( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b101_pc01_login.class ), "" );
   }

   public b101_pc01_login( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b101_pc01_login.this.AV10P_USER_ID = aP0[0];
      this.aP0 = aP0;
      b101_pc01_login.this.AV9P_PWD = aP1;
      b101_pc01_login.this.aP2 = aP2;
      b101_pc01_login.this.aP3 = aP3;
      b101_pc01_login.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      b101_pc01_login.this.AV10P_USER_ID = aP0[0];
      this.aP0 = aP0;
      b101_pc01_login.this.AV9P_PWD = aP1;
      b101_pc01_login.this.aP2 = aP2;
      b101_pc01_login.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B101" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      if ( (GXutil.strcmp("", AV10P_USER_ID)==0) && (GXutil.strcmp("", AV9P_PWD)==0) )
      {
         GXv_SdtA_LOGIN_SDT1[0] = AV11W_A_LOGIN_SDT;
         GXv_char2[0] = AV16W_ERRCD ;
         new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
         AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
         b101_pc01_login.this.AV16W_ERRCD = GXv_char2[0] ;
         if ( GXutil.strcmp(AV16W_ERRCD, "0") != 0 )
         {
            AV13W_RTN_CD = (short)(1) ;
            GXt_char3 = AV14W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00047", "", "", "", "", "", GXv_char2) ;
            b101_pc01_login.this.GXt_char3 = GXv_char2[0] ;
            AV14W_RTN_MSG = GXt_char3 ;
         }
         else
         {
            AV10P_USER_ID = AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         }
      }
      else
      {
         if ( AV13W_RTN_CD == 0 )
         {
            if ( (GXutil.strcmp("", AV10P_USER_ID)==0) )
            {
               AV13W_RTN_CD = (short)(1) ;
               GXt_char3 = AV14W_RTN_MSG ;
               GXv_char2[0] = GXt_char3 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "ユーザーID", "", "", "", "", GXv_char2) ;
               b101_pc01_login.this.GXt_char3 = GXv_char2[0] ;
               AV14W_RTN_MSG = GXt_char3 ;
            }
         }
         if ( AV13W_RTN_CD == 0 )
         {
            if ( (GXutil.strcmp("", AV9P_PWD)==0) )
            {
               AV13W_RTN_CD = (short)(1) ;
               GXt_char3 = AV14W_RTN_MSG ;
               GXv_char2[0] = GXt_char3 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "パスワード", "", "", "", "", GXv_char2) ;
               b101_pc01_login.this.GXt_char3 = GXv_char2[0] ;
               AV14W_RTN_MSG = GXt_char3 ;
            }
         }
         if ( AV13W_RTN_CD == 0 )
         {
            GXt_char3 = AV12W_PWD ;
            GXv_char2[0] = GXt_char3 ;
            new b801_pc01_md5(remoteHandle, context).execute( AV9P_PWD, GXv_char2) ;
            b101_pc01_login.this.GXt_char3 = GXv_char2[0] ;
            AV12W_PWD = GXt_char3 ;
            AV19GXLvl62 = (byte)(0) ;
            /* Using cursor P00292 */
            pr_default.execute(0, new Object[] {AV10P_USER_ID, AV12W_PWD});
            if ( Gx_err != 0 )
            {
               AV19GXLvl62 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(0) != 101) )
            {
               A214TAM07_DEL_FLG = P00292_A214TAM07_DEL_FLG[0] ;
               n214TAM07_DEL_FLG = P00292_n214TAM07_DEL_FLG[0] ;
               A210TAM07_PWD = P00292_A210TAM07_PWD[0] ;
               n210TAM07_PWD = P00292_n210TAM07_PWD[0] ;
               A55TAM07_USER_ID = P00292_A55TAM07_USER_ID[0] ;
               A205TAM07_USER_NM = P00292_A205TAM07_USER_NM[0] ;
               n205TAM07_USER_NM = P00292_n205TAM07_USER_NM[0] ;
               A313TAM07_USER_KANA_NM = P00292_A313TAM07_USER_KANA_NM[0] ;
               n313TAM07_USER_KANA_NM = P00292_n313TAM07_USER_KANA_NM[0] ;
               A56TAM07_AUTH_CD = P00292_A56TAM07_AUTH_CD[0] ;
               n56TAM07_AUTH_CD = P00292_n56TAM07_AUTH_CD[0] ;
               AV19GXLvl62 = (byte)(1) ;
               AV11W_A_LOGIN_SDT = (SdtA_LOGIN_SDT)new SdtA_LOGIN_SDT(remoteHandle, context);
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Session_id( AV15W_SESSION.getId() );
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_id( A55TAM07_USER_ID );
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( A205TAM07_USER_NM );
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( A313TAM07_USER_KANA_NM );
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( A56TAM07_AUTH_CD );
               GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 = new GxObjectCollection() ;
               GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5[0] = GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 ;
               new a801_pc01_sys_config_init(remoteHandle, context).execute( GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5) ;
               GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 = GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5[0] ;
               AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_A801_sys_config( GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 );
               AV15W_SESSION.setValue("Com_Login_Info", AV11W_A_LOGIN_SDT.toxml(false, true, "A_LOGIN_SDT", "tablet-EDC_GXXEV3U3"));
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV19GXLvl62 == 0 )
            {
               AV13W_RTN_CD = (short)(1) ;
               GXt_char3 = AV14W_RTN_MSG ;
               GXv_char2[0] = GXt_char3 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00029", "", "", "", "", "", GXv_char2) ;
               b101_pc01_login.this.GXt_char3 = GXv_char2[0] ;
               AV14W_RTN_MSG = GXt_char3 ;
            }
         }
         if ( AV13W_RTN_CD == 0 )
         {
            AV11W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg( "1" );
            AV15W_SESSION.setValue("Com_Login_Info", AV11W_A_LOGIN_SDT.toxml(false, true, "A_LOGIN_SDT", "tablet-EDC_GXXEV3U3"));
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV20Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV13W_RTN_CD = (short)(9) ;
      AV14W_RTN_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = b101_pc01_login.this.AV10P_USER_ID;
      this.aP2[0] = b101_pc01_login.this.AV13W_RTN_CD;
      this.aP3[0] = b101_pc01_login.this.AV14W_RTN_MSG;
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
      AV14W_RTN_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV16W_ERRCD = "" ;
      AV12W_PWD = "" ;
      scmdbuf = "" ;
      P00292_A214TAM07_DEL_FLG = new String[] {""} ;
      P00292_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P00292_A210TAM07_PWD = new String[] {""} ;
      P00292_n210TAM07_PWD = new boolean[] {false} ;
      P00292_A55TAM07_USER_ID = new String[] {""} ;
      P00292_A205TAM07_USER_NM = new String[] {""} ;
      P00292_n205TAM07_USER_NM = new boolean[] {false} ;
      P00292_A313TAM07_USER_KANA_NM = new String[] {""} ;
      P00292_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      P00292_A56TAM07_AUTH_CD = new String[] {""} ;
      P00292_n56TAM07_AUTH_CD = new boolean[] {false} ;
      A214TAM07_DEL_FLG = "" ;
      A210TAM07_PWD = "" ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A313TAM07_USER_KANA_NM = "" ;
      A56TAM07_AUTH_CD = "" ;
      AV15W_SESSION = httpContext.getWebSession();
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 = new GxObjectCollection [1] ;
      GXt_char3 = "" ;
      GXv_char2 = new String [1] ;
      AV20Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b101_pc01_login__default(),
         new Object[] {
             new Object[] {
            P00292_A214TAM07_DEL_FLG, P00292_n214TAM07_DEL_FLG, P00292_A210TAM07_PWD, P00292_n210TAM07_PWD, P00292_A55TAM07_USER_ID, P00292_A205TAM07_USER_NM, P00292_n205TAM07_USER_NM, P00292_A313TAM07_USER_KANA_NM, P00292_n313TAM07_USER_KANA_NM, P00292_A56TAM07_AUTH_CD,
            P00292_n56TAM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B101_PC01_LOGIN" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B101_PC01_LOGIN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl62 ;
   private short AV13W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String AV20Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n210TAM07_PWD ;
   private boolean n205TAM07_USER_NM ;
   private boolean n313TAM07_USER_KANA_NM ;
   private boolean n56TAM07_AUTH_CD ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV14W_RTN_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV16W_ERRCD ;
   private String AV12W_PWD ;
   private String A214TAM07_DEL_FLG ;
   private String A210TAM07_PWD ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A313TAM07_USER_KANA_NM ;
   private String A56TAM07_AUTH_CD ;
   private com.genexus.webpanels.WebSession AV15W_SESSION ;
   private String[] aP0 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00292_A214TAM07_DEL_FLG ;
   private boolean[] P00292_n214TAM07_DEL_FLG ;
   private String[] P00292_A210TAM07_PWD ;
   private boolean[] P00292_n210TAM07_PWD ;
   private String[] P00292_A55TAM07_USER_ID ;
   private String[] P00292_A205TAM07_USER_NM ;
   private boolean[] P00292_n205TAM07_USER_NM ;
   private String[] P00292_A313TAM07_USER_KANA_NM ;
   private boolean[] P00292_n313TAM07_USER_KANA_NM ;
   private String[] P00292_A56TAM07_AUTH_CD ;
   private boolean[] P00292_n56TAM07_AUTH_CD ;
   private GxObjectCollection GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem4 ;
   private GxObjectCollection GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5[] ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class b101_pc01_login__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00292", "SELECT `TAM07_DEL_FLG`, `TAM07_PWD`, `TAM07_USER_ID`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_AUTH_CD` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_PWD` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128);
               stmt.setVarchar(2, (String)parms[1], 128);
               return;
      }
   }

}

