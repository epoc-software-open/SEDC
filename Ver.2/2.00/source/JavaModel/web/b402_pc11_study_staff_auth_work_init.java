/*
               File: B402_PC11_STUDY_STAFF_AUTH_WORK_INIT
        Description: 試験参加スタッフ権限ワーク初期化
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:10.21
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc11_study_staff_auth_work_init extends GXProcedure
{
   public b402_pc11_study_staff_auth_work_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc11_study_staff_auth_work_init.class ), "" );
   }

   public b402_pc11_study_staff_auth_work_init( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             SdtB402_SD02_STUDY_STAFF aP2 ,
                             short[] aP3 )
   {
      b402_pc11_study_staff_auth_work_init.this.AV10P_APP_ID = aP0;
      b402_pc11_study_staff_auth_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc11_study_staff_auth_work_init.this.AV12P_STUDY_STAFF = aP2;
      b402_pc11_study_staff_auth_work_init.this.aP3 = aP3;
      b402_pc11_study_staff_auth_work_init.this.aP4 = aP4;
      b402_pc11_study_staff_auth_work_init.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        SdtB402_SD02_STUDY_STAFF aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             SdtB402_SD02_STUDY_STAFF aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b402_pc11_study_staff_auth_work_init.this.AV10P_APP_ID = aP0;
      b402_pc11_study_staff_auth_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc11_study_staff_auth_work_init.this.AV12P_STUDY_STAFF = aP2;
      b402_pc11_study_staff_auth_work_init.this.aP3 = aP3;
      b402_pc11_study_staff_auth_work_init.this.aP4 = aP4;
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
      AV17W_RTN_CD = (short)(0) ;
      AV18W_RTN_MSG = "" ;
      new b805_pc01_work_del(remoteHandle, context).execute( AV10P_APP_ID, AV11P_DISP_DATETIME) ;
      AV16W_LINE_NO = 0 ;
      /* Using cursor P00402 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A215TAM04_DEL_FLG = P00402_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P00402_n215TAM04_DEL_FLG[0] ;
         A285TAM04_AUTH_NM = P00402_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P00402_n285TAM04_AUTH_NM[0] ;
         A13TAM04_AUTH_CD = P00402_A13TAM04_AUTH_CD[0] ;
         AV16W_LINE_NO = (long)(AV16W_LINE_NO+1) ;
         AV19W_STUDY_STAFF_AUTH = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
         AV19W_STUDY_STAFF_AUTH.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( false );
         AV19W_STUDY_STAFF_AUTH.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( A13TAM04_AUTH_CD );
         AV19W_STUDY_STAFF_AUTH.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm( A285TAM04_AUTH_NM );
         AV14W_CNT = 1 ;
         while ( AV14W_CNT <= AV12P_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() )
         {
            if ( ( GXutil.strcmp(((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV14W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd(), AV19W_STUDY_STAFF_AUTH.getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd()) == 0 ) && ((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV14W_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check() )
            {
               AV19W_STUDY_STAFF_AUTH.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( true );
               if (true) break;
            }
            AV14W_CNT = (long)(AV14W_CNT+1) ;
         }
         AV8BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV10P_APP_ID );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV11P_DISP_DATETIME );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV16W_LINE_NO );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV19W_STUDY_STAFF_AUTH.toxml(false, true, "B402_SD03_STUDY_STAFF_AUTH", "tablet-EDC_GXXEV3U3") );
         AV8BC_FREE_WORK.Save();
         if ( AV8BC_FREE_WORK.Fail() )
         {
            AV17W_RTN_CD = (short)(1) ;
            GXt_char1 = AV18W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc11_study_staff_auth_work_init.this.GXt_char1 = GXv_char2[0] ;
            AV18W_RTN_MSG = GXt_char1 ;
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
      GXv_SdtA_LOGIN_SDT3[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc11_study_staff_auth_work_init.this.AV15W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b402_pc11_study_staff_auth_work_init.this.AV17W_RTN_CD;
      this.aP4[0] = b402_pc11_study_staff_auth_work_init.this.AV18W_RTN_MSG;
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
      AV18W_RTN_MSG = "" ;
      AV9C_APP_ID = "" ;
      scmdbuf = "" ;
      P00402_A215TAM04_DEL_FLG = new String[] {""} ;
      P00402_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P00402_A285TAM04_AUTH_NM = new String[] {""} ;
      P00402_n285TAM04_AUTH_NM = new boolean[] {false} ;
      P00402_A13TAM04_AUTH_CD = new String[] {""} ;
      A215TAM04_DEL_FLG = "" ;
      A285TAM04_AUTH_NM = "" ;
      A13TAM04_AUTH_CD = "" ;
      AV19W_STUDY_STAFF_AUTH = new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV23Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc11_study_staff_auth_work_init__default(),
         new Object[] {
             new Object[] {
            P00402_A215TAM04_DEL_FLG, P00402_n215TAM04_DEL_FLG, P00402_A285TAM04_AUTH_NM, P00402_n285TAM04_AUTH_NM, P00402_A13TAM04_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B402_PC11_STUDY_STAFF_AUTH_WORK_INIT" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B402_PC11_STUDY_STAFF_AUTH_WORK_INIT" ;
      Gx_err = (short)(0) ;
   }

   private short AV17W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV16W_LINE_NO ;
   private long AV14W_CNT ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV23Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n285TAM04_AUTH_NM ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV18W_RTN_MSG ;
   private String AV9C_APP_ID ;
   private String A215TAM04_DEL_FLG ;
   private String A285TAM04_AUTH_NM ;
   private String A13TAM04_AUTH_CD ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00402_A215TAM04_DEL_FLG ;
   private boolean[] P00402_n215TAM04_DEL_FLG ;
   private String[] P00402_A285TAM04_AUTH_NM ;
   private boolean[] P00402_n285TAM04_AUTH_NM ;
   private String[] P00402_A13TAM04_AUTH_CD ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtB402_SD02_STUDY_STAFF AV12P_STUDY_STAFF ;
   private SdtB402_SD03_STUDY_STAFF_AUTH AV19W_STUDY_STAFF_AUTH ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b402_pc11_study_staff_auth_work_init__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00402", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_NM`, `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_DEL_FLG` = '0' ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

