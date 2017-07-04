/*
               File: b713_wp02_subject_site_chg_impl
        Description: ä≥é“é{ê›ïœçXâÊñ 
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:41.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b713_wp02_subject_site_chg_impl extends GXWebPanel
{
   public b713_wp02_subject_site_chg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b713_wp02_subject_site_chg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b713_wp02_subject_site_chg_impl.class ));
   }

   public b713_wp02_subject_site_chg_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_site_id = new HTMLChoice();
      cmbavD_chg_site_id = new HTMLChoice();
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
            AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV29P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV29P_SUBJECT_ID, 6, 0)));
               AV26W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
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
         pa212( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws212( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we212( ) ;
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
      httpContext.writeValue( "ä≥é“é{ê›ïœçXâÊñ ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317204112");
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
      GXEncryptionTmp = "b713_wp02_subject_site_chg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV29P_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26W_RTN_CD,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b713_wp02_subject_site_chg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm212( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_RTN_CD", GXutil.ltrim( localUtil.ntoc( AV26W_RTN_CD, (byte)(1), (byte)(0), ".", "")));
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
      return "B713_WP02_SUBJECT_SITE_CHG" ;
   }

   public String getPgmdesc( )
   {
      return "ä≥é“é{ê›ïœçXâÊñ " ;
   }

   public void wb210( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_212( true) ;
      }
      else
      {
         wb_table1_2_212( false) ;
      }
      return  ;
   }

   public void wb_table1_2_212e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_61_212( true) ;
      }
      else
      {
         wb_table2_61_212( false) ;
      }
      return  ;
   }

   public void wb_table2_61_212e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start212( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ä≥é“é{ê›ïœçXâÊñ ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup210( ) ;
   }

   public void ws212( )
   {
      start212( ) ;
      evt212( ) ;
   }

   public void evt212( )
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
                        /* Execute user event: e11212 */
                        e11212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12212 */
                        e12212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13212 */
                        e13212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14212 */
                        e14212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_END'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15212 */
                        e15212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CANCEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16212 */
                        e16212 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17212 */
                        e17212 ();
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

   public void we212( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm212( ) ;
         }
      }
   }

   public void pa212( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b713_wp02_subject_site_chg")), "b713_wp02_subject_site_chg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b713_wp02_subject_site_chg"))) ;
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
                  AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV29P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV29P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV29P_SUBJECT_ID, 6, 0)));
                     AV26W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
                  }
               }
            }
         }
         cmbavD_site_id.setName( "vD_SITE_ID" );
         cmbavD_site_id.setWebtags( "" );
         if ( cmbavD_site_id.getItemCount() > 0 )
         {
            AV11D_SITE_ID = cmbavD_site_id.getValidValue(AV11D_SITE_ID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11D_SITE_ID", AV11D_SITE_ID);
         }
         cmbavD_chg_site_id.setName( "vD_CHG_SITE_ID" );
         cmbavD_chg_site_id.setWebtags( "" );
         if ( cmbavD_chg_site_id.getItemCount() > 0 )
         {
            AV10D_CHG_SITE_ID = cmbavD_chg_site_id.getValidValue(AV10D_CHG_SITE_ID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_CHG_SITE_ID", AV10D_CHG_SITE_ID);
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
      rf212( ) ;
      /* End function Refresh */
   }

   public void rf212( )
   {
      /* Execute user event: e12212 */
      e12212 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e17212 */
         e17212 ();
         wb210( ) ;
      }
   }

   public void strup210( )
   {
      /* Before Start, stand alone formulas. */
      AV33Pgmname = "B713_WP02_SUBJECT_SITE_CHG" ;
      AV32Pgmdesc = "ä≥é“é{ê›ïœçXâÊñ " ;
      Gx_err = (short)(0) ;
      cmbavD_site_id.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavD_site_id.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavD_site_id.getEnabled(), 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11212 */
      e11212 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         cmbavD_site_id.setValue( httpContext.cgiGet( cmbavD_site_id.getInternalname()) );
         AV11D_SITE_ID = httpContext.cgiGet( cmbavD_site_id.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SITE_ID", AV11D_SITE_ID);
         cmbavD_chg_site_id.setValue( httpContext.cgiGet( cmbavD_chg_site_id.getInternalname()) );
         AV10D_CHG_SITE_ID = httpContext.cgiGet( cmbavD_chg_site_id.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_CHG_SITE_ID", AV10D_CHG_SITE_ID);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV15H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SUBJECT_ID");
            GX_FocusControl = edtavH_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16H_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV16H_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV16H_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV16H_SUBJECT_ID, 6, 0)));
         }
         /* Read saved values. */
         AV17P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV26W_RTN_CD = (byte)(localUtil.ctol( httpContext.cgiGet( "vW_RTN_CD"), ".", ",")) ;
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
      /* Execute user event: e11212 */
      e11212 ();
      if (returnInSub) return;
   }

   public void e11212( )
   {
      /* Start Routine */
      AV7C_APP_ID = "B713" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      AV8C_GAMEN_TITLE = AV32Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
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

   public void e12212( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "INFO", "âÊñ ãNìÆ") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV14H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e13212( )
   {
      /* 'BTN_REG' Routine */
      AV24W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      if ( ! AV24W_ERRFLG )
      {
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
         b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         GXt_char1 = AV20W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV25W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
         b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         AV20W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_A821_JS", AV20W_A821_JS);
      }
   }

   public void e14212( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV25W_MSG)==0) )
      {
         AV25W_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         AV6BC_SUBJECT.Load(AV17P_STUDY_ID, AV29P_SUBJECT_ID);
         if ( AV6BC_SUBJECT.Fail() )
         {
         }
         else
         {
            AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id( AV10D_CHG_SITE_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
            AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm( AV33Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
            AV6BC_SUBJECT.Save();
         }
         if ( AV6BC_SUBJECT.Success() )
         {
         }
         else
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_SUBJECT.GetMessages(), (byte)(0), GXv_char2) ;
            b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         }
      }
      if ( (GXutil.strcmp("", AV25W_MSG)==0) )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b713_wp02_subject_site_chg");
         AV26W_RTN_CD = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
         httpContext.setWebReturnParms(new Object[] {new Byte(AV26W_RTN_CD)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b713_wp02_subject_site_chg");
         httpContext.GX_msglist.addItem(AV25W_MSG);
      }
   }

   public void e15212( )
   {
      /* 'BTN_END' Routine */
      AV26W_RTN_CD = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
      httpContext.setWebReturnParms(new Object[] {new Byte(AV26W_RTN_CD)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e16212( )
   {
      /* 'BTN_CANCEL' Routine */
      AV26W_RTN_CD = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
      httpContext.setWebReturnParms(new Object[] {new Byte(AV26W_RTN_CD)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00212 */
      pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV29P_SUBJECT_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A88TBT01_SUBJECT_ID = H00212_A88TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
         A87TBT01_STUDY_ID = H00212_A87TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
         A698TBT01_SITE_ID = H00212_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H00212_n698TBT01_SITE_ID[0] ;
         AV11D_SITE_ID = A698TBT01_SITE_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SITE_ID", AV11D_SITE_ID);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S142( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_site_id.removeAllItems();
      cmbavD_chg_site_id.removeAllItems();
      cmbavD_chg_site_id.addItem("", "", (short)(0));
      /* Using cursor H00213 */
      pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A377TBM22_DEL_FLG = H00213_A377TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM22_DEL_FLG", A377TBM22_DEL_FLG);
         n377TBM22_DEL_FLG = H00213_n377TBM22_DEL_FLG[0] ;
         A17TBM22_STUDY_ID = H00213_A17TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)));
         A319TAM08_SITE_NM = H00213_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = H00213_n319TAM08_SITE_NM[0] ;
         A18TBM22_SITE_ID = H00213_A18TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TBM22_SITE_ID", A18TBM22_SITE_ID);
         A319TAM08_SITE_NM = H00213_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = H00213_n319TAM08_SITE_NM[0] ;
         cmbavD_site_id.addItem(A18TBM22_SITE_ID, A319TAM08_SITE_NM, (short)(0));
         cmbavD_chg_site_id.addItem(A18TBM22_SITE_ID, A319TAM08_SITE_NM, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S162( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV25W_MSG)==0) )
      {
         httpContext.GX_msglist.addItem(AV25W_MSG);
      }
      if ( (GXutil.strcmp("", AV10D_CHG_SITE_ID)==0) )
      {
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "ïœçXå„èäëÆé{ê›", "", "", "", "", GXv_char2) ;
         b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         httpContext.GX_msglist.addItem(AV25W_MSG);
         GX_FocusControl = cmbavD_chg_site_id.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV24W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
      }
   }

   public void S172( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV36GXLvl258 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl258", GXutil.str( AV36GXLvl258, 1, 0));
      /* Using cursor H00214 */
      pr_default.execute(2, new Object[] {new Long(AV17P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV36GXLvl258 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl258", GXutil.str( AV36GXLvl258, 1, 0));
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A369TBM21_DEL_FLG = H00214_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H00214_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H00214_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A607TBM21_STATUS = H00214_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H00214_n607TBM21_STATUS[0] ;
         AV36GXLvl258 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXLvl258", GXutil.str( AV36GXLvl258, 1, 0));
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuèIóπÅv", "í«â¡", "", "", GXv_char2) ;
            b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            AV24W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuíÜé~Åv", "í«â¡", "", "", GXv_char2) ;
            b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            AV24W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV36GXLvl258 == 0 )
      {
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ëIëÇ≥ÇÍÇΩééå±", "óòópïsâ¬", "í«â¡", "", "", GXv_char2) ;
         b713_wp02_subject_site_chg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         AV24W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV18W_A_LOGIN_SDT;
      GXv_char2[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV18W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b713_wp02_subject_site_chg_impl.this.AV23W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRCD", AV23W_ERRCD);
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV12D_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", AV12D_SUBJECT_ID);
      AV11D_SITE_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_SITE_ID", AV11D_SITE_ID);
      AV16H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV16H_SUBJECT_ID, 6, 0)));
      AV19W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_A819_JS", AV19W_A819_JS);
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
      if ( ! (GXutil.strcmp("", AV20W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV20W_A821_JS ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b713_wp02_subject_site_chg");
   }

   protected void nextLoad( )
   {
   }

   protected void e17212( )
   {
      /* Load Routine */
   }

   public void wb_table2_61_212( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_end_Internalname, "TXT_BTN_END", "", "", lblTxt_btn_end_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_END\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV16H_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16H_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_61_212e( true) ;
      }
      else
      {
         wb_table2_61_212e( false) ;
      }
   }

   public void wb_table1_2_212( boolean wbgen )
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
         wb_table3_6_212( true) ;
      }
      else
      {
         wb_table3_6_212( false) ;
      }
      return  ;
   }

   public void wb_table3_6_212e( boolean wbgen )
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
         wb_table1_2_212e( true) ;
      }
      else
      {
         wb_table1_2_212e( false) ;
      }
   }

   public void wb_table3_6_212( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 450, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table4_11_212( true) ;
      }
      else
      {
         wb_table4_11_212( false) ;
      }
      return  ;
   }

   public void wb_table4_11_212e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"vertical-align:top;height:100%\">") ;
         wb_table5_18_212( true) ;
      }
      else
      {
         wb_table5_18_212( false) ;
      }
      return  ;
   }

   public void wb_table5_18_212e( boolean wbgen )
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
         wb_table6_50_212( true) ;
      }
      else
      {
         wb_table6_50_212( false) ;
      }
      return  ;
   }

   public void wb_table6_50_212e( boolean wbgen )
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
         wb_table3_6_212e( true) ;
      }
      else
      {
         wb_table3_6_212e( false) ;
      }
   }

   public void wb_table6_50_212( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_Internalname, "ïœçX", "", "", lblBtn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "ÉLÉÉÉìÉZÉã", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CANCEL\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_50_212e( true) ;
      }
      else
      {
         wb_table6_50_212e( false) ;
      }
   }

   public void wb_table5_18_212( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_21_212( true) ;
      }
      else
      {
         wb_table7_21_212( false) ;
      }
      return  ;
   }

   public void wb_table7_21_212e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_212e( true) ;
      }
      else
      {
         wb_table5_18_212e( false) ;
      }
   }

   public void wb_table7_21_212( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_27_212( true) ;
      }
      else
      {
         wb_table8_27_212( false) ;
      }
      return  ;
   }

   public void wb_table8_27_212e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_21_212e( true) ;
      }
      else
      {
         wb_table7_21_212e( false) ;
      }
   }

   public void wb_table8_27_212( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "ä≥é“ID", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:260px\">") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavP_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV29P_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV29P_SUBJECT_ID), "ZZZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavP_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "åªèäëÆé{ê›", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_site_id, cmbavD_site_id.getInternalname(), GXutil.rtrim( AV11D_SITE_ID), 1, cmbavD_site_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavD_site_id.getEnabled(), 0, (short)(0), 20, "chr", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "", true, "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         cmbavD_site_id.setValue( GXutil.rtrim( AV11D_SITE_ID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_site_id.getInternalname(), "Values", cmbavD_site_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "ïœçXå„èäëÆé{ê›", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_chg_site_id, cmbavD_chg_site_id.getInternalname(), GXutil.rtrim( AV10D_CHG_SITE_ID), 1, cmbavD_chg_site_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 20, "chr", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "", true, "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         cmbavD_chg_site_id.setValue( GXutil.rtrim( AV10D_CHG_SITE_ID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_chg_site_id.getInternalname(), "Values", cmbavD_chg_site_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_27_212e( true) ;
      }
      else
      {
         wb_table8_27_212e( false) ;
      }
   }

   public void wb_table4_11_212( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ä≥é“é{ê›ïœçX", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B713_WP02_SUBJECT_SITE_CHG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_11_212e( true) ;
      }
      else
      {
         wb_table4_11_212e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
      AV29P_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV29P_SUBJECT_ID, 6, 0)));
      AV26W_RTN_CD = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_RTN_CD", GXutil.str( AV26W_RTN_CD, 1, 0));
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
      pa212( ) ;
      ws212( ) ;
      we212( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317204173");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b713_wp02_subject_site_chg.js", "?20177317204173");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTable9_Internalname = "TABLE9" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavP_subject_id_Internalname = "vP_SUBJECT_ID" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      cmbavD_site_id.setInternalname( "vD_SITE_ID" );
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      cmbavD_chg_site_id.setInternalname( "vD_CHG_SITE_ID" );
      tblTable6_Internalname = "TABLE6" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      lblBtn_reg_Internalname = "BTN_REG" ;
      lblBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      lblTxt_btn_end_Internalname = "TXT_BTN_END" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_subject_id_Internalname = "vH_SUBJECT_ID" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      cmbavD_chg_site_id.setJsonclick( "" );
      cmbavD_site_id.setJsonclick( "" );
      cmbavD_site_id.setEnabled( 1 );
      edtavP_subject_id_Jsonclick = "" ;
      edtavH_subject_id_Jsonclick = "" ;
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
      AV11D_SITE_ID = "" ;
      AV10D_CHG_SITE_ID = "" ;
      AV33Pgmname = "" ;
      AV32Pgmdesc = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV7C_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV25W_MSG = "" ;
      AV20W_A821_JS = "" ;
      AV6BC_SUBJECT = new SdtTBT01_SUBJECT(remoteHandle);
      scmdbuf = "" ;
      H00212_A88TBT01_SUBJECT_ID = new int[1] ;
      H00212_A87TBT01_STUDY_ID = new long[1] ;
      H00212_A698TBT01_SITE_ID = new String[] {""} ;
      H00212_n698TBT01_SITE_ID = new boolean[] {false} ;
      A698TBT01_SITE_ID = "" ;
      H00213_A377TBM22_DEL_FLG = new String[] {""} ;
      H00213_n377TBM22_DEL_FLG = new boolean[] {false} ;
      H00213_A17TBM22_STUDY_ID = new long[1] ;
      H00213_A319TAM08_SITE_NM = new String[] {""} ;
      H00213_n319TAM08_SITE_NM = new boolean[] {false} ;
      H00213_A18TBM22_SITE_ID = new String[] {""} ;
      A377TBM22_DEL_FLG = "" ;
      A319TAM08_SITE_NM = "" ;
      A18TBM22_SITE_ID = "" ;
      A607TBM21_STATUS = "" ;
      H00214_A369TBM21_DEL_FLG = new String[] {""} ;
      H00214_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H00214_A63TBM21_STUDY_ID = new long[1] ;
      H00214_A607TBM21_STATUS = new String[] {""} ;
      H00214_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      GXt_char1 = "" ;
      AV18W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV12D_SUBJECT_ID = "" ;
      AV19W_A819_JS = "" ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      lblTxt_btn_end_Jsonclick = "" ;
      TempTags = "" ;
      lblBtn_reg_Jsonclick = "" ;
      lblBtn_cancel_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b713_wp02_subject_site_chg__default(),
         new Object[] {
             new Object[] {
            H00212_A88TBT01_SUBJECT_ID, H00212_A87TBT01_STUDY_ID, H00212_A698TBT01_SITE_ID, H00212_n698TBT01_SITE_ID
            }
            , new Object[] {
            H00213_A377TBM22_DEL_FLG, H00213_n377TBM22_DEL_FLG, H00213_A17TBM22_STUDY_ID, H00213_A319TAM08_SITE_NM, H00213_n319TAM08_SITE_NM, H00213_A18TBM22_SITE_ID
            }
            , new Object[] {
            H00214_A369TBM21_DEL_FLG, H00214_n369TBM21_DEL_FLG, H00214_A63TBM21_STUDY_ID, H00214_A607TBM21_STATUS, H00214_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV33Pgmname = "B713_WP02_SUBJECT_SITE_CHG" ;
      AV32Pgmdesc = "ä≥é“é{ê›ïœçXâÊñ " ;
      /* GeneXus formulas. */
      AV33Pgmname = "B713_WP02_SUBJECT_SITE_CHG" ;
      AV32Pgmdesc = "ä≥é“é{ê›ïœçXâÊñ " ;
      Gx_err = (short)(0) ;
      cmbavD_site_id.setEnabled( 0 );
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV26W_RTN_CD ;
   private byte nDonePA ;
   private byte AV36GXLvl258 ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private int wcpOAV29P_SUBJECT_ID ;
   private int AV29P_SUBJECT_ID ;
   private int AV16H_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int A88TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private long wcpOAV17P_STUDY_ID ;
   private long AV17P_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long A17TBM22_STUDY_ID ;
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
   private String AV33Pgmname ;
   private String AV32Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_subject_id_Internalname ;
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
   private String lblTxt_btn_end_Internalname ;
   private String lblTxt_btn_end_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_subject_id_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable5_Internalname ;
   private String lblBtn_reg_Internalname ;
   private String lblBtn_reg_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavP_subject_id_Internalname ;
   private String edtavP_subject_id_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
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
   private boolean AV24W_ERRFLG ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV11D_SITE_ID ;
   private String AV10D_CHG_SITE_ID ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV7C_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV25W_MSG ;
   private String AV20W_A821_JS ;
   private String A698TBT01_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A319TAM08_SITE_NM ;
   private String A18TBM22_SITE_ID ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String AV23W_ERRCD ;
   private String AV12D_SUBJECT_ID ;
   private String AV19W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavD_site_id ;
   private HTMLChoice cmbavD_chg_site_id ;
   private IDataStoreProvider pr_default ;
   private int[] H00212_A88TBT01_SUBJECT_ID ;
   private long[] H00212_A87TBT01_STUDY_ID ;
   private String[] H00212_A698TBT01_SITE_ID ;
   private boolean[] H00212_n698TBT01_SITE_ID ;
   private String[] H00213_A377TBM22_DEL_FLG ;
   private boolean[] H00213_n377TBM22_DEL_FLG ;
   private long[] H00213_A17TBM22_STUDY_ID ;
   private String[] H00213_A319TAM08_SITE_NM ;
   private boolean[] H00213_n319TAM08_SITE_NM ;
   private String[] H00213_A18TBM22_SITE_ID ;
   private String[] H00214_A369TBM21_DEL_FLG ;
   private boolean[] H00214_n369TBM21_DEL_FLG ;
   private long[] H00214_A63TBM21_STUDY_ID ;
   private String[] H00214_A607TBM21_STATUS ;
   private boolean[] H00214_n607TBM21_STATUS ;
   private SdtTBT01_SUBJECT AV6BC_SUBJECT ;
   private SdtA_LOGIN_SDT AV18W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b713_wp02_subject_site_chg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00212", "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00213", "SELECT T1.`TBM22_DEL_FLG`, T1.`TBM22_STUDY_ID`, T2.`TAM08_SITE_NM`, T1.`TBM22_SITE_ID` AS TBM22_SITE_ID FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID` = T1.`TBM22_SITE_ID`) WHERE (T1.`TBM22_STUDY_ID` = ?) AND (T1.`TBM22_DEL_FLG` = '0') ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00214", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

