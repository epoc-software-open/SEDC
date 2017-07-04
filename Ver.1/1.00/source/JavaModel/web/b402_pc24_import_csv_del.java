/*
               File: B402_PC24_IMPORT_CSV_DEL
        Description: Žæž—š—ðíœˆ—
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:23.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc24_import_csv_del extends GXProcedure
{
   public b402_pc24_import_csv_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc24_import_csv_del.class ), "" );
   }

   public b402_pc24_import_csv_del( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S1154 */
      S1154 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "020", GXv_char2) ;
      b402_pc24_import_csv_del.this.GXt_char1 = GXv_char2[0] ;
      AV16W_HOJI_KAISU = GXutil.lval( GXt_char1) ;
      AV10W_CNT = 0 ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT16_IMPORT_HISTORY" ;
      /* Using cursor P00682 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A825TBT16_FILE_NM = P00682_A825TBT16_FILE_NM[0] ;
         n825TBT16_FILE_NM = P00682_n825TBT16_FILE_NM[0] ;
         A823TBT16_IMPORT_NO = P00682_A823TBT16_IMPORT_NO[0] ;
         AV10W_CNT = (long)(AV10W_CNT+1) ;
         if ( AV10W_CNT > AV16W_HOJI_KAISU )
         {
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a801_pc02_sys_config_get(remoteHandle, context).execute( AV9W_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
            b402_pc24_import_csv_del.this.GXt_char1 = GXv_char2[0] ;
            AV15W_FILE.setSource( GXt_char1+A825TBT16_FILE_NM );
            AV15W_FILE.delete();
            AV18BC_TBT16_IMPORT_HISTORY.Load(A823TBT16_IMPORT_NO);
            AV18BC_TBT16_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg( "1" );
            AV18BC_TBT16_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm( AV22Pgmname );
            AV18BC_TBT16_IMPORT_HISTORY.Save();
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1154( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV9W_A_LOGIN_SDT;
      GXv_char2[0] = AV13W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV9W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc24_import_csv_del.this.AV13W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV13W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1272( )
   {
      /* 'SUB_ERROR' Routine */
      AV14W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV14W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV14W_EXTRA_INFO;
      GXv_int6[0] = AV11W_ERR_CD ;
      GXv_char2[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int6, GXv_char2) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      b402_pc24_import_csv_del.this.AV11W_ERR_CD = GXv_int6[0] ;
      b402_pc24_import_csv_del.this.AV12W_ERR_MSG = GXv_char2[0] ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc24_import_csv_del");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
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
                  /* Execute user subroutine: S1272 */
                  S1272 ();
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
      AV8C_APP_ID = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00682_A825TBT16_FILE_NM = new String[] {""} ;
      P00682_n825TBT16_FILE_NM = new boolean[] {false} ;
      P00682_A823TBT16_IMPORT_NO = new long[1] ;
      A825TBT16_FILE_NM = "" ;
      AV15W_FILE = new com.genexus.util.GXFile();
      GXt_char1 = "" ;
      AV9W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV18BC_TBT16_IMPORT_HISTORY = new SdtTBT16_IMPORT_HISTORY(remoteHandle);
      AV22Pgmname = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV13W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV14W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int6 = new short [1] ;
      AV12W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc24_import_csv_del__default(),
         new Object[] {
             new Object[] {
            P00682_A825TBT16_FILE_NM, P00682_n825TBT16_FILE_NM, P00682_A823TBT16_IMPORT_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B402_PC24_IMPORT_CSV_DEL" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B402_PC24_IMPORT_CSV_DEL" ;
      Gx_err = (short)(0) ;
   }

   private short AV11W_ERR_CD ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV16W_HOJI_KAISU ;
   private long AV10W_CNT ;
   private long A823TBT16_IMPORT_NO ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String AV22Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n825TBT16_FILE_NM ;
   private String AV8C_APP_ID ;
   private String A825TBT16_FILE_NM ;
   private String AV13W_ERRCD ;
   private String AV17W_MSG ;
   private String AV12W_ERR_MSG ;
   private com.genexus.util.GXFile AV15W_FILE ;
   private IDataStoreProvider pr_default ;
   private String[] P00682_A825TBT16_FILE_NM ;
   private boolean[] P00682_n825TBT16_FILE_NM ;
   private long[] P00682_A823TBT16_IMPORT_NO ;
   private SdtA_LOGIN_SDT AV9W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB808_SD01_EXTRA_INFO AV14W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtTBT16_IMPORT_HISTORY AV18BC_TBT16_IMPORT_HISTORY ;
}

final  class b402_pc24_import_csv_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00682", "SELECT `TBT16_FILE_NM`, `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` ORDER BY `TBT16_IMPORT_NO` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               break;
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

