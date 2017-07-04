/*
               File: B402_PC14_STUDY_STAFF_AUTH_WORK_REG
        Description: 試験参加スタッフ権限登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:31.52
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc14_study_staff_auth_work_reg extends GXProcedure
{
   public b402_pc14_study_staff_auth_work_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc14_study_staff_auth_work_reg.class ), "" );
   }

   public b402_pc14_study_staff_auth_work_reg( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             long aP4 ,
                             short[] aP5 )
   {
      b402_pc14_study_staff_auth_work_reg.this.AV9P_AUTH_WORK_APP_ID = aP0;
      b402_pc14_study_staff_auth_work_reg.this.AV10P_AUTH_WORK_DISP_DATETIME = aP1;
      b402_pc14_study_staff_auth_work_reg.this.AV11P_STAFF_WORK_APP_ID = aP2;
      b402_pc14_study_staff_auth_work_reg.this.AV12P_STAFF_WORK_DISP_DATETIME = aP3;
      b402_pc14_study_staff_auth_work_reg.this.AV13P_STAFF_WORK_LINE_NO = aP4;
      b402_pc14_study_staff_auth_work_reg.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        long aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             long aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      b402_pc14_study_staff_auth_work_reg.this.AV9P_AUTH_WORK_APP_ID = aP0;
      b402_pc14_study_staff_auth_work_reg.this.AV10P_AUTH_WORK_DISP_DATETIME = aP1;
      b402_pc14_study_staff_auth_work_reg.this.AV11P_STAFF_WORK_APP_ID = aP2;
      b402_pc14_study_staff_auth_work_reg.this.AV12P_STAFF_WORK_DISP_DATETIME = aP3;
      b402_pc14_study_staff_auth_work_reg.this.AV13P_STAFF_WORK_LINE_NO = aP4;
      b402_pc14_study_staff_auth_work_reg.this.aP5 = aP5;
      b402_pc14_study_staff_auth_work_reg.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S1155 */
      S1155 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_RTN_CD = (short)(0) ;
      AV17W_RTN_MSG = "" ;
      AV18W_STUDY_STAFF = (SdtB402_SD02_STUDY_STAFF)new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      AV18W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( true );
      AV18W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().clear();
      AV22GXLvl36 = (byte)(0) ;
      /* Using cursor P00422 */
      pr_default.execute(0, new Object[] {AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV9P_AUTH_WORK_APP_ID, AV10P_AUTH_WORK_DISP_DATETIME});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A597TBW01_DISP_DATETIME = P00422_A597TBW01_DISP_DATETIME[0] ;
         A596TBW01_APP_ID = P00422_A596TBW01_APP_ID[0] ;
         A595TBW01_SESSION_ID = P00422_A595TBW01_SESSION_ID[0] ;
         A599TBW01_FREE_SAVE_1 = P00422_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = P00422_n599TBW01_FREE_SAVE_1[0] ;
         A598TBW01_LINE_NO = P00422_A598TBW01_LINE_NO[0] ;
         AV22GXLvl36 = (byte)(1) ;
         AV19W_STUDY_STAFF_AUTH = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
         AV19W_STUDY_STAFF_AUTH.fromxml(A599TBW01_FREE_SAVE_1, "");
         AV18W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().add(AV19W_STUDY_STAFF_AUTH, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl36 == 0 )
      {
         AV16W_RTN_CD = (short)(1) ;
         GXt_char1 = AV17W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
         b402_pc14_study_staff_auth_work_reg.this.GXt_char1 = GXv_char2[0] ;
         AV17W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int3[0] = AV16W_RTN_CD ;
      GXv_char2[0] = AV17W_RTN_MSG ;
      new b402_pc08_study_staff_work_upd(remoteHandle, context).execute( AV11P_STAFF_WORK_APP_ID, AV12P_STAFF_WORK_DISP_DATETIME, AV13P_STAFF_WORK_LINE_NO, AV18W_STUDY_STAFF, GXv_int3, GXv_char2) ;
      b402_pc14_study_staff_auth_work_reg.this.AV16W_RTN_CD = GXv_int3[0] ;
      b402_pc14_study_staff_auth_work_reg.this.AV17W_RTN_MSG = GXv_char2[0] ;
      cleanup();
   }

   public void S1155( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc14_study_staff_auth_work_reg.this.AV15W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1273( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b402_pc14_study_staff_auth_work_reg.this.AV16W_RTN_CD;
      this.aP6[0] = b402_pc14_study_staff_auth_work_reg.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S1273 */
                  S1273 ();
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
      AV17W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV18W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P00422_A597TBW01_DISP_DATETIME = new String[] {""} ;
      P00422_A596TBW01_APP_ID = new String[] {""} ;
      P00422_A595TBW01_SESSION_ID = new String[] {""} ;
      P00422_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      P00422_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      P00422_A598TBW01_LINE_NO = new long[1] ;
      A597TBW01_DISP_DATETIME = "" ;
      A596TBW01_APP_ID = "" ;
      A595TBW01_SESSION_ID = "" ;
      A599TBW01_FREE_SAVE_1 = "" ;
      AV19W_STUDY_STAFF_AUTH = new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
      GXv_int3 = new short [1] ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV23Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc14_study_staff_auth_work_reg__default(),
         new Object[] {
             new Object[] {
            P00422_A597TBW01_DISP_DATETIME, P00422_A596TBW01_APP_ID, P00422_A595TBW01_SESSION_ID, P00422_A599TBW01_FREE_SAVE_1, P00422_n599TBW01_FREE_SAVE_1, P00422_A598TBW01_LINE_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B402_PC14_STUDY_STAFF_AUTH_WORK_REG" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B402_PC14_STUDY_STAFF_AUTH_WORK_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl36 ;
   private short AV16W_RTN_CD ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13P_STAFF_WORK_LINE_NO ;
   private long A598TBW01_LINE_NO ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV23Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n599TBW01_FREE_SAVE_1 ;
   private String A599TBW01_FREE_SAVE_1 ;
   private String AV9P_AUTH_WORK_APP_ID ;
   private String AV10P_AUTH_WORK_DISP_DATETIME ;
   private String AV11P_STAFF_WORK_APP_ID ;
   private String AV12P_STAFF_WORK_DISP_DATETIME ;
   private String AV17W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A597TBW01_DISP_DATETIME ;
   private String A596TBW01_APP_ID ;
   private String A595TBW01_SESSION_ID ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00422_A597TBW01_DISP_DATETIME ;
   private String[] P00422_A596TBW01_APP_ID ;
   private String[] P00422_A595TBW01_SESSION_ID ;
   private String[] P00422_A599TBW01_FREE_SAVE_1 ;
   private boolean[] P00422_n599TBW01_FREE_SAVE_1 ;
   private long[] P00422_A598TBW01_LINE_NO ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB402_SD02_STUDY_STAFF AV18W_STUDY_STAFF ;
   private SdtB402_SD03_STUDY_STAFF_AUTH AV19W_STUDY_STAFF_AUTH ;
}

final  class b402_pc14_study_staff_auth_work_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00422", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
      }
   }

}

