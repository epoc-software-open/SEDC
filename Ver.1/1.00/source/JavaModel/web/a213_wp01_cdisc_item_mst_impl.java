/*
               File: a213_wp01_cdisc_item_mst_impl
        Description: ドメイン変数マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:39.53
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a213_wp01_cdisc_item_mst_impl extends GXWebPanel
{
   public a213_wp01_cdisc_item_mst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a213_wp01_cdisc_item_mst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a213_wp01_cdisc_item_mst_impl.class ));
   }

   public a213_wp01_cdisc_item_mst_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtltbm03_dom_cd = new HTMLChoice();
      radavCtltbm03_sdtm_flg = new HTMLChoice();
      radavCtltbm03_cdash_flg = new HTMLChoice();
      radavCtltbm03_required_flg = new HTMLChoice();
      radavCtltbm03_del_flg = new HTMLChoice();
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
            AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15P_DOM_CD", AV15P_DOM_CD);
               AV16P_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_VAR_NM", AV16P_DOM_VAR_NM);
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
         pa1T2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1T2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1T2( ) ;
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
      httpContext.writeText( "ドメイン変数マスタメンテナンス（入力）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DOM_VAR_NM)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1T2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_cdisc_item", AV5BC_CDISC_ITEM);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_cdisc_item", AV5BC_CDISC_ITEM);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV17P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV15P_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_VAR_NM", GXutil.rtrim( AV16P_DOM_VAR_NM));
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

   public void wb1T0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1T2( true) ;
      }
      else
      {
         wb_table1_2_1T2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ドメイン変数マスタメンテナンス（入力）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0132") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0132", "");
         }
      }
      wbErr = false ;
      strup1T0( ) ;
   }

   public void ws1T2( )
   {
      start1T2( ) ;
      evt1T2( ) ;
   }

   public void evt1T2( )
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
                        /* Execute user event: e111T2 */
                        e111T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121T2 */
                        e121T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131T2 */
                        e131T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141T2 */
                        e141T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151T2 */
                        e151T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161T2 */
                        e161T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171T2 */
                        e171T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181T2 */
                        e181T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191T2 */
                        e191T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201T2 */
                        e201T2 ();
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
                  else if ( nCmpId == 132 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0132") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0132", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1T2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1T2( ) ;
         }
      }
   }

   public void pa1T2( )
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
                  AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV15P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15P_DOM_CD", AV15P_DOM_CD);
                     AV16P_DOM_VAR_NM = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_VAR_NM", AV16P_DOM_VAR_NM);
                  }
               }
            }
         }
         cmbavCtltbm03_dom_cd.setName( "CTLTBM03_DOM_CD" );
         cmbavCtltbm03_dom_cd.setWebtags( "" );
         if ( ( cmbavCtltbm03_dom_cd.getItemCount() > 0 ) && (GXutil.strcmp("", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd())==0) )
         {
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( cmbavCtltbm03_dom_cd.getItemValue((short)(1)) );
         }
         radavCtltbm03_sdtm_flg.setName( "CTLTBM03_SDTM_FLG" );
         radavCtltbm03_sdtm_flg.setWebtags( "" );
         radavCtltbm03_sdtm_flg.addItem("1", "ON", (short)(0));
         radavCtltbm03_sdtm_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm03_cdash_flg.setName( "CTLTBM03_CDASH_FLG" );
         radavCtltbm03_cdash_flg.setWebtags( "" );
         radavCtltbm03_cdash_flg.addItem("1", "ON", (short)(0));
         radavCtltbm03_cdash_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm03_required_flg.setName( "CTLTBM03_REQUIRED_FLG" );
         radavCtltbm03_required_flg.setWebtags( "" );
         radavCtltbm03_required_flg.addItem("1", "ON", (short)(0));
         radavCtltbm03_required_flg.addItem("0", "OFF", (short)(0));
         radavCtltbm03_del_flg.setName( "CTLTBM03_DEL_FLG" );
         radavCtltbm03_del_flg.setWebtags( "" );
         radavCtltbm03_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltbm03_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf1T2( ) ;
      /* End function Refresh */
   }

   public void rf1T2( )
   {
      /* Execute user event: e161T2 */
      e161T2 ();
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
         /* Execute user event: e201T2 */
         e201T2 ();
         wb1T0( ) ;
      }
   }

   public void strup1T0( )
   {
      /* Before Start, stand alone formulas. */
      AV49Pgmname = "A213_WP01_CDISC_ITEM_MST" ;
      AV48Pgmdesc = "ドメイン変数マスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm03_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm03_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm03_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm03_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e151T2 */
      e151T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_cdisc_item"), AV5BC_CDISC_ITEM);
         /* Read variables values. */
         cmbavCtltbm03_dom_cd.setValue( httpContext.cgiGet( cmbavCtltbm03_dom_cd.getInternalname()) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( httpContext.cgiGet( cmbavCtltbm03_dom_cd.getInternalname()) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm( httpContext.cgiGet( edtavCtltbm03_dom_var_nm_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc( httpContext.cgiGet( edtavCtltbm03_var_desc_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg( httpContext.cgiGet( radavCtltbm03_sdtm_flg.getInternalname()) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg( httpContext.cgiGet( radavCtltbm03_cdash_flg.getInternalname()) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div( httpContext.cgiGet( edtavCtltbm03_input_type_div_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg( httpContext.cgiGet( radavCtltbm03_required_flg.getInternalname()) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm( httpContext.cgiGet( edtavCtltbm03_sas_field_nm_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type( httpContext.cgiGet( edtavCtltbm03_odm_data_type_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note( httpContext.cgiGet( edtavCtltbm03_note_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm03_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm03_order_Internalname), ".", ",") > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM03_ORDER");
            GX_FocusControl = edtavCtltbm03_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order( 0 );
         }
         else
         {
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm03_order_Internalname), ".", ",")) );
         }
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version( httpContext.cgiGet( edtavCtltbm03_version_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg( httpContext.cgiGet( radavCtltbm03_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm03_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "CTLTBM03_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm03_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm03_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm03_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "CTLTBM03_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm03_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm03_upd_datetime_Internalname)) );
         }
         AV10D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
         AV11D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm( httpContext.cgiGet( edtavCtltbm03_crt_prog_nm_Internalname) );
         AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( httpContext.cgiGet( edtavCtltbm03_upd_prog_nm_Internalname) );
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV14H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         /* Read saved values. */
         AV17P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV15P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         AV16P_DOM_VAR_NM = httpContext.cgiGet( "vP_DOM_VAR_NM") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0132") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0132", "");
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
      /* Execute user event: e151T2 */
      e151T2 ();
      if (returnInSub) return;
   }

   public void e151T2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "A213" ;
      AV8C_GAMEN_TITLE = AV48Pgmdesc ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV21W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0132",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e161T2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV49Pgmname, "INFO", "画面起動") ;
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

   public void e111T2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "0") == 0 )
         {
            AV27W_ERRFLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV27W_ERRFLG )
            {
               GXt_char2 = AV28W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV28W_MSG = GXt_char2 ;
               GXt_char2 = AV25W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV25W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e171T2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm( AV49Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( AV49Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.Save();
      if ( AV5BC_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV28W_MSG);
      }
   }

   public void e121T2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV27W_ERRFLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV27W_ERRFLG )
            {
               GXt_char2 = AV28W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV28W_MSG = GXt_char2 ;
               GXt_char2 = AV25W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV25W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e181T2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( AV49Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.Save();
      if ( AV5BC_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_DOM_CD)) ;
         httpContext.wjLoc = formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV28W_MSG);
      }
   }

   public void e131T2( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV27W_ERRFLG = false ;
            if ( ! AV27W_ERRFLG )
            {
               GXt_char2 = AV28W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV28W_MSG = GXt_char2 ;
               GXt_char2 = AV25W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_DLT_EXEC", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV25W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e191T2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      AV5BC_CDISC_ITEM.Delete();
      if ( AV5BC_CDISC_ITEM.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_DOM_CD)) ;
         httpContext.wjLoc = formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV28W_MSG);
      }
   }

   public void e141T2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavCtltbm03_dom_cd.removeAllItems();
      cmbavCtltbm03_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H001T2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A522TBM02_DEL_FLG = H001T2_A522TBM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A522TBM02_DEL_FLG", A522TBM02_DEL_FLG);
         n522TBM02_DEL_FLG = H001T2_n522TBM02_DEL_FLG[0] ;
         A518TBM02_DOM_JNM = H001T2_A518TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518TBM02_DOM_JNM", A518TBM02_DOM_JNM);
         n518TBM02_DOM_JNM = H001T2_n518TBM02_DOM_JNM[0] ;
         A516TBM02_DOM_CD = H001T2_A516TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516TBM02_DOM_CD", A516TBM02_DOM_CD);
         A521TBM02_ORDER = H001T2_A521TBM02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A521TBM02_ORDER", GXutil.ltrim( GXutil.str( A521TBM02_ORDER, 5, 0)));
         n521TBM02_ORDER = H001T2_n521TBM02_ORDER[0] ;
         cmbavCtltbm03_dom_cd.addItem(A516TBM02_DOM_CD, A516TBM02_DOM_CD+":"+A518TBM02_DOM_JNM, (short)(0));
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
      if ( ! (GXutil.strcmp("", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd())==0) && ! (GXutil.strcmp("", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm())==0) )
      {
         AV51GXLvl323 = (byte)(0) ;
         /* Using cursor H001T3 */
         pr_default.execute(1, new Object[] {AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm()});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A163TBM03_DOM_VAR_NM = H001T3_A163TBM03_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
            A162TBM03_DOM_CD = H001T3_A162TBM03_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
            A182TBM03_UPD_DATETIME = H001T3_A182TBM03_UPD_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n182TBM03_UPD_DATETIME = H001T3_n182TBM03_UPD_DATETIME[0] ;
            AV51GXLvl323 = (byte)(1) ;
            if ( (GXutil.strcmp("", AV16P_DOM_VAR_NM)==0) )
            {
               GXt_char2 = AV28W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV28W_MSG = GXt_char2 ;
               httpContext.GX_msglist.addItem(AV28W_MSG);
               cmbavCtltbm03_dom_cd.setIBackground( UIFactory.getColor( 255, 192, 203) );
               httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm03_dom_cd.getIBackground(), 9, 0)));
               edtavCtltbm03_dom_var_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_dom_var_nm_Backcolor, 9, 0)));
               if ( ! AV27W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltbm03_dom_var_nm_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               AV27W_ERRFLG = true ;
            }
            else
            {
               if ( !( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime().equals( A182TBM03_UPD_DATETIME ) ) )
               {
                  GXt_char2 = AV28W_MSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
                  a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV28W_MSG = GXt_char2 ;
                  httpContext.GX_msglist.addItem(AV28W_MSG);
                  AV27W_ERRFLG = true ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV51GXLvl323 == 0 )
         {
            if ( ! (GXutil.strcmp("", AV16P_DOM_VAR_NM)==0) )
            {
               GXt_char2 = AV28W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV28W_MSG = GXt_char2 ;
               httpContext.GX_msglist.addItem(AV28W_MSG);
               AV27W_ERRFLG = true ;
            }
         }
      }
      if ( ! AV27W_ERRFLG )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV19W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV22W_A_RESULT_MSG_SDT ;
         new a213_pc01_cdisc_item_mst_chk(remoteHandle, context).execute( AV5BC_CDISC_ITEM, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
         AV19W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
         AV22W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
         if ( AV22W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV27W_ERRFLG = true ;
            AV52GXV18 = 1 ;
            while ( AV52GXV18 <= AV22W_A_RESULT_MSG_SDT.size() )
            {
               AV23W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV22W_A_RESULT_MSG_SDT.elementAt(-1+AV52GXV18));
               httpContext.GX_msglist.addItem(AV23W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV52GXV18 = (int)(AV52GXV18+1) ;
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
      cmbavCtltbm03_dom_cd.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm03_dom_cd.getIBackground(), 9, 0)));
      edtavCtltbm03_dom_var_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_dom_var_nm_Backcolor, 9, 0)));
      edtavCtltbm03_var_desc_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_var_desc_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_var_desc_Backcolor, 9, 0)));
      edtavCtltbm03_input_type_div_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_input_type_div_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_input_type_div_Backcolor, 9, 0)));
      edtavCtltbm03_sas_field_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_sas_field_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_sas_field_nm_Backcolor, 9, 0)));
      edtavCtltbm03_odm_data_type_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_odm_data_type_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_odm_data_type_Backcolor, 9, 0)));
      edtavCtltbm03_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_note_Backcolor, 9, 0)));
      edtavCtltbm03_order_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_order_Backcolor, 9, 0)));
      edtavCtltbm03_version_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_version_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV53GXV19 = 1 ;
      while ( AV53GXV19 <= AV19W_A_CHK_RESULT_SDT.size() )
      {
         AV20W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV19W_A_CHK_RESULT_SDT.elementAt(-1+AV53GXV19));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV53GXV19 = (int)(AV53GXV19+1) ;
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_DOM_CD") == 0 )
      {
         cmbavCtltbm03_dom_cd.setIBackground( UIFactory.getColor( 255, 192, 203) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavCtltbm03_dom_cd.getIBackground(), 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = cmbavCtltbm03_dom_cd.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_DOM_VAR_NM") == 0 )
      {
         edtavCtltbm03_dom_var_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_dom_var_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_dom_var_nm_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_dom_var_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_VAR_DESC") == 0 )
      {
         edtavCtltbm03_var_desc_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_var_desc_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_var_desc_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_var_desc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_INPUT_TYPE_DIV") == 0 )
      {
         edtavCtltbm03_input_type_div_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_input_type_div_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_input_type_div_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_input_type_div_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_SAS_FIELD_NM") == 0 )
      {
         edtavCtltbm03_sas_field_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_sas_field_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_sas_field_nm_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_sas_field_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_ODM_DATA_TYPE") == 0 )
      {
         edtavCtltbm03_odm_data_type_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_odm_data_type_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_odm_data_type_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_odm_data_type_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_NOTE") == 0 )
      {
         edtavCtltbm03_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_note_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_ORDER") == 0 )
      {
         edtavCtltbm03_order_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_order_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM03_VERSION") == 0 )
      {
         edtavCtltbm03_version_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_version_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm03_version_Backcolor, 9, 0)));
         if ( AV20W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm03_version_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV16P_DOM_VAR_NM)==0) )
      {
         AV14H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV5BC_CDISC_ITEM.Load(AV15P_DOM_CD, AV16P_DOM_VAR_NM);
         if ( AV5BC_CDISC_ITEM.Fail() )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
         else
         {
            AV54GXLvl497 = (byte)(0) ;
            /* Using cursor H001T4 */
            pr_default.execute(2, new Object[] {AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id()});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A8TAM07_USER_ID = H001T4_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H001T4_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H001T4_n2TAM07_USER_NM[0] ;
               AV54GXLvl497 = (byte)(1) ;
               GXt_char2 = AV10D_CRT_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV10D_CRT_USER_NM = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV54GXLvl497 == 0 )
            {
               AV10D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id()) == 0 )
            {
               AV11D_UPD_USER_NM = AV10D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
            }
            else
            {
               AV55GXLvl512 = (byte)(0) ;
               /* Using cursor H001T5 */
               pr_default.execute(3, new Object[] {AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id()});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A8TAM07_USER_ID = H001T5_A8TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
                  A2TAM07_USER_NM = H001T5_A2TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  n2TAM07_USER_NM = H001T5_n2TAM07_USER_NM[0] ;
                  AV55GXLvl512 = (byte)(1) ;
                  GXt_char2 = AV11D_UPD_USER_NM ;
                  GXv_char3[0] = GXt_char2 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
                  a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  AV11D_UPD_USER_NM = GXt_char2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               if ( AV55GXLvl512 == 0 )
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
         cmbavCtltbm03_dom_cd.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltbm03_dom_cd.getEnabled(), 5, 0)));
         edtavCtltbm03_dom_var_nm_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_dom_var_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_dom_var_nm_Enabled, 5, 0)));
         edtavCtltbm03_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm03_crt_datetime_Visible, 5, 0)));
         edtavCtltbm03_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm03_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = cmbavCtltbm03_dom_cd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV14H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         cmbavCtltbm03_dom_cd.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltbm03_dom_cd.getEnabled(), 5, 0)));
         edtavCtltbm03_dom_var_nm_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_dom_var_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm03_dom_var_nm_Enabled, 5, 0)));
         edtavCtltbm03_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm03_crt_datetime_Visible, 5, 0)));
         edtavCtltbm03_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm03_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm03_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = cmbavCtltbm03_dom_cd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_CDISC_ITEM.GetMessages() ;
      AV56GXV20 = 1 ;
      while ( AV56GXV20 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV56GXV20));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char3) ;
            a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
            a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            a213_wp01_cdisc_item_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
         }
         else
         {
            AV28W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
         }
         AV56GXV20 = (int)(AV56GXV20+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV21W_A_LOGIN_SDT;
      GXv_char3[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char3) ;
      AV21W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      a213_wp01_cdisc_item_mst_impl.this.AV26W_ERRCD = GXv_char3[0] ;
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
      AV25W_A821_JS = "" ;
      AV24W_A819_JS = "" ;
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV10D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_CRT_USER_NM", AV10D_CRT_USER_NM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
      AV11D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
      AV5BC_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CDISC_ITEM", AV5BC_CDISC_ITEM);
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
      if ( ! (GXutil.strcmp("", AV25W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV25W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV24W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV24W_A819_JS ;
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
      GXv_char8[0] = AV26W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char3, GXv_char8) ;
      a213_wp01_cdisc_item_mst_impl.this.AV13H_KNGN_FLG = GXv_char3[0] ;
      a213_wp01_cdisc_item_mst_impl.this.AV26W_ERRCD = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S23710( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV49Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a213_wp01_cdisc_item_mst");
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
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         a213_wp01_cdisc_item_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
         {
            lblTxt_btn_upd2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
         }
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         a213_wp01_cdisc_item_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
         if ( ( lblTxt_btn_dlt_Visible == ( 0 )) )
         {
            lblTxt_btn_dlt2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt2_Visible, 5, 0)));
         }
      }
      else
      {
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         a213_wp01_cdisc_item_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean9 ? 1 : 0) ;
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

   protected void e201T2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_1T2( boolean wbgen )
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
         wb_table2_6_1T2( true) ;
      }
      else
      {
         wb_table2_6_1T2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_1T2e( boolean wbgen )
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
         wb_table1_2_1T2e( true) ;
      }
      else
      {
         wb_table1_2_1T2e( false) ;
      }
   }

   public void wb_table2_6_1T2( boolean wbgen )
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
         wb_table3_12_1T2( true) ;
      }
      else
      {
         wb_table3_12_1T2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_20_1T2( true) ;
      }
      else
      {
         wb_table4_20_1T2( false) ;
      }
      return  ;
   }

   public void wb_table4_20_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_34_1T2( true) ;
      }
      else
      {
         wb_table5_34_1T2( false) ;
      }
      return  ;
   }

   public void wb_table5_34_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_123_1T2( true) ;
      }
      else
      {
         wb_table6_123_1T2( false) ;
      }
      return  ;
   }

   public void wb_table6_123_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0132"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0132"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0132"+"");
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
         wb_table2_6_1T2e( true) ;
      }
      else
      {
         wb_table2_6_1T2e( false) ;
      }
   }

   public void wb_table6_123_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(127);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV14H_MODE), GXutil.rtrim( localUtil.format( AV14H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", "", "", "", "", edtavH_mode_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_123_1T2e( true) ;
      }
      else
      {
         wb_table6_123_1T2e( false) ;
      }
   }

   public void wb_table5_34_1T2( boolean wbgen )
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
         wb_table7_40_1T2( true) ;
      }
      else
      {
         wb_table7_40_1T2( false) ;
      }
      return  ;
   }

   public void wb_table7_40_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_34_1T2e( true) ;
      }
      else
      {
         wb_table5_34_1T2e( false) ;
      }
   }

   public void wb_table7_40_1T2( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "&nbsp;ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"width:275px\">") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd());
         ClassString = "Attribute" ;
         StyleString = "background:" + WebUtils.getHTMLColor( cmbavCtltbm03_dom_cd.getIBackground()) + ";" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtltbm03_dom_cd, cmbavCtltbm03_dom_cd.getInternalname(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd(), 1, cmbavCtltbm03_dom_cd.getJsonclick(), 0, "", "svchar", "", 1, cmbavCtltbm03_dom_cd.getEnabled(), 1, (short)(0), 2, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(47);\"", "", true, "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         cmbavCtltbm03_dom_cd.setValue( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd() );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm03_dom_cd.getInternalname(), "Values", cmbavCtltbm03_dom_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "&nbsp;ドメイン変数名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_dom_var_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_dom_var_nm_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "", "", "", "", edtavCtltbm03_dom_var_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm03_dom_var_nm_Enabled, 1, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数説明") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_var_desc_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_var_desc_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "", "", "", "", edtavCtltbm03_var_desc_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "SDTM定義フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm03_sdtm_flg, radavCtltbm03_sdtm_flg.getInternalname(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm03_sdtm_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(60);\"", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "CDASH定義フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm03_cdash_flg, radavCtltbm03_cdash_flg.getInternalname(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm03_cdash_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "入力値型区分") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_67_1T2( true) ;
      }
      else
      {
         wb_table8_67_1T2( false) ;
      }
      return  ;
   }

   public void wb_table8_67_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "必須入力フラグ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm03_required_flg, radavCtltbm03_required_flg.getInternalname(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm03_required_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(75);\"", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "SASフィールド名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_sas_field_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_sas_field_nm_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "", "", "", "", edtavCtltbm03_sas_field_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ODMデータタイプ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_odm_data_type_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_odm_data_type_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtavCtltbm03_odm_data_type_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "備考") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm03_note_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "&nbsp;表示順") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order()", GXutil.ltrim( GXutil.str( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order(), 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_order_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order(), (byte)(5), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order()), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(92);\"", "", "", "", "", edtavCtltbm03_order_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         httpContext.writeText( "Version") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_version_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_version_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(95);\"", "", "", "", "", edtavCtltbm03_version_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm03_del_flg, radavCtltbm03_del_flg.getInternalname(), AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltbm03_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
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
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime()", localUtil.ttoc( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm03_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_crt_datetime_Internalname, localUtil.format(AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm03_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm03_crt_datetime_Visible, edtavCtltbm03_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm03_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm03_crt_datetime_Visible==0)||(edtavCtltbm03_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime()", localUtil.ttoc( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm03_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_upd_datetime_Internalname, localUtil.format(AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm03_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm03_upd_datetime_Visible, edtavCtltbm03_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm03_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm03_upd_datetime_Visible==0)||(edtavCtltbm03_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV10D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(112);\"", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crt_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(115);\"", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_upd_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltbm03_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm03_crt_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltbm03_upd_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm03_upd_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_40_1T2e( true) ;
      }
      else
      {
         wb_table7_40_1T2e( false) ;
      }
   }

   public void wb_table8_67_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:32px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div()", AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm03_input_type_div_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm03_input_type_div_Internalname, GXutil.rtrim( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div()), GXutil.rtrim( localUtil.format( AV5BC_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(70);\"", "", "", "", "", edtavCtltbm03_input_type_div_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "（0:文字列型 1:数値型）", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_67_1T2e( true) ;
      }
      else
      {
         wb_table8_67_1T2e( false) ;
      }
   }

   public void wb_table4_20_1T2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "E\\'BTN_DLT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt2_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_dlt2_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_1T2e( true) ;
      }
      else
      {
         wb_table4_20_1T2e( false) ;
      }
   }

   public void wb_table3_12_1T2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "登録（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "戻る（F11）", "", "", lblTextblock44_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A213_WP01_CDISC_ITEM_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_1T2e( true) ;
      }
      else
      {
         wb_table3_12_1T2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
      AV15P_DOM_CD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_DOM_CD", AV15P_DOM_CD);
      AV16P_DOM_VAR_NM = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_DOM_VAR_NM", AV16P_DOM_VAR_NM);
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
      pa1T2( ) ;
      ws1T2( ) ;
      we1T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1594429");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("a213_wp01_cdisc_item_mst.js", "?1594429");
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
      cmbavCtltbm03_dom_cd.setInternalname( "CTLTBM03_DOM_CD" );
      imgImage3_Internalname = "IMAGE3" ;
      edtavCtltbm03_dom_var_nm_Internalname = "CTLTBM03_DOM_VAR_NM" ;
      edtavCtltbm03_var_desc_Internalname = "CTLTBM03_VAR_DESC" ;
      radavCtltbm03_sdtm_flg.setInternalname( "CTLTBM03_SDTM_FLG" );
      radavCtltbm03_cdash_flg.setInternalname( "CTLTBM03_CDASH_FLG" );
      edtavCtltbm03_input_type_div_Internalname = "CTLTBM03_INPUT_TYPE_DIV" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable1_Internalname = "TABLE1" ;
      radavCtltbm03_required_flg.setInternalname( "CTLTBM03_REQUIRED_FLG" );
      edtavCtltbm03_sas_field_nm_Internalname = "CTLTBM03_SAS_FIELD_NM" ;
      edtavCtltbm03_odm_data_type_Internalname = "CTLTBM03_ODM_DATA_TYPE" ;
      edtavCtltbm03_note_Internalname = "CTLTBM03_NOTE" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCtltbm03_order_Internalname = "CTLTBM03_ORDER" ;
      edtavCtltbm03_version_Internalname = "CTLTBM03_VERSION" ;
      radavCtltbm03_del_flg.setInternalname( "CTLTBM03_DEL_FLG" );
      edtavCtltbm03_crt_datetime_Internalname = "CTLTBM03_CRT_DATETIME" ;
      edtavCtltbm03_upd_datetime_Internalname = "CTLTBM03_UPD_DATETIME" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      edtavCtltbm03_crt_prog_nm_Internalname = "CTLTBM03_CRT_PROG_NM" ;
      edtavCtltbm03_upd_prog_nm_Internalname = "CTLTBM03_UPD_PROG_NM" ;
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
      edtavCtltbm03_input_type_div_Jsonclick = "" ;
      edtavCtltbm03_input_type_div_Backstyle = (byte)(-1) ;
      edtavCtltbm03_input_type_div_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm03_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm03_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm03_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm03_upd_datetime_Jsonclick = "" ;
      edtavCtltbm03_upd_datetime_Enabled = 0 ;
      edtavCtltbm03_upd_datetime_Visible = 1 ;
      edtavCtltbm03_crt_datetime_Jsonclick = "" ;
      edtavCtltbm03_crt_datetime_Enabled = 0 ;
      edtavCtltbm03_crt_datetime_Visible = 1 ;
      radavCtltbm03_del_flg.setJsonclick( "" );
      edtavCtltbm03_version_Jsonclick = "" ;
      edtavCtltbm03_version_Backstyle = (byte)(-1) ;
      edtavCtltbm03_version_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_order_Jsonclick = "" ;
      edtavCtltbm03_order_Backstyle = (byte)(-1) ;
      edtavCtltbm03_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_note_Backstyle = (byte)(-1) ;
      edtavCtltbm03_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_odm_data_type_Jsonclick = "" ;
      edtavCtltbm03_odm_data_type_Backstyle = (byte)(-1) ;
      edtavCtltbm03_odm_data_type_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_sas_field_nm_Jsonclick = "" ;
      edtavCtltbm03_sas_field_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm03_sas_field_nm_Backcolor = (int)(0xFFFFFF) ;
      radavCtltbm03_required_flg.setJsonclick( "" );
      radavCtltbm03_cdash_flg.setJsonclick( "" );
      radavCtltbm03_sdtm_flg.setJsonclick( "" );
      edtavCtltbm03_var_desc_Jsonclick = "" ;
      edtavCtltbm03_var_desc_Backstyle = (byte)(-1) ;
      edtavCtltbm03_var_desc_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_dom_var_nm_Jsonclick = "" ;
      edtavCtltbm03_dom_var_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm03_dom_var_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_dom_var_nm_Enabled = 1 ;
      cmbavCtltbm03_dom_cd.setJsonclick( "" );
      cmbavCtltbm03_dom_cd.setEnabled( 1 );
      cmbavCtltbm03_dom_cd.setBackstyle( (byte)(-1) );
      cmbavCtltbm03_dom_cd.setIBackground( (int)(0xFFFFFF) );
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltbm03_dom_var_nm_Enabled = 1 ;
      cmbavCtltbm03_dom_cd.setEnabled( 1 );
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      edtavCtltbm03_version_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_odm_data_type_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_sas_field_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_input_type_div_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_var_desc_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm03_dom_var_nm_Backcolor = (int)(0xFFFFFF) ;
      cmbavCtltbm03_dom_cd.setIBackground( (int)(0xFFFFFF) );
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm03_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm03_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm03_upd_datetime_Enabled = -1 ;
      edtavCtltbm03_crt_datetime_Enabled = -1 ;
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
                  /* Execute user subroutine: S23710 */
                  S23710 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_CDISC_ITEM = new SdtTBM03_CDISC_ITEM(remoteHandle);
      wcpOAV15P_DOM_CD = "" ;
      wcpOAV16P_DOM_VAR_NM = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15P_DOM_CD = "" ;
      AV16P_DOM_VAR_NM = "" ;
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
      AV49Pgmname = "" ;
      AV48Pgmdesc = "" ;
      AV10D_CRT_USER_NM = "" ;
      AV11D_UPD_USER_NM = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_MODE = "" ;
      AV13H_KNGN_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV21W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV28W_MSG = "" ;
      AV25W_A821_JS = "" ;
      scmdbuf = "" ;
      H001T2_A522TBM02_DEL_FLG = new String[] {""} ;
      H001T2_n522TBM02_DEL_FLG = new boolean[] {false} ;
      H001T2_A518TBM02_DOM_JNM = new String[] {""} ;
      H001T2_n518TBM02_DOM_JNM = new boolean[] {false} ;
      H001T2_A516TBM02_DOM_CD = new String[] {""} ;
      H001T2_A521TBM02_ORDER = new int[1] ;
      H001T2_n521TBM02_ORDER = new boolean[] {false} ;
      A522TBM02_DEL_FLG = "" ;
      A518TBM02_DOM_JNM = "" ;
      A516TBM02_DOM_CD = "" ;
      H001T3_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      H001T3_A162TBM03_DOM_CD = new String[] {""} ;
      H001T3_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001T3_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      A163TBM03_DOM_VAR_NM = "" ;
      A162TBM03_DOM_CD = "" ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV19W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV23W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV20W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H001T4_A8TAM07_USER_ID = new String[] {""} ;
      H001T4_A2TAM07_USER_NM = new String[] {""} ;
      H001T4_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H001T5_A8TAM07_USER_ID = new String[] {""} ;
      H001T5_A2TAM07_USER_NM = new String[] {""} ;
      H001T5_n2TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      AV24W_A819_JS = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String [1] ;
      GXv_char8 = new String [1] ;
      GXv_boolean10 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
      lblTextblock1_Jsonclick = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new a213_wp01_cdisc_item_mst__default(),
         new Object[] {
             new Object[] {
            H001T2_A522TBM02_DEL_FLG, H001T2_n522TBM02_DEL_FLG, H001T2_A518TBM02_DOM_JNM, H001T2_n518TBM02_DOM_JNM, H001T2_A516TBM02_DOM_CD, H001T2_A521TBM02_ORDER, H001T2_n521TBM02_ORDER
            }
            , new Object[] {
            H001T3_A163TBM03_DOM_VAR_NM, H001T3_A162TBM03_DOM_CD, H001T3_A182TBM03_UPD_DATETIME, H001T3_n182TBM03_UPD_DATETIME
            }
            , new Object[] {
            H001T4_A8TAM07_USER_ID, H001T4_A2TAM07_USER_NM, H001T4_n2TAM07_USER_NM
            }
            , new Object[] {
            H001T5_A8TAM07_USER_ID, H001T5_A2TAM07_USER_NM, H001T5_n2TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV49Pgmname = "A213_WP01_CDISC_ITEM_MST" ;
      AV48Pgmdesc = "ドメイン変数マスタメンテナンス（入力）" ;
      /* GeneXus formulas. */
      AV49Pgmname = "A213_WP01_CDISC_ITEM_MST" ;
      AV48Pgmdesc = "ドメイン変数マスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm03_crt_datetime_Enabled = 0 ;
      edtavCtltbm03_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm03_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm03_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV17P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17P_MOVE_KBN ;
   private byte nDonePA ;
   private byte AV51GXLvl323 ;
   private byte AV54GXLvl497 ;
   private byte AV55GXLvl512 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm03_input_type_div_Backstyle ;
   private byte edtavCtltbm03_version_Backstyle ;
   private byte edtavCtltbm03_order_Backstyle ;
   private byte edtavCtltbm03_note_Backstyle ;
   private byte edtavCtltbm03_odm_data_type_Backstyle ;
   private byte edtavCtltbm03_sas_field_nm_Backstyle ;
   private byte edtavCtltbm03_var_desc_Backstyle ;
   private byte edtavCtltbm03_dom_var_nm_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int edtavCtltbm03_crt_datetime_Enabled ;
   private int edtavCtltbm03_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm03_crt_prog_nm_Enabled ;
   private int edtavCtltbm03_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int A521TBM02_ORDER ;
   private int edtavCtltbm03_dom_var_nm_Backcolor ;
   private int AV52GXV18 ;
   private int edtavCtltbm03_var_desc_Backcolor ;
   private int edtavCtltbm03_input_type_div_Backcolor ;
   private int edtavCtltbm03_sas_field_nm_Backcolor ;
   private int edtavCtltbm03_odm_data_type_Backcolor ;
   private int edtavCtltbm03_note_Backcolor ;
   private int edtavCtltbm03_order_Backcolor ;
   private int edtavCtltbm03_version_Backcolor ;
   private int AV53GXV19 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltbm03_dom_var_nm_Enabled ;
   private int edtavCtltbm03_crt_datetime_Visible ;
   private int edtavCtltbm03_upd_datetime_Visible ;
   private int AV56GXV20 ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int lblTxt_btn_upd2_Visible ;
   private int lblTxt_btn_dlt2_Visible ;
   private int idxLst ;
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
   private String AV49Pgmname ;
   private String AV48Pgmdesc ;
   private String edtavCtltbm03_crt_datetime_Internalname ;
   private String edtavCtltbm03_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm03_crt_prog_nm_Internalname ;
   private String edtavCtltbm03_upd_prog_nm_Internalname ;
   private String edtavCtltbm03_dom_var_nm_Internalname ;
   private String edtavCtltbm03_var_desc_Internalname ;
   private String edtavCtltbm03_input_type_div_Internalname ;
   private String edtavCtltbm03_sas_field_nm_Internalname ;
   private String edtavCtltbm03_odm_data_type_Internalname ;
   private String edtavCtltbm03_note_Internalname ;
   private String edtavCtltbm03_order_Internalname ;
   private String edtavCtltbm03_version_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String tblTbl_ins_btnset_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char8[] ;
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
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String tblTable4_Internalname ;
   private String imgImage1_Internalname ;
   private String imgImage3_Internalname ;
   private String edtavCtltbm03_dom_var_nm_Jsonclick ;
   private String edtavCtltbm03_var_desc_Jsonclick ;
   private String edtavCtltbm03_sas_field_nm_Jsonclick ;
   private String edtavCtltbm03_odm_data_type_Jsonclick ;
   private String imgImage4_Internalname ;
   private String edtavCtltbm03_order_Jsonclick ;
   private String edtavCtltbm03_version_Jsonclick ;
   private String edtavCtltbm03_crt_datetime_Jsonclick ;
   private String edtavCtltbm03_upd_datetime_Jsonclick ;
   private String GXt_char1 ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String edtavCtltbm03_crt_prog_nm_Jsonclick ;
   private String edtavCtltbm03_upd_prog_nm_Jsonclick ;
   private String tblTable1_Internalname ;
   private String GXt_char2 ;
   private String edtavCtltbm03_input_type_div_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
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
   private java.util.Date A182TBM03_UPD_DATETIME ;
   private java.util.Date GXt_dtime7 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV27W_ERRFLG ;
   private boolean n522TBM02_DEL_FLG ;
   private boolean n518TBM02_DOM_JNM ;
   private boolean n521TBM02_ORDER ;
   private boolean n182TBM03_UPD_DATETIME ;
   private boolean n2TAM07_USER_NM ;
   private boolean GXt_boolean9 ;
   private boolean GXv_boolean10[] ;
   private String wcpOAV15P_DOM_CD ;
   private String wcpOAV16P_DOM_VAR_NM ;
   private String AV15P_DOM_CD ;
   private String AV16P_DOM_VAR_NM ;
   private String AV10D_CRT_USER_NM ;
   private String AV11D_UPD_USER_NM ;
   private String AV12H_INIT_FLG ;
   private String AV14H_MODE ;
   private String AV13H_KNGN_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV28W_MSG ;
   private String AV25W_A821_JS ;
   private String A522TBM02_DEL_FLG ;
   private String A518TBM02_DOM_JNM ;
   private String A516TBM02_DOM_CD ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A162TBM03_DOM_CD ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String AV26W_ERRCD ;
   private String AV24W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM03_CDISC_ITEM AV5BC_CDISC_ITEM ;
   private HTMLChoice cmbavCtltbm03_dom_cd ;
   private HTMLChoice radavCtltbm03_sdtm_flg ;
   private HTMLChoice radavCtltbm03_cdash_flg ;
   private HTMLChoice radavCtltbm03_required_flg ;
   private HTMLChoice radavCtltbm03_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H001T2_A522TBM02_DEL_FLG ;
   private boolean[] H001T2_n522TBM02_DEL_FLG ;
   private String[] H001T2_A518TBM02_DOM_JNM ;
   private boolean[] H001T2_n518TBM02_DOM_JNM ;
   private String[] H001T2_A516TBM02_DOM_CD ;
   private int[] H001T2_A521TBM02_ORDER ;
   private boolean[] H001T2_n521TBM02_ORDER ;
   private String[] H001T3_A163TBM03_DOM_VAR_NM ;
   private String[] H001T3_A162TBM03_DOM_CD ;
   private java.util.Date[] H001T3_A182TBM03_UPD_DATETIME ;
   private boolean[] H001T3_n182TBM03_UPD_DATETIME ;
   private String[] H001T4_A8TAM07_USER_ID ;
   private String[] H001T4_A2TAM07_USER_NM ;
   private boolean[] H001T4_n2TAM07_USER_NM ;
   private String[] H001T5_A8TAM07_USER_ID ;
   private String[] H001T5_A2TAM07_USER_NM ;
   private boolean[] H001T5_n2TAM07_USER_NM ;
   private GxObjectCollection AV19W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV22W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV20W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV21W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV23W_A_RESULT_MSG_SDT_ITEM ;
}

final  class a213_wp01_cdisc_item_mst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001T2", "SELECT `TBM02_DEL_FLG`, `TBM02_DOM_JNM`, `TBM02_DOM_CD`, `TBM02_ORDER` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DEL_FLG` = '0' ORDER BY `TBM02_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001T3", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_UPD_DATETIME` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` = ? ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001T4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001T5", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 50);
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

