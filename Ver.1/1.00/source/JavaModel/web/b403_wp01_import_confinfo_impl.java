/*
               File: b403_wp01_import_confinfo_impl
        Description: 患者・適格性確認情報取込
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:5:18.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b403_wp01_import_confinfo_impl extends GXWebPanel
{
   public b403_wp01_import_confinfo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b403_wp01_import_confinfo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b403_wp01_import_confinfo_impl.class ));
   }

   public b403_wp01_import_confinfo_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_study_id = new HTMLChoice();
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
            AV21P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21P_MOVE_KBN", GXutil.str( AV21P_MOVE_KBN, 1, 0));
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa1E2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1E2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1E2( ) ;
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
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "患者・適格性確認情報取込") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
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
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b403_wp01_import_confinfo") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1E2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV21P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
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

   public void wb1E0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1E2( true) ;
      }
      else
      {
         wb_table1_2_1E2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_41_1E2( true) ;
      }
      else
      {
         wb_table2_41_1E2( false) ;
      }
      return  ;
   }

   public void wb_table2_41_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "患者・適格性確認情報取込", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0039") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0039", "");
         }
      }
      wbErr = false ;
      strup1E0( ) ;
   }

   public void ws1E2( )
   {
      start1E2( ) ;
      evt1E2( ) ;
   }

   public void evt1E2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111E2 */
                        e111E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121E2 */
                        e121E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131E2 */
                        e131E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141E2 */
                        e141E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151E2 */
                        e151E2 ();
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
                  else if ( nCmpId == 39 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0039") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0039", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1E2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1E2( ) ;
         }
      }
   }

   public void pa1E2( )
   {
      if ( nDonePA == 0 )
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
         if ( ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
         {
            if ( nGotPars == 0 )
            {
               entryPointCalled = false ;
               gxfirstwebparm = httpContext.GetNextPar( ) ;
               if ( ! entryPointCalled )
               {
                  AV21P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21P_MOVE_KBN", GXutil.str( AV21P_MOVE_KBN, 1, 0));
               }
            }
         }
         cmbavD_study_id.setName( "vD_STUDY_ID" );
         cmbavD_study_id.setWebtags( "" );
         if ( ( cmbavD_study_id.getItemCount() > 0 ) && (0==AV8D_STUDY_ID) )
         {
            AV8D_STUDY_ID = GXutil.lval( cmbavD_study_id.getItemValue((short)(1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
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
      rf1E2( ) ;
      /* End function Refresh */
   }

   public void rf1E2( )
   {
      /* Execute user event: e131E2 */
      e131E2 ();
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
         /* Execute user event: e151E2 */
         e151E2 ();
         wb1E0( ) ;
      }
   }

   public void strup1E0( )
   {
      /* Before Start, stand alone formulas. */
      AV25Pgmname = "B403_WP01_IMPORT_CONFINFO" ;
      AV24Pgmdesc = "患者・適格性確認情報取込" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e121E2 */
      e121E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         cmbavD_study_id.setValue( httpContext.cgiGet( cmbavD_study_id.getInternalname()) );
         AV8D_STUDY_ID = GXutil.lval( httpContext.cgiGet( cmbavD_study_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         AV9H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         AV10H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
         /* Read saved values. */
         AV21P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0039") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0039", "");
         }
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
      /* Execute user event: e121E2 */
      e121E2 ();
      if (returnInSub) return;
   }

   public void e121E2( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B403" ;
      AV5C_GAMEN_TITLE = AV24Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV9H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Object Property */
      if ( GXutil.strcmp(WebComp_Webcomp1_Component, "A104_WP01_HEADER") != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "a104_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "A104_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV11W_A_LOGIN_SDT,AV6C_APP_ID,AV5C_GAMEN_TITLE,""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","",""});
      }
      /* Object Property */
      if ( GXutil.strcmp(WebComp_Webcomp2_Component, "A104_WP02_FOOTER") != 0 )
      {
         WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "a104_wp02_footer_impl", remoteHandle, context);
         WebComp_Webcomp2_Component = "A104_WP02_FOOTER" ;
      }
      if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
      {
         WebComp_Webcomp2.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
      {
         WebComp_Webcomp2.componentprepare(new Object[] {"W0039",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e131E2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV9H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
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

   public void e111E2( )
   {
      /* 'BTN_IMPORT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV10H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         GXv_char3[0] = AV18W_MSG ;
         new b403_pc01_check(remoteHandle, context).execute( AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), AV7W_PWD, AV8D_STUDY_ID, GXv_char3) ;
         b403_wp01_import_confinfo_impl.this.AV18W_MSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11W_A_LOGIN_SDT", AV11W_A_LOGIN_SDT);
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         AV7W_PWD = "" ;
         if ( (GXutil.strcmp("", AV18W_MSG)==0) )
         {
            GXt_char2 = AV18W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
            b403_wp01_import_confinfo_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18W_MSG = GXt_char2 ;
            GXt_char2 = AV13W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV18W_MSG, "", "BTN_IMPORT_EXEC", "", GXv_char3) ;
            b403_wp01_import_confinfo_impl.this.GXt_char2 = GXv_char3[0] ;
            AV13W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e141E2( )
   {
      /* 'BTN_IMPORT_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV10H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         GXv_char3[0] = AV18W_MSG ;
         new b403_pc02_import(remoteHandle, context).execute( AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), AV7W_PWD, AV8D_STUDY_ID, GXv_char3) ;
         b403_wp01_import_confinfo_impl.this.AV18W_MSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11W_A_LOGIN_SDT", AV11W_A_LOGIN_SDT);
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         AV7W_PWD = "" ;
         httpContext.GX_msglist.addItem(AV18W_MSG);
      }
   }

   public void S162( )
   {
      /* 'SUB_GET_PASSWORD' Routine */
      /* Using cursor H001E2 */
      pr_default.execute(0, new Object[] {AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A16TAM07_DEL_FLG = H001E2_A16TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         n16TAM07_DEL_FLG = H001E2_n16TAM07_DEL_FLG[0] ;
         A8TAM07_USER_ID = H001E2_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         A7TAM07_PWD = H001E2_A7TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
         n7TAM07_PWD = H001E2_n7TAM07_PWD[0] ;
         AV7W_PWD = A7TAM07_PWD ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S142( )
   {
      /* 'SUB_GET_STUDY_LIST' Routine */
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      GXv_SdtB602_SD02_DB_LIST4[0] = AV15W_DB_LIST;
      GXv_int5[0] = AV19W_RTN_CD ;
      GXv_char3[0] = AV20W_RTN_MSG ;
      new b602_pc02_crfif_view_databaselist(remoteHandle, context).execute( AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), AV7W_PWD, GXv_SdtB602_SD02_DB_LIST4, GXv_int5, GXv_char3) ;
      AV15W_DB_LIST = GXv_SdtB602_SD02_DB_LIST4[0] ;
      b403_wp01_import_confinfo_impl.this.AV19W_RTN_CD = (byte)((byte)(GXv_int5[0])) ;
      b403_wp01_import_confinfo_impl.this.AV20W_RTN_MSG = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11W_A_LOGIN_SDT", AV11W_A_LOGIN_SDT);
      AV7W_PWD = "" ;
      AV17W_FLG = "0" ;
      cmbavD_study_id.removeAllItems();
      cmbavD_study_id.addItem("         0", "", (short)(0));
      if ( AV19W_RTN_CD == 0 )
      {
         AV27GXV1 = 1 ;
         while ( AV27GXV1 <= AV15W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Db().size() )
         {
            AV14W_DB_ITEM = (SdtB602_SD02_DB_LIST_DBItem)((SdtB602_SD02_DB_LIST_DBItem)AV15W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Db().elementAt(-1+AV27GXV1));
            /* Using cursor H001E3 */
            pr_default.execute(1, new Object[] {new Long(AV14W_DB_ITEM.getgxTv_SdtB602_SD02_DB_LIST_DBItem_Id())});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A189TBM21_DEL_FLG = H001E3_A189TBM21_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
               n189TBM21_DEL_FLG = H001E3_n189TBM21_DEL_FLG[0] ;
               A513TBM21_STATUS = H001E3_A513TBM21_STATUS[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
               n513TBM21_STATUS = H001E3_n513TBM21_STATUS[0] ;
               A186TBM21_STUDY_ID = H001E3_A186TBM21_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
               A187TBM21_STUDY_NM = H001E3_A187TBM21_STUDY_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
               n187TBM21_STUDY_NM = H001E3_n187TBM21_STUDY_NM[0] ;
               cmbavD_study_id.addItem(GXutil.str( A186TBM21_STUDY_ID, 10, 0), GXutil.str( A186TBM21_STUDY_ID, 10, 0)+" "+A187TBM21_STUDY_NM, (short)(0));
               AV17W_FLG = "1" ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV27GXV1 = (int)(AV27GXV1+1) ;
         }
         if ( GXutil.strcmp(AV17W_FLG, "0") == 0 )
         {
            GXt_char2 = AV18W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char3) ;
            b403_wp01_import_confinfo_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV18W_MSG);
            lblTxt_btn_import_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_import_Visible, 5, 0)));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20W_RTN_MSG);
         lblTxt_btn_import_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_import_Visible, 5, 0)));
      }
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV11W_A_LOGIN_SDT;
      GXv_char3[0] = AV16W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char3) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b403_wp01_import_confinfo_impl.this.AV16W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV13W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV13W_A821_JS ;
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

   public void S122( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char3[0] = AV10H_KNGN_FLG ;
      GXv_char7[0] = AV16W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char3, GXv_char7) ;
      b403_wp01_import_confinfo_impl.this.AV10H_KNGN_FLG = GXv_char3[0] ;
      b403_wp01_import_confinfo_impl.this.AV16W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
      if ( GXutil.strcmp(AV16W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S18306( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b403_wp01_import_confinfo");
   }

   public void S172( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean8 = false ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV10H_KNGN_FLG, "", GXv_boolean9) ;
      b403_wp01_import_confinfo_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
      lblTxt_btn_import_Visible = (GXt_boolean8 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_import_Visible, 5, 0)));
   }

   protected void nextLoad( )
   {
   }

   protected void e151E2( )
   {
      /* Load Routine */
   }

   public void wb_table2_41_1E2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV10H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV10H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_41_1E2e( true) ;
      }
      else
      {
         wb_table2_41_1E2e( false) ;
      }
   }

   public void wb_table1_2_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table3_6_1E2( true) ;
      }
      else
      {
         wb_table3_6_1E2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "2c4dd041-bc05-4078-b5a7-f8ce2f3cf741", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1E2e( true) ;
      }
      else
      {
         wb_table1_2_1E2e( false) ;
      }
   }

   public void wb_table3_6_1E2( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0009"+"", GXutil.rtrim( WebComp_Webcomp1_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0009"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0009"+"");
            }
            WebComp_Webcomp1.componentdraw();
            if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td id=\""+cellMenu_bg_Internalname+"\"  class=''>") ;
         wb_table4_12_1E2( true) ;
      }
      else
      {
         wb_table4_12_1E2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_18_1E2( true) ;
      }
      else
      {
         wb_table5_18_1E2( false) ;
      }
      return  ;
   }

   public void wb_table5_18_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0039"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0039"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0039"+"");
            }
            WebComp_Webcomp2.componentdraw();
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
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
         wb_table3_6_1E2e( true) ;
      }
      else
      {
         wb_table3_6_1E2e( false) ;
      }
   }

   public void wb_table5_18_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_1E2( true) ;
      }
      else
      {
         wb_table6_21_1E2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_1E2e( true) ;
      }
      else
      {
         wb_table5_18_1E2e( false) ;
      }
   }

   public void wb_table6_21_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_24_1E2( true) ;
      }
      else
      {
         wb_table7_24_1E2( false) ;
      }
      return  ;
   }

   public void wb_table7_24_1E2e( boolean wbgen )
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_21_1E2e( true) ;
      }
      else
      {
         wb_table6_21_1E2e( false) ;
      }
   }

   public void wb_table7_24_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.str( AV8D_STUDY_ID, 10, 0), 1, cmbavD_study_id.getJsonclick(), 0, "", "int", "", 1, 1, 0, (short)(0), 800, "px", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "", true, "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         cmbavD_study_id.setValue( GXutil.str( AV8D_STUDY_ID, 10, 0) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_1E2e( true) ;
      }
      else
      {
         wb_table7_24_1E2e( false) ;
      }
   }

   public void wb_table4_12_1E2( boolean wbgen )
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
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_import_Internalname, "取込（F3）", "", "", lblTxt_btn_import_Jsonclick, "E\\'BTN_IMPORT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_import_Visible, 1, (short)(0), "HLP_B403_WP01_IMPORT_CONFINFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1E2e( true) ;
      }
      else
      {
         wb_table4_12_1E2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV21P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21P_MOVE_KBN", GXutil.str( AV21P_MOVE_KBN, 1, 0));
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
      pa1E2( ) ;
      ws1E2( ) ;
      we1E2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1551881");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b403_wp01_import_confinfo.js", "?1551881");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_import_Internalname = "TXT_BTN_IMPORT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbavD_study_id.setInternalname( "vD_STUDY_ID" );
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
      lblTxt_btn_import_Visible = 1 ;
      cmbavD_study_id.setJsonclick( "" );
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
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
                  /* Execute user subroutine: S18306 */
                  S18306 ();
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
      AV25Pgmname = "" ;
      AV24Pgmdesc = "" ;
      AV9H_INIT_FLG = "" ;
      AV10H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV7W_PWD = "" ;
      AV18W_MSG = "" ;
      AV13W_A821_JS = "" ;
      scmdbuf = "" ;
      H001E2_A16TAM07_DEL_FLG = new String[] {""} ;
      H001E2_n16TAM07_DEL_FLG = new boolean[] {false} ;
      H001E2_A8TAM07_USER_ID = new String[] {""} ;
      H001E2_A7TAM07_PWD = new String[] {""} ;
      H001E2_n7TAM07_PWD = new boolean[] {false} ;
      A16TAM07_DEL_FLG = "" ;
      A8TAM07_USER_ID = "" ;
      A7TAM07_PWD = "" ;
      AV15W_DB_LIST = new SdtB602_SD02_DB_LIST(remoteHandle, context);
      GXv_SdtB602_SD02_DB_LIST4 = new SdtB602_SD02_DB_LIST [1] ;
      GXv_int5 = new short [1] ;
      AV20W_RTN_MSG = "" ;
      AV17W_FLG = "" ;
      AV14W_DB_ITEM = new SdtB602_SD02_DB_LIST_DBItem(remoteHandle, context);
      H001E3_A189TBM21_DEL_FLG = new String[] {""} ;
      H001E3_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001E3_A513TBM21_STATUS = new String[] {""} ;
      H001E3_n513TBM21_STATUS = new boolean[] {false} ;
      H001E3_A186TBM21_STUDY_ID = new long[1] ;
      H001E3_A187TBM21_STUDY_NM = new String[] {""} ;
      H001E3_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      A187TBM21_STUDY_NM = "" ;
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV16W_ERRCD = "" ;
      AV12W_A819_JS = "" ;
      GXv_char3 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_boolean9 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      GXt_char1 = "" ;
      lblTextblock16_Jsonclick = "" ;
      GXt_char2 = "" ;
      lblTxt_btn_import_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b403_wp01_import_confinfo__default(),
         new Object[] {
             new Object[] {
            H001E2_A16TAM07_DEL_FLG, H001E2_n16TAM07_DEL_FLG, H001E2_A8TAM07_USER_ID, H001E2_A7TAM07_PWD, H001E2_n7TAM07_PWD
            }
            , new Object[] {
            H001E3_A189TBM21_DEL_FLG, H001E3_n189TBM21_DEL_FLG, H001E3_A513TBM21_STATUS, H001E3_n513TBM21_STATUS, H001E3_A186TBM21_STUDY_ID, H001E3_A187TBM21_STUDY_NM, H001E3_n187TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B403_WP01_IMPORT_CONFINFO" ;
      AV24Pgmdesc = "患者・適格性確認情報取込" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B403_WP01_IMPORT_CONFINFO" ;
      AV24Pgmdesc = "患者・適格性確認情報取込" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV21P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV21P_MOVE_KBN ;
   private byte nDonePA ;
   private byte AV19W_RTN_CD ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int tblTbl_hidden_Visible ;
   private int AV27GXV1 ;
   private int lblTxt_btn_import_Visible ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long AV8D_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
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
   private String AV25Pgmname ;
   private String AV24Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_btn_import_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String GXt_char1 ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String GXt_char2 ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_import_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n7TAM07_PWD ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String AV9H_INIT_FLG ;
   private String AV10H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV7W_PWD ;
   private String AV18W_MSG ;
   private String AV13W_A821_JS ;
   private String A16TAM07_DEL_FLG ;
   private String A8TAM07_USER_ID ;
   private String A7TAM07_PWD ;
   private String AV20W_RTN_MSG ;
   private String AV17W_FLG ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private String A187TBM21_STUDY_NM ;
   private String AV16W_ERRCD ;
   private String AV12W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_study_id ;
   private IDataStoreProvider pr_default ;
   private String[] H001E2_A16TAM07_DEL_FLG ;
   private boolean[] H001E2_n16TAM07_DEL_FLG ;
   private String[] H001E2_A8TAM07_USER_ID ;
   private String[] H001E2_A7TAM07_PWD ;
   private boolean[] H001E2_n7TAM07_PWD ;
   private String[] H001E3_A189TBM21_DEL_FLG ;
   private boolean[] H001E3_n189TBM21_DEL_FLG ;
   private String[] H001E3_A513TBM21_STATUS ;
   private boolean[] H001E3_n513TBM21_STATUS ;
   private long[] H001E3_A186TBM21_STUDY_ID ;
   private String[] H001E3_A187TBM21_STUDY_NM ;
   private boolean[] H001E3_n187TBM21_STUDY_NM ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB602_SD02_DB_LIST AV15W_DB_LIST ;
   private SdtB602_SD02_DB_LIST GXv_SdtB602_SD02_DB_LIST4[] ;
   private SdtB602_SD02_DB_LIST_DBItem AV14W_DB_ITEM ;
}

final  class b403_wp01_import_confinfo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001E2", "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_PWD` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001E3", "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_STATUS` IN ('0','1')) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

