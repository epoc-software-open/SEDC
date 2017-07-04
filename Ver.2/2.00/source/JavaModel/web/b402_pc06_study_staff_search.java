/*
               File: B402_PC06_STUDY_STAFF_SEARCH
        Description: 試験参加スタッフ検索
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:9.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc06_study_staff_search extends GXProcedure
{
   public b402_pc06_study_staff_search( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc06_study_staff_search.class ), "" );
   }

   public b402_pc06_study_staff_search( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String aP3 ,
                             short[] aP4 )
   {
      b402_pc06_study_staff_search.this.AV11P_APP_ID = aP0;
      b402_pc06_study_staff_search.this.AV12P_DISP_DATETIME = aP1;
      b402_pc06_study_staff_search.this.AV14P_STUDY_ID = aP2;
      b402_pc06_study_staff_search.this.AV13P_SITE_ID = aP3;
      b402_pc06_study_staff_search.this.aP4 = aP4;
      b402_pc06_study_staff_search.this.aP5 = aP5;
      b402_pc06_study_staff_search.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b402_pc06_study_staff_search.this.AV11P_APP_ID = aP0;
      b402_pc06_study_staff_search.this.AV12P_DISP_DATETIME = aP1;
      b402_pc06_study_staff_search.this.AV14P_STUDY_ID = aP2;
      b402_pc06_study_staff_search.this.AV13P_SITE_ID = aP3;
      b402_pc06_study_staff_search.this.aP4 = aP4;
      b402_pc06_study_staff_search.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "B402" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_RTN_CD = (short)(0) ;
      AV19W_RTN_MSG = "" ;
      new b805_pc01_work_del(remoteHandle, context).execute( AV11P_APP_ID, AV12P_DISP_DATETIME) ;
      AV16W_CNT = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV13P_SITE_ID ,
                                           A333TAM07_SITE_ID ,
                                           A385TBM23_DEL_FLG ,
                                           A214TAM07_DEL_FLG ,
                                           new Long(AV14P_STUDY_ID) ,
                                           new Long(A107TBM23_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P003X2 */
      pr_default.execute(0, new Object[] {new Long(AV14P_STUDY_ID), AV13P_SITE_ID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A107TBM23_STUDY_ID = P003X2_A107TBM23_STUDY_ID[0] ;
         A385TBM23_DEL_FLG = P003X2_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = P003X2_n385TBM23_DEL_FLG[0] ;
         A214TAM07_DEL_FLG = P003X2_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = P003X2_n214TAM07_DEL_FLG[0] ;
         A333TAM07_SITE_ID = P003X2_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = P003X2_n333TAM07_SITE_ID[0] ;
         A367TBM21_STUDY_NM = P003X2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P003X2_n367TBM21_STUDY_NM[0] ;
         A108TBM23_USER_ID = P003X2_A108TBM23_USER_ID[0] ;
         A205TAM07_USER_NM = P003X2_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = P003X2_n205TAM07_USER_NM[0] ;
         A109TBM23_STYDY_AUTH_CD = P003X2_A109TBM23_STYDY_AUTH_CD[0] ;
         A367TBM21_STUDY_NM = P003X2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P003X2_n367TBM21_STUDY_NM[0] ;
         A214TAM07_DEL_FLG = P003X2_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = P003X2_n214TAM07_DEL_FLG[0] ;
         A333TAM07_SITE_ID = P003X2_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = P003X2_n333TAM07_SITE_ID[0] ;
         A205TAM07_USER_NM = P003X2_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = P003X2_n205TAM07_USER_NM[0] ;
         /* Using cursor P003X3 */
         pr_default.execute(1, new Object[] {new Long(A107TBM23_STUDY_ID), new Boolean(n333TAM07_SITE_ID), A333TAM07_SITE_ID});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A17TBM22_STUDY_ID = P003X3_A17TBM22_STUDY_ID[0] ;
            A18TBM22_SITE_ID = P003X3_A18TBM22_SITE_ID[0] ;
            A325TAM08_DEL_FLG = P003X3_A325TAM08_DEL_FLG[0] ;
            n325TAM08_DEL_FLG = P003X3_n325TAM08_DEL_FLG[0] ;
            A377TBM22_DEL_FLG = P003X3_A377TBM22_DEL_FLG[0] ;
            n377TBM22_DEL_FLG = P003X3_n377TBM22_DEL_FLG[0] ;
            A319TAM08_SITE_NM = P003X3_A319TAM08_SITE_NM[0] ;
            n319TAM08_SITE_NM = P003X3_n319TAM08_SITE_NM[0] ;
            A325TAM08_DEL_FLG = P003X3_A325TAM08_DEL_FLG[0] ;
            n325TAM08_DEL_FLG = P003X3_n325TAM08_DEL_FLG[0] ;
            A319TAM08_SITE_NM = P003X3_A319TAM08_SITE_NM[0] ;
            n319TAM08_SITE_NM = P003X3_n319TAM08_SITE_NM[0] ;
            AV16W_CNT = (long)(AV16W_CNT+1) ;
            AV20W_STUDY_STAFF = (SdtB402_SD02_STUDY_STAFF)new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( true );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( A107TBM23_STUDY_ID );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm( A367TBM21_STUDY_NM );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_User_id( A108TBM23_USER_ID );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( A205TAM07_USER_NM );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( A333TAM07_SITE_ID );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm( A319TAM08_SITE_NM );
            AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( A109TBM23_STYDY_AUTH_CD );
            AV9BC_KNGN.Load(A109TBM23_STYDY_AUTH_CD);
            if ( AV9BC_KNGN.Success() )
            {
               AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( AV9BC_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm() );
            }
            AV8BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
            AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
            AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV11P_APP_ID );
            AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV12P_DISP_DATETIME );
            AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV16W_CNT );
            AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV20W_STUDY_STAFF.toxml(false, true, "B402_SD02_STUDY_STAFF", "tablet-EDC_GXXEV3U3") );
            AV8BC_FREE_WORK.Save();
            if ( AV8BC_FREE_WORK.Fail() )
            {
               AV18W_RTN_CD = (short)(1) ;
               GXt_char1 = AV19W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
               b402_pc06_study_staff_search.this.GXt_char1 = GXv_char2[0] ;
               AV19W_RTN_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV17W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc06_study_staff_search.this.AV17W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV17W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc06_study_staff_search");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b402_pc06_study_staff_search.this.AV18W_RTN_CD;
      this.aP5[0] = b402_pc06_study_staff_search.this.AV19W_RTN_MSG;
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
      AV19W_RTN_MSG = "" ;
      AV10C_APP_ID = "" ;
      scmdbuf = "" ;
      A333TAM07_SITE_ID = "" ;
      A385TBM23_DEL_FLG = "" ;
      A214TAM07_DEL_FLG = "" ;
      P003X2_A107TBM23_STUDY_ID = new long[1] ;
      P003X2_A385TBM23_DEL_FLG = new String[] {""} ;
      P003X2_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P003X2_A214TAM07_DEL_FLG = new String[] {""} ;
      P003X2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P003X2_A333TAM07_SITE_ID = new String[] {""} ;
      P003X2_n333TAM07_SITE_ID = new boolean[] {false} ;
      P003X2_A367TBM21_STUDY_NM = new String[] {""} ;
      P003X2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      P003X2_A108TBM23_USER_ID = new String[] {""} ;
      P003X2_A205TAM07_USER_NM = new String[] {""} ;
      P003X2_n205TAM07_USER_NM = new boolean[] {false} ;
      P003X2_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      A367TBM21_STUDY_NM = "" ;
      A108TBM23_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      P003X3_A17TBM22_STUDY_ID = new long[1] ;
      P003X3_A18TBM22_SITE_ID = new String[] {""} ;
      P003X3_A325TAM08_DEL_FLG = new String[] {""} ;
      P003X3_n325TAM08_DEL_FLG = new boolean[] {false} ;
      P003X3_A377TBM22_DEL_FLG = new String[] {""} ;
      P003X3_n377TBM22_DEL_FLG = new boolean[] {false} ;
      P003X3_A319TAM08_SITE_NM = new String[] {""} ;
      P003X3_n319TAM08_SITE_NM = new boolean[] {false} ;
      A18TBM22_SITE_ID = "" ;
      A325TAM08_DEL_FLG = "" ;
      A377TBM22_DEL_FLG = "" ;
      A319TAM08_SITE_NM = "" ;
      AV20W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      AV9BC_KNGN = new SdtTAM04_KNGN(remoteHandle);
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV17W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV25Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc06_study_staff_search__default(),
         new Object[] {
             new Object[] {
            P003X2_A107TBM23_STUDY_ID, P003X2_A385TBM23_DEL_FLG, P003X2_n385TBM23_DEL_FLG, P003X2_A214TAM07_DEL_FLG, P003X2_n214TAM07_DEL_FLG, P003X2_A333TAM07_SITE_ID, P003X2_n333TAM07_SITE_ID, P003X2_A367TBM21_STUDY_NM, P003X2_n367TBM21_STUDY_NM, P003X2_A108TBM23_USER_ID,
            P003X2_A205TAM07_USER_NM, P003X2_n205TAM07_USER_NM, P003X2_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            P003X3_A17TBM22_STUDY_ID, P003X3_A18TBM22_SITE_ID, P003X3_A325TAM08_DEL_FLG, P003X3_n325TAM08_DEL_FLG, P003X3_A377TBM22_DEL_FLG, P003X3_n377TBM22_DEL_FLG, P003X3_A319TAM08_SITE_NM, P003X3_n319TAM08_SITE_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B402_PC06_STUDY_STAFF_SEARCH" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B402_PC06_STUDY_STAFF_SEARCH" ;
      Gx_err = (short)(0) ;
   }

   private short AV18W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV14P_STUDY_ID ;
   private long AV16W_CNT ;
   private long A107TBM23_STUDY_ID ;
   private long A17TBM22_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV25Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n205TAM07_USER_NM ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private String AV11P_APP_ID ;
   private String AV12P_DISP_DATETIME ;
   private String AV13P_SITE_ID ;
   private String AV19W_RTN_MSG ;
   private String AV10C_APP_ID ;
   private String A333TAM07_SITE_ID ;
   private String A385TBM23_DEL_FLG ;
   private String A214TAM07_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String A108TBM23_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A18TBM22_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A377TBM22_DEL_FLG ;
   private String A319TAM08_SITE_NM ;
   private String AV17W_ERRCD ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P003X2_A107TBM23_STUDY_ID ;
   private String[] P003X2_A385TBM23_DEL_FLG ;
   private boolean[] P003X2_n385TBM23_DEL_FLG ;
   private String[] P003X2_A214TAM07_DEL_FLG ;
   private boolean[] P003X2_n214TAM07_DEL_FLG ;
   private String[] P003X2_A333TAM07_SITE_ID ;
   private boolean[] P003X2_n333TAM07_SITE_ID ;
   private String[] P003X2_A367TBM21_STUDY_NM ;
   private boolean[] P003X2_n367TBM21_STUDY_NM ;
   private String[] P003X2_A108TBM23_USER_ID ;
   private String[] P003X2_A205TAM07_USER_NM ;
   private boolean[] P003X2_n205TAM07_USER_NM ;
   private String[] P003X2_A109TBM23_STYDY_AUTH_CD ;
   private long[] P003X3_A17TBM22_STUDY_ID ;
   private String[] P003X3_A18TBM22_SITE_ID ;
   private String[] P003X3_A325TAM08_DEL_FLG ;
   private boolean[] P003X3_n325TAM08_DEL_FLG ;
   private String[] P003X3_A377TBM22_DEL_FLG ;
   private boolean[] P003X3_n377TBM22_DEL_FLG ;
   private String[] P003X3_A319TAM08_SITE_NM ;
   private boolean[] P003X3_n319TAM08_SITE_NM ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtTAM04_KNGN AV9BC_KNGN ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB402_SD02_STUDY_STAFF AV20W_STUDY_STAFF ;
}

final  class b402_pc06_study_staff_search__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV13P_SITE_ID ,
                                          String A333TAM07_SITE_ID ,
                                          String A385TBM23_DEL_FLG ,
                                          String A214TAM07_DEL_FLG ,
                                          long AV14P_STUDY_ID ,
                                          long A107TBM23_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int4 ;
      GXv_int4 = new byte [2] ;
      Object[] GXv_Object5 ;
      GXv_Object5 = new Object [2] ;
      scmdbuf = "SELECT T1.`TBM23_STUDY_ID` AS TBM23_STUDY_ID, T1.`TBM23_DEL_FLG`, T3.`TAM07_DEL_FLG`," ;
      scmdbuf = scmdbuf + " T3.`TAM07_SITE_ID`, T2.`TBM21_STUDY_NM`, T1.`TBM23_USER_ID` AS TBM23_USER_ID, T3.`TAM07_USER_NM`," ;
      scmdbuf = scmdbuf + " T1.`TBM23_STYDY_AUTH_CD` FROM ((`TBM23_STUDY_STAFF` T1 INNER JOIN `TBM21_STUDY`" ;
      scmdbuf = scmdbuf + " T2 ON T2.`TBM21_STUDY_ID` = T1.`TBM23_STUDY_ID`) INNER JOIN `TAM07_USER` T3 ON T3.`TAM07_USER_ID`" ;
      scmdbuf = scmdbuf + " = T1.`TBM23_USER_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBM23_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T1.`TBM23_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + " and (T3.`TAM07_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV13P_SITE_ID)==0) )
      {
         sWhereString = sWhereString + " and (T3.`TAM07_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.`TBM23_STUDY_ID`, T3.`TAM07_SITE_ID`, T1.`TBM23_USER_ID`, T1.`TBM23_STYDY_AUTH_CD`" ;
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
            case 0 :
                  return conditional_P003X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P003X3", "SELECT T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID` AS TBM22_SITE_ID, T2.`TAM08_DEL_FLG`, T1.`TBM22_DEL_FLG`, T2.`TAM08_SITE_NM` FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID` = T1.`TBM22_SITE_ID`) WHERE (T1.`TBM22_STUDY_ID` = ? and T1.`TBM22_SITE_ID` = ?) AND (T1.`TBM22_DEL_FLG` = '0') AND (T2.`TAM08_DEL_FLG` = '0') ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 20);
               }
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               return;
      }
   }

}

