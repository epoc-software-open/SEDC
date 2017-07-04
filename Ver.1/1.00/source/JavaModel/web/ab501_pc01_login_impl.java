/*
               File: ab501_pc01_login_impl
        Description: ログイン認証
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.92
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab501_pc01_login_impl extends GXWebProcedure
{
   public ab501_pc01_login_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B501" ;
      AV11W_ERR_CD = (short)(0) ;
      AV12W_ERR_MSG = "" ;
      GXt_char1 = AV17W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab501_pc01_login_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17W_NEWLINE = GXt_char1 ;
      AV13W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV13W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13W_EXTRA_INFO", AV13W_EXTRA_INFO);
      /* Execute user subroutine: S1147 */
      S1147 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S1267 */
      S1267 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV21Pgmname, "INFO", AV22Pgmdesc) ;
      AV15W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0))+AV17W_NEWLINE);
      AV15W_HTTP_RES.addString(AV12W_ERR_MSG);
      /* Execute user subroutine: S1383 */
      S1383 ();
      if ( returnInSub )
      {
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1147( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV10P_USER_ID = AV14W_HTTP_REQ.getVariable("USER_ID") ;
      AV9P_PWD = AV14W_HTTP_REQ.getVariable("PW") ;
      AV13W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_PARMS_ITEM", AV18W_PARMS_ITEM);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_PARMS_ITEM", AV18W_PARMS_ITEM);
      AV13W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV16W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char2[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char2) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab501_pc01_login_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab501_pc01_login_impl.this.AV12W_ERR_MSG = GXv_char2[0] ;
   }

   public void S1267( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV15W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV10P_USER_ID ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char5[0] = AV12W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV9P_PWD, GXv_int4, GXv_char5) ;
      ab501_pc01_login_impl.this.AV10P_USER_ID = GXv_char2[0] ;
      ab501_pc01_login_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab501_pc01_login_impl.this.AV12W_ERR_MSG = GXv_char5[0] ;
   }

   public void S1383( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV11W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab501_pc01_login");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab501_pc01_login");
      }
      AV16W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV12W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char5[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab501_pc01_login_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab501_pc01_login_impl.this.AV12W_ERR_MSG = GXv_char5[0] ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char5[0] = AV12W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char5) ;
      ab501_pc01_login_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab501_pc01_login_impl.this.AV12W_ERR_MSG = GXv_char5[0] ;
   }

   public void S14102( )
   {
      /* 'SUB_ERROR' Routine */
      AV16W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char5[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab501_pc01_login_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab501_pc01_login_impl.this.AV12W_ERR_MSG = GXv_char5[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
                  /* Execute user subroutine: S14102 */
                  S14102 ();
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
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV8C_APP_ID = "" ;
      AV12W_ERR_MSG = "" ;
      AV17W_NEWLINE = "" ;
      AV13W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21Pgmname = "" ;
      AV22Pgmdesc = "" ;
      AV15W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV10P_USER_ID = "" ;
      AV14W_HTTP_REQ = httpContext.getHttpRequest();
      AV9P_PWD = "" ;
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO3 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char5 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab501_pc01_login__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmdesc = "ログイン認証" ;
      AV21Pgmname = "AB501_PC01_LOGIN" ;
      /* GeneXus formulas. */
      AV22Pgmdesc = "ログイン認証" ;
      AV21Pgmname = "AB501_PC01_LOGIN" ;
      Gx_err = (short)(0) ;
   }

   private short AV11W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21Pgmname ;
   private String AV22Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char5[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV8C_APP_ID ;
   private String AV12W_ERR_MSG ;
   private String AV17W_NEWLINE ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV16W_MSG ;
   private com.genexus.internet.HttpRequest AV14W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV15W_HTTP_RES ;
   private SdtB808_SD01_EXTRA_INFO AV13W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO3[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class ab501_pc01_login__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

