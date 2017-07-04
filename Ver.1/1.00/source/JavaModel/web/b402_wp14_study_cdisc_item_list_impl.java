/*
               File: b402_wp14_study_cdisc_item_list_impl
        Description: 試験登録（ドメイン変数一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:51.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp14_study_cdisc_item_list_impl extends GXWebPanel
{
   public b402_wp14_study_cdisc_item_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp14_study_cdisc_item_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp14_study_cdisc_item_list_impl.class ));
   }

   public b402_wp14_study_cdisc_item_list_impl( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_dom_cd = new HTMLChoice();
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
            nGXsfl_176_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_176_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_176_idx, sGXsfl_176_idx) ;
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
            AV33P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
               AV22P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
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
         pa1W2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1W2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1W2( ) ;
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
      httpContext.writeText( "試験登録（ドメイン変数一覧）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV33P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV22P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1W2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV20H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_CD", GXutil.rtrim( AV16H_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_VAR_NM", GXutil.rtrim( AV17H_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_VAR_DESC", GXutil.rtrim( AV21H_VAR_DESC));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV33P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV23P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV22P_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM43_DEL_FLG", GXutil.rtrim( A906TBM43_DEL_FLG));
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

   public void wb1W0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1W2( true) ;
      }
      else
      {
         wb_table1_2_1W2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_198_1W2( true) ;
      }
      else
      {
         wb_table2_198_1W2( false) ;
      }
      return  ;
   }

   public void wb_table2_198_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1W2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "試験登録（ドメイン変数一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0196") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0196", "");
         }
      }
      wbErr = false ;
      strup1W0( ) ;
   }

   public void ws1W2( )
   {
      start1W2( ) ;
      evt1W2( ) ;
   }

   public void evt1W2( )
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
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV20H_SRCH_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV16H_DOM_CD) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_VAR_NM"), AV17H_DOM_VAR_NM) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_VAR_DESC"), AV21H_VAR_DESC) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
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
                        /* Execute user event: e111W2 */
                        e111W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121W2 */
                        e121W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131W2 */
                        e131W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141W2 */
                        e141W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151W2 */
                        e151W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161W2 */
                        e161W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171W2 */
                        e171W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181W2 */
                        e181W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191W2 */
                        e191W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201W2 */
                        e201W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211W2 */
                        e211W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221W2 */
                        e221W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231W2 */
                        e231W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241W2 */
                        e241W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251W2 */
                        e251W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261W2 */
                        e261W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271W2 */
                        e271W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281W2 */
                        e281W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291W2 */
                        e291W2 ();
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
                        nGXsfl_176_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
                        lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
                        edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
                        edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
                        edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
                        edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
                        edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
                        edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
                        A895TBM43_DOM_CD = httpContext.cgiGet( edtTBM43_DOM_CD_Internalname) ;
                        A896TBM43_DOM_VAR_NM = httpContext.cgiGet( edtTBM43_DOM_VAR_NM_Internalname) ;
                        A897TBM43_VAR_DESC = httpContext.cgiGet( edtTBM43_VAR_DESC_Internalname) ;
                        n897TBM43_VAR_DESC = false ;
                        A905TBM43_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM43_ORDER_Internalname), ".", ",")) ;
                        n905TBM43_ORDER = false ;
                        A907TBM43_VERSION = httpContext.cgiGet( edtTBM43_VERSION_Internalname) ;
                        n907TBM43_VERSION = false ;
                        AV10D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0196") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0196", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0196") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0196", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301W2 */
                              e301W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311W2 */
                              e311W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e321W2 */
                              e321W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e331W2 */
                              e331W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV20H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_cd Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV16H_DOM_CD) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_var_nm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_VAR_NM"), AV17H_DOM_VAR_NM) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_var_desc Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_VAR_DESC"), AV21H_VAR_DESC) != 0 )
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
                  else if ( nCmpId == 196 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0196") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0196", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1W2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1W2( ) ;
         }
      }
   }

   public void pa1W2( )
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
                  AV33P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV23P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
                     AV22P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_176_idx ,
                                 String sGXsfl_176_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
      edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
      edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
      edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
      edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
      edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
      while ( nGXsfl_176_idx <= nRC_Grid1 )
      {
         sendrow_1762( ) ;
         nGXsfl_176_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_176_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
         edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
         edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
         edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
         edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
         edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1W2( ) ;
      /* End function Refresh */
   }

   public void rf1W2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(176) ;
      nGXsfl_176_idx = (short)(1) ;
      sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
      edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
      edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
      edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
      edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
      edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
      /* Execute user event: e311W2 */
      e311W2 ();
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
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
         edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
         edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
         edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
         edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
         edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV16H_DOM_CD ,
                                              AV17H_DOM_VAR_NM ,
                                              AV21H_VAR_DESC ,
                                              A895TBM43_DOM_CD ,
                                              A896TBM43_DOM_VAR_NM ,
                                              A897TBM43_VAR_DESC ,
                                              AV20H_SRCH_FLG ,
                                              new Long(AV23P_STUDY_ID) ,
                                              new Long(A894TBM43_STUDY_ID) },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                              }
         });
         lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
         lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
         /* Using cursor H001W2 */
         pr_default.execute(0, new Object[] {new Long(AV23P_STUDY_ID), AV20H_SRCH_FLG, AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC});
         nGXsfl_176_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A906TBM43_DEL_FLG = H001W2_A906TBM43_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
            n906TBM43_DEL_FLG = H001W2_n906TBM43_DEL_FLG[0] ;
            A894TBM43_STUDY_ID = H001W2_A894TBM43_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            A907TBM43_VERSION = H001W2_A907TBM43_VERSION[0] ;
            n907TBM43_VERSION = H001W2_n907TBM43_VERSION[0] ;
            A905TBM43_ORDER = H001W2_A905TBM43_ORDER[0] ;
            n905TBM43_ORDER = H001W2_n905TBM43_ORDER[0] ;
            A897TBM43_VAR_DESC = H001W2_A897TBM43_VAR_DESC[0] ;
            n897TBM43_VAR_DESC = H001W2_n897TBM43_VAR_DESC[0] ;
            A896TBM43_DOM_VAR_NM = H001W2_A896TBM43_DOM_VAR_NM[0] ;
            A895TBM43_DOM_CD = H001W2_A895TBM43_DOM_CD[0] ;
            /* Execute user event: e321W2 */
            e321W2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(176) ;
         wb1W0( ) ;
      }
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV16H_DOM_CD ,
                                           AV17H_DOM_VAR_NM ,
                                           AV21H_VAR_DESC ,
                                           A895TBM43_DOM_CD ,
                                           A896TBM43_DOM_VAR_NM ,
                                           A897TBM43_VAR_DESC ,
                                           AV20H_SRCH_FLG ,
                                           new Long(AV23P_STUDY_ID) ,
                                           new Long(A894TBM43_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      /* Using cursor H001W3 */
      pr_default.execute(1, new Object[] {new Long(AV23P_STUDY_ID), AV20H_SRCH_FLG, AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC});
      GRID1_nRecordCount = H001W3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return GRID1_nRecordCount ;
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
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
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
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) ;
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
         GRID1_nFirstRecordOnPage = (int)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup1W0( )
   {
      /* Before Start, stand alone formulas. */
      AV38Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV37Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e301W2 */
      e301W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV15H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_dom_cd.setName( cmbavD_dom_cd.getInternalname() );
         cmbavD_dom_cd.setValue( httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) );
         AV7D_DOM_CD = httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV9D_DOM_VAR_NM = httpContext.cgiGet( edtavD_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
         AV14D_VAR_DESC = httpContext.cgiGet( edtavD_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
         AV18H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
         AV20H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         AV19H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
         AV16H_DOM_CD = httpContext.cgiGet( edtavH_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
         AV17H_DOM_VAR_NM = httpContext.cgiGet( edtavH_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
         AV21H_VAR_DESC = httpContext.cgiGet( edtavH_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV33P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV23P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV22P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0196") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0196", "");
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
      /* Execute user event: e301W2 */
      e301W2 ();
      if (returnInSub) return;
   }

   public void e301W2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "B402" ;
      AV5C_GAMEN_TITLE = AV37Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV18H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV24W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0196",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e311W2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV18H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV38Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_dom_var_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV18H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
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

   private void e321W2( )
   {
      /* Grid1_Load Routine */
      if ( GXutil.strcmp(A906TBM43_DEL_FLG, "0") == 0 )
      {
         AV10D_GRD_DEL = "利用可能" ;
      }
      else if ( GXutil.strcmp(A906TBM43_DEL_FLG, "1") == 0 )
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
         wbStart = (short)(176) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_1762( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void e111W2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV19H_KNGN_FLG, "") )
      {
         AV31W_SESSION.setValue("B402_WP14_PAGE", GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121W2( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV29W_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17H_DOM_VAR_NM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV21H_VAR_DESC)) + "," + GXutil.URLEncode(GXutil.rtrim(AV29W_MSG)) ;
         httpContext.wjLoc = formatLink("ab402_pc27_study_cdisc_item_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         if ( ! (GXutil.strcmp("", AV29W_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV29W_MSG);
      }
   }

   public void e131W2( )
   {
      /* 'BTN_SRCH' Routine */
      AV28W_ERRFLG = false ;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( ! AV28W_ERRFLG )
      {
         AV20H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
   }

   public void e141W2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void e331W2( )
   {
      /* 'BTN_SEL' Routine */
      AV31W_SESSION.setValue("B402_WP14_PAGE", GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A895TBM43_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(A896TBM43_DOM_VAR_NM)) ;
      httpContext.wjLoc = formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e151W2( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H001W4 */
      pr_default.execute(2, new Object[] {new Long(AV23P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A186TBM21_STUDY_ID = H001W4_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H001W4_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001W4_n187TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A187TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV33P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
      }
      else
      {
         AV7D_DOM_CD = AV22P_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV20H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_dom_cd.removeAllItems();
      cmbavD_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H001W5 */
      pr_default.execute(3, new Object[] {new Long(AV23P_STUDY_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A886TBM42_STUDY_ID = H001W5_A886TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A886TBM42_STUDY_ID, 10, 0)));
         A889TBM42_DOM_JNM = H001W5_A889TBM42_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A889TBM42_DOM_JNM", A889TBM42_DOM_JNM);
         n889TBM42_DOM_JNM = H001W5_n889TBM42_DOM_JNM[0] ;
         A893TBM42_DOM_CD = H001W5_A893TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DOM_CD", A893TBM42_DOM_CD);
         cmbavD_dom_cd.addItem(A893TBM42_DOM_CD, A893TBM42_DOM_CD+"："+A889TBM42_DOM_JNM, (short)(0));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV31W_SESSION.setValue("B402_WP14_DOM_CD", AV16H_DOM_CD);
      AV31W_SESSION.setValue("B402_WP14_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV31W_SESSION.setValue("B402_WP14_VAR_DESC", AV21H_VAR_DESC);
      AV31W_SESSION.setValue("B402_WP14_SRCH_FLG", AV20H_SRCH_FLG);
   }

   public void S242( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV16H_DOM_CD = AV31W_SESSION.getValue("B402_WP14_DOM_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = AV31W_SESSION.getValue("B402_WP14_DOM_VAR_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = AV31W_SESSION.getValue("B402_WP14_VAR_DESC") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      AV7D_DOM_CD = AV16H_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = AV17H_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV14D_VAR_DESC = AV21H_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV31W_SESSION.getValue("B402_WP14_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV20H_SRCH_FLG = AV31W_SESSION.getValue("B402_WP14_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
   }

   public void S232( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV31W_SESSION.remove("B402_WP14_DOM_CD");
      AV31W_SESSION.remove("B402_WP14_DOM_VAR_NM");
      AV31W_SESSION.remove("B402_WP14_VAR_DESC");
      AV31W_SESSION.remove("B402_WP14_PAGE");
      AV31W_SESSION.remove("B402_WP14_SRCH_FLG");
   }

   public void S212( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV16H_DOM_CD = AV7D_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = AV9D_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = AV14D_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
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
   }

   public void S192( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV41GXLvl398 = (byte)(0) ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV16H_DOM_CD ,
                                           AV17H_DOM_VAR_NM ,
                                           AV21H_VAR_DESC ,
                                           A895TBM43_DOM_CD ,
                                           A896TBM43_DOM_VAR_NM ,
                                           A897TBM43_VAR_DESC ,
                                           new Long(AV23P_STUDY_ID) ,
                                           new Long(A894TBM43_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      /* Using cursor H001W6 */
      pr_default.execute(4, new Object[] {new Long(AV23P_STUDY_ID), AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A897TBM43_VAR_DESC = H001W6_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = H001W6_n897TBM43_VAR_DESC[0] ;
         A896TBM43_DOM_VAR_NM = H001W6_A896TBM43_DOM_VAR_NM[0] ;
         A895TBM43_DOM_CD = H001W6_A895TBM43_DOM_CD[0] ;
         A894TBM43_STUDY_ID = H001W6_A894TBM43_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         AV41GXLvl398 = (byte)(1) ;
         AV29W_MSG = "" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV41GXLvl398 == 0 )
      {
         GXt_char2 = AV29W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char3) ;
         b402_wp14_study_cdisc_item_list_impl.this.GXt_char2 = GXv_char3[0] ;
         AV29W_MSG = GXt_char2 ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV24W_A_LOGIN_SDT;
      GXv_char3[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV24W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_wp14_study_cdisc_item_list_impl.this.AV27W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
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
      AV7D_DOM_CD = AV22P_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV14D_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
      AV16H_DOM_CD = AV22P_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV20H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
      AV25W_A819_JS = "" ;
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
      if ( ! (GXutil.strcmp("", AV26W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV26W_A821_JS ;
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
      GXv_char3[0] = AV19H_KNGN_FLG ;
      GXv_char5[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char3, GXv_char5) ;
      b402_wp14_study_cdisc_item_list_impl.this.AV19H_KNGN_FLG = GXv_char3[0] ;
      b402_wp14_study_cdisc_item_list_impl.this.AV27W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S26533( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV38Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp14_study_cdisc_item_list");
   }

   public void e161W2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e171W2( )
   {
      /* 'PAGE_LAST' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181W2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e191W2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e201W2( )
   {
      /* 'PAGE01' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211W2( )
   {
      /* 'PAGE02' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221W2( )
   {
      /* 'PAGE03' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231W2( )
   {
      /* 'PAGE04' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241W2( )
   {
      /* 'PAGE05' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251W2( )
   {
      /* 'PAGE06' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261W2( )
   {
      /* 'PAGE07' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271W2( )
   {
      /* 'PAGE08' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281W2( )
   {
      /* 'PAGE09' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291W2( )
   {
      /* 'PAGE10' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT6[0] = AV15H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT6) ;
      AV15H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT6[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV20H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char2 = AV29W_MSG ;
            GXv_char5[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char5) ;
            b402_wp14_study_cdisc_item_list_impl.this.GXt_char2 = GXv_char5[0] ;
            AV29W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
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
      GXt_boolean7 = false ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV19H_KNGN_FLG, "", GXv_boolean8) ;
      b402_wp14_study_cdisc_item_list_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean7 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
      {
         lblTxt_btn_reg2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      }
   }

   public void wb_table2_198_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV18H_INIT_FLG), GXutil.rtrim( localUtil.format( AV18H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(202);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV20H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV20H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(203);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV19H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV19H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(204);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_cd_Internalname, GXutil.rtrim( AV16H_DOM_CD), GXutil.rtrim( localUtil.format( AV16H_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(205);\"", "", "", "", "", edtavH_dom_cd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_var_nm_Internalname, GXutil.rtrim( AV17H_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV17H_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(206);\"", "", "", "", "", edtavH_dom_var_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_var_desc_Internalname, GXutil.rtrim( AV21H_VAR_DESC), GXutil.rtrim( localUtil.format( AV21H_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(207);\"", "", "", "", "", edtavH_var_desc_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         wb_table3_208_1W2( true) ;
      }
      else
      {
         wb_table3_208_1W2( false) ;
      }
      return  ;
   }

   public void wb_table3_208_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_198_1W2e( true) ;
      }
      else
      {
         wb_table2_198_1W2e( false) ;
      }
   }

   public void wb_table3_208_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(213);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_208_1W2e( true) ;
      }
      else
      {
         wb_table3_208_1W2e( false) ;
      }
   }

   public void wb_table1_2_1W2( boolean wbgen )
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
         wb_table4_6_1W2( true) ;
      }
      else
      {
         wb_table4_6_1W2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1W2e( boolean wbgen )
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
         wb_table1_2_1W2e( true) ;
      }
      else
      {
         wb_table1_2_1W2e( false) ;
      }
   }

   public void wb_table4_6_1W2( boolean wbgen )
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
         wb_table5_12_1W2( true) ;
      }
      else
      {
         wb_table5_12_1W2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table6_23_1W2( true) ;
      }
      else
      {
         wb_table6_23_1W2( false) ;
      }
      return  ;
   }

   public void wb_table6_23_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0196"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0196"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0196"+"");
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
         wb_table4_6_1W2e( true) ;
      }
      else
      {
         wb_table4_6_1W2e( false) ;
      }
   }

   public void wb_table6_23_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_26_1W2( true) ;
      }
      else
      {
         wb_table7_26_1W2( false) ;
      }
      return  ;
   }

   public void wb_table7_26_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_23_1W2e( true) ;
      }
      else
      {
         wb_table6_23_1W2e( false) ;
      }
   }

   public void wb_table7_26_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_29_1W2( true) ;
      }
      else
      {
         wb_table8_29_1W2( false) ;
      }
      return  ;
   }

   public void wb_table8_29_1W2e( boolean wbgen )
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
         wb_table9_60_1W2( true) ;
      }
      else
      {
         wb_table9_60_1W2( false) ;
      }
      return  ;
   }

   public void wb_table9_60_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_156_1W2( true) ;
      }
      else
      {
         wb_table10_156_1W2( false) ;
      }
      return  ;
   }

   public void wb_table10_156_1W2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"176\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
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
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A895TBM43_DOM_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A896TBM43_DOM_VAR_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A897TBM43_VAR_DESC));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A907TBM43_VERSION));
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
      if ( wbEnd == 176 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_176_idx-1) ;
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
         wb_table7_26_1W2e( true) ;
      }
      else
      {
         wb_table7_26_1W2e( false) ;
      }
   }

   public void wb_table10_156_1W2( boolean wbgen )
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
         wb_table11_159_1W2( true) ;
      }
      else
      {
         wb_table11_159_1W2( false) ;
      }
      return  ;
   }

   public void wb_table11_159_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_156_1W2e( true) ;
      }
      else
      {
         wb_table10_156_1W2e( false) ;
      }
   }

   public void wb_table11_159_1W2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"width:85px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "ドメインコード", "", "", lblTextblock34_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ドメイン変数名", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "ドメイン変数説明", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "表示順", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:65px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "Version", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "削除", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_159_1W2e( true) ;
      }
      else
      {
         wb_table11_159_1W2e( false) ;
      }
   }

   public void wb_table9_60_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_66_1W2( true) ;
      }
      else
      {
         wb_table12_66_1W2( false) ;
      }
      return  ;
   }

   public void wb_table12_66_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_60_1W2e( true) ;
      }
      else
      {
         wb_table9_60_1W2e( false) ;
      }
   }

   public void wb_table12_66_1W2( boolean wbgen )
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
         wb_table13_69_1W2( true) ;
      }
      else
      {
         wb_table13_69_1W2( false) ;
      }
      return  ;
   }

   public void wb_table13_69_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table14_75_1W2( true) ;
      }
      else
      {
         wb_table14_75_1W2( false) ;
      }
      return  ;
   }

   public void wb_table14_75_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_81_1W2( true) ;
      }
      else
      {
         wb_table15_81_1W2( false) ;
      }
      return  ;
   }

   public void wb_table15_81_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_87_1W2( true) ;
      }
      else
      {
         wb_table16_87_1W2( false) ;
      }
      return  ;
   }

   public void wb_table16_87_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_93_1W2( true) ;
      }
      else
      {
         wb_table17_93_1W2( false) ;
      }
      return  ;
   }

   public void wb_table17_93_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_99_1W2( true) ;
      }
      else
      {
         wb_table18_99_1W2( false) ;
      }
      return  ;
   }

   public void wb_table18_99_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_105_1W2( true) ;
      }
      else
      {
         wb_table19_105_1W2( false) ;
      }
      return  ;
   }

   public void wb_table19_105_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_111_1W2( true) ;
      }
      else
      {
         wb_table20_111_1W2( false) ;
      }
      return  ;
   }

   public void wb_table20_111_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_117_1W2( true) ;
      }
      else
      {
         wb_table21_117_1W2( false) ;
      }
      return  ;
   }

   public void wb_table21_117_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_123_1W2( true) ;
      }
      else
      {
         wb_table22_123_1W2( false) ;
      }
      return  ;
   }

   public void wb_table22_123_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_129_1W2( true) ;
      }
      else
      {
         wb_table23_129_1W2( false) ;
      }
      return  ;
   }

   public void wb_table23_129_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_135_1W2( true) ;
      }
      else
      {
         wb_table24_135_1W2( false) ;
      }
      return  ;
   }

   public void wb_table24_135_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_141_1W2( true) ;
      }
      else
      {
         wb_table25_141_1W2( false) ;
      }
      return  ;
   }

   public void wb_table25_141_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_147_1W2( true) ;
      }
      else
      {
         wb_table26_147_1W2( false) ;
      }
      return  ;
   }

   public void wb_table26_147_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_66_1W2e( true) ;
      }
      else
      {
         wb_table12_66_1W2e( false) ;
      }
   }

   public void wb_table26_147_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_147_1W2e( true) ;
      }
      else
      {
         wb_table26_147_1W2e( false) ;
      }
   }

   public void wb_table25_141_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_141_1W2e( true) ;
      }
      else
      {
         wb_table25_141_1W2e( false) ;
      }
   }

   public void wb_table24_135_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_135_1W2e( true) ;
      }
      else
      {
         wb_table24_135_1W2e( false) ;
      }
   }

   public void wb_table23_129_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_129_1W2e( true) ;
      }
      else
      {
         wb_table23_129_1W2e( false) ;
      }
   }

   public void wb_table22_123_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_123_1W2e( true) ;
      }
      else
      {
         wb_table22_123_1W2e( false) ;
      }
   }

   public void wb_table21_117_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_117_1W2e( true) ;
      }
      else
      {
         wb_table21_117_1W2e( false) ;
      }
   }

   public void wb_table20_111_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_111_1W2e( true) ;
      }
      else
      {
         wb_table20_111_1W2e( false) ;
      }
   }

   public void wb_table19_105_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_105_1W2e( true) ;
      }
      else
      {
         wb_table19_105_1W2e( false) ;
      }
   }

   public void wb_table18_99_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_99_1W2e( true) ;
      }
      else
      {
         wb_table18_99_1W2e( false) ;
      }
   }

   public void wb_table17_93_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_93_1W2e( true) ;
      }
      else
      {
         wb_table17_93_1W2e( false) ;
      }
   }

   public void wb_table16_87_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_87_1W2e( true) ;
      }
      else
      {
         wb_table16_87_1W2e( false) ;
      }
   }

   public void wb_table15_81_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_81_1W2e( true) ;
      }
      else
      {
         wb_table15_81_1W2e( false) ;
      }
   }

   public void wb_table14_75_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_75_1W2e( true) ;
      }
      else
      {
         wb_table14_75_1W2e( false) ;
      }
   }

   public void wb_table13_69_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_69_1W2e( true) ;
      }
      else
      {
         wb_table13_69_1W2e( false) ;
      }
   }

   public void wb_table8_29_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         httpContext.writeText( "試験") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:580px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         ClassString = "Attribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_dom_cd, cmbavD_dom_cd.getInternalname(), AV7D_DOM_CD, 1, cmbavD_dom_cd.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 2, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "", true, "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_var_nm_Internalname, GXutil.rtrim( AV9D_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV9D_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(41);\"", "", "", "", "", edtavD_dom_var_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数説明") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_176_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_var_desc_Internalname, GXutil.rtrim( AV14D_VAR_DESC), GXutil.rtrim( localUtil.format( AV14D_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", "", "", "", "", edtavD_var_desc_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"Submit\" colspan=\"2\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table27_48_1W2( true) ;
      }
      else
      {
         wb_table27_48_1W2( false) ;
      }
      return  ;
   }

   public void wb_table27_48_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_29_1W2e( true) ;
      }
      else
      {
         wb_table8_29_1W2e( false) ;
      }
   }

   public void wb_table27_48_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "E\\'BTN_SRCH\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_48_1W2e( true) ;
      }
      else
      {
         wb_table27_48_1W2e( false) ;
      }
   }

   public void wb_table5_12_1W2( boolean wbgen )
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
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         ClassString = "TextBlockBtnList100_Disabled" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "新規（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "", StyleString, ClassString, 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         /* Text block */
         ClassString = "TextBlockBtnList120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_Internalname, "CSV出力（F4）", "", "", lblTxt_btn_csv_Jsonclick, "E\\'BTN_CSV\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_can_Internalname, "戻る（F11）", "", "", lblBtn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1W2e( true) ;
      }
      else
      {
         wb_table5_12_1W2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV33P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
      AV23P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
      AV22P_DOM_CD = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
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
      pa1W2( ) ;
      ws1W2( ) ;
      we1W2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1595532");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp14_study_cdisc_item_list.js", "?1595532");
      /* End function include_jscripts */
   }

   public void sendrow_1762( )
   {
      wb1W0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_176_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_176_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_176_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_176_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_176_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_176_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:45px\""});
         /* Text block */
         ClassString = "TextBlockBtn040" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"E\\'BTN_SEL\\'."+sGXsfl_176_idx,StyleString,ClassString,new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:85px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM43_DOM_CD_Internalname,GXutil.rtrim( A895TBM43_DOM_CD),"","","","","","",edtTBM43_DOM_CD_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:200px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM43_DOM_VAR_NM_Internalname,GXutil.rtrim( A896TBM43_DOM_VAR_NM),"","","","","","",edtTBM43_DOM_VAR_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM43_VAR_DESC_Internalname,GXutil.rtrim( A897TBM43_VAR_DESC),"","","","","","",edtTBM43_VAR_DESC_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";width:50px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM43_ORDER_Internalname,GXutil.ltrim( localUtil.ntoc( A905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A905TBM43_ORDER), "ZZZZ9"),"","","","","",edtTBM43_ORDER_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:65px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM43_VERSION_Internalname,GXutil.rtrim( A907TBM43_VERSION),"","","","","","",edtTBM43_VERSION_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 191,'',false,'"+sGXsfl_176_idx+"',176)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV10D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(191);\"" : " "),"","","","",edtavD_grd_del_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
               if ( ((int)(nGXsfl_176_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_176_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_176_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
         edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_176_idx ;
         edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_176_idx ;
         edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_176_idx ;
         edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_176_idx ;
         edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_176_idx ;
         edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_176_idx ;
      }
      /* End function sendrow_1762 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTxt_btn_csv_Internalname = "TXT_BTN_CSV" ;
      lblBtn_can_Internalname = "BTN_CAN" ;
      tblTable8_Internalname = "TABLE8" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      cmbavD_dom_cd.setInternalname( "vD_DOM_CD" );
      edtavD_dom_var_nm_Internalname = "vD_DOM_VAR_NM" ;
      edtavD_var_desc_Internalname = "vD_VAR_DESC" ;
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
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
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
      edtTBM43_VERSION_Jsonclick = "" ;
      edtTBM43_ORDER_Jsonclick = "" ;
      edtTBM43_VAR_DESC_Jsonclick = "" ;
      edtTBM43_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM43_DOM_CD_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_var_desc_Jsonclick = "" ;
      edtavD_dom_var_nm_Jsonclick = "" ;
      cmbavD_dom_cd.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_del_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_var_desc_Jsonclick = "" ;
      edtavH_dom_var_nm_Jsonclick = "" ;
      edtavH_dom_cd_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
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
      lblTxt_study_Caption = "試験名" ;
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
                  /* Execute user subroutine: S26533 */
                  S26533 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV22P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22P_DOM_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV20H_SRCH_FLG = "" ;
      AV16H_DOM_CD = "" ;
      AV17H_DOM_VAR_NM = "" ;
      AV21H_VAR_DESC = "" ;
      AV15H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      A906TBM43_DEL_FLG = "" ;
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
      edtTBM43_DOM_CD_Internalname = "" ;
      edtTBM43_DOM_VAR_NM_Internalname = "" ;
      edtTBM43_VAR_DESC_Internalname = "" ;
      edtTBM43_ORDER_Internalname = "" ;
      edtTBM43_VERSION_Internalname = "" ;
      edtavD_grd_del_Internalname = "" ;
      A895TBM43_DOM_CD = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      A897TBM43_VAR_DESC = "" ;
      A907TBM43_VERSION = "" ;
      AV10D_GRD_DEL = "" ;
      GXDecQS = "" ;
      AV7D_DOM_CD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV17H_DOM_VAR_NM = "" ;
      lV21H_VAR_DESC = "" ;
      H001W2_A906TBM43_DEL_FLG = new String[] {""} ;
      H001W2_n906TBM43_DEL_FLG = new boolean[] {false} ;
      H001W2_A894TBM43_STUDY_ID = new long[1] ;
      H001W2_A907TBM43_VERSION = new String[] {""} ;
      H001W2_n907TBM43_VERSION = new boolean[] {false} ;
      H001W2_A905TBM43_ORDER = new int[1] ;
      H001W2_n905TBM43_ORDER = new boolean[] {false} ;
      H001W2_A897TBM43_VAR_DESC = new String[] {""} ;
      H001W2_n897TBM43_VAR_DESC = new boolean[] {false} ;
      H001W2_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      H001W2_A895TBM43_DOM_CD = new String[] {""} ;
      H001W3_AGRID1_nRecordCount = new int[1] ;
      AV38Pgmname = "" ;
      AV37Pgmdesc = "" ;
      AV9D_DOM_VAR_NM = "" ;
      AV14D_VAR_DESC = "" ;
      AV18H_INIT_FLG = "" ;
      AV19H_KNGN_FLG = "" ;
      AV6C_TAM02_APP_ID = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV24W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV31W_SESSION = httpContext.getWebSession();
      AV29W_MSG = "" ;
      H001W4_A186TBM21_STUDY_ID = new long[1] ;
      H001W4_A187TBM21_STUDY_NM = new String[] {""} ;
      H001W4_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      H001W5_A886TBM42_STUDY_ID = new long[1] ;
      H001W5_A889TBM42_DOM_JNM = new String[] {""} ;
      H001W5_n889TBM42_DOM_JNM = new boolean[] {false} ;
      H001W5_A893TBM42_DOM_CD = new String[] {""} ;
      A889TBM42_DOM_JNM = "" ;
      A893TBM42_DOM_CD = "" ;
      H001W6_A897TBM43_VAR_DESC = new String[] {""} ;
      H001W6_n897TBM43_VAR_DESC = new boolean[] {false} ;
      H001W6_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      H001W6_A895TBM43_DOM_CD = new String[] {""} ;
      H001W6_A894TBM43_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV25W_A819_JS = "" ;
      AV26W_A821_JS = "" ;
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
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
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
      lblTxt_study_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTxt_btn_csv_Jsonclick = "" ;
      lblBtn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp14_study_cdisc_item_list__default(),
         new Object[] {
             new Object[] {
            H001W2_A906TBM43_DEL_FLG, H001W2_n906TBM43_DEL_FLG, H001W2_A894TBM43_STUDY_ID, H001W2_A907TBM43_VERSION, H001W2_n907TBM43_VERSION, H001W2_A905TBM43_ORDER, H001W2_n905TBM43_ORDER, H001W2_A897TBM43_VAR_DESC, H001W2_n897TBM43_VAR_DESC, H001W2_A896TBM43_DOM_VAR_NM,
            H001W2_A895TBM43_DOM_CD
            }
            , new Object[] {
            H001W3_AGRID1_nRecordCount
            }
            , new Object[] {
            H001W4_A186TBM21_STUDY_ID, H001W4_A187TBM21_STUDY_NM, H001W4_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H001W5_A886TBM42_STUDY_ID, H001W5_A889TBM42_DOM_JNM, H001W5_n889TBM42_DOM_JNM, H001W5_A893TBM42_DOM_CD
            }
            , new Object[] {
            H001W6_A897TBM43_VAR_DESC, H001W6_n897TBM43_VAR_DESC, H001W6_A896TBM43_DOM_VAR_NM, H001W6_A895TBM43_DOM_CD, H001W6_A894TBM43_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV38Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV37Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      /* GeneXus formulas. */
      AV38Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV37Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV33P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV33P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte AV41GXLvl398 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_176_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short subGrid1_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int A905TBM43_ORDER ;
   private int subGrid1_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int edtavD_grd_del_Enabled ;
   private int tblTbl_hidden_Visible ;
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
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_del_Visible ;
   private long wcpOAV23P_STUDY_ID ;
   private long AV23P_STUDY_ID ;
   private long A894TBM43_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A886TBM42_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_176_idx="0001" ;
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
   private String edtTBM43_DOM_CD_Internalname ;
   private String edtTBM43_DOM_VAR_NM_Internalname ;
   private String edtTBM43_VAR_DESC_Internalname ;
   private String edtTBM43_ORDER_Internalname ;
   private String edtTBM43_VERSION_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String scmdbuf ;
   private String AV38Pgmname ;
   private String AV37Pgmdesc ;
   private String edtavD_dom_var_nm_Internalname ;
   private String edtavD_var_desc_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_dom_cd_Internalname ;
   private String edtavH_dom_var_nm_Internalname ;
   private String edtavH_var_desc_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
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
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
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
   private String lblTxt_study_Jsonclick ;
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
   private String lblTxt_btn_csv_Internalname ;
   private String lblTxt_btn_csv_Jsonclick ;
   private String lblBtn_can_Internalname ;
   private String lblBtn_can_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtTBM43_DOM_CD_Jsonclick ;
   private String edtTBM43_DOM_VAR_NM_Jsonclick ;
   private String edtTBM43_VAR_DESC_Jsonclick ;
   private String edtTBM43_ORDER_Jsonclick ;
   private String edtTBM43_VERSION_Jsonclick ;
   private String GXt_char1 ;
   private String edtavD_grd_del_Jsonclick ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n897TBM43_VAR_DESC ;
   private boolean n905TBM43_ORDER ;
   private boolean n907TBM43_VERSION ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV28W_ERRFLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n889TBM42_DOM_JNM ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV22P_DOM_CD ;
   private String AV22P_DOM_CD ;
   private String AV20H_SRCH_FLG ;
   private String AV16H_DOM_CD ;
   private String AV17H_DOM_VAR_NM ;
   private String AV21H_VAR_DESC ;
   private String A906TBM43_DEL_FLG ;
   private String A895TBM43_DOM_CD ;
   private String A896TBM43_DOM_VAR_NM ;
   private String A897TBM43_VAR_DESC ;
   private String A907TBM43_VERSION ;
   private String AV10D_GRD_DEL ;
   private String AV7D_DOM_CD ;
   private String lV17H_DOM_VAR_NM ;
   private String lV21H_VAR_DESC ;
   private String AV9D_DOM_VAR_NM ;
   private String AV14D_VAR_DESC ;
   private String AV18H_INIT_FLG ;
   private String AV19H_KNGN_FLG ;
   private String AV6C_TAM02_APP_ID ;
   private String AV5C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String A187TBM21_STUDY_NM ;
   private String A889TBM42_DOM_JNM ;
   private String A893TBM42_DOM_CD ;
   private String AV27W_ERRCD ;
   private String AV25W_A819_JS ;
   private String AV26W_A821_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_dom_cd ;
   private IDataStoreProvider pr_default ;
   private String[] H001W2_A906TBM43_DEL_FLG ;
   private boolean[] H001W2_n906TBM43_DEL_FLG ;
   private long[] H001W2_A894TBM43_STUDY_ID ;
   private String[] H001W2_A907TBM43_VERSION ;
   private boolean[] H001W2_n907TBM43_VERSION ;
   private int[] H001W2_A905TBM43_ORDER ;
   private boolean[] H001W2_n905TBM43_ORDER ;
   private String[] H001W2_A897TBM43_VAR_DESC ;
   private boolean[] H001W2_n897TBM43_VAR_DESC ;
   private String[] H001W2_A896TBM43_DOM_VAR_NM ;
   private String[] H001W2_A895TBM43_DOM_CD ;
   private int[] H001W3_AGRID1_nRecordCount ;
   private long[] H001W4_A186TBM21_STUDY_ID ;
   private String[] H001W4_A187TBM21_STUDY_NM ;
   private boolean[] H001W4_n187TBM21_STUDY_NM ;
   private long[] H001W5_A886TBM42_STUDY_ID ;
   private String[] H001W5_A889TBM42_DOM_JNM ;
   private boolean[] H001W5_n889TBM42_DOM_JNM ;
   private String[] H001W5_A893TBM42_DOM_CD ;
   private String[] H001W6_A897TBM43_VAR_DESC ;
   private boolean[] H001W6_n897TBM43_VAR_DESC ;
   private String[] H001W6_A896TBM43_DOM_VAR_NM ;
   private String[] H001W6_A895TBM43_DOM_CD ;
   private long[] H001W6_A894TBM43_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV31W_SESSION ;
   private SdtA_PAGING_SDT AV15H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT6[] ;
   private SdtA_LOGIN_SDT AV24W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class b402_wp14_study_cdisc_item_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001W2( com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A895TBM43_DOM_CD ,
                                          String A896TBM43_DOM_VAR_NM ,
                                          String A897TBM43_VAR_DESC ,
                                          String AV20H_SRCH_FLG ,
                                          long AV23P_STUDY_ID ,
                                          long A894TBM43_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [5] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT `TBM43_DEL_FLG`, `TBM43_STUDY_ID`, `TBM43_VERSION`, `TBM43_ORDER`, `TBM43_VAR_DESC`," ;
      scmdbuf = scmdbuf + " `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD` FROM `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H001W3( com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A895TBM43_DOM_CD ,
                                          String A896TBM43_DOM_VAR_NM ,
                                          String A897TBM43_VAR_DESC ,
                                          String AV20H_SRCH_FLG ,
                                          long AV23P_STUDY_ID ,
                                          long A894TBM43_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [5] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H001W6( com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A895TBM43_DOM_CD ,
                                          String A896TBM43_DOM_VAR_NM ,
                                          String A897TBM43_VAR_DESC ,
                                          long AV23P_STUDY_ID ,
                                          long A894TBM43_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int13 ;
      GXv_int13 = new byte [4] ;
      Object[] GXv_Object14 ;
      GXv_Object14 = new Object [2] ;
      scmdbuf = "SELECT `TBM43_VAR_DESC`, `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`, `TBM43_STUDY_ID` FROM" ;
      scmdbuf = scmdbuf + " `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM43_STUDY_ID`" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H001W2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
            case 1 :
                  return conditional_H001W3(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
            case 4 :
                  return conditional_H001W6(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001W4", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001W5", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_JNM`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001W6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               break;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
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
      }
   }

}

