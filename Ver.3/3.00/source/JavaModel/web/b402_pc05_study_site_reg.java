/*
               File: B402_PC05_STUDY_SITE_REG
        Description: �������{�{�ݓo�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:18.36
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc05_study_site_reg extends GXProcedure
{
   public b402_pc05_study_site_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc05_study_site_reg.class ), "" );
   }

   public b402_pc05_study_site_reg( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b402_pc05_study_site_reg.this.AV10P_APP_ID = aP0;
      b402_pc05_study_site_reg.this.AV11P_DISP_DATETIME = aP1;
      b402_pc05_study_site_reg.this.aP2 = aP2;
      b402_pc05_study_site_reg.this.aP3 = aP3;
      b402_pc05_study_site_reg.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      b402_pc05_study_site_reg.this.AV10P_APP_ID = aP0;
      b402_pc05_study_site_reg.this.AV11P_DISP_DATETIME = aP1;
      b402_pc05_study_site_reg.this.aP2 = aP2;
      b402_pc05_study_site_reg.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_TAM020_APP_ID = "B402" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      AV19GXLvl29 = (byte)(0) ;
      /* Using cursor P003W2 */
      pr_default.execute(0, new Object[] {AV12W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV10P_APP_ID, AV11P_DISP_DATETIME});
      if ( Gx_err != 0 )
      {
         AV19GXLvl29 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A53TBW01_DISP_DATETIME = P003W2_A53TBW01_DISP_DATETIME[0] ;
         A52TBW01_APP_ID = P003W2_A52TBW01_APP_ID[0] ;
         A51TBW01_SESSION_ID = P003W2_A51TBW01_SESSION_ID[0] ;
         A685TBW01_FREE_SAVE_1 = P003W2_A685TBW01_FREE_SAVE_1[0] ;
         n685TBW01_FREE_SAVE_1 = P003W2_n685TBW01_FREE_SAVE_1[0] ;
         A54TBW01_LINE_NO = P003W2_A54TBW01_LINE_NO[0] ;
         AV19GXLvl29 = (byte)(1) ;
         AV16W_SITE.fromxml(A685TBW01_FREE_SAVE_1, "");
         AV8BC_STUDY_SITE.Load(AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Study_id(), AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_id());
         if ( AV8BC_STUDY_SITE.Fail() )
         {
            AV8BC_STUDY_SITE = (SdtTBM22_STUDY_SITE)new SdtTBM22_STUDY_SITE( remoteHandle, context);
            AV8BC_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Study_id() );
            AV8BC_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_id() );
            AV8BC_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm( AV20Pgmname );
         }
         else
         {
            if ( !( AV8BC_STUDY_SITE.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime().equals( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime() ) ) )
            {
               AV14W_RTN_CD = (short)(1) ;
               GXt_char1 = AV15W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
               b402_pc05_study_site_reg.this.GXt_char1 = GXv_char2[0] ;
               AV15W_RTN_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( GXutil.strcmp(AV8BC_STUDY_SITE.GetMode(), "INS") != 0 ) || AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Check() )
         {
            AV8BC_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg( (AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Check() ? "0" : "1") );
            AV8BC_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm( AV20Pgmname );
            AV8BC_STUDY_SITE.Save();
            if ( AV8BC_STUDY_SITE.Fail() )
            {
               AV14W_RTN_CD = (short)(1) ;
               GXt_char1 = AV15W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_STUDY_SITE.GetMessages(), (byte)(0), GXv_char2) ;
               b402_pc05_study_site_reg.this.GXt_char1 = GXv_char2[0] ;
               AV15W_RTN_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl29 == 0 )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char1 = AV15W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
         b402_pc05_study_site_reg.this.GXt_char1 = GXv_char2[0] ;
         AV15W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV12W_A_LOGIN_SDT;
      GXv_char2[0] = AV13W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV12W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc05_study_site_reg.this.AV13W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV13W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV20Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc05_study_site_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc05_study_site_reg.this.AV14W_RTN_CD;
      this.aP3[0] = b402_pc05_study_site_reg.this.AV15W_RTN_MSG;
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
      AV15W_RTN_MSG = "" ;
      AV9C_TAM020_APP_ID = "" ;
      AV12W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P003W2_A53TBW01_DISP_DATETIME = new String[] {""} ;
      P003W2_A52TBW01_APP_ID = new String[] {""} ;
      P003W2_A51TBW01_SESSION_ID = new String[] {""} ;
      P003W2_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      P003W2_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      P003W2_A54TBW01_LINE_NO = new long[1] ;
      A53TBW01_DISP_DATETIME = "" ;
      A52TBW01_APP_ID = "" ;
      A51TBW01_SESSION_ID = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
      AV16W_SITE = new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
      AV8BC_STUDY_SITE = new SdtTBM22_STUDY_SITE(remoteHandle);
      AV20Pgmname = "" ;
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV13W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc05_study_site_reg__default(),
         new Object[] {
             new Object[] {
            P003W2_A53TBW01_DISP_DATETIME, P003W2_A52TBW01_APP_ID, P003W2_A51TBW01_SESSION_ID, P003W2_A685TBW01_FREE_SAVE_1, P003W2_n685TBW01_FREE_SAVE_1, P003W2_A54TBW01_LINE_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B402_PC05_STUDY_SITE_REG" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B402_PC05_STUDY_SITE_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl29 ;
   private short AV14W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A54TBW01_LINE_NO ;
   private String scmdbuf ;
   private String AV20Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV15W_RTN_MSG ;
   private String AV9C_TAM020_APP_ID ;
   private String A53TBW01_DISP_DATETIME ;
   private String A52TBW01_APP_ID ;
   private String A51TBW01_SESSION_ID ;
   private String AV13W_ERRCD ;
   private SdtA_LOGIN_SDT AV12W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003W2_A53TBW01_DISP_DATETIME ;
   private String[] P003W2_A52TBW01_APP_ID ;
   private String[] P003W2_A51TBW01_SESSION_ID ;
   private String[] P003W2_A685TBW01_FREE_SAVE_1 ;
   private boolean[] P003W2_n685TBW01_FREE_SAVE_1 ;
   private long[] P003W2_A54TBW01_LINE_NO ;
   private SdtTBM22_STUDY_SITE AV8BC_STUDY_SITE ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB402_SD01_STUDY_SITE AV16W_SITE ;
}

final  class b402_pc05_study_site_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003W2", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getLongVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               return;
      }
   }

}

