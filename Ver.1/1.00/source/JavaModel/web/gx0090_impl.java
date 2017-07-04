/*
               File: gx0090_impl
        Description: Selection List アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:46.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0090_impl extends GXDataArea
{
   public gx0090_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0090_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0090_impl.class ));
   }

   public gx0090_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
         gxfirstwebparm_bkp = gxfirstwebparm ;
         gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm, "High") ;
         if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            dyncall( httpContext.GetNextPar( )) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_Grid1 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_51_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_51_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_51_idx, sGXsfl_51_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            /* GeneXus formulas. */
            Gx_err = (short)(0) ;
            Grid1_PageSize51 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cTAM04_KNGN_PTN_KBN = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
            AV7cTAM03_APP_ID = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
            AV8cTAM05_KNGN_FLG = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
            AV9cTAM05_DEL_FLG = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
            AV10cTAM05_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            AV11cTAM05_CRT_USER_ID = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
            AV12cTAM05_CRT_PROG_NM = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( Grid1_PageSize51, AV6cTAM04_KNGN_PTN_KBN, AV7cTAM03_APP_ID, AV8cTAM05_KNGN_FLG, AV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, AV11cTAM05_CRT_USER_ID, AV12cTAM05_CRT_PROG_NM) ;
            return  ;
         }
         else
         {
            if ( ! httpContext.IsValidAjaxCall( false) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = gxfirstwebparm_bkp ;
         }
         if ( ! entryPointCalled )
         {
            AV13pTAM04_KNGN_PTN_KBN = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pTAM03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
            }
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         MasterPageObj = new promptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
         MasterPageObj.webExecute();
         if ( httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
            }
            if ( (GXutil.strcmp("", httpContext.wjLoc)==0) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( httpContext.isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa0N2( ) ;
      gxajaxcallmode = (byte)((httpContext.isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0N2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      if ( ! httpContext.isSmartDevice( ) )
      {
         httpContext.AddJavascriptSource("gxgral.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      else
      {
         httpContext.AddJavascriptSource("gxapiSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfxSD.js", "?58720");
         httpContext.AddJavascriptSource("gxtypesSD.js", "?58720");
         httpContext.AddJavascriptSource("gxpopupSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfrmutlSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgridSD.js", "?58720");
         httpContext.AddJavascriptSource("JavaScripTableSD.js", "?58720");
         httpContext.AddJavascriptSource("rijndaelSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgralSD.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      httpContext.AddJavascriptSource("calendar.js", "?58720");
      httpContext.AddJavascriptSource("calendar-setup.js", "?58720");
      httpContext.AddJavascriptSource("calendar-ja.js", "?58720");
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;"+"background-color:"+WebUtils.getHTMLColor( Form.getIBackground())+";") ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         httpContext.writeText( " background-image:url("+httpContext.convertURL( Form.getBackground())+")") ;
      }
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV13pTAM04_KNGN_PTN_KBN)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTAM03_APP_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("gx0090") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM04_KNGN_PTN_KBN", GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM03_APP_ID", GXutil.rtrim( AV7cTAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_KNGN_FLG", GXutil.rtrim( AV8cTAM05_KNGN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_DEL_FLG", GXutil.rtrim( AV9cTAM05_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_DATETIME", localUtil.format(AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_USER_ID", GXutil.rtrim( AV11cTAM05_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_PROG_NM", GXutil.rtrim( AV12cTAM05_CRT_PROG_NM));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM04_KNGN_PTN_KBN", GXutil.rtrim( AV13pTAM04_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM03_APP_ID", GXutil.rtrim( AV14pTAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((httpContext.isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         we0N2( ) ;
      }
   }

   public void dispatchEvents( )
   {
      evt0N2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public String getPgmname( )
   {
      return "Gx0090" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List アプリケーション権限マスタ" ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV13pTAM04_KNGN_PTN_KBN)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTAM03_APP_ID)) ;
      return formatLink("gx0090") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void wb0N0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         wb_table1_2_0N2( true) ;
      }
      else
      {
         wb_table1_2_0N2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0N2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "Selection List アプリケーション権限マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0N0( ) ;
   }

   public void ws0N2( )
   {
      start0N2( ) ;
      evt0N2( ) ;
   }

   public void evt0N2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               /* Check if conditions changed and reset current page numbers */
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM04_KNGN_PTN_KBN"), AV6cTAM04_KNGN_PTN_KBN) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM03_APP_ID"), AV7cTAM03_APP_ID) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_KNGN_FLG"), AV8cTAM05_KNGN_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_DEL_FLG"), AV9cTAM05_DEL_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( !( localUtil.ctot( httpContext.cgiGet( "GXH_vCTAM05_CRT_DATETIME")).equals( AV10cTAM05_CRT_DATETIME ) ) )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_USER_ID"), AV11cTAM05_CRT_USER_ID) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_PROG_NM"), AV12cTAM05_CRT_PROG_NM) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_51_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
                           edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
                           edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
                           edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
                           edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
                           edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
                           edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
                           edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
                           edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
                           edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
                           AV5LinkSelection = httpContext.cgiGet( "GXimg"+edtavLinkselection_Internalname) ;
                           A17TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
                           A88TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
                           A101TAM05_KNGN_FLG = httpContext.cgiGet( edtTAM05_KNGN_FLG_Internalname) ;
                           n101TAM05_KNGN_FLG = false ;
                           A102TAM05_DEL_FLG = httpContext.cgiGet( edtTAM05_DEL_FLG_Internalname) ;
                           n102TAM05_DEL_FLG = false ;
                           A103TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname)) ;
                           n103TAM05_CRT_DATETIME = false ;
                           A104TAM05_CRT_USER_ID = httpContext.cgiGet( edtTAM05_CRT_USER_ID_Internalname) ;
                           n104TAM05_CRT_USER_ID = false ;
                           A106TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname)) ;
                           n106TAM05_UPD_DATETIME = false ;
                           A107TAM05_UPD_USER_ID = httpContext.cgiGet( edtTAM05_UPD_USER_ID_Internalname) ;
                           n107TAM05_UPD_USER_ID = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e110N2 */
                                 e110N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e120N2 */
                                 e120N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctam04_kngn_ptn_kbn Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM04_KNGN_PTN_KBN"), AV6cTAM04_KNGN_PTN_KBN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam03_app_id Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM03_APP_ID"), AV7cTAM03_APP_ID) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_kngn_flg Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_KNGN_FLG"), AV8cTAM05_KNGN_FLG) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_del_flg Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_DEL_FLG"), AV9cTAM05_DEL_FLG) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_datetime Changed */
                                    if ( !( localUtil.ctot( httpContext.cgiGet( "GXH_vCTAM05_CRT_DATETIME")).equals( AV10cTAM05_CRT_DATETIME ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_user_id Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_USER_ID"), AV11cTAM05_CRT_USER_ID) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_prog_nm Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_PROG_NM"), AV12cTAM05_CRT_PROG_NM) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e130N2 */
                                       e130N2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0N2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa0N2( )
   {
      if ( nDonePA == 0 )
      {
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_51_idx ,
                                 String sGXsfl_51_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
      while ( nGXsfl_51_idx <= nRC_Grid1 )
      {
         sendrow_512( ) ;
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
         edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
         edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
         edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
         edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
         edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
         edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int Grid1_PageSize51 ,
                                  String AV6cTAM04_KNGN_PTN_KBN ,
                                  String AV7cTAM03_APP_ID ,
                                  String AV8cTAM05_KNGN_FLG ,
                                  String AV9cTAM05_DEL_FLG ,
                                  java.util.Date AV10cTAM05_CRT_DATETIME ,
                                  String AV11cTAM05_CRT_USER_ID ,
                                  String AV12cTAM05_CRT_PROG_NM )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.disableOutput();
      subGrid1_Rows = (short)(Grid1_PageSize51) ;
      rf0N2( ) ;
      httpContext.enableOutput();
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0N2( ) ;
      /* End function Refresh */
   }

   public void rf0N2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(51) ;
      nGXsfl_51_idx = (short)(1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
         edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
         edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
         edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
         edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
         edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
         edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
         lV6cTAM04_KNGN_PTN_KBN = GXutil.padr( GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), 2, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
         lV7cTAM03_APP_ID = GXutil.padr( GXutil.rtrim( AV7cTAM03_APP_ID), 7, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
         lV8cTAM05_KNGN_FLG = GXutil.padr( GXutil.rtrim( AV8cTAM05_KNGN_FLG), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
         lV9cTAM05_DEL_FLG = GXutil.padr( GXutil.rtrim( AV9cTAM05_DEL_FLG), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
         lV11cTAM05_CRT_USER_ID = GXutil.padr( GXutil.rtrim( AV11cTAM05_CRT_USER_ID), 128, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
         lV12cTAM05_CRT_PROG_NM = GXutil.padr( GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), 40, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
         /* Using cursor H000N2 */
         pr_default.execute(0, new Object[] {lV6cTAM04_KNGN_PTN_KBN, lV7cTAM03_APP_ID, lV8cTAM05_KNGN_FLG, lV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, lV11cTAM05_CRT_USER_ID, lV12cTAM05_CRT_PROG_NM});
         nGXsfl_51_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A105TAM05_CRT_PROG_NM = H000N2_A105TAM05_CRT_PROG_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A105TAM05_CRT_PROG_NM", A105TAM05_CRT_PROG_NM);
            n105TAM05_CRT_PROG_NM = H000N2_n105TAM05_CRT_PROG_NM[0] ;
            A107TAM05_UPD_USER_ID = H000N2_A107TAM05_UPD_USER_ID[0] ;
            n107TAM05_UPD_USER_ID = H000N2_n107TAM05_UPD_USER_ID[0] ;
            A106TAM05_UPD_DATETIME = H000N2_A106TAM05_UPD_DATETIME[0] ;
            n106TAM05_UPD_DATETIME = H000N2_n106TAM05_UPD_DATETIME[0] ;
            A104TAM05_CRT_USER_ID = H000N2_A104TAM05_CRT_USER_ID[0] ;
            n104TAM05_CRT_USER_ID = H000N2_n104TAM05_CRT_USER_ID[0] ;
            A103TAM05_CRT_DATETIME = H000N2_A103TAM05_CRT_DATETIME[0] ;
            n103TAM05_CRT_DATETIME = H000N2_n103TAM05_CRT_DATETIME[0] ;
            A102TAM05_DEL_FLG = H000N2_A102TAM05_DEL_FLG[0] ;
            n102TAM05_DEL_FLG = H000N2_n102TAM05_DEL_FLG[0] ;
            A101TAM05_KNGN_FLG = H000N2_A101TAM05_KNGN_FLG[0] ;
            n101TAM05_KNGN_FLG = H000N2_n101TAM05_KNGN_FLG[0] ;
            A88TAM03_APP_ID = H000N2_A88TAM03_APP_ID[0] ;
            A17TAM04_AUTH_CD = H000N2_A17TAM04_AUTH_CD[0] ;
            /* Execute user event: e120N2 */
            e120N2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(51) ;
         wb0N0( ) ;
      }
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      lV6cTAM04_KNGN_PTN_KBN = GXutil.padr( GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
      lV7cTAM03_APP_ID = GXutil.padr( GXutil.rtrim( AV7cTAM03_APP_ID), 7, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
      lV8cTAM05_KNGN_FLG = GXutil.padr( GXutil.rtrim( AV8cTAM05_KNGN_FLG), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
      lV9cTAM05_DEL_FLG = GXutil.padr( GXutil.rtrim( AV9cTAM05_DEL_FLG), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
      lV11cTAM05_CRT_USER_ID = GXutil.padr( GXutil.rtrim( AV11cTAM05_CRT_USER_ID), 128, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
      lV12cTAM05_CRT_PROG_NM = GXutil.padr( GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), 40, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
      /* Using cursor H000N3 */
      pr_default.execute(1, new Object[] {lV6cTAM04_KNGN_PTN_KBN, lV7cTAM03_APP_ID, lV8cTAM05_KNGN_FLG, lV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, lV11cTAM05_CRT_USER_ID, lV12cTAM05_CRT_PROG_NM});
      GRID1_nRecordCount = H000N3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return GRID1_nRecordCount ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( 10 > 0 )
      {
         if ( 1 > 0 )
         {
            return 10*1 ;
         }
         else
         {
            return 10 ;
         }
      }
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (int)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup0N0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e110N2 */
      e110N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cTAM04_KNGN_PTN_KBN = httpContext.cgiGet( edtavCtam04_kngn_ptn_kbn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
         AV7cTAM03_APP_ID = httpContext.cgiGet( edtavCtam03_app_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
         AV8cTAM05_KNGN_FLG = httpContext.cgiGet( edtavCtam05_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
         AV9cTAM05_DEL_FLG = httpContext.cgiGet( edtavCtam05_del_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtam05_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "vCTAM05_CRT_DATETIME");
            GX_FocusControl = edtavCtam05_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cTAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         }
         else
         {
            AV10cTAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtavCtam05_crt_datetime_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         }
         AV11cTAM05_CRT_USER_ID = httpContext.cgiGet( edtavCtam05_crt_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
         AV12cTAM05_CRT_PROG_NM = httpContext.cgiGet( edtavCtam05_crt_prog_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV13pTAM04_KNGN_PTN_KBN = httpContext.cgiGet( "vPTAM04_KNGN_PTN_KBN") ;
         AV14pTAM03_APP_ID = httpContext.cgiGet( "vPTAM03_APP_ID") ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e110N2 */
      e110N2 ();
      if (returnInSub) return;
   }

   public void e110N2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "アプリケーション権限マスタ", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
   }

   private void e120N2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", "Style2") ;
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_512( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e130N2 */
      e130N2 ();
      if (returnInSub) return;
   }

   public void e130N2( )
   {
      /* Enter Routine */
      AV13pTAM04_KNGN_PTN_KBN = A17TAM04_AUTH_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
      AV14pTAM03_APP_ID = A88TAM03_APP_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
      httpContext.setWebReturnParms(new Object[] {AV13pTAM04_KNGN_PTN_KBN,AV14pTAM03_APP_ID});
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void wb_table1_2_0N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         ClassString = "FieldSet" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroup1_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"Filters"+"</legend>") ;
         wb_table2_9_0N2( true) ;
      }
      else
      {
         wb_table2_9_0N2( false) ;
      }
      return  ;
   }

   public void wb_table2_9_0N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         ClassString = "FieldSet" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroup2_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"選択リスト"+"</legend>") ;
         wb_table3_48_0N2( true) ;
      }
      else
      {
         wb_table3_48_0N2( false) ;
      }
      return  ;
   }

   public void wb_table3_48_0N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0N2e( true) ;
      }
      else
      {
         wb_table1_2_0N2e( false) ;
      }
   }

   public void wb_table3_48_0N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"51\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "Grid", 0, "", "", 1, 0, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "権限パターン区分") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "アプリケーションID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "権限フラグ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "削除フラグ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "作成日時") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "作成ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "更新日時") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "更新ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( httpContext.isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "Grid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A17TAM04_AUTH_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A88TAM03_APP_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A101TAM05_KNGN_FLG));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAM05_KNGN_FLG_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A102TAM05_DEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A104TAM05_CRT_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A107TAM05_UPD_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "false");
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 51 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_51_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table4_63_0N2( true) ;
      }
      else
      {
         wb_table4_63_0N2( false) ;
      }
      return  ;
   }

   public void wb_table4_63_0N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_48_0N2e( true) ;
      }
      else
      {
         wb_table3_48_0N2e( false) ;
      }
   }

   public void wb_table4_63_0N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 3, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_63_0N2e( true) ;
      }
      else
      {
         wb_table4_63_0N2e( false) ;
      }
   }

   public void wb_table2_9_0N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_kngn_ptn_kbn_Internalname, "権限パターン区分", "", "", lblTextblocktam04_kngn_ptn_kbn_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam04_kngn_ptn_kbn_Internalname, GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), GXutil.rtrim( localUtil.format( AV6cTAM04_KNGN_PTN_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(14);\"", "", "", "", "", edtavCtam04_kngn_ptn_kbn_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam03_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam03_app_id_Internalname, GXutil.rtrim( AV7cTAM03_APP_ID), GXutil.rtrim( localUtil.format( AV7cTAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(19);\"", "", "", "", "", edtavCtam03_app_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_kngn_flg_Internalname, "権限フラグ", "", "", lblTextblocktam05_kngn_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_kngn_flg_Internalname, GXutil.rtrim( AV8cTAM05_KNGN_FLG), GXutil.rtrim( localUtil.format( AV8cTAM05_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(24);\"", "", "", "", "", edtavCtam05_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam05_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_del_flg_Internalname, GXutil.rtrim( AV9cTAM05_DEL_FLG), GXutil.rtrim( localUtil.format( AV9cTAM05_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "", "", "", "", edtavCtam05_del_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam05_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtam05_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_datetime_Internalname, localUtil.format(AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(34);\"", "", "", "", "", edtavCtam05_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_Gx0090.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtam05_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_Gx0090.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam05_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_user_id_Internalname, GXutil.rtrim( AV11cTAM05_CRT_USER_ID), GXutil.rtrim( localUtil.format( AV11cTAM05_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "", "", "", "", edtavCtam05_crt_user_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam05_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_prog_nm_Internalname, GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), GXutil.rtrim( localUtil.format( AV12cTAM05_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "", "", "", "", edtavCtam05_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0090.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_0N2e( true) ;
      }
      else
      {
         wb_table2_9_0N2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV13pTAM04_KNGN_PTN_KBN = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
      AV14pTAM03_APP_ID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0N2( ) ;
      ws0N2( ) ;
      we0N2( ) ;
      if ( httpContext.isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14574666");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("gx0090.js", "?14574666");
      /* End function include_jscripts */
   }

   public void sendrow_512( )
   {
      wb0N0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_51_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)(nGXsfl_51_idx) % (2)) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+subGrid1_Linesclass+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A17TAM04_AUTH_CD))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A88TAM03_APP_ID))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("bitmap", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,AV5LinkSelection,edtavLinkselection_Link,"","","Style2",new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","''",""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_CD_Internalname,GXutil.rtrim( A17TAM04_AUTH_CD),"","","","","","",edtTAM04_AUTH_CD_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM03_APP_ID_Internalname,GXutil.rtrim( A88TAM03_APP_ID),"","","","","","",edtTAM03_APP_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         edtTAM05_KNGN_FLG_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A17TAM04_AUTH_CD))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A88TAM03_APP_ID))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_KNGN_FLG_Internalname,GXutil.rtrim( A101TAM05_KNGN_FLG),"","","",edtTAM05_KNGN_FLG_Link,"","選択",edtTAM05_KNGN_FLG_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_DEL_FLG_Internalname,GXutil.rtrim( A102TAM05_DEL_FLG),"","","","","","",edtTAM05_DEL_FLG_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_CRT_DATETIME_Internalname,localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),"","","","","",edtTAM05_CRT_DATETIME_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_CRT_USER_ID_Internalname,GXutil.rtrim( A104TAM05_CRT_USER_ID),"","","","","","",edtTAM05_CRT_USER_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_DATETIME_Internalname,localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),"","","","","",edtTAM05_UPD_DATETIME_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_USER_ID_Internalname,GXutil.rtrim( A107TAM05_UPD_USER_ID),"","","","","","",edtTAM05_UPD_USER_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(1),new Boolean(true),"left"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
         edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
         edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
         edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
         edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
         edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
         edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
         edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
      }
      /* End function sendrow_512 */
   }

   public void init_default_properties( )
   {
      lblTextblocktam04_kngn_ptn_kbn_Internalname = "TEXTBLOCKTAM04_KNGN_PTN_KBN" ;
      edtavCtam04_kngn_ptn_kbn_Internalname = "vCTAM04_KNGN_PTN_KBN" ;
      lblTextblocktam03_app_id_Internalname = "TEXTBLOCKTAM03_APP_ID" ;
      edtavCtam03_app_id_Internalname = "vCTAM03_APP_ID" ;
      lblTextblocktam05_kngn_flg_Internalname = "TEXTBLOCKTAM05_KNGN_FLG" ;
      edtavCtam05_kngn_flg_Internalname = "vCTAM05_KNGN_FLG" ;
      lblTextblocktam05_del_flg_Internalname = "TEXTBLOCKTAM05_DEL_FLG" ;
      edtavCtam05_del_flg_Internalname = "vCTAM05_DEL_FLG" ;
      lblTextblocktam05_crt_datetime_Internalname = "TEXTBLOCKTAM05_CRT_DATETIME" ;
      edtavCtam05_crt_datetime_Internalname = "vCTAM05_CRT_DATETIME" ;
      lblTextblocktam05_crt_user_id_Internalname = "TEXTBLOCKTAM05_CRT_USER_ID" ;
      edtavCtam05_crt_user_id_Internalname = "vCTAM05_CRT_USER_ID" ;
      lblTextblocktam05_crt_prog_nm_Internalname = "TEXTBLOCKTAM05_CRT_PROG_NM" ;
      edtavCtam05_crt_prog_nm_Internalname = "vCTAM05_CRT_PROG_NM" ;
      tblTable2_Internalname = "TABLE2" ;
      grpGroup1_Internalname = "GROUP1" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      grpGroup2_Internalname = "GROUP2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTAM05_UPD_USER_ID_Jsonclick = "" ;
      edtTAM05_UPD_DATETIME_Jsonclick = "" ;
      edtTAM05_CRT_USER_ID_Jsonclick = "" ;
      edtTAM05_CRT_DATETIME_Jsonclick = "" ;
      edtTAM05_DEL_FLG_Jsonclick = "" ;
      edtTAM05_KNGN_FLG_Jsonclick = "" ;
      edtTAM03_APP_ID_Jsonclick = "" ;
      edtTAM04_AUTH_CD_Jsonclick = "" ;
      edtavCtam05_crt_prog_nm_Jsonclick = "" ;
      edtavCtam05_crt_user_id_Jsonclick = "" ;
      edtavCtam05_crt_datetime_Jsonclick = "" ;
      edtavCtam05_del_flg_Jsonclick = "" ;
      edtavCtam05_kngn_flg_Jsonclick = "" ;
      edtavCtam03_app_id_Jsonclick = "" ;
      edtavCtam04_kngn_ptn_kbn_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtTAM05_KNGN_FLG_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List アプリケーション権限マスタ" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV13pTAM04_KNGN_PTN_KBN = "" ;
      wcpOAV14pTAM03_APP_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cTAM04_KNGN_PTN_KBN = "" ;
      AV7cTAM03_APP_ID = "" ;
      AV8cTAM05_KNGN_FLG = "" ;
      AV9cTAM05_DEL_FLG = "" ;
      AV10cTAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV11cTAM05_CRT_USER_ID = "" ;
      AV12cTAM05_CRT_PROG_NM = "" ;
      AV13pTAM04_KNGN_PTN_KBN = "" ;
      AV14pTAM03_APP_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavLinkselection_Internalname = "" ;
      edtTAM04_AUTH_CD_Internalname = "" ;
      edtTAM03_APP_ID_Internalname = "" ;
      edtTAM05_KNGN_FLG_Internalname = "" ;
      edtTAM05_DEL_FLG_Internalname = "" ;
      edtTAM05_CRT_DATETIME_Internalname = "" ;
      edtTAM05_CRT_USER_ID_Internalname = "" ;
      edtTAM05_UPD_DATETIME_Internalname = "" ;
      edtTAM05_UPD_USER_ID_Internalname = "" ;
      AV5LinkSelection = "" ;
      A17TAM04_AUTH_CD = "" ;
      A88TAM03_APP_ID = "" ;
      A101TAM05_KNGN_FLG = "" ;
      A102TAM05_DEL_FLG = "" ;
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A104TAM05_CRT_USER_ID = "" ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A107TAM05_UPD_USER_ID = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV6cTAM04_KNGN_PTN_KBN = "" ;
      lV7cTAM03_APP_ID = "" ;
      lV8cTAM05_KNGN_FLG = "" ;
      lV9cTAM05_DEL_FLG = "" ;
      lV11cTAM05_CRT_USER_ID = "" ;
      lV12cTAM05_CRT_PROG_NM = "" ;
      H000N2_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      H000N2_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      H000N2_A107TAM05_UPD_USER_ID = new String[] {""} ;
      H000N2_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      H000N2_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H000N2_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      H000N2_A104TAM05_CRT_USER_ID = new String[] {""} ;
      H000N2_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      H000N2_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H000N2_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      H000N2_A102TAM05_DEL_FLG = new String[] {""} ;
      H000N2_n102TAM05_DEL_FLG = new boolean[] {false} ;
      H000N2_A101TAM05_KNGN_FLG = new String[] {""} ;
      H000N2_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      H000N2_A88TAM03_APP_ID = new String[] {""} ;
      H000N2_A17TAM04_AUTH_CD = new String[] {""} ;
      A105TAM05_CRT_PROG_NM = "" ;
      H000N3_AGRID1_nRecordCount = new int[1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      subGrid1_Linesclass = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
      GXt_char4 = "" ;
      GXt_char5 = "" ;
      GXt_char6 = "" ;
      GXt_char7 = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktam04_kngn_ptn_kbn_Jsonclick = "" ;
      lblTextblocktam03_app_id_Jsonclick = "" ;
      lblTextblocktam05_kngn_flg_Jsonclick = "" ;
      lblTextblocktam05_del_flg_Jsonclick = "" ;
      lblTextblocktam05_crt_datetime_Jsonclick = "" ;
      GXt_char8 = "" ;
      lblTextblocktam05_crt_user_id_Jsonclick = "" ;
      lblTextblocktam05_crt_prog_nm_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXt_char9 = "" ;
      ROClassString = "" ;
      GXt_char10 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new gx0090__default(),
         new Object[] {
             new Object[] {
            H000N2_A105TAM05_CRT_PROG_NM, H000N2_n105TAM05_CRT_PROG_NM, H000N2_A107TAM05_UPD_USER_ID, H000N2_n107TAM05_UPD_USER_ID, H000N2_A106TAM05_UPD_DATETIME, H000N2_n106TAM05_UPD_DATETIME, H000N2_A104TAM05_CRT_USER_ID, H000N2_n104TAM05_CRT_USER_ID, H000N2_A103TAM05_CRT_DATETIME, H000N2_n103TAM05_CRT_DATETIME,
            H000N2_A102TAM05_DEL_FLG, H000N2_n102TAM05_DEL_FLG, H000N2_A101TAM05_KNGN_FLG, H000N2_n101TAM05_KNGN_FLG, H000N2_A88TAM03_APP_ID, H000N2_A17TAM04_AUTH_CD
            }
            , new Object[] {
            H000N3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_51_idx=1 ;
   private short Gx_err ;
   private short wbEnd ;
   private short wbStart ;
   private short subGrid1_Rows ;
   private int Grid1_PageSize51 ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrid1_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_51_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTAM04_AUTH_CD_Internalname ;
   private String edtTAM03_APP_ID_Internalname ;
   private String edtTAM05_KNGN_FLG_Internalname ;
   private String edtTAM05_DEL_FLG_Internalname ;
   private String edtTAM05_CRT_DATETIME_Internalname ;
   private String edtTAM05_CRT_USER_ID_Internalname ;
   private String edtTAM05_UPD_DATETIME_Internalname ;
   private String edtTAM05_UPD_USER_ID_Internalname ;
   private String scmdbuf ;
   private String edtavCtam04_kngn_ptn_kbn_Internalname ;
   private String edtavCtam03_app_id_Internalname ;
   private String edtavCtam05_kngn_flg_Internalname ;
   private String edtavCtam05_del_flg_Internalname ;
   private String edtavCtam05_crt_datetime_Internalname ;
   private String edtavCtam05_crt_user_id_Internalname ;
   private String edtavCtam05_crt_prog_nm_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String grpGroup1_Internalname ;
   private String grpGroup2_Internalname ;
   private String tblTable3_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXt_char3 ;
   private String GXt_char4 ;
   private String GXt_char5 ;
   private String GXt_char6 ;
   private String GXt_char7 ;
   private String edtavLinkselection_Link ;
   private String edtTAM05_KNGN_FLG_Link ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktam04_kngn_ptn_kbn_Internalname ;
   private String lblTextblocktam04_kngn_ptn_kbn_Jsonclick ;
   private String edtavCtam04_kngn_ptn_kbn_Jsonclick ;
   private String lblTextblocktam03_app_id_Internalname ;
   private String lblTextblocktam03_app_id_Jsonclick ;
   private String edtavCtam03_app_id_Jsonclick ;
   private String lblTextblocktam05_kngn_flg_Internalname ;
   private String lblTextblocktam05_kngn_flg_Jsonclick ;
   private String edtavCtam05_kngn_flg_Jsonclick ;
   private String lblTextblocktam05_del_flg_Internalname ;
   private String lblTextblocktam05_del_flg_Jsonclick ;
   private String edtavCtam05_del_flg_Jsonclick ;
   private String lblTextblocktam05_crt_datetime_Internalname ;
   private String lblTextblocktam05_crt_datetime_Jsonclick ;
   private String edtavCtam05_crt_datetime_Jsonclick ;
   private String GXt_char8 ;
   private String lblTextblocktam05_crt_user_id_Internalname ;
   private String lblTextblocktam05_crt_user_id_Jsonclick ;
   private String edtavCtam05_crt_user_id_Jsonclick ;
   private String lblTextblocktam05_crt_prog_nm_Internalname ;
   private String lblTextblocktam05_crt_prog_nm_Jsonclick ;
   private String edtavCtam05_crt_prog_nm_Jsonclick ;
   private String GXt_char9 ;
   private String ROClassString ;
   private String edtTAM04_AUTH_CD_Jsonclick ;
   private String edtTAM03_APP_ID_Jsonclick ;
   private String edtTAM05_KNGN_FLG_Jsonclick ;
   private String edtTAM05_DEL_FLG_Jsonclick ;
   private String edtTAM05_CRT_DATETIME_Jsonclick ;
   private String edtTAM05_CRT_USER_ID_Jsonclick ;
   private String edtTAM05_UPD_DATETIME_Jsonclick ;
   private String edtTAM05_UPD_USER_ID_Jsonclick ;
   private String GXt_char10 ;
   private java.util.Date AV10cTAM05_CRT_DATETIME ;
   private java.util.Date A103TAM05_CRT_DATETIME ;
   private java.util.Date A106TAM05_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n101TAM05_KNGN_FLG ;
   private boolean n102TAM05_DEL_FLG ;
   private boolean n103TAM05_CRT_DATETIME ;
   private boolean n104TAM05_CRT_USER_ID ;
   private boolean n106TAM05_UPD_DATETIME ;
   private boolean n107TAM05_UPD_USER_ID ;
   private boolean n105TAM05_CRT_PROG_NM ;
   private boolean returnInSub ;
   private String wcpOAV13pTAM04_KNGN_PTN_KBN ;
   private String wcpOAV14pTAM03_APP_ID ;
   private String AV6cTAM04_KNGN_PTN_KBN ;
   private String AV7cTAM03_APP_ID ;
   private String AV8cTAM05_KNGN_FLG ;
   private String AV9cTAM05_DEL_FLG ;
   private String AV11cTAM05_CRT_USER_ID ;
   private String AV12cTAM05_CRT_PROG_NM ;
   private String AV13pTAM04_KNGN_PTN_KBN ;
   private String AV14pTAM03_APP_ID ;
   private String A17TAM04_AUTH_CD ;
   private String A88TAM03_APP_ID ;
   private String A101TAM05_KNGN_FLG ;
   private String A102TAM05_DEL_FLG ;
   private String A104TAM05_CRT_USER_ID ;
   private String A107TAM05_UPD_USER_ID ;
   private String lV6cTAM04_KNGN_PTN_KBN ;
   private String lV7cTAM03_APP_ID ;
   private String lV8cTAM05_KNGN_FLG ;
   private String lV9cTAM05_DEL_FLG ;
   private String lV11cTAM05_CRT_USER_ID ;
   private String lV12cTAM05_CRT_PROG_NM ;
   private String A105TAM05_CRT_PROG_NM ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXMasterPage MasterPageObj ;
   private IDataStoreProvider pr_default ;
   private String[] H000N2_A105TAM05_CRT_PROG_NM ;
   private boolean[] H000N2_n105TAM05_CRT_PROG_NM ;
   private String[] H000N2_A107TAM05_UPD_USER_ID ;
   private boolean[] H000N2_n107TAM05_UPD_USER_ID ;
   private java.util.Date[] H000N2_A106TAM05_UPD_DATETIME ;
   private boolean[] H000N2_n106TAM05_UPD_DATETIME ;
   private String[] H000N2_A104TAM05_CRT_USER_ID ;
   private boolean[] H000N2_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] H000N2_A103TAM05_CRT_DATETIME ;
   private boolean[] H000N2_n103TAM05_CRT_DATETIME ;
   private String[] H000N2_A102TAM05_DEL_FLG ;
   private boolean[] H000N2_n102TAM05_DEL_FLG ;
   private String[] H000N2_A101TAM05_KNGN_FLG ;
   private boolean[] H000N2_n101TAM05_KNGN_FLG ;
   private String[] H000N2_A88TAM03_APP_ID ;
   private String[] H000N2_A17TAM04_AUTH_CD ;
   private int[] H000N3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0090__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000N2", "SELECT `TAM05_CRT_PROG_NM`, `TAM05_UPD_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_CRT_DATETIME`, `TAM05_DEL_FLG`, `TAM05_KNGN_FLG`, `TAM03_APP_ID`, `TAM04_AUTH_CD` FROM `TAM05_APPLI_KNGN` WHERE (`TAM04_AUTH_CD` like ?) AND (`TAM03_APP_ID` like ?) AND (`TAM05_KNGN_FLG` like ?) AND (`TAM05_DEL_FLG` like ?) AND (`TAM05_CRT_DATETIME` >= ?) AND (`TAM05_CRT_USER_ID` like ?) AND (`TAM05_CRT_PROG_NM` like ?) ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000N3", "SELECT COUNT(*) FROM `TAM05_APPLI_KNGN` WHERE (`TAM04_AUTH_CD` like ?) AND (`TAM03_APP_ID` like ?) AND (`TAM05_KNGN_FLG` like ?) AND (`TAM05_DEL_FLG` like ?) AND (`TAM05_CRT_DATETIME` >= ?) AND (`TAM05_CRT_USER_ID` like ?) AND (`TAM05_CRT_PROG_NM` like ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 1);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 128);
               stmt.setVarchar(7, (String)parms[6], 40);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 1);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 128);
               stmt.setVarchar(7, (String)parms[6], 40);
               break;
      }
   }

}

