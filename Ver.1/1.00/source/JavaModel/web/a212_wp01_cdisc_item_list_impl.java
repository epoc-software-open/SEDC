/*
               File: a212_wp01_cdisc_item_list_impl
        Description: ドメイン変数マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:33.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a212_wp01_cdisc_item_list_impl extends GXWebPanel
{
   public a212_wp01_cdisc_item_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a212_wp01_cdisc_item_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a212_wp01_cdisc_item_list_impl.class ));
   }

   public a212_wp01_cdisc_item_list_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_dom_cd = new HTMLChoice();
      cmbavD_sort = new HTMLChoice();
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
            nGXsfl_193_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_193_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_193_idx, sGXsfl_193_idx) ;
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
            AV26P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV27P_MOVE_KBN_2 = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
               AV25P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
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
         pa1S2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1S2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1S2( ) ;
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
      httpContext.writeText( "ドメイン変数マスタメンテナンス（一覧）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV27P_MOVE_KBN_2,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1S2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV26P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN_2", GXutil.ltrim( localUtil.ntoc( AV27P_MOVE_KBN_2, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV25P_DOM_CD));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_A212_SD01_LIST_C", AV44SD_A212_SD01_LIST_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_A212_SD01_LIST_C", AV44SD_A212_SD01_LIST_C);
      }
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(3), (byte)(0), ".", "")));
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

   public void wb1S0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1S2( true) ;
      }
      else
      {
         wb_table1_2_1S2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_217_1S2( true) ;
      }
      else
      {
         wb_table2_217_1S2( false) ;
      }
      return  ;
   }

   public void wb_table2_217_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ドメイン変数マスタメンテナンス（一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0215") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0215", "");
         }
      }
      wbErr = false ;
      strup1S0( ) ;
   }

   public void ws1S2( )
   {
      start1S2( ) ;
      evt1S2( ) ;
   }

   public void evt1S2( )
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
               /* Check if conditions changed and reset current page numbers */
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
                        /* Execute user event: e111S2 */
                        e111S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121S2 */
                        e121S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131S2 */
                        e131S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141S2 */
                        e141S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EDIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151S2 */
                        e151S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT_CDISC_ITEM'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161S2 */
                        e161S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DOMAIN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171S2 */
                        e171S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181S2 */
                        e181S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191S2 */
                        e191S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201S2 */
                        e201S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211S2 */
                        e211S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221S2 */
                        e221S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231S2 */
                        e231S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241S2 */
                        e241S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251S2 */
                        e251S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261S2 */
                        e261S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271S2 */
                        e271S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281S2 */
                        e281S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291S2 */
                        e291S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301S2 */
                        e301S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311S2 */
                        e311S2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) )
                     {
                        nGXsfl_193_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_193_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_193_idx, 4, 0)), (short)(4), "0") ;
                        lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
                        edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
                        edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
                        edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
                        edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
                        edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
                        edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
                        edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                           GX_FocusControl = edtavD_grd_line_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV11D_GRD_LINE = (short)(0) ;
                        }
                        else
                        {
                           AV11D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
                        }
                        AV39D_GRD_DOM_CD = httpContext.cgiGet( edtavD_grd_dom_cd_Internalname) ;
                        AV40D_GRD_DOM_VAR_NM = httpContext.cgiGet( edtavD_grd_dom_var_nm_Internalname) ;
                        AV41D_GRD_VAR_DESC = httpContext.cgiGet( edtavD_grd_var_desc_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",") > 99999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_ORDER");
                           GX_FocusControl = edtavD_grd_order_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV42D_GRD_ORDER = 0 ;
                        }
                        else
                        {
                           AV42D_GRD_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",")) ;
                        }
                        AV43D_GRD_VERSION = httpContext.cgiGet( edtavD_grd_version_Internalname) ;
                        AV10D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0215") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0215", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0215") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0215", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e321S2 */
                              e321S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e331S2 */
                              e331S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e341S2 */
                              e341S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e351S2 */
                              e351S2 ();
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
                  else if ( nCmpId == 215 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0215") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0215", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1S2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1S2( ) ;
         }
      }
   }

   public void pa1S2( )
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
                  AV26P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV27P_MOVE_KBN_2 = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
                     AV25P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
                  }
               }
            }
         }
         cmbavD_dom_cd.setName( "vD_DOM_CD" );
         cmbavD_dom_cd.setWebtags( "" );
         if ( ( cmbavD_dom_cd.getItemCount() > 0 ) && (GXutil.strcmp("", AV7D_DOM_CD)==0) )
         {
            AV7D_DOM_CD = cmbavD_dom_cd.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         }
         cmbavD_sort.setName( "vD_SORT" );
         cmbavD_sort.setWebtags( "" );
         cmbavD_sort.addItem("", " ", (short)(0));
         cmbavD_sort.addItem("1", "Version（昇順）", (short)(0));
         cmbavD_sort.addItem("2", "Version（降順）", (short)(0));
         cmbavD_sort.addItem("3", "ドメインコード＋表示順", (short)(0));
         if ( ( cmbavD_sort.getItemCount() > 0 ) && (GXutil.strcmp("", AV15D_SORT)==0) )
         {
            AV15D_SORT = cmbavD_sort.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15D_SORT", AV15D_SORT);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_193_idx ,
                                 String sGXsfl_193_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
      edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
      edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
      edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
      edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
      edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
      while ( nGXsfl_193_idx <= nRC_Grid1 )
      {
         sendrow_1932( ) ;
         nGXsfl_193_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_193_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_193_idx+1)) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_193_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
         edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
         edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
         edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
         edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
         edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
         edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1S2( ) ;
      /* End function Refresh */
   }

   public void rf1S2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(193) ;
      nGXsfl_193_idx = (short)(1) ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_193_idx, 4, 0)), (short)(4), "0") ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
      edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
      edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
      edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
      edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
      edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
      /* Execute user event: e331S2 */
      e331S2 ();
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
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
         edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
         edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
         edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
         edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
         edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
         edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
         /* Execute user event: e341S2 */
         e341S2 ();
         wbEnd = (short)(193) ;
         wb1S0( ) ;
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
      if ( 10 > 0 )
      {
         if ( 1 > 0 )
         {
            return 10*1 ;
         }
         else
         {
            return 10 ;
         }
      }
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      return (short)(3) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (int)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup1S0( )
   {
      /* Before Start, stand alone formulas. */
      AV51Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV50Pgmdesc = "ドメイン変数マスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_dom_cd_Enabled = 0 ;
      edtavD_grd_dom_var_nm_Enabled = 0 ;
      edtavD_grd_var_desc_Enabled = 0 ;
      edtavD_grd_order_Enabled = 0 ;
      edtavD_grd_version_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e321S2 */
      e321S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV17H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_dom_cd.setName( cmbavD_dom_cd.getInternalname() );
         cmbavD_dom_cd.setValue( httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) );
         AV7D_DOM_CD = httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV9D_DOM_VAR_NM = httpContext.cgiGet( edtavD_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
         AV16D_VAR_DESC = httpContext.cgiGet( edtavD_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
         cmbavD_sort.setName( cmbavD_sort.getInternalname() );
         cmbavD_sort.setValue( httpContext.cgiGet( cmbavD_sort.getInternalname()) );
         AV15D_SORT = httpContext.cgiGet( cmbavD_sort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_SORT", AV15D_SORT);
         AV14D_LINE = httpContext.cgiGet( edtavD_line_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_LINE", AV14D_LINE);
         AV20H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         AV23H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
         AV21H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         AV18H_DOM_CD = httpContext.cgiGet( edtavH_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
         AV19H_DOM_VAR_NM = httpContext.cgiGet( edtavH_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
         AV24H_VAR_DESC = httpContext.cgiGet( edtavH_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
         AV22H_SORT = httpContext.cgiGet( edtavH_sort_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SORT", AV22H_SORT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV26P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV27P_MOVE_KBN_2 = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN_2"), ".", ",")) ;
         AV25P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0215") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0215", "");
         }
         subGrid1_Rows = (short)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
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
      /* Execute user event: e321S2 */
      e321S2 ();
      if (returnInSub) return;
   }

   public void e321S2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "A212" ;
      AV5C_GAMEN_TITLE = AV50Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV20H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV28W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0215",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
   }

   public void e331S2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV20H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV51Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV20H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   private void e341S2( )
   {
      /* Grid1_Load Routine */
      AV52GXV2 = 1 ;
      while ( AV52GXV2 <= AV44SD_A212_SD01_LIST_C.size() )
      {
         AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)((SdtA212_SD01_LIST_A212_SD01_LISTItem)AV44SD_A212_SD01_LIST_C.elementAt(-1+AV52GXV2));
         AV11D_GRD_LINE = (short)(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no()) ;
         AV39D_GRD_DOM_CD = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd() ;
         AV40D_GRD_DOM_VAR_NM = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm() ;
         AV41D_GRD_VAR_DESC = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc() ;
         AV42D_GRD_ORDER = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order() ;
         AV43D_GRD_VERSION = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version() ;
         if ( GXutil.strcmp(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg(), "0") == 0 )
         {
            AV10D_GRD_DEL = "利用可能" ;
         }
         else if ( GXutil.strcmp(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg(), "1") == 0 )
         {
            AV10D_GRD_DEL = "利用不可" ;
         }
         else
         {
            AV10D_GRD_DEL = "" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(193) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1932( ) ;
            GRID1_nEOF = (byte)(1) ;
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)(GRID1_nCurrentRecord) % (subgrid1_recordsperpage( ))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
         }
         GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
         AV52GXV2 = (int)(AV52GXV2+1) ;
      }
   }

   public void e111S2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV21H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121S2( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV37W_RTN_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19H_DOM_VAR_NM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV24H_VAR_DESC)) + "," + GXutil.URLEncode(GXutil.rtrim(AV37W_RTN_MSG)) ;
         httpContext.wjLoc = formatLink("aa212_pc01_cdisc_item_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         if ( ! (GXutil.strcmp("", AV37W_RTN_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV37W_RTN_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV37W_RTN_MSG);
      }
   }

   public void e131S2( )
   {
      /* 'BTN_SRCH' Routine */
      AV34W_ERRFLG = false ;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( ! AV34W_ERRFLG )
      {
         AV23H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
   }

   public void e141S2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e151S2( )
   {
      /* 'BTN_EDIT' Routine */
      if ( AV44SD_A212_SD01_LIST_C.size() > 0 )
      {
         GXt_char2 = AV36W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00028", "", "", "", "", "", GXv_char3) ;
         a212_wp01_cdisc_item_list_impl.this.GXt_char2 = GXv_char3[0] ;
         AV36W_MSG = GXt_char2 ;
         if ( new a807_pc01_cha_num_check(remoteHandle, context).executeUdp( AV14D_LINE) == 1 )
         {
            AV53GXV3 = 1 ;
            while ( AV53GXV3 <= AV44SD_A212_SD01_LIST_C.size() )
            {
               AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)((SdtA212_SD01_LIST_A212_SD01_LISTItem)AV44SD_A212_SD01_LIST_C.elementAt(-1+AV53GXV3));
               if ( AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no() == GXutil.val( AV14D_LINE, ".") )
               {
                  AV31W_DOM_CD = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd() ;
                  AV32W_DOM_VAR_NM = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm() ;
                  AV36W_MSG = "" ;
                  if (true) break;
               }
               AV53GXV3 = (int)(AV53GXV3+1) ;
            }
         }
         if ( (GXutil.strcmp("", AV36W_MSG)==0) )
         {
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV31W_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV32W_DOM_VAR_NM)) ;
            httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV36W_MSG);
            edtavD_line_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_line_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void e161S2( )
   {
      /* 'BTN_IMPORT_CDISC_ITEM' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a211_wp01_import_cdisc_item") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e171S2( )
   {
      /* 'BTN_DOMAIN' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a208_wp01_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e351S2( )
   {
      /* 'BTN_SEL' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV39D_GRD_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV40D_GRD_DOM_VAR_NM)) ;
      httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV26P_MOVE_KBN == 0 )
      {
         GX_FocusControl = cmbavD_dom_cd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         if ( AV27P_MOVE_KBN_2 == 1 )
         {
            /* Execute user subroutine: S282 */
            S282 ();
            if (returnInSub) return;
            /* Execute user subroutine: S232 */
            S232 ();
            if (returnInSub) return;
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
         }
         else
         {
            /* Execute user subroutine: S262 */
            S262 ();
            if (returnInSub) return;
            /* Execute user subroutine: S252 */
            S252 ();
            if (returnInSub) return;
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
            /* Execute user subroutine: S122 */
            S122 ();
            if (returnInSub) return;
         }
      }
      else
      {
         GX_FocusControl = edtavD_dom_var_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
         AV7D_DOM_CD = AV25P_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
   }

   public void S162( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_dom_cd.removeAllItems();
      cmbavD_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H001S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A518TBM02_DOM_JNM = H001S2_A518TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518TBM02_DOM_JNM", A518TBM02_DOM_JNM);
         n518TBM02_DOM_JNM = H001S2_n518TBM02_DOM_JNM[0] ;
         A516TBM02_DOM_CD = H001S2_A516TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516TBM02_DOM_CD", A516TBM02_DOM_CD);
         cmbavD_dom_cd.addItem(A516TBM02_DOM_CD, A516TBM02_DOM_CD+":"+A518TBM02_DOM_JNM, (short)(0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV38W_SESSION.setValue("A212_DOM_CD", AV18H_DOM_CD);
      AV38W_SESSION.setValue("A212_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV38W_SESSION.setValue("A212_DOM_VAR_DESC", AV24H_VAR_DESC);
      AV38W_SESSION.setValue("A212_SORT", AV22H_SORT);
      AV38W_SESSION.setValue("A212_PAGE", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      AV38W_SESSION.setValue("A212_SRCH_FLG", AV23H_SRCH_FLG);
   }

   public void S282( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV7D_DOM_CD = AV38W_SESSION.getValue("A212_DOM_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = AV38W_SESSION.getValue("A212_DOM_VAR_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV16D_VAR_DESC = AV38W_SESSION.getValue("A212_DOM_VAR_DESC") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
      AV15D_SORT = AV38W_SESSION.getValue("A212_SORT") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15D_SORT", AV15D_SORT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV38W_SESSION.getValue("A212_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV23H_SRCH_FLG = AV38W_SESSION.getValue("A212_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
   }

   public void S252( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV38W_SESSION.remove("A212_DOM_CD");
      AV38W_SESSION.remove("A212_DOM_VAR_NM");
      AV38W_SESSION.remove("A212_DOM_VAR_DESC");
      AV38W_SESSION.remove("A212_SORT");
      AV38W_SESSION.remove("A212_PAGE");
      AV38W_SESSION.remove("A212_SRCH_FLG");
   }

   public void S272( )
   {
      /* 'SUB_SDT_SAVE' Routine */
      AV38W_SESSION.setValue("A212_SD01_LIST", AV44SD_A212_SD01_LIST_C.toxml(false, "A212_SD01_LIST", "SmartEDC_SHIZUOKA"));
   }

   public void S132( )
   {
      /* 'SUB_SDT_GET' Routine */
      AV44SD_A212_SD01_LIST_C.fromxml(AV38W_SESSION.getValue("A212_SD01_LIST"), "");
   }

   public void S262( )
   {
      /* 'SUB_SDT_REMOVE' Routine */
      AV38W_SESSION.remove("A212_SD01_LIST");
   }

   public void S232( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV18H_DOM_CD = AV7D_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      AV19H_DOM_VAR_NM = AV9D_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV24H_VAR_DESC = AV16D_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      AV22H_SORT = AV15D_SORT ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SORT", AV22H_SORT);
   }

   public void S222( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void S242( )
   {
      /* 'SUB_DATA_GET' Routine */
      AV44SD_A212_SD01_LIST_C.clear();
      AV46W_CNT = 0 ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV18H_DOM_CD ,
                                           AV19H_DOM_VAR_NM ,
                                           AV24H_VAR_DESC ,
                                           A162TBM03_DOM_CD ,
                                           A163TBM03_DOM_VAR_NM ,
                                           A164TBM03_VAR_DESC ,
                                           AV22H_SORT ,
                                           AV23H_SRCH_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV18H_DOM_CD = GXutil.padr( GXutil.rtrim( AV18H_DOM_CD), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      lV19H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV19H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      lV24H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV24H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      /* Using cursor H001S3 */
      pr_default.execute(1, new Object[] {AV23H_SRCH_FLG, lV18H_DOM_CD, lV19H_DOM_VAR_NM, lV24H_VAR_DESC});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A164TBM03_VAR_DESC = H001S3_A164TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
         n164TBM03_VAR_DESC = H001S3_n164TBM03_VAR_DESC[0] ;
         A163TBM03_DOM_VAR_NM = H001S3_A163TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
         A162TBM03_DOM_CD = H001S3_A162TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         A178TBM03_DEL_FLG = H001S3_A178TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
         n178TBM03_DEL_FLG = H001S3_n178TBM03_DEL_FLG[0] ;
         A169TBM03_ORDER = H001S3_A169TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
         n169TBM03_ORDER = H001S3_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = H001S3_A885TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
         n885TBM03_VERSION = H001S3_n885TBM03_VERSION[0] ;
         AV46W_CNT = (long)(AV46W_CNT+1) ;
         AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)new SdtA212_SD01_LIST_A212_SD01_LISTItem(remoteHandle, context);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no( AV46W_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd( A162TBM03_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm( A163TBM03_DOM_VAR_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc( A164TBM03_VAR_DESC );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order( A169TBM03_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version( A885TBM03_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg( A178TBM03_DEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV44SD_A212_SD01_LIST_C.add(AV45SD_A212_SD01_LIST_I, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void S292( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_line_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
   }

   public void S212( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV56GXLvl559 = (byte)(0) ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV18H_DOM_CD ,
                                           AV19H_DOM_VAR_NM ,
                                           AV24H_VAR_DESC ,
                                           A162TBM03_DOM_CD ,
                                           A163TBM03_DOM_VAR_NM ,
                                           A164TBM03_VAR_DESC },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV18H_DOM_CD = GXutil.padr( GXutil.rtrim( AV18H_DOM_CD), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      lV19H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV19H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      lV24H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV24H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      /* Using cursor H001S4 */
      pr_default.execute(2, new Object[] {lV18H_DOM_CD, lV19H_DOM_VAR_NM, lV24H_VAR_DESC});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A164TBM03_VAR_DESC = H001S4_A164TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
         n164TBM03_VAR_DESC = H001S4_n164TBM03_VAR_DESC[0] ;
         A163TBM03_DOM_VAR_NM = H001S4_A163TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
         A162TBM03_DOM_CD = H001S4_A162TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         AV56GXLvl559 = (byte)(1) ;
         AV37W_RTN_MSG = "" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV56GXLvl559 == 0 )
      {
         GXt_char2 = AV37W_RTN_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char3) ;
         a212_wp01_cdisc_item_list_impl.this.GXt_char2 = GXv_char3[0] ;
         AV37W_RTN_MSG = GXt_char2 ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV28W_A_LOGIN_SDT;
      GXv_char3[0] = AV33W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV28W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      a212_wp01_cdisc_item_list_impl.this.AV33W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV33W_ERRCD, "0") != 0 )
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
      AV44SD_A212_SD01_LIST_C.clear();
      AV7D_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV16D_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
      AV15D_SORT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15D_SORT", AV15D_SORT);
      AV18H_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      AV19H_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV24H_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      AV22H_SORT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SORT", AV22H_SORT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV23H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
      AV29W_A819_JS = "" ;
      AV35W_F7FLG = false ;
      AV14D_LINE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_LINE", AV14D_LINE);
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void S182( )
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
      if ( ! (GXutil.strcmp("", AV30W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV30W_A821_JS ;
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

   public void S142( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char3[0] = AV21H_KNGN_FLG ;
      GXv_char5[0] = AV33W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char3, GXv_char5) ;
      a212_wp01_cdisc_item_list_impl.this.AV21H_KNGN_FLG = GXv_char3[0] ;
      a212_wp01_cdisc_item_list_impl.this.AV33W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      if ( GXutil.strcmp(AV33W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S30700( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV51Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a212_wp01_cdisc_item_list");
   }

   public void e181S2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191S2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201S2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e211S2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e221S2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231S2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241S2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251S2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261S2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271S2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281S2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291S2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e301S2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e311S2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV44SD_A212_SD01_LIST_C.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT6[0] = AV17H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT6) ;
      AV17H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT6[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( AV44SD_A212_SD01_LIST_C.size() <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV23H_SRCH_FLG, "1") == 0 ) && ! AV34W_ERRFLG )
         {
            GXt_char2 = AV36W_MSG ;
            GXv_char5[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char5) ;
            a212_wp01_cdisc_item_list_impl.this.GXt_char2 = GXv_char5[0] ;
            AV36W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV36W_MSG);
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
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( AV44SD_A212_SD01_LIST_C.size(), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S172( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_reg2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      GXt_boolean7 = false ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV21H_KNGN_FLG, "", GXv_boolean8) ;
      a212_wp01_cdisc_item_list_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean7 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
      {
         lblTxt_btn_reg2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      }
   }

   public void wb_table2_217_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV20H_INIT_FLG), GXutil.rtrim( localUtil.format( AV20H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(221);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 222,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV23H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV23H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(222);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV21H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV21H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(223);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_cd_Internalname, GXutil.rtrim( AV18H_DOM_CD), GXutil.rtrim( localUtil.format( AV18H_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(224);\"", "", "", "", "", edtavH_dom_cd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_var_nm_Internalname, GXutil.rtrim( AV19H_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV19H_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(225);\"", "", "", "", "", edtavH_dom_var_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_var_desc_Internalname, GXutil.rtrim( AV24H_VAR_DESC), GXutil.rtrim( localUtil.format( AV24H_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(226);\"", "", "", "", "", edtavH_var_desc_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SORT", AV22H_SORT);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_Internalname, GXutil.rtrim( AV22H_SORT), GXutil.rtrim( localUtil.format( AV22H_SORT, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(227);\"", "", "", "", "", edtavH_sort_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         wb_table3_228_1S2( true) ;
      }
      else
      {
         wb_table3_228_1S2( false) ;
      }
      return  ;
   }

   public void wb_table3_228_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_217_1S2e( true) ;
      }
      else
      {
         wb_table2_217_1S2e( false) ;
      }
   }

   public void wb_table3_228_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(233);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_228_1S2e( true) ;
      }
      else
      {
         wb_table3_228_1S2e( false) ;
      }
   }

   public void wb_table1_2_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table4_6_1S2( true) ;
      }
      else
      {
         wb_table4_6_1S2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1S2e( boolean wbgen )
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
         wb_table1_2_1S2e( true) ;
      }
      else
      {
         wb_table1_2_1S2e( false) ;
      }
   }

   public void wb_table4_6_1S2( boolean wbgen )
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
         wb_table5_12_1S2( true) ;
      }
      else
      {
         wb_table5_12_1S2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table6_28_1S2( true) ;
      }
      else
      {
         wb_table6_28_1S2( false) ;
      }
      return  ;
   }

   public void wb_table6_28_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0215"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0215"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0215"+"");
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
         wb_table4_6_1S2e( true) ;
      }
      else
      {
         wb_table4_6_1S2e( false) ;
      }
   }

   public void wb_table6_28_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_31_1S2( true) ;
      }
      else
      {
         wb_table7_31_1S2( false) ;
      }
      return  ;
   }

   public void wb_table7_31_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_28_1S2e( true) ;
      }
      else
      {
         wb_table6_28_1S2e( false) ;
      }
   }

   public void wb_table7_31_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_34_1S2( true) ;
      }
      else
      {
         wb_table8_34_1S2( false) ;
      }
      return  ;
   }

   public void wb_table8_34_1S2e( boolean wbgen )
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
         wb_table9_65_1S2( true) ;
      }
      else
      {
         wb_table9_65_1S2( false) ;
      }
      return  ;
   }

   public void wb_table9_65_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table10_157_1S2( true) ;
      }
      else
      {
         wb_table10_157_1S2( false) ;
      }
      return  ;
   }

   public void wb_table10_157_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table11_171_1S2( true) ;
      }
      else
      {
         wb_table11_171_1S2( false) ;
      }
      return  ;
   }

   public void wb_table11_171_1S2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"193\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
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
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11D_GRD_LINE, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_line_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV39D_GRD_DOM_CD));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dom_cd_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV40D_GRD_DOM_VAR_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dom_var_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV41D_GRD_VAR_DESC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_var_desc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42D_GRD_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_order_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43D_GRD_VERSION));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_version_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV10D_GRD_DEL));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_del_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 193 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_193_idx-1) ;
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
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_31_1S2e( true) ;
      }
      else
      {
         wb_table7_31_1S2e( false) ;
      }
   }

   public void wb_table11_171_1S2( boolean wbgen )
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
         wb_table12_174_1S2( true) ;
      }
      else
      {
         wb_table12_174_1S2( false) ;
      }
      return  ;
   }

   public void wb_table12_174_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_171_1S2e( true) ;
      }
      else
      {
         wb_table11_171_1S2e( false) ;
      }
   }

   public void wb_table12_174_1S2( boolean wbgen )
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
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "行", "", "", lblTextblock34_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:85px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "ドメインコード", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:150px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ドメイン変数名", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "ドメイン変数説明", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "表示順", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:65px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "Version", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "削除フラグ", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_174_1S2e( true) ;
      }
      else
      {
         wb_table12_174_1S2e( false) ;
      }
   }

   public void wb_table10_157_1S2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "行番号：", "", "", lblTextblock29_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_LINE", AV14D_LINE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavD_line_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_line_Internalname, GXutil.rtrim( AV14D_LINE), GXutil.rtrim( localUtil.format( AV14D_LINE, "XXXX")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(162);\"", "", "", "", "", edtavD_line_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "編集（F7）", "", "", lblTextblock28_Jsonclick, "E\\'BTN_EDIT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_157_1S2e( true) ;
      }
      else
      {
         wb_table10_157_1S2e( false) ;
      }
   }

   public void wb_table9_65_1S2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_71_1S2( true) ;
      }
      else
      {
         wb_table13_71_1S2( false) ;
      }
      return  ;
   }

   public void wb_table13_71_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_65_1S2e( true) ;
      }
      else
      {
         wb_table9_65_1S2e( false) ;
      }
   }

   public void wb_table13_71_1S2( boolean wbgen )
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
         wb_table14_74_1S2( true) ;
      }
      else
      {
         wb_table14_74_1S2( false) ;
      }
      return  ;
   }

   public void wb_table14_74_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table15_80_1S2( true) ;
      }
      else
      {
         wb_table15_80_1S2( false) ;
      }
      return  ;
   }

   public void wb_table15_80_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_86_1S2( true) ;
      }
      else
      {
         wb_table16_86_1S2( false) ;
      }
      return  ;
   }

   public void wb_table16_86_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_92_1S2( true) ;
      }
      else
      {
         wb_table17_92_1S2( false) ;
      }
      return  ;
   }

   public void wb_table17_92_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_98_1S2( true) ;
      }
      else
      {
         wb_table18_98_1S2( false) ;
      }
      return  ;
   }

   public void wb_table18_98_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_104_1S2( true) ;
      }
      else
      {
         wb_table19_104_1S2( false) ;
      }
      return  ;
   }

   public void wb_table19_104_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_110_1S2( true) ;
      }
      else
      {
         wb_table20_110_1S2( false) ;
      }
      return  ;
   }

   public void wb_table20_110_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_116_1S2( true) ;
      }
      else
      {
         wb_table21_116_1S2( false) ;
      }
      return  ;
   }

   public void wb_table21_116_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_122_1S2( true) ;
      }
      else
      {
         wb_table22_122_1S2( false) ;
      }
      return  ;
   }

   public void wb_table22_122_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_128_1S2( true) ;
      }
      else
      {
         wb_table23_128_1S2( false) ;
      }
      return  ;
   }

   public void wb_table23_128_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_134_1S2( true) ;
      }
      else
      {
         wb_table24_134_1S2( false) ;
      }
      return  ;
   }

   public void wb_table24_134_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_140_1S2( true) ;
      }
      else
      {
         wb_table25_140_1S2( false) ;
      }
      return  ;
   }

   public void wb_table25_140_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_146_1S2( true) ;
      }
      else
      {
         wb_table26_146_1S2( false) ;
      }
      return  ;
   }

   public void wb_table26_146_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_152_1S2( true) ;
      }
      else
      {
         wb_table27_152_1S2( false) ;
      }
      return  ;
   }

   public void wb_table27_152_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_71_1S2e( true) ;
      }
      else
      {
         wb_table13_71_1S2e( false) ;
      }
   }

   public void wb_table27_152_1S2( boolean wbgen )
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
         ClassString = lblTxt_last_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_152_1S2e( true) ;
      }
      else
      {
         wb_table27_152_1S2e( false) ;
      }
   }

   public void wb_table26_146_1S2( boolean wbgen )
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
         ClassString = lblTxt_next_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_146_1S2e( true) ;
      }
      else
      {
         wb_table26_146_1S2e( false) ;
      }
   }

   public void wb_table25_140_1S2( boolean wbgen )
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
         ClassString = lblTxt_page10_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_140_1S2e( true) ;
      }
      else
      {
         wb_table25_140_1S2e( false) ;
      }
   }

   public void wb_table24_134_1S2( boolean wbgen )
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
         ClassString = lblTxt_page09_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_134_1S2e( true) ;
      }
      else
      {
         wb_table24_134_1S2e( false) ;
      }
   }

   public void wb_table23_128_1S2( boolean wbgen )
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
         ClassString = lblTxt_page08_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_128_1S2e( true) ;
      }
      else
      {
         wb_table23_128_1S2e( false) ;
      }
   }

   public void wb_table22_122_1S2( boolean wbgen )
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
         ClassString = lblTxt_page07_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_122_1S2e( true) ;
      }
      else
      {
         wb_table22_122_1S2e( false) ;
      }
   }

   public void wb_table21_116_1S2( boolean wbgen )
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
         ClassString = lblTxt_page06_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_116_1S2e( true) ;
      }
      else
      {
         wb_table21_116_1S2e( false) ;
      }
   }

   public void wb_table20_110_1S2( boolean wbgen )
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
         ClassString = lblTxt_page05_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_110_1S2e( true) ;
      }
      else
      {
         wb_table20_110_1S2e( false) ;
      }
   }

   public void wb_table19_104_1S2( boolean wbgen )
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
         ClassString = lblTxt_page04_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_104_1S2e( true) ;
      }
      else
      {
         wb_table19_104_1S2e( false) ;
      }
   }

   public void wb_table18_98_1S2( boolean wbgen )
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
         ClassString = lblTxt_page03_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_98_1S2e( true) ;
      }
      else
      {
         wb_table18_98_1S2e( false) ;
      }
   }

   public void wb_table17_92_1S2( boolean wbgen )
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
         ClassString = lblTxt_page02_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_92_1S2e( true) ;
      }
      else
      {
         wb_table17_92_1S2e( false) ;
      }
   }

   public void wb_table16_86_1S2( boolean wbgen )
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
         ClassString = lblTxt_page01_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_86_1S2e( true) ;
      }
      else
      {
         wb_table16_86_1S2e( false) ;
      }
   }

   public void wb_table15_80_1S2( boolean wbgen )
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
         ClassString = lblTxt_back_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_80_1S2e( true) ;
      }
      else
      {
         wb_table15_80_1S2e( false) ;
      }
   }

   public void wb_table14_74_1S2( boolean wbgen )
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
         ClassString = lblTxt_first_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_74_1S2e( true) ;
      }
      else
      {
         wb_table14_74_1S2e( false) ;
      }
   }

   public void wb_table8_34_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         httpContext.writeText( "ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:580px\">") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         ClassString = "Attribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_dom_cd, cmbavD_dom_cd.getInternalname(), AV7D_DOM_CD, 1, cmbavD_dom_cd.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 2, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", true, "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         cmbavD_dom_cd.setValue( AV7D_DOM_CD );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_dom_cd.getInternalname(), "Values", cmbavD_dom_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_var_nm_Internalname, GXutil.rtrim( AV9D_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV9D_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "", "", "", "", edtavD_dom_var_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数説明") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_var_desc_Internalname, GXutil.rtrim( AV16D_VAR_DESC), GXutil.rtrim( localUtil.format( AV16D_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "", "", "", "", edtavD_var_desc_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ソート順") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_SORT", AV15D_SORT);
         ClassString = "Attribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_193_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_sort, cmbavD_sort.getInternalname(), AV15D_SORT, 1, cmbavD_sort.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 1, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "", true, "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         cmbavD_sort.setValue( AV15D_SORT );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_sort.getInternalname(), "Values", cmbavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"Submit\" colspan=\"2\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table28_53_1S2( true) ;
      }
      else
      {
         wb_table28_53_1S2( false) ;
      }
      return  ;
   }

   public void wb_table28_53_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_34_1S2e( true) ;
      }
      else
      {
         wb_table8_34_1S2e( false) ;
      }
   }

   public void wb_table28_53_1S2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "E\\'BTN_SRCH\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_53_1S2e( true) ;
      }
      else
      {
         wb_table28_53_1S2e( false) ;
      }
   }

   public void wb_table5_12_1S2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "新規（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "CSV出力（F4）", "", "", lblTextblock43_Jsonclick, "E\\'BTN_CSV\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn150" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "ドメイン変数取込（F8）", "", "", lblTextblock47_Jsonclick, "E\\'BTN_IMPORT_CDISC_ITEM\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList200" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_domain_Internalname, "ドメインマスタメンテナンス（F9）", "", "", lblBtn_domain_Jsonclick, "E\\'BTN_DOMAIN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1S2e( true) ;
      }
      else
      {
         wb_table5_12_1S2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV26P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
      AV27P_MOVE_KBN_2 = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
      AV25P_DOM_CD = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
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
      pa1S2( ) ;
      ws1S2( ) ;
      we1S2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1593793");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("a212_wp01_cdisc_item_list.js", "?1593793");
      /* End function include_jscripts */
   }

   public void sendrow_1932( )
   {
      wb1S0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_193_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_193_idx/ (double) (1)) % (2)) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
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
            if ( ( 1 == 0 ) && ( nGXsfl_193_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_193_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_193_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_193_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:45px\""});
         /* Text block */
         ClassString = "TextBlockBtn040" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"E\\'BTN_SEL\\'."+sGXsfl_193_idx,StyleString,ClassString,new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 198,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_line_Internalname,GXutil.ltrim( localUtil.ntoc( AV11D_GRD_LINE, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_line_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_LINE), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_LINE), "ZZZ9")),TempTags+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(198);\"" : " "),"","","","",edtavD_grd_line_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_line_Enabled),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:85px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 200,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_dom_cd_Internalname,GXutil.rtrim( AV39D_GRD_DOM_CD),"",TempTags+((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(200);\"" : " "),"","","","",edtavD_grd_dom_cd_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_dom_cd_Enabled),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:150px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 202,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_dom_var_nm_Internalname,GXutil.rtrim( AV40D_GRD_DOM_VAR_NM),"",TempTags+((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(202);\"" : " "),"","","","",edtavD_grd_dom_var_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_dom_var_nm_Enabled),new Integer(0),new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 204,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_var_desc_Internalname,GXutil.rtrim( AV41D_GRD_VAR_DESC),"",TempTags+((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(204);\"" : " "),"","","","",edtavD_grd_var_desc_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_var_desc_Enabled),new Integer(0),new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 206,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_order_Internalname,GXutil.ltrim( localUtil.ntoc( AV42D_GRD_ORDER, (byte)(5), (byte)(0), ".", "")),((edtavD_grd_order_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42D_GRD_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV42D_GRD_ORDER), "ZZZZ9")),TempTags+((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(206);\"" : " "),"","","","",edtavD_grd_order_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_order_Enabled),new Integer(0),new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:65px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 208,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_version_Internalname,GXutil.rtrim( AV43D_GRD_VERSION),"",TempTags+((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(208);\"" : " "),"","","","",edtavD_grd_version_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_version_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 210,'',false,'"+sGXsfl_193_idx+"',193)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV10D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(210);\"" : " "),"","","","",edtavD_grd_del_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(193),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
               if ( ((int)(nGXsfl_193_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_193_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_193_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_193_idx+1)) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_193_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_193_idx ;
         edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_193_idx ;
         edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_193_idx ;
         edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_193_idx ;
         edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_193_idx ;
         edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_193_idx ;
         edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_193_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_193_idx ;
      }
      /* End function sendrow_1932 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      lblBtn_domain_Internalname = "BTN_DOMAIN" ;
      tblTable8_Internalname = "TABLE8" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      cmbavD_dom_cd.setInternalname( "vD_DOM_CD" );
      edtavD_dom_var_nm_Internalname = "vD_DOM_VAR_NM" ;
      edtavD_var_desc_Internalname = "vD_VAR_DESC" ;
      cmbavD_sort.setInternalname( "vD_SORT" );
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
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
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
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_dom_cd_Internalname = "vH_DOM_CD" ;
      edtavH_dom_var_nm_Internalname = "vH_DOM_VAR_NM" ;
      edtavH_var_desc_Internalname = "vH_VAR_DESC" ;
      edtavH_sort_Internalname = "vH_SORT" ;
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
      edtavD_grd_version_Jsonclick = "" ;
      edtavD_grd_version_Visible = 1 ;
      edtavD_grd_order_Jsonclick = "" ;
      edtavD_grd_order_Visible = 1 ;
      edtavD_grd_var_desc_Jsonclick = "" ;
      edtavD_grd_var_desc_Visible = 1 ;
      edtavD_grd_dom_var_nm_Jsonclick = "" ;
      edtavD_grd_dom_var_nm_Visible = 1 ;
      edtavD_grd_dom_cd_Jsonclick = "" ;
      edtavD_grd_dom_cd_Visible = 1 ;
      edtavD_grd_line_Jsonclick = "" ;
      edtavD_grd_line_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      cmbavD_sort.setJsonclick( "" );
      edtavD_var_desc_Jsonclick = "" ;
      edtavD_dom_var_nm_Jsonclick = "" ;
      cmbavD_dom_cd.setJsonclick( "" );
      edtavD_line_Jsonclick = "" ;
      edtavD_line_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_del_Enabled = 1 ;
      edtavD_grd_version_Enabled = 1 ;
      edtavD_grd_order_Enabled = 1 ;
      edtavD_grd_var_desc_Enabled = 1 ;
      edtavD_grd_dom_var_nm_Enabled = 1 ;
      edtavD_grd_dom_cd_Enabled = 1 ;
      edtavD_grd_line_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_sort_Jsonclick = "" ;
      edtavH_var_desc_Jsonclick = "" ;
      edtavH_dom_var_nm_Jsonclick = "" ;
      edtavH_dom_cd_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
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
      subGrid1_Rows = (short)(10) ;
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
                  /* Execute user subroutine: S30700 */
                  S30700 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV25P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV25P_DOM_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV17H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV44SD_A212_SD01_LIST_C = new GxObjectCollection(SdtA212_SD01_LIST_A212_SD01_LISTItem.class, "A212_SD01_LIST.A212_SD01_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
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
      lblBtn_sel_Internalname = "" ;
      edtavD_grd_line_Internalname = "" ;
      edtavD_grd_dom_cd_Internalname = "" ;
      edtavD_grd_dom_var_nm_Internalname = "" ;
      edtavD_grd_var_desc_Internalname = "" ;
      edtavD_grd_order_Internalname = "" ;
      edtavD_grd_version_Internalname = "" ;
      edtavD_grd_del_Internalname = "" ;
      AV39D_GRD_DOM_CD = "" ;
      AV40D_GRD_DOM_VAR_NM = "" ;
      AV41D_GRD_VAR_DESC = "" ;
      AV43D_GRD_VERSION = "" ;
      AV10D_GRD_DEL = "" ;
      GXDecQS = "" ;
      AV7D_DOM_CD = "" ;
      AV15D_SORT = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV51Pgmname = "" ;
      AV50Pgmdesc = "" ;
      AV9D_DOM_VAR_NM = "" ;
      AV16D_VAR_DESC = "" ;
      AV14D_LINE = "" ;
      AV20H_INIT_FLG = "" ;
      AV23H_SRCH_FLG = "" ;
      AV21H_KNGN_FLG = "" ;
      AV18H_DOM_CD = "" ;
      AV19H_DOM_VAR_NM = "" ;
      AV24H_VAR_DESC = "" ;
      AV22H_SORT = "" ;
      AV6C_TAM02_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV28W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV45SD_A212_SD01_LIST_I = new SdtA212_SD01_LIST_A212_SD01_LISTItem(remoteHandle, context);
      AV37W_RTN_MSG = "" ;
      AV36W_MSG = "" ;
      AV31W_DOM_CD = "" ;
      AV32W_DOM_VAR_NM = "" ;
      scmdbuf = "" ;
      H001S2_A518TBM02_DOM_JNM = new String[] {""} ;
      H001S2_n518TBM02_DOM_JNM = new boolean[] {false} ;
      H001S2_A516TBM02_DOM_CD = new String[] {""} ;
      A518TBM02_DOM_JNM = "" ;
      A516TBM02_DOM_CD = "" ;
      AV38W_SESSION = httpContext.getWebSession();
      lV18H_DOM_CD = "" ;
      lV19H_DOM_VAR_NM = "" ;
      lV24H_VAR_DESC = "" ;
      A162TBM03_DOM_CD = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      A164TBM03_VAR_DESC = "" ;
      H001S3_A164TBM03_VAR_DESC = new String[] {""} ;
      H001S3_n164TBM03_VAR_DESC = new boolean[] {false} ;
      H001S3_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      H001S3_A162TBM03_DOM_CD = new String[] {""} ;
      H001S3_A178TBM03_DEL_FLG = new String[] {""} ;
      H001S3_n178TBM03_DEL_FLG = new boolean[] {false} ;
      H001S3_A169TBM03_ORDER = new int[1] ;
      H001S3_n169TBM03_ORDER = new boolean[] {false} ;
      H001S3_A885TBM03_VERSION = new String[] {""} ;
      H001S3_n885TBM03_VERSION = new boolean[] {false} ;
      A178TBM03_DEL_FLG = "" ;
      A885TBM03_VERSION = "" ;
      H001S4_A164TBM03_VAR_DESC = new String[] {""} ;
      H001S4_n164TBM03_VAR_DESC = new boolean[] {false} ;
      H001S4_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      H001S4_A162TBM03_DOM_CD = new String[] {""} ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV33W_ERRCD = "" ;
      AV29W_A819_JS = "" ;
      AV30W_A821_JS = "" ;
      GXv_char3 = new String [1] ;
      GXv_SdtA_PAGING_SDT6 = new SdtA_PAGING_SDT [1] ;
      GXv_char5 = new String [1] ;
      GXv_boolean8 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
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
      lblTextblock47_Jsonclick = "" ;
      lblBtn_domain_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a212_wp01_cdisc_item_list__default(),
         new Object[] {
             new Object[] {
            H001S2_A518TBM02_DOM_JNM, H001S2_n518TBM02_DOM_JNM, H001S2_A516TBM02_DOM_CD
            }
            , new Object[] {
            H001S3_A164TBM03_VAR_DESC, H001S3_n164TBM03_VAR_DESC, H001S3_A163TBM03_DOM_VAR_NM, H001S3_A162TBM03_DOM_CD, H001S3_A178TBM03_DEL_FLG, H001S3_n178TBM03_DEL_FLG, H001S3_A169TBM03_ORDER, H001S3_n169TBM03_ORDER, H001S3_A885TBM03_VERSION, H001S3_n885TBM03_VERSION
            }
            , new Object[] {
            H001S4_A164TBM03_VAR_DESC, H001S4_n164TBM03_VAR_DESC, H001S4_A163TBM03_DOM_VAR_NM, H001S4_A162TBM03_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV51Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV50Pgmdesc = "ドメイン変数マスタメンテナンス（一覧）" ;
      /* GeneXus formulas. */
      AV51Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV50Pgmdesc = "ドメイン変数マスタメンテナンス（一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_dom_cd_Enabled = 0 ;
      edtavD_grd_dom_var_nm_Enabled = 0 ;
      edtavD_grd_var_desc_Enabled = 0 ;
      edtavD_grd_order_Enabled = 0 ;
      edtavD_grd_version_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV26P_MOVE_KBN ;
   private byte wcpOAV27P_MOVE_KBN_2 ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV26P_MOVE_KBN ;
   private byte AV27P_MOVE_KBN_2 ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte AV56GXLvl559 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_line_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_193_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11D_GRD_LINE ;
   private short nCmpId ;
   private short Gx_err ;
   private short subGrid1_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int AV42D_GRD_ORDER ;
   private int subGrid1_Islastpage ;
   private int edtavD_grd_line_Enabled ;
   private int edtavD_grd_dom_cd_Enabled ;
   private int edtavD_grd_dom_var_nm_Enabled ;
   private int edtavD_grd_var_desc_Enabled ;
   private int edtavD_grd_order_Enabled ;
   private int edtavD_grd_version_Enabled ;
   private int edtavD_grd_del_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV52GXV2 ;
   private int GRID1_nCurrentRecord ;
   private int AV53GXV3 ;
   private int edtavD_line_Backcolor ;
   private int A169TBM03_ORDER ;
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
   private int edtavD_grd_dom_cd_Visible ;
   private int edtavD_grd_dom_var_nm_Visible ;
   private int edtavD_grd_var_desc_Visible ;
   private int edtavD_grd_order_Visible ;
   private int edtavD_grd_version_Visible ;
   private int edtavD_grd_del_Visible ;
   private long AV46W_CNT ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_193_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
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
   private String lblBtn_sel_Internalname ;
   private String edtavD_grd_line_Internalname ;
   private String edtavD_grd_dom_cd_Internalname ;
   private String edtavD_grd_dom_var_nm_Internalname ;
   private String edtavD_grd_var_desc_Internalname ;
   private String edtavD_grd_order_Internalname ;
   private String edtavD_grd_version_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String AV51Pgmname ;
   private String AV50Pgmdesc ;
   private String edtavD_dom_var_nm_Internalname ;
   private String edtavD_var_desc_Internalname ;
   private String AV14D_LINE ;
   private String edtavD_line_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_dom_cd_Internalname ;
   private String edtavH_dom_var_nm_Internalname ;
   private String edtavH_var_desc_Internalname ;
   private String edtavH_sort_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXv_char3[] ;
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
   private String GXv_char5[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_dom_cd_Jsonclick ;
   private String edtavH_dom_var_nm_Jsonclick ;
   private String edtavH_var_desc_Jsonclick ;
   private String edtavH_sort_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
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
   private String edtavD_dom_var_nm_Jsonclick ;
   private String edtavD_var_desc_Jsonclick ;
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
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblBtn_domain_Internalname ;
   private String lblBtn_domain_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtavD_grd_line_Jsonclick ;
   private String edtavD_grd_dom_cd_Jsonclick ;
   private String edtavD_grd_dom_var_nm_Jsonclick ;
   private String edtavD_grd_var_desc_Jsonclick ;
   private String edtavD_grd_order_Jsonclick ;
   private String edtavD_grd_version_Jsonclick ;
   private String GXt_char1 ;
   private String edtavD_grd_del_Jsonclick ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV34W_ERRFLG ;
   private boolean n518TBM02_DOM_JNM ;
   private boolean n164TBM03_VAR_DESC ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n169TBM03_ORDER ;
   private boolean n885TBM03_VERSION ;
   private boolean AV35W_F7FLG ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV25P_DOM_CD ;
   private String AV25P_DOM_CD ;
   private String AV39D_GRD_DOM_CD ;
   private String AV40D_GRD_DOM_VAR_NM ;
   private String AV41D_GRD_VAR_DESC ;
   private String AV43D_GRD_VERSION ;
   private String AV10D_GRD_DEL ;
   private String AV7D_DOM_CD ;
   private String AV15D_SORT ;
   private String AV9D_DOM_VAR_NM ;
   private String AV16D_VAR_DESC ;
   private String AV20H_INIT_FLG ;
   private String AV23H_SRCH_FLG ;
   private String AV21H_KNGN_FLG ;
   private String AV18H_DOM_CD ;
   private String AV19H_DOM_VAR_NM ;
   private String AV24H_VAR_DESC ;
   private String AV22H_SORT ;
   private String AV6C_TAM02_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV37W_RTN_MSG ;
   private String AV36W_MSG ;
   private String AV31W_DOM_CD ;
   private String AV32W_DOM_VAR_NM ;
   private String A518TBM02_DOM_JNM ;
   private String A516TBM02_DOM_CD ;
   private String lV18H_DOM_CD ;
   private String lV19H_DOM_VAR_NM ;
   private String lV24H_VAR_DESC ;
   private String A162TBM03_DOM_CD ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A164TBM03_VAR_DESC ;
   private String A178TBM03_DEL_FLG ;
   private String A885TBM03_VERSION ;
   private String AV33W_ERRCD ;
   private String AV29W_A819_JS ;
   private String AV30W_A821_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_dom_cd ;
   private HTMLChoice cmbavD_sort ;
   private IDataStoreProvider pr_default ;
   private String[] H001S2_A518TBM02_DOM_JNM ;
   private boolean[] H001S2_n518TBM02_DOM_JNM ;
   private String[] H001S2_A516TBM02_DOM_CD ;
   private String[] H001S3_A164TBM03_VAR_DESC ;
   private boolean[] H001S3_n164TBM03_VAR_DESC ;
   private String[] H001S3_A163TBM03_DOM_VAR_NM ;
   private String[] H001S3_A162TBM03_DOM_CD ;
   private String[] H001S3_A178TBM03_DEL_FLG ;
   private boolean[] H001S3_n178TBM03_DEL_FLG ;
   private int[] H001S3_A169TBM03_ORDER ;
   private boolean[] H001S3_n169TBM03_ORDER ;
   private String[] H001S3_A885TBM03_VERSION ;
   private boolean[] H001S3_n885TBM03_VERSION ;
   private String[] H001S4_A164TBM03_VAR_DESC ;
   private boolean[] H001S4_n164TBM03_VAR_DESC ;
   private String[] H001S4_A163TBM03_DOM_VAR_NM ;
   private String[] H001S4_A162TBM03_DOM_CD ;
   private com.genexus.webpanels.WebSession AV38W_SESSION ;
   private GxObjectCollection AV44SD_A212_SD01_LIST_C ;
   private SdtA_PAGING_SDT AV17H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT6[] ;
   private SdtA_LOGIN_SDT AV28W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtA212_SD01_LIST_A212_SD01_LISTItem AV45SD_A212_SD01_LIST_I ;
}

final  class a212_wp01_cdisc_item_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001S3( com.genexus.internet.HttpContext httpContext ,
                                          String AV18H_DOM_CD ,
                                          String AV19H_DOM_VAR_NM ,
                                          String AV24H_VAR_DESC ,
                                          String A162TBM03_DOM_CD ,
                                          String A163TBM03_DOM_VAR_NM ,
                                          String A164TBM03_VAR_DESC ,
                                          String AV22H_SORT ,
                                          String AV23H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [4] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT `TBM03_VAR_DESC`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_DEL_FLG`, `TBM03_ORDER`," ;
      scmdbuf = scmdbuf + " `TBM03_VERSION` FROM `TBM03_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV18H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      if ( (GXutil.strcmp("", AV22H_SORT)==0) )
      {
         scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`" ;
      }
      else if ( GXutil.strcmp(AV22H_SORT, "1") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY `TBM03_VERSION`, `TBM03_DOM_CD`" ;
      }
      else if ( GXutil.strcmp(AV22H_SORT, "2") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY `TBM03_VERSION` DESC, `TBM03_DOM_CD`" ;
      }
      else if ( GXutil.strcmp(AV22H_SORT, "3") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_ORDER`" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H001S4( com.genexus.internet.HttpContext httpContext ,
                                          String AV18H_DOM_CD ,
                                          String AV19H_DOM_VAR_NM ,
                                          String AV24H_VAR_DESC ,
                                          String A162TBM03_DOM_CD ,
                                          String A163TBM03_DOM_VAR_NM ,
                                          String A164TBM03_VAR_DESC )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [3] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
      scmdbuf = "SELECT `TBM03_VAR_DESC`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD` FROM `TBM03_CDISC_ITEM`" ;
      if ( ! (GXutil.strcmp("", AV18H_DOM_CD)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19H_DOM_VAR_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24H_VAR_DESC)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
         }
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE " + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_H001S3(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
            case 2 :
                  return conditional_H001S4(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001S2", "SELECT `TBM02_DOM_JNM`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` ORDER BY `TBM02_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001S4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               break;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 100);
               }
               break;
      }
   }

}

