/*
               File: B402_PC13_STUDY_STAFF_AUTH_WORK_CHK
        Description: 試験参加スタッフ権限入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:4.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc13_study_staff_auth_work_chk extends GXProcedure
{
   public b402_pc13_study_staff_auth_work_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc13_study_staff_auth_work_chk.class ), "" );
   }

   public b402_pc13_study_staff_auth_work_chk( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b402_pc13_study_staff_auth_work_chk.this.AV9P_APP_ID = aP0;
      b402_pc13_study_staff_auth_work_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc13_study_staff_auth_work_chk.this.aP2 = aP2;
      b402_pc13_study_staff_auth_work_chk.this.aP3 = aP3;
      b402_pc13_study_staff_auth_work_chk.this.aP3 = new String[] {""};
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
      b402_pc13_study_staff_auth_work_chk.this.AV9P_APP_ID = aP0;
      b402_pc13_study_staff_auth_work_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc13_study_staff_auth_work_chk.this.aP2 = aP2;
      b402_pc13_study_staff_auth_work_chk.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
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
      AV12W_CHK_EXIST = false ;
      AV19GXLvl31 = (byte)(0) ;
      /* Using cursor P00422 */
      pr_default.execute(0, new Object[] {AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV9P_APP_ID, AV10P_DISP_DATETIME});
      if ( Gx_err != 0 )
      {
         AV19GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A53TBW01_DISP_DATETIME = P00422_A53TBW01_DISP_DATETIME[0] ;
         A52TBW01_APP_ID = P00422_A52TBW01_APP_ID[0] ;
         A51TBW01_SESSION_ID = P00422_A51TBW01_SESSION_ID[0] ;
         A685TBW01_FREE_SAVE_1 = P00422_A685TBW01_FREE_SAVE_1[0] ;
         n685TBW01_FREE_SAVE_1 = P00422_n685TBW01_FREE_SAVE_1[0] ;
         A54TBW01_LINE_NO = P00422_A54TBW01_LINE_NO[0] ;
         AV19GXLvl31 = (byte)(1) ;
         AV16W_STUDY_STAFF_AUTH.fromxml(A685TBW01_FREE_SAVE_1, "");
         if ( AV16W_STUDY_STAFF_AUTH.getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check() )
         {
            AV12W_CHK_EXIST = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl31 == 0 )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char1 = AV15W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
         b402_pc13_study_staff_auth_work_chk.this.GXt_char1 = GXv_char2[0] ;
         AV15W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! AV12W_CHK_EXIST )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char1 = AV15W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00043", "権限", "", "", "", "", GXv_char2) ;
         b402_pc13_study_staff_auth_work_chk.this.GXt_char1 = GXv_char2[0] ;
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
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV13W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc13_study_staff_auth_work_chk.this.AV13W_ERRCD = GXv_char2[0] ;
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
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc13_study_staff_auth_work_chk.this.AV14W_RTN_CD;
      this.aP3[0] = b402_pc13_study_staff_auth_work_chk.this.AV15W_RTN_MSG;
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
      AV8C_APP_ID = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P00422_A53TBW01_DISP_DATETIME = new String[] {""} ;
      P00422_A52TBW01_APP_ID = new String[] {""} ;
      P00422_A51TBW01_SESSION_ID = new String[] {""} ;
      P00422_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      P00422_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      P00422_A54TBW01_LINE_NO = new long[1] ;
      A53TBW01_DISP_DATETIME = "" ;
      A52TBW01_APP_ID = "" ;
      A51TBW01_SESSION_ID = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
      AV16W_STUDY_STAFF_AUTH = new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV13W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV20Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc13_study_staff_auth_work_chk__default(),
         new Object[] {
             new Object[] {
            P00422_A53TBW01_DISP_DATETIME, P00422_A52TBW01_APP_ID, P00422_A51TBW01_SESSION_ID, P00422_A685TBW01_FREE_SAVE_1, P00422_n685TBW01_FREE_SAVE_1, P00422_A54TBW01_LINE_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B402_PC13_STUDY_STAFF_AUTH_WORK_CHK" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B402_PC13_STUDY_STAFF_AUTH_WORK_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl31 ;
   private short AV14W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A54TBW01_LINE_NO ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV20Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV12W_CHK_EXIST ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String AV9P_APP_ID ;
   private String AV10P_DISP_DATETIME ;
   private String AV15W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A53TBW01_DISP_DATETIME ;
   private String A52TBW01_APP_ID ;
   private String A51TBW01_SESSION_ID ;
   private String AV13W_ERRCD ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00422_A53TBW01_DISP_DATETIME ;
   private String[] P00422_A52TBW01_APP_ID ;
   private String[] P00422_A51TBW01_SESSION_ID ;
   private String[] P00422_A685TBW01_FREE_SAVE_1 ;
   private boolean[] P00422_n685TBW01_FREE_SAVE_1 ;
   private long[] P00422_A54TBW01_LINE_NO ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB402_SD03_STUDY_STAFF_AUTH AV16W_STUDY_STAFF_AUTH ;
}

final  class b402_pc13_study_staff_auth_work_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00422", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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

