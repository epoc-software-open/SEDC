/*
               File: a210_wp01_import_domain_impl
        Description: �h���C���捞���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:14.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a210_wp01_import_domain_impl extends GXWebPanel
{
   public a210_wp01_import_domain_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a210_wp01_import_domain_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a210_wp01_import_domain_impl.class ));
   }

   public a210_wp01_import_domain_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_moji_cd = new HTMLChoice();
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
         pa1V2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1V2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1V2( ) ;
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
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513301418");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a210_wp01_import_domain") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1V2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV9D_UPLOAD_FILE));
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
      return "A210_WP01_IMPORT_DOMAIN" ;
   }

   public String getPgmdesc( )
   {
      return "�h���C���捞���" ;
   }

   public void wb1V0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1V2( true) ;
      }
      else
      {
         wb_table1_2_1V2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_64_1V2( true) ;
      }
      else
      {
         wb_table2_64_1V2( false) ;
      }
      return  ;
   }

   public void wb_table2_64_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "�h���C���捞���", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0062") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0062", "");
         }
      }
      wbErr = false ;
      strup1V0( ) ;
   }

   public void ws1V2( )
   {
      start1V2( ) ;
      evt1V2( ) ;
   }

   public void evt1V2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111V2 */
                        e111V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121V2 */
                        e121V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131V2 */
                        e131V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141V2 */
                        e141V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151V2 */
                        e151V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161V2 */
                        e161V2 ();
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
                  else if ( nCmpId == 62 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0062") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0062", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1V2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1V2( ) ;
         }
      }
   }

   public void pa1V2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         cmbavD_moji_cd.setName( "vD_MOJI_CD" );
         cmbavD_moji_cd.setWebtags( "" );
         cmbavD_moji_cd.addItem("UTF-8", "UTF-8", (short)(0));
         cmbavD_moji_cd.addItem("MS932", "Shift_JIS", (short)(0));
         if ( cmbavD_moji_cd.getItemCount() > 0 )
         {
            AV7D_MOJI_CD = cmbavD_moji_cd.getValidValue(AV7D_MOJI_CD) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_MOJI_CD", AV7D_MOJI_CD);
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
      rf1V2( ) ;
      /* End function Refresh */
   }

   public void rf1V2( )
   {
      /* Execute user event: e141V2 */
      e141V2 ();
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
         /* Execute user event: e161V2 */
         e161V2 ();
         wb1V0( ) ;
      }
   }

   public void strup1V0( )
   {
      /* Before Start, stand alone formulas. */
      AV31Pgmname = "A210_WP01_IMPORT_DOMAIN" ;
      AV30Pgmdesc = "�h���C���捞���" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e131V2 */
      e131V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV9D_UPLOAD_FILE = httpContext.cgiGet( edtavD_upload_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
         cmbavD_moji_cd.setValue( httpContext.cgiGet( cmbavD_moji_cd.getInternalname()) );
         AV7D_MOJI_CD = httpContext.cgiGet( cmbavD_moji_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_MOJI_CD", AV7D_MOJI_CD);
         AV8D_ORIGINAL_NAME = httpContext.cgiGet( edtavD_original_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_ORIGINAL_NAME", AV8D_ORIGINAL_NAME);
         AV10H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         AV11H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         /* Read saved values. */
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0062") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0062", "");
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
            AV9D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
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
      /* Execute user event: e131V2 */
      e131V2 ();
      if (returnInSub) return;
   }

   public void e131V2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "A210" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV30Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
      Form.setCaption( AV6C_GAMEN_TITLE );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV16W_DATETIME = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_DATETIME", localUtil.ttoc( AV16W_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      GXt_char1 = AV22W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV13W_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
      a210_wp01_import_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22W_FILE_PATH = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_FILE_PATH", AV22W_FILE_PATH);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV10H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      edtavD_original_name_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_original_name_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavD_original_name_Visible, 5, 0)));
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV13W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0062",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e141V2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV10H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "INFO", "��ʋN��") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV10H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      edtavD_upload_file_Display = (short)(2) ;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e111V2( )
   {
      /* 'BTN_UPLOAD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV11H_KNGN_FLG, "") )
      {
         AV20W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
         if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            AV20W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
         }
         else
         {
            AV25W_LEN = (short)(GXutil.len( AV8D_ORIGINAL_NAME)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_LEN", GXutil.ltrim( GXutil.str( AV25W_LEN, 4, 0)));
            if ( AV25W_LEN > 4 )
            {
               AV26W_POS = (short)(AV25W_LEN-4+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26W_POS", GXutil.ltrim( GXutil.str( AV26W_POS, 4, 0)));
               AV27W_STR = GXutil.lower( GXutil.substring( AV8D_ORIGINAL_NAME, AV26W_POS, 4)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27W_STR", AV27W_STR);
               if ( GXutil.strcmp(AV27W_STR, ".csv") != 0 )
               {
                  AV20W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
               }
            }
            else
            {
               AV20W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
            }
         }
         if ( AV20W_ERRFLG )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CSV�t�@�C��", "", "", "", "", GXv_char2) ;
            a210_wp01_import_domain_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
         }
         else
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00026", "CSV�t�@�C��", "�A�b�v���[�h", "", "", "", GXv_char2) ;
            a210_wp01_import_domain_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            GXt_char1 = AV15W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV24W_MSG, "", "BTN_UPLOAD_EXEC", "", GXv_char2) ;
            a210_wp01_import_domain_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            AV15W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15W_A821_JS", AV15W_A821_JS);
         }
      }
   }

   public void e151V2( )
   {
      /* 'BTN_UPLOAD_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV17W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a210_wp01_import_domain");
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char2) ;
         a210_wp01_import_domain_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a210_wp01_import_domain");
         AV20W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRFLG", AV20W_ERRFLG);
      }
   }

   public void e121V2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a208_wp01_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
      httpContext.wjLoc = formatLink("a208_wp01_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
   }

   public void S172( )
   {
      /* 'SUB_UPLOAD' Routine */
      GXv_int3[0] = AV17W_ERR_CD ;
      GXv_objcol_svchar4[0] = AV18W_ERR_MSG ;
      new a210_pc01_domain_import(remoteHandle, context).execute( AV9D_UPLOAD_FILE, AV7D_MOJI_CD, GXv_int3, GXv_objcol_svchar4) ;
      a210_wp01_import_domain_impl.this.AV17W_ERR_CD = GXv_int3[0] ;
      AV18W_ERR_MSG = GXv_objcol_svchar4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_MOJI_CD", AV7D_MOJI_CD);
      httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERR_CD", GXutil.ltrim( GXutil.str( AV17W_ERR_CD, 4, 0)));
      if ( AV17W_ERR_CD != 0 )
      {
         AV32GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrim( GXutil.str( AV32GXV1, 8, 0)));
         while ( AV32GXV1 <= AV18W_ERR_MSG.size() )
         {
            AV24W_MSG = (String)AV18W_ERR_MSG.elementAt(-1+AV32GXV1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
            AV32GXV1 = (int)(AV32GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrim( GXutil.str( AV32GXV1, 8, 0)));
         }
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      a210_wp01_import_domain_impl.this.AV19W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_ERRCD", AV19W_ERRCD);
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
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
      AV15W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_A821_JS", AV15W_A821_JS);
      AV14W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_A819_JS", AV14W_A819_JS);
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
      if ( ! (GXutil.strcmp("", AV15W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV15W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV14W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV14W_A819_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var upFile = document.getElementById('"+edtavD_upload_file_Internalname+"');" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (upFile.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.addEventListener('focus', function(){upFileBlur();}, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.attachEvent('onfocus',function(){upFileBlur();});" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	upFileBlur();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function upFileBlur() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	setTimeout('document.getElementById(\\'"+edtavD_upload_file_Internalname+"\\').blur()',300);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "<script language=\"javascript\">" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"function func_copyParams(){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"var _filename = MAINFORM."+edtavD_upload_file_Internalname+".value;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"MAINFORM."+edtavD_original_name_Internalname+".value = _filename.substring(_filename.lastIndexOf('\\\\')+1, _filename.length);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"return true;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblTxt_btn_upload_Jsonclick = "func_copyParams()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upload_Internalname, "Jsonclick", lblTxt_btn_upload_Jsonclick);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV11H_KNGN_FLG ;
      GXv_char6[0] = AV19W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char2, GXv_char6) ;
      a210_wp01_import_domain_impl.this.AV11H_KNGN_FLG = GXv_char2[0] ;
      a210_wp01_import_domain_impl.this.AV19W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_ERRCD", AV19W_ERRCD);
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a210_wp01_import_domain");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e161V2( )
   {
      /* Load Routine */
   }

   public void wb_table2_64_1V2( boolean wbgen )
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
         httpContext.writeText( "<p>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblText_onclick_Internalname, lblText_onclick_Caption, "", "", lblText_onclick_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upload_exec_Internalname, "BTN_UPLOAD_EXEC", "", "", lblBtn_upload_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV10H_INIT_FLG), GXutil.rtrim( localUtil.format( AV10H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_64_1V2e( true) ;
      }
      else
      {
         wb_table2_64_1V2e( false) ;
      }
   }

   public void wb_table1_2_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_1V2( true) ;
      }
      else
      {
         wb_table3_6_1V2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1V2e( boolean wbgen )
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
         wb_table1_2_1V2e( true) ;
      }
      else
      {
         wb_table1_2_1V2e( false) ;
      }
   }

   public void wb_table3_6_1V2( boolean wbgen )
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
         wb_table4_12_1V2( true) ;
      }
      else
      {
         wb_table4_12_1V2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_20_1V2( true) ;
      }
      else
      {
         wb_table5_20_1V2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0062"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0062"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0062"+"");
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
         wb_table3_6_1V2e( true) ;
      }
      else
      {
         wb_table3_6_1V2e( false) ;
      }
   }

   public void wb_table5_20_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 279, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 843, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:46px;width:850px\">") ;
         wb_table6_23_1V2( true) ;
      }
      else
      {
         wb_table6_23_1V2( false) ;
      }
      return  ;
   }

   public void wb_table6_23_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_original_name_Internalname, GXutil.rtrim( AV8D_ORIGINAL_NAME), GXutil.rtrim( localUtil.format( AV8D_ORIGINAL_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_original_name_Jsonclick, 0, "Attribute", "", "", "", edtavD_original_name_Visible, edtavD_original_name_Enabled, 0, "text", "", 220, "px", 15, "px", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         wb_table7_35_1V2( true) ;
      }
      else
      {
         wb_table7_35_1V2( false) ;
      }
      return  ;
   }

   public void wb_table7_35_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table8_58_1V2( true) ;
      }
      else
      {
         wb_table8_58_1V2( false) ;
      }
      return  ;
   }

   public void wb_table8_58_1V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_1V2e( true) ;
      }
      else
      {
         wb_table5_20_1V2e( false) ;
      }
   }

   public void wb_table8_58_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody></tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_58_1V2e( true) ;
      }
      else
      {
         wb_table8_58_1V2e( false) ;
      }
   }

   public void wb_table7_35_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "�y���ӎ����z", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:30px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "(1)", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "�捞�t�@�C���́u�h���C���}�X�^�����e�i���X�i�ꗗ�j��ʂ�CSV�o�͂ŏo�͂����CSV�t�H�[�}�b�g�v�ɑΉ����Ă��܂��B", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "(2)", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "CSV�f�[�^�͑S���捞�i�}�X�^�S�f�[�^�폜��CSV�S�f�[�^�}�X�^�o�^�j�Ńh���C���}�X�^�ɔ��f����܂��B", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_35_1V2e( true) ;
      }
      else
      {
         wb_table7_35_1V2e( false) ;
      }
   }

   public void wb_table6_23_1V2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "CSV�t�@�C��", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         edtavD_upload_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
         if ( ! (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            gxblobfileaux.setSource( AV9D_UPLOAD_FILE );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavD_upload_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavD_upload_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV9D_UPLOAD_FILE = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
               edtavD_upload_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtavD_upload_file_Internalname, GXutil.rtrim( AV9D_UPLOAD_FILE), httpContext.getResourceRelative(AV9D_UPLOAD_FILE), ((GXutil.strcmp("", edtavD_upload_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavD_upload_file_Filetype)==0) ? AV9D_UPLOAD_FILE : edtavD_upload_file_Filetype)) : edtavD_upload_file_Contenttype), false, "", edtavD_upload_file_Parameters, edtavD_upload_file_Display, 1, 1, "", "", 0, 0, 300, "px", 16, "px", 0, 0, 0, edtavD_upload_file_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(28);\"", "", "", "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "URL", httpContext.getResourceRelative(AV9D_UPLOAD_FILE));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "�t�@�C�������R�[�h", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_moji_cd, cmbavD_moji_cd.getInternalname(), GXutil.rtrim( AV7D_MOJI_CD), 1, cmbavD_moji_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 20, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "", true, "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         cmbavD_moji_cd.setValue( GXutil.rtrim( AV7D_MOJI_CD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_moji_cd.getInternalname(), "Values", cmbavD_moji_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_23_1V2e( true) ;
      }
      else
      {
         wb_table6_23_1V2e( false) ;
      }
   }

   public void wb_table4_12_1V2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upload_Internalname, "�A�b�v���[�h�iF3�j", "", "", lblTxt_btn_upload_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "�߂�iF11�j", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_A210_WP01_IMPORT_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1V2e( true) ;
      }
      else
      {
         wb_table4_12_1V2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa1V2( ) ;
      ws1V2( ) ;
      we1V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513301467");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a210_wp01_import_domain.js", "?202071513301467");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_upload_Internalname = "TXT_BTN_UPLOAD" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_upload_file_Internalname = "vD_UPLOAD_FILE" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      cmbavD_moji_cd.setInternalname( "vD_MOJI_CD" );
      tblTable10_Internalname = "TABLE10" ;
      edtavD_original_name_Internalname = "vD_ORIGINAL_NAME" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblText_onclick_Internalname = "TEXT_ONCLICK" ;
      lblBtn_upload_exec_Internalname = "BTN_UPLOAD_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      cmbavD_moji_cd.setJsonclick( "" );
      edtavD_upload_file_Jsonclick = "" ;
      edtavD_upload_file_Parameters = "" ;
      edtavD_upload_file_Contenttype = "text/csv" ;
      edtavD_upload_file_Filetype = "" ;
      edtavD_upload_file_Display = (short)(0) ;
      edtavD_original_name_Jsonclick = "" ;
      edtavD_original_name_Enabled = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblText_onclick_Jsonclick = "" ;
      edtavD_original_name_Visible = 1 ;
      lblText_onclick_Caption = "Text_onclick" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      Form.setCaption( "�h���C���捞���" );
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
      GXCCtlgxBlob = "" ;
      AV9D_UPLOAD_FILE = "" ;
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
      GXKey = "" ;
      AV7D_MOJI_CD = "" ;
      AV31Pgmname = "" ;
      AV30Pgmdesc = "" ;
      AV8D_ORIGINAL_NAME = "" ;
      AV10H_INIT_FLG = "" ;
      AV11H_KNGN_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV16W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV22W_FILE_PATH = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV27W_STR = "" ;
      AV24W_MSG = "" ;
      AV15W_A821_JS = "" ;
      GXt_char1 = "" ;
      GXEncryptionTmp = "" ;
      GXv_int3 = new short [1] ;
      AV18W_ERR_MSG = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      AV14W_A819_JS = "" ;
      lblTxt_btn_upload_Jsonclick = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_upload_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      lblTextblock31_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a210_wp01_import_domain__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV31Pgmname = "A210_WP01_IMPORT_DOMAIN" ;
      AV30Pgmdesc = "�h���C���捞���" ;
      /* GeneXus formulas. */
      AV31Pgmname = "A210_WP01_IMPORT_DOMAIN" ;
      AV30Pgmdesc = "�h���C���捞���" ;
      Gx_err = (short)(0) ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short edtavD_upload_file_Display ;
   private short AV25W_LEN ;
   private short AV26W_POS ;
   private short AV17W_ERR_CD ;
   private short GXv_int3[] ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_original_name_Visible ;
   private int AV32GXV1 ;
   private int GXActiveErrHndl ;
   private int edtavD_original_name_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String GXKey ;
   private String AV31Pgmname ;
   private String AV30Pgmdesc ;
   private String edtavD_upload_file_Internalname ;
   private String edtavD_original_name_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblText_onclick_Caption ;
   private String lblText_onclick_Internalname ;
   private String GXt_char1 ;
   private String GXEncryptionTmp ;
   private String lblTxt_btn_upload_Jsonclick ;
   private String lblTxt_btn_upload_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblText_onclick_Jsonclick ;
   private String lblBtn_upload_exec_Internalname ;
   private String lblBtn_upload_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String edtavD_original_name_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String tblTable5_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_upload_file_Filetype ;
   private String edtavD_upload_file_Contenttype ;
   private String edtavD_upload_file_Parameters ;
   private String edtavD_upload_file_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date AV16W_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV20W_ERRFLG ;
   private String AV9D_UPLOAD_FILE ;
   private String AV7D_MOJI_CD ;
   private String AV8D_ORIGINAL_NAME ;
   private String AV10H_INIT_FLG ;
   private String AV11H_KNGN_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String AV22W_FILE_PATH ;
   private String AV27W_STR ;
   private String AV24W_MSG ;
   private String AV15W_A821_JS ;
   private String AV19W_ERRCD ;
   private String AV14W_A819_JS ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private HTMLChoice cmbavD_moji_cd ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV18W_ERR_MSG ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
}

final  class a210_wp01_import_domain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

