/*
               File: a103_wp01_system_menu_impl
        Description: システムメニュー
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:39.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a103_wp01_system_menu_impl extends GXWebPanel
{
   public a103_wp01_system_menu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a103_wp01_system_menu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a103_wp01_system_menu_impl.class ));
   }

   public a103_wp01_system_menu_impl( int remoteHandle ,
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
            nGXsfl_36_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_36_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_36_idx, sGXsfl_36_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_Grid2 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_56_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_56_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_Grid2, nGXsfl_56_idx, sGXsfl_56_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
         {
            nRC_Grid3 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_76_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_76_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid3_newrow( nRC_Grid3, nGXsfl_76_idx, sGXsfl_76_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
         {
            nRC_Grid4 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_98_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_98_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid4_newrow( nRC_Grid4, nGXsfl_98_idx, sGXsfl_98_idx) ;
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
         if ( ! entryPointCalled )
         {
            AV32P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32P_MOVE_KBN", GXutil.str( AV32P_MOVE_KBN, 1, 0));
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa0E2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws0E2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we0E2( ) ;
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
      httpContext.writeText( "システムメニュー") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV32P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("a103_wp01_system_menu") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0E2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid2", GXutil.ltrim( localUtil.ntoc( nRC_Grid2, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid3", GXutil.ltrim( localUtil.ntoc( nRC_Grid3, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid4", GXutil.ltrim( localUtil.ntoc( nRC_Grid4, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV32P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_APP_ID", GXutil.rtrim( A65TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_KIDO_PG", GXutil.rtrim( A89TAM03_KIDO_PG));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_MENU_NM", GXutil.rtrim( A9TAM02_MENU_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_MENU_ID_TREE_3", GXutil.rtrim( A13TAM02_MENU_ID_TREE_3));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_MENU_ID_TREE_2", GXutil.rtrim( A12TAM02_MENU_ID_TREE_2));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_MENU_ID_TREE_1", GXutil.rtrim( A11TAM02_MENU_ID_TREE_1));
      GxWebStd.gx_hidden_field( httpContext, "TAM01_SYS_ID", GXutil.rtrim( A1TAM01_SYS_ID));
      GxWebStd.gx_hidden_field( httpContext, "TXT_TITLE3_Caption", GXutil.rtrim( lblTxt_title3_Caption));
      GxWebStd.gx_hidden_field( httpContext, "TXT_TITLE2_Caption", GXutil.rtrim( lblTxt_title2_Caption));
      GxWebStd.gx_hidden_field( httpContext, "TXT_TITLE1_Caption", GXutil.rtrim( lblTxt_title1_Caption));
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

   public void wb0E0( )
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
         wb_table1_2_0E2( true) ;
      }
      else
      {
         wb_table1_2_0E2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "システムメニュー", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0115") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0115", "");
         }
      }
      wbErr = false ;
      strup0E0( ) ;
   }

   public void ws0E2( )
   {
      start0E2( ) ;
      evt0E2( ) ;
   }

   public void evt0E2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_PASS_CHG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110E2 */
                        e110E2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD1_TAM02_MENU_NM.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD1_TAM02_MENU_NM.CLICK") == 0 ) )
                     {
                        nGXsfl_36_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_36_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_36_idx, 4, 0)), (short)(4), "0") ;
                        edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
                        edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
                        edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
                        AV22H_GRD1_TAM01_SYS_ID = httpContext.cgiGet( edtavH_grd1_tam01_sys_id_Internalname) ;
                        AV8D_GRD1_LINK_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd1_link_tam02_menu_nm_Internalname) ;
                        AV9D_GRD1_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd1_tam02_menu_nm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0115") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0115", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0115") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0115", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e120E2 */
                              e120E2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e130E2 */
                              e130E2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e140E2 */
                              e140E2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "VD_GRD1_TAM02_MENU_NM.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e150E2 */
                              e150E2 ();
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
                     else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID4.LOAD") == 0 )
                     {
                        nGXsfl_98_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
                        AV14D_GRD4_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd4_tam02_menu_nm_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID4.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e160E10 */
                              e160E10 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD3_TAM02_MENU_NM.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD3_TAM02_MENU_NM.CLICK") == 0 ) )
                     {
                        nGXsfl_76_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
                        edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
                        edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
                        edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
                        AV13D_GRD3_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd3_tam02_menu_nm_Internalname) ;
                        AV12D_GRD3_LINK_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd3_link_tam02_menu_nm_Internalname) ;
                        AV26H_GRD3_TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtavH_grd3_tam02_menu_id_tree_1_Internalname) ;
                        AV27H_GRD3_TAM02_MENU_ID_TREE_2 = httpContext.cgiGet( edtavH_grd3_tam02_menu_id_tree_2_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e170E7 */
                              e170E7 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "VD_GRD3_TAM02_MENU_NM.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e180E2 */
                              e180E2 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD2_TAM02_MENU_NM.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "VD_GRD2_TAM02_MENU_NM.CLICK") == 0 ) )
                     {
                        nGXsfl_56_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_56_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_56_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
                        edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
                        edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
                        AV11D_GRD2_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd2_tam02_menu_nm_Internalname) ;
                        AV10D_GRD2_LINK_TAM02_MENU_NM = httpContext.cgiGet( edtavD_grd2_link_tam02_menu_nm_Internalname) ;
                        AV23H_GRD2_TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtavH_grd2_tam02_menu_id_tree_1_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e190E4 */
                              e190E4 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "VD_GRD2_TAM02_MENU_NM.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e200E2 */
                              e200E2 ();
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
                  else if ( nCmpId == 115 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0115") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0115", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0E2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0E2( ) ;
         }
      }
   }

   public void pa0E2( )
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
                  AV32P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32P_MOVE_KBN", GXutil.str( AV32P_MOVE_KBN, 1, 0));
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

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_36_idx ,
                                 String sGXsfl_36_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
      edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      while ( nGXsfl_36_idx <= nRC_Grid1 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_36_idx+1)) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_36_idx, 4, 0)), (short)(4), "0") ;
         edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
         edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
         edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_Grid2 ,
                                 short nGXsfl_56_idx ,
                                 String sGXsfl_56_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
      while ( nGXsfl_56_idx <= nRC_Grid2 )
      {
         sendrow_564( ) ;
         nGXsfl_56_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_56_idx+1)) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_56_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
         edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
         edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( short nRC_Grid3 ,
                                 short nGXsfl_76_idx ,
                                 String sGXsfl_76_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
      while ( nGXsfl_76_idx <= nRC_Grid3 )
      {
         sendrow_767( ) ;
         nGXsfl_76_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_76_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_76_idx+1)) ;
         sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
         edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
         edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
         edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
      }
      httpContext.GX_webresponse.addString(Grid3Container.ToJavascriptSource());
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( short nRC_Grid4 ,
                                 short nGXsfl_98_idx ,
                                 String sGXsfl_98_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
      while ( nGXsfl_98_idx <= nRC_Grid4 )
      {
         sendrow_9810( ) ;
         nGXsfl_98_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_98_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_98_idx+1)) ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
      }
      httpContext.GX_webresponse.addString(Grid4Container.ToJavascriptSource());
      /* End function gxnrGrid4_newrow */
   }

   public void refresh( )
   {
      rf0E2( ) ;
      rf0E4( ) ;
      rf0E7( ) ;
      rf0E10( ) ;
      /* End function Refresh */
   }

   public void rf0E2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(36) ;
      nGXsfl_36_idx = (short)(1) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_36_idx, 4, 0)), (short)(4), "0") ;
      edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
      edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      /* Execute user event: e130E2 */
      e130E2 ();
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
         edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
         edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
         edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
         /* Execute user event: e140E2 */
         e140E2 ();
         wbEnd = (short)(36) ;
         wb0E0( ) ;
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

   public void rf0E4( )
   {
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      wbStart = (short)(56) ;
      nGXsfl_56_idx = (short)(1) ;
      sGXsfl_56_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_56_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
         edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
         edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
         /* Execute user event: e190E4 */
         e190E4 ();
         wbEnd = (short)(56) ;
         wb0E0( ) ;
      }
   }

   public int subgrid2_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public void rf0E7( )
   {
      Grid3Container.setPageSize( subgrid3_recordsperpage( ) );
      wbStart = (short)(76) ;
      nGXsfl_76_idx = (short)(1) ;
      sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
         edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
         edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
         edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
         /* Execute user event: e170E7 */
         e170E7 ();
         wbEnd = (short)(76) ;
         wb0E0( ) ;
      }
   }

   public int subgrid3_pagecount( )
   {
      return -1 ;
   }

   public int subgrid3_recordcount( )
   {
      return -1 ;
   }

   public int subgrid3_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid3_currentpage( )
   {
      return -1 ;
   }

   public void rf0E10( )
   {
      Grid4Container.setPageSize( subgrid4_recordsperpage( ) );
      wbStart = (short)(98) ;
      nGXsfl_98_idx = (short)(1) ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
         /* Execute user event: e160E10 */
         e160E10 ();
         wbEnd = (short)(98) ;
         wb0E0( ) ;
      }
   }

   public int subgrid4_pagecount( )
   {
      return -1 ;
   }

   public int subgrid4_recordcount( )
   {
      return -1 ;
   }

   public int subgrid4_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid4_currentpage( )
   {
      return -1 ;
   }

   public void strup0E0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "A103_WP01_SYSTEM_MENU" ;
      Gx_err = (short)(0) ;
      edtavD_grd1_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd1_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd2_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd2_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd3_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd3_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd4_tam02_menu_nm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e120E2 */
      e120E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV29H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29H_INIT_FLG", AV29H_INIT_FLG);
         AV31H_TAM01_SYS_ID = httpContext.cgiGet( edtavH_tam01_sys_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
         AV16H_01_TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtavH_01_tam02_menu_id_tree_1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
         AV19H_02_TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtavH_02_tam02_menu_id_tree_1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
         AV20H_02_TAM02_MENU_ID_TREE_2 = httpContext.cgiGet( edtavH_02_tam02_menu_id_tree_2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
         AV15D_NONE = httpContext.cgiGet( edtavD_none_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_NONE", AV15D_NONE);
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nRC_Grid2 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid2"), ".", ",")) ;
         nRC_Grid3 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid3"), ".", ",")) ;
         nRC_Grid4 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid4"), ".", ",")) ;
         AV32P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0115") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0115", "");
         }
         lblTxt_title3_Caption = httpContext.cgiGet( "TXT_TITLE3_Caption") ;
         lblTxt_title2_Caption = httpContext.cgiGet( "TXT_TITLE2_Caption") ;
         lblTxt_title1_Caption = httpContext.cgiGet( "TXT_TITLE1_Caption") ;
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
      /* Execute user event: e120E2 */
      e120E2 ();
      if (returnInSub) return;
   }

   public void e120E2( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "A103" ;
      AV5C_GAMEN_TITLE = "システムメニュー" ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV29H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29H_INIT_FLG", AV29H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV33W_A_LOGIN_SDT,AV7C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0115",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e130E2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV29H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
      }
      AV29H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29H_INIT_FLG", AV29H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   private void e140E2( )
   {
      /* Grid1_Load Routine */
      edtavH_grd1_tam01_sys_id_Visible = 0 ;
      /* Using cursor H000E2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13TAM02_MENU_ID_TREE_3 = H000E2_A13TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM02_MENU_ID_TREE_3", A13TAM02_MENU_ID_TREE_3);
         A12TAM02_MENU_ID_TREE_2 = H000E2_A12TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM02_MENU_ID_TREE_2", A12TAM02_MENU_ID_TREE_2);
         A11TAM02_MENU_ID_TREE_1 = H000E2_A11TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAM02_MENU_ID_TREE_1", A11TAM02_MENU_ID_TREE_1);
         A9TAM02_MENU_NM = H000E2_A9TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         n9TAM02_MENU_NM = H000E2_n9TAM02_MENU_NM[0] ;
         A89TAM03_KIDO_PG = H000E2_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E2_n89TAM03_KIDO_PG[0] ;
         A65TAM02_APP_ID = H000E2_A65TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TAM02_APP_ID", A65TAM02_APP_ID);
         n65TAM02_APP_ID = H000E2_n65TAM02_APP_ID[0] ;
         A1TAM01_SYS_ID = H000E2_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A89TAM03_KIDO_PG = H000E2_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E2_n89TAM03_KIDO_PG[0] ;
         GXt_char2 = AV9D_GRD1_TAM02_MENU_NM ;
         GXv_char3[0] = GXt_char2 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A9TAM02_MENU_NM, GXv_char3) ;
         a103_wp01_system_menu_impl.this.GXt_char2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         AV9D_GRD1_TAM02_MENU_NM = GXt_char2 ;
         GXt_char2 = AV8D_GRD1_LINK_TAM02_MENU_NM ;
         GXv_char3[0] = GXt_char2 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A9TAM02_MENU_NM, GXv_char3) ;
         a103_wp01_system_menu_impl.this.GXt_char2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         AV8D_GRD1_LINK_TAM02_MENU_NM = GXt_char2 ;
         AV22H_GRD1_TAM01_SYS_ID = A1TAM01_SYS_ID ;
         if ( GXutil.strcmp(A1TAM01_SYS_ID, AV31H_TAM01_SYS_ID) == 0 )
         {
            edtavD_grd1_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
            edtavD_grd1_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
         }
         else
         {
            edtavD_grd1_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
            edtavD_grd1_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
         }
         if ( (GXutil.strcmp("", A89TAM03_KIDO_PG)==0) )
         {
            edtavD_grd1_tam02_menu_nm_Visible = 1 ;
            edtavD_grd1_link_tam02_menu_nm_Visible = 0 ;
         }
         else
         {
            edtavD_grd1_tam02_menu_nm_Visible = 0 ;
            edtavD_grd1_link_tam02_menu_nm_Visible = 1 ;
            edtavD_grd1_link_tam02_menu_nm_Linktarget = A65TAM02_APP_ID ;
            edtavD_grd1_link_tam02_menu_nm_Link = formatLink(A89TAM03_KIDO_PG) + "?" + GXutil.URLEncode(GXutil.rtrim(AV35W_HTTP_REQUEST.getQuerystring())) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         sendrow_362( ) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e110E2( )
   {
      /* 'BTN_PASS_CHG' Routine */
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         /* Window Datatype Object Property */
         AV37WINDOW.setUrl( formatLink("a102_wp01_chg_pwd")  );
         AV37WINDOW.setReturnParms(new Object[] {});
         AV37WINDOW.setAutoresize( 0 );
         AV37WINDOW.setWidth( 560 );
         AV37WINDOW.setHeight( 300 );
         httpContext.newWindow(AV37WINDOW);
      }
   }

   public void e150E2( )
   {
      /* D_grd1_tam02_menu_nm_Click Routine */
      AV31H_TAM01_SYS_ID = AV22H_GRD1_TAM01_SYS_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
      AV16H_01_TAM02_MENU_ID_TREE_1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
      AV19H_02_TAM02_MENU_ID_TREE_1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
      AV20H_02_TAM02_MENU_ID_TREE_2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
      lblTxt_title1_Caption = AV9D_GRD1_TAM02_MENU_NM ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title1_Internalname, "Caption", lblTxt_title1_Caption);
      lblTxt_title2_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title2_Internalname, "Caption", lblTxt_title2_Caption);
      lblTxt_title3_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title3_Internalname, "Caption", lblTxt_title3_Caption);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e200E2( )
   {
      /* D_grd2_tam02_menu_nm_Click Routine */
      AV16H_01_TAM02_MENU_ID_TREE_1 = AV23H_GRD2_TAM02_MENU_ID_TREE_1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
      AV19H_02_TAM02_MENU_ID_TREE_1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
      AV20H_02_TAM02_MENU_ID_TREE_2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
      lblTxt_title2_Caption = AV11D_GRD2_TAM02_MENU_NM ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title2_Internalname, "Caption", lblTxt_title2_Caption);
      lblTxt_title3_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title3_Internalname, "Caption", lblTxt_title3_Caption);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e180E2( )
   {
      /* D_grd3_tam02_menu_nm_Click Routine */
      AV19H_02_TAM02_MENU_ID_TREE_1 = AV26H_GRD3_TAM02_MENU_ID_TREE_1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
      AV20H_02_TAM02_MENU_ID_TREE_2 = AV27H_GRD3_TAM02_MENU_ID_TREE_2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
      lblTxt_title3_Caption = AV13D_GRD3_TAM02_MENU_NM ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title3_Internalname, "Caption", lblTxt_title3_Caption);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      lblTxt_title1_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title1_Internalname, "Caption", lblTxt_title1_Caption);
      lblTxt_title2_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title2_Internalname, "Caption", lblTxt_title2_Caption);
      lblTxt_title3_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title3_Internalname, "Caption", lblTxt_title3_Caption);
      if ( GXutil.strcmp(AV36W_SESSION.getValue("A101_LOGIN_FST"), "1") == 0 )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
      }
      tblTable12_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTable12_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable12_Visible, 5, 0)));
      AV31H_TAM01_SYS_ID = "B" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
      /* Using cursor H000E3 */
      pr_default.execute(1, new Object[] {AV31H_TAM01_SYS_ID});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13TAM02_MENU_ID_TREE_3 = H000E3_A13TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM02_MENU_ID_TREE_3", A13TAM02_MENU_ID_TREE_3);
         A12TAM02_MENU_ID_TREE_2 = H000E3_A12TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM02_MENU_ID_TREE_2", A12TAM02_MENU_ID_TREE_2);
         A11TAM02_MENU_ID_TREE_1 = H000E3_A11TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAM02_MENU_ID_TREE_1", A11TAM02_MENU_ID_TREE_1);
         A1TAM01_SYS_ID = H000E3_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A9TAM02_MENU_NM = H000E3_A9TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         n9TAM02_MENU_NM = H000E3_n9TAM02_MENU_NM[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A9TAM02_MENU_NM, GXv_char3) ;
         a103_wp01_system_menu_impl.this.GXt_char2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         lblTxt_title1_Caption = GXt_char2 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_title1_Internalname, "Caption", lblTxt_title1_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") == 0 )
      {
         lblTxt_btn_pass_chg_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_pass_chg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_pass_chg_Visible, 5, 0)));
      }
   }

   public void S152( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV36W_SESSION.setValue("A103_H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
      AV36W_SESSION.setValue("A103_H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
      AV36W_SESSION.setValue("A103_H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
      AV36W_SESSION.setValue("A103_H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
      AV36W_SESSION.setValue("A103_TXT_TITLE1", lblTxt_title1_Caption);
      AV36W_SESSION.setValue("A103_TXT_TITLE2", lblTxt_title2_Caption);
      AV36W_SESSION.setValue("A103_TXT_TITLE3", lblTxt_title3_Caption);
   }

   public void S172( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV31H_TAM01_SYS_ID = AV36W_SESSION.getValue("A103_H_TAM01_SYS_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
      AV16H_01_TAM02_MENU_ID_TREE_1 = AV36W_SESSION.getValue("A103_H_01_TAM02_MENU_ID_TREE_1") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
      AV19H_02_TAM02_MENU_ID_TREE_1 = AV36W_SESSION.getValue("A103_H_02_TAM02_MENU_ID_TREE_1") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
      AV20H_02_TAM02_MENU_ID_TREE_2 = AV36W_SESSION.getValue("A103_H_02_TAM02_MENU_ID_TREE_2") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
      lblTxt_title1_Caption = AV36W_SESSION.getValue("A103_TXT_TITLE1") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title1_Internalname, "Caption", lblTxt_title1_Caption);
      lblTxt_title2_Caption = AV36W_SESSION.getValue("A103_TXT_TITLE2") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title2_Internalname, "Caption", lblTxt_title2_Caption);
      lblTxt_title3_Caption = AV36W_SESSION.getValue("A103_TXT_TITLE3") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_title3_Internalname, "Caption", lblTxt_title3_Caption);
   }

   public void S162( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV36W_SESSION.remove("A101_LOGIN_FST");
      AV36W_SESSION.remove("A103_H_TAM01_SYS_ID");
      AV36W_SESSION.remove("A103_H_01_TAM02_MENU_ID_TREE_1");
      AV36W_SESSION.remove("A103_H_02_TAM02_MENU_ID_TREE_1");
      AV36W_SESSION.remove("A103_H_02_TAM02_MENU_ID_TREE_2");
      AV36W_SESSION.remove("A103_TXT_TITLE1");
      AV36W_SESSION.remove("A103_TXT_TITLE2");
      AV36W_SESSION.remove("A103_TXT_TITLE3");
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV40Pgmname) ;
      GXv_SdtA_LOGIN_SDT4[0] = AV33W_A_LOGIN_SDT;
      GXv_char3[0] = AV34W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV33W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      a103_wp01_system_menu_impl.this.AV34W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV34W_ERRCD, "0") != 0 )
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S18535( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a103_wp01_system_menu");
   }

   private void e190E4( )
   {
      /* Grid2_Load Routine */
      edtavH_grd2_tam02_menu_id_tree_1_Visible = 0 ;
      /* Using cursor H000E4 */
      pr_default.execute(2, new Object[] {AV31H_TAM01_SYS_ID});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65TAM02_APP_ID = H000E4_A65TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TAM02_APP_ID", A65TAM02_APP_ID);
         n65TAM02_APP_ID = H000E4_n65TAM02_APP_ID[0] ;
         A9TAM02_MENU_NM = H000E4_A9TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         n9TAM02_MENU_NM = H000E4_n9TAM02_MENU_NM[0] ;
         A11TAM02_MENU_ID_TREE_1 = H000E4_A11TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAM02_MENU_ID_TREE_1", A11TAM02_MENU_ID_TREE_1);
         A89TAM03_KIDO_PG = H000E4_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E4_n89TAM03_KIDO_PG[0] ;
         A10TAM02_DEL_FLG = H000E4_A10TAM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10TAM02_DEL_FLG", A10TAM02_DEL_FLG);
         n10TAM02_DEL_FLG = H000E4_n10TAM02_DEL_FLG[0] ;
         A13TAM02_MENU_ID_TREE_3 = H000E4_A13TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM02_MENU_ID_TREE_3", A13TAM02_MENU_ID_TREE_3);
         A12TAM02_MENU_ID_TREE_2 = H000E4_A12TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM02_MENU_ID_TREE_2", A12TAM02_MENU_ID_TREE_2);
         A1TAM01_SYS_ID = H000E4_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A89TAM03_KIDO_PG = H000E4_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E4_n89TAM03_KIDO_PG[0] ;
         /* Using cursor H000E5 */
         pr_default.execute(3, new Object[] {AV33W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), new Boolean(n65TAM02_APP_ID), A65TAM02_APP_ID});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A88TAM03_APP_ID = H000E5_A88TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            A18TAM04_DEL_FLG = H000E5_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E5_n18TAM04_DEL_FLG[0] ;
            A101TAM05_KNGN_FLG = H000E5_A101TAM05_KNGN_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A101TAM05_KNGN_FLG", A101TAM05_KNGN_FLG);
            n101TAM05_KNGN_FLG = H000E5_n101TAM05_KNGN_FLG[0] ;
            A17TAM04_AUTH_CD = H000E5_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            A18TAM04_DEL_FLG = H000E5_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E5_n18TAM04_DEL_FLG[0] ;
            AV11D_GRD2_TAM02_MENU_NM = A9TAM02_MENU_NM ;
            AV10D_GRD2_LINK_TAM02_MENU_NM = A9TAM02_MENU_NM ;
            AV23H_GRD2_TAM02_MENU_ID_TREE_1 = A11TAM02_MENU_ID_TREE_1 ;
            if ( GXutil.strcmp(A11TAM02_MENU_ID_TREE_1, AV16H_01_TAM02_MENU_ID_TREE_1) == 0 )
            {
               edtavD_grd2_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
               edtavD_grd2_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
            }
            else
            {
               edtavD_grd2_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
               edtavD_grd2_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
            }
            if ( (GXutil.strcmp("", A89TAM03_KIDO_PG)==0) )
            {
               edtavD_grd2_tam02_menu_nm_Visible = 1 ;
               edtavD_grd2_link_tam02_menu_nm_Visible = 0 ;
            }
            else
            {
               edtavD_grd2_tam02_menu_nm_Visible = 0 ;
               edtavD_grd2_link_tam02_menu_nm_Visible = 1 ;
               edtavD_grd2_link_tam02_menu_nm_Linktarget = A65TAM02_APP_ID ;
               edtavD_grd2_link_tam02_menu_nm_Link = formatLink(A89TAM03_KIDO_PG) +"?"+AV35W_HTTP_REQUEST.getQuerystring() ;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(56) ;
            }
            sendrow_564( ) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   private void e170E7( )
   {
      /* Grid3_Load Routine */
      edtavH_grd3_tam02_menu_id_tree_1_Visible = 0 ;
      edtavH_grd3_tam02_menu_id_tree_2_Visible = 0 ;
      /* Using cursor H000E6 */
      pr_default.execute(4, new Object[] {AV31H_TAM01_SYS_ID, AV16H_01_TAM02_MENU_ID_TREE_1});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65TAM02_APP_ID = H000E6_A65TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TAM02_APP_ID", A65TAM02_APP_ID);
         n65TAM02_APP_ID = H000E6_n65TAM02_APP_ID[0] ;
         A9TAM02_MENU_NM = H000E6_A9TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         n9TAM02_MENU_NM = H000E6_n9TAM02_MENU_NM[0] ;
         A11TAM02_MENU_ID_TREE_1 = H000E6_A11TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAM02_MENU_ID_TREE_1", A11TAM02_MENU_ID_TREE_1);
         A12TAM02_MENU_ID_TREE_2 = H000E6_A12TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM02_MENU_ID_TREE_2", A12TAM02_MENU_ID_TREE_2);
         A89TAM03_KIDO_PG = H000E6_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E6_n89TAM03_KIDO_PG[0] ;
         A10TAM02_DEL_FLG = H000E6_A10TAM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10TAM02_DEL_FLG", A10TAM02_DEL_FLG);
         n10TAM02_DEL_FLG = H000E6_n10TAM02_DEL_FLG[0] ;
         A13TAM02_MENU_ID_TREE_3 = H000E6_A13TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM02_MENU_ID_TREE_3", A13TAM02_MENU_ID_TREE_3);
         A1TAM01_SYS_ID = H000E6_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A89TAM03_KIDO_PG = H000E6_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E6_n89TAM03_KIDO_PG[0] ;
         /* Using cursor H000E7 */
         pr_default.execute(5, new Object[] {AV33W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), new Boolean(n65TAM02_APP_ID), A65TAM02_APP_ID});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A88TAM03_APP_ID = H000E7_A88TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            A18TAM04_DEL_FLG = H000E7_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E7_n18TAM04_DEL_FLG[0] ;
            A101TAM05_KNGN_FLG = H000E7_A101TAM05_KNGN_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A101TAM05_KNGN_FLG", A101TAM05_KNGN_FLG);
            n101TAM05_KNGN_FLG = H000E7_n101TAM05_KNGN_FLG[0] ;
            A17TAM04_AUTH_CD = H000E7_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            A18TAM04_DEL_FLG = H000E7_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E7_n18TAM04_DEL_FLG[0] ;
            AV13D_GRD3_TAM02_MENU_NM = A9TAM02_MENU_NM ;
            AV12D_GRD3_LINK_TAM02_MENU_NM = A9TAM02_MENU_NM ;
            AV26H_GRD3_TAM02_MENU_ID_TREE_1 = A11TAM02_MENU_ID_TREE_1 ;
            AV27H_GRD3_TAM02_MENU_ID_TREE_2 = A12TAM02_MENU_ID_TREE_2 ;
            if ( GXutil.strcmp(A12TAM02_MENU_ID_TREE_2, AV20H_02_TAM02_MENU_ID_TREE_2) == 0 )
            {
               edtavD_grd3_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
               edtavD_grd3_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuListSel" ;
            }
            else
            {
               edtavD_grd3_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
               edtavD_grd3_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
            }
            if ( (GXutil.strcmp("", A89TAM03_KIDO_PG)==0) )
            {
               edtavD_grd3_tam02_menu_nm_Visible = 1 ;
               edtavD_grd3_link_tam02_menu_nm_Visible = 0 ;
            }
            else
            {
               edtavD_grd3_tam02_menu_nm_Visible = 0 ;
               edtavD_grd3_link_tam02_menu_nm_Visible = 1 ;
               edtavD_grd3_link_tam02_menu_nm_Linktarget = A65TAM02_APP_ID ;
               edtavD_grd3_link_tam02_menu_nm_Link = formatLink(A89TAM03_KIDO_PG) +"?"+AV35W_HTTP_REQUEST.getQuerystring() ;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(76) ;
            }
            sendrow_767( ) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   private void e160E10( )
   {
      /* Grid4_Load Routine */
      /* Using cursor H000E8 */
      pr_default.execute(6, new Object[] {AV31H_TAM01_SYS_ID, AV19H_02_TAM02_MENU_ID_TREE_1, AV20H_02_TAM02_MENU_ID_TREE_2});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65TAM02_APP_ID = H000E8_A65TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TAM02_APP_ID", A65TAM02_APP_ID);
         n65TAM02_APP_ID = H000E8_n65TAM02_APP_ID[0] ;
         A9TAM02_MENU_NM = H000E8_A9TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAM02_MENU_NM", A9TAM02_MENU_NM);
         n9TAM02_MENU_NM = H000E8_n9TAM02_MENU_NM[0] ;
         A89TAM03_KIDO_PG = H000E8_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E8_n89TAM03_KIDO_PG[0] ;
         A10TAM02_DEL_FLG = H000E8_A10TAM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10TAM02_DEL_FLG", A10TAM02_DEL_FLG);
         n10TAM02_DEL_FLG = H000E8_n10TAM02_DEL_FLG[0] ;
         A13TAM02_MENU_ID_TREE_3 = H000E8_A13TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM02_MENU_ID_TREE_3", A13TAM02_MENU_ID_TREE_3);
         A12TAM02_MENU_ID_TREE_2 = H000E8_A12TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM02_MENU_ID_TREE_2", A12TAM02_MENU_ID_TREE_2);
         A11TAM02_MENU_ID_TREE_1 = H000E8_A11TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAM02_MENU_ID_TREE_1", A11TAM02_MENU_ID_TREE_1);
         A1TAM01_SYS_ID = H000E8_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A89TAM03_KIDO_PG = H000E8_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = H000E8_n89TAM03_KIDO_PG[0] ;
         /* Using cursor H000E9 */
         pr_default.execute(7, new Object[] {AV33W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), new Boolean(n65TAM02_APP_ID), A65TAM02_APP_ID});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A88TAM03_APP_ID = H000E9_A88TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            A18TAM04_DEL_FLG = H000E9_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E9_n18TAM04_DEL_FLG[0] ;
            A101TAM05_KNGN_FLG = H000E9_A101TAM05_KNGN_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A101TAM05_KNGN_FLG", A101TAM05_KNGN_FLG);
            n101TAM05_KNGN_FLG = H000E9_n101TAM05_KNGN_FLG[0] ;
            A17TAM04_AUTH_CD = H000E9_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            A18TAM04_DEL_FLG = H000E9_A18TAM04_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = H000E9_n18TAM04_DEL_FLG[0] ;
            AV14D_GRD4_TAM02_MENU_NM = A9TAM02_MENU_NM ;
            if ( ! (GXutil.strcmp("", A89TAM03_KIDO_PG)==0) )
            {
               edtavD_grd4_tam02_menu_nm_Linktarget = A65TAM02_APP_ID ;
               edtavD_grd4_tam02_menu_nm_Link = formatLink(A89TAM03_KIDO_PG) +"?"+AV35W_HTTP_REQUEST.getQuerystring() ;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(98) ;
            }
            sendrow_9810( ) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void wb_table1_2_0E2( boolean wbgen )
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
         wb_table2_6_0E2( true) ;
      }
      else
      {
         wb_table2_6_0E2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0E2e( boolean wbgen )
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
         wb_table1_2_0E2e( true) ;
      }
      else
      {
         wb_table1_2_0E2e( false) ;
      }
   }

   public void wb_table2_6_0E2( boolean wbgen )
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
         wb_table3_12_0E2( true) ;
      }
      else
      {
         wb_table3_12_0E2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table4_18_0E2( true) ;
      }
      else
      {
         wb_table4_18_0E2( false) ;
      }
      return  ;
   }

   public void wb_table4_18_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_103_0E2( true) ;
      }
      else
      {
         wb_table5_103_0E2( false) ;
      }
      return  ;
   }

   public void wb_table5_103_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_NONE", AV15D_NONE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "AttributeNone" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_none_Internalname, GXutil.rtrim( AV15D_NONE), GXutil.rtrim( localUtil.format( AV15D_NONE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(112);\"", "", "", "", "", edtavD_none_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0115"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0115"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0115"+"");
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
         wb_table2_6_0E2e( true) ;
      }
      else
      {
         wb_table2_6_0E2e( false) ;
      }
   }

   public void wb_table5_103_0E2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_A103_WP01_SYSTEM_MENU.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV29H_INIT_FLG", AV29H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV29H_INIT_FLG), GXutil.rtrim( localUtil.format( AV29H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(107);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV31H_TAM01_SYS_ID", AV31H_TAM01_SYS_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_tam01_sys_id_Internalname, GXutil.rtrim( AV31H_TAM01_SYS_ID), GXutil.rtrim( localUtil.format( AV31H_TAM01_SYS_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtavH_tam01_sys_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_01_TAM02_MENU_ID_TREE_1", AV16H_01_TAM02_MENU_ID_TREE_1);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_01_tam02_menu_id_tree_1_Internalname, GXutil.rtrim( AV16H_01_TAM02_MENU_ID_TREE_1), GXutil.rtrim( localUtil.format( AV16H_01_TAM02_MENU_ID_TREE_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "", "", "", "", edtavH_01_tam02_menu_id_tree_1_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_02_TAM02_MENU_ID_TREE_1", AV19H_02_TAM02_MENU_ID_TREE_1);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_02_tam02_menu_id_tree_1_Internalname, GXutil.rtrim( AV19H_02_TAM02_MENU_ID_TREE_1), GXutil.rtrim( localUtil.format( AV19H_02_TAM02_MENU_ID_TREE_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(110);\"", "", "", "", "", edtavH_02_tam02_menu_id_tree_1_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_02_TAM02_MENU_ID_TREE_2", AV20H_02_TAM02_MENU_ID_TREE_2);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_02_tam02_menu_id_tree_2_Internalname, GXutil.rtrim( AV20H_02_TAM02_MENU_ID_TREE_2), GXutil.rtrim( localUtil.format( AV20H_02_TAM02_MENU_ID_TREE_2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(111);\"", "", "", "", "", edtavH_02_tam02_menu_id_tree_2_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_103_0E2e( true) ;
      }
      else
      {
         wb_table5_103_0E2e( false) ;
      }
   }

   public void wb_table4_18_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_0E2( true) ;
      }
      else
      {
         wb_table6_21_0E2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_18_0E2e( true) ;
      }
      else
      {
         wb_table4_18_0E2e( false) ;
      }
   }

   public void wb_table6_21_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table7_24_0E2( true) ;
      }
      else
      {
         wb_table7_24_0E2( false) ;
      }
      return  ;
   }

   public void wb_table7_24_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"width:310px\">") ;
         wb_table8_44_0E2( true) ;
      }
      else
      {
         wb_table8_44_0E2( false) ;
      }
      return  ;
   }

   public void wb_table8_44_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"width:310px\">") ;
         wb_table9_64_0E2( true) ;
      }
      else
      {
         wb_table9_64_0E2( false) ;
      }
      return  ;
   }

   public void wb_table9_64_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table10_86_0E2( true) ;
      }
      else
      {
         wb_table10_86_0E2( false) ;
      }
      return  ;
   }

   public void wb_table10_86_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_21_0E2e( true) ;
      }
      else
      {
         wb_table6_21_0E2e( false) ;
      }
   }

   public void wb_table10_86_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl3_Internalname, tblTbl3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_89_0E2( true) ;
      }
      else
      {
         wb_table11_89_0E2( false) ;
      }
      return  ;
   }

   public void wb_table11_89_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_95_0E2( true) ;
      }
      else
      {
         wb_table12_95_0E2( false) ;
      }
      return  ;
   }

   public void wb_table12_95_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_86_0E2e( true) ;
      }
      else
      {
         wb_table10_86_0E2e( false) ;
      }
   }

   public void wb_table12_95_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "TableGridTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:400px\">") ;
         /*  Grid Control  */
         Grid4Container.SetIsFreestyle(true);
         Grid4Container.SetWrapped(nGXWrapped);
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid4Container"+"DivS\" gxgridid=\"98\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid4_Internalname, subGrid4_Internalname, "", "FreeStyleBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid4Container.AddObjectProperty("GridName", "Grid4");
         }
         else
         {
            Grid4Container.AddObjectProperty("GridName", "Grid4");
            Grid4Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleBase"));
            Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid4Container.AddObjectProperty("Class", "FreeStyleBase");
            Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid4_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("CmpContext", "");
            Grid4Container.AddObjectProperty("InMasterPage", "false");
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Column.AddObjectProperty("Value", GXutil.rtrim( AV14D_GRD4_TAM02_MENU_NM));
            Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd4_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid4Column.AddObjectProperty("Link", GXutil.rtrim( edtavD_grd4_tam02_menu_nm_Link));
            Grid4Column.AddObjectProperty("Linktarget", GXutil.rtrim( edtavD_grd4_tam02_menu_nm_Linktarget));
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Container.AddObjectProperty("Allowselection", "true");
            Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowhover", "true");
            Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowcollapsing", ((subGrid4_Allowcollapsing==1) ? "true" : "false"));
            Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 98 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid4 = (short)(nGXsfl_98_idx-1) ;
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid4", Grid4Container);
            GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData", Grid4Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_95_0E2e( true) ;
      }
      else
      {
         wb_table12_95_0E2e( false) ;
      }
   }

   public void wb_table11_89_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 30, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable22_Internalname, tblTable22_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockMenuTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title3_Internalname, lblTxt_title3_Caption, "", "", lblTxt_title3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_89_0E2e( true) ;
      }
      else
      {
         wb_table11_89_0E2e( false) ;
      }
   }

   public void wb_table9_64_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl2_Internalname, tblTbl2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_67_0E2( true) ;
      }
      else
      {
         wb_table13_67_0E2( false) ;
      }
      return  ;
   }

   public void wb_table13_67_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_73_0E2( true) ;
      }
      else
      {
         wb_table14_73_0E2( false) ;
      }
      return  ;
   }

   public void wb_table14_73_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_64_0E2e( true) ;
      }
      else
      {
         wb_table9_64_0E2e( false) ;
      }
   }

   public void wb_table14_73_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "TableGridTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:400px\">") ;
         /*  Grid Control  */
         Grid3Container.SetIsFreestyle(true);
         Grid3Container.SetWrapped(nGXWrapped);
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" gxgridid=\"76\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "FreeStyleBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid3Container.AddObjectProperty("GridName", "Grid3");
         }
         else
         {
            Grid3Container.AddObjectProperty("GridName", "Grid3");
            Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleBase"));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 100, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid3Container.AddObjectProperty("Class", "FreeStyleBase");
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid3_Width, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("CmpContext", "");
            Grid3Container.AddObjectProperty("InMasterPage", "false");
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV13D_GRD3_TAM02_MENU_NM));
            Grid3Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd3_tam02_menu_nm_Class));
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd3_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd3_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV12D_GRD3_LINK_TAM02_MENU_NM));
            Grid3Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd3_link_tam02_menu_nm_Class));
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd3_link_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Column.AddObjectProperty("Link", GXutil.rtrim( edtavD_grd3_link_tam02_menu_nm_Link));
            Grid3Column.AddObjectProperty("Linktarget", GXutil.rtrim( edtavD_grd3_link_tam02_menu_nm_Linktarget));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd3_link_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV26H_GRD3_TAM02_MENU_ID_TREE_1));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavH_grd3_tam02_menu_id_tree_1_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV27H_GRD3_TAM02_MENU_ID_TREE_2));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavH_grd3_tam02_menu_id_tree_2_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Container.AddObjectProperty("Allowselection", "true");
            Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowhover", "true");
            Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowcollapsing", ((subGrid3_Allowcollapsing==1) ? "true" : "false"));
            Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 76 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid3 = (short)(nGXsfl_76_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container);
            GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_73_0E2e( true) ;
      }
      else
      {
         wb_table14_73_0E2e( false) ;
      }
   }

   public void wb_table13_67_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 30, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable19_Internalname, tblTable19_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockMenuTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title2_Internalname, lblTxt_title2_Caption, "", "", lblTxt_title2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_67_0E2e( true) ;
      }
      else
      {
         wb_table13_67_0E2e( false) ;
      }
   }

   public void wb_table8_44_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl1_Internalname, tblTbl1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_47_0E2( true) ;
      }
      else
      {
         wb_table15_47_0E2( false) ;
      }
      return  ;
   }

   public void wb_table15_47_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_53_0E2( true) ;
      }
      else
      {
         wb_table16_53_0E2( false) ;
      }
      return  ;
   }

   public void wb_table16_53_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_44_0E2e( true) ;
      }
      else
      {
         wb_table8_44_0E2e( false) ;
      }
   }

   public void wb_table16_53_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableGridTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:400px\">") ;
         /*  Grid Control  */
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"56\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleBase"));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid2Container.AddObjectProperty("Class", "FreeStyleBase");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV11D_GRD2_TAM02_MENU_NM));
            Grid2Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd2_tam02_menu_nm_Class));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV10D_GRD2_LINK_TAM02_MENU_NM));
            Grid2Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd2_link_tam02_menu_nm_Class));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_link_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Link", GXutil.rtrim( edtavD_grd2_link_tam02_menu_nm_Link));
            Grid2Column.AddObjectProperty("Linktarget", GXutil.rtrim( edtavD_grd2_link_tam02_menu_nm_Linktarget));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_link_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV23H_GRD2_TAM02_MENU_ID_TREE_1));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavH_grd2_tam02_menu_id_tree_1_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", "true");
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", "true");
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", ((subGrid2_Allowcollapsing==1) ? "true" : "false"));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 56 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid2 = (short)(nGXsfl_56_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_53_0E2e( true) ;
      }
      else
      {
         wb_table16_53_0E2e( false) ;
      }
   }

   public void wb_table15_47_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 30, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable16_Internalname, tblTable16_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockMenuTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_title1_Internalname, lblTxt_title1_Caption, "", "", lblTxt_title1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_47_0E2e( true) ;
      }
      else
      {
         wb_table15_47_0E2e( false) ;
      }
   }

   public void wb_table7_24_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTable12_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTable12_Internalname, tblTable12_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_27_0E2( true) ;
      }
      else
      {
         wb_table17_27_0E2( false) ;
      }
      return  ;
   }

   public void wb_table17_27_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_33_0E2( true) ;
      }
      else
      {
         wb_table18_33_0E2( false) ;
      }
      return  ;
   }

   public void wb_table18_33_0E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_0E2e( true) ;
      }
      else
      {
         wb_table7_24_0E2e( false) ;
      }
   }

   public void wb_table18_33_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 180, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableGridTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:400px\">") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"36\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleBase"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleBase");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV22H_GRD1_TAM01_SYS_ID));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavH_grd1_tam01_sys_id_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV8D_GRD1_LINK_TAM02_MENU_NM));
            Grid1Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd1_link_tam02_menu_nm_Class));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_link_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavD_grd1_link_tam02_menu_nm_Link));
            Grid1Column.AddObjectProperty("Linktarget", GXutil.rtrim( edtavD_grd1_link_tam02_menu_nm_Linktarget));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_link_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV9D_GRD1_TAM02_MENU_NM));
            Grid1Column.AddObjectProperty("Class", GXutil.rtrim( edtavD_grd1_tam02_menu_nm_Class));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_tam02_menu_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_tam02_menu_nm_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_36_idx-1) ;
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
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_33_0E2e( true) ;
      }
      else
      {
         wb_table18_33_0E2e( false) ;
      }
   }

   public void wb_table17_27_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 30, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 180, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockMenuTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "システム", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_27_0E2e( true) ;
      }
      else
      {
         wb_table17_27_0E2e( false) ;
      }
   }

   public void wb_table3_12_0E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList150" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_pass_chg_Internalname, "パスワード変更（F3）", "", "", lblTxt_btn_pass_chg_Jsonclick, "E\\'BTN_PASS_CHG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_pass_chg_Visible, 1, (short)(0), "HLP_A103_WP01_SYSTEM_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0E2e( true) ;
      }
      else
      {
         wb_table3_12_0E2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV32P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32P_MOVE_KBN", GXutil.str( AV32P_MOVE_KBN, 1, 0));
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
      pa0E2( ) ;
      ws0E2( ) ;
      we0E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1457418");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("a103_wp01_system_menu.js", "?14574110");
      /* End function include_jscripts */
   }

   public void sendrow_362( )
   {
      wb0E0( ) ;
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
         if ( ((int)(nGXsfl_36_idx/ (double) (1)) % (2)) == 0 )
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
         if ( ( 1 == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_36_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_36_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:180px\""});
      /* Single line edit */
      TempTags = " " + ((edtavH_grd1_tam01_sys_id_Enabled!=0)&&(edtavH_grd1_tam01_sys_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "color:#FF0000;" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavH_grd1_tam01_sys_id_Internalname,GXutil.rtrim( AV22H_GRD1_TAM01_SYS_ID),"",TempTags+((edtavH_grd1_tam01_sys_id_Enabled!=0)&&(edtavH_grd1_tam01_sys_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavH_grd1_tam01_sys_id_Enabled!=0)&&(edtavH_grd1_tam01_sys_id_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(39);\"" : " "),"","","","",edtavH_grd1_tam01_sys_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavH_grd1_tam01_sys_id_Visible),new Integer(1),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(36),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd1_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_link_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
      ClassString = edtavD_grd1_link_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd1_link_tam02_menu_nm_Internalname,GXutil.rtrim( AV8D_GRD1_LINK_TAM02_MENU_NM),"",TempTags+((edtavD_grd1_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_link_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_link_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(40);\"" : " "),"",edtavD_grd1_link_tam02_menu_nm_Link,edtavD_grd1_link_tam02_menu_nm_Linktarget,"",edtavD_grd1_link_tam02_menu_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavD_grd1_link_tam02_menu_nm_Visible),new Integer(edtavD_grd1_link_tam02_menu_nm_Enabled),new Integer(0),new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(36),new Integer(1),new Integer(1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd1_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
      ClassString = edtavD_grd1_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd1_tam02_menu_nm_Internalname,GXutil.rtrim( AV9D_GRD1_TAM02_MENU_NM),"",TempTags+((edtavD_grd1_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_tam02_menu_nm_Enabled!=0)&&(edtavD_grd1_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(41);\"" : " "),"EVD_GRD1_TAM02_MENU_NM.CLICK."+sGXsfl_36_idx,"","","",edtavD_grd1_tam02_menu_nm_Jsonclick,new Integer(5),ClassString,StyleString,ROClassString,new Integer(edtavD_grd1_tam02_menu_nm_Visible),new Integer(edtavD_grd1_tam02_menu_nm_Enabled),new Integer(0),new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(36),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
            if ( ((int)(nGXsfl_36_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_36_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_36_idx+1)) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_36_idx, 4, 0)), (short)(4), "0") ;
      edtavH_grd1_tam01_sys_id_Internalname = "vH_GRD1_TAM01_SYS_ID_"+sGXsfl_36_idx ;
      edtavD_grd1_link_tam02_menu_nm_Internalname = "vD_GRD1_LINK_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      edtavD_grd1_tam02_menu_nm_Internalname = "vD_GRD1_TAM02_MENU_NM_"+sGXsfl_36_idx ;
      /* End function sendrow_362 */
   }

   public void sendrow_564( )
   {
      wb0E0( ) ;
      Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_56_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_56_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_56_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_56_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_56_idx+"\">") ;
            }
         }
      }
      Grid2Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd2_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
      ClassString = edtavD_grd2_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd2_tam02_menu_nm_Internalname,GXutil.rtrim( AV11D_GRD2_TAM02_MENU_NM),"",TempTags+((edtavD_grd2_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(59);\"" : " "),"EVD_GRD2_TAM02_MENU_NM.CLICK."+sGXsfl_56_idx,"","","",edtavD_grd2_tam02_menu_nm_Jsonclick,new Integer(5),ClassString,StyleString,ROClassString,new Integer(edtavD_grd2_tam02_menu_nm_Visible),new Integer(edtavD_grd2_tam02_menu_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(56),new Integer(1),new Integer(1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd2_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_link_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
      ClassString = edtavD_grd2_link_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd2_link_tam02_menu_nm_Internalname,GXutil.rtrim( AV10D_GRD2_LINK_TAM02_MENU_NM),"",TempTags+((edtavD_grd2_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_link_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd2_link_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(60);\"" : " "),"",edtavD_grd2_link_tam02_menu_nm_Link,edtavD_grd2_link_tam02_menu_nm_Linktarget,"",edtavD_grd2_link_tam02_menu_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavD_grd2_link_tam02_menu_nm_Visible),new Integer(edtavD_grd2_link_tam02_menu_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(56),new Integer(1),new Integer(1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavH_grd2_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd2_tam02_menu_id_tree_1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "color:#FF0000;" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavH_grd2_tam02_menu_id_tree_1_Internalname,GXutil.rtrim( AV23H_GRD2_TAM02_MENU_ID_TREE_1),"",TempTags+((edtavH_grd2_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd2_tam02_menu_id_tree_1_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavH_grd2_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd2_tam02_menu_id_tree_1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(61);\"" : " "),"","","","",edtavH_grd2_tam02_menu_id_tree_1_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavH_grd2_tam02_menu_id_tree_1_Visible),new Integer(1),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(56),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("cell");
      }
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)(nGXsfl_56_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_56_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_56_idx+1)) ;
      sGXsfl_56_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_56_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd2_tam02_menu_nm_Internalname = "vD_GRD2_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavD_grd2_link_tam02_menu_nm_Internalname = "vD_GRD2_LINK_TAM02_MENU_NM_"+sGXsfl_56_idx ;
      edtavH_grd2_tam02_menu_id_tree_1_Internalname = "vH_GRD2_TAM02_MENU_ID_TREE_1_"+sGXsfl_56_idx ;
      /* End function sendrow_564 */
   }

   public void sendrow_767( )
   {
      wb0E0( ) ;
      Grid3Row = GXWebRow.GetNew(context,Grid3Container) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid3ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid3_Backcolor, 9, 0)));
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid3ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid3_Backcolor, 9, 0)));
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_76_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid3_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid3ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid3_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid3ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid3_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_76_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_76_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_76_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_76_idx+"\">") ;
            }
         }
      }
      Grid3Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid3_Linesclass,""});
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd3_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_76_idx+"',76)\"" : " ") ;
      ClassString = edtavD_grd3_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd3_tam02_menu_nm_Internalname,GXutil.rtrim( AV13D_GRD3_TAM02_MENU_NM),"",TempTags+((edtavD_grd3_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd3_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(79);\"" : " "),"EVD_GRD3_TAM02_MENU_NM.CLICK."+sGXsfl_76_idx,"","","",edtavD_grd3_tam02_menu_nm_Jsonclick,new Integer(5),ClassString,StyleString,ROClassString,new Integer(edtavD_grd3_tam02_menu_nm_Visible),new Integer(edtavD_grd3_tam02_menu_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd3_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_link_tam02_menu_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_76_idx+"',76)\"" : " ") ;
      ClassString = edtavD_grd3_link_tam02_menu_nm_Class ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd3_link_tam02_menu_nm_Internalname,GXutil.rtrim( AV12D_GRD3_LINK_TAM02_MENU_NM),"",TempTags+((edtavD_grd3_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_link_tam02_menu_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd3_link_tam02_menu_nm_Enabled!=0)&&(edtavD_grd3_link_tam02_menu_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(80);\"" : " "),"",edtavD_grd3_link_tam02_menu_nm_Link,edtavD_grd3_link_tam02_menu_nm_Linktarget,"",edtavD_grd3_link_tam02_menu_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavD_grd3_link_tam02_menu_nm_Visible),new Integer(edtavD_grd3_link_tam02_menu_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavH_grd3_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_76_idx+"',76)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "color:#FF0000;" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavH_grd3_tam02_menu_id_tree_1_Internalname,GXutil.rtrim( AV26H_GRD3_TAM02_MENU_ID_TREE_1),"",TempTags+((edtavH_grd3_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_1_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavH_grd3_tam02_menu_id_tree_1_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(81);\"" : " "),"","","","",edtavH_grd3_tam02_menu_id_tree_1_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavH_grd3_tam02_menu_id_tree_1_Visible),new Integer(1),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Single line edit */
      TempTags = " " + ((edtavH_grd3_tam02_menu_id_tree_2_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_76_idx+"',76)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "color:#FF0000;" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavH_grd3_tam02_menu_id_tree_2_Internalname,GXutil.rtrim( AV27H_GRD3_TAM02_MENU_ID_TREE_2),"",TempTags+((edtavH_grd3_tam02_menu_id_tree_2_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_2_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavH_grd3_tam02_menu_id_tree_2_Enabled!=0)&&(edtavH_grd3_tam02_menu_id_tree_2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(82);\"" : " "),"","","","",edtavH_grd3_tam02_menu_id_tree_2_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavH_grd3_tam02_menu_id_tree_2_Visible),new Integer(1),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)(nGXsfl_76_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid3Container.AddRow(Grid3Row);
      nGXsfl_76_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_76_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_76_idx+1)) ;
      sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd3_tam02_menu_nm_Internalname = "vD_GRD3_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavD_grd3_link_tam02_menu_nm_Internalname = "vD_GRD3_LINK_TAM02_MENU_NM_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_1_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_1_"+sGXsfl_76_idx ;
      edtavH_grd3_tam02_menu_id_tree_2_Internalname = "vH_GRD3_TAM02_MENU_ID_TREE_2_"+sGXsfl_76_idx ;
      /* End function sendrow_767 */
   }

   public void sendrow_9810( )
   {
      wb0E0( ) ;
      Grid4Row = GXWebRow.GetNew(context,Grid4Container) ;
      if ( subGrid4_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         subGrid4_Backcolor = subGrid4_Allbackcolor ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid4ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid4_Backcolor, 9, 0)));
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
         subGrid4_Backcolor = (int)(0xFFFFFF) ;
         httpContext.ajax_rsp_assign_prop("", false, "Grid4ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid4_Backcolor, 9, 0)));
      }
      else if ( subGrid4_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_98_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid4_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid4ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid4_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Even" ;
            }
         }
         else
         {
            subGrid4_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid4ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid4_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid4Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_98_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_98_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_98_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_98_idx+"\">") ;
            }
         }
      }
      Grid4Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid4_Linesclass,""});
      Grid4Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
      /* Single line edit */
      ClassString = "ReadonlyAttributeMenuList" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid4Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd4_tam02_menu_nm_Internalname,GXutil.rtrim( AV14D_GRD4_TAM02_MENU_NM),"","","",edtavD_grd4_tam02_menu_nm_Link,edtavD_grd4_tam02_menu_nm_Linktarget,"",edtavD_grd4_tam02_menu_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd4_tam02_menu_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(98),new Integer(1),new Integer(1),new Boolean(true),"left"});
      if ( Grid4Container.GetWrapped() == 1 )
      {
         Grid4Container.CloseTag("cell");
      }
      if ( Grid4Container.GetWrapped() == 1 )
      {
         Grid4Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      if ( Grid4Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)(nGXsfl_98_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid4Container.AddRow(Grid4Row);
      nGXsfl_98_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_98_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_98_idx+1)) ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd4_tam02_menu_nm_Internalname = "vD_GRD4_TAM02_MENU_NM_"+sGXsfl_98_idx ;
      /* End function sendrow_9810 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_pass_chg_Internalname = "TXT_BTN_PASS_CHG" ;
      tblTable10_Internalname = "TABLE10" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable7_Internalname = "TABLE7" ;
      tblTable1_Internalname = "TABLE1" ;
      tblTable12_Internalname = "TABLE12" ;
      lblTxt_title1_Internalname = "TXT_TITLE1" ;
      tblTable16_Internalname = "TABLE16" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl1_Internalname = "TBL1" ;
      lblTxt_title2_Internalname = "TXT_TITLE2" ;
      tblTable19_Internalname = "TABLE19" ;
      tblTable8_Internalname = "TABLE8" ;
      tblTbl2_Internalname = "TBL2" ;
      lblTxt_title3_Internalname = "TXT_TITLE3" ;
      tblTable22_Internalname = "TABLE22" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTbl3_Internalname = "TBL3" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_tam01_sys_id_Internalname = "vH_TAM01_SYS_ID" ;
      edtavH_01_tam02_menu_id_tree_1_Internalname = "vH_01_TAM02_MENU_ID_TREE_1" ;
      edtavH_02_tam02_menu_id_tree_1_Internalname = "vH_02_TAM02_MENU_ID_TREE_1" ;
      edtavH_02_tam02_menu_id_tree_2_Internalname = "vH_02_TAM02_MENU_ID_TREE_2" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      edtavD_none_Internalname = "vD_NONE" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
      subGrid3_Internalname = "GRID3" ;
      subGrid4_Internalname = "GRID4" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd4_tam02_menu_nm_Jsonclick = "" ;
      subGrid4_Class = "FreeStyleBase" ;
      edtavH_grd3_tam02_menu_id_tree_2_Jsonclick = "" ;
      edtavH_grd3_tam02_menu_id_tree_2_Enabled = 1 ;
      edtavH_grd3_tam02_menu_id_tree_1_Jsonclick = "" ;
      edtavH_grd3_tam02_menu_id_tree_1_Enabled = 1 ;
      edtavD_grd3_link_tam02_menu_nm_Jsonclick = "" ;
      edtavD_grd3_tam02_menu_nm_Jsonclick = "" ;
      subGrid3_Class = "FreeStyleBase" ;
      edtavH_grd2_tam02_menu_id_tree_1_Jsonclick = "" ;
      edtavH_grd2_tam02_menu_id_tree_1_Enabled = 1 ;
      edtavD_grd2_link_tam02_menu_nm_Jsonclick = "" ;
      edtavD_grd2_tam02_menu_nm_Jsonclick = "" ;
      subGrid2_Class = "FreeStyleBase" ;
      edtavD_grd1_tam02_menu_nm_Jsonclick = "" ;
      edtavD_grd1_link_tam02_menu_nm_Jsonclick = "" ;
      edtavH_grd1_tam01_sys_id_Jsonclick = "" ;
      edtavH_grd1_tam01_sys_id_Enabled = 1 ;
      subGrid1_Class = "FreeStyleBase" ;
      lblTxt_btn_pass_chg_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd1_tam02_menu_nm_Visible = 1 ;
      edtavD_grd1_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd1_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      edtavD_grd1_link_tam02_menu_nm_Visible = 1 ;
      edtavD_grd1_link_tam02_menu_nm_Linktarget = "" ;
      edtavD_grd1_link_tam02_menu_nm_Link = "" ;
      edtavD_grd1_link_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd1_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      edtavH_grd1_tam01_sys_id_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtavH_grd2_tam02_menu_id_tree_1_Visible = 1 ;
      edtavD_grd2_link_tam02_menu_nm_Visible = 1 ;
      edtavD_grd2_link_tam02_menu_nm_Linktarget = "" ;
      edtavD_grd2_link_tam02_menu_nm_Link = "" ;
      edtavD_grd2_link_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd2_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      edtavD_grd2_tam02_menu_nm_Visible = 1 ;
      edtavD_grd2_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd2_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      edtavH_grd3_tam02_menu_id_tree_2_Visible = 1 ;
      edtavH_grd3_tam02_menu_id_tree_1_Visible = 1 ;
      edtavD_grd3_link_tam02_menu_nm_Visible = 1 ;
      edtavD_grd3_link_tam02_menu_nm_Linktarget = "" ;
      edtavD_grd3_link_tam02_menu_nm_Link = "" ;
      edtavD_grd3_link_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd3_link_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      edtavD_grd3_tam02_menu_nm_Visible = 1 ;
      edtavD_grd3_tam02_menu_nm_Enabled = 1 ;
      edtavD_grd3_tam02_menu_nm_Class = "ReadonlyAttributeMenuList" ;
      subGrid3_Width = 100 ;
      subGrid3_Borderwidth = (short)(0) ;
      subGrid3_Backcolorstyle = (byte)(0) ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      edtavD_grd4_tam02_menu_nm_Linktarget = "" ;
      edtavD_grd4_tam02_menu_nm_Link = "" ;
      edtavD_grd4_tam02_menu_nm_Enabled = 0 ;
      subGrid4_Borderwidth = (short)(0) ;
      subGrid4_Backcolorstyle = (byte)(0) ;
      edtavH_02_tam02_menu_id_tree_2_Jsonclick = "" ;
      edtavH_02_tam02_menu_id_tree_1_Jsonclick = "" ;
      edtavH_01_tam02_menu_id_tree_1_Jsonclick = "" ;
      edtavH_tam01_sys_id_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavD_none_Jsonclick = "" ;
      tblTable12_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      lblTxt_title1_Caption = "1階層" ;
      lblTxt_title2_Caption = "2階層" ;
      lblTxt_title3_Caption = "3階層" ;
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
                  /* Execute user subroutine: S18535 */
                  S18535 ();
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
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      A65TAM02_APP_ID = "" ;
      A89TAM03_KIDO_PG = "" ;
      A9TAM02_MENU_NM = "" ;
      A13TAM02_MENU_ID_TREE_3 = "" ;
      A12TAM02_MENU_ID_TREE_2 = "" ;
      A11TAM02_MENU_ID_TREE_1 = "" ;
      A1TAM01_SYS_ID = "" ;
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
      edtavH_grd1_tam01_sys_id_Internalname = "" ;
      edtavD_grd1_link_tam02_menu_nm_Internalname = "" ;
      edtavD_grd1_tam02_menu_nm_Internalname = "" ;
      AV22H_GRD1_TAM01_SYS_ID = "" ;
      AV8D_GRD1_LINK_TAM02_MENU_NM = "" ;
      AV9D_GRD1_TAM02_MENU_NM = "" ;
      edtavD_grd4_tam02_menu_nm_Internalname = "" ;
      AV14D_GRD4_TAM02_MENU_NM = "" ;
      edtavD_grd3_tam02_menu_nm_Internalname = "" ;
      edtavD_grd3_link_tam02_menu_nm_Internalname = "" ;
      edtavH_grd3_tam02_menu_id_tree_1_Internalname = "" ;
      edtavH_grd3_tam02_menu_id_tree_2_Internalname = "" ;
      AV13D_GRD3_TAM02_MENU_NM = "" ;
      AV12D_GRD3_LINK_TAM02_MENU_NM = "" ;
      AV26H_GRD3_TAM02_MENU_ID_TREE_1 = "" ;
      AV27H_GRD3_TAM02_MENU_ID_TREE_2 = "" ;
      edtavD_grd2_tam02_menu_nm_Internalname = "" ;
      edtavD_grd2_link_tam02_menu_nm_Internalname = "" ;
      edtavH_grd2_tam02_menu_id_tree_1_Internalname = "" ;
      AV11D_GRD2_TAM02_MENU_NM = "" ;
      AV10D_GRD2_LINK_TAM02_MENU_NM = "" ;
      AV23H_GRD2_TAM02_MENU_ID_TREE_1 = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      AV40Pgmname = "" ;
      AV29H_INIT_FLG = "" ;
      AV31H_TAM01_SYS_ID = "" ;
      AV16H_01_TAM02_MENU_ID_TREE_1 = "" ;
      AV19H_02_TAM02_MENU_ID_TREE_1 = "" ;
      AV20H_02_TAM02_MENU_ID_TREE_2 = "" ;
      AV15D_NONE = "" ;
      AV7C_TAM02_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV33W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      H000E2_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H000E2_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H000E2_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      H000E2_A9TAM02_MENU_NM = new String[] {""} ;
      H000E2_n9TAM02_MENU_NM = new boolean[] {false} ;
      H000E2_A89TAM03_KIDO_PG = new String[] {""} ;
      H000E2_n89TAM03_KIDO_PG = new boolean[] {false} ;
      H000E2_A65TAM02_APP_ID = new String[] {""} ;
      H000E2_n65TAM02_APP_ID = new boolean[] {false} ;
      H000E2_A1TAM01_SYS_ID = new String[] {""} ;
      AV35W_HTTP_REQUEST = httpContext.getHttpRequest();
      AV37WINDOW = new com.genexus.webpanels.GXWindow();
      AV36W_SESSION = httpContext.getWebSession();
      H000E3_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H000E3_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H000E3_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      H000E3_A1TAM01_SYS_ID = new String[] {""} ;
      H000E3_A9TAM02_MENU_NM = new String[] {""} ;
      H000E3_n9TAM02_MENU_NM = new boolean[] {false} ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV34W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      H000E4_A65TAM02_APP_ID = new String[] {""} ;
      H000E4_n65TAM02_APP_ID = new boolean[] {false} ;
      H000E4_A9TAM02_MENU_NM = new String[] {""} ;
      H000E4_n9TAM02_MENU_NM = new boolean[] {false} ;
      H000E4_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      H000E4_A89TAM03_KIDO_PG = new String[] {""} ;
      H000E4_n89TAM03_KIDO_PG = new boolean[] {false} ;
      H000E4_A10TAM02_DEL_FLG = new String[] {""} ;
      H000E4_n10TAM02_DEL_FLG = new boolean[] {false} ;
      H000E4_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H000E4_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H000E4_A1TAM01_SYS_ID = new String[] {""} ;
      A10TAM02_DEL_FLG = "" ;
      H000E5_A88TAM03_APP_ID = new String[] {""} ;
      H000E5_A18TAM04_DEL_FLG = new String[] {""} ;
      H000E5_n18TAM04_DEL_FLG = new boolean[] {false} ;
      H000E5_A101TAM05_KNGN_FLG = new String[] {""} ;
      H000E5_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      H000E5_A17TAM04_AUTH_CD = new String[] {""} ;
      A88TAM03_APP_ID = "" ;
      A18TAM04_DEL_FLG = "" ;
      A101TAM05_KNGN_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      H000E6_A65TAM02_APP_ID = new String[] {""} ;
      H000E6_n65TAM02_APP_ID = new boolean[] {false} ;
      H000E6_A9TAM02_MENU_NM = new String[] {""} ;
      H000E6_n9TAM02_MENU_NM = new boolean[] {false} ;
      H000E6_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      H000E6_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H000E6_A89TAM03_KIDO_PG = new String[] {""} ;
      H000E6_n89TAM03_KIDO_PG = new boolean[] {false} ;
      H000E6_A10TAM02_DEL_FLG = new String[] {""} ;
      H000E6_n10TAM02_DEL_FLG = new boolean[] {false} ;
      H000E6_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H000E6_A1TAM01_SYS_ID = new String[] {""} ;
      H000E7_A88TAM03_APP_ID = new String[] {""} ;
      H000E7_A18TAM04_DEL_FLG = new String[] {""} ;
      H000E7_n18TAM04_DEL_FLG = new boolean[] {false} ;
      H000E7_A101TAM05_KNGN_FLG = new String[] {""} ;
      H000E7_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      H000E7_A17TAM04_AUTH_CD = new String[] {""} ;
      H000E8_A65TAM02_APP_ID = new String[] {""} ;
      H000E8_n65TAM02_APP_ID = new boolean[] {false} ;
      H000E8_A9TAM02_MENU_NM = new String[] {""} ;
      H000E8_n9TAM02_MENU_NM = new boolean[] {false} ;
      H000E8_A89TAM03_KIDO_PG = new String[] {""} ;
      H000E8_n89TAM03_KIDO_PG = new boolean[] {false} ;
      H000E8_A10TAM02_DEL_FLG = new String[] {""} ;
      H000E8_n10TAM02_DEL_FLG = new boolean[] {false} ;
      H000E8_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H000E8_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H000E8_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      H000E8_A1TAM01_SYS_ID = new String[] {""} ;
      H000E9_A88TAM03_APP_ID = new String[] {""} ;
      H000E9_A18TAM04_DEL_FLG = new String[] {""} ;
      H000E9_n18TAM04_DEL_FLG = new boolean[] {false} ;
      H000E9_A101TAM05_KNGN_FLG = new String[] {""} ;
      H000E9_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      H000E9_A17TAM04_AUTH_CD = new String[] {""} ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      lblTxt_title3_Jsonclick = "" ;
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      lblTxt_title2_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      lblTxt_title1_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock1_Jsonclick = "" ;
      lblTxt_btn_pass_chg_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      GXt_char1 = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      GXt_char2 = "" ;
      GXt_char5 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a103_wp01_system_menu__default(),
         new Object[] {
             new Object[] {
            H000E2_A13TAM02_MENU_ID_TREE_3, H000E2_A12TAM02_MENU_ID_TREE_2, H000E2_A11TAM02_MENU_ID_TREE_1, H000E2_A9TAM02_MENU_NM, H000E2_n9TAM02_MENU_NM, H000E2_A89TAM03_KIDO_PG, H000E2_n89TAM03_KIDO_PG, H000E2_A65TAM02_APP_ID, H000E2_n65TAM02_APP_ID, H000E2_A1TAM01_SYS_ID
            }
            , new Object[] {
            H000E3_A13TAM02_MENU_ID_TREE_3, H000E3_A12TAM02_MENU_ID_TREE_2, H000E3_A11TAM02_MENU_ID_TREE_1, H000E3_A1TAM01_SYS_ID, H000E3_A9TAM02_MENU_NM, H000E3_n9TAM02_MENU_NM
            }
            , new Object[] {
            H000E4_A65TAM02_APP_ID, H000E4_n65TAM02_APP_ID, H000E4_A9TAM02_MENU_NM, H000E4_n9TAM02_MENU_NM, H000E4_A11TAM02_MENU_ID_TREE_1, H000E4_A89TAM03_KIDO_PG, H000E4_n89TAM03_KIDO_PG, H000E4_A10TAM02_DEL_FLG, H000E4_n10TAM02_DEL_FLG, H000E4_A13TAM02_MENU_ID_TREE_3,
            H000E4_A12TAM02_MENU_ID_TREE_2, H000E4_A1TAM01_SYS_ID
            }
            , new Object[] {
            H000E5_A88TAM03_APP_ID, H000E5_A18TAM04_DEL_FLG, H000E5_n18TAM04_DEL_FLG, H000E5_A101TAM05_KNGN_FLG, H000E5_n101TAM05_KNGN_FLG, H000E5_A17TAM04_AUTH_CD
            }
            , new Object[] {
            H000E6_A65TAM02_APP_ID, H000E6_n65TAM02_APP_ID, H000E6_A9TAM02_MENU_NM, H000E6_n9TAM02_MENU_NM, H000E6_A11TAM02_MENU_ID_TREE_1, H000E6_A12TAM02_MENU_ID_TREE_2, H000E6_A89TAM03_KIDO_PG, H000E6_n89TAM03_KIDO_PG, H000E6_A10TAM02_DEL_FLG, H000E6_n10TAM02_DEL_FLG,
            H000E6_A13TAM02_MENU_ID_TREE_3, H000E6_A1TAM01_SYS_ID
            }
            , new Object[] {
            H000E7_A88TAM03_APP_ID, H000E7_A18TAM04_DEL_FLG, H000E7_n18TAM04_DEL_FLG, H000E7_A101TAM05_KNGN_FLG, H000E7_n101TAM05_KNGN_FLG, H000E7_A17TAM04_AUTH_CD
            }
            , new Object[] {
            H000E8_A65TAM02_APP_ID, H000E8_n65TAM02_APP_ID, H000E8_A9TAM02_MENU_NM, H000E8_n9TAM02_MENU_NM, H000E8_A89TAM03_KIDO_PG, H000E8_n89TAM03_KIDO_PG, H000E8_A10TAM02_DEL_FLG, H000E8_n10TAM02_DEL_FLG, H000E8_A13TAM02_MENU_ID_TREE_3, H000E8_A12TAM02_MENU_ID_TREE_2,
            H000E8_A11TAM02_MENU_ID_TREE_1, H000E8_A1TAM01_SYS_ID
            }
            , new Object[] {
            H000E9_A88TAM03_APP_ID, H000E9_A18TAM04_DEL_FLG, H000E9_n18TAM04_DEL_FLG, H000E9_A101TAM05_KNGN_FLG, H000E9_n101TAM05_KNGN_FLG, H000E9_A17TAM04_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "A103_WP01_SYSTEM_MENU" ;
      /* GeneXus formulas. */
      AV40Pgmname = "A103_WP01_SYSTEM_MENU" ;
      Gx_err = (short)(0) ;
      edtavD_grd1_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd1_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd2_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd2_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd3_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd3_link_tam02_menu_nm_Enabled = 0 ;
      edtavD_grd4_tam02_menu_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV32P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV32P_MOVE_KBN ;
   private byte nDonePA ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_36_idx=1 ;
   private short nRC_Grid2 ;
   private short nGXsfl_56_idx=1 ;
   private short nRC_Grid3 ;
   private short nGXsfl_76_idx=1 ;
   private short nRC_Grid4 ;
   private short nGXsfl_98_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short subGrid4_Borderwidth ;
   private short subGrid3_Borderwidth ;
   private short subGrid2_Borderwidth ;
   private short subGrid1_Borderwidth ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid4_Islastpage ;
   private int edtavD_grd1_link_tam02_menu_nm_Enabled ;
   private int edtavD_grd1_tam02_menu_nm_Enabled ;
   private int edtavD_grd2_tam02_menu_nm_Enabled ;
   private int edtavD_grd2_link_tam02_menu_nm_Enabled ;
   private int edtavD_grd3_tam02_menu_nm_Enabled ;
   private int edtavD_grd3_link_tam02_menu_nm_Enabled ;
   private int edtavD_grd4_tam02_menu_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavH_grd1_tam01_sys_id_Visible ;
   private int edtavD_grd1_tam02_menu_nm_Visible ;
   private int edtavD_grd1_link_tam02_menu_nm_Visible ;
   private int tblTable12_Visible ;
   private int lblTxt_btn_pass_chg_Visible ;
   private int GXActiveErrHndl ;
   private int edtavH_grd2_tam02_menu_id_tree_1_Visible ;
   private int edtavD_grd2_tam02_menu_nm_Visible ;
   private int edtavD_grd2_link_tam02_menu_nm_Visible ;
   private int edtavH_grd3_tam02_menu_id_tree_1_Visible ;
   private int edtavH_grd3_tam02_menu_id_tree_2_Visible ;
   private int edtavD_grd3_tam02_menu_nm_Visible ;
   private int edtavD_grd3_link_tam02_menu_nm_Visible ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid3_Width ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavH_grd1_tam01_sys_id_Enabled ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavH_grd2_tam02_menu_id_tree_1_Enabled ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int edtavH_grd3_tam02_menu_id_tree_1_Enabled ;
   private int edtavH_grd3_tam02_menu_id_tree_2_Enabled ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_36_idx="0001" ;
   private String sGXsfl_56_idx="0001" ;
   private String sGXsfl_76_idx="0001" ;
   private String sGXsfl_98_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String lblTxt_title3_Caption ;
   private String lblTxt_title2_Caption ;
   private String lblTxt_title1_Caption ;
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
   private String edtavH_grd1_tam01_sys_id_Internalname ;
   private String edtavD_grd1_link_tam02_menu_nm_Internalname ;
   private String edtavD_grd1_tam02_menu_nm_Internalname ;
   private String edtavD_grd4_tam02_menu_nm_Internalname ;
   private String edtavD_grd3_tam02_menu_nm_Internalname ;
   private String edtavD_grd3_link_tam02_menu_nm_Internalname ;
   private String edtavH_grd3_tam02_menu_id_tree_1_Internalname ;
   private String edtavH_grd3_tam02_menu_id_tree_2_Internalname ;
   private String edtavD_grd2_tam02_menu_nm_Internalname ;
   private String edtavD_grd2_link_tam02_menu_nm_Internalname ;
   private String edtavH_grd2_tam02_menu_id_tree_1_Internalname ;
   private String GXDecQS ;
   private String AV40Pgmname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_tam01_sys_id_Internalname ;
   private String edtavH_01_tam02_menu_id_tree_1_Internalname ;
   private String edtavH_02_tam02_menu_id_tree_1_Internalname ;
   private String edtavH_02_tam02_menu_id_tree_2_Internalname ;
   private String edtavD_none_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String edtavD_grd1_tam02_menu_nm_Class ;
   private String edtavD_grd1_link_tam02_menu_nm_Class ;
   private String edtavD_grd1_link_tam02_menu_nm_Linktarget ;
   private String edtavD_grd1_link_tam02_menu_nm_Link ;
   private String lblTxt_title1_Internalname ;
   private String lblTxt_title2_Internalname ;
   private String lblTxt_title3_Internalname ;
   private String tblTable12_Internalname ;
   private String lblTxt_btn_pass_chg_Internalname ;
   private String GXv_char3[] ;
   private String edtavD_grd2_tam02_menu_nm_Class ;
   private String edtavD_grd2_link_tam02_menu_nm_Class ;
   private String edtavD_grd2_link_tam02_menu_nm_Linktarget ;
   private String edtavD_grd2_link_tam02_menu_nm_Link ;
   private String edtavD_grd3_tam02_menu_nm_Class ;
   private String edtavD_grd3_link_tam02_menu_nm_Class ;
   private String edtavD_grd3_link_tam02_menu_nm_Linktarget ;
   private String edtavD_grd3_link_tam02_menu_nm_Link ;
   private String edtavD_grd4_tam02_menu_nm_Linktarget ;
   private String edtavD_grd4_tam02_menu_nm_Link ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String edtavD_none_Jsonclick ;
   private String lblTxt_js_event_Jsonclick ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_tam01_sys_id_Jsonclick ;
   private String edtavH_01_tam02_menu_id_tree_1_Jsonclick ;
   private String edtavH_02_tam02_menu_id_tree_1_Jsonclick ;
   private String edtavH_02_tam02_menu_id_tree_2_Jsonclick ;
   private String tblTable5_Internalname ;
   private String tblTable4_Internalname ;
   private String tblTbl3_Internalname ;
   private String tblTable9_Internalname ;
   private String subGrid4_Internalname ;
   private String tblTable22_Internalname ;
   private String lblTxt_title3_Jsonclick ;
   private String tblTbl2_Internalname ;
   private String tblTable8_Internalname ;
   private String subGrid3_Internalname ;
   private String tblTable19_Internalname ;
   private String lblTxt_title2_Jsonclick ;
   private String tblTbl1_Internalname ;
   private String tblTable6_Internalname ;
   private String subGrid2_Internalname ;
   private String tblTable16_Internalname ;
   private String lblTxt_title1_Jsonclick ;
   private String tblTable1_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTxt_btn_pass_chg_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavH_grd1_tam01_sys_id_Jsonclick ;
   private String edtavD_grd1_link_tam02_menu_nm_Jsonclick ;
   private String edtavD_grd1_tam02_menu_nm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavD_grd2_tam02_menu_nm_Jsonclick ;
   private String edtavD_grd2_link_tam02_menu_nm_Jsonclick ;
   private String edtavH_grd2_tam02_menu_id_tree_1_Jsonclick ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String GXt_char1 ;
   private String edtavD_grd3_tam02_menu_nm_Jsonclick ;
   private String edtavD_grd3_link_tam02_menu_nm_Jsonclick ;
   private String edtavH_grd3_tam02_menu_id_tree_1_Jsonclick ;
   private String edtavH_grd3_tam02_menu_id_tree_2_Jsonclick ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String GXt_char2 ;
   private String edtavD_grd4_tam02_menu_nm_Jsonclick ;
   private String GXt_char5 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n9TAM02_MENU_NM ;
   private boolean n89TAM03_KIDO_PG ;
   private boolean n65TAM02_APP_ID ;
   private boolean n10TAM02_DEL_FLG ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n101TAM05_KNGN_FLG ;
   private String A65TAM02_APP_ID ;
   private String A89TAM03_KIDO_PG ;
   private String A9TAM02_MENU_NM ;
   private String A13TAM02_MENU_ID_TREE_3 ;
   private String A12TAM02_MENU_ID_TREE_2 ;
   private String A11TAM02_MENU_ID_TREE_1 ;
   private String A1TAM01_SYS_ID ;
   private String AV22H_GRD1_TAM01_SYS_ID ;
   private String AV8D_GRD1_LINK_TAM02_MENU_NM ;
   private String AV9D_GRD1_TAM02_MENU_NM ;
   private String AV14D_GRD4_TAM02_MENU_NM ;
   private String AV13D_GRD3_TAM02_MENU_NM ;
   private String AV12D_GRD3_LINK_TAM02_MENU_NM ;
   private String AV26H_GRD3_TAM02_MENU_ID_TREE_1 ;
   private String AV27H_GRD3_TAM02_MENU_ID_TREE_2 ;
   private String AV11D_GRD2_TAM02_MENU_NM ;
   private String AV10D_GRD2_LINK_TAM02_MENU_NM ;
   private String AV23H_GRD2_TAM02_MENU_ID_TREE_1 ;
   private String AV29H_INIT_FLG ;
   private String AV31H_TAM01_SYS_ID ;
   private String AV16H_01_TAM02_MENU_ID_TREE_1 ;
   private String AV19H_02_TAM02_MENU_ID_TREE_1 ;
   private String AV20H_02_TAM02_MENU_ID_TREE_2 ;
   private String AV15D_NONE ;
   private String AV7C_TAM02_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV34W_ERRCD ;
   private String A10TAM02_DEL_FLG ;
   private String A88TAM03_APP_ID ;
   private String A18TAM04_DEL_FLG ;
   private String A101TAM05_KNGN_FLG ;
   private String A17TAM04_AUTH_CD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV37WINDOW ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.internet.HttpRequest AV35W_HTTP_REQUEST ;
   private com.genexus.webpanels.WebSession AV36W_SESSION ;
   private IDataStoreProvider pr_default ;
   private String[] H000E2_A13TAM02_MENU_ID_TREE_3 ;
   private String[] H000E2_A12TAM02_MENU_ID_TREE_2 ;
   private String[] H000E2_A11TAM02_MENU_ID_TREE_1 ;
   private String[] H000E2_A9TAM02_MENU_NM ;
   private boolean[] H000E2_n9TAM02_MENU_NM ;
   private String[] H000E2_A89TAM03_KIDO_PG ;
   private boolean[] H000E2_n89TAM03_KIDO_PG ;
   private String[] H000E2_A65TAM02_APP_ID ;
   private boolean[] H000E2_n65TAM02_APP_ID ;
   private String[] H000E2_A1TAM01_SYS_ID ;
   private String[] H000E3_A13TAM02_MENU_ID_TREE_3 ;
   private String[] H000E3_A12TAM02_MENU_ID_TREE_2 ;
   private String[] H000E3_A11TAM02_MENU_ID_TREE_1 ;
   private String[] H000E3_A1TAM01_SYS_ID ;
   private String[] H000E3_A9TAM02_MENU_NM ;
   private boolean[] H000E3_n9TAM02_MENU_NM ;
   private String[] H000E4_A65TAM02_APP_ID ;
   private boolean[] H000E4_n65TAM02_APP_ID ;
   private String[] H000E4_A9TAM02_MENU_NM ;
   private boolean[] H000E4_n9TAM02_MENU_NM ;
   private String[] H000E4_A11TAM02_MENU_ID_TREE_1 ;
   private String[] H000E4_A89TAM03_KIDO_PG ;
   private boolean[] H000E4_n89TAM03_KIDO_PG ;
   private String[] H000E4_A10TAM02_DEL_FLG ;
   private boolean[] H000E4_n10TAM02_DEL_FLG ;
   private String[] H000E4_A13TAM02_MENU_ID_TREE_3 ;
   private String[] H000E4_A12TAM02_MENU_ID_TREE_2 ;
   private String[] H000E4_A1TAM01_SYS_ID ;
   private String[] H000E5_A88TAM03_APP_ID ;
   private String[] H000E5_A18TAM04_DEL_FLG ;
   private boolean[] H000E5_n18TAM04_DEL_FLG ;
   private String[] H000E5_A101TAM05_KNGN_FLG ;
   private boolean[] H000E5_n101TAM05_KNGN_FLG ;
   private String[] H000E5_A17TAM04_AUTH_CD ;
   private String[] H000E6_A65TAM02_APP_ID ;
   private boolean[] H000E6_n65TAM02_APP_ID ;
   private String[] H000E6_A9TAM02_MENU_NM ;
   private boolean[] H000E6_n9TAM02_MENU_NM ;
   private String[] H000E6_A11TAM02_MENU_ID_TREE_1 ;
   private String[] H000E6_A12TAM02_MENU_ID_TREE_2 ;
   private String[] H000E6_A89TAM03_KIDO_PG ;
   private boolean[] H000E6_n89TAM03_KIDO_PG ;
   private String[] H000E6_A10TAM02_DEL_FLG ;
   private boolean[] H000E6_n10TAM02_DEL_FLG ;
   private String[] H000E6_A13TAM02_MENU_ID_TREE_3 ;
   private String[] H000E6_A1TAM01_SYS_ID ;
   private String[] H000E7_A88TAM03_APP_ID ;
   private String[] H000E7_A18TAM04_DEL_FLG ;
   private boolean[] H000E7_n18TAM04_DEL_FLG ;
   private String[] H000E7_A101TAM05_KNGN_FLG ;
   private boolean[] H000E7_n101TAM05_KNGN_FLG ;
   private String[] H000E7_A17TAM04_AUTH_CD ;
   private String[] H000E8_A65TAM02_APP_ID ;
   private boolean[] H000E8_n65TAM02_APP_ID ;
   private String[] H000E8_A9TAM02_MENU_NM ;
   private boolean[] H000E8_n9TAM02_MENU_NM ;
   private String[] H000E8_A89TAM03_KIDO_PG ;
   private boolean[] H000E8_n89TAM03_KIDO_PG ;
   private String[] H000E8_A10TAM02_DEL_FLG ;
   private boolean[] H000E8_n10TAM02_DEL_FLG ;
   private String[] H000E8_A13TAM02_MENU_ID_TREE_3 ;
   private String[] H000E8_A12TAM02_MENU_ID_TREE_2 ;
   private String[] H000E8_A11TAM02_MENU_ID_TREE_1 ;
   private String[] H000E8_A1TAM01_SYS_ID ;
   private String[] H000E9_A88TAM03_APP_ID ;
   private String[] H000E9_A18TAM04_DEL_FLG ;
   private boolean[] H000E9_n18TAM04_DEL_FLG ;
   private String[] H000E9_A101TAM05_KNGN_FLG ;
   private boolean[] H000E9_n101TAM05_KNGN_FLG ;
   private String[] H000E9_A17TAM04_AUTH_CD ;
   private SdtA_LOGIN_SDT AV33W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class a103_wp01_system_menu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000E2", "SELECT T1.`TAM02_MENU_ID_TREE_3`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_NM`, T2.`TAM03_KIDO_PG`, T1.`TAM02_APP_ID` AS TAM02_APP_ID, T1.`TAM01_SYS_ID` FROM (`TAM02_MENU` T1 LEFT JOIN `TAM03_APPLI` T2 ON T2.`TAM03_APP_ID` = T1.`TAM02_APP_ID`) WHERE (T1.`TAM02_MENU_ID_TREE_1` = '00') AND (T1.`TAM02_MENU_ID_TREE_2` = '00') AND (T1.`TAM02_MENU_ID_TREE_3` = '00') ORDER BY T1.`TAM01_SYS_ID`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_3` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000E3", "SELECT `TAM02_MENU_ID_TREE_3`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_1`, `TAM01_SYS_ID`, `TAM02_MENU_NM` FROM `TAM02_MENU` WHERE `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_1` = '00' and `TAM02_MENU_ID_TREE_2` = '00' and `TAM02_MENU_ID_TREE_3` = '00' ORDER BY `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000E4", "SELECT T1.`TAM02_APP_ID` AS TAM02_APP_ID, T1.`TAM02_MENU_NM`, T1.`TAM02_MENU_ID_TREE_1`, T2.`TAM03_KIDO_PG`, T1.`TAM02_DEL_FLG`, T1.`TAM02_MENU_ID_TREE_3`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM01_SYS_ID` FROM (`TAM02_MENU` T1 LEFT JOIN `TAM03_APPLI` T2 ON T2.`TAM03_APP_ID` = T1.`TAM02_APP_ID`) WHERE (T1.`TAM01_SYS_ID` = ?) AND (T1.`TAM02_MENU_ID_TREE_1` <> '00') AND (T1.`TAM02_MENU_ID_TREE_2` = '00') AND (T1.`TAM02_MENU_ID_TREE_3` = '00') AND (T1.`TAM02_DEL_FLG` = '0') ORDER BY T1.`TAM01_SYS_ID`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_3` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000E5", "SELECT T1.`TAM03_APP_ID`, T2.`TAM04_DEL_FLG`, T1.`TAM05_KNGN_FLG`, T1.`TAM04_AUTH_CD` FROM (`TAM05_APPLI_KNGN` T1 INNER JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM04_AUTH_CD`) WHERE (T1.`TAM04_AUTH_CD` = ? and T1.`TAM03_APP_ID` = ?) AND (T1.`TAM05_KNGN_FLG` IN ('1','2')) AND (T2.`TAM04_DEL_FLG` = '0') ORDER BY T1.`TAM04_AUTH_CD`, T1.`TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000E6", "SELECT T1.`TAM02_APP_ID` AS TAM02_APP_ID, T1.`TAM02_MENU_NM`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_ID_TREE_2`, T2.`TAM03_KIDO_PG`, T1.`TAM02_DEL_FLG`, T1.`TAM02_MENU_ID_TREE_3`, T1.`TAM01_SYS_ID` FROM (`TAM02_MENU` T1 LEFT JOIN `TAM03_APPLI` T2 ON T2.`TAM03_APP_ID` = T1.`TAM02_APP_ID`) WHERE (T1.`TAM01_SYS_ID` = ? and T1.`TAM02_MENU_ID_TREE_1` = ?) AND (T1.`TAM02_MENU_ID_TREE_2` <> '00') AND (T1.`TAM02_MENU_ID_TREE_3` = '00') AND (T1.`TAM02_DEL_FLG` = '0') ORDER BY T1.`TAM01_SYS_ID`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_3` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000E7", "SELECT T1.`TAM03_APP_ID`, T2.`TAM04_DEL_FLG`, T1.`TAM05_KNGN_FLG`, T1.`TAM04_AUTH_CD` FROM (`TAM05_APPLI_KNGN` T1 INNER JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM04_AUTH_CD`) WHERE (T1.`TAM04_AUTH_CD` = ? and T1.`TAM03_APP_ID` = ?) AND (T1.`TAM05_KNGN_FLG` IN ('1','2')) AND (T2.`TAM04_DEL_FLG` = '0') ORDER BY T1.`TAM04_AUTH_CD`, T1.`TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000E8", "SELECT T1.`TAM02_APP_ID` AS TAM02_APP_ID, T1.`TAM02_MENU_NM`, T2.`TAM03_KIDO_PG`, T1.`TAM02_DEL_FLG`, T1.`TAM02_MENU_ID_TREE_3`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM01_SYS_ID` FROM (`TAM02_MENU` T1 LEFT JOIN `TAM03_APPLI` T2 ON T2.`TAM03_APP_ID` = T1.`TAM02_APP_ID`) WHERE (T1.`TAM01_SYS_ID` = ? and T1.`TAM02_MENU_ID_TREE_1` = ? and T1.`TAM02_MENU_ID_TREE_2` = ?) AND (T1.`TAM02_MENU_ID_TREE_3` <> '00') AND (T1.`TAM02_DEL_FLG` = '0') ORDER BY T1.`TAM01_SYS_ID`, T1.`TAM02_MENU_ID_TREE_1`, T1.`TAM02_MENU_ID_TREE_2`, T1.`TAM02_MENU_ID_TREE_3` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H000E9", "SELECT T1.`TAM03_APP_ID`, T2.`TAM04_DEL_FLG`, T1.`TAM05_KNGN_FLG`, T1.`TAM04_AUTH_CD` FROM (`TAM05_APPLI_KNGN` T1 INNER JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM04_AUTH_CD`) WHERE (T1.`TAM04_AUTH_CD` = ? and T1.`TAM03_APP_ID` = ?) AND (T1.`TAM05_KNGN_FLG` IN ('1','2')) AND (T2.`TAM04_DEL_FLG` = '0') ORDER BY T1.`TAM04_AUTH_CD`, T1.`TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 7);
               }
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 2);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 7);
               }
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 2);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 7);
               }
               break;
      }
   }

}

