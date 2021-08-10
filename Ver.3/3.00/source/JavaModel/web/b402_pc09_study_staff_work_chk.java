/*
               File: B402_PC09_STUDY_STAFF_WORK_CHK
        Description: 試験参加スタッフ入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: February 2, 2021 16:30:8.47
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc09_study_staff_work_chk extends GXProcedure
{
   public b402_pc09_study_staff_work_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc09_study_staff_work_chk.class ), "" );
   }

   public b402_pc09_study_staff_work_chk( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b402_pc09_study_staff_work_chk.this.AV9P_APP_ID = aP0;
      b402_pc09_study_staff_work_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc09_study_staff_work_chk.this.aP2 = aP2;
      b402_pc09_study_staff_work_chk.this.aP3 = aP3;
      b402_pc09_study_staff_work_chk.this.aP3 = new String[] {""};
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
      b402_pc09_study_staff_work_chk.this.AV9P_APP_ID = aP0;
      b402_pc09_study_staff_work_chk.this.AV10P_DISP_DATETIME = aP1;
      b402_pc09_study_staff_work_chk.this.aP2 = aP2;
      b402_pc09_study_staff_work_chk.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_RTN_CD = (short)(0) ;
      AV16W_RTN_MSG = "" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_MST_CHK' Routine */
      AV12W_CHK_EXIST = false ;
      AV20GXLvl40 = (byte)(0) ;
      /* Using cursor P00442 */
      pr_default.execute(0, new Object[] {AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV9P_APP_ID, AV10P_DISP_DATETIME});
      if ( Gx_err != 0 )
      {
         AV20GXLvl40 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A53TBW01_DISP_DATETIME = P00442_A53TBW01_DISP_DATETIME[0] ;
         A52TBW01_APP_ID = P00442_A52TBW01_APP_ID[0] ;
         A51TBW01_SESSION_ID = P00442_A51TBW01_SESSION_ID[0] ;
         A685TBW01_FREE_SAVE_1 = P00442_A685TBW01_FREE_SAVE_1[0] ;
         n685TBW01_FREE_SAVE_1 = P00442_n685TBW01_FREE_SAVE_1[0] ;
         A54TBW01_LINE_NO = P00442_A54TBW01_LINE_NO[0] ;
         AV20GXLvl40 = (byte)(1) ;
         AV17W_STUDY_STAFF.fromxml(A685TBW01_FREE_SAVE_1, "");
         AV21GXLvl48 = (byte)(0) ;
         /* Using cursor P00443 */
         pr_default.execute(1, new Object[] {AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_id()});
         if ( Gx_err != 0 )
         {
            AV21GXLvl48 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(1) != 101) )
         {
            A55TAM07_USER_ID = P00443_A55TAM07_USER_ID[0] ;
            A214TAM07_DEL_FLG = P00443_A214TAM07_DEL_FLG[0] ;
            n214TAM07_DEL_FLG = P00443_n214TAM07_DEL_FLG[0] ;
            AV21GXLvl48 = (byte)(1) ;
            if ( ( GXutil.strcmp(A214TAM07_DEL_FLG, "1") == 0 ) && AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() )
            {
               AV15W_RTN_CD = (short)(1) ;
               GXt_char1 = AV16W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm(), "", "", "", "", GXv_char2) ;
               b402_pc09_study_staff_work_chk.this.GXt_char1 = GXv_char2[0] ;
               AV16W_RTN_MSG = GXt_char1 ;
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV21GXLvl48 == 0 )
         {
            if ( AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() )
            {
               AV15W_RTN_CD = (short)(1) ;
               GXt_char1 = AV16W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm(), "", "", "", "", GXv_char2) ;
               b402_pc09_study_staff_work_chk.this.GXt_char1 = GXv_char2[0] ;
               AV16W_RTN_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() )
         {
            /* Using cursor P00444 */
            pr_default.execute(2, new Object[] {new Long(AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Study_id()), AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_id(), ((SdtB402_SD03_STUDY_STAFF_AUTH)AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd()});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A109TBM23_STYDY_AUTH_CD = P00444_A109TBM23_STYDY_AUTH_CD[0] ;
               A108TBM23_USER_ID = P00444_A108TBM23_USER_ID[0] ;
               A107TBM23_STUDY_ID = P00444_A107TBM23_STUDY_ID[0] ;
               A389TBM23_UPD_DATETIME = P00444_A389TBM23_UPD_DATETIME[0] ;
               n389TBM23_UPD_DATETIME = P00444_n389TBM23_UPD_DATETIME[0] ;
               if ( !( A389TBM23_UPD_DATETIME.equals( ((SdtB402_SD03_STUDY_STAFF_AUTH)AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime() ) ) && ! ( GXutil.nullDate().equals(((SdtB402_SD03_STUDY_STAFF_AUTH)AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime()) ) )
               {
                  AV15W_RTN_CD = (short)(1) ;
                  GXt_char1 = AV16W_RTN_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b402_pc09_study_staff_work_chk.this.GXt_char1 = GXv_char2[0] ;
                  AV16W_RTN_MSG = GXt_char1 ;
                  pr_default.close(2);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
         if ( AV17W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() )
         {
            AV12W_CHK_EXIST = true ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl40 == 0 )
      {
         AV15W_RTN_CD = (short)(1) ;
         GXt_char1 = AV16W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
         b402_pc09_study_staff_work_chk.this.GXt_char1 = GXv_char2[0] ;
         AV16W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV14W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc09_study_staff_work_chk.this.AV14W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV14W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc09_study_staff_work_chk");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc09_study_staff_work_chk.this.AV15W_RTN_CD;
      this.aP3[0] = b402_pc09_study_staff_work_chk.this.AV16W_RTN_MSG;
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
                  /* Execute user subroutine: S131 */
                  S131 ();
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
      AV16W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
      A214TAM07_DEL_FLG = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P00442_A53TBW01_DISP_DATETIME = new String[] {""} ;
      P00442_A52TBW01_APP_ID = new String[] {""} ;
      P00442_A51TBW01_SESSION_ID = new String[] {""} ;
      P00442_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      P00442_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      P00442_A54TBW01_LINE_NO = new long[1] ;
      A53TBW01_DISP_DATETIME = "" ;
      A52TBW01_APP_ID = "" ;
      A51TBW01_SESSION_ID = "" ;
      AV17W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      P00443_A55TAM07_USER_ID = new String[] {""} ;
      P00443_A214TAM07_DEL_FLG = new String[] {""} ;
      P00443_n214TAM07_DEL_FLG = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      P00444_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P00444_A108TBM23_USER_ID = new String[] {""} ;
      P00444_A107TBM23_STUDY_ID = new long[1] ;
      P00444_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00444_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A108TBM23_USER_ID = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV14W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV23Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc09_study_staff_work_chk__default(),
         new Object[] {
             new Object[] {
            P00442_A53TBW01_DISP_DATETIME, P00442_A52TBW01_APP_ID, P00442_A51TBW01_SESSION_ID, P00442_A685TBW01_FREE_SAVE_1, P00442_n685TBW01_FREE_SAVE_1, P00442_A54TBW01_LINE_NO
            }
            , new Object[] {
            P00443_A55TAM07_USER_ID, P00443_A214TAM07_DEL_FLG, P00443_n214TAM07_DEL_FLG
            }
            , new Object[] {
            P00444_A109TBM23_STYDY_AUTH_CD, P00444_A108TBM23_USER_ID, P00444_A107TBM23_STUDY_ID, P00444_A389TBM23_UPD_DATETIME, P00444_n389TBM23_UPD_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B402_PC09_STUDY_STAFF_WORK_CHK" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B402_PC09_STUDY_STAFF_WORK_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl40 ;
   private byte AV21GXLvl48 ;
   private short AV15W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A54TBW01_LINE_NO ;
   private long AV13W_CNT ;
   private long A107TBM23_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV23Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean AV12W_CHK_EXIST ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n389TBM23_UPD_DATETIME ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String AV9P_APP_ID ;
   private String AV10P_DISP_DATETIME ;
   private String AV16W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A214TAM07_DEL_FLG ;
   private String A53TBW01_DISP_DATETIME ;
   private String A52TBW01_APP_ID ;
   private String A51TBW01_SESSION_ID ;
   private String A55TAM07_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A108TBM23_USER_ID ;
   private String AV14W_ERRCD ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00442_A53TBW01_DISP_DATETIME ;
   private String[] P00442_A52TBW01_APP_ID ;
   private String[] P00442_A51TBW01_SESSION_ID ;
   private String[] P00442_A685TBW01_FREE_SAVE_1 ;
   private boolean[] P00442_n685TBW01_FREE_SAVE_1 ;
   private long[] P00442_A54TBW01_LINE_NO ;
   private String[] P00443_A55TAM07_USER_ID ;
   private String[] P00443_A214TAM07_DEL_FLG ;
   private boolean[] P00443_n214TAM07_DEL_FLG ;
   private String[] P00444_A109TBM23_STYDY_AUTH_CD ;
   private String[] P00444_A108TBM23_USER_ID ;
   private long[] P00444_A107TBM23_STUDY_ID ;
   private java.util.Date[] P00444_A389TBM23_UPD_DATETIME ;
   private boolean[] P00444_n389TBM23_UPD_DATETIME ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB402_SD02_STUDY_STAFF AV17W_STUDY_STAFF ;
}

final  class b402_pc09_study_staff_work_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00442", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00443", "SELECT `TAM07_USER_ID`, `TAM07_DEL_FLG` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00444", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID`, `TBM23_UPD_DATETIME` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? and `TBM23_STYDY_AUTH_CD` = ? ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
      }
   }

}

