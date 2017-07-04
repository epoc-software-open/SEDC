/*
               File: ab513_pc01_down_auth_ptn_impl
        Description: 権限パターンマスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:37.62
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab513_pc01_down_auth_ptn_impl extends GXWebProcedure
{
   public ab513_pc01_down_auth_ptn_impl( com.genexus.internet.HttpContext context )
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
      AV17C_APP_ID = "B513" ;
      AV11W_ERR_CD = (short)(0) ;
      AV12W_ERR_MSG = "" ;
      GXt_char1 = AV15W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab513_pc01_down_auth_ptn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15W_NEWLINE = GXt_char1 ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV17C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_EXTRA_INFO", AV18W_EXTRA_INFO);
      /* Execute user subroutine: S1159 */
      S1159 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S1279 */
      S1279 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "INFO", AV24Pgmdesc) ;
      AV16W_RTN_CSV.clear();
      if ( AV11W_ERR_CD == 0 )
      {
         GXv_objcol_svchar3[0] = AV16W_RTN_CSV ;
         GXv_int4[0] = AV11W_ERR_CD ;
         GXv_char2[0] = AV12W_ERR_MSG ;
         new b599_pc25_auth_ptn_res(remoteHandle, context).execute( "", GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV16W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
         ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char2[0] ;
      }
      AV14W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0))+AV15W_NEWLINE);
      AV14W_HTTP_RES.addString(AV12W_ERR_MSG);
      if ( AV11W_ERR_CD == 0 )
      {
         AV10W_CNT = 1 ;
         while ( AV10W_CNT <= AV16W_RTN_CSV.size() )
         {
            AV14W_HTTP_RES.addString(AV15W_NEWLINE+(String)AV16W_RTN_CSV.elementAt(-1+(int)(AV10W_CNT)));
            AV10W_CNT = (long)(AV10W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S1395 */
      S1395 ();
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

   public void S1159( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV9P_USER_ID = AV13W_HTTP_REQ.getVariable("USER_ID") ;
      AV8P_PWD = AV13W_HTTP_REQ.getVariable("PW") ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV20W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20W_PARMS_ITEM", AV20W_PARMS_ITEM);
      AV20W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20W_PARMS_ITEM", AV20W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV20W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char2[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char2[0] ;
   }

   public void S1279( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV14W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV9P_USER_ID ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV8P_PWD, GXv_int4, GXv_char6) ;
      ab513_pc01_down_auth_ptn_impl.this.AV9P_USER_ID = GXv_char2[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
   }

   public void S1395( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV11W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab513_pc01_down_auth_ptn");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab513_pc01_down_auth_ptn");
      }
      AV19W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV12W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14114( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab513_pc01_down_auth_ptn_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
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
                  /* Execute user subroutine: S14114 */
                  S14114 ();
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
      AV17C_APP_ID = "" ;
      AV12W_ERR_MSG = "" ;
      AV15W_NEWLINE = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV23Pgmname = "" ;
      AV24Pgmdesc = "" ;
      AV16W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV14W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV9P_USER_ID = "" ;
      AV13W_HTTP_REQ = httpContext.getHttpRequest();
      AV8P_PWD = "" ;
      AV20W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab513_pc01_down_auth_ptn__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmdesc = "権限パターンマスタダウンロード" ;
      AV23Pgmname = "AB513_PC01_DOWN_AUTH_PTN" ;
      /* GeneXus formulas. */
      AV24Pgmdesc = "権限パターンマスタダウンロード" ;
      AV23Pgmname = "AB513_PC01_DOWN_AUTH_PTN" ;
      Gx_err = (short)(0) ;
   }

   private short AV11W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV10W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV23Pgmname ;
   private String AV24Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV17C_APP_ID ;
   private String AV12W_ERR_MSG ;
   private String AV15W_NEWLINE ;
   private String AV9P_USER_ID ;
   private String AV8P_PWD ;
   private String AV19W_MSG ;
   private com.genexus.internet.HttpRequest AV13W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV14W_HTTP_RES ;
   private GxObjectCollection AV16W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV20W_PARMS_ITEM ;
}

final  class ab513_pc01_down_auth_ptn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

