/*
               File: ab517_pc01_down_user_impl
        Description: ユーザーマスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:45.19
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab517_pc01_down_user_impl extends GXWebProcedure
{
   public ab517_pc01_down_user_impl( com.genexus.internet.HttpContext context )
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
      AV8C_APP_ID = "B517" ;
      AV12W_ERR_CD = (short)(0) ;
      AV13W_ERR_MSG = "" ;
      GXt_char1 = AV18W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab517_pc01_down_user_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18W_NEWLINE = GXt_char1 ;
      AV14W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV14W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_EXTRA_INFO", AV14W_EXTRA_INFO);
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "INFO", AV25Pgmdesc) ;
      if ( AV12W_ERR_CD == 0 )
      {
         GXv_objcol_svchar3[0] = AV21W_RTN_CSV ;
         GXv_int4[0] = AV12W_ERR_CD ;
         GXv_char2[0] = AV13W_ERR_MSG ;
         new b599_pc31_user_res(remoteHandle, context).execute( "", GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV21W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
         ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char2[0] ;
      }
      AV16W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV12W_ERR_CD, 10, 0))+AV18W_NEWLINE);
      AV16W_HTTP_RES.addString(AV13W_ERR_MSG);
      if ( AV12W_ERR_CD == 0 )
      {
         AV20W_CNT = 1 ;
         while ( AV20W_CNT <= AV21W_RTN_CSV.size() )
         {
            AV16W_HTTP_RES.addString(AV18W_NEWLINE+(String)AV21W_RTN_CSV.elementAt(-1+(int)(AV20W_CNT)));
            AV20W_CNT = (long)(AV20W_CNT+1) ;
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
      AV10P_USER_ID = AV15W_HTTP_REQ.getVariable("USER_ID") ;
      AV9P_PWD = AV15W_HTTP_REQ.getVariable("PW") ;
      AV14W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV14W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV14W_EXTRA_INFO;
      GXv_int4[0] = AV12W_ERR_CD ;
      GXv_char2[0] = AV13W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
      ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char2[0] ;
   }

   public void S1277( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV16W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV10P_USER_ID ;
      GXv_int4[0] = AV12W_ERR_CD ;
      GXv_char6[0] = AV13W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV9P_PWD, GXv_int4, GXv_char6) ;
      ab517_pc01_down_user_impl.this.AV10P_USER_ID = GXv_char2[0] ;
      ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
      ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char6[0] ;
   }

   public void S1393( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV12W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab517_pc01_down_user");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab517_pc01_down_user");
      }
      AV17W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV12W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV13W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV14W_EXTRA_INFO;
      GXv_int4[0] = AV12W_ERR_CD ;
      GXv_char6[0] = AV13W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
      ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV12W_ERR_CD ;
      GXv_char6[0] = AV13W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
      ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14112( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV14W_EXTRA_INFO;
      GXv_int4[0] = AV12W_ERR_CD ;
      GXv_char6[0] = AV13W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab517_pc01_down_user_impl.this.AV12W_ERR_CD = GXv_int4[0] ;
      ab517_pc01_down_user_impl.this.AV13W_ERR_MSG = GXv_char6[0] ;
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
      AV13W_ERR_MSG = "" ;
      AV18W_NEWLINE = "" ;
      AV14W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24Pgmname = "" ;
      AV25Pgmdesc = "" ;
      AV21W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV16W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV10P_USER_ID = "" ;
      AV15W_HTTP_REQ = httpContext.getHttpRequest();
      AV9P_PWD = "" ;
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab517_pc01_down_user__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmdesc = "ユーザーマスタダウンロード" ;
      AV24Pgmname = "AB517_PC01_DOWN_USER" ;
      /* GeneXus formulas. */
      AV25Pgmdesc = "ユーザーマスタダウンロード" ;
      AV24Pgmname = "AB517_PC01_DOWN_USER" ;
      Gx_err = (short)(0) ;
   }

   private short AV12W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV20W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24Pgmname ;
   private String AV25Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV8C_APP_ID ;
   private String AV13W_ERR_MSG ;
   private String AV18W_NEWLINE ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV17W_MSG ;
   private com.genexus.internet.HttpRequest AV15W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV16W_HTTP_RES ;
   private GxObjectCollection AV21W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV14W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class ab517_pc01_down_user__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

