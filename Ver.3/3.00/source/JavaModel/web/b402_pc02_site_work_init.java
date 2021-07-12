/*
               File: B402_PC02_SITE_WORK_INIT
        Description: é{ê›ìoò^ÉèÅ[ÉNèâä˙âª
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:30.14
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
      b402_pc02_site_work_init.this.aP3 = aP3;
      b402_pc02_site_work_init.this.aP4 = aP4;
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
      /* Execute user subroutine: S111 */
      S111 ();
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
      /* Using cursor P003T2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A57TAM08_SITE_ID = P003T2_A57TAM08_SITE_ID[0] ;
         A325TAM08_DEL_FLG = P003T2_A325TAM08_DEL_FLG[0] ;
         n325TAM08_DEL_FLG = P003T2_n325TAM08_DEL_FLG[0] ;
         A319TAM08_SITE_NM = P003T2_A319TAM08_SITE_NM[0] ;
         n319TAM08_SITE_NM = P003T2_n319TAM08_SITE_NM[0] ;
         AV14W_CNT = (long)(AV14W_CNT+1) ;
         AV18W_SITE = (SdtB402_SD01_STUDY_SITE)new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Check( false );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Study_id( AV12P_STUDY_ID );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Site_id( A57TAM08_SITE_ID );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Site_nm( A319TAM08_SITE_NM );
         GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
         AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime( GXt_dtime1 );
         /* Using cursor P003T3 */
         pr_default.execute(1, new Object[] {new Long(AV12P_STUDY_ID), A57TAM08_SITE_ID});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A18TBM22_SITE_ID = P003T3_A18TBM22_SITE_ID[0] ;
            A17TBM22_STUDY_ID = P003T3_A17TBM22_STUDY_ID[0] ;
            A377TBM22_DEL_FLG = P003T3_A377TBM22_DEL_FLG[0] ;
            n377TBM22_DEL_FLG = P003T3_n377TBM22_DEL_FLG[0] ;
            A381TBM22_UPD_DATETIME = P003T3_A381TBM22_UPD_DATETIME[0] ;
            n381TBM22_UPD_DATETIME = P003T3_n381TBM22_UPD_DATETIME[0] ;
            if ( GXutil.strcmp(A377TBM22_DEL_FLG, "0") == 0 )
            {
               AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Check( true );
            }
            AV18W_SITE.setgxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime( A381TBM22_UPD_DATETIME );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV8BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV10P_APP_ID );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV11P_DISP_DATETIME );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV14W_CNT );
         AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV18W_SITE.toxml(false, true, "B402_SD01_STUDY_SITE", "tablet-EDC_GXXEV3U3") );
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

   public void S111( )
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc02_site_work_init");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
      AV17W_RTN_MSG = "" ;
      AV9C_TAM020_APP_ID = "" ;
      scmdbuf = "" ;
      P003T2_A57TAM08_SITE_ID = new String[] {""} ;
      P003T2_A325TAM08_DEL_FLG = new String[] {""} ;
      P003T2_n325TAM08_DEL_FLG = new boolean[] {false} ;
      P003T2_A319TAM08_SITE_NM = new String[] {""} ;
      P003T2_n319TAM08_SITE_NM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A325TAM08_DEL_FLG = "" ;
      A319TAM08_SITE_NM = "" ;
      AV18W_SITE = new SdtB402_SD01_STUDY_SITE(remoteHandle, context);
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      P003T3_A18TBM22_SITE_ID = new String[] {""} ;
      P003T3_A17TBM22_STUDY_ID = new long[1] ;
      P003T3_A377TBM22_DEL_FLG = new String[] {""} ;
      P003T3_n377TBM22_DEL_FLG = new boolean[] {false} ;
      P003T3_A381TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003T3_n381TBM22_UPD_DATETIME = new boolean[] {false} ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      A381TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV23Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc02_site_work_init__default(),
         new Object[] {
             new Object[] {
            P003T2_A57TAM08_SITE_ID, P003T2_A325TAM08_DEL_FLG, P003T2_n325TAM08_DEL_FLG, P003T2_A319TAM08_SITE_NM, P003T2_n319TAM08_SITE_NM
            }
            , new Object[] {
            P003T3_A18TBM22_SITE_ID, P003T3_A17TBM22_STUDY_ID, P003T3_A377TBM22_DEL_FLG, P003T3_n377TBM22_DEL_FLG, P003T3_A381TBM22_UPD_DATETIME, P003T3_n381TBM22_UPD_DATETIME
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
   private long A17TBM22_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV23Pgmname ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date A381TBM22_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n381TBM22_UPD_DATETIME ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV17W_RTN_MSG ;
   private String AV9C_TAM020_APP_ID ;
   private String A57TAM08_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A319TAM08_SITE_NM ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P003T2_A57TAM08_SITE_ID ;
   private String[] P003T2_A325TAM08_DEL_FLG ;
   private boolean[] P003T2_n325TAM08_DEL_FLG ;
   private String[] P003T2_A319TAM08_SITE_NM ;
   private boolean[] P003T2_n319TAM08_SITE_NM ;
   private String[] P003T3_A18TBM22_SITE_ID ;
   private long[] P003T3_A17TBM22_STUDY_ID ;
   private String[] P003T3_A377TBM22_DEL_FLG ;
   private boolean[] P003T3_n377TBM22_DEL_FLG ;
   private java.util.Date[] P003T3_A381TBM22_UPD_DATETIME ;
   private boolean[] P003T3_n381TBM22_UPD_DATETIME ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB402_SD01_STUDY_SITE AV18W_SITE ;
}

final  class b402_pc02_site_work_init__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003T2", "SELECT `TAM08_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE `TAM08_DEL_FLG` = '0' ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P003T3", "SELECT `TBM22_SITE_ID`, `TBM22_STUDY_ID`, `TBM22_DEL_FLG`, `TBM22_UPD_DATETIME` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? and `TBM22_SITE_ID` = ? ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
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
               return;
      }
   }

}

