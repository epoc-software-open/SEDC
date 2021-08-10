/*
               File: a214_wp01_send_mail_info_impl
        Description: 送信メール情報編集
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:36.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a214_wp01_send_mail_info_impl extends GXWebPanel
{
   public a214_wp01_send_mail_info_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a214_wp01_send_mail_info_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a214_wp01_send_mail_info_impl.class ));
   }

   public a214_wp01_send_mail_info_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavD_auth = new HTMLChoice();
      radavD_server_del_flg = new HTMLChoice();
      radavD_mail_del_flg = new HTMLChoice();
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
            AV10P_DOM_CD = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10P_DOM_CD", AV10P_DOM_CD);
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
         pa2L2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2L2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2L2( ) ;
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
      httpContext.writeValue( "送信メール情報編集") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513313664");
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
      GXEncryptionTmp = "a214_wp01_send_mail_info"+GXutil.URLEncode(GXutil.rtrim(AV10P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a214_wp01_send_mail_info") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2L2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV10P_DOM_CD));
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
      return "A214_WP01_SEND_MAIL_INFO" ;
   }

   public String getPgmdesc( )
   {
      return "送信メール情報編集" ;
   }

   public void wb2L0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_2L2( true) ;
      }
      else
      {
         wb_table1_2_2L2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2L2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "送信メール情報編集", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0098") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0098", "");
         }
      }
      wbErr = false ;
      strup2L0( ) ;
   }

   public void ws2L2( )
   {
      start2L2( ) ;
      evt2L2( ) ;
   }

   public void evt2L2( )
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
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e112L2 */
                        e112L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e122L2 */
                        e122L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e132L2 */
                        e132L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e142L2 */
                        e142L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e152L2 */
                        e152L2 ();
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
                  else if ( nCmpId == 98 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0098") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0098", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2L2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2L2( ) ;
         }
      }
   }

   public void pa2L2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a214_wp01_send_mail_info")), "a214_wp01_send_mail_info") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a214_wp01_send_mail_info"))) ;
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
                  AV10P_DOM_CD = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10P_DOM_CD", AV10P_DOM_CD);
               }
            }
         }
         radavD_auth.setName( "vD_AUTH" );
         radavD_auth.setWebtags( "" );
         radavD_auth.addItem("0", "認証なし", (short)(0));
         radavD_auth.addItem("1", "認証あり", (short)(0));
         radavD_server_del_flg.setName( "vD_SERVER_DEL_FLG" );
         radavD_server_del_flg.setWebtags( "" );
         radavD_server_del_flg.addItem("0", "利用可能", (short)(0));
         radavD_server_del_flg.addItem("1", "利用不可", (short)(0));
         radavD_mail_del_flg.setName( "vD_MAIL_DEL_FLG" );
         radavD_mail_del_flg.setWebtags( "" );
         radavD_mail_del_flg.addItem("0", "メール送信する", (short)(0));
         radavD_mail_del_flg.addItem("1", "メール送信しない", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf2L2( ) ;
      /* End function Refresh */
   }

   public void rf2L2( )
   {
      /* Execute user event: e122L2 */
      e122L2 ();
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
         /* Execute user event: e152L2 */
         e152L2 ();
         wb2L0( ) ;
      }
   }

   public void strup2L0( )
   {
      /* Before Start, stand alone formulas. */
      AV36Pgmname = "A214_WP01_SEND_MAIL_INFO" ;
      AV35Pgmdesc = "送信メール情報編集" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e112L2 */
      e112L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV17D_HOST = httpContext.cgiGet( edtavD_host_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17D_HOST", AV17D_HOST);
         AV18D_PORT = httpContext.cgiGet( edtavD_port_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18D_PORT", AV18D_PORT);
         AV19D_AUTH = httpContext.cgiGet( radavD_auth.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19D_AUTH", AV19D_AUTH);
         AV20D_AUTH_USER_NM = httpContext.cgiGet( edtavD_auth_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20D_AUTH_USER_NM", AV20D_AUTH_USER_NM);
         AV21D_AUTH_PWD = httpContext.cgiGet( edtavD_auth_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21D_AUTH_PWD", AV21D_AUTH_PWD);
         AV27D_SERVER_DEL_FLG = httpContext.cgiGet( radavD_server_del_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SERVER_DEL_FLG", AV27D_SERVER_DEL_FLG);
         AV22D_SEND_MAIL_ADDR = httpContext.cgiGet( edtavD_send_mail_addr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22D_SEND_MAIL_ADDR", AV22D_SEND_MAIL_ADDR);
         AV23D_SEND_MAIL_NM = httpContext.cgiGet( edtavD_send_mail_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23D_SEND_MAIL_NM", AV23D_SEND_MAIL_NM);
         AV24D_MAIL_TITLE = httpContext.cgiGet( edtavD_mail_title_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_MAIL_TITLE", AV24D_MAIL_TITLE);
         AV25D_MAIL_MAIN = httpContext.cgiGet( edtavD_mail_main_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25D_MAIL_MAIN", AV25D_MAIL_MAIN);
         AV28D_MAIL_DEL_FLG = httpContext.cgiGet( radavD_mail_del_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28D_MAIL_DEL_FLG", AV28D_MAIL_DEL_FLG);
         AV7H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7H_INIT_FLG", AV7H_INIT_FLG);
         AV9H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_MODE", AV9H_MODE);
         AV8H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8H_KNGN_FLG", AV8H_KNGN_FLG);
         /* Read saved values. */
         AV10P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0098") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0098", "");
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
      /* Execute user event: e112L2 */
      e112L2 ();
      if (returnInSub) return;
   }

   public void e112L2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "A214" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      AV5C_GAMEN_TITLE = AV35Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_GAMEN_TITLE", AV5C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV7H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7H_INIT_FLG", AV7H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV11W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0098",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e122L2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV7H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV36Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV7H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7H_INIT_FLG", AV7H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e132L2( )
   {
      /* 'BTN_REG' Routine */
      GXt_char1 = AV16W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
      a214_wp01_send_mail_info_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_MSG", AV16W_MSG);
      GXt_char1 = AV13W_A821_JS ;
      GXv_char2[0] = GXt_char1 ;
      new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV16W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
      a214_wp01_send_mail_info_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_MSG", AV16W_MSG);
      AV13W_A821_JS = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13W_A821_JS", AV13W_A821_JS);
   }

   public void e142L2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      GXv_int3[0] = AV30W_RTN_CD ;
      GXv_char2[0] = AV16W_MSG ;
      new a214_pc01_reg(remoteHandle, context).execute( AV17D_HOST, AV18D_PORT, AV19D_AUTH, AV20D_AUTH_USER_NM, AV21D_AUTH_PWD, AV27D_SERVER_DEL_FLG, AV22D_SEND_MAIL_ADDR, AV23D_SEND_MAIL_NM, AV24D_MAIL_TITLE, AV25D_MAIL_MAIN, AV28D_MAIL_DEL_FLG, GXv_int3, GXv_char2) ;
      a214_wp01_send_mail_info_impl.this.AV30W_RTN_CD = GXv_int3[0] ;
      a214_wp01_send_mail_info_impl.this.AV16W_MSG = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17D_HOST", AV17D_HOST);
      httpContext.ajax_rsp_assign_attri("", false, "AV18D_PORT", AV18D_PORT);
      httpContext.ajax_rsp_assign_attri("", false, "AV19D_AUTH", AV19D_AUTH);
      httpContext.ajax_rsp_assign_attri("", false, "AV20D_AUTH_USER_NM", AV20D_AUTH_USER_NM);
      httpContext.ajax_rsp_assign_attri("", false, "AV21D_AUTH_PWD", AV21D_AUTH_PWD);
      httpContext.ajax_rsp_assign_attri("", false, "AV27D_SERVER_DEL_FLG", AV27D_SERVER_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV22D_SEND_MAIL_ADDR", AV22D_SEND_MAIL_ADDR);
      httpContext.ajax_rsp_assign_attri("", false, "AV23D_SEND_MAIL_NM", AV23D_SEND_MAIL_NM);
      httpContext.ajax_rsp_assign_attri("", false, "AV24D_MAIL_TITLE", AV24D_MAIL_TITLE);
      httpContext.ajax_rsp_assign_attri("", false, "AV25D_MAIL_MAIN", AV25D_MAIL_MAIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV28D_MAIL_DEL_FLG", AV28D_MAIL_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_RTN_CD", GXutil.ltrim( GXutil.str( AV30W_RTN_CD, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_MSG", AV16W_MSG);
      if ( AV30W_RTN_CD == 0 )
      {
         GXt_char1 = AV16W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char2) ;
         a214_wp01_send_mail_info_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16W_MSG", AV16W_MSG);
         httpContext.GX_msglist.addItem(AV16W_MSG);
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16W_MSG);
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      AV26W_TBM01_SYS_ID_C.clear();
      AV26W_TBM01_SYS_ID_C.add("900", 0);
      AV26W_TBM01_SYS_ID_C.add("901", 0);
      AV26W_TBM01_SYS_ID_C.add("902", 0);
      AV26W_TBM01_SYS_ID_C.add("903", 0);
      AV26W_TBM01_SYS_ID_C.add("904", 0);
      AV26W_TBM01_SYS_ID_C.add("905", 0);
      AV26W_TBM01_SYS_ID_C.add("906", 0);
      AV26W_TBM01_SYS_ID_C.add("907", 0);
      AV26W_TBM01_SYS_ID_C.add("908", 0);
      AV26W_TBM01_SYS_ID_C.add("909", 0);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A58TBM01_SYS_ID ,
                                           AV26W_TBM01_SYS_ID_C },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION
                                           }
      });
      /* Using cursor H002L2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A58TBM01_SYS_ID = H002L2_A58TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A608TBM01_SYS_VALUE = H002L2_A608TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         n608TBM01_SYS_VALUE = H002L2_n608TBM01_SYS_VALUE[0] ;
         A351TBM01_DEL_FLG = H002L2_A351TBM01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         n351TBM01_DEL_FLG = H002L2_n351TBM01_DEL_FLG[0] ;
         A609TBM01_NOTE = H002L2_A609TBM01_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         n609TBM01_NOTE = H002L2_n609TBM01_NOTE[0] ;
         if ( GXutil.strcmp(A58TBM01_SYS_ID, "900") == 0 )
         {
            AV17D_HOST = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17D_HOST", AV17D_HOST);
            AV27D_SERVER_DEL_FLG = A351TBM01_DEL_FLG ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27D_SERVER_DEL_FLG", AV27D_SERVER_DEL_FLG);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "901") == 0 )
         {
            AV18D_PORT = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18D_PORT", AV18D_PORT);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "902") == 0 )
         {
            AV19D_AUTH = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19D_AUTH", AV19D_AUTH);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "903") == 0 )
         {
            AV20D_AUTH_USER_NM = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20D_AUTH_USER_NM", AV20D_AUTH_USER_NM);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "904") == 0 )
         {
            AV31W_AUTH_PWD = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_AUTH_PWD", AV31W_AUTH_PWD);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "905") == 0 )
         {
            AV32W_AUTH_EKEY = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_AUTH_EKEY", AV32W_AUTH_EKEY);
            if ( ! (GXutil.strcmp("", AV31W_AUTH_PWD)==0) && ! (GXutil.strcmp("", AV32W_AUTH_EKEY)==0) )
            {
               AV21D_AUTH_PWD = com.genexus.util.Encryption.decrypt64( AV31W_AUTH_PWD, AV32W_AUTH_EKEY) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21D_AUTH_PWD", AV21D_AUTH_PWD);
            }
            else
            {
               AV21D_AUTH_PWD = AV31W_AUTH_PWD ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21D_AUTH_PWD", AV21D_AUTH_PWD);
            }
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "906") == 0 )
         {
            AV22D_SEND_MAIL_ADDR = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22D_SEND_MAIL_ADDR", AV22D_SEND_MAIL_ADDR);
            AV28D_MAIL_DEL_FLG = A351TBM01_DEL_FLG ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28D_MAIL_DEL_FLG", AV28D_MAIL_DEL_FLG);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "907") == 0 )
         {
            AV23D_SEND_MAIL_NM = A608TBM01_SYS_VALUE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23D_SEND_MAIL_NM", AV23D_SEND_MAIL_NM);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "908") == 0 )
         {
            AV24D_MAIL_TITLE = A609TBM01_NOTE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24D_MAIL_TITLE", AV24D_MAIL_TITLE);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "909") == 0 )
         {
            AV25D_MAIL_MAIN = A609TBM01_NOTE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25D_MAIL_MAIN", AV25D_MAIL_MAIN);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV14W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      a214_wp01_send_mail_info_impl.this.AV14W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERRCD", AV14W_ERRCD);
      if ( GXutil.strcmp(AV14W_ERRCD, "0") != 0 )
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
      AV13W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13W_A821_JS", AV13W_A821_JS);
      AV12W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_A819_JS", AV12W_A819_JS);
   }

   public void S152( )
   {
      /* 'SUB_JS' Routine */
      lblTxt_js_event_Caption = "<script language=javascript>" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV13W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV13W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV12W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV12W_A819_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
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
      GXv_char2[0] = AV8H_KNGN_FLG ;
      GXv_char5[0] = AV14W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char2, GXv_char5) ;
      a214_wp01_send_mail_info_impl.this.AV8H_KNGN_FLG = GXv_char2[0] ;
      a214_wp01_send_mail_info_impl.this.AV14W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV8H_KNGN_FLG", AV8H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERRCD", AV14W_ERRCD);
      if ( GXutil.strcmp(AV14W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S162( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV36Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a214_wp01_send_mail_info");
   }

   protected void nextLoad( )
   {
   }

   protected void e152L2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table2_6_2L2( true) ;
      }
      else
      {
         wb_table2_6_2L2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_2L2e( boolean wbgen )
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
         wb_table1_2_2L2e( true) ;
      }
      else
      {
         wb_table1_2_2L2e( false) ;
      }
   }

   public void wb_table2_6_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
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
         wb_table3_12_2L2( true) ;
      }
      else
      {
         wb_table3_12_2L2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_20_2L2( true) ;
      }
      else
      {
         wb_table4_20_2L2( false) ;
      }
      return  ;
   }

   public void wb_table4_20_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_89_2L2( true) ;
      }
      else
      {
         wb_table5_89_2L2( false) ;
      }
      return  ;
   }

   public void wb_table5_89_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0098"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0098"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0098"+"");
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
         wb_table2_6_2L2e( true) ;
      }
      else
      {
         wb_table2_6_2L2e( false) ;
      }
   }

   public void wb_table5_89_2L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV7H_INIT_FLG), GXutil.rtrim( localUtil.format( AV7H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV9H_MODE), GXutil.rtrim( localUtil.format( AV9H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV8H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV8H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_89_2L2e( true) ;
      }
      else
      {
         wb_table5_89_2L2e( false) ;
      }
   }

   public void wb_table4_20_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_26_2L2( true) ;
      }
      else
      {
         wb_table6_26_2L2( false) ;
      }
      return  ;
   }

   public void wb_table6_26_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_61_2L2( true) ;
      }
      else
      {
         wb_table7_61_2L2( false) ;
      }
      return  ;
   }

   public void wb_table7_61_2L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_2L2e( true) ;
      }
      else
      {
         wb_table4_20_2L2e( false) ;
      }
   }

   public void wb_table7_61_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 850, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableForm", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"2\"  style=\"height:21px\">") ;
         httpContext.writeText( "▼ユーザ登録メール送信内容") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:180px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "送信者メールアドレス", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_send_mail_addr_Internalname, GXutil.rtrim( AV22D_SEND_MAIL_ADDR), GXutil.rtrim( localUtil.format( AV22D_SEND_MAIL_ADDR, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_send_mail_addr_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "送信者名", "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_send_mail_nm_Internalname, GXutil.rtrim( AV23D_SEND_MAIL_NM), GXutil.rtrim( localUtil.format( AV23D_SEND_MAIL_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_send_mail_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "メールタイトル", "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_mail_title_Internalname, GXutil.rtrim( AV24D_MAIL_TITLE), GXutil.rtrim( localUtil.format( AV24D_MAIL_TITLE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_mail_title_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "メール本文", "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavD_mail_main_Internalname, GXutil.rtrim( AV25D_MAIL_MAIN), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "メール送信要否", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_mail_del_flg, radavD_mail_del_flg.getInternalname(), GXutil.rtrim( AV28D_MAIL_DEL_FLG), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_mail_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_61_2L2e( true) ;
      }
      else
      {
         wb_table7_61_2L2e( false) ;
      }
   }

   public void wb_table6_26_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 850, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"2\" >") ;
         httpContext.writeText( "▼送信メールサーバ情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:180px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "メールサーバー名", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_host_Internalname, GXutil.rtrim( AV17D_HOST), GXutil.rtrim( localUtil.format( AV17D_HOST, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_host_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "サーバーのポート番号", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_port_Internalname, GXutil.rtrim( AV18D_PORT), GXutil.rtrim( localUtil.format( AV18D_PORT, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_port_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "サーバーの認証方法", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_auth, radavD_auth.getInternalname(), GXutil.rtrim( AV19D_AUTH), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_auth.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "サーバー認証用ユーザー名", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_auth_user_nm_Internalname, GXutil.rtrim( AV20D_AUTH_USER_NM), GXutil.rtrim( localUtil.format( AV20D_AUTH_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_auth_user_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "※認証方法「認証あり」の場合のみ設定", "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FF0000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "サーバー認証用パスワード", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_auth_pwd_Internalname, GXutil.rtrim( AV21D_AUTH_PWD), GXutil.rtrim( localUtil.format( AV21D_AUTH_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_auth_pwd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "※認証方法「認証あり」の場合のみ設定", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FF0000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "メールサーバ利用可否", "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_server_del_flg, radavD_server_del_flg.getInternalname(), GXutil.rtrim( AV27D_SERVER_DEL_FLG), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_server_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(60);\"", "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_2L2e( true) ;
      }
      else
      {
         wb_table6_26_2L2e( false) ;
      }
   }

   public void wb_table3_12_2L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_ins_btnset_Internalname, tblTbl_ins_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A214_WP01_SEND_MAIL_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_2L2e( true) ;
      }
      else
      {
         wb_table3_12_2L2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV10P_DOM_CD = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10P_DOM_CD", AV10P_DOM_CD);
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
      pa2L2( ) ;
      ws2L2( ) ;
      we2L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513313737");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a214_wp01_send_mail_info.js", "?202071513313737");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      tblTbl_ins_btnset_Internalname = "TBL_INS_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavD_host_Internalname = "vD_HOST" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavD_port_Internalname = "vD_PORT" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      radavD_auth.setInternalname( "vD_AUTH" );
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtavD_auth_user_nm_Internalname = "vD_AUTH_USER_NM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavD_auth_pwd_Internalname = "vD_AUTH_PWD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      radavD_server_del_flg.setInternalname( "vD_SERVER_DEL_FLG" );
      tblTable4_Internalname = "TABLE4" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtavD_send_mail_addr_Internalname = "vD_SEND_MAIL_ADDR" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtavD_send_mail_nm_Internalname = "vD_SEND_MAIL_NM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtavD_mail_title_Internalname = "vD_MAIL_TITLE" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtavD_mail_main_Internalname = "vD_MAIL_MAIN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      radavD_mail_del_flg.setInternalname( "vD_MAIL_DEL_FLG" );
      tblTable1_Internalname = "TABLE1" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      radavD_server_del_flg.setJsonclick( "" );
      edtavD_auth_pwd_Jsonclick = "" ;
      edtavD_auth_user_nm_Jsonclick = "" ;
      radavD_auth.setJsonclick( "" );
      edtavD_port_Jsonclick = "" ;
      edtavD_host_Jsonclick = "" ;
      radavD_mail_del_flg.setJsonclick( "" );
      edtavD_mail_title_Jsonclick = "" ;
      edtavD_send_mail_nm_Jsonclick = "" ;
      edtavD_send_mail_addr_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
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
                  /* Execute user subroutine: S162 */
                  S162 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV10P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10P_DOM_CD = "" ;
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
      AV36Pgmname = "" ;
      AV35Pgmdesc = "" ;
      AV17D_HOST = "" ;
      AV18D_PORT = "" ;
      AV19D_AUTH = "" ;
      AV20D_AUTH_USER_NM = "" ;
      AV21D_AUTH_PWD = "" ;
      AV27D_SERVER_DEL_FLG = "" ;
      AV22D_SEND_MAIL_ADDR = "" ;
      AV23D_SEND_MAIL_NM = "" ;
      AV24D_MAIL_TITLE = "" ;
      AV25D_MAIL_MAIN = "" ;
      AV28D_MAIL_DEL_FLG = "" ;
      AV7H_INIT_FLG = "" ;
      AV9H_MODE = "" ;
      AV8H_KNGN_FLG = "" ;
      AV6C_TAM02_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV16W_MSG = "" ;
      AV13W_A821_JS = "" ;
      GXv_int3 = new short [1] ;
      GXt_char1 = "" ;
      AV26W_TBM01_SYS_ID_C = new GxObjectCollection(String.class, "internal", "");
      scmdbuf = "" ;
      A58TBM01_SYS_ID = "" ;
      H002L2_A58TBM01_SYS_ID = new String[] {""} ;
      H002L2_A608TBM01_SYS_VALUE = new String[] {""} ;
      H002L2_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      H002L2_A351TBM01_DEL_FLG = new String[] {""} ;
      H002L2_n351TBM01_DEL_FLG = new boolean[] {false} ;
      H002L2_A609TBM01_NOTE = new String[] {""} ;
      H002L2_n609TBM01_NOTE = new boolean[] {false} ;
      A608TBM01_SYS_VALUE = "" ;
      A351TBM01_DEL_FLG = "" ;
      A609TBM01_NOTE = "" ;
      AV31W_AUTH_PWD = "" ;
      AV32W_AUTH_EKEY = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV14W_ERRCD = "" ;
      AV12W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_char5 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a214_wp01_send_mail_info__default(),
         new Object[] {
             new Object[] {
            H002L2_A58TBM01_SYS_ID, H002L2_A608TBM01_SYS_VALUE, H002L2_n608TBM01_SYS_VALUE, H002L2_A351TBM01_DEL_FLG, H002L2_n351TBM01_DEL_FLG, H002L2_A609TBM01_NOTE, H002L2_n609TBM01_NOTE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV36Pgmname = "A214_WP01_SEND_MAIL_INFO" ;
      AV35Pgmdesc = "送信メール情報編集" ;
      /* GeneXus formulas. */
      AV36Pgmname = "A214_WP01_SEND_MAIL_INFO" ;
      AV35Pgmdesc = "送信メール情報編集" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV30W_RTN_CD ;
   private short GXv_int3[] ;
   private int tblTbl_hidden_Visible ;
   private int GXActiveErrHndl ;
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
   private String AV36Pgmname ;
   private String AV35Pgmdesc ;
   private String edtavD_host_Internalname ;
   private String edtavD_port_Internalname ;
   private String edtavD_auth_user_nm_Internalname ;
   private String edtavD_auth_pwd_Internalname ;
   private String edtavD_send_mail_addr_Internalname ;
   private String edtavD_send_mail_nm_Internalname ;
   private String edtavD_mail_title_Internalname ;
   private String edtavD_mail_main_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable1_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtavD_send_mail_addr_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtavD_send_mail_nm_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtavD_mail_title_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavD_host_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavD_port_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavD_auth_user_nm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtavD_auth_pwd_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String tblTbl_ins_btnset_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n608TBM01_SYS_VALUE ;
   private boolean n351TBM01_DEL_FLG ;
   private boolean n609TBM01_NOTE ;
   private String wcpOAV10P_DOM_CD ;
   private String AV10P_DOM_CD ;
   private String AV17D_HOST ;
   private String AV18D_PORT ;
   private String AV19D_AUTH ;
   private String AV20D_AUTH_USER_NM ;
   private String AV21D_AUTH_PWD ;
   private String AV27D_SERVER_DEL_FLG ;
   private String AV22D_SEND_MAIL_ADDR ;
   private String AV23D_SEND_MAIL_NM ;
   private String AV24D_MAIL_TITLE ;
   private String AV25D_MAIL_MAIN ;
   private String AV28D_MAIL_DEL_FLG ;
   private String AV7H_INIT_FLG ;
   private String AV9H_MODE ;
   private String AV8H_KNGN_FLG ;
   private String AV6C_TAM02_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV16W_MSG ;
   private String AV13W_A821_JS ;
   private String A58TBM01_SYS_ID ;
   private String A608TBM01_SYS_VALUE ;
   private String A351TBM01_DEL_FLG ;
   private String A609TBM01_NOTE ;
   private String AV31W_AUTH_PWD ;
   private String AV32W_AUTH_EKEY ;
   private String AV14W_ERRCD ;
   private String AV12W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice radavD_auth ;
   private HTMLChoice radavD_server_del_flg ;
   private HTMLChoice radavD_mail_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H002L2_A58TBM01_SYS_ID ;
   private String[] H002L2_A608TBM01_SYS_VALUE ;
   private boolean[] H002L2_n608TBM01_SYS_VALUE ;
   private String[] H002L2_A351TBM01_DEL_FLG ;
   private boolean[] H002L2_n351TBM01_DEL_FLG ;
   private String[] H002L2_A609TBM01_NOTE ;
   private boolean[] H002L2_n609TBM01_NOTE ;
   private GxObjectCollection AV26W_TBM01_SYS_ID_C ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class a214_wp01_send_mail_info__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A58TBM01_SYS_ID ,
                                          GxObjectCollection AV26W_TBM01_SYS_ID_C )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE`, `TBM01_DEL_FLG`, `TBM01_NOTE` FROM `TBM01_SYSTEM`" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("mysql", AV26W_TBM01_SYS_ID_C, "`TBM01_SYS_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM01_SYS_ID`" ;
      GXv_Object6[0] = scmdbuf ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H002L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GxObjectCollection)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
      }
   }

}

