/*
               File: A401_PC01_LOGIN_CHECK
        Description: ログインチェック処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:42.69
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a401_pc01_login_check extends GXProcedure
{
   public a401_pc01_login_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a401_pc01_login_check.class ), "" );
   }

   public a401_pc01_login_check( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtA_LOGIN_SDT[] aP0 )
   {
      a401_pc01_login_check.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( SdtA_LOGIN_SDT[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtA_LOGIN_SDT[] aP0 ,
                             String[] aP1 )
   {
      a401_pc01_login_check.this.aP0 = aP0;
      a401_pc01_login_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S1140 */
      S1140 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9W_ERRCD = "8" ;
      if ( (GXutil.strcmp("", AV10W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV9W_ERRCD = "1" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV8W_A_LOGIN_SDT.fromxml(AV10W_SESSION.getValue("Com_Login_Info"), "");
      }
      AV9W_ERRCD = "0" ;
      cleanup();
   }

   public void S1140( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1250( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV13Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV9W_ERRCD = "8" ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = a401_pc01_login_check.this.AV8W_A_LOGIN_SDT;
      this.aP1[0] = a401_pc01_login_check.this.AV9W_ERRCD;
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
                  /* Execute user subroutine: S1250 */
                  S1250 ();
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
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV9W_ERRCD = "" ;
      AV10W_SESSION = httpContext.getWebSession();
      AV13Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      AV13Pgmname = "A401_PC01_LOGIN_CHECK" ;
      /* GeneXus formulas. */
      AV13Pgmname = "A401_PC01_LOGIN_CHECK" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV13Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV9W_ERRCD ;
   private com.genexus.webpanels.WebSession AV10W_SESSION ;
   private SdtA_LOGIN_SDT[] aP0 ;
   private String[] aP1 ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
}

