/*
               File: b202_wp01_image_mst_impl
        Description: 画像マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:37.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b202_wp01_image_mst_impl extends GXWebPanel
{
   public b202_wp01_image_mst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b202_wp01_image_mst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b202_wp01_image_mst_impl.class ));
   }

   public b202_wp01_image_mst_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltbm11_del_flg = new HTMLChoice();
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
            AV14P_IMAGE_CD = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_IMAGE_CD", AV14P_IMAGE_CD);
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
         pa142( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws142( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we142( ) ;
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
      httpContext.writeValue( "画像マスタメンテナンス（入力）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317173745");
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
      GXEncryptionTmp = "b202_wp01_image_mst"+GXutil.URLEncode(GXutil.rtrim(AV14P_IMAGE_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b202_wp01_image_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm142( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_image", AV5BC_IMAGE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_image", AV5BC_IMAGE);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_IMAGE_CD", GXutil.rtrim( AV14P_IMAGE_CD));
      GXCCtlgxBlob = "vD_IMAGE_UPLOAD" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV9D_IMAGE_UPLOAD));
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
      return "B202_WP01_IMAGE_MST" ;
   }

   public String getPgmdesc( )
   {
      return "画像マスタメンテナンス（入力）" ;
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
      }
      wbLoad = true ;
   }

   public void start142( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "画像マスタメンテナンス（入力）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0105") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0105", "");
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
                  else if ( nCmpId == 105 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0105") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0105", "", sEvt);
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
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b202_wp01_image_mst")), "b202_wp01_image_mst") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b202_wp01_image_mst"))) ;
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
                  AV14P_IMAGE_CD = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_IMAGE_CD", AV14P_IMAGE_CD);
               }
            }
         }
         radavCtltbm11_del_flg.setName( "CTLTBM11_DEL_FLG" );
         radavCtltbm11_del_flg.setWebtags( "" );
         radavCtltbm11_del_flg.addItem("0", "利用可能", (short)(0));
         radavCtltbm11_del_flg.addItem("1", "利用不可", (short)(0));
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
      AV43Pgmname = "B202_WP01_IMAGE_MST" ;
      AV42Pgmdesc = "画像マスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm11_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm11_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm11_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm11_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e15142 */
      e15142 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_image"), AV5BC_IMAGE);
         /* Read variables values. */
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image_cd( httpContext.cgiGet( edtavCtltbm11_image_cd_Internalname) );
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image_nm( httpContext.cgiGet( edtavCtltbm11_image_nm_Internalname) );
         AV9D_IMAGE_UPLOAD = httpContext.cgiGet( edtavD_image_upload_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_IMAGE_UPLOAD", AV9D_IMAGE_UPLOAD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm11_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm11_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM11_STUDY_ID");
            GX_FocusControl = edtavCtltbm11_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id( 0 );
         }
         else
         {
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm11_study_id_Internalname), ".", ",") );
         }
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_del_flg( httpContext.cgiGet( radavCtltbm11_del_flg.getInternalname()) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm11_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM11_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm11_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm11_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm11_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM11_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm11_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm11_upd_datetime_Internalname)) );
         }
         AV8D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         AV10D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_UPD_USER_NM", AV10D_UPD_USER_NM);
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm( httpContext.cgiGet( edtavCtltbm11_crt_prog_nm_Internalname) );
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm( httpContext.cgiGet( edtavCtltbm11_upd_prog_nm_Internalname) );
         AV11H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
         AV13H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_MODE", AV13H_MODE);
         AV12H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_file_name( httpContext.cgiGet( edtavCtltbm11_file_name_Internalname) );
         /* Read saved values. */
         AV14P_IMAGE_CD = httpContext.cgiGet( "vP_IMAGE_CD") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0105") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0105", "");
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV9D_IMAGE_UPLOAD)==0) )
         {
            GXCCtlgxBlob = "vD_IMAGE_UPLOAD" + "_gxBlob" ;
            AV9D_IMAGE_UPLOAD = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
         GXKey = context.getSiteKey( ) ;
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
      AV6C_APP_ID = "B202" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      AV7C_GAMEN_TITLE = AV42Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV11H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0105",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e16142( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV11H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV43Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV11H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      AV9D_IMAGE_UPLOAD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_IMAGE_UPLOAD", AV9D_IMAGE_UPLOAD);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new a803_pc01_htmlescape(remoteHandle, context).execute( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name(), GXv_char2) ;
      b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      lblTxt_file_name_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_file_name_Internalname, "Caption", lblTxt_file_name_Caption);
      if ( ! (GXutil.strcmp("", AV27W_IMAGE_URL)==0) )
      {
         lblTxt_image_Caption = "<img src='"+AV27W_IMAGE_URL+"'/>" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_image_Internalname, "Caption", lblTxt_image_Caption);
      }
      else
      {
         lblTxt_image_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_image_Internalname, "Caption", lblTxt_image_Caption);
      }
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e11142( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV12H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV13H_MODE, "0") == 0 )
         {
            AV23W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
            AV30W_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_DEL_FLG", AV30W_DEL_FLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV23W_ERRFLG )
            {
               GXt_char1 = AV28W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               GXt_char1 = AV21W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               AV21W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
            }
         }
      }
   }

   public void e17142( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV12H_KNGN_FLG, "") )
      {
         AV24W_FILEPATH = AV29W_SESSION.getValue(AV43Pgmname+"UP_FILE_PATH") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_FILEPATH", AV24W_FILEPATH);
         if ( ! (GXutil.strcmp("", AV24W_FILEPATH)==0) )
         {
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image( AV24W_FILEPATH );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
         }
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm( AV43Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm( AV43Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
         AV5BC_IMAGE.Save();
         if ( AV5BC_IMAGE.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            AV29W_SESSION.remove(AV43Pgmname+"UP_FILE_PATH");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b202_wp01_image_mst"+GXutil.URLEncode(GXutil.rtrim("")) ;
            httpContext.wjLoc = formatLink("b202_wp01_image_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_IMAGE.GetMessages(), (byte)(0), GXv_char2) ;
            b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e12142( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV12H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV13H_MODE, "1") == 0 )
         {
            AV23W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
            AV30W_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_DEL_FLG", AV30W_DEL_FLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV23W_ERRFLG )
            {
               GXt_char1 = AV28W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               GXt_char1 = AV21W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               AV21W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
            }
         }
      }
   }

   public void e18142( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV12H_KNGN_FLG, "") )
      {
         AV24W_FILEPATH = AV29W_SESSION.getValue(AV43Pgmname+"UP_FILE_PATH") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_FILEPATH", AV24W_FILEPATH);
         if ( ! (GXutil.strcmp("", AV24W_FILEPATH)==0) )
         {
            AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image( AV24W_FILEPATH );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
         }
         AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm( AV43Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
         AV5BC_IMAGE.Save();
         if ( AV5BC_IMAGE.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            AV29W_SESSION.remove(AV43Pgmname+"UP_FILE_PATH");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b201_wp01_image_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
            httpContext.wjLoc = formatLink("b201_wp01_image_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_IMAGE.GetMessages(), (byte)(0), GXv_char2) ;
            b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e13142( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV12H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV13H_MODE, "1") == 0 )
         {
            AV23W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
            AV30W_DEL_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_DEL_FLG", AV30W_DEL_FLG);
            /* Execute user subroutine: S172 */
            S172 ();
            if (returnInSub) return;
            if ( ! AV23W_ERRFLG )
            {
               GXt_char1 = AV28W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               GXt_char1 = AV21W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               AV21W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
            }
         }
      }
   }

   public void e19142( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV12H_KNGN_FLG, "") )
      {
         AV5BC_IMAGE.Delete();
         if ( AV5BC_IMAGE.Success() )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            AV29W_SESSION.remove(AV43Pgmname+"UP_FILE_PATH");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b201_wp01_image_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
            httpContext.wjLoc = formatLink("b201_wp01_image_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_IMAGE.GetMessages(), (byte)(0), GXv_char2) ;
            b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e14142( )
   {
      /* 'BTN_CAN' Routine */
      AV29W_SESSION.remove(AV43Pgmname+"UP_FILE_PATH");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b201_wp01_image_mst_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("b201_wp01_image_mst_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV24W_FILEPATH = AV29W_SESSION.getValue(AV43Pgmname+"UP_FILE_PATH") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_FILEPATH", AV24W_FILEPATH);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image( ((GXutil.strcmp("", AV9D_IMAGE_UPLOAD)==0) ? AV24W_FILEPATH : AV9D_IMAGE_UPLOAD) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      GXv_boolean3[0] = AV25W_FILEUP_ERR_FLG ;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV15W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV18W_A_RESULT_MSG_SDT ;
      new b202_pc01_image_mst_chk(remoteHandle, context).execute( AV5BC_IMAGE, AV30W_DEL_FLG, GXv_boolean3, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
      b202_wp01_image_mst_impl.this.AV25W_FILEUP_ERR_FLG = GXv_boolean3[0] ;
      AV15W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
      AV18W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_DEL_FLG", AV30W_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_FILEUP_ERR_FLG", AV25W_FILEUP_ERR_FLG);
      if ( ! AV25W_FILEUP_ERR_FLG )
      {
         AV26W_IMAGE_UPLOAD = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_IMAGE_UPLOAD", AV26W_IMAGE_UPLOAD);
         if ( ! (GXutil.strcmp("", AV9D_IMAGE_UPLOAD)==0) )
         {
            AV26W_IMAGE_UPLOAD=GXutil.blobFromBase64( GXutil.blobToBase64( AV9D_IMAGE_UPLOAD)) ;
            AV29W_SESSION.setValue(AV43Pgmname+"UP_FILE_PATH", AV26W_IMAGE_UPLOAD);
         }
         else
         {
            AV26W_IMAGE_UPLOAD = AV29W_SESSION.getValue(AV43Pgmname+"UP_FILE_PATH") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_IMAGE_UPLOAD", AV26W_IMAGE_UPLOAD);
         }
         AV27W_IMAGE_URL = httpContext.getResource(AV26W_IMAGE_UPLOAD) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_IMAGE_URL", AV27W_IMAGE_URL);
      }
      else
      {
         AV27W_IMAGE_URL = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_IMAGE_URL", AV27W_IMAGE_URL);
      }
      if ( AV18W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV23W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         AV44GXV10 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXV10", GXutil.ltrim( GXutil.str( AV44GXV10, 8, 0)));
         while ( AV44GXV10 <= AV18W_A_RESULT_MSG_SDT.size() )
         {
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV18W_A_RESULT_MSG_SDT.elementAt(-1+AV44GXV10));
            httpContext.GX_msglist.addItem(AV19W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV44GXV10 = (int)(AV44GXV10+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44GXV10", GXutil.ltrim( GXutil.str( AV44GXV10, 8, 0)));
         }
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void S182( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm11_image_cd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_cd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_cd_Backcolor, 9, 0)));
      edtavCtltbm11_image_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_nm_Backcolor, 9, 0)));
      edtavCtltbm11_study_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_study_id_Backcolor, 9, 0)));
   }

   public void S192( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV45GXV11 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GXV11", GXutil.ltrim( GXutil.str( AV45GXV11, 8, 0)));
      while ( AV45GXV11 <= AV15W_A_CHK_RESULT_SDT.size() )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV15W_A_CHK_RESULT_SDT.elementAt(-1+AV45GXV11));
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         AV45GXV11 = (int)(AV45GXV11+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV11", GXutil.ltrim( GXutil.str( AV45GXV11, 8, 0)));
      }
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM11_IMAGE_CD") == 0 )
      {
         edtavCtltbm11_image_cd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_cd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_cd_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm11_image_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM11_IMAGE_NM") == 0 )
      {
         edtavCtltbm11_image_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_nm_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm11_image_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM11_IMAGE") == 0 )
      {
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavD_image_upload_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM11_STUDY_ID") == 0 )
      {
         edtavCtltbm11_study_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm11_study_id_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm11_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV14P_IMAGE_CD)==0) )
      {
         AV13H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_MODE", AV13H_MODE);
         AV5BC_IMAGE.Load(AV14P_IMAGE_CD);
         if ( AV5BC_IMAGE.Fail() )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
         else
         {
            AV46GXLvl452 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl452", GXutil.str( AV46GXLvl452, 1, 0));
            /* Using cursor H00142 */
            pr_default.execute(0, new Object[] {AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV46GXLvl452 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl452", GXutil.str( AV46GXLvl452, 1, 0));
            }
            while ( (pr_default.getStatus(0) != 101) )
            {
               A55TAM07_USER_ID = H00142_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H00142_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H00142_n205TAM07_USER_NM[0] ;
               AV46GXLvl452 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46GXLvl452", GXutil.str( AV46GXLvl452, 1, 0));
               GXt_char1 = AV8D_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV46GXLvl452 == 0 )
            {
               AV8D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id(), AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id()) == 0 )
            {
               AV10D_UPD_USER_NM = AV8D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10D_UPD_USER_NM", AV10D_UPD_USER_NM);
            }
            else
            {
               AV47GXLvl467 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl467", GXutil.str( AV47GXLvl467, 1, 0));
               /* Using cursor H00143 */
               pr_default.execute(1, new Object[] {AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV47GXLvl467 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl467", GXutil.str( AV47GXLvl467, 1, 0));
               }
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A55TAM07_USER_ID = H00143_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H00143_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H00143_n205TAM07_USER_NM[0] ;
                  AV47GXLvl467 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47GXLvl467", GXutil.str( AV47GXLvl467, 1, 0));
                  GXt_char1 = AV10D_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  b202_wp01_image_mst_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV10D_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10D_UPD_USER_NM", AV10D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               if ( AV47GXLvl467 == 0 )
               {
                  AV10D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10D_UPD_USER_NM", AV10D_UPD_USER_NM);
               }
            }
            AV29W_SESSION.setValue(AV43Pgmname+"UP_FILE_PATH", AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image());
            AV27W_IMAGE_URL = httpContext.getResource(AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_IMAGE_URL", AV27W_IMAGE_URL);
         }
         tblTbl_ins_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltbm11_image_cd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_cd_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_cd_Enabled, 5, 0)));
         edtavCtltbm11_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm11_crt_datetime_Visible, 5, 0)));
         edtavCtltbm11_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm11_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm11_image_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV13H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_MODE", AV13H_MODE);
         tblTbl_ins_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ins_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ins_btnset_Visible, 5, 0)));
         tblTbl_upd_btnset_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltbm11_image_cd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_image_cd_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm11_image_cd_Enabled, 5, 0)));
         edtavCtltbm11_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm11_crt_datetime_Visible, 5, 0)));
         edtavCtltbm11_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm11_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm11_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm11_image_cd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      lblTxt_size_Caption = "（"+GXutil.trim( GXutil.str( 512, 10, 0))+"KB以下）" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_size_Internalname, "Caption", lblTxt_size_Caption);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b202_wp01_image_mst_impl.this.AV22W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
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
      AV21W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
      AV20W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_A819_JS", AV20W_A819_JS);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_image( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_file_name( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV8D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
      AV10D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_UPD_USER_NM", AV10D_UPD_USER_NM);
      AV5BC_IMAGE.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMAGE", AV5BC_IMAGE);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"var fileElm = document.getElementById('"+edtavD_image_upload_Internalname+"');" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (fileElm.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"fileElm.addEventListener('change', setFileName, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"fileElm.attachEvent('onchange',setFileName);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 300);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function setFileName(){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"var filePath = '';" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"var fileName = '';" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"filePath = document.getElementById('"+edtavD_image_upload_Internalname+"').value;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"fileName = filePath.substring(filePath.lastIndexOf('\\\\') + 1, filePath.length);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"document.getElementById('"+edtavCtltbm11_file_name_Internalname+"').value = fileName;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV12H_KNGN_FLG ;
      GXv_char7[0] = AV22W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char2, GXv_char7) ;
      b202_wp01_image_mst_impl.this.AV12H_KNGN_FLG = GXv_char2[0] ;
      b202_wp01_image_mst_impl.this.AV22W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV43Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b202_wp01_image_mst");
   }

   public void S212( )
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
      if ( GXutil.strcmp(AV13H_MODE, "1") == 0 )
      {
         GXt_boolean8 = false ;
         GXv_boolean3[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV12H_KNGN_FLG, "", GXv_boolean3) ;
         b202_wp01_image_mst_impl.this.GXt_boolean8 = GXv_boolean3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean8 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         if ( ( lblTxt_btn_upd_Visible == ( 0 )) )
         {
            lblTxt_btn_upd2_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd2_Visible, 5, 0)));
         }
         GXt_boolean8 = false ;
         GXv_boolean3[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV12H_KNGN_FLG, "", GXv_boolean3) ;
         b202_wp01_image_mst_impl.this.GXt_boolean8 = GXv_boolean3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
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
         GXv_boolean3[0] = GXt_boolean8 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV12H_KNGN_FLG, "", GXv_boolean3) ;
         b202_wp01_image_mst_impl.this.GXt_boolean8 = GXv_boolean3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
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

   protected void e20142( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_142( boolean wbgen )
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
         wb_table2_6_142( true) ;
      }
      else
      {
         wb_table2_6_142( false) ;
      }
      return  ;
   }

   public void wb_table2_6_142e( boolean wbgen )
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
         wb_table1_2_142e( true) ;
      }
      else
      {
         wb_table1_2_142e( false) ;
      }
   }

   public void wb_table2_6_142( boolean wbgen )
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
         wb_table3_12_142( true) ;
      }
      else
      {
         wb_table3_12_142( false) ;
      }
      return  ;
   }

   public void wb_table3_12_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_20_142( true) ;
      }
      else
      {
         wb_table4_20_142( false) ;
      }
      return  ;
   }

   public void wb_table4_20_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_34_142( true) ;
      }
      else
      {
         wb_table5_34_142( false) ;
      }
      return  ;
   }

   public void wb_table5_34_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_95_142( true) ;
      }
      else
      {
         wb_table6_95_142( false) ;
      }
      return  ;
   }

   public void wb_table6_95_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0105"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0105"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0105"+"");
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
         wb_table2_6_142e( true) ;
      }
      else
      {
         wb_table2_6_142e( false) ;
      }
   }

   public void wb_table6_95_142( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV11H_INIT_FLG), GXutil.rtrim( localUtil.format( AV11H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV13H_MODE), GXutil.rtrim( localUtil.format( AV13H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV12H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV12H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_file_name_Internalname, GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name()), GXutil.rtrim( localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_file_name_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_95_142e( true) ;
      }
      else
      {
         wb_table6_95_142e( false) ;
      }
   }

   public void wb_table5_34_142( boolean wbgen )
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
         wb_table7_40_142( true) ;
      }
      else
      {
         wb_table7_40_142( false) ;
      }
      return  ;
   }

   public void wb_table7_40_142e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_34_142e( true) ;
      }
      else
      {
         wb_table5_34_142e( false) ;
      }
   }

   public void wb_table7_40_142( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼メイン情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "&nbsp;画像コード ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:295px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection2_Internalname, 1, 290, "px", 0, "px", "SectionWordBreak", "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_image_cd_Internalname, GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd()), GXutil.rtrim( localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_image_cd_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm11_image_cd_Backcolor)+";", "", "", 1, edtavCtltbm11_image_cd_Enabled, 1, "text", "", 35, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "&nbsp;画像名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_image_nm_Internalname, GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm()), GXutil.rtrim( localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_image_nm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm11_image_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:40px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "&nbsp;画像ファイル") ;
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_size_Internalname, lblTxt_size_Caption, "", "", lblTxt_size_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection3_Internalname, 1, 290, "px", 160, "px", "SectionScroll", "");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_image_Internalname, lblTxt_image_Caption, "", "", lblTxt_image_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(2), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</div>") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         edtavD_image_upload_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_image_upload_Internalname, "Filetype", edtavD_image_upload_Filetype);
         if ( ! (GXutil.strcmp("", AV9D_IMAGE_UPLOAD)==0) )
         {
            gxblobfileaux.setSource( AV9D_IMAGE_UPLOAD );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavD_image_upload_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavD_image_upload_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV9D_IMAGE_UPLOAD = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_IMAGE_UPLOAD", AV9D_IMAGE_UPLOAD);
               edtavD_image_upload_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_image_upload_Internalname, "Filetype", edtavD_image_upload_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtavD_image_upload_Internalname, GXutil.rtrim( AV9D_IMAGE_UPLOAD), httpContext.getResourceRelative(AV9D_IMAGE_UPLOAD), ((GXutil.strcmp("", edtavD_image_upload_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavD_image_upload_Filetype)==0) ? AV9D_IMAGE_UPLOAD : edtavD_image_upload_Filetype)) : edtavD_image_upload_Contenttype), false, "", edtavD_image_upload_Parameters, 1, 1, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtavD_image_upload_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(60);\"", "", "", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtavD_image_upload_Internalname, "URL", httpContext.getResourceRelative(AV9D_IMAGE_UPLOAD));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ファイル名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 420, "px", 0, "px", "SectionWordBreak", "");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_file_name_Internalname, lblTxt_file_name_Caption, "", "", lblTxt_file_name_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         httpContext.writeText( "試験ID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_study_id_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavCtltbm11_study_id_Backcolor)+";", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "削除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm11_del_flg, radavCtltbm11_del_flg.getInternalname(), GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_del_flg()), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm11_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         httpContext.writeText( "作成日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm11_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_crt_datetime_Internalname, localUtil.format(AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_crt_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltbm11_crt_datetime_Visible, edtavCtltbm11_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B202_WP01_IMAGE_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm11_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm11_crt_datetime_Visible==0)||(edtavCtltbm11_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新日時") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm11_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_upd_datetime_Internalname, localUtil.format(AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_upd_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltbm11_upd_datetime_Visible, edtavCtltbm11_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B202_WP01_IMAGE_MST.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm11_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm11_upd_datetime_Visible==0)||(edtavCtltbm11_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         httpContext.writeText( "作成ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV8D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新ユーザー名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV10D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV10D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         httpContext.writeText( "作成プログラムID") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_crt_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltbm11_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "更新プログラムID ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm11_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm11_upd_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltbm11_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_40_142e( true) ;
      }
      else
      {
         wb_table7_40_142e( false) ;
      }
   }

   public void wb_table4_20_142( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd2_Internalname, "更新（F4）", "", "", lblTxt_btn_upd2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_upd2_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt2_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_dlt2_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_20_142e( true) ;
      }
      else
      {
         wb_table4_20_142e( false) ;
      }
   }

   public void wb_table3_12_142( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "登録（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "戻る（F11）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B202_WP01_IMAGE_MST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_142e( true) ;
      }
      else
      {
         wb_table3_12_142e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_IMAGE_CD = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_IMAGE_CD", AV14P_IMAGE_CD);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317174078");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b202_wp01_image_mst.js", "?20177317174078");
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
      imgImage4_Internalname = "IMAGE4" ;
      edtavCtltbm11_image_cd_Internalname = "CTLTBM11_IMAGE_CD" ;
      divSection2_Internalname = "SECTION2" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavCtltbm11_image_nm_Internalname = "CTLTBM11_IMAGE_NM" ;
      imgImage3_Internalname = "IMAGE3" ;
      lblTxt_size_Internalname = "TXT_SIZE" ;
      lblTxt_image_Internalname = "TXT_IMAGE" ;
      divSection3_Internalname = "SECTION3" ;
      edtavD_image_upload_Internalname = "vD_IMAGE_UPLOAD" ;
      lblTxt_file_name_Internalname = "TXT_FILE_NAME" ;
      divSection1_Internalname = "SECTION1" ;
      edtavCtltbm11_study_id_Internalname = "CTLTBM11_STUDY_ID" ;
      radavCtltbm11_del_flg.setInternalname( "CTLTBM11_DEL_FLG" );
      edtavCtltbm11_crt_datetime_Internalname = "CTLTBM11_CRT_DATETIME" ;
      edtavCtltbm11_upd_datetime_Internalname = "CTLTBM11_UPD_DATETIME" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      edtavCtltbm11_crt_prog_nm_Internalname = "CTLTBM11_CRT_PROG_NM" ;
      edtavCtltbm11_upd_prog_nm_Internalname = "CTLTBM11_UPD_PROG_NM" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavCtltbm11_file_name_Internalname = "CTLTBM11_FILE_NAME" ;
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
      edtavCtltbm11_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm11_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm11_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm11_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm11_upd_datetime_Jsonclick = "" ;
      edtavCtltbm11_upd_datetime_Enabled = 0 ;
      edtavCtltbm11_upd_datetime_Visible = 1 ;
      edtavCtltbm11_crt_datetime_Jsonclick = "" ;
      edtavCtltbm11_crt_datetime_Enabled = 0 ;
      edtavCtltbm11_crt_datetime_Visible = 1 ;
      radavCtltbm11_del_flg.setJsonclick( "" );
      edtavCtltbm11_study_id_Jsonclick = "" ;
      edtavCtltbm11_study_id_Backstyle = (byte)(-1) ;
      edtavCtltbm11_study_id_Backcolor = (int)(0xFFFFFF) ;
      edtavD_image_upload_Jsonclick = "" ;
      edtavD_image_upload_Parameters = "" ;
      edtavD_image_upload_Contenttype = "" ;
      edtavD_image_upload_Filetype = "" ;
      edtavCtltbm11_image_nm_Jsonclick = "" ;
      edtavCtltbm11_image_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm11_image_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm11_image_cd_Jsonclick = "" ;
      edtavCtltbm11_image_cd_Backstyle = (byte)(-1) ;
      edtavCtltbm11_image_cd_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm11_image_cd_Enabled = 1 ;
      edtavCtltbm11_file_name_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_size_Caption = "（512KB以下）" ;
      edtavCtltbm11_image_cd_Enabled = 1 ;
      tblTbl_upd_btnset_Visible = 1 ;
      tblTbl_ins_btnset_Visible = 1 ;
      edtavCtltbm11_study_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm11_image_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm11_image_cd_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_image_Caption = "TXT_IMAGE" ;
      lblTxt_file_name_Caption = "FileName" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm11_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm11_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm11_upd_datetime_Enabled = -1 ;
      edtavCtltbm11_crt_datetime_Enabled = -1 ;
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
      AV5BC_IMAGE = new SdtTBM11_IMAGE(remoteHandle);
      wcpOAV14P_IMAGE_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14P_IMAGE_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXCCtlgxBlob = "" ;
      AV9D_IMAGE_UPLOAD = "" ;
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
      AV43Pgmname = "" ;
      AV42Pgmdesc = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV10D_UPD_USER_NM = "" ;
      AV11H_INIT_FLG = "" ;
      AV13H_MODE = "" ;
      AV12H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV27W_IMAGE_URL = "" ;
      AV28W_MSG = "" ;
      AV21W_A821_JS = "" ;
      AV24W_FILEPATH = "" ;
      AV29W_SESSION = httpContext.getWebSession();
      AV15W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV18W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV26W_IMAGE_UPLOAD = "" ;
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      A205TAM07_USER_NM = "" ;
      scmdbuf = "" ;
      H00142_A55TAM07_USER_ID = new String[] {""} ;
      H00142_A205TAM07_USER_NM = new String[] {""} ;
      H00142_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      H00143_A55TAM07_USER_ID = new String[] {""} ;
      H00143_A205TAM07_USER_NM = new String[] {""} ;
      H00143_n205TAM07_USER_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      AV20W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_boolean3 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_size_Jsonclick = "" ;
      lblTxt_image_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      lblTxt_file_name_Jsonclick = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new b202_wp01_image_mst__default(),
         new Object[] {
             new Object[] {
            H00142_A55TAM07_USER_ID, H00142_A205TAM07_USER_NM, H00142_n205TAM07_USER_NM
            }
            , new Object[] {
            H00143_A55TAM07_USER_ID, H00143_A205TAM07_USER_NM, H00143_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV43Pgmname = "B202_WP01_IMAGE_MST" ;
      AV42Pgmdesc = "画像マスタメンテナンス（入力）" ;
      /* GeneXus formulas. */
      AV43Pgmname = "B202_WP01_IMAGE_MST" ;
      AV42Pgmdesc = "画像マスタメンテナンス（入力）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm11_crt_datetime_Enabled = 0 ;
      edtavCtltbm11_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm11_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm11_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV46GXLvl452 ;
   private byte AV47GXLvl467 ;
   private byte nGXWrapped ;
   private byte edtavCtltbm11_study_id_Backstyle ;
   private byte edtavCtltbm11_image_nm_Backstyle ;
   private byte edtavCtltbm11_image_cd_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int edtavCtltbm11_crt_datetime_Enabled ;
   private int edtavCtltbm11_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm11_crt_prog_nm_Enabled ;
   private int edtavCtltbm11_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV44GXV10 ;
   private int edtavCtltbm11_image_cd_Backcolor ;
   private int edtavCtltbm11_image_nm_Backcolor ;
   private int edtavCtltbm11_study_id_Backcolor ;
   private int AV45GXV11 ;
   private int tblTbl_ins_btnset_Visible ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltbm11_image_cd_Enabled ;
   private int edtavCtltbm11_crt_datetime_Visible ;
   private int edtavCtltbm11_upd_datetime_Visible ;
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
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXCCtlgxBlob ;
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
   private String AV43Pgmname ;
   private String AV42Pgmdesc ;
   private String edtavCtltbm11_crt_datetime_Internalname ;
   private String edtavCtltbm11_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm11_crt_prog_nm_Internalname ;
   private String edtavCtltbm11_upd_prog_nm_Internalname ;
   private String edtavCtltbm11_image_cd_Internalname ;
   private String edtavCtltbm11_image_nm_Internalname ;
   private String edtavD_image_upload_Internalname ;
   private String edtavCtltbm11_study_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtltbm11_file_name_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_file_name_Caption ;
   private String lblTxt_file_name_Internalname ;
   private String lblTxt_image_Caption ;
   private String lblTxt_image_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String tblTbl_ins_btnset_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_size_Caption ;
   private String lblTxt_size_Internalname ;
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
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtltbm11_file_name_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String imgImage4_Internalname ;
   private String divSection2_Internalname ;
   private String edtavCtltbm11_image_cd_Jsonclick ;
   private String imgImage5_Internalname ;
   private String edtavCtltbm11_image_nm_Jsonclick ;
   private String imgImage3_Internalname ;
   private String lblTxt_size_Jsonclick ;
   private String divSection3_Internalname ;
   private String lblTxt_image_Jsonclick ;
   private String edtavD_image_upload_Filetype ;
   private String edtavD_image_upload_Contenttype ;
   private String edtavD_image_upload_Parameters ;
   private String edtavD_image_upload_Jsonclick ;
   private String divSection1_Internalname ;
   private String lblTxt_file_name_Jsonclick ;
   private String edtavCtltbm11_study_id_Jsonclick ;
   private String edtavCtltbm11_crt_datetime_Jsonclick ;
   private String edtavCtltbm11_upd_datetime_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String edtavCtltbm11_crt_prog_nm_Jsonclick ;
   private String edtavCtltbm11_upd_prog_nm_Jsonclick ;
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
   private boolean AV23W_ERRFLG ;
   private boolean AV30W_DEL_FLG ;
   private boolean AV25W_FILEUP_ERR_FLG ;
   private boolean n205TAM07_USER_NM ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean3[] ;
   private String AV9D_IMAGE_UPLOAD ;
   private String AV26W_IMAGE_UPLOAD ;
   private String wcpOAV14P_IMAGE_CD ;
   private String AV14P_IMAGE_CD ;
   private String AV8D_CRT_USER_NM ;
   private String AV10D_UPD_USER_NM ;
   private String AV11H_INIT_FLG ;
   private String AV13H_MODE ;
   private String AV12H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV27W_IMAGE_URL ;
   private String AV28W_MSG ;
   private String AV21W_A821_JS ;
   private String AV24W_FILEPATH ;
   private String A205TAM07_USER_NM ;
   private String A55TAM07_USER_ID ;
   private String AV22W_ERRCD ;
   private String AV20W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.webpanels.WebSession AV29W_SESSION ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private SdtTBM11_IMAGE AV5BC_IMAGE ;
   private HTMLChoice radavCtltbm11_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H00142_A55TAM07_USER_ID ;
   private String[] H00142_A205TAM07_USER_NM ;
   private boolean[] H00142_n205TAM07_USER_NM ;
   private String[] H00143_A55TAM07_USER_ID ;
   private String[] H00143_A205TAM07_USER_NM ;
   private boolean[] H00143_n205TAM07_USER_NM ;
   private GxObjectCollection AV15W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV18W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b202_wp01_image_mst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00142", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00143", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
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
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

