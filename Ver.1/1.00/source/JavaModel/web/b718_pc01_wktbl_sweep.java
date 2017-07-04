/*
               File: B718_PC01_WKTBL_SWEEP
        Description: ワークテーブルスイープ処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:16.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b718_pc01_wktbl_sweep extends GXProcedure
{
   public b718_pc01_wktbl_sweep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b718_pc01_wktbl_sweep.class ), "" );
   }

   public b718_pc01_wktbl_sweep( int remoteHandle ,
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
      AV8C_TAM02_APP_ID = "B718" ;
      /* Execute user subroutine: S1141 */
      S1141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV10W_DELETE_DATETIME ;
      GXt_char2 = AV10W_DELETE_DATETIME ;
      GXv_char3[0] = GXt_char2 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "006", GXv_char3) ;
      b718_pc01_wktbl_sweep.this.GXt_char2 = GXv_char3[0] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.dadd( GXutil.today( ) , - ( (int)(GXutil.val( GXt_char2, ".")) )) );
      GXv_char5[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXt_dtime4, "YYYYMMDDHHMISS", GXv_char5) ;
      b718_pc01_wktbl_sweep.this.GXt_char1 = GXv_char5[0] ;
      AV10W_DELETE_DATETIME = GXt_char1 ;
      /* Optimized DELETE. */
      /* Using cursor P00672 */
      pr_default.execute(0, new Object[] {AV10W_DELETE_DATETIME});
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT", "b718_pc01_wktbl_sweep");
      cleanup();
   }

   public void S1141( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV9W_A_LOGIN_SDT;
      GXv_char5[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char5) ;
      AV9W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b718_pc01_wktbl_sweep.this.AV11W_ERRCD = GXv_char5[0] ;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1259( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
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
                  /* Execute user subroutine: S1259 */
                  S1259 ();
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
      AV8C_TAM02_APP_ID = "" ;
      AV10W_DELETE_DATETIME = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String [1] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV9W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV11W_ERRCD = "" ;
      GXv_char5 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV15Pgmname = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b718_pc01_wktbl_sweep__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV15Pgmname = "B718_PC01_WKTBL_SWEEP" ;
      /* GeneXus formulas. */
      AV15Pgmname = "B718_PC01_WKTBL_SWEEP" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV15Pgmname ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime4 ;
   private boolean returnInSub ;
   private String AV8C_TAM02_APP_ID ;
   private String AV10W_DELETE_DATETIME ;
   private String AV11W_ERRCD ;
   private IDataStoreProvider pr_default ;
   private SdtA_LOGIN_SDT AV9W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
}

final  class b718_pc01_wktbl_sweep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00672", "DELETE FROM `TBW01_FREE_WORK`  WHERE `TBW01_DISP_DATETIME` < ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 14);
               break;
      }
   }

}

