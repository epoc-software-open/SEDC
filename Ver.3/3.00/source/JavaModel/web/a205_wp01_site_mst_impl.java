/*
               File: a205_wp01_site_mst_impl
        Description: �{�݃}�X�^�����e�i���X�i���́j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:52.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a205_wp01_site_mst_impl extends GXWebPanel
{
   public a205_wp01_site_mst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a205_wp01_site_mst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a205_wp01_site_mst_impl.class ));
   }

   public a205_wp01_site_mst_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltam08_del_flg = new HTMLChoice();
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
            AV15P_SITE_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
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
         pa0T2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0T2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0T2( ) ;
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
      httpContext.writeValue( "�{�݃}�X�^�����e�i���X�i���́j") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513225250");
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-ja.js", "?"+httpContext.getBuildNumber( 92797));
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
      GXEncryptionTmp = "a205_wp01_site_mst"+GXutil.URLEncode(GXutil.rtrim(AV15P_SITE_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a205_wp01_site_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0T2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_site", AV5BC_SITE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_site", AV5BC_SITE);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_SITE_ID", GXutil.rtrim( AV15P_SITE_ID));
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
      return "A205_WP01_SITE_MST" ;
   }

   public String getPgmdesc( )
   {
      return "�{�݃}�X�^�����e�i���X�i���́j" ;
   }

   public void wb0T0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0T2( true) ;
      }
      else
      {
         wb_table1_2_0T2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "�{�݃}�X�^�����e�i���X�i���́j", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0100") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0100", "");
         }
      }
      wbErr = false ;
      strup0T0( ) ;
   }

   public void ws0T2( )
   {
      start0T2( ) ;
      evt0T2( ) ;
   }

   public void evt0T2( )
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
                        /* Execute user event: e110T2 */
                        e110T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120T2 */
                        e120T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130T2 */
                        e130T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140T2 */
                        e140T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150T2 */
                        e150T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160T2 */
                        e160T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170T2 */
                        e170T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180T2 */
                        e180T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190T2 */
                        e190T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200T2 */
                        e200T2 ();
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
                  else if ( nCmpId == 100 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0100") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0100", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0T2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0T2( ) ;
         }
      }
   }

   public void pa0T2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a205_wp01_site_mst")), "a205_wp01_site_mst") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a205_wp01_site_mst"))) ;
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
                  AV15P_SITE_ID = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
               }
            }
         }
         radavCtltam08_del_flg.setName( "CTLTAM08_DEL_FLG" );
         radavCtltam08_del_flg.setWebtags( "" );
         radavCtltam08_del_flg.addItem("0", "���p�\", (short)(0));
         radavCtltam08_del_flg.addItem("1", "���p�s��", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf0T2( ) ;
      /* End function Refresh */
   }

   public void rf0T2( )
   {
      /* Execute user event: e160T2 */
      e160T2 ();
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
         /* Execute user event: e200T2 */
         e200T2 ();
         wb0T0( ) ;
      }
   }

   public void strup0T0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "A205_WP01_SITE_MST" ;
      AV39Pgmdesc = "�{�݃}�X�^�����e�i���X�i���́j" ;
      Gx_err = (short)(0) ;
      edtavCtltam08_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_crt_datetime_Enabled, 5, 0)));
      edtavCtltam08_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltam08_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltam08_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e150T2 */
      e150T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_site"), AV5BC_SITE);
         /* Read variables values. */
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_id( httpContext.cgiGet( edtavCtltam08_site_id_Internalname) );
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id( httpContext.cgiGet( edtavCtltam08_outer_site_id_Internalname) );
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_nm( httpContext.cgiGet( edtavCtltam08_site_nm_Internalname) );
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_del_flg( httpContext.cgiGet( radavCtltam08_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam08_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM08_CRT_DATETIME");
            GX_FocusControl = edtavCtltam08_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam08_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam08_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM08_UPD_DATETIME");
            GX_FocusControl = edtavCtltam08_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam08_upd_datetime_Internalname)) );
         }
         AV10D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         AV11D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( httpContext.cgiGet( edtavCtltam08_crt_prog_nm_Internalname) );
         AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( httpContext.cgiGet( edtavCtltam08_upd_prog_nm_Internalname) );
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV14H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         /* Read saved values. */
         AV15P_SITE_ID = httpContext.cgiGet( "vP_SITE_ID") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0100") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0100", "");
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
      /* Execute user event: e150T2 */
      e150T2 ();
      if (returnInSub) return;
   }

   public void e150T2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "A205" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      AV8C_GAMEN_TITLE = AV39Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV19W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0100",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e160T2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "��ʋN��") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV12H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e110T2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "0") == 0 )
         {
            AV25W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV25W_ERRFLG )
            {
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               GXt_char1 = AV23W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               AV23W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
            }
         }
      }
   }

   public void e170T2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_user_id( AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id( AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.Save();
      if ( AV5BC_SITE.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a205_wp01_site_mst"+GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a205_wp01_site_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
   }

   public void e120T2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV25W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV25W_ERRFLG )
            {
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               GXt_char1 = AV23W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               AV23W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
            }
         }
      }
   }

   public void e180T2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id( AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.Save();
      if ( AV5BC_SITE.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a204_wp01_site_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a204_wp01_site_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
   }

   public void e130T2( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV25W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            /* Using cursor H000T2 */
            pr_default.execute(0, new Object[] {AV15P_SITE_ID});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A377TBM22_DEL_FLG = H000T2_A377TBM22_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A377TBM22_DEL_FLG", A377TBM22_DEL_FLG);
               n377TBM22_DEL_FLG = H000T2_n377TBM22_DEL_FLG[0] ;
               A18TBM22_SITE_ID = H000T2_A18TBM22_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A18TBM22_SITE_ID", A18TBM22_SITE_ID);
               AV25W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "�Ώێ{��", "�������{�{�݂ɑI���ς݂�", "�폜", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               httpContext.GX_msglist.addItem(AV26W_MSG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(0);
            }
            pr_default.close(0);
            if ( ! AV25W_ERRFLG )
            {
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               GXt_char1 = AV23W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               AV23W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
            }
         }
      }
   }

   public void e190T2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      /* Using cursor H000T3 */
      pr_default.execute(1, new Object[] {AV15P_SITE_ID});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A377TBM22_DEL_FLG = H000T3_A377TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM22_DEL_FLG", A377TBM22_DEL_FLG);
         n377TBM22_DEL_FLG = H000T3_n377TBM22_DEL_FLG[0] ;
         A18TBM22_SITE_ID = H000T3_A18TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TBM22_SITE_ID", A18TBM22_SITE_ID);
         A17TBM22_STUDY_ID = H000T3_A17TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)));
         AV27BC_TBM22.Load(A17TBM22_STUDY_ID, A18TBM22_SITE_ID);
         if ( AV27BC_TBM22.Fail() )
         {
         }
         else
         {
            AV27BC_TBM22.Delete();
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV5BC_SITE.Delete();
      if ( AV5BC_SITE.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a204_wp01_site_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a204_wp01_site_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
   }

   public void e140T2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a204_wp01_site_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a204_wp01_site_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_id())==0) )
      {
      }
      else
      {
         AV43GXLvl363 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl363", GXutil.str( AV43GXLvl363, 1, 0));
         /* Using cursor H000T4 */
         pr_default.execute(2, new Object[] {AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_id()});
         if ( Gx_err != 0 )
         {
            AV43GXLvl363 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl363", GXutil.str( AV43GXLvl363, 1, 0));
         }
         while ( (pr_default.getStatus(2) != 101) )
         {
            A57TAM08_SITE_ID = H000T4_A57TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
            A329TAM08_UPD_DATETIME = H000T4_A329TAM08_UPD_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n329TAM08_UPD_DATETIME = H000T4_n329TAM08_UPD_DATETIME[0] ;
            AV43GXLvl363 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl363", GXutil.str( AV43GXLvl363, 1, 0));
            if ( (GXutil.strcmp("", AV15P_SITE_ID)==0) )
            {
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               httpContext.GX_msglist.addItem(AV26W_MSG);
               edtavCtltam08_site_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Backcolor, 9, 0)));
               if ( ! AV25W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam08_site_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV25W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            }
            else
            {
               if ( !( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime().equals( A329TAM08_UPD_DATETIME ) ) )
               {
                  GXt_char1 = AV26W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV26W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
                  httpContext.GX_msglist.addItem(AV26W_MSG);
                  AV25W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV43GXLvl363 == 0 )
         {
            if ( ! (GXutil.strcmp("", AV15P_SITE_ID)==0) )
            {
               GXt_char1 = AV26W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV26W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
               httpContext.GX_msglist.addItem(AV26W_MSG);
               edtavCtltam08_site_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Backcolor, 9, 0)));
               if ( ! AV25W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam08_site_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV25W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            }
         }
      }
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] = AV17W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] = AV20W_A_RESULT_MSG_SDT ;
      new a205_pc01_site_mst_chk(remoteHandle, context).execute( AV5BC_SITE, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4) ;
      AV17W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] ;
      AV20W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] ;
      if ( AV20W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV25W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
         AV44GXV10 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXV10", GXutil.ltrim( GXutil.str( AV44GXV10, 8, 0)));
         while ( AV44GXV10 <= AV20W_A_RESULT_MSG_SDT.size() )
         {
            AV21W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV20W_A_RESULT_MSG_SDT.elementAt(-1+AV44GXV10));
            httpContext.GX_msglist.addItem(AV21W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV44GXV10 = (int)(AV44GXV10+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44GXV10", GXutil.ltrim( GXutil.str( AV44GXV10, 8, 0)));
         }
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltam08_site_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Backcolor, 9, 0)));
      edtavCtltam08_site_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_nm_Backcolor, 9, 0)));
      edtavCtltam08_site_snm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_snm_Backcolor, 9, 0)));
      edtavCtltam08_outer_site_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_outer_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_outer_site_id_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV45GXV11 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GXV11", GXutil.ltrim( GXutil.str( AV45GXV11, 8, 0)));
      while ( AV45GXV11 <= AV17W_A_CHK_RESULT_SDT.size() )
      {
         AV18W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV17W_A_CHK_RESULT_SDT.elementAt(-1+AV45GXV11));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV45GXV11 = (int)(AV45GXV11+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV11", GXutil.ltrim( GXutil.str( AV45GXV11, 8, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM08_SITE_ID") == 0 )
      {
         edtavCtltam08_site_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam08_site_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM08_SITE_NM") == 0 )
      {
         edtavCtltam08_site_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_nm_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam08_site_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM08_SITE_SNM") == 0 )
      {
         edtavCtltam08_site_snm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_site_snm_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam08_site_snm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM08_OUTER_SITE_ID") == 0 )
      {
         edtavCtltam08_outer_site_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_outer_site_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam08_outer_site_id_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam08_outer_site_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV15P_SITE_ID)==0) )
      {
         AV14H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV5BC_SITE.Load(AV15P_SITE_ID);
         if ( AV5BC_SITE.Fail() )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
         else
         {
            AV46GXLvl502 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl502", GXutil.str( AV46GXLvl502, 1, 0));
            /* Using cursor H000T5 */
            pr_default.execute(3, new Object[] {AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV46GXLvl502 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl502", GXutil.str( AV46GXLvl502, 1, 0));
            }
            while ( (pr_default.getStatus(3) != 101) )
            {
               A55TAM07_USER_ID = H000T5_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H000T5_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H000T5_n205TAM07_USER_NM[0] ;
               AV46GXLvl502 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl502", GXutil.str( AV46GXLvl502, 1, 0));
               GXt_char1 = AV10D_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV10D_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV46GXLvl502 == 0 )
            {
               AV10D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_user_id(), AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_user_id()) == 0 )
            {
               AV11D_UPD_USER_NM = AV10D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
            }
            else
            {
               AV47GXLvl517 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl517", GXutil.str( AV47GXLvl517, 1, 0));
               /* Using cursor H000T6 */
               pr_default.execute(4, new Object[] {AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV47GXLvl517 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl517", GXutil.str( AV47GXLvl517, 1, 0));
               }
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A55TAM07_USER_ID = H000T6_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H000T6_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H000T6_n205TAM07_USER_NM[0] ;
                  AV47GXLvl517 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl517", GXutil.str( AV47GXLvl517, 1, 0));
                  GXt_char1 = AV11D_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV11D_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               if ( AV47GXLvl517 == 0 )
               {
                  AV11D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
               }
            }
         }
         tblTbl_ins_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam08_site_id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Enabled, 5, 0)));
         edtavCtltam08_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam08_crt_datetime_Visible, 5, 0)));
         edtavCtltam08_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam08_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam08_site_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV14H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam08_site_id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_site_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam08_site_id_Enabled, 5, 0)));
         edtavCtltam08_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam08_crt_datetime_Visible, 5, 0)));
         edtavCtltam08_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam08_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam08_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam08_site_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_SITE.GetMessages() ;
      AV48GXV12 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GXV12", GXutil.ltrim( GXutil.str( AV48GXV12, 8, 0)));
      while ( AV48GXV12 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV48GXV12));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            a205_wp01_site_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else
         {
            AV26W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         AV48GXV12 = (int)(AV48GXV12+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GXV12", GXutil.ltrim( GXutil.str( AV48GXV12, 8, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV19W_A_LOGIN_SDT;
      GXv_char2[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      a205_wp01_site_mst_impl.this.AV24W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRCD", AV24W_ERRCD);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
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
      AV23W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
      AV22W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_A819_JS", AV22W_A819_JS);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_site_snm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime( GXt_dtime6 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV10D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime( GXt_dtime6 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
      AV11D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
      AV5BC_SITE.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_SITE", AV5BC_SITE);
   }

   public void S162( )
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
      if ( ! (GXutil.strcmp("", AV23W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV23W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV22W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV22W_A819_JS ;
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
      GXv_char2[0] = AV13H_KNGN_FLG ;
      GXv_char7[0] = AV24W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char2, GXv_char7) ;
      a205_wp01_site_mst_impl.this.AV13H_KNGN_FLG = GXv_char2[0] ;
      a205_wp01_site_mst_impl.this.AV24W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRCD", AV24W_ERRCD);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S232( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a205_wp01_site_mst");
   }

   public void S222( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_upd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      lblTxt_btn_dlt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      lblTxt_btn_reg2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      lblTxt_btn_upd2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
      lblTxt_btn_dlt2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt2_Visible, 5, 0)));
      if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
      {
         GXt_boolean8 = false ;
         GXv_boolean9[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean9) ;
         a205_wp01_site_mst_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean8 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
         {
            lblTxt_btn_upd2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
         }
         GXt_boolean8 = false ;
         GXv_boolean9[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV13H_KNGN_FLG, "", GXv_boolean9) ;
         a205_wp01_site_mst_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean8 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
         if ( ( lblTxt_btn_dlt_Visible == ( 0 )) )
         {
            lblTxt_btn_dlt2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt2_Visible, 5, 0)));
         }
      }
      else
      {
         GXt_boolean8 = false ;
         GXv_boolean9[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean9) ;
         a205_wp01_site_mst_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean8 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
         if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
         {
            lblTxt_btn_reg2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e200T2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_0T2( boolean wbgen )
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
         wb_table2_6_0T2( true) ;
      }
      else
      {
         wb_table2_6_0T2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0T2e( boolean wbgen )
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
         wb_table1_2_0T2e( true) ;
      }
      else
      {
         wb_table1_2_0T2e( false) ;
      }
   }

   public void wb_table2_6_0T2( boolean wbgen )
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
         wb_table3_12_0T2( true) ;
      }
      else
      {
         wb_table3_12_0T2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_20_0T2( true) ;
      }
      else
      {
         wb_table4_20_0T2( false) ;
      }
      return  ;
   }

   public void wb_table4_20_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_34_0T2( true) ;
      }
      else
      {
         wb_table5_34_0T2( false) ;
      }
      return  ;
   }

   public void wb_table5_34_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_88_0T2( true) ;
      }
      else
      {
         wb_table6_88_0T2( false) ;
      }
      return  ;
   }

   public void wb_table6_88_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0100"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0100"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0100"+"");
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
         wb_table2_6_0T2e( true) ;
      }
      else
      {
         wb_table2_6_0T2e( false) ;
      }
   }

   public void wb_table6_88_0T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_exec_Internalname, "BTN_REG_EXEC", "", "", lblBtn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upd_exec_Internalname, "BTN_UPD_EXEC", "", "", lblBtn_upd_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dlt_exec_Internalname, "BTN_DLT_EXEC", "", "", lblBtn_dlt_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV14H_MODE), GXutil.rtrim( localUtil.format( AV14H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_88_0T2e( true) ;
      }
      else
      {
         wb_table6_88_0T2e( false) ;
      }
   }

   public void wb_table5_34_0T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_40_0T2( true) ;
      }
      else
      {
         wb_table7_40_0T2( false) ;
      }
      return  ;
   }

   public void wb_table7_40_0T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_34_0T2e( true) ;
      }
      else
      {
         wb_table5_34_0T2e( false) ;
      }
   }

   public void wb_table7_40_0T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 800, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "�����C�����") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "&nbsp;�{��ID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_site_id_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_id()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_site_id_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltam08_site_id_Backcolor)+";", "", "", 1, edtavCtltam08_site_id_Enabled, 1, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "�O���{��ID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_outer_site_id_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_outer_site_id()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_outer_site_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_outer_site_id_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltam08_outer_site_id_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "&nbsp;�{�ݖ�") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_site_nm_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_nm()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_site_nm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltam08_site_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "&nbsp;�{�ݖ�(����)") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_site_snm_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_snm()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_site_snm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_site_snm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltam08_site_snm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�폜") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltam08_del_flg, radavCtltam08_del_flg.getInternalname(), GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_del_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltam08_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "���Ǘ����") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�쐬����") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltam08_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_crt_datetime_Internalname, localUtil.format(AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_crt_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam08_crt_datetime_Visible, edtavCtltam08_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A205_WP01_SITE_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam08_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam08_crt_datetime_Visible==0)||(edtavCtltam08_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�X�V����") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltam08_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_upd_datetime_Internalname, localUtil.format(AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_upd_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam08_upd_datetime_Visible, edtavCtltam08_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A205_WP01_SITE_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam08_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam08_upd_datetime_Visible==0)||(edtavCtltam08_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�쐬���[�U�[��") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV10D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�X�V���[�U�[��") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�쐬�v���O����ID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_crt_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltam08_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�X�V�v���O����ID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam08_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_SITE.getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam08_upd_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltam08_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_40_0T2e( true) ;
      }
      else
      {
         wb_table7_40_0T2e( false) ;
      }
   }

   public void wb_table4_20_0T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_upd_btnset_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "�X�V�iF4�j", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "�X�V�iF4�j", "", "", lblTxt_btn_upd2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "�폜�iF6�j", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt2_Internalname, "�폜�iF6�j", "", "", lblTxt_btn_dlt2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_dlt2_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "�߂�iF11�j", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_0T2e( true) ;
      }
      else
      {
         wb_table4_20_0T2e( false) ;
      }
   }

   public void wb_table3_12_0T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_ins_btnset_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_ins_btnset_Internalname, tblTbl_ins_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "�o�^�iF3�j", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "�o�^�iF3�j", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "�߂�iF11�j", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A205_WP01_SITE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0T2e( true) ;
      }
      else
      {
         wb_table3_12_0T2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV15P_SITE_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
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
      pa0T2( ) ;
      ws0T2( ) ;
      we0T2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513225553");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a205_wp01_site_mst.js", "?202071513225554");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTbl_ins_btnset_Internalname = "TBL_INS_BTNSET" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_upd2_Internalname = "TXT_BTN_UPD2" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_dlt2_Internalname = "TXT_BTN_DLT2" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCtltam08_site_id_Internalname = "CTLTAM08_SITE_ID" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavCtltam08_outer_site_id_Internalname = "CTLTAM08_OUTER_SITE_ID" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavCtltam08_site_nm_Internalname = "CTLTAM08_SITE_NM" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM" ;
      radavCtltam08_del_flg.setInternalname( "CTLTAM08_DEL_FLG" );
      edtavCtltam08_crt_datetime_Internalname = "CTLTAM08_CRT_DATETIME" ;
      edtavCtltam08_upd_datetime_Internalname = "CTLTAM08_UPD_DATETIME" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      edtavCtltam08_crt_prog_nm_Internalname = "CTLTAM08_CRT_PROG_NM" ;
      edtavCtltam08_upd_prog_nm_Internalname = "CTLTAM08_UPD_PROG_NM" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_reg_exec_Internalname = "BTN_REG_EXEC" ;
      lblBtn_upd_exec_Internalname = "BTN_UPD_EXEC" ;
      lblBtn_dlt_exec_Internalname = "BTN_DLT_EXEC" ;
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
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      lblTxt_btn_dlt2_Visible = 1 ;
      lblTxt_btn_dlt_Visible = 1 ;
      lblTxt_btn_upd2_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      edtavCtltam08_upd_prog_nm_Jsonclick = "" ;
      edtavCtltam08_upd_prog_nm_Enabled = 0 ;
      edtavCtltam08_crt_prog_nm_Jsonclick = "" ;
      edtavCtltam08_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltam08_upd_datetime_Jsonclick = "" ;
      edtavCtltam08_upd_datetime_Enabled = 0 ;
      edtavCtltam08_upd_datetime_Visible = 1 ;
      edtavCtltam08_crt_datetime_Jsonclick = "" ;
      edtavCtltam08_crt_datetime_Enabled = 0 ;
      edtavCtltam08_crt_datetime_Visible = 1 ;
      radavCtltam08_del_flg.setJsonclick( "" );
      edtavCtltam08_site_snm_Jsonclick = "" ;
      edtavCtltam08_site_snm_Backstyle = (byte)(-1) ;
      edtavCtltam08_site_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_nm_Jsonclick = "" ;
      edtavCtltam08_site_nm_Backstyle = (byte)(-1) ;
      edtavCtltam08_site_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_outer_site_id_Jsonclick = "" ;
      edtavCtltam08_outer_site_id_Backstyle = (byte)(-1) ;
      edtavCtltam08_outer_site_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_id_Jsonclick = "" ;
      edtavCtltam08_site_id_Backstyle = (byte)(-1) ;
      edtavCtltam08_site_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_id_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltam08_site_id_Enabled = 1 ;
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      edtavCtltam08_outer_site_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam08_site_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltam08_upd_prog_nm_Enabled = -1 ;
      edtavCtltam08_crt_prog_nm_Enabled = -1 ;
      edtavCtltam08_upd_datetime_Enabled = -1 ;
      edtavCtltam08_crt_datetime_Enabled = -1 ;
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
                  /* Execute user subroutine: S232 */
                  S232 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_SITE = new SdtTAM08_SITE(remoteHandle);
      wcpOAV15P_SITE_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15P_SITE_ID = "" ;
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
      AV40Pgmname = "" ;
      AV39Pgmdesc = "" ;
      AV10D_CRT_USER_NM = "" ;
      AV11D_UPD_USER_NM = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_MODE = "" ;
      AV13H_KNGN_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV26W_MSG = "" ;
      AV23W_A821_JS = "" ;
      scmdbuf = "" ;
      H000T2_A17TBM22_STUDY_ID = new long[1] ;
      H000T2_A377TBM22_DEL_FLG = new String[] {""} ;
      H000T2_n377TBM22_DEL_FLG = new boolean[] {false} ;
      H000T2_A18TBM22_SITE_ID = new String[] {""} ;
      A377TBM22_DEL_FLG = "" ;
      A18TBM22_SITE_ID = "" ;
      H000T3_A377TBM22_DEL_FLG = new String[] {""} ;
      H000T3_n377TBM22_DEL_FLG = new boolean[] {false} ;
      H000T3_A18TBM22_SITE_ID = new String[] {""} ;
      H000T3_A17TBM22_STUDY_ID = new long[1] ;
      AV27BC_TBM22 = new SdtTBM22_STUDY_SITE(remoteHandle);
      A329TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      H000T4_A57TAM08_SITE_ID = new String[] {""} ;
      H000T4_A329TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H000T4_n329TAM08_UPD_DATETIME = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      AV17W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3 = new GxObjectCollection [1] ;
      AV20W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV18W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      A205TAM07_USER_NM = "" ;
      H000T5_A55TAM07_USER_ID = new String[] {""} ;
      H000T5_A205TAM07_USER_NM = new String[] {""} ;
      H000T5_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      H000T6_A55TAM07_USER_ID = new String[] {""} ;
      H000T6_A205TAM07_USER_NM = new String[] {""} ;
      H000T6_n205TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV22W_A819_JS = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char2 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_boolean9 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_reg_exec_Jsonclick = "" ;
      lblBtn_upd_exec_Jsonclick = "" ;
      lblBtn_dlt_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_upd2_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTxt_btn_dlt2_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a205_wp01_site_mst__default(),
         new Object[] {
             new Object[] {
            H000T2_A17TBM22_STUDY_ID, H000T2_A377TBM22_DEL_FLG, H000T2_n377TBM22_DEL_FLG, H000T2_A18TBM22_SITE_ID
            }
            , new Object[] {
            H000T3_A377TBM22_DEL_FLG, H000T3_n377TBM22_DEL_FLG, H000T3_A18TBM22_SITE_ID, H000T3_A17TBM22_STUDY_ID
            }
            , new Object[] {
            H000T4_A57TAM08_SITE_ID, H000T4_A329TAM08_UPD_DATETIME, H000T4_n329TAM08_UPD_DATETIME
            }
            , new Object[] {
            H000T5_A55TAM07_USER_ID, H000T5_A205TAM07_USER_NM, H000T5_n205TAM07_USER_NM
            }
            , new Object[] {
            H000T6_A55TAM07_USER_ID, H000T6_A205TAM07_USER_NM, H000T6_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "A205_WP01_SITE_MST" ;
      AV39Pgmdesc = "�{�݃}�X�^�����e�i���X�i���́j" ;
      /* GeneXus formulas. */
      AV40Pgmname = "A205_WP01_SITE_MST" ;
      AV39Pgmdesc = "�{�݃}�X�^�����e�i���X�i���́j" ;
      Gx_err = (short)(0) ;
      edtavCtltam08_crt_datetime_Enabled = 0 ;
      edtavCtltam08_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltam08_crt_prog_nm_Enabled = 0 ;
      edtavCtltam08_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV43GXLvl363 ;
   private byte AV46GXLvl502 ;
   private byte AV47GXLvl517 ;
   private byte nGXWrapped ;
   private byte edtavCtltam08_site_snm_Backstyle ;
   private byte edtavCtltam08_site_nm_Backstyle ;
   private byte edtavCtltam08_outer_site_id_Backstyle ;
   private byte edtavCtltam08_site_id_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int edtavCtltam08_crt_datetime_Enabled ;
   private int edtavCtltam08_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltam08_crt_prog_nm_Enabled ;
   private int edtavCtltam08_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavCtltam08_site_id_Backcolor ;
   private int AV44GXV10 ;
   private int edtavCtltam08_site_nm_Backcolor ;
   private int edtavCtltam08_site_snm_Backcolor ;
   private int edtavCtltam08_outer_site_id_Backcolor ;
   private int AV45GXV11 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltam08_site_id_Enabled ;
   private int edtavCtltam08_crt_datetime_Visible ;
   private int edtavCtltam08_upd_datetime_Visible ;
   private int AV48GXV12 ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int lblTxt_btn_upd2_Visible ;
   private int lblTxt_btn_dlt2_Visible ;
   private int idxLst ;
   private long A17TBM22_STUDY_ID ;
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
   private String AV40Pgmname ;
   private String AV39Pgmdesc ;
   private String edtavCtltam08_crt_datetime_Internalname ;
   private String edtavCtltam08_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltam08_crt_prog_nm_Internalname ;
   private String edtavCtltam08_upd_prog_nm_Internalname ;
   private String edtavCtltam08_site_id_Internalname ;
   private String edtavCtltam08_outer_site_id_Internalname ;
   private String edtavCtltam08_site_nm_Internalname ;
   private String edtavCtltam08_site_snm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String tblTbl_ins_btnset_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String lblTxt_btn_upd2_Internalname ;
   private String lblTxt_btn_dlt2_Internalname ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_reg_exec_Internalname ;
   private String lblBtn_reg_exec_Jsonclick ;
   private String lblBtn_upd_exec_Internalname ;
   private String lblBtn_upd_exec_Jsonclick ;
   private String lblBtn_dlt_exec_Internalname ;
   private String lblBtn_dlt_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String imgImage1_Internalname ;
   private String edtavCtltam08_site_id_Jsonclick ;
   private String imgImage2_Internalname ;
   private String edtavCtltam08_outer_site_id_Jsonclick ;
   private String imgImage3_Internalname ;
   private String edtavCtltam08_site_nm_Jsonclick ;
   private String imgImage4_Internalname ;
   private String edtavCtltam08_site_snm_Jsonclick ;
   private String edtavCtltam08_crt_datetime_Jsonclick ;
   private String edtavCtltam08_upd_datetime_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String edtavCtltam08_crt_prog_nm_Jsonclick ;
   private String edtavCtltam08_upd_prog_nm_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_upd2_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_dlt2_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A329TAM08_UPD_DATETIME ;
   private java.util.Date GXt_dtime6 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV25W_ERRFLG ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n329TAM08_UPD_DATETIME ;
   private boolean n205TAM07_USER_NM ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String wcpOAV15P_SITE_ID ;
   private String AV15P_SITE_ID ;
   private String AV10D_CRT_USER_NM ;
   private String AV11D_UPD_USER_NM ;
   private String AV12H_INIT_FLG ;
   private String AV14H_MODE ;
   private String AV13H_KNGN_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV26W_MSG ;
   private String AV23W_A821_JS ;
   private String A377TBM22_DEL_FLG ;
   private String A18TBM22_SITE_ID ;
   private String A57TAM08_SITE_ID ;
   private String A205TAM07_USER_NM ;
   private String A55TAM07_USER_ID ;
   private String AV24W_ERRCD ;
   private String AV22W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTAM08_SITE AV5BC_SITE ;
   private HTMLChoice radavCtltam08_del_flg ;
   private IDataStoreProvider pr_default ;
   private long[] H000T2_A17TBM22_STUDY_ID ;
   private String[] H000T2_A377TBM22_DEL_FLG ;
   private boolean[] H000T2_n377TBM22_DEL_FLG ;
   private String[] H000T2_A18TBM22_SITE_ID ;
   private String[] H000T3_A377TBM22_DEL_FLG ;
   private boolean[] H000T3_n377TBM22_DEL_FLG ;
   private String[] H000T3_A18TBM22_SITE_ID ;
   private long[] H000T3_A17TBM22_STUDY_ID ;
   private String[] H000T4_A57TAM08_SITE_ID ;
   private java.util.Date[] H000T4_A329TAM08_UPD_DATETIME ;
   private boolean[] H000T4_n329TAM08_UPD_DATETIME ;
   private String[] H000T5_A55TAM07_USER_ID ;
   private String[] H000T5_A205TAM07_USER_NM ;
   private boolean[] H000T5_n205TAM07_USER_NM ;
   private String[] H000T6_A55TAM07_USER_ID ;
   private String[] H000T6_A205TAM07_USER_NM ;
   private boolean[] H000T6_n205TAM07_USER_NM ;
   private GxObjectCollection AV17W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[] ;
   private GxObjectCollection AV20W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[] ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV18W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV21W_A_RESULT_MSG_SDT_ITEM ;
   private SdtTBM22_STUDY_SITE AV27BC_TBM22 ;
}

final  class a205_wp01_site_mst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000T2", "SELECT `TBM22_STUDY_ID`, `TBM22_DEL_FLG`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE (`TBM22_SITE_ID` = ?) AND (`TBM22_DEL_FLG` = '0') ORDER BY `TBM22_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000T3", "SELECT `TBM22_DEL_FLG`, `TBM22_SITE_ID`, `TBM22_STUDY_ID` FROM `TBM22_STUDY_SITE` WHERE (`TBM22_SITE_ID` = ?) AND (`TBM22_DEL_FLG` = '1') ORDER BY `TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H000T4", "SELECT `TAM08_SITE_ID`, `TAM08_UPD_DATETIME` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000T5", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000T6", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

