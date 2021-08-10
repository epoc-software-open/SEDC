/*
               File: A214_PC01_REG
        Description: DBìoò^èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:17.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a214_pc01_reg extends GXProcedure
{
   public a214_pc01_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a214_pc01_reg.class ), "" );
   }

   public a214_pc01_reg( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             short[] aP11 )
   {
      a214_pc01_reg.this.AV41D_HOST = aP0;
      a214_pc01_reg.this.AV42D_PORT = aP1;
      a214_pc01_reg.this.AV43D_AUTH = aP2;
      a214_pc01_reg.this.AV44D_AUTH_USER_NM = aP3;
      a214_pc01_reg.this.AV45D_AUTH_PWD = aP4;
      a214_pc01_reg.this.AV50D_SERVER_DEL_FLG = aP5;
      a214_pc01_reg.this.AV46D_SEND_MAIL_ADDR = aP6;
      a214_pc01_reg.this.AV47D_SEND_MAIL_NM = aP7;
      a214_pc01_reg.this.AV48D_MAIL_TITLE = aP8;
      a214_pc01_reg.this.AV49D_MAIL_MAIN = aP9;
      a214_pc01_reg.this.AV51D_MAIL_DEL_FLG = aP10;
      a214_pc01_reg.this.aP11 = aP11;
      a214_pc01_reg.this.aP12 = aP12;
      a214_pc01_reg.this.aP12 = new String[] {""};
      initialize();
      privateExecute();
      return aP12[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        short[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             short[] aP11 ,
                             String[] aP12 )
   {
      a214_pc01_reg.this.AV41D_HOST = aP0;
      a214_pc01_reg.this.AV42D_PORT = aP1;
      a214_pc01_reg.this.AV43D_AUTH = aP2;
      a214_pc01_reg.this.AV44D_AUTH_USER_NM = aP3;
      a214_pc01_reg.this.AV45D_AUTH_PWD = aP4;
      a214_pc01_reg.this.AV50D_SERVER_DEL_FLG = aP5;
      a214_pc01_reg.this.AV46D_SEND_MAIL_ADDR = aP6;
      a214_pc01_reg.this.AV47D_SEND_MAIL_NM = aP7;
      a214_pc01_reg.this.AV48D_MAIL_TITLE = aP8;
      a214_pc01_reg.this.AV49D_MAIL_MAIN = aP9;
      a214_pc01_reg.this.AV51D_MAIL_DEL_FLG = aP10;
      a214_pc01_reg.this.aP11 = aP11;
      a214_pc01_reg.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "A214" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV37W_RTN_CD = (short)(0) ;
      AV38W_RTN_MSG = "" ;
      if ( ! (GXutil.strcmp("", AV45D_AUTH_PWD)==0) )
      {
         AV54W_AUTH_EKEY = com.genexus.util.Encryption.getNewKey( ) ;
         AV53W_AUTH_PWD = com.genexus.util.Encryption.encrypt64( AV45D_AUTH_PWD, AV54W_AUTH_EKEY) ;
      }
      else
      {
         AV54W_AUTH_EKEY = "" ;
         AV53W_AUTH_PWD = "" ;
      }
      AV52W_TBM01_SYS_ID_C.clear();
      AV52W_TBM01_SYS_ID_C.add("900", 0);
      AV52W_TBM01_SYS_ID_C.add("901", 0);
      AV52W_TBM01_SYS_ID_C.add("902", 0);
      AV52W_TBM01_SYS_ID_C.add("903", 0);
      AV52W_TBM01_SYS_ID_C.add("904", 0);
      AV52W_TBM01_SYS_ID_C.add("905", 0);
      AV52W_TBM01_SYS_ID_C.add("906", 0);
      AV52W_TBM01_SYS_ID_C.add("907", 0);
      AV52W_TBM01_SYS_ID_C.add("908", 0);
      AV52W_TBM01_SYS_ID_C.add("909", 0);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A58TBM01_SYS_ID ,
                                           AV52W_TBM01_SYS_ID_C },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION
                                           }
      });
      /* Using cursor P007I2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A58TBM01_SYS_ID = P007I2_A58TBM01_SYS_ID[0] ;
         A608TBM01_SYS_VALUE = P007I2_A608TBM01_SYS_VALUE[0] ;
         n608TBM01_SYS_VALUE = P007I2_n608TBM01_SYS_VALUE[0] ;
         A351TBM01_DEL_FLG = P007I2_A351TBM01_DEL_FLG[0] ;
         n351TBM01_DEL_FLG = P007I2_n351TBM01_DEL_FLG[0] ;
         A609TBM01_NOTE = P007I2_A609TBM01_NOTE[0] ;
         n609TBM01_NOTE = P007I2_n609TBM01_NOTE[0] ;
         A355TBM01_UPD_DATETIME = P007I2_A355TBM01_UPD_DATETIME[0] ;
         n355TBM01_UPD_DATETIME = P007I2_n355TBM01_UPD_DATETIME[0] ;
         A356TBM01_UPD_USER_ID = P007I2_A356TBM01_UPD_USER_ID[0] ;
         n356TBM01_UPD_USER_ID = P007I2_n356TBM01_UPD_USER_ID[0] ;
         A357TBM01_UPD_PROG_NM = P007I2_A357TBM01_UPD_PROG_NM[0] ;
         n357TBM01_UPD_PROG_NM = P007I2_n357TBM01_UPD_PROG_NM[0] ;
         A358TBM01_UPD_CNT = P007I2_A358TBM01_UPD_CNT[0] ;
         n358TBM01_UPD_CNT = P007I2_n358TBM01_UPD_CNT[0] ;
         if ( GXutil.strcmp(A58TBM01_SYS_ID, "900") == 0 )
         {
            A608TBM01_SYS_VALUE = AV41D_HOST ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "901") == 0 )
         {
            A608TBM01_SYS_VALUE = AV42D_PORT ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "902") == 0 )
         {
            A608TBM01_SYS_VALUE = AV43D_AUTH ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "903") == 0 )
         {
            A608TBM01_SYS_VALUE = AV44D_AUTH_USER_NM ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "904") == 0 )
         {
            A608TBM01_SYS_VALUE = AV53W_AUTH_PWD ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "905") == 0 )
         {
            A608TBM01_SYS_VALUE = AV54W_AUTH_EKEY ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV50D_SERVER_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "906") == 0 )
         {
            A608TBM01_SYS_VALUE = AV46D_SEND_MAIL_ADDR ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV51D_MAIL_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "907") == 0 )
         {
            A608TBM01_SYS_VALUE = AV47D_SEND_MAIL_NM ;
            n608TBM01_SYS_VALUE = false ;
            A351TBM01_DEL_FLG = AV51D_MAIL_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "908") == 0 )
         {
            A609TBM01_NOTE = AV48D_MAIL_TITLE ;
            n609TBM01_NOTE = false ;
            A351TBM01_DEL_FLG = AV51D_MAIL_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "909") == 0 )
         {
            A609TBM01_NOTE = AV49D_MAIL_MAIN ;
            n609TBM01_NOTE = false ;
            A351TBM01_DEL_FLG = AV51D_MAIL_DEL_FLG ;
            n351TBM01_DEL_FLG = false ;
         }
         A355TBM01_UPD_DATETIME = GXutil.now( ) ;
         n355TBM01_UPD_DATETIME = false ;
         A356TBM01_UPD_USER_ID = AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n356TBM01_UPD_USER_ID = false ;
         A357TBM01_UPD_PROG_NM = AV58Pgmname ;
         n357TBM01_UPD_PROG_NM = false ;
         A358TBM01_UPD_CNT = (long)(A358TBM01_UPD_CNT+1) ;
         n358TBM01_UPD_CNT = false ;
         /* Using cursor P007I3 */
         pr_default.execute(1, new Object[] {new Boolean(n608TBM01_SYS_VALUE), A608TBM01_SYS_VALUE, new Boolean(n351TBM01_DEL_FLG), A351TBM01_DEL_FLG, new Boolean(n609TBM01_NOTE), A609TBM01_NOTE, new Boolean(n355TBM01_UPD_DATETIME), A355TBM01_UPD_DATETIME, new Boolean(n356TBM01_UPD_USER_ID), A356TBM01_UPD_USER_ID, new Boolean(n357TBM01_UPD_PROG_NM), A357TBM01_UPD_PROG_NM, new Boolean(n358TBM01_UPD_CNT), new Long(A358TBM01_UPD_CNT), A58TBM01_SYS_ID});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM01_SYSTEM") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV37W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a214_pc01_reg");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a214_pc01_reg");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      a214_pc01_reg.this.AV23W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
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
      AV37W_RTN_CD = (short)(9) ;
      AV38W_RTN_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV58Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a214_pc01_reg");
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP11[0] = a214_pc01_reg.this.AV37W_RTN_CD;
      this.aP12[0] = a214_pc01_reg.this.AV38W_RTN_MSG;
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
      AV38W_RTN_MSG = "" ;
      AV10C_APP_ID = "" ;
      AV54W_AUTH_EKEY = "" ;
      AV53W_AUTH_PWD = "" ;
      AV52W_TBM01_SYS_ID_C = new GxObjectCollection(String.class, "internal", "");
      scmdbuf = "" ;
      A58TBM01_SYS_ID = "" ;
      P007I2_A58TBM01_SYS_ID = new String[] {""} ;
      P007I2_A608TBM01_SYS_VALUE = new String[] {""} ;
      P007I2_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      P007I2_A351TBM01_DEL_FLG = new String[] {""} ;
      P007I2_n351TBM01_DEL_FLG = new boolean[] {false} ;
      P007I2_A609TBM01_NOTE = new String[] {""} ;
      P007I2_n609TBM01_NOTE = new boolean[] {false} ;
      P007I2_A355TBM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007I2_n355TBM01_UPD_DATETIME = new boolean[] {false} ;
      P007I2_A356TBM01_UPD_USER_ID = new String[] {""} ;
      P007I2_n356TBM01_UPD_USER_ID = new boolean[] {false} ;
      P007I2_A357TBM01_UPD_PROG_NM = new String[] {""} ;
      P007I2_n357TBM01_UPD_PROG_NM = new boolean[] {false} ;
      P007I2_A358TBM01_UPD_CNT = new long[1] ;
      P007I2_n358TBM01_UPD_CNT = new boolean[] {false} ;
      A608TBM01_SYS_VALUE = "" ;
      A351TBM01_DEL_FLG = "" ;
      A609TBM01_NOTE = "" ;
      A355TBM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A356TBM01_UPD_USER_ID = "" ;
      A357TBM01_UPD_PROG_NM = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV58Pgmname = "" ;
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a214_pc01_reg__default(),
         new Object[] {
             new Object[] {
            P007I2_A58TBM01_SYS_ID, P007I2_A608TBM01_SYS_VALUE, P007I2_n608TBM01_SYS_VALUE, P007I2_A351TBM01_DEL_FLG, P007I2_n351TBM01_DEL_FLG, P007I2_A609TBM01_NOTE, P007I2_n609TBM01_NOTE, P007I2_A355TBM01_UPD_DATETIME, P007I2_n355TBM01_UPD_DATETIME, P007I2_A356TBM01_UPD_USER_ID,
            P007I2_n356TBM01_UPD_USER_ID, P007I2_A357TBM01_UPD_PROG_NM, P007I2_n357TBM01_UPD_PROG_NM, P007I2_A358TBM01_UPD_CNT, P007I2_n358TBM01_UPD_CNT
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV58Pgmname = "A214_PC01_REG" ;
      /* GeneXus formulas. */
      AV58Pgmname = "A214_PC01_REG" ;
      Gx_err = (short)(0) ;
   }

   private short AV37W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A358TBM01_UPD_CNT ;
   private String scmdbuf ;
   private String AV58Pgmname ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private java.util.Date A355TBM01_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n608TBM01_SYS_VALUE ;
   private boolean n351TBM01_DEL_FLG ;
   private boolean n609TBM01_NOTE ;
   private boolean n355TBM01_UPD_DATETIME ;
   private boolean n356TBM01_UPD_USER_ID ;
   private boolean n357TBM01_UPD_PROG_NM ;
   private boolean n358TBM01_UPD_CNT ;
   private String AV41D_HOST ;
   private String AV42D_PORT ;
   private String AV43D_AUTH ;
   private String AV44D_AUTH_USER_NM ;
   private String AV45D_AUTH_PWD ;
   private String AV50D_SERVER_DEL_FLG ;
   private String AV46D_SEND_MAIL_ADDR ;
   private String AV47D_SEND_MAIL_NM ;
   private String AV48D_MAIL_TITLE ;
   private String AV49D_MAIL_MAIN ;
   private String AV51D_MAIL_DEL_FLG ;
   private String AV38W_RTN_MSG ;
   private String AV10C_APP_ID ;
   private String AV54W_AUTH_EKEY ;
   private String AV53W_AUTH_PWD ;
   private String A58TBM01_SYS_ID ;
   private String A608TBM01_SYS_VALUE ;
   private String A351TBM01_DEL_FLG ;
   private String A609TBM01_NOTE ;
   private String A356TBM01_UPD_USER_ID ;
   private String A357TBM01_UPD_PROG_NM ;
   private String AV23W_ERRCD ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private short[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P007I2_A58TBM01_SYS_ID ;
   private String[] P007I2_A608TBM01_SYS_VALUE ;
   private boolean[] P007I2_n608TBM01_SYS_VALUE ;
   private String[] P007I2_A351TBM01_DEL_FLG ;
   private boolean[] P007I2_n351TBM01_DEL_FLG ;
   private String[] P007I2_A609TBM01_NOTE ;
   private boolean[] P007I2_n609TBM01_NOTE ;
   private java.util.Date[] P007I2_A355TBM01_UPD_DATETIME ;
   private boolean[] P007I2_n355TBM01_UPD_DATETIME ;
   private String[] P007I2_A356TBM01_UPD_USER_ID ;
   private boolean[] P007I2_n356TBM01_UPD_USER_ID ;
   private String[] P007I2_A357TBM01_UPD_PROG_NM ;
   private boolean[] P007I2_n357TBM01_UPD_PROG_NM ;
   private long[] P007I2_A358TBM01_UPD_CNT ;
   private boolean[] P007I2_n358TBM01_UPD_CNT ;
   private GxObjectCollection AV52W_TBM01_SYS_ID_C ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class a214_pc01_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P007I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A58TBM01_SYS_ID ,
                                          GxObjectCollection AV52W_TBM01_SYS_ID_C )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object3 ;
      GXv_Object3 = new Object [2] ;
      scmdbuf = "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE`, `TBM01_DEL_FLG`, `TBM01_NOTE`, `TBM01_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM01_UPD_USER_ID`, `TBM01_UPD_PROG_NM`, `TBM01_UPD_CNT` FROM `TBM01_SYSTEM`" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("mysql", AV52W_TBM01_SYS_ID_C, "`TBM01_SYS_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM01_SYS_ID`" ;
      scmdbuf = scmdbuf + " FOR UPDATE " ;
      GXv_Object3[0] = scmdbuf ;
      return GXv_Object3 ;
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
                  return conditional_P007I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GxObjectCollection)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007I2", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007I3", "UPDATE `TBM01_SYSTEM` SET `TBM01_SYS_VALUE`=?, `TBM01_DEL_FLG`=?, `TBM01_NOTE`=?, `TBM01_UPD_DATETIME`=?, `TBM01_UPD_USER_ID`=?, `TBM01_UPD_PROG_NM`=?, `TBM01_UPD_CNT`=?  WHERE `TBM01_SYS_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               stmt.setVarchar(8, (String)parms[14], 20, false);
               return;
      }
   }

}

