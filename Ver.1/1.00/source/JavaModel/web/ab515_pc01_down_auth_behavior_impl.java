/*
               File: ab515_pc01_down_auth_behavior_impl
        Description: 権限別振舞マスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.79
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab515_pc01_down_auth_behavior_impl extends GXWebProcedure
{
   public ab515_pc01_down_auth_behavior_impl( com.genexus.internet.HttpContext context )
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
      AV8C_APP_ID = "B515" ;
      AV11W_ERR_CD = (short)(0) ;
      AV12W_ERR_MSG = "" ;
      GXt_char1 = AV17W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab515_pc01_down_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17W_NEWLINE = GXt_char1 ;
      AV13W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV13W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13W_EXTRA_INFO", AV13W_EXTRA_INFO);
      /* Execute user subroutine: S1157 */
      S1157 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S1277 */
      S1277 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "INFO", AV24Pgmdesc) ;
      if ( AV11W_ERR_CD == 0 )
      {
         GXv_objcol_svchar3[0] = AV20W_RTN_CSV ;
         GXv_int4[0] = AV11W_ERR_CD ;
         GXv_char2[0] = AV12W_ERR_MSG ;
         new b599_pc29_auth_behavior_res(remoteHandle, context).execute( "", GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV20W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
         ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char2[0] ;
      }
      AV15W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0))+AV17W_NEWLINE);
      AV15W_HTTP_RES.addString(AV12W_ERR_MSG);
      if ( AV11W_ERR_CD == 0 )
      {
         AV19W_CNT = 1 ;
         while ( AV19W_CNT <= AV20W_RTN_CSV.size() )
         {
            AV15W_HTTP_RES.addString(AV17W_NEWLINE+(String)AV20W_RTN_CSV.elementAt(-1+(int)(AV19W_CNT)));
            AV19W_CNT = (long)(AV19W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S1393 */
      S1393 ();
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

   public void S1157( )
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
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char2[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char2[0] ;
   }

   public void S1277( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV15W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV10P_USER_ID ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV9P_PWD, GXv_int4, GXv_char6) ;
      ab515_pc01_down_auth_behavior_impl.this.AV10P_USER_ID = GXv_char2[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
   }

   public void S1393( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV11W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab515_pc01_down_auth_behavior");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab515_pc01_down_auth_behavior");
      }
      AV16W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV11W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV12W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14112( )
   {
      /* 'SUB_ERROR' Routine */
      AV16W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV13W_EXTRA_INFO;
      GXv_int4[0] = AV11W_ERR_CD ;
      GXv_char6[0] = AV12W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV11W_ERR_CD = GXv_int4[0] ;
      ab515_pc01_down_auth_behavior_impl.this.AV12W_ERR_MSG = GXv_char6[0] ;
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
                  /* Execute user subroutine: S14112 */
                  S14112 ();
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
      AV23Pgmname = "" ;
      AV24Pgmdesc = "" ;
      AV20W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
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
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab515_pc01_down_auth_behavior__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmdesc = "権限別振舞マスタダウンロード" ;
      AV23Pgmname = "AB515_PC01_DOWN_AUTH_BEHAVIOR" ;
      /* GeneXus formulas. */
      AV24Pgmdesc = "権限別振舞マスタダウンロード" ;
      AV23Pgmname = "AB515_PC01_DOWN_AUTH_BEHAVIOR" ;
      Gx_err = (short)(0) ;
   }

   private short AV11W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV19W_CNT ;
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
   private String AV8C_APP_ID ;
   private String AV12W_ERR_MSG ;
   private String AV17W_NEWLINE ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV16W_MSG ;
   private com.genexus.internet.HttpRequest AV14W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV15W_HTTP_RES ;
   private GxObjectCollection AV20W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV13W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class ab515_pc01_down_auth_behavior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

