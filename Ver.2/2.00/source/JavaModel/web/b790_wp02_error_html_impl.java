/*
               File: b790_wp02_error_html_impl
        Description: 共通エラー画面（HTML5連携）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:19:53.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b790_wp02_error_html_impl extends GXWebPanel
{
   public b790_wp02_error_html_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b790_wp02_error_html_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b790_wp02_error_html_impl.class ));
   }

   public b790_wp02_error_html_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         pa1P2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1P2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1P2( ) ;
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
      httpContext.writeValue( "共通エラー画面（HTML5連携）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317195349");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b790_wp02_error_html") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1P2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
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
      return "B790_WP02_ERROR_HTML" ;
   }

   public String getPgmdesc( )
   {
      return "共通エラー画面（HTML5連携）" ;
   }

   public void wb1P0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         wb_table1_2_1P2( true) ;
      }
      else
      {
         wb_table1_2_1P2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1P2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "共通エラー画面（HTML5連携）", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         OldWebcomp1 = httpContext.cgiGet( "W0012") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0012", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0033") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0033", "");
         }
      }
      wbErr = false ;
      strup1P0( ) ;
   }

   public void ws1P2( )
   {
      start1P2( ) ;
      evt1P2( ) ;
   }

   public void evt1P2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_END'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111P2 */
                        e111P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121P2 */
                        e121P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131P2 */
                        e131P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141P2 */
                        e141P2 ();
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
                  if ( nCmpId == 12 )
                  {
                     OldWebcomp1 = httpContext.cgiGet( "W0012") ;
                     if ( ( GXutil.len( OldWebcomp1) == 0 ) || ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 ) )
                     {
                        WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                        WebComp_Webcomp1_Component = OldWebcomp1 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
                     {
                        WebComp_Webcomp1.componentprocess("W0012", "", sEvt);
                     }
                     WebComp_Webcomp1_Component = OldWebcomp1 ;
                  }
                  else if ( nCmpId == 33 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0033") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0033", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1P2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1P2( ) ;
         }
      }
   }

   public void pa1P2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf1P2( ) ;
      /* End function Refresh */
   }

   public void rf1P2( )
   {
      /* Execute user event: e131P2 */
      e131P2 ();
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
         /* Execute user event: e141P2 */
         e141P2 ();
         wb1P0( ) ;
      }
   }

   public void strup1P0( )
   {
      /* Before Start, stand alone formulas. */
      AV13Pgmname = "B790_WP02_ERROR_HTML" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e121P2 */
      e121P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV7D_NONE = httpContext.cgiGet( edtavD_none_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_NONE", AV7D_NONE);
         /* Read saved values. */
         OldWebcomp1 = httpContext.cgiGet( "W0012") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0012", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0033") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0033", "");
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
      /* Execute user event: e121P2 */
      e121P2 ();
      if (returnInSub) return;
   }

   public void e121P2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "B790" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      AV5C_PGNM = "エラー" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_PGNM", AV5C_PGNM);
      Form.getJscriptsrc().add("js/acom.js") ;
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomp1_Component), GXutil.lower( "B791_WP01_HEADER")) != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "b791_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "B791_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0012","",AV9W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_PGNM,"",""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","",""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0033",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e131P2( )
   {
      /* Refresh Routine */
      if ( (GXutil.strcmp("", AV10W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AX00106", "", "", "", "", "", GXv_char2) ;
         b790_wp02_error_html_impl.this.GXt_char1 = GXv_char2[0] ;
         lblTbl_errmsg_Caption = GXt_char1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbl_errmsg_Internalname, "Caption", lblTbl_errmsg_Caption);
      }
      else
      {
         lblTbl_errmsg_Caption = "致命的エラーが発生しました。<br>システム管理者へご連絡下さい。" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbl_errmsg_Internalname, "Caption", lblTbl_errmsg_Caption);
      }
   }

   public void e111P2( )
   {
      /* 'BTN_END' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV13Pgmname, "INFO", "ログアウト") ;
      httpContext.wjLoc = formatLink("b710_wp01_login")  ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e141P2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_1P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xA0A0A0)) + ";" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         wb_table2_5_1P2( true) ;
      }
      else
      {
         wb_table2_5_1P2( false) ;
      }
      return  ;
   }

   public void wb_table2_5_1P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1P2e( true) ;
      }
      else
      {
         wb_table1_2_1P2e( false) ;
      }
   }

   public void wb_table2_5_1P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 820, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table3_9_1P2( true) ;
      }
      else
      {
         wb_table3_9_1P2( false) ;
      }
      return  ;
   }

   public void wb_table3_9_1P2e( boolean wbgen )
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
         wb_table2_5_1P2e( true) ;
      }
      else
      {
         wb_table2_5_1P2e( false) ;
      }
   }

   public void wb_table3_9_1P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\"vertical-align:top\">") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0012"+"", GXutil.rtrim( WebComp_Webcomp1_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0012"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0012"+"");
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
         httpContext.writeText( "<td id=\""+cellMenu_bg_Internalname+"\"  style=\"height:30px\" class=''>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"height:100%\">") ;
         wb_table4_17_1P2( true) ;
      }
      else
      {
         wb_table4_17_1P2( false) ;
      }
      return  ;
   }

   public void wb_table4_17_1P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0033"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0033"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0033"+"");
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
         wb_table3_9_1P2e( true) ;
      }
      else
      {
         wb_table3_9_1P2e( false) ;
      }
   }

   public void wb_table4_17_1P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:50px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_none_Internalname, GXutil.rtrim( AV7D_NONE), GXutil.rtrim( localUtil.format( AV7D_NONE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_none_Jsonclick, 0, "AttributeNone", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B790_WP02_ERROR_HTML.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTbl_errmsg_Internalname, lblTbl_errmsg_Caption, "", "", lblTbl_errmsg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockErrMsg", 0, "", 1, 1, (short)(1), "HLP_B790_WP02_ERROR_HTML.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"height:50px\">") ;
         wb_table5_26_1P2( true) ;
      }
      else
      {
         wb_table5_26_1P2( false) ;
      }
      return  ;
   }

   public void wb_table5_26_1P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_17_1P2e( true) ;
      }
      else
      {
         wb_table4_17_1P2e( false) ;
      }
   }

   public void wb_table5_26_1P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_end_Internalname, "ログイン（F12）", "", "", lblTxt_btn_end_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_END\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B790_WP02_ERROR_HTML.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_26_1P2e( true) ;
      }
      else
      {
         wb_table5_26_1P2e( false) ;
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
      pa1P2( ) ;
      ws1P2( ) ;
      we1P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317195363");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b790_wp02_error_html.js", "?20177317195363");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cellMenu_bg_Internalname = "MENU_BG" ;
      edtavD_none_Internalname = "vD_NONE" ;
      lblTbl_errmsg_Internalname = "TBL_ERRMSG" ;
      lblTxt_btn_end_Internalname = "TXT_BTN_END" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_none_Jsonclick = "" ;
      lblTbl_errmsg_Caption = "エラーメッセージ" ;
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
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
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
      AV13Pgmname = "" ;
      AV7D_NONE = "" ;
      AV6C_TAM02_APP_ID = "" ;
      AV5C_PGNM = "" ;
      AV9W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV10W_SESSION = httpContext.getWebSession();
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      TempTags = "" ;
      lblTbl_errmsg_Jsonclick = "" ;
      lblTxt_btn_end_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV13Pgmname = "B790_WP02_ERROR_HTML" ;
      /* GeneXus formulas. */
      AV13Pgmname = "B790_WP02_ERROR_HTML" ;
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
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String AV13Pgmname ;
   private String edtavD_none_Internalname ;
   private String lblTbl_errmsg_Caption ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String lblTbl_errmsg_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String edtavD_none_Jsonclick ;
   private String lblTbl_errmsg_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTxt_btn_end_Internalname ;
   private String lblTxt_btn_end_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String AV7D_NONE ;
   private String AV6C_TAM02_APP_ID ;
   private String AV5C_PGNM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.webpanels.WebSession AV10W_SESSION ;
   private SdtA_LOGIN_SDT AV9W_A_LOGIN_SDT ;
}

