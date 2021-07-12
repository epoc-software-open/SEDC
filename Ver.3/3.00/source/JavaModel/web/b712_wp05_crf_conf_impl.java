/*
               File: b712_wp05_crf_conf_impl
        Description: CRF保存・提出確認ポップアップ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:23.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp05_crf_conf_impl extends GXWebPanel
{
   public b712_wp05_crf_conf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b712_wp05_crf_conf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_wp05_crf_conf_impl.class ));
   }

   public b712_wp05_crf_conf_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_signature_chk = UIFactory.getCheckbox(this);
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
            AV21P_IN_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21P_IN_STUDY_ID", GXutil.ltrim( GXutil.str( AV21P_IN_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11P_IN_DATA_CNT = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11P_IN_DATA_CNT", GXutil.ltrim( GXutil.str( AV11P_IN_DATA_CNT, 8, 0)));
               AV13P_OUT_CONF_OK = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_OUT_CONF_OK", AV13P_OUT_CONF_OK);
               AV17P_OUT_SIGNATURE_CHK = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17P_OUT_SIGNATURE_CHK", GXutil.str( AV17P_OUT_SIGNATURE_CHK, 1, 0));
               AV18P_OUT_SIGNATURE_USER_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_OUT_SIGNATURE_USER_ID", AV18P_OUT_SIGNATURE_USER_ID);
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
         pa2I2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2I2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2I2( ) ;
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
      httpContext.writeValue( "CRF保存・提出確認ポップアップ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513312334");
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
      GXEncryptionTmp = "b712_wp05_crf_conf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21P_IN_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11P_IN_DATA_CNT,8,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV13P_OUT_CONF_OK)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_OUT_SIGNATURE_CHK,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_OUT_SIGNATURE_USER_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b712_wp05_crf_conf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2I2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_IN_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV21P_IN_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_IN_DATA_CNT", GXutil.ltrim( localUtil.ntoc( AV11P_IN_DATA_CNT, (byte)(8), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_OUT_CONF_OK", GXutil.rtrim( AV13P_OUT_CONF_OK));
      GxWebStd.gx_hidden_field( httpContext, "vP_OUT_SIGNATURE_CHK", GXutil.ltrim( localUtil.ntoc( AV17P_OUT_SIGNATURE_CHK, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_OUT_SIGNATURE_USER_ID", GXutil.rtrim( AV18P_OUT_SIGNATURE_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "B712_WP05_CRF_CONF" ;
   }

   public String getPgmdesc( )
   {
      return "CRF保存・提出確認ポップアップ" ;
   }

   public void wb2I0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_2I2( true) ;
      }
      else
      {
         wb_table1_2_2I2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF保存・提出確認ポップアップ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2I0( ) ;
   }

   public void ws2I2( )
   {
      start2I2( ) ;
      evt2I2( ) ;
   }

   public void evt2I2( )
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
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e112I2 */
                        e112I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_OK_1'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e122I2 */
                        e122I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CANCEL_1'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e132I2 */
                        e132I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_OK_2'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e142I2 */
                        e142I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e152I2 */
                        e152I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e162I2 */
                        e162I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CANCEL_2'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e172I2 */
                        e172I2 ();
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
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2I2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2I2( ) ;
         }
      }
   }

   public void pa2I2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b712_wp05_crf_conf")), "b712_wp05_crf_conf") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b712_wp05_crf_conf"))) ;
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
                  AV21P_IN_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21P_IN_STUDY_ID", GXutil.ltrim( GXutil.str( AV21P_IN_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV11P_IN_DATA_CNT = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV11P_IN_DATA_CNT", GXutil.ltrim( GXutil.str( AV11P_IN_DATA_CNT, 8, 0)));
                     AV13P_OUT_CONF_OK = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_OUT_CONF_OK", AV13P_OUT_CONF_OK);
                     AV17P_OUT_SIGNATURE_CHK = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17P_OUT_SIGNATURE_CHK", GXutil.str( AV17P_OUT_SIGNATURE_CHK, 1, 0));
                     AV18P_OUT_SIGNATURE_USER_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_OUT_SIGNATURE_USER_ID", AV18P_OUT_SIGNATURE_USER_ID);
                  }
               }
            }
         }
         chkavD_signature_chk.setName( "vD_SIGNATURE_CHK" );
         chkavD_signature_chk.setWebtags( "" );
         chkavD_signature_chk.setCaption( "署名する" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_signature_chk.getInternalname(), "Caption", chkavD_signature_chk.getCaption());
         chkavD_signature_chk.setCheckedValue( "0" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf2I2( ) ;
      /* End function Refresh */
   }

   public void rf2I2( )
   {
      /* Execute user event: e152I2 */
      e152I2 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e162I2 */
         e162I2 ();
         wb2I0( ) ;
      }
   }

   public void strup2I0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e112I2 */
      e112I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_signature_chk.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_signature_chk.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_SIGNATURE_CHK");
            GX_FocusControl = chkavD_signature_chk.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5D_SIGNATURE_CHK = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5D_SIGNATURE_CHK", GXutil.str( AV5D_SIGNATURE_CHK, 1, 0));
         }
         else
         {
            AV5D_SIGNATURE_CHK = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavD_signature_chk.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5D_SIGNATURE_CHK", GXutil.str( AV5D_SIGNATURE_CHK, 1, 0));
         }
         AV7D_TAM07_USER_ID = httpContext.cgiGet( edtavD_tam07_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_TAM07_USER_ID", AV7D_TAM07_USER_ID);
         AV6D_TAM07_PWD = httpContext.cgiGet( edtavD_tam07_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6D_TAM07_PWD", AV6D_TAM07_PWD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_mode_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_mode_kbn_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_MODE_KBN");
            GX_FocusControl = edtavH_mode_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_MODE_KBN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_MODE_KBN", GXutil.str( AV10H_MODE_KBN, 1, 0));
         }
         else
         {
            AV10H_MODE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_mode_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_MODE_KBN", GXutil.str( AV10H_MODE_KBN, 1, 0));
         }
         AV9H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         /* Read saved values. */
         AV21P_IN_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_IN_STUDY_ID"), ".", ",") ;
         AV11P_IN_DATA_CNT = (int)(localUtil.ctol( httpContext.cgiGet( "vP_IN_DATA_CNT"), ".", ",")) ;
         AV13P_OUT_CONF_OK = httpContext.cgiGet( "vP_OUT_CONF_OK") ;
         AV17P_OUT_SIGNATURE_CHK = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_OUT_SIGNATURE_CHK"), ".", ",")) ;
         AV18P_OUT_SIGNATURE_USER_ID = httpContext.cgiGet( "vP_OUT_SIGNATURE_USER_ID") ;
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
      /* Execute user event: e112I2 */
      e112I2 ();
      if (returnInSub) return;
   }

   public void e112I2( )
   {
      /* Start Routine */
      tblTbl_hid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hid_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hid_Visible, 5, 0)));
      AV13P_OUT_CONF_OK = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_OUT_CONF_OK", AV13P_OUT_CONF_OK);
   }

   public void e122I2( )
   {
      /* 'BTN_OK_1' Routine */
      if ( AV5D_SIGNATURE_CHK == 1 )
      {
         AV10H_MODE_KBN = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_MODE_KBN", GXutil.str( AV10H_MODE_KBN, 1, 0));
      }
      else
      {
         /* Execute user subroutine: S112 */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void e132I2( )
   {
      /* 'BTN_CANCEL_1' Routine */
      httpContext.setWebReturnParms(new Object[] {AV13P_OUT_CONF_OK,new Byte(AV17P_OUT_SIGNATURE_CHK),AV18P_OUT_SIGNATURE_USER_ID});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e142I2( )
   {
      /* 'BTN_OK_2' Routine */
      AV14W_ERR_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
      if ( (GXutil.strcmp("", AV7D_TAM07_USER_ID)==0) )
      {
         GXt_char1 = AV15W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00001", "ユーザID", "", "", "", "", GXv_char2) ;
         b712_wp05_crf_conf_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15W_MSG", AV15W_MSG);
         AV14W_ERR_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
         httpContext.GX_msglist.addItem(AV15W_MSG);
      }
      if ( (GXutil.strcmp("", AV6D_TAM07_PWD)==0) )
      {
         GXt_char1 = AV15W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00001", "パスワード", "", "", "", "", GXv_char2) ;
         b712_wp05_crf_conf_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15W_MSG", AV15W_MSG);
         AV14W_ERR_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
         httpContext.GX_msglist.addItem(AV15W_MSG);
      }
      if ( ! AV14W_ERR_FLG )
      {
         GXt_char1 = AV16W_PWD ;
         GXv_char2[0] = GXt_char1 ;
         new b801_pc01_md5(remoteHandle, context).execute( AV6D_TAM07_PWD, GXv_char2) ;
         b712_wp05_crf_conf_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6D_TAM07_PWD", AV6D_TAM07_PWD);
         AV16W_PWD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16W_PWD", AV16W_PWD);
         AV24GXLvl95 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24GXLvl95", GXutil.str( AV24GXLvl95, 1, 0));
         /* Using cursor H002I2 */
         pr_default.execute(0, new Object[] {AV7D_TAM07_USER_ID, AV16W_PWD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A214TAM07_DEL_FLG = H002I2_A214TAM07_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
            n214TAM07_DEL_FLG = H002I2_n214TAM07_DEL_FLG[0] ;
            A210TAM07_PWD = H002I2_A210TAM07_PWD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
            n210TAM07_PWD = H002I2_n210TAM07_PWD[0] ;
            A55TAM07_USER_ID = H002I2_A55TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            AV24GXLvl95 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24GXLvl95", GXutil.str( AV24GXLvl95, 1, 0));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV24GXLvl95 == 0 )
         {
            GXt_char1 = AV15W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00029", "", "", "", "", "", GXv_char2) ;
            b712_wp05_crf_conf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV15W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15W_MSG", AV15W_MSG);
            AV14W_ERR_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
            httpContext.GX_msglist.addItem(AV15W_MSG);
         }
         if ( ! AV14W_ERR_FLG )
         {
            AV19SD_B705_SD05_C.clear();
            /* Using cursor H002I3 */
            pr_default.execute(1);
            while ( (pr_default.getStatus(1) != 101) )
            {
               A300TAS01_DEL_FLG = H002I3_A300TAS01_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
               n300TAS01_DEL_FLG = H002I3_n300TAS01_DEL_FLG[0] ;
               A7TAS01_DATA_KIND = H002I3_A7TAS01_DATA_KIND[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
               A9TAS01_ITEM_NM = H002I3_A9TAS01_ITEM_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
               n9TAS01_ITEM_NM = H002I3_n9TAS01_ITEM_NM[0] ;
               AV20SD_B705_SD05_I = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20SD_B705_SD05_I", AV20SD_B705_SD05_I);
               AV20SD_B705_SD05_I = A9TAS01_ITEM_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20SD_B705_SD05_I", AV20SD_B705_SD05_I);
               AV19SD_B705_SD05_C.add(AV20SD_B705_SD05_I, 0);
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV26GXLvl130 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26GXLvl130", GXutil.str( AV26GXLvl130, 1, 0));
            pr_default.dynParam(2, new Object[]{ new Object[]{
                                                 A109TBM23_STYDY_AUTH_CD ,
                                                 AV19SD_B705_SD05_C ,
                                                 A385TBM23_DEL_FLG ,
                                                 new Long(AV21P_IN_STUDY_ID) ,
                                                 AV7D_TAM07_USER_ID ,
                                                 new Long(A107TBM23_STUDY_ID) ,
                                                 A108TBM23_USER_ID },
                                                 new int[] {
                                                 TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                                 }
            });
            /* Using cursor H002I4 */
            pr_default.execute(2, new Object[] {new Long(AV21P_IN_STUDY_ID), AV7D_TAM07_USER_ID});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A385TBM23_DEL_FLG = H002I4_A385TBM23_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
               n385TBM23_DEL_FLG = H002I4_n385TBM23_DEL_FLG[0] ;
               A109TBM23_STYDY_AUTH_CD = H002I4_A109TBM23_STYDY_AUTH_CD[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
               A108TBM23_USER_ID = H002I4_A108TBM23_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
               A107TBM23_STUDY_ID = H002I4_A107TBM23_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
               AV26GXLvl130 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26GXLvl130", GXutil.str( AV26GXLvl130, 1, 0));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV26GXLvl130 == 0 )
            {
               GXt_char1 = AV15W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00095", "", "", "", "", "", GXv_char2) ;
               b712_wp05_crf_conf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV15W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15W_MSG", AV15W_MSG);
               AV14W_ERR_FLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14W_ERR_FLG", AV14W_ERR_FLG);
               httpContext.GX_msglist.addItem(AV15W_MSG);
            }
            AV19SD_B705_SD05_C.clear();
         }
      }
      if ( ! AV14W_ERR_FLG )
      {
         /* Execute user subroutine: S112 */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void e172I2( )
   {
      /* 'BTN_CANCEL_2' Routine */
      AV10H_MODE_KBN = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_MODE_KBN", GXutil.str( AV10H_MODE_KBN, 1, 0));
   }

   public void e152I2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV9H_INIT_FLG, "1") != 0 )
      {
         AV10H_MODE_KBN = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_MODE_KBN", GXutil.str( AV10H_MODE_KBN, 1, 0));
         AV5D_SIGNATURE_CHK = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5D_SIGNATURE_CHK", GXutil.str( AV5D_SIGNATURE_CHK, 1, 0));
         AV7D_TAM07_USER_ID = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_TAM07_USER_ID", AV7D_TAM07_USER_ID);
         AV6D_TAM07_PWD = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6D_TAM07_PWD", AV6D_TAM07_PWD);
      }
      AV9H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      lblTxt_title_Caption = "CRF提出確認" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title_Internalname, "Caption", lblTxt_title_Caption);
      tblTbl_gmn_1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_gmn_1_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_gmn_1_Visible, 5, 0)));
      tblTbl_gmn_2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_gmn_2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_gmn_2_Visible, 5, 0)));
      if ( AV10H_MODE_KBN == 0 )
      {
         tblTbl_gmn_1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_gmn_1_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_gmn_1_Visible, 5, 0)));
         lblTxt_msg_1_Caption = "選択したCRFを提出します。よろしいですか？"+"（対象件数"+GXutil.trim( GXutil.str( AV11P_IN_DATA_CNT, 8, 0))+"件）" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_msg_1_Internalname, "Caption", lblTxt_msg_1_Caption);
         GX_FocusControl = chkavD_signature_chk.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV10H_MODE_KBN == 1 )
      {
         tblTbl_gmn_2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_gmn_2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_gmn_2_Visible, 5, 0)));
         lblTxt_msg_2_Caption = "署名者のユーザIDとパスワードを入力してください。" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_msg_2_Internalname, "Caption", lblTxt_msg_2_Caption);
         GX_FocusControl = edtavD_tam07_user_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S112( )
   {
      /* 'SUB_CONF_OK' Routine */
      AV13P_OUT_CONF_OK = "B712_WP05_OK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_OUT_CONF_OK", AV13P_OUT_CONF_OK);
      if ( AV5D_SIGNATURE_CHK == 1 )
      {
         AV17P_OUT_SIGNATURE_CHK = AV5D_SIGNATURE_CHK ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17P_OUT_SIGNATURE_CHK", GXutil.str( AV17P_OUT_SIGNATURE_CHK, 1, 0));
         AV18P_OUT_SIGNATURE_USER_ID = AV7D_TAM07_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_OUT_SIGNATURE_USER_ID", AV18P_OUT_SIGNATURE_USER_ID);
      }
      else
      {
         AV17P_OUT_SIGNATURE_CHK = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17P_OUT_SIGNATURE_CHK", GXutil.str( AV17P_OUT_SIGNATURE_CHK, 1, 0));
         AV18P_OUT_SIGNATURE_USER_ID = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_OUT_SIGNATURE_USER_ID", AV18P_OUT_SIGNATURE_USER_ID);
      }
      httpContext.setWebReturnParms(new Object[] {AV13P_OUT_CONF_OK,new Byte(AV17P_OUT_SIGNATURE_CHK),AV18P_OUT_SIGNATURE_USER_ID});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e162I2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 445, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_2I2( true) ;
      }
      else
      {
         wb_table2_5_2I2( false) ;
      }
      return  ;
   }

   public void wb_table2_5_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2I2e( true) ;
      }
      else
      {
         wb_table1_2_2I2e( false) ;
      }
   }

   public void wb_table2_5_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xFFFFFF)) + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 440, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td bgcolor=\"#000080\" colspan=\"2\"  style=\"height:25px\">") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title_Internalname, lblTxt_title_Caption, "", "", lblTxt_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FFFFFF;", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_16_2I2( true) ;
      }
      else
      {
         wb_table3_16_2I2( false) ;
      }
      return  ;
   }

   public void wb_table3_16_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_43_2I2( true) ;
      }
      else
      {
         wb_table4_43_2I2( false) ;
      }
      return  ;
   }

   public void wb_table4_43_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_90_2I2( true) ;
      }
      else
      {
         wb_table5_90_2I2( false) ;
      }
      return  ;
   }

   public void wb_table5_90_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_2I2e( true) ;
      }
      else
      {
         wb_table2_5_2I2e( false) ;
      }
   }

   public void wb_table5_90_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_hid_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xFF0000)) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_hid_Internalname, tblTbl_hid_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_MODE_KBN, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_MODE_KBN), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_90_2I2e( true) ;
      }
      else
      {
         wb_table5_90_2I2e( false) ;
      }
   }

   public void wb_table4_43_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_gmn_2_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_gmn_2_Internalname, tblTbl_gmn_2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_msg_2_Internalname, lblTxt_msg_2_Caption, "", "", lblTxt_msg_2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_54_2I2( true) ;
      }
      else
      {
         wb_table6_54_2I2( false) ;
      }
      return  ;
   }

   public void wb_table6_54_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:40px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_75_2I2( true) ;
      }
      else
      {
         wb_table7_75_2I2( false) ;
      }
      return  ;
   }

   public void wb_table7_75_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_43_2I2e( true) ;
      }
      else
      {
         wb_table4_43_2I2e( false) ;
      }
   }

   public void wb_table7_75_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_79_2I2( true) ;
      }
      else
      {
         wb_table8_79_2I2( false) ;
      }
      return  ;
   }

   public void wb_table8_79_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_75_2I2e( true) ;
      }
      else
      {
         wb_table7_75_2I2e( false) ;
      }
   }

   public void wb_table8_79_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "right", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_ok2_Internalname, "ＯＫ", "", "", lblBtn_ok2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_OK_2\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_can2_Internalname, "キャンセル", "", "", lblBtn_can2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CANCEL_2\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_79_2I2e( true) ;
      }
      else
      {
         wb_table8_79_2I2e( false) ;
      }
   }

   public void wb_table6_54_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_58_2I2( true) ;
      }
      else
      {
         wb_table9_58_2I2( false) ;
      }
      return  ;
   }

   public void wb_table9_58_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_54_2I2e( true) ;
      }
      else
      {
         wb_table6_54_2I2e( false) ;
      }
   }

   public void wb_table9_58_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"height:30px;width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_msg4_Internalname, "ユーザID", "", "", lblTxt_msg4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_user_id_Internalname, GXutil.rtrim( AV7D_TAM07_USER_ID), GXutil.rtrim( localUtil.format( AV7D_TAM07_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_user_id_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 35, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"height:30px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_msg5_Internalname, "パスワード", "", "", lblTxt_msg5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_Internalname, GXutil.rtrim( AV6D_TAM07_PWD), GXutil.rtrim( localUtil.format( AV6D_TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_pwd_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 35, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_58_2I2e( true) ;
      }
      else
      {
         wb_table9_58_2I2e( false) ;
      }
   }

   public void wb_table3_16_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_gmn_1_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_gmn_1_Internalname, tblTbl_gmn_1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_msg_1_Internalname, lblTxt_msg_1_Caption, "", "", lblTxt_msg_1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_27_2I2( true) ;
      }
      else
      {
         wb_table10_27_2I2( false) ;
      }
      return  ;
   }

   public void wb_table10_27_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_16_2I2e( true) ;
      }
      else
      {
         wb_table3_16_2I2e( false) ;
      }
   }

   public void wb_table10_27_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "font-family:'ＭＳ Ｐゴシック'; font-size:12.0pt; font-weight:normal; font-style:normal; color:#404040;" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_signature_chk.getInternalname(), GXutil.str( AV5D_SIGNATURE_CHK, 1, 0), "", 1, 1, "1", "署名する", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(30, this, 1, 0);gx.evt.onchange(this);\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(30);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_32_2I2( true) ;
      }
      else
      {
         wb_table11_32_2I2( false) ;
      }
      return  ;
   }

   public void wb_table11_32_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_27_2I2e( true) ;
      }
      else
      {
         wb_table10_27_2I2e( false) ;
      }
   }

   public void wb_table11_32_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "right", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_ok_Internalname, "ＯＫ", "", "", lblBtn_ok_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_OK_1\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_can_Internalname, "キャンセル", "", "", lblBtn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CANCEL_1\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP05_CRF_CONF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_32_2I2e( true) ;
      }
      else
      {
         wb_table11_32_2I2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV21P_IN_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21P_IN_STUDY_ID", GXutil.ltrim( GXutil.str( AV21P_IN_STUDY_ID, 10, 0)));
      AV11P_IN_DATA_CNT = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11P_IN_DATA_CNT", GXutil.ltrim( GXutil.str( AV11P_IN_DATA_CNT, 8, 0)));
      AV13P_OUT_CONF_OK = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_OUT_CONF_OK", AV13P_OUT_CONF_OK);
      AV17P_OUT_SIGNATURE_CHK = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_OUT_SIGNATURE_CHK", GXutil.str( AV17P_OUT_SIGNATURE_CHK, 1, 0));
      AV18P_OUT_SIGNATURE_USER_ID = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_OUT_SIGNATURE_USER_ID", AV18P_OUT_SIGNATURE_USER_ID);
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
      pa2I2( ) ;
      ws2I2( ) ;
      we2I2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513312375");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b712_wp05_crf_conf.js", "?202071513312375");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_title_Internalname = "TXT_TITLE" ;
      lblTxt_msg_1_Internalname = "TXT_MSG_1" ;
      chkavD_signature_chk.setInternalname( "vD_SIGNATURE_CHK" );
      lblBtn_ok_Internalname = "BTN_OK" ;
      lblBtn_can_Internalname = "BTN_CAN" ;
      tblTable7_Internalname = "TABLE7" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl_gmn_1_Internalname = "TBL_GMN_1" ;
      lblTxt_msg_2_Internalname = "TXT_MSG_2" ;
      lblTxt_msg4_Internalname = "TXT_MSG4" ;
      edtavD_tam07_user_id_Internalname = "vD_TAM07_USER_ID" ;
      lblTxt_msg5_Internalname = "TXT_MSG5" ;
      edtavD_tam07_pwd_Internalname = "vD_TAM07_PWD" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable3_Internalname = "TABLE3" ;
      lblBtn_ok2_Internalname = "BTN_OK2" ;
      lblBtn_can2_Internalname = "BTN_CAN2" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable11_Internalname = "TABLE11" ;
      tblTbl_gmn_2_Internalname = "TBL_GMN_2" ;
      edtavH_mode_kbn_Internalname = "vH_MODE_KBN" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      tblTbl_hid_Internalname = "TBL_HID" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_tam07_pwd_Jsonclick = "" ;
      edtavD_tam07_user_id_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavH_mode_kbn_Jsonclick = "" ;
      lblTxt_msg_2_Caption = "TXT_MSG_2" ;
      lblTxt_msg_1_Caption = "TXT_MSG_1" ;
      tblTbl_gmn_2_Visible = 1 ;
      tblTbl_gmn_1_Visible = 1 ;
      lblTxt_title_Caption = "TXT_TITLE" ;
      tblTbl_hid_Visible = 1 ;
      chkavD_signature_chk.setCaption( "" );
      httpContext.GX_msglist.setDisplaymode( (short)(2) );
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
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13P_OUT_CONF_OK = "" ;
      AV18P_OUT_SIGNATURE_USER_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXDecQS = "" ;
      AV7D_TAM07_USER_ID = "" ;
      AV6D_TAM07_PWD = "" ;
      AV9H_INIT_FLG = "" ;
      AV15W_MSG = "" ;
      AV16W_PWD = "" ;
      scmdbuf = "" ;
      H002I2_A214TAM07_DEL_FLG = new String[] {""} ;
      H002I2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      H002I2_A210TAM07_PWD = new String[] {""} ;
      H002I2_n210TAM07_PWD = new boolean[] {false} ;
      H002I2_A55TAM07_USER_ID = new String[] {""} ;
      A214TAM07_DEL_FLG = "" ;
      A210TAM07_PWD = "" ;
      A55TAM07_USER_ID = "" ;
      AV19SD_B705_SD05_C = new GxObjectCollection(String.class, "internal", "");
      H002I3_A8TAS01_ITEM_CD = new String[] {""} ;
      H002I3_A300TAS01_DEL_FLG = new String[] {""} ;
      H002I3_n300TAS01_DEL_FLG = new boolean[] {false} ;
      H002I3_A7TAS01_DATA_KIND = new String[] {""} ;
      H002I3_A9TAS01_ITEM_NM = new String[] {""} ;
      H002I3_n9TAS01_ITEM_NM = new boolean[] {false} ;
      A300TAS01_DEL_FLG = "" ;
      A7TAS01_DATA_KIND = "" ;
      A9TAS01_ITEM_NM = "" ;
      AV20SD_B705_SD05_I = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      A108TBM23_USER_ID = "" ;
      H002I4_A385TBM23_DEL_FLG = new String[] {""} ;
      H002I4_n385TBM23_DEL_FLG = new boolean[] {false} ;
      H002I4_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      H002I4_A108TBM23_USER_ID = new String[] {""} ;
      H002I4_A107TBM23_STUDY_ID = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_title_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      lblTxt_msg_2_Jsonclick = "" ;
      lblBtn_ok2_Jsonclick = "" ;
      lblBtn_can2_Jsonclick = "" ;
      lblTxt_msg4_Jsonclick = "" ;
      lblTxt_msg5_Jsonclick = "" ;
      lblTxt_msg_1_Jsonclick = "" ;
      lblBtn_ok_Jsonclick = "" ;
      lblBtn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp05_crf_conf__default(),
         new Object[] {
             new Object[] {
            H002I2_A214TAM07_DEL_FLG, H002I2_n214TAM07_DEL_FLG, H002I2_A210TAM07_PWD, H002I2_n210TAM07_PWD, H002I2_A55TAM07_USER_ID
            }
            , new Object[] {
            H002I3_A8TAS01_ITEM_CD, H002I3_A300TAS01_DEL_FLG, H002I3_n300TAS01_DEL_FLG, H002I3_A7TAS01_DATA_KIND, H002I3_A9TAS01_ITEM_NM, H002I3_n9TAS01_ITEM_NM
            }
            , new Object[] {
            H002I4_A385TBM23_DEL_FLG, H002I4_n385TBM23_DEL_FLG, H002I4_A109TBM23_STYDY_AUTH_CD, H002I4_A108TBM23_USER_ID, H002I4_A107TBM23_STUDY_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17P_OUT_SIGNATURE_CHK ;
   private byte nDonePA ;
   private byte AV5D_SIGNATURE_CHK ;
   private byte AV10H_MODE_KBN ;
   private byte AV24GXLvl95 ;
   private byte AV26GXLvl130 ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private int wcpOAV11P_IN_DATA_CNT ;
   private int AV11P_IN_DATA_CNT ;
   private int tblTbl_hid_Visible ;
   private int tblTbl_gmn_1_Visible ;
   private int tblTbl_gmn_2_Visible ;
   private int idxLst ;
   private long wcpOAV21P_IN_STUDY_ID ;
   private long AV21P_IN_STUDY_ID ;
   private long A107TBM23_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXDecQS ;
   private String edtavD_tam07_user_id_Internalname ;
   private String edtavD_tam07_pwd_Internalname ;
   private String edtavH_mode_kbn_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String tblTbl_hid_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String lblTxt_title_Caption ;
   private String lblTxt_title_Internalname ;
   private String tblTbl_gmn_1_Internalname ;
   private String tblTbl_gmn_2_Internalname ;
   private String lblTxt_msg_1_Caption ;
   private String lblTxt_msg_1_Internalname ;
   private String lblTxt_msg_2_Caption ;
   private String lblTxt_msg_2_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String lblTxt_title_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String TempTags ;
   private String edtavH_mode_kbn_Jsonclick ;
   private String edtavH_init_flg_Jsonclick ;
   private String lblTxt_msg_2_Jsonclick ;
   private String tblTable11_Internalname ;
   private String tblTable10_Internalname ;
   private String lblBtn_ok2_Internalname ;
   private String lblBtn_ok2_Jsonclick ;
   private String lblBtn_can2_Internalname ;
   private String lblBtn_can2_Jsonclick ;
   private String tblTable3_Internalname ;
   private String tblTable9_Internalname ;
   private String lblTxt_msg4_Internalname ;
   private String lblTxt_msg4_Jsonclick ;
   private String edtavD_tam07_user_id_Jsonclick ;
   private String lblTxt_msg5_Internalname ;
   private String lblTxt_msg5_Jsonclick ;
   private String edtavD_tam07_pwd_Jsonclick ;
   private String lblTxt_msg_1_Jsonclick ;
   private String tblTable6_Internalname ;
   private String tblTable7_Internalname ;
   private String lblBtn_ok_Internalname ;
   private String lblBtn_ok_Jsonclick ;
   private String lblBtn_can_Internalname ;
   private String lblBtn_can_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV14W_ERR_FLG ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n210TAM07_PWD ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n385TBM23_DEL_FLG ;
   private String AV13P_OUT_CONF_OK ;
   private String AV18P_OUT_SIGNATURE_USER_ID ;
   private String AV7D_TAM07_USER_ID ;
   private String AV6D_TAM07_PWD ;
   private String AV9H_INIT_FLG ;
   private String AV15W_MSG ;
   private String AV16W_PWD ;
   private String A214TAM07_DEL_FLG ;
   private String A210TAM07_PWD ;
   private String A55TAM07_USER_ID ;
   private String A300TAS01_DEL_FLG ;
   private String A7TAS01_DATA_KIND ;
   private String A9TAS01_ITEM_NM ;
   private String AV20SD_B705_SD05_I ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A108TBM23_USER_ID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavD_signature_chk ;
   private IDataStoreProvider pr_default ;
   private String[] H002I2_A214TAM07_DEL_FLG ;
   private boolean[] H002I2_n214TAM07_DEL_FLG ;
   private String[] H002I2_A210TAM07_PWD ;
   private boolean[] H002I2_n210TAM07_PWD ;
   private String[] H002I2_A55TAM07_USER_ID ;
   private String[] H002I3_A8TAS01_ITEM_CD ;
   private String[] H002I3_A300TAS01_DEL_FLG ;
   private boolean[] H002I3_n300TAS01_DEL_FLG ;
   private String[] H002I3_A7TAS01_DATA_KIND ;
   private String[] H002I3_A9TAS01_ITEM_NM ;
   private boolean[] H002I3_n9TAS01_ITEM_NM ;
   private String[] H002I4_A385TBM23_DEL_FLG ;
   private boolean[] H002I4_n385TBM23_DEL_FLG ;
   private String[] H002I4_A109TBM23_STYDY_AUTH_CD ;
   private String[] H002I4_A108TBM23_USER_ID ;
   private long[] H002I4_A107TBM23_STUDY_ID ;
   private GxObjectCollection AV19SD_B705_SD05_C ;
}

final  class b712_wp05_crf_conf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A109TBM23_STYDY_AUTH_CD ,
                                          GxObjectCollection AV19SD_B705_SD05_C ,
                                          String A385TBM23_DEL_FLG ,
                                          long AV21P_IN_STUDY_ID ,
                                          String AV7D_TAM07_USER_ID ,
                                          long A107TBM23_STUDY_ID ,
                                          String A108TBM23_USER_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [2] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID`" ;
      scmdbuf = scmdbuf + " FROM `TBM23_STUDY_STAFF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV19SD_B705_SD05_C, "`TBM23_STYDY_AUTH_CD` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (`TBM23_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_H002I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002I2", "SELECT `TAM07_DEL_FLG`, `TAM07_PWD`, `TAM07_USER_ID` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_PWD` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I3", "SELECT `TAS01_ITEM_CD`, `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B12') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 128);
               stmt.setVarchar(2, (String)parms[1], 500);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 128);
               }
               return;
      }
   }

}

