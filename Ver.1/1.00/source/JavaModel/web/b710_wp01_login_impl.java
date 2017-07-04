/*
               File: b710_wp01_login_impl
        Description: ログイン
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:38.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b710_wp01_login_impl extends GXWebPanel
{
   public b710_wp01_login_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b710_wp01_login_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b710_wp01_login_impl.class ));
   }

   public b710_wp01_login_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_Grid1 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_40_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_40_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_40_idx, sGXsfl_40_idx) ;
            return  ;
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
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa0D2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws0D2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we0D2( ) ;
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
      httpContext.writeText( "ログイン") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b710_wp01_login") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0D2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vC_SYSDATE", localUtil.dtoc( AV8C_SYSDATE, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "TAT01_INFO", GXutil.rtrim( A6TAT01_INFO));
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

   public void wb0D0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0D2( true) ;
      }
      else
      {
         wb_table1_2_0D2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_55_0D2( true) ;
      }
      else
      {
         wb_table2_55_0D2( false) ;
      }
      return  ;
   }

   public void wb_table2_55_0D2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ログイン", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0053") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0053", "");
         }
      }
      wbErr = false ;
      strup0D0( ) ;
   }

   public void ws0D2( )
   {
      start0D2( ) ;
      evt0D2( ) ;
   }

   public void evt0D2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_LOGIN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110D2 */
                        e110D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_40_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_40_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_40_idx, 4, 0)), (short)(4), "0") ;
                        edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
                        edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
                        A4TAT01_DATE_START = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_START_Internalname), 6) ;
                        n4TAT01_DATE_START = false ;
                        AV10D_GRD_TAT01_INFO = httpContext.cgiGet( edtavD_grd_tat01_info_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0012") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0012", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0053") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0053", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0012") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0012", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0053") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0053", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e120D2 */
                              e120D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e130D2 */
                              e130D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e140D2 */
                              e140D2 ();
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
                           }
                           else if ( GXutil.strcmp(sEvt, "CANCEL") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
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
                  else if ( nCmpId == 53 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0053") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0053", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0D2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0D2( ) ;
         }
      }
   }

   public void pa0D2( )
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

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_40_idx ,
                                 String sGXsfl_40_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
      edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
      while ( nGXsfl_40_idx <= nRC_Grid1 )
      {
         sendrow_402( ) ;
         nGXsfl_40_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_40_idx+1)) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_40_idx, 4, 0)), (short)(4), "0") ;
         edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
         edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf0D2( ) ;
      /* End function Refresh */
   }

   public void rf0D2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(40) ;
      nGXsfl_40_idx = (short)(1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_40_idx, 4, 0)), (short)(4), "0") ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
      edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
      /* Execute user event: e130D2 */
      e130D2 ();
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
         edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
         edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
         /* Using cursor H000D2 */
         pr_default.execute(0, new Object[] {AV8C_SYSDATE, AV8C_SYSDATE, AV8C_SYSDATE});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A117TAT01_DEL_FLG = H000D2_A117TAT01_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A117TAT01_DEL_FLG", A117TAT01_DEL_FLG);
            n117TAT01_DEL_FLG = H000D2_n117TAT01_DEL_FLG[0] ;
            A6TAT01_INFO = H000D2_A6TAT01_INFO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6TAT01_INFO", A6TAT01_INFO);
            n6TAT01_INFO = H000D2_n6TAT01_INFO[0] ;
            A867TAT01_INFO_KBN = H000D2_A867TAT01_INFO_KBN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A867TAT01_INFO_KBN", A867TAT01_INFO_KBN);
            n867TAT01_INFO_KBN = H000D2_n867TAT01_INFO_KBN[0] ;
            A5TAT01_DATE_END = H000D2_A5TAT01_DATE_END[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5TAT01_DATE_END", localUtil.format(A5TAT01_DATE_END, "9999/99/99"));
            n5TAT01_DATE_END = H000D2_n5TAT01_DATE_END[0] ;
            A4TAT01_DATE_START = H000D2_A4TAT01_DATE_START[0] ;
            n4TAT01_DATE_START = H000D2_n4TAT01_DATE_START[0] ;
            /* Execute user event: e140D2 */
            e140D2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbEnd = (short)(40) ;
         wb0D0( ) ;
      }
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup0D0( )
   {
      /* Before Start, stand alone formulas. */
      AV25Pgmname = "B710_WP01_LOGIN" ;
      Gx_err = (short)(0) ;
      edtavD_grd_tat01_info_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e120D2 */
      e120D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV12D_TAM07_USER_ID = httpContext.cgiGet( edtavD_tam07_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_USER_ID", AV12D_TAM07_USER_ID);
         AV11D_TAM07_PWD = httpContext.cgiGet( edtavD_tam07_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0012") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0012", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0053") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0053", "");
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
      /* Execute user event: e120D2 */
      e120D2 ();
      if (returnInSub) return;
   }

   public void e120D2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "B710" ;
      AV7C_PGNM = "Smart EDCシステム利用者ログイン" ;
      AV8C_SYSDATE = GXutil.resetTime(GXutil.now( )) ;
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
      if ( GXutil.strcmp(WebComp_Webcomp1_Component, "B791_WP01_HEADER") != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "b791_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "B791_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0012","",AV14W_A_LOGIN_SDT,AV9C_TAM02_APP_ID,AV7C_PGNM,"",""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","",""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0053",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e130D2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         GX_FocusControl = edtavD_tam07_user_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV13H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
   }

   private void e140D2( )
   {
      /* Grid1_Load Routine */
      GXt_char3 = AV10D_GRD_TAT01_INFO ;
      GXv_char4[0] = GXt_char3 ;
      new a803_pc01_htmlescape(remoteHandle, context).execute( A6TAT01_INFO, GXv_char4) ;
      b710_wp01_login_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6TAT01_INFO", A6TAT01_INFO);
      AV10D_GRD_TAT01_INFO = GXt_char3 ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(40) ;
      }
      sendrow_402( ) ;
   }

   public void e110D2( )
   {
      /* 'BTN_LOGIN' Routine */
      AV16W_ERRFLG = "0" ;
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV16W_ERRFLG, "0") == 0 )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         if ( (GXutil.strcmp("", AV18W_MSG)==0) )
         {
            new b805_pc01_work_del(remoteHandle, context).execute( AV9C_TAM02_APP_ID, "") ;
            new a804_pc01_syslog(remoteHandle, context).execute( "", "INFO", "ログイン") ;
            AV19W_SESSION.setValue("B501_LOGIN_FST", "1");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
            httpContext.wjLoc = formatLink("b711_wp01_search_study") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      GXt_char3 = AV20W_TAM07_PWD ;
      GXv_char4[0] = GXt_char3 ;
      new b801_pc01_md5(remoteHandle, context).execute( AV11D_TAM07_PWD, GXv_char4) ;
      b710_wp01_login_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
      AV20W_TAM07_PWD = GXt_char3 ;
      AV23GXLvl160 = (byte)(0) ;
      /* Using cursor H000D3 */
      pr_default.execute(1, new Object[] {AV12D_TAM07_USER_ID, AV20W_TAM07_PWD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A16TAM07_DEL_FLG = H000D3_A16TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         n16TAM07_DEL_FLG = H000D3_n16TAM07_DEL_FLG[0] ;
         A7TAM07_PWD = H000D3_A7TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
         n7TAM07_PWD = H000D3_n7TAM07_PWD[0] ;
         A8TAM07_USER_ID = H000D3_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         AV23GXLvl160 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV23GXLvl160 == 0 )
      {
         AV16W_ERRFLG = "1" ;
         GXt_char3 = AV18W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00029", "", "", "", "", "", GXv_char4) ;
         b710_wp01_login_impl.this.GXt_char3 = GXv_char4[0] ;
         AV18W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV18W_MSG);
         if ( (GXutil.strcmp("", AV12D_TAM07_USER_ID)==0) )
         {
            GX_FocusControl = edtavD_tam07_user_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV11D_TAM07_PWD)==0) )
            {
               GX_FocusControl = edtavD_tam07_pwd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               GX_FocusControl = edtavD_tam07_user_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
      }
   }

   public void S162( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_tam07_user_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_user_id_Backcolor, 9, 0)));
      edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
   }

   public void S152( )
   {
      /* 'CREATE_LOGIN_SDT' Routine */
      /* Using cursor H000D4 */
      pr_default.execute(2, new Object[] {AV12D_TAM07_USER_ID});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8TAM07_USER_ID = H000D4_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         A2TAM07_USER_NM = H000D4_A2TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
         n2TAM07_USER_NM = H000D4_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = H000D4_A126TAM07_USER_KANA_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
         n126TAM07_USER_KANA_NM = H000D4_n126TAM07_USER_KANA_NM[0] ;
         A14TAM07_AUTH_CD = H000D4_A14TAM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
         n14TAM07_AUTH_CD = H000D4_n14TAM07_AUTH_CD[0] ;
         A147TAM07_SITE_ID = H000D4_A147TAM07_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
         n147TAM07_SITE_ID = H000D4_n147TAM07_SITE_ID[0] ;
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Session_id( AV19W_SESSION.getId() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_id( A8TAM07_USER_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( A2TAM07_USER_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( A126TAM07_USER_KANA_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( A14TAM07_AUTH_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_Tam07_site_id( A147TAM07_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 = new GxObjectCollection() ;
      GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem6[0] = GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 ;
      new a801_pc01_sys_config_init(remoteHandle, context).execute( GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem6) ;
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 = GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem6[0] ;
      AV14W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_A801_sys_config( GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14W_A_LOGIN_SDT", AV14W_A_LOGIN_SDT);
      AV19W_SESSION.setValue("Com_Login_Info", AV14W_A_LOGIN_SDT.toxml(false, "A_LOGIN_SDT", "SmartEDC_SHIZUOKA"));
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV25Pgmname) ;
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
   }

   public void S132( )
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S17295( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b710_wp01_login");
   }

   public void wb_table2_55_0D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B710_WP01_LOGIN.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_40_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_55_0D2e( true) ;
      }
      else
      {
         wb_table2_55_0D2e( false) ;
      }
   }

   public void wb_table1_2_0D2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table3_5_0D2( true) ;
      }
      else
      {
         wb_table3_5_0D2( false) ;
      }
      return  ;
   }

   public void wb_table3_5_0D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0D2e( true) ;
      }
      else
      {
         wb_table1_2_0D2e( false) ;
      }
   }

   public void wb_table3_5_0D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 450, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 620, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table4_9_0D2( true) ;
      }
      else
      {
         wb_table4_9_0D2( false) ;
      }
      return  ;
   }

   public void wb_table4_9_0D2e( boolean wbgen )
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
         wb_table3_5_0D2e( true) ;
      }
      else
      {
         wb_table3_5_0D2e( false) ;
      }
   }

   public void wb_table4_9_0D2( boolean wbgen )
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
         GxWebStd.gx_hidden_field( httpContext, "W0012"+"", GXutil.rtrim( WebComp_Webcomp1_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0012"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0012"+"");
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
         httpContext.writeText( "<td id=\""+cellMenu_bg_Internalname+"\"  style=\"height:30px\" class=''>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:120px\">") ;
         wb_table5_19_0D2( true) ;
      }
      else
      {
         wb_table5_19_0D2( false) ;
      }
      return  ;
   }

   public void wb_table5_19_0D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:100%\">") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"40\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 520, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( httpContext.isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetIsFreestyle(true);
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 520, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A4TAT01_DATE_START, "9999/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV10D_GRD_TAT01_INFO));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_tat01_info_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 40 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_40_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0053"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0053"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0053"+"");
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
         wb_table4_9_0D2e( true) ;
      }
      else
      {
         wb_table4_9_0D2e( false) ;
      }
   }

   public void wb_table5_19_0D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "ユーザーID", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_USER_ID", AV12D_TAM07_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_40_idx + "',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavD_tam07_user_id_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_user_id_Internalname, GXutil.rtrim( AV12D_TAM07_USER_ID), GXutil.rtrim( localUtil.format( AV12D_TAM07_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(24);\"", "", "", "", "", edtavD_tam07_user_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "パスワード", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD", AV11D_TAM07_PWD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_40_idx + "',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavD_tam07_pwd_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_Internalname, GXutil.rtrim( AV11D_TAM07_PWD), GXutil.rtrim( localUtil.format( AV11D_TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "", "", "", "", edtavD_tam07_pwd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 128, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"Submit\" colspan=\"2\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlockBtn120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "ログイン", "", "", lblTextblock1_Jsonclick, "E\\'BTN_LOGIN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B710_WP01_LOGIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_19_0D2e( true) ;
      }
      else
      {
         wb_table5_19_0D2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa0D2( ) ;
      ws0D2( ) ;
      we0D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14573883");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b710_wp01_login.js", "?14573883");
      /* End function include_jscripts */
   }

   public void sendrow_402( )
   {
      wb0D0( ) ;
      Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_40_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_40_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_40_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_40_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_40_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTable5_Internalname+"_"+sGXsfl_40_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
      Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"height:35px;width:110px\""});
      /* Single line edit */
      ClassString = "ReadonlyAttributeInfo" ;
      StyleString = "font-family:'ＭＳ Ｐゴシック'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAT01_DATE_START_Internalname,localUtil.format(A4TAT01_DATE_START, "9999/99/99"),localUtil.format( A4TAT01_DATE_START, "9999/99/99"),"","","","","",edtTAT01_DATE_START_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(40),new Integer(1),new Integer(1),new Boolean(true),"right"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "font-family:'ＭＳ Ｐゴシック'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_tat01_info_Internalname,GXutil.rtrim( AV10D_GRD_TAT01_INFO),"","","","","","",edtavD_grd_tat01_info_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_tat01_info_Enabled),new Integer(0),new Integer(80),"chr",new Integer(1),"row",new Integer(2000),new Integer(0),new Integer(1),new Integer(40),new Integer(1),new Integer(1),new Boolean(true),"left"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"height:10px\""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)(nGXsfl_40_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_40_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_40_idx+1)) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_40_idx, 4, 0)), (short)(4), "0") ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_40_idx ;
      edtavD_grd_tat01_info_Internalname = "vD_GRD_TAT01_INFO_"+sGXsfl_40_idx ;
      /* End function sendrow_402 */
   }

   public void init_default_properties( )
   {
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavD_tam07_user_id_Internalname = "vD_TAM07_USER_ID" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavD_tam07_pwd_Internalname = "vD_TAM07_PWD" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_tat01_info_Jsonclick = "" ;
      edtTAT01_DATE_START_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridBase" ;
      edtavD_tam07_pwd_Jsonclick = "" ;
      edtavD_tam07_pwd_Backstyle = (byte)(-1) ;
      edtavD_tam07_user_id_Jsonclick = "" ;
      edtavD_tam07_user_id_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_tat01_info_Enabled = 0 ;
      subGrid1_Width = 520 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavD_tam07_pwd_Backcolor = (int)(0xFFFFFF) ;
      edtavD_tam07_user_id_Backcolor = (int)(0xFFFFFF) ;
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
                  /* Execute user subroutine: S17295 */
                  S17295 ();
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
      AV8C_SYSDATE = GXutil.nullDate() ;
      A6TAT01_INFO = "" ;
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
      edtTAT01_DATE_START_Internalname = "" ;
      edtavD_grd_tat01_info_Internalname = "" ;
      A4TAT01_DATE_START = GXutil.nullDate() ;
      AV10D_GRD_TAT01_INFO = "" ;
      GXKey = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      H000D2_A71TAT01_INFO_NO = new int[1] ;
      H000D2_A117TAT01_DEL_FLG = new String[] {""} ;
      H000D2_n117TAT01_DEL_FLG = new boolean[] {false} ;
      H000D2_A6TAT01_INFO = new String[] {""} ;
      H000D2_n6TAT01_INFO = new boolean[] {false} ;
      H000D2_A867TAT01_INFO_KBN = new String[] {""} ;
      H000D2_n867TAT01_INFO_KBN = new boolean[] {false} ;
      H000D2_A5TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      H000D2_n5TAT01_DATE_END = new boolean[] {false} ;
      H000D2_A4TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      H000D2_n4TAT01_DATE_START = new boolean[] {false} ;
      A117TAT01_DEL_FLG = "" ;
      A867TAT01_INFO_KBN = "" ;
      A5TAT01_DATE_END = GXutil.nullDate() ;
      AV25Pgmname = "" ;
      AV12D_TAM07_USER_ID = "" ;
      AV11D_TAM07_PWD = "" ;
      AV13H_INIT_FLG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV7C_PGNM = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV16W_ERRFLG = "" ;
      AV18W_MSG = "" ;
      AV19W_SESSION = httpContext.getWebSession();
      GXEncryptionTmp = "" ;
      AV20W_TAM07_PWD = "" ;
      H000D3_A16TAM07_DEL_FLG = new String[] {""} ;
      H000D3_n16TAM07_DEL_FLG = new boolean[] {false} ;
      H000D3_A7TAM07_PWD = new String[] {""} ;
      H000D3_n7TAM07_PWD = new boolean[] {false} ;
      H000D3_A8TAM07_USER_ID = new String[] {""} ;
      A16TAM07_DEL_FLG = "" ;
      A7TAM07_PWD = "" ;
      A8TAM07_USER_ID = "" ;
      GXv_char4 = new String [1] ;
      H000D4_A8TAM07_USER_ID = new String[] {""} ;
      H000D4_A2TAM07_USER_NM = new String[] {""} ;
      H000D4_n2TAM07_USER_NM = new boolean[] {false} ;
      H000D4_A126TAM07_USER_KANA_NM = new String[] {""} ;
      H000D4_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      H000D4_A14TAM07_AUTH_CD = new String[] {""} ;
      H000D4_n14TAM07_AUTH_CD = new boolean[] {false} ;
      H000D4_A147TAM07_SITE_ID = new String[] {""} ;
      H000D4_n147TAM07_SITE_ID = new boolean[] {false} ;
      A2TAM07_USER_NM = "" ;
      A126TAM07_USER_KANA_NM = "" ;
      A14TAM07_AUTH_CD = "" ;
      A147TAM07_SITE_ID = "" ;
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem6 = new GxObjectCollection [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      ROClassString = "" ;
      GXt_char7 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b710_wp01_login__default(),
         new Object[] {
             new Object[] {
            H000D2_A71TAT01_INFO_NO, H000D2_A117TAT01_DEL_FLG, H000D2_n117TAT01_DEL_FLG, H000D2_A6TAT01_INFO, H000D2_n6TAT01_INFO, H000D2_A867TAT01_INFO_KBN, H000D2_n867TAT01_INFO_KBN, H000D2_A5TAT01_DATE_END, H000D2_n5TAT01_DATE_END, H000D2_A4TAT01_DATE_START,
            H000D2_n4TAT01_DATE_START
            }
            , new Object[] {
            H000D3_A16TAM07_DEL_FLG, H000D3_n16TAM07_DEL_FLG, H000D3_A7TAM07_PWD, H000D3_n7TAM07_PWD, H000D3_A8TAM07_USER_ID
            }
            , new Object[] {
            H000D4_A8TAM07_USER_ID, H000D4_A2TAM07_USER_NM, H000D4_n2TAM07_USER_NM, H000D4_A126TAM07_USER_KANA_NM, H000D4_n126TAM07_USER_KANA_NM, H000D4_A14TAM07_AUTH_CD, H000D4_n14TAM07_AUTH_CD, H000D4_A147TAM07_SITE_ID, H000D4_n147TAM07_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B710_WP01_LOGIN" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B710_WP01_LOGIN" ;
      Gx_err = (short)(0) ;
      edtavD_grd_tat01_info_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV23GXLvl160 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_tam07_pwd_Backstyle ;
   private byte edtavD_tam07_user_id_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_40_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short subGrid1_Borderwidth ;
   private int subGrid1_Islastpage ;
   private int GRID1_nFirstRecordOnPage ;
   private int GRID1_nCurrentRecord ;
   private int edtavD_grd_tat01_info_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_tam07_user_id_Backcolor ;
   private int edtavD_tam07_pwd_Backcolor ;
   private int GXActiveErrHndl ;
   private int subGrid1_Width ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_40_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
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
   private String edtTAT01_DATE_START_Internalname ;
   private String edtavD_grd_tat01_info_Internalname ;
   private String GXKey ;
   private String scmdbuf ;
   private String AV25Pgmname ;
   private String edtavD_tam07_user_id_Internalname ;
   private String edtavD_tam07_pwd_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String GXEncryptionTmp ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String subGrid1_Internalname ;
   private String GXt_char1 ;
   private String tblTable4_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavD_tam07_user_id_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtavD_tam07_pwd_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable5_Internalname ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String ROClassString ;
   private String edtTAT01_DATE_START_Jsonclick ;
   private String edtavD_grd_tat01_info_Jsonclick ;
   private String GXt_char7 ;
   private String Gx_emsg ;
   private java.util.Date AV8C_SYSDATE ;
   private java.util.Date A4TAT01_DATE_START ;
   private java.util.Date A5TAT01_DATE_END ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4TAT01_DATE_START ;
   private boolean n117TAT01_DEL_FLG ;
   private boolean n6TAT01_INFO ;
   private boolean n867TAT01_INFO_KBN ;
   private boolean n5TAT01_DATE_END ;
   private boolean returnInSub ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n7TAM07_PWD ;
   private boolean n2TAM07_USER_NM ;
   private boolean n126TAM07_USER_KANA_NM ;
   private boolean n14TAM07_AUTH_CD ;
   private boolean n147TAM07_SITE_ID ;
   private String A6TAT01_INFO ;
   private String AV10D_GRD_TAT01_INFO ;
   private String A117TAT01_DEL_FLG ;
   private String A867TAT01_INFO_KBN ;
   private String AV12D_TAM07_USER_ID ;
   private String AV11D_TAM07_PWD ;
   private String AV13H_INIT_FLG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV7C_PGNM ;
   private String AV16W_ERRFLG ;
   private String AV18W_MSG ;
   private String AV20W_TAM07_PWD ;
   private String A16TAM07_DEL_FLG ;
   private String A7TAM07_PWD ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A126TAM07_USER_KANA_NM ;
   private String A14TAM07_AUTH_CD ;
   private String A147TAM07_SITE_ID ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private IDataStoreProvider pr_default ;
   private int[] H000D2_A71TAT01_INFO_NO ;
   private String[] H000D2_A117TAT01_DEL_FLG ;
   private boolean[] H000D2_n117TAT01_DEL_FLG ;
   private String[] H000D2_A6TAT01_INFO ;
   private boolean[] H000D2_n6TAT01_INFO ;
   private String[] H000D2_A867TAT01_INFO_KBN ;
   private boolean[] H000D2_n867TAT01_INFO_KBN ;
   private java.util.Date[] H000D2_A5TAT01_DATE_END ;
   private boolean[] H000D2_n5TAT01_DATE_END ;
   private java.util.Date[] H000D2_A4TAT01_DATE_START ;
   private boolean[] H000D2_n4TAT01_DATE_START ;
   private String[] H000D3_A16TAM07_DEL_FLG ;
   private boolean[] H000D3_n16TAM07_DEL_FLG ;
   private String[] H000D3_A7TAM07_PWD ;
   private boolean[] H000D3_n7TAM07_PWD ;
   private String[] H000D3_A8TAM07_USER_ID ;
   private String[] H000D4_A8TAM07_USER_ID ;
   private String[] H000D4_A2TAM07_USER_NM ;
   private boolean[] H000D4_n2TAM07_USER_NM ;
   private String[] H000D4_A126TAM07_USER_KANA_NM ;
   private boolean[] H000D4_n126TAM07_USER_KANA_NM ;
   private String[] H000D4_A14TAM07_AUTH_CD ;
   private boolean[] H000D4_n14TAM07_AUTH_CD ;
   private String[] H000D4_A147TAM07_SITE_ID ;
   private boolean[] H000D4_n147TAM07_SITE_ID ;
   private com.genexus.webpanels.WebSession AV19W_SESSION ;
   private GxObjectCollection GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem5 ;
   private GxObjectCollection GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem6[] ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
}

final  class b710_wp01_login__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000D2", "SELECT `TAT01_INFO_NO`, `TAT01_DEL_FLG`, `TAT01_INFO`, `TAT01_INFO_KBN`, `TAT01_DATE_END`, `TAT01_DATE_START` FROM `TAT01_INFO` WHERE (`TAT01_DATE_START` <= ?) AND (`TAT01_DATE_START` <= ?) AND (`TAT01_DATE_END` >= ? or (`TAT01_DATE_END` = '1000-01-01')) AND (( `TAT01_INFO_KBN` = '1' or `TAT01_INFO_KBN` = '9')) AND (`TAT01_DEL_FLG` = '0') ORDER BY `TAT01_DATE_START` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000D3", "SELECT `TAM07_DEL_FLG`, `TAM07_PWD`, `TAM07_USER_ID` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_PWD` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000D4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_AUTH_CD`, `TAM07_SITE_ID` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               stmt.setVarchar(2, (String)parms[1], 128);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
      }
   }

}

