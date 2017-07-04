/*
               File: B402_PC08_STUDY_STAFF_WORK_UPD
        Description: 試験参加スタッフワーク更新
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:42.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc08_study_staff_work_upd extends GXProcedure
{
   public b402_pc08_study_staff_work_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc08_study_staff_work_upd.class ), "" );
   }

   public b402_pc08_study_staff_work_upd( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB402_SD02_STUDY_STAFF aP3 ,
                             short[] aP4 )
   {
      b402_pc08_study_staff_work_upd.this.AV10P_APP_ID = aP0;
      b402_pc08_study_staff_work_upd.this.AV11P_DISP_DATETIME = aP1;
      b402_pc08_study_staff_work_upd.this.AV13P_LINE_NO = aP2;
      b402_pc08_study_staff_work_upd.this.AV12P_INPUT_VALUE = aP3;
      b402_pc08_study_staff_work_upd.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        SdtB402_SD02_STUDY_STAFF aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB402_SD02_STUDY_STAFF aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b402_pc08_study_staff_work_upd.this.AV10P_APP_ID = aP0;
      b402_pc08_study_staff_work_upd.this.AV11P_DISP_DATETIME = aP1;
      b402_pc08_study_staff_work_upd.this.AV13P_LINE_NO = aP2;
      b402_pc08_study_staff_work_upd.this.AV12P_INPUT_VALUE = aP3;
      b402_pc08_study_staff_work_upd.this.aP4 = aP4;
      b402_pc08_study_staff_work_upd.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_APP_ID = "B402" ;
      /* Execute user subroutine: S1173 */
      S1173 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_RTN_CD = (short)(0) ;
      AV19W_RTN_MSG = "" ;
      AV8BC_FREE_WORK.Load(AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV10P_APP_ID, AV11P_DISP_DATETIME, AV13P_LINE_NO);
      if ( AV8BC_FREE_WORK.Fail() )
      {
         AV18W_RTN_CD = (short)(1) ;
         GXt_char1 = AV19W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
         b402_pc08_study_staff_work_upd.this.GXt_char1 = GXv_char2[0] ;
         AV19W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_STUDY_STAFF.fromxml(AV8BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
      AV20W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() );
      AV17W_IN_VAL_CNT = 1 ;
      while ( AV17W_IN_VAL_CNT <= AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() )
      {
         AV16W_EXIST = false ;
         AV21W_WK_VAL_CNT = 1 ;
         while ( AV21W_WK_VAL_CNT <= AV20W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().size() )
         {
            if ( GXutil.strcmp(((SdtB402_SD03_STUDY_STAFF_AUTH)AV20W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV21W_WK_VAL_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd(), ((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV17W_IN_VAL_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd()) == 0 )
            {
               ((SdtB402_SD03_STUDY_STAFF_AUTH)AV20W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV21W_WK_VAL_CNT))).setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( ((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV17W_IN_VAL_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check() );
               AV16W_EXIST = true ;
               if (true) break;
            }
            AV21W_WK_VAL_CNT = (long)(AV21W_WK_VAL_CNT+1) ;
         }
         if ( ! AV16W_EXIST && ((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV17W_IN_VAL_CNT))).getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check() )
         {
            AV20W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().add(((SdtB402_SD03_STUDY_STAFF_AUTH)AV12P_INPUT_VALUE.getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().elementAt(-1+(int)(AV17W_IN_VAL_CNT))), 0);
         }
         AV17W_IN_VAL_CNT = (long)(AV17W_IN_VAL_CNT+1) ;
      }
      AV8BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV20W_STUDY_STAFF.toxml(false, "B402_SD02_STUDY_STAFF", "SmartEDC_SHIZUOKA") );
      AV8BC_FREE_WORK.Save();
      if ( AV8BC_FREE_WORK.Fail() )
      {
         AV18W_RTN_CD = (short)(1) ;
         GXt_char1 = AV19W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
         b402_pc08_study_staff_work_upd.this.GXt_char1 = GXv_char2[0] ;
         AV19W_RTN_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S1173( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc08_study_staff_work_upd.this.AV15W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1291( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc08_study_staff_work_upd");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b402_pc08_study_staff_work_upd.this.AV18W_RTN_CD;
      this.aP5[0] = b402_pc08_study_staff_work_upd.this.AV19W_RTN_MSG;
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
                  /* Execute user subroutine: S1291 */
                  S1291 ();
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
      AV9C_APP_ID = "" ;
      AV8BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV20W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV24Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc08_study_staff_work_upd__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B402_PC08_STUDY_STAFF_WORK_UPD" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B402_PC08_STUDY_STAFF_WORK_UPD" ;
      Gx_err = (short)(0) ;
   }

   private short AV18W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13P_LINE_NO ;
   private long AV17W_IN_VAL_CNT ;
   private long AV21W_WK_VAL_CNT ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV24Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV16W_EXIST ;
   private String AV10P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV19W_RTN_MSG ;
   private String AV9C_APP_ID ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private SdtTBW01_FREE_WORK AV8BC_FREE_WORK ;
   private SdtB402_SD02_STUDY_STAFF AV12P_INPUT_VALUE ;
   private SdtB402_SD02_STUDY_STAFF AV20W_STUDY_STAFF ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b402_pc08_study_staff_work_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
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

