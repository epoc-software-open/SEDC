/*
               File: b714_wp01_crf_repeat_impl
        Description: 次入力用CRF追加画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:41.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b714_wp01_crf_repeat_impl extends GXWebPanel
{
   public b714_wp01_crf_repeat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b714_wp01_crf_repeat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b714_wp01_crf_repeat_impl.class ));
   }

   public b714_wp01_crf_repeat_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_visit_no = new HTMLChoice();
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
            AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15P_SUBJECT_ID, 6, 0)));
               AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
               AV22W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
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
         pa222( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws222( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we222( ) ;
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
      httpContext.writeValue( "次入力用CRF追加画面") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513304143");
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
      GXEncryptionTmp = "b714_wp01_crf_repeat"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13P_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22W_RTN_CD,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b714_wp01_crf_repeat") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm222( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV14P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( AV15P_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV13P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_RTN_CD", GXutil.ltrim( localUtil.ntoc( AV22W_RTN_CD, (byte)(1), (byte)(0), ".", "")));
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
      return "B714_WP01_CRF_REPEAT" ;
   }

   public String getPgmdesc( )
   {
      return "次入力用CRF追加画面" ;
   }

   public void wb220( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_222( true) ;
      }
      else
      {
         wb_table1_2_222( false) ;
      }
      return  ;
   }

   public void wb_table1_2_222e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_50_222( true) ;
      }
      else
      {
         wb_table2_50_222( false) ;
      }
      return  ;
   }

   public void wb_table2_50_222e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start222( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "次入力用CRF追加画面", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup220( ) ;
   }

   public void ws222( )
   {
      start222( ) ;
      evt222( ) ;
   }

   public void evt222( )
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
                        /* Execute user event: e11222 */
                        e11222 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12222 */
                        e12222 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13222 */
                        e13222 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14222 */
                        e14222 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CANCEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15222 */
                        e15222 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16222 */
                        e16222 ();
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

   public void we222( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm222( ) ;
         }
      }
   }

   public void pa222( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b714_wp01_crf_repeat")), "b714_wp01_crf_repeat") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b714_wp01_crf_repeat"))) ;
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
                  AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV15P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15P_SUBJECT_ID, 6, 0)));
                     AV13P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
                     AV22W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
                  }
               }
            }
         }
         cmbavD_visit_no.setName( "vD_VISIT_NO" );
         cmbavD_visit_no.setWebtags( "" );
         if ( cmbavD_visit_no.getItemCount() > 0 )
         {
            AV10D_VISIT_NO = (short)(GXutil.lval( cmbavD_visit_no.getValidValue(GXutil.trim( GXutil.str( AV10D_VISIT_NO, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_VISIT_NO", GXutil.ltrim( GXutil.str( AV10D_VISIT_NO, 4, 0)));
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
      rf222( ) ;
      /* End function Refresh */
   }

   public void rf222( )
   {
      /* Execute user event: e12222 */
      e12222 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e16222 */
         e16222 ();
         wb220( ) ;
      }
   }

   public void strup220( )
   {
      /* Before Start, stand alone formulas. */
      AV32Pgmname = "B714_WP01_CRF_REPEAT" ;
      AV31Pgmdesc = "次入力用CRF追加画面" ;
      Gx_err = (short)(0) ;
      edtavD_crf_snm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_snm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_snm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11222 */
      e11222 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV9D_CRF_SNM = httpContext.cgiGet( edtavD_crf_snm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         cmbavD_visit_no.setValue( httpContext.cgiGet( cmbavD_visit_no.getInternalname()) );
         AV10D_VISIT_NO = (short)(GXutil.lval( httpContext.cgiGet( cmbavD_visit_no.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_VISIT_NO", GXutil.ltrim( GXutil.str( AV10D_VISIT_NO, 4, 0)));
         AV11H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
         AV12H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
         /* Read saved values. */
         AV14P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV15P_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "vP_SUBJECT_ID"), ".", ",")) ;
         AV13P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
         AV22W_RTN_CD = (byte)(localUtil.ctol( httpContext.cgiGet( "vW_RTN_CD"), ".", ",")) ;
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
      /* Execute user event: e11222 */
      e11222 ();
      if (returnInSub) return;
   }

   public void e11222( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B714" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      AV7C_GAMEN_TITLE = AV31Pgmdesc ;
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
   }

   public void e12222( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV11H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV32Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV11H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e13222( )
   {
      /* 'BTN_REG' Routine */
      AV20W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      if ( ! AV20W_ERRFLG )
      {
         AV25W_MSG_REP = AV9D_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG_REP", AV25W_MSG_REP);
         /* Using cursor H00222 */
         pr_default.execute(0, new Object[] {new Long(AV14P_STUDY_ID), new Short(AV13P_CRF_ID), new Short(AV10D_VISIT_NO)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A947TBM44_CRF_EDA_NO = H00222_A947TBM44_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
            A946TBM44_CRF_ID = H00222_A946TBM44_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
            A945TBM44_STUDY_ID = H00222_A945TBM44_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
            A948TBM44_VISIT_NO = H00222_A948TBM44_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
            n948TBM44_VISIT_NO = H00222_n948TBM44_VISIT_NO[0] ;
            AV25W_MSG_REP = AV25W_MSG_REP + "(" + GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)) + ")" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG_REP", AV25W_MSG_REP);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV21W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AG00026", AV25W_MSG_REP, "追加", "", "", "", GXv_char2) ;
         b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG_REP", AV25W_MSG_REP);
         AV21W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
         GXt_char1 = AV18W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV21W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
         b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
         AV18W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18W_A821_JS", AV18W_A821_JS);
      }
   }

   public void e14222( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV21W_MSG)==0) )
      {
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV14P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV15P_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV13P_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( (byte)(AV10D_VISIT_NO) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(0) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( (byte)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV32Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV32Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.Save();
         if ( AV5BC_CRF.Success() )
         {
            GXv_int3[0] = AV22W_RTN_CD ;
            GXv_char2[0] = AV21W_MSG ;
            new b714_pc05_delete_his(remoteHandle, context).execute( AV5BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_study_id(), AV5BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_subject_id(), AV5BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_id(), AV5BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no(), GXv_int3, GXv_char2) ;
            b714_wp01_crf_repeat_impl.this.AV22W_RTN_CD = GXv_int3[0] ;
            b714_wp01_crf_repeat_impl.this.AV21W_MSG = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
            httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
         }
         else
         {
            GXt_char1 = AV21W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
            b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
         }
      }
      if ( (GXutil.strcmp("", AV21W_MSG)==0) )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b714_wp01_crf_repeat");
         AV28W_LOGTEXT = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV28W_LOGTEXT = AV28W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV14P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV28W_LOGTEXT = AV28W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV15P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV28W_LOGTEXT = AV28W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV13P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV28W_LOGTEXT = AV28W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV10D_VISIT_NO, 4, 0)) + GXutil.chr( (short)(9)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV28W_LOGTEXT = GXutil.strReplace( AV28W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         new a804_pc03_datalog(remoteHandle, context).execute( AV32Pgmname, "INS", AV28W_LOGTEXT) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_LOGTEXT", AV28W_LOGTEXT);
         AV22W_RTN_CD = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
         httpContext.setWebReturnParms(new Object[] {new Byte(AV22W_RTN_CD)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b714_wp01_crf_repeat");
         httpContext.GX_msglist.addItem(AV21W_MSG);
      }
   }

   public void e15222( )
   {
      /* 'BTN_CANCEL' Routine */
      AV22W_RTN_CD = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
      httpContext.setWebReturnParms(new Object[] {new Byte(AV22W_RTN_CD)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00223 */
      pr_default.execute(1, new Object[] {new Long(AV14P_STUDY_ID), new Short(AV13P_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A69TBM31_CRF_ID = H00223_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H00223_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A642TBM31_CRF_SNM = H00223_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H00223_n642TBM31_CRF_SNM[0] ;
         AV9D_CRF_SNM = A642TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S142( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_visit_no.removeAllItems();
      /* Using cursor H00224 */
      pr_default.execute(2, new Object[] {new Long(AV14P_STUDY_ID), new Short(AV13P_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A947TBM44_CRF_EDA_NO = H00224_A947TBM44_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
         A946TBM44_CRF_ID = H00224_A946TBM44_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
         A945TBM44_STUDY_ID = H00224_A945TBM44_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
         A948TBM44_VISIT_NO = H00224_A948TBM44_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
         n948TBM44_VISIT_NO = H00224_n948TBM44_VISIT_NO[0] ;
         AV36GXLvl237 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl237", GXutil.str( AV36GXLvl237, 1, 0));
         /* Using cursor H00225 */
         pr_default.execute(3, new Object[] {new Long(A945TBM44_STUDY_ID), new Integer(AV15P_SUBJECT_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
         if ( Gx_err != 0 )
         {
            AV36GXLvl237 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl237", GXutil.str( AV36GXLvl237, 1, 0));
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A89TBT02_STUDY_ID = H00225_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A91TBT02_CRF_ID = H00225_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A935TBT02_CRF_EDA_NO = H00225_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            A90TBT02_SUBJECT_ID = H00225_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            AV36GXLvl237 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl237", GXutil.str( AV36GXLvl237, 1, 0));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV36GXLvl237 == 0 )
         {
            cmbavD_visit_no.addItem(GXutil.trim( GXutil.str( A947TBM44_CRF_EDA_NO, 4, 0)), GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)), (short)(0));
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S162( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV21W_MSG)==0) )
      {
         httpContext.GX_msglist.addItem(AV21W_MSG);
      }
   }

   public void S172( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV37GXLvl273 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GXLvl273", GXutil.str( AV37GXLvl273, 1, 0));
      /* Using cursor H00226 */
      pr_default.execute(4, new Object[] {new Long(AV14P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV37GXLvl273 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXLvl273", GXutil.str( AV37GXLvl273, 1, 0));
      }
      while ( (pr_default.getStatus(4) != 101) )
      {
         A369TBM21_DEL_FLG = H00226_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H00226_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H00226_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A607TBM21_STATUS = H00226_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H00226_n607TBM21_STATUS[0] ;
         AV37GXLvl273 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXLvl273", GXutil.str( AV37GXLvl273, 1, 0));
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            GXt_char1 = AV21W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "追加", "", "", GXv_char2) ;
            b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
            AV20W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            GXt_char1 = AV21W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "追加", "", "", GXv_char2) ;
            b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
            AV20W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV37GXLvl273 == 0 )
      {
         GXt_char1 = AV21W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "追加", "", "", GXv_char2) ;
         b714_wp01_crf_repeat_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_MSG", AV21W_MSG);
         AV20W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV16W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV16W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b714_wp01_crf_repeat_impl.this.AV19W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_ERRCD", AV19W_ERRCD);
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
      {
         httpContext.setWebReturnParms(new Object[] {new Byte(AV22W_RTN_CD)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      new a804_pc02_log_start(remoteHandle, context).execute( AV32Pgmname) ;
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV17W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17W_A819_JS", AV17W_A819_JS);
   }

   public void S152( )
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
      if ( ! (GXutil.strcmp("", AV18W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV18W_A821_JS ;
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

   public void S182( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV32Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b714_wp01_crf_repeat");
      httpContext.setWebReturnParms(new Object[] {new Byte(AV22W_RTN_CD)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e16222( )
   {
      /* Load Routine */
   }

   public void wb_table2_50_222( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B714_WP01_CRF_REPEAT.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV11H_INIT_FLG), GXutil.rtrim( localUtil.format( AV11H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV12H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV12H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_50_222e( true) ;
      }
      else
      {
         wb_table2_50_222e( false) ;
      }
   }

   public void wb_table1_2_222( boolean wbgen )
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"height:100%;width:1187px\">") ;
         wb_table3_6_222( true) ;
      }
      else
      {
         wb_table3_6_222( false) ;
      }
      return  ;
   }

   public void wb_table3_6_222e( boolean wbgen )
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
         wb_table1_2_222e( true) ;
      }
      else
      {
         wb_table1_2_222e( false) ;
      }
   }

   public void wb_table3_6_222( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 350, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table4_11_222( true) ;
      }
      else
      {
         wb_table4_11_222( false) ;
      }
      return  ;
   }

   public void wb_table4_11_222e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"vertical-align:top;height:100%\">") ;
         wb_table5_18_222( true) ;
      }
      else
      {
         wb_table5_18_222( false) ;
      }
      return  ;
   }

   public void wb_table5_18_222e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" colspan=\"3\" >") ;
         wb_table6_39_222( true) ;
      }
      else
      {
         wb_table6_39_222( false) ;
      }
      return  ;
   }

   public void wb_table6_39_222e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_6_222e( true) ;
      }
      else
      {
         wb_table3_6_222e( false) ;
      }
   }

   public void wb_table6_39_222( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_Internalname, "OK", "", "", lblBtn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "キャンセル", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CANCEL\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_39_222e( true) ;
      }
      else
      {
         wb_table6_39_222e( false) ;
      }
   }

   public void wb_table5_18_222( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
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
         httpContext.writeText( "<td>") ;
         wb_table7_24_222( true) ;
      }
      else
      {
         wb_table7_24_222( false) ;
      }
      return  ;
   }

   public void wb_table7_24_222e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_222e( true) ;
      }
      else
      {
         wb_table5_18_222e( false) ;
      }
   }

   public void wb_table7_24_222( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableForm_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "CRF名", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:260px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_snm_Internalname, GXutil.rtrim( AV9D_CRF_SNM), GXutil.rtrim( localUtil.format( AV9D_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crf_snm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_crf_snm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "追加VISIT番号", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_visit_no, cmbavD_visit_no.getInternalname(), GXutil.trim( GXutil.str( AV10D_VISIT_NO, 4, 0)), 1, cmbavD_visit_no.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, 1, 0, (short)(0), 4, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(34);\"", "", true, "HLP_B714_WP01_CRF_REPEAT.htm");
         cmbavD_visit_no.setValue( GXutil.trim( GXutil.str( AV10D_VISIT_NO, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_visit_no.getInternalname(), "Values", cmbavD_visit_no.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_222e( true) ;
      }
      else
      {
         wb_table7_24_222e( false) ;
      }
   }

   public void wb_table4_11_222( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "次入力用CRF追加", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B714_WP01_CRF_REPEAT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_11_222e( true) ;
      }
      else
      {
         wb_table4_11_222e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      AV15P_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15P_SUBJECT_ID, 6, 0)));
      AV13P_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", GXutil.ltrim( GXutil.str( AV13P_CRF_ID, 4, 0)));
      AV22W_RTN_CD = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_RTN_CD", GXutil.str( AV22W_RTN_CD, 1, 0));
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
      pa222( ) ;
      ws222( ) ;
      we222( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513304192");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b714_wp01_crf_repeat.js", "?202071513304192");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTable9_Internalname = "TABLE9" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavD_crf_snm_Internalname = "vD_CRF_SNM" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      cmbavD_visit_no.setInternalname( "vD_VISIT_NO" );
      tblTable6_Internalname = "TABLE6" ;
      tblTable3_Internalname = "TABLE3" ;
      lblBtn_reg_Internalname = "BTN_REG" ;
      lblBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable5_Internalname = "TABLE5" ;
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
      cmbavD_visit_no.setJsonclick( "" );
      edtavD_crf_snm_Jsonclick = "" ;
      edtavD_crf_snm_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXDecQS = "" ;
      AV32Pgmname = "" ;
      AV31Pgmdesc = "" ;
      AV9D_CRF_SNM = "" ;
      AV11H_INIT_FLG = "" ;
      AV12H_KNGN_FLG = "" ;
      AV6C_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV25W_MSG_REP = "" ;
      scmdbuf = "" ;
      H00222_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H00222_A946TBM44_CRF_ID = new short[1] ;
      H00222_A945TBM44_STUDY_ID = new long[1] ;
      H00222_A948TBM44_VISIT_NO = new int[1] ;
      H00222_n948TBM44_VISIT_NO = new boolean[] {false} ;
      AV21W_MSG = "" ;
      AV18W_A821_JS = "" ;
      AV5BC_CRF = new SdtTBT02_CRF(remoteHandle);
      GXv_int3 = new byte [1] ;
      AV28W_LOGTEXT = "" ;
      H00223_A69TBM31_CRF_ID = new short[1] ;
      H00223_A68TBM31_STUDY_ID = new long[1] ;
      H00223_A642TBM31_CRF_SNM = new String[] {""} ;
      H00223_n642TBM31_CRF_SNM = new boolean[] {false} ;
      A642TBM31_CRF_SNM = "" ;
      H00224_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H00224_A946TBM44_CRF_ID = new short[1] ;
      H00224_A945TBM44_STUDY_ID = new long[1] ;
      H00224_A948TBM44_VISIT_NO = new int[1] ;
      H00224_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H00225_A89TBT02_STUDY_ID = new long[1] ;
      H00225_A91TBT02_CRF_ID = new short[1] ;
      H00225_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H00225_A90TBT02_SUBJECT_ID = new int[1] ;
      A607TBM21_STATUS = "" ;
      H00226_A369TBM21_DEL_FLG = new String[] {""} ;
      H00226_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H00226_A63TBM21_STUDY_ID = new long[1] ;
      H00226_A607TBM21_STATUS = new String[] {""} ;
      H00226_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      GXt_char1 = "" ;
      AV16W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV17W_A819_JS = "" ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblBtn_reg_Jsonclick = "" ;
      lblBtn_cancel_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_wp01_crf_repeat__default(),
         new Object[] {
             new Object[] {
            H00222_A947TBM44_CRF_EDA_NO, H00222_A946TBM44_CRF_ID, H00222_A945TBM44_STUDY_ID, H00222_A948TBM44_VISIT_NO, H00222_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H00223_A69TBM31_CRF_ID, H00223_A68TBM31_STUDY_ID, H00223_A642TBM31_CRF_SNM, H00223_n642TBM31_CRF_SNM
            }
            , new Object[] {
            H00224_A947TBM44_CRF_EDA_NO, H00224_A946TBM44_CRF_ID, H00224_A945TBM44_STUDY_ID, H00224_A948TBM44_VISIT_NO, H00224_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H00225_A89TBT02_STUDY_ID, H00225_A91TBT02_CRF_ID, H00225_A935TBT02_CRF_EDA_NO, H00225_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            H00226_A369TBM21_DEL_FLG, H00226_n369TBM21_DEL_FLG, H00226_A63TBM21_STUDY_ID, H00226_A607TBM21_STATUS, H00226_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV32Pgmname = "B714_WP01_CRF_REPEAT" ;
      AV31Pgmdesc = "次入力用CRF追加画面" ;
      /* GeneXus formulas. */
      AV32Pgmname = "B714_WP01_CRF_REPEAT" ;
      AV31Pgmdesc = "次入力用CRF追加画面" ;
      Gx_err = (short)(0) ;
      edtavD_crf_snm_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV22W_RTN_CD ;
   private byte nDonePA ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte GXv_int3[] ;
   private byte AV36GXLvl237 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte AV37GXLvl273 ;
   private byte nGXWrapped ;
   private short wcpOAV13P_CRF_ID ;
   private short AV13P_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV10D_VISIT_NO ;
   private short Gx_err ;
   private short A946TBM44_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private int wcpOAV15P_SUBJECT_ID ;
   private int AV15P_SUBJECT_ID ;
   private int edtavD_crf_snm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int A948TBM44_VISIT_NO ;
   private int A90TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long wcpOAV14P_STUDY_ID ;
   private long AV14P_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXDecQS ;
   private String AV32Pgmname ;
   private String AV31Pgmdesc ;
   private String edtavD_crf_snm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable5_Internalname ;
   private String lblBtn_reg_Internalname ;
   private String lblBtn_reg_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable3_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavD_crf_snm_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV20W_ERRFLG ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV9D_CRF_SNM ;
   private String AV11H_INIT_FLG ;
   private String AV12H_KNGN_FLG ;
   private String AV6C_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV25W_MSG_REP ;
   private String AV21W_MSG ;
   private String AV18W_A821_JS ;
   private String AV28W_LOGTEXT ;
   private String A642TBM31_CRF_SNM ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String AV19W_ERRCD ;
   private String AV17W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT02_CRF AV5BC_CRF ;
   private HTMLChoice cmbavD_visit_no ;
   private IDataStoreProvider pr_default ;
   private byte[] H00222_A947TBM44_CRF_EDA_NO ;
   private short[] H00222_A946TBM44_CRF_ID ;
   private long[] H00222_A945TBM44_STUDY_ID ;
   private int[] H00222_A948TBM44_VISIT_NO ;
   private boolean[] H00222_n948TBM44_VISIT_NO ;
   private short[] H00223_A69TBM31_CRF_ID ;
   private long[] H00223_A68TBM31_STUDY_ID ;
   private String[] H00223_A642TBM31_CRF_SNM ;
   private boolean[] H00223_n642TBM31_CRF_SNM ;
   private byte[] H00224_A947TBM44_CRF_EDA_NO ;
   private short[] H00224_A946TBM44_CRF_ID ;
   private long[] H00224_A945TBM44_STUDY_ID ;
   private int[] H00224_A948TBM44_VISIT_NO ;
   private boolean[] H00224_n948TBM44_VISIT_NO ;
   private long[] H00225_A89TBT02_STUDY_ID ;
   private short[] H00225_A91TBT02_CRF_ID ;
   private byte[] H00225_A935TBT02_CRF_EDA_NO ;
   private int[] H00225_A90TBT02_SUBJECT_ID ;
   private String[] H00226_A369TBM21_DEL_FLG ;
   private boolean[] H00226_n369TBM21_DEL_FLG ;
   private long[] H00226_A63TBM21_STUDY_ID ;
   private String[] H00226_A607TBM21_STATUS ;
   private boolean[] H00226_n607TBM21_STATUS ;
   private SdtA_LOGIN_SDT AV16W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class b714_wp01_crf_repeat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00222", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00223", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00224", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00225", "SELECT `TBT02_STUDY_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_SUBJECT_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00226", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

