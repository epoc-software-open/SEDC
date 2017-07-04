/*
               File: a104_wp01_header_impl
        Description: ヘッダー
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:41.61
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

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa082( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.writeText( "<title>") ;
         httpContext.writeText( "ヘッダー") ;
         httpContext.writeTextNL( "</title>") ;
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
         httpContext.writeText( "<body") ;
         httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
         httpContext.writeText( "\""+FormProcess+">") ;
         httpContext.skipLines( 1 );
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV11P_TAM02_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV10P_PGNM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12P_TAW01_DISP_DATETIME)) ;
         httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("a104_wp01_header") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
         GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      }
   }

   public void renderHtmlCloseForm082( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11P_TAM02_APP_ID", GXutil.rtrim( wcpOAV11P_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10P_PGNM", GXutil.rtrim( wcpOAV10P_PGNM));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12P_TAW01_DISP_DATETIME", GXutil.rtrim( wcpOAV12P_TAW01_DISP_DATETIME));
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("a104_wp01_header.js", "?14514164");
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
   }

   public void wb080( )
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
         wb_table1_2_082( true) ;
      }
      else
      {
         wb_table1_2_082( false) ;
      }
      return  ;
   }

   public void wb_table1_2_082e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start082( )
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
         Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
         Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
         Form.getMeta().addItem("Description", "ヘッダー", (short)(0)) ;
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
            strup080( ) ;
         }
      }
   }

   public void ws082( )
   {
      start082( ) ;
      evt082( ) ;
   }

   public void evt082( )
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
                              strup080( ) ;
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
                              strup080( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e11082 */
                                 e11082 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup080( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e12082 */
                                 e12082 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'BTN_END'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup080( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e13082 */
                                 e13082 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup080( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: e14082 */
                                 e14082 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup080( ) ;
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
                              strup080( ) ;
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

   public void we082( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm082( ) ;
         }
      }
   }

   public void pa082( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ( GxWebError == 0 ) && ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
            {
               GXKey = context.getSiteKey( ) ;
               GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
               if ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 )
               {
                  httpContext.setQueryString( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6)) ;
               }
               else
               {
                  GxWebError = (byte)(1) ;
                  httpContext.sendError( 403 );
               }
            }
         }
         if ( ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf082( ) ;
      /* End function Refresh */
   }

   public void rf082( )
   {
      /* Execute user event: e12082 */
      e12082 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e14082 */
         e14082 ();
         wb080( ) ;
      }
   }

   public void strup080( )
   {
      /* Before Start, stand alone formulas. */
      AV18Pgmname = "A104_WP01_HEADER" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11082 */
      e11082 ();
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
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e11082 */
      e11082 ();
      if (returnInSub) return;
   }

   public void e11082( )
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

   public void e12082( )
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

   public void e13082( )
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
      }
      else
      {
         if ( GXutil.strcmp(AV11P_TAM02_APP_ID, "A101") != 0 )
         {
            new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", "終了:"+AV11P_TAM02_APP_ID) ;
            AV14W_JS = "var closeWin = parent?parent:window;" ;
            AV14W_JS = AV14W_JS + "(closeWin.open('', '_self').opener = closeWin).close();" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLOCK();" ;
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

   protected void e14082( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_082( boolean wbgen )
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
         wb_table2_5_082( true) ;
      }
      else
      {
         wb_table2_5_082( false) ;
      }
      return  ;
   }

   public void wb_table2_5_082e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_30_082( true) ;
      }
      else
      {
         wb_table3_30_082( false) ;
      }
      return  ;
   }

   public void wb_table3_30_082e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_082e( true) ;
      }
      else
      {
         wb_table1_2_082e( false) ;
      }
   }

   public void wb_table3_30_082( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_A104_WP01_HEADER.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8H_INIT_FLG", AV8H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV8H_INIT_FLG), GXutil.rtrim( localUtil.format( AV8H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(34);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_082e( true) ;
      }
      else
      {
         wb_table3_30_082e( false) ;
      }
   }

   public void wb_table2_5_082( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "left")+";height:55px;width:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title_Internalname, lblTxt_title_Caption, "", "", lblTxt_title_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table4_13_082( true) ;
      }
      else
      {
         wb_table4_13_082( false) ;
      }
      return  ;
   }

   public void wb_table4_13_082e( boolean wbgen )
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
         wb_table2_5_082e( true) ;
      }
      else
      {
         wb_table2_5_082e( false) ;
      }
   }

   public void wb_table4_13_082( boolean wbgen )
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
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_user_Internalname, lblTxt_user_Caption, "", "", lblTxt_user_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "<div style=\"WIDTH: 150px\" class=\"SectionTimer\" id=\"Timer\"/>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table5_25_082( true) ;
      }
      else
      {
         wb_table5_25_082( false) ;
      }
      return  ;
   }

   public void wb_table5_25_082e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_13_082e( true) ;
      }
      else
      {
         wb_table4_13_082e( false) ;
      }
   }

   public void wb_table5_25_082( boolean wbgen )
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
         ClassString = "TextBlockBtn120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_end_Internalname, lblTxt_btn_end_Caption, "", "", lblTxt_btn_end_Jsonclick, sPrefix+"E\\'BTN_END\\'.", StyleString, ClassString, 5, "", lblTxt_btn_end_Visible, 1, (short)(0), "HLP_A104_WP01_HEADER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_25_082e( true) ;
      }
      else
      {
         wb_table5_25_082e( false) ;
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
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa082( ) ;
      ws082( ) ;
      we082( ) ;
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
      pa082( ) ;
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
      pa082( ) ;
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
      pa082( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws082( ) ;
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
      ws082( ) ;
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
      we082( ) ;
      cleanup();
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
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14514186");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("a104_wp01_header.js", "?14514186");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_title_Internalname = sPrefix+"TXT_TITLE" ;
      lblTxt_user_Internalname = sPrefix+"TXT_USER" ;
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
      init_default_properties( ) ;
      lblTxt_btn_end_Visible = 1 ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_user_Caption = "TXT_USER" ;
      lblTxt_title_Caption = "TXT_TITLE" ;
      lblTxt_btn_end_Caption = "ログアウト（F12）" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
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
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
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
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTxt_title_Jsonclick = "" ;
      lblTxt_user_Jsonclick = "" ;
      lblTxt_btn_end_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV9P_A_LOGIN_SDT = "" ;
      sCtrlAV11P_TAM02_APP_ID = "" ;
      sCtrlAV10P_PGNM = "" ;
      sCtrlAV12P_TAW01_DISP_DATETIME = "" ;
      GXt_char4 = "" ;
      GXt_char5 = "" ;
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
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXt_char3 ;
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
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTxt_title_Jsonclick ;
   private String tblTable3_Internalname ;
   private String lblTxt_user_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblTxt_btn_end_Jsonclick ;
   private String sCtrlAV9P_A_LOGIN_SDT ;
   private String sCtrlAV11P_TAM02_APP_ID ;
   private String sCtrlAV10P_PGNM ;
   private String sCtrlAV12P_TAW01_DISP_DATETIME ;
   private String GXt_char4 ;
   private String GXt_char5 ;
   private boolean entryPointCalled ;
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

