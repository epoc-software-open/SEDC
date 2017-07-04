/*
               File: b402_wp08_crf_reg_impl
        Description: ééå±ìoò^ÅiCRFìoò^Åj
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:2:55.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp08_crf_reg_impl extends GXWebPanel
{
   public b402_wp08_crf_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp08_crf_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp08_crf_reg_impl.class ));
   }

   public b402_wp08_crf_reg_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltbm31_status = new HTMLChoice();
      radavCtltbm31_del_flg = new HTMLChoice();
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
            AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13P_CRF_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
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
         pa142( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws142( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we142( ) ;
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
      httpContext.writeText( "ééå±ìoò^ÅiCRFìoò^Åj") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV13P_CRF_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm142( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_crf", AV5BC_CRF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_crf", AV5BC_CRF);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV14P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.rtrim( AV13P_CRF_ID));
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

   public void wb140( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_142( true) ;
      }
      else
      {
         wb_table1_2_142( false) ;
      }
      return  ;
   }

   public void wb_table1_2_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_110_142( true) ;
      }
      else
      {
         wb_table2_110_142( false) ;
      }
      return  ;
   }

   public void wb_table2_110_142e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start142( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ééå±ìoò^ÅiCRFìoò^Åj", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0108") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0108", "");
         }
      }
      wbErr = false ;
      strup140( ) ;
   }

   public void ws142( )
   {
      start142( ) ;
      evt142( ) ;
   }

   public void evt142( )
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
                        /* Execute user event: e11142 */
                        e11142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12142 */
                        e12142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13142 */
                        e13142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14142 */
                        e14142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15142 */
                        e15142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16142 */
                        e16142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17142 */
                        e17142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e18142 */
                        e18142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e19142 */
                        e19142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e20142 */
                        e20142 ();
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
                  else if ( nCmpId == 108 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0108") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0108", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we142( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm142( ) ;
         }
      }
   }

   public void pa142( )
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
                  AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV13P_CRF_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
                  }
               }
            }
         }
         radavCtltbm31_status.setName( "CTLTBM31_STATUS" );
         radavCtltbm31_status.setWebtags( "" );
         radavCtltbm31_del_flg.setName( "CTLTBM31_DEL_FLG" );
         radavCtltbm31_del_flg.setWebtags( "" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf142( ) ;
      /* End function Refresh */
   }

   public void rf142( )
   {
      /* Execute user event: e16142 */
      e16142 ();
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
         /* Execute user event: e20142 */
         e20142 ();
         wb140( ) ;
      }
   }

   public void strup140( )
   {
      /* Before Start, stand alone formulas. */
      AV46Pgmname = "B402_WP08_CRF_REG" ;
      AV45Pgmdesc = "ééå±ìoò^ÅiCRFìoò^Åj" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_study_id_Enabled, 5, 0)));
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e15142 */
      e15142 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_crf"), AV5BC_CRF);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_STUDY_ID");
            GX_FocusControl = edtavCtltbm31_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( 0 );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
            GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(0) );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
         }
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",") > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_ORDER");
            GX_FocusControl = edtavCtltbm31_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( 0 );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",")) );
         }
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_status( httpContext.cgiGet( radavCtltbm31_status.getInternalname()) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_note( httpContext.cgiGet( edtavCtltbm31_note_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_del_flg( httpContext.cgiGet( radavCtltbm31_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm31_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"çÏê¨ì˙éû"}), 1, "CTLTBM31_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm31_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm31_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm31_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"çXêVì˙éû"}), 1, "CTLTBM31_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm31_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm31_upd_datetime_Internalname)) );
         }
         AV8D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         AV9D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( httpContext.cgiGet( edtavCtltbm31_crt_prog_nm_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( httpContext.cgiGet( edtavCtltbm31_upd_prog_nm_Internalname) );
         AV10H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         AV12H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV11H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         /* Read saved values. */
         AV14P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV13P_CRF_ID = httpContext.cgiGet( "vP_CRF_ID") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0108") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0108", "");
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
      /* Execute user event: e15142 */
      e15142 ();
      if (returnInSub) return;
   }

   public void e15142( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      AV7C_GAMEN_TITLE = AV45Pgmdesc ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0108",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e16142( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV10H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV46Pgmname, "INFO", "âÊñ ãNìÆ") ;
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

   public void e11142( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV29W_REG_ENABEL )
      {
         AV27W_ERRFLG = false ;
         AV23W_DEL_FLG = false ;
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            GXt_char2 = AV21W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV21W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e17142( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV29W_REG_ENABEL )
      {
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( AV46Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( AV46Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.Save();
         if ( AV5BC_CRF.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
            httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e12142( )
   {
      /* 'BTN_UPD' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV30W_UPD_ENABEL )
      {
         AV27W_ERRFLG = false ;
         AV23W_DEL_FLG = false ;
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            GXt_char2 = AV21W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV21W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e18142( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV30W_UPD_ENABEL )
      {
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( AV46Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.Save();
         if ( AV5BC_CRF.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
            httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e13142( )
   {
      /* 'BTN_DLT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV24W_DLT_ENABEL )
      {
         AV27W_ERRFLG = false ;
         AV23W_DEL_FLG = true ;
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            GXt_char2 = AV21W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_DLT_EXEC", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV21W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e19142( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV24W_DLT_ENABEL )
      {
         GXv_int4[0] = AV25W_ERR_CD ;
         GXv_char3[0] = AV28W_MSG ;
         new b402_pc23_crf_del(remoteHandle, context).execute( AV5BC_CRF, GXv_int4, GXv_char3) ;
         b402_wp08_crf_reg_impl.this.AV25W_ERR_CD = (byte)((byte)(GXv_int4[0])) ;
         b402_wp08_crf_reg_impl.this.AV28W_MSG = GXv_char3[0] ;
         if ( AV25W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
            httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e14142( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      radavCtltbm31_status.removeAllItems();
      radavCtltbm31_status.addItem("0", gxdomainct_status.getDescription((String)"0"), (short)(0));
      radavCtltbm31_status.addItem("1", gxdomainct_status.getDescription((String)"1"), (short)(0));
      radavCtltbm31_status.addItem("9", gxdomainct_status.getDescription((String)"9"), (short)(0));
      radavCtltbm31_del_flg.removeAllItems();
      radavCtltbm31_del_flg.addItem("0", gxdomainct_del_flg.getDescription((String)"0"), (short)(0));
      radavCtltbm31_del_flg.addItem("1", gxdomainct_del_flg.getDescription((String)"1"), (short)(0));
   }

   public void S182( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[0] = AV15W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[0] = AV18W_A_RESULT_MSG_SDT ;
      new b402_pc15_crf_mst_chk(remoteHandle, context).execute( AV5BC_CRF, AV23W_DEL_FLG, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6) ;
      AV15W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[0] ;
      AV18W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[0] ;
      if ( AV18W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV27W_ERRFLG = true ;
         AV47GXV13 = 1 ;
         while ( AV47GXV13 <= AV18W_A_RESULT_MSG_SDT.size() )
         {
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV18W_A_RESULT_MSG_SDT.elementAt(-1+AV47GXV13));
            httpContext.GX_msglist.addItem(AV19W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV47GXV13 = (int)(AV47GXV13+1) ;
         }
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm31_crf_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Backcolor, 9, 0)));
      edtavCtltbm31_crf_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_nm_Backcolor, 9, 0)));
      edtavCtltbm31_crf_snm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_snm_Backcolor, 9, 0)));
      edtavCtltbm31_order_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_order_Backcolor, 9, 0)));
      edtavCtltbm31_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_note_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV48GXV14 = 1 ;
      while ( AV48GXV14 <= AV15W_A_CHK_RESULT_SDT.size() )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV15W_A_CHK_RESULT_SDT.elementAt(-1+AV48GXV14));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV48GXV14 = (int)(AV48GXV14+1) ;
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_ID") == 0 )
      {
         edtavCtltbm31_crf_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_NM") == 0 )
      {
         edtavCtltbm31_crf_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_nm_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_SNM") == 0 )
      {
         edtavCtltbm31_crf_snm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_snm_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_snm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_ORDER") == 0 )
      {
         edtavCtltbm31_order_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_order_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_NOTE") == 0 )
      {
         edtavCtltbm31_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_note_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (0==AV14P_STUDY_ID) && ! (GXutil.strcmp("", AV13P_CRF_ID)==0) )
      {
         AV12H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV22W_CRF_ID = (short)(GXutil.lval( AV13P_CRF_ID)) ;
         AV5BC_CRF.Load(AV14P_STUDY_ID, AV22W_CRF_ID);
         if ( AV5BC_CRF.Fail() )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
         else
         {
            AV49GXLvl402 = (byte)(0) ;
            /* Using cursor H00142 */
            pr_default.execute(0, new Object[] {AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A8TAM07_USER_ID = H00142_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H00142_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H00142_n2TAM07_USER_NM[0] ;
               AV49GXLvl402 = (byte)(1) ;
               GXt_char2 = AV8D_CRT_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV49GXLvl402 == 0 )
            {
               AV8D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id(), AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id()) == 0 )
            {
               AV9D_UPD_USER_NM = AV8D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
            }
            else
            {
               AV50GXLvl417 = (byte)(0) ;
               /* Using cursor H00143 */
               pr_default.execute(1, new Object[] {AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id()});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A8TAM07_USER_ID = H00143_A8TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
                  A2TAM07_USER_NM = H00143_A2TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  n2TAM07_USER_NM = H00143_n2TAM07_USER_NM[0] ;
                  AV50GXLvl417 = (byte)(1) ;
                  GXt_char2 = AV9D_UPD_USER_NM ;
                  GXv_char3[0] = GXt_char2 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
                  b402_wp08_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  AV9D_UPD_USER_NM = GXt_char2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               if ( AV50GXLvl417 == 0 )
               {
                  AV9D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
               }
            }
         }
         edtavCtltbm31_crf_id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Enabled, 5, 0)));
         radavCtltbm31_status.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_status.getEnabled(), 5, 0)));
         edtavCtltbm31_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Visible, 5, 0)));
         edtavCtltbm31_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Visible, 5, 0)));
         if ( new b402_pc22_is_study_run(remoteHandle, context).executeUdp( AV14P_STUDY_ID) )
         {
            radavCtltbm31_status.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_status.getEnabled(), 5, 0)));
            radavCtltbm31_del_flg.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_del_flg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_del_flg.getEnabled(), 5, 0)));
         }
         GX_FocusControl = edtavCtltbm31_crf_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV12H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( AV14P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         edtavCtltbm31_crf_id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Enabled, 5, 0)));
         radavCtltbm31_status.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_status.getEnabled(), 5, 0)));
         edtavCtltbm31_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Visible, 5, 0)));
         edtavCtltbm31_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor H00144 */
      pr_default.execute(2, new Object[] {new Long(AV14P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A186TBM21_STUDY_ID = H00144_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H00144_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H00144_n187TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A187TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'SUB_GET_PROC_ENABLE' Routine */
      GXt_boolean7 = AV29W_REG_ENABEL ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new b402_pc22_is_study_run(remoteHandle, context).execute( AV14P_STUDY_ID, GXv_boolean8) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      GXt_boolean9 = AV29W_REG_ENABEL ;
      GXv_boolean10[0] = GXt_boolean9 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV11H_KNGN_FLG, "", GXv_boolean10) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV29W_REG_ENABEL = (GXt_boolean7 ? false : GXt_boolean9) ;
      GXt_boolean9 = AV24W_DLT_ENABEL ;
      GXv_boolean10[0] = GXt_boolean9 ;
      new b402_pc22_is_study_run(remoteHandle, context).execute( AV14P_STUDY_ID, GXv_boolean10) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      GXt_boolean7 = AV24W_DLT_ENABEL ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV11H_KNGN_FLG, "", GXv_boolean8) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV24W_DLT_ENABEL = (GXt_boolean9 ? false : GXt_boolean7) ;
      GXt_boolean9 = AV30W_UPD_ENABEL ;
      GXv_boolean10[0] = GXt_boolean9 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV11H_KNGN_FLG, "", GXv_boolean10) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV30W_UPD_ENABEL = GXt_boolean9 ;
      AV29W_REG_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? false : AV29W_REG_ENABEL) ;
      AV24W_DLT_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? AV24W_DLT_ENABEL : false) ;
      AV30W_UPD_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? AV30W_UPD_ENABEL : false) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT11[0] = AV17W_A_LOGIN_SDT;
      GXv_char3[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT11, GXv_char3) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT11[0] ;
      b402_wp08_crf_reg_impl.this.AV26W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
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
      AV21W_A821_JS = "" ;
      AV20W_A819_JS = "" ;
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_grid_size( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_status( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_note( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( GXt_dtime12 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( GXt_dtime12 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
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
      if ( ! (GXutil.strcmp("", AV21W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV21W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV20W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV20W_A819_JS ;
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
      GXv_char13[0] = AV26W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char3, GXv_char13) ;
      b402_wp08_crf_reg_impl.this.AV11H_KNGN_FLG = GXv_char3[0] ;
      b402_wp08_crf_reg_impl.this.AV26W_ERRCD = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S23632( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV46Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
   }

   public void S222( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      lblTxt_btn_reg_Visible = (AV29W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_upd_Visible = (AV30W_UPD_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      lblTxt_btn_dlt_Visible = (AV24W_DLT_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
   }

   protected void nextLoad( )
   {
   }

   protected void e20142( )
   {
      /* Load Routine */
   }

   public void wb_table2_110_142( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV10H_INIT_FLG), GXutil.rtrim( localUtil.format( AV10H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV12H_MODE), GXutil.rtrim( localUtil.format( AV12H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(115);\"", "", "", "", "", edtavH_mode_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(116);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_110_142e( true) ;
      }
      else
      {
         wb_table2_110_142e( false) ;
      }
   }

   public void wb_table1_2_142( boolean wbgen )
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
         wb_table3_6_142( true) ;
      }
      else
      {
         wb_table3_6_142( false) ;
      }
      return  ;
   }

   public void wb_table3_6_142e( boolean wbgen )
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
         wb_table1_2_142e( true) ;
      }
      else
      {
         wb_table1_2_142e( false) ;
      }
   }

   public void wb_table3_6_142( boolean wbgen )
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
         wb_table4_12_142( true) ;
      }
      else
      {
         wb_table4_12_142( false) ;
      }
      return  ;
   }

   public void wb_table4_12_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_24_142( true) ;
      }
      else
      {
         wb_table5_24_142( false) ;
      }
      return  ;
   }

   public void wb_table5_24_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0108"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0108"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0108"+"");
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
         wb_table3_6_142e( true) ;
      }
      else
      {
         wb_table3_6_142e( false) ;
      }
   }

   public void wb_table5_24_142( boolean wbgen )
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
         wb_table6_30_142( true) ;
      }
      else
      {
         wb_table6_30_142( false) ;
      }
      return  ;
   }

   public void wb_table6_30_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_76_142( true) ;
      }
      else
      {
         wb_table7_76_142( false) ;
      }
      return  ;
   }

   public void wb_table7_76_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_24_142e( true) ;
      }
      else
      {
         wb_table5_24_142e( false) ;
      }
   }

   public void wb_table7_76_142( boolean wbgen )
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
         httpContext.writeText( "Å•ä«óùèÓïÒ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "çÏê¨ì˙éû", "", "", lblTextblock67_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime()", localUtil.ttoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm31_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crt_datetime_Internalname, localUtil.format(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm31_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm31_crt_datetime_Visible, edtavCtltbm31_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP08_CRF_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm31_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm31_crt_datetime_Visible==0)||(edtavCtltbm31_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "çXêVì˙éû", "", "", lblTextblock72_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime()", localUtil.ttoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm31_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_upd_datetime_Internalname, localUtil.format(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm31_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm31_upd_datetime_Visible, edtavCtltbm31_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP08_CRF_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm31_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm31_upd_datetime_Visible==0)||(edtavCtltbm31_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "çÏê¨ÉÜÅ[ÉUÅ[ñº", "", "", lblTextblock70_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(92);\"", (short)(1), 1, edtavD_crt_user_nm_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, "çXêVÉÜÅ[ÉUÅ[ñº", "", "", lblTextblock73_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV9D_UPD_USER_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(96);\"", (short)(1), 1, edtavD_upd_user_nm_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "çÏê¨ÉvÉçÉOÉâÉÄID", "", "", lblTextblock71_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltbm31_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm31_crt_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, "çXêVÉvÉçÉOÉâÉÄID", "", "", lblTextblock74_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltbm31_upd_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm31_upd_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_76_142e( true) ;
      }
      else
      {
         wb_table7_76_142e( false) ;
      }
   }

   public void wb_table6_30_142( boolean wbgen )
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
         httpContext.writeText( "Å•äÓñ{èÓïÒ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, "ééå±ID", "", "", lblTextblock63_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         httpContext.writeText( "<div style=\"WIDTH: 345px\" class=\"SectionWordBreak\" id=\"Section1\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()", GXutil.ltrim( GXutil.str( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id(), 10, 0)));
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id(), (byte)(10), (byte)(0), ".", "")), ((edtavCtltbm31_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), "ZZZZZZZZZ9")), "", "", "", "", "", edtavCtltbm31_study_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm31_study_id_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "&nbsp;", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(2), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage8_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "CRFID", "", "", lblTextblock68_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id()", GXutil.ltrim( GXutil.str( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_crf_id_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(45);\"", "", "", "", "", edtavCtltbm31_crf_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm31_crf_id_Enabled, 1, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, "CRFñºèÃ", "", "", lblTextblock65_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_crf_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "", "", "", "", edtavCtltbm31_crf_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 40, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage9_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, "CRFó™èÃ", "", "", lblTextblock69_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_crf_snm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_snm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "", "", "", "", edtavCtltbm31_crf_snm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, "ï\é¶èá", "", "", lblTextblock79_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order()", GXutil.ltrim( GXutil.str( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order(), 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_order_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order(), (byte)(5), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order()), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(61);\"", "", "", "", "", edtavCtltbm31_order_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, "èÛë‘", "", "", lblTextblock80_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm31_status, radavCtltbm31_status.getInternalname(), AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status(), "", 1, radavCtltbm31_status.getEnabled(), 0, 0, StyleString, ClassString, 0, radavCtltbm31_status.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(65);\"", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, "îıçl", "", "", lblTextblock81_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_note()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_note());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm31_note_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(70);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, "çÌèú", "", "", lblTextblock84_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg()", AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg());
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm31_del_flg, radavCtltbm31_del_flg.getInternalname(), AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg(), "", 1, radavCtltbm31_del_flg.getEnabled(), 0, 0, StyleString, ClassString, 0, radavCtltbm31_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(75);\"", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_30_142e( true) ;
      }
      else
      {
         wb_table6_30_142e( false) ;
      }
   }

   public void wb_table4_12_142( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "ìoò^ÅiF3Åj", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "çXêVÅiF4Åj", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "çÌèúÅiF6Åj", "", "", lblTxt_btn_dlt_Jsonclick, "E\\'BTN_DLT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "ñﬂÇÈÅiF11Åj", "", "", lblTxt_btn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_142e( true) ;
      }
      else
      {
         wb_table4_12_142e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      AV13P_CRF_ID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
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
      pa142( ) ;
      ws142( ) ;
      we142( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?152593");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp08_crf_reg.js", "?152593");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage6_Internalname = "IMAGE6" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtavCtltbm31_study_id_Internalname = "CTLTBM31_STUDY_ID" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      imgImage8_Internalname = "IMAGE8" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID" ;
      imgImage7_Internalname = "IMAGE7" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM" ;
      imgImage9_Internalname = "IMAGE9" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtavCtltbm31_order_Internalname = "CTLTBM31_ORDER" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      radavCtltbm31_status.setInternalname( "CTLTBM31_STATUS" );
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtavCtltbm31_note_Internalname = "CTLTBM31_NOTE" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      radavCtltbm31_del_flg.setInternalname( "CTLTBM31_DEL_FLG" );
      tblTable5_Internalname = "TABLE5" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavCtltbm31_crt_datetime_Internalname = "CTLTBM31_CRT_DATETIME" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtavCtltbm31_upd_datetime_Internalname = "CTLTBM31_UPD_DATETIME" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtavCtltbm31_crt_prog_nm_Internalname = "CTLTBM31_CRT_PROG_NM" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtavCtltbm31_upd_prog_nm_Internalname = "CTLTBM31_UPD_PROG_NM" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
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
      lblTxt_btn_upd_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      radavCtltbm31_del_flg.setJsonclick( "" );
      radavCtltbm31_del_flg.setEnabled( 1 );
      edtavCtltbm31_note_Backstyle = (byte)(-1) ;
      edtavCtltbm31_note_Backcolor = (int)(0xFFFFFF) ;
      radavCtltbm31_status.setJsonclick( "" );
      radavCtltbm31_status.setEnabled( 1 );
      edtavCtltbm31_order_Jsonclick = "" ;
      edtavCtltbm31_order_Backstyle = (byte)(-1) ;
      edtavCtltbm31_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_snm_Jsonclick = "" ;
      edtavCtltbm31_crf_snm_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_nm_Jsonclick = "" ;
      edtavCtltbm31_crf_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      edtavCtltbm31_crf_id_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Enabled = 1 ;
      edtavCtltbm31_study_id_Jsonclick = "" ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      edtavCtltbm31_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm31_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm31_upd_datetime_Jsonclick = "" ;
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      edtavCtltbm31_upd_datetime_Visible = 1 ;
      edtavCtltbm31_crt_datetime_Jsonclick = "" ;
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      edtavCtltbm31_crt_datetime_Visible = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_study_Caption = "ééå±ñº" ;
      edtavCtltbm31_crf_id_Enabled = 1 ;
      edtavCtltbm31_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm31_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm31_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm31_upd_datetime_Enabled = -1 ;
      edtavCtltbm31_crt_datetime_Enabled = -1 ;
      edtavCtltbm31_study_id_Enabled = -1 ;
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
                  /* Execute user subroutine: S23632 */
                  S23632 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_CRF = new SdtTBM31_CRF(remoteHandle);
      wcpOAV13P_CRF_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13P_CRF_ID = "" ;
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
      AV46Pgmname = "" ;
      AV45Pgmdesc = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV9D_UPD_USER_NM = "" ;
      AV10H_INIT_FLG = "" ;
      AV12H_MODE = "" ;
      AV11H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV28W_MSG = "" ;
      AV21W_A821_JS = "" ;
      GXv_int4 = new short [1] ;
      AV15W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5 = new GxObjectCollection [1] ;
      AV18W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6 = new GxObjectCollection [1] ;
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      scmdbuf = "" ;
      H00142_A8TAM07_USER_ID = new String[] {""} ;
      H00142_A2TAM07_USER_NM = new String[] {""} ;
      H00142_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H00143_A8TAM07_USER_ID = new String[] {""} ;
      H00143_A2TAM07_USER_NM = new String[] {""} ;
      H00143_n2TAM07_USER_NM = new boolean[] {false} ;
      H00144_A186TBM21_STUDY_ID = new long[1] ;
      H00144_A187TBM21_STUDY_NM = new String[] {""} ;
      H00144_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      GXv_boolean8 = new boolean [1] ;
      GXv_boolean10 = new boolean [1] ;
      GXv_SdtA_LOGIN_SDT11 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      AV20W_A819_JS = "" ;
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String [1] ;
      GXv_char13 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      GXt_char1 = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTxt_study_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      lblTextblock80_Jsonclick = "" ;
      lblTextblock81_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      GXt_char2 = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp08_crf_reg__default(),
         new Object[] {
             new Object[] {
            H00142_A8TAM07_USER_ID, H00142_A2TAM07_USER_NM, H00142_n2TAM07_USER_NM
            }
            , new Object[] {
            H00143_A8TAM07_USER_ID, H00143_A2TAM07_USER_NM, H00143_n2TAM07_USER_NM
            }
            , new Object[] {
            H00144_A186TBM21_STUDY_ID, H00144_A187TBM21_STUDY_NM, H00144_n187TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV46Pgmname = "B402_WP08_CRF_REG" ;
      AV45Pgmdesc = "ééå±ìoò^ÅiCRFìoò^Åj" ;
      /* GeneXus formulas. */
      AV46Pgmname = "B402_WP08_CRF_REG" ;
      AV45Pgmdesc = "ééå±ìoò^ÅiCRFìoò^Åj" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV25W_ERR_CD ;
   private byte AV49GXLvl402 ;
   private byte AV50GXLvl417 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm31_note_Backstyle ;
   private byte edtavCtltbm31_order_Backstyle ;
   private byte edtavCtltbm31_crf_snm_Backstyle ;
   private byte edtavCtltbm31_crf_nm_Backstyle ;
   private byte edtavCtltbm31_crf_id_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short GXv_int4[] ;
   private short AV22W_CRF_ID ;
   private int edtavCtltbm31_study_id_Enabled ;
   private int edtavCtltbm31_crt_datetime_Enabled ;
   private int edtavCtltbm31_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm31_crt_prog_nm_Enabled ;
   private int edtavCtltbm31_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV47GXV13 ;
   private int edtavCtltbm31_crf_id_Backcolor ;
   private int edtavCtltbm31_crf_nm_Backcolor ;
   private int edtavCtltbm31_crf_snm_Backcolor ;
   private int edtavCtltbm31_order_Backcolor ;
   private int edtavCtltbm31_note_Backcolor ;
   private int AV48GXV14 ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltbm31_crt_datetime_Visible ;
   private int edtavCtltbm31_upd_datetime_Visible ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int idxLst ;
   private long wcpOAV14P_STUDY_ID ;
   private long AV14P_STUDY_ID ;
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
   private String AV46Pgmname ;
   private String AV45Pgmdesc ;
   private String edtavCtltbm31_study_id_Internalname ;
   private String edtavCtltbm31_crt_datetime_Internalname ;
   private String edtavCtltbm31_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm31_crt_prog_nm_Internalname ;
   private String edtavCtltbm31_upd_prog_nm_Internalname ;
   private String edtavCtltbm31_crf_id_Internalname ;
   private String edtavCtltbm31_crf_nm_Internalname ;
   private String edtavCtltbm31_crf_snm_Internalname ;
   private String edtavCtltbm31_order_Internalname ;
   private String edtavCtltbm31_note_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char13[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavCtltbm31_crt_datetime_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtavCtltbm31_upd_datetime_Jsonclick ;
   private String GXt_char1 ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtavCtltbm31_crt_prog_nm_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtavCtltbm31_upd_prog_nm_Jsonclick ;
   private String tblTable5_Internalname ;
   private String imgImage6_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtavCtltbm31_study_id_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTxt_study_Jsonclick ;
   private String imgImage8_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String imgImage7_Internalname ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String imgImage9_Internalname ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtavCtltbm31_crf_snm_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtavCtltbm31_order_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String GXt_char2 ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime12 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV29W_REG_ENABEL ;
   private boolean AV27W_ERRFLG ;
   private boolean AV23W_DEL_FLG ;
   private boolean AV30W_UPD_ENABEL ;
   private boolean AV24W_DLT_ENABEL ;
   private boolean n2TAM07_USER_NM ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private boolean GXt_boolean9 ;
   private boolean GXv_boolean10[] ;
   private String wcpOAV13P_CRF_ID ;
   private String AV13P_CRF_ID ;
   private String AV8D_CRT_USER_NM ;
   private String AV9D_UPD_USER_NM ;
   private String AV10H_INIT_FLG ;
   private String AV12H_MODE ;
   private String AV11H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV28W_MSG ;
   private String AV21W_A821_JS ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A187TBM21_STUDY_NM ;
   private String AV26W_ERRCD ;
   private String AV20W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM31_CRF AV5BC_CRF ;
   private HTMLChoice radavCtltbm31_status ;
   private HTMLChoice radavCtltbm31_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H00142_A8TAM07_USER_ID ;
   private String[] H00142_A2TAM07_USER_NM ;
   private boolean[] H00142_n2TAM07_USER_NM ;
   private String[] H00143_A8TAM07_USER_ID ;
   private String[] H00143_A2TAM07_USER_NM ;
   private boolean[] H00143_n2TAM07_USER_NM ;
   private long[] H00144_A186TBM21_STUDY_ID ;
   private String[] H00144_A187TBM21_STUDY_NM ;
   private boolean[] H00144_n187TBM21_STUDY_NM ;
   private GxObjectCollection AV15W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[] ;
   private GxObjectCollection AV18W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT11[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp08_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00142", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00143", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00144", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

