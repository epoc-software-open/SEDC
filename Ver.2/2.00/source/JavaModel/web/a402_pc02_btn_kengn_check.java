/*
               File: A402_PC02_BTN_KENGN_CHECK
        Description: 権限チェック処理（ボタン制御）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:45.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a402_pc02_btn_kengn_check extends GXProcedure
{
   public a402_pc02_btn_kengn_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a402_pc02_btn_kengn_check.class ), "" );
   }

   public a402_pc02_btn_kengn_check( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              String aP2 )
   {
      a402_pc02_btn_kengn_check.this.AV9P_BTN_TYPE = aP0;
      a402_pc02_btn_kengn_check.this.AV11P_KNGN_FLG = aP1;
      a402_pc02_btn_kengn_check.this.AV10P_CRT_USER_ID = aP2;
      a402_pc02_btn_kengn_check.this.aP3 = aP3;
      a402_pc02_btn_kengn_check.this.aP3 = new boolean[] {false};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             boolean[] aP3 )
   {
      a402_pc02_btn_kengn_check.this.AV9P_BTN_TYPE = aP0;
      a402_pc02_btn_kengn_check.this.AV11P_KNGN_FLG = aP1;
      a402_pc02_btn_kengn_check.this.AV10P_CRT_USER_ID = aP2;
      a402_pc02_btn_kengn_check.this.aP3 = aP3;
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
      AV14W_RTN_VALUE = false ;
      if ( ((GXutil.strcmp(AV9P_BTN_TYPE, "REG")==0)||(GXutil.strcmp(AV9P_BTN_TYPE, "UPLOAD")==0)||(GXutil.strcmp(AV9P_BTN_TYPE, "CPY")==0)) )
      {
         if ( ((GXutil.strcmp(AV11P_KNGN_FLG, "2")==0)) )
         {
            AV14W_RTN_VALUE = true ;
         }
      }
      else if ( ((GXutil.strcmp(AV9P_BTN_TYPE, "UPD")==0)||(GXutil.strcmp(AV9P_BTN_TYPE, "DLT")==0)) )
      {
         if ( GXutil.strcmp(AV11P_KNGN_FLG, "2") == 0 )
         {
            AV14W_RTN_VALUE = true ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! (GXutil.strcmp("", AV15W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV8W_A_LOGIN_SDT.fromxml(AV15W_SESSION.getValue("Com_Login_Info"), "");
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP3[0] = a402_pc02_btn_kengn_check.this.AV14W_RTN_VALUE;
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
      AV15W_SESSION = httpContext.getWebSession();
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV18Pgmname = "" ;
      Gx_emsg = "" ;
      AV18Pgmname = "A402_PC02_BTN_KENGN_CHECK" ;
      /* GeneXus formulas. */
      AV18Pgmname = "A402_PC02_BTN_KENGN_CHECK" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV18Pgmname ;
   private String Gx_emsg ;
   private boolean AV14W_RTN_VALUE ;
   private boolean returnInSub ;
   private String AV9P_BTN_TYPE ;
   private String AV11P_KNGN_FLG ;
   private String AV10P_CRT_USER_ID ;
   private com.genexus.webpanels.WebSession AV15W_SESSION ;
   private boolean[] aP3 ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
}

