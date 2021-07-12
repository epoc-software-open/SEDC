/*
               File: b402_wp13_domain_reg_impl
        Description: 試験登録（ドメイン編集）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:29:50.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp13_domain_reg_impl extends GXWebPanel
{
   public b402_wp13_domain_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp13_domain_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp13_domain_reg_impl.class ));
   }

   public b402_wp13_domain_reg_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltbm42_del_flg = new HTMLChoice();
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
            AV15P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
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
         pa1R2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1R2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1R2( ) ;
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
      httpContext.writeValue( "試験登録（ドメイン編集）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513295065");
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
      GXEncryptionTmp = "b402_wp13_domain_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp13_domain_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1R2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_study_domain", AV5BC_STUDY_DOMAIN);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_study_domain", AV5BC_STUDY_DOMAIN);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV15P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV14P_DOM_CD));
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
      return "B402_WP13_DOMAIN_REG" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（ドメイン編集）" ;
   }

   public void wb1R0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1R2( true) ;
      }
      else
      {
         wb_table1_2_1R2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1R2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（ドメイン編集）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0101") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0101", "");
         }
      }
      wbErr = false ;
      strup1R0( ) ;
   }

   public void ws1R2( )
   {
      start1R2( ) ;
      evt1R2( ) ;
   }

   public void evt1R2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111R2 */
                        e111R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121R2 */
                        e121R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131R2 */
                        e131R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141R2 */
                        e141R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151R2 */
                        e151R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161R2 */
                        e161R2 ();
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
                  else if ( nCmpId == 101 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0101") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0101", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1R2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1R2( ) ;
         }
      }
   }

   public void pa1R2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp13_domain_reg")), "b402_wp13_domain_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp13_domain_reg"))) ;
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
                  AV15P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV14P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14P_DOM_CD", AV14P_DOM_CD);
                  }
               }
            }
         }
         radavCtltbm42_del_flg.setName( "CTLTBM42_DEL_FLG" );
         radavCtltbm42_del_flg.setWebtags( "" );
         radavCtltbm42_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltbm42_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf1R2( ) ;
      /* End function Refresh */
   }

   public void rf1R2( )
   {
      /* Execute user event: e141R2 */
      e141R2 ();
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
         /* Execute user event: e161R2 */
         e161R2 ();
         wb1R0( ) ;
      }
   }

   public void strup1R0( )
   {
      /* Before Start, stand alone formulas. */
      AV41Pgmname = "B402_WP13_DOMAIN_REG" ;
      AV40Pgmdesc = "試験登録（ドメイン編集）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm42_dom_cd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_cd_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_cd_Enabled, 5, 0)));
      edtavCtltbm42_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm42_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm42_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm42_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm42_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm42_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm42_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm42_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e131R2 */
      e131R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_study_domain"), AV5BC_STUDY_DOMAIN);
         /* Read variables values. */
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( httpContext.cgiGet( edtavCtltbm42_dom_cd_Internalname) );
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( httpContext.cgiGet( edtavCtltbm42_dom_jnm_Internalname) );
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( httpContext.cgiGet( edtavCtltbm42_dom_enm_Internalname) );
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( httpContext.cgiGet( edtavCtltbm42_dom_grp_nm_Internalname) );
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( httpContext.cgiGet( edtavCtltbm42_note_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm42_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm42_order_Internalname), ".", ",") > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM42_ORDER");
            GX_FocusControl = edtavCtltbm42_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( 0 );
         }
         else
         {
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm42_order_Internalname), ".", ",")) );
         }
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( httpContext.cgiGet( radavCtltbm42_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm42_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM42_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm42_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm42_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm42_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM42_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm42_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm42_upd_datetime_Internalname)) );
         }
         AV10D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         AV11D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( httpContext.cgiGet( edtavCtltbm42_crt_prog_nm_Internalname) );
         AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( httpContext.cgiGet( edtavCtltbm42_upd_prog_nm_Internalname) );
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         /* Read saved values. */
         AV15P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV14P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0101") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0101", "");
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
      /* Execute user event: e131R2 */
      e131R2 ();
      if (returnInSub) return;
   }

   public void e131R2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      AV8C_GAMEN_TITLE = AV40Pgmdesc ;
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0101",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e141R2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "INFO", "画面起動") ;
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

   public void e111R2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
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
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            GXt_char1 = AV23W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            AV23W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
         }
      }
   }

   public void e151R2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_DOMAIN", AV5BC_STUDY_DOMAIN);
      AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( AV41Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_DOMAIN", AV5BC_STUDY_DOMAIN);
      AV5BC_STUDY_DOMAIN.Save();
      if ( AV5BC_STUDY_DOMAIN.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b402_wp13_domain_reg");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp12_study_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp13_domain_reg");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
   }

   public void e121R2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp12_study_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
      AV42GXLvl195 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42GXLvl195", GXutil.str( AV42GXLvl195, 1, 0));
      /* Using cursor H001R2 */
      pr_default.execute(0, new Object[] {new Long(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id()), AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd()});
      if ( Gx_err != 0 )
      {
         AV42GXLvl195 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42GXLvl195", GXutil.str( AV42GXLvl195, 1, 0));
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A204TBM42_DOM_CD = H001R2_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
         A203TBM42_STUDY_ID = H001R2_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A900TBM42_UPD_CNT = H001R2_A900TBM42_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
         n900TBM42_UPD_CNT = H001R2_n900TBM42_UPD_CNT[0] ;
         AV42GXLvl195 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42GXLvl195", GXutil.str( AV42GXLvl195, 1, 0));
         if ( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt() != A900TBM42_UPD_CNT )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            httpContext.GX_msglist.addItem(AV26W_MSG);
            AV25W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV42GXLvl195 == 0 )
      {
         GXt_char1 = AV26W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
         b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         httpContext.GX_msglist.addItem(AV26W_MSG);
         AV25W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
      }
      if ( ! AV25W_ERRFLG )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] = AV17W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] = AV20W_A_RESULT_MSG_SDT ;
         new b402_pc26_study_domain_chk(remoteHandle, context).execute( AV5BC_STUDY_DOMAIN, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4) ;
         AV17W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] ;
         AV20W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] ;
         if ( AV20W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV25W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
            AV43GXV12 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXV12", GXutil.ltrim( GXutil.str( AV43GXV12, 8, 0)));
            while ( AV43GXV12 <= AV20W_A_RESULT_MSG_SDT.size() )
            {
               AV21W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV20W_A_RESULT_MSG_SDT.elementAt(-1+AV43GXV12));
               httpContext.GX_msglist.addItem(AV21W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV43GXV12 = (int)(AV43GXV12+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43GXV12", GXutil.ltrim( GXutil.str( AV43GXV12, 8, 0)));
            }
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
         }
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm42_dom_enm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_enm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_enm_Backcolor, 9, 0)));
      edtavCtltbm42_dom_jnm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_jnm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_jnm_Backcolor, 9, 0)));
      edtavCtltbm42_dom_grp_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_grp_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_grp_nm_Backcolor, 9, 0)));
      edtavCtltbm42_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_note_Backcolor, 9, 0)));
      edtavCtltbm42_order_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_order_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV44GXV13 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GXV13", GXutil.ltrim( GXutil.str( AV44GXV13, 8, 0)));
      while ( AV44GXV13 <= AV17W_A_CHK_RESULT_SDT.size() )
      {
         AV18W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV17W_A_CHK_RESULT_SDT.elementAt(-1+AV44GXV13));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV44GXV13 = (int)(AV44GXV13+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXV13", GXutil.ltrim( GXutil.str( AV44GXV13, 8, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM42_DOM_JNM") == 0 )
      {
         edtavCtltbm42_dom_jnm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_jnm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_jnm_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm42_dom_jnm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM42_DOM_ENM") == 0 )
      {
         edtavCtltbm42_dom_enm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_enm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_enm_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm42_dom_enm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM42_DOM_GRP_NM") == 0 )
      {
         edtavCtltbm42_dom_grp_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_dom_grp_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_dom_grp_nm_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm42_dom_grp_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM42_NOTE") == 0 )
      {
         edtavCtltbm42_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_note_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm42_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM42_ORDER") == 0 )
      {
         edtavCtltbm42_order_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm42_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm42_order_Backcolor, 9, 0)));
         if ( AV18W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm42_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H001R3 */
      pr_default.execute(1, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A63TBM21_STUDY_ID = H001R3_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001R3_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001R3_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV5BC_STUDY_DOMAIN.Load(AV15P_STUDY_ID, AV14P_DOM_CD);
      if ( AV5BC_STUDY_DOMAIN.Fail() )
      {
         GXt_char1 = AV26W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
         b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
      else
      {
         AV46GXLvl330 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl330", GXutil.str( AV46GXLvl330, 1, 0));
         /* Using cursor H001R4 */
         pr_default.execute(2, new Object[] {AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id()});
         if ( Gx_err != 0 )
         {
            AV46GXLvl330 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl330", GXutil.str( AV46GXLvl330, 1, 0));
         }
         while ( (pr_default.getStatus(2) != 101) )
         {
            A55TAM07_USER_ID = H001R4_A55TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            A205TAM07_USER_NM = H001R4_A205TAM07_USER_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
            n205TAM07_USER_NM = H001R4_n205TAM07_USER_NM[0] ;
            AV46GXLvl330 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl330", GXutil.str( AV46GXLvl330, 1, 0));
            GXt_char1 = AV10D_CRT_USER_NM ;
            GXv_char2[0] = GXt_char1 ;
            new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
            AV10D_CRT_USER_NM = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV46GXLvl330 == 0 )
         {
            AV10D_CRT_USER_NM = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         }
         if ( GXutil.strcmp(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id(), AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id()) == 0 )
         {
            AV11D_UPD_USER_NM = AV10D_CRT_USER_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         }
         else
         {
            AV47GXLvl345 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl345", GXutil.str( AV47GXLvl345, 1, 0));
            /* Using cursor H001R5 */
            pr_default.execute(3, new Object[] {AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id()});
            if ( Gx_err != 0 )
            {
               AV47GXLvl345 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl345", GXutil.str( AV47GXLvl345, 1, 0));
            }
            while ( (pr_default.getStatus(3) != 101) )
            {
               A55TAM07_USER_ID = H001R5_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H001R5_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H001R5_n205TAM07_USER_NM[0] ;
               AV47GXLvl345 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl345", GXutil.str( AV47GXLvl345, 1, 0));
               GXt_char1 = AV11D_UPD_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV11D_UPD_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV47GXLvl345 == 0 )
            {
               AV11D_UPD_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
            }
         }
      }
      GX_FocusControl = edtavCtltbm42_dom_jnm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_STUDY_DOMAIN.GetMessages() ;
      AV48GXV14 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GXV14", GXutil.ltrim( GXutil.str( AV48GXV14, 8, 0)));
      while ( AV48GXV14 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV48GXV14));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b402_wp13_domain_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         else
         {
            AV26W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         }
         AV48GXV14 = (int)(AV48GXV14+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GXV14", GXutil.ltrim( GXutil.str( AV48GXV14, 8, 0)));
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
      b402_wp13_domain_reg_impl.this.AV24W_ERRCD = GXv_char2[0] ;
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
      GXv_char6[0] = AV24W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char2, GXv_char6) ;
      b402_wp13_domain_reg_impl.this.AV13H_KNGN_FLG = GXv_char2[0] ;
      b402_wp13_domain_reg_impl.this.AV24W_ERRCD = GXv_char6[0] ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp13_domain_reg");
   }

   public void S222( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean7 = false ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean8) ;
      b402_wp13_domain_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      lblTxt_btn_upd_Visible = (GXt_boolean7 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
      {
         lblTxt_btn_upd2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
      }
      else
      {
         lblTxt_btn_upd2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e161R2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_1R2( boolean wbgen )
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
         wb_table2_6_1R2( true) ;
      }
      else
      {
         wb_table2_6_1R2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_1R2e( boolean wbgen )
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
         wb_table1_2_1R2e( true) ;
      }
      else
      {
         wb_table1_2_1R2e( false) ;
      }
   }

   public void wb_table2_6_1R2( boolean wbgen )
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
         wb_table3_12_1R2( true) ;
      }
      else
      {
         wb_table3_12_1R2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_22_1R2( true) ;
      }
      else
      {
         wb_table4_22_1R2( false) ;
      }
      return  ;
   }

   public void wb_table4_22_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_93_1R2( true) ;
      }
      else
      {
         wb_table5_93_1R2( false) ;
      }
      return  ;
   }

   public void wb_table5_93_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0101"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0101"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0101"+"");
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
         wb_table2_6_1R2e( true) ;
      }
      else
      {
         wb_table2_6_1R2e( false) ;
      }
   }

   public void wb_table5_93_1R2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_93_1R2e( true) ;
      }
      else
      {
         wb_table5_93_1R2e( false) ;
      }
   }

   public void wb_table4_22_1R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:40px\">") ;
         wb_table6_25_1R2( true) ;
      }
      else
      {
         wb_table6_25_1R2( false) ;
      }
      return  ;
   }

   public void wb_table6_25_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_36_1R2( true) ;
      }
      else
      {
         wb_table7_36_1R2( false) ;
      }
      return  ;
   }

   public void wb_table7_36_1R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_22_1R2e( true) ;
      }
      else
      {
         wb_table4_22_1R2e( false) ;
      }
   }

   public void wb_table7_36_1R2( boolean wbgen )
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
         httpContext.writeText( "▼基本情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:130px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"width:275px\">") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_cd_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm42_dom_cd_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメイン日本語名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_jnm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_dom_jnm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm42_dom_jnm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメイン英語名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_enm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_dom_enm_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm42_dom_enm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイングループ名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_grp_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_dom_grp_nm_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm42_dom_grp_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "備考") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm42_note_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;表示順") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order(), (byte)(5), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_order_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavCtltbm42_order_Backcolor)+";", "", "", 1, 1, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm42_del_flg, radavCtltbm42_del_flg.getInternalname(), GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm42_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm42_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_crt_datetime_Internalname, localUtil.format(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_crt_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm42_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm42_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCtltbm42_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm42_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_upd_datetime_Internalname, localUtil.format(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_upd_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm42_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm42_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCtltbm42_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV10D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_crt_prog_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm42_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm42_upd_prog_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm42_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_36_1R2e( true) ;
      }
      else
      {
         wb_table7_36_1R2e( false) ;
      }
   }

   public void wb_table6_25_1R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:600px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_25_1R2e( true) ;
      }
      else
      {
         wb_table6_25_1R2e( false) ;
      }
   }

   public void wb_table3_12_1R2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_1R2e( true) ;
      }
      else
      {
         wb_table3_12_1R2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV15P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
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
      pa1R2( ) ;
      ws1R2( ) ;
      we1R2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513295325");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp13_domain_reg.js", "?202071513295325");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_upd2_Internalname = "TXT_BTN_UPD2" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      tblTable1_Internalname = "TABLE1" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCtltbm42_dom_cd_Internalname = "CTLTBM42_DOM_CD" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavCtltbm42_dom_jnm_Internalname = "CTLTBM42_DOM_JNM" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavCtltbm42_dom_enm_Internalname = "CTLTBM42_DOM_ENM" ;
      edtavCtltbm42_dom_grp_nm_Internalname = "CTLTBM42_DOM_GRP_NM" ;
      edtavCtltbm42_note_Internalname = "CTLTBM42_NOTE" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCtltbm42_order_Internalname = "CTLTBM42_ORDER" ;
      radavCtltbm42_del_flg.setInternalname( "CTLTBM42_DEL_FLG" );
      edtavCtltbm42_crt_datetime_Internalname = "CTLTBM42_CRT_DATETIME" ;
      edtavCtltbm42_upd_datetime_Internalname = "CTLTBM42_UPD_DATETIME" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      edtavCtltbm42_crt_prog_nm_Internalname = "CTLTBM42_CRT_PROG_NM" ;
      edtavCtltbm42_upd_prog_nm_Internalname = "CTLTBM42_UPD_PROG_NM" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblTxt_btn_upd2_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      edtavCtltbm42_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm42_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm42_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm42_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm42_upd_datetime_Jsonclick = "" ;
      edtavCtltbm42_upd_datetime_Enabled = 0 ;
      edtavCtltbm42_crt_datetime_Jsonclick = "" ;
      edtavCtltbm42_crt_datetime_Enabled = 0 ;
      radavCtltbm42_del_flg.setJsonclick( "" );
      edtavCtltbm42_order_Jsonclick = "" ;
      edtavCtltbm42_order_Backstyle = (byte)(-1) ;
      edtavCtltbm42_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_note_Backstyle = (byte)(-1) ;
      edtavCtltbm42_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_grp_nm_Jsonclick = "" ;
      edtavCtltbm42_dom_grp_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm42_dom_grp_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_enm_Jsonclick = "" ;
      edtavCtltbm42_dom_enm_Backstyle = (byte)(-1) ;
      edtavCtltbm42_dom_enm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_jnm_Jsonclick = "" ;
      edtavCtltbm42_dom_jnm_Backstyle = (byte)(-1) ;
      edtavCtltbm42_dom_jnm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_cd_Jsonclick = "" ;
      edtavCtltbm42_dom_cd_Enabled = 0 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_study_Caption = "試験名" ;
      edtavCtltbm42_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_grp_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_jnm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm42_dom_enm_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm42_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm42_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm42_upd_datetime_Enabled = -1 ;
      edtavCtltbm42_crt_datetime_Enabled = -1 ;
      edtavCtltbm42_dom_cd_Enabled = -1 ;
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
      AV5BC_STUDY_DOMAIN = new SdtTBM42_STUDY_CDISC_DOMAIN(remoteHandle);
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
      AV41Pgmname = "" ;
      AV40Pgmdesc = "" ;
      AV10D_CRT_USER_NM = "" ;
      AV11D_UPD_USER_NM = "" ;
      AV12H_INIT_FLG = "" ;
      AV13H_KNGN_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV26W_MSG = "" ;
      AV23W_A821_JS = "" ;
      scmdbuf = "" ;
      H001R2_A204TBM42_DOM_CD = new String[] {""} ;
      H001R2_A203TBM42_STUDY_ID = new long[1] ;
      H001R2_A900TBM42_UPD_CNT = new long[1] ;
      H001R2_n900TBM42_UPD_CNT = new boolean[] {false} ;
      A204TBM42_DOM_CD = "" ;
      AV17W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3 = new GxObjectCollection [1] ;
      AV20W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV18W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H001R3_A63TBM21_STUDY_ID = new long[1] ;
      H001R3_A367TBM21_STUDY_NM = new String[] {""} ;
      H001R3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      H001R4_A55TAM07_USER_ID = new String[] {""} ;
      H001R4_A205TAM07_USER_NM = new String[] {""} ;
      H001R4_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      H001R5_A55TAM07_USER_ID = new String[] {""} ;
      H001R5_A205TAM07_USER_NM = new String[] {""} ;
      H001R5_n205TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV22W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_boolean8 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTxt_study_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_upd2_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp13_domain_reg__default(),
         new Object[] {
             new Object[] {
            H001R2_A204TBM42_DOM_CD, H001R2_A203TBM42_STUDY_ID, H001R2_A900TBM42_UPD_CNT, H001R2_n900TBM42_UPD_CNT
            }
            , new Object[] {
            H001R3_A63TBM21_STUDY_ID, H001R3_A367TBM21_STUDY_NM, H001R3_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H001R4_A55TAM07_USER_ID, H001R4_A205TAM07_USER_NM, H001R4_n205TAM07_USER_NM
            }
            , new Object[] {
            H001R5_A55TAM07_USER_ID, H001R5_A205TAM07_USER_NM, H001R5_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV41Pgmname = "B402_WP13_DOMAIN_REG" ;
      AV40Pgmdesc = "試験登録（ドメイン編集）" ;
      /* GeneXus formulas. */
      AV41Pgmname = "B402_WP13_DOMAIN_REG" ;
      AV40Pgmdesc = "試験登録（ドメイン編集）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm42_dom_cd_Enabled = 0 ;
      edtavCtltbm42_crt_datetime_Enabled = 0 ;
      edtavCtltbm42_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm42_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm42_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV42GXLvl195 ;
   private byte AV46GXLvl330 ;
   private byte AV47GXLvl345 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm42_order_Backstyle ;
   private byte edtavCtltbm42_note_Backstyle ;
   private byte edtavCtltbm42_dom_grp_nm_Backstyle ;
   private byte edtavCtltbm42_dom_enm_Backstyle ;
   private byte edtavCtltbm42_dom_jnm_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int edtavCtltbm42_dom_cd_Enabled ;
   private int edtavCtltbm42_crt_datetime_Enabled ;
   private int edtavCtltbm42_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm42_crt_prog_nm_Enabled ;
   private int edtavCtltbm42_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV43GXV12 ;
   private int edtavCtltbm42_dom_enm_Backcolor ;
   private int edtavCtltbm42_dom_jnm_Backcolor ;
   private int edtavCtltbm42_dom_grp_nm_Backcolor ;
   private int edtavCtltbm42_note_Backcolor ;
   private int edtavCtltbm42_order_Backcolor ;
   private int AV44GXV13 ;
   private int AV48GXV14 ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_upd2_Visible ;
   private int idxLst ;
   private long wcpOAV15P_STUDY_ID ;
   private long AV15P_STUDY_ID ;
   private long A900TBM42_UPD_CNT ;
   private long A203TBM42_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
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
   private String AV41Pgmname ;
   private String AV40Pgmdesc ;
   private String edtavCtltbm42_dom_cd_Internalname ;
   private String edtavCtltbm42_crt_datetime_Internalname ;
   private String edtavCtltbm42_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm42_crt_prog_nm_Internalname ;
   private String edtavCtltbm42_upd_prog_nm_Internalname ;
   private String edtavCtltbm42_dom_jnm_Internalname ;
   private String edtavCtltbm42_dom_enm_Internalname ;
   private String edtavCtltbm42_dom_grp_nm_Internalname ;
   private String edtavCtltbm42_note_Internalname ;
   private String edtavCtltbm42_order_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_upd2_Internalname ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String imgImage1_Internalname ;
   private String edtavCtltbm42_dom_cd_Jsonclick ;
   private String imgImage3_Internalname ;
   private String edtavCtltbm42_dom_jnm_Jsonclick ;
   private String imgImage5_Internalname ;
   private String edtavCtltbm42_dom_enm_Jsonclick ;
   private String edtavCtltbm42_dom_grp_nm_Jsonclick ;
   private String imgImage4_Internalname ;
   private String edtavCtltbm42_order_Jsonclick ;
   private String edtavCtltbm42_crt_datetime_Jsonclick ;
   private String edtavCtltbm42_upd_datetime_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String edtavCtltbm42_crt_prog_nm_Jsonclick ;
   private String edtavCtltbm42_upd_prog_nm_Jsonclick ;
   private String tblTable1_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTxt_study_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_upd2_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV25W_ERRFLG ;
   private boolean n900TBM42_UPD_CNT ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n205TAM07_USER_NM ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV14P_DOM_CD ;
   private String AV14P_DOM_CD ;
   private String AV10D_CRT_USER_NM ;
   private String AV11D_UPD_USER_NM ;
   private String AV12H_INIT_FLG ;
   private String AV13H_KNGN_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV26W_MSG ;
   private String AV23W_A821_JS ;
   private String A204TBM42_DOM_CD ;
   private String A367TBM21_STUDY_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String AV24W_ERRCD ;
   private String AV22W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM42_STUDY_CDISC_DOMAIN AV5BC_STUDY_DOMAIN ;
   private HTMLChoice radavCtltbm42_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H001R2_A204TBM42_DOM_CD ;
   private long[] H001R2_A203TBM42_STUDY_ID ;
   private long[] H001R2_A900TBM42_UPD_CNT ;
   private boolean[] H001R2_n900TBM42_UPD_CNT ;
   private long[] H001R3_A63TBM21_STUDY_ID ;
   private String[] H001R3_A367TBM21_STUDY_NM ;
   private boolean[] H001R3_n367TBM21_STUDY_NM ;
   private String[] H001R4_A55TAM07_USER_ID ;
   private String[] H001R4_A205TAM07_USER_NM ;
   private boolean[] H001R4_n205TAM07_USER_NM ;
   private String[] H001R5_A55TAM07_USER_ID ;
   private String[] H001R5_A205TAM07_USER_NM ;
   private boolean[] H001R5_n205TAM07_USER_NM ;
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
}

final  class b402_wp13_domain_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001R2", "SELECT `TBM42_DOM_CD`, `TBM42_STUDY_ID`, `TBM42_UPD_CNT` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? and `TBM42_DOM_CD` = ? ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001R3", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001R4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001R5", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

