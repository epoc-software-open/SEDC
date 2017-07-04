/*
               File: b402_wp07_crf_list_impl
        Description: 試験登録（CRF一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:0:24.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp07_crf_list_impl extends GXWebPanel
{
   public b402_wp07_crf_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp07_crf_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp07_crf_list_impl.class ));
   }

   public b402_wp07_crf_list_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavD_status = new HTMLChoice();
      radavD_del_flg = new HTMLChoice();
      cmbTBM31_STATUS = new HTMLChoice();
      cmbTBM31_DEL_FLG = new HTMLChoice();
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
            nGXsfl_179_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_179_idx = httpContext.GetNextPar( ) ;
            AV33D_SPACE = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_179_idx, sGXsfl_179_idx, AV33D_SPACE) ;
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
            AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
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
         pa0Y2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws0Y2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we0Y2( ) ;
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
      httpContext.writeText( "試験登録（CRF一覧）") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0Y2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV15H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_CRF_NM", GXutil.rtrim( AV11H_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_STATUS", GXutil.rtrim( AV16H_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DEL_FLG", GXutil.rtrim( AV12H_DEL_FLG));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV17P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV18P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_REG_ENABEL", GXutil.booltostr( AV30W_REG_ENABEL));
      GxWebStd.gx_hidden_field( httpContext, "vW_TOP_LINE_NO", GXutil.ltrim( localUtil.ntoc( AV32W_TOP_LINE_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_CNT", GXutil.ltrim( localUtil.ntoc( AV25W_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void wb0Y0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0Y2( true) ;
      }
      else
      {
         wb_table1_2_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_205_0Y2( true) ;
      }
      else
      {
         wb_table2_205_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_205_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "試験登録（CRF一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0203") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0203", "");
         }
      }
      wbErr = false ;
      strup0Y0( ) ;
   }

   public void ws0Y2( )
   {
      start0Y2( ) ;
      evt0Y2( ) ;
   }

   public void evt0Y2( )
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
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV15H_SRCH_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_CRF_NM"), AV11H_CRF_NM) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_STATUS"), AV16H_STATUS) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DEL_FLG"), AV12H_DEL_FLG) != 0 )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_CHK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110Y2 */
                        e110Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120Y2 */
                        e120Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130Y2 */
                        e130Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140Y2 */
                        e140Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_LSIT_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150Y2 */
                        e150Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_PART_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160Y2 */
                        e160Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170Y2 */
                        e170Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180Y2 */
                        e180Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190Y2 */
                        e190Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200Y2 */
                        e200Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210Y2 */
                        e210Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e220Y2 */
                        e220Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e230Y2 */
                        e230Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e240Y2 */
                        e240Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e250Y2 */
                        e250Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e260Y2 */
                        e260Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e270Y2 */
                        e270Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e280Y2 */
                        e280Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e290Y2 */
                        e290Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e300Y2 */
                        e300Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e310Y2 */
                        e310Y2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_CRF_COPY'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_CRF_COPY'") == 0 ) )
                     {
                        nGXsfl_179_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_179_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_179_idx, 4, 0)), (short)(4), "0") ;
                        lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
                        edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
                        edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
                        edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
                        edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
                        cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
                        cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
                        lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
                        lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
                        edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
                        A221TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",")) ;
                        n221TBM31_ORDER = false ;
                        A218TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
                        AV33D_SPACE = httpContext.cgiGet( edtavD_space_Internalname) ;
                        A219TBM31_CRF_NM = httpContext.cgiGet( edtTBM31_CRF_NM_Internalname) ;
                        n219TBM31_CRF_NM = false ;
                        cmbTBM31_STATUS.setName( cmbTBM31_STATUS.getInternalname() );
                        cmbTBM31_STATUS.setValue( httpContext.cgiGet( cmbTBM31_STATUS.getInternalname()) );
                        A551TBM31_STATUS = httpContext.cgiGet( cmbTBM31_STATUS.getInternalname()) ;
                        n551TBM31_STATUS = false ;
                        cmbTBM31_DEL_FLG.setName( cmbTBM31_DEL_FLG.getInternalname() );
                        cmbTBM31_DEL_FLG.setValue( httpContext.cgiGet( cmbTBM31_DEL_FLG.getInternalname()) );
                        A223TBM31_DEL_FLG = httpContext.cgiGet( cmbTBM31_DEL_FLG.getInternalname()) ;
                        n223TBM31_DEL_FLG = false ;
                        A217TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0203", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0203", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e320Y2 */
                              e320Y2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e330Y2 */
                              e330Y2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e340Y2 */
                              e340Y2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e350Y2 */
                              e350Y2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_CRF_COPY'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e360Y2 */
                              e360Y2 ();
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
                                 /* Set Refresh If H_crf_nm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_CRF_NM"), AV11H_CRF_NM) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_status Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_STATUS"), AV16H_STATUS) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_del_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DEL_FLG"), AV12H_DEL_FLG) != 0 )
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
                  else if ( nCmpId == 203 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0203", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0Y2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0Y2( ) ;
         }
      }
   }

   public void pa0Y2( )
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
                  AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
                  }
               }
            }
         }
         radavD_status.setName( "vD_STATUS" );
         radavD_status.setWebtags( "" );
         radavD_del_flg.setName( "vD_DEL_FLG" );
         radavD_del_flg.setWebtags( "" );
         GXCCtl = "TBM31_STATUS_" + sGXsfl_179_idx ;
         cmbTBM31_STATUS.setName( GXCCtl );
         cmbTBM31_STATUS.setWebtags( "" );
         if ( ( cmbTBM31_STATUS.getItemCount() > 0 ) && (GXutil.strcmp("", A551TBM31_STATUS)==0) )
         {
            A551TBM31_STATUS = cmbTBM31_STATUS.getItemValue((short)(1)) ;
            n551TBM31_STATUS = false ;
         }
         GXCCtl = "TBM31_DEL_FLG_" + sGXsfl_179_idx ;
         cmbTBM31_DEL_FLG.setName( GXCCtl );
         cmbTBM31_DEL_FLG.setWebtags( "" );
         if ( ( cmbTBM31_DEL_FLG.getItemCount() > 0 ) && (GXutil.strcmp("", A223TBM31_DEL_FLG)==0) )
         {
            A223TBM31_DEL_FLG = cmbTBM31_DEL_FLG.getItemValue((short)(1)) ;
            n223TBM31_DEL_FLG = false ;
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_179_idx ,
                                 String sGXsfl_179_idx ,
                                 String AV33D_SPACE )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
      edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
      edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
      cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
      cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
      lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
      lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
      edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
      while ( nGXsfl_179_idx <= nRC_Grid1 )
      {
         sendrow_1792( ) ;
         nGXsfl_179_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_179_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_179_idx+1)) ;
         sGXsfl_179_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_179_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
         edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
         edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
         edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
         edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
         cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
         cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
         lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
         lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
         edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf0Y2( ) ;
      /* End function Refresh */
   }

   public void rf0Y2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(179) ;
      nGXsfl_179_idx = (short)(1) ;
      sGXsfl_179_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_179_idx, 4, 0)), (short)(4), "0") ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
      edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
      edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
      cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
      cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
      lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
      lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
      edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
      /* Execute user event: e330Y2 */
      e330Y2 ();
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
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
         edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
         edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
         edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
         edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
         cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
         cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
         lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
         lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
         edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV11H_CRF_NM ,
                                              AV16H_STATUS ,
                                              AV12H_DEL_FLG ,
                                              A219TBM31_CRF_NM ,
                                              A551TBM31_STATUS ,
                                              A223TBM31_DEL_FLG ,
                                              AV15H_SRCH_FLG ,
                                              new Long(AV18P_STUDY_ID) ,
                                              new Long(A217TBM31_STUDY_ID) },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.LONG
                                              }
         });
         lV11H_CRF_NM = GXutil.padr( GXutil.rtrim( AV11H_CRF_NM), 100, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
         /* Using cursor H000Y2 */
         pr_default.execute(0, new Object[] {new Long(AV18P_STUDY_ID), AV15H_SRCH_FLG, lV11H_CRF_NM, AV16H_STATUS, AV12H_DEL_FLG});
         nGXsfl_179_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A217TBM31_STUDY_ID = H000Y2_A217TBM31_STUDY_ID[0] ;
            A218TBM31_CRF_ID = H000Y2_A218TBM31_CRF_ID[0] ;
            A223TBM31_DEL_FLG = H000Y2_A223TBM31_DEL_FLG[0] ;
            n223TBM31_DEL_FLG = H000Y2_n223TBM31_DEL_FLG[0] ;
            A551TBM31_STATUS = H000Y2_A551TBM31_STATUS[0] ;
            n551TBM31_STATUS = H000Y2_n551TBM31_STATUS[0] ;
            A219TBM31_CRF_NM = H000Y2_A219TBM31_CRF_NM[0] ;
            n219TBM31_CRF_NM = H000Y2_n219TBM31_CRF_NM[0] ;
            A221TBM31_ORDER = H000Y2_A221TBM31_ORDER[0] ;
            n221TBM31_ORDER = H000Y2_n221TBM31_ORDER[0] ;
            /* Execute user event: e340Y2 */
            e340Y2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(179) ;
         wb0Y0( ) ;
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
                                           AV11H_CRF_NM ,
                                           AV16H_STATUS ,
                                           AV12H_DEL_FLG ,
                                           A219TBM31_CRF_NM ,
                                           A551TBM31_STATUS ,
                                           A223TBM31_DEL_FLG ,
                                           AV15H_SRCH_FLG ,
                                           new Long(AV18P_STUDY_ID) ,
                                           new Long(A217TBM31_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV11H_CRF_NM = GXutil.padr( GXutil.rtrim( AV11H_CRF_NM), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      /* Using cursor H000Y3 */
      pr_default.execute(1, new Object[] {new Long(AV18P_STUDY_ID), AV15H_SRCH_FLG, lV11H_CRF_NM, AV16H_STATUS, AV12H_DEL_FLG});
      GRID1_nRecordCount = H000Y3_AGRID1_nRecordCount[0] ;
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

   public void strup0Y0( )
   {
      /* Before Start, stand alone formulas. */
      AV66Pgmname = "B402_WP07_CRF_LIST" ;
      AV65Pgmdesc = "試験登録（CRF一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_space_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e320Y2 */
      e320Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV10H_A_PAGING_SDT);
         /* Read variables values. */
         AV7D_CRF_NM = httpContext.cgiGet( edtavD_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
         AV9D_STATUS = httpContext.cgiGet( radavD_status.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
         AV8D_DEL_FLG = httpContext.cgiGet( radavD_del_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV15H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         AV11H_CRF_NM = httpContext.cgiGet( edtavH_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
         AV16H_STATUS = httpContext.cgiGet( edtavH_status_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
         AV12H_DEL_FLG = httpContext.cgiGet( edtavH_del_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_PAGE");
            GX_FocusControl = edtavCtlmax_page_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_FIRST");
            GX_FocusControl = edtavCtlpage_disp_first_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_LAST");
            GX_FocusControl = edtavCtlpage_disp_last_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV17P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV18P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0203") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0203", "");
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
      /* Execute user event: e320Y2 */
      e320Y2 ();
      if (returnInSub) return;
   }

   public void e320Y2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B402" ;
      AV6C_GAMEN_TITLE = AV65Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV13H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV33D_SPACE = "　" ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0203",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e330Y2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV13H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
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
      AV32W_TOP_LINE_NO = (long)(subGrid1_Rows*(subgrid1_currentpage( )-1)+1) ;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   private void e340Y2( )
   {
      /* Grid1_Load Routine */
      AV25W_CNT = (long)(AV25W_CNT+1) ;
      if ( AV25W_CNT >= AV32W_TOP_LINE_NO )
      {
         edtTBM31_STUDY_ID_Visible = 0 ;
         if ( AV30W_REG_ENABEL && ( GXutil.strcmp(A551TBM31_STATUS, "1") != 0 ) && ( GXutil.strcmp(A223TBM31_DEL_FLG, "0") == 0 ) )
         {
            lblTxt_crf_copy_Visible = 1 ;
            lblTxt_btn_edit_Visible = 1 ;
            lblTxt_btn_edit_Linktarget = "_blank" ;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(A217TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A218TBM31_CRF_ID,4,0))) ;
            lblTxt_btn_edit_Link = formatLink("b402_wp11_crf_designer") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            lblTxt_crf_copy_Visible = 0 ;
            lblTxt_btn_edit_Visible = 0 ;
            lblTxt_btn_edit_Linktarget = "" ;
            lblTxt_btn_edit_Link = "" ;
         }
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(179) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_1792( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void e110Y2( )
   {
      /* 'BTN_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] = AV19W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] = AV21W_A_RESULT_MSG_SDT ;
         new b402_pc16_crf_ref_chk(remoteHandle, context).execute( AV18P_STUDY_ID, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4) ;
         AV19W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[0] ;
         AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
         if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV67GXV30 = 1 ;
            while ( AV67GXV30 <= AV21W_A_RESULT_MSG_SDT.size() )
            {
               AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV67GXV30));
               httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV67GXV30 = (int)(AV67GXV30+1) ;
            }
         }
      }
   }

   public void e120Y2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         AV31W_SESSION.setValue(AV66Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e130Y2( )
   {
      /* 'BTN_SRCH' Routine */
      AV15H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
   }

   public void e140Y2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   public void e150Y2( )
   {
      /* 'BTN_LSIT_IMPORT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(2,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp09_import_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e160Y2( )
   {
      /* 'BTN_PART_IMPORT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp09_import_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e170Y2( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e350Y2( )
   {
      /* 'BTN_SEL' Routine */
      AV31W_SESSION.setValue(AV66Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(A217TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(GXutil.trim( GXutil.str( A218TBM31_CRF_ID, 4, 0)))) ;
      httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e360Y2( )
   {
      /* 'BTN_CRF_COPY' Routine */
      AV28W_ERRFLG = false ;
      /* Using cursor H000Y4 */
      pr_default.execute(2, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A231TBM32_STUDY_ID = H000Y4_A231TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A231TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A231TBM32_STUDY_ID, 10, 0)));
         A232TBM32_CRF_ID = H000Y4_A232TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A232TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A232TBM32_CRF_ID, 4, 0)));
         AV28W_ERRFLG = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y5 */
         pr_default.execute(3, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A246TBM33_STUDY_ID = H000Y5_A246TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            A247TBM33_CRF_ID = H000Y5_A247TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y6 */
         pr_default.execute(4, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A459TBM34_STUDY_ID = H000Y6_A459TBM34_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A459TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A459TBM34_STUDY_ID, 10, 0)));
            A460TBM34_CRF_ID = H000Y6_A460TBM34_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A460TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A460TBM34_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y7 */
         pr_default.execute(5, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A471TBM35_STUDY_ID = H000Y7_A471TBM35_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A471TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A471TBM35_STUDY_ID, 10, 0)));
            A472TBM35_CRF_ID = H000Y7_A472TBM35_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A472TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A472TBM35_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y8 */
         pr_default.execute(6, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A484TBM36_STUDY_ID = H000Y8_A484TBM36_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            A485TBM36_CRF_ID = H000Y8_A485TBM36_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y9 */
         pr_default.execute(7, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A271TBM37_STUDY_ID = H000Y9_A271TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            A272TBM37_CRF_ID = H000Y9_A272TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(7);
         }
         pr_default.close(7);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Y10 */
         pr_default.execute(8, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A259TBM41_STUDY_ID = H000Y10_A259TBM41_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            A260TBM41_CRF_ID = H000Y10_A260TBM41_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
      if ( ! AV28W_ERRFLG )
      {
         AV31W_SESSION.setValue(AV66Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(A217TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A218TBM31_CRF_ID,4,0))) ;
         httpContext.wjLoc = formatLink("b402_wp10_crf_ref_crt") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         GXt_char2 = AV29W_MSG ;
         GXv_char5[0] = GXt_char2 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00065", "", "", "", "", "", GXv_char5) ;
         b402_wp07_crf_list_impl.this.GXt_char2 = GXv_char5[0] ;
         AV29W_MSG = GXt_char2 ;
         GXt_char2 = AV24W_A821_JS ;
         GXv_char5[0] = GXt_char2 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV29W_MSG, "", "", "", GXv_char5) ;
         b402_wp07_crf_list_impl.this.GXt_char2 = GXv_char5[0] ;
         AV24W_A821_JS = GXt_char2 ;
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H000Y11 */
      pr_default.execute(9, new Object[] {new Long(AV18P_STUDY_ID)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A186TBM21_STUDY_ID = H000Y11_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H000Y11_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H000Y11_n187TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A187TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      if ( AV17P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV31W_SESSION.getValue(AV66Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      cmbTBM31_STATUS.removeAllItems();
      cmbTBM31_STATUS.addItem("", "", (short)(0));
      cmbTBM31_STATUS.addItem("0", gxdomainct_status.getDescription((String)"0"), (short)(0));
      cmbTBM31_STATUS.addItem("1", gxdomainct_status.getDescription((String)"1"), (short)(0));
      cmbTBM31_STATUS.addItem("9", gxdomainct_status.getDescription((String)"9"), (short)(0));
      cmbTBM31_DEL_FLG.removeAllItems();
      cmbTBM31_DEL_FLG.addItem("", "", (short)(0));
      AV77GXV32 = 1 ;
      AV76GXV31 = gxdomainct_del_flg.getValues() ;
      while ( AV77GXV32 <= AV76GXV31.size() )
      {
         AV26W_DEL_FLG = (String)AV76GXV31.elementAt(-1+AV77GXV32) ;
         cmbTBM31_DEL_FLG.addItem(AV26W_DEL_FLG, gxdomainct_del_flg.getDescription((String)AV26W_DEL_FLG), (short)(0));
         AV77GXV32 = (int)(AV77GXV32+1) ;
      }
      radavD_status.removeAllItems();
      radavD_status.addItem("", "全て", (short)(0));
      radavD_status.addItem("0", gxdomainct_status.getDescription((String)"0"), (short)(0));
      radavD_status.addItem("1", gxdomainct_status.getDescription((String)"1"), (short)(0));
      radavD_status.addItem("9", gxdomainct_status.getDescription((String)"9"), (short)(0));
      radavD_del_flg.removeAllItems();
      radavD_del_flg.addItem("", "全て", (short)(0));
      radavD_del_flg.addItem("0", gxdomainct_del_flg.getDescription((String)"0"), (short)(0));
      radavD_del_flg.addItem("1", gxdomainct_del_flg.getDescription((String)"1"), (short)(0));
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV31W_SESSION.setValue(AV66Pgmname+"_CRF_NM", AV7D_CRF_NM);
      AV31W_SESSION.setValue(AV66Pgmname+"_STATUS", AV9D_STATUS);
      AV31W_SESSION.setValue(AV66Pgmname+"_DEL_FLG", AV8D_DEL_FLG);
      AV31W_SESSION.setValue(AV66Pgmname+"_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S232( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV7D_CRF_NM = AV31W_SESSION.getValue(AV66Pgmname+"_CRF_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
      AV9D_STATUS = AV31W_SESSION.getValue(AV66Pgmname+"_STATUS") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
      AV8D_DEL_FLG = AV31W_SESSION.getValue(AV66Pgmname+"_DEL_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
      AV15H_SRCH_FLG = AV31W_SESSION.getValue(AV66Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV31W_SESSION.remove(AV66Pgmname+"_CRF_NM");
      AV31W_SESSION.remove(AV66Pgmname+"_STATUS");
      AV31W_SESSION.remove(AV66Pgmname+"_DEL_FLG");
      AV31W_SESSION.remove(AV66Pgmname+"_SRCH_FLG");
   }

   public void S212( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV11H_CRF_NM = AV7D_CRF_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      AV16H_STATUS = AV9D_STATUS ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
      AV12H_DEL_FLG = AV8D_DEL_FLG ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
   }

   public void S192( )
   {
      /* 'SUB_GET_PROC_ENABLE' Routine */
      GXt_boolean6 = AV30W_REG_ENABEL ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new b402_pc22_is_study_run(remoteHandle, context).execute( AV18P_STUDY_ID, GXv_boolean7) ;
      b402_wp07_crf_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      GXt_boolean8 = AV30W_REG_ENABEL ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV14H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp07_crf_list_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      AV30W_REG_ENABEL = (GXt_boolean6 ? false : GXt_boolean8) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT10[0] = AV20W_A_LOGIN_SDT;
      GXv_char5[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT10, GXv_char5) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT10[0] ;
      b402_wp07_crf_list_impl.this.AV27W_ERRCD = GXv_char5[0] ;
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
      AV7D_CRF_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
      AV9D_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
      AV8D_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
      AV11H_CRF_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      AV16H_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
      AV12H_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV15H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
      AV23W_A819_JS = "" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV24W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV24W_A821_JS ;
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
      GXv_char5[0] = AV14H_KNGN_FLG ;
      GXv_char11[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char5, GXv_char11) ;
      b402_wp07_crf_list_impl.this.AV14H_KNGN_FLG = GXv_char5[0] ;
      b402_wp07_crf_list_impl.this.AV27W_ERRCD = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S24616( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp07_crf_list");
   }

   public void e180Y2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e190Y2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e200Y2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e210Y2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e220Y2( )
   {
      /* 'PAGE01' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e230Y2( )
   {
      /* 'PAGE02' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e240Y2( )
   {
      /* 'PAGE03' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e250Y2( )
   {
      /* 'PAGE04' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e260Y2( )
   {
      /* 'PAGE05' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e270Y2( )
   {
      /* 'PAGE06' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e280Y2( )
   {
      /* 'PAGE07' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e290Y2( )
   {
      /* 'PAGE08' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e300Y2( )
   {
      /* 'PAGE09' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e310Y2( )
   {
      /* 'PAGE10' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT12[0] = AV10H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT12) ;
      AV10H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT12[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV15H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char2 = AV29W_MSG ;
            GXv_char11[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char11) ;
            b402_wp07_crf_list_impl.this.GXt_char2 = GXv_char11[0] ;
            AV29W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
      }
      else
      {
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      lblTxt_btn_reg_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_chk_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_chk_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_chk_Visible, 5, 0)));
      lblTxt_btn_lsit_import_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_lsit_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_lsit_import_Visible, 5, 0)));
      lblTxt_btn_part_import_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_part_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_part_import_Visible, 5, 0)));
   }

   public void wb_table2_205_0Y2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(209);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV15H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV15H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(210);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(211);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         wb_table3_212_0Y2( true) ;
      }
      else
      {
         wb_table3_212_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table3_212_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_228_0Y2( true) ;
      }
      else
      {
         wb_table4_228_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table4_228_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_205_0Y2e( true) ;
      }
      else
      {
         wb_table2_205_0Y2e( false) ;
      }
   }

   public void wb_table4_228_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(233);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "MAX_PAGE", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_page_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(238);\"", "", "", "", "", edtavCtlmax_page_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "REC_CNT", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(243);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 248,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(248);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 253,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(253);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 258,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(258);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 263,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(263);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 268,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(268);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(273);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 278,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(278);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 283,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(283);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 288,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(288);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE09", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 293,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(293);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE10", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 298,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(298);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP01", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 303,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(303);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP02", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 308,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(308);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP03", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(313);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP04", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 318,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(318);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP05", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 323,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(323);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP06", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 328,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(328);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP07", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 333,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(333);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP08", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 338,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(338);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP09", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 343,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(343);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP10", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 348,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(348);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock28_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 353,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(353);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock29_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 358,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(358);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "PAGE_DISP_FIRST", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 363,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_first_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(363);\"", "", "", "", "", edtavCtlpage_disp_first_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "PAGE_DISP_LAST", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 368,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_last_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(368);\"", "", "", "", "", edtavCtlpage_disp_last_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 373,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(373);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_228_0Y2e( true) ;
      }
      else
      {
         wb_table4_228_0Y2e( false) ;
      }
   }

   public void wb_table3_212_0Y2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "CRF名称", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_crf_nm_Internalname, GXutil.rtrim( AV11H_CRF_NM), GXutil.rtrim( localUtil.format( AV11H_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(217);\"", "", "", "", "", edtavH_crf_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "状態", "", "", lblTextblock37_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 222,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_status_Internalname, GXutil.rtrim( AV16H_STATUS), GXutil.rtrim( localUtil.format( AV16H_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(222);\"", "", "", "", "", edtavH_status_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, "削除フラグ", "", "", lblTextblock38_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_del_flg_Internalname, GXutil.rtrim( AV12H_DEL_FLG), GXutil.rtrim( localUtil.format( AV12H_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(227);\"", "", "", "", "", edtavH_del_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_212_0Y2e( true) ;
      }
      else
      {
         wb_table3_212_0Y2e( false) ;
      }
   }

   public void wb_table1_2_0Y2( boolean wbgen )
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
         wb_table5_6_0Y2( true) ;
      }
      else
      {
         wb_table5_6_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table5_6_0Y2e( boolean wbgen )
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
         wb_table1_2_0Y2e( true) ;
      }
      else
      {
         wb_table1_2_0Y2e( false) ;
      }
   }

   public void wb_table5_6_0Y2( boolean wbgen )
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
         wb_table6_12_0Y2( true) ;
      }
      else
      {
         wb_table6_12_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table6_12_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table7_26_0Y2( true) ;
      }
      else
      {
         wb_table7_26_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table7_26_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0203"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0203"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0203"+"");
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
         wb_table5_6_0Y2e( true) ;
      }
      else
      {
         wb_table5_6_0Y2e( false) ;
      }
   }

   public void wb_table7_26_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_29_0Y2( true) ;
      }
      else
      {
         wb_table8_29_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table8_29_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_26_0Y2e( true) ;
      }
      else
      {
         wb_table7_26_0Y2e( false) ;
      }
   }

   public void wb_table8_29_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_32_0Y2( true) ;
      }
      else
      {
         wb_table9_32_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table9_32_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table10_65_0Y2( true) ;
      }
      else
      {
         wb_table10_65_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table10_65_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_29_0Y2e( true) ;
      }
      else
      {
         wb_table8_29_0Y2e( false) ;
      }
   }

   public void wb_table10_65_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_list_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px\">") ;
         wb_table11_68_0Y2( true) ;
      }
      else
      {
         wb_table11_68_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table11_68_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table12_164_0Y2( true) ;
      }
      else
      {
         wb_table12_164_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table12_164_0Y2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"179\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
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
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 935, (byte)(9), (byte)(0), ".", "")));
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
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV33D_SPACE));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_space_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A219TBM31_CRF_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A551TBM31_STATUS));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A223TBM31_DEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_crf_copy_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_btn_edit_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTBM31_STUDY_ID_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 179 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_179_idx-1) ;
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
         wb_table10_65_0Y2e( true) ;
      }
      else
      {
         wb_table10_65_0Y2e( false) ;
      }
   }

   public void wb_table12_164_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "表示順", "", "", lblTextblock41_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "CRF", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "状態", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "削除", "", "", lblTextblock47_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_164_0Y2e( true) ;
      }
      else
      {
         wb_table12_164_0Y2e( false) ;
      }
   }

   public void wb_table11_68_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area_Internalname, tblTbl_page_area_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_74_0Y2( true) ;
      }
      else
      {
         wb_table13_74_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table13_74_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_68_0Y2e( true) ;
      }
      else
      {
         wb_table11_68_0Y2e( false) ;
      }
   }

   public void wb_table13_74_0Y2( boolean wbgen )
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
         wb_table14_77_0Y2( true) ;
      }
      else
      {
         wb_table14_77_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table14_77_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_83_0Y2( true) ;
      }
      else
      {
         wb_table15_83_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table15_83_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_89_0Y2( true) ;
      }
      else
      {
         wb_table16_89_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table16_89_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_95_0Y2( true) ;
      }
      else
      {
         wb_table17_95_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table17_95_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_101_0Y2( true) ;
      }
      else
      {
         wb_table18_101_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table18_101_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_107_0Y2( true) ;
      }
      else
      {
         wb_table19_107_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table19_107_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_113_0Y2( true) ;
      }
      else
      {
         wb_table20_113_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table20_113_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_119_0Y2( true) ;
      }
      else
      {
         wb_table21_119_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table21_119_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_125_0Y2( true) ;
      }
      else
      {
         wb_table22_125_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table22_125_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_131_0Y2( true) ;
      }
      else
      {
         wb_table23_131_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table23_131_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_137_0Y2( true) ;
      }
      else
      {
         wb_table24_137_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table24_137_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_143_0Y2( true) ;
      }
      else
      {
         wb_table25_143_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table25_143_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_149_0Y2( true) ;
      }
      else
      {
         wb_table26_149_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table26_149_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_155_0Y2( true) ;
      }
      else
      {
         wb_table27_155_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table27_155_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_74_0Y2e( true) ;
      }
      else
      {
         wb_table13_74_0Y2e( false) ;
      }
   }

   public void wb_table27_155_0Y2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_155_0Y2e( true) ;
      }
      else
      {
         wb_table27_155_0Y2e( false) ;
      }
   }

   public void wb_table26_149_0Y2( boolean wbgen )
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
         ClassString = lblTxt_next_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_149_0Y2e( true) ;
      }
      else
      {
         wb_table26_149_0Y2e( false) ;
      }
   }

   public void wb_table25_143_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page10_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_143_0Y2e( true) ;
      }
      else
      {
         wb_table25_143_0Y2e( false) ;
      }
   }

   public void wb_table24_137_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page09_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_137_0Y2e( true) ;
      }
      else
      {
         wb_table24_137_0Y2e( false) ;
      }
   }

   public void wb_table23_131_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page08_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_131_0Y2e( true) ;
      }
      else
      {
         wb_table23_131_0Y2e( false) ;
      }
   }

   public void wb_table22_125_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page07_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_125_0Y2e( true) ;
      }
      else
      {
         wb_table22_125_0Y2e( false) ;
      }
   }

   public void wb_table21_119_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page06_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_119_0Y2e( true) ;
      }
      else
      {
         wb_table21_119_0Y2e( false) ;
      }
   }

   public void wb_table20_113_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page05_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_113_0Y2e( true) ;
      }
      else
      {
         wb_table20_113_0Y2e( false) ;
      }
   }

   public void wb_table19_107_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page04_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_107_0Y2e( true) ;
      }
      else
      {
         wb_table19_107_0Y2e( false) ;
      }
   }

   public void wb_table18_101_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page03_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_101_0Y2e( true) ;
      }
      else
      {
         wb_table18_101_0Y2e( false) ;
      }
   }

   public void wb_table17_95_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page02_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_95_0Y2e( true) ;
      }
      else
      {
         wb_table17_95_0Y2e( false) ;
      }
   }

   public void wb_table16_89_0Y2( boolean wbgen )
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
         ClassString = lblTxt_page01_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_89_0Y2e( true) ;
      }
      else
      {
         wb_table16_89_0Y2e( false) ;
      }
   }

   public void wb_table15_83_0Y2( boolean wbgen )
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
         ClassString = lblTxt_back_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_83_0Y2e( true) ;
      }
      else
      {
         wb_table15_83_0Y2e( false) ;
      }
   }

   public void wb_table14_77_0Y2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_77_0Y2e( true) ;
      }
      else
      {
         wb_table14_77_0Y2e( false) ;
      }
   }

   public void wb_table9_32_0Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:90px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "CRF名", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_nm_Internalname, GXutil.rtrim( AV7D_CRF_NM), GXutil.rtrim( localUtil.format( AV7D_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "", "", "", "", edtavD_crf_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "状態", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_status, radavD_status.getInternalname(), AV9D_STATUS, "", 1, 1, 0, 0, StyleString, ClassString, 0, radavD_status.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "削除", "", "", lblTextblock34_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:220px\">") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_179_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_del_flg, radavD_del_flg.getInternalname(), AV8D_DEL_FLG, "", 1, 1, 0, 0, StyleString, ClassString, 0, radavD_del_flg.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"Submit\" colspan=\"6\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table28_53_0Y2( true) ;
      }
      else
      {
         wb_table28_53_0Y2( false) ;
      }
      return  ;
   }

   public void wb_table28_53_0Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_32_0Y2e( true) ;
      }
      else
      {
         wb_table9_32_0Y2e( false) ;
      }
   }

   public void wb_table28_53_0Y2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "E\\'BTN_SRCH\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "クリア（F6）", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_53_0Y2e( true) ;
      }
      else
      {
         wb_table28_53_0Y2e( false) ;
      }
   }

   public void wb_table6_12_0Y2( boolean wbgen )
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
         ClassString = "TextBlockBtnList150" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_chk_Internalname, "整合性チェック（F2）", "", "", lblTxt_btn_chk_Jsonclick, "E\\'BTN_CHK\\'.", StyleString, ClassString, 5, "", lblTxt_btn_chk_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList150" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_lsit_import_Internalname, "選択肢一覧取込（F7）", "", "", lblTxt_btn_lsit_import_Jsonclick, "E\\'BTN_LSIT_IMPORT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_lsit_import_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList120" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_part_import_Internalname, "部品取込（F8）", "", "", lblTxt_btn_part_import_Jsonclick, "E\\'BTN_PART_IMPORT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_part_import_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_12_0Y2e( true) ;
      }
      else
      {
         wb_table6_12_0Y2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
      AV18P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
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
      pa0Y2( ) ;
      ws0Y2( ) ;
      we0Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1505648");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp07_crf_list.js", "?1505648");
      /* End function include_jscripts */
   }

   public void sendrow_1792( )
   {
      wb0Y0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_179_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_179_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_179_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_179_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_179_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_179_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_179_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(935),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:45px\""});
         /* Text block */
         ClassString = "TextBlockBtn040" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"E\\'BTN_SEL\\'."+sGXsfl_179_idx,StyleString,ClassString,new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";width:50px\""});
         /* Single line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM31_ORDER_Internalname,GXutil.ltrim( localUtil.ntoc( A221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A221TBM31_ORDER), "ZZZZ9"),"","","","","",edtTBM31_ORDER_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(179),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM31_CRF_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A218TBM31_CRF_ID), "ZZZ9"),"","","","","",edtTBM31_CRF_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(179),new Integer(1),new Integer(1),new Boolean(true),"right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 190,'',false,'"+sGXsfl_179_idx+"',179)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_space_Internalname,GXutil.rtrim( AV33D_SPACE),GXutil.rtrim( localUtil.format( AV33D_SPACE, "X")),TempTags+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(190);\"" : " "),"","","","",edtavD_space_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_space_Enabled),new Integer(0),new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(179),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Single line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM31_CRF_NM_Internalname,GXutil.rtrim( A219TBM31_CRF_NM),"","","","","","",edtTBM31_CRF_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(179),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         if ( ( nGXsfl_179_idx == 1 ) && httpContext.isAjaxCallMode( ) )
         {
            GXCCtl = "TBM31_STATUS_" + sGXsfl_179_idx ;
            cmbTBM31_STATUS.setName( GXCCtl );
            cmbTBM31_STATUS.setWebtags( "" );
            if ( ( cmbTBM31_STATUS.getItemCount() > 0 ) && (GXutil.strcmp("", A551TBM31_STATUS)==0) )
            {
               A551TBM31_STATUS = cmbTBM31_STATUS.getItemValue((short)(1)) ;
               n551TBM31_STATUS = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, httpContext.isAjaxCallMode( ), new Object[] {cmbTBM31_STATUS,cmbTBM31_STATUS.getInternalname(),A551TBM31_STATUS,new Integer(1),cmbTBM31_STATUS.getJsonclick(),new Integer(0),"","svchar","",new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"",StyleString,ClassString,"","",new Boolean(true)});
         cmbTBM31_STATUS.setValue( A551TBM31_STATUS );
         httpContext.ajax_rsp_assign_prop("", false, cmbTBM31_STATUS.getInternalname(), "Values", cmbTBM31_STATUS.ToJavascriptSource());
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         if ( ( nGXsfl_179_idx == 1 ) && httpContext.isAjaxCallMode( ) )
         {
            GXCCtl = "TBM31_DEL_FLG_" + sGXsfl_179_idx ;
            cmbTBM31_DEL_FLG.setName( GXCCtl );
            cmbTBM31_DEL_FLG.setWebtags( "" );
            if ( ( cmbTBM31_DEL_FLG.getItemCount() > 0 ) && (GXutil.strcmp("", A223TBM31_DEL_FLG)==0) )
            {
               A223TBM31_DEL_FLG = cmbTBM31_DEL_FLG.getItemValue((short)(1)) ;
               n223TBM31_DEL_FLG = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, httpContext.isAjaxCallMode( ), new Object[] {cmbTBM31_DEL_FLG,cmbTBM31_DEL_FLG.getInternalname(),A223TBM31_DEL_FLG,new Integer(1),cmbTBM31_DEL_FLG.getJsonclick(),new Integer(0),"","svchar","",new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"",StyleString,ClassString,"","",new Boolean(true)});
         cmbTBM31_DEL_FLG.setValue( A223TBM31_DEL_FLG );
         httpContext.ajax_rsp_assign_prop("", false, cmbTBM31_DEL_FLG.getInternalname(), "Values", cmbTBM31_DEL_FLG.ToJavascriptSource());
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:60px\""});
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_crf_copy_Internalname,"参照作成","","",lblTxt_crf_copy_Jsonclick,"E\\'BTN_CRF_COPY\\'."+sGXsfl_179_idx,StyleString,ClassString,new Integer(5),"",new Integer(lblTxt_crf_copy_Visible),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:40px\""});
         /* Text block */
         ClassString = "TextBlockBtn040s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_btn_edit_Internalname,"編集",lblTxt_btn_edit_Link,lblTxt_btn_edit_Linktarget,lblTxt_btn_edit_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(lblTxt_btn_edit_Visible),new Integer(1),new Integer(0)});
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
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "color:#FF0000;" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBM31_STUDY_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A217TBM31_STUDY_ID), "ZZZZZZZZZ9"),"","","","","",edtTBM31_STUDY_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtTBM31_STUDY_ID_Visible),new Integer(0),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(179),new Integer(1),new Integer(1),new Boolean(true),"right"});
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
               if ( ((int)(nGXsfl_179_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_179_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_179_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_179_idx+1)) ;
         sGXsfl_179_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_179_idx, 4, 0)), (short)(4), "0") ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_179_idx ;
         edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_179_idx ;
         edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_179_idx ;
         edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_179_idx ;
         edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_179_idx ;
         cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_179_idx );
         cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_179_idx );
         lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_179_idx ;
         lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_179_idx ;
         edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_179_idx ;
      }
      /* End function sendrow_1792 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_chk_Internalname = "TXT_BTN_CHK" ;
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_lsit_import_Internalname = "TXT_BTN_LSIT_IMPORT" ;
      lblTxt_btn_part_import_Internalname = "TXT_BTN_PART_IMPORT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavD_crf_nm_Internalname = "vD_CRF_NM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      radavD_status.setInternalname( "vD_STATUS" );
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      radavD_del_flg.setInternalname( "vD_DEL_FLG" );
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
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
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtavH_crf_nm_Internalname = "vH_CRF_NM" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtavH_status_Internalname = "vH_STATUS" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtavH_del_flg_Internalname = "vH_DEL_FLG" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavCtlmax_page_Internalname = "CTLMAX_PAGE" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtavCtlpage_no_Internalname = "CTLPAGE_NO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavCtlpage01_Internalname = "CTLPAGE01" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtavCtlpage02_Internalname = "CTLPAGE02" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtavCtlpage03_Internalname = "CTLPAGE03" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtavCtlpage04_Internalname = "CTLPAGE04" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtavCtlpage05_Internalname = "CTLPAGE05" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtavCtlpage06_Internalname = "CTLPAGE06" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtavCtlpage07_Internalname = "CTLPAGE07" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtavCtlpage08_Internalname = "CTLPAGE08" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtavCtlpage09_Internalname = "CTLPAGE09" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtavCtlpage10_Internalname = "CTLPAGE10" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCtlpage_disp01_Internalname = "CTLPAGE_DISP01" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtavCtlpage_disp02_Internalname = "CTLPAGE_DISP02" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtavCtlpage_disp03_Internalname = "CTLPAGE_DISP03" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtavCtlpage_disp04_Internalname = "CTLPAGE_DISP04" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtavCtlpage_disp05_Internalname = "CTLPAGE_DISP05" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtavCtlpage_disp06_Internalname = "CTLPAGE_DISP06" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtavCtlpage_disp07_Internalname = "CTLPAGE_DISP07" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtavCtlpage_disp08_Internalname = "CTLPAGE_DISP08" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtavCtlpage_disp09_Internalname = "CTLPAGE_DISP09" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtavCtlpage_disp10_Internalname = "CTLPAGE_DISP10" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavCtlpage_disp_back_Internalname = "CTLPAGE_DISP_BACK" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavCtlpage_disp_next_Internalname = "CTLPAGE_DISP_NEXT" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtavCtlpage_disp_first_Internalname = "CTLPAGE_DISP_FIRST" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtavCtlpage_disp_last_Internalname = "CTLPAGE_DISP_LAST" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtavCtlpage_disp_area_Internalname = "CTLPAGE_DISP_AREA" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTBM31_STUDY_ID_Jsonclick = "" ;
      lblTxt_btn_edit_Linktarget = "" ;
      lblTxt_btn_edit_Link = "" ;
      lblTxt_btn_edit_Visible = 1 ;
      lblTxt_crf_copy_Visible = 1 ;
      cmbTBM31_DEL_FLG.setJsonclick( "" );
      cmbTBM31_STATUS.setJsonclick( "" );
      edtTBM31_CRF_NM_Jsonclick = "" ;
      edtavD_space_Jsonclick = "" ;
      edtavD_space_Visible = 1 ;
      edtTBM31_CRF_ID_Jsonclick = "" ;
      edtTBM31_ORDER_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridBase" ;
      lblTxt_btn_part_import_Visible = 1 ;
      lblTxt_btn_lsit_import_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      lblTxt_btn_chk_Visible = 1 ;
      radavD_del_flg.setJsonclick( "" );
      radavD_status.setJsonclick( "" );
      edtavD_crf_nm_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtTBM31_STUDY_ID_Visible = 1 ;
      lblTxt_btn_edit_Caption = "編集" ;
      lblTxt_crf_copy_Caption = "参照作成" ;
      edtavD_space_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      subGrid1_Width = 935 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavH_del_flg_Jsonclick = "" ;
      edtavH_status_Jsonclick = "" ;
      edtavH_crf_nm_Jsonclick = "" ;
      edtavCtlpage_disp_area_Jsonclick = "" ;
      edtavCtlpage_disp_last_Jsonclick = "" ;
      edtavCtlpage_disp_first_Jsonclick = "" ;
      edtavCtlpage_disp_next_Jsonclick = "" ;
      edtavCtlpage_disp_back_Jsonclick = "" ;
      edtavCtlpage_disp10_Jsonclick = "" ;
      edtavCtlpage_disp09_Jsonclick = "" ;
      edtavCtlpage_disp08_Jsonclick = "" ;
      edtavCtlpage_disp07_Jsonclick = "" ;
      edtavCtlpage_disp06_Jsonclick = "" ;
      edtavCtlpage_disp05_Jsonclick = "" ;
      edtavCtlpage_disp04_Jsonclick = "" ;
      edtavCtlpage_disp03_Jsonclick = "" ;
      edtavCtlpage_disp02_Jsonclick = "" ;
      edtavCtlpage_disp01_Jsonclick = "" ;
      edtavCtlpage10_Jsonclick = "" ;
      edtavCtlpage09_Jsonclick = "" ;
      edtavCtlpage08_Jsonclick = "" ;
      edtavCtlpage07_Jsonclick = "" ;
      edtavCtlpage06_Jsonclick = "" ;
      edtavCtlpage05_Jsonclick = "" ;
      edtavCtlpage04_Jsonclick = "" ;
      edtavCtlpage03_Jsonclick = "" ;
      edtavCtlpage02_Jsonclick = "" ;
      edtavCtlpage01_Jsonclick = "" ;
      edtavCtlpage_no_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavCtlmax_page_Jsonclick = "" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "(全100件)" ;
      tblTbl_list_Visible = 1 ;
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
                  /* Execute user subroutine: S24616 */
                  S24616 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV33D_SPACE = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV15H_SRCH_FLG = "" ;
      AV11H_CRF_NM = "" ;
      AV16H_STATUS = "" ;
      AV12H_DEL_FLG = "" ;
      AV10H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
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
      edtTBM31_ORDER_Internalname = "" ;
      edtTBM31_CRF_ID_Internalname = "" ;
      edtavD_space_Internalname = "" ;
      edtTBM31_CRF_NM_Internalname = "" ;
      lblTxt_crf_copy_Internalname = "" ;
      lblTxt_btn_edit_Internalname = "" ;
      edtTBM31_STUDY_ID_Internalname = "" ;
      A219TBM31_CRF_NM = "" ;
      A551TBM31_STATUS = "" ;
      A223TBM31_DEL_FLG = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV11H_CRF_NM = "" ;
      H000Y2_A217TBM31_STUDY_ID = new long[1] ;
      H000Y2_A218TBM31_CRF_ID = new short[1] ;
      H000Y2_A223TBM31_DEL_FLG = new String[] {""} ;
      H000Y2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H000Y2_A551TBM31_STATUS = new String[] {""} ;
      H000Y2_n551TBM31_STATUS = new boolean[] {false} ;
      H000Y2_A219TBM31_CRF_NM = new String[] {""} ;
      H000Y2_n219TBM31_CRF_NM = new boolean[] {false} ;
      H000Y2_A221TBM31_ORDER = new int[1] ;
      H000Y2_n221TBM31_ORDER = new boolean[] {false} ;
      H000Y3_AGRID1_nRecordCount = new int[1] ;
      AV66Pgmname = "" ;
      AV65Pgmdesc = "" ;
      AV7D_CRF_NM = "" ;
      AV9D_STATUS = "" ;
      AV8D_DEL_FLG = "" ;
      AV13H_INIT_FLG = "" ;
      AV14H_KNGN_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV19W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV31W_SESSION = httpContext.getWebSession();
      H000Y4_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      H000Y4_A231TBM32_STUDY_ID = new long[1] ;
      H000Y4_A232TBM32_CRF_ID = new short[1] ;
      H000Y5_A248TBM33_COND_NO = new short[1] ;
      H000Y5_A246TBM33_STUDY_ID = new long[1] ;
      H000Y5_A247TBM33_CRF_ID = new short[1] ;
      H000Y6_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H000Y6_A459TBM34_STUDY_ID = new long[1] ;
      H000Y6_A460TBM34_CRF_ID = new short[1] ;
      H000Y7_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      H000Y7_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      H000Y7_A471TBM35_STUDY_ID = new long[1] ;
      H000Y7_A472TBM35_CRF_ID = new short[1] ;
      H000Y8_A486TBM36_COND_NO = new short[1] ;
      H000Y8_A487TBM36_SELECT_CRF_ID = new short[1] ;
      H000Y8_A484TBM36_STUDY_ID = new long[1] ;
      H000Y8_A485TBM36_CRF_ID = new short[1] ;
      H000Y9_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      H000Y9_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      H000Y9_A271TBM37_STUDY_ID = new long[1] ;
      H000Y9_A272TBM37_CRF_ID = new short[1] ;
      H000Y10_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      H000Y10_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      H000Y10_A259TBM41_STUDY_ID = new long[1] ;
      H000Y10_A260TBM41_CRF_ID = new short[1] ;
      AV29W_MSG = "" ;
      AV24W_A821_JS = "" ;
      H000Y11_A186TBM21_STUDY_ID = new long[1] ;
      H000Y11_A187TBM21_STUDY_NM = new String[] {""} ;
      H000Y11_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      AV76GXV31 = new GxObjectCollection(String.class, "internal", "");
      AV26W_DEL_FLG = "" ;
      GXv_boolean7 = new boolean [1] ;
      GXv_boolean9 = new boolean [1] ;
      GXv_SdtA_LOGIN_SDT10 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV23W_A819_JS = "" ;
      GXv_char5 = new String [1] ;
      GXv_SdtA_PAGING_SDT12 = new SdtA_PAGING_SDT [1] ;
      GXv_char11 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock41_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
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
      lblTxt_study_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTxt_btn_chk_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_lsit_import_Jsonclick = "" ;
      lblTxt_btn_part_import_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      GXt_char1 = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      GXt_char2 = "" ;
      lblTxt_crf_copy_Jsonclick = "" ;
      lblTxt_btn_edit_Jsonclick = "" ;
      GXt_char13 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp07_crf_list__default(),
         new Object[] {
             new Object[] {
            H000Y2_A217TBM31_STUDY_ID, H000Y2_A218TBM31_CRF_ID, H000Y2_A223TBM31_DEL_FLG, H000Y2_n223TBM31_DEL_FLG, H000Y2_A551TBM31_STATUS, H000Y2_n551TBM31_STATUS, H000Y2_A219TBM31_CRF_NM, H000Y2_n219TBM31_CRF_NM, H000Y2_A221TBM31_ORDER, H000Y2_n221TBM31_ORDER
            }
            , new Object[] {
            H000Y3_AGRID1_nRecordCount
            }
            , new Object[] {
            H000Y4_A233TBM32_CRF_ITEM_CD, H000Y4_A231TBM32_STUDY_ID, H000Y4_A232TBM32_CRF_ID
            }
            , new Object[] {
            H000Y5_A248TBM33_COND_NO, H000Y5_A246TBM33_STUDY_ID, H000Y5_A247TBM33_CRF_ID
            }
            , new Object[] {
            H000Y6_A461TBM34_STYDY_AUTH_CD, H000Y6_A459TBM34_STUDY_ID, H000Y6_A460TBM34_CRF_ID
            }
            , new Object[] {
            H000Y7_A473TBM35_CRF_ITEM_CD, H000Y7_A474TBM35_STUDY_AUTH_CD, H000Y7_A471TBM35_STUDY_ID, H000Y7_A472TBM35_CRF_ID
            }
            , new Object[] {
            H000Y8_A486TBM36_COND_NO, H000Y8_A487TBM36_SELECT_CRF_ID, H000Y8_A484TBM36_STUDY_ID, H000Y8_A485TBM36_CRF_ID
            }
            , new Object[] {
            H000Y9_A372TBM37_CRF_ITEM_GRP_DIV, H000Y9_A273TBM37_CRF_ITEM_GRP_CD, H000Y9_A271TBM37_STUDY_ID, H000Y9_A272TBM37_CRF_ID
            }
            , new Object[] {
            H000Y10_A378TBM41_CRF_ITEM_GRP_DIV, H000Y10_A261TBM41_CRF_ITEM_GRP_CD, H000Y10_A259TBM41_STUDY_ID, H000Y10_A260TBM41_CRF_ID
            }
            , new Object[] {
            H000Y11_A186TBM21_STUDY_ID, H000Y11_A187TBM21_STUDY_NM, H000Y11_n187TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV66Pgmname = "B402_WP07_CRF_LIST" ;
      AV65Pgmdesc = "試験登録（CRF一覧）" ;
      /* GeneXus formulas. */
      AV66Pgmname = "B402_WP07_CRF_LIST" ;
      AV65Pgmdesc = "試験登録（CRF一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_space_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV17P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_179_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short A218TBM31_CRF_ID ;
   private short nCmpId ;
   private short Gx_err ;
   private short A232TBM32_CRF_ID ;
   private short A247TBM33_CRF_ID ;
   private short A460TBM34_CRF_ID ;
   private short A472TBM35_CRF_ID ;
   private short A485TBM36_CRF_ID ;
   private short A272TBM37_CRF_ID ;
   private short A260TBM41_CRF_ID ;
   private short subGrid1_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int A221TBM31_ORDER ;
   private int subGrid1_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int edtavD_space_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtTBM31_STUDY_ID_Visible ;
   private int lblTxt_crf_copy_Visible ;
   private int lblTxt_btn_edit_Visible ;
   private int AV67GXV30 ;
   private int AV77GXV32 ;
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
   private int tblTbl_list_Visible ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_chk_Visible ;
   private int lblTxt_btn_lsit_import_Visible ;
   private int lblTxt_btn_part_import_Visible ;
   private int subGrid1_Width ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_space_Visible ;
   private long wcpOAV18P_STUDY_ID ;
   private long AV18P_STUDY_ID ;
   private long AV32W_TOP_LINE_NO ;
   private long AV25W_CNT ;
   private long A217TBM31_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A459TBM34_STUDY_ID ;
   private long A471TBM35_STUDY_ID ;
   private long A484TBM36_STUDY_ID ;
   private long A271TBM37_STUDY_ID ;
   private long A259TBM41_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_179_idx="0001" ;
   private String AV33D_SPACE ;
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
   private String edtTBM31_ORDER_Internalname ;
   private String edtTBM31_CRF_ID_Internalname ;
   private String edtavD_space_Internalname ;
   private String edtTBM31_CRF_NM_Internalname ;
   private String lblTxt_crf_copy_Internalname ;
   private String lblTxt_btn_edit_Internalname ;
   private String edtTBM31_STUDY_ID_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV66Pgmname ;
   private String AV65Pgmdesc ;
   private String edtavD_crf_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_crf_nm_Internalname ;
   private String edtavH_status_Internalname ;
   private String edtavH_del_flg_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavCtlmax_page_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String edtavCtlpage_no_Internalname ;
   private String edtavCtlpage01_Internalname ;
   private String edtavCtlpage02_Internalname ;
   private String edtavCtlpage03_Internalname ;
   private String edtavCtlpage04_Internalname ;
   private String edtavCtlpage05_Internalname ;
   private String edtavCtlpage06_Internalname ;
   private String edtavCtlpage07_Internalname ;
   private String edtavCtlpage08_Internalname ;
   private String edtavCtlpage09_Internalname ;
   private String edtavCtlpage10_Internalname ;
   private String edtavCtlpage_disp01_Internalname ;
   private String edtavCtlpage_disp02_Internalname ;
   private String edtavCtlpage_disp03_Internalname ;
   private String edtavCtlpage_disp04_Internalname ;
   private String edtavCtlpage_disp05_Internalname ;
   private String edtavCtlpage_disp06_Internalname ;
   private String edtavCtlpage_disp07_Internalname ;
   private String edtavCtlpage_disp08_Internalname ;
   private String edtavCtlpage_disp09_Internalname ;
   private String edtavCtlpage_disp10_Internalname ;
   private String edtavCtlpage_disp_back_Internalname ;
   private String edtavCtlpage_disp_next_Internalname ;
   private String edtavCtlpage_disp_first_Internalname ;
   private String edtavCtlpage_disp_last_Internalname ;
   private String edtavCtlpage_disp_area_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_btn_edit_Linktarget ;
   private String lblTxt_btn_edit_Link ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXv_char5[] ;
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
   private String tblTbl_list_Internalname ;
   private String GXv_char11[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_chk_Internalname ;
   private String lblTxt_btn_lsit_import_Internalname ;
   private String lblTxt_btn_part_import_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavCtlmax_page_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavCtlpage_no_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtavCtlpage01_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtavCtlpage02_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtavCtlpage03_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtavCtlpage04_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtavCtlpage05_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtavCtlpage06_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtavCtlpage07_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtavCtlpage08_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtavCtlpage09_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtavCtlpage10_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavCtlpage_disp01_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtavCtlpage_disp02_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtavCtlpage_disp03_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtavCtlpage_disp04_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtavCtlpage_disp05_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtavCtlpage_disp06_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtavCtlpage_disp07_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtavCtlpage_disp08_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtavCtlpage_disp09_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtavCtlpage_disp10_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavCtlpage_disp_back_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavCtlpage_disp_next_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtavCtlpage_disp_first_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtavCtlpage_disp_last_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtavCtlpage_disp_area_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtavH_crf_nm_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtavH_status_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtavH_del_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String lblTxt_crf_copy_Caption ;
   private String lblTxt_btn_edit_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String tblTbl_page_area_Internalname ;
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
   private String lblTxt_study_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavD_crf_nm_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_chk_Jsonclick ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_lsit_import_Jsonclick ;
   private String lblTxt_btn_part_import_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String GXt_char1 ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtTBM31_ORDER_Jsonclick ;
   private String edtTBM31_CRF_ID_Jsonclick ;
   private String GXt_char2 ;
   private String edtavD_space_Jsonclick ;
   private String edtTBM31_CRF_NM_Jsonclick ;
   private String lblTxt_crf_copy_Jsonclick ;
   private String lblTxt_btn_edit_Jsonclick ;
   private String edtTBM31_STUDY_ID_Jsonclick ;
   private String GXt_char13 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean AV30W_REG_ENABEL ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n221TBM31_ORDER ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n551TBM31_STATUS ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV28W_ERRFLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String AV15H_SRCH_FLG ;
   private String AV11H_CRF_NM ;
   private String AV16H_STATUS ;
   private String AV12H_DEL_FLG ;
   private String A219TBM31_CRF_NM ;
   private String A551TBM31_STATUS ;
   private String A223TBM31_DEL_FLG ;
   private String lV11H_CRF_NM ;
   private String AV7D_CRF_NM ;
   private String AV9D_STATUS ;
   private String AV8D_DEL_FLG ;
   private String AV13H_INIT_FLG ;
   private String AV14H_KNGN_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String AV24W_A821_JS ;
   private String A187TBM21_STUDY_NM ;
   private String AV26W_DEL_FLG ;
   private String AV27W_ERRCD ;
   private String AV23W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice radavD_status ;
   private HTMLChoice radavD_del_flg ;
   private HTMLChoice cmbTBM31_STATUS ;
   private HTMLChoice cmbTBM31_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private long[] H000Y2_A217TBM31_STUDY_ID ;
   private short[] H000Y2_A218TBM31_CRF_ID ;
   private String[] H000Y2_A223TBM31_DEL_FLG ;
   private boolean[] H000Y2_n223TBM31_DEL_FLG ;
   private String[] H000Y2_A551TBM31_STATUS ;
   private boolean[] H000Y2_n551TBM31_STATUS ;
   private String[] H000Y2_A219TBM31_CRF_NM ;
   private boolean[] H000Y2_n219TBM31_CRF_NM ;
   private int[] H000Y2_A221TBM31_ORDER ;
   private boolean[] H000Y2_n221TBM31_ORDER ;
   private int[] H000Y3_AGRID1_nRecordCount ;
   private String[] H000Y4_A233TBM32_CRF_ITEM_CD ;
   private long[] H000Y4_A231TBM32_STUDY_ID ;
   private short[] H000Y4_A232TBM32_CRF_ID ;
   private short[] H000Y5_A248TBM33_COND_NO ;
   private long[] H000Y5_A246TBM33_STUDY_ID ;
   private short[] H000Y5_A247TBM33_CRF_ID ;
   private String[] H000Y6_A461TBM34_STYDY_AUTH_CD ;
   private long[] H000Y6_A459TBM34_STUDY_ID ;
   private short[] H000Y6_A460TBM34_CRF_ID ;
   private String[] H000Y7_A473TBM35_CRF_ITEM_CD ;
   private String[] H000Y7_A474TBM35_STUDY_AUTH_CD ;
   private long[] H000Y7_A471TBM35_STUDY_ID ;
   private short[] H000Y7_A472TBM35_CRF_ID ;
   private short[] H000Y8_A486TBM36_COND_NO ;
   private short[] H000Y8_A487TBM36_SELECT_CRF_ID ;
   private long[] H000Y8_A484TBM36_STUDY_ID ;
   private short[] H000Y8_A485TBM36_CRF_ID ;
   private String[] H000Y9_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] H000Y9_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] H000Y9_A271TBM37_STUDY_ID ;
   private short[] H000Y9_A272TBM37_CRF_ID ;
   private String[] H000Y10_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] H000Y10_A261TBM41_CRF_ITEM_GRP_CD ;
   private long[] H000Y10_A259TBM41_STUDY_ID ;
   private short[] H000Y10_A260TBM41_CRF_ID ;
   private long[] H000Y11_A186TBM21_STUDY_ID ;
   private String[] H000Y11_A187TBM21_STUDY_NM ;
   private boolean[] H000Y11_n187TBM21_STUDY_NM ;
   private com.genexus.webpanels.WebSession AV31W_SESSION ;
   private GxObjectCollection AV19W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem3[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem4[] ;
   private GxObjectCollection AV76GXV31 ;
   private SdtA_PAGING_SDT AV10H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT12[] ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT10[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp07_crf_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Y2( com.genexus.internet.HttpContext httpContext ,
                                          String AV11H_CRF_NM ,
                                          String AV16H_STATUS ,
                                          String AV12H_DEL_FLG ,
                                          String A219TBM31_CRF_NM ,
                                          String A551TBM31_STATUS ,
                                          String A223TBM31_DEL_FLG ,
                                          String AV15H_SRCH_FLG ,
                                          long AV18P_STUDY_ID ,
                                          long A217TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int14 ;
      GXv_int14 = new byte [5] ;
      Object[] GXv_Object15 ;
      GXv_Object15 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_NM`," ;
      scmdbuf = scmdbuf + " `TBM31_ORDER` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV11H_CRF_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_CRF_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_STATUS)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` = ?)" ;
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12H_DEL_FLG)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_DEL_FLG` = ?)" ;
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_CRF_ID`" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H000Y3( com.genexus.internet.HttpContext httpContext ,
                                          String AV11H_CRF_NM ,
                                          String AV16H_STATUS ,
                                          String AV12H_DEL_FLG ,
                                          String A219TBM31_CRF_NM ,
                                          String A551TBM31_STATUS ,
                                          String A223TBM31_DEL_FLG ,
                                          String AV15H_SRCH_FLG ,
                                          long AV18P_STUDY_ID ,
                                          long A217TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int16 ;
      GXv_int16 = new byte [5] ;
      Object[] GXv_Object17 ;
      GXv_Object17 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV11H_CRF_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_CRF_NM` like CONCAT('%', CONCAT(?, '%')))" ;
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_STATUS)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` = ?)" ;
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12H_DEL_FLG)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_DEL_FLG` = ?)" ;
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H000Y2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
            case 1 :
                  return conditional_H000Y3(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H000Y4", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_STUDY_ID`, `TBM32_CRF_ID` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y5", "SELECT `TBM33_COND_NO`, `TBM33_STUDY_ID`, `TBM33_CRF_ID` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y6", "SELECT `TBM34_STYDY_AUTH_CD`, `TBM34_STUDY_ID`, `TBM34_CRF_ID` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y7", "SELECT `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_STUDY_ID`, `TBM35_CRF_ID` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y8", "SELECT `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y9", "SELECT `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_STUDY_ID`, `TBM37_CRF_ID` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y10", "SELECT `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_STUDY_ID`, `TBM41_CRF_ID` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ? ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Y11", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1);
               }
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

