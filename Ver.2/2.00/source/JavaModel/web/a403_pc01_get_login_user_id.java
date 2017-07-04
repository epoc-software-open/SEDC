/*
               File: A403_PC01_GET_LOGIN_USER_ID
        Description: ログインユーザーID取得処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:40.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a403_pc01_get_login_user_id extends GXProcedure
{
   public a403_pc01_get_login_user_id( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a403_pc01_get_login_user_id.class ), "" );
   }

   public a403_pc01_get_login_user_id( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      a403_pc01_get_login_user_id.this.aP0 = aP0;
      a403_pc01_get_login_user_id.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      a403_pc01_get_login_user_id.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( (GXutil.strcmp("", AV10W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV11W_TAM07_USER_ID = "" ;
      }
      else
      {
         AV8W_A_LOGIN_SDT.fromxml(AV10W_SESSION.getValue("Com_Login_Info"), "");
         AV11W_TAM07_USER_ID = AV8W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = a403_pc01_get_login_user_id.this.AV11W_TAM07_USER_ID;
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
      AV11W_TAM07_USER_ID = "" ;
      AV10W_SESSION = httpContext.getWebSession();
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV14Pgmname = "" ;
      Gx_emsg = "" ;
      AV14Pgmname = "A403_PC01_GET_LOGIN_USER_ID" ;
      /* GeneXus formulas. */
      AV14Pgmname = "A403_PC01_GET_LOGIN_USER_ID" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV14Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV11W_TAM07_USER_ID ;
   private com.genexus.webpanels.WebSession AV10W_SESSION ;
   private String[] aP0 ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
}

