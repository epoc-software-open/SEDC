/*
               File: b715_wp01_set_auth_impl
        Description: DM到着解除画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:21.24
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b715_wp01_set_auth_impl extends GXWebPanel
{
   public b715_wp01_set_auth_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b715_wp01_set_auth_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b715_wp01_set_auth_impl.class ));
   }

   public b715_wp01_set_auth_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
               AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
               AV19P_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19P_UPD_CNT", GXutil.ltrim( GXutil.str( AV19P_UPD_CNT, 10, 0)));
               AV25W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
               AV26W_RTN_MSG = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
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
         pa1L2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1L2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1L2( ) ;
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
      httpContext.writeText( "DM到着解除画面") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_UPD_CNT,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25W_RTN_CD,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV26W_RTN_MSG)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b715_wp01_set_auth") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1L2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( AV18P_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV16P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_UPD_CNT", GXutil.ltrim( localUtil.ntoc( AV19P_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_RTN_CD", GXutil.ltrim( localUtil.ntoc( AV25W_RTN_CD, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_RTN_MSG", GXutil.rtrim( AV26W_RTN_MSG));
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

   public void wb1L0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1L2( true) ;
      }
      else
      {
         wb_table1_2_1L2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_44_1L2( true) ;
      }
      else
      {
         wb_table2_44_1L2( false) ;
      }
      return  ;
   }

   public void wb_table2_44_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1L2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "DM到着解除画面", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1L0( ) ;
   }

   public void ws1L2( )
   {
      start1L2( ) ;
      evt1L2( ) ;
   }

   public void evt1L2( )
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
                        /* Execute user event: e111L2 */
                        e111L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121L2 */
                        e121L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131L2 */
                        e131L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141L2 */
                        e141L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151L2 */
                        e151L2 ();
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
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1L2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1L2( ) ;
         }
      }
   }

   public void pa1L2( )
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
                  AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
                     AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
                     AV19P_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19P_UPD_CNT", GXutil.ltrim( GXutil.str( AV19P_UPD_CNT, 10, 0)));
                     AV25W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
                     AV26W_RTN_MSG = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
                  }
               }
            }
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
      rf1L2( ) ;
      /* End function Refresh */
   }

   public void rf1L2( )
   {
      /* Execute user event: e121L2 */
      e121L2 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e151L2 */
         e151L2 ();
         wb1L0( ) ;
      }
   }

   public void strup1L0( )
   {
      /* Before Start, stand alone formulas. */
      AV31Pgmname = "B715_WP01_SET_AUTH" ;
      AV30Pgmdesc = "DM到着解除画面" ;
      Gx_err = (short)(0) ;
      edtavD_subject_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_subject_id_Enabled, 5, 0)));
      edtavD_crf_snm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_snm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_snm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e111L2 */
      e111L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_SUBJECT_ID");
            GX_FocusControl = edtavD_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13D_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV13D_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV13D_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV13D_SUBJECT_ID, 6, 0)));
         }
         AV12D_CRF_SNM = httpContext.cgiGet( edtavD_crf_snm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_CRF_SNM", AV12D_CRF_SNM);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV15H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         /* Read saved values. */
         AV17P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV18P_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "vP_SUBJECT_ID"), ".", ",")) ;
         AV16P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
         AV19P_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "vP_UPD_CNT"), ".", ",") ;
         AV25W_RTN_CD = (byte)(localUtil.ctol( httpContext.cgiGet( "vW_RTN_CD"), ".", ",")) ;
         AV26W_RTN_MSG = httpContext.cgiGet( "vW_RTN_MSG") ;
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
      /* Execute user event: e111L2 */
      e111L2 ();
      if (returnInSub) return;
   }

   public void e111L2( )
   {
      /* Start Routine */
      AV7C_APP_ID = "B715" ;
      AV11C_GAMEN_TITLE = AV30Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV14H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
   }

   public void e121L2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV14H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e131L2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      if ( AV25W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV26W_RTN_MSG);
      }
   }

   public void S162( )
   {
      /* 'SUB_BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      if ( AV25W_RTN_CD == 0 )
      {
         AV22W_DATETIME = GXutil.now( ) ;
         AV32GXLvl135 = (byte)(0) ;
         /* Using cursor H001L2 */
         pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID), new Short(AV16P_CRF_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A295TBT02_DEL_FLG = H001L2_A295TBT02_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
            n295TBT02_DEL_FLG = H001L2_n295TBT02_DEL_FLG[0] ;
            A294TBT02_CRF_ID = H001L2_A294TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            A293TBT02_SUBJECT_ID = H001L2_A293TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            A292TBT02_STUDY_ID = H001L2_A292TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            A302TBT02_UPD_CNT = H001L2_A302TBT02_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
            n302TBT02_UPD_CNT = H001L2_n302TBT02_UPD_CNT[0] ;
            A564TBT02_DM_ARRIVAL_DATETIME = H001L2_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n564TBT02_DM_ARRIVAL_DATETIME = H001L2_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
            A565TBT02_APPROVAL_FLG = H001L2_A565TBT02_APPROVAL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
            n565TBT02_APPROVAL_FLG = H001L2_n565TBT02_APPROVAL_FLG[0] ;
            A566TBT02_APPROVAL_DATETIME = H001L2_A566TBT02_APPROVAL_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n566TBT02_APPROVAL_DATETIME = H001L2_n566TBT02_APPROVAL_DATETIME[0] ;
            A567TBT02_APPROVAL_USER_ID = H001L2_A567TBT02_APPROVAL_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
            n567TBT02_APPROVAL_USER_ID = H001L2_n567TBT02_APPROVAL_USER_ID[0] ;
            A568TBT02_APPROVAL_AUTH_CD = H001L2_A568TBT02_APPROVAL_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
            n568TBT02_APPROVAL_AUTH_CD = H001L2_n568TBT02_APPROVAL_AUTH_CD[0] ;
            A569TBT02_INPUT_END_FLG = H001L2_A569TBT02_INPUT_END_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
            n569TBT02_INPUT_END_FLG = H001L2_n569TBT02_INPUT_END_FLG[0] ;
            A570TBT02_INPUT_END_DATETIME = H001L2_A570TBT02_INPUT_END_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n570TBT02_INPUT_END_DATETIME = H001L2_n570TBT02_INPUT_END_DATETIME[0] ;
            A571TBT02_INPUT_END_USER_ID = H001L2_A571TBT02_INPUT_END_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
            n571TBT02_INPUT_END_USER_ID = H001L2_n571TBT02_INPUT_END_USER_ID[0] ;
            A572TBT02_INPUT_END_AUTH_CD = H001L2_A572TBT02_INPUT_END_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
            n572TBT02_INPUT_END_AUTH_CD = H001L2_n572TBT02_INPUT_END_AUTH_CD[0] ;
            AV32GXLvl135 = (byte)(1) ;
            if ( AV19P_UPD_CNT != A302TBT02_UPD_CNT )
            {
               AV25W_RTN_CD = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
               GXt_char2 = AV26W_RTN_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
               b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
               AV26W_RTN_MSG = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV5BC_TBT02_CRF.Load(AV17P_STUDY_ID, AV18P_SUBJECT_ID, AV16P_CRF_ID);
            /* Execute user subroutine: S173 */
            S173 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version()+1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( AV8C_CRC_INPUT_LEVEL );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( AV22W_DATETIME );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( AV9C_DM_AUTH_CD );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV31Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TBT02_CRF", AV5BC_TBT02_CRF);
            AV5BC_TBT02_CRF.Save();
            /* Execute user subroutine: S173 */
            S173 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( AV25W_RTN_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV6BC_TBT11_CRF_VERSION = (SdtTBT11_CRF_HISTORY)new SdtTBT11_CRF_HISTORY( remoteHandle, context);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A292TBT02_STUDY_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A293TBT02_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A294TBT02_CRF_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A565TBT02_APPROVAL_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A566TBT02_APPROVAL_DATETIME );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A567TBT02_APPROVAL_USER_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A568TBT02_APPROVAL_AUTH_CD );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( A569TBT02_INPUT_END_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( A570TBT02_INPUT_END_DATETIME );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( A571TBT02_INPUT_END_USER_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( A572TBT02_INPUT_END_AUTH_CD );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( AV31Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV31Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT11_CRF_VERSION", AV6BC_TBT11_CRF_VERSION);
            AV6BC_TBT11_CRF_VERSION.Save();
            /* Execute user subroutine: S183 */
            S183 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Using cursor H001L3 */
            pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID), new Short(AV16P_CRF_ID)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A328TBT12_DEL_FLG = H001L3_A328TBT12_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A328TBT12_DEL_FLG", A328TBT12_DEL_FLG);
               n328TBT12_DEL_FLG = H001L3_n328TBT12_DEL_FLG[0] ;
               A317TBT12_CRF_ID = H001L3_A317TBT12_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A317TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A317TBT12_CRF_ID, 4, 0)));
               A316TBT12_SUBJECT_ID = H001L3_A316TBT12_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A316TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A316TBT12_SUBJECT_ID, 6, 0)));
               A315TBT12_STUDY_ID = H001L3_A315TBT12_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A315TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A315TBT12_STUDY_ID, 10, 0)));
               A318TBT12_CRF_ITEM_GRP_DIV = H001L3_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A318TBT12_CRF_ITEM_GRP_DIV", A318TBT12_CRF_ITEM_GRP_DIV);
               A319TBT12_CRF_ITEM_GRP_CD = H001L3_A319TBT12_CRF_ITEM_GRP_CD[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A319TBT12_CRF_ITEM_GRP_CD", A319TBT12_CRF_ITEM_GRP_CD);
               A320TBT12_CRF_VALUE = H001L3_A320TBT12_CRF_VALUE[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A320TBT12_CRF_VALUE", A320TBT12_CRF_VALUE);
               n320TBT12_CRF_VALUE = H001L3_n320TBT12_CRF_VALUE[0] ;
               AV27BC_TBT13_CRF_RES_HIS = (SdtTBT13_CRF_RES_HIS)new SdtTBT13_CRF_RES_HIS( remoteHandle, context);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A315TBT12_STUDY_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A316TBT12_SUBJECT_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A317TBT12_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( AV5BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A318TBT12_CRF_ITEM_GRP_DIV );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A319TBT12_CRF_ITEM_GRP_CD );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( A320TBT12_CRF_VALUE );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( AV31Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV31Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27BC_TBT13_CRF_RES_HIS", AV27BC_TBT13_CRF_RES_HIS);
               AV27BC_TBT13_CRF_RES_HIS.Save();
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV32GXLvl135 == 0 )
         {
            AV25W_RTN_CD = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
            GXt_char2 = AV26W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char3) ;
            b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_RTN_MSG = GXt_char2 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
         }
      }
      if ( (GXutil.strcmp("", AV26W_RTN_MSG)==0) )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b715_wp01_set_auth");
         httpContext.setWebReturnParms(new Object[] {new Byte(AV25W_RTN_CD),AV26W_RTN_MSG});
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b715_wp01_set_auth");
         httpContext.GX_msglist.addItem(AV26W_RTN_MSG);
      }
   }

   public void e141L2( )
   {
      /* 'BTN_CAN' Routine */
      AV25W_RTN_CD = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
      AV26W_RTN_MSG = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
      httpContext.setWebReturnParms(new Object[] {new Byte(AV25W_RTN_CD),AV26W_RTN_MSG});
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      AV13D_SUBJECT_ID = AV18P_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV13D_SUBJECT_ID, 6, 0)));
      /* Using cursor H001L4 */
      pr_default.execute(2, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A223TBM31_DEL_FLG = H001L4_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001L4_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = H001L4_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A217TBM31_STUDY_ID = H001L4_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A550TBM31_CRF_SNM = H001L4_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = H001L4_n550TBM31_CRF_SNM[0] ;
         AV12D_CRF_SNM = A550TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_CRF_SNM", AV12D_CRF_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S152( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV35GXLvl283 = (byte)(0) ;
      /* Using cursor H001L5 */
      pr_default.execute(3, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A189TBM21_DEL_FLG = H001L5_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001L5_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = H001L5_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A513TBM21_STATUS = H001L5_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = H001L5_n513TBM21_STATUS[0] ;
         AV35GXLvl283 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            AV25W_RTN_CD = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
            GXt_char2 = AV26W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "更新", "", "", GXv_char3) ;
            b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_RTN_MSG = GXt_char2 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            AV25W_RTN_CD = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
            GXt_char2 = AV26W_RTN_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "更新", "", "", GXv_char3) ;
            b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
            AV26W_RTN_MSG = GXt_char2 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV35GXLvl283 == 0 )
      {
         AV25W_RTN_CD = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
         GXt_char2 = AV26W_RTN_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "更新", "", "", GXv_char3) ;
         b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
         AV26W_RTN_MSG = GXt_char2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
      }
   }

   public void S173( )
   {
      /* 'SUB_TBT02_CHECK_ERROR' Routine */
      if ( AV5BC_TBT02_CRF.Fail() )
      {
         AV25W_RTN_CD = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
         GXt_char2 = AV26W_RTN_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char3) ;
         b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
         AV26W_RTN_MSG = GXt_char2 + " (TBT02)" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
      }
   }

   public void S183( )
   {
      /* 'SUB_TBT11_CHECK_ERROR' Routine */
      if ( AV6BC_TBT11_CRF_VERSION.Fail() )
      {
         AV25W_RTN_CD = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
         GXt_char2 = AV26W_RTN_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT11_CRF_VERSION.GetMessages(), (byte)(0), GXv_char3) ;
         b715_wp01_set_auth_impl.this.GXt_char2 = GXv_char3[0] ;
         AV26W_RTN_MSG = GXt_char2 + " (TBT11)" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b715_wp01_set_auth_impl.this.AV23W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
      AV8C_CRC_INPUT_LEVEL = (byte)(0) ;
      /* Using cursor H001L6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A514TBM01_SYS_VALUE = H001L6_A514TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514TBM01_SYS_VALUE", A514TBM01_SYS_VALUE);
         n514TBM01_SYS_VALUE = H001L6_n514TBM01_SYS_VALUE[0] ;
         A161TBM01_SYS_ID = H001L6_A161TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161TBM01_SYS_ID", A161TBM01_SYS_ID);
         /* Using cursor H001L7 */
         pr_default.execute(5, new Object[] {new Boolean(n514TBM01_SYS_VALUE), A514TBM01_SYS_VALUE});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A17TAM04_AUTH_CD = H001L7_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            A601TAM04_AUTH_LVL = H001L7_A601TAM04_AUTH_LVL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
            n601TAM04_AUTH_LVL = H001L7_n601TAM04_AUTH_LVL[0] ;
            AV8C_CRC_INPUT_LEVEL = A601TAM04_AUTH_LVL ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      GXv_char3[0] = AV9C_DM_AUTH_CD ;
      GXv_int5[0] = AV10C_DM_INPUT_LEVEL ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char3, GXv_int5) ;
      b715_wp01_set_auth_impl.this.AV9C_DM_AUTH_CD = GXv_char3[0] ;
      b715_wp01_set_auth_impl.this.AV10C_DM_INPUT_LEVEL = GXv_int5[0] ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV25W_RTN_CD = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
      AV26W_RTN_MSG = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
      AV21W_A821_JS = "" ;
   }

   public void S142( )
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S19436( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b715_wp01_set_auth");
   }

   protected void nextLoad( )
   {
   }

   protected void e151L2( )
   {
      /* Load Routine */
   }

   public void wb_table2_44_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B715_WP01_SET_AUTH.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B715_WP01_SET_AUTH.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B715_WP01_SET_AUTH.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_44_1L2e( true) ;
      }
      else
      {
         wb_table2_44_1L2e( false) ;
      }
   }

   public void wb_table1_2_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:100%;width:100%\">") ;
         wb_table3_6_1L2( true) ;
      }
      else
      {
         wb_table3_6_1L2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1L2e( boolean wbgen )
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
         wb_table1_2_1L2e( true) ;
      }
      else
      {
         wb_table1_2_1L2e( false) ;
      }
   }

   public void wb_table3_6_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 160, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:100%\">") ;
         wb_table4_9_1L2( true) ;
      }
      else
      {
         wb_table4_9_1L2( false) ;
      }
      return  ;
   }

   public void wb_table4_9_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_6_1L2e( true) ;
      }
      else
      {
         wb_table3_6_1L2e( false) ;
      }
   }

   public void wb_table4_9_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 369, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:13px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "DM到着を解除します。　　よろしいですか？", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"middle\" >") ;
         wb_table5_20_1L2( true) ;
      }
      else
      {
         wb_table5_20_1L2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table6_37_1L2( true) ;
      }
      else
      {
         wb_table6_37_1L2( false) ;
      }
      return  ;
   }

   public void wb_table6_37_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_9_1L2e( true) ;
      }
      else
      {
         wb_table4_9_1L2e( false) ;
      }
   }

   public void wb_table6_37_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 2, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 222, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:111px\">") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_Internalname, "OK", "", "", lblBtn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:111px\">") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_can_Internalname, "キャンセル", "", "", lblBtn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_37_1L2e( true) ;
      }
      else
      {
         wb_table6_37_1L2e( false) ;
      }
   }

   public void wb_table5_20_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 368, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"2\" >") ;
         httpContext.writeText( "▼DM到着解除") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "対象患者No", "", "", lblTextblock67_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV13D_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV13D_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtavD_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13D_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13D_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(27);\"", "", "", "", "", edtavD_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_subject_id_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "対象CRF", "", "", lblTextblock68_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_CRF_SNM", AV12D_CRF_SNM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_snm_Internalname, GXutil.rtrim( AV12D_CRF_SNM), GXutil.rtrim( localUtil.format( AV12D_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(32);\"", "", "", "", "", edtavD_crf_snm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crf_snm_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B715_WP01_SET_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_1L2e( true) ;
      }
      else
      {
         wb_table5_20_1L2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
      AV18P_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
      AV16P_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
      AV19P_UPD_CNT = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19P_UPD_CNT", GXutil.ltrim( GXutil.str( AV19P_UPD_CNT, 10, 0)));
      AV25W_RTN_CD = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_RTN_CD", GXutil.str( AV25W_RTN_CD, 1, 0));
      AV26W_RTN_MSG = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_MSG", AV26W_RTN_MSG);
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
      pa1L2( ) ;
      ws1L2( ) ;
      we1L2( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1592199");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b715_wp01_set_auth.js", "?159221");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavD_crf_snm_Internalname = "vD_CRF_SNM" ;
      tblTable4_Internalname = "TABLE4" ;
      lblBtn_reg_Internalname = "BTN_REG" ;
      lblBtn_can_Internalname = "BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_crf_snm_Jsonclick = "" ;
      edtavD_crf_snm_Enabled = 1 ;
      edtavD_subject_id_Jsonclick = "" ;
      edtavD_subject_id_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
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
                  /* Execute user subroutine: S19436 */
                  S19436 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV26W_RTN_MSG = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXDecQS = "" ;
      AV31Pgmname = "" ;
      AV30Pgmdesc = "" ;
      AV12D_CRF_SNM = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV7C_APP_ID = "" ;
      AV11C_GAMEN_TITLE = "" ;
      AV22W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      H001L2_A295TBT02_DEL_FLG = new String[] {""} ;
      H001L2_n295TBT02_DEL_FLG = new boolean[] {false} ;
      H001L2_A294TBT02_CRF_ID = new short[1] ;
      H001L2_A293TBT02_SUBJECT_ID = new int[1] ;
      H001L2_A292TBT02_STUDY_ID = new long[1] ;
      H001L2_A302TBT02_UPD_CNT = new long[1] ;
      H001L2_n302TBT02_UPD_CNT = new boolean[] {false} ;
      H001L2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001L2_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      H001L2_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      H001L2_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L2_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      H001L2_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      H001L2_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      H001L2_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      H001L2_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      H001L2_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      H001L2_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      H001L2_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L2_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      H001L2_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      H001L2_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      H001L2_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      H001L2_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBT02_APPROVAL_FLG = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A567TBT02_APPROVAL_USER_ID = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A571TBT02_INPUT_END_USER_ID = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      AV5BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV9C_DM_AUTH_CD = "" ;
      AV6BC_TBT11_CRF_VERSION = new SdtTBT11_CRF_HISTORY(remoteHandle);
      H001L3_A328TBT12_DEL_FLG = new String[] {""} ;
      H001L3_n328TBT12_DEL_FLG = new boolean[] {false} ;
      H001L3_A317TBT12_CRF_ID = new short[1] ;
      H001L3_A316TBT12_SUBJECT_ID = new int[1] ;
      H001L3_A315TBT12_STUDY_ID = new long[1] ;
      H001L3_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      H001L3_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      H001L3_A320TBT12_CRF_VALUE = new String[] {""} ;
      H001L3_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      A328TBT12_DEL_FLG = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      AV27BC_TBT13_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      H001L4_A223TBM31_DEL_FLG = new String[] {""} ;
      H001L4_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001L4_A218TBM31_CRF_ID = new short[1] ;
      H001L4_A217TBM31_STUDY_ID = new long[1] ;
      H001L4_A550TBM31_CRF_SNM = new String[] {""} ;
      H001L4_n550TBM31_CRF_SNM = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A550TBM31_CRF_SNM = "" ;
      H001L5_A189TBM21_DEL_FLG = new String[] {""} ;
      H001L5_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001L5_A186TBM21_STUDY_ID = new long[1] ;
      H001L5_A513TBM21_STATUS = new String[] {""} ;
      H001L5_n513TBM21_STATUS = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      H001L6_A514TBM01_SYS_VALUE = new String[] {""} ;
      H001L6_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      H001L6_A161TBM01_SYS_ID = new String[] {""} ;
      A514TBM01_SYS_VALUE = "" ;
      A161TBM01_SYS_ID = "" ;
      H001L7_A17TAM04_AUTH_CD = new String[] {""} ;
      H001L7_A601TAM04_AUTH_LVL = new byte[1] ;
      H001L7_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      GXv_char3 = new String [1] ;
      GXv_int5 = new byte [1] ;
      AV21W_A821_JS = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      TempTags = "" ;
      GXt_char1 = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblBtn_reg_Jsonclick = "" ;
      lblBtn_can_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      GXt_char2 = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b715_wp01_set_auth__default(),
         new Object[] {
             new Object[] {
            H001L2_A295TBT02_DEL_FLG, H001L2_n295TBT02_DEL_FLG, H001L2_A294TBT02_CRF_ID, H001L2_A293TBT02_SUBJECT_ID, H001L2_A292TBT02_STUDY_ID, H001L2_A302TBT02_UPD_CNT, H001L2_n302TBT02_UPD_CNT, H001L2_A564TBT02_DM_ARRIVAL_DATETIME, H001L2_n564TBT02_DM_ARRIVAL_DATETIME, H001L2_A565TBT02_APPROVAL_FLG,
            H001L2_n565TBT02_APPROVAL_FLG, H001L2_A566TBT02_APPROVAL_DATETIME, H001L2_n566TBT02_APPROVAL_DATETIME, H001L2_A567TBT02_APPROVAL_USER_ID, H001L2_n567TBT02_APPROVAL_USER_ID, H001L2_A568TBT02_APPROVAL_AUTH_CD, H001L2_n568TBT02_APPROVAL_AUTH_CD, H001L2_A569TBT02_INPUT_END_FLG, H001L2_n569TBT02_INPUT_END_FLG, H001L2_A570TBT02_INPUT_END_DATETIME,
            H001L2_n570TBT02_INPUT_END_DATETIME, H001L2_A571TBT02_INPUT_END_USER_ID, H001L2_n571TBT02_INPUT_END_USER_ID, H001L2_A572TBT02_INPUT_END_AUTH_CD, H001L2_n572TBT02_INPUT_END_AUTH_CD
            }
            , new Object[] {
            H001L3_A328TBT12_DEL_FLG, H001L3_n328TBT12_DEL_FLG, H001L3_A317TBT12_CRF_ID, H001L3_A316TBT12_SUBJECT_ID, H001L3_A315TBT12_STUDY_ID, H001L3_A318TBT12_CRF_ITEM_GRP_DIV, H001L3_A319TBT12_CRF_ITEM_GRP_CD, H001L3_A320TBT12_CRF_VALUE, H001L3_n320TBT12_CRF_VALUE
            }
            , new Object[] {
            H001L4_A223TBM31_DEL_FLG, H001L4_n223TBM31_DEL_FLG, H001L4_A218TBM31_CRF_ID, H001L4_A217TBM31_STUDY_ID, H001L4_A550TBM31_CRF_SNM, H001L4_n550TBM31_CRF_SNM
            }
            , new Object[] {
            H001L5_A189TBM21_DEL_FLG, H001L5_n189TBM21_DEL_FLG, H001L5_A186TBM21_STUDY_ID, H001L5_A513TBM21_STATUS, H001L5_n513TBM21_STATUS
            }
            , new Object[] {
            H001L6_A514TBM01_SYS_VALUE, H001L6_n514TBM01_SYS_VALUE, H001L6_A161TBM01_SYS_ID
            }
            , new Object[] {
            H001L7_A17TAM04_AUTH_CD, H001L7_A601TAM04_AUTH_LVL, H001L7_n601TAM04_AUTH_LVL
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV31Pgmname = "B715_WP01_SET_AUTH" ;
      AV30Pgmdesc = "DM到着解除画面" ;
      /* GeneXus formulas. */
      AV31Pgmname = "B715_WP01_SET_AUTH" ;
      AV30Pgmdesc = "DM到着解除画面" ;
      Gx_err = (short)(0) ;
      edtavD_subject_id_Enabled = 0 ;
      edtavD_crf_snm_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25W_RTN_CD ;
   private byte nDonePA ;
   private byte AV32GXLvl135 ;
   private byte AV8C_CRC_INPUT_LEVEL ;
   private byte AV35GXLvl283 ;
   private byte A601TAM04_AUTH_LVL ;
   private byte AV10C_DM_INPUT_LEVEL ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short wcpOAV16P_CRF_ID ;
   private short AV16P_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private short A294TBT02_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private int wcpOAV18P_SUBJECT_ID ;
   private int AV18P_SUBJECT_ID ;
   private int edtavD_subject_id_Enabled ;
   private int edtavD_crf_snm_Enabled ;
   private int AV13D_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int A293TBT02_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long wcpOAV17P_STUDY_ID ;
   private long wcpOAV19P_UPD_CNT ;
   private long AV17P_STUDY_ID ;
   private long AV19P_UPD_CNT ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXDecQS ;
   private String AV31Pgmname ;
   private String AV30Pgmdesc ;
   private String edtavD_subject_id_Internalname ;
   private String edtavD_crf_snm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String GXt_char1 ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblBtn_reg_Internalname ;
   private String lblBtn_reg_Jsonclick ;
   private String lblBtn_can_Internalname ;
   private String lblBtn_can_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavD_subject_id_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String GXt_char2 ;
   private String edtavD_crf_snm_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date AV22W_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean n601TAM04_AUTH_LVL ;
   private String AV26W_RTN_MSG ;
   private String AV12D_CRF_SNM ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV7C_APP_ID ;
   private String AV11C_GAMEN_TITLE ;
   private String A295TBT02_DEL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String AV9C_DM_AUTH_CD ;
   private String A328TBT12_DEL_FLG ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A223TBM31_DEL_FLG ;
   private String A550TBM31_CRF_SNM ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private String AV23W_ERRCD ;
   private String A514TBM01_SYS_VALUE ;
   private String A161TBM01_SYS_ID ;
   private String A17TAM04_AUTH_CD ;
   private String AV21W_A821_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] H001L2_A295TBT02_DEL_FLG ;
   private boolean[] H001L2_n295TBT02_DEL_FLG ;
   private short[] H001L2_A294TBT02_CRF_ID ;
   private int[] H001L2_A293TBT02_SUBJECT_ID ;
   private long[] H001L2_A292TBT02_STUDY_ID ;
   private long[] H001L2_A302TBT02_UPD_CNT ;
   private boolean[] H001L2_n302TBT02_UPD_CNT ;
   private java.util.Date[] H001L2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] H001L2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] H001L2_A565TBT02_APPROVAL_FLG ;
   private boolean[] H001L2_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] H001L2_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] H001L2_n566TBT02_APPROVAL_DATETIME ;
   private String[] H001L2_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] H001L2_n567TBT02_APPROVAL_USER_ID ;
   private String[] H001L2_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] H001L2_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] H001L2_A569TBT02_INPUT_END_FLG ;
   private boolean[] H001L2_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] H001L2_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] H001L2_n570TBT02_INPUT_END_DATETIME ;
   private String[] H001L2_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] H001L2_n571TBT02_INPUT_END_USER_ID ;
   private String[] H001L2_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] H001L2_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] H001L3_A328TBT12_DEL_FLG ;
   private boolean[] H001L3_n328TBT12_DEL_FLG ;
   private short[] H001L3_A317TBT12_CRF_ID ;
   private int[] H001L3_A316TBT12_SUBJECT_ID ;
   private long[] H001L3_A315TBT12_STUDY_ID ;
   private String[] H001L3_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] H001L3_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] H001L3_A320TBT12_CRF_VALUE ;
   private boolean[] H001L3_n320TBT12_CRF_VALUE ;
   private String[] H001L4_A223TBM31_DEL_FLG ;
   private boolean[] H001L4_n223TBM31_DEL_FLG ;
   private short[] H001L4_A218TBM31_CRF_ID ;
   private long[] H001L4_A217TBM31_STUDY_ID ;
   private String[] H001L4_A550TBM31_CRF_SNM ;
   private boolean[] H001L4_n550TBM31_CRF_SNM ;
   private String[] H001L5_A189TBM21_DEL_FLG ;
   private boolean[] H001L5_n189TBM21_DEL_FLG ;
   private long[] H001L5_A186TBM21_STUDY_ID ;
   private String[] H001L5_A513TBM21_STATUS ;
   private boolean[] H001L5_n513TBM21_STATUS ;
   private String[] H001L6_A514TBM01_SYS_VALUE ;
   private boolean[] H001L6_n514TBM01_SYS_VALUE ;
   private String[] H001L6_A161TBM01_SYS_ID ;
   private String[] H001L7_A17TAM04_AUTH_CD ;
   private byte[] H001L7_A601TAM04_AUTH_LVL ;
   private boolean[] H001L7_n601TAM04_AUTH_LVL ;
   private SdtTBT02_CRF AV5BC_TBT02_CRF ;
   private SdtTBT11_CRF_HISTORY AV6BC_TBT11_CRF_VERSION ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtTBT13_CRF_RES_HIS AV27BC_TBT13_CRF_RES_HIS ;
}

final  class b715_wp01_set_auth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001L2", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_UPD_CNT`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L3", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001L4", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L5", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L6", "SELECT `TBM01_SYS_VALUE`, `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '021' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L7", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               break;
      }
   }

}

