/*
               File: a207_wp01_user_mst_impl
        Description: ユーザーマスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:59:16.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a207_wp01_user_mst_impl extends GXWebPanel
{
   public a207_wp01_user_mst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a207_wp01_user_mst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a207_wp01_user_mst_impl.class ));
   }

   public a207_wp01_user_mst_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavCtltam07_site_id = new HTMLChoice();
      dynavCtltam07_kngn_ptn_kbn = new HTMLChoice();
      radavCtltam07_del_flg = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CTLTAM07_SITE_ID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvctltam07_site_id0U2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CTLTAM07_KNGN_PTN_KBN") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvctltam07_kngn_ptn_kbn0U2( ) ;
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
            AV16P_TAM07_USER_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM07_USER_ID", AV16P_TAM07_USER_ID);
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa0U2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws0U2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we0U2( ) ;
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
      httpContext.writeText( "ユーザーマスタメンテナンス（入力）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV16P_TAM07_USER_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("a207_wp01_user_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0U2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_tam07_user", AV5BC_TAM07_USER);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_tam07_user", AV5BC_TAM07_USER);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_TAM07_USER_ID", GXutil.rtrim( AV16P_TAM07_USER_ID));
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

   public void wb0U0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0U2( true) ;
      }
      else
      {
         wb_table1_2_0U2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ユーザーマスタメンテナンス（入力）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0106") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0106", "");
         }
      }
      wbErr = false ;
      strup0U0( ) ;
   }

   public void ws0U2( )
   {
      start0U2( ) ;
      evt0U2( ) ;
   }

   public void evt0U2( )
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
                        /* Execute user event: e110U2 */
                        e110U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120U2 */
                        e120U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130U2 */
                        e130U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140U2 */
                        e140U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150U2 */
                        e150U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160U2 */
                        e160U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170U2 */
                        e170U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180U2 */
                        e180U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190U2 */
                        e190U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200U2 */
                        e200U2 ();
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
                  else if ( nCmpId == 106 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0106") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0106", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0U2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0U2( ) ;
         }
      }
   }

   public void pa0U2( )
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
                  AV16P_TAM07_USER_ID = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM07_USER_ID", AV16P_TAM07_USER_ID);
               }
            }
         }
         dynavCtltam07_site_id.setName( "CTLTAM07_SITE_ID" );
         dynavCtltam07_site_id.setWebtags( "" );
         dynavCtltam07_kngn_ptn_kbn.setName( "CTLTAM07_KNGN_PTN_KBN" );
         dynavCtltam07_kngn_ptn_kbn.setWebtags( "" );
         radavCtltam07_del_flg.setName( "CTLTAM07_DEL_FLG" );
         radavCtltam07_del_flg.setWebtags( "" );
         radavCtltam07_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltam07_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvctltam07_site_id0U2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvctltam07_site_id_data0U2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvctltam07_site_id_html0U2( )
   {
      String gxdynajaxvalue ;
      gxdlvctltam07_site_id_data0U2( ) ;
      gxdynajaxindex = 1 ;
      dynavCtltam07_site_id.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCtltam07_site_id.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         if ( ( dynavCtltam07_site_id.getItemCount() > 0 ) && (GXutil.strcmp("", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id())==0) )
         {
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_site_id( dynavCtltam07_site_id.getItemValue((short)(1)) );
         }
      }
   }

   public void gxdlvctltam07_site_id_data0U2( )
   {
      /* Using cursor H000U2 */
      pr_default.execute(0);
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H000U2_A132TAM08_SITE_ID[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H000U2_A133TAM08_SITE_NM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlvctltam07_kngn_ptn_kbn0U2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvctltam07_kngn_ptn_kbn_data0U2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvctltam07_kngn_ptn_kbn_html0U2( )
   {
      String gxdynajaxvalue ;
      gxdlvctltam07_kngn_ptn_kbn_data0U2( ) ;
      gxdynajaxindex = 1 ;
      dynavCtltam07_kngn_ptn_kbn.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCtltam07_kngn_ptn_kbn.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         if ( ( dynavCtltam07_kngn_ptn_kbn.getItemCount() > 0 ) && (GXutil.strcmp("", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd())==0) )
         {
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_auth_cd( dynavCtltam07_kngn_ptn_kbn.getItemValue((short)(1)) );
         }
      }
   }

   public void gxdlvctltam07_kngn_ptn_kbn_data0U2( )
   {
      /* Using cursor H000U3 */
      pr_default.execute(1);
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H000U3_A17TAM04_AUTH_CD[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H000U3_A98TAM04_AUTH_NM[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void refresh( )
   {
      rf0U2( ) ;
      /* End function Refresh */
   }

   public void rf0U2( )
   {
      /* Execute user event: e160U2 */
      e160U2 ();
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
         /* Execute user event: e200U2 */
         e200U2 ();
         wb0U0( ) ;
      }
   }

   public void strup0U0( )
   {
      /* Before Start, stand alone formulas. */
      AV42Pgmname = "A207_WP01_USER_MST" ;
      AV41Pgmdesc = "ユーザーマスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltam07_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_crt_datetime_Enabled, 5, 0)));
      edtavCtltam07_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_upd_datetime_Enabled, 5, 0)));
      edtavD_tam07_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam07_crt_user_nm_Enabled, 5, 0)));
      edtavD_tam07_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam07_upd_user_nm_Enabled, 5, 0)));
      edtavCtltam07_crt_pg_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_crt_pg_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_crt_pg_nm_Enabled, 5, 0)));
      edtavCtltam07_upd_pg_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_upd_pg_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_upd_pg_nm_Enabled, 5, 0)));
      gxvctltam07_site_id_html0U2( ) ;
      gxvctltam07_kngn_ptn_kbn_html0U2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e150U2 */
      e150U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_tam07_user"), AV5BC_TAM07_USER);
         /* Read variables values. */
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_id( httpContext.cgiGet( edtavCtltam07_user_id_Internalname) );
         AV11D_TAM07_PWD = httpContext.cgiGet( edtavD_tam07_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_nm( httpContext.cgiGet( edtavCtltam07_user_nm_Internalname) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm( httpContext.cgiGet( edtavCtltam07_user_kana_nm_Internalname) );
         dynavCtltam07_site_id.setValue( httpContext.cgiGet( dynavCtltam07_site_id.getInternalname()) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_site_id( httpContext.cgiGet( dynavCtltam07_site_id.getInternalname()) );
         dynavCtltam07_kngn_ptn_kbn.setValue( httpContext.cgiGet( dynavCtltam07_kngn_ptn_kbn.getInternalname()) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_auth_cd( httpContext.cgiGet( dynavCtltam07_kngn_ptn_kbn.getInternalname()) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_email( httpContext.cgiGet( edtavCtltam07_email_Internalname) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_del_flg( httpContext.cgiGet( radavCtltam07_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam07_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "CTLTAM07_CRT_DATETIME");
            GX_FocusControl = edtavCtltam07_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam07_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam07_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "CTLTAM07_UPD_DATETIME");
            GX_FocusControl = edtavCtltam07_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam07_upd_datetime_Internalname)) );
         }
         AV10D_TAM07_CRT_USER_NM = httpContext.cgiGet( edtavD_tam07_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_CRT_USER_NM", AV10D_TAM07_CRT_USER_NM);
         AV12D_TAM07_UPD_USER_NM = httpContext.cgiGet( edtavD_tam07_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( httpContext.cgiGet( edtavCtltam07_crt_pg_nm_Internalname) );
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( httpContext.cgiGet( edtavCtltam07_upd_pg_nm_Internalname) );
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV15H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         /* Read saved values. */
         AV16P_TAM07_USER_ID = httpContext.cgiGet( "vP_TAM07_USER_ID") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0106") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0106", "");
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         gxvctltam07_site_id_html0U2( ) ;
         gxvctltam07_kngn_ptn_kbn_html0U2( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e150U2 */
      e150U2 ();
      if (returnInSub) return;
   }

   public void e150U2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "A207" ;
      AV8C_GAMEN_TITLE = AV41Pgmdesc ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV8C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0106",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e160U2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "INFO", "画面起動") ;
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

   public void e110U2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "0") == 0 )
         {
            AV26W_ERRFLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV26W_ERRFLG )
            {
               GXt_char2 = AV27W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV27W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e170U2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new b801_pc01_md5(remoteHandle, context).execute( AV11D_TAM07_PWD, GXv_char3) ;
      a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_pwd( GXt_char2 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( AV42Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( AV42Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.Save();
      if ( AV5BC_TAM07_USER.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a207_wp01_user_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
   }

   public void e120U2( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
         {
            AV26W_ERRFLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV26W_ERRFLG )
            {
               GXt_char2 = AV27W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV27W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e180U2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      if ( ! (GXutil.strcmp("", AV11D_TAM07_PWD)==0) )
      {
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new b801_pc01_md5(remoteHandle, context).execute( AV11D_TAM07_PWD, GXv_char3) ;
         a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
         AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_pwd( GXt_char2 );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      }
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( AV42Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.Save();
      if ( AV5BC_TAM07_USER.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a206_wp01_user_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
   }

   public void e130U2( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV14H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
         {
            AV26W_ERRFLG = false ;
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV26W_ERRFLG )
            {
               GXt_char2 = AV27W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV27W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_DLT_EXEC", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e190U2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      AV5BC_TAM07_USER.Delete();
      if ( AV5BC_TAM07_USER.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a206_wp01_user_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
   }

   public void e140U2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a206_wp01_user_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
      if ( (GXutil.strcmp("", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id())==0) )
      {
      }
      else
      {
         AV43GXLvl346 = (byte)(0) ;
         /* Using cursor H000U4 */
         pr_default.execute(2, new Object[] {AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id()});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A8TAM07_USER_ID = H000U4_A8TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            A37TAM07_UPD_DATETIME = H000U4_A37TAM07_UPD_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n37TAM07_UPD_DATETIME = H000U4_n37TAM07_UPD_DATETIME[0] ;
            AV43GXLvl346 = (byte)(1) ;
            if ( (GXutil.strcmp("", AV16P_TAM07_USER_ID)==0) )
            {
               GXt_char2 = AV27W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV27W_MSG = GXt_char2 ;
               httpContext.GX_msglist.addItem(AV27W_MSG);
               edtavCtltam07_user_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Backcolor, 9, 0)));
               if ( ! AV26W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam07_user_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               AV26W_ERRFLG = true ;
            }
            else
            {
               if ( !( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_datetime().equals( A37TAM07_UPD_DATETIME ) ) )
               {
                  GXt_char2 = AV27W_MSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
                  a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV27W_MSG = GXt_char2 ;
                  httpContext.GX_msglist.addItem(AV27W_MSG);
                  AV26W_ERRFLG = true ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV43GXLvl346 == 0 )
         {
            if ( ! (GXutil.strcmp("", AV16P_TAM07_USER_ID)==0) )
            {
               GXt_char2 = AV27W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               AV27W_MSG = GXt_char2 ;
               httpContext.GX_msglist.addItem(AV27W_MSG);
               edtavCtltam07_user_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Backcolor, 9, 0)));
               if ( ! AV26W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam07_user_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               AV26W_ERRFLG = true ;
            }
         }
      }
      if ( ! (GXutil.strcmp("", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id())==0) )
      {
         AV44GXLvl387 = (byte)(0) ;
         /* Using cursor H000U5 */
         pr_default.execute(3, new Object[] {AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id()});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A139TAM08_DEL_FLG = H000U5_A139TAM08_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
            n139TAM08_DEL_FLG = H000U5_n139TAM08_DEL_FLG[0] ;
            A132TAM08_SITE_ID = H000U5_A132TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            AV44GXLvl387 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV44GXLvl387 == 0 )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", "選択した施設ID", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV27W_MSG);
            dynavCtltam07_site_id.setIBackground( UIFactory.getColor( 255, 192, 203) );
            httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_site_id.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( dynavCtltam07_site_id.getIBackground(), 9, 0)));
            if ( ! AV26W_ERRFLG )
            {
               GX_FocusControl = dynavCtltam07_site_id.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               AV26W_ERRFLG = true ;
            }
         }
      }
      if ( ! (GXutil.strcmp("", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd())==0) )
      {
         AV45GXLvl405 = (byte)(0) ;
         /* Using cursor H000U6 */
         pr_default.execute(4, new Object[] {AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd()});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A18TAM04_DEL_FLG = H000U6_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000U6_n18TAM04_DEL_FLG[0] ;
            A17TAM04_AUTH_CD = H000U6_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            AV45GXLvl405 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( AV45GXLvl405 == 0 )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", "選択した権限パターン区分", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV27W_MSG);
            dynavCtltam07_kngn_ptn_kbn.setIBackground( UIFactory.getColor( 255, 192, 203) );
            httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_kngn_ptn_kbn.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( dynavCtltam07_kngn_ptn_kbn.getIBackground(), 9, 0)));
            if ( ! AV26W_ERRFLG )
            {
               GX_FocusControl = dynavCtltam07_kngn_ptn_kbn.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               AV26W_ERRFLG = true ;
            }
         }
      }
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV18W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV21W_A_RESULT_MSG_SDT ;
      new a207_pc01_user_mst_chk(remoteHandle, context).execute( AV5BC_TAM07_USER, AV11D_TAM07_PWD, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
      AV18W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
      AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
      if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV26W_ERRFLG = true ;
         AV46GXV12 = 1 ;
         while ( AV46GXV12 <= AV21W_A_RESULT_MSG_SDT.size() )
         {
            AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV46GXV12));
            httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV46GXV12 = (int)(AV46GXV12+1) ;
         }
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltam07_user_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Backcolor, 9, 0)));
      edtavCtltam07_user_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_nm_Backcolor, 9, 0)));
      edtavCtltam07_user_kana_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_kana_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_kana_nm_Backcolor, 9, 0)));
      edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
      dynavCtltam07_kngn_ptn_kbn.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_kngn_ptn_kbn.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( dynavCtltam07_kngn_ptn_kbn.getIBackground(), 9, 0)));
      dynavCtltam07_site_id.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_site_id.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( dynavCtltam07_site_id.getIBackground(), 9, 0)));
      edtavCtltam07_email_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_email_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_email_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV47GXV13 = 1 ;
      while ( AV47GXV13 <= AV18W_A_CHK_RESULT_SDT.size() )
      {
         AV19W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV18W_A_CHK_RESULT_SDT.elementAt(-1+AV47GXV13));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV47GXV13 = (int)(AV47GXV13+1) ;
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM07_USER_ID") == 0 )
      {
         edtavCtltam07_user_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam07_user_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM07_USER_NM") == 0 )
      {
         edtavCtltam07_user_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_nm_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam07_user_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM07_USER_KANA_NM") == 0 )
      {
         edtavCtltam07_user_kana_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_kana_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_user_kana_nm_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam07_user_kana_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM07_PWD") == 0 )
      {
         edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavD_tam07_pwd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM07_EMAIL") == 0 )
      {
         edtavCtltam07_email_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_email_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam07_email_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam07_email_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV16P_TAM07_USER_ID)==0) )
      {
         AV15H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV5BC_TAM07_USER.Load(AV16P_TAM07_USER_ID);
         if ( AV5BC_TAM07_USER.Fail() )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV27W_MSG);
         }
         else
         {
            AV48GXLvl530 = (byte)(0) ;
            /* Using cursor H000U7 */
            pr_default.execute(5, new Object[] {AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_user_id()});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A8TAM07_USER_ID = H000U7_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H000U7_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H000U7_n2TAM07_USER_NM[0] ;
               AV48GXLvl530 = (byte)(1) ;
               GXt_char2 = AV10D_TAM07_CRT_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV10D_TAM07_CRT_USER_NM = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_CRT_USER_NM", AV10D_TAM07_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            if ( AV48GXLvl530 == 0 )
            {
               AV10D_TAM07_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_CRT_USER_NM", AV10D_TAM07_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_user_id(), AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_user_id()) == 0 )
            {
               AV12D_TAM07_UPD_USER_NM = AV10D_TAM07_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
            }
            else
            {
               AV49GXLvl545 = (byte)(0) ;
               /* Using cursor H000U8 */
               pr_default.execute(6, new Object[] {AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_user_id()});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A8TAM07_USER_ID = H000U8_A8TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
                  A2TAM07_USER_NM = H000U8_A2TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  n2TAM07_USER_NM = H000U8_n2TAM07_USER_NM[0] ;
                  AV49GXLvl545 = (byte)(1) ;
                  GXt_char2 = AV12D_TAM07_UPD_USER_NM ;
                  GXv_char3[0] = GXt_char2 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
                  a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  AV12D_TAM07_UPD_USER_NM = GXt_char2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(6);
               if ( AV49GXLvl545 == 0 )
               {
                  AV12D_TAM07_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
               }
            }
         }
         tblTbl_ins_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam07_user_id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Enabled, 5, 0)));
         edtavCtltam07_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam07_crt_datetime_Visible, 5, 0)));
         edtavCtltam07_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam07_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam07_user_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV15H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam07_user_id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_user_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam07_user_id_Enabled, 5, 0)));
         edtavCtltam07_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam07_crt_datetime_Visible, 5, 0)));
         edtavCtltam07_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam07_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam07_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam07_user_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV7C_BCMSGS = AV5BC_TAM07_USER.GetMessages() ;
      AV50GXV14 = 1 ;
      while ( AV50GXV14 <= AV7C_BCMSGS.size() )
      {
         AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV50GXV14));
         if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
         }
         else if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char2 = AV27W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            a207_wp01_user_mst_impl.this.GXt_char2 = GXv_char3[0] ;
            AV27W_MSG = GXt_char2 ;
         }
         else
         {
            AV27W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
         }
         AV50GXV14 = (int)(AV50GXV14+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV25W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      a207_wp01_user_mst_impl.this.AV25W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
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
      AV24W_A821_JS = "" ;
      AV23W_A819_JS = "" ;
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_pwd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_auth_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_site_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_email( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV10D_TAM07_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_CRT_USER_NM", AV10D_TAM07_CRT_USER_NM);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV12D_TAM07_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
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
      if ( ! (GXutil.strcmp("", AV24W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV24W_A821_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (GXutil.strcmp("", AV23W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV23W_A819_JS ;
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
      GXv_char3[0] = AV14H_KNGN_FLG ;
      GXv_char8[0] = AV25W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char3, GXv_char8) ;
      a207_wp01_user_mst_impl.this.AV14H_KNGN_FLG = GXv_char3[0] ;
      a207_wp01_user_mst_impl.this.AV25W_ERRCD = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S23736( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a207_wp01_user_mst");
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
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV14H_KNGN_FLG, "", GXv_boolean10) ;
         a207_wp01_user_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
         {
            lblTxt_btn_upd2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
         }
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV14H_KNGN_FLG, "", GXv_boolean10) ;
         a207_wp01_user_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
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
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV14H_KNGN_FLG, "", GXv_boolean10) ;
         a207_wp01_user_mst_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
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

   protected void e200U2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_0U2( boolean wbgen )
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
         wb_table2_6_0U2( true) ;
      }
      else
      {
         wb_table2_6_0U2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0U2e( boolean wbgen )
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
         wb_table1_2_0U2e( true) ;
      }
      else
      {
         wb_table1_2_0U2e( false) ;
      }
   }

   public void wb_table2_6_0U2( boolean wbgen )
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
         wb_table3_12_0U2( true) ;
      }
      else
      {
         wb_table3_12_0U2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_20_0U2( true) ;
      }
      else
      {
         wb_table4_20_0U2( false) ;
      }
      return  ;
   }

   public void wb_table4_20_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_34_0U2( true) ;
      }
      else
      {
         wb_table5_34_0U2( false) ;
      }
      return  ;
   }

   public void wb_table5_34_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_97_0U2( true) ;
      }
      else
      {
         wb_table6_97_0U2( false) ;
      }
      return  ;
   }

   public void wb_table6_97_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0106"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0106"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0106"+"");
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
         wb_table2_6_0U2e( true) ;
      }
      else
      {
         wb_table2_6_0U2e( false) ;
      }
   }

   public void wb_table6_97_0U2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(101);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV15H_MODE), GXutil.rtrim( localUtil.format( AV15H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(102);\"", "", "", "", "", edtavH_mode_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_97_0U2e( true) ;
      }
      else
      {
         wb_table6_97_0U2e( false) ;
      }
   }

   public void wb_table5_34_0U2( boolean wbgen )
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
         wb_table7_40_0U2( true) ;
      }
      else
      {
         wb_table7_40_0U2( false) ;
      }
      return  ;
   }

   public void wb_table7_40_0U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_34_0U2e( true) ;
      }
      else
      {
         wb_table5_34_0U2e( false) ;
      }
   }

   public void wb_table7_40_0U2( boolean wbgen )
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
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "&nbsp;ユーザーID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:275px\">") ;
         httpContext.writeText( "<div style=\"WIDTH: 270px\" class=\"SectionWordBreak\" id=\"Section1\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltam07_user_id_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_user_id_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(47);\"", "", "", "", "", edtavCtltam07_user_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltam07_user_id_Enabled, 1, 35, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "&nbsp;パスワード ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavD_tam07_pwd_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_Internalname, GXutil.rtrim( AV11D_TAM07_PWD), GXutil.rtrim( localUtil.format( AV11D_TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "", "", "", "", edtavD_tam07_pwd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 35, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "&nbsp;氏名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_nm()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltam07_user_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_user_nm_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_nm()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "", "", "", "", edtavCtltam07_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "氏名（カナ）") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltam07_user_kana_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_user_kana_nm_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "", "", "", "", edtavCtltam07_user_kana_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "施設ID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id());
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( dynavCtltam07_site_id.getIBackground()) + ";" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynavCtltam07_site_id, dynavCtltam07_site_id.getInternalname(), AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id(), 1, dynavCtltam07_site_id.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 270, "px", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", true, "HLP_A207_WP01_USER_MST.htm");
         dynavCtltam07_site_id.setValue( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_site_id() );
         httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_site_id.getInternalname(), "Values", dynavCtltam07_site_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "権限パターン区分") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd());
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( dynavCtltam07_kngn_ptn_kbn.getIBackground()) + ";" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynavCtltam07_kngn_ptn_kbn, dynavCtltam07_kngn_ptn_kbn.getInternalname(), AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd(), 1, dynavCtltam07_kngn_ptn_kbn.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 270, "px", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(66);\"", "", true, "HLP_A207_WP01_USER_MST.htm");
         dynavCtltam07_kngn_ptn_kbn.setValue( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_auth_cd() );
         httpContext.ajax_rsp_assign_prop("", false, dynavCtltam07_kngn_ptn_kbn.getInternalname(), "Values", dynavCtltam07_kngn_ptn_kbn.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "メールアドレス") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_email()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_email());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltam07_email_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_email_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_email()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_email(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(70);\"", "", "", "", "", edtavCtltam07_email_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 35, "chr", 1, "row", 256, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_del_flg()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_del_flg());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltam07_del_flg, radavCtltam07_del_flg.getInternalname(), AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_del_flg(), "", 1, 1, 0, 0, StyleString, ClassString, 0, radavCtltam07_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "HLP_A207_WP01_USER_MST.htm");
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
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_datetime()", localUtil.ttoc( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltam07_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_crt_datetime_Internalname, localUtil.format(AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltam07_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltam07_crt_datetime_Visible, edtavCtltam07_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_A207_WP01_USER_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam07_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltam07_crt_datetime_Visible==0)||(edtavCtltam07_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_datetime()", localUtil.ttoc( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltam07_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_upd_datetime_Internalname, localUtil.format(AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltam07_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltam07_upd_datetime_Visible, edtavCtltam07_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_A207_WP01_USER_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam07_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltam07_upd_datetime_Visible==0)||(edtavCtltam07_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_CRT_USER_NM", AV10D_TAM07_CRT_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_crt_user_nm_Internalname, GXutil.rtrim( AV10D_TAM07_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV10D_TAM07_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(86);\"", "", "", "", "", edtavD_tam07_crt_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_tam07_crt_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_UPD_USER_NM", AV12D_TAM07_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_upd_user_nm_Internalname, GXutil.rtrim( AV12D_TAM07_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV12D_TAM07_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "", "", "", "", edtavD_tam07_upd_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_tam07_upd_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_crt_pg_nm_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltam07_crt_pg_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltam07_crt_pg_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm()", AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam07_upd_pg_nm_Internalname, GXutil.rtrim( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_TAM07_USER.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltam07_upd_pg_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltam07_upd_pg_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_40_0U2e( true) ;
      }
      else
      {
         wb_table7_40_0U2e( false) ;
      }
   }

   public void wb_table4_20_0U2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "E\\'BTN_DLT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt2_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_dlt2_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_0U2e( true) ;
      }
      else
      {
         wb_table4_20_0U2e( false) ;
      }
   }

   public void wb_table3_12_0U2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "登録（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "戻る（F11）", "", "", lblTextblock43_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A207_WP01_USER_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0U2e( true) ;
      }
      else
      {
         wb_table3_12_0U2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV16P_TAM07_USER_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM07_USER_ID", AV16P_TAM07_USER_ID);
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
      pa0U2( ) ;
      ws0U2( ) ;
      we0U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14591985");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("a207_wp01_user_mst.js", "?14591985");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      tblTbl_ins_btnset_Internalname = "TBL_INS_BTNSET" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_upd2_Internalname = "TXT_BTN_UPD2" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_dlt2_Internalname = "TXT_BTN_DLT2" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCtltam07_user_id_Internalname = "CTLTAM07_USER_ID" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavD_tam07_pwd_Internalname = "vD_TAM07_PWD" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM" ;
      edtavCtltam07_user_kana_nm_Internalname = "CTLTAM07_USER_KANA_NM" ;
      dynavCtltam07_site_id.setInternalname( "CTLTAM07_SITE_ID" );
      dynavCtltam07_kngn_ptn_kbn.setInternalname( "CTLTAM07_KNGN_PTN_KBN" );
      edtavCtltam07_email_Internalname = "CTLTAM07_EMAIL" ;
      radavCtltam07_del_flg.setInternalname( "CTLTAM07_DEL_FLG" );
      edtavCtltam07_crt_datetime_Internalname = "CTLTAM07_CRT_DATETIME" ;
      edtavCtltam07_upd_datetime_Internalname = "CTLTAM07_UPD_DATETIME" ;
      edtavD_tam07_crt_user_nm_Internalname = "vD_TAM07_CRT_USER_NM" ;
      edtavD_tam07_upd_user_nm_Internalname = "vD_TAM07_UPD_USER_NM" ;
      edtavCtltam07_crt_pg_nm_Internalname = "CTLTAM07_CRT_PG_NM" ;
      edtavCtltam07_upd_pg_nm_Internalname = "CTLTAM07_UPD_PG_NM" ;
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
      edtavCtltam07_upd_pg_nm_Jsonclick = "" ;
      edtavCtltam07_upd_pg_nm_Enabled = 0 ;
      edtavCtltam07_crt_pg_nm_Jsonclick = "" ;
      edtavCtltam07_crt_pg_nm_Enabled = 0 ;
      edtavD_tam07_upd_user_nm_Jsonclick = "" ;
      edtavD_tam07_upd_user_nm_Enabled = 1 ;
      edtavD_tam07_crt_user_nm_Jsonclick = "" ;
      edtavD_tam07_crt_user_nm_Enabled = 1 ;
      edtavCtltam07_upd_datetime_Jsonclick = "" ;
      edtavCtltam07_upd_datetime_Enabled = 0 ;
      edtavCtltam07_upd_datetime_Visible = 1 ;
      edtavCtltam07_crt_datetime_Jsonclick = "" ;
      edtavCtltam07_crt_datetime_Enabled = 0 ;
      edtavCtltam07_crt_datetime_Visible = 1 ;
      radavCtltam07_del_flg.setJsonclick( "" );
      edtavCtltam07_email_Jsonclick = "" ;
      edtavCtltam07_email_Backstyle = (byte)(-1) ;
      edtavCtltam07_email_Backcolor = (int)(0xFFFFFF) ;
      dynavCtltam07_kngn_ptn_kbn.setJsonclick( "" );
      dynavCtltam07_kngn_ptn_kbn.setBackstyle( (byte)(-1) );
      dynavCtltam07_kngn_ptn_kbn.setIBackground( (int)(0xFFFFFF) );
      dynavCtltam07_site_id.setJsonclick( "" );
      dynavCtltam07_site_id.setBackstyle( (byte)(-1) );
      dynavCtltam07_site_id.setIBackground( (int)(0xFFFFFF) );
      edtavCtltam07_user_kana_nm_Jsonclick = "" ;
      edtavCtltam07_user_kana_nm_Backstyle = (byte)(-1) ;
      edtavCtltam07_user_kana_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam07_user_nm_Jsonclick = "" ;
      edtavCtltam07_user_nm_Backstyle = (byte)(-1) ;
      edtavCtltam07_user_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavD_tam07_pwd_Jsonclick = "" ;
      edtavD_tam07_pwd_Backstyle = (byte)(-1) ;
      edtavCtltam07_user_id_Jsonclick = "" ;
      edtavCtltam07_user_id_Backstyle = (byte)(-1) ;
      edtavCtltam07_user_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam07_user_id_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltam07_user_id_Enabled = 1 ;
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      edtavCtltam07_email_Backcolor = (int)(0xFFFFFF) ;
      edtavD_tam07_pwd_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam07_user_kana_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam07_user_nm_Backcolor = (int)(0xFFFFFF) ;
      dynavCtltam07_kngn_ptn_kbn.setIBackground( (int)(0xFFFFFF) );
      dynavCtltam07_site_id.setIBackground( (int)(0xFFFFFF) );
      edtavCtltam07_user_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltam07_upd_pg_nm_Enabled = -1 ;
      edtavCtltam07_crt_pg_nm_Enabled = -1 ;
      edtavCtltam07_upd_datetime_Enabled = -1 ;
      edtavCtltam07_crt_datetime_Enabled = -1 ;
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
                  /* Execute user subroutine: S23736 */
                  S23736 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_TAM07_USER = new SdtTAM07_USER(remoteHandle);
      wcpOAV16P_TAM07_USER_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16P_TAM07_USER_ID = "" ;
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
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H000U2_A132TAM08_SITE_ID = new String[] {""} ;
      H000U2_A133TAM08_SITE_NM = new String[] {""} ;
      H000U2_n133TAM08_SITE_NM = new boolean[] {false} ;
      H000U2_A139TAM08_DEL_FLG = new String[] {""} ;
      H000U2_n139TAM08_DEL_FLG = new boolean[] {false} ;
      H000U3_A17TAM04_AUTH_CD = new String[] {""} ;
      H000U3_A98TAM04_AUTH_NM = new String[] {""} ;
      H000U3_n98TAM04_AUTH_NM = new boolean[] {false} ;
      H000U3_A18TAM04_DEL_FLG = new String[] {""} ;
      H000U3_n18TAM04_DEL_FLG = new boolean[] {false} ;
      AV42Pgmname = "" ;
      AV41Pgmdesc = "" ;
      AV11D_TAM07_PWD = "" ;
      AV10D_TAM07_CRT_USER_NM = "" ;
      AV12D_TAM07_UPD_USER_NM = "" ;
      AV13H_INIT_FLG = "" ;
      AV15H_MODE = "" ;
      AV14H_KNGN_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV27W_MSG = "" ;
      AV24W_A821_JS = "" ;
      H000U4_A8TAM07_USER_ID = new String[] {""} ;
      H000U4_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H000U4_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      H000U5_A139TAM08_DEL_FLG = new String[] {""} ;
      H000U5_n139TAM08_DEL_FLG = new boolean[] {false} ;
      H000U5_A132TAM08_SITE_ID = new String[] {""} ;
      A139TAM08_DEL_FLG = "" ;
      A132TAM08_SITE_ID = "" ;
      H000U6_A18TAM04_DEL_FLG = new String[] {""} ;
      H000U6_n18TAM04_DEL_FLG = new boolean[] {false} ;
      H000U6_A17TAM04_AUTH_CD = new String[] {""} ;
      A18TAM04_DEL_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      AV18W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV19W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H000U7_A8TAM07_USER_ID = new String[] {""} ;
      H000U7_A2TAM07_USER_NM = new String[] {""} ;
      H000U7_n2TAM07_USER_NM = new boolean[] {false} ;
      A2TAM07_USER_NM = "" ;
      H000U8_A8TAM07_USER_ID = new String[] {""} ;
      H000U8_A2TAM07_USER_NM = new String[] {""} ;
      H000U8_n2TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV25W_ERRCD = "" ;
      AV23W_A819_JS = "" ;
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
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_upd2_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTxt_btn_dlt2_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a207_wp01_user_mst__default(),
         new Object[] {
             new Object[] {
            H000U2_A132TAM08_SITE_ID, H000U2_A133TAM08_SITE_NM, H000U2_n133TAM08_SITE_NM, H000U2_A139TAM08_DEL_FLG, H000U2_n139TAM08_DEL_FLG
            }
            , new Object[] {
            H000U3_A17TAM04_AUTH_CD, H000U3_A98TAM04_AUTH_NM, H000U3_n98TAM04_AUTH_NM, H000U3_A18TAM04_DEL_FLG, H000U3_n18TAM04_DEL_FLG
            }
            , new Object[] {
            H000U4_A8TAM07_USER_ID, H000U4_A37TAM07_UPD_DATETIME, H000U4_n37TAM07_UPD_DATETIME
            }
            , new Object[] {
            H000U5_A139TAM08_DEL_FLG, H000U5_n139TAM08_DEL_FLG, H000U5_A132TAM08_SITE_ID
            }
            , new Object[] {
            H000U6_A18TAM04_DEL_FLG, H000U6_n18TAM04_DEL_FLG, H000U6_A17TAM04_AUTH_CD
            }
            , new Object[] {
            H000U7_A8TAM07_USER_ID, H000U7_A2TAM07_USER_NM, H000U7_n2TAM07_USER_NM
            }
            , new Object[] {
            H000U8_A8TAM07_USER_ID, H000U8_A2TAM07_USER_NM, H000U8_n2TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV42Pgmname = "A207_WP01_USER_MST" ;
      AV41Pgmdesc = "ユーザーマスタメンテナンス（入力）" ;
      /* GeneXus formulas. */
      AV42Pgmname = "A207_WP01_USER_MST" ;
      AV41Pgmdesc = "ユーザーマスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltam07_crt_datetime_Enabled = 0 ;
      edtavCtltam07_upd_datetime_Enabled = 0 ;
      edtavD_tam07_crt_user_nm_Enabled = 0 ;
      edtavD_tam07_upd_user_nm_Enabled = 0 ;
      edtavCtltam07_crt_pg_nm_Enabled = 0 ;
      edtavCtltam07_upd_pg_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV43GXLvl346 ;
   private byte AV44GXLvl387 ;
   private byte AV45GXLvl405 ;
   private byte AV48GXLvl530 ;
   private byte AV49GXLvl545 ;
   private byte nGXWrapped ;
   private byte edtavCtltam07_email_Backstyle ;
   private byte edtavCtltam07_user_kana_nm_Backstyle ;
   private byte edtavCtltam07_user_nm_Backstyle ;
   private byte edtavD_tam07_pwd_Backstyle ;
   private byte edtavCtltam07_user_id_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int gxdynajaxindex ;
   private int edtavCtltam07_crt_datetime_Enabled ;
   private int edtavCtltam07_upd_datetime_Enabled ;
   private int edtavD_tam07_crt_user_nm_Enabled ;
   private int edtavD_tam07_upd_user_nm_Enabled ;
   private int edtavCtltam07_crt_pg_nm_Enabled ;
   private int edtavCtltam07_upd_pg_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavCtltam07_user_id_Backcolor ;
   private int AV46GXV12 ;
   private int edtavCtltam07_user_nm_Backcolor ;
   private int edtavCtltam07_user_kana_nm_Backcolor ;
   private int edtavD_tam07_pwd_Backcolor ;
   private int edtavCtltam07_email_Backcolor ;
   private int AV47GXV13 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltam07_user_id_Enabled ;
   private int edtavCtltam07_crt_datetime_Visible ;
   private int edtavCtltam07_upd_datetime_Visible ;
   private int AV50GXV14 ;
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
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV42Pgmname ;
   private String AV41Pgmdesc ;
   private String edtavCtltam07_crt_datetime_Internalname ;
   private String edtavCtltam07_upd_datetime_Internalname ;
   private String edtavD_tam07_crt_user_nm_Internalname ;
   private String edtavD_tam07_upd_user_nm_Internalname ;
   private String edtavCtltam07_crt_pg_nm_Internalname ;
   private String edtavCtltam07_upd_pg_nm_Internalname ;
   private String edtavCtltam07_user_id_Internalname ;
   private String edtavD_tam07_pwd_Internalname ;
   private String edtavCtltam07_user_nm_Internalname ;
   private String edtavCtltam07_user_kana_nm_Internalname ;
   private String edtavCtltam07_email_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
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
   private String edtavCtltam07_user_id_Jsonclick ;
   private String imgImage4_Internalname ;
   private String edtavD_tam07_pwd_Jsonclick ;
   private String imgImage3_Internalname ;
   private String edtavCtltam07_user_nm_Jsonclick ;
   private String edtavCtltam07_user_kana_nm_Jsonclick ;
   private String edtavCtltam07_email_Jsonclick ;
   private String edtavCtltam07_crt_datetime_Jsonclick ;
   private String edtavCtltam07_upd_datetime_Jsonclick ;
   private String GXt_char1 ;
   private String edtavD_tam07_crt_user_nm_Jsonclick ;
   private String GXt_char2 ;
   private String edtavD_tam07_upd_user_nm_Jsonclick ;
   private String edtavCtltam07_crt_pg_nm_Jsonclick ;
   private String edtavCtltam07_upd_pg_nm_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_upd2_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_dlt2_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A37TAM07_UPD_DATETIME ;
   private java.util.Date GXt_dtime7 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV26W_ERRFLG ;
   private boolean n37TAM07_UPD_DATETIME ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n2TAM07_USER_NM ;
   private boolean GXt_boolean9 ;
   private boolean GXv_boolean10[] ;
   private String wcpOAV16P_TAM07_USER_ID ;
   private String AV16P_TAM07_USER_ID ;
   private String AV11D_TAM07_PWD ;
   private String AV10D_TAM07_CRT_USER_NM ;
   private String AV12D_TAM07_UPD_USER_NM ;
   private String AV13H_INIT_FLG ;
   private String AV15H_MODE ;
   private String AV14H_KNGN_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV27W_MSG ;
   private String AV24W_A821_JS ;
   private String A8TAM07_USER_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A132TAM08_SITE_ID ;
   private String A18TAM04_DEL_FLG ;
   private String A17TAM04_AUTH_CD ;
   private String A2TAM07_USER_NM ;
   private String AV25W_ERRCD ;
   private String AV23W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private SdtTAM07_USER AV5BC_TAM07_USER ;
   private HTMLChoice dynavCtltam07_site_id ;
   private HTMLChoice dynavCtltam07_kngn_ptn_kbn ;
   private HTMLChoice radavCtltam07_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H000U2_A132TAM08_SITE_ID ;
   private String[] H000U2_A133TAM08_SITE_NM ;
   private boolean[] H000U2_n133TAM08_SITE_NM ;
   private String[] H000U2_A139TAM08_DEL_FLG ;
   private boolean[] H000U2_n139TAM08_DEL_FLG ;
   private String[] H000U3_A17TAM04_AUTH_CD ;
   private String[] H000U3_A98TAM04_AUTH_NM ;
   private boolean[] H000U3_n98TAM04_AUTH_NM ;
   private String[] H000U3_A18TAM04_DEL_FLG ;
   private boolean[] H000U3_n18TAM04_DEL_FLG ;
   private String[] H000U4_A8TAM07_USER_ID ;
   private java.util.Date[] H000U4_A37TAM07_UPD_DATETIME ;
   private boolean[] H000U4_n37TAM07_UPD_DATETIME ;
   private String[] H000U5_A139TAM08_DEL_FLG ;
   private boolean[] H000U5_n139TAM08_DEL_FLG ;
   private String[] H000U5_A132TAM08_SITE_ID ;
   private String[] H000U6_A18TAM04_DEL_FLG ;
   private boolean[] H000U6_n18TAM04_DEL_FLG ;
   private String[] H000U6_A17TAM04_AUTH_CD ;
   private String[] H000U7_A8TAM07_USER_ID ;
   private String[] H000U7_A2TAM07_USER_NM ;
   private boolean[] H000U7_n2TAM07_USER_NM ;
   private String[] H000U8_A8TAM07_USER_ID ;
   private String[] H000U8_A2TAM07_USER_NM ;
   private boolean[] H000U8_n2TAM07_USER_NM ;
   private GxObjectCollection AV18W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV19W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class a207_wp01_user_mst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000U2", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_NM`, `TAM08_DEL_FLG` FROM `TAM08_SITE` WHERE `TAM08_DEL_FLG` = '0' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H000U3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM`, `TAM04_DEL_FLG` FROM `TAM04_KNGN` WHERE `TAM04_DEL_FLG` = '0' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H000U4", "SELECT `TAM07_USER_ID`, `TAM07_UPD_DATETIME` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000U5", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000U6", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000U7", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000U8", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 6 :
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
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
      }
   }

}

