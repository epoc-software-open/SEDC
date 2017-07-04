/*
               File: a208_wp01_domain_list_impl
        Description: ドメインマスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:10.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a208_wp01_domain_list_impl extends GXWebPanel
{
   public a208_wp01_domain_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a208_wp01_domain_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a208_wp01_domain_list_impl.class ));
   }

   public a208_wp01_domain_list_impl( int remoteHandle ,
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
            nRC_GXsfl_177 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_177_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_177_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_177, nGXsfl_177_idx, sGXsfl_177_idx) ;
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
            AV20P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20P_MOVE_KBN", GXutil.str( AV20P_MOVE_KBN, 1, 0));
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
         pa1T2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1T2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1T2( ) ;
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
      httpContext.writeValue( "ドメインマスタメンテナンス（一覧）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731720113");
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
      GXEncryptionTmp = "a208_wp01_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a208_wp01_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1T2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV19H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_CD", GXutil.rtrim( AV15H_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_JNM", GXutil.rtrim( AV16H_DOM_JNM));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV14H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV14H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_177", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_177, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV6C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV6C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV20P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV23W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV25W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "vC_GRID_ROWS", GXutil.ltrim( localUtil.ntoc( AV32C_GRID_ROWS, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_GRID_ROWS", GetHash( "", String.valueOf(AV32C_GRID_ROWS)));
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DEL_FLG", GXutil.rtrim( A615TBM02_DEL_FLG));
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
      return "A208_WP01_DOMAIN_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "ドメインマスタメンテナンス（一覧）" ;
   }

   public void wb1T0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1T2( true) ;
      }
      else
      {
         wb_table1_2_1T2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_199_1T2( true) ;
      }
      else
      {
         wb_table2_199_1T2( false) ;
      }
      return  ;
   }

   public void wb_table2_199_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ドメインマスタメンテナンス（一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0197") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0197", "");
         }
      }
      wbErr = false ;
      strup1T0( ) ;
   }

   public void ws1T2( )
   {
      start1T2( ) ;
      evt1T2( ) ;
   }

   public void evt1T2( )
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
                        /* Execute user event: e111T2 */
                        e111T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121T2 */
                        e121T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131T2 */
                        e131T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141T2 */
                        e141T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EDIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151T2 */
                        e151T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT_DOMAIN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161T2 */
                        e161T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171T2 */
                        e171T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181T2 */
                        e181T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191T2 */
                        e191T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201T2 */
                        e201T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211T2 */
                        e211T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221T2 */
                        e221T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231T2 */
                        e231T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241T2 */
                        e241T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251T2 */
                        e251T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261T2 */
                        e261T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271T2 */
                        e271T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281T2 */
                        e281T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291T2 */
                        e291T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301T2 */
                        e301T2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'BTN_CDISC_ITEM'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'BTN_CDISC_ITEM'") == 0 ) )
                     {
                        nGXsfl_177_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_177_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1772( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                           GX_FocusControl = edtavD_grd_line_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV10D_GRD_LINE = (short)(0) ;
                        }
                        else
                        {
                           AV10D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
                        }
                        A49TBM02_DOM_CD = httpContext.cgiGet( edtTBM02_DOM_CD_Internalname) ;
                        A611TBM02_DOM_JNM = httpContext.cgiGet( edtTBM02_DOM_JNM_Internalname) ;
                        n611TBM02_DOM_JNM = false ;
                        A614TBM02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM02_ORDER_Internalname), ".", ",")) ;
                        n614TBM02_ORDER = false ;
                        AV9D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0197") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0197", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0197") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0197", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311T2 */
                              e311T2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e321T2 */
                              e321T2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e331T2 */
                              e331T2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e341T2 */
                              e341T2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_CDISC_ITEM'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e351T2 */
                              e351T2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV19H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_cd Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV15H_DOM_CD) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_jnm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_JNM"), AV16H_DOM_JNM) != 0 )
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
                  else if ( nCmpId == 197 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0197") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0197", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1T2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1T2( ) ;
         }
      }
   }

   public void pa1T2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a208_wp01_domain_list")), "a208_wp01_domain_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a208_wp01_domain_list"))) ;
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
                  AV20P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV20P_MOVE_KBN", GXutil.str( AV20P_MOVE_KBN, 1, 0));
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_177 ,
                                 short nGXsfl_177_idx ,
                                 String sGXsfl_177_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1772( ) ;
      while ( nGXsfl_177_idx <= nRC_GXsfl_177 )
      {
         sendrow_1772( ) ;
         nGXsfl_177_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_177_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_177_idx+1)) ;
         sGXsfl_177_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1772( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1T2( ) ;
      /* End function Refresh */
   }

   public void rf1T2( )
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
      wbStart = (short)(177) ;
      nGXsfl_177_idx = (short)(1) ;
      sGXsfl_177_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1772( ) ;
      nGXsfl_177_Refreshing = (short)(1) ;
      /* Execute user event: e321T2 */
      e321T2 ();
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
         subsflControlProps_1772( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV15H_DOM_CD ,
                                              AV16H_DOM_JNM ,
                                              A49TBM02_DOM_CD ,
                                              A611TBM02_DOM_JNM ,
                                              AV19H_SRCH_FLG },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV15H_DOM_CD = GXutil.padr( GXutil.rtrim( AV15H_DOM_CD), 2, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
         lV16H_DOM_JNM = GXutil.padr( GXutil.rtrim( AV16H_DOM_JNM), 50, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
         /* Using cursor H001T2 */
         pr_default.execute(0, new Object[] {AV19H_SRCH_FLG, lV15H_DOM_CD, lV16H_DOM_JNM, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_177_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A615TBM02_DEL_FLG = H001T2_A615TBM02_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
            n615TBM02_DEL_FLG = H001T2_n615TBM02_DEL_FLG[0] ;
            A614TBM02_ORDER = H001T2_A614TBM02_ORDER[0] ;
            n614TBM02_ORDER = H001T2_n614TBM02_ORDER[0] ;
            A611TBM02_DOM_JNM = H001T2_A611TBM02_DOM_JNM[0] ;
            n611TBM02_DOM_JNM = H001T2_n611TBM02_DOM_JNM[0] ;
            A49TBM02_DOM_CD = H001T2_A49TBM02_DOM_CD[0] ;
            /* Execute user event: e331T2 */
            e331T2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(177) ;
         wb1T0( ) ;
      }
      nGXsfl_177_Refreshing = (short)(0) ;
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
                                           AV15H_DOM_CD ,
                                           AV16H_DOM_JNM ,
                                           A49TBM02_DOM_CD ,
                                           A611TBM02_DOM_JNM ,
                                           AV19H_SRCH_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV15H_DOM_CD = GXutil.padr( GXutil.rtrim( AV15H_DOM_CD), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
      lV16H_DOM_JNM = GXutil.padr( GXutil.rtrim( AV16H_DOM_JNM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
      /* Using cursor H001T3 */
      pr_default.execute(1, new Object[] {AV19H_SRCH_FLG, lV15H_DOM_CD, lV16H_DOM_JNM});
      GRID1_nRecordCount = H001T3_AGRID1_nRecordCount[0] ;
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

   public void strup1T0( )
   {
      /* Before Start, stand alone formulas. */
      AV37Pgmname = "A208_WP01_DOMAIN_LIST" ;
      AV36Pgmdesc = "ドメインマスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e311T2 */
      e311T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV14H_A_PAGING_SDT);
         /* Read variables values. */
         AV7D_DOM_CD = httpContext.cgiGet( edtavD_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV8D_DOM_JNM = httpContext.cgiGet( edtavD_dom_jnm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_DOM_JNM", AV8D_DOM_JNM);
         AV13D_LINE = httpContext.cgiGet( edtavD_line_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_LINE", AV13D_LINE);
         AV17H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
         AV19H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
         AV15H_DOM_CD = httpContext.cgiGet( edtavH_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
         AV16H_DOM_JNM = httpContext.cgiGet( edtavH_dom_jnm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
         AV18H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_GXsfl_177 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_177"), ".", ",")) ;
         AV20P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0197") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0197", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV19H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV15H_DOM_CD) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_JNM"), AV16H_DOM_JNM) != 0 )
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
      /* Execute user event: e311T2 */
      e311T2 ();
      if (returnInSub) return;
   }

   public void e311T2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "A208" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      AV5C_GAMEN_TITLE = AV36Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_GAMEN_TITLE", AV5C_GAMEN_TITLE);
      AV32C_GRID_ROWS = (short)(subGrid1_Rows) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32C_GRID_ROWS", GXutil.ltrim( GXutil.str( AV32C_GRID_ROWS, 4, 0)));
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV17H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV21W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0197",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e321T2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV17H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_dom_cd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      AV17H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
   }

   private void e331T2( )
   {
      /* Grid1_Load Routine */
      if ( AV10D_GRD_LINE == 0 )
      {
         AV10D_GRD_LINE = (short)((subgrid1_currentpage( )-1)*AV32C_GRID_ROWS) ;
      }
      AV10D_GRD_LINE = (short)(AV10D_GRD_LINE+1) ;
      if ( GXutil.strcmp(A615TBM02_DEL_FLG, "0") == 0 )
      {
         AV9D_GRD_DEL = "利用可能" ;
      }
      else if ( GXutil.strcmp(A615TBM02_DEL_FLG, "1") == 0 )
      {
         AV9D_GRD_DEL = "利用不可" ;
      }
      else
      {
         AV9D_GRD_DEL = "" ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(177) ;
      }
      sendrow_1772( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void e111T2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV18H_KNGN_FLG, "") )
      {
         AV29W_SESSION.setValue("A208_PAGE", GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a209_wp01_domain_mst"+GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a209_wp01_domain_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121T2( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV28W_RTN_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "aa208_pc01_domain_mst_csv"+GXutil.URLEncode(GXutil.rtrim(AV15H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16H_DOM_JNM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV28W_RTN_MSG)) ;
         httpContext.wjLoc = formatLink("aa208_pc01_domain_mst_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(0) ;
         if ( ! (GXutil.strcmp("", AV28W_RTN_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV28W_RTN_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV28W_RTN_MSG);
      }
   }

   public void e131T2( )
   {
      /* 'BTN_SRCH' Routine */
      AV25W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRFLG", AV25W_ERRFLG);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( ! AV25W_ERRFLG )
      {
         AV19H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
   }

   public void e141T2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void e151T2( )
   {
      /* 'BTN_EDIT' Routine */
      if ( subgrid1_recordcount( ) > 0 )
      {
         AV26W_F7FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_F7FLG", AV26W_F7FLG);
         AV10D_GRD_LINE = (short)(0) ;
         GXt_char1 = AV27W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00028", "", "", "", "", "", GXv_char2) ;
         a208_wp01_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
         if ( new a807_pc01_cha_num_check(remoteHandle, context).executeUdp( AV13D_LINE) == 1 )
         {
            /* Start For Each Line in Grid1 */
            nRC_GXsfl_177 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_177"), ".", ",")) ;
            nGXsfl_177_fel_idx = (short)(0) ;
            while ( nGXsfl_177_fel_idx < nRC_GXsfl_177 )
            {
               nGXsfl_177_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_177_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_177_fel_idx+1)) ;
               sGXsfl_177_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_fel_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_fel_1772( ) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                  GX_FocusControl = edtavD_grd_line_Internalname ;
                  wbErr = true ;
                  AV10D_GRD_LINE = (short)(0) ;
               }
               else
               {
                  AV10D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
               }
               A49TBM02_DOM_CD = httpContext.cgiGet( edtTBM02_DOM_CD_Internalname) ;
               A611TBM02_DOM_JNM = httpContext.cgiGet( edtTBM02_DOM_JNM_Internalname) ;
               n611TBM02_DOM_JNM = false ;
               A614TBM02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM02_ORDER_Internalname), ".", ",")) ;
               n614TBM02_ORDER = false ;
               AV9D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
               OldWebcomp1 = httpContext.cgiGet( "W0009") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
               {
                  WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                  WebComp_Webcomp1_Component = OldWebcomp1 ;
                  WebComp_Webcomp1.componentrestorestate("W0009", "");
               }
               OldWebcomp2 = httpContext.cgiGet( "W0197") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
               {
                  WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                  WebComp_Webcomp2_Component = OldWebcomp2 ;
                  WebComp_Webcomp2.componentrestorestate("W0197", "");
               }
               OldWebcomp1 = httpContext.cgiGet( "W0009") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
               {
                  WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                  WebComp_Webcomp1_Component = OldWebcomp1 ;
                  WebComp_Webcomp1.componentrestorestate("W0009", "");
               }
               OldWebcomp2 = httpContext.cgiGet( "W0197") ;
               if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
               {
                  WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                  WebComp_Webcomp2_Component = OldWebcomp2 ;
                  WebComp_Webcomp2.componentrestorestate("W0197", "");
               }
               if ( AV10D_GRD_LINE == GXutil.val( AV13D_LINE, ".") )
               {
                  AV31W_DOM_CD = A49TBM02_DOM_CD ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31W_DOM_CD", AV31W_DOM_CD);
                  AV27W_MSG = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* End For Each Line */
            }
            if ( nGXsfl_177_fel_idx == 0 )
            {
               nGXsfl_177_idx = (short)(1) ;
               sGXsfl_177_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_1772( ) ;
            }
            nGXsfl_177_fel_idx = (short)(1) ;
         }
         if ( (GXutil.strcmp("", AV27W_MSG)==0) )
         {
            AV29W_SESSION.setValue("A208_PAGE", GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "a209_wp01_domain_mst"+GXutil.URLEncode(GXutil.rtrim(AV31W_DOM_CD)) ;
            httpContext.wjLoc = formatLink("a209_wp01_domain_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV27W_MSG);
            edtavD_line_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_line_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void e161T2( )
   {
      /* 'BTN_IMPORT_DOMAIN' Routine */
      AV29W_SESSION.setValue("A208_PAGE", GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      httpContext.wjLoc = formatLink("a210_wp01_import_domain")  ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e341T2( )
   {
      /* 'BTN_SEL' Routine */
      AV29W_SESSION.setValue("A208_PAGE", GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a209_wp01_domain_mst"+GXutil.URLEncode(GXutil.rtrim(A49TBM02_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a209_wp01_domain_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e351T2( )
   {
      /* 'BTN_CDISC_ITEM' Routine */
      AV29W_SESSION.setValue("A208_PAGE", GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a212_wp01_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A49TBM02_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV20P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
      }
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
   }

   public void S212( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV29W_SESSION.setValue("A208_DOM_CD", AV7D_DOM_CD);
      AV29W_SESSION.setValue("A208_DOM_NM", AV8D_DOM_JNM);
      AV29W_SESSION.setValue("A208_SRCH_FLG", AV19H_SRCH_FLG);
   }

   public void S242( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV7D_DOM_CD = AV29W_SESSION.getValue("A208_DOM_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV8D_DOM_JNM = AV29W_SESSION.getValue("A208_DOM_JNM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DOM_JNM", AV8D_DOM_JNM);
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV29W_SESSION.getValue("A208_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      AV19H_SRCH_FLG = AV29W_SESSION.getValue("A208_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
   }

   public void S232( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV29W_SESSION.remove("A208_DOM_CD");
      AV29W_SESSION.remove("A208_DOM_NM");
      AV29W_SESSION.remove("A208_PAGE");
      AV29W_SESSION.remove("A208_SRCH_FLG");
   }

   public void S222( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV15H_DOM_CD = AV7D_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
      AV16H_DOM_JNM = AV8D_DOM_JNM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
   }

   public void S202( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
   }

   public void S252( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_line_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
   }

   public void S192( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV39GXLvl431 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl431", GXutil.str( AV39GXLvl431, 1, 0));
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV15H_DOM_CD ,
                                           AV16H_DOM_JNM ,
                                           A49TBM02_DOM_CD ,
                                           A611TBM02_DOM_JNM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV15H_DOM_CD = GXutil.padr( GXutil.rtrim( AV15H_DOM_CD), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
      lV16H_DOM_JNM = GXutil.padr( GXutil.rtrim( AV16H_DOM_JNM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
      /* Using cursor H001T4 */
      pr_default.execute(2, new Object[] {lV15H_DOM_CD, lV16H_DOM_JNM});
      if ( Gx_err != 0 )
      {
         AV39GXLvl431 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl431", GXutil.str( AV39GXLvl431, 1, 0));
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A611TBM02_DOM_JNM = H001T4_A611TBM02_DOM_JNM[0] ;
         n611TBM02_DOM_JNM = H001T4_n611TBM02_DOM_JNM[0] ;
         A49TBM02_DOM_CD = H001T4_A49TBM02_DOM_CD[0] ;
         AV39GXLvl431 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl431", GXutil.str( AV39GXLvl431, 1, 0));
         AV28W_RTN_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_RTN_MSG", AV28W_RTN_MSG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV39GXLvl431 == 0 )
      {
         GXt_char1 = AV28W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         a208_wp01_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28W_RTN_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_RTN_MSG", AV28W_RTN_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV21W_A_LOGIN_SDT;
      GXv_char2[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV21W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a208_wp01_domain_list_impl.this.AV24W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRCD", AV24W_ERRCD);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
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
      AV7D_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV8D_DOM_JNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DOM_JNM", AV8D_DOM_JNM);
      AV15H_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_DOM_CD", AV15H_DOM_CD);
      AV16H_DOM_JNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_JNM", AV16H_DOM_JNM);
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      AV19H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
      AV22W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_A819_JS", AV22W_A819_JS);
      AV26W_F7FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_F7FLG", AV26W_F7FLG);
      AV13D_LINE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13D_LINE", AV13D_LINE);
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
   }

   public void S172( )
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
      if ( ! (GXutil.strcmp("", AV23W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV23W_A821_JS ;
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
      GXv_char2[0] = AV18H_KNGN_FLG ;
      GXv_char4[0] = AV24W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      a208_wp01_domain_list_impl.this.AV18H_KNGN_FLG = GXv_char2[0] ;
      a208_wp01_domain_list_impl.this.AV24W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRCD", AV24W_ERRCD);
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S262( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a208_wp01_domain_list");
   }

   public void e171T2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181T2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      else
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e191T2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e201T2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e211T2( )
   {
      /* 'PAGE01' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221T2( )
   {
      /* 'PAGE02' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231T2( )
   {
      /* 'PAGE03' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241T2( )
   {
      /* 'PAGE04' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251T2( )
   {
      /* 'PAGE05' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261T2( )
   {
      /* 'PAGE06' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271T2( )
   {
      /* 'PAGE07' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281T2( )
   {
      /* 'PAGE08' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291T2( )
   {
      /* 'PAGE09' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e301T2( )
   {
      /* 'PAGE10' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT5[0] = AV14H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV14H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV19H_SRCH_FLG, "1") == 0 ) && ! AV25W_ERRFLG )
         {
            GXt_char1 = AV27W_MSG ;
            GXv_char4[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            a208_wp01_domain_list_impl.this.GXt_char1 = GXv_char4[0] ;
            AV27W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27W_MSG", AV27W_MSG);
            httpContext.GX_msglist.addItem(AV27W_MSG);
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

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_reg2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV18H_KNGN_FLG, "", GXv_boolean7) ;
      a208_wp01_domain_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean6 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
      {
         lblTxt_btn_reg2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      }
   }

   public void wb_table2_199_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV17H_INIT_FLG), GXutil.rtrim( localUtil.format( AV17H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV19H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV19H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_cd_Internalname, GXutil.rtrim( AV15H_DOM_CD), GXutil.rtrim( localUtil.format( AV15H_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_jnm_Internalname, GXutil.rtrim( AV16H_DOM_JNM), GXutil.rtrim( localUtil.format( AV16H_DOM_JNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_jnm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV18H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV18H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(207);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         wb_table3_208_1T2( true) ;
      }
      else
      {
         wb_table3_208_1T2( false) ;
      }
      return  ;
   }

   public void wb_table3_208_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_199_1T2e( true) ;
      }
      else
      {
         wb_table2_199_1T2e( false) ;
      }
   }

   public void wb_table3_208_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:21px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_208_1T2e( true) ;
      }
      else
      {
         wb_table3_208_1T2e( false) ;
      }
   }

   public void wb_table1_2_1T2( boolean wbgen )
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
         wb_table4_6_1T2( true) ;
      }
      else
      {
         wb_table4_6_1T2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1T2e( boolean wbgen )
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
         wb_table1_2_1T2e( true) ;
      }
      else
      {
         wb_table1_2_1T2e( false) ;
      }
   }

   public void wb_table4_6_1T2( boolean wbgen )
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
         wb_table5_12_1T2( true) ;
      }
      else
      {
         wb_table5_12_1T2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table6_25_1T2( true) ;
      }
      else
      {
         wb_table6_25_1T2( false) ;
      }
      return  ;
   }

   public void wb_table6_25_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0197"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0197"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0197"+"");
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
         wb_table4_6_1T2e( true) ;
      }
      else
      {
         wb_table4_6_1T2e( false) ;
      }
   }

   public void wb_table6_25_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_28_1T2( true) ;
      }
      else
      {
         wb_table7_28_1T2( false) ;
      }
      return  ;
   }

   public void wb_table7_28_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_25_1T2e( true) ;
      }
      else
      {
         wb_table6_25_1T2e( false) ;
      }
   }

   public void wb_table7_28_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_31_1T2( true) ;
      }
      else
      {
         wb_table8_31_1T2( false) ;
      }
      return  ;
   }

   public void wb_table8_31_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_53_1T2( true) ;
      }
      else
      {
         wb_table9_53_1T2( false) ;
      }
      return  ;
   }

   public void wb_table9_53_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table10_145_1T2( true) ;
      }
      else
      {
         wb_table10_145_1T2( false) ;
      }
      return  ;
   }

   public void wb_table10_145_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table11_158_1T2( true) ;
      }
      else
      {
         wb_table11_158_1T2( false) ;
      }
      return  ;
   }

   public void wb_table11_158_1T2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"177\">") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10D_GRD_LINE, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_line_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A49TBM02_DOM_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A611TBM02_DOM_JNM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV9D_GRD_DEL));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_del_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_cdisc_item_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 177 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_177 = (short)(nGXsfl_177_idx-1) ;
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_28_1T2e( true) ;
      }
      else
      {
         wb_table7_28_1T2e( false) ;
      }
   }

   public void wb_table11_158_1T2( boolean wbgen )
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
         wb_table12_161_1T2( true) ;
      }
      else
      {
         wb_table12_161_1T2( false) ;
      }
      return  ;
   }

   public void wb_table12_161_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_158_1T2e( true) ;
      }
      else
      {
         wb_table11_158_1T2e( false) ;
      }
   }

   public void wb_table12_161_1T2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "行", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:85px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "ドメインコード", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:370px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ドメイン名", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "表示順", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "削除フラグ", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:90px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_161_1T2e( true) ;
      }
      else
      {
         wb_table12_161_1T2e( false) ;
      }
   }

   public void wb_table10_145_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "行番号：", "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_line_Internalname, GXutil.rtrim( AV13D_LINE), GXutil.rtrim( localUtil.format( AV13D_LINE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_line_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavD_line_Backcolor)+";", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "編集（F7）", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EDIT\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_145_1T2e( true) ;
      }
      else
      {
         wb_table10_145_1T2e( false) ;
      }
   }

   public void wb_table9_53_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_59_1T2( true) ;
      }
      else
      {
         wb_table13_59_1T2( false) ;
      }
      return  ;
   }

   public void wb_table13_59_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_53_1T2e( true) ;
      }
      else
      {
         wb_table9_53_1T2e( false) ;
      }
   }

   public void wb_table13_59_1T2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"width:9px\">") ;
         wb_table14_62_1T2( true) ;
      }
      else
      {
         wb_table14_62_1T2( false) ;
      }
      return  ;
   }

   public void wb_table14_62_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table15_68_1T2( true) ;
      }
      else
      {
         wb_table15_68_1T2( false) ;
      }
      return  ;
   }

   public void wb_table15_68_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_74_1T2( true) ;
      }
      else
      {
         wb_table16_74_1T2( false) ;
      }
      return  ;
   }

   public void wb_table16_74_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_80_1T2( true) ;
      }
      else
      {
         wb_table17_80_1T2( false) ;
      }
      return  ;
   }

   public void wb_table17_80_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_86_1T2( true) ;
      }
      else
      {
         wb_table18_86_1T2( false) ;
      }
      return  ;
   }

   public void wb_table18_86_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_92_1T2( true) ;
      }
      else
      {
         wb_table19_92_1T2( false) ;
      }
      return  ;
   }

   public void wb_table19_92_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_98_1T2( true) ;
      }
      else
      {
         wb_table20_98_1T2( false) ;
      }
      return  ;
   }

   public void wb_table20_98_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_104_1T2( true) ;
      }
      else
      {
         wb_table21_104_1T2( false) ;
      }
      return  ;
   }

   public void wb_table21_104_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_110_1T2( true) ;
      }
      else
      {
         wb_table22_110_1T2( false) ;
      }
      return  ;
   }

   public void wb_table22_110_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_116_1T2( true) ;
      }
      else
      {
         wb_table23_116_1T2( false) ;
      }
      return  ;
   }

   public void wb_table23_116_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_122_1T2( true) ;
      }
      else
      {
         wb_table24_122_1T2( false) ;
      }
      return  ;
   }

   public void wb_table24_122_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_128_1T2( true) ;
      }
      else
      {
         wb_table25_128_1T2( false) ;
      }
      return  ;
   }

   public void wb_table25_128_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_134_1T2( true) ;
      }
      else
      {
         wb_table26_134_1T2( false) ;
      }
      return  ;
   }

   public void wb_table26_134_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_140_1T2( true) ;
      }
      else
      {
         wb_table27_140_1T2( false) ;
      }
      return  ;
   }

   public void wb_table27_140_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_59_1T2e( true) ;
      }
      else
      {
         wb_table13_59_1T2e( false) ;
      }
   }

   public void wb_table27_140_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_140_1T2e( true) ;
      }
      else
      {
         wb_table27_140_1T2e( false) ;
      }
   }

   public void wb_table26_134_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_next_Internalname, tblTbl_next_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_134_1T2e( true) ;
      }
      else
      {
         wb_table26_134_1T2e( false) ;
      }
   }

   public void wb_table25_128_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page10_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page10_Internalname, tblTbl_page10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_128_1T2e( true) ;
      }
      else
      {
         wb_table25_128_1T2e( false) ;
      }
   }

   public void wb_table24_122_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page09_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page09_Internalname, tblTbl_page09_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_122_1T2e( true) ;
      }
      else
      {
         wb_table24_122_1T2e( false) ;
      }
   }

   public void wb_table23_116_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page08_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page08_Internalname, tblTbl_page08_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_116_1T2e( true) ;
      }
      else
      {
         wb_table23_116_1T2e( false) ;
      }
   }

   public void wb_table22_110_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page07_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page07_Internalname, tblTbl_page07_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_110_1T2e( true) ;
      }
      else
      {
         wb_table22_110_1T2e( false) ;
      }
   }

   public void wb_table21_104_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page06_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page06_Internalname, tblTbl_page06_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_104_1T2e( true) ;
      }
      else
      {
         wb_table21_104_1T2e( false) ;
      }
   }

   public void wb_table20_98_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page05_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page05_Internalname, tblTbl_page05_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_98_1T2e( true) ;
      }
      else
      {
         wb_table20_98_1T2e( false) ;
      }
   }

   public void wb_table19_92_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page04_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page04_Internalname, tblTbl_page04_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_92_1T2e( true) ;
      }
      else
      {
         wb_table19_92_1T2e( false) ;
      }
   }

   public void wb_table18_86_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page03_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page03_Internalname, tblTbl_page03_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_86_1T2e( true) ;
      }
      else
      {
         wb_table18_86_1T2e( false) ;
      }
   }

   public void wb_table17_80_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page02_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page02_Internalname, tblTbl_page02_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_80_1T2e( true) ;
      }
      else
      {
         wb_table17_80_1T2e( false) ;
      }
   }

   public void wb_table16_74_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page01_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page01_Internalname, tblTbl_page01_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_74_1T2e( true) ;
      }
      else
      {
         wb_table16_74_1T2e( false) ;
      }
   }

   public void wb_table15_68_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_back_Internalname, tblTbl_back_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_68_1T2e( true) ;
      }
      else
      {
         wb_table15_68_1T2e( false) ;
      }
   }

   public void wb_table14_62_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_62_1T2e( true) ;
      }
      else
      {
         wb_table14_62_1T2e( false) ;
      }
   }

   public void wb_table8_31_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:85px\">") ;
         httpContext.writeText( "ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_cd_Internalname, GXutil.rtrim( AV7D_DOM_CD), GXutil.rtrim( localUtil.format( AV7D_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:70px\">") ;
         httpContext.writeText( "ドメイン名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:390px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_177_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_jnm_Internalname, GXutil.rtrim( AV8D_DOM_JNM), GXutil.rtrim( localUtil.format( AV8D_DOM_JNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_dom_jnm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"4\" >") ;
         wb_table28_41_1T2( true) ;
      }
      else
      {
         wb_table28_41_1T2( false) ;
      }
      return  ;
   }

   public void wb_table28_41_1T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_31_1T2e( true) ;
      }
      else
      {
         wb_table8_31_1T2e( false) ;
      }
   }

   public void wb_table28_41_1T2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_41_1T2e( true) ;
      }
      else
      {
         wb_table28_41_1T2e( false) ;
      }
   }

   public void wb_table5_12_1T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "新規（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "CSV出力（F4）", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV\\'."+"'", "", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "ドメイン取込（F8）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_IMPORT_DOMAIN\\'."+"'", "", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_A208_WP01_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1T2e( true) ;
      }
      else
      {
         wb_table5_12_1T2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV20P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_MOVE_KBN", GXutil.str( AV20P_MOVE_KBN, 1, 0));
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
      pa1T2( ) ;
      ws1T2( ) ;
      we1T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317201575");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a208_wp01_domain_list.js", "?20177317201575");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1772( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_177_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_177_idx ;
      edtTBM02_DOM_CD_Internalname = "TBM02_DOM_CD_"+sGXsfl_177_idx ;
      edtTBM02_DOM_JNM_Internalname = "TBM02_DOM_JNM_"+sGXsfl_177_idx ;
      edtTBM02_ORDER_Internalname = "TBM02_ORDER_"+sGXsfl_177_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_177_idx ;
      lblBtn_cdisc_item_Internalname = "BTN_CDISC_ITEM_"+sGXsfl_177_idx ;
   }

   public void subsflControlProps_fel_1772( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_177_fel_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_177_fel_idx ;
      edtTBM02_DOM_CD_Internalname = "TBM02_DOM_CD_"+sGXsfl_177_fel_idx ;
      edtTBM02_DOM_JNM_Internalname = "TBM02_DOM_JNM_"+sGXsfl_177_fel_idx ;
      edtTBM02_ORDER_Internalname = "TBM02_ORDER_"+sGXsfl_177_fel_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_177_fel_idx ;
      lblBtn_cdisc_item_Internalname = "BTN_CDISC_ITEM_"+sGXsfl_177_fel_idx ;
   }

   public void sendrow_1772( )
   {
      subsflControlProps_1772( ) ;
      wb1T0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_177_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_177_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_177_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_177_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_177_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_177_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_177_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 182,'',false,'"+sGXsfl_177_idx+"',177)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_line_Internalname,GXutil.ltrim( localUtil.ntoc( AV10D_GRD_LINE, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_line_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10D_GRD_LINE), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10D_GRD_LINE), "ZZZ9")),TempTags+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(182);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_line_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_line_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(177),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:85px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM02_DOM_CD_Internalname,GXutil.rtrim( A49TBM02_DOM_CD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM02_DOM_CD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(177),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_DOM_CD","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:370px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM02_DOM_JNM_Internalname,GXutil.rtrim( A611TBM02_DOM_JNM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM02_DOM_JNM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(177),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         ROClassString = "AttributeNum" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM02_ORDER_Internalname,GXutil.ltrim( localUtil.ntoc( A614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A614TBM02_ORDER), "ZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM02_ORDER_Jsonclick,new Integer(0),"AttributeNum","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(177),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 190,'',false,'"+sGXsfl_177_idx+"',177)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV9D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(190);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_del_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(177),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:90px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_cdisc_item_Internalname,"変数一覧","","",lblBtn_cdisc_item_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_CDISC_ITEM\\'."+sGXsfl_177_idx+"'","","TextBlockBtn060s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
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
               if ( ((int)((nGXsfl_177_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_177_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_177_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_177_idx+1)) ;
         sGXsfl_177_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_177_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1772( ) ;
      }
      /* End function sendrow_1772 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTable8_Internalname = "TABLE8" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      edtavD_dom_cd_Internalname = "vD_DOM_CD" ;
      edtavD_dom_jnm_Internalname = "vD_DOM_JNM" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable5_Internalname = "TABLE5" ;
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
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavD_line_Internalname = "vD_LINE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      tblTbl_edit_Internalname = "TBL_EDIT" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_dom_cd_Internalname = "vH_DOM_CD" ;
      edtavH_dom_jnm_Internalname = "vH_DOM_JNM" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      tblTable7_Internalname = "TABLE7" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_del_Jsonclick = "" ;
      edtavD_grd_del_Visible = 1 ;
      edtTBM02_ORDER_Jsonclick = "" ;
      edtTBM02_DOM_JNM_Jsonclick = "" ;
      edtTBM02_DOM_CD_Jsonclick = "" ;
      edtavD_grd_line_Jsonclick = "" ;
      edtavD_grd_line_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_dom_jnm_Jsonclick = "" ;
      edtavD_dom_cd_Jsonclick = "" ;
      edtavD_line_Jsonclick = "" ;
      edtavD_line_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblBtn_cdisc_item_Caption = "変数一覧" ;
      edtavD_grd_del_Enabled = 1 ;
      edtavD_grd_line_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_dom_jnm_Jsonclick = "" ;
      edtavH_dom_cd_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
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
                  /* Execute user subroutine: S262 */
                  S262 ();
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
      AV19H_SRCH_FLG = "" ;
      AV15H_DOM_CD = "" ;
      AV16H_DOM_JNM = "" ;
      AV14H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV37Pgmname = "" ;
      AV6C_TAM02_APP_ID = "" ;
      AV23W_A821_JS = "" ;
      A615TBM02_DEL_FLG = "" ;
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
      A49TBM02_DOM_CD = "" ;
      edtTBM02_DOM_CD_Internalname = "" ;
      A611TBM02_DOM_JNM = "" ;
      edtTBM02_DOM_JNM_Internalname = "" ;
      edtTBM02_ORDER_Internalname = "" ;
      AV9D_GRD_DEL = "" ;
      edtavD_grd_del_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV15H_DOM_CD = "" ;
      lV16H_DOM_JNM = "" ;
      H001T2_A615TBM02_DEL_FLG = new String[] {""} ;
      H001T2_n615TBM02_DEL_FLG = new boolean[] {false} ;
      H001T2_A614TBM02_ORDER = new int[1] ;
      H001T2_n614TBM02_ORDER = new boolean[] {false} ;
      H001T2_A611TBM02_DOM_JNM = new String[] {""} ;
      H001T2_n611TBM02_DOM_JNM = new boolean[] {false} ;
      H001T2_A49TBM02_DOM_CD = new String[] {""} ;
      H001T3_AGRID1_nRecordCount = new long[1] ;
      AV36Pgmdesc = "" ;
      AV7D_DOM_CD = "" ;
      AV8D_DOM_JNM = "" ;
      AV13D_LINE = "" ;
      AV17H_INIT_FLG = "" ;
      AV18H_KNGN_FLG = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV21W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV29W_SESSION = httpContext.getWebSession();
      AV28W_RTN_MSG = "" ;
      AV27W_MSG = "" ;
      AV31W_DOM_CD = "" ;
      H001T4_A611TBM02_DOM_JNM = new String[] {""} ;
      H001T4_n611TBM02_DOM_JNM = new boolean[] {false} ;
      H001T4_A49TBM02_DOM_CD = new String[] {""} ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV22W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXv_boolean7 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock35_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
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
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      lblBtn_cdisc_item_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      lblBtn_cdisc_item_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a208_wp01_domain_list__default(),
         new Object[] {
             new Object[] {
            H001T2_A615TBM02_DEL_FLG, H001T2_n615TBM02_DEL_FLG, H001T2_A614TBM02_ORDER, H001T2_n614TBM02_ORDER, H001T2_A611TBM02_DOM_JNM, H001T2_n611TBM02_DOM_JNM, H001T2_A49TBM02_DOM_CD
            }
            , new Object[] {
            H001T3_AGRID1_nRecordCount
            }
            , new Object[] {
            H001T4_A611TBM02_DOM_JNM, H001T4_n611TBM02_DOM_JNM, H001T4_A49TBM02_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV37Pgmname = "A208_WP01_DOMAIN_LIST" ;
      AV36Pgmdesc = "ドメインマスタメンテナンス（一覧）" ;
      /* GeneXus formulas. */
      AV37Pgmname = "A208_WP01_DOMAIN_LIST" ;
      AV36Pgmdesc = "ドメインマスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV20P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV39GXLvl431 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_line_Backstyle ;
   private short nRC_GXsfl_177 ;
   private short nGXsfl_177_idx=1 ;
   private short AV32C_GRID_ROWS ;
   private short wbEnd ;
   private short wbStart ;
   private short AV10D_GRD_LINE ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_177_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_177_fel_idx=1 ;
   private int subGrid1_Rows ;
   private int A614TBM02_ORDER ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int edtavD_grd_line_Enabled ;
   private int edtavD_grd_del_Enabled ;
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
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_line_Visible ;
   private int edtavD_grd_del_Visible ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXPagingTo2 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_177_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV37Pgmname ;
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
   private String edtTBM02_DOM_CD_Internalname ;
   private String edtTBM02_DOM_JNM_Internalname ;
   private String edtTBM02_ORDER_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String scmdbuf ;
   private String AV36Pgmdesc ;
   private String edtavD_dom_cd_Internalname ;
   private String edtavD_dom_jnm_Internalname ;
   private String AV13D_LINE ;
   private String edtavD_line_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_dom_cd_Internalname ;
   private String edtavH_dom_jnm_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String sGXsfl_177_fel_idx="0001" ;
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
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_dom_cd_Jsonclick ;
   private String edtavH_dom_jnm_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String lblBtn_cdisc_item_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavD_line_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
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
   private String tblTable5_Internalname ;
   private String edtavD_dom_cd_Jsonclick ;
   private String edtavD_dom_jnm_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String lblBtn_cdisc_item_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtavD_grd_line_Jsonclick ;
   private String edtTBM02_DOM_CD_Jsonclick ;
   private String edtTBM02_DOM_JNM_Jsonclick ;
   private String edtTBM02_ORDER_Jsonclick ;
   private String edtavD_grd_del_Jsonclick ;
   private String lblBtn_cdisc_item_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n614TBM02_ORDER ;
   private boolean n615TBM02_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV26W_F7FLG ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String AV19H_SRCH_FLG ;
   private String AV15H_DOM_CD ;
   private String AV16H_DOM_JNM ;
   private String AV6C_TAM02_APP_ID ;
   private String AV23W_A821_JS ;
   private String A615TBM02_DEL_FLG ;
   private String A49TBM02_DOM_CD ;
   private String A611TBM02_DOM_JNM ;
   private String AV9D_GRD_DEL ;
   private String lV15H_DOM_CD ;
   private String lV16H_DOM_JNM ;
   private String AV7D_DOM_CD ;
   private String AV8D_DOM_JNM ;
   private String AV17H_INIT_FLG ;
   private String AV18H_KNGN_FLG ;
   private String AV5C_GAMEN_TITLE ;
   private String AV28W_RTN_MSG ;
   private String AV27W_MSG ;
   private String AV31W_DOM_CD ;
   private String AV24W_ERRCD ;
   private String AV22W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private IDataStoreProvider pr_default ;
   private String[] H001T2_A615TBM02_DEL_FLG ;
   private boolean[] H001T2_n615TBM02_DEL_FLG ;
   private int[] H001T2_A614TBM02_ORDER ;
   private boolean[] H001T2_n614TBM02_ORDER ;
   private String[] H001T2_A611TBM02_DOM_JNM ;
   private boolean[] H001T2_n611TBM02_DOM_JNM ;
   private String[] H001T2_A49TBM02_DOM_CD ;
   private long[] H001T3_AGRID1_nRecordCount ;
   private String[] H001T4_A611TBM02_DOM_JNM ;
   private boolean[] H001T4_n611TBM02_DOM_JNM ;
   private String[] H001T4_A49TBM02_DOM_CD ;
   private com.genexus.webpanels.WebSession AV29W_SESSION ;
   private SdtA_PAGING_SDT AV14H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV21W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class a208_wp01_domain_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15H_DOM_CD ,
                                          String AV16H_DOM_JNM ,
                                          String A49TBM02_DOM_CD ,
                                          String A611TBM02_DOM_JNM ,
                                          String AV19H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [5] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " `TBM02_DEL_FLG`, `TBM02_ORDER`, `TBM02_DOM_JNM`, `TBM02_DOM_CD`" ;
      sFromString = " FROM `TBM02_CDISC_DOMAIN`" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV15H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_DOM_JNM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM02_DOM_JNM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY `TBM02_DOM_CD`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H001T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15H_DOM_CD ,
                                          String AV16H_DOM_JNM ,
                                          String A49TBM02_DOM_CD ,
                                          String A611TBM02_DOM_JNM ,
                                          String AV19H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int10 ;
      GXv_int10 = new byte [3] ;
      Object[] GXv_Object11 ;
      GXv_Object11 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TBM02_CDISC_DOMAIN`" ;
      scmdbuf = scmdbuf + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV15H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_DOM_JNM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM02_DOM_JNM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H001T4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15H_DOM_CD ,
                                          String AV16H_DOM_JNM ,
                                          String A49TBM02_DOM_CD ,
                                          String A611TBM02_DOM_JNM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int12 ;
      GXv_int12 = new byte [2] ;
      Object[] GXv_Object13 ;
      GXv_Object13 = new Object [2] ;
      scmdbuf = "SELECT `TBM02_DOM_JNM`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN`" ;
      if ( ! (GXutil.strcmp("", AV15H_DOM_CD)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM02_DOM_CD` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_DOM_JNM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM02_DOM_JNM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM02_DOM_JNM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM02_DOM_CD`" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_H001T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 1 :
                  return conditional_H001T3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 2 :
                  return conditional_H001T4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001T4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
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
                  stmt.setVarchar(sIdx, (String)parms[5], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 50);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[2], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 50);
               }
               return;
      }
   }

}

