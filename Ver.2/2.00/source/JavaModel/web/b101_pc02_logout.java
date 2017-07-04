/*
               File: B101_PC02_LOGOUT
        Description: ログアウト処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:51.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b101_pc02_logout extends GXProcedure
{
   public b101_pc02_logout( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b101_pc02_logout.class ), "" );
   }

   public b101_pc02_logout( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short[] aP0 )
   {
      b101_pc02_logout.this.aP0 = aP0;
      b101_pc02_logout.this.aP1 = aP1;
      b101_pc02_logout.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( short[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short[] aP0 ,
                             String[] aP1 )
   {
      b101_pc02_logout.this.aP0 = aP0;
      b101_pc02_logout.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B101" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      GXv_SdtA_LOGIN_SDT1[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV12W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      b101_pc02_logout.this.AV12W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg(), "1") == 0 )
      {
         AV16W_SESSION.clear();
         AV16W_SESSION.destroy();
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV14W_RTN_CD = (short)(9) ;
      AV15W_RTN_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b101_pc02_logout");
   }

   protected void cleanup( )
   {
      this.aP0[0] = b101_pc02_logout.this.AV14W_RTN_CD;
      this.aP1[0] = b101_pc02_logout.this.AV15W_RTN_MSG;
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
      AV15W_RTN_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV12W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV16W_SESSION = httpContext.getWebSession();
      AV19Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b101_pc02_logout__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV19Pgmname = "B101_PC02_LOGOUT" ;
      /* GeneXus formulas. */
      AV19Pgmname = "B101_PC02_LOGOUT" ;
      Gx_err = (short)(0) ;
   }

   private short AV14W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXv_char2[] ;
   private String AV19Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV15W_RTN_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV12W_ERRCD ;
   private short[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private com.genexus.webpanels.WebSession AV16W_SESSION ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class b101_pc02_logout__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

