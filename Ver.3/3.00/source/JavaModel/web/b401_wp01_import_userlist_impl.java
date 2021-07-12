/*
               File: b401_wp01_import_userlist_impl
        Description: 臨床試験支援システムユーザ一覧取込
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:10.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b401_wp01_import_userlist_impl extends GXWebPanel
{
   public b401_wp01_import_userlist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b401_wp01_import_userlist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b401_wp01_import_userlist_impl.class ));
   }

   public b401_wp01_import_userlist_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Style2");
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV11P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11P_MOVE_KBN", GXutil.str( AV11P_MOVE_KBN, 1, 0));
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa162( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws162( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we162( ) ;
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
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "臨床試験支援システムユーザ一覧取込") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513241011");
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
      GXEncryptionTmp = "b401_wp01_import_userlist"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b401_wp01_import_userlist") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm162( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV11P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
      if ( ! ( WebComp_Webcomp1 == null ) )
      {
         WebComp_Webcomp1.componentjscripts();
      }
      if ( ! ( WebComp_Webcomp2 == null ) )
      {
         WebComp_Webcomp2.componentjscripts();
      }
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "B401_WP01_IMPORT_USERLIST" ;
   }

   public String getPgmdesc( )
   {
      return "臨床試験支援システムユーザ一覧取込" ;
   }

   public void wb160( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_162( true) ;
      }
      else
      {
         wb_table1_2_162( false) ;
      }
      return  ;
   }

   public void wb_table1_2_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_43_162( true) ;
      }
      else
      {
         wb_table2_43_162( false) ;
      }
      return  ;
   }

   public void wb_table2_43_162e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start162( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "臨床試験支援システムユーザ一覧取込", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0041") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0041", "");
         }
      }
      wbErr = false ;
      strup160( ) ;
   }

   public void ws162( )
   {
      start162( ) ;
      evt162( ) ;
   }

   public void evt162( )
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
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e11162 */
                        e11162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12162 */
                        e12162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13162 */
                        e13162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14162 */
                        e14162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 9 )
                  {
                     OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                     if ( ( GXutil.len( OldWebcomp1) == 0 ) || ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 ) )
                     {
                        WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                        WebComp_Webcomp1_Component = OldWebcomp1 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
                     {
                        WebComp_Webcomp1.componentprocess("W0009", "", sEvt);
                     }
                     WebComp_Webcomp1_Component = OldWebcomp1 ;
                  }
                  else if ( nCmpId == 41 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0041") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0041", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we162( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm162( ) ;
         }
      }
   }

   public void pa162( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b401_wp01_import_userlist")), "b401_wp01_import_userlist") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b401_wp01_import_userlist"))) ;
            }
            else
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
            }
         }
         if ( ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            if ( nGotPars == 0 )
            {
               entryPointCalled = false ;
               gxfirstwebparm = httpContext.GetNextPar( ) ;
               if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
               {
                  AV11P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11P_MOVE_KBN", GXutil.str( AV11P_MOVE_KBN, 1, 0));
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
      rf162( ) ;
      /* End function Refresh */
   }

   public void rf162( )
   {
      /* Execute user event: e13162 */
      e13162 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
            {
               WebComp_Webcomp1.componentstart();
            }
         }
      }
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
            {
               WebComp_Webcomp2.componentstart();
            }
         }
      }
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e14162 */
         e14162 ();
         wb160( ) ;
      }
   }

   public void strup160( )
   {
      /* Before Start, stand alone formulas. */
      AV22Pgmname = "B401_WP01_IMPORT_USERLIST" ;
      AV21Pgmdesc = "臨床試験支援システムユーザ一覧取込" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e12162 */
      e12162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV8D_USER_ID = httpContext.cgiGet( edtavD_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_USER_ID", AV8D_USER_ID);
         AV7D_PWD = httpContext.cgiGet( edtavD_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_PWD", AV7D_PWD);
         AV9H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         AV10H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
         /* Read saved values. */
         AV11P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0041") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0041", "");
         }
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
      /* Execute user event: e12162 */
      e12162 ();
      if (returnInSub) return;
   }

   public void e12162( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B401" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV21Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV9H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomp1_Component), GXutil.lower( "A104_WP01_HEADER")) != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "a104_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "A104_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV12W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","",""});
      }
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomp2_Component), GXutil.lower( "A104_WP02_FOOTER")) != 0 )
      {
         WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "a104_wp02_footer_impl", remoteHandle, context);
         WebComp_Webcomp2_Component = "A104_WP02_FOOTER" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
      {
         WebComp_Webcomp2.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
      {
         WebComp_Webcomp2.componentprepare(new Object[] {"W0041",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e13162( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV9H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV9H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e11162( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV10H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         if ( ! AV14W_ERR_FLG )
         {
            GXt_char1 = AV16W_PWD ;
            GXv_char2[0] = GXt_char1 ;
            new b801_pc01_md5(remoteHandle, context).execute( AV7D_PWD, GXv_char2) ;
            b401_wp01_import_userlist_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_PWD", AV7D_PWD);
            AV16W_PWD = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16W_PWD", AV16W_PWD);
            GXv_int3[0] = AV17W_RTN_CD ;
            GXv_char2[0] = AV18W_RTN_MSG ;
            new b603_pc01_import_usrelist(remoteHandle, context).execute( AV8D_USER_ID, AV16W_PWD, GXv_int3, GXv_char2) ;
            b401_wp01_import_userlist_impl.this.AV17W_RTN_CD = GXv_int3[0] ;
            b401_wp01_import_userlist_impl.this.AV18W_RTN_MSG = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8D_USER_ID", AV8D_USER_ID);
            httpContext.ajax_rsp_assign_attri("", false, "AV16W_PWD", AV16W_PWD);
            httpContext.ajax_rsp_assign_attri("", false, "AV17W_RTN_CD", GXutil.ltrim( GXutil.str( AV17W_RTN_CD, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV18W_RTN_MSG", AV18W_RTN_MSG);
            if ( AV17W_RTN_CD == 0 )
            {
               httpContext.GX_msglist.addItem(new a805_pc01_msg_get(remoteHandle, context).executeUdp( "AX00104", "", "", "", "", ""));
            }
            else
            {
               httpContext.GX_msglist.addItem(AV18W_RTN_MSG);
            }
         }
      }
   }

   public void S162( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV14W_ERR_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
      if ( (GXutil.strcmp("", AV8D_USER_ID)==0) )
      {
         edtavD_user_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_user_id_Backcolor, 9, 0)));
         httpContext.GX_msglist.addItem(new a805_pc01_msg_get(remoteHandle, context).executeUdp( "AE00001", "管理者ユーザーID", "", "", "", ""));
         if ( ! AV14W_ERR_FLG )
         {
            GX_FocusControl = edtavD_user_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV14W_ERR_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
      }
      if ( (GXutil.strcmp("", AV7D_PWD)==0) )
      {
         edtavD_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_pwd_Backcolor, 9, 0)));
         httpContext.GX_msglist.addItem(new a805_pc01_msg_get(remoteHandle, context).executeUdp( "AE00001", "パスワード", "", "", "", ""));
         if ( ! AV14W_ERR_FLG )
         {
            GX_FocusControl = edtavD_pwd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV14W_ERR_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
      }
   }

   public void S172( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_user_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_user_id_Backcolor, 9, 0)));
      edtavD_pwd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_pwd_Backcolor, 9, 0)));
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV12W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV12W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b401_wp01_import_userlist_impl.this.AV15W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_ERRCD", AV15W_ERRCD);
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV13W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13W_A819_JS", AV13W_A819_JS);
   }

   public void S152( )
   {
      /* 'SUB_JS' Routine */
      lblTxt_js_event_Caption = "<script language=javascript>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"var confirmFlg = false;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (window.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  window.addEventListener('load', function(){init();}, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	window.attachEvent('onload',function(){init();});" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function init() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV10H_KNGN_FLG ;
      GXv_char5[0] = AV15W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char2, GXv_char5) ;
      b401_wp01_import_userlist_impl.this.AV10H_KNGN_FLG = GXv_char2[0] ;
      b401_wp01_import_userlist_impl.this.AV15W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_ERRCD", AV15W_ERRCD);
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S182( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b401_wp01_import_userlist");
   }

   public void S142( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV10H_KNGN_FLG, "", GXv_boolean7) ;
      b401_wp01_import_userlist_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean6 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
   }

   protected void nextLoad( )
   {
   }

   protected void e14162( )
   {
      /* Load Routine */
   }

   public void wb_table2_43_162( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV10H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV10H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_43_162e( true) ;
      }
      else
      {
         wb_table2_43_162e( false) ;
      }
   }

   public void wb_table1_2_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_162( true) ;
      }
      else
      {
         wb_table3_6_162( false) ;
      }
      return  ;
   }

   public void wb_table3_6_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "2c4dd041-bc05-4078-b5a7-f8ce2f3cf741", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_162e( true) ;
      }
      else
      {
         wb_table1_2_162e( false) ;
      }
   }

   public void wb_table3_6_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0009"+"", GXutil.rtrim( WebComp_Webcomp1_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0009"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0009"+"");
            }
            WebComp_Webcomp1.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td id=\""+cellMenu_bg_Internalname+"\"  class=''>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table4_14_162( true) ;
      }
      else
      {
         wb_table4_14_162( false) ;
      }
      return  ;
   }

   public void wb_table4_14_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0041"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0041"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0041"+"");
            }
            WebComp_Webcomp2.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_6_162e( true) ;
      }
      else
      {
         wb_table3_6_162e( false) ;
      }
   }

   public void wb_table4_14_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_17_162( true) ;
      }
      else
      {
         wb_table5_17_162( false) ;
      }
      return  ;
   }

   public void wb_table5_17_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_14_162e( true) ;
      }
      else
      {
         wb_table4_14_162e( false) ;
      }
   }

   public void wb_table5_17_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_20_162( true) ;
      }
      else
      {
         wb_table6_20_162( false) ;
      }
      return  ;
   }

   public void wb_table6_20_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_17_162e( true) ;
      }
      else
      {
         wb_table5_17_162e( false) ;
      }
   }

   public void wb_table6_20_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "管理者ユーザーID", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:290px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_user_id_Internalname, GXutil.rtrim( AV8D_USER_ID), GXutil.rtrim( localUtil.format( AV8D_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_user_id_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_user_id_Backcolor)+";", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "パスワード", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:290px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_pwd_Internalname, GXutil.rtrim( AV7D_PWD), GXutil.rtrim( localUtil.format( AV7D_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_pwd_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_pwd_Backcolor)+";", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 128, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"4\"  style=\"height:30px\">") ;
         wb_table7_32_162( true) ;
      }
      else
      {
         wb_table7_32_162( false) ;
      }
      return  ;
   }

   public void wb_table7_32_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_20_162e( true) ;
      }
      else
      {
         wb_table6_20_162e( false) ;
      }
   }

   public void wb_table7_32_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "実行（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B401_WP01_IMPORT_USERLIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_32_162e( true) ;
      }
      else
      {
         wb_table7_32_162e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV11P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11P_MOVE_KBN", GXutil.str( AV11P_MOVE_KBN, 1, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Style2");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa162( ) ;
      ws162( ) ;
      we162( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      if ( ! ( WebComp_Webcomp1 == null ) )
      {
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            WebComp_Webcomp1.componentthemes();
         }
      }
      if ( ! ( WebComp_Webcomp2 == null ) )
      {
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            WebComp_Webcomp2.componentthemes();
         }
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513241039");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b401_wp01_import_userlist.js", "?202071513241039");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_user_id_Internalname = "vD_USER_ID" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavD_pwd_Internalname = "vD_PWD" ;
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_pwd_Jsonclick = "" ;
      edtavD_pwd_Backstyle = (byte)(-1) ;
      edtavD_user_id_Jsonclick = "" ;
      edtavD_user_id_Backstyle = (byte)(-1) ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavD_pwd_Backcolor = (int)(0xFFFFFF) ;
      edtavD_user_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
                  /* Execute user subroutine: S182 */
                  S182 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      OldWebcomp1 = "" ;
      WebComp_Webcomp1_Component = "" ;
      OldWebcomp2 = "" ;
      WebComp_Webcomp2_Component = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXDecQS = "" ;
      AV22Pgmname = "" ;
      AV21Pgmdesc = "" ;
      AV8D_USER_ID = "" ;
      AV7D_PWD = "" ;
      AV9H_INIT_FLG = "" ;
      AV10H_KNGN_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV12W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV16W_PWD = "" ;
      GXt_char1 = "" ;
      GXv_int3 = new short [1] ;
      AV18W_RTN_MSG = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      AV13W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_boolean7 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b401_wp01_import_userlist__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B401_WP01_IMPORT_USERLIST" ;
      AV21Pgmdesc = "臨床試験支援システムユーザ一覧取込" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B401_WP01_IMPORT_USERLIST" ;
      AV21Pgmdesc = "臨床試験支援システムユーザ一覧取込" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV11P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11P_MOVE_KBN ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte edtavD_pwd_Backstyle ;
   private byte edtavD_user_id_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV17W_RTN_CD ;
   private short GXv_int3[] ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_user_id_Backcolor ;
   private int edtavD_pwd_Backcolor ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String OldWebcomp1 ;
   private String WebComp_Webcomp1_Component ;
   private String OldWebcomp2 ;
   private String WebComp_Webcomp2_Component ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXDecQS ;
   private String AV22Pgmname ;
   private String AV21Pgmdesc ;
   private String edtavD_user_id_Internalname ;
   private String edtavD_pwd_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_user_id_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavD_pwd_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV14W_ERR_FLG ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String AV8D_USER_ID ;
   private String AV7D_PWD ;
   private String AV9H_INIT_FLG ;
   private String AV10H_KNGN_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String AV16W_PWD ;
   private String AV18W_RTN_MSG ;
   private String AV15W_ERRCD ;
   private String AV13W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private IDataStoreProvider pr_default ;
   private SdtA_LOGIN_SDT AV12W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class b401_wp01_import_userlist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

