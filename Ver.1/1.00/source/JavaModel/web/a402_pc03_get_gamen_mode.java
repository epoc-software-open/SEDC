/*
               File: A402_PC03_GET_GAMEN_MODE
        Description: 権限チェック処理（画面モード取得）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:46.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a402_pc03_get_gamen_mode extends GXProcedure
{
   public a402_pc03_get_gamen_mode( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a402_pc03_get_gamen_mode.class ), "" );
   }

   public a402_pc03_get_gamen_mode( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      a402_pc03_get_gamen_mode.this.AV16P_GAMEN_MODE = aP0;
      a402_pc03_get_gamen_mode.this.AV10P_KNGN_FLG = aP1;
      a402_pc03_get_gamen_mode.this.AV9P_CRT_USER_ID = aP2;
      a402_pc03_get_gamen_mode.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      a402_pc03_get_gamen_mode.this.AV16P_GAMEN_MODE = aP0;
      a402_pc03_get_gamen_mode.this.AV10P_KNGN_FLG = aP1;
      a402_pc03_get_gamen_mode.this.AV9P_CRT_USER_ID = aP2;
      a402_pc03_get_gamen_mode.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S1148 */
      S1148 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_VALUE = "" ;
      if ( GXutil.strcmp(AV16P_GAMEN_MODE, "INS") == 0 )
      {
         if ( ((GXutil.strcmp(AV10P_KNGN_FLG, "2")==0)) )
         {
            GXt_char1 = AV14W_RTN_VALUE ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00019", "", "", "", "", "", GXv_char2) ;
            a402_pc03_get_gamen_mode.this.GXt_char1 = GXv_char2[0] ;
            AV14W_RTN_VALUE = GXt_char1 ;
         }
         else
         {
            GXt_char1 = AV14W_RTN_VALUE ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00021", "", "", "", "", "", GXv_char2) ;
            a402_pc03_get_gamen_mode.this.GXt_char1 = GXv_char2[0] ;
            AV14W_RTN_VALUE = GXt_char1 ;
         }
      }
      else if ( GXutil.strcmp(AV16P_GAMEN_MODE, "UPD") == 0 )
      {
         if ( GXutil.strcmp(AV10P_KNGN_FLG, "2") == 0 )
         {
            GXt_char1 = AV14W_RTN_VALUE ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00020", "", "", "", "", "", GXv_char2) ;
            a402_pc03_get_gamen_mode.this.GXt_char1 = GXv_char2[0] ;
            AV14W_RTN_VALUE = GXt_char1 ;
         }
         else
         {
            GXt_char1 = AV14W_RTN_VALUE ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00021", "", "", "", "", "", GXv_char2) ;
            a402_pc03_get_gamen_mode.this.GXt_char1 = GXv_char2[0] ;
            AV14W_RTN_VALUE = GXt_char1 ;
         }
      }
      cleanup();
   }

   public void S1148( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! (GXutil.strcmp("", AV15W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV12W_A_LOGIN_SDT.fromxml(AV15W_SESSION.getValue("Com_Login_Info"), "");
      }
   }

   public void S1263( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP3[0] = a402_pc03_get_gamen_mode.this.AV14W_RTN_VALUE;
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
                  /* Execute user subroutine: S1263 */
                  S1263 ();
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
      AV14W_RTN_VALUE = "" ;
      GXv_char2 = new String [1] ;
      AV15W_SESSION = httpContext.getWebSession();
      AV12W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV19Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      AV19Pgmname = "A402_PC03_GET_GAMEN_MODE" ;
      /* GeneXus formulas. */
      AV19Pgmname = "A402_PC03_GET_GAMEN_MODE" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXv_char2[] ;
   private String AV19Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV16P_GAMEN_MODE ;
   private String AV10P_KNGN_FLG ;
   private String AV9P_CRT_USER_ID ;
   private String AV14W_RTN_VALUE ;
   private com.genexus.webpanels.WebSession AV15W_SESSION ;
   private String[] aP3 ;
   private SdtA_LOGIN_SDT AV12W_A_LOGIN_SDT ;
}

