/*
               File: B402_PC04_STUDY_SITE_CHK
        Description: 試験実施施設マスタ入力チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:30.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc04_study_site_chk extends GXProcedure
{
   public b402_pc04_study_site_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc04_study_site_chk.class ), "" );
   }

   public b402_pc04_study_site_chk( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b402_pc04_study_site_chk.this.AV9P_APP_ID = aP0;
      b402_pc04_study_site_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc04_study_site_chk.this.aP3 = new String[] {""};
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
      b402_pc04_study_site_chk.this.AV9P_APP_ID = aP0;
      b402_pc04_study_site_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc04_study_site_chk.this.aP2 = aP2;
      b402_pc04_study_site_chk.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM020_APP_ID = "B402" ;
      /* Execute user subroutine: S12105 */
      S12105 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      /* Execute user subroutine: S1137 */
      S1137 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S1137( )
   {
      /* 'SUB_MST_CHK' Routine */
      AV12W_CHK_EXIST = false ;
      AV19GXLvl41 = (byte)(0) ;
      /* Using cursor P003U2 */
      pr_default.execute(0, new Object[] {AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV9P_APP_ID, AV10P_DISP_DATETIME});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A597TBW01_DISP_DATETIME = P003U2_A597TBW01_DISP_DATETIME[0] ;
         A596TBW01_APP_ID = P003U2_A596TBW01_APP_ID[0] ;
         A595TBW01_SESSION_ID = P003U2_A595TBW01_SESSION_ID[0] ;
         A599TBW01_FREE_SAVE_1 = P003U2_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = P003U2_n599TBW01_FREE_SAVE_1[0] ;
         A598TBW01_LINE_NO = P003U2_A598TBW01_LINE_NO[0] ;
         AV19GXLvl41 = (byte)(1) ;
         AV16W_SITE.fromxml(A599TBW01_FREE_SAVE_1, "");
         AV20GXLvl49 = (byte)(0) ;
         /* Using cursor P003U3 */
         pr_default.execute(1, new Object[] {AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_id()});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A132TAM08_SITE_ID = P003U3_A132TAM08_SITE_ID[0] ;
            A139TAM08_DEL_FLG = P003U3_A139TAM08_DEL_FLG[0] ;
            n139TAM08_DEL_FLG = P003U3_n139TAM08_DEL_FLG[0] ;
            AV20GXLvl49 = (byte)(1) ;
            if ( ( GXutil.strcmp(A139TAM08_DEL_FLG, "1") == 0 ) && AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Check() )
            {
               AV14W_RTN_CD = (short)(1) ;
               GXt_char1 = AV15W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_nm(), "", "", "", "", GXv_char2) ;
               b402_pc04_study_site_chk.this.GXt_char1 = GXv_char2[0] ;
               AV15W_RTN_MSG = GXt_char1 ;
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV20GXLvl49 == 0 )
         {
            if ( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Check() )
            {
               AV14W_RTN_CD = (short)(1) ;
               GXt_char1 = AV15W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_nm(), "", "", "", "", GXv_char2) ;
               b402_pc04_study_site_chk.this.GXt_char1 = GXv_char2[0] ;
               AV15W_RTN_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Using cursor P003U4 */
         pr_default.execute(2, new Object[] {new Long(AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Study_id()), AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Site_id()});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A198TBM22_SITE_ID = P003U4_A198TBM22_SITE_ID[0] ;
            A197TBM22_STUDY_ID = P003U4_A197TBM22_STUDY_ID[0] ;
            A203TBM22_UPD_DATETIME = P003U4_A203TBM22_UPD_DATETIME[0] ;
            n203TBM22_UPD_DATETIME = P003U4_n203TBM22_UPD_DATETIME[0] ;
            if ( !( A203TBM22_UPD_DATETIME.equals( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime() ) ) )
            {
               AV14W_RTN_CD = (short)(1) ;
               GXt_char1 = AV15W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
               b402_pc04_study_site_chk.this.GXt_char1 = GXv_char2[0] ;
               AV15W_RTN_MSG = GXt_char1 ;
               pr_default.close(2);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV16W_SITE.getgxTv_SdtB402_SD01_STUDY_SITE_Check() )
         {
            AV12W_CHK_EXIST = true ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl41 == 0 )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char1 = AV15W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
         b402_pc04_study_site_chk.this.GXt_char1 = GXv_char2[0] ;
         AV15W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
      if ( ! AV12W_CHK_EXIST )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char1 = AV15W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00043", "施設", "", "", "", "", GXv_char2) ;
         b402_pc04_study_site_chk.this.GXt_char1 = GXv_char2[0] ;
         AV15W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S12105( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV13W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc04_study_site_chk.this.AV13W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV13W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S13123( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc04_study_site_chk");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc04_study_site_chk.this.AV14W_RTN_CD;
      this.aP3[0] = b402_pc04_study_site_chk.this.AV15W_RTN_MSG;
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
                  /* Execute user subroutine: S13123 */
                  S13123 ();
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
      AV8C_TAM020_APP_ID = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P003U2_A597TBW01_DISP_DATETIME = new String[] {""} ;
      P003U2_A596TBW01_APP_ID = new String[] {""} ;
      P003U2_A595TBW01_SESSION_ID = new String[] {""} ;
      P003U2_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      P003U2_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      P003U2_A598TBW01_LINE_NO = new long[1] ;
      A597TBW01_DISP_DATETIME = "" ;
      A596TBW01_APP_ID = "" ;
      A595TBW01_SESSION_ID = "" ;
      A599TBW01_FREE_SAVE_1 = "" ;
      AV16W_SITE = new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
      P003U3_A132TAM08_SITE_ID = new String[] {""} ;
      P003U3_A139TAM08_DEL_FLG = new String[] {""} ;
      P003U3_n139TAM08_DEL_FLG = new boolean[] {false} ;
      A132TAM08_SITE_ID = "" ;
      A139TAM08_DEL_FLG = "" ;
      P003U4_A198TBM22_SITE_ID = new String[] {""} ;
      P003U4_A197TBM22_STUDY_ID = new long[1] ;
      P003U4_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003U4_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      A198TBM22_SITE_ID = "" ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV13W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV22Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc04_study_site_chk__default(),
         new Object[] {
             new Object[] {
            P003U2_A597TBW01_DISP_DATETIME, P003U2_A596TBW01_APP_ID, P003U2_A595TBW01_SESSION_ID, P003U2_A599TBW01_FREE_SAVE_1, P003U2_n599TBW01_FREE_SAVE_1, P003U2_A598TBW01_LINE_NO
            }
            , new Object[] {
            P003U3_A132TAM08_SITE_ID, P003U3_A139TAM08_DEL_FLG, P003U3_n139TAM08_DEL_FLG
            }
            , new Object[] {
            P003U4_A198TBM22_SITE_ID, P003U4_A197TBM22_STUDY_ID, P003U4_A203TBM22_UPD_DATETIME, P003U4_n203TBM22_UPD_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B402_PC04_STUDY_SITE_CHK" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B402_PC04_STUDY_SITE_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl41 ;
   private byte AV20GXLvl49 ;
   private short AV14W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A598TBW01_LINE_NO ;
   private long A197TBM22_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV22Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A203TBM22_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean AV12W_CHK_EXIST ;
   private boolean n599TBW01_FREE_SAVE_1 ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n203TBM22_UPD_DATETIME ;
   private String A599TBW01_FREE_SAVE_1 ;
   private String AV9P_APP_ID ;
   private String AV10P_DISP_DATETIME ;
   private String AV15W_RTN_MSG ;
   private String AV8C_TAM020_APP_ID ;
   private String A597TBW01_DISP_DATETIME ;
   private String A596TBW01_APP_ID ;
   private String A595TBW01_SESSION_ID ;
   private String A132TAM08_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A198TBM22_SITE_ID ;
   private String AV13W_ERRCD ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003U2_A597TBW01_DISP_DATETIME ;
   private String[] P003U2_A596TBW01_APP_ID ;
   private String[] P003U2_A595TBW01_SESSION_ID ;
   private String[] P003U2_A599TBW01_FREE_SAVE_1 ;
   private boolean[] P003U2_n599TBW01_FREE_SAVE_1 ;
   private long[] P003U2_A598TBW01_LINE_NO ;
   private String[] P003U3_A132TAM08_SITE_ID ;
   private String[] P003U3_A139TAM08_DEL_FLG ;
   private boolean[] P003U3_n139TAM08_DEL_FLG ;
   private String[] P003U4_A198TBM22_SITE_ID ;
   private long[] P003U4_A197TBM22_STUDY_ID ;
   private java.util.Date[] P003U4_A203TBM22_UPD_DATETIME ;
   private boolean[] P003U4_n203TBM22_UPD_DATETIME ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB402_SD01_STUDY_SITE AV16W_SITE ;
}

final  class b402_pc04_study_site_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003U2", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P003U3", "SELECT `TAM08_SITE_ID`, `TAM08_DEL_FLG` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P003U4", "SELECT `TBM22_SITE_ID`, `TBM22_STUDY_ID`, `TBM22_UPD_DATETIME` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? and `TBM22_SITE_ID` = ? ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
      }
   }

}

