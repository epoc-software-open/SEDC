/*
               File: b402_wp15_study_cdisc_item_reg_impl
        Description: 試験登録（ドメイン変数編集）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:42.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp15_study_cdisc_item_reg_impl extends GXWebPanel
{
   public b402_wp15_study_cdisc_item_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp15_study_cdisc_item_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp15_study_cdisc_item_reg_impl.class ));
   }

   public b402_wp15_study_cdisc_item_reg_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtltbm43_dom_cd = new HTMLChoice();
      radavCtltbm43_sdtm_flg = new HTMLChoice();
      radavCtltbm43_cdash_flg = new HTMLChoice();
      radavCtltbm43_required_flg = new HTMLChoice();
      radavCtltbm43_del_flg = new HTMLChoice();
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
            AV18P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV16P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_CD", AV16P_DOM_CD);
               AV17P_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17P_DOM_VAR_NM", AV17P_DOM_VAR_NM);
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
         pa202( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws202( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we202( ) ;
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
      httpContext.writeValue( "") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317204226");
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
      httpContext.writeText( " "+"caption"+" "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp15_study_cdisc_item_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17P_DOM_VAR_NM)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm202( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_study_cdisc_item", AV5BC_STUDY_CDISC_ITEM);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_study_cdisc_item", AV5BC_STUDY_CDISC_ITEM);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV18P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV16P_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_VAR_NM", GXutil.rtrim( AV17P_DOM_VAR_NM));
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
      return "B402_WP15_STUDY_CDISC_ITEM_REG" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（ドメイン変数編集）" ;
   }

   public void wb200( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_202( true) ;
      }
      else
      {
         wb_table1_2_202( false) ;
      }
      return  ;
   }

   public void wb_table1_2_202e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start202( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（ドメイン変数編集）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0140") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0140", "");
         }
      }
      wbErr = false ;
      strup200( ) ;
   }

   public void ws202( )
   {
      start202( ) ;
      evt202( ) ;
   }

   public void evt202( )
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
                        /* Execute user event: e11202 */
                        e11202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12202 */
                        e12202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13202 */
                        e13202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14202 */
                        e14202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15202 */
                        e15202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16202 */
                        e16202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17202 */
                        e17202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e18202 */
                        e18202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e19202 */
                        e19202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e20202 */
                        e20202 ();
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
                  else if ( nCmpId == 140 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0140") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0140", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we202( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm202( ) ;
         }
      }
   }

   public void pa202( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp15_study_cdisc_item_reg")), "b402_wp15_study_cdisc_item_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp15_study_cdisc_item_reg"))) ;
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
                  AV18P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV16P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_CD", AV16P_DOM_CD);
                     AV17P_DOM_VAR_NM = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17P_DOM_VAR_NM", AV17P_DOM_VAR_NM);
                  }
               }
            }
         }
         cmbavCtltbm43_dom_cd.setName( "CTLTBM43_DOM_CD" );
         cmbavCtltbm43_dom_cd.setWebtags( "" );
         if ( cmbavCtltbm43_dom_cd.getItemCount() > 0 )
         {
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( cmbavCtltbm43_dom_cd.getValidValue(AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd()) );
         }
         radavCtltbm43_sdtm_flg.setName( "CTLTBM43_SDTM_FLG" );
         radavCtltbm43_sdtm_flg.setWebtags( "" );
         radavCtltbm43_sdtm_flg.addItem("1", "ON", (short)(0));
         radavCtltbm43_sdtm_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm43_cdash_flg.setName( "CTLTBM43_CDASH_FLG" );
         radavCtltbm43_cdash_flg.setWebtags( "" );
         radavCtltbm43_cdash_flg.addItem("1", "ON", (short)(0));
         radavCtltbm43_cdash_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm43_required_flg.setName( "CTLTBM43_REQUIRED_FLG" );
         radavCtltbm43_required_flg.setWebtags( "" );
         radavCtltbm43_required_flg.addItem("1", "ON", (short)(0));
         radavCtltbm43_required_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm43_del_flg.setName( "CTLTBM43_DEL_FLG" );
         radavCtltbm43_del_flg.setWebtags( "" );
         radavCtltbm43_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltbm43_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf202( ) ;
      /* End function Refresh */
   }

   public void rf202( )
   {
      /* Execute user event: e16202 */
      e16202 ();
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
         /* Execute user event: e20202 */
         e20202 ();
         wb200( ) ;
      }
   }

   public void strup200( )
   {
      /* Before Start, stand alone formulas. */
      AV50Pgmname = "B402_WP15_STUDY_CDISC_ITEM_REG" ;
      AV49Pgmdesc = "試験登録（ドメイン変数編集）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm43_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm43_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm43_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm43_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e15202 */
      e15202 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_study_cdisc_item"), AV5BC_STUDY_CDISC_ITEM);
         /* Read variables values. */
         cmbavCtltbm43_dom_cd.setValue( httpContext.cgiGet( cmbavCtltbm43_dom_cd.getInternalname()) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( httpContext.cgiGet( cmbavCtltbm43_dom_cd.getInternalname()) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm( httpContext.cgiGet( edtavCtltbm43_dom_var_nm_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc( httpContext.cgiGet( edtavCtltbm43_var_desc_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( httpContext.cgiGet( radavCtltbm43_sdtm_flg.getInternalname()) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( httpContext.cgiGet( radavCtltbm43_cdash_flg.getInternalname()) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div( httpContext.cgiGet( edtavCtltbm43_input_type_div_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( httpContext.cgiGet( radavCtltbm43_required_flg.getInternalname()) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm( httpContext.cgiGet( edtavCtltbm43_sas_field_nm_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type( httpContext.cgiGet( edtavCtltbm43_odm_data_type_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note( httpContext.cgiGet( edtavCtltbm43_note_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm43_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm43_order_Internalname), ".", ",") > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM43_ORDER");
            GX_FocusControl = edtavCtltbm43_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( 0 );
         }
         else
         {
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm43_order_Internalname), ".", ",")) );
         }
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version( httpContext.cgiGet( edtavCtltbm43_version_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( httpContext.cgiGet( radavCtltbm43_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm43_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM43_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm43_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm43_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm43_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM43_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm43_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm43_upd_datetime_Internalname)) );
         }
         AV10D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         AV12D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_UPD_USER_NM", AV12D_UPD_USER_NM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( httpContext.cgiGet( edtavCtltbm43_crt_prog_nm_Internalname) );
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( httpContext.cgiGet( edtavCtltbm43_upd_prog_nm_Internalname) );
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV15H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         /* Read saved values. */
         AV18P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV16P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         AV17P_DOM_VAR_NM = httpContext.cgiGet( "vP_DOM_VAR_NM") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0140") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0140", "");
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
      /* Execute user event: e15202 */
      e15202 ();
      if (returnInSub) return;
   }

   public void e15202( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      AV8C_GAMEN_TITLE = AV49Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV13H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV22W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0140",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e16202( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV13H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e11202( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "0") == 0 )
         {
            AV28W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV28W_ERRFLG )
            {
               GXt_char1 = AV29W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV29W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               GXt_char1 = AV26W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV29W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               AV26W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_A821_JS", AV26W_A821_JS);
            }
         }
      }
   }

   public void e17202( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id( AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( AV50Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( AV50Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.Save();
      if ( AV5BC_STUDY_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp15_study_cdisc_item_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17P_DOM_VAR_NM)) ;
         httpContext.wjLoc = formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV29W_MSG);
      }
   }

   public void e12202( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
         {
            AV28W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV28W_ERRFLG )
            {
               GXt_char1 = AV29W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV29W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               GXt_char1 = AV26W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV29W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               AV26W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_A821_JS", AV26W_A821_JS);
            }
         }
      }
   }

   public void e18202( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( AV50Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
      AV5BC_STUDY_CDISC_ITEM.Save();
      if ( AV5BC_STUDY_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp14_study_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_CD)) ;
         httpContext.wjLoc = formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV29W_MSG);
      }
   }

   public void e13202( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
         {
            AV28W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            if ( ! AV28W_ERRFLG )
            {
               GXt_char1 = AV29W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV29W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               GXt_char1 = AV26W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV29W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               AV26W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_A821_JS", AV26W_A821_JS);
            }
         }
      }
   }

   public void e19202( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      AV5BC_STUDY_CDISC_ITEM.Delete();
      if ( AV5BC_STUDY_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp14_study_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_CD)) ;
         httpContext.wjLoc = formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV29W_MSG);
      }
   }

   public void e14202( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp14_study_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_CD)) ;
      httpContext.wjLoc = formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavCtltbm43_dom_cd.removeAllItems();
      cmbavCtltbm43_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H00202 */
      pr_default.execute(0, new Object[] {new Long(AV18P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A203TBM42_STUDY_ID = H00202_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A893TBM42_DEL_FLG = H00202_A893TBM42_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
         n893TBM42_DEL_FLG = H00202_n893TBM42_DEL_FLG[0] ;
         A906TBM42_DOM_JNM = H00202_A906TBM42_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
         n906TBM42_DOM_JNM = H00202_n906TBM42_DOM_JNM[0] ;
         A204TBM42_DOM_CD = H00202_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
         A909TBM42_ORDER = H00202_A909TBM42_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
         n909TBM42_ORDER = H00202_n909TBM42_ORDER[0] ;
         cmbavCtltbm43_dom_cd.addItem(A204TBM42_DOM_CD, A204TBM42_DOM_CD+"："+A906TBM42_DOM_JNM, (short)(0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd())==0) && ! (GXutil.strcmp("", AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm())==0) )
      {
         AV52GXLvl324 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXLvl324", GXutil.str( AV52GXLvl324, 1, 0));
         /* Using cursor H00203 */
         pr_default.execute(1, new Object[] {new Long(AV18P_STUDY_ID), AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd(), AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm()});
         if ( Gx_err != 0 )
         {
            AV52GXLvl324 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52GXLvl324", GXutil.str( AV52GXLvl324, 1, 0));
         }
         while ( (pr_default.getStatus(1) != 101) )
         {
            A202TBM43_DOM_VAR_NM = H00203_A202TBM43_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A202TBM43_DOM_VAR_NM", A202TBM43_DOM_VAR_NM);
            A201TBM43_DOM_CD = H00203_A201TBM43_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A201TBM43_DOM_CD", A201TBM43_DOM_CD);
            A200TBM43_STUDY_ID = H00203_A200TBM43_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A200TBM43_STUDY_ID, 10, 0)));
            A926TBM43_UPD_CNT = H00203_A926TBM43_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A926TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A926TBM43_UPD_CNT, 10, 0)));
            n926TBM43_UPD_CNT = H00203_n926TBM43_UPD_CNT[0] ;
            AV52GXLvl324 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52GXLvl324", GXutil.str( AV52GXLvl324, 1, 0));
            if ( (GXutil.strcmp("", AV17P_DOM_VAR_NM)==0) )
            {
               GXt_char1 = AV29W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV29W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               httpContext.GX_msglist.addItem(AV29W_MSG);
               cmbavCtltbm43_dom_cd.setIBackground( UIFactory.getColor( 255, 192, 203) );
               httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm43_dom_cd.getIBackground(), 9, 0)));
               edtavCtltbm43_dom_var_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Backcolor, 9, 0)));
               if ( ! AV28W_ERRFLG )
               {
                  GX_FocusControl = cmbavCtltbm43_dom_cd.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV28W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            }
            else
            {
               if ( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt() != A926TBM43_UPD_CNT )
               {
                  GXt_char1 = AV29W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV29W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
                  httpContext.GX_msglist.addItem(AV29W_MSG);
                  AV28W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV52GXLvl324 == 0 )
         {
            if ( ! (GXutil.strcmp("", AV17P_DOM_VAR_NM)==0) )
            {
               GXt_char1 = AV29W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV29W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
               httpContext.GX_msglist.addItem(AV29W_MSG);
               edtavCtltbm43_dom_var_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Backcolor, 9, 0)));
               if ( ! AV28W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltbm43_dom_var_nm_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV28W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            }
         }
      }
      if ( ! AV28W_ERRFLG )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] = AV20W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] = AV23W_A_RESULT_MSG_SDT ;
         new b402_pc28_study_cdisc_item_chk(remoteHandle, context).execute( AV5BC_STUDY_CDISC_ITEM, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4) ;
         AV20W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] ;
         AV23W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] ;
         if ( AV23W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            AV53GXV18 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53GXV18", GXutil.ltrim( GXutil.str( AV53GXV18, 8, 0)));
            while ( AV53GXV18 <= AV23W_A_RESULT_MSG_SDT.size() )
            {
               AV24W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV23W_A_RESULT_MSG_SDT.elementAt(-1+AV53GXV18));
               httpContext.GX_msglist.addItem(AV24W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV53GXV18 = (int)(AV53GXV18+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53GXV18", GXutil.ltrim( GXutil.str( AV53GXV18, 8, 0)));
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
      cmbavCtltbm43_dom_cd.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm43_dom_cd.getIBackground(), 9, 0)));
      edtavCtltbm43_dom_var_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Backcolor, 9, 0)));
      edtavCtltbm43_var_desc_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_var_desc_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_var_desc_Backcolor, 9, 0)));
      edtavCtltbm43_input_type_div_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_input_type_div_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_input_type_div_Backcolor, 9, 0)));
      edtavCtltbm43_sas_field_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_sas_field_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_sas_field_nm_Backcolor, 9, 0)));
      edtavCtltbm43_odm_data_type_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_odm_data_type_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_odm_data_type_Backcolor, 9, 0)));
      edtavCtltbm43_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_note_Backcolor, 9, 0)));
      edtavCtltbm43_order_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_order_Backcolor, 9, 0)));
      edtavCtltbm43_version_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_version_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV54GXV19 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GXV19", GXutil.ltrim( GXutil.str( AV54GXV19, 8, 0)));
      while ( AV54GXV19 <= AV20W_A_CHK_RESULT_SDT.size() )
      {
         AV21W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV20W_A_CHK_RESULT_SDT.elementAt(-1+AV54GXV19));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV54GXV19 = (int)(AV54GXV19+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54GXV19", GXutil.ltrim( GXutil.str( AV54GXV19, 8, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_DOM_CD") == 0 )
      {
         cmbavCtltbm43_dom_cd.setIBackground( UIFactory.getColor( 255, 192, 203) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm43_dom_cd.getIBackground(), 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = cmbavCtltbm43_dom_cd.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_DOM_VAR_NM") == 0 )
      {
         edtavCtltbm43_dom_var_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_dom_var_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_VAR_DESC") == 0 )
      {
         edtavCtltbm43_var_desc_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_var_desc_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_var_desc_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_var_desc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_INPUT_TYPE_DIV") == 0 )
      {
         edtavCtltbm43_input_type_div_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_input_type_div_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_input_type_div_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_input_type_div_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_SAS_FIELD_NM") == 0 )
      {
         edtavCtltbm43_sas_field_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_sas_field_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_sas_field_nm_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_sas_field_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_ODM_DATA_TYPE") == 0 )
      {
         edtavCtltbm43_odm_data_type_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_odm_data_type_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_odm_data_type_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_odm_data_type_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_NOTE") == 0 )
      {
         edtavCtltbm43_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_note_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_ORDER") == 0 )
      {
         edtavCtltbm43_order_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_order_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM43_VERSION") == 0 )
      {
         edtavCtltbm43_version_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm43_version_Backcolor, 9, 0)));
         if ( AV21W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm43_version_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00204 */
      pr_default.execute(2, new Object[] {new Long(AV18P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A63TBM21_STUDY_ID = H00204_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H00204_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H00204_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV17P_DOM_VAR_NM)==0) )
      {
         AV15H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV5BC_STUDY_CDISC_ITEM.Load(AV18P_STUDY_ID, AV16P_DOM_CD, AV17P_DOM_VAR_NM);
         if ( AV5BC_STUDY_CDISC_ITEM.Fail() )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
         else
         {
            AV56GXLvl512 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl512", GXutil.str( AV56GXLvl512, 1, 0));
            /* Using cursor H00205 */
            pr_default.execute(3, new Object[] {AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV56GXLvl512 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl512", GXutil.str( AV56GXLvl512, 1, 0));
            }
            while ( (pr_default.getStatus(3) != 101) )
            {
               A55TAM07_USER_ID = H00205_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H00205_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H00205_n205TAM07_USER_NM[0] ;
               AV56GXLvl512 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl512", GXutil.str( AV56GXLvl512, 1, 0));
               GXt_char1 = AV10D_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV10D_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV56GXLvl512 == 0 )
            {
               AV10D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id(), AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id()) == 0 )
            {
               AV12D_UPD_USER_NM = AV10D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12D_UPD_USER_NM", AV12D_UPD_USER_NM);
            }
            else
            {
               AV57GXLvl527 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57GXLvl527", GXutil.str( AV57GXLvl527, 1, 0));
               /* Using cursor H00206 */
               pr_default.execute(4, new Object[] {AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV57GXLvl527 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV57GXLvl527", GXutil.str( AV57GXLvl527, 1, 0));
               }
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A55TAM07_USER_ID = H00206_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H00206_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H00206_n205TAM07_USER_NM[0] ;
                  AV57GXLvl527 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV57GXLvl527", GXutil.str( AV57GXLvl527, 1, 0));
                  GXt_char1 = AV12D_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV12D_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_UPD_USER_NM", AV12D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               if ( AV57GXLvl527 == 0 )
               {
                  AV12D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_UPD_USER_NM", AV12D_UPD_USER_NM);
               }
            }
         }
         tblTbl_ins_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         cmbavCtltbm43_dom_cd.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltbm43_dom_cd.getEnabled(), 5, 0)));
         edtavCtltbm43_dom_var_nm_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Enabled, 5, 0)));
         edtavCtltbm43_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm43_crt_datetime_Visible, 5, 0)));
         edtavCtltbm43_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm43_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm43_var_desc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV15H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV5BC_STUDY_CDISC_ITEM = (SdtTBM43_STUDY_CDISC_ITEM)new SdtTBM43_STUDY_CDISC_ITEM( remoteHandle, context);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id( AV18P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( AV16P_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         AV5BC_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_STUDY_CDISC_ITEM", AV5BC_STUDY_CDISC_ITEM);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         cmbavCtltbm43_dom_cd.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltbm43_dom_cd.getEnabled(), 5, 0)));
         edtavCtltbm43_dom_var_nm_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_dom_var_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm43_dom_var_nm_Enabled, 5, 0)));
         edtavCtltbm43_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm43_crt_datetime_Visible, 5, 0)));
         edtavCtltbm43_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm43_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm43_upd_datetime_Visible, 5, 0)));
         if ( (GXutil.strcmp("", AV16P_DOM_CD)==0) )
         {
            GX_FocusControl = cmbavCtltbm43_dom_cd.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GX_FocusControl = edtavCtltbm43_dom_var_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_STUDY_CDISC_ITEM.GetMessages() ;
      AV58GXV20 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GXV20", GXutil.ltrim( GXutil.str( AV58GXV20, 8, 0)));
      while ( AV58GXV20 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV58GXV20));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b402_wp15_study_cdisc_item_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         }
         else
         {
            AV29W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         }
         AV58GXV20 = (int)(AV58GXV20+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58GXV20", GXutil.ltrim( GXutil.str( AV58GXV20, 8, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV22W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b402_wp15_study_cdisc_item_reg_impl.this.AV27W_ERRCD = GXv_char2[0] ;
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
      AV26W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_A821_JS", AV26W_A821_JS);
      AV25W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_A819_JS", AV25W_A819_JS);
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
      if ( ! (GXutil.strcmp("", AV26W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV26W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV25W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV25W_A819_JS ;
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
      GXv_char2[0] = AV14H_KNGN_FLG ;
      GXv_char6[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char2, GXv_char6) ;
      b402_wp15_study_cdisc_item_reg_impl.this.AV14H_KNGN_FLG = GXv_char2[0] ;
      b402_wp15_study_cdisc_item_reg_impl.this.AV27W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp15_study_cdisc_item_reg");
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
      if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
      {
         GXt_boolean7 = false ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV14H_KNGN_FLG, "", GXv_boolean8) ;
         b402_wp15_study_cdisc_item_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean7 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
         {
            lblTxt_btn_upd2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
         }
         GXt_boolean7 = false ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV14H_KNGN_FLG, "", GXv_boolean8) ;
         b402_wp15_study_cdisc_item_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean7 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
         if ( ( lblTxt_btn_dlt_Visible == ( 0 )) )
         {
            lblTxt_btn_dlt2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt2_Visible, 5, 0)));
         }
      }
      else
      {
         GXt_boolean7 = false ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV14H_KNGN_FLG, "", GXv_boolean8) ;
         b402_wp15_study_cdisc_item_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean7 ? 1 : 0) ;
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

   protected void e20202( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_202( boolean wbgen )
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
         wb_table2_6_202( true) ;
      }
      else
      {
         wb_table2_6_202( false) ;
      }
      return  ;
   }

   public void wb_table2_6_202e( boolean wbgen )
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
         wb_table1_2_202e( true) ;
      }
      else
      {
         wb_table1_2_202e( false) ;
      }
   }

   public void wb_table2_6_202( boolean wbgen )
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
         wb_table3_12_202( true) ;
      }
      else
      {
         wb_table3_12_202( false) ;
      }
      return  ;
   }

   public void wb_table3_12_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_20_202( true) ;
      }
      else
      {
         wb_table4_20_202( false) ;
      }
      return  ;
   }

   public void wb_table4_20_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_34_202( true) ;
      }
      else
      {
         wb_table5_34_202( false) ;
      }
      return  ;
   }

   public void wb_table5_34_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_131_202( true) ;
      }
      else
      {
         wb_table6_131_202( false) ;
      }
      return  ;
   }

   public void wb_table6_131_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0140"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0140"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0140"+"");
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
         wb_table2_6_202e( true) ;
      }
      else
      {
         wb_table2_6_202e( false) ;
      }
   }

   public void wb_table6_131_202( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV15H_MODE), GXutil.rtrim( localUtil.format( AV15H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_131_202e( true) ;
      }
      else
      {
         wb_table6_131_202e( false) ;
      }
   }

   public void wb_table5_34_202( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:40px\">") ;
         wb_table7_37_202( true) ;
      }
      else
      {
         wb_table7_37_202( false) ;
      }
      return  ;
   }

   public void wb_table7_37_202e( boolean wbgen )
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
         wb_table8_48_202( true) ;
      }
      else
      {
         wb_table8_48_202( false) ;
      }
      return  ;
   }

   public void wb_table8_48_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_34_202e( true) ;
      }
      else
      {
         wb_table5_34_202e( false) ;
      }
   }

   public void wb_table8_48_202( boolean wbgen )
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
         httpContext.writeText( "▼メイン情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:130px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"width:275px\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtltbm43_dom_cd, cmbavCtltbm43_dom_cd.getInternalname(), GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd()), 1, cmbavCtltbm43_dom_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavCtltbm43_dom_cd.getEnabled(), 1, (short)(0), 2, "chr", 0, "", "background:"+WebUtils.getHTMLColor( cmbavCtltbm43_dom_cd.getIBackground())+";", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(55);\"", "", true, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         cmbavCtltbm43_dom_cd.setValue( GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm43_dom_cd.getInternalname(), "Values", cmbavCtltbm43_dom_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "&nbsp;ドメイン変数名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_dom_var_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_dom_var_nm_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_dom_var_nm_Backcolor)+";", "", "", 1, edtavCtltbm43_dom_var_nm_Enabled, 1, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数説明") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_var_desc_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_var_desc_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_var_desc_Backcolor)+";", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "SDTM定義フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm43_sdtm_flg, radavCtltbm43_sdtm_flg.getInternalname(), GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm43_sdtm_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "CDASH定義フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm43_cdash_flg, radavCtltbm43_cdash_flg.getInternalname(), GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm43_cdash_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "入力値型区分") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_75_202( true) ;
      }
      else
      {
         wb_table9_75_202( false) ;
      }
      return  ;
   }

   public void wb_table9_75_202e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "必須入力フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm43_required_flg, radavCtltbm43_required_flg.getInternalname(), GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm43_required_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "SASフィールド名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_sas_field_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_sas_field_nm_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_sas_field_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ODMデータタイプ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_odm_data_type_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_odm_data_type_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_odm_data_type_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "備考") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm43_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm43_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm43_note_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(95);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "&nbsp;表示順") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order(), (byte)(5), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_order_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_order_Backcolor)+";", "", "", 1, 1, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:120px\">") ;
         httpContext.writeText( "Version") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_version_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_version_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_version_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm43_del_flg, radavCtltbm43_del_flg.getInternalname(), GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm43_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(107);\"", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\"  style=\"height:21px\">") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm43_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_crt_datetime_Internalname, localUtil.format(AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_crt_datetime_Jsonclick, 0, "Attribute", "", "", "", edtavCtltbm43_crt_datetime_Visible, edtavCtltbm43_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm43_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm43_crt_datetime_Visible==0)||(edtavCtltbm43_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm43_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_upd_datetime_Internalname, localUtil.format(AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_upd_datetime_Jsonclick, 0, "Attribute", "", "", "", edtavCtltbm43_upd_datetime_Visible, edtavCtltbm43_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm43_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm43_upd_datetime_Visible==0)||(edtavCtltbm43_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV10D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV12D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV12D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_crt_prog_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm43_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_upd_prog_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtltbm43_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_48_202e( true) ;
      }
      else
      {
         wb_table8_48_202e( false) ;
      }
   }

   public void wb_table9_75_202( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:32px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm43_input_type_div_Internalname, GXutil.rtrim( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div()), GXutil.rtrim( localUtil.format( AV5BC_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm43_input_type_div_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm43_input_type_div_Backcolor)+";", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "（0:文字列型 1:数値型）", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_75_202e( true) ;
      }
      else
      {
         wb_table9_75_202e( false) ;
      }
   }

   public void wb_table7_37_202( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:600px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_37_202e( true) ;
      }
      else
      {
         wb_table7_37_202e( false) ;
      }
   }

   public void wb_table4_20_202( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt2_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_dlt2_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_202e( true) ;
      }
      else
      {
         wb_table4_20_202e( false) ;
      }
   }

   public void wb_table3_12_202( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "登録（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "戻る（F11）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP15_STUDY_CDISC_ITEM_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_202e( true) ;
      }
      else
      {
         wb_table3_12_202e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV18P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      AV16P_DOM_CD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_CD", AV16P_DOM_CD);
      AV17P_DOM_VAR_NM = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_DOM_VAR_NM", AV17P_DOM_VAR_NM);
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
      pa202( ) ;
      ws202( ) ;
      we202( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731720492");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp15_study_cdisc_item_reg.js", "?2017731720492");
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
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      tblTable1_Internalname = "TABLE1" ;
      imgImage5_Internalname = "IMAGE5" ;
      cmbavCtltbm43_dom_cd.setInternalname( "CTLTBM43_DOM_CD" );
      imgImage3_Internalname = "IMAGE3" ;
      edtavCtltbm43_dom_var_nm_Internalname = "CTLTBM43_DOM_VAR_NM" ;
      edtavCtltbm43_var_desc_Internalname = "CTLTBM43_VAR_DESC" ;
      radavCtltbm43_sdtm_flg.setInternalname( "CTLTBM43_SDTM_FLG" );
      radavCtltbm43_cdash_flg.setInternalname( "CTLTBM43_CDASH_FLG" );
      edtavCtltbm43_input_type_div_Internalname = "CTLTBM43_INPUT_TYPE_DIV" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable6_Internalname = "TABLE6" ;
      radavCtltbm43_required_flg.setInternalname( "CTLTBM43_REQUIRED_FLG" );
      edtavCtltbm43_sas_field_nm_Internalname = "CTLTBM43_SAS_FIELD_NM" ;
      edtavCtltbm43_odm_data_type_Internalname = "CTLTBM43_ODM_DATA_TYPE" ;
      edtavCtltbm43_note_Internalname = "CTLTBM43_NOTE" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCtltbm43_order_Internalname = "CTLTBM43_ORDER" ;
      edtavCtltbm43_version_Internalname = "CTLTBM43_VERSION" ;
      radavCtltbm43_del_flg.setInternalname( "CTLTBM43_DEL_FLG" );
      edtavCtltbm43_crt_datetime_Internalname = "CTLTBM43_CRT_DATETIME" ;
      edtavCtltbm43_upd_datetime_Internalname = "CTLTBM43_UPD_DATETIME" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      edtavCtltbm43_crt_prog_nm_Internalname = "CTLTBM43_CRT_PROG_NM" ;
      edtavCtltbm43_upd_prog_nm_Internalname = "CTLTBM43_UPD_PROG_NM" ;
      tblTable4_Internalname = "TABLE4" ;
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
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      lblTxt_btn_dlt2_Visible = 1 ;
      lblTxt_btn_dlt_Visible = 1 ;
      lblTxt_btn_upd2_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      edtavCtltbm43_input_type_div_Jsonclick = "" ;
      edtavCtltbm43_input_type_div_Backstyle = (byte)(-1) ;
      edtavCtltbm43_input_type_div_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm43_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm43_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm43_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm43_upd_datetime_Jsonclick = "" ;
      edtavCtltbm43_upd_datetime_Enabled = 0 ;
      edtavCtltbm43_upd_datetime_Visible = 1 ;
      edtavCtltbm43_crt_datetime_Jsonclick = "" ;
      edtavCtltbm43_crt_datetime_Enabled = 0 ;
      edtavCtltbm43_crt_datetime_Visible = 1 ;
      radavCtltbm43_del_flg.setJsonclick( "" );
      edtavCtltbm43_version_Jsonclick = "" ;
      edtavCtltbm43_version_Backstyle = (byte)(-1) ;
      edtavCtltbm43_version_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_order_Jsonclick = "" ;
      edtavCtltbm43_order_Backstyle = (byte)(-1) ;
      edtavCtltbm43_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_note_Backstyle = (byte)(-1) ;
      edtavCtltbm43_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_odm_data_type_Jsonclick = "" ;
      edtavCtltbm43_odm_data_type_Backstyle = (byte)(-1) ;
      edtavCtltbm43_odm_data_type_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_sas_field_nm_Jsonclick = "" ;
      edtavCtltbm43_sas_field_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm43_sas_field_nm_Backcolor = (int)(0xFFFFFF) ;
      radavCtltbm43_required_flg.setJsonclick( "" );
      radavCtltbm43_cdash_flg.setJsonclick( "" );
      radavCtltbm43_sdtm_flg.setJsonclick( "" );
      edtavCtltbm43_var_desc_Jsonclick = "" ;
      edtavCtltbm43_var_desc_Backstyle = (byte)(-1) ;
      edtavCtltbm43_var_desc_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_dom_var_nm_Jsonclick = "" ;
      edtavCtltbm43_dom_var_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm43_dom_var_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_dom_var_nm_Enabled = 1 ;
      cmbavCtltbm43_dom_cd.setJsonclick( "" );
      cmbavCtltbm43_dom_cd.setEnabled( 1 );
      cmbavCtltbm43_dom_cd.setBackstyle( (byte)(-1) );
      cmbavCtltbm43_dom_cd.setIBackground( (int)(0xFFFFFF) );
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltbm43_dom_var_nm_Enabled = 1 ;
      cmbavCtltbm43_dom_cd.setEnabled( 1 );
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      lblTxt_study_Caption = "試験名" ;
      edtavCtltbm43_version_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_odm_data_type_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_sas_field_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_input_type_div_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_var_desc_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm43_dom_var_nm_Backcolor = (int)(0xFFFFFF) ;
      cmbavCtltbm43_dom_cd.setIBackground( (int)(0xFFFFFF) );
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm43_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm43_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm43_upd_datetime_Enabled = -1 ;
      edtavCtltbm43_crt_datetime_Enabled = -1 ;
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
      AV5BC_STUDY_CDISC_ITEM = new SdtTBM43_STUDY_CDISC_ITEM(remoteHandle);
      wcpOAV16P_DOM_CD = "" ;
      wcpOAV17P_DOM_VAR_NM = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16P_DOM_CD = "" ;
      AV17P_DOM_VAR_NM = "" ;
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
      AV50Pgmname = "" ;
      AV49Pgmdesc = "" ;
      AV10D_CRT_USER_NM = "" ;
      AV12D_UPD_USER_NM = "" ;
      AV13H_INIT_FLG = "" ;
      AV15H_MODE = "" ;
      AV14H_KNGN_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV29W_MSG = "" ;
      AV26W_A821_JS = "" ;
      scmdbuf = "" ;
      H00202_A203TBM42_STUDY_ID = new long[1] ;
      H00202_A893TBM42_DEL_FLG = new String[] {""} ;
      H00202_n893TBM42_DEL_FLG = new boolean[] {false} ;
      H00202_A906TBM42_DOM_JNM = new String[] {""} ;
      H00202_n906TBM42_DOM_JNM = new boolean[] {false} ;
      H00202_A204TBM42_DOM_CD = new String[] {""} ;
      H00202_A909TBM42_ORDER = new int[1] ;
      H00202_n909TBM42_ORDER = new boolean[] {false} ;
      A893TBM42_DEL_FLG = "" ;
      A906TBM42_DOM_JNM = "" ;
      A204TBM42_DOM_CD = "" ;
      H00203_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      H00203_A201TBM43_DOM_CD = new String[] {""} ;
      H00203_A200TBM43_STUDY_ID = new long[1] ;
      H00203_A926TBM43_UPD_CNT = new long[1] ;
      H00203_n926TBM43_UPD_CNT = new boolean[] {false} ;
      A202TBM43_DOM_VAR_NM = "" ;
      A201TBM43_DOM_CD = "" ;
      AV20W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3 = new GxObjectCollection [1] ;
      AV23W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4 = new GxObjectCollection [1] ;
      AV24W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV21W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H00204_A63TBM21_STUDY_ID = new long[1] ;
      H00204_A367TBM21_STUDY_NM = new String[] {""} ;
      H00204_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      H00205_A55TAM07_USER_ID = new String[] {""} ;
      H00205_A205TAM07_USER_NM = new String[] {""} ;
      H00205_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      H00206_A55TAM07_USER_ID = new String[] {""} ;
      H00206_A205TAM07_USER_NM = new String[] {""} ;
      H00206_n205TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV25W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_boolean8 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTxt_study_Jsonclick = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp15_study_cdisc_item_reg__default(),
         new Object[] {
             new Object[] {
            H00202_A203TBM42_STUDY_ID, H00202_A893TBM42_DEL_FLG, H00202_n893TBM42_DEL_FLG, H00202_A906TBM42_DOM_JNM, H00202_n906TBM42_DOM_JNM, H00202_A204TBM42_DOM_CD, H00202_A909TBM42_ORDER, H00202_n909TBM42_ORDER
            }
            , new Object[] {
            H00203_A202TBM43_DOM_VAR_NM, H00203_A201TBM43_DOM_CD, H00203_A200TBM43_STUDY_ID, H00203_A926TBM43_UPD_CNT, H00203_n926TBM43_UPD_CNT
            }
            , new Object[] {
            H00204_A63TBM21_STUDY_ID, H00204_A367TBM21_STUDY_NM, H00204_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H00205_A55TAM07_USER_ID, H00205_A205TAM07_USER_NM, H00205_n205TAM07_USER_NM
            }
            , new Object[] {
            H00206_A55TAM07_USER_ID, H00206_A205TAM07_USER_NM, H00206_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV50Pgmname = "B402_WP15_STUDY_CDISC_ITEM_REG" ;
      AV49Pgmdesc = "試験登録（ドメイン変数編集）" ;
      /* GeneXus formulas. */
      AV50Pgmname = "B402_WP15_STUDY_CDISC_ITEM_REG" ;
      AV49Pgmdesc = "試験登録（ドメイン変数編集）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm43_crt_datetime_Enabled = 0 ;
      edtavCtltbm43_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm43_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm43_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV52GXLvl324 ;
   private byte AV56GXLvl512 ;
   private byte AV57GXLvl527 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm43_input_type_div_Backstyle ;
   private byte edtavCtltbm43_version_Backstyle ;
   private byte edtavCtltbm43_order_Backstyle ;
   private byte edtavCtltbm43_note_Backstyle ;
   private byte edtavCtltbm43_odm_data_type_Backstyle ;
   private byte edtavCtltbm43_sas_field_nm_Backstyle ;
   private byte edtavCtltbm43_var_desc_Backstyle ;
   private byte edtavCtltbm43_dom_var_nm_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int edtavCtltbm43_crt_datetime_Enabled ;
   private int edtavCtltbm43_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm43_crt_prog_nm_Enabled ;
   private int edtavCtltbm43_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int A909TBM42_ORDER ;
   private int edtavCtltbm43_dom_var_nm_Backcolor ;
   private int AV53GXV18 ;
   private int edtavCtltbm43_var_desc_Backcolor ;
   private int edtavCtltbm43_input_type_div_Backcolor ;
   private int edtavCtltbm43_sas_field_nm_Backcolor ;
   private int edtavCtltbm43_odm_data_type_Backcolor ;
   private int edtavCtltbm43_note_Backcolor ;
   private int edtavCtltbm43_order_Backcolor ;
   private int edtavCtltbm43_version_Backcolor ;
   private int AV54GXV19 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltbm43_dom_var_nm_Enabled ;
   private int edtavCtltbm43_crt_datetime_Visible ;
   private int edtavCtltbm43_upd_datetime_Visible ;
   private int AV58GXV20 ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int lblTxt_btn_upd2_Visible ;
   private int lblTxt_btn_dlt2_Visible ;
   private int idxLst ;
   private long wcpOAV18P_STUDY_ID ;
   private long AV18P_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private long A926TBM43_UPD_CNT ;
   private long A200TBM43_STUDY_ID ;
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
   private String AV50Pgmname ;
   private String AV49Pgmdesc ;
   private String edtavCtltbm43_crt_datetime_Internalname ;
   private String edtavCtltbm43_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm43_crt_prog_nm_Internalname ;
   private String edtavCtltbm43_upd_prog_nm_Internalname ;
   private String edtavCtltbm43_dom_var_nm_Internalname ;
   private String edtavCtltbm43_var_desc_Internalname ;
   private String edtavCtltbm43_input_type_div_Internalname ;
   private String edtavCtltbm43_sas_field_nm_Internalname ;
   private String edtavCtltbm43_odm_data_type_Internalname ;
   private String edtavCtltbm43_note_Internalname ;
   private String edtavCtltbm43_order_Internalname ;
   private String edtavCtltbm43_version_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String tblTbl_ins_btnset_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
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
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String imgImage5_Internalname ;
   private String imgImage3_Internalname ;
   private String edtavCtltbm43_dom_var_nm_Jsonclick ;
   private String edtavCtltbm43_var_desc_Jsonclick ;
   private String edtavCtltbm43_sas_field_nm_Jsonclick ;
   private String edtavCtltbm43_odm_data_type_Jsonclick ;
   private String imgImage4_Internalname ;
   private String edtavCtltbm43_order_Jsonclick ;
   private String edtavCtltbm43_version_Jsonclick ;
   private String edtavCtltbm43_crt_datetime_Jsonclick ;
   private String edtavCtltbm43_upd_datetime_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String edtavCtltbm43_crt_prog_nm_Jsonclick ;
   private String edtavCtltbm43_upd_prog_nm_Jsonclick ;
   private String tblTable6_Internalname ;
   private String edtavCtltbm43_input_type_div_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTable1_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTxt_study_Jsonclick ;
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
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV28W_ERRFLG ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n909TBM42_ORDER ;
   private boolean n926TBM43_UPD_CNT ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n205TAM07_USER_NM ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV16P_DOM_CD ;
   private String wcpOAV17P_DOM_VAR_NM ;
   private String AV16P_DOM_CD ;
   private String AV17P_DOM_VAR_NM ;
   private String AV10D_CRT_USER_NM ;
   private String AV12D_UPD_USER_NM ;
   private String AV13H_INIT_FLG ;
   private String AV15H_MODE ;
   private String AV14H_KNGN_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String AV26W_A821_JS ;
   private String A893TBM42_DEL_FLG ;
   private String A906TBM42_DOM_JNM ;
   private String A204TBM42_DOM_CD ;
   private String A202TBM43_DOM_VAR_NM ;
   private String A201TBM43_DOM_CD ;
   private String A367TBM21_STUDY_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String AV27W_ERRCD ;
   private String AV25W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM43_STUDY_CDISC_ITEM AV5BC_STUDY_CDISC_ITEM ;
   private HTMLChoice cmbavCtltbm43_dom_cd ;
   private HTMLChoice radavCtltbm43_sdtm_flg ;
   private HTMLChoice radavCtltbm43_cdash_flg ;
   private HTMLChoice radavCtltbm43_required_flg ;
   private HTMLChoice radavCtltbm43_del_flg ;
   private IDataStoreProvider pr_default ;
   private long[] H00202_A203TBM42_STUDY_ID ;
   private String[] H00202_A893TBM42_DEL_FLG ;
   private boolean[] H00202_n893TBM42_DEL_FLG ;
   private String[] H00202_A906TBM42_DOM_JNM ;
   private boolean[] H00202_n906TBM42_DOM_JNM ;
   private String[] H00202_A204TBM42_DOM_CD ;
   private int[] H00202_A909TBM42_ORDER ;
   private boolean[] H00202_n909TBM42_ORDER ;
   private String[] H00203_A202TBM43_DOM_VAR_NM ;
   private String[] H00203_A201TBM43_DOM_CD ;
   private long[] H00203_A200TBM43_STUDY_ID ;
   private long[] H00203_A926TBM43_UPD_CNT ;
   private boolean[] H00203_n926TBM43_UPD_CNT ;
   private long[] H00204_A63TBM21_STUDY_ID ;
   private String[] H00204_A367TBM21_STUDY_NM ;
   private boolean[] H00204_n367TBM21_STUDY_NM ;
   private String[] H00205_A55TAM07_USER_ID ;
   private String[] H00205_A205TAM07_USER_NM ;
   private boolean[] H00205_n205TAM07_USER_NM ;
   private String[] H00206_A55TAM07_USER_ID ;
   private String[] H00206_A205TAM07_USER_NM ;
   private boolean[] H00206_n205TAM07_USER_NM ;
   private GxObjectCollection AV20W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[] ;
   private GxObjectCollection AV23W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[] ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV21W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV24W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp15_study_cdisc_item_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00202", "SELECT `TBM42_STUDY_ID`, `TBM42_DEL_FLG`, `TBM42_DOM_JNM`, `TBM42_DOM_CD`, `TBM42_ORDER` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE (`TBM42_STUDY_ID` = ?) AND (`TBM42_DEL_FLG` = '0') ORDER BY `TBM42_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00203", "SELECT `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`, `TBM43_STUDY_ID`, `TBM43_UPD_CNT` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? and `TBM43_DOM_CD` = ? and `TBM43_DOM_VAR_NM` = ? ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00204", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00205", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00206", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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

