/*
               File: a201_wp01_kngn_ptn_list_impl
        Description: 権限パターンマスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:32.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a201_wp01_kngn_ptn_list_impl extends GXWebPanel
{
   public a201_wp01_kngn_ptn_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a201_wp01_kngn_ptn_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a201_wp01_kngn_ptn_list_impl.class ));
   }

   public a201_wp01_kngn_ptn_list_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_164 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_164_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_164_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_164, nGXsfl_164_idx, sGXsfl_164_idx) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV16P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16P_MOVE_KBN", GXutil.str( AV16P_MOVE_KBN, 1, 0));
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
         pa0P2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0P2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0P2( ) ;
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
      httpContext.writeValue( "権限パターンマスタメンテナンス（一覧）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513223234");
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
      GXEncryptionTmp = "a201_wp01_kngn_ptn_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a201_wp01_kngn_ptn_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0P2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV15H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_TAM04_KNGN_PTN_NM", GXutil.rtrim( AV6H_TAM04_KNGN_PTN_NM));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV11H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV11H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_164", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_164, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV8C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV8C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV16P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV19W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV23W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "vC_GRID_ROWS", GXutil.ltrim( localUtil.ntoc( AV31C_GRID_ROWS, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_GRID_ROWS", GetHash( "", String.valueOf(AV31C_GRID_ROWS)));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
      return "A201_WP01_KNGN_PTN_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "権限パターンマスタメンテナンス（一覧）" ;
   }

   public void wb0P0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0P2( true) ;
      }
      else
      {
         wb_table1_2_0P2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "権限パターンマスタメンテナンス（一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0178") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0178", "");
         }
      }
      wbErr = false ;
      strup0P0( ) ;
   }

   public void ws0P2( )
   {
      start0P2( ) ;
      evt0P2( ) ;
   }

   public void evt0P2( )
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
                        /* Execute user event: e110P2 */
                        e110P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120P2 */
                        e120P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130P2 */
                        e130P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EDIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140P2 */
                        e140P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150P2 */
                        e150P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160P2 */
                        e160P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170P2 */
                        e170P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180P2 */
                        e180P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190P2 */
                        e190P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200P2 */
                        e200P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210P2 */
                        e210P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e220P2 */
                        e220P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e230P2 */
                        e230P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e240P2 */
                        e240P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e250P2 */
                        e250P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e260P2 */
                        e260P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e270P2 */
                        e270P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e280P2 */
                        e280P2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_KNGN'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_KNGN'") == 0 ) )
                     {
                        nGXsfl_164_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1642( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                           GX_FocusControl = edtavD_grd_line_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV9D_GRD_LINE = (short)(0) ;
                        }
                        else
                        {
                           AV9D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
                        }
                        A13TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
                        A285TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
                        n285TAM04_AUTH_NM = false ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0178") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0178", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0178") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0178", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e290P2 */
                              e290P2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e300P2 */
                              e300P2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e310P2 */
                              e310P2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e320P2 */
                              e320P2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_KNGN'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e330P2 */
                              e330P2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV15H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_tam04_kngn_ptn_nm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_TAM04_KNGN_PTN_NM"), AV6H_TAM04_KNGN_PTN_NM) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
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
                  else if ( nCmpId == 178 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0178") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0178", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0P2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0P2( ) ;
         }
      }
   }

   public void pa0P2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a201_wp01_kngn_ptn_list")), "a201_wp01_kngn_ptn_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a201_wp01_kngn_ptn_list"))) ;
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
                  AV16P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16P_MOVE_KBN", GXutil.str( AV16P_MOVE_KBN, 1, 0));
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_164 ,
                                 short nGXsfl_164_idx ,
                                 String sGXsfl_164_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1642( ) ;
      while ( nGXsfl_164_idx <= nRC_GXsfl_164 )
      {
         sendrow_1642( ) ;
         nGXsfl_164_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_idx+1)) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1642( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf0P2( ) ;
      /* End function Refresh */
   }

   public void rf0P2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(164) ;
      nGXsfl_164_idx = (short)(1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1642( ) ;
      nGXsfl_164_Refreshing = (short)(1) ;
      /* Execute user event: e300P2 */
      e300P2 ();
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
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
         subsflControlProps_1642( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV6H_TAM04_KNGN_PTN_NM ,
                                              A285TAM04_AUTH_NM ,
                                              AV15H_SRCH_FLG },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV6H_TAM04_KNGN_PTN_NM = GXutil.padr( GXutil.rtrim( AV6H_TAM04_KNGN_PTN_NM), 40, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6H_TAM04_KNGN_PTN_NM", AV6H_TAM04_KNGN_PTN_NM);
         /* Using cursor H000P2 */
         pr_default.execute(0, new Object[] {AV15H_SRCH_FLG, lV6H_TAM04_KNGN_PTN_NM, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_164_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A285TAM04_AUTH_NM = H000P2_A285TAM04_AUTH_NM[0] ;
            n285TAM04_AUTH_NM = H000P2_n285TAM04_AUTH_NM[0] ;
            A13TAM04_AUTH_CD = H000P2_A13TAM04_AUTH_CD[0] ;
            /* Execute user event: e310P2 */
            e310P2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(164) ;
         wb0P0( ) ;
      }
      nGXsfl_164_Refreshing = (short)(0) ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV6H_TAM04_KNGN_PTN_NM ,
                                           A285TAM04_AUTH_NM ,
                                           AV15H_SRCH_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV6H_TAM04_KNGN_PTN_NM = GXutil.padr( GXutil.rtrim( AV6H_TAM04_KNGN_PTN_NM), 40, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6H_TAM04_KNGN_PTN_NM", AV6H_TAM04_KNGN_PTN_NM);
      /* Using cursor H000P3 */
      pr_default.execute(1, new Object[] {AV15H_SRCH_FLG, lV6H_TAM04_KNGN_PTN_NM});
      GRID1_nRecordCount = H000P3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup0P0( )
   {
      /* Before Start, stand alone formulas. */
      AV36Pgmname = "A201_WP01_KNGN_PTN_LIST" ;
      AV35Pgmdesc = "権限パターンマスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e290P2 */
      e290P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV11H_A_PAGING_SDT);
         /* Read variables values. */
         AV5D_TAM04_KNGN_PTN_NM = httpContext.cgiGet( edtavD_tam04_kngn_ptn_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5D_TAM04_KNGN_PTN_NM", AV5D_TAM04_KNGN_PTN_NM);
         AV10D_LINE = httpContext.cgiGet( edtavD_line_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_LINE", AV10D_LINE);
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_ITEM_KBN");
            GX_FocusControl = edtavH_item_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_ITEM_KBN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13H_ITEM_KBN", GXutil.ltrim( GXutil.str( AV13H_ITEM_KBN, 2, 0)));
         }
         else
         {
            AV13H_ITEM_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_item_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13H_ITEM_KBN", GXutil.ltrim( GXutil.str( AV13H_ITEM_KBN, 2, 0)));
         }
         AV15H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
         AV6H_TAM04_KNGN_PTN_NM = httpContext.cgiGet( edtavH_tam04_kngn_ptn_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6H_TAM04_KNGN_PTN_NM", AV6H_TAM04_KNGN_PTN_NM);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_164 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), ".", ",")) ;
         AV16P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0178") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0178", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV15H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_TAM04_KNGN_PTN_NM"), AV6H_TAM04_KNGN_PTN_NM) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e290P2 */
      e290P2 ();
      if (returnInSub) return;
   }

   public void e290P2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "A201" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      AV7C_GAMEN_TITLE = AV35Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      AV31C_GRID_ROWS = (short)(subGrid1_Rows) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31C_GRID_ROWS", GXutil.ltrim( GXutil.str( AV31C_GRID_ROWS, 4, 0)));
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV8C_TAM02_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0178",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e300P2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV36Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_tam04_kngn_ptn_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      AV12H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
   }

   private void e310P2( )
   {
      /* Grid1_Load Routine */
      if ( AV9D_GRD_LINE == 0 )
      {
         AV9D_GRD_LINE = (short)((subgrid1_currentpage( )-1)*AV31C_GRID_ROWS) ;
      }
      AV9D_GRD_LINE = (short)(AV9D_GRD_LINE+1) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(164) ;
      }
      sendrow_1642( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void e110P2( )
   {
      /* 'BTN_REG' Routine */
      AV29W_SESSION.setValue("A201_PAGE", GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a203_wp01_kngn_mst"+GXutil.URLEncode(GXutil.rtrim(A13TAM04_AUTH_CD)) ;
      httpContext.wjLoc = formatLink("a203_wp01_kngn_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e120P2( )
   {
      /* 'BTN_SRCH' Routine */
      AV23W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( ! AV23W_ERRFLG )
      {
         AV15H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
   }

   public void e130P2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   public void e140P2( )
   {
      /* 'BTN_EDIT' Routine */
      if ( subgrid1_recordcount( ) > 0 )
      {
         AV24W_F7FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_F7FLG", AV24W_F7FLG);
         AV9D_GRD_LINE = (short)(0) ;
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00028", "", "", "", "", "", GXv_char2) ;
         a201_wp01_kngn_ptn_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         if ( new a807_pc01_cha_num_check(remoteHandle, context).executeUdp( AV10D_LINE) == 1 )
         {
            /* Start For Each Line in Grid1 */
            nRC_GXsfl_164 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), ".", ",")) ;
            nGXsfl_164_fel_idx = (short)(0) ;
            while ( nGXsfl_164_fel_idx < nRC_GXsfl_164 )
            {
               nGXsfl_164_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_fel_idx+1)) ;
               sGXsfl_164_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_fel_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_fel_1642( ) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                  GX_FocusControl = edtavD_grd_line_Internalname ;
                  wbErr = true ;
                  AV9D_GRD_LINE = (short)(0) ;
               }
               else
               {
                  AV9D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
               }
               A13TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
               A285TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
               n285TAM04_AUTH_NM = false ;
               OldWebcomp1 = httpContext.cgiGet( "W0009") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
               {
                  WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                  WebComp_Webcomp1_Component = OldWebcomp1 ;
                  WebComp_Webcomp1.componentrestorestate("W0009", "");
               }
               OldWebcomp2 = httpContext.cgiGet( "W0178") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
               {
                  WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                  WebComp_Webcomp2_Component = OldWebcomp2 ;
                  WebComp_Webcomp2.componentrestorestate("W0178", "");
               }
               OldWebcomp1 = httpContext.cgiGet( "W0009") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
               {
                  WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                  WebComp_Webcomp1_Component = OldWebcomp1 ;
                  WebComp_Webcomp1.componentrestorestate("W0009", "");
               }
               OldWebcomp2 = httpContext.cgiGet( "W0178") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
               {
                  WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                  WebComp_Webcomp2_Component = OldWebcomp2 ;
                  WebComp_Webcomp2.componentrestorestate("W0178", "");
               }
               if ( AV9D_GRD_LINE == GXutil.val( AV10D_LINE, ".") )
               {
                  AV30W_TAM04_KNGN_PTN_KBN = A13TAM04_AUTH_CD ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30W_TAM04_KNGN_PTN_KBN", AV30W_TAM04_KNGN_PTN_KBN);
                  AV25W_MSG = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* End For Each Line */
            }
            if ( nGXsfl_164_fel_idx == 0 )
            {
               nGXsfl_164_idx = (short)(1) ;
               sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_1642( ) ;
            }
            nGXsfl_164_fel_idx = (short)(1) ;
         }
         if ( (GXutil.strcmp("", AV25W_MSG)==0) )
         {
            AV29W_SESSION.setValue("A201_PAGE", GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "a203_wp01_kngn_mst"+GXutil.URLEncode(GXutil.rtrim(AV30W_TAM04_KNGN_PTN_KBN)) ;
            httpContext.wjLoc = formatLink("a203_wp01_kngn_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV25W_MSG);
            edtavD_line_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_line_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void e320P2( )
   {
      /* 'BTN_SEL' Routine */
      AV29W_SESSION.setValue("A201_PAGE", GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a203_wp01_kngn_mst"+GXutil.URLEncode(GXutil.rtrim(A13TAM04_AUTH_CD)) ;
      httpContext.wjLoc = formatLink("a203_wp01_kngn_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e330P2( )
   {
      /* 'BTN_KNGN' Routine */
      AV29W_SESSION.setValue("A201_PAGE", GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a202_wp01_kngn_ptn_reg"+GXutil.URLEncode(GXutil.rtrim(A13TAM04_AUTH_CD)) ;
      httpContext.wjLoc = formatLink("a202_wp01_kngn_ptn_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV16P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV29W_SESSION.setValue("A201_TAM04_KNGN_PTN_NM", AV5D_TAM04_KNGN_PTN_NM);
      AV29W_SESSION.setValue("A201_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV5D_TAM04_KNGN_PTN_NM = AV29W_SESSION.getValue("A201_TAM04_KNGN_PTN_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5D_TAM04_KNGN_PTN_NM", AV5D_TAM04_KNGN_PTN_NM);
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV29W_SESSION.getValue("A201_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      AV15H_SRCH_FLG = AV29W_SESSION.getValue("A201_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S212( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV29W_SESSION.remove("A201_TAM04_KNGN_PTN_NM");
      AV29W_SESSION.remove("A201_PAGE");
      AV29W_SESSION.remove("A201_SRCH_FLG");
   }

   public void S202( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV6H_TAM04_KNGN_PTN_NM = AV5D_TAM04_KNGN_PTN_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6H_TAM04_KNGN_PTN_NM", AV6H_TAM04_KNGN_PTN_NM);
   }

   public void S182( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
   }

   public void S232( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_line_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a201_wp01_kngn_ptn_list_impl.this.AV22W_ERRCD = GXv_char2[0] ;
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
      AV5D_TAM04_KNGN_PTN_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5D_TAM04_KNGN_PTN_NM", AV5D_TAM04_KNGN_PTN_NM);
      AV6H_TAM04_KNGN_PTN_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6H_TAM04_KNGN_PTN_NM", AV6H_TAM04_KNGN_PTN_NM);
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      AV15H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
      AV24W_F7FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_F7FLG", AV24W_F7FLG);
      AV10D_LINE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_LINE", AV10D_LINE);
      AV18W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18W_A819_JS", AV18W_A819_JS);
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV19W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV19W_A821_JS ;
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

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV14H_KNGN_FLG ;
      GXv_char4[0] = AV22W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV8C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      a201_wp01_kngn_ptn_list_impl.this.AV14H_KNGN_FLG = GXv_char2[0] ;
      a201_wp01_kngn_ptn_list_impl.this.AV22W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S242( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV36Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a201_wp01_kngn_ptn_list");
   }

   public void e150P2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e160P2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      else
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e170P2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e180P2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e190P2( )
   {
      /* 'PAGE01' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e200P2( )
   {
      /* 'PAGE02' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e210P2( )
   {
      /* 'PAGE03' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e220P2( )
   {
      /* 'PAGE04' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e230P2( )
   {
      /* 'PAGE05' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e240P2( )
   {
      /* 'PAGE06' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e250P2( )
   {
      /* 'PAGE07' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e260P2( )
   {
      /* 'PAGE08' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e270P2( )
   {
      /* 'PAGE09' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e280P2( )
   {
      /* 'PAGE10' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT5[0] = AV11H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV11H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_Visible, 5, 0)));
      lblTxt_page01_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      lblTxt_page02_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      lblTxt_page03_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      lblTxt_page04_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      lblTxt_page05_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      lblTxt_page06_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      lblTxt_page07_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      lblTxt_page08_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      lblTxt_page09_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      lblTxt_page10_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV15H_SRCH_FLG, "1") == 0 ) && ! AV23W_ERRFLG )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char4[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            a201_wp01_kngn_ptn_list_impl.this.GXt_char1 = GXv_char4[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S152( )
   {
      /* 'SUB_BTN_EDIT' Routine */
   }

   public void wb_table1_2_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table2_6_0P2( true) ;
      }
      else
      {
         wb_table2_6_0P2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0P2e( boolean wbgen )
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
         wb_table1_2_0P2e( true) ;
      }
      else
      {
         wb_table1_2_0P2e( false) ;
      }
   }

   public void wb_table2_6_0P2( boolean wbgen )
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
         wb_table3_12_0P2( true) ;
      }
      else
      {
         wb_table3_12_0P2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_18_0P2( true) ;
      }
      else
      {
         wb_table4_18_0P2( false) ;
      }
      return  ;
   }

   public void wb_table4_18_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0178"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0178"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0178"+"");
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_181_0P2( true) ;
      }
      else
      {
         wb_table5_181_0P2( false) ;
      }
      return  ;
   }

   public void wb_table5_181_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_6_0P2e( true) ;
      }
      else
      {
         wb_table2_6_0P2e( false) ;
      }
   }

   public void wb_table5_181_0P2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_ITEM_KBN, (byte)(2), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_ITEM_KBN), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_item_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV15H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV15H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_tam04_kngn_ptn_nm_Internalname, GXutil.rtrim( AV6H_TAM04_KNGN_PTN_NM), GXutil.rtrim( localUtil.format( AV6H_TAM04_KNGN_PTN_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_tam04_kngn_ptn_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_181_0P2e( true) ;
      }
      else
      {
         wb_table5_181_0P2e( false) ;
      }
   }

   public void wb_table4_18_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_0P2( true) ;
      }
      else
      {
         wb_table6_21_0P2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_18_0P2e( true) ;
      }
      else
      {
         wb_table4_18_0P2e( false) ;
      }
   }

   public void wb_table6_21_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table7_24_0P2( true) ;
      }
      else
      {
         wb_table7_24_0P2( false) ;
      }
      return  ;
   }

   public void wb_table7_24_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table8_44_0P2( true) ;
      }
      else
      {
         wb_table8_44_0P2( false) ;
      }
      return  ;
   }

   public void wb_table8_44_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table9_136_0P2( true) ;
      }
      else
      {
         wb_table9_136_0P2( false) ;
      }
      return  ;
   }

   public void wb_table9_136_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_149_0P2( true) ;
      }
      else
      {
         wb_table10_149_0P2( false) ;
      }
      return  ;
   }

   public void wb_table10_149_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"164\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
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
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel2_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9D_GRD_LINE, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_line_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13TAM04_AUTH_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A285TAM04_AUTH_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 164 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_164 = (short)(nGXsfl_164_idx-1) ;
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
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
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
         wb_table6_21_0P2e( true) ;
      }
      else
      {
         wb_table6_21_0P2e( false) ;
      }
   }

   public void wb_table10_149_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_152_0P2( true) ;
      }
      else
      {
         wb_table11_152_0P2( false) ;
      }
      return  ;
   }

   public void wb_table11_152_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_149_0P2e( true) ;
      }
      else
      {
         wb_table10_149_0P2e( false) ;
      }
   }

   public void wb_table11_152_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:65px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "行", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "権限パターン区分", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:400px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "権限パターン名", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_152_0P2e( true) ;
      }
      else
      {
         wb_table11_152_0P2e( false) ;
      }
   }

   public void wb_table9_136_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_edit_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_edit_Internalname, tblTbl_edit_Internalname, "", "Table", 0, "right", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, "行番号：", "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_line_Internalname, GXutil.rtrim( AV10D_LINE), GXutil.rtrim( localUtil.format( AV10D_LINE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_line_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavD_line_Backcolor)+";", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, "編集（F7）", "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EDIT\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_136_0P2e( true) ;
      }
      else
      {
         wb_table9_136_0P2e( false) ;
      }
   }

   public void wb_table8_44_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_area_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area_Internalname, tblTbl_page_area_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_50_0P2( true) ;
      }
      else
      {
         wb_table12_50_0P2( false) ;
      }
      return  ;
   }

   public void wb_table12_50_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_44_0P2e( true) ;
      }
      else
      {
         wb_table8_44_0P2e( false) ;
      }
   }

   public void wb_table12_50_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page_Internalname, tblTbl_page_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_53_0P2( true) ;
      }
      else
      {
         wb_table13_53_0P2( false) ;
      }
      return  ;
   }

   public void wb_table13_53_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_59_0P2( true) ;
      }
      else
      {
         wb_table14_59_0P2( false) ;
      }
      return  ;
   }

   public void wb_table14_59_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_65_0P2( true) ;
      }
      else
      {
         wb_table15_65_0P2( false) ;
      }
      return  ;
   }

   public void wb_table15_65_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_71_0P2( true) ;
      }
      else
      {
         wb_table16_71_0P2( false) ;
      }
      return  ;
   }

   public void wb_table16_71_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_77_0P2( true) ;
      }
      else
      {
         wb_table17_77_0P2( false) ;
      }
      return  ;
   }

   public void wb_table17_77_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_83_0P2( true) ;
      }
      else
      {
         wb_table18_83_0P2( false) ;
      }
      return  ;
   }

   public void wb_table18_83_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_89_0P2( true) ;
      }
      else
      {
         wb_table19_89_0P2( false) ;
      }
      return  ;
   }

   public void wb_table19_89_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_95_0P2( true) ;
      }
      else
      {
         wb_table20_95_0P2( false) ;
      }
      return  ;
   }

   public void wb_table20_95_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_101_0P2( true) ;
      }
      else
      {
         wb_table21_101_0P2( false) ;
      }
      return  ;
   }

   public void wb_table21_101_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_107_0P2( true) ;
      }
      else
      {
         wb_table22_107_0P2( false) ;
      }
      return  ;
   }

   public void wb_table22_107_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_113_0P2( true) ;
      }
      else
      {
         wb_table23_113_0P2( false) ;
      }
      return  ;
   }

   public void wb_table23_113_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_119_0P2( true) ;
      }
      else
      {
         wb_table24_119_0P2( false) ;
      }
      return  ;
   }

   public void wb_table24_119_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_125_0P2( true) ;
      }
      else
      {
         wb_table25_125_0P2( false) ;
      }
      return  ;
   }

   public void wb_table25_125_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_131_0P2( true) ;
      }
      else
      {
         wb_table26_131_0P2( false) ;
      }
      return  ;
   }

   public void wb_table26_131_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_50_0P2e( true) ;
      }
      else
      {
         wb_table12_50_0P2e( false) ;
      }
   }

   public void wb_table26_131_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_last_Internalname, tblTbl_last_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:52px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_131_0P2e( true) ;
      }
      else
      {
         wb_table26_131_0P2e( false) ;
      }
   }

   public void wb_table25_125_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_next_Internalname, tblTbl_next_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:42px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_125_0P2e( true) ;
      }
      else
      {
         wb_table25_125_0P2e( false) ;
      }
   }

   public void wb_table24_119_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page10_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page10_Internalname, tblTbl_page10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_119_0P2e( true) ;
      }
      else
      {
         wb_table24_119_0P2e( false) ;
      }
   }

   public void wb_table23_113_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page09_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page09_Internalname, tblTbl_page09_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_113_0P2e( true) ;
      }
      else
      {
         wb_table23_113_0P2e( false) ;
      }
   }

   public void wb_table22_107_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page08_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page08_Internalname, tblTbl_page08_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_107_0P2e( true) ;
      }
      else
      {
         wb_table22_107_0P2e( false) ;
      }
   }

   public void wb_table21_101_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page07_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page07_Internalname, tblTbl_page07_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_101_0P2e( true) ;
      }
      else
      {
         wb_table21_101_0P2e( false) ;
      }
   }

   public void wb_table20_95_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page06_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page06_Internalname, tblTbl_page06_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_95_0P2e( true) ;
      }
      else
      {
         wb_table20_95_0P2e( false) ;
      }
   }

   public void wb_table19_89_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page05_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page05_Internalname, tblTbl_page05_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_89_0P2e( true) ;
      }
      else
      {
         wb_table19_89_0P2e( false) ;
      }
   }

   public void wb_table18_83_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page04_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page04_Internalname, tblTbl_page04_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_83_0P2e( true) ;
      }
      else
      {
         wb_table18_83_0P2e( false) ;
      }
   }

   public void wb_table17_77_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page03_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page03_Internalname, tblTbl_page03_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_77_0P2e( true) ;
      }
      else
      {
         wb_table17_77_0P2e( false) ;
      }
   }

   public void wb_table16_71_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page02_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page02_Internalname, tblTbl_page02_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_71_0P2e( true) ;
      }
      else
      {
         wb_table16_71_0P2e( false) ;
      }
   }

   public void wb_table15_65_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page01_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page01_Internalname, tblTbl_page01_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_65_0P2e( true) ;
      }
      else
      {
         wb_table15_65_0P2e( false) ;
      }
   }

   public void wb_table14_59_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 42, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_back_Internalname, tblTbl_back_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_59_0P2e( true) ;
      }
      else
      {
         wb_table14_59_0P2e( false) ;
      }
   }

   public void wb_table13_53_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 52, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_first_Internalname, tblTbl_first_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_53_0P2e( true) ;
      }
      else
      {
         wb_table13_53_0P2e( false) ;
      }
   }

   public void wb_table7_24_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "権限パターン名", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam04_kngn_ptn_nm_Internalname, GXutil.rtrim( AV5D_TAM04_KNGN_PTN_NM), GXutil.rtrim( localUtil.format( AV5D_TAM04_KNGN_PTN_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam04_kngn_ptn_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"2\" >") ;
         wb_table27_32_0P2( true) ;
      }
      else
      {
         wb_table27_32_0P2( false) ;
      }
      return  ;
   }

   public void wb_table27_32_0P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_0P2e( true) ;
      }
      else
      {
         wb_table7_24_0P2e( false) ;
      }
   }

   public void wb_table27_32_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_32_0P2e( true) ;
      }
      else
      {
         wb_table27_32_0P2e( false) ;
      }
   }

   public void wb_table3_12_0P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable14_Internalname, tblTable14_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_A201_WP01_KNGN_PTN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0P2e( true) ;
      }
      else
      {
         wb_table3_12_0P2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV16P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_MOVE_KBN", GXutil.str( AV16P_MOVE_KBN, 1, 0));
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
      pa0P2( ) ;
      ws0P2( ) ;
      we0P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513223554");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a201_wp01_kngn_ptn_list.js", "?202071513223554");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1642( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_164_idx ;
      lblBtn_sel2_Internalname = "BTN_SEL2_"+sGXsfl_164_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_164_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_164_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_164_idx ;
   }

   public void subsflControlProps_fel_1642( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_164_fel_idx ;
      lblBtn_sel2_Internalname = "BTN_SEL2_"+sGXsfl_164_fel_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_164_fel_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_164_fel_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_164_fel_idx ;
   }

   public void sendrow_1642( )
   {
      subsflControlProps_1642( ) ;
      wb0P0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_164_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
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
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)(((nGXsfl_164_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_164_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_164_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_164_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_164_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_164_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:65px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel2_Internalname,"権限付与","","",lblBtn_sel2_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_KNGN\\'."+sGXsfl_164_idx+"'","","TextBlockBtn060s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 171,'',false,'"+sGXsfl_164_idx+"',164)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_line_Internalname,GXutil.ltrim( localUtil.ntoc( AV9D_GRD_LINE, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_line_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9D_GRD_LINE), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9D_GRD_LINE), "ZZZ9")),TempTags+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(171);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_line_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_line_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(164),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_CD_Internalname,GXutil.rtrim( A13TAM04_AUTH_CD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM04_AUTH_CD_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(164),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_AUTH_CD","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:400px\""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_NM_Internalname,GXutil.rtrim( A285TAM04_AUTH_NM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM04_AUTH_NM_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(164),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_164_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_164_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_idx+1)) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1642( ) ;
      }
      /* End function sendrow_1642 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      tblTable14_Internalname = "TABLE14" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_tam04_kngn_ptn_nm_Internalname = "vD_TAM04_KNGN_PTN_NM" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTxt_rec_cnt_Internalname = "TXT_REC_CNT" ;
      lblTxt_first_Internalname = "TXT_FIRST" ;
      tblTbl_first_Internalname = "TBL_FIRST" ;
      lblTxt_back_Internalname = "TXT_BACK" ;
      tblTbl_back_Internalname = "TBL_BACK" ;
      lblTxt_page01_Internalname = "TXT_PAGE01" ;
      tblTbl_page01_Internalname = "TBL_PAGE01" ;
      lblTxt_page02_Internalname = "TXT_PAGE02" ;
      tblTbl_page02_Internalname = "TBL_PAGE02" ;
      lblTxt_page03_Internalname = "TXT_PAGE03" ;
      tblTbl_page03_Internalname = "TBL_PAGE03" ;
      lblTxt_page04_Internalname = "TXT_PAGE04" ;
      tblTbl_page04_Internalname = "TBL_PAGE04" ;
      lblTxt_page05_Internalname = "TXT_PAGE05" ;
      tblTbl_page05_Internalname = "TBL_PAGE05" ;
      lblTxt_page06_Internalname = "TXT_PAGE06" ;
      tblTbl_page06_Internalname = "TBL_PAGE06" ;
      lblTxt_page07_Internalname = "TXT_PAGE07" ;
      tblTbl_page07_Internalname = "TBL_PAGE07" ;
      lblTxt_page08_Internalname = "TXT_PAGE08" ;
      tblTbl_page08_Internalname = "TBL_PAGE08" ;
      lblTxt_page09_Internalname = "TXT_PAGE09" ;
      tblTbl_page09_Internalname = "TBL_PAGE09" ;
      lblTxt_page10_Internalname = "TXT_PAGE10" ;
      tblTbl_page10_Internalname = "TBL_PAGE10" ;
      lblTxt_next_Internalname = "TXT_NEXT" ;
      tblTbl_next_Internalname = "TBL_NEXT" ;
      lblTxt_last_Internalname = "TXT_LAST" ;
      tblTbl_last_Internalname = "TBL_LAST" ;
      tblTbl_page_Internalname = "TBL_PAGE" ;
      tblTbl_page_area_Internalname = "TBL_PAGE_AREA" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtavD_line_Internalname = "vD_LINE" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      tblTbl_edit_Internalname = "TBL_EDIT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_item_kbn_Internalname = "vH_ITEM_KBN" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_tam04_kngn_ptn_nm_Internalname = "vH_TAM04_KNGN_PTN_NM" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTAM04_AUTH_NM_Jsonclick = "" ;
      edtTAM04_AUTH_CD_Jsonclick = "" ;
      edtavD_grd_line_Jsonclick = "" ;
      edtavD_grd_line_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      edtavD_tam04_kngn_ptn_nm_Jsonclick = "" ;
      edtavD_line_Jsonclick = "" ;
      edtavD_line_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_line_Enabled = 1 ;
      lblBtn_sel2_Caption = "権限付与" ;
      lblBtn_sel_Caption = "選択" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_tam04_kngn_ptn_nm_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_item_kbn_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
      tblTbl_edit_Visible = 1 ;
      tblTbl_grid_header_Visible = 1 ;
      tblTbl_page_area_Visible = 1 ;
      lblTxt_last_Class = "TextBlockPage" ;
      lblTxt_first_Class = "TextBlockPage" ;
      lblTxt_next_Class = "TextBlockPage" ;
      lblTxt_back_Class = "TextBlockPage" ;
      lblTxt_page10_Class = "TextBlockPage" ;
      lblTxt_page09_Class = "TextBlockPage" ;
      lblTxt_page08_Class = "TextBlockPage" ;
      lblTxt_page07_Class = "TextBlockPage" ;
      lblTxt_page06_Class = "TextBlockPage" ;
      lblTxt_page05_Class = "TextBlockPage" ;
      lblTxt_page04_Class = "TextBlockPage" ;
      lblTxt_page03_Class = "TextBlockPage" ;
      lblTxt_page02_Class = "TextBlockPage" ;
      lblTxt_page01_Class = "TextBlockPage" ;
      tblTbl_page_Visible = 1 ;
      tblTbl_page10_Visible = 1 ;
      tblTbl_page09_Visible = 1 ;
      tblTbl_page08_Visible = 1 ;
      tblTbl_page07_Visible = 1 ;
      tblTbl_page06_Visible = 1 ;
      tblTbl_page05_Visible = 1 ;
      tblTbl_page04_Visible = 1 ;
      tblTbl_page03_Visible = 1 ;
      tblTbl_page02_Visible = 1 ;
      tblTbl_page01_Visible = 1 ;
      lblTxt_page10_Caption = "10" ;
      lblTxt_page09_Caption = "9" ;
      lblTxt_page08_Caption = "8" ;
      lblTxt_page07_Caption = "7" ;
      lblTxt_page06_Caption = "6" ;
      lblTxt_page05_Caption = "5" ;
      lblTxt_page04_Caption = "4" ;
      lblTxt_page03_Caption = "3" ;
      lblTxt_page02_Caption = "2" ;
      lblTxt_page01_Caption = "1" ;
      edtavD_line_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      subGrid1_Rows = 10 ;
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
                  /* Execute user subroutine: S242 */
                  S242 ();
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
      AV15H_SRCH_FLG = "" ;
      AV6H_TAM04_KNGN_PTN_NM = "" ;
      AV11H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV36Pgmname = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV19W_A821_JS = "" ;
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
      edtavD_grd_line_Internalname = "" ;
      A13TAM04_AUTH_CD = "" ;
      edtTAM04_AUTH_CD_Internalname = "" ;
      A285TAM04_AUTH_NM = "" ;
      edtTAM04_AUTH_NM_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV6H_TAM04_KNGN_PTN_NM = "" ;
      H000P2_A285TAM04_AUTH_NM = new String[] {""} ;
      H000P2_n285TAM04_AUTH_NM = new boolean[] {false} ;
      H000P2_A13TAM04_AUTH_CD = new String[] {""} ;
      H000P3_AGRID1_nRecordCount = new long[1] ;
      AV35Pgmdesc = "" ;
      AV5D_TAM04_KNGN_PTN_NM = "" ;
      AV10D_LINE = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV29W_SESSION = httpContext.getWebSession();
      AV25W_MSG = "" ;
      AV30W_TAM04_KNGN_PTN_KBN = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      AV18W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTxt_rec_cnt_Jsonclick = "" ;
      lblTxt_last_Jsonclick = "" ;
      lblTxt_next_Jsonclick = "" ;
      lblTxt_page10_Jsonclick = "" ;
      lblTxt_page09_Jsonclick = "" ;
      lblTxt_page08_Jsonclick = "" ;
      lblTxt_page07_Jsonclick = "" ;
      lblTxt_page06_Jsonclick = "" ;
      lblTxt_page05_Jsonclick = "" ;
      lblTxt_page04_Jsonclick = "" ;
      lblTxt_page03_Jsonclick = "" ;
      lblTxt_page02_Jsonclick = "" ;
      lblTxt_page01_Jsonclick = "" ;
      lblTxt_back_Jsonclick = "" ;
      lblTxt_first_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      lblBtn_sel2_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      lblBtn_sel2_Jsonclick = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a201_wp01_kngn_ptn_list__default(),
         new Object[] {
             new Object[] {
            H000P2_A285TAM04_AUTH_NM, H000P2_n285TAM04_AUTH_NM, H000P2_A13TAM04_AUTH_CD
            }
            , new Object[] {
            H000P3_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV36Pgmname = "A201_WP01_KNGN_PTN_LIST" ;
      AV35Pgmdesc = "権限パターンマスタメンテナンス（一覧）" ;
      /* GeneXus formulas. */
      AV36Pgmname = "A201_WP01_KNGN_PTN_LIST" ;
      AV35Pgmdesc = "権限パターンマスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV16P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV16P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV13H_ITEM_KBN ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_line_Backstyle ;
   private short nRC_GXsfl_164 ;
   private short nGXsfl_164_idx=1 ;
   private short AV31C_GRID_ROWS ;
   private short wbEnd ;
   private short wbStart ;
   private short AV9D_GRD_LINE ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_164_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_164_fel_idx=1 ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int edtavD_grd_line_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_line_Backcolor ;
   private int GXActiveErrHndl ;
   private int tblTbl_page01_Visible ;
   private int tblTbl_page02_Visible ;
   private int tblTbl_page03_Visible ;
   private int tblTbl_page04_Visible ;
   private int tblTbl_page05_Visible ;
   private int tblTbl_page06_Visible ;
   private int tblTbl_page07_Visible ;
   private int tblTbl_page08_Visible ;
   private int tblTbl_page09_Visible ;
   private int tblTbl_page10_Visible ;
   private int tblTbl_page_Visible ;
   private int tblTbl_page_area_Visible ;
   private int tblTbl_grid_header_Visible ;
   private int tblTbl_edit_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_line_Visible ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXPagingTo2 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_164_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV36Pgmname ;
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
   private String edtavD_grd_line_Internalname ;
   private String edtTAM04_AUTH_CD_Internalname ;
   private String edtTAM04_AUTH_NM_Internalname ;
   private String GXDecQS ;
   private String scmdbuf ;
   private String AV35Pgmdesc ;
   private String edtavD_tam04_kngn_ptn_nm_Internalname ;
   private String AV10D_LINE ;
   private String edtavD_line_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_item_kbn_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_tam04_kngn_ptn_nm_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String sGXsfl_164_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String lblTxt_page01_Caption ;
   private String lblTxt_page01_Internalname ;
   private String lblTxt_page02_Caption ;
   private String lblTxt_page02_Internalname ;
   private String lblTxt_page03_Caption ;
   private String lblTxt_page03_Internalname ;
   private String lblTxt_page04_Caption ;
   private String lblTxt_page04_Internalname ;
   private String lblTxt_page05_Caption ;
   private String lblTxt_page05_Internalname ;
   private String lblTxt_page06_Caption ;
   private String lblTxt_page06_Internalname ;
   private String lblTxt_page07_Caption ;
   private String lblTxt_page07_Internalname ;
   private String lblTxt_page08_Caption ;
   private String lblTxt_page08_Internalname ;
   private String lblTxt_page09_Caption ;
   private String lblTxt_page09_Internalname ;
   private String lblTxt_page10_Caption ;
   private String lblTxt_page10_Internalname ;
   private String tblTbl_page01_Internalname ;
   private String tblTbl_page02_Internalname ;
   private String tblTbl_page03_Internalname ;
   private String tblTbl_page04_Internalname ;
   private String tblTbl_page05_Internalname ;
   private String tblTbl_page06_Internalname ;
   private String tblTbl_page07_Internalname ;
   private String tblTbl_page08_Internalname ;
   private String tblTbl_page09_Internalname ;
   private String tblTbl_page10_Internalname ;
   private String tblTbl_page_Internalname ;
   private String lblTxt_page01_Class ;
   private String lblTxt_page02_Class ;
   private String lblTxt_page03_Class ;
   private String lblTxt_page04_Class ;
   private String lblTxt_page05_Class ;
   private String lblTxt_page06_Class ;
   private String lblTxt_page07_Class ;
   private String lblTxt_page08_Class ;
   private String lblTxt_page09_Class ;
   private String lblTxt_page10_Class ;
   private String lblTxt_back_Class ;
   private String lblTxt_back_Internalname ;
   private String lblTxt_next_Class ;
   private String lblTxt_next_Internalname ;
   private String lblTxt_first_Class ;
   private String lblTxt_first_Internalname ;
   private String lblTxt_last_Class ;
   private String lblTxt_last_Internalname ;
   private String tblTbl_page_area_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String tblTbl_edit_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_item_kbn_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_tam04_kngn_ptn_nm_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String lblBtn_sel2_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtavD_line_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String lblTxt_rec_cnt_Jsonclick ;
   private String tblTbl_last_Internalname ;
   private String lblTxt_last_Jsonclick ;
   private String tblTbl_next_Internalname ;
   private String lblTxt_next_Jsonclick ;
   private String lblTxt_page10_Jsonclick ;
   private String lblTxt_page09_Jsonclick ;
   private String lblTxt_page08_Jsonclick ;
   private String lblTxt_page07_Jsonclick ;
   private String lblTxt_page06_Jsonclick ;
   private String lblTxt_page05_Jsonclick ;
   private String lblTxt_page04_Jsonclick ;
   private String lblTxt_page03_Jsonclick ;
   private String lblTxt_page02_Jsonclick ;
   private String lblTxt_page01_Jsonclick ;
   private String tblTbl_back_Internalname ;
   private String lblTxt_back_Jsonclick ;
   private String tblTbl_first_Internalname ;
   private String lblTxt_first_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_tam04_kngn_ptn_nm_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable14_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String lblBtn_sel2_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String lblBtn_sel2_Jsonclick ;
   private String ROClassString ;
   private String edtavD_grd_line_Jsonclick ;
   private String edtTAM04_AUTH_CD_Jsonclick ;
   private String edtTAM04_AUTH_NM_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean returnInSub ;
   private boolean AV24W_F7FLG ;
   private String AV15H_SRCH_FLG ;
   private String AV6H_TAM04_KNGN_PTN_NM ;
   private String AV8C_TAM02_APP_ID ;
   private String AV19W_A821_JS ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String lV6H_TAM04_KNGN_PTN_NM ;
   private String AV5D_TAM04_KNGN_PTN_NM ;
   private String AV12H_INIT_FLG ;
   private String AV14H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String AV25W_MSG ;
   private String AV30W_TAM04_KNGN_PTN_KBN ;
   private String AV22W_ERRCD ;
   private String AV18W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private IDataStoreProvider pr_default ;
   private String[] H000P2_A285TAM04_AUTH_NM ;
   private boolean[] H000P2_n285TAM04_AUTH_NM ;
   private String[] H000P2_A13TAM04_AUTH_CD ;
   private long[] H000P3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.WebSession AV29W_SESSION ;
   private SdtA_PAGING_SDT AV11H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class a201_wp01_kngn_ptn_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6H_TAM04_KNGN_PTN_NM ,
                                          String A285TAM04_AUTH_NM ,
                                          String AV15H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [4] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " `TAM04_AUTH_NM`, `TAM04_AUTH_CD`" ;
      sFromString = " FROM `TAM04_KNGN`" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV6H_TAM04_KNGN_PTN_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TAM04_AUTH_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY `TAM04_AUTH_CD`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_H000P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6H_TAM04_KNGN_PTN_NM ,
                                          String A285TAM04_AUTH_NM ,
                                          String AV15H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [2] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TAM04_KNGN`" ;
      scmdbuf = scmdbuf + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV6H_TAM04_KNGN_PTN_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TAM04_AUTH_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H000P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
            case 1 :
                  return conditional_H000P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 40);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[2], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 40);
               }
               return;
      }
   }

}

