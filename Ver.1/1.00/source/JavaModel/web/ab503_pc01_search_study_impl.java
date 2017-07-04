/*
               File: ab503_pc01_search_study_impl
        Description: ééå±åüçı
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:20.14
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab503_pc01_search_study_impl extends GXWebProcedure
{
   public ab503_pc01_search_study_impl( com.genexus.internet.HttpContext context )
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
      AV20C_APP_ID = "B503" ;
      AV14W_ERR_CD = (short)(0) ;
      AV15W_ERR_MSG = "" ;
      GXt_char1 = AV18W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab503_pc01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18W_NEWLINE = GXt_char1 ;
      AV21W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV20C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_EXTRA_INFO", AV21W_EXTRA_INFO);
      /* Execute user subroutine: S1291 */
      S1291 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S13126 */
      S13126 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV26Pgmname, "INFO", AV27Pgmdesc) ;
      AV19W_RTN_CSV.clear();
      if ( AV14W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1170 */
         S1170 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV14W_ERR_CD == 0 )
      {
         if ( GXutil.strcmp(AV9P_DIV, "1") == 0 )
         {
            GXv_objcol_svchar3[0] = AV19W_RTN_CSV ;
            GXv_int4[0] = AV14W_ERR_CD ;
            GXv_char2[0] = AV15W_ERR_MSG ;
            new b599_pc11_study_res(remoteHandle, context).execute( AV11P_STUDY_ID, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
            AV19W_RTN_CSV = GXv_objcol_svchar3[0] ;
            ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
            ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV9P_DIV, "2") == 0 )
         {
            GXv_objcol_svchar3[0] = AV19W_RTN_CSV ;
            GXv_int4[0] = AV14W_ERR_CD ;
            GXv_char2[0] = AV15W_ERR_MSG ;
            new b599_pc13_study_staff_res(remoteHandle, context).execute( AV11P_STUDY_ID, "", AV8P_AUTH_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
            AV19W_RTN_CSV = GXv_objcol_svchar3[0] ;
            ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
            ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char2[0] ;
         }
      }
      AV17W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV14W_ERR_CD, 10, 0))+AV18W_NEWLINE);
      AV17W_HTTP_RES.addString(AV15W_ERR_MSG);
      if ( AV14W_ERR_CD == 0 )
      {
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV19W_RTN_CSV.size() )
         {
            AV17W_HTTP_RES.addString(AV18W_NEWLINE+(String)AV19W_RTN_CSV.elementAt(-1+(int)(AV13W_CNT)));
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S14142 */
      S14142 ();
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

   public void S1170( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV14W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV9P_DIV)==0) )
         {
            AV14W_ERR_CD = (short)(1) ;
            GXt_char1 = AV15W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "èàóùãÊï™", "", "", "", "", GXv_char2) ;
            ab503_pc01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
            AV15W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV14W_ERR_CD == 0 )
      {
         if ( ! ((GXutil.strcmp(AV9P_DIV, "1")==0)||(GXutil.strcmp(AV9P_DIV, "2")==0)) )
         {
            AV14W_ERR_CD = (short)(1) ;
            GXt_char1 = AV15W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "èàóùãÊï™", "", "", "", "", GXv_char2) ;
            ab503_pc01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
            AV15W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S1291( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV12P_USER_ID = AV16W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV16W_HTTP_REQ.getVariable("PW") ;
      AV11P_STUDY_ID = AV16W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV8P_AUTH_CD = AV16W_HTTP_REQ.getVariable("AUTH_CD") ;
      AV9P_DIV = AV16W_HTTP_REQ.getVariable("PROC_DIV") ;
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "PROC_DIV" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DIV );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV22W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV21W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char2[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13126( )
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
      ab503_pc01_search_study_impl.this.AV12P_USER_ID = GXv_char2[0] ;
      ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14142( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV14W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab503_pc01_search_study");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab503_pc01_search_study");
      }
      AV22W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV14W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV15W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV21W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
   }

   public void S15161( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV21W_EXTRA_INFO;
      GXv_int4[0] = AV14W_ERR_CD ;
      GXv_char6[0] = AV15W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab503_pc01_search_study_impl.this.AV14W_ERR_CD = GXv_int4[0] ;
      ab503_pc01_search_study_impl.this.AV15W_ERR_MSG = GXv_char6[0] ;
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
                  /* Execute user subroutine: S15161 */
                  S15161 ();
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
      AV20C_APP_ID = "" ;
      AV15W_ERR_MSG = "" ;
      AV18W_NEWLINE = "" ;
      AV21W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26Pgmname = "" ;
      AV27Pgmdesc = "" ;
      AV19W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV9P_DIV = "" ;
      AV11P_STUDY_ID = "" ;
      AV8P_AUTH_CD = "" ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV17W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV12P_USER_ID = "" ;
      AV16W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab503_pc01_search_study__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV27Pgmdesc = "ééå±åüçı" ;
      AV26Pgmname = "AB503_PC01_SEARCH_STUDY" ;
      /* GeneXus formulas. */
      AV27Pgmdesc = "ééå±åüçı" ;
      AV26Pgmname = "AB503_PC01_SEARCH_STUDY" ;
      Gx_err = (short)(0) ;
   }

   private short AV14W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26Pgmname ;
   private String AV27Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV20C_APP_ID ;
   private String AV15W_ERR_MSG ;
   private String AV18W_NEWLINE ;
   private String AV9P_DIV ;
   private String AV11P_STUDY_ID ;
   private String AV8P_AUTH_CD ;
   private String AV12P_USER_ID ;
   private String AV10P_PWD ;
   private String AV22W_MSG ;
   private com.genexus.internet.HttpRequest AV16W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV17W_HTTP_RES ;
   private GxObjectCollection AV19W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV21W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

final  class ab503_pc01_search_study__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

