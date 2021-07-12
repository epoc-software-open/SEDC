/*
               File: a104_wp01_header_impl
        Description: ヘッダー
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:10.70
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a104_wp01_header_impl extends GXWebComponent
{
   public a104_wp01_header_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a104_wp01_header_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a104_wp01_header_impl.class ));
   }

   public a104_wp01_header_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Style2");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetNextPar( ) ;
            gxfirstwebparm_bkp = gxfirstwebparm ;
            gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9P_A_LOGIN_SDT);
               AV11P_TAM02_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
               AV10P_PGNM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10P_PGNM", AV10P_PGNM);
               AV12P_TAW01_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV9P_A_LOGIN_SDT,AV11P_TAM02_APP_ID,AV10P_PGNM,AV12P_TAW01_DISP_DATETIME});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa0A2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "ヘッダー") ;
         httpContext.writeTextNL( "</title>") ;
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513161073");
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a104_wp01_header"+GXutil.URLEncode(GXutil.rtrim(AV11P_TAM02_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV10P_PGNM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12P_TAW01_DISP_DATETIME)) ;
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a104_wp01_header") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
         GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      }
      else
      {
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
      }
   }

   public void renderHtmlCloseForm0A2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11P_TAM02_APP_ID", GXutil.rtrim( wcpOAV11P_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10P_PGNM", GXutil.rtrim( wcpOAV10P_PGNM));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12P_TAW01_DISP_DATETIME", GXutil.rtrim( wcpOAV12P_TAW01_DISP_DATETIME));
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("a104_wp01_header.js", "?202071513161075");
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", "notset");
      define_styles( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         httpContext.writeTextNL( "</form>") ;
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
      }
      else
      {
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
         }
      }
   }

   public String getPgmname( )
   {
      return "A104_WP01_HEADER" ;
   }

   public String getPgmdesc( )
   {
      return "ヘッダー" ;
   }

   public void wb0A0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "a104_wp01_header");
         }
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         wb_table1_2_0A2( true) ;
      }
      else
      {
         wb_table1_2_0A2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0A2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) != 0 )
      {
         GXKey = context.getSiteKey( ) ;
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
            Form.getMeta().addItem("description", "ヘッダー", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup0A0( ) ;
         }
      }
   }

   public void ws0A2( )
   {
      start0A2( ) ;
      evt0A2( ) ;
   }

   public void evt0A2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e110A2 */
                                 e110A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e120A2 */
                                 e120A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'BTN_END'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e130A2 */
                                 e130A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e140A2 */
                                 e140A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0A0( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavH_init_flg_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0A2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0A2( ) ;
         }
      }
   }

   public void pa0A2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         GXKey = context.getSiteKey( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
               if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a104_wp01_header")), "a104_wp01_header") == 0 ) )
               {
                  httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a104_wp01_header"))) ;
               }
               else
               {
                  GxWebError = (byte)(1) ;
                  httpContext.sendError( 403 );
                  GXutil.writeLog("send_http_error_code 403");
               }
            }
         }
         if ( ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            if ( GXutil.len( sPrefix) == 0 )
            {
               if ( nGotPars == 0 )
               {
                  entryPointCalled = false ;
                  gxfirstwebparm = httpContext.GetNextPar( ) ;
               }
            }
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf0A2( ) ;
      /* End function Refresh */
   }

   public void rf0A2( )
   {
      /* Execute user event: e120A2 */
      e120A2 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e140A2 */
         e140A2 ();
         wb0A0( ) ;
      }
   }

   public void strup0A0( )
   {
      /* Before Start, stand alone formulas. */
      AV18Pgmname = "A104_WP01_HEADER" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e110A2 */
      e110A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV8H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8H_INIT_FLG", AV8H_INIT_FLG);
         /* Read saved values. */
         wcpOAV11P_TAM02_APP_ID = httpContext.cgiGet( sPrefix+"wcpOAV11P_TAM02_APP_ID") ;
         wcpOAV10P_PGNM = httpContext.cgiGet( sPrefix+"wcpOAV10P_PGNM") ;
         wcpOAV12P_TAW01_DISP_DATETIME = httpContext.cgiGet( sPrefix+"wcpOAV12P_TAW01_DISP_DATETIME") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e110A2 */
      e110A2 ();
      if (returnInSub) return;
   }

   public void e110A2( )
   {
      /* Start Routine */
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV8H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8H_INIT_FLG", AV8H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
   }

   public void e120A2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV8H_INIT_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV8H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8H_INIT_FLG", AV8H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e130A2( )
   {
      /* 'BTN_END' Routine */
      if ( ! (GXutil.strcmp("", AV12P_TAW01_DISP_DATETIME)==0) )
      {
         new z101_pc02_work_del(remoteHandle, context).execute( AV11P_TAM02_APP_ID, AV12P_TAW01_DISP_DATETIME, GXutil.now( )) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
      }
      if ( ! (GXutil.strcmp("", AV12P_TAW01_DISP_DATETIME)==0) || ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A103") == 0 ) )
      {
         new b805_pc01_work_del(remoteHandle, context).execute( AV11P_TAM02_APP_ID, AV12P_TAW01_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
      }
      if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A103") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", "ログアウト") ;
         AV15W_SESSION.clear();
         httpContext.wjLoc = formatLink("a101_wp01_login")  ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A101") != 0 )
         {
            new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", "終了:"+AV11P_TAM02_APP_ID) ;
            AV14W_JS = "var closeWin = parent?parent:window;" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14W_JS", AV14W_JS);
            AV14W_JS = AV14W_JS + "(closeWin.open('', '_self').opener = closeWin).close();" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14W_JS", AV14W_JS);
         }
      }
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      lblTxt_btn_end_Caption = "終了（F12）" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_btn_end_Internalname, "Caption", lblTxt_btn_end_Caption);
      lblTxt_title_Caption = "「"+AV10P_PGNM+"」" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_title_Internalname, "Caption", lblTxt_title_Caption);
      if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A101") == 0 )
      {
         lblTxt_btn_end_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_btn_end_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_end_Visible, 5, 0)));
      }
      else if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A103") == 0 )
      {
         lblTxt_btn_end_Caption = "ログアウト（F12）" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_btn_end_Internalname, "Caption", lblTxt_btn_end_Caption);
      }
      else if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A105") == 0 )
      {
         lblTxt_btn_end_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_btn_end_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_end_Visible, 5, 0)));
      }
      else
      {
      }
      lblTxt_user_Caption = AV9P_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm() ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_user_Internalname, "Caption", lblTxt_user_Caption);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV14W_JS = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14W_JS", AV14W_JS);
   }

   public void S142( )
   {
      /* 'SUB_JS' Routine */
      lblTxt_js_event_Caption = "<script language=javascript>" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"var confirmFlg = false;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (window.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  window.addEventListener('load', function(){inithead();}, false);" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	window.attachEvent('onload',function(){inithead();});" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function inithead() {" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"st_weclock();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function st_weclock() {" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var today    = new Date();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Year   = today.getFullYear();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Month  = today.getMonth()+1;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Day    = today.getDate();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Week   = today.getDay();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Hour   = today.getHours();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Minute = today.getMinutes();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_Second = today.getSeconds();" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var w_We     = new Array( \"日\",\"月\",\"火\",\"水\",\"木\",\"金\",\"土\" );" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (w_Month  < 10) w_Month  = \"0\" + w_Month;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (w_Day    < 10) w_Day    = \"0\" + w_Day;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (w_Hour   < 10) w_Hour   = \"0\" + w_Hour;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (w_Minute < 10) w_Minute = \"0\" + w_Minute;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (w_Second < 10) w_Second = \"0\" + w_Second;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var Time = w_Year + \"/\" + w_Month + \"/\" + w_Day + \"(\" + w_We[w_Week] + \") \" + w_Hour + \":\" + w_Minute + \":\" + w_Second;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	document.getElementById(\""+GXutil.trim( divTimer_Internalname)+"\").innerHTML = Time;" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	setTimeout(\"st_weclock()\", 1000);" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function prochead() {" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV14W_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV14W_JS ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('prochead()', 10);" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   protected void nextLoad( )
   {
   }

   protected void e140A2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_0A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableHead", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0A2( true) ;
      }
      else
      {
         wb_table2_5_0A2( false) ;
      }
      return  ;
   }

   public void wb_table2_5_0A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_32_0A2( true) ;
      }
      else
      {
         wb_table3_32_0A2( false) ;
      }
      return  ;
   }

   public void wb_table3_32_0A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0A2e( true) ;
      }
      else
      {
         wb_table1_2_0A2e( false) ;
      }
   }

   public void wb_table3_32_0A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_hidden_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_hidden_Internalname, tblTbl_hidden_Internalname, "", "TableHidden", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A104_WP01_HEADER.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV8H_INIT_FLG), GXutil.rtrim( localUtil.format( AV8H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_0A2e( true) ;
      }
      else
      {
         wb_table3_32_0A2e( false) ;
      }
   }

   public void wb_table2_5_0A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"left\"  style=\"height:55px;width:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"width:70px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImg_logo_Internalname, context.getHttpContext().getImagePath( "115b6e55-03a7-4179-a331-9ec7e976acdf", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 62, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title_Internalname, lblTxt_title_Caption, "", "", lblTxt_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlockTitle1", 0, "", 1, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"vertical-align:top\">") ;
         wb_table4_14_0A2( true) ;
      }
      else
      {
         wb_table4_14_0A2( false) ;
      }
      return  ;
   }

   public void wb_table4_14_0A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:13px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_0A2e( true) ;
      }
      else
      {
         wb_table2_5_0A2e( false) ;
      }
   }

   public void wb_table4_14_0A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_user_Internalname, lblTxt_user_Caption, "", "", lblTxt_user_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divTimer_Internalname, 1, 150, "px", 0, "px", "SectionTimer", "");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" colspan=\"3\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" colspan=\"3\" >") ;
         wb_table5_27_0A2( true) ;
      }
      else
      {
         wb_table5_27_0A2( false) ;
      }
      return  ;
   }

   public void wb_table5_27_0A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_14_0A2e( true) ;
      }
      else
      {
         wb_table4_14_0A2e( false) ;
      }
   }

   public void wb_table5_27_0A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_end_Internalname, lblTxt_btn_end_Caption, "", "", lblTxt_btn_end_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'BTN_END\\'."+"'", "", "TextBlockBtn120", 5, "", lblTxt_btn_end_Visible, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_27_0A2e( true) ;
      }
      else
      {
         wb_table5_27_0A2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV9P_A_LOGIN_SDT = (SdtA_LOGIN_SDT)getParm(obj,0);
      AV11P_TAM02_APP_ID = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
      AV10P_PGNM = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10P_PGNM", AV10P_PGNM);
      AV12P_TAW01_DISP_DATETIME = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Style2");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0A2( ) ;
      ws0A2( ) ;
      we0A2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV9P_A_LOGIN_SDT = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV11P_TAM02_APP_ID = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV10P_PGNM = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV12P_TAW01_DISP_DATETIME = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0A2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "a104_wp01_header");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0A2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV9P_A_LOGIN_SDT = (SdtA_LOGIN_SDT)getParm(obj,2);
         AV11P_TAM02_APP_ID = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
         AV10P_PGNM = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10P_PGNM", AV10P_PGNM);
         AV12P_TAW01_DISP_DATETIME = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
      }
      wcpOAV11P_TAM02_APP_ID = httpContext.cgiGet( sPrefix+"wcpOAV11P_TAM02_APP_ID") ;
      wcpOAV10P_PGNM = httpContext.cgiGet( sPrefix+"wcpOAV10P_PGNM") ;
      wcpOAV12P_TAW01_DISP_DATETIME = httpContext.cgiGet( sPrefix+"wcpOAV12P_TAW01_DISP_DATETIME") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11P_TAM02_APP_ID, wcpOAV11P_TAM02_APP_ID) != 0 ) || ( GXutil.strcmp(AV10P_PGNM, wcpOAV10P_PGNM) != 0 ) || ( GXutil.strcmp(AV12P_TAW01_DISP_DATETIME, wcpOAV12P_TAW01_DISP_DATETIME) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV11P_TAM02_APP_ID = AV11P_TAM02_APP_ID ;
      wcpOAV10P_PGNM = AV10P_PGNM ;
      wcpOAV12P_TAW01_DISP_DATETIME = AV12P_TAW01_DISP_DATETIME ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV9P_A_LOGIN_SDT = httpContext.cgiGet( sPrefix+"AV9P_A_LOGIN_SDT_CTRL") ;
      if ( GXutil.len( sCtrlAV9P_A_LOGIN_SDT) > 0 )
      {
         AV9P_A_LOGIN_SDT.fromxml(httpContext.cgiGet( sCtrlAV9P_A_LOGIN_SDT), "");
      }
      else
      {
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"AV9P_A_LOGIN_SDT_PARM"), AV9P_A_LOGIN_SDT);
      }
      sCtrlAV11P_TAM02_APP_ID = httpContext.cgiGet( sPrefix+"AV11P_TAM02_APP_ID_CTRL") ;
      if ( GXutil.len( sCtrlAV11P_TAM02_APP_ID) > 0 )
      {
         AV11P_TAM02_APP_ID = httpContext.cgiGet( sCtrlAV11P_TAM02_APP_ID) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11P_TAM02_APP_ID", AV11P_TAM02_APP_ID);
      }
      else
      {
         AV11P_TAM02_APP_ID = httpContext.cgiGet( sPrefix+"AV11P_TAM02_APP_ID_PARM") ;
      }
      sCtrlAV10P_PGNM = httpContext.cgiGet( sPrefix+"AV10P_PGNM_CTRL") ;
      if ( GXutil.len( sCtrlAV10P_PGNM) > 0 )
      {
         AV10P_PGNM = httpContext.cgiGet( sCtrlAV10P_PGNM) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10P_PGNM", AV10P_PGNM);
      }
      else
      {
         AV10P_PGNM = httpContext.cgiGet( sPrefix+"AV10P_PGNM_PARM") ;
      }
      sCtrlAV12P_TAW01_DISP_DATETIME = httpContext.cgiGet( sPrefix+"AV12P_TAW01_DISP_DATETIME_CTRL") ;
      if ( GXutil.len( sCtrlAV12P_TAW01_DISP_DATETIME) > 0 )
      {
         AV12P_TAW01_DISP_DATETIME = httpContext.cgiGet( sCtrlAV12P_TAW01_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12P_TAW01_DISP_DATETIME", AV12P_TAW01_DISP_DATETIME);
      }
      else
      {
         AV12P_TAW01_DISP_DATETIME = httpContext.cgiGet( sPrefix+"AV12P_TAW01_DISP_DATETIME_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa0A2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws0A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"AV9P_A_LOGIN_SDT_PARM", AV9P_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"AV9P_A_LOGIN_SDT_PARM", AV9P_A_LOGIN_SDT);
      }
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9P_A_LOGIN_SDT)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9P_A_LOGIN_SDT_CTRL", GXutil.rtrim( sCtrlAV9P_A_LOGIN_SDT));
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11P_TAM02_APP_ID_PARM", GXutil.rtrim( AV11P_TAM02_APP_ID));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11P_TAM02_APP_ID)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11P_TAM02_APP_ID_CTRL", GXutil.rtrim( sCtrlAV11P_TAM02_APP_ID));
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10P_PGNM_PARM", GXutil.rtrim( AV10P_PGNM));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10P_PGNM)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10P_PGNM_CTRL", GXutil.rtrim( sCtrlAV10P_PGNM));
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12P_TAW01_DISP_DATETIME_PARM", GXutil.rtrim( AV12P_TAW01_DISP_DATETIME));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12P_TAW01_DISP_DATETIME)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12P_TAW01_DISP_DATETIME_CTRL", GXutil.rtrim( sCtrlAV12P_TAW01_DISP_DATETIME));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we0A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151316110");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("a104_wp01_header.js", "?20207151316110");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgImg_logo_Internalname = sPrefix+"IMG_LOGO" ;
      lblTxt_title_Internalname = sPrefix+"TXT_TITLE" ;
      lblTxt_user_Internalname = sPrefix+"TXT_USER" ;
      divTimer_Internalname = sPrefix+"TIMER" ;
      lblTxt_btn_end_Internalname = sPrefix+"TXT_BTN_END" ;
      tblTable4_Internalname = sPrefix+"TABLE4" ;
      tblTable3_Internalname = sPrefix+"TABLE3" ;
      tblTable2_Internalname = sPrefix+"TABLE2" ;
      lblTxt_js_event_Internalname = sPrefix+"TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = sPrefix+"vH_INIT_FLG" ;
      tblTbl_hidden_Internalname = sPrefix+"TBL_HIDDEN" ;
      tblTable1_Internalname = sPrefix+"TABLE1" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
      }
      init_default_properties( ) ;
      lblTxt_btn_end_Visible = 1 ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_user_Caption = "TXT_USER" ;
      lblTxt_title_Caption = "TXT_TITLE" ;
      lblTxt_btn_end_Caption = "ログアウト（F12）" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
      }
   }

   protected boolean isSpaSupported( )
   {
      return false ;
   }

   public void initializeDynEvents( )
   {
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
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
      wcpOAV11P_TAM02_APP_ID = "" ;
      wcpOAV10P_PGNM = "" ;
      wcpOAV12P_TAW01_DISP_DATETIME = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV9P_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV11P_TAM02_APP_ID = "" ;
      AV10P_PGNM = "" ;
      AV12P_TAW01_DISP_DATETIME = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXDecQS = "" ;
      AV18Pgmname = "" ;
      AV8H_INIT_FLG = "" ;
      AV15W_SESSION = httpContext.getWebSession();
      AV14W_JS = "" ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_title_Jsonclick = "" ;
      lblTxt_user_Jsonclick = "" ;
      lblTxt_btn_end_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV9P_A_LOGIN_SDT = "" ;
      sCtrlAV11P_TAM02_APP_ID = "" ;
      sCtrlAV10P_PGNM = "" ;
      sCtrlAV12P_TAW01_DISP_DATETIME = "" ;
      AV18Pgmname = "A104_WP01_HEADER" ;
      /* GeneXus formulas. */
      AV18Pgmname = "A104_WP01_HEADER" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private int tblTbl_hidden_Visible ;
   private int lblTxt_btn_end_Visible ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavH_init_flg_Internalname ;
   private String GXDecQS ;
   private String AV18Pgmname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_btn_end_Caption ;
   private String lblTxt_btn_end_Internalname ;
   private String lblTxt_title_Caption ;
   private String lblTxt_title_Internalname ;
   private String lblTxt_user_Caption ;
   private String lblTxt_user_Internalname ;
   private String divTimer_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String tblTable2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String imgImg_logo_Internalname ;
   private String lblTxt_title_Jsonclick ;
   private String tblTable3_Internalname ;
   private String lblTxt_user_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblTxt_btn_end_Jsonclick ;
   private String sCtrlAV9P_A_LOGIN_SDT ;
   private String sCtrlAV11P_TAM02_APP_ID ;
   private String sCtrlAV10P_PGNM ;
   private String sCtrlAV12P_TAW01_DISP_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String wcpOAV11P_TAM02_APP_ID ;
   private String wcpOAV10P_PGNM ;
   private String wcpOAV12P_TAW01_DISP_DATETIME ;
   private String AV11P_TAM02_APP_ID ;
   private String AV10P_PGNM ;
   private String AV12P_TAW01_DISP_DATETIME ;
   private String AV8H_INIT_FLG ;
   private String AV14W_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV15W_SESSION ;
   private SdtA_LOGIN_SDT AV9P_A_LOGIN_SDT ;
}

