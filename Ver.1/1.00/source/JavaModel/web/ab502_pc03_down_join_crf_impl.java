/*
               File: ab502_pc03_down_join_crf_impl
        Description: CRF結合ダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:35.9
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc03_down_join_crf_impl extends GXWebProcedure
{
   public ab502_pc03_down_join_crf_impl( com.genexus.internet.HttpContext context )
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
      AV21C_APP_ID = "B502" ;
      AV14W_ERR_CD = (short)(0) ;
      AV15W_ERR_MSG = "" ;
      GXt_char1 = AV19W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab502_pc03_down_join_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19W_NEWLINE = GXt_char1 ;
      AV22W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV22W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV21C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_EXTRA_INFO", AV22W_EXTRA_INFO);
      /* Execute user subroutine: S1284 */
      S1284 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S13119 */
      S13119 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV27Pgmname, "INFO", AV28Pgmdesc) ;
      AV20W_RTN_CSV.clear();
      if ( AV14W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1163 */
         S1163 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV14W_ERR_CD == 0 )
      {
         GXv_objcol_svchar3[0] = AV20W_RTN_CSV ;
         GXv_int4[0] = AV14W_ERR_CD ;
         GXv_char2[0] = AV15W_ERR_MSG ;
         new b599_pc26_join_crf_res(remoteHandle, context).execute( AV11P_STUDY_ID, AV8P_CRF_ID, AV9P_CRF_ITEM_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV20W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
         ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char2[0] ;
      }
      AV17W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV14W_ERR_CD, 10, 0))+AV19W_NEWLINE);
      AV17W_HTTP_RES.addString(AV15W_ERR_MSG);
      if ( AV14W_ERR_CD == 0 )
      {
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV20W_RTN_CSV.size() )
         {
            AV17W_HTTP_RES.addString(AV19W_NEWLINE+(String)AV20W_RTN_CSV.elementAt(-1+(int)(AV13W_CNT)));
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S14135 */
      S14135 ();
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

   public void S1163( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV14W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV11P_STUDY_ID)==0) )
         {
            AV14W_ERR_CD = (short)(1) ;
            GXt_char1 = AV15W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab502_pc03_down_join_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV15W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV14W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV8P_CRF_ID)==0) )
         {
            AV14W_ERR_CD = (short)(1) ;
            GXt_char1 = AV15W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CRFID", "", "", "", "", GXv_char2) ;
            ab502_pc03_down_join_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV15W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S1284( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV12P_USER_ID = AV16W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV16W_HTTP_REQ.getVariable("PW") ;
      AV11P_STUDY_ID = AV16W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV8P_CRF_ID = AV16W_HTTP_REQ.getVariable("CRF_ID") ;
      AV9P_CRF_ITEM_CD = AV16W_HTTP_REQ.getVariable("CRF_ITEM_CD") ;
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV23W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV22W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char2[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(1), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13119( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV17W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV12P_USER_ID ;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV10P_PWD, GXv_int4, GXv_char6) ;
      ab502_pc03_down_join_crf_impl.this.AV12P_USER_ID = GXv_char2[0] ;
      ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14135( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV14W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab502_pc03_down_join_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab502_pc03_down_join_crf");
      }
      AV23W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV14W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV15W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV22W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(1), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
   }

   public void S15154( )
   {
      /* 'SUB_ERROR' Routine */
      AV23W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV22W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(0), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc03_down_join_crf_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab502_pc03_down_join_crf_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
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
                  /* Execute user subroutine: S15154 */
                  S15154 ();
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
      AV21C_APP_ID = "" ;
      AV15W_ERR_MSG = "" ;
      AV19W_NEWLINE = "" ;
      AV22W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27Pgmname = "" ;
      AV28Pgmdesc = "" ;
      AV20W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV11P_STUDY_ID = "" ;
      AV8P_CRF_ID = "" ;
      AV9P_CRF_ITEM_CD = "" ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV17W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV12P_USER_ID = "" ;
      AV16W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV24W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab502_pc03_down_join_crf__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmdesc = "CRF結合ダウンロード" ;
      AV27Pgmname = "AB502_PC03_DOWN_JOIN_CRF" ;
      /* GeneXus formulas. */
      AV28Pgmdesc = "CRF結合ダウンロード" ;
      AV27Pgmname = "AB502_PC03_DOWN_JOIN_CRF" ;
      Gx_err = (short)(0) ;
   }

   private short AV14W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV27Pgmname ;
   private String AV28Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV21C_APP_ID ;
   private String AV15W_ERR_MSG ;
   private String AV19W_NEWLINE ;
   private String AV11P_STUDY_ID ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_ITEM_CD ;
   private String AV12P_USER_ID ;
   private String AV10P_PWD ;
   private String AV23W_MSG ;
   private com.genexus.internet.HttpRequest AV16W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV17W_HTTP_RES ;
   private GxObjectCollection AV20W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV22W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV24W_PARMS_ITEM ;
}

final  class ab502_pc03_down_join_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

