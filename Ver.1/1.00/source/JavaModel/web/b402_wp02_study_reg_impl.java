/*
               File: b402_wp02_study_reg_impl
        Description: 試験登録（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:59:21.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp02_study_reg_impl extends GXWebPanel
{
   public b402_wp02_study_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp02_study_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp02_study_reg_impl.class ));
   }

   public b402_wp02_study_reg_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltbm21_status = new HTMLChoice();
      radavCtltbm21_del_flg = new HTMLChoice();
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
            AV13P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13P_STUDY_ID", GXutil.ltrim( GXutil.str( AV13P_STUDY_ID, 10, 0)));
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa0V2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws0V2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we0V2( ) ;
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
      httpContext.writeText( "試験登録（入力）") ;
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
      httpContext.AddJavascriptSource("calendar.js", "?58720");
      httpContext.AddJavascriptSource("calendar-setup.js", "?58720");
      httpContext.AddJavascriptSource("calendar-ja.js", "?58720");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13P_STUDY_ID,10,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0V2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_study", AV5BC_STUDY);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_study", AV5BC_STUDY);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV13P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
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

   public void wb0V0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0V2( true) ;
      }
      else
      {
         wb_table1_2_0V2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_153_0V2( true) ;
      }
      else
      {
         wb_table2_153_0V2( false) ;
      }
      return  ;
   }

   public void wb_table2_153_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "試験登録（入力）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
         }
      }
      wbErr = false ;
      strup0V0( ) ;
   }

   public void ws0V2( )
   {
      start0V2( ) ;
      evt0V2( ) ;
   }

   public void evt0V2( )
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
                        /* Execute user event: e110V2 */
                        e110V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120V2 */
                        e120V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130V2 */
                        e130V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140V2 */
                        e140V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150V2 */
                        e150V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160V2 */
                        e160V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170V2 */
                        e170V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180V2 */
                        e180V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190V2 */
                        e190V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200V2 */
                        e200V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_STAFF'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210V2 */
                        e210V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DETAIL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e220V2 */
                        e220V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SITE'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e230V2 */
                        e230V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_COND'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e240V2 */
                        e240V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DOMAIN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e250V2 */
                        e250V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e260V2 */
                        e260V2 ();
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
                  else if ( nCmpId == 151 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0151") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0151", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0V2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0V2( ) ;
         }
      }
   }

   public void pa0V2( )
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
                  AV13P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV13P_STUDY_ID", GXutil.ltrim( GXutil.str( AV13P_STUDY_ID, 10, 0)));
               }
            }
         }
         radavCtltbm21_status.setName( "CTLTBM21_STATUS" );
         radavCtltbm21_status.setWebtags( "" );
         radavCtltbm21_del_flg.setName( "CTLTBM21_DEL_FLG" );
         radavCtltbm21_del_flg.setWebtags( "" );
         radavCtltbm21_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltbm21_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf0V2( ) ;
      /* End function Refresh */
   }

   public void rf0V2( )
   {
      /* Execute user event: e170V2 */
      e170V2 ();
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
         /* Execute user event: e260V2 */
         e260V2 ();
         wb0V0( ) ;
      }
   }

   public void strup0V0( )
   {
      /* Before Start, stand alone formulas. */
      AV45Pgmname = "B402_WP02_STUDY_REG" ;
      AV44Pgmdesc = "試験登録（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm21_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm21_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm21_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e160V2 */
      e160V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_study"), AV5BC_STUDY);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM21_STUDY_ID");
            GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( 0 );
         }
         else
         {
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") );
         }
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id( httpContext.cgiGet( edtavCtltbm21_outer_study_id_Internalname) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm( httpContext.cgiGet( edtavCtltbm21_study_nm_Internalname) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_status( httpContext.cgiGet( radavCtltbm21_status.getInternalname()) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm( httpContext.cgiGet( edtavCtltbm21_proc_nm_Internalname) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_note( httpContext.cgiGet( edtavCtltbm21_note_Internalname) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg( httpContext.cgiGet( radavCtltbm21_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm21_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "CTLTBM21_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm21_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm21_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm21_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "CTLTBM21_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm21_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm21_upd_datetime_Internalname)) );
         }
         AV8D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         AV9D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm( httpContext.cgiGet( edtavCtltbm21_crt_prog_nm_Internalname) );
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( httpContext.cgiGet( edtavCtltbm21_upd_prog_nm_Internalname) );
         AV10H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         AV12H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV11H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         /* Read saved values. */
         AV13P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
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
      /* Execute user event: e160V2 */
      e160V2 ();
      if (returnInSub) return;
   }

   public void e160V2( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      AV7C_GAMEN_TITLE = AV44Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV10H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV16W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0151",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e170V2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV10H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV10H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e110V2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV11H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV12H_MODE, "0") == 0 )
         {
            AV25W_ERRFLG = false ;
            AV22W_DEL_FLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV25W_ERRFLG )
            {
               GXt_char2 = AV26W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV26W_MSG = GXt_char2 ;
               GXt_char2 = AV20W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV20W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e180V2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV11H_KNGN_FLG, "") )
      {
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
         AV5BC_STUDY.Save();
         if ( AV5BC_STUDY.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
            httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_STUDY.GetMessages(), (byte)(0), GXv_char3) ;
            b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
      }
   }

   public void e120V2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV11H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV12H_MODE, "1") == 0 )
         {
            AV25W_ERRFLG = false ;
            AV22W_DEL_FLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV25W_ERRFLG )
            {
               if ( AV23W_ERR_CD == 2 )
               {
                  GXt_char2 = AV26W_MSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AG00025", "", "", "", "", "", GXv_char3) ;
                  b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV26W_MSG = GXt_char2 ;
               }
               else
               {
                  GXt_char2 = AV26W_MSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
                  b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV26W_MSG = GXt_char2 ;
               }
               GXt_char2 = AV20W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV20W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e190V2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV11H_KNGN_FLG, "") )
      {
         AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
         AV5BC_STUDY.Save();
         if ( AV5BC_STUDY.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
            httpContext.wjLoc = formatLink("b402_wp01_study_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_STUDY.GetMessages(), (byte)(0), GXv_char3) ;
            b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
      }
   }

   public void e130V2( )
   {
      /* 'BTN_CSV' Routine */
      if ( GXutil.strcmp(AV12H_MODE, "1") == 0 )
      {
         AV46GXLvl225 = (byte)(0) ;
         /* Using cursor H000V2 */
         pr_default.execute(0, new Object[] {new Long(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A765VBM01_TBM32_STUDY_ID = H000V2_A765VBM01_TBM32_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A765VBM01_TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A765VBM01_TBM32_STUDY_ID, 18, 0)));
            n765VBM01_TBM32_STUDY_ID = H000V2_n765VBM01_TBM32_STUDY_ID[0] ;
            A766VBM01_TBM32_CRF_ID = H000V2_A766VBM01_TBM32_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A766VBM01_TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A766VBM01_TBM32_CRF_ID, 13, 0)));
            n766VBM01_TBM32_CRF_ID = H000V2_n766VBM01_TBM32_CRF_ID[0] ;
            A767VBM01_TBM31_CRF_SNM = H000V2_A767VBM01_TBM31_CRF_SNM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A767VBM01_TBM31_CRF_SNM", A767VBM01_TBM31_CRF_SNM);
            n767VBM01_TBM31_CRF_SNM = H000V2_n767VBM01_TBM31_CRF_SNM[0] ;
            A768VBM01_TBM32_CRF_ITEM_CD = H000V2_A768VBM01_TBM32_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A768VBM01_TBM32_CRF_ITEM_CD", A768VBM01_TBM32_CRF_ITEM_CD);
            n768VBM01_TBM32_CRF_ITEM_CD = H000V2_n768VBM01_TBM32_CRF_ITEM_CD[0] ;
            A769VBM01_TBM32_CRF_ITEM_NM = H000V2_A769VBM01_TBM32_CRF_ITEM_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A769VBM01_TBM32_CRF_ITEM_NM", A769VBM01_TBM32_CRF_ITEM_NM);
            n769VBM01_TBM32_CRF_ITEM_NM = H000V2_n769VBM01_TBM32_CRF_ITEM_NM[0] ;
            A770VBM01_TBM32_CRF_ITEM_DIV = H000V2_A770VBM01_TBM32_CRF_ITEM_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A770VBM01_TBM32_CRF_ITEM_DIV", A770VBM01_TBM32_CRF_ITEM_DIV);
            n770VBM01_TBM32_CRF_ITEM_DIV = H000V2_n770VBM01_TBM32_CRF_ITEM_DIV[0] ;
            A771VBM01_TBM32_CRF_ITEM_GRP_CD = H000V2_A771VBM01_TBM32_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A771VBM01_TBM32_CRF_ITEM_GRP_CD", A771VBM01_TBM32_CRF_ITEM_GRP_CD);
            n771VBM01_TBM32_CRF_ITEM_GRP_CD = H000V2_n771VBM01_TBM32_CRF_ITEM_GRP_CD[0] ;
            A772VBM01_TBM32_CRF_ITEM_GRP_ORDER = H000V2_A772VBM01_TBM32_CRF_ITEM_GRP_ORDER[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A772VBM01_TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A772VBM01_TBM32_CRF_ITEM_GRP_ORDER, 13, 0)));
            n772VBM01_TBM32_CRF_ITEM_GRP_ORDER = H000V2_n772VBM01_TBM32_CRF_ITEM_GRP_ORDER[0] ;
            A773VBM01_TBM32_LOCATION_X = H000V2_A773VBM01_TBM32_LOCATION_X[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A773VBM01_TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A773VBM01_TBM32_LOCATION_X, 13, 0)));
            n773VBM01_TBM32_LOCATION_X = H000V2_n773VBM01_TBM32_LOCATION_X[0] ;
            A774VBM01_TBM32_LOCATION_Y = H000V2_A774VBM01_TBM32_LOCATION_Y[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774VBM01_TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A774VBM01_TBM32_LOCATION_Y, 13, 0)));
            n774VBM01_TBM32_LOCATION_Y = H000V2_n774VBM01_TBM32_LOCATION_Y[0] ;
            A775VBM01_TBM32_LOCATION_X2 = H000V2_A775VBM01_TBM32_LOCATION_X2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A775VBM01_TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A775VBM01_TBM32_LOCATION_X2, 13, 0)));
            n775VBM01_TBM32_LOCATION_X2 = H000V2_n775VBM01_TBM32_LOCATION_X2[0] ;
            A776VBM01_TBM32_LOCATION_Y2 = H000V2_A776VBM01_TBM32_LOCATION_Y2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A776VBM01_TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A776VBM01_TBM32_LOCATION_Y2, 13, 0)));
            n776VBM01_TBM32_LOCATION_Y2 = H000V2_n776VBM01_TBM32_LOCATION_Y2[0] ;
            A777VBM01_TBM32_TEXT_ALIGN_DIV = H000V2_A777VBM01_TBM32_TEXT_ALIGN_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A777VBM01_TBM32_TEXT_ALIGN_DIV", A777VBM01_TBM32_TEXT_ALIGN_DIV);
            n777VBM01_TBM32_TEXT_ALIGN_DIV = H000V2_n777VBM01_TBM32_TEXT_ALIGN_DIV[0] ;
            A778VBM01_TBM32_TEXT_MAXROWS = H000V2_A778VBM01_TBM32_TEXT_MAXROWS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A778VBM01_TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A778VBM01_TBM32_TEXT_MAXROWS, 13, 0)));
            n778VBM01_TBM32_TEXT_MAXROWS = H000V2_n778VBM01_TBM32_TEXT_MAXROWS[0] ;
            A779VBM01_TBM32_TEXT_MAXLENGTH = H000V2_A779VBM01_TBM32_TEXT_MAXLENGTH[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A779VBM01_TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A779VBM01_TBM32_TEXT_MAXLENGTH, 13, 0)));
            n779VBM01_TBM32_TEXT_MAXLENGTH = H000V2_n779VBM01_TBM32_TEXT_MAXLENGTH[0] ;
            A780VBM01_TBM32_DECIMAL_DIGITS = H000V2_A780VBM01_TBM32_DECIMAL_DIGITS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A780VBM01_TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A780VBM01_TBM32_DECIMAL_DIGITS, 13, 0)));
            n780VBM01_TBM32_DECIMAL_DIGITS = H000V2_n780VBM01_TBM32_DECIMAL_DIGITS[0] ;
            A781VBM01_TBM32_CHK_TRUE_INNER_VAL = H000V2_A781VBM01_TBM32_CHK_TRUE_INNER_VAL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A781VBM01_TBM32_CHK_TRUE_INNER_VAL", A781VBM01_TBM32_CHK_TRUE_INNER_VAL);
            n781VBM01_TBM32_CHK_TRUE_INNER_VAL = H000V2_n781VBM01_TBM32_CHK_TRUE_INNER_VAL[0] ;
            A782VBM01_TBM32_CHK_FALSE_INNER_VA = H000V2_A782VBM01_TBM32_CHK_FALSE_INNER_VA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A782VBM01_TBM32_CHK_FALSE_INNER_VA", A782VBM01_TBM32_CHK_FALSE_INNER_VA);
            n782VBM01_TBM32_CHK_FALSE_INNER_VA = H000V2_n782VBM01_TBM32_CHK_FALSE_INNER_VA[0] ;
            A783VBM01_TBM32_FIXED_VALUE = H000V2_A783VBM01_TBM32_FIXED_VALUE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A783VBM01_TBM32_FIXED_VALUE", A783VBM01_TBM32_FIXED_VALUE);
            n783VBM01_TBM32_FIXED_VALUE = H000V2_n783VBM01_TBM32_FIXED_VALUE[0] ;
            A784VBM01_TBM32_LIST_CD = H000V2_A784VBM01_TBM32_LIST_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A784VBM01_TBM32_LIST_CD", A784VBM01_TBM32_LIST_CD);
            n784VBM01_TBM32_LIST_CD = H000V2_n784VBM01_TBM32_LIST_CD[0] ;
            A785VBM01_TBM25_LIST_NM = H000V2_A785VBM01_TBM25_LIST_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A785VBM01_TBM25_LIST_NM", A785VBM01_TBM25_LIST_NM);
            n785VBM01_TBM25_LIST_NM = H000V2_n785VBM01_TBM25_LIST_NM[0] ;
            A786VBM01_TBM32_IMAGE_CD = H000V2_A786VBM01_TBM32_IMAGE_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A786VBM01_TBM32_IMAGE_CD", A786VBM01_TBM32_IMAGE_CD);
            n786VBM01_TBM32_IMAGE_CD = H000V2_n786VBM01_TBM32_IMAGE_CD[0] ;
            A787VBM01_TBM32_TEXT = H000V2_A787VBM01_TBM32_TEXT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A787VBM01_TBM32_TEXT", A787VBM01_TBM32_TEXT);
            n787VBM01_TBM32_TEXT = H000V2_n787VBM01_TBM32_TEXT[0] ;
            A788VBM01_TBM32_FONT_SIZE = H000V2_A788VBM01_TBM32_FONT_SIZE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A788VBM01_TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A788VBM01_TBM32_FONT_SIZE, 13, 0)));
            n788VBM01_TBM32_FONT_SIZE = H000V2_n788VBM01_TBM32_FONT_SIZE[0] ;
            A789VBM01_TBM32_FONT_UL_FLG = H000V2_A789VBM01_TBM32_FONT_UL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A789VBM01_TBM32_FONT_UL_FLG", A789VBM01_TBM32_FONT_UL_FLG);
            n789VBM01_TBM32_FONT_UL_FLG = H000V2_n789VBM01_TBM32_FONT_UL_FLG[0] ;
            A790VBM01_TBM32_FONT_COLOR_DIV = H000V2_A790VBM01_TBM32_FONT_COLOR_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A790VBM01_TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A790VBM01_TBM32_FONT_COLOR_DIV, 18, 0)));
            n790VBM01_TBM32_FONT_COLOR_DIV = H000V2_n790VBM01_TBM32_FONT_COLOR_DIV[0] ;
            A791VBM01_TBM32_LINE_SIZE_DIV = H000V2_A791VBM01_TBM32_LINE_SIZE_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A791VBM01_TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A791VBM01_TBM32_LINE_SIZE_DIV, 13, 0)));
            n791VBM01_TBM32_LINE_SIZE_DIV = H000V2_n791VBM01_TBM32_LINE_SIZE_DIV[0] ;
            A792VBM01_TBM32_LINE_COLOR_DIV = H000V2_A792VBM01_TBM32_LINE_COLOR_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A792VBM01_TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A792VBM01_TBM32_LINE_COLOR_DIV, 18, 0)));
            n792VBM01_TBM32_LINE_COLOR_DIV = H000V2_n792VBM01_TBM32_LINE_COLOR_DIV[0] ;
            A793VBM01_TBM32_LINE_START_POINT_D = H000V2_A793VBM01_TBM32_LINE_START_POINT_D[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A793VBM01_TBM32_LINE_START_POINT_D", A793VBM01_TBM32_LINE_START_POINT_D);
            n793VBM01_TBM32_LINE_START_POINT_D = H000V2_n793VBM01_TBM32_LINE_START_POINT_D[0] ;
            A794VBM01_TBM32_LINE_END_POINT_DIV = H000V2_A794VBM01_TBM32_LINE_END_POINT_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A794VBM01_TBM32_LINE_END_POINT_DIV", A794VBM01_TBM32_LINE_END_POINT_DIV);
            n794VBM01_TBM32_LINE_END_POINT_DIV = H000V2_n794VBM01_TBM32_LINE_END_POINT_DIV[0] ;
            A795VBM01_TBM32_LINE_ANGLE = H000V2_A795VBM01_TBM32_LINE_ANGLE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795VBM01_TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A795VBM01_TBM32_LINE_ANGLE, 13, 0)));
            n795VBM01_TBM32_LINE_ANGLE = H000V2_n795VBM01_TBM32_LINE_ANGLE[0] ;
            A796VBM01_TBM32_AUTH_LVL_MIN = H000V2_A796VBM01_TBM32_AUTH_LVL_MIN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A796VBM01_TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A796VBM01_TBM32_AUTH_LVL_MIN, 13, 0)));
            n796VBM01_TBM32_AUTH_LVL_MIN = H000V2_n796VBM01_TBM32_AUTH_LVL_MIN[0] ;
            A797VBM01_TBM32_ZORDER = H000V2_A797VBM01_TBM32_ZORDER[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A797VBM01_TBM32_ZORDER", GXutil.ltrim( GXutil.str( A797VBM01_TBM32_ZORDER, 13, 0)));
            n797VBM01_TBM32_ZORDER = H000V2_n797VBM01_TBM32_ZORDER[0] ;
            A798VBM01_TBM32_TAB_ORDER = H000V2_A798VBM01_TBM32_TAB_ORDER[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A798VBM01_TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A798VBM01_TBM32_TAB_ORDER, 13, 0)));
            n798VBM01_TBM32_TAB_ORDER = H000V2_n798VBM01_TBM32_TAB_ORDER[0] ;
            A799VBM01_TBM32_TABSTOP_FLG = H000V2_A799VBM01_TBM32_TABSTOP_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A799VBM01_TBM32_TABSTOP_FLG", A799VBM01_TBM32_TABSTOP_FLG);
            n799VBM01_TBM32_TABSTOP_FLG = H000V2_n799VBM01_TBM32_TABSTOP_FLG[0] ;
            A800VBM01_TBM32_REQUIRED_INPUT_FLG = H000V2_A800VBM01_TBM32_REQUIRED_INPUT_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A800VBM01_TBM32_REQUIRED_INPUT_FLG", A800VBM01_TBM32_REQUIRED_INPUT_FLG);
            n800VBM01_TBM32_REQUIRED_INPUT_FLG = H000V2_n800VBM01_TBM32_REQUIRED_INPUT_FLG[0] ;
            A801VBM01_TBM32_MIN_VALUE = H000V2_A801VBM01_TBM32_MIN_VALUE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A801VBM01_TBM32_MIN_VALUE", A801VBM01_TBM32_MIN_VALUE);
            n801VBM01_TBM32_MIN_VALUE = H000V2_n801VBM01_TBM32_MIN_VALUE[0] ;
            A802VBM01_TBM32_MAX_VALUE = H000V2_A802VBM01_TBM32_MAX_VALUE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A802VBM01_TBM32_MAX_VALUE", A802VBM01_TBM32_MAX_VALUE);
            n802VBM01_TBM32_MAX_VALUE = H000V2_n802VBM01_TBM32_MAX_VALUE[0] ;
            A803VBM01_TBM32_CRF_ITEM_NOTE = H000V2_A803VBM01_TBM32_CRF_ITEM_NOTE[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A803VBM01_TBM32_CRF_ITEM_NOTE", A803VBM01_TBM32_CRF_ITEM_NOTE);
            n803VBM01_TBM32_CRF_ITEM_NOTE = H000V2_n803VBM01_TBM32_CRF_ITEM_NOTE[0] ;
            A804VBM01_TBM32_REF_CRF_ID = H000V2_A804VBM01_TBM32_REF_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A804VBM01_TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A804VBM01_TBM32_REF_CRF_ID, 13, 0)));
            n804VBM01_TBM32_REF_CRF_ID = H000V2_n804VBM01_TBM32_REF_CRF_ID[0] ;
            A805VBM01_TBM32_REF_CRF_ITEM_CD = H000V2_A805VBM01_TBM32_REF_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A805VBM01_TBM32_REF_CRF_ITEM_CD", A805VBM01_TBM32_REF_CRF_ITEM_CD);
            n805VBM01_TBM32_REF_CRF_ITEM_CD = H000V2_n805VBM01_TBM32_REF_CRF_ITEM_CD[0] ;
            A806VBM01_TBM37_VISIT_NO = H000V2_A806VBM01_TBM37_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A806VBM01_TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A806VBM01_TBM37_VISIT_NO, 13, 0)));
            n806VBM01_TBM37_VISIT_NO = H000V2_n806VBM01_TBM37_VISIT_NO[0] ;
            A807VBM01_TBM37_DOM_CD = H000V2_A807VBM01_TBM37_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A807VBM01_TBM37_DOM_CD", A807VBM01_TBM37_DOM_CD);
            n807VBM01_TBM37_DOM_CD = H000V2_n807VBM01_TBM37_DOM_CD[0] ;
            A808VBM01_TBM37_DOM_VAR_NM = H000V2_A808VBM01_TBM37_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A808VBM01_TBM37_DOM_VAR_NM", A808VBM01_TBM37_DOM_VAR_NM);
            n808VBM01_TBM37_DOM_VAR_NM = H000V2_n808VBM01_TBM37_DOM_VAR_NM[0] ;
            A809VBM01_TBM37_DOM_ITM_GRP_OID = H000V2_A809VBM01_TBM37_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A809VBM01_TBM37_DOM_ITM_GRP_OID", A809VBM01_TBM37_DOM_ITM_GRP_OID);
            n809VBM01_TBM37_DOM_ITM_GRP_OID = H000V2_n809VBM01_TBM37_DOM_ITM_GRP_OID[0] ;
            A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S = H000V2_A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S", GXutil.ltrim( GXutil.str( A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S, 13, 0)));
            n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S = H000V2_n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S[0] ;
            A811VBM01_TBM37_DOM_ITM_GRP_ROWNO = H000V2_A811VBM01_TBM37_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A811VBM01_TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A811VBM01_TBM37_DOM_ITM_GRP_ROWNO, 13, 0)));
            n811VBM01_TBM37_DOM_ITM_GRP_ROWNO = H000V2_n811VBM01_TBM37_DOM_ITM_GRP_ROWNO[0] ;
            A812VBM01_TBM41_NCM_METADATA_ID = H000V2_A812VBM01_TBM41_NCM_METADATA_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A812VBM01_TBM41_NCM_METADATA_ID", A812VBM01_TBM41_NCM_METADATA_ID);
            n812VBM01_TBM41_NCM_METADATA_ID = H000V2_n812VBM01_TBM41_NCM_METADATA_ID[0] ;
            AV46GXLvl225 = (byte)(1) ;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV27W_RTN_CD,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV28W_RTN_MSG)) ;
            httpContext.wjLoc = formatLink("ab402_pc21_crf_def_csv_output") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV46GXLvl225 == 0 )
         {
            AV27W_RTN_CD = (short)(1) ;
            GXt_char2 = AV28W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char3) ;
            b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_RTN_MSG = GXt_char2 ;
         }
         if ( AV27W_RTN_CD != 0 )
         {
            httpContext.GX_msglist.addItem(AV28W_RTN_MSG);
         }
      }
   }

   public void e140V2( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV11H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV12H_MODE, "1") == 0 )
         {
            AV25W_ERRFLG = false ;
            AV22W_DEL_FLG = true ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV25W_ERRFLG )
            {
               GXt_char2 = AV26W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV26W_MSG = GXt_char2 ;
               GXt_char2 = AV20W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_DLT_EXEC", "", GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV20W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e200V2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV11H_KNGN_FLG, "") )
      {
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char3[0] = AV26W_MSG ;
         new b402_pc19_study_del(remoteHandle, context).execute( AV5BC_STUDY, GXv_int4, GXv_char3) ;
         b402_wp02_study_reg_impl.this.AV23W_ERR_CD = (byte)((byte)(GXv_int4[0])) ;
         b402_wp02_study_reg_impl.this.AV26W_MSG = GXv_char3[0] ;
         if ( AV23W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
            httpContext.wjLoc = formatLink("b402_wp01_study_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
      }
   }

   public void e150V2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("b402_wp01_study_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e210V2( )
   {
      /* 'BTN_STAFF' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp04_study_staff_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e220V2( )
   {
      /* 'BTN_CRF_DETAIL' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e230V2( )
   {
      /* 'BTN_SITE' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp03_study_site_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e240V2( )
   {
      /* 'BTN_CRF_COND' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e250V2( )
   {
      /* 'BTN_CRF_DOMAIN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      radavCtltbm21_status.removeAllItems();
      radavCtltbm21_status.addItem("0", gxdomainct_status.getDescription((String)"0"), (short)(0));
      radavCtltbm21_status.addItem("1", gxdomainct_status.getDescription((String)"1"), (short)(0));
      radavCtltbm21_status.addItem("2", gxdomainct_status.getDescription((String)"2"), (short)(0));
      radavCtltbm21_status.addItem("9", gxdomainct_status.getDescription((String)"9"), (short)(0));
      radavCtltbm21_del_flg.removeAllItems();
      radavCtltbm21_del_flg.addItem("0", gxdomainct_del_flg.getDescription((String)"0"), (short)(0));
      radavCtltbm21_del_flg.addItem("1", gxdomainct_del_flg.getDescription((String)"1"), (short)(0));
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      GXv_int5[0] = AV23W_ERR_CD ;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem6[0] = AV14W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem7[0] = AV17W_A_RESULT_MSG_SDT ;
      new b402_pc01_study_mst_chk(remoteHandle, context).execute( AV5BC_STUDY, AV22W_DEL_FLG, GXv_int5, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem6, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem7) ;
      b402_wp02_study_reg_impl.this.AV23W_ERR_CD = GXv_int5[0] ;
      AV14W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem6[0] ;
      AV17W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem7[0] ;
      if ( AV23W_ERR_CD == 1 )
      {
         AV25W_ERRFLG = true ;
      }
      if ( AV17W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV47GXV12 = 1 ;
         while ( AV47GXV12 <= AV17W_A_RESULT_MSG_SDT.size() )
         {
            AV18W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV17W_A_RESULT_MSG_SDT.elementAt(-1+AV47GXV12));
            httpContext.GX_msglist.addItem(AV18W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV47GXV12 = (int)(AV47GXV12+1) ;
         }
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void S182( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm21_study_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_id_Backcolor, 9, 0)));
      edtavCtltbm21_outer_study_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_outer_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_outer_study_id_Backcolor, 9, 0)));
      edtavCtltbm21_study_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_nm_Backcolor, 9, 0)));
      edtavCtltbm21_proc_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_proc_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_proc_nm_Backcolor, 9, 0)));
      edtavCtltbm21_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_note_Backcolor, 9, 0)));
   }

   public void S192( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV48GXV13 = 1 ;
      while ( AV48GXV13 <= AV14W_A_CHK_RESULT_SDT.size() )
      {
         AV15W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV14W_A_CHK_RESULT_SDT.elementAt(-1+AV48GXV13));
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         AV48GXV13 = (int)(AV48GXV13+1) ;
      }
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_STUDY_ID") == 0 )
      {
         edtavCtltbm21_study_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_id_Backcolor, 9, 0)));
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_STUDY_NM") == 0 )
      {
         edtavCtltbm21_study_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_nm_Backcolor, 9, 0)));
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm21_study_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_OUTER_STUDY_ID") == 0 )
      {
         edtavCtltbm21_outer_study_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_outer_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_outer_study_id_Backcolor, 9, 0)));
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm21_outer_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_PROC_NM") == 0 )
      {
         edtavCtltbm21_proc_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_proc_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_proc_nm_Backcolor, 9, 0)));
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm21_proc_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_NOTE") == 0 )
      {
         edtavCtltbm21_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm21_note_Backcolor, 9, 0)));
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm21_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM21_STATUS") == 0 )
      {
         if ( AV15W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (0==AV13P_STUDY_ID) )
      {
         AV12H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV5BC_STUDY.Load(AV13P_STUDY_ID);
         if ( AV5BC_STUDY.Fail() )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
         else
         {
            AV49GXLvl480 = (byte)(0) ;
            /* Using cursor H000V3 */
            pr_default.execute(1, new Object[] {AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id()});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A8TAM07_USER_ID = H000V3_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H000V3_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H000V3_n2TAM07_USER_NM[0] ;
               AV49GXLvl480 = (byte)(1) ;
               GXt_char2 = AV8D_CRT_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV49GXLvl480 == 0 )
            {
               AV8D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id(), AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id()) == 0 )
            {
               AV9D_UPD_USER_NM = AV8D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
            }
            else
            {
               AV50GXLvl495 = (byte)(0) ;
               /* Using cursor H000V4 */
               pr_default.execute(2, new Object[] {AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id()});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A8TAM07_USER_ID = H000V4_A8TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
                  A2TAM07_USER_NM = H000V4_A2TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  n2TAM07_USER_NM = H000V4_n2TAM07_USER_NM[0] ;
                  AV50GXLvl495 = (byte)(1) ;
                  GXt_char2 = AV9D_UPD_USER_NM ;
                  GXv_char3[0] = GXt_char2 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
                  b402_wp02_study_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  AV9D_UPD_USER_NM = GXt_char2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( AV50GXLvl495 == 0 )
               {
                  AV9D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
               }
            }
            AV21W_CNT = 0 ;
            /* Optimized group. */
            /* Using cursor H000V5 */
            pr_default.execute(3, new Object[] {new Long(AV13P_STUDY_ID)});
            cV21W_CNT = H000V5_AV21W_CNT[0] ;
            pr_default.close(3);
            AV21W_CNT = (long)(AV21W_CNT+cV21W_CNT*1) ;
            /* End optimized group. */
            lblTxt_site_info_Caption = GXutil.trim( GXutil.str( AV21W_CNT, 10, 0))+"箇所" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_site_info_Internalname, "Caption", lblTxt_site_info_Caption);
            AV21W_CNT = 0 ;
            /* Using cursor H000V6 */
            pr_default.execute(4, new Object[] {new Long(AV13P_STUDY_ID)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A147TAM07_SITE_ID = H000V6_A147TAM07_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
               n147TAM07_SITE_ID = H000V6_n147TAM07_SITE_ID[0] ;
               A16TAM07_DEL_FLG = H000V6_A16TAM07_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
               n16TAM07_DEL_FLG = H000V6_n16TAM07_DEL_FLG[0] ;
               A209TBM23_DEL_FLG = H000V6_A209TBM23_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
               n209TBM23_DEL_FLG = H000V6_n209TBM23_DEL_FLG[0] ;
               A207TBM23_STUDY_ID = H000V6_A207TBM23_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
               A208TBM23_USER_ID = H000V6_A208TBM23_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
               A147TAM07_SITE_ID = H000V6_A147TAM07_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
               n147TAM07_SITE_ID = H000V6_n147TAM07_SITE_ID[0] ;
               A16TAM07_DEL_FLG = H000V6_A16TAM07_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
               n16TAM07_DEL_FLG = H000V6_n16TAM07_DEL_FLG[0] ;
               /* Using cursor H000V7 */
               pr_default.execute(5, new Object[] {new Long(AV13P_STUDY_ID), new Boolean(n147TAM07_SITE_ID), A147TAM07_SITE_ID});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A198TBM22_SITE_ID = H000V7_A198TBM22_SITE_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
                  A139TAM08_DEL_FLG = H000V7_A139TAM08_DEL_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
                  n139TAM08_DEL_FLG = H000V7_n139TAM08_DEL_FLG[0] ;
                  A199TBM22_DEL_FLG = H000V7_A199TBM22_DEL_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
                  n199TBM22_DEL_FLG = H000V7_n199TBM22_DEL_FLG[0] ;
                  A197TBM22_STUDY_ID = H000V7_A197TBM22_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
                  A139TAM08_DEL_FLG = H000V7_A139TAM08_DEL_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
                  n139TAM08_DEL_FLG = H000V7_n139TAM08_DEL_FLG[0] ;
                  AV21W_CNT = (long)(AV21W_CNT+1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
               AV29W_USER_ID = A208TBM23_USER_ID ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            lblTxt_user_info_Caption = GXutil.trim( GXutil.str( AV21W_CNT, 10, 0))+"名" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_user_info_Internalname, "Caption", lblTxt_user_info_Caption);
            AV21W_CNT = 0 ;
            /* Optimized group. */
            /* Using cursor H000V8 */
            pr_default.execute(6, new Object[] {new Long(AV13P_STUDY_ID)});
            cV21W_CNT = H000V8_AV21W_CNT[0] ;
            pr_default.close(6);
            AV21W_CNT = (long)(AV21W_CNT+cV21W_CNT*1) ;
            /* End optimized group. */
            lblTxt_crf_info_Caption = GXutil.trim( GXutil.str( AV21W_CNT, 10, 0))+"枚" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_crf_info_Internalname, "Caption", lblTxt_crf_info_Caption);
            AV21W_CNT = 0 ;
            /* Optimized group. */
            /* Using cursor H000V9 */
            pr_default.execute(7, new Object[] {new Long(AV13P_STUDY_ID)});
            cV21W_CNT = H000V9_AV21W_CNT[0] ;
            pr_default.close(7);
            AV21W_CNT = (long)(AV21W_CNT+cV21W_CNT*1) ;
            /* End optimized group. */
            lblTxt_domain_info_Caption = GXutil.trim( GXutil.str( AV21W_CNT, 10, 0))+"ドメイン" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_domain_info_Internalname, "Caption", lblTxt_domain_info_Caption);
         }
         edtavCtltbm21_study_id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_id_Enabled, 5, 0)));
         radavCtltbm21_status.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm21_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm21_status.getEnabled(), 5, 0)));
         edtavCtltbm21_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm21_crt_datetime_Visible, 5, 0)));
         edtavCtltbm21_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm21_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm21_outer_study_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV12H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         edtavCtltbm21_study_id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm21_study_id_Enabled, 5, 0)));
         radavCtltbm21_status.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm21_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm21_status.getEnabled(), 5, 0)));
         edtavCtltbm21_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm21_crt_datetime_Visible, 5, 0)));
         edtavCtltbm21_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm21_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm21_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT8[0] = AV16W_A_LOGIN_SDT;
      GXv_char3[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT8, GXv_char3) ;
      AV16W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT8[0] ;
      b402_wp02_study_reg_impl.this.AV24W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV20W_A821_JS = "" ;
      AV19W_A819_JS = "" ;
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_status( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_note( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      GXt_dtime9 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime( GXt_dtime9 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      GXt_dtime9 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime( GXt_dtime9 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV5BC_STUDY.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY", AV5BC_STUDY);
      AV8D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
      AV9D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
   }

   public void S162( )
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
      if ( ! (GXutil.strcmp("", AV20W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV20W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV19W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV19W_A819_JS ;
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
      GXv_char3[0] = AV11H_KNGN_FLG ;
      GXv_char10[0] = AV24W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char3, GXv_char10) ;
      b402_wp02_study_reg_impl.this.AV11H_KNGN_FLG = GXv_char3[0] ;
      b402_wp02_study_reg_impl.this.AV24W_ERRCD = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S22722( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp02_study_reg");
   }

   public void S212( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_upd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      lblTxt_btn_dlt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      lblTxt_btn_csv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_csv_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_csv_Visible, 5, 0)));
      lblTxt_btn_site_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_site_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_site_Visible, 5, 0)));
      lblTxt_btn_staff_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_staff_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_staff_Visible, 5, 0)));
      lblTxt_btn_crf_detail_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_crf_detail_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_crf_detail_Visible, 5, 0)));
      lblTxt_btn_crf_cond_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_crf_cond_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_crf_cond_Visible, 5, 0)));
      lblTxt_btn_domain_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_domain_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_domain_Visible, 5, 0)));
      if ( GXutil.strcmp(AV12H_MODE, "1") == 0 )
      {
         GXt_boolean11 = false ;
         GXv_boolean12[0] = GXt_boolean11 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV11H_KNGN_FLG, "", GXv_boolean12) ;
         b402_wp02_study_reg_impl.this.GXt_boolean11 = GXv_boolean12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean11 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         GXt_boolean11 = false ;
         GXv_boolean12[0] = GXt_boolean11 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV11H_KNGN_FLG, "", GXv_boolean12) ;
         b402_wp02_study_reg_impl.this.GXt_boolean11 = GXv_boolean12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean11 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
         lblTxt_btn_csv_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_csv_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_csv_Visible, 5, 0)));
         lblTxt_btn_site_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_site_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_site_Visible, 5, 0)));
         lblTxt_btn_staff_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_staff_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_staff_Visible, 5, 0)));
         lblTxt_btn_crf_detail_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_crf_detail_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_crf_detail_Visible, 5, 0)));
         lblTxt_btn_crf_cond_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_crf_cond_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_crf_cond_Visible, 5, 0)));
         lblTxt_btn_domain_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_domain_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_domain_Visible, 5, 0)));
      }
      else
      {
         GXt_boolean11 = false ;
         GXv_boolean12[0] = GXt_boolean11 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV11H_KNGN_FLG, "", GXv_boolean12) ;
         b402_wp02_study_reg_impl.this.GXt_boolean11 = GXv_boolean12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean11 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e260V2( )
   {
      /* Load Routine */
   }

   public void wb_table2_153_0V2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP02_STUDY_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upd_exec_Internalname, "BTN_UPD_EXEC", "", "", lblBtn_upd_exec_Jsonclick, "E\\'BTN_UPD_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_exec_Internalname, "BTN_REG_EXEC", "", "", lblBtn_reg_exec_Jsonclick, "E\\'BTN_REG_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dlt_exec_Internalname, "BTN_DLT_EXEC", "", "", lblBtn_dlt_exec_Jsonclick, "E\\'BTN_DLT_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV10H_INIT_FLG), GXutil.rtrim( localUtil.format( AV10H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(160);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV12H_MODE), GXutil.rtrim( localUtil.format( AV12H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(161);\"", "", "", "", "", edtavH_mode_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(162);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_153_0V2e( true) ;
      }
      else
      {
         wb_table2_153_0V2e( false) ;
      }
   }

   public void wb_table1_2_0V2( boolean wbgen )
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
         wb_table3_6_0V2( true) ;
      }
      else
      {
         wb_table3_6_0V2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_0V2e( boolean wbgen )
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
         wb_table1_2_0V2e( true) ;
      }
      else
      {
         wb_table1_2_0V2e( false) ;
      }
   }

   public void wb_table3_6_0V2( boolean wbgen )
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
         wb_table4_12_0V2( true) ;
      }
      else
      {
         wb_table4_12_0V2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_26_0V2( true) ;
      }
      else
      {
         wb_table5_26_0V2( false) ;
      }
      return  ;
   }

   public void wb_table5_26_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0151"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0151"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0151"+"");
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
         wb_table3_6_0V2e( true) ;
      }
      else
      {
         wb_table3_6_0V2e( false) ;
      }
   }

   public void wb_table5_26_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table6_32_0V2( true) ;
      }
      else
      {
         wb_table6_32_0V2( false) ;
      }
      return  ;
   }

   public void wb_table6_32_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_70_0V2( true) ;
      }
      else
      {
         wb_table7_70_0V2( false) ;
      }
      return  ;
   }

   public void wb_table7_70_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_26_0V2e( true) ;
      }
      else
      {
         wb_table5_26_0V2e( false) ;
      }
   }

   public void wb_table7_70_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableFormTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼関連情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:20px;width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, "施設情報", "", "", lblTextblock85_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         wb_table8_77_0V2( true) ;
      }
      else
      {
         wb_table8_77_0V2( false) ;
      }
      return  ;
   }

   public void wb_table8_77_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, "参加スタッフ情報", "", "", lblTextblock76_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_86_0V2( true) ;
      }
      else
      {
         wb_table9_86_0V2( false) ;
      }
      return  ;
   }

   public void wb_table9_86_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:20px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, "CRF情報", "", "", lblTextblock77_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_96_0V2( true) ;
      }
      else
      {
         wb_table10_96_0V2( false) ;
      }
      return  ;
   }

   public void wb_table10_96_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, "CRF選択条件", "", "", lblTextblock78_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_105_0V2( true) ;
      }
      else
      {
         wb_table11_105_0V2( false) ;
      }
      return  ;
   }

   public void wb_table11_105_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, "ドメイン情報", "", "", lblTextblock80_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table12_114_0V2( true) ;
      }
      else
      {
         wb_table12_114_0V2( false) ;
      }
      return  ;
   }

   public void wb_table12_114_0V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "作成日時", "", "", lblTextblock67_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime()", localUtil.ttoc( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm21_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_crt_datetime_Internalname, localUtil.format(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm21_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm21_crt_datetime_Visible, edtavCtltbm21_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP02_STUDY_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm21_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm21_crt_datetime_Visible==0)||(edtavCtltbm21_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "更新日時", "", "", lblTextblock72_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime()", localUtil.ttoc( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm21_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_upd_datetime_Internalname, localUtil.format(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm21_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm21_upd_datetime_Visible, edtavCtltbm21_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP02_STUDY_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm21_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm21_upd_datetime_Visible==0)||(edtavCtltbm21_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "作成ユーザー名", "", "", lblTextblock70_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV8D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(135);\"", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crt_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, "更新ユーザー名", "", "", lblTextblock73_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV9D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV9D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_upd_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "作成プログラムID", "", "", lblTextblock71_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltbm21_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm21_crt_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, "更新プログラムID", "", "", lblTextblock74_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltbm21_upd_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm21_upd_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_70_0V2e( true) ;
      }
      else
      {
         wb_table7_70_0V2e( false) ;
      }
   }

   public void wb_table12_114_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_domain_info_Internalname, lblTxt_domain_info_Caption, "", "", lblTxt_domain_info_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_domain_Internalname, "設定", "", "", lblTxt_btn_domain_Jsonclick, "E\\'BTN_CRF_DOMAIN\\'.", StyleString, ClassString, 5, "", lblTxt_btn_domain_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_114_0V2e( true) ;
      }
      else
      {
         wb_table12_114_0V2e( false) ;
      }
   }

   public void wb_table11_105_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_cond_Internalname, "設定", "", "", lblTxt_btn_crf_cond_Jsonclick, "E\\'BTN_CRF_COND\\'.", StyleString, ClassString, 5, "", lblTxt_btn_crf_cond_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_105_0V2e( true) ;
      }
      else
      {
         wb_table11_105_0V2e( false) ;
      }
   }

   public void wb_table10_96_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_crf_info_Internalname, lblTxt_crf_info_Caption, "", "", lblTxt_crf_info_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_detail_Internalname, "設定", "", "", lblTxt_btn_crf_detail_Jsonclick, "E\\'BTN_CRF_DETAIL\\'.", StyleString, ClassString, 5, "", lblTxt_btn_crf_detail_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_96_0V2e( true) ;
      }
      else
      {
         wb_table10_96_0V2e( false) ;
      }
   }

   public void wb_table9_86_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_user_info_Internalname, lblTxt_user_info_Caption, "", "", lblTxt_user_info_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_staff_Internalname, "設定", "", "", lblTxt_btn_staff_Jsonclick, "E\\'BTN_STAFF\\'.", StyleString, ClassString, 5, "", lblTxt_btn_staff_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_86_0V2e( true) ;
      }
      else
      {
         wb_table9_86_0V2e( false) ;
      }
   }

   public void wb_table8_77_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_site_info_Internalname, lblTxt_site_info_Caption, "", "", lblTxt_site_info_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_site_Internalname, "設定", "", "", lblTxt_btn_site_Jsonclick, "E\\'BTN_SITE\\'.", StyleString, ClassString, 5, "", lblTxt_btn_site_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_77_0V2e( true) ;
      }
      else
      {
         wb_table8_77_0V2e( false) ;
      }
   }

   public void wb_table6_32_0V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼基本情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, "試験ID", "", "", lblTextblock63_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id()", GXutil.ltrim( GXutil.str( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_study_id_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(40);\"", "", "", "", "", edtavCtltbm21_study_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm21_study_id_Enabled, 1, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "外部試験ID", "", "", lblTextblock68_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_outer_study_id_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_outer_study_id_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id()), GXutil.rtrim( localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "", "", "", "", edtavCtltbm21_outer_study_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, "試験名", "", "", lblTextblock64_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_study_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_study_nm_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "", "", "", "", edtavCtltbm21_study_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, "状態", "", "", lblTextblock65_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm21_status, radavCtltbm21_status.getInternalname(), AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status(), "", 1, radavCtltbm21_status.getEnabled(), 0, 0, StyleString, ClassString, 0, radavCtltbm21_status.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(55);\"", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, "プロトコール名", "", "", lblTextblock69_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_proc_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm21_proc_nm_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "", "", "", "", edtavCtltbm21_proc_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 40, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, "備考", "", "", lblTextblock79_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_note()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_note());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm21_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm21_note_Internalname, GXutil.rtrim( AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", (short)(0), 1, 1, 0, 80, "chr", 4, "row", StyleString, ClassString, "1000", 1, "", true, "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, "削除", "", "", lblTextblock84_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg()", AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm21_del_flg, radavCtltbm21_del_flg.getInternalname(), AV5BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm21_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_32_0V2e( true) ;
      }
      else
      {
         wb_table6_32_0V2e( false) ;
      }
   }

   public void wb_table4_12_0V2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList150" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_Internalname, "CRF定義済CSV出力（F5）", "", "", lblTxt_btn_csv_Jsonclick, "E\\'BTN_CSV\\'.", StyleString, ClassString, 5, "", lblTxt_btn_csv_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "E\\'BTN_DLT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP02_STUDY_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_0V2e( true) ;
      }
      else
      {
         wb_table4_12_0V2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV13P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_STUDY_ID", GXutil.ltrim( GXutil.str( AV13P_STUDY_ID, 10, 0)));
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
      pa0V2( ) ;
      ws0V2( ) ;
      we0V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1459274");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("gxdec.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp02_study_reg.js", "?1459274");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_csv_Internalname = "TXT_BTN_CSV" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage6_Internalname = "IMAGE6" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtavCtltbm21_study_id_Internalname = "CTLTBM21_STUDY_ID" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavCtltbm21_outer_study_id_Internalname = "CTLTBM21_OUTER_STUDY_ID" ;
      imgImage7_Internalname = "IMAGE7" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtavCtltbm21_study_nm_Internalname = "CTLTBM21_STUDY_NM" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      radavCtltbm21_status.setInternalname( "CTLTBM21_STATUS" );
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtavCtltbm21_proc_nm_Internalname = "CTLTBM21_PROC_NM" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtavCtltbm21_note_Internalname = "CTLTBM21_NOTE" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      radavCtltbm21_del_flg.setInternalname( "CTLTBM21_DEL_FLG" );
      tblTable5_Internalname = "TABLE5" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      lblTxt_site_info_Internalname = "TXT_SITE_INFO" ;
      lblTxt_btn_site_Internalname = "TXT_BTN_SITE" ;
      tblTable6_Internalname = "TABLE6" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      lblTxt_user_info_Internalname = "TXT_USER_INFO" ;
      lblTxt_btn_staff_Internalname = "TXT_BTN_STAFF" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      lblTxt_crf_info_Internalname = "TXT_CRF_INFO" ;
      lblTxt_btn_crf_detail_Internalname = "TXT_BTN_CRF_DETAIL" ;
      tblTable8_Internalname = "TABLE8" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      lblTxt_btn_crf_cond_Internalname = "TXT_BTN_CRF_COND" ;
      tblTable9_Internalname = "TABLE9" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      lblTxt_domain_info_Internalname = "TXT_DOMAIN_INFO" ;
      lblTxt_btn_domain_Internalname = "TXT_BTN_DOMAIN" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavCtltbm21_crt_datetime_Internalname = "CTLTBM21_CRT_DATETIME" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtavCtltbm21_upd_datetime_Internalname = "CTLTBM21_UPD_DATETIME" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtavCtltbm21_crt_prog_nm_Internalname = "CTLTBM21_CRT_PROG_NM" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtavCtltbm21_upd_prog_nm_Internalname = "CTLTBM21_UPD_PROG_NM" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_upd_exec_Internalname = "BTN_UPD_EXEC" ;
      lblBtn_reg_exec_Internalname = "BTN_REG_EXEC" ;
      lblBtn_dlt_exec_Internalname = "BTN_DLT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblTxt_btn_dlt_Visible = 1 ;
      lblTxt_btn_csv_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      radavCtltbm21_del_flg.setJsonclick( "" );
      edtavCtltbm21_note_Backstyle = (byte)(-1) ;
      edtavCtltbm21_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_proc_nm_Jsonclick = "" ;
      edtavCtltbm21_proc_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm21_proc_nm_Backcolor = (int)(0xFFFFFF) ;
      radavCtltbm21_status.setJsonclick( "" );
      radavCtltbm21_status.setEnabled( 1 );
      edtavCtltbm21_study_nm_Jsonclick = "" ;
      edtavCtltbm21_study_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm21_study_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_outer_study_id_Jsonclick = "" ;
      edtavCtltbm21_outer_study_id_Backstyle = (byte)(-1) ;
      edtavCtltbm21_outer_study_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_study_id_Jsonclick = "" ;
      edtavCtltbm21_study_id_Backstyle = (byte)(-1) ;
      edtavCtltbm21_study_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_study_id_Enabled = 1 ;
      lblTxt_btn_site_Visible = 1 ;
      lblTxt_btn_staff_Visible = 1 ;
      lblTxt_btn_crf_detail_Visible = 1 ;
      lblTxt_btn_crf_cond_Visible = 1 ;
      lblTxt_btn_domain_Visible = 1 ;
      edtavCtltbm21_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm21_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm21_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm21_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm21_upd_datetime_Jsonclick = "" ;
      edtavCtltbm21_upd_datetime_Enabled = 0 ;
      edtavCtltbm21_upd_datetime_Visible = 1 ;
      edtavCtltbm21_crt_datetime_Jsonclick = "" ;
      edtavCtltbm21_crt_datetime_Enabled = 0 ;
      edtavCtltbm21_crt_datetime_Visible = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltbm21_study_id_Enabled = 1 ;
      lblTxt_domain_info_Caption = "0ドメイン" ;
      lblTxt_crf_info_Caption = "0枚" ;
      lblTxt_user_info_Caption = "0名" ;
      lblTxt_site_info_Caption = "0箇所" ;
      edtavCtltbm21_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_proc_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_study_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_outer_study_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm21_study_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm21_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm21_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm21_upd_datetime_Enabled = -1 ;
      edtavCtltbm21_crt_datetime_Enabled = -1 ;
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
                  /* Execute user subroutine: S22722 */
                  S22722 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_STUDY = new SdtTBM21_STUDY(remoteHandle);
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
      AV45Pgmname = "" ;
      AV44Pgmdesc = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV9D_UPD_USER_NM = "" ;
      AV10H_INIT_FLG = "" ;
      AV12H_MODE = "" ;
      AV11H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV16W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV26W_MSG = "" ;
      AV20W_A821_JS = "" ;
      scmdbuf = "" ;
      H000V2_A765VBM01_TBM32_STUDY_ID = new long[1] ;
      H000V2_n765VBM01_TBM32_STUDY_ID = new boolean[] {false} ;
      H000V2_A766VBM01_TBM32_CRF_ID = new long[1] ;
      H000V2_n766VBM01_TBM32_CRF_ID = new boolean[] {false} ;
      H000V2_A767VBM01_TBM31_CRF_SNM = new String[] {""} ;
      H000V2_n767VBM01_TBM31_CRF_SNM = new boolean[] {false} ;
      H000V2_A768VBM01_TBM32_CRF_ITEM_CD = new String[] {""} ;
      H000V2_n768VBM01_TBM32_CRF_ITEM_CD = new boolean[] {false} ;
      H000V2_A769VBM01_TBM32_CRF_ITEM_NM = new String[] {""} ;
      H000V2_n769VBM01_TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      H000V2_A770VBM01_TBM32_CRF_ITEM_DIV = new String[] {""} ;
      H000V2_n770VBM01_TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      H000V2_A771VBM01_TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      H000V2_n771VBM01_TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      H000V2_A772VBM01_TBM32_CRF_ITEM_GRP_ORDER = new long[1] ;
      H000V2_n772VBM01_TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      H000V2_A773VBM01_TBM32_LOCATION_X = new long[1] ;
      H000V2_n773VBM01_TBM32_LOCATION_X = new boolean[] {false} ;
      H000V2_A774VBM01_TBM32_LOCATION_Y = new long[1] ;
      H000V2_n774VBM01_TBM32_LOCATION_Y = new boolean[] {false} ;
      H000V2_A775VBM01_TBM32_LOCATION_X2 = new long[1] ;
      H000V2_n775VBM01_TBM32_LOCATION_X2 = new boolean[] {false} ;
      H000V2_A776VBM01_TBM32_LOCATION_Y2 = new long[1] ;
      H000V2_n776VBM01_TBM32_LOCATION_Y2 = new boolean[] {false} ;
      H000V2_A777VBM01_TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      H000V2_n777VBM01_TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      H000V2_A778VBM01_TBM32_TEXT_MAXROWS = new long[1] ;
      H000V2_n778VBM01_TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      H000V2_A779VBM01_TBM32_TEXT_MAXLENGTH = new long[1] ;
      H000V2_n779VBM01_TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      H000V2_A780VBM01_TBM32_DECIMAL_DIGITS = new long[1] ;
      H000V2_n780VBM01_TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      H000V2_A781VBM01_TBM32_CHK_TRUE_INNER_VAL = new String[] {""} ;
      H000V2_n781VBM01_TBM32_CHK_TRUE_INNER_VAL = new boolean[] {false} ;
      H000V2_A782VBM01_TBM32_CHK_FALSE_INNER_VA = new String[] {""} ;
      H000V2_n782VBM01_TBM32_CHK_FALSE_INNER_VA = new boolean[] {false} ;
      H000V2_A783VBM01_TBM32_FIXED_VALUE = new String[] {""} ;
      H000V2_n783VBM01_TBM32_FIXED_VALUE = new boolean[] {false} ;
      H000V2_A784VBM01_TBM32_LIST_CD = new String[] {""} ;
      H000V2_n784VBM01_TBM32_LIST_CD = new boolean[] {false} ;
      H000V2_A785VBM01_TBM25_LIST_NM = new String[] {""} ;
      H000V2_n785VBM01_TBM25_LIST_NM = new boolean[] {false} ;
      H000V2_A786VBM01_TBM32_IMAGE_CD = new String[] {""} ;
      H000V2_n786VBM01_TBM32_IMAGE_CD = new boolean[] {false} ;
      H000V2_A787VBM01_TBM32_TEXT = new String[] {""} ;
      H000V2_n787VBM01_TBM32_TEXT = new boolean[] {false} ;
      H000V2_A788VBM01_TBM32_FONT_SIZE = new long[1] ;
      H000V2_n788VBM01_TBM32_FONT_SIZE = new boolean[] {false} ;
      H000V2_A789VBM01_TBM32_FONT_UL_FLG = new String[] {""} ;
      H000V2_n789VBM01_TBM32_FONT_UL_FLG = new boolean[] {false} ;
      H000V2_A790VBM01_TBM32_FONT_COLOR_DIV = new long[1] ;
      H000V2_n790VBM01_TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      H000V2_A791VBM01_TBM32_LINE_SIZE_DIV = new long[1] ;
      H000V2_n791VBM01_TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      H000V2_A792VBM01_TBM32_LINE_COLOR_DIV = new long[1] ;
      H000V2_n792VBM01_TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      H000V2_A793VBM01_TBM32_LINE_START_POINT_D = new String[] {""} ;
      H000V2_n793VBM01_TBM32_LINE_START_POINT_D = new boolean[] {false} ;
      H000V2_A794VBM01_TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      H000V2_n794VBM01_TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      H000V2_A795VBM01_TBM32_LINE_ANGLE = new long[1] ;
      H000V2_n795VBM01_TBM32_LINE_ANGLE = new boolean[] {false} ;
      H000V2_A796VBM01_TBM32_AUTH_LVL_MIN = new long[1] ;
      H000V2_n796VBM01_TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      H000V2_A797VBM01_TBM32_ZORDER = new long[1] ;
      H000V2_n797VBM01_TBM32_ZORDER = new boolean[] {false} ;
      H000V2_A798VBM01_TBM32_TAB_ORDER = new long[1] ;
      H000V2_n798VBM01_TBM32_TAB_ORDER = new boolean[] {false} ;
      H000V2_A799VBM01_TBM32_TABSTOP_FLG = new String[] {""} ;
      H000V2_n799VBM01_TBM32_TABSTOP_FLG = new boolean[] {false} ;
      H000V2_A800VBM01_TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      H000V2_n800VBM01_TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      H000V2_A801VBM01_TBM32_MIN_VALUE = new String[] {""} ;
      H000V2_n801VBM01_TBM32_MIN_VALUE = new boolean[] {false} ;
      H000V2_A802VBM01_TBM32_MAX_VALUE = new String[] {""} ;
      H000V2_n802VBM01_TBM32_MAX_VALUE = new boolean[] {false} ;
      H000V2_A803VBM01_TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      H000V2_n803VBM01_TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      H000V2_A804VBM01_TBM32_REF_CRF_ID = new long[1] ;
      H000V2_n804VBM01_TBM32_REF_CRF_ID = new boolean[] {false} ;
      H000V2_A805VBM01_TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      H000V2_n805VBM01_TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      H000V2_A806VBM01_TBM37_VISIT_NO = new long[1] ;
      H000V2_n806VBM01_TBM37_VISIT_NO = new boolean[] {false} ;
      H000V2_A807VBM01_TBM37_DOM_CD = new String[] {""} ;
      H000V2_n807VBM01_TBM37_DOM_CD = new boolean[] {false} ;
      H000V2_A808VBM01_TBM37_DOM_VAR_NM = new String[] {""} ;
      H000V2_n808VBM01_TBM37_DOM_VAR_NM = new boolean[] {false} ;
      H000V2_A809VBM01_TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      H000V2_n809VBM01_TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      H000V2_A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S = new long[1] ;
      H000V2_n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S = new boolean[] {false} ;
      H000V2_A811VBM01_TBM37_DOM_ITM_GRP_ROWNO = new long[1] ;
      H000V2_n811VBM01_TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      H000V2_A812VBM01_TBM41_NCM_METADATA_ID = new String[] {""} ;
      H000V2_n812VBM01_TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      A767VBM01_TBM31_CRF_SNM = "" ;
      A768VBM01_TBM32_CRF_ITEM_CD = "" ;
      A769VBM01_TBM32_CRF_ITEM_NM = "" ;
      A770VBM01_TBM32_CRF_ITEM_DIV = "" ;
      A771VBM01_TBM32_CRF_ITEM_GRP_CD = "" ;
      A777VBM01_TBM32_TEXT_ALIGN_DIV = "" ;
      A781VBM01_TBM32_CHK_TRUE_INNER_VAL = "" ;
      A782VBM01_TBM32_CHK_FALSE_INNER_VA = "" ;
      A783VBM01_TBM32_FIXED_VALUE = "" ;
      A784VBM01_TBM32_LIST_CD = "" ;
      A785VBM01_TBM25_LIST_NM = "" ;
      A786VBM01_TBM32_IMAGE_CD = "" ;
      A787VBM01_TBM32_TEXT = "" ;
      A789VBM01_TBM32_FONT_UL_FLG = "" ;
      A793VBM01_TBM32_LINE_START_POINT_D = "" ;
      A794VBM01_TBM32_LINE_END_POINT_DIV = "" ;
      A799VBM01_TBM32_TABSTOP_FLG = "" ;
      A800VBM01_TBM32_REQUIRED_INPUT_FLG = "" ;
      A801VBM01_TBM32_MIN_VALUE = "" ;
      A802VBM01_TBM32_MAX_VALUE = "" ;
      A803VBM01_TBM32_CRF_ITEM_NOTE = "" ;
      A805VBM01_TBM32_REF_CRF_ITEM_CD = "" ;
      A807VBM01_TBM37_DOM_CD = "" ;
      A808VBM01_TBM37_DOM_VAR_NM = "" ;
      A809VBM01_TBM37_DOM_ITM_GRP_OID = "" ;
      A812VBM01_TBM41_NCM_METADATA_ID = "" ;
      AV28W_RTN_MSG = "" ;
      GXv_int4 = new short [1] ;
      GXv_int5 = new byte [1] ;
      AV14W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem6 = new GxObjectCollection [1] ;
      AV17W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem7 = new GxObjectCollection [1] ;
      AV18W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV15W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H000V3_A8TAM07_USER_ID = new String[] {""} ;
      H000V3_A2TAM07_USER_NM = new String[] {""} ;
      H000V3_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H000V4_A8TAM07_USER_ID = new String[] {""} ;
      H000V4_A2TAM07_USER_NM = new String[] {""} ;
      H000V4_n2TAM07_USER_NM = new boolean[] {false} ;
      H000V5_AV21W_CNT = new long[1] ;
      H000V6_A147TAM07_SITE_ID = new String[] {""} ;
      H000V6_n147TAM07_SITE_ID = new boolean[] {false} ;
      H000V6_A16TAM07_DEL_FLG = new String[] {""} ;
      H000V6_n16TAM07_DEL_FLG = new boolean[] {false} ;
      H000V6_A209TBM23_DEL_FLG = new String[] {""} ;
      H000V6_n209TBM23_DEL_FLG = new boolean[] {false} ;
      H000V6_A207TBM23_STUDY_ID = new long[1] ;
      H000V6_A208TBM23_USER_ID = new String[] {""} ;
      A147TAM07_SITE_ID = "" ;
      A16TAM07_DEL_FLG = "" ;
      A209TBM23_DEL_FLG = "" ;
      A208TBM23_USER_ID = "" ;
      H000V7_A198TBM22_SITE_ID = new String[] {""} ;
      H000V7_A139TAM08_DEL_FLG = new String[] {""} ;
      H000V7_n139TAM08_DEL_FLG = new boolean[] {false} ;
      H000V7_A199TBM22_DEL_FLG = new String[] {""} ;
      H000V7_n199TBM22_DEL_FLG = new boolean[] {false} ;
      H000V7_A197TBM22_STUDY_ID = new long[1] ;
      A198TBM22_SITE_ID = "" ;
      A139TAM08_DEL_FLG = "" ;
      A199TBM22_DEL_FLG = "" ;
      AV29W_USER_ID = "" ;
      H000V8_AV21W_CNT = new long[1] ;
      H000V9_AV21W_CNT = new long[1] ;
      GXv_SdtA_LOGIN_SDT8 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV19W_A819_JS = "" ;
      GXt_dtime9 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String [1] ;
      GXv_char10 = new String [1] ;
      GXv_boolean12 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_upd_exec_Jsonclick = "" ;
      lblBtn_reg_exec_Jsonclick = "" ;
      lblBtn_dlt_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock85_Jsonclick = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      lblTextblock78_Jsonclick = "" ;
      lblTextblock80_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      GXt_char1 = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTxt_domain_info_Jsonclick = "" ;
      lblTxt_btn_domain_Jsonclick = "" ;
      lblTxt_btn_crf_cond_Jsonclick = "" ;
      lblTxt_crf_info_Jsonclick = "" ;
      lblTxt_btn_crf_detail_Jsonclick = "" ;
      lblTxt_user_info_Jsonclick = "" ;
      lblTxt_btn_staff_Jsonclick = "" ;
      lblTxt_site_info_Jsonclick = "" ;
      lblTxt_btn_site_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      GXt_char2 = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_csv_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp02_study_reg__default(),
         new Object[] {
             new Object[] {
            H000V2_A765VBM01_TBM32_STUDY_ID, H000V2_n765VBM01_TBM32_STUDY_ID, H000V2_A766VBM01_TBM32_CRF_ID, H000V2_n766VBM01_TBM32_CRF_ID, H000V2_A767VBM01_TBM31_CRF_SNM, H000V2_n767VBM01_TBM31_CRF_SNM, H000V2_A768VBM01_TBM32_CRF_ITEM_CD, H000V2_n768VBM01_TBM32_CRF_ITEM_CD, H000V2_A769VBM01_TBM32_CRF_ITEM_NM, H000V2_n769VBM01_TBM32_CRF_ITEM_NM,
            H000V2_A770VBM01_TBM32_CRF_ITEM_DIV, H000V2_n770VBM01_TBM32_CRF_ITEM_DIV, H000V2_A771VBM01_TBM32_CRF_ITEM_GRP_CD, H000V2_n771VBM01_TBM32_CRF_ITEM_GRP_CD, H000V2_A772VBM01_TBM32_CRF_ITEM_GRP_ORDER, H000V2_n772VBM01_TBM32_CRF_ITEM_GRP_ORDER, H000V2_A773VBM01_TBM32_LOCATION_X, H000V2_n773VBM01_TBM32_LOCATION_X, H000V2_A774VBM01_TBM32_LOCATION_Y, H000V2_n774VBM01_TBM32_LOCATION_Y,
            H000V2_A775VBM01_TBM32_LOCATION_X2, H000V2_n775VBM01_TBM32_LOCATION_X2, H000V2_A776VBM01_TBM32_LOCATION_Y2, H000V2_n776VBM01_TBM32_LOCATION_Y2, H000V2_A777VBM01_TBM32_TEXT_ALIGN_DIV, H000V2_n777VBM01_TBM32_TEXT_ALIGN_DIV, H000V2_A778VBM01_TBM32_TEXT_MAXROWS, H000V2_n778VBM01_TBM32_TEXT_MAXROWS, H000V2_A779VBM01_TBM32_TEXT_MAXLENGTH, H000V2_n779VBM01_TBM32_TEXT_MAXLENGTH,
            H000V2_A780VBM01_TBM32_DECIMAL_DIGITS, H000V2_n780VBM01_TBM32_DECIMAL_DIGITS, H000V2_A781VBM01_TBM32_CHK_TRUE_INNER_VAL, H000V2_n781VBM01_TBM32_CHK_TRUE_INNER_VAL, H000V2_A782VBM01_TBM32_CHK_FALSE_INNER_VA, H000V2_n782VBM01_TBM32_CHK_FALSE_INNER_VA, H000V2_A783VBM01_TBM32_FIXED_VALUE, H000V2_n783VBM01_TBM32_FIXED_VALUE, H000V2_A784VBM01_TBM32_LIST_CD, H000V2_n784VBM01_TBM32_LIST_CD,
            H000V2_A785VBM01_TBM25_LIST_NM, H000V2_n785VBM01_TBM25_LIST_NM, H000V2_A786VBM01_TBM32_IMAGE_CD, H000V2_n786VBM01_TBM32_IMAGE_CD, H000V2_A787VBM01_TBM32_TEXT, H000V2_n787VBM01_TBM32_TEXT, H000V2_A788VBM01_TBM32_FONT_SIZE, H000V2_n788VBM01_TBM32_FONT_SIZE, H000V2_A789VBM01_TBM32_FONT_UL_FLG, H000V2_n789VBM01_TBM32_FONT_UL_FLG,
            H000V2_A790VBM01_TBM32_FONT_COLOR_DIV, H000V2_n790VBM01_TBM32_FONT_COLOR_DIV, H000V2_A791VBM01_TBM32_LINE_SIZE_DIV, H000V2_n791VBM01_TBM32_LINE_SIZE_DIV, H000V2_A792VBM01_TBM32_LINE_COLOR_DIV, H000V2_n792VBM01_TBM32_LINE_COLOR_DIV, H000V2_A793VBM01_TBM32_LINE_START_POINT_D, H000V2_n793VBM01_TBM32_LINE_START_POINT_D, H000V2_A794VBM01_TBM32_LINE_END_POINT_DIV, H000V2_n794VBM01_TBM32_LINE_END_POINT_DIV,
            H000V2_A795VBM01_TBM32_LINE_ANGLE, H000V2_n795VBM01_TBM32_LINE_ANGLE, H000V2_A796VBM01_TBM32_AUTH_LVL_MIN, H000V2_n796VBM01_TBM32_AUTH_LVL_MIN, H000V2_A797VBM01_TBM32_ZORDER, H000V2_n797VBM01_TBM32_ZORDER, H000V2_A798VBM01_TBM32_TAB_ORDER, H000V2_n798VBM01_TBM32_TAB_ORDER, H000V2_A799VBM01_TBM32_TABSTOP_FLG, H000V2_n799VBM01_TBM32_TABSTOP_FLG,
            H000V2_A800VBM01_TBM32_REQUIRED_INPUT_FLG, H000V2_n800VBM01_TBM32_REQUIRED_INPUT_FLG, H000V2_A801VBM01_TBM32_MIN_VALUE, H000V2_n801VBM01_TBM32_MIN_VALUE, H000V2_A802VBM01_TBM32_MAX_VALUE, H000V2_n802VBM01_TBM32_MAX_VALUE, H000V2_A803VBM01_TBM32_CRF_ITEM_NOTE, H000V2_n803VBM01_TBM32_CRF_ITEM_NOTE, H000V2_A804VBM01_TBM32_REF_CRF_ID, H000V2_n804VBM01_TBM32_REF_CRF_ID,
            H000V2_A805VBM01_TBM32_REF_CRF_ITEM_CD, H000V2_n805VBM01_TBM32_REF_CRF_ITEM_CD, H000V2_A806VBM01_TBM37_VISIT_NO, H000V2_n806VBM01_TBM37_VISIT_NO, H000V2_A807VBM01_TBM37_DOM_CD, H000V2_n807VBM01_TBM37_DOM_CD, H000V2_A808VBM01_TBM37_DOM_VAR_NM, H000V2_n808VBM01_TBM37_DOM_VAR_NM, H000V2_A809VBM01_TBM37_DOM_ITM_GRP_OID, H000V2_n809VBM01_TBM37_DOM_ITM_GRP_OID,
            H000V2_A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S, H000V2_n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S, H000V2_A811VBM01_TBM37_DOM_ITM_GRP_ROWNO, H000V2_n811VBM01_TBM37_DOM_ITM_GRP_ROWNO, H000V2_A812VBM01_TBM41_NCM_METADATA_ID, H000V2_n812VBM01_TBM41_NCM_METADATA_ID
            }
            , new Object[] {
            H000V3_A8TAM07_USER_ID, H000V3_A2TAM07_USER_NM, H000V3_n2TAM07_USER_NM
            }
            , new Object[] {
            H000V4_A8TAM07_USER_ID, H000V4_A2TAM07_USER_NM, H000V4_n2TAM07_USER_NM
            }
            , new Object[] {
            H000V5_AV21W_CNT
            }
            , new Object[] {
            H000V6_A147TAM07_SITE_ID, H000V6_n147TAM07_SITE_ID, H000V6_A16TAM07_DEL_FLG, H000V6_n16TAM07_DEL_FLG, H000V6_A209TBM23_DEL_FLG, H000V6_n209TBM23_DEL_FLG, H000V6_A207TBM23_STUDY_ID, H000V6_A208TBM23_USER_ID
            }
            , new Object[] {
            H000V7_A198TBM22_SITE_ID, H000V7_A139TAM08_DEL_FLG, H000V7_n139TAM08_DEL_FLG, H000V7_A199TBM22_DEL_FLG, H000V7_n199TBM22_DEL_FLG, H000V7_A197TBM22_STUDY_ID
            }
            , new Object[] {
            H000V8_AV21W_CNT
            }
            , new Object[] {
            H000V9_AV21W_CNT
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV45Pgmname = "B402_WP02_STUDY_REG" ;
      AV44Pgmdesc = "試験登録（入力）" ;
      /* GeneXus formulas. */
      AV45Pgmname = "B402_WP02_STUDY_REG" ;
      AV44Pgmdesc = "試験登録（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_crt_datetime_Enabled = 0 ;
      edtavCtltbm21_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm21_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm21_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV23W_ERR_CD ;
   private byte AV46GXLvl225 ;
   private byte GXv_int5[] ;
   private byte AV49GXLvl480 ;
   private byte AV50GXLvl495 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm21_note_Backstyle ;
   private byte edtavCtltbm21_proc_nm_Backstyle ;
   private byte edtavCtltbm21_study_nm_Backstyle ;
   private byte edtavCtltbm21_outer_study_id_Backstyle ;
   private byte edtavCtltbm21_study_id_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV27W_RTN_CD ;
   private short GXv_int4[] ;
   private int edtavCtltbm21_crt_datetime_Enabled ;
   private int edtavCtltbm21_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm21_crt_prog_nm_Enabled ;
   private int edtavCtltbm21_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV47GXV12 ;
   private int edtavCtltbm21_study_id_Backcolor ;
   private int edtavCtltbm21_outer_study_id_Backcolor ;
   private int edtavCtltbm21_study_nm_Backcolor ;
   private int edtavCtltbm21_proc_nm_Backcolor ;
   private int edtavCtltbm21_note_Backcolor ;
   private int AV48GXV13 ;
   private int edtavCtltbm21_study_id_Enabled ;
   private int edtavCtltbm21_crt_datetime_Visible ;
   private int edtavCtltbm21_upd_datetime_Visible ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int lblTxt_btn_csv_Visible ;
   private int lblTxt_btn_site_Visible ;
   private int lblTxt_btn_staff_Visible ;
   private int lblTxt_btn_crf_detail_Visible ;
   private int lblTxt_btn_crf_cond_Visible ;
   private int lblTxt_btn_domain_Visible ;
   private int idxLst ;
   private long wcpOAV13P_STUDY_ID ;
   private long AV13P_STUDY_ID ;
   private long A765VBM01_TBM32_STUDY_ID ;
   private long A766VBM01_TBM32_CRF_ID ;
   private long A772VBM01_TBM32_CRF_ITEM_GRP_ORDER ;
   private long A773VBM01_TBM32_LOCATION_X ;
   private long A774VBM01_TBM32_LOCATION_Y ;
   private long A775VBM01_TBM32_LOCATION_X2 ;
   private long A776VBM01_TBM32_LOCATION_Y2 ;
   private long A778VBM01_TBM32_TEXT_MAXROWS ;
   private long A779VBM01_TBM32_TEXT_MAXLENGTH ;
   private long A780VBM01_TBM32_DECIMAL_DIGITS ;
   private long A788VBM01_TBM32_FONT_SIZE ;
   private long A790VBM01_TBM32_FONT_COLOR_DIV ;
   private long A791VBM01_TBM32_LINE_SIZE_DIV ;
   private long A792VBM01_TBM32_LINE_COLOR_DIV ;
   private long A795VBM01_TBM32_LINE_ANGLE ;
   private long A796VBM01_TBM32_AUTH_LVL_MIN ;
   private long A797VBM01_TBM32_ZORDER ;
   private long A798VBM01_TBM32_TAB_ORDER ;
   private long A804VBM01_TBM32_REF_CRF_ID ;
   private long A806VBM01_TBM37_VISIT_NO ;
   private long A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S ;
   private long A811VBM01_TBM37_DOM_ITM_GRP_ROWNO ;
   private long AV21W_CNT ;
   private long cV21W_CNT ;
   private long A207TBM23_STUDY_ID ;
   private long A197TBM22_STUDY_ID ;
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
   private String AV45Pgmname ;
   private String AV44Pgmdesc ;
   private String edtavCtltbm21_crt_datetime_Internalname ;
   private String edtavCtltbm21_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm21_crt_prog_nm_Internalname ;
   private String edtavCtltbm21_upd_prog_nm_Internalname ;
   private String edtavCtltbm21_study_id_Internalname ;
   private String edtavCtltbm21_outer_study_id_Internalname ;
   private String edtavCtltbm21_study_nm_Internalname ;
   private String edtavCtltbm21_proc_nm_Internalname ;
   private String edtavCtltbm21_note_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_site_info_Caption ;
   private String lblTxt_site_info_Internalname ;
   private String lblTxt_user_info_Caption ;
   private String lblTxt_user_info_Internalname ;
   private String lblTxt_crf_info_Caption ;
   private String lblTxt_crf_info_Internalname ;
   private String lblTxt_domain_info_Caption ;
   private String lblTxt_domain_info_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char10[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String lblTxt_btn_csv_Internalname ;
   private String lblTxt_btn_site_Internalname ;
   private String lblTxt_btn_staff_Internalname ;
   private String lblTxt_btn_crf_detail_Internalname ;
   private String lblTxt_btn_crf_cond_Internalname ;
   private String lblTxt_btn_domain_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_upd_exec_Internalname ;
   private String lblBtn_upd_exec_Jsonclick ;
   private String lblBtn_reg_exec_Internalname ;
   private String lblBtn_reg_exec_Jsonclick ;
   private String lblBtn_dlt_exec_Internalname ;
   private String lblBtn_dlt_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavCtltbm21_crt_datetime_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtavCtltbm21_upd_datetime_Jsonclick ;
   private String GXt_char1 ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtavCtltbm21_crt_prog_nm_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtavCtltbm21_upd_prog_nm_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTxt_domain_info_Jsonclick ;
   private String lblTxt_btn_domain_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTxt_btn_crf_cond_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTxt_crf_info_Jsonclick ;
   private String lblTxt_btn_crf_detail_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTxt_user_info_Jsonclick ;
   private String lblTxt_btn_staff_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTxt_site_info_Jsonclick ;
   private String lblTxt_btn_site_Jsonclick ;
   private String tblTable5_Internalname ;
   private String imgImage6_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtavCtltbm21_study_id_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtavCtltbm21_outer_study_id_Jsonclick ;
   private String imgImage7_Internalname ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtavCtltbm21_study_nm_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtavCtltbm21_proc_nm_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String GXt_char2 ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_csv_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime9 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV25W_ERRFLG ;
   private boolean AV22W_DEL_FLG ;
   private boolean n765VBM01_TBM32_STUDY_ID ;
   private boolean n766VBM01_TBM32_CRF_ID ;
   private boolean n767VBM01_TBM31_CRF_SNM ;
   private boolean n768VBM01_TBM32_CRF_ITEM_CD ;
   private boolean n769VBM01_TBM32_CRF_ITEM_NM ;
   private boolean n770VBM01_TBM32_CRF_ITEM_DIV ;
   private boolean n771VBM01_TBM32_CRF_ITEM_GRP_CD ;
   private boolean n772VBM01_TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n773VBM01_TBM32_LOCATION_X ;
   private boolean n774VBM01_TBM32_LOCATION_Y ;
   private boolean n775VBM01_TBM32_LOCATION_X2 ;
   private boolean n776VBM01_TBM32_LOCATION_Y2 ;
   private boolean n777VBM01_TBM32_TEXT_ALIGN_DIV ;
   private boolean n778VBM01_TBM32_TEXT_MAXROWS ;
   private boolean n779VBM01_TBM32_TEXT_MAXLENGTH ;
   private boolean n780VBM01_TBM32_DECIMAL_DIGITS ;
   private boolean n781VBM01_TBM32_CHK_TRUE_INNER_VAL ;
   private boolean n782VBM01_TBM32_CHK_FALSE_INNER_VA ;
   private boolean n783VBM01_TBM32_FIXED_VALUE ;
   private boolean n784VBM01_TBM32_LIST_CD ;
   private boolean n785VBM01_TBM25_LIST_NM ;
   private boolean n786VBM01_TBM32_IMAGE_CD ;
   private boolean n787VBM01_TBM32_TEXT ;
   private boolean n788VBM01_TBM32_FONT_SIZE ;
   private boolean n789VBM01_TBM32_FONT_UL_FLG ;
   private boolean n790VBM01_TBM32_FONT_COLOR_DIV ;
   private boolean n791VBM01_TBM32_LINE_SIZE_DIV ;
   private boolean n792VBM01_TBM32_LINE_COLOR_DIV ;
   private boolean n793VBM01_TBM32_LINE_START_POINT_D ;
   private boolean n794VBM01_TBM32_LINE_END_POINT_DIV ;
   private boolean n795VBM01_TBM32_LINE_ANGLE ;
   private boolean n796VBM01_TBM32_AUTH_LVL_MIN ;
   private boolean n797VBM01_TBM32_ZORDER ;
   private boolean n798VBM01_TBM32_TAB_ORDER ;
   private boolean n799VBM01_TBM32_TABSTOP_FLG ;
   private boolean n800VBM01_TBM32_REQUIRED_INPUT_FLG ;
   private boolean n801VBM01_TBM32_MIN_VALUE ;
   private boolean n802VBM01_TBM32_MAX_VALUE ;
   private boolean n803VBM01_TBM32_CRF_ITEM_NOTE ;
   private boolean n804VBM01_TBM32_REF_CRF_ID ;
   private boolean n805VBM01_TBM32_REF_CRF_ITEM_CD ;
   private boolean n806VBM01_TBM37_VISIT_NO ;
   private boolean n807VBM01_TBM37_DOM_CD ;
   private boolean n808VBM01_TBM37_DOM_VAR_NM ;
   private boolean n809VBM01_TBM37_DOM_ITM_GRP_OID ;
   private boolean n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S ;
   private boolean n811VBM01_TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n812VBM01_TBM41_NCM_METADATA_ID ;
   private boolean n2TAM07_USER_NM ;
   private boolean n147TAM07_SITE_ID ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n209TBM23_DEL_FLG ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n199TBM22_DEL_FLG ;
   private boolean GXt_boolean11 ;
   private boolean GXv_boolean12[] ;
   private String AV8D_CRT_USER_NM ;
   private String AV9D_UPD_USER_NM ;
   private String AV10H_INIT_FLG ;
   private String AV12H_MODE ;
   private String AV11H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV26W_MSG ;
   private String AV20W_A821_JS ;
   private String A767VBM01_TBM31_CRF_SNM ;
   private String A768VBM01_TBM32_CRF_ITEM_CD ;
   private String A769VBM01_TBM32_CRF_ITEM_NM ;
   private String A770VBM01_TBM32_CRF_ITEM_DIV ;
   private String A771VBM01_TBM32_CRF_ITEM_GRP_CD ;
   private String A777VBM01_TBM32_TEXT_ALIGN_DIV ;
   private String A781VBM01_TBM32_CHK_TRUE_INNER_VAL ;
   private String A782VBM01_TBM32_CHK_FALSE_INNER_VA ;
   private String A783VBM01_TBM32_FIXED_VALUE ;
   private String A784VBM01_TBM32_LIST_CD ;
   private String A785VBM01_TBM25_LIST_NM ;
   private String A786VBM01_TBM32_IMAGE_CD ;
   private String A787VBM01_TBM32_TEXT ;
   private String A789VBM01_TBM32_FONT_UL_FLG ;
   private String A793VBM01_TBM32_LINE_START_POINT_D ;
   private String A794VBM01_TBM32_LINE_END_POINT_DIV ;
   private String A799VBM01_TBM32_TABSTOP_FLG ;
   private String A800VBM01_TBM32_REQUIRED_INPUT_FLG ;
   private String A801VBM01_TBM32_MIN_VALUE ;
   private String A802VBM01_TBM32_MAX_VALUE ;
   private String A803VBM01_TBM32_CRF_ITEM_NOTE ;
   private String A805VBM01_TBM32_REF_CRF_ITEM_CD ;
   private String A807VBM01_TBM37_DOM_CD ;
   private String A808VBM01_TBM37_DOM_VAR_NM ;
   private String A809VBM01_TBM37_DOM_ITM_GRP_OID ;
   private String A812VBM01_TBM41_NCM_METADATA_ID ;
   private String AV28W_RTN_MSG ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A147TAM07_SITE_ID ;
   private String A16TAM07_DEL_FLG ;
   private String A209TBM23_DEL_FLG ;
   private String A208TBM23_USER_ID ;
   private String A198TBM22_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A199TBM22_DEL_FLG ;
   private String AV29W_USER_ID ;
   private String AV24W_ERRCD ;
   private String AV19W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM21_STUDY AV5BC_STUDY ;
   private HTMLChoice radavCtltbm21_status ;
   private HTMLChoice radavCtltbm21_del_flg ;
   private IDataStoreProvider pr_default ;
   private long[] H000V2_A765VBM01_TBM32_STUDY_ID ;
   private boolean[] H000V2_n765VBM01_TBM32_STUDY_ID ;
   private long[] H000V2_A766VBM01_TBM32_CRF_ID ;
   private boolean[] H000V2_n766VBM01_TBM32_CRF_ID ;
   private String[] H000V2_A767VBM01_TBM31_CRF_SNM ;
   private boolean[] H000V2_n767VBM01_TBM31_CRF_SNM ;
   private String[] H000V2_A768VBM01_TBM32_CRF_ITEM_CD ;
   private boolean[] H000V2_n768VBM01_TBM32_CRF_ITEM_CD ;
   private String[] H000V2_A769VBM01_TBM32_CRF_ITEM_NM ;
   private boolean[] H000V2_n769VBM01_TBM32_CRF_ITEM_NM ;
   private String[] H000V2_A770VBM01_TBM32_CRF_ITEM_DIV ;
   private boolean[] H000V2_n770VBM01_TBM32_CRF_ITEM_DIV ;
   private String[] H000V2_A771VBM01_TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] H000V2_n771VBM01_TBM32_CRF_ITEM_GRP_CD ;
   private long[] H000V2_A772VBM01_TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] H000V2_n772VBM01_TBM32_CRF_ITEM_GRP_ORDER ;
   private long[] H000V2_A773VBM01_TBM32_LOCATION_X ;
   private boolean[] H000V2_n773VBM01_TBM32_LOCATION_X ;
   private long[] H000V2_A774VBM01_TBM32_LOCATION_Y ;
   private boolean[] H000V2_n774VBM01_TBM32_LOCATION_Y ;
   private long[] H000V2_A775VBM01_TBM32_LOCATION_X2 ;
   private boolean[] H000V2_n775VBM01_TBM32_LOCATION_X2 ;
   private long[] H000V2_A776VBM01_TBM32_LOCATION_Y2 ;
   private boolean[] H000V2_n776VBM01_TBM32_LOCATION_Y2 ;
   private String[] H000V2_A777VBM01_TBM32_TEXT_ALIGN_DIV ;
   private boolean[] H000V2_n777VBM01_TBM32_TEXT_ALIGN_DIV ;
   private long[] H000V2_A778VBM01_TBM32_TEXT_MAXROWS ;
   private boolean[] H000V2_n778VBM01_TBM32_TEXT_MAXROWS ;
   private long[] H000V2_A779VBM01_TBM32_TEXT_MAXLENGTH ;
   private boolean[] H000V2_n779VBM01_TBM32_TEXT_MAXLENGTH ;
   private long[] H000V2_A780VBM01_TBM32_DECIMAL_DIGITS ;
   private boolean[] H000V2_n780VBM01_TBM32_DECIMAL_DIGITS ;
   private String[] H000V2_A781VBM01_TBM32_CHK_TRUE_INNER_VAL ;
   private boolean[] H000V2_n781VBM01_TBM32_CHK_TRUE_INNER_VAL ;
   private String[] H000V2_A782VBM01_TBM32_CHK_FALSE_INNER_VA ;
   private boolean[] H000V2_n782VBM01_TBM32_CHK_FALSE_INNER_VA ;
   private String[] H000V2_A783VBM01_TBM32_FIXED_VALUE ;
   private boolean[] H000V2_n783VBM01_TBM32_FIXED_VALUE ;
   private String[] H000V2_A784VBM01_TBM32_LIST_CD ;
   private boolean[] H000V2_n784VBM01_TBM32_LIST_CD ;
   private String[] H000V2_A785VBM01_TBM25_LIST_NM ;
   private boolean[] H000V2_n785VBM01_TBM25_LIST_NM ;
   private String[] H000V2_A786VBM01_TBM32_IMAGE_CD ;
   private boolean[] H000V2_n786VBM01_TBM32_IMAGE_CD ;
   private String[] H000V2_A787VBM01_TBM32_TEXT ;
   private boolean[] H000V2_n787VBM01_TBM32_TEXT ;
   private long[] H000V2_A788VBM01_TBM32_FONT_SIZE ;
   private boolean[] H000V2_n788VBM01_TBM32_FONT_SIZE ;
   private String[] H000V2_A789VBM01_TBM32_FONT_UL_FLG ;
   private boolean[] H000V2_n789VBM01_TBM32_FONT_UL_FLG ;
   private long[] H000V2_A790VBM01_TBM32_FONT_COLOR_DIV ;
   private boolean[] H000V2_n790VBM01_TBM32_FONT_COLOR_DIV ;
   private long[] H000V2_A791VBM01_TBM32_LINE_SIZE_DIV ;
   private boolean[] H000V2_n791VBM01_TBM32_LINE_SIZE_DIV ;
   private long[] H000V2_A792VBM01_TBM32_LINE_COLOR_DIV ;
   private boolean[] H000V2_n792VBM01_TBM32_LINE_COLOR_DIV ;
   private String[] H000V2_A793VBM01_TBM32_LINE_START_POINT_D ;
   private boolean[] H000V2_n793VBM01_TBM32_LINE_START_POINT_D ;
   private String[] H000V2_A794VBM01_TBM32_LINE_END_POINT_DIV ;
   private boolean[] H000V2_n794VBM01_TBM32_LINE_END_POINT_DIV ;
   private long[] H000V2_A795VBM01_TBM32_LINE_ANGLE ;
   private boolean[] H000V2_n795VBM01_TBM32_LINE_ANGLE ;
   private long[] H000V2_A796VBM01_TBM32_AUTH_LVL_MIN ;
   private boolean[] H000V2_n796VBM01_TBM32_AUTH_LVL_MIN ;
   private long[] H000V2_A797VBM01_TBM32_ZORDER ;
   private boolean[] H000V2_n797VBM01_TBM32_ZORDER ;
   private long[] H000V2_A798VBM01_TBM32_TAB_ORDER ;
   private boolean[] H000V2_n798VBM01_TBM32_TAB_ORDER ;
   private String[] H000V2_A799VBM01_TBM32_TABSTOP_FLG ;
   private boolean[] H000V2_n799VBM01_TBM32_TABSTOP_FLG ;
   private String[] H000V2_A800VBM01_TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] H000V2_n800VBM01_TBM32_REQUIRED_INPUT_FLG ;
   private String[] H000V2_A801VBM01_TBM32_MIN_VALUE ;
   private boolean[] H000V2_n801VBM01_TBM32_MIN_VALUE ;
   private String[] H000V2_A802VBM01_TBM32_MAX_VALUE ;
   private boolean[] H000V2_n802VBM01_TBM32_MAX_VALUE ;
   private String[] H000V2_A803VBM01_TBM32_CRF_ITEM_NOTE ;
   private boolean[] H000V2_n803VBM01_TBM32_CRF_ITEM_NOTE ;
   private long[] H000V2_A804VBM01_TBM32_REF_CRF_ID ;
   private boolean[] H000V2_n804VBM01_TBM32_REF_CRF_ID ;
   private String[] H000V2_A805VBM01_TBM32_REF_CRF_ITEM_CD ;
   private boolean[] H000V2_n805VBM01_TBM32_REF_CRF_ITEM_CD ;
   private long[] H000V2_A806VBM01_TBM37_VISIT_NO ;
   private boolean[] H000V2_n806VBM01_TBM37_VISIT_NO ;
   private String[] H000V2_A807VBM01_TBM37_DOM_CD ;
   private boolean[] H000V2_n807VBM01_TBM37_DOM_CD ;
   private String[] H000V2_A808VBM01_TBM37_DOM_VAR_NM ;
   private boolean[] H000V2_n808VBM01_TBM37_DOM_VAR_NM ;
   private String[] H000V2_A809VBM01_TBM37_DOM_ITM_GRP_OID ;
   private boolean[] H000V2_n809VBM01_TBM37_DOM_ITM_GRP_OID ;
   private long[] H000V2_A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S ;
   private boolean[] H000V2_n810VBM01_TBM37_DOM_ITM_GRP_ATTR_S ;
   private long[] H000V2_A811VBM01_TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] H000V2_n811VBM01_TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] H000V2_A812VBM01_TBM41_NCM_METADATA_ID ;
   private boolean[] H000V2_n812VBM01_TBM41_NCM_METADATA_ID ;
   private String[] H000V3_A8TAM07_USER_ID ;
   private String[] H000V3_A2TAM07_USER_NM ;
   private boolean[] H000V3_n2TAM07_USER_NM ;
   private String[] H000V4_A8TAM07_USER_ID ;
   private String[] H000V4_A2TAM07_USER_NM ;
   private boolean[] H000V4_n2TAM07_USER_NM ;
   private long[] H000V5_AV21W_CNT ;
   private String[] H000V6_A147TAM07_SITE_ID ;
   private boolean[] H000V6_n147TAM07_SITE_ID ;
   private String[] H000V6_A16TAM07_DEL_FLG ;
   private boolean[] H000V6_n16TAM07_DEL_FLG ;
   private String[] H000V6_A209TBM23_DEL_FLG ;
   private boolean[] H000V6_n209TBM23_DEL_FLG ;
   private long[] H000V6_A207TBM23_STUDY_ID ;
   private String[] H000V6_A208TBM23_USER_ID ;
   private String[] H000V7_A198TBM22_SITE_ID ;
   private String[] H000V7_A139TAM08_DEL_FLG ;
   private boolean[] H000V7_n139TAM08_DEL_FLG ;
   private String[] H000V7_A199TBM22_DEL_FLG ;
   private boolean[] H000V7_n199TBM22_DEL_FLG ;
   private long[] H000V7_A197TBM22_STUDY_ID ;
   private long[] H000V8_AV21W_CNT ;
   private long[] H000V9_AV21W_CNT ;
   private GxObjectCollection AV14W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem6[] ;
   private GxObjectCollection AV17W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem7[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV15W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV16W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT8[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV18W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp02_study_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000V2", "SELECT `VBM01_TBM32_STUDY_ID`, `VBM01_TBM32_CRF_ID`, `VBM01_TBM31_CRF_SNM`, `VBM01_TBM32_CRF_ITEM_CD`, `VBM01_TBM32_CRF_ITEM_NM`, `VBM01_TBM32_CRF_ITEM_DIV`, `VBM01_TBM32_CRF_ITEM_GRP_CD`, `VBM01_TBM32_CRF_ITEM_GRP_ORDER`, `VBM01_TBM32_LOCATION_X`, `VBM01_TBM32_LOCATION_Y`, `VBM01_TBM32_LOCATION_X2`, `VBM01_TBM32_LOCATION_Y2`, `VBM01_TBM32_TEXT_ALIGN_DIV`, `VBM01_TBM32_TEXT_MAXROWS`, `VBM01_TBM32_TEXT_MAXLENGTH`, `VBM01_TBM32_DECIMAL_DIGITS`, `VBM01_TBM32_CHK_TRUE_INNER_VALUE`, `VBM01_TBM32_CHK_FALSE_INNER_VALUE`, `VBM01_TBM32_FIXED_VALUE`, `VBM01_TBM32_LIST_CD`, `VBM01_TBM25_LIST_NM`, `VBM01_TBM32_IMAGE_CD`, `VBM01_TBM32_TEXT`, `VBM01_TBM32_FONT_SIZE`, `VBM01_TBM32_FONT_UL_FLG`, `VBM01_TBM32_FONT_COLOR_DIV`, `VBM01_TBM32_LINE_SIZE_DIV`, `VBM01_TBM32_LINE_COLOR_DIV`, `VBM01_TBM32_LINE_START_POINT_DIV`, `VBM01_TBM32_LINE_END_POINT_DIV`, `VBM01_TBM32_LINE_ANGLE`, `VBM01_TBM32_AUTH_LVL_MIN`, `VBM01_TBM32_ZORDER`, `VBM01_TBM32_TAB_ORDER`, `VBM01_TBM32_TABSTOP_FLG`, `VBM01_TBM32_REQUIRED_INPUT_FLG`, `VBM01_TBM32_MIN_VALUE`, `VBM01_TBM32_MAX_VALUE`, `VBM01_TBM32_CRF_ITEM_NOTE`, `VBM01_TBM32_REF_CRF_ID`, `VBM01_TBM32_REF_CRF_ITEM_CD`, `VBM01_TBM37_VISIT_NO`, `VBM01_TBM37_DOM_CD`, `VBM01_TBM37_DOM_VAR_NM`, `VBM01_TBM37_DOM_ITM_GRP_OID`, `VBM01_TBM37_DOM_ITM_GRP_ATTR_SEQ`, `VBM01_TBM37_DOM_ITM_GRP_ROWNO`, `VBM01_TBM41_NCM_METADATA_ID` FROM `vbm01_crf_def_inf` WHERE `VBM01_TBM32_STUDY_ID` = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000V3", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000V4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000V5", "SELECT COUNT(*) FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID` = T1.`TBM22_SITE_ID`) WHERE (T1.`TBM22_STUDY_ID` = ?) AND (T1.`TBM22_DEL_FLG` = '0') AND (T2.`TAM08_DEL_FLG` = '0') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H000V6", "SELECT DISTINCT T2.`TAM07_SITE_ID`, T2.`TAM07_DEL_FLG`, T1.`TBM23_DEL_FLG`, T1.`TBM23_STUDY_ID`, T1.`TBM23_USER_ID` AS TBM23_USER_ID FROM (`TBM23_STUDY_STAFF` T1 INNER JOIN `TAM07_USER` T2 ON T2.`TAM07_USER_ID` = T1.`TBM23_USER_ID`) WHERE (T1.`TBM23_STUDY_ID` = ?) AND (T1.`TBM23_DEL_FLG` = '0') AND (T2.`TAM07_DEL_FLG` = '0') ORDER BY T1.`TBM23_STUDY_ID`, T1.`TBM23_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000V7", "SELECT T1.`TBM22_SITE_ID` AS TBM22_SITE_ID, T2.`TAM08_DEL_FLG`, T1.`TBM22_DEL_FLG`, T1.`TBM22_STUDY_ID` FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID` = T1.`TBM22_SITE_ID`) WHERE (T1.`TBM22_STUDY_ID` = ? and T1.`TBM22_SITE_ID` = ?) AND (T1.`TBM22_DEL_FLG` = '0') AND (T2.`TAM08_DEL_FLG` = '0') ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000V8", "SELECT COUNT(*) FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H000V9", "SELECT COUNT(*) FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE (`TBM42_STUDY_ID` = ?) AND (`TBM42_DEL_FLG` = '0') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((long[]) buf[50])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((long[]) buf[52])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((long[]) buf[54])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((long[]) buf[60])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((long[]) buf[64])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((long[]) buf[78])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((long[]) buf[82])[0] = rslt.getLong(42) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((long[]) buf[90])[0] = rslt.getLong(46) ;
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((long[]) buf[92])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(48) ;
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

