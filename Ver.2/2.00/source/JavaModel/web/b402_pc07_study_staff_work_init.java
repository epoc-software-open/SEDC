/*
               File: B402_PC07_STUDY_STAFF_WORK_INIT
        Description: 試験参加スタッフワーク初期化
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:9.49
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc07_study_staff_work_init extends GXProcedure
{
   public b402_pc07_study_staff_work_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc07_study_staff_work_init.class ), "" );
   }

   public b402_pc07_study_staff_work_init( int remoteHandle ,
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
      b402_pc07_study_staff_work_init.this.AV10P_APP_ID = aP0;
      b402_pc07_study_staff_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc07_study_staff_work_init.this.AV13P_STUDY_ID = aP2;
      b402_pc07_study_staff_work_init.this.AV12P_SITE_ID = aP3;
      b402_pc07_study_staff_work_init.this.aP4 = aP4;
      b402_pc07_study_staff_work_init.this.aP5 = aP5;
      b402_pc07_study_staff_work_init.this.aP5 = new String[] {""};
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
      b402_pc07_study_staff_work_init.this.AV10P_APP_ID = aP0;
      b402_pc07_study_staff_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc07_study_staff_work_init.this.AV13P_STUDY_ID = aP2;
      b402_pc07_study_staff_work_init.this.AV12P_SITE_ID = aP3;
      b402_pc07_study_staff_work_init.this.aP4 = aP4;
      b402_pc07_study_staff_work_init.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_APP_ID = "B402" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_RTN_CD = (short)(0) ;
      AV20W_RTN_MSG = "" ;
      new b805_pc01_work_del(remoteHandle, context).execute( AV10P_APP_ID, AV11P_DISP_DATETIME) ;
      AV18W_LINE_NO = 0 ;
      /* Using cursor P003Y2 */
      pr_default.execute(0, new Object[] {AV12P_SITE_ID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A55TAM07_USER_ID = P003Y2_A55TAM07_USER_ID[0] ;
         A214TAM07_DEL_FLG = P003Y2_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = P003Y2_n214TAM07_DEL_FLG[0] ;
         A333TAM07_SITE_ID = P003Y2_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = P003Y2_n333TAM07_SITE_ID[0] ;
         A205TAM07_USER_NM = P003Y2_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = P003Y2_n205TAM07_USER_NM[0] ;
         A56TAM07_AUTH_CD = P003Y2_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = P003Y2_n56TAM07_AUTH_CD[0] ;
         A285TAM04_AUTH_NM = P003Y2_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P003Y2_n285TAM04_AUTH_NM[0] ;
         A285TAM04_AUTH_NM = P003Y2_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P003Y2_n285TAM04_AUTH_NM[0] ;
         AV18W_LINE_NO = (long)(AV18W_LINE_NO+1) ;
         AV22W_STUDY_STAFF = (SdtB402_SD02_STUDY_STAFF)new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( false );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( AV13P_STUDY_ID );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( A333TAM07_SITE_ID );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_User_id( A55TAM07_USER_ID );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( A205TAM07_USER_NM );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( A56TAM07_AUTH_CD );
         AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( A285TAM04_AUTH_NM );
         AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().clear();
         /* Using cursor P003Y3 */
         pr_default.execute(1, new Object[] {new Long(AV13P_STUDY_ID), A55TAM07_USER_ID});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A108TBM23_USER_ID = P003Y3_A108TBM23_USER_ID[0] ;
            A107TBM23_STUDY_ID = P003Y3_A107TBM23_STUDY_ID[0] ;
            A389TBM23_UPD_DATETIME = P003Y3_A389TBM23_UPD_DATETIME[0] ;
            n389TBM23_UPD_DATETIME = P003Y3_n389TBM23_UPD_DATETIME[0] ;
            A385TBM23_DEL_FLG = P003Y3_A385TBM23_DEL_FLG[0] ;
            n385TBM23_DEL_FLG = P003Y3_n385TBM23_DEL_FLG[0] ;
            A109TBM23_STYDY_AUTH_CD = P003Y3_A109TBM23_STYDY_AUTH_CD[0] ;
            AV21W_SEL_AUTH_ITEM = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( false );
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( A109TBM23_STYDY_AUTH_CD );
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime( A389TBM23_UPD_DATETIME );
            if ( GXutil.strcmp(A385TBM23_DEL_FLG, "0") == 0 )
            {
               AV22W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( true );
               AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( true );
            }
            AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().add(AV21W_SEL_AUTH_ITEM, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() == 0 )
         {
            AV21W_SEL_AUTH_ITEM = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( true );
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( A56TAM07_AUTH_CD );
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm( A285TAM04_AUTH_NM );
            GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
            AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime( GXt_dtime1 );
            AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().add(AV21W_SEL_AUTH_ITEM, 0);
         }
         else
         {
            if ( ! AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() )
            {
               AV17W_EXIST = false ;
               AV15W_CNT = 1 ;
               while ( AV15W_CNT <= AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() )
               {
                  if ( GXutil.strcmp(((SdtB402_SD03_STUDY_STAFF_AUTH)AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV15W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd(), A56TAM07_AUTH_CD) == 0 )
                  {
                     ((SdtB402_SD03_STUDY_STAFF_AUTH)AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV15W_CNT))).setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( true );
                     AV17W_EXIST = true ;
                     if (true) break;
                  }
                  AV15W_CNT = (long)(AV15W_CNT+1) ;
               }
               if ( ! AV17W_EXIST )
               {
                  AV21W_SEL_AUTH_ITEM = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
                  AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( true );
                  AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( A56TAM07_AUTH_CD );
                  AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm( A285TAM04_AUTH_NM );
                  GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
                  AV21W_SEL_AUTH_ITEM.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime( GXt_dtime1 );
                  AV22W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().add(AV21W_SEL_AUTH_ITEM, 0);
               }
            }
         }
         AV8BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV10P_APP_ID );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV11P_DISP_DATETIME );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV18W_LINE_NO );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV22W_STUDY_STAFF.toxml(false, true, "B402_SD02_STUDY_STAFF", "tablet-EDC_GXXEV3U3") );
         AV8BC_FREE_WORK.Save();
         if ( AV8BC_FREE_WORK.Fail() )
         {
            AV19W_RTN_CD = (short)(1) ;
            GXt_char2 = AV20W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
            b402_pc07_study_staff_work_init.this.GXt_char2 = GXv_char3[0] ;
            AV20W_RTN_MSG = GXt_char2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV14W_A_LOGIN_SDT;
      GXv_char3[0] = AV16W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc07_study_staff_work_init.this.AV16W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV27Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc07_study_staff_work_init");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b402_pc07_study_staff_work_init.this.AV19W_RTN_CD;
      this.aP5[0] = b402_pc07_study_staff_work_init.this.AV20W_RTN_MSG;
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
      AV20W_RTN_MSG = "" ;
      AV9C_APP_ID = "" ;
      scmdbuf = "" ;
      P003Y2_A55TAM07_USER_ID = new String[] {""} ;
      P003Y2_A214TAM07_DEL_FLG = new String[] {""} ;
      P003Y2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P003Y2_A333TAM07_SITE_ID = new String[] {""} ;
      P003Y2_n333TAM07_SITE_ID = new boolean[] {false} ;
      P003Y2_A205TAM07_USER_NM = new String[] {""} ;
      P003Y2_n205TAM07_USER_NM = new boolean[] {false} ;
      P003Y2_A56TAM07_AUTH_CD = new String[] {""} ;
      P003Y2_n56TAM07_AUTH_CD = new boolean[] {false} ;
      P003Y2_A285TAM04_AUTH_NM = new String[] {""} ;
      P003Y2_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A214TAM07_DEL_FLG = "" ;
      A333TAM07_SITE_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A56TAM07_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      AV22W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      P003Y3_A108TBM23_USER_ID = new String[] {""} ;
      P003Y3_A107TBM23_STUDY_ID = new long[1] ;
      P003Y3_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003Y3_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      P003Y3_A385TBM23_DEL_FLG = new String[] {""} ;
      P003Y3_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P003Y3_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      A108TBM23_USER_ID = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A385TBM23_DEL_FLG = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      AV21W_SEL_AUTH_ITEM = new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV16W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV27Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc07_study_staff_work_init__default(),
         new Object[] {
             new Object[] {
            P003Y2_A55TAM07_USER_ID, P003Y2_A214TAM07_DEL_FLG, P003Y2_n214TAM07_DEL_FLG, P003Y2_A333TAM07_SITE_ID, P003Y2_n333TAM07_SITE_ID, P003Y2_A205TAM07_USER_NM, P003Y2_n205TAM07_USER_NM, P003Y2_A56TAM07_AUTH_CD, P003Y2_n56TAM07_AUTH_CD, P003Y2_A285TAM04_AUTH_NM,
            P003Y2_n285TAM04_AUTH_NM
            }
            , new Object[] {
            P003Y3_A108TBM23_USER_ID, P003Y3_A107TBM23_STUDY_ID, P003Y3_A389TBM23_UPD_DATETIME, P003Y3_n389TBM23_UPD_DATETIME, P003Y3_A385TBM23_DEL_FLG, P003Y3_n385TBM23_DEL_FLG, P003Y3_A109TBM23_STYDY_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV27Pgmname = "B402_PC07_STUDY_STAFF_WORK_INIT" ;
      /* GeneXus formulas. */
      AV27Pgmname = "B402_PC07_STUDY_STAFF_WORK_INIT" ;
      Gx_err = (short)(0) ;
   }

   private short AV19W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long AV18W_LINE_NO ;
   private long A107TBM23_STUDY_ID ;
   private long AV15W_CNT ;
   private String scmdbuf ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV27Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private java.util.Date GXt_dtime1 ;
   private boolean returnInSub ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n205TAM07_USER_NM ;
   private boolean n56TAM07_AUTH_CD ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean AV17W_EXIST ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV12P_SITE_ID ;
   private String AV20W_RTN_MSG ;
   private String AV9C_APP_ID ;
   private String A55TAM07_USER_ID ;
   private String A214TAM07_DEL_FLG ;
   private String A333TAM07_SITE_ID ;
   private String A205TAM07_USER_NM ;
   private String A56TAM07_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String A108TBM23_USER_ID ;
   private String A385TBM23_DEL_FLG ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String AV16W_ERRCD ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P003Y2_A55TAM07_USER_ID ;
   private String[] P003Y2_A214TAM07_DEL_FLG ;
   private boolean[] P003Y2_n214TAM07_DEL_FLG ;
   private String[] P003Y2_A333TAM07_SITE_ID ;
   private boolean[] P003Y2_n333TAM07_SITE_ID ;
   private String[] P003Y2_A205TAM07_USER_NM ;
   private boolean[] P003Y2_n205TAM07_USER_NM ;
   private String[] P003Y2_A56TAM07_AUTH_CD ;
   private boolean[] P003Y2_n56TAM07_AUTH_CD ;
   private String[] P003Y2_A285TAM04_AUTH_NM ;
   private boolean[] P003Y2_n285TAM04_AUTH_NM ;
   private String[] P003Y3_A108TBM23_USER_ID ;
   private long[] P003Y3_A107TBM23_STUDY_ID ;
   private java.util.Date[] P003Y3_A389TBM23_UPD_DATETIME ;
   private boolean[] P003Y3_n389TBM23_UPD_DATETIME ;
   private String[] P003Y3_A385TBM23_DEL_FLG ;
   private boolean[] P003Y3_n385TBM23_DEL_FLG ;
   private String[] P003Y3_A109TBM23_STYDY_AUTH_CD ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB402_SD03_STUDY_STAFF_AUTH AV21W_SEL_AUTH_ITEM ;
   private SdtB402_SD02_STUDY_STAFF AV22W_STUDY_STAFF ;
}

final  class b402_pc07_study_staff_work_init__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Y2", "SELECT T1.`TAM07_USER_ID`, T1.`TAM07_DEL_FLG`, T1.`TAM07_SITE_ID`, T1.`TAM07_USER_NM`, T1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD, T2.`TAM04_AUTH_NM` FROM (`TAM07_USER` T1 LEFT JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM07_AUTH_CD`) WHERE (T1.`TAM07_SITE_ID` = ?) AND (T1.`TAM07_DEL_FLG` = '0') ORDER BY T1.`TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P003Y3", "SELECT `TBM23_USER_ID`, `TBM23_STUDY_ID`, `TBM23_UPD_DATETIME`, `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
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
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128);
               return;
      }
   }

}

