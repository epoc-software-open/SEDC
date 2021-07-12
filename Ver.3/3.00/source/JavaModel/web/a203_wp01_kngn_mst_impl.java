/*
               File: a203_wp01_kngn_mst_impl
        Description: 権限パターンマスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:36.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a203_wp01_kngn_mst_impl extends GXWebPanel
{
   public a203_wp01_kngn_mst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a203_wp01_kngn_mst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a203_wp01_kngn_mst_impl.class ));
   }

   public a203_wp01_kngn_mst_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtltam04_auth_lvl = new HTMLChoice();
      radavCtltam04_del_flg = new HTMLChoice();
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
            AV16P_TAM04_KNGN_PTN_KBN = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM04_KNGN_PTN_KBN", AV16P_TAM04_KNGN_PTN_KBN);
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
         pa0Q2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0Q2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0Q2( ) ;
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
      httpContext.writeValue( "権限パターンマスタメンテナンス（入力）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513223667");
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
      GXEncryptionTmp = "a203_wp01_kngn_mst"+GXutil.URLEncode(GXutil.rtrim(AV16P_TAM04_KNGN_PTN_KBN)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a203_wp01_kngn_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0Q2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_tam04_kngn", AV6BC_TAM04_KNGN);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_tam04_kngn", AV6BC_TAM04_KNGN);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_TAM04_KNGN_PTN_KBN", GXutil.rtrim( AV16P_TAM04_KNGN_PTN_KBN));
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
      return "A203_WP01_KNGN_MST" ;
   }

   public String getPgmdesc( )
   {
      return "権限パターンマスタメンテナンス（入力）" ;
   }

   public void wb0Q0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0Q2( true) ;
      }
      else
      {
         wb_table1_2_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0Q2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "権限パターンマスタメンテナンス（入力）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0091") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0091", "");
         }
      }
      wbErr = false ;
      strup0Q0( ) ;
   }

   public void ws0Q2( )
   {
      start0Q2( ) ;
      evt0Q2( ) ;
   }

   public void evt0Q2( )
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
                        /* Execute user event: e110Q2 */
                        e110Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120Q2 */
                        e120Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130Q2 */
                        e130Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140Q2 */
                        e140Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150Q2 */
                        e150Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160Q2 */
                        e160Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "CTLTAM04_KNGN_PTN_KBN.ISVALID") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170Q2 */
                        e170Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180Q2 */
                        e180Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190Q2 */
                        e190Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200Q2 */
                        e200Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210Q2 */
                        e210Q2 ();
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
                  else if ( nCmpId == 91 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0091") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0091", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0Q2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0Q2( ) ;
         }
      }
   }

   public void pa0Q2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a203_wp01_kngn_mst")), "a203_wp01_kngn_mst") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a203_wp01_kngn_mst"))) ;
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
                  AV16P_TAM04_KNGN_PTN_KBN = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM04_KNGN_PTN_KBN", AV16P_TAM04_KNGN_PTN_KBN);
               }
            }
         }
         cmbavCtltam04_auth_lvl.setName( "CTLTAM04_AUTH_LVL" );
         cmbavCtltam04_auth_lvl.setWebtags( "" );
         if ( cmbavCtltam04_auth_lvl.getItemCount() > 0 )
         {
            AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl( (byte)(GXutil.val( cmbavCtltam04_auth_lvl.getValidValue(GXutil.trim( GXutil.str( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl(), 2, 0))), ".")) );
         }
         radavCtltam04_del_flg.setName( "CTLTAM04_DEL_FLG" );
         radavCtltam04_del_flg.setWebtags( "" );
         radavCtltam04_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltam04_del_flg.addItem("1", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf0Q2( ) ;
      /* End function Refresh */
   }

   public void rf0Q2( )
   {
      /* Execute user event: e160Q2 */
      e160Q2 ();
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
         /* Execute user event: e210Q2 */
         e210Q2 ();
         wb0Q0( ) ;
      }
   }

   public void strup0Q0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "A203_WP01_KNGN_MST" ;
      AV39Pgmdesc = "権限パターンマスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_datetime_Enabled, 5, 0)));
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_datetime_Enabled, 5, 0)));
      edtavD_tam04_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam04_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam04_crt_user_nm_Enabled, 5, 0)));
      edtavD_tam04_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam04_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam04_upd_user_nm_Enabled, 5, 0)));
      edtavCtltam04_crt_pg_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_pg_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_pg_nm_Enabled, 5, 0)));
      edtavCtltam04_upd_pg_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_pg_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_pg_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e150Q2 */
      e150Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_tam04_kngn"), AV6BC_TAM04_KNGN);
         /* Read variables values. */
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_cd( httpContext.cgiGet( edtavCtltam04_kngn_ptn_kbn_Internalname) );
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_nm( httpContext.cgiGet( edtavCtltam04_kngn_ptn_nm_Internalname) );
         cmbavCtltam04_auth_lvl.setValue( httpContext.cgiGet( cmbavCtltam04_auth_lvl.getInternalname()) );
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl( (byte)(GXutil.val( httpContext.cgiGet( cmbavCtltam04_auth_lvl.getInternalname()), ".")) );
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_del_flg( httpContext.cgiGet( radavCtltam04_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam04_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM04_CRT_DATETIME");
            GX_FocusControl = edtavCtltam04_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam04_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam04_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM04_UPD_DATETIME");
            GX_FocusControl = edtavCtltam04_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam04_upd_datetime_Internalname)) );
         }
         AV11D_TAM04_CRT_USER_NM = httpContext.cgiGet( edtavD_tam04_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM04_CRT_USER_NM", AV11D_TAM04_CRT_USER_NM);
         AV12D_TAM04_UPD_USER_NM = httpContext.cgiGet( edtavD_tam04_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM04_UPD_USER_NM", AV12D_TAM04_UPD_USER_NM);
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm( httpContext.cgiGet( edtavCtltam04_crt_pg_nm_Internalname) );
         AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm( httpContext.cgiGet( edtavCtltam04_upd_pg_nm_Internalname) );
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV15H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         /* Read saved values. */
         AV16P_TAM04_KNGN_PTN_KBN = httpContext.cgiGet( "vP_TAM04_KNGN_PTN_KBN") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0091") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0091", "");
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
      /* Execute user event: e150Q2 */
      e150Q2 ();
      if (returnInSub) return;
   }

   public void e150Q2( )
   {
      /* Start Routine */
      AV10C_TAM02_APP_ID = "A203" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10C_TAM02_APP_ID", AV10C_TAM02_APP_ID);
      AV9C_GAMEN_TITLE = AV39Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_GAMEN_TITLE", AV9C_GAMEN_TITLE);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV10C_TAM02_APP_ID,AV9C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0091",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e160Q2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "画面起動") ;
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

   public void e170Q2( )
   {
      /* Ctltam04_kngn_ptn_kbn_Isvalid Routine */
      edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
      if ( ! (GXutil.strcmp("", AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd())==0) && (GXutil.strcmp("", AV16P_TAM04_KNGN_PTN_KBN)==0) )
      {
         /* Using cursor H000Q2 */
         pr_default.execute(0, new Object[] {AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd()});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A13TAM04_AUTH_CD = H000Q2_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            httpContext.GX_msglist.addItem(AV27W_MSG);
            edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
            GXt_char1 = AV23W_A819_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a819_pc01_set_focus(remoteHandle, context).execute( edtavCtltam04_kngn_ptn_kbn_Internalname, "0", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV23W_A819_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_A819_JS", AV23W_A819_JS);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
   }

   public void e110Q2( )
   {
      /* 'BTN_REG' Routine */
      if ( GXutil.strcmp(AV15H_MODE, "0") == 0 )
      {
         AV26W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
         if ( ! AV26W_ERRFLG )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            GXt_char1 = AV24W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            AV24W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
         }
      }
   }

   public void e180Q2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.Save();
      if ( AV6BC_TAM04_KNGN.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a202_wp01_kngn_ptn_reg"+GXutil.URLEncode(GXutil.rtrim(AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd())) ;
         httpContext.wjLoc = formatLink("a202_wp01_kngn_ptn_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
   }

   public void e120Q2( )
   {
      /* 'BTN_UPD' Routine */
      if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
      {
         AV26W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
         if ( ! AV26W_ERRFLG )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            GXt_char1 = AV24W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            AV24W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
         }
      }
   }

   public void e190Q2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm( AV40Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.Save();
      if ( AV6BC_TAM04_KNGN.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a201_wp01_kngn_ptn_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a201_wp01_kngn_ptn_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
   }

   public void e130Q2( )
   {
      /* 'BTN_DLT' Routine */
      if ( GXutil.strcmp(AV15H_MODE, "1") == 0 )
      {
         AV26W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
         if ( ! AV26W_ERRFLG )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            GXt_char1 = AV24W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV27W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            AV24W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
         }
      }
   }

   public void e200Q2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      AV5BC_KNGN_PTN_EXIST.Load(AV16P_TAM04_KNGN_PTN_KBN);
      if ( AV5BC_KNGN_PTN_EXIST.Fail() )
      {
         GXt_char1 = AV27W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00101", "", "", "", "", "", GXv_char2) ;
         a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         AV26W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
         httpContext.GX_msglist.addItem(AV27W_MSG);
      }
      else
      {
         AV5BC_KNGN_PTN_EXIST.Delete();
         if ( ! AV5BC_KNGN_PTN_EXIST.Success() )
         {
            AV26W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
            AV8C_BCMSGS = AV5BC_KNGN_PTN_EXIST.GetMessages() ;
            /* Execute user subroutine: S182 */
            S182 ();
            if (returnInSub) return;
         }
      }
      if ( ! AV26W_ERRFLG )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a201_wp01_kngn_ptn_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
         httpContext.wjLoc = formatLink("a201_wp01_kngn_ptn_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
      }
   }

   public void e140Q2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a201_wp01_kngn_ptn_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a201_wp01_kngn_ptn_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavCtltam04_auth_lvl.removeAllItems();
      /* Using cursor H000Q3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7TAS01_DATA_KIND = H000Q3_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A300TAS01_DEL_FLG = H000Q3_A300TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         n300TAS01_DEL_FLG = H000Q3_n300TAS01_DEL_FLG[0] ;
         A9TAS01_ITEM_NM = H000Q3_A9TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         n9TAS01_ITEM_NM = H000Q3_n9TAS01_ITEM_NM[0] ;
         A8TAS01_ITEM_CD = H000Q3_A8TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A335TAS01_SORT_NO = H000Q3_A335TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
         n335TAS01_SORT_NO = H000Q3_n335TAS01_SORT_NO[0] ;
         AV28W_AUTH_LVL = (byte)(GXutil.lval( A8TAS01_ITEM_CD)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_AUTH_LVL", GXutil.ltrim( GXutil.str( AV28W_AUTH_LVL, 2, 0)));
         cmbavCtltam04_auth_lvl.addItem(GXutil.ltrim( GXutil.str( AV28W_AUTH_LVL, 2, 0)), A9TAS01_ITEM_NM, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd())==0) )
      {
      }
      else
      {
         AV43GXLvl353 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl353", GXutil.str( AV43GXLvl353, 1, 0));
         /* Using cursor H000Q4 */
         pr_default.execute(2, new Object[] {AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd()});
         if ( Gx_err != 0 )
         {
            AV43GXLvl353 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl353", GXutil.str( AV43GXLvl353, 1, 0));
         }
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13TAM04_AUTH_CD = H000Q4_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            A235TAM04_UPD_DATETIME = H000Q4_A235TAM04_UPD_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n235TAM04_UPD_DATETIME = H000Q4_n235TAM04_UPD_DATETIME[0] ;
            AV43GXLvl353 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl353", GXutil.str( AV43GXLvl353, 1, 0));
            if ( (GXutil.strcmp("", AV16P_TAM04_KNGN_PTN_KBN)==0) )
            {
               GXt_char1 = AV27W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV27W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
               httpContext.GX_msglist.addItem(AV27W_MSG);
               edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
               if ( ! AV26W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam04_kngn_ptn_kbn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV26W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
            }
            else
            {
               if ( !( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime().equals( A235TAM04_UPD_DATETIME ) ) )
               {
                  GXt_char1 = AV27W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV27W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
                  httpContext.GX_msglist.addItem(AV27W_MSG);
                  AV26W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV43GXLvl353 == 0 )
         {
            if ( ! (GXutil.strcmp("", AV16P_TAM04_KNGN_PTN_KBN)==0) )
            {
               GXt_char1 = AV27W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV27W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
               httpContext.GX_msglist.addItem(AV27W_MSG);
               edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
               if ( ! AV26W_ERRFLG )
               {
                  GX_FocusControl = edtavCtltam04_kngn_ptn_kbn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV26W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
            }
         }
      }
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] = AV18W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] = AV21W_A_RESULT_MSG_SDT ;
      new a203_pc01_kngn_mst_chk(remoteHandle, context).execute( AV6BC_TAM04_KNGN, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4) ;
      AV18W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] ;
      AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] ;
      if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV26W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRFLG", AV26W_ERRFLG);
         AV44GXV9 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXV9", GXutil.ltrim( GXutil.str( AV44GXV9, 8, 0)));
         while ( AV44GXV9 <= AV21W_A_RESULT_MSG_SDT.size() )
         {
            AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV44GXV9));
            httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV44GXV9 = (int)(AV44GXV9+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44GXV9", GXutil.ltrim( GXutil.str( AV44GXV9, 8, 0)));
         }
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
      edtavCtltam04_kngn_ptn_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_nm_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV45GXV10 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GXV10", GXutil.ltrim( GXutil.str( AV45GXV10, 8, 0)));
      while ( AV45GXV10 <= AV18W_A_CHK_RESULT_SDT.size() )
      {
         AV19W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV18W_A_CHK_RESULT_SDT.elementAt(-1+AV45GXV10));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV45GXV10 = (int)(AV45GXV10+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV10", GXutil.ltrim( GXutil.str( AV45GXV10, 8, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM04_KNGN_PTN_KBN") == 0 )
      {
         edtavCtltam04_kngn_ptn_kbn_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam04_kngn_ptn_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TAM04_KNGN_PTN_NM") == 0 )
      {
         edtavCtltam04_kngn_ptn_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_nm_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltam04_kngn_ptn_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV16P_TAM04_KNGN_PTN_KBN)==0) )
      {
         AV15H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         AV6BC_TAM04_KNGN.Load(AV16P_TAM04_KNGN_PTN_KBN);
         if ( AV6BC_TAM04_KNGN.Fail() )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            httpContext.GX_msglist.addItem(AV27W_MSG);
         }
         else
         {
            AV46GXLvl478 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl478", GXutil.str( AV46GXLvl478, 1, 0));
            /* Using cursor H000Q5 */
            pr_default.execute(3, new Object[] {AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV46GXLvl478 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl478", GXutil.str( AV46GXLvl478, 1, 0));
            }
            while ( (pr_default.getStatus(3) != 101) )
            {
               A55TAM07_USER_ID = H000Q5_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H000Q5_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H000Q5_n205TAM07_USER_NM[0] ;
               AV46GXLvl478 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl478", GXutil.str( AV46GXLvl478, 1, 0));
               GXt_char1 = AV11D_TAM04_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV11D_TAM04_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM04_CRT_USER_NM", AV11D_TAM04_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV46GXLvl478 == 0 )
            {
               AV11D_TAM04_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM04_CRT_USER_NM", AV11D_TAM04_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_user_id(), AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_user_id()) == 0 )
            {
               AV12D_TAM04_UPD_USER_NM = AV11D_TAM04_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM04_UPD_USER_NM", AV12D_TAM04_UPD_USER_NM);
            }
            else
            {
               AV47GXLvl493 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl493", GXutil.str( AV47GXLvl493, 1, 0));
               /* Using cursor H000Q6 */
               pr_default.execute(4, new Object[] {AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV47GXLvl493 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl493", GXutil.str( AV47GXLvl493, 1, 0));
               }
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A55TAM07_USER_ID = H000Q6_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H000Q6_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H000Q6_n205TAM07_USER_NM[0] ;
                  AV47GXLvl493 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl493", GXutil.str( AV47GXLvl493, 1, 0));
                  GXt_char1 = AV12D_TAM04_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV12D_TAM04_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM04_UPD_USER_NM", AV12D_TAM04_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               if ( AV47GXLvl493 == 0 )
               {
                  AV12D_TAM04_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM04_UPD_USER_NM", AV12D_TAM04_UPD_USER_NM);
               }
            }
         }
         tblTbl_ins_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam04_kngn_ptn_kbn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Enabled, 5, 0)));
         edtavCtltam04_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_datetime_Visible, 5, 0)));
         edtavCtltam04_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam04_kngn_ptn_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV15H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_MODE", AV15H_MODE);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam04_kngn_ptn_kbn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_kngn_ptn_kbn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_kngn_ptn_kbn_Enabled, 5, 0)));
         edtavCtltam04_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_datetime_Visible, 5, 0)));
         edtavCtltam04_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltam04_kngn_ptn_kbn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S182( )
   {
      /* 'SUB_BCMSG_GET' Routine */
      AV8C_BCMSGS = AV6BC_TAM04_KNGN.GetMessages() ;
      AV48GXV11 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GXV11", GXutil.ltrim( GXutil.str( AV48GXV11, 8, 0)));
      while ( AV48GXV11 <= AV8C_BCMSGS.size() )
      {
         AV7C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV8C_BCMSGS.elementAt(-1+AV48GXV11));
         if ( GXutil.strcmp(AV7C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         }
         else if ( GXutil.strcmp(AV7C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         }
         else if ( GXutil.strcmp(AV7C_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            a203_wp01_kngn_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         }
         else
         {
            AV27W_MSG = AV7C_BCMSG.getgxTv_SdtMessages_Message_Id() + ";" + AV7C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         }
         AV48GXV11 = (int)(AV48GXV11+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GXV11", GXutil.ltrim( GXutil.str( AV48GXV11, 8, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV20W_A_LOGIN_SDT;
      GXv_char2[0] = AV25W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      a203_wp01_kngn_mst_impl.this.AV25W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRCD", AV25W_ERRCD);
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
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
      AV24W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
      AV23W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_A819_JS", AV23W_A819_JS);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl( (byte)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime( GXt_dtime6 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV11D_TAM04_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM04_CRT_USER_NM", AV11D_TAM04_CRT_USER_NM);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime( GXt_dtime6 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
      AV12D_TAM04_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM04_UPD_USER_NM", AV12D_TAM04_UPD_USER_NM);
      AV6BC_TAM04_KNGN.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TAM04_KNGN", AV6BC_TAM04_KNGN);
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
      GXv_char2[0] = AV14H_KNGN_FLG ;
      GXv_char7[0] = AV25W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV10C_TAM02_APP_ID, GXv_char2, GXv_char7) ;
      a203_wp01_kngn_mst_impl.this.AV14H_KNGN_FLG = GXv_char2[0] ;
      a203_wp01_kngn_mst_impl.this.AV25W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10C_TAM02_APP_ID", AV10C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRCD", AV25W_ERRCD);
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a203_wp01_kngn_mst");
   }

   protected void nextLoad( )
   {
   }

   protected void e210Q2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_0Q2( boolean wbgen )
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
         wb_table2_6_0Q2( true) ;
      }
      else
      {
         wb_table2_6_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0Q2e( boolean wbgen )
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
         wb_table1_2_0Q2e( true) ;
      }
      else
      {
         wb_table1_2_0Q2e( false) ;
      }
   }

   public void wb_table2_6_0Q2( boolean wbgen )
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
         wb_table3_12_0Q2( true) ;
      }
      else
      {
         wb_table3_12_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_19_0Q2( true) ;
      }
      else
      {
         wb_table4_19_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table4_19_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_31_0Q2( true) ;
      }
      else
      {
         wb_table5_31_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table5_31_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_79_0Q2( true) ;
      }
      else
      {
         wb_table6_79_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table6_79_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0091"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0091"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0091"+"");
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
         wb_table2_6_0Q2e( true) ;
      }
      else
      {
         wb_table2_6_0Q2e( false) ;
      }
   }

   public void wb_table6_79_0Q2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A203_WP01_KNGN_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upd_exec_Internalname, "BTN_UPD_EXEC", "", "", lblBtn_upd_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dlt_exec_Internalname, "BTN_DLT_EXEC", "", "", lblBtn_dlt_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_exec_Internalname, "BTN_REG_EXEC", "", "", lblBtn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV15H_MODE), GXutil.rtrim( localUtil.format( AV15H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_79_0Q2e( true) ;
      }
      else
      {
         wb_table6_79_0Q2e( false) ;
      }
   }

   public void wb_table5_31_0Q2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_37_0Q2( true) ;
      }
      else
      {
         wb_table7_37_0Q2( false) ;
      }
      return  ;
   }

   public void wb_table7_37_0Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_31_0Q2e( true) ;
      }
      else
      {
         wb_table5_31_0Q2e( false) ;
      }
   }

   public void wb_table7_37_0Q2( boolean wbgen )
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
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:140px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "&nbsp;権限パターンコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:250px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_kngn_ptn_kbn_Internalname, GXutil.rtrim( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd()), GXutil.rtrim( localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_kngn_ptn_kbn_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltam04_kngn_ptn_kbn_Backcolor)+";", "", "", 1, edtavCtltam04_kngn_ptn_kbn_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:140px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "権限パターン名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_kngn_ptn_nm_Internalname, GXutil.rtrim( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm()), GXutil.rtrim( localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_kngn_ptn_nm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltam04_kngn_ptn_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "入力権限レベル") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtltam04_auth_lvl, cmbavCtltam04_auth_lvl.getInternalname(), GXutil.trim( GXutil.str( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl(), 2, 0)), 1, cmbavCtltam04_auth_lvl.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, 1, 0, (short)(0), 2, "chr", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "", true, "HLP_A203_WP01_KNGN_MST.htm");
         cmbavCtltam04_auth_lvl.setValue( GXutil.trim( GXutil.str( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl(), 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltam04_auth_lvl.getInternalname(), "Values", cmbavCtltam04_auth_lvl.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltam04_del_flg, radavCtltam04_del_flg.getInternalname(), GXutil.rtrim( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_del_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltam04_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(55);\"", "HLP_A203_WP01_KNGN_MST.htm");
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
         httpContext.writeText( "<div id=\""+edtavCtltam04_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_crt_datetime_Internalname, localUtil.format(AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_crt_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam04_crt_datetime_Visible, edtavCtltam04_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A203_WP01_KNGN_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam04_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam04_crt_datetime_Visible==0)||(edtavCtltam04_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltam04_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_upd_datetime_Internalname, localUtil.format(AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_upd_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam04_upd_datetime_Visible, edtavCtltam04_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A203_WP01_KNGN_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam04_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam04_upd_datetime_Visible==0)||(edtavCtltam04_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam04_crt_user_nm_Internalname, GXutil.rtrim( AV11D_TAM04_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV11D_TAM04_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam04_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_tam04_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam04_upd_user_nm_Internalname, GXutil.rtrim( AV12D_TAM04_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV12D_TAM04_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam04_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_tam04_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_crt_pg_nm_Internalname, GXutil.rtrim( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_crt_pg_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltam04_crt_pg_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_upd_pg_nm_Internalname, GXutil.rtrim( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV6BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_upd_pg_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltam04_upd_pg_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_37_0Q2e( true) ;
      }
      else
      {
         wb_table7_37_0Q2e( false) ;
      }
   }

   public void wb_table4_19_0Q2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "更新（F4）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "削除（F6）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_19_0Q2e( true) ;
      }
      else
      {
         wb_table4_19_0Q2e( false) ;
      }
   }

   public void wb_table3_12_0Q2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "登録（F3）", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "戻る（F11）", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A203_WP01_KNGN_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0Q2e( true) ;
      }
      else
      {
         wb_table3_12_0Q2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV16P_TAM04_KNGN_PTN_KBN = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_TAM04_KNGN_PTN_KBN", AV16P_TAM04_KNGN_PTN_KBN);
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
      pa0Q2( ) ;
      ws0Q2( ) ;
      we0Q2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513223982");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a203_wp01_kngn_mst.js", "?202071513223982");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      tblTbl_ins_btnset_Internalname = "TBL_INS_BTNSET" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCtltam04_kngn_ptn_kbn_Internalname = "CTLTAM04_KNGN_PTN_KBN" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavCtltam04_kngn_ptn_nm_Internalname = "CTLTAM04_KNGN_PTN_NM" ;
      cmbavCtltam04_auth_lvl.setInternalname( "CTLTAM04_AUTH_LVL" );
      radavCtltam04_del_flg.setInternalname( "CTLTAM04_DEL_FLG" );
      edtavCtltam04_crt_datetime_Internalname = "CTLTAM04_CRT_DATETIME" ;
      edtavCtltam04_upd_datetime_Internalname = "CTLTAM04_UPD_DATETIME" ;
      edtavD_tam04_crt_user_nm_Internalname = "vD_TAM04_CRT_USER_NM" ;
      edtavD_tam04_upd_user_nm_Internalname = "vD_TAM04_UPD_USER_NM" ;
      edtavCtltam04_crt_pg_nm_Internalname = "CTLTAM04_CRT_PG_NM" ;
      edtavCtltam04_upd_pg_nm_Internalname = "CTLTAM04_UPD_PG_NM" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_upd_exec_Internalname = "BTN_UPD_EXEC" ;
      lblBtn_dlt_exec_Internalname = "BTN_DLT_EXEC" ;
      lblBtn_reg_exec_Internalname = "BTN_REG_EXEC" ;
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
      edtavCtltam04_upd_pg_nm_Jsonclick = "" ;
      edtavCtltam04_upd_pg_nm_Enabled = 0 ;
      edtavCtltam04_crt_pg_nm_Jsonclick = "" ;
      edtavCtltam04_crt_pg_nm_Enabled = 0 ;
      edtavD_tam04_upd_user_nm_Jsonclick = "" ;
      edtavD_tam04_upd_user_nm_Enabled = 1 ;
      edtavD_tam04_crt_user_nm_Jsonclick = "" ;
      edtavD_tam04_crt_user_nm_Enabled = 1 ;
      edtavCtltam04_upd_datetime_Jsonclick = "" ;
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      edtavCtltam04_upd_datetime_Visible = 1 ;
      edtavCtltam04_crt_datetime_Jsonclick = "" ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      edtavCtltam04_crt_datetime_Visible = 1 ;
      radavCtltam04_del_flg.setJsonclick( "" );
      cmbavCtltam04_auth_lvl.setJsonclick( "" );
      edtavCtltam04_kngn_ptn_nm_Jsonclick = "" ;
      edtavCtltam04_kngn_ptn_nm_Backstyle = (byte)(-1) ;
      edtavCtltam04_kngn_ptn_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam04_kngn_ptn_kbn_Jsonclick = "" ;
      edtavCtltam04_kngn_ptn_kbn_Backstyle = (byte)(-1) ;
      edtavCtltam04_kngn_ptn_kbn_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam04_kngn_ptn_kbn_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltam04_kngn_ptn_kbn_Enabled = 1 ;
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      edtavCtltam04_kngn_ptn_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltam04_kngn_ptn_kbn_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltam04_upd_pg_nm_Enabled = -1 ;
      edtavCtltam04_crt_pg_nm_Enabled = -1 ;
      edtavCtltam04_upd_datetime_Enabled = -1 ;
      edtavCtltam04_crt_datetime_Enabled = -1 ;
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
                  /* Execute user subroutine: S222 */
                  S222 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV6BC_TAM04_KNGN = new SdtTAM04_KNGN(remoteHandle);
      wcpOAV16P_TAM04_KNGN_PTN_KBN = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16P_TAM04_KNGN_PTN_KBN = "" ;
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
      AV11D_TAM04_CRT_USER_NM = "" ;
      AV12D_TAM04_UPD_USER_NM = "" ;
      AV13H_INIT_FLG = "" ;
      AV15H_MODE = "" ;
      AV14H_KNGN_FLG = "" ;
      AV10C_TAM02_APP_ID = "" ;
      AV9C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      H000Q2_A13TAM04_AUTH_CD = new String[] {""} ;
      A13TAM04_AUTH_CD = "" ;
      AV27W_MSG = "" ;
      AV23W_A819_JS = "" ;
      AV24W_A821_JS = "" ;
      AV5BC_KNGN_PTN_EXIST = new SdtTAM04BC_KNGN(remoteHandle);
      AV8C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      H000Q3_A7TAS01_DATA_KIND = new String[] {""} ;
      H000Q3_A300TAS01_DEL_FLG = new String[] {""} ;
      H000Q3_n300TAS01_DEL_FLG = new boolean[] {false} ;
      H000Q3_A9TAS01_ITEM_NM = new String[] {""} ;
      H000Q3_n9TAS01_ITEM_NM = new boolean[] {false} ;
      H000Q3_A8TAS01_ITEM_CD = new String[] {""} ;
      H000Q3_A335TAS01_SORT_NO = new short[1] ;
      H000Q3_n335TAS01_SORT_NO = new boolean[] {false} ;
      A7TAS01_DATA_KIND = "" ;
      A300TAS01_DEL_FLG = "" ;
      A9TAS01_ITEM_NM = "" ;
      A8TAS01_ITEM_CD = "" ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      H000Q4_A13TAM04_AUTH_CD = new String[] {""} ;
      H000Q4_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H000Q4_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      AV18W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV19W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      A205TAM07_USER_NM = "" ;
      H000Q5_A55TAM07_USER_ID = new String[] {""} ;
      H000Q5_A205TAM07_USER_NM = new String[] {""} ;
      H000Q5_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      H000Q6_A55TAM07_USER_ID = new String[] {""} ;
      H000Q6_A205TAM07_USER_NM = new String[] {""} ;
      H000Q6_n205TAM07_USER_NM = new boolean[] {false} ;
      AV7C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV25W_ERRCD = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char2 = new String [1] ;
      GXv_char7 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_upd_exec_Jsonclick = "" ;
      lblBtn_dlt_exec_Jsonclick = "" ;
      lblBtn_reg_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a203_wp01_kngn_mst__default(),
         new Object[] {
             new Object[] {
            H000Q2_A13TAM04_AUTH_CD
            }
            , new Object[] {
            H000Q3_A7TAS01_DATA_KIND, H000Q3_A300TAS01_DEL_FLG, H000Q3_n300TAS01_DEL_FLG, H000Q3_A9TAS01_ITEM_NM, H000Q3_n9TAS01_ITEM_NM, H000Q3_A8TAS01_ITEM_CD, H000Q3_A335TAS01_SORT_NO, H000Q3_n335TAS01_SORT_NO
            }
            , new Object[] {
            H000Q4_A13TAM04_AUTH_CD, H000Q4_A235TAM04_UPD_DATETIME, H000Q4_n235TAM04_UPD_DATETIME
            }
            , new Object[] {
            H000Q5_A55TAM07_USER_ID, H000Q5_A205TAM07_USER_NM, H000Q5_n205TAM07_USER_NM
            }
            , new Object[] {
            H000Q6_A55TAM07_USER_ID, H000Q6_A205TAM07_USER_NM, H000Q6_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "A203_WP01_KNGN_MST" ;
      AV39Pgmdesc = "権限パターンマスタメンテナンス（入力）" ;
      /* GeneXus formulas. */
      AV40Pgmname = "A203_WP01_KNGN_MST" ;
      AV39Pgmdesc = "権限パターンマスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      edtavD_tam04_crt_user_nm_Enabled = 0 ;
      edtavD_tam04_upd_user_nm_Enabled = 0 ;
      edtavCtltam04_crt_pg_nm_Enabled = 0 ;
      edtavCtltam04_upd_pg_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV28W_AUTH_LVL ;
   private byte AV43GXLvl353 ;
   private byte AV46GXLvl478 ;
   private byte AV47GXLvl493 ;
   private byte nGXWrapped ;
   private byte edtavCtltam04_kngn_ptn_nm_Backstyle ;
   private byte edtavCtltam04_kngn_ptn_kbn_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short A335TAS01_SORT_NO ;
   private int edtavCtltam04_crt_datetime_Enabled ;
   private int edtavCtltam04_upd_datetime_Enabled ;
   private int edtavD_tam04_crt_user_nm_Enabled ;
   private int edtavD_tam04_upd_user_nm_Enabled ;
   private int edtavCtltam04_crt_pg_nm_Enabled ;
   private int edtavCtltam04_upd_pg_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavCtltam04_kngn_ptn_kbn_Backcolor ;
   private int AV44GXV9 ;
   private int edtavCtltam04_kngn_ptn_nm_Backcolor ;
   private int AV45GXV10 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltam04_kngn_ptn_kbn_Enabled ;
   private int edtavCtltam04_crt_datetime_Visible ;
   private int edtavCtltam04_upd_datetime_Visible ;
   private int AV48GXV11 ;
   private int GXActiveErrHndl ;
   private int idxLst ;
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
   private String edtavCtltam04_crt_datetime_Internalname ;
   private String edtavCtltam04_upd_datetime_Internalname ;
   private String edtavD_tam04_crt_user_nm_Internalname ;
   private String edtavD_tam04_upd_user_nm_Internalname ;
   private String edtavCtltam04_crt_pg_nm_Internalname ;
   private String edtavCtltam04_upd_pg_nm_Internalname ;
   private String edtavCtltam04_kngn_ptn_kbn_Internalname ;
   private String edtavCtltam04_kngn_ptn_nm_Internalname ;
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
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_upd_exec_Internalname ;
   private String lblBtn_upd_exec_Jsonclick ;
   private String lblBtn_dlt_exec_Internalname ;
   private String lblBtn_dlt_exec_Jsonclick ;
   private String lblBtn_reg_exec_Internalname ;
   private String lblBtn_reg_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String imgImage1_Internalname ;
   private String edtavCtltam04_kngn_ptn_kbn_Jsonclick ;
   private String imgImage5_Internalname ;
   private String edtavCtltam04_kngn_ptn_nm_Jsonclick ;
   private String edtavCtltam04_crt_datetime_Jsonclick ;
   private String edtavCtltam04_upd_datetime_Jsonclick ;
   private String edtavD_tam04_crt_user_nm_Jsonclick ;
   private String edtavD_tam04_upd_user_nm_Jsonclick ;
   private String edtavCtltam04_crt_pg_nm_Jsonclick ;
   private String edtavCtltam04_upd_pg_nm_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private java.util.Date GXt_dtime6 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV26W_ERRFLG ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n335TAS01_SORT_NO ;
   private boolean n235TAM04_UPD_DATETIME ;
   private boolean n205TAM07_USER_NM ;
   private String wcpOAV16P_TAM04_KNGN_PTN_KBN ;
   private String AV16P_TAM04_KNGN_PTN_KBN ;
   private String AV11D_TAM04_CRT_USER_NM ;
   private String AV12D_TAM04_UPD_USER_NM ;
   private String AV13H_INIT_FLG ;
   private String AV15H_MODE ;
   private String AV14H_KNGN_FLG ;
   private String AV10C_TAM02_APP_ID ;
   private String AV9C_GAMEN_TITLE ;
   private String A13TAM04_AUTH_CD ;
   private String AV27W_MSG ;
   private String AV23W_A819_JS ;
   private String AV24W_A821_JS ;
   private String A7TAS01_DATA_KIND ;
   private String A300TAS01_DEL_FLG ;
   private String A9TAS01_ITEM_NM ;
   private String A8TAS01_ITEM_CD ;
   private String A205TAM07_USER_NM ;
   private String A55TAM07_USER_ID ;
   private String AV25W_ERRCD ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTAM04_KNGN AV6BC_TAM04_KNGN ;
   private HTMLChoice cmbavCtltam04_auth_lvl ;
   private HTMLChoice radavCtltam04_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H000Q2_A13TAM04_AUTH_CD ;
   private String[] H000Q3_A7TAS01_DATA_KIND ;
   private String[] H000Q3_A300TAS01_DEL_FLG ;
   private boolean[] H000Q3_n300TAS01_DEL_FLG ;
   private String[] H000Q3_A9TAS01_ITEM_NM ;
   private boolean[] H000Q3_n9TAS01_ITEM_NM ;
   private String[] H000Q3_A8TAS01_ITEM_CD ;
   private short[] H000Q3_A335TAS01_SORT_NO ;
   private boolean[] H000Q3_n335TAS01_SORT_NO ;
   private String[] H000Q4_A13TAM04_AUTH_CD ;
   private java.util.Date[] H000Q4_A235TAM04_UPD_DATETIME ;
   private boolean[] H000Q4_n235TAM04_UPD_DATETIME ;
   private String[] H000Q5_A55TAM07_USER_ID ;
   private String[] H000Q5_A205TAM07_USER_NM ;
   private boolean[] H000Q5_n205TAM07_USER_NM ;
   private String[] H000Q6_A55TAM07_USER_ID ;
   private String[] H000Q6_A205TAM07_USER_NM ;
   private boolean[] H000Q6_n205TAM07_USER_NM ;
   private GxObjectCollection AV8C_BCMSGS ;
   private GxObjectCollection AV18W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[] ;
   private SdtTAM04BC_KNGN AV5BC_KNGN_PTN_EXIST ;
   private SdtMessages_Message AV7C_BCMSG ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV19W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class a203_wp01_kngn_mst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Q2", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Q3", "SELECT `TAS01_DATA_KIND`, `TAS01_DEL_FLG`, `TAS01_ITEM_NM`, `TAS01_ITEM_CD`, `TAS01_SORT_NO` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B01') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND`, `TAS01_SORT_NO`, `TAS01_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H000Q4", "SELECT `TAM04_AUTH_CD`, `TAM04_UPD_DATETIME` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Q5", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Q6", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
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

