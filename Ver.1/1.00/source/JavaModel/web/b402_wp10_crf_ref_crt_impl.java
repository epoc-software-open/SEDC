/*
               File: b402_wp10_crf_ref_crt_impl
        Description: ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:3:22.60
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp10_crf_ref_crt_impl extends GXWebPanel
{
   public b402_wp10_crf_ref_crt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp10_crf_ref_crt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp10_crf_ref_crt_impl.class ));
   }

   public b402_wp10_crf_ref_crt_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_study_id = new HTMLChoice();
      cmbavD_crf_id = new HTMLChoice();
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
               AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
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
         pa162( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws162( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we162( ) ;
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
      httpContext.writeText( "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13P_CRF_ID,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp10_crf_ref_crt") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm162( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV15P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV13P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj", (short)(0)) ;
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12162 */
                        e12162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13162 */
                        e13162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14162 */
                        e14162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_STUDY_ID.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15162 */
                        e15162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16162 */
                        e16162 ();
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
                     AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
                  }
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
         cmbavD_crf_id.setName( "vD_CRF_ID" );
         cmbavD_crf_id.setWebtags( "" );
         if ( ( cmbavD_crf_id.getItemCount() > 0 ) && (0==AV7D_CRF_ID) )
         {
            AV7D_CRF_ID = (short)(GXutil.lval( cmbavD_crf_id.getItemValue((short)(1)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
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
      /* Execute user event: e14162 */
      e14162 ();
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
         /* Execute user event: e16162 */
         e16162 ();
         wb160( ) ;
      }
   }

   public void strup160( )
   {
      /* Before Start, stand alone formulas. */
      AV37Pgmname = "B402_WP10_CRF_REF_CRT" ;
      AV34Pgmdesc = "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e13162 */
      e13162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         cmbavD_study_id.setValue( httpContext.cgiGet( cmbavD_study_id.getInternalname()) );
         AV8D_STUDY_ID = GXutil.lval( httpContext.cgiGet( cmbavD_study_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         cmbavD_crf_id.setValue( httpContext.cgiGet( cmbavD_crf_id.getInternalname()) );
         AV7D_CRF_ID = (short)(GXutil.lval( httpContext.cgiGet( cmbavD_crf_id.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         AV9H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_ITEM_KBN");
            GX_FocusControl = edtavH_item_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_ITEM_KBN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_ITEM_KBN", GXutil.ltrim( GXutil.str( AV10H_ITEM_KBN, 2, 0)));
         }
         else
         {
            AV10H_ITEM_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_ITEM_KBN", GXutil.ltrim( GXutil.str( AV10H_ITEM_KBN, 2, 0)));
         }
         AV12H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_SRCH_FLG", AV12H_SRCH_FLG);
         AV11H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         /* Read saved values. */
         AV15P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV13P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
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
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e13162 */
      e13162 ();
      if (returnInSub) return;
   }

   public void e13162( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      AV5C_GAMEN_TITLE = AV34Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV9H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV20W_DOWNLOAD_FLG = (short)(0) ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV16W_A_LOGIN_SDT,AV6C_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0041",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e14162( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV9H_INIT_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV9H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e11162( )
   {
      /* 'BTN_REG' Routine */
      AV28W_RTN_CD = (byte)(0) ;
      GXv_int3[0] = AV28W_RTN_CD ;
      GXv_char4[0] = AV29W_RTN_MSG ;
      new b402_pc20_crf_copy(remoteHandle, context).execute( AV15P_STUDY_ID, AV13P_CRF_ID, AV8D_STUDY_ID, AV7D_CRF_ID, GXv_int3, GXv_char4) ;
      b402_wp10_crf_ref_crt_impl.this.AV28W_RTN_CD = (byte)((byte)(GXv_int3[0])) ;
      b402_wp10_crf_ref_crt_impl.this.AV29W_RTN_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
      if ( AV28W_RTN_CD != 0 )
      {
         GXt_char2 = AV17W_A821_JS ;
         GXv_char4[0] = GXt_char2 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV29W_RTN_MSG, "", "", "", GXv_char4) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char2 = GXv_char4[0] ;
         AV17W_A821_JS = GXt_char2 ;
      }
      else
      {
         GXt_char2 = AV25W_MSG ;
         GXv_char4[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char4) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char2 = GXv_char4[0] ;
         AV25W_MSG = GXt_char2 ;
         GXt_char2 = AV17W_A821_JS ;
         GXv_char4[0] = GXt_char2 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV25W_MSG, "", "BTN_CAN", "", GXv_char4) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char2 = GXv_char4[0] ;
         AV17W_A821_JS = GXt_char2 ;
      }
      AV31W_STUDY_ID = AV8D_STUDY_ID ;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV8D_STUDY_ID = AV31W_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
   }

   public void e12162( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e15162( )
   {
      /* D_study_id_Click Routine */
      AV31W_STUDY_ID = AV8D_STUDY_ID ;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV8D_STUDY_ID = AV31W_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV8D_STUDY_ID = AV15P_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void S162( )
   {
      /* 'SUB_CREATE_COMBO_BOX_CRF' Routine */
      cmbavD_crf_id.removeAllItems();
      /* Using cursor H00162 */
      pr_default.execute(0, new Object[] {new Long(AV8D_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A551TBM31_STATUS = H00162_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = H00162_n551TBM31_STATUS[0] ;
         A223TBM31_DEL_FLG = H00162_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H00162_n223TBM31_DEL_FLG[0] ;
         A217TBM31_STUDY_ID = H00162_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A219TBM31_CRF_NM = H00162_A219TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         n219TBM31_CRF_NM = H00162_n219TBM31_CRF_NM[0] ;
         A218TBM31_CRF_ID = H00162_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         if ( ( A218TBM31_CRF_ID != AV13P_CRF_ID ) || ( A217TBM31_STUDY_ID != AV15P_STUDY_ID ) )
         {
            cmbavD_crf_id.addItem(GXutil.str( A218TBM31_CRF_ID, 4, 0), A219TBM31_CRF_NM, (short)(0));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S172( )
   {
      /* 'SUB_CREATE_COMBO_BOX_STUDY' Routine */
      /* Using cursor H00163 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A513TBM21_STATUS = H00163_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = H00163_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = H00163_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H00163_n189TBM21_DEL_FLG[0] ;
         A187TBM21_STUDY_NM = H00163_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H00163_n187TBM21_STUDY_NM[0] ;
         A186TBM21_STUDY_ID = H00163_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         cmbavD_study_id.addItem(GXutil.str( A186TBM21_STUDY_ID, 10, 0), A187TBM21_STUDY_NM, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV16W_A_LOGIN_SDT;
      GXv_char4[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char4) ;
      AV16W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b402_wp10_crf_ref_crt_impl.this.AV21W_ERRCD = GXv_char4[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
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
      AV12H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_SRCH_FLG", AV12H_SRCH_FLG);
      AV17W_A821_JS = "" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV17W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV17W_A821_JS ;
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
      GXv_char4[0] = AV11H_KNGN_FLG ;
      GXv_char6[0] = AV21W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char4, GXv_char6) ;
      b402_wp10_crf_ref_crt_impl.this.AV11H_KNGN_FLG = GXv_char4[0] ;
      b402_wp10_crf_ref_crt_impl.this.AV21W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S18347( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp10_crf_ref_crt");
   }

   protected void nextLoad( )
   {
   }

   protected void e16162( )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_pdf_Internalname, "TXT_PDF", "", "", lblTxt_pdf_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_ITEM_KBN", GXutil.ltrim( GXutil.str( AV10H_ITEM_KBN, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_ITEM_KBN, (byte)(2), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_ITEM_KBN), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_ITEM_KBN), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "", "", "", "", edtavH_item_kbn_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_SRCH_FLG", AV12H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV12H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV12H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "2c4dd041-bc05-4078-b5a7-f8ce2f3cf741", "", "Style2"))+"\"  style=\"width:10px\">") ;
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
         wb_table4_12_162( true) ;
      }
      else
      {
         wb_table4_12_162( false) ;
      }
      return  ;
   }

   public void wb_table4_12_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_20_162( true) ;
      }
      else
      {
         wb_table5_20_162( false) ;
      }
      return  ;
   }

   public void wb_table5_20_162e( boolean wbgen )
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
         httpContext.writeText( " id=\""+"gxHTMLWrpW0041"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0041"+"");
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
         wb_table3_6_162e( true) ;
      }
      else
      {
         wb_table3_6_162e( false) ;
      }
   }

   public void wb_table5_20_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table6_26_162( true) ;
      }
      else
      {
         wb_table6_26_162( false) ;
      }
      return  ;
   }

   public void wb_table6_26_162e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_162e( true) ;
      }
      else
      {
         wb_table5_20_162e( false) ;
      }
   }

   public void wb_table6_26_162( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 600, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"2\" >") ;
         httpContext.writeText( "Å•äÓñ{èÓïÒ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:50px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, "ééå±", "", "", lblTextblock63_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.str( AV8D_STUDY_ID, 10, 0), 1, cmbavD_study_id.getJsonclick(), 5, "EVD_STUDY_ID.CLICK.", "int", "", 1, 1, 0, (short)(0), 10, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "", true, "HLP_B402_WP10_CRF_REF_CRT.htm");
         cmbavD_study_id.setValue( GXutil.str( AV8D_STUDY_ID, 10, 0) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, "CRF", "", "", lblTextblock65_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_crf_id, cmbavD_crf_id.getInternalname(), GXutil.str( AV7D_CRF_ID, 4, 0), 1, cmbavD_crf_id.getJsonclick(), 0, "", "int", "", 1, 1, 0, (short)(0), 4, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", true, "HLP_B402_WP10_CRF_REF_CRT.htm");
         cmbavD_crf_id.setValue( GXutil.str( AV7D_CRF_ID, 4, 0) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_crf_id.getInternalname(), "Values", cmbavD_crf_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_162e( true) ;
      }
      else
      {
         wb_table6_26_162e( false) ;
      }
   }

   public void wb_table4_12_162( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "çÏê¨ÅiF3Åj", "", "", lblTextblock42_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "ñﬂÇÈÅiF11Åj", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_162e( true) ;
      }
      else
      {
         wb_table4_12_162e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV15P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
      AV13P_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1532299");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp10_crf_ref_crt.js", "?1532299");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      cmbavD_study_id.setInternalname( "vD_STUDY_ID" );
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      cmbavD_crf_id.setInternalname( "vD_CRF_ID" );
      tblTable5_Internalname = "TABLE5" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_pdf_Internalname = "TXT_PDF" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_item_kbn_Internalname = "vH_ITEM_KBN" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      cmbavD_crf_id.setJsonclick( "" );
      cmbavD_study_id.setJsonclick( "" );
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_item_kbn_Jsonclick = "" ;
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
                  /* Execute user subroutine: S18347 */
                  S18347 ();
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
      AV37Pgmname = "" ;
      AV34Pgmdesc = "" ;
      AV9H_INIT_FLG = "" ;
      AV12H_SRCH_FLG = "" ;
      AV11H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV16W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_int3 = new short [1] ;
      AV29W_RTN_MSG = "" ;
      AV17W_A821_JS = "" ;
      AV25W_MSG = "" ;
      scmdbuf = "" ;
      H00162_A551TBM31_STATUS = new String[] {""} ;
      H00162_n551TBM31_STATUS = new boolean[] {false} ;
      H00162_A223TBM31_DEL_FLG = new String[] {""} ;
      H00162_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H00162_A217TBM31_STUDY_ID = new long[1] ;
      H00162_A219TBM31_CRF_NM = new String[] {""} ;
      H00162_n219TBM31_CRF_NM = new boolean[] {false} ;
      H00162_A218TBM31_CRF_ID = new short[1] ;
      A551TBM31_STATUS = "" ;
      A223TBM31_DEL_FLG = "" ;
      A219TBM31_CRF_NM = "" ;
      H00163_A513TBM21_STATUS = new String[] {""} ;
      H00163_n513TBM21_STATUS = new boolean[] {false} ;
      H00163_A189TBM21_DEL_FLG = new String[] {""} ;
      H00163_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H00163_A187TBM21_STUDY_NM = new String[] {""} ;
      H00163_n187TBM21_STUDY_NM = new boolean[] {false} ;
      H00163_A186TBM21_STUDY_ID = new long[1] ;
      A513TBM21_STATUS = "" ;
      A189TBM21_DEL_FLG = "" ;
      A187TBM21_STUDY_NM = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char4 = new String [1] ;
      GXv_char6 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_pdf_Jsonclick = "" ;
      TempTags = "" ;
      GXt_char1 = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      GXt_char2 = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp10_crf_ref_crt__default(),
         new Object[] {
             new Object[] {
            H00162_A551TBM31_STATUS, H00162_n551TBM31_STATUS, H00162_A223TBM31_DEL_FLG, H00162_n223TBM31_DEL_FLG, H00162_A217TBM31_STUDY_ID, H00162_A219TBM31_CRF_NM, H00162_n219TBM31_CRF_NM, H00162_A218TBM31_CRF_ID
            }
            , new Object[] {
            H00163_A513TBM21_STATUS, H00163_n513TBM21_STATUS, H00163_A189TBM21_DEL_FLG, H00163_n189TBM21_DEL_FLG, H00163_A187TBM21_STUDY_NM, H00163_n187TBM21_STUDY_NM, H00163_A186TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV37Pgmname = "B402_WP10_CRF_REF_CRT" ;
      AV34Pgmdesc = "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj" ;
      /* GeneXus formulas. */
      AV37Pgmname = "B402_WP10_CRF_REF_CRT" ;
      AV34Pgmdesc = "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV10H_ITEM_KBN ;
   private byte AV28W_RTN_CD ;
   private byte nGXWrapped ;
   private short wcpOAV13P_CRF_ID ;
   private short AV13P_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short AV7D_CRF_ID ;
   private short Gx_err ;
   private short AV20W_DOWNLOAD_FLG ;
   private short GXv_int3[] ;
   private short A218TBM31_CRF_ID ;
   private int tblTbl_hidden_Visible ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long wcpOAV15P_STUDY_ID ;
   private long AV15P_STUDY_ID ;
   private long AV8D_STUDY_ID ;
   private long AV31W_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
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
   private String AV37Pgmname ;
   private String AV34Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_item_kbn_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_pdf_Internalname ;
   private String lblTxt_pdf_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_item_kbn_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String GXt_char1 ;
   private String tblTable4_Internalname ;
   private String tblTable5_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String GXt_char2 ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n551TBM31_STATUS ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n513TBM21_STATUS ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n187TBM21_STUDY_NM ;
   private String AV9H_INIT_FLG ;
   private String AV12H_SRCH_FLG ;
   private String AV11H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV29W_RTN_MSG ;
   private String AV17W_A821_JS ;
   private String AV25W_MSG ;
   private String A551TBM31_STATUS ;
   private String A223TBM31_DEL_FLG ;
   private String A219TBM31_CRF_NM ;
   private String A513TBM21_STATUS ;
   private String A189TBM21_DEL_FLG ;
   private String A187TBM21_STUDY_NM ;
   private String AV21W_ERRCD ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_study_id ;
   private HTMLChoice cmbavD_crf_id ;
   private IDataStoreProvider pr_default ;
   private String[] H00162_A551TBM31_STATUS ;
   private boolean[] H00162_n551TBM31_STATUS ;
   private String[] H00162_A223TBM31_DEL_FLG ;
   private boolean[] H00162_n223TBM31_DEL_FLG ;
   private long[] H00162_A217TBM31_STUDY_ID ;
   private String[] H00162_A219TBM31_CRF_NM ;
   private boolean[] H00162_n219TBM31_CRF_NM ;
   private short[] H00162_A218TBM31_CRF_ID ;
   private String[] H00163_A513TBM21_STATUS ;
   private boolean[] H00163_n513TBM21_STATUS ;
   private String[] H00163_A189TBM21_DEL_FLG ;
   private boolean[] H00163_n189TBM21_DEL_FLG ;
   private String[] H00163_A187TBM21_STUDY_NM ;
   private boolean[] H00163_n187TBM21_STUDY_NM ;
   private long[] H00163_A186TBM21_STUDY_ID ;
   private SdtA_LOGIN_SDT AV16W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
}

final  class b402_wp10_crf_ref_crt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00162", "SELECT `TBM31_STATUS`, `TBM31_DEL_FLG`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_STATUS` <> '9') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H00163", "SELECT `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STATUS` <> '9') AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
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
      }
   }

}

