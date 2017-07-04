/*
               File: b402_wp10_crf_ref_crt_impl
        Description: ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:36.17
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
               AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
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
         pa152( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws152( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we152( ) ;
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
      httpContext.writeValue( "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317173620");
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
      GXEncryptionTmp = "b402_wp10_crf_ref_crt"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13P_CRF_ID,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp10_crf_ref_crt") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm152( )
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

   public String getPgmname( )
   {
      return "B402_WP10_CRF_REF_CRT" ;
   }

   public String getPgmdesc( )
   {
      return "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj" ;
   }

   public void wb150( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_152( true) ;
      }
      else
      {
         wb_table1_2_152( false) ;
      }
      return  ;
   }

   public void wb_table1_2_152e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_43_152( true) ;
      }
      else
      {
         wb_table2_43_152( false) ;
      }
      return  ;
   }

   public void wb_table2_43_152e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start152( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj", (short)(0)) ;
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
      strup150( ) ;
   }

   public void ws152( )
   {
      start152( ) ;
      evt152( ) ;
   }

   public void evt152( )
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
                        /* Execute user event: e11152 */
                        e11152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12152 */
                        e12152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13152 */
                        e13152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14152 */
                        e14152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_STUDY_ID.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15152 */
                        e15152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16152 */
                        e16152 ();
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

   public void we152( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm152( ) ;
         }
      }
   }

   public void pa152( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp10_crf_ref_crt")), "b402_wp10_crf_ref_crt") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp10_crf_ref_crt"))) ;
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
                     AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
                  }
               }
            }
         }
         cmbavD_study_id.setName( "vD_STUDY_ID" );
         cmbavD_study_id.setWebtags( "" );
         if ( cmbavD_study_id.getItemCount() > 0 )
         {
            AV8D_STUDY_ID = GXutil.lval( cmbavD_study_id.getValidValue(GXutil.trim( GXutil.str( AV8D_STUDY_ID, 10, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
         }
         cmbavD_crf_id.setName( "vD_CRF_ID" );
         cmbavD_crf_id.setWebtags( "" );
         if ( cmbavD_crf_id.getItemCount() > 0 )
         {
            AV7D_CRF_ID = (short)(GXutil.lval( cmbavD_crf_id.getValidValue(GXutil.trim( GXutil.str( AV7D_CRF_ID, 4, 0))))) ;
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
      rf152( ) ;
      /* End function Refresh */
   }

   public void rf152( )
   {
      /* Execute user event: e14152 */
      e14152 ();
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
         /* Execute user event: e16152 */
         e16152 ();
         wb150( ) ;
      }
   }

   public void strup150( )
   {
      /* Before Start, stand alone formulas. */
      AV37Pgmname = "B402_WP10_CRF_REF_CRT" ;
      AV34Pgmdesc = "ééå±ìoò^ÅiCRFéQè∆çÏê¨Åj" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e13152 */
      e13152 ();
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
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e13152 */
      e13152 ();
      if (returnInSub) return;
   }

   public void e13152( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      AV5C_GAMEN_TITLE = AV34Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_GAMEN_TITLE", AV5C_GAMEN_TITLE);
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
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_DOWNLOAD_FLG", GXutil.ltrim( GXutil.str( AV20W_DOWNLOAD_FLG, 4, 0)));
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV16W_A_LOGIN_SDT,AV6C_APP_ID,AV5C_GAMEN_TITLE,""});
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

   public void e14152( )
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

   public void e11152( )
   {
      /* 'BTN_REG' Routine */
      AV28W_RTN_CD = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_RTN_CD", GXutil.str( AV28W_RTN_CD, 1, 0));
      GXv_int1[0] = AV28W_RTN_CD ;
      GXv_char2[0] = AV29W_RTN_MSG ;
      new b402_pc20_crf_copy(remoteHandle, context).execute( AV15P_STUDY_ID, AV13P_CRF_ID, AV8D_STUDY_ID, AV7D_CRF_ID, GXv_int1, GXv_char2) ;
      b402_wp10_crf_ref_crt_impl.this.AV28W_RTN_CD = (byte)((byte)(GXv_int1[0])) ;
      b402_wp10_crf_ref_crt_impl.this.AV29W_RTN_MSG = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_STUDY_ID", GXutil.ltrim( GXutil.str( AV15P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_RTN_CD", GXutil.str( AV28W_RTN_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_RTN_MSG", AV29W_RTN_MSG);
      if ( AV28W_RTN_CD != 0 )
      {
         GXt_char3 = AV17W_A821_JS ;
         GXv_char2[0] = GXt_char3 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV29W_RTN_MSG, "", "", "", GXv_char2) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char3 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_RTN_MSG", AV29W_RTN_MSG);
         AV17W_A821_JS = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_A821_JS", AV17W_A821_JS);
      }
      else
      {
         GXt_char3 = AV25W_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char2) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char3 = GXv_char2[0] ;
         AV25W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         GXt_char3 = AV17W_A821_JS ;
         GXv_char2[0] = GXt_char3 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV25W_MSG, "", "BTN_CAN", "", GXv_char2) ;
         b402_wp10_crf_ref_crt_impl.this.GXt_char3 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         AV17W_A821_JS = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_A821_JS", AV17W_A821_JS);
      }
      AV31W_STUDY_ID = AV8D_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31W_STUDY_ID", GXutil.ltrim( GXutil.str( AV31W_STUDY_ID, 10, 0)));
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV8D_STUDY_ID = AV31W_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STUDY_ID", GXutil.ltrim( GXutil.str( AV8D_STUDY_ID, 10, 0)));
   }

   public void e12152( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e15152( )
   {
      /* D_study_id_Click Routine */
      AV31W_STUDY_ID = AV8D_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31W_STUDY_ID", GXutil.ltrim( GXutil.str( AV31W_STUDY_ID, 10, 0)));
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
      /* Using cursor H00152 */
      pr_default.execute(0, new Object[] {new Long(AV8D_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A643TBM31_STATUS = H00152_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = H00152_n643TBM31_STATUS[0] ;
         A397TBM31_DEL_FLG = H00152_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H00152_n397TBM31_DEL_FLG[0] ;
         A68TBM31_STUDY_ID = H00152_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A393TBM31_CRF_NM = H00152_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = H00152_n393TBM31_CRF_NM[0] ;
         A69TBM31_CRF_ID = H00152_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         if ( ( A69TBM31_CRF_ID != AV13P_CRF_ID ) || ( A68TBM31_STUDY_ID != AV15P_STUDY_ID ) )
         {
            cmbavD_crf_id.addItem(GXutil.trim( GXutil.str( A69TBM31_CRF_ID, 4, 0)), A393TBM31_CRF_NM, (short)(0));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S172( )
   {
      /* 'SUB_CREATE_COMBO_BOX_STUDY' Routine */
      /* Using cursor H00153 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A607TBM21_STATUS = H00153_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H00153_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = H00153_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H00153_n369TBM21_DEL_FLG[0] ;
         A367TBM21_STUDY_NM = H00153_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H00153_n367TBM21_STUDY_NM[0] ;
         A63TBM21_STUDY_ID = H00153_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         cmbavD_study_id.addItem(GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)), A367TBM21_STUDY_NM, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV16W_A_LOGIN_SDT;
      GXv_char2[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV16W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_wp10_crf_ref_crt_impl.this.AV21W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRCD", AV21W_ERRCD);
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
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
      AV12H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_SRCH_FLG", AV12H_SRCH_FLG);
      AV17W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17W_A821_JS", AV17W_A821_JS);
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
      GXv_char2[0] = AV11H_KNGN_FLG ;
      GXv_char5[0] = AV21W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char2, GXv_char5) ;
      b402_wp10_crf_ref_crt_impl.this.AV11H_KNGN_FLG = GXv_char2[0] ;
      b402_wp10_crf_ref_crt_impl.this.AV21W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRCD", AV21W_ERRCD);
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp10_crf_ref_crt");
   }

   protected void nextLoad( )
   {
   }

   protected void e16152( )
   {
      /* Load Routine */
   }

   public void wb_table2_43_152( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_pdf_Internalname, "TXT_PDF", "", "", lblTxt_pdf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_ITEM_KBN, (byte)(2), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_ITEM_KBN), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_item_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV12H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV12H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_43_152e( true) ;
      }
      else
      {
         wb_table2_43_152e( false) ;
      }
   }

   public void wb_table1_2_152( boolean wbgen )
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
         wb_table3_6_152( true) ;
      }
      else
      {
         wb_table3_6_152( false) ;
      }
      return  ;
   }

   public void wb_table3_6_152e( boolean wbgen )
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
         wb_table1_2_152e( true) ;
      }
      else
      {
         wb_table1_2_152e( false) ;
      }
   }

   public void wb_table3_6_152( boolean wbgen )
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
         wb_table4_12_152( true) ;
      }
      else
      {
         wb_table4_12_152( false) ;
      }
      return  ;
   }

   public void wb_table4_12_152e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_20_152( true) ;
      }
      else
      {
         wb_table5_20_152( false) ;
      }
      return  ;
   }

   public void wb_table5_20_152e( boolean wbgen )
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
         wb_table3_6_152e( true) ;
      }
      else
      {
         wb_table3_6_152e( false) ;
      }
   }

   public void wb_table5_20_152( boolean wbgen )
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
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table6_26_152( true) ;
      }
      else
      {
         wb_table6_26_152( false) ;
      }
      return  ;
   }

   public void wb_table6_26_152e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_152e( true) ;
      }
      else
      {
         wb_table5_20_152e( false) ;
      }
   }

   public void wb_table6_26_152( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, "ééå±", "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.trim( GXutil.str( AV8D_STUDY_ID, 10, 0)), 1, cmbavD_study_id.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_STUDY_ID.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 10, "chr", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "", true, "HLP_B402_WP10_CRF_REF_CRT.htm");
         cmbavD_study_id.setValue( GXutil.trim( GXutil.str( AV8D_STUDY_ID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, "CRF", "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_crf_id, cmbavD_crf_id.getInternalname(), GXutil.trim( GXutil.str( AV7D_CRF_ID, 4, 0)), 1, cmbavD_crf_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, 1, 0, (short)(0), 4, "chr", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", true, "HLP_B402_WP10_CRF_REF_CRT.htm");
         cmbavD_crf_id.setValue( GXutil.trim( GXutil.str( AV7D_CRF_ID, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_crf_id.getInternalname(), "Values", cmbavD_crf_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_152e( true) ;
      }
      else
      {
         wb_table6_26_152e( false) ;
      }
   }

   public void wb_table4_12_152( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "çÏê¨ÅiF3Åj", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "ñﬂÇÈÅiF11Åj", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP10_CRF_REF_CRT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_152e( true) ;
      }
      else
      {
         wb_table4_12_152e( false) ;
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
      httpContext.setDefaultTheme("Style2");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa152( ) ;
      ws152( ) ;
      we152( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317173664");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp10_crf_ref_crt.js", "?20177317173664");
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
      AV37Pgmname = "" ;
      AV34Pgmdesc = "" ;
      AV9H_INIT_FLG = "" ;
      AV12H_SRCH_FLG = "" ;
      AV11H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV16W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_int1 = new short [1] ;
      AV29W_RTN_MSG = "" ;
      AV17W_A821_JS = "" ;
      AV25W_MSG = "" ;
      GXt_char3 = "" ;
      scmdbuf = "" ;
      H00152_A643TBM31_STATUS = new String[] {""} ;
      H00152_n643TBM31_STATUS = new boolean[] {false} ;
      H00152_A397TBM31_DEL_FLG = new String[] {""} ;
      H00152_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H00152_A68TBM31_STUDY_ID = new long[1] ;
      H00152_A393TBM31_CRF_NM = new String[] {""} ;
      H00152_n393TBM31_CRF_NM = new boolean[] {false} ;
      H00152_A69TBM31_CRF_ID = new short[1] ;
      A643TBM31_STATUS = "" ;
      A397TBM31_DEL_FLG = "" ;
      A393TBM31_CRF_NM = "" ;
      H00153_A607TBM21_STATUS = new String[] {""} ;
      H00153_n607TBM21_STATUS = new boolean[] {false} ;
      H00153_A369TBM21_DEL_FLG = new String[] {""} ;
      H00153_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H00153_A367TBM21_STUDY_NM = new String[] {""} ;
      H00153_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H00153_A63TBM21_STUDY_ID = new long[1] ;
      A607TBM21_STATUS = "" ;
      A369TBM21_DEL_FLG = "" ;
      A367TBM21_STUDY_NM = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXv_char5 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_pdf_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp10_crf_ref_crt__default(),
         new Object[] {
             new Object[] {
            H00152_A643TBM31_STATUS, H00152_n643TBM31_STATUS, H00152_A397TBM31_DEL_FLG, H00152_n397TBM31_DEL_FLG, H00152_A68TBM31_STUDY_ID, H00152_A393TBM31_CRF_NM, H00152_n393TBM31_CRF_NM, H00152_A69TBM31_CRF_ID
            }
            , new Object[] {
            H00153_A607TBM21_STATUS, H00153_n607TBM21_STATUS, H00153_A369TBM21_DEL_FLG, H00153_n369TBM21_DEL_FLG, H00153_A367TBM21_STUDY_NM, H00153_n367TBM21_STUDY_NM, H00153_A63TBM21_STUDY_ID
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
   private short GXv_int1[] ;
   private short A69TBM31_CRF_ID ;
   private int tblTbl_hidden_Visible ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long wcpOAV15P_STUDY_ID ;
   private long AV15P_STUDY_ID ;
   private long AV8D_STUDY_ID ;
   private long AV31W_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
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
   private String AV37Pgmname ;
   private String AV34Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_item_kbn_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String sStyleString ;
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
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable5_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n643TBM31_STATUS ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n607TBM21_STATUS ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private String AV9H_INIT_FLG ;
   private String AV12H_SRCH_FLG ;
   private String AV11H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV29W_RTN_MSG ;
   private String AV17W_A821_JS ;
   private String AV25W_MSG ;
   private String A643TBM31_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String A393TBM31_CRF_NM ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String AV21W_ERRCD ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_study_id ;
   private HTMLChoice cmbavD_crf_id ;
   private IDataStoreProvider pr_default ;
   private String[] H00152_A643TBM31_STATUS ;
   private boolean[] H00152_n643TBM31_STATUS ;
   private String[] H00152_A397TBM31_DEL_FLG ;
   private boolean[] H00152_n397TBM31_DEL_FLG ;
   private long[] H00152_A68TBM31_STUDY_ID ;
   private String[] H00152_A393TBM31_CRF_NM ;
   private boolean[] H00152_n393TBM31_CRF_NM ;
   private short[] H00152_A69TBM31_CRF_ID ;
   private String[] H00153_A607TBM21_STATUS ;
   private boolean[] H00153_n607TBM21_STATUS ;
   private String[] H00153_A369TBM21_DEL_FLG ;
   private boolean[] H00153_n369TBM21_DEL_FLG ;
   private String[] H00153_A367TBM21_STUDY_NM ;
   private boolean[] H00153_n367TBM21_STUDY_NM ;
   private long[] H00153_A63TBM21_STUDY_ID ;
   private SdtA_LOGIN_SDT AV16W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class b402_wp10_crf_ref_crt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00152", "SELECT `TBM31_STATUS`, `TBM31_DEL_FLG`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_STATUS` <> '9') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00153", "SELECT `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STATUS` <> '9') AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
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
               return;
      }
   }

}

