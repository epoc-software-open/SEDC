/*
               File: b402_wp13_domain_reg_impl
        Description: 試験登録（ドメイン編集）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:47.42
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
            AV15P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14P_DOM_CD", AV14P_DOM_CD);
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
         pa1V2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1V2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1V2( ) ;
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
      httpContext.writeText( "試験登録（ドメイン編集）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp13_domain_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1V2( )
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

   public void wb1V0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1V2( true) ;
      }
      else
      {
         wb_table1_2_1V2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "試験登録（ドメイン編集）", (short)(0)) ;
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
      strup1V0( ) ;
   }

   public void ws1V2( )
   {
      start1V2( ) ;
      evt1V2( ) ;
   }

   public void evt1V2( )
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
                        /* Execute user event: e111V2 */
                        e111V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121V2 */
                        e121V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131V2 */
                        e131V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141V2 */
                        e141V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151V2 */
                        e151V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161V2 */
                        e161V2 ();
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

   public void we1V2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1V2( ) ;
         }
      }
   }

   public void pa1V2( )
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
      rf1V2( ) ;
      /* End function Refresh */
   }

   public void rf1V2( )
   {
      /* Execute user event: e141V2 */
      e141V2 ();
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
         /* Execute user event: e161V2 */
         e161V2 ();
         wb1V0( ) ;
      }
   }

   public void strup1V0( )
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
      /* Execute user event: e131V2 */
      e131V2 ();
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
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm42_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "CTLTBM42_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm42_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm42_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm42_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "CTLTBM42_UPD_DATETIME");
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
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e131V2 */
      e131V2 ();
      if (returnInSub) return;
   }

   public void e131V2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "B402" ;
      AV8C_GAMEN_TITLE = AV40Pgmdesc ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV19W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0101",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e141V2( )
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

   public void e111V2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         AV25W_ERRFLG = false ;
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
         if ( ! AV25W_ERRFLG )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
            GXt_char2 = AV23W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV23W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e151V2( )
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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

   public void e121V2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
      /* Using cursor H001V2 */
      pr_default.execute(0, new Object[] {new Long(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id()), AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd()});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A893TBM42_DOM_CD = H001V2_A893TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DOM_CD", A893TBM42_DOM_CD);
         A886TBM42_STUDY_ID = H001V2_A886TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A886TBM42_STUDY_ID, 10, 0)));
         A918TBM42_UPD_CNT = H001V2_A918TBM42_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A918TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A918TBM42_UPD_CNT, 10, 0)));
         n918TBM42_UPD_CNT = H001V2_n918TBM42_UPD_CNT[0] ;
         AV42GXLvl195 = (byte)(1) ;
         if ( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt() != A918TBM42_UPD_CNT )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV26W_MSG);
            AV25W_ERRFLG = true ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV42GXLvl195 == 0 )
      {
         GXt_char2 = AV26W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
         b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
         AV26W_MSG = GXt_char2 ;
         httpContext.GX_msglist.addItem(AV26W_MSG);
         AV25W_ERRFLG = true ;
      }
      if ( ! AV25W_ERRFLG )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV17W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV20W_A_RESULT_MSG_SDT ;
         new b402_pc26_study_domain_chk(remoteHandle, context).execute( AV5BC_STUDY_DOMAIN, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
         AV17W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
         AV20W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
         if ( AV20W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV25W_ERRFLG = true ;
            AV43GXV12 = 1 ;
            while ( AV43GXV12 <= AV20W_A_RESULT_MSG_SDT.size() )
            {
               AV21W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV20W_A_RESULT_MSG_SDT.elementAt(-1+AV43GXV12));
               httpContext.GX_msglist.addItem(AV21W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV43GXV12 = (int)(AV43GXV12+1) ;
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
      while ( AV44GXV13 <= AV17W_A_CHK_RESULT_SDT.size() )
      {
         AV18W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV17W_A_CHK_RESULT_SDT.elementAt(-1+AV44GXV13));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV44GXV13 = (int)(AV44GXV13+1) ;
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
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H001V3 */
      pr_default.execute(1, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A186TBM21_STUDY_ID = H001V3_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H001V3_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001V3_n187TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A187TBM21_STUDY_NM ;
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
         GXt_char2 = AV26W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
         b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
         AV26W_MSG = GXt_char2 ;
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
      else
      {
         AV46GXLvl330 = (byte)(0) ;
         /* Using cursor H001V4 */
         pr_default.execute(2, new Object[] {AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id()});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A8TAM07_USER_ID = H001V4_A8TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            A2TAM07_USER_NM = H001V4_A2TAM07_USER_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
            n2TAM07_USER_NM = H001V4_n2TAM07_USER_NM[0] ;
            AV46GXLvl330 = (byte)(1) ;
            GXt_char2 = AV10D_CRT_USER_NM ;
            GXv_char3[0] = GXt_char2 ;
            new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
            AV10D_CRT_USER_NM = GXt_char2 ;
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
            /* Using cursor H001V5 */
            pr_default.execute(3, new Object[] {AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id()});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A8TAM07_USER_ID = H001V5_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H001V5_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H001V5_n2TAM07_USER_NM[0] ;
               AV47GXLvl345 = (byte)(1) ;
               GXt_char2 = AV11D_UPD_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV11D_UPD_USER_NM = GXt_char2 ;
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
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_STUDY_DOMAIN.GetMessages() ;
      AV48GXV14 = 1 ;
      while ( AV48GXV14 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV48GXV14));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char2 = AV26W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            b402_wp13_domain_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_MSG = GXt_char2 ;
         }
         else
         {
            AV26W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
         }
         AV48GXV14 = (int)(AV48GXV14+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV19W_A_LOGIN_SDT;
      GXv_char3[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char3) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b402_wp13_domain_reg_impl.this.AV24W_ERRCD = GXv_char3[0] ;
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
      AV23W_A821_JS = "" ;
      AV22W_A819_JS = "" ;
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
      GXv_char3[0] = AV13H_KNGN_FLG ;
      GXv_char7[0] = AV24W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char3, GXv_char7) ;
      b402_wp13_domain_reg_impl.this.AV13H_KNGN_FLG = GXv_char3[0] ;
      b402_wp13_domain_reg_impl.this.AV24W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S23498( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp13_domain_reg");
   }

   public void S222( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean8 = false ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp13_domain_reg_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      lblTxt_btn_upd_Visible = (GXt_boolean8 ? 1 : 0) ;
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

   protected void e161V2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_1V2( boolean wbgen )
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table2_6_1V2( true) ;
      }
      else
      {
         wb_table2_6_1V2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_1V2e( boolean wbgen )
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
         wb_table1_2_1V2e( true) ;
      }
      else
      {
         wb_table1_2_1V2e( false) ;
      }
   }

   public void wb_table2_6_1V2( boolean wbgen )
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
         wb_table3_12_1V2( true) ;
      }
      else
      {
         wb_table3_12_1V2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table4_22_1V2( true) ;
      }
      else
      {
         wb_table4_22_1V2( false) ;
      }
      return  ;
   }

   public void wb_table4_22_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_93_1V2( true) ;
      }
      else
      {
         wb_table5_93_1V2( false) ;
      }
      return  ;
   }

   public void wb_table5_93_1V2e( boolean wbgen )
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
         httpContext.writeText( " id=\""+"gxHTMLWrpW0101"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0101"+"");
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
         wb_table2_6_1V2e( true) ;
      }
      else
      {
         wb_table2_6_1V2e( false) ;
      }
   }

   public void wb_table5_93_1V2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(97);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_93_1V2e( true) ;
      }
      else
      {
         wb_table5_93_1V2e( false) ;
      }
   }

   public void wb_table4_22_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:40px\">") ;
         wb_table6_25_1V2( true) ;
      }
      else
      {
         wb_table6_25_1V2( false) ;
      }
      return  ;
   }

   public void wb_table6_25_1V2e( boolean wbgen )
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
         wb_table7_36_1V2( true) ;
      }
      else
      {
         wb_table7_36_1V2( false) ;
      }
      return  ;
   }

   public void wb_table7_36_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_22_1V2e( true) ;
      }
      else
      {
         wb_table4_22_1V2e( false) ;
      }
   }

   public void wb_table7_36_1V2( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"width:275px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd());
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_cd_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd(), "")), "", "", "", "", "", edtavCtltbm42_dom_cd_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm42_dom_cd_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメイン日本語名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_dom_jnm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_jnm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtavCtltbm42_dom_jnm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;ドメイン英語名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_dom_enm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_enm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtavCtltbm42_dom_enm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイングループ名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_dom_grp_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_dom_grp_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(57);\"", "", "", "", "", edtavCtltbm42_dom_grp_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "備考") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm42_note_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "&nbsp;表示順") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order()", GXutil.ltrim( GXutil.str( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order(), 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm42_order_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order(), (byte)(5), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order()), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(66);\"", "", "", "", "", edtavCtltbm42_order_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm42_del_flg, radavCtltbm42_del_flg.getInternalname(), AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm42_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "HLP_B402_WP13_DOMAIN_REG.htm");
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
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime()", localUtil.ttoc( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm42_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_crt_datetime_Internalname, localUtil.format(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm42_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm42_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm42_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtavCtltbm42_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime()", localUtil.ttoc( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm42_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_upd_datetime_Internalname, localUtil.format(AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm42_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm42_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP13_DOMAIN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm42_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtavCtltbm42_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV10D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(82);\"", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crt_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(85);\"", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_upd_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm());
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltbm42_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm42_crt_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm()", AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm());
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm42_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltbm42_upd_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm42_upd_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_36_1V2e( true) ;
      }
      else
      {
         wb_table7_36_1V2e( false) ;
      }
   }

   public void wb_table6_25_1V2( boolean wbgen )
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
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:600px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_25_1V2e( true) ;
      }
      else
      {
         wb_table6_25_1V2e( false) ;
      }
   }

   public void wb_table3_12_1V2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP13_DOMAIN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_1V2e( true) ;
      }
      else
      {
         wb_table3_12_1V2e( false) ;
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
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1V2( ) ;
      ws1V2( ) ;
      we1V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1594995");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp13_domain_reg.js", "?1594995");
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
                  /* Execute user subroutine: S23498 */
                  S23498 ();
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
      H001V2_A893TBM42_DOM_CD = new String[] {""} ;
      H001V2_A886TBM42_STUDY_ID = new long[1] ;
      H001V2_A918TBM42_UPD_CNT = new long[1] ;
      H001V2_n918TBM42_UPD_CNT = new boolean[] {false} ;
      A893TBM42_DOM_CD = "" ;
      AV17W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV20W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV18W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H001V3_A186TBM21_STUDY_ID = new long[1] ;
      H001V3_A187TBM21_STUDY_NM = new String[] {""} ;
      H001V3_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      H001V4_A8TAM07_USER_ID = new String[] {""} ;
      H001V4_A2TAM07_USER_NM = new String[] {""} ;
      H001V4_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H001V5_A8TAM07_USER_ID = new String[] {""} ;
      H001V5_A2TAM07_USER_NM = new String[] {""} ;
      H001V5_n2TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV22W_A819_JS = "" ;
      GXv_char3 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_boolean9 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
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
            H001V2_A893TBM42_DOM_CD, H001V2_A886TBM42_STUDY_ID, H001V2_A918TBM42_UPD_CNT, H001V2_n918TBM42_UPD_CNT
            }
            , new Object[] {
            H001V3_A186TBM21_STUDY_ID, H001V3_A187TBM21_STUDY_NM, H001V3_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H001V4_A8TAM07_USER_ID, H001V4_A2TAM07_USER_NM, H001V4_n2TAM07_USER_NM
            }
            , new Object[] {
            H001V5_A8TAM07_USER_ID, H001V5_A2TAM07_USER_NM, H001V5_n2TAM07_USER_NM
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
   private long A886TBM42_STUDY_ID ;
   private long A918TBM42_UPD_CNT ;
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
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_upd2_Internalname ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
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
   private String GXt_char1 ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String GXt_char2 ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV25W_ERRFLG ;
   private boolean n918TBM42_UPD_CNT ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n2TAM07_USER_NM ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
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
   private String A893TBM42_DOM_CD ;
   private String A187TBM21_STUDY_NM ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
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
   private String[] H001V2_A893TBM42_DOM_CD ;
   private long[] H001V2_A886TBM42_STUDY_ID ;
   private long[] H001V2_A918TBM42_UPD_CNT ;
   private boolean[] H001V2_n918TBM42_UPD_CNT ;
   private long[] H001V3_A186TBM21_STUDY_ID ;
   private String[] H001V3_A187TBM21_STUDY_NM ;
   private boolean[] H001V3_n187TBM21_STUDY_NM ;
   private String[] H001V4_A8TAM07_USER_ID ;
   private String[] H001V4_A2TAM07_USER_NM ;
   private boolean[] H001V4_n2TAM07_USER_NM ;
   private String[] H001V5_A8TAM07_USER_ID ;
   private String[] H001V5_A2TAM07_USER_NM ;
   private boolean[] H001V5_n2TAM07_USER_NM ;
   private GxObjectCollection AV17W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV20W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV18W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV21W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp13_domain_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001V2", "SELECT `TBM42_DOM_CD`, `TBM42_STUDY_ID`, `TBM42_UPD_CNT` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? and `TBM42_DOM_CD` = ? ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V3", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V5", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 2);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
      }
   }

}

