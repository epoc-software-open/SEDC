/*
               File: B402_PC02_SITE_WORK_INIT
        Description: é{ê›ìoò^ÉèÅ[ÉNèâä˙âª
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:41.52
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc02_site_work_init extends GXProcedure
{
   public b402_pc02_site_work_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc02_site_work_init.class ), "" );
   }

   public b402_pc02_site_work_init( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             short[] aP3 )
   {
      b402_pc02_site_work_init.this.AV10P_APP_ID = aP0;
      b402_pc02_site_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc02_site_work_init.this.AV12P_STUDY_ID = aP2;
      b402_pc02_site_work_init.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b402_pc02_site_work_init.this.AV10P_APP_ID = aP0;
      b402_pc02_site_work_init.this.AV11P_DISP_DATETIME = aP1;
      b402_pc02_site_work_init.this.AV12P_STUDY_ID = aP2;
      b402_pc02_site_work_init.this.aP3 = aP3;
      b402_pc02_site_work_init.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_TAM020_APP_ID = "B402" ;
      /* Execute user subroutine: S1177 */
      S1177 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_RTN_CD = (short)(0) ;
      AV17W_RTN_MSG = "" ;
      new b805_pc01_work_del(remoteHandle, context).execute( AV10P_APP_ID, AV11P_DISP_DATETIME) ;
      AV14W_CNT = 0 ;
      /* Using cursor P003S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132TAM08_SITE_ID = P003S2_A132TAM08_SITE_ID[0] ;
         A139TAM08_DEL_FLG = P003S2_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = P003S2_n139TAM08_DEL_FLG[0] ;
         A133TAM08_SITE_NM = P003S2_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = P003S2_n133TAM08_SITE_NM[0] ;
         AV14W_CNT = (long)(AV14W_CNT+1) ;
         AV18W_SITE = (SdtB402_SD01_STUDY_SITE)new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Check( false );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Study_id( AV12P_STUDY_ID );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Site_id( A132TAM08_SITE_ID );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Site_nm( A133TAM08_SITE_NM );
         GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime( GXt_dtime1 );
         /* Using cursor P003S3 */
         pr_default.execute(1, new Object[] {new Long(AV12P_STUDY_ID), A132TAM08_SITE_ID});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A198TBM22_SITE_ID = P003S3_A198TBM22_SITE_ID[0] ;
            A197TBM22_STUDY_ID = P003S3_A197TBM22_STUDY_ID[0] ;
            A199TBM22_DEL_FLG = P003S3_A199TBM22_DEL_FLG[0] ;
            n199TBM22_DEL_FLG = P003S3_n199TBM22_DEL_FLG[0] ;
            A203TBM22_UPD_DATETIME = P003S3_A203TBM22_UPD_DATETIME[0] ;
            n203TBM22_UPD_DATETIME = P003S3_n203TBM22_UPD_DATETIME[0] ;
            if ( GXutil.strcmp(A199TBM22_DEL_FLG, "0") == 0 )
            {
               AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Check( true );
            }
            AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime( A203TBM22_UPD_DATETIME );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV8BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV10P_APP_ID );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV11P_DISP_DATETIME );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV14W_CNT );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV18W_SITE.toxml(false, "B402_SD01_STUDY_SITE", "SmartEDC_SHIZUOKA") );
         AV8BC_FREE_WORK.Save();
         if ( AV8BC_FREE_WORK.Fail() )
         {
            AV16W_RTN_CD = (short)(1) ;
            GXt_char2 = AV17W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
            b402_pc02_site_work_init.this.GXt_char2 = GXv_char3[0] ;
            AV17W_RTN_MSG = GXt_char2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1177( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV13W_A_LOGIN_SDT;
      GXv_char3[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc02_site_work_init.this.AV15W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1295( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc02_site_work_init");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b402_pc02_site_work_init.this.AV16W_RTN_CD;
      this.aP4[0] = b402_pc02_site_work_init.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S1295 */
                  S1295 ();
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
      AV9C_TAM020_APP_ID = "" ;
      scmdbuf = "" ;
      P003S2_A132TAM08_SITE_ID = new String[] {""} ;
      P003S2_A139TAM08_DEL_FLG = new String[] {""} ;
      P003S2_n139TAM08_DEL_FLG = new boolean[] {false} ;
      P003S2_A133TAM08_SITE_NM = new String[] {""} ;
      P003S2_n133TAM08_SITE_NM = new boolean[] {false} ;
      A132TAM08_SITE_ID = "" ;
      A139TAM08_DEL_FLG = "" ;
      A133TAM08_SITE_NM = "" ;
      AV18W_SITE = new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      P003S3_A198TBM22_SITE_ID = new String[] {""} ;
      P003S3_A197TBM22_STUDY_ID = new long[1] ;
      P003S3_A199TBM22_DEL_FLG = new String[] {""} ;
      P003S3_n199TBM22_DEL_FLG = new boolean[] {false} ;
      P003S3_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003S3_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      A198TBM22_SITE_ID = "" ;
      A199TBM22_DEL_FLG = "" ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV23Pgmname = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc02_site_work_init__default(),
         new Object[] {
             new Object[] {
            P003S2_A132TAM08_SITE_ID, P003S2_A139TAM08_DEL_FLG, P003S2_n139TAM08_DEL_FLG, P003S2_A133TAM08_SITE_NM, P003S2_n133TAM08_SITE_NM
            }
            , new Object[] {
            P003S3_A198TBM22_SITE_ID, P003S3_A197TBM22_STUDY_ID, P003S3_A199TBM22_DEL_FLG, P003S3_n199TBM22_DEL_FLG, P003S3_A203TBM22_UPD_DATETIME, P003S3_n203TBM22_UPD_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B402_PC02_SITE_WORK_INIT" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B402_PC02_SITE_WORK_INIT" ;
      Gx_err = (short)(0) ;
   }

   private short AV16W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long AV14W_CNT ;
   private long A197TBM22_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV23Pgmname ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date A203TBM22_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n133TAM08_SITE_NM ;
   private boolean n199TBM22_DEL_FLG ;
   private boolean n203TBM22_UPD_DATETIME ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV17W_RTN_MSG ;
   private String AV9C_TAM020_APP_ID ;
   private String A132TAM08_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A133TAM08_SITE_NM ;
   private String A198TBM22_SITE_ID ;
   private String A199TBM22_DEL_FLG ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P003S2_A132TAM08_SITE_ID ;
   private String[] P003S2_A139TAM08_DEL_FLG ;
   private boolean[] P003S2_n139TAM08_DEL_FLG ;
   private String[] P003S2_A133TAM08_SITE_NM ;
   private boolean[] P003S2_n133TAM08_SITE_NM ;
   private String[] P003S3_A198TBM22_SITE_ID ;
   private long[] P003S3_A197TBM22_STUDY_ID ;
   private String[] P003S3_A199TBM22_DEL_FLG ;
   private boolean[] P003S3_n199TBM22_DEL_FLG ;
   private java.util.Date[] P003S3_A203TBM22_UPD_DATETIME ;
   private boolean[] P003S3_n203TBM22_UPD_DATETIME ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB402_SD01_STUDY_SITE AV18W_SITE ;
}

final  class b402_pc02_site_work_init__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003S2", "SELECT `TAM08_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE `TAM08_DEL_FLG` = '0' ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P003S3", "SELECT `TBM22_SITE_ID`, `TBM22_STUDY_ID`, `TBM22_DEL_FLG`, `TBM22_UPD_DATETIME` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? and `TBM22_SITE_ID` = ? ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
      }
   }

}

