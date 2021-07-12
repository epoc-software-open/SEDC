/*
               File: a211_wp01_import_cdisc_item_impl
        Description: ドメイン変数取込画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:23.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a211_wp01_import_cdisc_item_impl extends GXWebPanel
{
   public a211_wp01_import_cdisc_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a211_wp01_import_cdisc_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a211_wp01_import_cdisc_item_impl.class ));
   }

   public a211_wp01_import_cdisc_item_impl( int remoteHandle ,
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
            AV15P_MOVE_KBN = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_MOVE_KBN", GXutil.ltrim( GXutil.str( AV15P_MOVE_KBN, 4, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14P_DOM_CD", AV14P_DOM_CD);
            }
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
         pa1X2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1X2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1X2( ) ;
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
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151330241");
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
      GXEncryptionTmp = "a211_wp01_import_cdisc_item"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_MOVE_KBN,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a211_wp01_import_cdisc_item") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1X2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV15P_MOVE_KBN, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV14P_DOM_CD));
      GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV11D_UPLOAD_FILE));
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
      return "A211_WP01_IMPORT_CDISC_ITEM" ;
   }

   public String getPgmdesc( )
   {
      return "ドメイン変数取込画面" ;
   }

   public void wb1X0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1X2( true) ;
      }
      else
      {
         wb_table1_2_1X2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_71_1X2( true) ;
      }
      else
      {
         wb_table2_71_1X2( false) ;
      }
      return  ;
   }

   public void wb_table2_71_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1X2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ドメイン変数取込画面", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0069") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0069", "");
         }
      }
      wbErr = false ;
      strup1X0( ) ;
   }

   public void ws1X2( )
   {
      start1X2( ) ;
      evt1X2( ) ;
   }

   public void evt1X2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111X2 */
                        e111X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121X2 */
                        e121X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131X2 */
                        e131X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141X2 */
                        e141X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151X2 */
                        e151X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161X2 */
                        e161X2 ();
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
                  else if ( nCmpId == 69 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0069") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0069", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1X2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1X2( ) ;
         }
      }
   }

   public void pa1X2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a211_wp01_import_cdisc_item")), "a211_wp01_import_cdisc_item") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a211_wp01_import_cdisc_item"))) ;
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
                  AV15P_MOVE_KBN = (short)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15P_MOVE_KBN", GXutil.ltrim( GXutil.str( AV15P_MOVE_KBN, 4, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV14P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14P_DOM_CD", AV14P_DOM_CD);
                  }
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
      rf1X2( ) ;
      /* End function Refresh */
   }

   public void rf1X2( )
   {
      /* Execute user event: e141X2 */
      e141X2 ();
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
         /* Execute user event: e161X2 */
         e161X2 ();
         wb1X0( ) ;
      }
   }

   public void strup1X0( )
   {
      /* Before Start, stand alone formulas. */
      AV42Pgmname = "A211_WP01_IMPORT_CDISC_ITEM" ;
      AV41Pgmdesc = "ドメイン変数取込画面" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e131X2 */
      e131X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV11D_UPLOAD_FILE = httpContext.cgiGet( edtavD_upload_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPLOAD_FILE", AV11D_UPLOAD_FILE);
         AV38D_VERSION = httpContext.cgiGet( edtavD_version_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38D_VERSION", AV38D_VERSION);
         AV10D_ORIGINAL_NAME = httpContext.cgiGet( edtavD_original_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_ORIGINAL_NAME", AV10D_ORIGINAL_NAME);
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         /* Read saved values. */
         AV15P_MOVE_KBN = (short)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV14P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0069") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0069", "");
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV11D_UPLOAD_FILE)==0) )
         {
            GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
            AV11D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e131X2 */
      e131X2 ();
      if (returnInSub) return;
   }

   public void e131X2( )
   {
      /* Start Routine */
      AV7C_APP_ID = "A210" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      AV8C_GAMEN_TITLE = AV41Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      Form.setCaption( AV8C_GAMEN_TITLE );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV24W_DATETIME = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_DATETIME", localUtil.ttoc( AV24W_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      GXt_char1 = AV31W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV17W_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
      a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31W_FILE_PATH = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31W_FILE_PATH", AV31W_FILE_PATH);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      edtavD_original_name_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_original_name_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavD_original_name_Visible, 5, 0)));
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV7C_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0069",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e141X2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV12H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      edtavD_upload_file_Display = (short)(2) ;
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e111X2( )
   {
      /* 'BTN_UPLOAD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         edtavD_version_Backcolor = UIFactory.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_version_Backcolor, 9, 0)));
         AV28W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
         if ( (GXutil.strcmp("", AV11D_UPLOAD_FILE)==0) )
         {
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
         }
         else
         {
            AV33W_LEN = GXutil.len( AV10D_ORIGINAL_NAME) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33W_LEN", GXutil.ltrim( GXutil.str( AV33W_LEN, 10, 0)));
            if ( AV33W_LEN > 4 )
            {
               AV35W_POS = (short)(AV33W_LEN-4+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35W_POS", GXutil.ltrim( GXutil.str( AV35W_POS, 4, 0)));
               AV37W_STR = GXutil.lower( GXutil.substring( AV10D_ORIGINAL_NAME, AV35W_POS, 4)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37W_STR", AV37W_STR);
               if ( GXutil.strcmp(AV37W_STR, ".xls") != 0 )
               {
                  AV28W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
               }
            }
            else
            {
               AV28W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            }
         }
         if ( AV28W_ERRFLG )
         {
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "xlsファイル", "", "", "", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            httpContext.GX_msglist.addItem(AV34W_MSG);
         }
         if ( (GXutil.strcmp("", AV38D_VERSION)==0) )
         {
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            edtavD_version_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_version_Backcolor, 9, 0)));
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "取込バージョン", "", "", "", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            httpContext.GX_msglist.addItem(AV34W_MSG);
         }
         if ( ! AV28W_ERRFLG )
         {
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00026", "xlsファイル", "アップロード", "", "", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            GXt_char1 = AV19W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV34W_MSG, "", "BTN_UPLOAD_EXEC", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            AV19W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19W_A821_JS", AV19W_A821_JS);
         }
      }
   }

   public void e151X2( )
   {
      /* 'BTN_UPLOAD_EXEC' Routine */
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e121X2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a212_wp01_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_MOVE_KBN,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14P_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
   }

   public void S162( )
   {
      /* 'SUB_UPLOAD' Routine */
      AV5A211_SD01_IMPORT_C.clear();
      AV25W_ERR_CD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
      AV36W_RET = AV29W_EXCEL.Open(AV11D_UPLOAD_FILE) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36W_RET", GXutil.ltrim( GXutil.str( AV36W_RET, 4, 0)));
      if ( AV36W_RET != 0 )
      {
         AV25W_ERR_CD = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00016", "", "", "", "", "", GXv_char2) ;
         a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
         AV26W_ERR_MSG.add(AV34W_MSG, 0);
      }
      if ( AV25W_ERR_CD == 0 )
      {
         AV37W_STR = AV29W_EXCEL.Cells(1, 1, 1, 1).getText() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37W_STR", AV37W_STR);
         if ( ! (GXutil.strcmp("", AV37W_STR)==0) )
         {
            AV21W_CELL_1_4 = AV29W_EXCEL.Cells(1, 4, 1, 1).getText() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_CELL_1_4", AV21W_CELL_1_4);
            AV21W_CELL_1_4 = GXutil.strReplace( AV21W_CELL_1_4, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_CELL_1_4", AV21W_CELL_1_4);
            AV21W_CELL_1_4 = GXutil.strReplace( AV21W_CELL_1_4, GXutil.chr( (short)(13)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_CELL_1_4", AV21W_CELL_1_4);
            AV21W_CELL_1_4 = GXutil.strReplace( AV21W_CELL_1_4, GXutil.chr( (short)(10)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_CELL_1_4", AV21W_CELL_1_4);
            AV20W_CELL_1_10 = AV29W_EXCEL.Cells(1, 10, 1, 1).getText() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_CELL_1_10", AV20W_CELL_1_10);
            AV20W_CELL_1_10 = GXutil.strReplace( AV20W_CELL_1_10, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_CELL_1_10", AV20W_CELL_1_10);
            AV20W_CELL_1_10 = GXutil.strReplace( AV20W_CELL_1_10, GXutil.chr( (short)(13)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_CELL_1_10", AV20W_CELL_1_10);
            AV20W_CELL_1_10 = GXutil.strReplace( AV20W_CELL_1_10, GXutil.chr( (short)(10)), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_CELL_1_10", AV20W_CELL_1_10);
            if ( ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 1, 1, 1).getText(), "Seq. For Order") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 2, 1, 1).getText(), "Observation Class") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 3, 1, 1).getText(), "Domain Prefix") != 0 ) || ( GXutil.strcmp(AV21W_CELL_1_4, "Variable Name (minus domain prefix)") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 5, 1, 1).getText(), "Variable Name") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 6, 1, 1).getText(), "Variable Label") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 7, 1, 1).getText(), "Type") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 8, 1, 1).getText(), "Controlled Terms, Codelist or Format") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 9, 1, 1).getText(), "Role") != 0 ) || ( GXutil.strcmp(AV20W_CELL_1_10, "CDISC Notes (for domains)Description (for General Classes)") != 0 ) || ( GXutil.strcmp(AV29W_EXCEL.Cells(1, 11, 1, 1).getText(), "Core") != 0 ) )
            {
               AV29W_EXCEL.Close();
               AV25W_ERR_CD = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
               GXt_char1 = AV34W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00031", "", "", "", "", "", GXv_char2) ;
               a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
               AV34W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
               AV26W_ERR_MSG.add(AV34W_MSG, 0);
            }
         }
         else
         {
            AV29W_EXCEL.Close();
            AV25W_ERR_CD = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00031", "", "", "", "", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            AV26W_ERR_MSG.add(AV34W_MSG, 0);
         }
      }
      if ( AV25W_ERR_CD == 0 )
      {
         AV22W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22W_CNT", GXutil.ltrim( GXutil.str( AV22W_CNT, 10, 0)));
         while ( AV36W_RET == 0 )
         {
            AV22W_CNT = (long)(AV22W_CNT+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22W_CNT", GXutil.ltrim( GXutil.str( AV22W_CNT, 10, 0)));
            if ( AV22W_CNT > 1 )
            {
               if ( (GXutil.strcmp("", AV29W_EXCEL.Cells((int)(AV22W_CNT), 5, 1, 1).getText())==0) )
               {
                  if (true) break;
               }
               else
               {
                  if ( GXutil.len( AV29W_EXCEL.Cells((int)(AV22W_CNT), 3, 1, 1).getText()) == 2 )
                  {
                     AV6A211_SD01_IMPORT_I = (SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem)new SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem(remoteHandle, context);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd( AV29W_EXCEL.Cells((int)(AV22W_CNT), 3, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm( AV29W_EXCEL.Cells((int)(AV22W_CNT), 5, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc( AV29W_EXCEL.Cells((int)(AV22W_CNT), 6, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg( "1" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg( "0" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     if ( GXutil.strcmp(AV29W_EXCEL.Cells((int)(AV22W_CNT), 7, 1, 1).getText(), "Num") == 0 )
                     {
                        AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div( "1" );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     }
                     else
                     {
                        AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div( "0" );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     }
                     if ( GXutil.strcmp(AV29W_EXCEL.Cells((int)(AV22W_CNT), 11, 1, 1).getText(), "Req") == 0 )
                     {
                        AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg( "1" );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     }
                     else
                     {
                        AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg( "0" );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     }
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm( AV29W_EXCEL.Cells((int)(AV22W_CNT), 5, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type( "text" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note( AV29W_EXCEL.Cells((int)(AV22W_CNT), 10, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order( (int)(GXutil.lval( AV29W_EXCEL.Cells((int)(AV22W_CNT), 1, 1, 1).getText())) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV6A211_SD01_IMPORT_I.setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm( AV29W_EXCEL.Cells((int)(AV22W_CNT), 2, 1, 1).getText() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6A211_SD01_IMPORT_I", AV6A211_SD01_IMPORT_I);
                     AV5A211_SD01_IMPORT_C.add(AV6A211_SD01_IMPORT_I, 0);
                  }
               }
            }
         }
         AV29W_EXCEL.Close();
      }
      if ( AV5A211_SD01_IMPORT_C.size() > 0 )
      {
         GXv_int3[0] = AV25W_ERR_CD ;
         GXv_objcol_svchar4[0] = AV26W_ERR_MSG ;
         new a211_pc01_cdisc_item_reg(remoteHandle, context).execute( AV38D_VERSION, AV5A211_SD01_IMPORT_C, GXv_int3, GXv_objcol_svchar4) ;
         a211_wp01_import_cdisc_item_impl.this.AV25W_ERR_CD = GXv_int3[0] ;
         AV26W_ERR_MSG = GXv_objcol_svchar4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38D_VERSION", AV38D_VERSION);
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
         if ( AV25W_ERR_CD != 0 )
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "a211_wp01_import_cdisc_item");
         }
         else
         {
            Application.commit(context, remoteHandle, "DEFAULT", "a211_wp01_import_cdisc_item");
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00017", "Version："+AV38D_VERSION, "", "", "", "", GXv_char2) ;
            a211_wp01_import_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            httpContext.GX_msglist.addItem(AV34W_MSG);
         }
      }
      if ( AV25W_ERR_CD != 0 )
      {
         AV43GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrim( GXutil.str( AV43GXV1, 8, 0)));
         while ( AV43GXV1 <= AV26W_ERR_MSG.size() )
         {
            AV34W_MSG = (String)AV26W_ERR_MSG.elementAt(-1+AV43GXV1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_MSG", AV34W_MSG);
            httpContext.GX_msglist.addItem(AV34W_MSG);
            AV43GXV1 = (int)(AV43GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrim( GXutil.str( AV43GXV1, 8, 0)));
         }
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      a211_wp01_import_cdisc_item_impl.this.AV27W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
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
      AV19W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_A821_JS", AV19W_A821_JS);
      AV18W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18W_A819_JS", AV18W_A819_JS);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV19W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV19W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"confirmFlg = true;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      else
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"confirmFlg = false;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV18W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV18W_A819_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var upFile = document.getElementById('"+edtavD_upload_file_Internalname+"');" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (upFile.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.addEventListener('focus', function(){upFileBlur();}, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.attachEvent('onfocus',function(){upFileBlur();});" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	upFileBlur();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function upFileBlur() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	setTimeout('document.getElementById(\\'"+edtavD_upload_file_Internalname+"\\').blur()',300);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "<script language=\"javascript\">" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"function func_copyParams(){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"var _filename = MAINFORM."+edtavD_upload_file_Internalname+".value;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"MAINFORM."+edtavD_original_name_Internalname+".value = _filename.substring(_filename.lastIndexOf('\\\\')+1, _filename.length);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"return true;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblTxt_btn_upload_Jsonclick = "func_copyParams()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upload_Internalname, "Jsonclick", lblTxt_btn_upload_Jsonclick);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV13H_KNGN_FLG ;
      GXv_char6[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_APP_ID, GXv_char2, GXv_char6) ;
      a211_wp01_import_cdisc_item_impl.this.AV13H_KNGN_FLG = GXv_char2[0] ;
      a211_wp01_import_cdisc_item_impl.this.AV27W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S172( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a211_wp01_import_cdisc_item");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e161X2( )
   {
      /* Load Routine */
   }

   public void wb_table2_71_1X2( boolean wbgen )
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
         httpContext.writeText( "<p>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblText_onclick_Internalname, lblText_onclick_Caption, "", "", lblText_onclick_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upload_exec_Internalname, "BTN_UPLOAD_EXEC", "", "", lblBtn_upload_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_71_1X2e( true) ;
      }
      else
      {
         wb_table2_71_1X2e( false) ;
      }
   }

   public void wb_table1_2_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_1X2( true) ;
      }
      else
      {
         wb_table3_6_1X2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1X2e( boolean wbgen )
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
         wb_table1_2_1X2e( true) ;
      }
      else
      {
         wb_table1_2_1X2e( false) ;
      }
   }

   public void wb_table3_6_1X2( boolean wbgen )
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
         wb_table4_12_1X2( true) ;
      }
      else
      {
         wb_table4_12_1X2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_20_1X2( true) ;
      }
      else
      {
         wb_table5_20_1X2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0069"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0069"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0069"+"");
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
         wb_table3_6_1X2e( true) ;
      }
      else
      {
         wb_table3_6_1X2e( false) ;
      }
   }

   public void wb_table5_20_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 279, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 843, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:46px;width:850px\">") ;
         wb_table6_23_1X2( true) ;
      }
      else
      {
         wb_table6_23_1X2( false) ;
      }
      return  ;
   }

   public void wb_table6_23_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_34_1X2( true) ;
      }
      else
      {
         wb_table7_34_1X2( false) ;
      }
      return  ;
   }

   public void wb_table7_34_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_original_name_Internalname, GXutil.rtrim( AV10D_ORIGINAL_NAME), GXutil.rtrim( localUtil.format( AV10D_ORIGINAL_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_original_name_Jsonclick, 0, "Attribute", "", "", "", edtavD_original_name_Visible, edtavD_original_name_Enabled, 0, "text", "", 220, "px", 15, "px", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table8_62_1X2( true) ;
      }
      else
      {
         wb_table8_62_1X2( false) ;
      }
      return  ;
   }

   public void wb_table8_62_1X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_1X2e( true) ;
      }
      else
      {
         wb_table5_20_1X2e( false) ;
      }
   }

   public void wb_table8_62_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody></tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_62_1X2e( true) ;
      }
      else
      {
         wb_table8_62_1X2e( false) ;
      }
   }

   public void wb_table7_34_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:15px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "【注意事項】", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:30px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "(1)", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "取込ファイルは「CDISC eSHARE Standards Catalog内にある、SDTM IGエクセルフォーマット（バージョン3.2）」に対応しています。", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "注）CDSICの仕様変更により、フォーマットが変更された場合、取り込めない場合があります。", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "(2)", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "ファイル内のシートにフィルタが設定されている場合、すべて解除してください。（フィルタがあるとファイルが読み込めません）", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_34_1X2e( true) ;
      }
      else
      {
         wb_table7_34_1X2e( false) ;
      }
   }

   public void wb_table6_23_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:150px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "SDTMファイル(xls形式）", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         edtavD_upload_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
         if ( ! (GXutil.strcmp("", AV11D_UPLOAD_FILE)==0) )
         {
            gxblobfileaux.setSource( AV11D_UPLOAD_FILE );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavD_upload_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavD_upload_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV11D_UPLOAD_FILE = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPLOAD_FILE", AV11D_UPLOAD_FILE);
               edtavD_upload_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtavD_upload_file_Internalname, GXutil.rtrim( AV11D_UPLOAD_FILE), httpContext.getResourceRelative(AV11D_UPLOAD_FILE), ((GXutil.strcmp("", edtavD_upload_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavD_upload_file_Filetype)==0) ? AV11D_UPLOAD_FILE : edtavD_upload_file_Filetype)) : edtavD_upload_file_Contenttype), false, "", edtavD_upload_file_Parameters, edtavD_upload_file_Display, 1, 1, "", "", 0, 0, 300, "px", 16, "px", 0, 0, 0, edtavD_upload_file_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(28);\"", "", "", "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "URL", httpContext.getResourceRelative(AV11D_UPLOAD_FILE));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "取込バージョン", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_version_Internalname, GXutil.rtrim( AV38D_VERSION), GXutil.rtrim( localUtil.format( AV38D_VERSION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_version_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_version_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_23_1X2e( true) ;
      }
      else
      {
         wb_table6_23_1X2e( false) ;
      }
   }

   public void wb_table4_12_1X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upload_Internalname, "アップロード（F3）", "", "", lblTxt_btn_upload_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_A211_WP01_IMPORT_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1X2e( true) ;
      }
      else
      {
         wb_table4_12_1X2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV15P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_MOVE_KBN", GXutil.ltrim( GXutil.str( AV15P_MOVE_KBN, 4, 0)));
      AV14P_DOM_CD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_DOM_CD", AV14P_DOM_CD);
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
      pa1X2( ) ;
      ws1X2( ) ;
      we1X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513302490");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a211_wp01_import_cdisc_item.js", "?202071513302490");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_upload_Internalname = "TXT_BTN_UPLOAD" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_upload_file_Internalname = "vD_UPLOAD_FILE" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavD_version_Internalname = "vD_VERSION" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      tblTable5_Internalname = "TABLE5" ;
      edtavD_original_name_Internalname = "vD_ORIGINAL_NAME" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblText_onclick_Internalname = "TEXT_ONCLICK" ;
      lblBtn_upload_exec_Internalname = "BTN_UPLOAD_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_version_Jsonclick = "" ;
      edtavD_version_Backstyle = (byte)(-1) ;
      edtavD_upload_file_Jsonclick = "" ;
      edtavD_upload_file_Parameters = "" ;
      edtavD_upload_file_Contenttype = "text/csv" ;
      edtavD_upload_file_Filetype = "" ;
      edtavD_upload_file_Display = (short)(0) ;
      edtavD_original_name_Jsonclick = "" ;
      edtavD_original_name_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblText_onclick_Jsonclick = "" ;
      edtavD_version_Backcolor = (int)(0xFFFFFF) ;
      edtavD_original_name_Visible = 1 ;
      lblText_onclick_Caption = "Text_onclick" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      Form.setCaption( "ドメイン変数取込画面" );
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
      AV29W_EXCEL.cleanup();
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
                  /* Execute user subroutine: S172 */
                  S172 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV14P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14P_DOM_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXCCtlgxBlob = "" ;
      AV11D_UPLOAD_FILE = "" ;
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
      AV42Pgmname = "" ;
      AV41Pgmdesc = "" ;
      AV38D_VERSION = "" ;
      AV10D_ORIGINAL_NAME = "" ;
      AV12H_INIT_FLG = "" ;
      AV13H_KNGN_FLG = "" ;
      AV7C_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV24W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV31W_FILE_PATH = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV37W_STR = "" ;
      AV34W_MSG = "" ;
      AV19W_A821_JS = "" ;
      AV5A211_SD01_IMPORT_C = new GxObjectCollection(SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem.class, "A211_SD01_IMPORT.A211_SD01_IMPORTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV29W_EXCEL = new com.genexus.gxoffice.ExcelDoc();
      AV26W_ERR_MSG = new GxObjectCollection(String.class, "internal", "");
      AV21W_CELL_1_4 = "" ;
      AV20W_CELL_1_10 = "" ;
      AV6A211_SD01_IMPORT_I = new SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem(remoteHandle, context);
      GXv_int3 = new short [1] ;
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV18W_A819_JS = "" ;
      lblTxt_btn_upload_Jsonclick = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_upload_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      lblTextblock17_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a211_wp01_import_cdisc_item__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV42Pgmname = "A211_WP01_IMPORT_CDISC_ITEM" ;
      AV41Pgmdesc = "ドメイン変数取込画面" ;
      /* GeneXus formulas. */
      AV42Pgmname = "A211_WP01_IMPORT_CDISC_ITEM" ;
      AV41Pgmdesc = "ドメイン変数取込画面" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte edtavD_version_Backstyle ;
   private short wcpOAV15P_MOVE_KBN ;
   private short AV15P_MOVE_KBN ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short edtavD_upload_file_Display ;
   private short AV35W_POS ;
   private short AV25W_ERR_CD ;
   private short AV36W_RET ;
   private short GXv_int3[] ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_original_name_Visible ;
   private int edtavD_version_Backcolor ;
   private int AV43GXV1 ;
   private int GXActiveErrHndl ;
   private int edtavD_original_name_Enabled ;
   private int idxLst ;
   private long AV33W_LEN ;
   private long AV22W_CNT ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXCCtlgxBlob ;
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
   private String AV42Pgmname ;
   private String AV41Pgmdesc ;
   private String edtavD_upload_file_Internalname ;
   private String edtavD_version_Internalname ;
   private String edtavD_original_name_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblText_onclick_Caption ;
   private String lblText_onclick_Internalname ;
   private String GXt_char1 ;
   private String lblTxt_btn_upload_Jsonclick ;
   private String lblTxt_btn_upload_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblText_onclick_Jsonclick ;
   private String lblBtn_upload_exec_Internalname ;
   private String lblBtn_upload_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String edtavD_original_name_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String tblTable5_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_upload_file_Filetype ;
   private String edtavD_upload_file_Contenttype ;
   private String edtavD_upload_file_Parameters ;
   private String edtavD_upload_file_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavD_version_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date AV24W_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV28W_ERRFLG ;
   private String AV11D_UPLOAD_FILE ;
   private String wcpOAV14P_DOM_CD ;
   private String AV14P_DOM_CD ;
   private String AV38D_VERSION ;
   private String AV10D_ORIGINAL_NAME ;
   private String AV12H_INIT_FLG ;
   private String AV13H_KNGN_FLG ;
   private String AV7C_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV31W_FILE_PATH ;
   private String AV37W_STR ;
   private String AV34W_MSG ;
   private String AV19W_A821_JS ;
   private String AV21W_CELL_1_4 ;
   private String AV20W_CELL_1_10 ;
   private String AV27W_ERRCD ;
   private String AV18W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.gxoffice.ExcelDoc AV29W_EXCEL ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV5A211_SD01_IMPORT_C ;
   private GxObjectCollection AV26W_ERR_MSG ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem AV6A211_SD01_IMPORT_I ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
}

final  class a211_wp01_import_cdisc_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

