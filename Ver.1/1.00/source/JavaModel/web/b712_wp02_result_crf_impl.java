/*
               File: b712_wp02_result_crf_impl
        Description: CRF検索結果
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:6:28.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp02_result_crf_impl extends GXWebPanel
{
   public b712_wp02_result_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b712_wp02_result_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_wp02_result_crf_impl.class ));
   }

   public b712_wp02_result_crf_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_ol_disp = new HTMLChoice();
      cmbavD_sort = new HTMLChoice();
      chkavD_grd_all_sel_flg = UIFactory.getCheckbox(this);
      chkavD_grd_sel_flg = UIFactory.getCheckbox(this);
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
            nGXsfl_189_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_189_idx = httpContext.GetNextPar( ) ;
            edtavD_grd_site_id_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_189_idx, sGXsfl_189_idx) ;
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
         pa1H2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1H2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1H2( ) ;
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
      httpContext.writeText( "CRF検索結果") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b712_wp02_result_crf") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1H2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV30H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV30H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vD_GRD_CHG", GXutil.rtrim( AV13D_GRD_CHG));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B712_SD08_ICON_INFO", AV49SD_B712_SD08_ICON_INFO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B712_SD08_ICON_INFO", AV49SD_B712_SD08_ICON_INFO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B712_SD07_INPUT_DISP", AV47SD_B712_SD07_INPUT_DISP);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B712_SD07_INPUT_DISP", AV47SD_B712_SD07_INPUT_DISP);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vD_B712_SD06_RESULT_CRF", AV10D_B712_SD06_RESULT_CRF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vD_B712_SD06_RESULT_CRF", AV10D_B712_SD06_RESULT_CRF);
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

   public void wb1H0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1H2( true) ;
      }
      else
      {
         wb_table1_2_1H2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_390_1H2( true) ;
      }
      else
      {
         wb_table2_390_1H2( false) ;
      }
      return  ;
   }

   public void wb_table2_390_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "CRF検索結果", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0388") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0388", "");
         }
      }
      wbErr = false ;
      strup1H0( ) ;
   }

   public void ws1H2( )
   {
      start1H2( ) ;
      evt1H2( ) ;
   }

   public void evt1H2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_SEARCH_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111H2 */
                        e111H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_OPEN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121H2 */
                        e121H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CHG_REKI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131H2 */
                        e131H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SSAI_HYOJ'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141H2 */
                        e141H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_TEISYUTU'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151H2 */
                        e151H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_TEISYUTU_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161H2 */
                        e161H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DM_KAIJO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171H2 */
                        e171H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DM_KAIJO_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181H2 */
                        e181H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DATA_KTEI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191H2 */
                        e191H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DATA_KTEI_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201H2 */
                        e201H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211H2 */
                        e211H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DEL_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221H2 */
                        e221H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231H2 */
                        e231H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241H2 */
                        e241H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251H2 */
                        e251H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_SORT.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261H2 */
                        e261H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271H2 */
                        e271H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281H2 */
                        e281H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291H2 */
                        e291H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301H2 */
                        e301H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311H2 */
                        e311H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e321H2 */
                        e321H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e331H2 */
                        e331H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e341H2 */
                        e341H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e351H2 */
                        e351H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e361H2 */
                        e361H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e371H2 */
                        e371H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e381H2 */
                        e381H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e391H2 */
                        e391H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e401H2 */
                        e401H2 ();
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
                        nGXsfl_189_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_189_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_idx, 4, 0)), (short)(4), "0") ;
                        chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
                        edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
                        edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
                        edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
                        edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
                        edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
                        lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
                        edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
                        edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
                        lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
                        edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
                        edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
                        AV19D_GRD_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_sel_flg.getInternalname())) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") > 999999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_SUBJECT_ID");
                           GX_FocusControl = edtavD_grd_subject_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV22D_GRD_SUBJECT_ID = 0 ;
                        }
                        else
                        {
                           AV22D_GRD_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",")) ;
                        }
                        AV21D_GRD_SITE_SNM = httpContext.cgiGet( edtavD_grd_site_snm_Internalname) ;
                        AV20D_GRD_SITE_ID = httpContext.cgiGet( edtavD_grd_site_id_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_ID");
                           GX_FocusControl = edtavD_grd_crf_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV14D_GRD_CRF_ID = (short)(0) ;
                        }
                        else
                        {
                           AV14D_GRD_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",")) ;
                        }
                        AV15D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
                        AV18D_GRD_LAST_UPD_DATETIME_VC = httpContext.cgiGet( edtavD_grd_last_upd_datetime_vc_Internalname) ;
                        AV23D_GRD_UPD_USER_NM = httpContext.cgiGet( edtavD_grd_upd_user_nm_Internalname) ;
                        AV17D_GRD_DM = httpContext.cgiGet( edtavD_grd_dm_Internalname) ;
                        AV16D_GRD_DATA_KOTE = httpContext.cgiGet( edtavD_grd_data_kote_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0388") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0388", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0388") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0388", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e411H2 */
                              e411H2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e421H2 */
                              e421H2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e431H2 */
                              e431H2 ();
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
                  else if ( nCmpId == 388 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0388") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0388", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1H2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1H2( ) ;
         }
      }
   }

   public void pa1H2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         cmbavD_ol_disp.setName( "vD_OL_DISP" );
         cmbavD_ol_disp.setWebtags( "" );
         cmbavD_ol_disp.addItem("1", "ドメイン、ドメイン変数、選択肢", (short)(0));
         cmbavD_ol_disp.addItem("2", "参照先ID、項目ID", (short)(0));
         if ( ( cmbavD_ol_disp.getItemCount() > 0 ) && (GXutil.strcmp("", AV24D_OL_DISP)==0) )
         {
            AV24D_OL_DISP = cmbavD_ol_disp.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         }
         cmbavD_sort.setName( "vD_SORT" );
         cmbavD_sort.setWebtags( "" );
         cmbavD_sort.addItem("1", "患者No＋CRF表示順", (short)(0));
         cmbavD_sort.addItem("2", "CRF表示順＋患者No順", (short)(0));
         cmbavD_sort.addItem("3", "入力権限レベル＋CRF表示順＋患者No順", (short)(0));
         cmbavD_sort.addItem("4", "DM着（DM着 降順＋患者No＋CRF表示順）", (short)(0));
         cmbavD_sort.addItem("5", "データ固定（データ固定 降順＋患者No＋CRF表示順）", (short)(0));
         if ( ( cmbavD_sort.getItemCount() > 0 ) && (GXutil.strcmp("", AV27D_SORT)==0) )
         {
            AV27D_SORT = cmbavD_sort.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
         }
         chkavD_grd_all_sel_flg.setName( "vD_GRD_ALL_SEL_FLG" );
         chkavD_grd_all_sel_flg.setWebtags( "" );
         chkavD_grd_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_sel_flg.getInternalname(), "Caption", chkavD_grd_all_sel_flg.getCaption());
         chkavD_grd_all_sel_flg.setCheckedValue( "false" );
         GXCCtl = "vD_GRD_SEL_FLG_" + sGXsfl_189_idx ;
         chkavD_grd_sel_flg.setName( GXCCtl );
         chkavD_grd_sel_flg.setWebtags( "" );
         chkavD_grd_sel_flg.setCaption( "" );
         chkavD_grd_sel_flg.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_189_idx ,
                                 String sGXsfl_189_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
      edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
      edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
      edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
      lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
      edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
      edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
      while ( nGXsfl_189_idx <= nRC_Grid1 )
      {
         sendrow_1892( ) ;
         nGXsfl_189_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_189_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_189_idx+1)) ;
         sGXsfl_189_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
         edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
         edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
         edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
         edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
         edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
         lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
         edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
         edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1H2( ) ;
      /* End function Refresh */
   }

   public void rf1H2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(189) ;
      nGXsfl_189_idx = (short)(1) ;
      sGXsfl_189_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_idx, 4, 0)), (short)(4), "0") ;
      chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
      edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
      edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
      lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
      edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
      lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
      edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
      edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
      /* Execute user event: e421H2 */
      e421H2 ();
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
         chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
         edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
         edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
         edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
         edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
         edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
         lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
         edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
         edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
         /* Execute user event: e431H2 */
         e431H2 ();
         wbEnd = (short)(189) ;
         wb1H0( ) ;
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
      if ( 15 > 0 )
      {
         if ( 1 > 0 )
         {
            return 15*1 ;
         }
         else
         {
            return 15 ;
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

   public void strup1H0( )
   {
      /* Before Start, stand alone formulas. */
      AV156Pgmname = "B712_WP02_RESULT_CRF" ;
      AV153Pgmdesc = "CRF検索結果" ;
      Gx_err = (short)(0) ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_site_snm_Enabled = 0 ;
      edtavD_grd_site_id_Enabled = 0 ;
      edtavD_grd_crf_id_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 0 ;
      edtavD_grd_upd_user_nm_Enabled = 0 ;
      edtavD_grd_dm_Enabled = 0 ;
      edtavD_grd_data_kote_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e411H2 */
      e411H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV30H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_ol_disp.setName( cmbavD_ol_disp.getInternalname() );
         cmbavD_ol_disp.setValue( httpContext.cgiGet( cmbavD_ol_disp.getInternalname()) );
         AV24D_OL_DISP = httpContext.cgiGet( cmbavD_ol_disp.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         cmbavD_sort.setName( cmbavD_sort.getInternalname() );
         cmbavD_sort.setValue( httpContext.cgiGet( cmbavD_sort.getInternalname()) );
         AV27D_SORT = httpContext.cgiGet( cmbavD_sort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
         AV12D_GRD_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_GRD_ALL_SEL_FLG", GXutil.booltostr( AV12D_GRD_ALL_SEL_FLG));
         AV33H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33H_INIT_FLG", AV33H_INIT_FLG);
         AV40H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
         AV35H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35H_KNGN_FLG", AV35H_KNGN_FLG);
         AV41H_SUBJECT_ID = httpContext.cgiGet( edtavH_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41H_SUBJECT_ID", AV41H_SUBJECT_ID);
         AV34H_INPUT_END_FLG_SV = httpContext.cgiGet( edtavH_input_end_flg_sv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_TBT02_CRF_ID");
            GX_FocusControl = edtavH_sel_tbt02_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37H_SEL_TBT02_CRF_ID = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
         }
         else
         {
            AV37H_SEL_TBT02_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_TBT02_SUBJECT_ID");
            GX_FocusControl = edtavH_sel_tbt02_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38H_SEL_TBT02_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV38H_SEL_TBT02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_upd_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_upd_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_TBT02_UPD_CNT");
            GX_FocusControl = edtavH_sel_tbt02_upd_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39H_SEL_TBT02_UPD_CNT = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39H_SEL_TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( AV39H_SEL_TBT02_UPD_CNT, 10, 0)));
         }
         else
         {
            AV39H_SEL_TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_upd_cnt_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39H_SEL_TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( AV39H_SEL_TBT02_UPD_CNT, 10, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_POPUP_ERR_CD");
            GX_FocusControl = edtavH_popup_err_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36H_POPUP_ERR_CD = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36H_POPUP_ERR_CD", GXutil.str( AV36H_POPUP_ERR_CD, 1, 0));
         }
         else
         {
            AV36H_POPUP_ERR_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36H_POPUP_ERR_CD", GXutil.str( AV36H_POPUP_ERR_CD, 1, 0));
         }
         AV32H_ERR_MSG = httpContext.cgiGet( edtavH_err_msg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32H_ERR_MSG", AV32H_ERR_MSG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_PAGE");
            GX_FocusControl = edtavCtlmax_page_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         AV31H_DEVICE = httpContext.cgiGet( edtavH_device_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31H_DEVICE", AV31H_DEVICE);
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0388") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0388", "");
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
      /* Execute user event: e411H2 */
      e411H2 ();
      if (returnInSub) return;
   }

   public void e411H2( )
   {
      /* Start Routine */
      AV8C_APP_ID = "B712" ;
      AV9C_GAMEN_TITLE = AV153Pgmdesc ;
      AV44P_STUDY_ID = GXutil.lval( AV95W_SESSION.getValue("B712_WP02_STUDY_ID")) ;
      AV42P_AUTH_CD = AV95W_SESSION.getValue("B712_WP02_AUTH_CD") ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV33H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33H_INIT_FLG", AV33H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Using cursor H001H2 */
      pr_default.execute(0, new Object[] {new Long(AV44P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189TBM21_DEL_FLG = H001H2_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001H2_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = H001H2_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H001H2_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001H2_n187TBM21_STUDY_NM[0] ;
         AV99W_STUDY_NM = A187TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H001H3 */
      pr_default.execute(1, new Object[] {AV42P_AUTH_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A18TAM04_DEL_FLG = H001H3_A18TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
         n18TAM04_DEL_FLG = H001H3_n18TAM04_DEL_FLG[0] ;
         A17TAM04_AUTH_CD = H001H3_A17TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
         A98TAM04_AUTH_NM = H001H3_A98TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
         n98TAM04_AUTH_NM = H001H3_n98TAM04_AUTH_NM[0] ;
         AV56W_AUTH_NM = A98TAM04_AUTH_NM + "権限" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV53W_A_LOGIN_SDT,AV8C_APP_ID,AV99W_STUDY_NM,AV56W_AUTH_NM,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0388",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem4[0] = AV47SD_B712_SD07_INPUT_DISP ;
      GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem5[0] = AV49SD_B712_SD08_ICON_INFO ;
      new b712_pc01_disp_info_get(remoteHandle, context).execute( GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem4, GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem5) ;
      AV47SD_B712_SD07_INPUT_DISP = GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem4[0] ;
      AV49SD_B712_SD08_ICON_INFO = GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem5[0] ;
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      edtavD_grd_site_id_Visible = 0 ;
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e421H2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV33H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV156Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = cmbavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         AV36H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36H_POPUP_ERR_CD", GXutil.str( AV36H_POPUP_ERR_CD, 1, 0));
      }
      AV33H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33H_INIT_FLG", AV33H_INIT_FLG);
      if ( AV36H_POPUP_ERR_CD != 9 )
      {
         if ( AV36H_POPUP_ERR_CD == 1 )
         {
         }
         else
         {
            /* Execute user subroutine: S152 */
            S152 ();
            if (returnInSub) return;
         }
         AV36H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36H_POPUP_ERR_CD", GXutil.str( AV36H_POPUP_ERR_CD, 1, 0));
      }
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

   private void e431H2( )
   {
      /* Grid1_Load Routine */
      AV157GXV29 = 1 ;
      while ( AV157GXV29 <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV157GXV29));
         AV19D_GRD_SEL_FLG = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() ;
         AV22D_GRD_SUBJECT_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
         AV20D_GRD_SITE_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id() ;
         AV21D_GRD_SITE_SNM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm() ;
         AV14D_GRD_CRF_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
         AV15D_GRD_CRF_SNM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm() ;
         AV23D_GRD_UPD_USER_NM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm() ;
         if ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "1") == 0 )
         {
            AV17D_GRD_DM = "済" ;
            AV77W_DATA_KBN = "1" ;
         }
         else
         {
            if ( GXutil.nullDate().equals(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime()) )
            {
               AV17D_GRD_DM = "未" ;
               AV77W_DATA_KBN = "0" ;
            }
            else
            {
               AV17D_GRD_DM = "差戻" ;
               AV77W_DATA_KBN = "2" ;
            }
         }
         if ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "1") == 0 )
         {
            AV16D_GRD_DATA_KOTE = "済" ;
            AV77W_DATA_KBN = "3" ;
         }
         else
         {
            AV16D_GRD_DATA_KOTE = "未" ;
         }
         AV158GXV30 = 1 ;
         while ( AV158GXV30 <= AV47SD_B712_SD07_INPUT_DISP.size() )
         {
            AV48SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV47SD_B712_SD07_INPUT_DISP.elementAt(-1+AV158GXV30));
            if ( GXutil.strcmp(AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn(), AV77W_DATA_KBN) == 0 )
            {
               tblTbl_grd_kngn_01_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_01_Visible, 5, 0)));
               tblTbl_grd_kngn_02_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_02_Visible, 5, 0)));
               tblTbl_grd_kngn_03_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_03_Visible, 5, 0)));
               tblTbl_grd_kngn_04_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_04_Visible, 5, 0)));
               tblTbl_grd_kngn_05_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_05_Visible, 5, 0)));
               tblTbl_grd_kngn_06_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_06_Visible, 5, 0)));
               tblTbl_grd_kngn_07_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_07_Visible, 5, 0)));
               tblTbl_grd_kngn_08_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_08_Visible, 5, 0)));
               tblTbl_grd_kngn_09_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_09_Visible, 5, 0)));
               tblTbl_grd_kngn_10_Visible = AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible() ;
               httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_10_Visible, 5, 0)));
               if (true) break;
            }
            AV158GXV30 = (int)(AV158GXV30+1) ;
         }
         if ( GXutil.strcmp(AV20D_GRD_SITE_ID, AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()) != 0 )
         {
            tblTbl_grd_kngn_01_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_01_Visible, 5, 0)));
            tblTbl_grd_kngn_02_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_02_Visible, 5, 0)));
            tblTbl_grd_kngn_03_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_03_Visible, 5, 0)));
            tblTbl_grd_kngn_04_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_04_Visible, 5, 0)));
         }
         tblTbl_grd_upd_kngn_Visible = (AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg() ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_upd_kngn_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_upd_kngn_Visible, 5, 0)));
         if ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg() )
         {
            AV159GXV31 = 1 ;
            while ( AV159GXV31 <= AV49SD_B712_SD08_ICON_INFO.size() )
            {
               AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV159GXV31));
               if ( GXutil.strcmp(AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd(), AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd()) == 0 )
               {
                  lblTxt_grd_upd_kngn_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
                  tblTbl_grd_upd_kngn_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
                  httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_upd_kngn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_upd_kngn_Backcolor, 9, 0)));
                  if (true) break;
               }
               AV159GXV31 = (int)(AV159GXV31+1) ;
            }
         }
         if ( GXutil.nullDate().equals(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime()) )
         {
            AV18D_GRD_LAST_UPD_DATETIME_VC = "" ;
            AV13D_GRD_CHG = "" ;
         }
         else
         {
            GXt_char3 = AV18D_GRD_LAST_UPD_DATETIME_VC ;
            GXv_char6[0] = GXt_char3 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime(), "YYYY/MM/DD HH:MI:SS", GXv_char6) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
            AV18D_GRD_LAST_UPD_DATETIME_VC = GXt_char3 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(189) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 15 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1892( ) ;
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
         AV157GXV29 = (int)(AV157GXV29+1) ;
      }
   }

   public void e111H2( )
   {
      /* 'BTN_SEARCH_BACK' Routine */
      AV95W_SESSION.remove("B712_WP02_STUDY_ID");
      AV95W_SESSION.remove("B712_WP02_AUTH_CD");
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV95W_SESSION.remove("B712_WP01_SEARCH_CRF_D_OL_DISP");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV42P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("b712_wp01_search_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void e121H2( )
   {
      /* 'BTN_CRF_OPEN' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV98W_STUDY_ID = "" ;
      AV100W_SUBJECT_ID = "" ;
      AV74W_CRF_ID = "" ;
      AV75W_CRF_INPUT_LEVEL = "" ;
      AV119W_UPD_CNT = "" ;
      AV82W_ERRFLG = false ;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
      }
      else
      {
         GXt_char3 = AV123W_SYS_VALUE ;
         GXv_char6[0] = GXt_char3 ;
         new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "024", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV123W_SYS_VALUE = GXt_char3 ;
         if ( GXutil.val( AV123W_SYS_VALUE, ".") > 0 )
         {
            if ( AV93W_SEL_CNT > GXutil.val( AV123W_SYS_VALUE, ".") )
            {
               GXt_char3 = AV89W_MSG ;
               GXv_char6[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00093", AV123W_SYS_VALUE, GXutil.trim( GXutil.str( AV93W_SEL_CNT, 10, 0)), "", "", "", GXv_char6) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
               AV89W_MSG = GXt_char3 ;
               httpContext.GX_msglist.addItem(AV89W_MSG);
               AV82W_ERRFLG = true ;
            }
         }
      }
      if ( ! AV82W_ERRFLG )
      {
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char6[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( GXutil.today( ) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( GXutil.now( ) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( AV42P_AUTH_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV95W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_OL_DISP", AV24D_OL_DISP);
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         AV72W_CNT2 = (short)(1) ;
         while ( AV72W_CNT2 <= 100 )
         {
            GXv_char6[0] = AV97W_STR ;
            GXv_int7[0] = AV91W_RET_CD ;
            new a822_pc01_str_token(remoteHandle, context).execute( AV24D_OL_DISP, "&", AV72W_CNT2, GXv_char6, GXv_int7) ;
            b712_wp02_result_crf_impl.this.AV97W_STR = GXv_char6[0] ;
            b712_wp02_result_crf_impl.this.AV91W_RET_CD = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
            if ( AV91W_RET_CD == 9 )
            {
               if (true) break;
            }
            else
            {
               AV52SD_B792_SD03_OL_DISP_INFO_I = (SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)new SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem(remoteHandle, context);
               AV52SD_B792_SD03_OL_DISP_INFO_I.setgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn( AV97W_STR );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52SD_B792_SD03_OL_DISP_INFO_I", AV52SD_B792_SD03_OL_DISP_INFO_I);
               AV51SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info().add(AV52SD_B792_SD03_OL_DISP_INFO_I, 0);
               if ( AV91W_RET_CD == 1 )
               {
                  if (true) break;
               }
            }
            AV72W_CNT2 = (short)(AV72W_CNT2+1) ;
         }
         AV95W_SESSION.setValue(AV96W_SESSION_KEY, AV51SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, "B792_SD00_HTML5_EXEC_INFO", "SmartEDC_SHIZUOKA"));
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char6[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         AV95W_SESSION.remove(AV96W_SESSION_KEY);
         AV87W_IDX = 1 ;
         while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
            {
               if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
               {
                  AV98W_STUDY_ID = "STUDY_ID=" + GXutil.trim( GXutil.str( AV44P_STUDY_ID, 10, 0)) ;
               }
               else
               {
                  AV98W_STUDY_ID = AV98W_STUDY_ID + "," + GXutil.trim( GXutil.str( AV44P_STUDY_ID, 10, 0)) ;
               }
               if ( (GXutil.strcmp("", AV100W_SUBJECT_ID)==0) )
               {
                  AV100W_SUBJECT_ID = "&SUBJECT_ID=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), 6, 0)) ;
               }
               else
               {
                  AV100W_SUBJECT_ID = AV100W_SUBJECT_ID + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), 6, 0)) ;
               }
               if ( (GXutil.strcmp("", AV74W_CRF_ID)==0) )
               {
                  AV74W_CRF_ID = "&CRFID=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), 4, 0)) ;
               }
               else
               {
                  AV74W_CRF_ID = AV74W_CRF_ID + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), 4, 0)) ;
               }
               if ( (GXutil.strcmp("", AV75W_CRF_INPUT_LEVEL)==0) )
               {
                  AV75W_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(), 4, 0)) ;
               }
               else
               {
                  AV75W_CRF_INPUT_LEVEL = AV75W_CRF_INPUT_LEVEL + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(), 4, 0)) ;
               }
               if ( (GXutil.strcmp("", AV119W_UPD_CNT)==0) )
               {
                  AV119W_UPD_CNT = "&CRF_UPD_CNT=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt(), 10, 0)) ;
               }
               else
               {
                  AV119W_UPD_CNT = AV119W_UPD_CNT + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt(), 10, 0)) ;
               }
               new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV44P_STUDY_ID, ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id()) ;
            }
            AV87W_IDX = (long)(AV87W_IDX+1) ;
         }
         AV120W_URL = AV86W_HTTPREQUEST.getBaseURL() ;
         AV120W_URL = GXutil.strReplace( AV120W_URL, "servlet/", "") ;
         AV120W_URL = AV120W_URL + "static/b701_wp01_crf_inp.jsp?" ;
         AV120W_URL = AV120W_URL + AV98W_STUDY_ID ;
         AV120W_URL = AV120W_URL + AV100W_SUBJECT_ID ;
         AV120W_URL = AV120W_URL + AV74W_CRF_ID ;
         AV120W_URL = AV120W_URL + AV75W_CRF_INPUT_LEVEL ;
         AV120W_URL = AV120W_URL + AV119W_UPD_CNT ;
         httpContext.wjLoc = formatLink(AV120W_URL)  ;
      }
   }

   public void e131H2( )
   {
      /* 'BTN_CHG_REKI' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV82W_ERRFLG = false ;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
      }
      if ( AV93W_SEL_CNT > 1 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
      }
      if ( ! AV82W_ERRFLG )
      {
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char6[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( GXutil.today( ) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( GXutil.now( ) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( "2" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( AV42P_AUTH_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SD_B792_SD00_HTML5_EXEC_INFO", AV51SD_B792_SD00_HTML5_EXEC_INFO);
         AV95W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_OL_DISP", AV24D_OL_DISP);
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         AV51SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info().clear();
         AV95W_SESSION.setValue(AV96W_SESSION_KEY, AV51SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, "B792_SD00_HTML5_EXEC_INFO", "SmartEDC_SHIZUOKA"));
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char6[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         AV95W_SESSION.remove(AV96W_SESSION_KEY);
         AV87W_IDX = 1 ;
         while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
            {
               AV116W_TBT02_STUDY_ID = AV44P_STUDY_ID ;
               AV117W_TBT02_SUBJECT_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
               AV115W_TBT02_CRF_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
               if (true) break;
            }
            AV87W_IDX = (long)(AV87W_IDX+1) ;
         }
         AV98W_STUDY_ID = "" ;
         AV100W_SUBJECT_ID = "" ;
         AV74W_CRF_ID = "" ;
         AV75W_CRF_INPUT_LEVEL = "" ;
         AV119W_UPD_CNT = "" ;
         /* Using cursor H001H4 */
         pr_default.execute(2, new Object[] {new Long(AV116W_TBT02_STUDY_ID), new Integer(AV117W_TBT02_SUBJECT_ID), new Short(AV115W_TBT02_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A307TBT11_DEL_FLG = H001H4_A307TBT11_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
            n307TBT11_DEL_FLG = H001H4_n307TBT11_DEL_FLG[0] ;
            A578TBT11_DM_ARRIVAL_DATETIME = H001H4_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n578TBT11_DM_ARRIVAL_DATETIME = H001H4_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
            A305TBT11_CRF_ID = H001H4_A305TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            A304TBT11_SUBJECT_ID = H001H4_A304TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            A303TBT11_STUDY_ID = H001H4_A303TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            A314TBT11_UPD_CNT = H001H4_A314TBT11_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
            n314TBT11_UPD_CNT = H001H4_n314TBT11_UPD_CNT[0] ;
            A306TBT11_CRF_VERSION = H001H4_A306TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
            {
               AV98W_STUDY_ID = "STUDY_ID=" + GXutil.trim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)) ;
            }
            else
            {
               AV98W_STUDY_ID = AV98W_STUDY_ID + "," + GXutil.trim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)) ;
            }
            if ( (GXutil.strcmp("", AV100W_SUBJECT_ID)==0) )
            {
               AV100W_SUBJECT_ID = "&SUBJECT_ID=" + GXutil.trim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)) ;
            }
            else
            {
               AV100W_SUBJECT_ID = AV100W_SUBJECT_ID + "," + GXutil.trim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)) ;
            }
            if ( (GXutil.strcmp("", AV74W_CRF_ID)==0) )
            {
               AV74W_CRF_ID = "&CRFID=" + GXutil.trim( GXutil.str( A305TBT11_CRF_ID, 4, 0)) ;
            }
            else
            {
               AV74W_CRF_ID = AV74W_CRF_ID + "," + GXutil.trim( GXutil.str( A305TBT11_CRF_ID, 4, 0)) ;
            }
            if ( (GXutil.strcmp("", AV75W_CRF_INPUT_LEVEL)==0) )
            {
               AV75W_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" + GXutil.trim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)) ;
            }
            else
            {
               AV75W_CRF_INPUT_LEVEL = AV75W_CRF_INPUT_LEVEL + "," + GXutil.trim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)) ;
            }
            if ( (GXutil.strcmp("", AV119W_UPD_CNT)==0) )
            {
               AV119W_UPD_CNT = "&CRF_UPD_CNT=" + GXutil.trim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)) ;
            }
            else
            {
               AV119W_UPD_CNT = AV119W_UPD_CNT + "," + GXutil.trim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char6[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         else
         {
            AV120W_URL = AV86W_HTTPREQUEST.getBaseURL() ;
            AV120W_URL = GXutil.strReplace( AV120W_URL, "servlet/", "") ;
            AV120W_URL = AV120W_URL + "static/b701_wp01_crf_inp.jsp?" ;
            AV120W_URL = AV120W_URL + AV98W_STUDY_ID ;
            AV120W_URL = AV120W_URL + AV100W_SUBJECT_ID ;
            AV120W_URL = AV120W_URL + AV74W_CRF_ID ;
            AV120W_URL = AV120W_URL + AV75W_CRF_INPUT_LEVEL ;
            AV120W_URL = AV120W_URL + AV119W_UPD_CNT ;
            httpContext.wjLoc = formatLink(AV120W_URL)  ;
         }
      }
   }

   public void e141H2( )
   {
      /* 'BTN_SSAI_HYOJ' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV82W_ERRFLG = false ;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
      }
      if ( AV93W_SEL_CNT > 1 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char6) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
      }
      if ( ! AV82W_ERRFLG )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38H_SEL_TBT02_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV37H_SEL_TBT02_CRF_ID,4,0))) ;
         httpContext.popup(formatLink("b717_wp01_rekiinfo_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {});
      }
   }

   public void e151H2( )
   {
      /* 'BTN_CRF_TEISYUTU' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char6[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char6) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char6[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "DM到着済のCRF", "", "", "", "", GXv_char6) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV67W_CHK_ALLOFF_INPUT_END_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char6[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00090", "", "", "", "", "", GXv_char6) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char6[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV82W_ERRFLG )
         {
            AV87W_IDX = 1 ;
            while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
            {
               if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
               {
                  GXv_char6[0] = AV89W_MSG ;
                  GXv_char8[0] = AV92W_RTN_CD ;
                  new b712_pc02_crf_present_chk(remoteHandle, context).execute( AV44P_STUDY_ID, ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm(), AV42P_AUTH_CD, GXv_char6, GXv_char8) ;
                  b712_wp02_result_crf_impl.this.AV89W_MSG = GXv_char6[0] ;
                  b712_wp02_result_crf_impl.this.AV92W_RTN_CD = GXv_char8[0] ;
                  if ( GXutil.strcmp(AV92W_RTN_CD, "0") != 0 )
                  {
                     AV82W_ERRFLG = true ;
                     httpContext.GX_msglist.addItem(AV89W_MSG);
                  }
               }
               AV87W_IDX = (long)(AV87W_IDX+1) ;
            }
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "提出", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            GXt_char3 = AV55W_A821_JS ;
            GXv_char8[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_CRF_TEISYUTU_EXEC", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV55W_A821_JS = GXt_char3 ;
         }
      }
   }

   public void e161H2( )
   {
      /* 'BTN_CRF_TEISYUTU_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
      GXv_int7[0] = AV79W_ERR_CD ;
      GXv_char8[0] = AV80W_ERR_MSG ;
      new b714_pc04_dm_arrival_crf(remoteHandle, context).execute( AV44P_STUDY_ID, AV42P_AUTH_CD, AV62W_B714_SD1_CRF_INFO, GXv_int7, GXv_char8) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int7[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char8[0] ;
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = cmbavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e171H2( )
   {
      /* 'BTN_DM_KAIJO' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV68W_CHK_ALLON_DM_ARRIVAL_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "DM未到着のCRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00089", "", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "DM到着解除", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            GXt_char3 = AV55W_A821_JS ;
            GXv_char8[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_DM_KAIJO_EXEC", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV55W_A821_JS = GXt_char3 ;
         }
      }
   }

   public void e181H2( )
   {
      /* 'BTN_DM_KAIJO_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
      GXv_int7[0] = AV79W_ERR_CD ;
      GXv_char8[0] = AV80W_ERR_MSG ;
      new b715_pc01_set_auth(remoteHandle, context).execute( AV44P_STUDY_ID, AV62W_B714_SD1_CRF_INFO, GXv_int7, GXv_char8) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int7[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char8[0] ;
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = cmbavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e191H2( )
   {
      /* 'BTN_DATA_KTEI' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV69W_CHK_INPUT_END_KONZAI_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00087", "", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
            {
               GXt_char3 = AV89W_MSG ;
               GXv_char8[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "固定解除", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char8) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
               AV89W_MSG = GXt_char3 ;
            }
            else
            {
               GXt_char3 = AV89W_MSG ;
               GXv_char8[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "固定", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char8) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
               AV89W_MSG = GXt_char3 ;
            }
            GXt_char3 = AV55W_A821_JS ;
            GXv_char8[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_DATA_KTEI_EXEC", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV55W_A821_JS = GXt_char3 ;
         }
      }
   }

   public void e201H2( )
   {
      /* 'BTN_DATA_KTEI_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
            AV34H_INPUT_END_FLG_SV = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
            if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "0") == 0 )
            {
               AV88W_INPUT_END_FLG_SET = (byte)(1) ;
            }
            else
            {
               AV88W_INPUT_END_FLG_SET = (byte)(0) ;
            }
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
      GXv_int7[0] = AV79W_ERR_CD ;
      GXv_char8[0] = AV80W_ERR_MSG ;
      new b714_pc03_input_end_crf(remoteHandle, context).execute( AV88W_INPUT_END_FLG_SET, AV44P_STUDY_ID, AV62W_B714_SD1_CRF_INFO, GXv_int7, GXv_char8) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int7[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char8[0] ;
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = cmbavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e211H2( )
   {
      /* 'BTN_CRF_DEL' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( AV93W_SEL_CNT > 1 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00088", "", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00027", "CRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            GXt_char3 = AV55W_A821_JS ;
            GXv_char8[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_CRF_DEL_EXEC", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV55W_A821_JS = GXt_char3 ;
         }
      }
   }

   public void e221H2( )
   {
      /* 'BTN_CRF_DEL_EXEC' Routine */
      GXv_int7[0] = AV79W_ERR_CD ;
      GXv_char8[0] = AV80W_ERR_MSG ;
      new b714_pc02_delete_crf(remoteHandle, context).execute( AV44P_STUDY_ID, AV38H_SEL_TBT02_SUBJECT_ID, AV37H_SEL_TBT02_CRF_ID, GXv_int7, GXv_char8) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int7[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = cmbavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e231H2( )
   {
      /* 'BTN_CSV_OUT' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV31H_DEVICE, "other") == 0 )
      {
         AV82W_ERRFLG = false ;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char8[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "CSV", "出力", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV89W_MSG = GXt_char3 ;
            GXt_char3 = AV55W_A821_JS ;
            GXv_char8[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_CSV_OUT_EXEC", "", GXv_char8) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
            AV55W_A821_JS = GXt_char3 ;
         }
      }
      else
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char8[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00092", "", "", "", "", "", GXv_char8) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char8[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
      }
   }

   public void e241H2( )
   {
      /* 'BTN_CSV_OUT_EXEC' Routine */
      AV64W_B716_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV65W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
            AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
            AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
            AV64W_B716_SD1_CRF_INFO.add(AV65W_B716_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
      GXv_char8[0] = AV121W_ZIP_FILE_PATH ;
      GXv_char6[0] = AV122W_ZIP_FILENAME ;
      GXv_int9[0] = AV79W_ERR_CD ;
      GXv_char10[0] = AV80W_ERR_MSG ;
      new b716_pc01_csv_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV64W_B716_SD1_CRF_INFO, GXv_char8, GXv_char6, GXv_int9, GXv_char10) ;
      b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char8[0] ;
      b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char6[0] ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int9[0])) ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char10[0] ;
      if ( AV79W_ERR_CD == 0 )
      {
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
   }

   public void e251H2( )
   {
      /* D_grd_all_sel_flg_Click Routine */
      AV161GXV32 = 1 ;
      while ( AV161GXV32 <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV161GXV32));
         AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( AV12D_GRD_ALL_SEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
         AV161GXV32 = (int)(AV161GXV32+1) ;
      }
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e261H2( )
   {
      /* D_sort_Click Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
   }

   public void S292( )
   {
      /* 'SUB_SRCH' Routine */
      AV82W_ERRFLG = false ;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV90W_P_KANI_KENSAKU = "" ;
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV61W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
      {
         AV90W_P_KANI_KENSAKU = (String)AV61W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV87W_IDX)) ;
         if (true) break;
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
      AV102W_SUBJECT_ID_EDT = AV41H_SUBJECT_ID ;
      AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV79W_ERR_CD = (byte)(0) ;
      AV101W_SUBJECT_ID_CNT = (byte)(0) ;
      while ( AV79W_ERR_CD == 0 )
      {
         AV101W_SUBJECT_ID_CNT = (byte)(AV101W_SUBJECT_ID_CNT+1) ;
         GXv_char10[0] = AV103W_SUBJECT_ID_GET ;
         GXv_int7[0] = AV79W_ERR_CD ;
         new a822_pc01_str_token(remoteHandle, context).execute( AV102W_SUBJECT_ID_EDT, ",", AV101W_SUBJECT_ID_CNT, GXv_char10, GXv_int7) ;
         b712_wp02_result_crf_impl.this.AV103W_SUBJECT_ID_GET = GXv_char10[0] ;
         b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int7[0] ;
         if ( AV79W_ERR_CD != 9 )
         {
            AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(AV103W_SUBJECT_ID_GET, 0);
         }
      }
      if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 )
      {
         AV87W_IDX = 0 ;
         AV83W_FLG = "0" ;
         AV84W_FLG2[1-1] = "0" ;
         AV84W_FLG2[2-1] = "0" ;
         AV84W_FLG2[3-1] = "0" ;
         AV162GXV33 = 1 ;
         while ( AV162GXV33 <= AV49SD_B712_SD08_ICON_INFO.size() )
         {
            AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV162GXV33));
            AV87W_IDX = (long)(AV87W_IDX+1) ;
            if ( GXutil.strcmp(AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd(), AV42P_AUTH_CD) == 0 )
            {
               AV163GXV34 = 1 ;
               while ( AV163GXV34 <= AV47SD_B712_SD07_INPUT_DISP.size() )
               {
                  AV48SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV47SD_B712_SD07_INPUT_DISP.elementAt(-1+AV163GXV34));
                  if ( AV87W_IDX == 1 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 2 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 3 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 4 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 5 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 6 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 7 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 8 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 9 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible(), 4, 0)) ;
                  }
                  else if ( AV87W_IDX == 10 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible(), 4, 0)) ;
                  }
                  if ( GXutil.strcmp(AV83W_FLG, "1") == 0 )
                  {
                     if ( GXutil.strcmp(AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn(), "0") == 0 )
                     {
                        AV84W_FLG2[1-1] = "1" ;
                     }
                     else if ( GXutil.strcmp(AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn(), "1") == 0 )
                     {
                        AV84W_FLG2[2-1] = "1" ;
                     }
                     else if ( GXutil.strcmp(AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn(), "2") == 0 )
                     {
                        AV84W_FLG2[3-1] = "1" ;
                     }
                  }
                  AV163GXV34 = (int)(AV163GXV34+1) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(1) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(2) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(3) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(4) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(5) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(6) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(7) ;
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(8) ;
               }
               if (true) break;
            }
            AV162GXV33 = (int)(AV162GXV33+1) ;
         }
      }
      AV10D_B712_SD06_RESULT_CRF.clear();
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A613TBT01_SITE_ID ,
                                           new Integer(A293TBT02_SUBJECT_ID) ,
                                           new Short(A294TBT02_CRF_ID) ,
                                           new Integer(AV58W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size()) ,
                                           new Integer(AV59W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size()) ,
                                           new Integer(AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size()) ,
                                           new Integer(AV60W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size()) ,
                                           AV90W_P_KANI_KENSAKU ,
                                           new Short(AV94W_SEL_PTN) ,
                                           AV58W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code() ,
                                           AV59W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code() ,
                                           AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code() ,
                                           AV60W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code() ,
                                           A563TBT02_DM_ARRIVAL_FLG ,
                                           A564TBT02_DM_ARRIVAL_DATETIME ,
                                           A569TBT02_INPUT_END_FLG ,
                                           new Long(A292TBT02_STUDY_ID) ,
                                           new Long(AV44P_STUDY_ID) ,
                                           A295TBT02_DEL_FLG ,
                                           A284TBT01_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.OBJECT_COLLECTION, TypeConstants.OBJECT_COLLECTION, TypeConstants.OBJECT_COLLECTION, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001H5 */
      pr_default.execute(3, new Object[] {new Long(AV44P_STUDY_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A370TBT02_CRF_LATEST_VERSION = H001H5_A370TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
         n370TBT02_CRF_LATEST_VERSION = H001H5_n370TBT02_CRF_LATEST_VERSION[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = H001H5_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n564TBT02_DM_ARRIVAL_DATETIME = H001H5_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A294TBT02_CRF_ID = H001H5_A294TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
         A293TBT02_SUBJECT_ID = H001H5_A293TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         A292TBT02_STUDY_ID = H001H5_A292TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A284TBT01_DEL_FLG = H001H5_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = H001H5_n284TBT01_DEL_FLG[0] ;
         A295TBT02_DEL_FLG = H001H5_A295TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
         n295TBT02_DEL_FLG = H001H5_n295TBT02_DEL_FLG[0] ;
         A569TBT02_INPUT_END_FLG = H001H5_A569TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
         n569TBT02_INPUT_END_FLG = H001H5_n569TBT02_INPUT_END_FLG[0] ;
         A563TBT02_DM_ARRIVAL_FLG = H001H5_A563TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
         n563TBT02_DM_ARRIVAL_FLG = H001H5_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A613TBT01_SITE_ID = H001H5_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = H001H5_n613TBT01_SITE_ID[0] ;
         A371TBT02_CRF_INPUT_LEVEL = H001H5_A371TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n371TBT02_CRF_INPUT_LEVEL = H001H5_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A560TBT02_UPLOAD_DATETIME = H001H5_A560TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n560TBT02_UPLOAD_DATETIME = H001H5_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = H001H5_A561TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
         n561TBT02_UPLOAD_USER_ID = H001H5_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = H001H5_A562TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
         n562TBT02_UPLOAD_AUTH_CD = H001H5_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A302TBT02_UPD_CNT = H001H5_A302TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
         n302TBT02_UPD_CNT = H001H5_n302TBT02_UPD_CNT[0] ;
         A284TBT01_DEL_FLG = H001H5_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = H001H5_n284TBT01_DEL_FLG[0] ;
         A613TBT01_SITE_ID = H001H5_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = H001H5_n613TBT01_SITE_ID[0] ;
         AV76W_DATA_GET_FLG = true ;
         if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "2") == 0 )
         {
            if ( GXutil.strcmp(A613TBT01_SITE_ID, AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()) == 0 )
            {
               AV165GXLvl1153 = (byte)(0) ;
               /* Using cursor H001H6 */
               pr_default.execute(4, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID), AV42P_AUTH_CD});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A329TBT14_STUDY_ID = H001H6_A329TBT14_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
                  A330TBT14_SUBJECT_ID = H001H6_A330TBT14_SUBJECT_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
                  A331TBT14_CRF_ID = H001H6_A331TBT14_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
                  n331TBT14_CRF_ID = H001H6_n331TBT14_CRF_ID[0] ;
                  A337TBT14_DEL_FLG = H001H6_A337TBT14_DEL_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
                  n337TBT14_DEL_FLG = H001H6_n337TBT14_DEL_FLG[0] ;
                  A924TBT14_KANRYO_FLG = H001H6_A924TBT14_KANRYO_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
                  n924TBT14_KANRYO_FLG = H001H6_n924TBT14_KANRYO_FLG[0] ;
                  A927TBT14_KAKUNIN_FLG = H001H6_A927TBT14_KAKUNIN_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
                  n927TBT14_KAKUNIN_FLG = H001H6_n927TBT14_KAKUNIN_FLG[0] ;
                  A929TBT14_REQUEST_AUTH_CD = H001H6_A929TBT14_REQUEST_AUTH_CD[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
                  n929TBT14_REQUEST_AUTH_CD = H001H6_n929TBT14_REQUEST_AUTH_CD[0] ;
                  AV165GXLvl1153 = (byte)(1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( AV165GXLvl1153 == 0 )
               {
                  AV76W_DATA_GET_FLG = false ;
               }
            }
            else
            {
               AV76W_DATA_GET_FLG = false ;
            }
         }
         if ( AV76W_DATA_GET_FLG )
         {
            AV113W_TBM34_CRF_ID = A294TBT02_CRF_ID ;
            /* Execute user subroutine: S306 */
            S306 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            if ( AV73W_CRF_AUTH_FLG )
            {
               AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)new SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem(remoteHandle, context);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( false );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( A293TBT02_SUBJECT_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( A294TBT02_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( A370TBT02_CRF_LATEST_VERSION );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( A371TBT02_CRF_INPUT_LEVEL );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( A560TBT02_UPLOAD_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( A561TBT02_UPLOAD_USER_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( A562TBT02_UPLOAD_AUTH_CD );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( A569TBT02_INPUT_END_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( A563TBT02_DM_ARRIVAL_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( A302TBT02_UPD_CNT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV7W_TBM31_CRF_ID = A294TBT02_CRF_ID ;
               /* Execute user subroutine: S316 */
               S316 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  if (true) return;
               }
               AV5W_TAM07_USER_ID = A561TBT02_UPLOAD_USER_ID ;
               /* Execute user subroutine: S326 */
               S326 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  if (true) return;
               }
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( AV104W_TAM07_USER_NM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( A613TBT01_SITE_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV6W_TAM08_SITE_ID = A613TBT01_SITE_ID ;
               /* Execute user subroutine: S336 */
               S336 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  if (true) return;
               }
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( AV105W_TAM08_SITE_SNM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( AV111W_TBM31_CRF_SNM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( AV112W_TBM31_ORDER );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( AV104W_TAM07_USER_NM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               if ( GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) )
               {
                  AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( false );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               }
               else
               {
                  AV166GXLvl1216 = (byte)(0) ;
                  /* Using cursor H001H7 */
                  pr_default.execute(5, new Object[] {new Long(AV44P_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A304TBT11_SUBJECT_ID = H001H7_A304TBT11_SUBJECT_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
                     A305TBT11_CRF_ID = H001H7_A305TBT11_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
                     A577TBT11_DM_ARRIVAL_FLG = H001H7_A577TBT11_DM_ARRIVAL_FLG[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
                     n577TBT11_DM_ARRIVAL_FLG = H001H7_n577TBT11_DM_ARRIVAL_FLG[0] ;
                     A303TBT11_STUDY_ID = H001H7_A303TBT11_STUDY_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
                     A578TBT11_DM_ARRIVAL_DATETIME = H001H7_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     n578TBT11_DM_ARRIVAL_DATETIME = H001H7_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
                     A306TBT11_CRF_VERSION = H001H7_A306TBT11_CRF_VERSION[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
                     AV166GXLvl1216 = (byte)(1) ;
                     if ( A578TBT11_DM_ARRIVAL_DATETIME.equals( A564TBT02_DM_ARRIVAL_DATETIME ) && ( A306TBT11_CRF_VERSION == A370TBT02_CRF_LATEST_VERSION ) )
                     {
                        AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( false );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
                     }
                     else
                     {
                        AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( true );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
                     }
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  if ( AV166GXLvl1216 == 0 )
                  {
                     AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( false );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
                  }
               }
               AV10D_B712_SD06_RESULT_CRF.add(AV11D_B712_SD06_RESULT_CRF_Item, 0);
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV40H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
   }

   public void S252( )
   {
      /* 'SUB_SORT' Routine */
      if ( GXutil.strcmp(AV27D_SORT, "1") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("TBT02_SUBJECT_ID,TBM31_ORDER");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "2") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("TBM31_ORDER,TBT02_SUBJECT_ID");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "3") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("TBT02_CRF_INPUT_LEVEL,TBM31_ORDER,TBT02_SUBJECT_ID");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "4") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("[TBT02_DM_ARRIVAL_FLG],TBT02_SUBJECT_ID,TBM31_ORDER");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "5") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("[TBT02_INPUT_END_FLG],TBT02_SUBJECT_ID,TBM31_ORDER");
      }
      else
      {
      }
   }

   public void S262( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV85W_GAMENNM_KENSAKU = "B712_WP01_SEARCH_CRF" ;
      if ( GXutil.strcmp(AV33H_INIT_FLG, "0") == 0 )
      {
         AV27D_SORT = AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_D_SORT") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
      }
      AV41H_SUBJECT_ID = AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_SUBJECT_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41H_SUBJECT_ID", AV41H_SUBJECT_ID);
      AV58W_B712_SD05_SEL1.fromxml(AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_GRID1_SEL"), "");
      AV59W_B712_SD05_SEL2.fromxml(AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_GRID2_SEL"), "");
      AV60W_B712_SD05_SEL3.fromxml(AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_GRID3_SEL"), "");
      AV61W_B712_SD05_SEL4.fromxml(AV95W_SESSION.getValue(AV85W_GAMENNM_KENSAKU+"_GRID4_SEL"), "");
      AV24D_OL_DISP = AV95W_SESSION.getValue("B712_WP01_SEARCH_CRF_D_OL_DISP") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
   }

   public void S272( )
   {
      /* 'SUB_SYOKI_DATA_GET' Routine */
      GXt_char3 = AV109W_TBM01_SAGYOJOHO_VALUE ;
      GXv_char10[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "014", GXv_char10) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
      AV109W_TBM01_SAGYOJOHO_VALUE = GXt_char3 ;
      GXt_char3 = AV107W_TBM01_DM_VALUE ;
      GXv_char10[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char10) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
      AV107W_TBM01_DM_VALUE = GXt_char3 ;
      GXt_char3 = AV106W_TBM01_CRC_VALUE ;
      GXv_char10[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "021", GXv_char10) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
      AV106W_TBM01_CRC_VALUE = GXt_char3 ;
      GXt_char3 = AV108W_TBM01_RESEARCHER_VALUE ;
      GXv_char10[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "022", GXv_char10) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
      AV108W_TBM01_RESEARCHER_VALUE = GXt_char3 ;
      GXt_char3 = AV110W_TBM01_SITE_MG_VALUE ;
      GXv_char10[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "009", GXv_char10) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
      AV110W_TBM01_SITE_MG_VALUE = GXt_char3 ;
   }

   public void S282( )
   {
      /* 'SUB_BUTON_SET' Routine */
      if ( ( GXutil.strcmp(AV42P_AUTH_CD, AV106W_TBM01_CRC_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV108W_TBM01_RESEARCHER_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV110W_TBM01_SITE_MG_VALUE) == 0 ) )
      {
         lblBtn_crf_teisyutu_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_crf_teisyutu_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_crf_teisyutu_Visible, 5, 0)));
      }
      else
      {
         lblBtn_crf_teisyutu_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_crf_teisyutu_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_crf_teisyutu_Visible, 5, 0)));
      }
      if ( GXutil.strcmp(AV42P_AUTH_CD, AV107W_TBM01_DM_VALUE) == 0 )
      {
      }
      else
      {
         lblBtn_dm_kaijo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_dm_kaijo_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_dm_kaijo_Visible, 5, 0)));
         lblBtn_data_kotei_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_data_kotei_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_data_kotei_Visible, 5, 0)));
         lblBtn_crf_del_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_crf_del_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_crf_del_Visible, 5, 0)));
         lblBtn_csv_out_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_csv_out_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_csv_out_Visible, 5, 0)));
         tblTbl_ol_disp_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_ol_disp_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_ol_disp_Visible, 5, 0)));
      }
   }

   public void S172( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_ol_disp.removeAllItems();
      /* Using cursor H001H8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A54TAS01_DATA_KIND = H001H8_A54TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A113TAS01_DEL_FLG = H001H8_A113TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         n113TAS01_DEL_FLG = H001H8_n113TAS01_DEL_FLG[0] ;
         A19TAS01_ITEM_NM = H001H8_A19TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         n19TAS01_ITEM_NM = H001H8_n19TAS01_ITEM_NM[0] ;
         A150TAS01_CHAR_1 = H001H8_A150TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
         n150TAS01_CHAR_1 = H001H8_n150TAS01_CHAR_1[0] ;
         A149TAS01_SORT_NO = H001H8_A149TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
         n149TAS01_SORT_NO = H001H8_n149TAS01_SORT_NO[0] ;
         cmbavD_ol_disp.addItem(A150TAS01_CHAR_1, A19TAS01_ITEM_NM, (short)(0));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S306( )
   {
      /* 'SUB_CRF_AUTH_GET' Routine */
      AV73W_CRF_AUTH_FLG = false ;
      if ( GXutil.strcmp(AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), AV109W_TBM01_SAGYOJOHO_VALUE) != 0 )
      {
         AV73W_CRF_AUTH_FLG = true ;
      }
      else
      {
         AV168GXLvl1370 = (byte)(0) ;
         /* Using cursor H001H9 */
         pr_default.execute(7, new Object[] {new Long(AV44P_STUDY_ID), new Short(AV113W_TBM34_CRF_ID)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A463TBM34_DEL_FLG = H001H9_A463TBM34_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A463TBM34_DEL_FLG", A463TBM34_DEL_FLG);
            n463TBM34_DEL_FLG = H001H9_n463TBM34_DEL_FLG[0] ;
            A462TBM34_DISPLAY_FLG = H001H9_A462TBM34_DISPLAY_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A462TBM34_DISPLAY_FLG", A462TBM34_DISPLAY_FLG);
            n462TBM34_DISPLAY_FLG = H001H9_n462TBM34_DISPLAY_FLG[0] ;
            A461TBM34_STYDY_AUTH_CD = H001H9_A461TBM34_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A461TBM34_STYDY_AUTH_CD", A461TBM34_STYDY_AUTH_CD);
            A460TBM34_CRF_ID = H001H9_A460TBM34_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A460TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A460TBM34_CRF_ID, 4, 0)));
            A459TBM34_STUDY_ID = H001H9_A459TBM34_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A459TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A459TBM34_STUDY_ID, 10, 0)));
            AV168GXLvl1370 = (byte)(1) ;
            AV73W_CRF_AUTH_FLG = false ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         if ( AV168GXLvl1370 == 0 )
         {
            AV73W_CRF_AUTH_FLG = true ;
         }
      }
   }

   public void S336( )
   {
      /* 'SUB_SITE_NM_GET' Routine */
      AV105W_TAM08_SITE_SNM = "" ;
      /* Using cursor H001H10 */
      pr_default.execute(8, new Object[] {AV6W_TAM08_SITE_ID});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A139TAM08_DEL_FLG = H001H10_A139TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
         n139TAM08_DEL_FLG = H001H10_n139TAM08_DEL_FLG[0] ;
         A132TAM08_SITE_ID = H001H10_A132TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
         A134TAM08_SITE_SNM = H001H10_A134TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         n134TAM08_SITE_SNM = H001H10_n134TAM08_SITE_SNM[0] ;
         AV105W_TAM08_SITE_SNM = A134TAM08_SITE_SNM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S316( )
   {
      /* 'SUB_CRF_NM_GET' Routine */
      AV111W_TBM31_CRF_SNM = "" ;
      AV112W_TBM31_ORDER = 0 ;
      /* Using cursor H001H11 */
      pr_default.execute(9, new Object[] {new Long(AV44P_STUDY_ID), new Short(AV7W_TBM31_CRF_ID)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A223TBM31_DEL_FLG = H001H11_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001H11_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = H001H11_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A217TBM31_STUDY_ID = H001H11_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A550TBM31_CRF_SNM = H001H11_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = H001H11_n550TBM31_CRF_SNM[0] ;
         A221TBM31_ORDER = H001H11_A221TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         n221TBM31_ORDER = H001H11_n221TBM31_ORDER[0] ;
         AV111W_TBM31_CRF_SNM = A550TBM31_CRF_SNM ;
         AV112W_TBM31_ORDER = A221TBM31_ORDER ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S326( )
   {
      /* 'SUB_USER_NM_GET' Routine */
      AV104W_TAM07_USER_NM = "" ;
      /* Using cursor H001H12 */
      pr_default.execute(10, new Object[] {AV5W_TAM07_USER_ID});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A16TAM07_DEL_FLG = H001H12_A16TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         n16TAM07_DEL_FLG = H001H12_n16TAM07_DEL_FLG[0] ;
         A8TAM07_USER_ID = H001H12_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         A2TAM07_USER_NM = H001H12_A2TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
         n2TAM07_USER_NM = H001H12_n2TAM07_USER_NM[0] ;
         AV104W_TAM07_USER_NM = A2TAM07_USER_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S222( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV93W_SEL_CNT = (short)(0) ;
      AV68W_CHK_ALLON_DM_ARRIVAL_FLG = true ;
      AV69W_CHK_INPUT_END_KONZAI_FLG = true ;
      AV67W_CHK_ALLOFF_INPUT_END_FLG = true ;
      AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG = true ;
      AV34H_INPUT_END_FLG_SV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
      AV87W_IDX = 1 ;
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV93W_SEL_CNT = (short)(AV93W_SEL_CNT+1) ;
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "0") == 0 )
            {
               AV68W_CHK_ALLON_DM_ARRIVAL_FLG = false ;
            }
            else
            {
               AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG = false ;
            }
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "1") == 0 )
            {
               AV67W_CHK_ALLOFF_INPUT_END_FLG = false ;
            }
            if ( (GXutil.strcmp("", AV34H_INPUT_END_FLG_SV)==0) )
            {
               AV34H_INPUT_END_FLG_SV = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
            }
            else
            {
               if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg()) != 0 )
               {
                  AV69W_CHK_INPUT_END_KONZAI_FLG = false ;
               }
            }
            AV37H_SEL_TBT02_CRF_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
            AV38H_SEL_TBT02_SUBJECT_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
            AV39H_SEL_TBT02_UPD_CNT = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39H_SEL_TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( AV39H_SEL_TBT02_UPD_CNT, 10, 0)));
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
      }
   }

   public void S232( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV70W_CHK_STUDY_UPD_FLG = false ;
      AV172GXLvl1477 = (byte)(0) ;
      /* Using cursor H001H13 */
      pr_default.execute(11, new Object[] {new Long(AV44P_STUDY_ID)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A189TBM21_DEL_FLG = H001H13_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001H13_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = H001H13_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A513TBM21_STATUS = H001H13_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = H001H13_n513TBM21_STATUS[0] ;
         AV172GXLvl1477 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            AV70W_CHK_STUDY_UPD_FLG = true ;
            GXt_char3 = AV89W_MSG ;
            GXv_char10[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "操作", "", "", GXv_char10) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            AV70W_CHK_STUDY_UPD_FLG = true ;
            GXt_char3 = AV89W_MSG ;
            GXv_char10[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "操作", "", "", GXv_char10) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      if ( AV172GXLvl1477 == 0 )
      {
         AV70W_CHK_STUDY_UPD_FLG = true ;
         GXt_char3 = AV89W_MSG ;
         GXv_char10[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "操作", "", "", GXv_char10) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.GX_msglist.addItem(AV89W_MSG);
      }
   }

   public void S212( )
   {
      /* 'SUB_SDT_UPD' Routine */
      /* Start For Each Line in Grid1 */
      nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
      nGXsfl_189_fel_idx = (short)(0) ;
      while ( nGXsfl_189_fel_idx < nRC_Grid1 )
      {
         nGXsfl_189_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_189_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_189_fel_idx+1)) ;
         sGXsfl_189_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_fel_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_fel_idx );
         edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_fel_idx ;
         edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_fel_idx ;
         edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_fel_idx ;
         edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_fel_idx ;
         edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_fel_idx ;
         edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_fel_idx ;
         edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_fel_idx ;
         lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_fel_idx ;
         edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_fel_idx ;
         edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_fel_idx ;
         AV19D_GRD_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_sel_flg.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_SUBJECT_ID");
            GX_FocusControl = edtavD_grd_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22D_GRD_SUBJECT_ID = 0 ;
         }
         else
         {
            AV22D_GRD_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",")) ;
         }
         AV21D_GRD_SITE_SNM = httpContext.cgiGet( edtavD_grd_site_snm_Internalname) ;
         AV20D_GRD_SITE_ID = httpContext.cgiGet( edtavD_grd_site_id_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_ID");
            GX_FocusControl = edtavD_grd_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14D_GRD_CRF_ID = (short)(0) ;
         }
         else
         {
            AV14D_GRD_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",")) ;
         }
         AV15D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
         AV18D_GRD_LAST_UPD_DATETIME_VC = httpContext.cgiGet( edtavD_grd_last_upd_datetime_vc_Internalname) ;
         AV23D_GRD_UPD_USER_NM = httpContext.cgiGet( edtavD_grd_upd_user_nm_Internalname) ;
         AV17D_GRD_DM = httpContext.cgiGet( edtavD_grd_dm_Internalname) ;
         AV16D_GRD_DATA_KOTE = httpContext.cgiGet( edtavD_grd_data_kote_Internalname) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0388") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0388", "");
         }
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0388") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0388", "");
         }
         AV174GXV35 = 1 ;
         while ( AV174GXV35 <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV174GXV35));
            if ( ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() == AV22D_GRD_SUBJECT_ID ) && ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id(), AV20D_GRD_SITE_ID) == 0 ) && ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() == AV14D_GRD_CRF_ID ) )
            {
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( AV19D_GRD_SEL_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               if (true) break;
            }
            AV174GXV35 = (int)(AV174GXV35+1) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_189_fel_idx == 0 )
      {
         nGXsfl_189_idx = (short)(1) ;
         sGXsfl_189_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
         edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
         edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
         edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
         edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
         edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
         lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
         edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
         edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
      }
      nGXsfl_189_fel_idx = (short)(1) ;
   }

   public void S242( )
   {
      /* 'SUB_SDT_SAVE' Routine */
      AV95W_SESSION.setValue("B712_WP02_RESULT_DATA", AV10D_B712_SD06_RESULT_CRF.toxml(false, "B712_SD06_RESULT_CRF", "SmartEDC_SHIZUOKA"));
   }

   public void S142( )
   {
      /* 'SUB_SDT_GET' Routine */
      AV10D_B712_SD06_RESULT_CRF.fromxml(AV95W_SESSION.getValue("B712_WP02_RESULT_DATA"), "");
   }

   public void S202( )
   {
      /* 'SUB_SDT_SESSION_REMOVE' Routine */
      AV95W_SESSION.remove("B712_WP02_RESULT_DATA");
   }

   public void S132( )
   {
      /* 'SUB_ICON_DISP' Routine */
      tblTbl_grd_kngn_01_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_01_Visible, 5, 0)));
      tblTbl_grd_kngn_02_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_02_Visible, 5, 0)));
      tblTbl_grd_kngn_03_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_03_Visible, 5, 0)));
      tblTbl_grd_kngn_04_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_04_Visible, 5, 0)));
      tblTbl_grd_kngn_05_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_05_Visible, 5, 0)));
      tblTbl_grd_kngn_06_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_06_Visible, 5, 0)));
      tblTbl_grd_kngn_07_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_07_Visible, 5, 0)));
      tblTbl_grd_kngn_08_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_08_Visible, 5, 0)));
      tblTbl_grd_kngn_09_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_09_Visible, 5, 0)));
      tblTbl_grd_kngn_10_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_10_Visible, 5, 0)));
      tblTbl_icon_info_01_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_01_Visible, 5, 0)));
      tblTbl_icon_info_02_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_02_Visible, 5, 0)));
      tblTbl_icon_info_03_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_03_Visible, 5, 0)));
      tblTbl_icon_info_04_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_04_Visible, 5, 0)));
      tblTbl_icon_info_05_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_05_Visible, 5, 0)));
      tblTbl_icon_info_06_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_06_Visible, 5, 0)));
      tblTbl_icon_info_07_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_07_Visible, 5, 0)));
      tblTbl_icon_info_08_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_08_Visible, 5, 0)));
      tblTbl_icon_info_09_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_09_Visible, 5, 0)));
      tblTbl_icon_info_10_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_10_Visible, 5, 0)));
      AV87W_IDX = 0 ;
      AV175GXV36 = 1 ;
      while ( AV175GXV36 <= AV49SD_B712_SD08_ICON_INFO.size() )
      {
         AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV175GXV36));
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         if ( AV87W_IDX == 1 )
         {
            lblTxt_grd_kngn_01_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_01_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_01_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_01_Backcolor, 9, 0)));
            lblTxt_icon_01_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_01_Internalname, "Caption", lblTxt_icon_01_Caption);
            tblTbl_icon_01_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_01_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_01_Backcolor, 9, 0)));
            lblTxt_auth_01_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_01_Internalname, "Caption", lblTxt_auth_01_Caption);
            tblTbl_icon_info_01_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_01_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 2 )
         {
            lblTxt_grd_kngn_02_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_02_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_02_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_02_Backcolor, 9, 0)));
            lblTxt_icon_02_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_02_Internalname, "Caption", lblTxt_icon_02_Caption);
            tblTbl_icon_02_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_02_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_02_Backcolor, 9, 0)));
            lblTxt_auth_02_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_02_Internalname, "Caption", lblTxt_auth_02_Caption);
            tblTbl_icon_info_02_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_02_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 3 )
         {
            lblTxt_grd_kngn_03_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_03_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_03_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_03_Backcolor, 9, 0)));
            lblTxt_icon_03_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_03_Internalname, "Caption", lblTxt_icon_03_Caption);
            tblTbl_icon_03_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_03_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_03_Backcolor, 9, 0)));
            lblTxt_auth_03_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_03_Internalname, "Caption", lblTxt_auth_03_Caption);
            tblTbl_icon_info_03_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_03_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 4 )
         {
            lblTxt_grd_kngn_04_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_04_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_04_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_04_Backcolor, 9, 0)));
            lblTxt_icon_04_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_04_Internalname, "Caption", lblTxt_icon_04_Caption);
            tblTbl_icon_04_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_04_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_04_Backcolor, 9, 0)));
            lblTxt_auth_04_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_04_Internalname, "Caption", lblTxt_auth_04_Caption);
            tblTbl_icon_info_04_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_04_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 5 )
         {
            lblTxt_grd_kngn_05_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_05_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_05_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_05_Backcolor, 9, 0)));
            lblTxt_icon_05_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_05_Internalname, "Caption", lblTxt_icon_05_Caption);
            tblTbl_icon_05_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_05_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_05_Backcolor, 9, 0)));
            lblTxt_auth_05_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_05_Internalname, "Caption", lblTxt_auth_05_Caption);
            tblTbl_icon_info_05_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_05_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 6 )
         {
            lblTxt_grd_kngn_06_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_06_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_06_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_06_Backcolor, 9, 0)));
            lblTxt_icon_06_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_06_Internalname, "Caption", lblTxt_icon_06_Caption);
            tblTbl_icon_06_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_06_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_06_Backcolor, 9, 0)));
            lblTxt_auth_06_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_06_Internalname, "Caption", lblTxt_auth_06_Caption);
            tblTbl_icon_info_06_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_06_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 7 )
         {
            lblTxt_grd_kngn_07_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_07_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_07_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_07_Backcolor, 9, 0)));
            lblTxt_icon_07_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_07_Internalname, "Caption", lblTxt_icon_07_Caption);
            tblTbl_icon_07_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_07_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_07_Backcolor, 9, 0)));
            lblTxt_auth_07_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_07_Internalname, "Caption", lblTxt_auth_07_Caption);
            tblTbl_icon_info_07_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_07_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 8 )
         {
            lblTxt_grd_kngn_08_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_08_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_08_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_08_Backcolor, 9, 0)));
            lblTxt_icon_08_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_08_Internalname, "Caption", lblTxt_icon_08_Caption);
            tblTbl_icon_08_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_08_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_08_Backcolor, 9, 0)));
            lblTxt_auth_08_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_08_Internalname, "Caption", lblTxt_auth_08_Caption);
            tblTbl_icon_info_08_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_08_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 9 )
         {
            lblTxt_grd_kngn_09_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_09_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_09_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_09_Backcolor, 9, 0)));
            lblTxt_icon_09_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_09_Internalname, "Caption", lblTxt_icon_09_Caption);
            tblTbl_icon_09_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_09_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_09_Backcolor, 9, 0)));
            lblTxt_auth_09_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_09_Internalname, "Caption", lblTxt_auth_09_Caption);
            tblTbl_icon_info_07_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_07_Visible, 5, 0)));
         }
         else if ( AV87W_IDX == 10 )
         {
            lblTxt_grd_kngn_10_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            tblTbl_grd_kngn_10_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_kngn_10_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_kngn_10_Backcolor, 9, 0)));
            lblTxt_icon_10_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_icon_10_Internalname, "Caption", lblTxt_icon_10_Caption);
            tblTbl_icon_10_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_10_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_icon_10_Backcolor, 9, 0)));
            lblTxt_auth_10_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_10_Internalname, "Caption", lblTxt_auth_10_Caption);
            tblTbl_icon_info_10_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_icon_info_10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_icon_info_10_Visible, 5, 0)));
         }
         if ( AV87W_IDX == 10 )
         {
            if (true) break;
         }
         AV175GXV36 = (int)(AV175GXV36+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT11[0] = AV53W_A_LOGIN_SDT;
      GXv_char10[0] = AV81W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT11, GXv_char10) ;
      AV53W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT11[0] ;
      b712_wp02_result_crf_impl.this.AV81W_ERRCD = GXv_char10[0] ;
      if ( GXutil.strcmp(AV81W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV40H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
      AV54W_A819_JS = "" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  var ua = navigator.userAgent;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  if(ua.indexOf('iPhone')>0 || ua.indexOf('iPod')>0 || ua.indexOf('Android')>0 && ua.indexOf('Mobile')>0){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"    document.getElementById('"+GXutil.trim( edtavH_device_Internalname)+"').value = 'sp';" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  }else if(ua.indexOf('iPad')>0 || ua.indexOf('Android')>0){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"    document.getElementById('"+GXutil.trim( edtavH_device_Internalname)+"').value = 'tab';" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  }else{" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"    document.getElementById('"+GXutil.trim( edtavH_device_Internalname)+"').value = 'other';" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"  }" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV55W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV55W_A821_JS ;
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

   public void S341807( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV156Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_wp02_result_crf");
   }

   public void e271H2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281H2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291H2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e301H2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e311H2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e321H2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e331H2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e341H2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e351H2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e361H2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e371H2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e381H2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e391H2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e401H2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV10D_B712_SD06_RESULT_CRF.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT12[0] = AV30H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT12) ;
      AV30H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT12[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( AV10D_B712_SD06_RESULT_CRF.size() <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV40H_SRCH_FLG, "1") == 0 ) && ! AV82W_ERRFLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char10[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char10) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char10[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( AV10D_B712_SD06_RESULT_CRF.size(), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
   }

   public void wb_table2_390_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_del_exec_Internalname, "TXT_BTN_CRF_DEL_EXEC", "", "", lblTxt_btn_crf_del_exec_Jsonclick, "E\\'BTN_CRF_DEL_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_data_ktei_exec_Internalname, "TXT_BTN_DATA_KTEI_EXEC", "", "", lblTxt_btn_data_ktei_exec_Jsonclick, "E\\'BTN_DATA_KTEI_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_out_exec_Internalname, "TXT_BTN_CSV_OUT_EXEC", "", "", lblTxt_btn_csv_out_exec_Jsonclick, "E\\'BTN_CSV_OUT_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_teisyutu_exec_Internalname, "TXT_BTN_CRF_TEISYUTU_EXEC", "", "", lblTxt_btn_crf_teisyutu_exec_Jsonclick, "E\\'BTN_CRF_TEISYUTU_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dm_kaijo_exec_Internalname, "TXT_BTN_DM_KAIJO_EXEC", "", "", lblTxt_btn_dm_kaijo_exec_Jsonclick, "E\\'BTN_DM_KAIJO_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV33H_INIT_FLG", AV33H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 399,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV33H_INIT_FLG), GXutil.rtrim( localUtil.format( AV33H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(399);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 400,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV40H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV40H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(400);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV35H_KNGN_FLG", AV35H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV35H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV35H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(401);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV41H_SUBJECT_ID", AV41H_SUBJECT_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 402,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_Internalname, GXutil.rtrim( AV41H_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV41H_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(402);\"", "", "", "", "", edtavH_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 403,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_input_end_flg_sv_Internalname, GXutil.rtrim( AV34H_INPUT_END_FLG_SV), GXutil.rtrim( localUtil.format( AV34H_INPUT_END_FLG_SV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(403);\"", "", "", "", "", edtavH_input_end_flg_sv_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 404,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV37H_SEL_TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37H_SEL_TBT02_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV37H_SEL_TBT02_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(404);\"", "", "", "", "", edtavH_sel_tbt02_crf_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 405,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV38H_SEL_TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38H_SEL_TBT02_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV38H_SEL_TBT02_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(405);\"", "", "", "", "", edtavH_sel_tbt02_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV39H_SEL_TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( AV39H_SEL_TBT02_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_upd_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV39H_SEL_TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39H_SEL_TBT02_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV39H_SEL_TBT02_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(406);\"", "", "", "", "", edtavH_sel_tbt02_upd_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV36H_POPUP_ERR_CD", GXutil.str( AV36H_POPUP_ERR_CD, 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 407,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_err_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV36H_POPUP_ERR_CD, (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36H_POPUP_ERR_CD), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV36H_POPUP_ERR_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(407);\"", "", "", "", "", edtavH_popup_err_cd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV32H_ERR_MSG", AV32H_ERR_MSG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 408,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_err_msg_Internalname, GXutil.rtrim( AV32H_ERR_MSG), GXutil.rtrim( localUtil.format( AV32H_ERR_MSG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(408);\"", "", "", "", "", edtavH_err_msg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 230, "px", 18, "px", 3000, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         wb_table3_409_1H2( true) ;
      }
      else
      {
         wb_table3_409_1H2( false) ;
      }
      return  ;
   }

   public void wb_table3_409_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV31H_DEVICE", AV31H_DEVICE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 550,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_device_Internalname, GXutil.rtrim( AV31H_DEVICE), GXutil.rtrim( localUtil.format( AV31H_DEVICE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(550);\"", "", "", "", "", edtavH_device_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_390_1H2e( true) ;
      }
      else
      {
         wb_table2_390_1H2e( false) ;
      }
   }

   public void wb_table3_409_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(414);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "MAX_PAGE", "", "", lblTextblock29_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 419,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_page_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(419);\"", "", "", "", "", edtavCtlmax_page_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "REC_CNT", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 424,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(424);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "PAGE_KBN", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 434,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(434);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 439,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(439);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 444,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(444);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 449,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(449);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 454,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(454);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 459,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(459);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 464,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(464);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 469,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(469);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 474,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(474);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "PAGE09", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 479,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(479);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE10", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 484,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(484);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE_DISP01", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 489,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(489);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "PAGE_DISP02", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 494,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(494);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP03", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 499,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(499);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "PAGE_DISP04", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 504,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(504);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP05", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 509,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(509);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP06", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 514,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(514);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP07", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 519,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(519);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP08", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 524,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(524);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP09", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 529,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(529);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP10", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 534,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(534);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 539,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(539);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 544,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(544);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 549,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(549);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_409_1H2e( true) ;
      }
      else
      {
         wb_table3_409_1H2e( false) ;
      }
   }

   public void wb_table1_2_1H2( boolean wbgen )
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table4_6_1H2( true) ;
      }
      else
      {
         wb_table4_6_1H2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1H2e( boolean wbgen )
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
         wb_table1_2_1H2e( true) ;
      }
      else
      {
         wb_table1_2_1H2e( false) ;
      }
   }

   public void wb_table4_6_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
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
         wb_table5_12_1H2( true) ;
      }
      else
      {
         wb_table5_12_1H2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table6_43_1H2( true) ;
      }
      else
      {
         wb_table6_43_1H2( false) ;
      }
      return  ;
   }

   public void wb_table6_43_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:15px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0388"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0388"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0388"+"");
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
         wb_table4_6_1H2e( true) ;
      }
      else
      {
         wb_table4_6_1H2e( false) ;
      }
   }

   public void wb_table6_43_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_49_1H2( true) ;
      }
      else
      {
         wb_table7_49_1H2( false) ;
      }
      return  ;
   }

   public void wb_table7_49_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_43_1H2e( true) ;
      }
      else
      {
         wb_table6_43_1H2e( false) ;
      }
   }

   public void wb_table7_49_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table8_52_1H2( true) ;
      }
      else
      {
         wb_table8_52_1H2( false) ;
      }
      return  ;
   }

   public void wb_table8_52_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table9_144_1H2( true) ;
      }
      else
      {
         wb_table9_144_1H2( false) ;
      }
      return  ;
   }

   public void wb_table9_144_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_164_1H2( true) ;
      }
      else
      {
         wb_table10_164_1H2( false) ;
      }
      return  ;
   }

   public void wb_table10_164_1H2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"189\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV19D_GRD_SEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV21D_GRD_SITE_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_site_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV20D_GRD_SITE_ID));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_site_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd_site_id_Visible, (byte)(5), (byte)(0), ".", "")));
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV15D_GRD_CRF_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_01_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_02_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_03_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_04_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_05_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_06_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_07_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_08_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_08_Caption);
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_08_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV18D_GRD_LAST_UPD_DATETIME_VC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_last_upd_datetime_vc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV23D_GRD_UPD_USER_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_upd_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_06_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV17D_GRD_DM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV16D_GRD_DATA_KOTE));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_data_kote_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 189 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_189_idx-1) ;
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
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table11_275_1H2( true) ;
      }
      else
      {
         wb_table11_275_1H2( false) ;
      }
      return  ;
   }

   public void wb_table11_275_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_49_1H2e( true) ;
      }
      else
      {
         wb_table7_49_1H2e( false) ;
      }
   }

   public void wb_table11_275_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "※一覧のアイコンは右記の権限を示す：", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_281_1H2( true) ;
      }
      else
      {
         wb_table12_281_1H2( false) ;
      }
      return  ;
   }

   public void wb_table12_281_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_292_1H2( true) ;
      }
      else
      {
         wb_table13_292_1H2( false) ;
      }
      return  ;
   }

   public void wb_table13_292_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_303_1H2( true) ;
      }
      else
      {
         wb_table14_303_1H2( false) ;
      }
      return  ;
   }

   public void wb_table14_303_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_314_1H2( true) ;
      }
      else
      {
         wb_table15_314_1H2( false) ;
      }
      return  ;
   }

   public void wb_table15_314_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_325_1H2( true) ;
      }
      else
      {
         wb_table16_325_1H2( false) ;
      }
      return  ;
   }

   public void wb_table16_325_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_336_1H2( true) ;
      }
      else
      {
         wb_table17_336_1H2( false) ;
      }
      return  ;
   }

   public void wb_table17_336_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_347_1H2( true) ;
      }
      else
      {
         wb_table18_347_1H2( false) ;
      }
      return  ;
   }

   public void wb_table18_347_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_357_1H2( true) ;
      }
      else
      {
         wb_table19_357_1H2( false) ;
      }
      return  ;
   }

   public void wb_table19_357_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_367_1H2( true) ;
      }
      else
      {
         wb_table20_367_1H2( false) ;
      }
      return  ;
   }

   public void wb_table20_367_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_377_1H2( true) ;
      }
      else
      {
         wb_table21_377_1H2( false) ;
      }
      return  ;
   }

   public void wb_table21_377_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_275_1H2e( true) ;
      }
      else
      {
         wb_table11_275_1H2e( false) ;
      }
   }

   public void wb_table21_377_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_10_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_10_Internalname, tblTbl_icon_info_10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_380_1H2( true) ;
      }
      else
      {
         wb_table22_380_1H2( false) ;
      }
      return  ;
   }

   public void wb_table22_380_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_10_Internalname, lblTxt_auth_10_Caption, "", "", lblTxt_auth_10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_377_1H2e( true) ;
      }
      else
      {
         wb_table21_377_1H2e( false) ;
      }
   }

   public void wb_table22_380_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + "Transparent;" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_10_Internalname, tblTbl_icon_10_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_10_Internalname, lblTxt_icon_10_Caption, "", "", lblTxt_icon_10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_380_1H2e( true) ;
      }
      else
      {
         wb_table22_380_1H2e( false) ;
      }
   }

   public void wb_table20_367_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_09_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_09_Internalname, tblTbl_icon_info_09_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_370_1H2( true) ;
      }
      else
      {
         wb_table23_370_1H2( false) ;
      }
      return  ;
   }

   public void wb_table23_370_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_09_Internalname, lblTxt_auth_09_Caption, "", "", lblTxt_auth_09_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_367_1H2e( true) ;
      }
      else
      {
         wb_table20_367_1H2e( false) ;
      }
   }

   public void wb_table23_370_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + "Transparent;" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_09_Internalname, tblTbl_icon_09_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_09_Internalname, lblTxt_icon_09_Caption, "", "", lblTxt_icon_09_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_370_1H2e( true) ;
      }
      else
      {
         wb_table23_370_1H2e( false) ;
      }
   }

   public void wb_table19_357_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_08_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_08_Internalname, tblTbl_icon_info_08_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_360_1H2( true) ;
      }
      else
      {
         wb_table24_360_1H2( false) ;
      }
      return  ;
   }

   public void wb_table24_360_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_08_Internalname, lblTxt_auth_08_Caption, "", "", lblTxt_auth_08_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_357_1H2e( true) ;
      }
      else
      {
         wb_table19_357_1H2e( false) ;
      }
   }

   public void wb_table24_360_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + "Transparent;" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_08_Internalname, tblTbl_icon_08_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_08_Internalname, lblTxt_icon_08_Caption, "", "", lblTxt_icon_08_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_360_1H2e( true) ;
      }
      else
      {
         wb_table24_360_1H2e( false) ;
      }
   }

   public void wb_table18_347_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_07_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_07_Internalname, tblTbl_icon_info_07_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_350_1H2( true) ;
      }
      else
      {
         wb_table25_350_1H2( false) ;
      }
      return  ;
   }

   public void wb_table25_350_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_07_Internalname, lblTxt_auth_07_Caption, "", "", lblTxt_auth_07_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_347_1H2e( true) ;
      }
      else
      {
         wb_table18_347_1H2e( false) ;
      }
   }

   public void wb_table25_350_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_07_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_07_Internalname, tblTbl_icon_07_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_07_Internalname, lblTxt_icon_07_Caption, "", "", lblTxt_icon_07_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_350_1H2e( true) ;
      }
      else
      {
         wb_table25_350_1H2e( false) ;
      }
   }

   public void wb_table17_336_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_06_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_06_Internalname, tblTbl_icon_info_06_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_339_1H2( true) ;
      }
      else
      {
         wb_table26_339_1H2( false) ;
      }
      return  ;
   }

   public void wb_table26_339_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_06_Internalname, lblTxt_auth_06_Caption, "", "", lblTxt_auth_06_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_336_1H2e( true) ;
      }
      else
      {
         wb_table17_336_1H2e( false) ;
      }
   }

   public void wb_table26_339_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_06_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_06_Internalname, tblTbl_icon_06_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_06_Internalname, lblTxt_icon_06_Caption, "", "", lblTxt_icon_06_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_339_1H2e( true) ;
      }
      else
      {
         wb_table26_339_1H2e( false) ;
      }
   }

   public void wb_table16_325_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_05_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_05_Internalname, tblTbl_icon_info_05_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_328_1H2( true) ;
      }
      else
      {
         wb_table27_328_1H2( false) ;
      }
      return  ;
   }

   public void wb_table27_328_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_05_Internalname, lblTxt_auth_05_Caption, "", "", lblTxt_auth_05_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_325_1H2e( true) ;
      }
      else
      {
         wb_table16_325_1H2e( false) ;
      }
   }

   public void wb_table27_328_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_05_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_05_Internalname, tblTbl_icon_05_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_05_Internalname, lblTxt_icon_05_Caption, "", "", lblTxt_icon_05_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_328_1H2e( true) ;
      }
      else
      {
         wb_table27_328_1H2e( false) ;
      }
   }

   public void wb_table15_314_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_04_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_04_Internalname, tblTbl_icon_info_04_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table28_317_1H2( true) ;
      }
      else
      {
         wb_table28_317_1H2( false) ;
      }
      return  ;
   }

   public void wb_table28_317_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_04_Internalname, lblTxt_auth_04_Caption, "", "", lblTxt_auth_04_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_314_1H2e( true) ;
      }
      else
      {
         wb_table15_314_1H2e( false) ;
      }
   }

   public void wb_table28_317_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_04_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_04_Internalname, tblTbl_icon_04_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_04_Internalname, lblTxt_icon_04_Caption, "", "", lblTxt_icon_04_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_317_1H2e( true) ;
      }
      else
      {
         wb_table28_317_1H2e( false) ;
      }
   }

   public void wb_table14_303_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_03_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_03_Internalname, tblTbl_icon_info_03_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table29_306_1H2( true) ;
      }
      else
      {
         wb_table29_306_1H2( false) ;
      }
      return  ;
   }

   public void wb_table29_306_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_03_Internalname, lblTxt_auth_03_Caption, "", "", lblTxt_auth_03_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_303_1H2e( true) ;
      }
      else
      {
         wb_table14_303_1H2e( false) ;
      }
   }

   public void wb_table29_306_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_03_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_03_Internalname, tblTbl_icon_03_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_03_Internalname, lblTxt_icon_03_Caption, "", "", lblTxt_icon_03_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table29_306_1H2e( true) ;
      }
      else
      {
         wb_table29_306_1H2e( false) ;
      }
   }

   public void wb_table13_292_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_02_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_02_Internalname, tblTbl_icon_info_02_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table30_295_1H2( true) ;
      }
      else
      {
         wb_table30_295_1H2( false) ;
      }
      return  ;
   }

   public void wb_table30_295_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_02_Internalname, lblTxt_auth_02_Caption, "", "", lblTxt_auth_02_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_292_1H2e( true) ;
      }
      else
      {
         wb_table13_292_1H2e( false) ;
      }
   }

   public void wb_table30_295_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_02_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_02_Internalname, tblTbl_icon_02_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_02_Internalname, lblTxt_icon_02_Caption, "", "", lblTxt_icon_02_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table30_295_1H2e( true) ;
      }
      else
      {
         wb_table30_295_1H2e( false) ;
      }
   }

   public void wb_table12_281_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_icon_info_01_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_info_01_Internalname, tblTbl_icon_info_01_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table31_284_1H2( true) ;
      }
      else
      {
         wb_table31_284_1H2( false) ;
      }
      return  ;
   }

   public void wb_table31_284_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_01_Internalname, lblTxt_auth_01_Caption, "", "", lblTxt_auth_01_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_281_1H2e( true) ;
      }
      else
      {
         wb_table12_281_1H2e( false) ;
      }
   }

   public void wb_table31_284_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_01_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_01_Internalname, tblTbl_icon_01_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_01_Internalname, lblTxt_icon_01_Caption, "", "", lblTxt_icon_01_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table31_284_1H2e( true) ;
      }
      else
      {
         wb_table31_284_1H2e( false) ;
      }
   }

   public void wb_table10_164_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_GRD_ALL_SEL_FLG", GXutil.booltostr( AV12D_GRD_ALL_SEL_FLG));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_sel_flg.getInternalname(), GXutil.booltostr( AV12D_GRD_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(167, this, 'true', 'false');gx.ajax.executeCliEvent('e251h2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(167);\"");
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "選択", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "患者No", "", "", lblTextblock34_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:110px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "施設", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:160px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "CRF", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:150px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "入力可能", "", "", lblTextblock37_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, "最終更新日時", "", "", lblTextblock51_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:125px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "最終更新者", "", "", lblTextblock39_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "更新時<Br>権限", "", "", lblTextblock28_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "DM着", "", "", lblTextblock41_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "ﾃﾞｰﾀ固定", "", "", lblTextblock42_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_164_1H2e( true) ;
      }
      else
      {
         wb_table10_164_1H2e( false) ;
      }
   }

   public void wb_table9_144_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table32_147_1H2( true) ;
      }
      else
      {
         wb_table32_147_1H2( false) ;
      }
      return  ;
   }

   public void wb_table32_147_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_sort, cmbavD_sort.getInternalname(), AV27D_SORT, 1, cmbavD_sort.getJsonclick(), 5, "EVD_SORT.CLICK.", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", true, "HLP_B712_WP02_RESULT_CRF.htm");
         cmbavD_sort.setValue( AV27D_SORT );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_sort.getInternalname(), "Values", cmbavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_144_1H2e( true) ;
      }
      else
      {
         wb_table9_144_1H2e( false) ;
      }
   }

   public void wb_table32_147_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_ol_disp_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_ol_disp_Internalname, tblTbl_ol_disp_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "Overlay表示：", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_189_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_ol_disp, cmbavD_ol_disp.getInternalname(), AV24D_OL_DISP, 1, cmbavD_ol_disp.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(152);\"", "", true, "HLP_B712_WP02_RESULT_CRF.htm");
         cmbavD_ol_disp.setValue( AV24D_OL_DISP );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_ol_disp.getInternalname(), "Values", cmbavD_ol_disp.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table32_147_1H2e( true) ;
      }
      else
      {
         wb_table32_147_1H2e( false) ;
      }
   }

   public void wb_table8_52_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table33_58_1H2( true) ;
      }
      else
      {
         wb_table33_58_1H2( false) ;
      }
      return  ;
   }

   public void wb_table33_58_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_52_1H2e( true) ;
      }
      else
      {
         wb_table8_52_1H2e( false) ;
      }
   }

   public void wb_table33_58_1H2( boolean wbgen )
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
         wb_table34_61_1H2( true) ;
      }
      else
      {
         wb_table34_61_1H2( false) ;
      }
      return  ;
   }

   public void wb_table34_61_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table35_67_1H2( true) ;
      }
      else
      {
         wb_table35_67_1H2( false) ;
      }
      return  ;
   }

   public void wb_table35_67_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table36_73_1H2( true) ;
      }
      else
      {
         wb_table36_73_1H2( false) ;
      }
      return  ;
   }

   public void wb_table36_73_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table37_79_1H2( true) ;
      }
      else
      {
         wb_table37_79_1H2( false) ;
      }
      return  ;
   }

   public void wb_table37_79_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table38_85_1H2( true) ;
      }
      else
      {
         wb_table38_85_1H2( false) ;
      }
      return  ;
   }

   public void wb_table38_85_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table39_91_1H2( true) ;
      }
      else
      {
         wb_table39_91_1H2( false) ;
      }
      return  ;
   }

   public void wb_table39_91_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table40_97_1H2( true) ;
      }
      else
      {
         wb_table40_97_1H2( false) ;
      }
      return  ;
   }

   public void wb_table40_97_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table41_103_1H2( true) ;
      }
      else
      {
         wb_table41_103_1H2( false) ;
      }
      return  ;
   }

   public void wb_table41_103_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table42_109_1H2( true) ;
      }
      else
      {
         wb_table42_109_1H2( false) ;
      }
      return  ;
   }

   public void wb_table42_109_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table43_115_1H2( true) ;
      }
      else
      {
         wb_table43_115_1H2( false) ;
      }
      return  ;
   }

   public void wb_table43_115_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table44_121_1H2( true) ;
      }
      else
      {
         wb_table44_121_1H2( false) ;
      }
      return  ;
   }

   public void wb_table44_121_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table45_127_1H2( true) ;
      }
      else
      {
         wb_table45_127_1H2( false) ;
      }
      return  ;
   }

   public void wb_table45_127_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table46_133_1H2( true) ;
      }
      else
      {
         wb_table46_133_1H2( false) ;
      }
      return  ;
   }

   public void wb_table46_133_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table47_139_1H2( true) ;
      }
      else
      {
         wb_table47_139_1H2( false) ;
      }
      return  ;
   }

   public void wb_table47_139_1H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table33_58_1H2e( true) ;
      }
      else
      {
         wb_table33_58_1H2e( false) ;
      }
   }

   public void wb_table47_139_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table47_139_1H2e( true) ;
      }
      else
      {
         wb_table47_139_1H2e( false) ;
      }
   }

   public void wb_table46_133_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table46_133_1H2e( true) ;
      }
      else
      {
         wb_table46_133_1H2e( false) ;
      }
   }

   public void wb_table45_127_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table45_127_1H2e( true) ;
      }
      else
      {
         wb_table45_127_1H2e( false) ;
      }
   }

   public void wb_table44_121_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table44_121_1H2e( true) ;
      }
      else
      {
         wb_table44_121_1H2e( false) ;
      }
   }

   public void wb_table43_115_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table43_115_1H2e( true) ;
      }
      else
      {
         wb_table43_115_1H2e( false) ;
      }
   }

   public void wb_table42_109_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table42_109_1H2e( true) ;
      }
      else
      {
         wb_table42_109_1H2e( false) ;
      }
   }

   public void wb_table41_103_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table41_103_1H2e( true) ;
      }
      else
      {
         wb_table41_103_1H2e( false) ;
      }
   }

   public void wb_table40_97_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table40_97_1H2e( true) ;
      }
      else
      {
         wb_table40_97_1H2e( false) ;
      }
   }

   public void wb_table39_91_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table39_91_1H2e( true) ;
      }
      else
      {
         wb_table39_91_1H2e( false) ;
      }
   }

   public void wb_table38_85_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table38_85_1H2e( true) ;
      }
      else
      {
         wb_table38_85_1H2e( false) ;
      }
   }

   public void wb_table37_79_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table37_79_1H2e( true) ;
      }
      else
      {
         wb_table37_79_1H2e( false) ;
      }
   }

   public void wb_table36_73_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table36_73_1H2e( true) ;
      }
      else
      {
         wb_table36_73_1H2e( false) ;
      }
   }

   public void wb_table35_67_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table35_67_1H2e( true) ;
      }
      else
      {
         wb_table35_67_1H2e( false) ;
      }
   }

   public void wb_table34_61_1H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table34_61_1H2e( true) ;
      }
      else
      {
         wb_table34_61_1H2e( false) ;
      }
   }

   public void wb_table5_12_1H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_open_Internalname, "CRFを開く", "", "", lblBtn_crf_open_Jsonclick, "E\\'BTN_CRF_OPEN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"4\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_chg_reki_Internalname, "変更履歴", "", "", lblBtn_chg_reki_Jsonclick, "E\\'BTN_CHG_REKI\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_ssai_hyoj_Internalname, "詳細表示", "", "", lblBtn_ssai_hyoj_Jsonclick, "E\\'BTN_SSAI_HYOJ\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_teisyutu_Internalname, "CRF提出", "", "", lblBtn_crf_teisyutu_Jsonclick, "E\\'BTN_CRF_TEISYUTU\\'.", StyleString, ClassString, 5, "", lblBtn_crf_teisyutu_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dm_kaijo_Internalname, "DM到着解除", "", "", lblBtn_dm_kaijo_Jsonclick, "E\\'BTN_DM_KAIJO\\'.", StyleString, ClassString, 5, "", lblBtn_dm_kaijo_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_data_kotei_Internalname, "データ固定", "", "", lblBtn_data_kotei_Jsonclick, "E\\'BTN_DATA_KTEI\\'.", StyleString, ClassString, 5, "", lblBtn_data_kotei_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_del_Internalname, "CRF削除", "", "", lblBtn_crf_del_Jsonclick, "E\\'BTN_CRF_DEL\\'.", StyleString, ClassString, 5, "", lblBtn_crf_del_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_csv_out_Internalname, "CSV出力", "", "", lblBtn_csv_out_Jsonclick, "E\\'BTN_CSV_OUT\\'.", StyleString, ClassString, 5, "", lblBtn_csv_out_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_search_back_Internalname, "検索条件に戻る", "", "", lblBtn_search_back_Jsonclick, "E\\'BTN_SEARCH_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1H2e( true) ;
      }
      else
      {
         wb_table5_12_1H2e( false) ;
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
      pa1H2( ) ;
      ws1H2( ) ;
      we1H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1574423");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b712_wp02_result_crf.js", "?1574423");
      /* End function include_jscripts */
   }

   public void sendrow_1892( )
   {
      wb1H0( ) ;
      if ( ( 15 * 1 == 0 ) || ( nGXsfl_189_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_189_idx/ (double) (1)) % (2)) == 0 )
            {
               subGrid1_Backcolor = (int)(0xF5F5F5) ;
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
            if ( ( 1 == 0 ) && ( nGXsfl_189_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_189_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_189_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_189_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:29px;width:50px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 192,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavD_grd_sel_flg.getInternalname(),GXutil.booltostr( AV19D_GRD_SEL_FLG),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(192, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(192);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+";width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 194,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV22D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")),((edtavD_grd_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22D_GRD_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV22D_GRD_SUBJECT_ID), "ZZZZZ9")),TempTags+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(194);\"" : " "),"","","","",edtavD_grd_subject_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_subject_id_Enabled),new Integer(0),new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:110px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 196,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_site_snm_Internalname,GXutil.rtrim( AV21D_GRD_SITE_SNM),"",TempTags+((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(196);\"" : " "),"","","","",edtavD_grd_site_snm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_site_snm_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 197,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "color:#FF0000;" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_site_id_Internalname,GXutil.rtrim( AV20D_GRD_SITE_ID),"",TempTags+((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(197);\"" : " "),"","","","",edtavD_grd_site_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavD_grd_site_id_Visible),new Integer(edtavD_grd_site_id_Enabled),new Integer(0),new Integer(100),"px",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:160px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTable8_Internalname+"_"+sGXsfl_189_idx,new Integer(1),"TableBase","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:20px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 202,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV14D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14D_GRD_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV14D_GRD_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(202);\"" : " "),"","","","",edtavD_grd_crf_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_crf_id_Enabled),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:130px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 204,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_crf_snm_Internalname,GXutil.rtrim( AV15D_GRD_CRF_SNM),"",TempTags+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(204);\"" : " "),"","","","",edtavD_grd_crf_snm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_crf_snm_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:150px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTable5_Internalname+"_"+sGXsfl_189_idx,new Integer(1),"TableBase","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_01_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_01_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_01_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_01_Internalname,lblTxt_grd_kngn_01_Caption,"","",lblTxt_grd_kngn_01_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_02_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_02_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_02_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_02_Internalname,lblTxt_grd_kngn_02_Caption,"","",lblTxt_grd_kngn_02_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_03_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_03_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_03_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_03_Internalname,lblTxt_grd_kngn_03_Caption,"","",lblTxt_grd_kngn_03_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_04_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_04_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_04_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_04_Internalname,lblTxt_grd_kngn_04_Caption,"","",lblTxt_grd_kngn_04_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_05_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_05_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_05_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_05_Internalname,lblTxt_grd_kngn_05_Caption,"","",lblTxt_grd_kngn_05_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_06_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_06_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_06_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_06_Internalname,lblTxt_grd_kngn_06_Caption,"","",lblTxt_grd_kngn_06_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:19px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_07_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_07_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_07_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_07_Internalname,lblTxt_grd_kngn_07_Caption,"","",lblTxt_grd_kngn_07_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_08_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_08_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_08_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_08_Internalname,lblTxt_grd_kngn_08_Caption,"","",lblTxt_grd_kngn_08_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_09_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_09_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_09_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_09_Internalname,lblTxt_grd_kngn_09_Caption,"","",lblTxt_grd_kngn_09_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_10_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_kngn_10_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_10_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_10_Internalname,lblTxt_grd_kngn_10_Caption,"","",lblTxt_grd_kngn_10_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("table");
         }
         /* End of table */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 259,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_last_upd_datetime_vc_Internalname,GXutil.rtrim( AV18D_GRD_LAST_UPD_DATETIME_VC),"",TempTags+((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(259);\"" : " "),"","","","",edtavD_grd_last_upd_datetime_vc_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_last_upd_datetime_vc_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:125px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 261,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_upd_user_nm_Internalname,GXutil.rtrim( AV23D_GRD_UPD_USER_NM),"",TempTags+((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(261);\"" : " "),"","","","",edtavD_grd_upd_user_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_upd_user_nm_Enabled),new Integer(0),new Integer(30),"chr",new Integer(1),"row",new Integer(30),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:45px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd_upd_kngn_Internalname+"_"+sGXsfl_189_idx,new Integer(tblTbl_grd_upd_kngn_Visible),"TableSymbol","",new Integer(tblTbl_grd_upd_kngn_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblTxt_grd_upd_kngn_Internalname,lblTxt_grd_upd_kngn_Caption,"","",lblTxt_grd_upd_kngn_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:35px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 268,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_dm_Internalname,GXutil.rtrim( AV17D_GRD_DM),"",TempTags+((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(268);\"" : " "),"","","","",edtavD_grd_dm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_dm_Enabled),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:35px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 270,'',false,'"+sGXsfl_189_idx+"',189)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_data_kote_Internalname,GXutil.rtrim( AV16D_GRD_DATA_KOTE),"",TempTags+((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(270);\"" : " "),"","","","",edtavD_grd_data_kote_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_data_kote_Enabled),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(189),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
               if ( ((int)(nGXsfl_189_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_189_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_189_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_189_idx+1)) ;
         sGXsfl_189_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_189_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_189_idx );
         edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_189_idx ;
         edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_189_idx ;
         edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_189_idx ;
         edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_08_Internalname = "TXT_GRD_KNGN_08_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_09_Internalname = "TXT_GRD_KNGN_09_"+sGXsfl_189_idx ;
         lblTxt_grd_kngn_10_Internalname = "TXT_GRD_KNGN_10_"+sGXsfl_189_idx ;
         edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_189_idx ;
         edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_189_idx ;
         lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_189_idx ;
         edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_189_idx ;
         edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_189_idx ;
      }
      /* End function sendrow_1892 */
   }

   public void init_default_properties( )
   {
      lblBtn_crf_open_Internalname = "BTN_CRF_OPEN" ;
      lblBtn_chg_reki_Internalname = "BTN_CHG_REKI" ;
      lblBtn_ssai_hyoj_Internalname = "BTN_SSAI_HYOJ" ;
      lblBtn_crf_teisyutu_Internalname = "BTN_CRF_TEISYUTU" ;
      lblBtn_dm_kaijo_Internalname = "BTN_DM_KAIJO" ;
      lblBtn_data_kotei_Internalname = "BTN_DATA_KOTEI" ;
      lblBtn_crf_del_Internalname = "BTN_CRF_DEL" ;
      lblBtn_csv_out_Internalname = "BTN_CSV_OUT" ;
      lblBtn_search_back_Internalname = "BTN_SEARCH_BACK" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
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
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      cmbavD_ol_disp.setInternalname( "vD_OL_DISP" );
      tblTbl_ol_disp_Internalname = "TBL_OL_DISP" ;
      cmbavD_sort.setInternalname( "vD_SORT" );
      tblTable9_Internalname = "TABLE9" ;
      chkavD_grd_all_sel_flg.setInternalname( "vD_GRD_ALL_SEL_FLG" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable8_Internalname = "TABLE8" ;
      tblTbl_grd_kngn_01_Internalname = "TBL_GRD_KNGN_01" ;
      tblTbl_grd_kngn_02_Internalname = "TBL_GRD_KNGN_02" ;
      tblTbl_grd_kngn_03_Internalname = "TBL_GRD_KNGN_03" ;
      tblTbl_grd_kngn_04_Internalname = "TBL_GRD_KNGN_04" ;
      tblTbl_grd_kngn_05_Internalname = "TBL_GRD_KNGN_05" ;
      tblTbl_grd_kngn_06_Internalname = "TBL_GRD_KNGN_06" ;
      tblTbl_grd_kngn_07_Internalname = "TBL_GRD_KNGN_07" ;
      tblTbl_grd_kngn_08_Internalname = "TBL_GRD_KNGN_08" ;
      tblTbl_grd_kngn_09_Internalname = "TBL_GRD_KNGN_09" ;
      tblTbl_grd_kngn_10_Internalname = "TBL_GRD_KNGN_10" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTbl_grd_upd_kngn_Internalname = "TBL_GRD_UPD_KNGN" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      lblTxt_icon_01_Internalname = "TXT_ICON_01" ;
      tblTbl_icon_01_Internalname = "TBL_ICON_01" ;
      lblTxt_auth_01_Internalname = "TXT_AUTH_01" ;
      tblTbl_icon_info_01_Internalname = "TBL_ICON_INFO_01" ;
      lblTxt_icon_02_Internalname = "TXT_ICON_02" ;
      tblTbl_icon_02_Internalname = "TBL_ICON_02" ;
      lblTxt_auth_02_Internalname = "TXT_AUTH_02" ;
      tblTbl_icon_info_02_Internalname = "TBL_ICON_INFO_02" ;
      lblTxt_icon_03_Internalname = "TXT_ICON_03" ;
      tblTbl_icon_03_Internalname = "TBL_ICON_03" ;
      lblTxt_auth_03_Internalname = "TXT_AUTH_03" ;
      tblTbl_icon_info_03_Internalname = "TBL_ICON_INFO_03" ;
      lblTxt_icon_04_Internalname = "TXT_ICON_04" ;
      tblTbl_icon_04_Internalname = "TBL_ICON_04" ;
      lblTxt_auth_04_Internalname = "TXT_AUTH_04" ;
      tblTbl_icon_info_04_Internalname = "TBL_ICON_INFO_04" ;
      lblTxt_icon_05_Internalname = "TXT_ICON_05" ;
      tblTbl_icon_05_Internalname = "TBL_ICON_05" ;
      lblTxt_auth_05_Internalname = "TXT_AUTH_05" ;
      tblTbl_icon_info_05_Internalname = "TBL_ICON_INFO_05" ;
      lblTxt_icon_06_Internalname = "TXT_ICON_06" ;
      tblTbl_icon_06_Internalname = "TBL_ICON_06" ;
      lblTxt_auth_06_Internalname = "TXT_AUTH_06" ;
      tblTbl_icon_info_06_Internalname = "TBL_ICON_INFO_06" ;
      lblTxt_icon_07_Internalname = "TXT_ICON_07" ;
      tblTbl_icon_07_Internalname = "TBL_ICON_07" ;
      lblTxt_auth_07_Internalname = "TXT_AUTH_07" ;
      tblTbl_icon_info_07_Internalname = "TBL_ICON_INFO_07" ;
      lblTxt_icon_08_Internalname = "TXT_ICON_08" ;
      tblTbl_icon_08_Internalname = "TBL_ICON_08" ;
      lblTxt_auth_08_Internalname = "TXT_AUTH_08" ;
      tblTbl_icon_info_08_Internalname = "TBL_ICON_INFO_08" ;
      lblTxt_icon_09_Internalname = "TXT_ICON_09" ;
      tblTbl_icon_09_Internalname = "TBL_ICON_09" ;
      lblTxt_auth_09_Internalname = "TXT_AUTH_09" ;
      tblTbl_icon_info_09_Internalname = "TBL_ICON_INFO_09" ;
      lblTxt_icon_10_Internalname = "TXT_ICON_10" ;
      tblTbl_icon_10_Internalname = "TBL_ICON_10" ;
      lblTxt_auth_10_Internalname = "TXT_AUTH_10" ;
      tblTbl_icon_info_10_Internalname = "TBL_ICON_INFO_10" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_crf_del_exec_Internalname = "TXT_BTN_CRF_DEL_EXEC" ;
      lblTxt_btn_data_ktei_exec_Internalname = "TXT_BTN_DATA_KTEI_EXEC" ;
      lblTxt_btn_csv_out_exec_Internalname = "TXT_BTN_CSV_OUT_EXEC" ;
      lblTxt_btn_crf_teisyutu_exec_Internalname = "TXT_BTN_CRF_TEISYUTU_EXEC" ;
      lblTxt_btn_dm_kaijo_exec_Internalname = "TXT_BTN_DM_KAIJO_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_subject_id_Internalname = "vH_SUBJECT_ID" ;
      edtavH_input_end_flg_sv_Internalname = "vH_INPUT_END_FLG_SV" ;
      edtavH_sel_tbt02_crf_id_Internalname = "vH_SEL_TBT02_CRF_ID" ;
      edtavH_sel_tbt02_subject_id_Internalname = "vH_SEL_TBT02_SUBJECT_ID" ;
      edtavH_sel_tbt02_upd_cnt_Internalname = "vH_SEL_TBT02_UPD_CNT" ;
      edtavH_popup_err_cd_Internalname = "vH_POPUP_ERR_CD" ;
      edtavH_err_msg_Internalname = "vH_ERR_MSG" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavCtlmax_page_Internalname = "CTLMAX_PAGE" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
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
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtavCtlpage09_Internalname = "CTLPAGE09" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtavCtlpage10_Internalname = "CTLPAGE10" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtavCtlpage_disp01_Internalname = "CTLPAGE_DISP01" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavCtlpage_disp02_Internalname = "CTLPAGE_DISP02" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCtlpage_disp03_Internalname = "CTLPAGE_DISP03" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavCtlpage_disp04_Internalname = "CTLPAGE_DISP04" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtavCtlpage_disp05_Internalname = "CTLPAGE_DISP05" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtavCtlpage_disp06_Internalname = "CTLPAGE_DISP06" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtavCtlpage_disp07_Internalname = "CTLPAGE_DISP07" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtavCtlpage_disp08_Internalname = "CTLPAGE_DISP08" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtavCtlpage_disp09_Internalname = "CTLPAGE_DISP09" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtavCtlpage_disp10_Internalname = "CTLPAGE_DISP10" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtavCtlpage_disp_back_Internalname = "CTLPAGE_DISP_BACK" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtavCtlpage_disp_next_Internalname = "CTLPAGE_DISP_NEXT" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtavCtlpage_disp_area_Internalname = "CTLPAGE_DISP_AREA" ;
      tblTable7_Internalname = "TABLE7" ;
      edtavH_device_Internalname = "vH_DEVICE" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_data_kote_Jsonclick = "" ;
      edtavD_grd_data_kote_Visible = 1 ;
      edtavD_grd_dm_Jsonclick = "" ;
      edtavD_grd_dm_Visible = 1 ;
      lblTxt_grd_upd_kngn_Caption = "D" ;
      edtavD_grd_upd_user_nm_Jsonclick = "" ;
      edtavD_grd_upd_user_nm_Visible = 1 ;
      edtavD_grd_last_upd_datetime_vc_Jsonclick = "" ;
      edtavD_grd_last_upd_datetime_vc_Visible = 1 ;
      lblTxt_grd_kngn_10_Caption = "ダ" ;
      lblTxt_grd_kngn_09_Caption = "ダ" ;
      lblTxt_grd_kngn_08_Caption = "ダ" ;
      lblTxt_grd_kngn_07_Caption = "モ" ;
      lblTxt_grd_kngn_06_Caption = "D" ;
      lblTxt_grd_kngn_05_Caption = "事" ;
      lblTxt_grd_kngn_04_Caption = "施" ;
      lblTxt_grd_kngn_03_Caption = "研" ;
      lblTxt_grd_kngn_02_Caption = "C" ;
      lblTxt_grd_kngn_01_Caption = "作" ;
      edtavD_grd_crf_snm_Jsonclick = "" ;
      edtavD_grd_crf_snm_Visible = 1 ;
      edtavD_grd_crf_id_Jsonclick = "" ;
      edtavD_grd_crf_id_Visible = 1 ;
      edtavD_grd_site_id_Jsonclick = "" ;
      edtavD_grd_site_snm_Jsonclick = "" ;
      edtavD_grd_site_snm_Visible = 1 ;
      edtavD_grd_subject_id_Jsonclick = "" ;
      edtavD_grd_subject_id_Visible = 1 ;
      chkavD_grd_sel_flg.setVisible( 1 );
      chkavD_grd_sel_flg.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      lblBtn_csv_out_Visible = 1 ;
      lblBtn_crf_del_Visible = 1 ;
      lblBtn_data_kotei_Visible = 1 ;
      lblBtn_dm_kaijo_Visible = 1 ;
      lblBtn_crf_teisyutu_Visible = 1 ;
      cmbavD_ol_disp.setJsonclick( "" );
      cmbavD_sort.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_data_kote_Enabled = 1 ;
      edtavD_grd_dm_Enabled = 1 ;
      edtavD_grd_upd_user_nm_Enabled = 1 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 1 ;
      lblTxt_icon_08_Caption = "ダ" ;
      lblTxt_icon_07_Caption = "モ" ;
      lblTxt_icon_06_Caption = "D" ;
      lblTxt_icon_05_Caption = "事" ;
      lblTxt_icon_04_Caption = "施" ;
      lblTxt_icon_03_Caption = "研" ;
      lblTxt_icon_02_Caption = "C" ;
      lblTxt_icon_01_Caption = "作" ;
      edtavD_grd_crf_snm_Enabled = 1 ;
      edtavD_grd_crf_id_Enabled = 1 ;
      edtavD_grd_site_id_Visible = 1 ;
      edtavD_grd_site_id_Enabled = 1 ;
      edtavD_grd_site_snm_Enabled = 1 ;
      edtavD_grd_subject_id_Enabled = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      edtavCtlpage_disp_area_Jsonclick = "" ;
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
      edtavH_device_Jsonclick = "" ;
      edtavH_err_msg_Jsonclick = "" ;
      edtavH_popup_err_cd_Jsonclick = "" ;
      edtavH_sel_tbt02_upd_cnt_Jsonclick = "" ;
      edtavH_sel_tbt02_subject_id_Jsonclick = "" ;
      edtavH_sel_tbt02_crf_id_Jsonclick = "" ;
      edtavH_input_end_flg_sv_Jsonclick = "" ;
      edtavH_subject_id_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
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
      lblTxt_auth_10_Caption = "ダミー" ;
      tblTbl_icon_10_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_icon_10_Caption = "ダ" ;
      tblTbl_grd_kngn_10_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_auth_09_Caption = "ダミー" ;
      tblTbl_icon_09_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_icon_09_Caption = "ダ" ;
      tblTbl_grd_kngn_09_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_auth_08_Caption = "ダミー" ;
      tblTbl_icon_08_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_icon_08_Caption = "ダ" ;
      tblTbl_grd_kngn_08_Backcolor = (int)(0x00FFFFFF) ;
      lblTxt_auth_07_Caption = " モニター" ;
      tblTbl_icon_07_Backcolor = (int)(0xFF80FF) ;
      lblTxt_icon_07_Caption = "モ" ;
      tblTbl_grd_kngn_07_Backcolor = (int)(0xFF80FF) ;
      lblTxt_auth_06_Caption = " ＤＭ" ;
      tblTbl_icon_06_Backcolor = (int)(0x8080FF) ;
      lblTxt_icon_06_Caption = "D" ;
      tblTbl_grd_kngn_06_Backcolor = (int)(0x8080FF) ;
      lblTxt_auth_05_Caption = " 研究事務局" ;
      tblTbl_icon_05_Backcolor = (int)(0x80FFFF) ;
      lblTxt_icon_05_Caption = "事" ;
      tblTbl_grd_kngn_05_Backcolor = (int)(0x80FFFF) ;
      lblTxt_auth_04_Caption = "施設研究責任者" ;
      tblTbl_icon_04_Backcolor = (int)(0x80FF80) ;
      lblTxt_icon_04_Caption = "施" ;
      tblTbl_grd_kngn_04_Backcolor = (int)(0x80FF80) ;
      lblTxt_auth_03_Caption = " 研究者" ;
      tblTbl_icon_03_Backcolor = (int)(0xFFFF80) ;
      lblTxt_icon_03_Caption = "研" ;
      tblTbl_grd_kngn_03_Backcolor = (int)(0xFFFF80) ;
      lblTxt_auth_02_Caption = " CRC" ;
      tblTbl_icon_02_Backcolor = (int)(0xFFC080) ;
      lblTxt_icon_02_Caption = "C" ;
      tblTbl_grd_kngn_02_Backcolor = (int)(0xFFC080) ;
      lblTxt_auth_01_Caption = " 作業補助者" ;
      tblTbl_icon_01_Backcolor = (int)(0xFF8080) ;
      lblTxt_icon_01_Caption = "作" ;
      tblTbl_grd_kngn_01_Backcolor = (int)(0xFF8080) ;
      tblTbl_icon_info_10_Visible = 1 ;
      tblTbl_icon_info_09_Visible = 1 ;
      tblTbl_icon_info_08_Visible = 1 ;
      tblTbl_icon_info_07_Visible = 1 ;
      tblTbl_icon_info_06_Visible = 1 ;
      tblTbl_icon_info_05_Visible = 1 ;
      tblTbl_icon_info_04_Visible = 1 ;
      tblTbl_icon_info_03_Visible = 1 ;
      tblTbl_icon_info_02_Visible = 1 ;
      tblTbl_icon_info_01_Visible = 1 ;
      tblTbl_ol_disp_Visible = 1 ;
      tblTbl_grd_upd_kngn_Backcolor = (int)(0x00FFFFFF) ;
      tblTbl_grd_upd_kngn_Visible = 1 ;
      tblTbl_grd_kngn_10_Visible = 1 ;
      tblTbl_grd_kngn_09_Visible = 1 ;
      tblTbl_grd_kngn_08_Visible = 1 ;
      tblTbl_grd_kngn_07_Visible = 1 ;
      tblTbl_grd_kngn_06_Visible = 1 ;
      tblTbl_grd_kngn_05_Visible = 1 ;
      tblTbl_grd_kngn_04_Visible = 1 ;
      tblTbl_grd_kngn_03_Visible = 1 ;
      tblTbl_grd_kngn_02_Visible = 1 ;
      tblTbl_grd_kngn_01_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      chkavD_grd_all_sel_flg.setCaption( "" );
      subGrid1_Rows = (short)(15) ;
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
                  /* Execute user subroutine: S341807 */
                  S341807 ();
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
      AV30H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV13D_GRD_CHG = "" ;
      AV49SD_B712_SD08_ICON_INFO = new GxObjectCollection(SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem.class, "B712_SD08_ICON_INFO.B712_SD08_ICON_INFOItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV53W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV47SD_B712_SD07_INPUT_DISP = new GxObjectCollection(SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem.class, "B712_SD07_INPUT_DISP.B712_SD07_INPUT_DISPItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV10D_B712_SD06_RESULT_CRF = new GxObjectCollection(SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem.class, "B712_SD06_RESULT_CRF.B712_SD06_RESULT_CRFItem", "SmartEDC_SHIZUOKA", remoteHandle);
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
      edtavD_grd_subject_id_Internalname = "" ;
      edtavD_grd_site_snm_Internalname = "" ;
      edtavD_grd_site_id_Internalname = "" ;
      edtavD_grd_crf_id_Internalname = "" ;
      edtavD_grd_crf_snm_Internalname = "" ;
      lblTxt_grd_kngn_01_Internalname = "" ;
      lblTxt_grd_kngn_02_Internalname = "" ;
      lblTxt_grd_kngn_03_Internalname = "" ;
      lblTxt_grd_kngn_04_Internalname = "" ;
      lblTxt_grd_kngn_05_Internalname = "" ;
      lblTxt_grd_kngn_06_Internalname = "" ;
      lblTxt_grd_kngn_07_Internalname = "" ;
      lblTxt_grd_kngn_08_Internalname = "" ;
      lblTxt_grd_kngn_09_Internalname = "" ;
      lblTxt_grd_kngn_10_Internalname = "" ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "" ;
      edtavD_grd_upd_user_nm_Internalname = "" ;
      lblTxt_grd_upd_kngn_Internalname = "" ;
      edtavD_grd_dm_Internalname = "" ;
      edtavD_grd_data_kote_Internalname = "" ;
      AV21D_GRD_SITE_SNM = "" ;
      AV20D_GRD_SITE_ID = "" ;
      AV15D_GRD_CRF_SNM = "" ;
      AV18D_GRD_LAST_UPD_DATETIME_VC = "" ;
      AV23D_GRD_UPD_USER_NM = "" ;
      AV17D_GRD_DM = "" ;
      AV16D_GRD_DATA_KOTE = "" ;
      GXKey = "" ;
      AV24D_OL_DISP = "" ;
      AV27D_SORT = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV156Pgmname = "" ;
      AV153Pgmdesc = "" ;
      AV33H_INIT_FLG = "" ;
      AV40H_SRCH_FLG = "" ;
      AV35H_KNGN_FLG = "" ;
      AV41H_SUBJECT_ID = "" ;
      AV34H_INPUT_END_FLG_SV = "" ;
      AV32H_ERR_MSG = "" ;
      AV31H_DEVICE = "" ;
      AV8C_APP_ID = "" ;
      AV9C_GAMEN_TITLE = "" ;
      AV95W_SESSION = httpContext.getWebSession();
      AV42P_AUTH_CD = "" ;
      scmdbuf = "" ;
      H001H2_A189TBM21_DEL_FLG = new String[] {""} ;
      H001H2_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001H2_A186TBM21_STUDY_ID = new long[1] ;
      H001H2_A187TBM21_STUDY_NM = new String[] {""} ;
      H001H2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A187TBM21_STUDY_NM = "" ;
      AV99W_STUDY_NM = "" ;
      H001H3_A18TAM04_DEL_FLG = new String[] {""} ;
      H001H3_n18TAM04_DEL_FLG = new boolean[] {false} ;
      H001H3_A17TAM04_AUTH_CD = new String[] {""} ;
      H001H3_A98TAM04_AUTH_NM = new String[] {""} ;
      H001H3_n98TAM04_AUTH_NM = new boolean[] {false} ;
      A18TAM04_DEL_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      A98TAM04_AUTH_NM = "" ;
      AV56W_AUTH_NM = "" ;
      GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem4 = new GxObjectCollection [1] ;
      GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem5 = new GxObjectCollection [1] ;
      AV11D_B712_SD06_RESULT_CRF_Item = new SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem(remoteHandle, context);
      AV77W_DATA_KBN = "" ;
      AV48SD_B712_SD07_INPUT_DISP_I = new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV50SD_B712_SD08_ICON_INFO_I = new SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem(remoteHandle, context);
      GXEncryptionTmp = "" ;
      AV98W_STUDY_ID = "" ;
      AV100W_SUBJECT_ID = "" ;
      AV74W_CRF_ID = "" ;
      AV75W_CRF_INPUT_LEVEL = "" ;
      AV119W_UPD_CNT = "" ;
      AV89W_MSG = "" ;
      AV123W_SYS_VALUE = "" ;
      AV96W_SESSION_KEY = "" ;
      AV51SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV97W_STR = "" ;
      AV52SD_B792_SD03_OL_DISP_INFO_I = new SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem(remoteHandle, context);
      AV120W_URL = "" ;
      AV86W_HTTPREQUEST = httpContext.getHttpRequest();
      H001H4_A307TBT11_DEL_FLG = new String[] {""} ;
      H001H4_n307TBT11_DEL_FLG = new boolean[] {false} ;
      H001H4_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001H4_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001H4_A305TBT11_CRF_ID = new short[1] ;
      H001H4_A304TBT11_SUBJECT_ID = new int[1] ;
      H001H4_A303TBT11_STUDY_ID = new long[1] ;
      H001H4_A314TBT11_UPD_CNT = new long[1] ;
      H001H4_n314TBT11_UPD_CNT = new boolean[] {false} ;
      H001H4_A306TBT11_CRF_VERSION = new short[1] ;
      A307TBT11_DEL_FLG = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV92W_RTN_CD = "" ;
      AV55W_A821_JS = "" ;
      AV62W_B714_SD1_CRF_INFO = new GxObjectCollection(SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem.class, "B714_SD1_CRF_INFO.B714_SD1_CRF_INFOItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV63W_B714_SD1_CRF_INFO_Item = new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
      AV80W_ERR_MSG = "" ;
      AV64W_B716_SD1_CRF_INFO = new GxObjectCollection(SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem.class, "B716_SD1_CRF_INFO.B716_SD1_CRF_INFOItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV65W_B716_SD1_CRF_INFO_Item = new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
      AV121W_ZIP_FILE_PATH = "" ;
      GXv_char8 = new String [1] ;
      AV122W_ZIP_FILENAME = "" ;
      GXv_char6 = new String [1] ;
      GXv_int9 = new short [1] ;
      AV90W_P_KANI_KENSAKU = "" ;
      AV61W_B712_SD05_SEL4 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV102W_SUBJECT_ID_EDT = "" ;
      AV57W_B712_SD05_SEL_W = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV103W_SUBJECT_ID_GET = "" ;
      GXv_int7 = new byte [1] ;
      AV83W_FLG = "" ;
      AV84W_FLG2 = new String [3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV84W_FLG2[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV58W_B712_SD05_SEL1 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV59W_B712_SD05_SEL2 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV60W_B712_SD05_SEL3 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      A613TBT01_SITE_ID = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A569TBT02_INPUT_END_FLG = "" ;
      A295TBT02_DEL_FLG = "" ;
      A284TBT01_DEL_FLG = "" ;
      H001H5_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001H5_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      H001H5_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001H5_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001H5_A294TBT02_CRF_ID = new short[1] ;
      H001H5_A293TBT02_SUBJECT_ID = new int[1] ;
      H001H5_A292TBT02_STUDY_ID = new long[1] ;
      H001H5_A284TBT01_DEL_FLG = new String[] {""} ;
      H001H5_n284TBT01_DEL_FLG = new boolean[] {false} ;
      H001H5_A295TBT02_DEL_FLG = new String[] {""} ;
      H001H5_n295TBT02_DEL_FLG = new boolean[] {false} ;
      H001H5_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      H001H5_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      H001H5_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      H001H5_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001H5_A613TBT01_SITE_ID = new String[] {""} ;
      H001H5_n613TBT01_SITE_ID = new boolean[] {false} ;
      H001H5_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      H001H5_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      H001H5_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001H5_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      H001H5_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      H001H5_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      H001H5_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      H001H5_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      H001H5_A302TBT02_UPD_CNT = new long[1] ;
      H001H5_n302TBT02_UPD_CNT = new boolean[] {false} ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A561TBT02_UPLOAD_USER_ID = "" ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      H001H6_A922TBT14_MEMO_NO = new short[1] ;
      H001H6_A329TBT14_STUDY_ID = new long[1] ;
      H001H6_A330TBT14_SUBJECT_ID = new int[1] ;
      H001H6_A331TBT14_CRF_ID = new short[1] ;
      H001H6_n331TBT14_CRF_ID = new boolean[] {false} ;
      H001H6_A337TBT14_DEL_FLG = new String[] {""} ;
      H001H6_n337TBT14_DEL_FLG = new boolean[] {false} ;
      H001H6_A924TBT14_KANRYO_FLG = new String[] {""} ;
      H001H6_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001H6_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001H6_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001H6_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001H6_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      A337TBT14_DEL_FLG = "" ;
      A924TBT14_KANRYO_FLG = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      AV5W_TAM07_USER_ID = "" ;
      AV104W_TAM07_USER_NM = "" ;
      AV6W_TAM08_SITE_ID = "" ;
      AV105W_TAM08_SITE_SNM = "" ;
      AV111W_TBM31_CRF_SNM = "" ;
      H001H7_A304TBT11_SUBJECT_ID = new int[1] ;
      H001H7_A305TBT11_CRF_ID = new short[1] ;
      H001H7_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      H001H7_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001H7_A303TBT11_STUDY_ID = new long[1] ;
      H001H7_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001H7_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001H7_A306TBT11_CRF_VERSION = new short[1] ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      AV85W_GAMENNM_KENSAKU = "" ;
      AV109W_TBM01_SAGYOJOHO_VALUE = "" ;
      AV107W_TBM01_DM_VALUE = "" ;
      AV106W_TBM01_CRC_VALUE = "" ;
      AV108W_TBM01_RESEARCHER_VALUE = "" ;
      AV110W_TBM01_SITE_MG_VALUE = "" ;
      H001H8_A55TAS01_ITEM_CD = new String[] {""} ;
      H001H8_A54TAS01_DATA_KIND = new String[] {""} ;
      H001H8_A113TAS01_DEL_FLG = new String[] {""} ;
      H001H8_n113TAS01_DEL_FLG = new boolean[] {false} ;
      H001H8_A19TAS01_ITEM_NM = new String[] {""} ;
      H001H8_n19TAS01_ITEM_NM = new boolean[] {false} ;
      H001H8_A150TAS01_CHAR_1 = new String[] {""} ;
      H001H8_n150TAS01_CHAR_1 = new boolean[] {false} ;
      H001H8_A149TAS01_SORT_NO = new short[1] ;
      H001H8_n149TAS01_SORT_NO = new boolean[] {false} ;
      A54TAS01_DATA_KIND = "" ;
      A113TAS01_DEL_FLG = "" ;
      A19TAS01_ITEM_NM = "" ;
      A150TAS01_CHAR_1 = "" ;
      H001H9_A463TBM34_DEL_FLG = new String[] {""} ;
      H001H9_n463TBM34_DEL_FLG = new boolean[] {false} ;
      H001H9_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      H001H9_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      H001H9_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H001H9_A460TBM34_CRF_ID = new short[1] ;
      H001H9_A459TBM34_STUDY_ID = new long[1] ;
      A463TBM34_DEL_FLG = "" ;
      A462TBM34_DISPLAY_FLG = "" ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      H001H10_A139TAM08_DEL_FLG = new String[] {""} ;
      H001H10_n139TAM08_DEL_FLG = new boolean[] {false} ;
      H001H10_A132TAM08_SITE_ID = new String[] {""} ;
      H001H10_A134TAM08_SITE_SNM = new String[] {""} ;
      H001H10_n134TAM08_SITE_SNM = new boolean[] {false} ;
      A139TAM08_DEL_FLG = "" ;
      A132TAM08_SITE_ID = "" ;
      A134TAM08_SITE_SNM = "" ;
      H001H11_A223TBM31_DEL_FLG = new String[] {""} ;
      H001H11_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001H11_A218TBM31_CRF_ID = new short[1] ;
      H001H11_A217TBM31_STUDY_ID = new long[1] ;
      H001H11_A550TBM31_CRF_SNM = new String[] {""} ;
      H001H11_n550TBM31_CRF_SNM = new boolean[] {false} ;
      H001H11_A221TBM31_ORDER = new int[1] ;
      H001H11_n221TBM31_ORDER = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A550TBM31_CRF_SNM = "" ;
      H001H12_A16TAM07_DEL_FLG = new String[] {""} ;
      H001H12_n16TAM07_DEL_FLG = new boolean[] {false} ;
      H001H12_A8TAM07_USER_ID = new String[] {""} ;
      H001H12_A2TAM07_USER_NM = new String[] {""} ;
      H001H12_n2TAM07_USER_NM = new boolean[] {false} ;
      A16TAM07_DEL_FLG = "" ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H001H13_A189TBM21_DEL_FLG = new String[] {""} ;
      H001H13_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001H13_A186TBM21_STUDY_ID = new long[1] ;
      H001H13_A513TBM21_STATUS = new String[] {""} ;
      H001H13_n513TBM21_STATUS = new boolean[] {false} ;
      A513TBM21_STATUS = "" ;
      GXv_SdtA_LOGIN_SDT11 = new SdtA_LOGIN_SDT [1] ;
      AV81W_ERRCD = "" ;
      AV54W_A819_JS = "" ;
      GXv_SdtA_PAGING_SDT12 = new SdtA_PAGING_SDT [1] ;
      GXv_char10 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_crf_del_exec_Jsonclick = "" ;
      lblTxt_btn_data_ktei_exec_Jsonclick = "" ;
      lblTxt_btn_csv_out_exec_Jsonclick = "" ;
      lblTxt_btn_crf_teisyutu_exec_Jsonclick = "" ;
      lblTxt_btn_dm_kaijo_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
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
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock30_Jsonclick = "" ;
      lblTxt_auth_10_Jsonclick = "" ;
      lblTxt_icon_10_Jsonclick = "" ;
      lblTxt_auth_09_Jsonclick = "" ;
      lblTxt_icon_09_Jsonclick = "" ;
      lblTxt_auth_08_Jsonclick = "" ;
      lblTxt_icon_08_Jsonclick = "" ;
      lblTxt_auth_07_Jsonclick = "" ;
      lblTxt_icon_07_Jsonclick = "" ;
      lblTxt_auth_06_Jsonclick = "" ;
      lblTxt_icon_06_Jsonclick = "" ;
      lblTxt_auth_05_Jsonclick = "" ;
      lblTxt_icon_05_Jsonclick = "" ;
      lblTxt_auth_04_Jsonclick = "" ;
      lblTxt_icon_04_Jsonclick = "" ;
      lblTxt_auth_03_Jsonclick = "" ;
      lblTxt_icon_03_Jsonclick = "" ;
      lblTxt_auth_02_Jsonclick = "" ;
      lblTxt_icon_02_Jsonclick = "" ;
      lblTxt_auth_01_Jsonclick = "" ;
      lblTxt_icon_01_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
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
      lblBtn_crf_open_Jsonclick = "" ;
      lblBtn_chg_reki_Jsonclick = "" ;
      lblBtn_ssai_hyoj_Jsonclick = "" ;
      lblBtn_crf_teisyutu_Jsonclick = "" ;
      lblBtn_dm_kaijo_Jsonclick = "" ;
      lblBtn_data_kotei_Jsonclick = "" ;
      lblBtn_crf_del_Jsonclick = "" ;
      lblBtn_csv_out_Jsonclick = "" ;
      lblBtn_search_back_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      lblTxt_grd_kngn_01_Jsonclick = "" ;
      lblTxt_grd_kngn_02_Jsonclick = "" ;
      lblTxt_grd_kngn_03_Jsonclick = "" ;
      lblTxt_grd_kngn_04_Jsonclick = "" ;
      lblTxt_grd_kngn_05_Jsonclick = "" ;
      lblTxt_grd_kngn_06_Jsonclick = "" ;
      lblTxt_grd_kngn_07_Jsonclick = "" ;
      lblTxt_grd_kngn_08_Jsonclick = "" ;
      lblTxt_grd_kngn_09_Jsonclick = "" ;
      lblTxt_grd_kngn_10_Jsonclick = "" ;
      GXt_char3 = "" ;
      lblTxt_grd_upd_kngn_Jsonclick = "" ;
      GXt_char13 = "" ;
      GXt_char14 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp02_result_crf__default(),
         new Object[] {
             new Object[] {
            H001H2_A189TBM21_DEL_FLG, H001H2_n189TBM21_DEL_FLG, H001H2_A186TBM21_STUDY_ID, H001H2_A187TBM21_STUDY_NM, H001H2_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H001H3_A18TAM04_DEL_FLG, H001H3_n18TAM04_DEL_FLG, H001H3_A17TAM04_AUTH_CD, H001H3_A98TAM04_AUTH_NM, H001H3_n98TAM04_AUTH_NM
            }
            , new Object[] {
            H001H4_A307TBT11_DEL_FLG, H001H4_n307TBT11_DEL_FLG, H001H4_A578TBT11_DM_ARRIVAL_DATETIME, H001H4_n578TBT11_DM_ARRIVAL_DATETIME, H001H4_A305TBT11_CRF_ID, H001H4_A304TBT11_SUBJECT_ID, H001H4_A303TBT11_STUDY_ID, H001H4_A314TBT11_UPD_CNT, H001H4_n314TBT11_UPD_CNT, H001H4_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            H001H5_A370TBT02_CRF_LATEST_VERSION, H001H5_n370TBT02_CRF_LATEST_VERSION, H001H5_A564TBT02_DM_ARRIVAL_DATETIME, H001H5_n564TBT02_DM_ARRIVAL_DATETIME, H001H5_A294TBT02_CRF_ID, H001H5_A293TBT02_SUBJECT_ID, H001H5_A292TBT02_STUDY_ID, H001H5_A284TBT01_DEL_FLG, H001H5_n284TBT01_DEL_FLG, H001H5_A295TBT02_DEL_FLG,
            H001H5_n295TBT02_DEL_FLG, H001H5_A569TBT02_INPUT_END_FLG, H001H5_n569TBT02_INPUT_END_FLG, H001H5_A563TBT02_DM_ARRIVAL_FLG, H001H5_n563TBT02_DM_ARRIVAL_FLG, H001H5_A613TBT01_SITE_ID, H001H5_n613TBT01_SITE_ID, H001H5_A371TBT02_CRF_INPUT_LEVEL, H001H5_n371TBT02_CRF_INPUT_LEVEL, H001H5_A560TBT02_UPLOAD_DATETIME,
            H001H5_n560TBT02_UPLOAD_DATETIME, H001H5_A561TBT02_UPLOAD_USER_ID, H001H5_n561TBT02_UPLOAD_USER_ID, H001H5_A562TBT02_UPLOAD_AUTH_CD, H001H5_n562TBT02_UPLOAD_AUTH_CD, H001H5_A302TBT02_UPD_CNT, H001H5_n302TBT02_UPD_CNT
            }
            , new Object[] {
            H001H6_A922TBT14_MEMO_NO, H001H6_A329TBT14_STUDY_ID, H001H6_A330TBT14_SUBJECT_ID, H001H6_A331TBT14_CRF_ID, H001H6_n331TBT14_CRF_ID, H001H6_A337TBT14_DEL_FLG, H001H6_n337TBT14_DEL_FLG, H001H6_A924TBT14_KANRYO_FLG, H001H6_n924TBT14_KANRYO_FLG, H001H6_A927TBT14_KAKUNIN_FLG,
            H001H6_n927TBT14_KAKUNIN_FLG, H001H6_A929TBT14_REQUEST_AUTH_CD, H001H6_n929TBT14_REQUEST_AUTH_CD
            }
            , new Object[] {
            H001H7_A304TBT11_SUBJECT_ID, H001H7_A305TBT11_CRF_ID, H001H7_A577TBT11_DM_ARRIVAL_FLG, H001H7_n577TBT11_DM_ARRIVAL_FLG, H001H7_A303TBT11_STUDY_ID, H001H7_A578TBT11_DM_ARRIVAL_DATETIME, H001H7_n578TBT11_DM_ARRIVAL_DATETIME, H001H7_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            H001H8_A55TAS01_ITEM_CD, H001H8_A54TAS01_DATA_KIND, H001H8_A113TAS01_DEL_FLG, H001H8_n113TAS01_DEL_FLG, H001H8_A19TAS01_ITEM_NM, H001H8_n19TAS01_ITEM_NM, H001H8_A150TAS01_CHAR_1, H001H8_n150TAS01_CHAR_1, H001H8_A149TAS01_SORT_NO, H001H8_n149TAS01_SORT_NO
            }
            , new Object[] {
            H001H9_A463TBM34_DEL_FLG, H001H9_n463TBM34_DEL_FLG, H001H9_A462TBM34_DISPLAY_FLG, H001H9_n462TBM34_DISPLAY_FLG, H001H9_A461TBM34_STYDY_AUTH_CD, H001H9_A460TBM34_CRF_ID, H001H9_A459TBM34_STUDY_ID
            }
            , new Object[] {
            H001H10_A139TAM08_DEL_FLG, H001H10_n139TAM08_DEL_FLG, H001H10_A132TAM08_SITE_ID, H001H10_A134TAM08_SITE_SNM, H001H10_n134TAM08_SITE_SNM
            }
            , new Object[] {
            H001H11_A223TBM31_DEL_FLG, H001H11_n223TBM31_DEL_FLG, H001H11_A218TBM31_CRF_ID, H001H11_A217TBM31_STUDY_ID, H001H11_A550TBM31_CRF_SNM, H001H11_n550TBM31_CRF_SNM, H001H11_A221TBM31_ORDER, H001H11_n221TBM31_ORDER
            }
            , new Object[] {
            H001H12_A16TAM07_DEL_FLG, H001H12_n16TAM07_DEL_FLG, H001H12_A8TAM07_USER_ID, H001H12_A2TAM07_USER_NM, H001H12_n2TAM07_USER_NM
            }
            , new Object[] {
            H001H13_A189TBM21_DEL_FLG, H001H13_n189TBM21_DEL_FLG, H001H13_A186TBM21_STUDY_ID, H001H13_A513TBM21_STATUS, H001H13_n513TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV156Pgmname = "B712_WP02_RESULT_CRF" ;
      AV153Pgmdesc = "CRF検索結果" ;
      /* GeneXus formulas. */
      AV156Pgmname = "B712_WP02_RESULT_CRF" ;
      AV153Pgmdesc = "CRF検索結果" ;
      Gx_err = (short)(0) ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_site_snm_Enabled = 0 ;
      edtavD_grd_site_id_Enabled = 0 ;
      edtavD_grd_crf_id_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 0 ;
      edtavD_grd_upd_user_nm_Enabled = 0 ;
      edtavD_grd_dm_Enabled = 0 ;
      edtavD_grd_data_kote_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte AV36H_POPUP_ERR_CD ;
   private byte AV91W_RET_CD ;
   private byte AV79W_ERR_CD ;
   private byte AV88W_INPUT_END_FLG_SET ;
   private byte AV101W_SUBJECT_ID_CNT ;
   private byte GXv_int7[] ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte AV165GXLvl1153 ;
   private byte AV166GXLvl1216 ;
   private byte AV168GXLvl1370 ;
   private byte AV172GXLvl1477 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_189_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short AV14D_GRD_CRF_ID ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV37H_SEL_TBT02_CRF_ID ;
   private short AV93W_SEL_CNT ;
   private short AV72W_CNT2 ;
   private short AV115W_TBT02_CRF_ID ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short GXv_int9[] ;
   private short AV94W_SEL_PTN ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short A331TBT14_CRF_ID ;
   private short AV113W_TBM34_CRF_ID ;
   private short AV7W_TBM31_CRF_ID ;
   private short A149TAS01_SORT_NO ;
   private short A460TBM34_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private short nGXsfl_189_fel_idx=1 ;
   private short subGrid1_Borderwidth ;
   private int edtavD_grd_site_id_Visible ;
   private int GRID1_nFirstRecordOnPage ;
   private int AV22D_GRD_SUBJECT_ID ;
   private int subGrid1_Islastpage ;
   private int edtavD_grd_subject_id_Enabled ;
   private int edtavD_grd_site_snm_Enabled ;
   private int edtavD_grd_site_id_Enabled ;
   private int edtavD_grd_crf_id_Enabled ;
   private int edtavD_grd_crf_snm_Enabled ;
   private int edtavD_grd_last_upd_datetime_vc_Enabled ;
   private int edtavD_grd_upd_user_nm_Enabled ;
   private int edtavD_grd_dm_Enabled ;
   private int edtavD_grd_data_kote_Enabled ;
   private int AV38H_SEL_TBT02_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int AV157GXV29 ;
   private int AV158GXV30 ;
   private int tblTbl_grd_kngn_01_Visible ;
   private int tblTbl_grd_kngn_02_Visible ;
   private int tblTbl_grd_kngn_03_Visible ;
   private int tblTbl_grd_kngn_04_Visible ;
   private int tblTbl_grd_kngn_05_Visible ;
   private int tblTbl_grd_kngn_06_Visible ;
   private int tblTbl_grd_kngn_07_Visible ;
   private int tblTbl_grd_kngn_08_Visible ;
   private int tblTbl_grd_kngn_09_Visible ;
   private int tblTbl_grd_kngn_10_Visible ;
   private int tblTbl_grd_upd_kngn_Visible ;
   private int AV159GXV31 ;
   private int tblTbl_grd_upd_kngn_Backcolor ;
   private int GRID1_nCurrentRecord ;
   private int AV117W_TBT02_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int AV161GXV32 ;
   private int AV162GXV33 ;
   private int AV163GXV34 ;
   private int AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ;
   private int AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ;
   private int AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ;
   private int AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ;
   private int A293TBT02_SUBJECT_ID ;
   private int A330TBT14_SUBJECT_ID ;
   private int AV112W_TBM31_ORDER ;
   private int lblBtn_crf_teisyutu_Visible ;
   private int lblBtn_dm_kaijo_Visible ;
   private int lblBtn_data_kotei_Visible ;
   private int lblBtn_crf_del_Visible ;
   private int lblBtn_csv_out_Visible ;
   private int tblTbl_ol_disp_Visible ;
   private int A221TBM31_ORDER ;
   private int AV174GXV35 ;
   private int tblTbl_icon_info_01_Visible ;
   private int tblTbl_icon_info_02_Visible ;
   private int tblTbl_icon_info_03_Visible ;
   private int tblTbl_icon_info_04_Visible ;
   private int tblTbl_icon_info_05_Visible ;
   private int tblTbl_icon_info_06_Visible ;
   private int tblTbl_icon_info_07_Visible ;
   private int tblTbl_icon_info_08_Visible ;
   private int tblTbl_icon_info_09_Visible ;
   private int tblTbl_icon_info_10_Visible ;
   private int AV175GXV36 ;
   private int tblTbl_grd_kngn_01_Backcolor ;
   private int tblTbl_icon_01_Backcolor ;
   private int tblTbl_grd_kngn_02_Backcolor ;
   private int tblTbl_icon_02_Backcolor ;
   private int tblTbl_grd_kngn_03_Backcolor ;
   private int tblTbl_icon_03_Backcolor ;
   private int tblTbl_grd_kngn_04_Backcolor ;
   private int tblTbl_icon_04_Backcolor ;
   private int tblTbl_grd_kngn_05_Backcolor ;
   private int tblTbl_icon_05_Backcolor ;
   private int tblTbl_grd_kngn_06_Backcolor ;
   private int tblTbl_icon_06_Backcolor ;
   private int tblTbl_grd_kngn_07_Backcolor ;
   private int tblTbl_icon_07_Backcolor ;
   private int tblTbl_grd_kngn_08_Backcolor ;
   private int tblTbl_icon_08_Backcolor ;
   private int tblTbl_grd_kngn_09_Backcolor ;
   private int tblTbl_icon_09_Backcolor ;
   private int tblTbl_grd_kngn_10_Backcolor ;
   private int tblTbl_icon_10_Backcolor ;
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
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_subject_id_Visible ;
   private int edtavD_grd_site_snm_Visible ;
   private int edtavD_grd_crf_id_Visible ;
   private int edtavD_grd_crf_snm_Visible ;
   private int edtavD_grd_last_upd_datetime_vc_Visible ;
   private int edtavD_grd_upd_user_nm_Visible ;
   private int edtavD_grd_dm_Visible ;
   private int edtavD_grd_data_kote_Visible ;
   private int GX_I ;
   private long AV39H_SEL_TBT02_UPD_CNT ;
   private long AV44P_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long AV87W_IDX ;
   private long AV116W_TBT02_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private long A314TBT11_UPD_CNT ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A329TBT14_STUDY_ID ;
   private long A459TBM34_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_189_idx="0001" ;
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
   private String edtavD_grd_subject_id_Internalname ;
   private String edtavD_grd_site_snm_Internalname ;
   private String edtavD_grd_site_id_Internalname ;
   private String edtavD_grd_crf_id_Internalname ;
   private String edtavD_grd_crf_snm_Internalname ;
   private String lblTxt_grd_kngn_01_Internalname ;
   private String lblTxt_grd_kngn_02_Internalname ;
   private String lblTxt_grd_kngn_03_Internalname ;
   private String lblTxt_grd_kngn_04_Internalname ;
   private String lblTxt_grd_kngn_05_Internalname ;
   private String lblTxt_grd_kngn_06_Internalname ;
   private String lblTxt_grd_kngn_07_Internalname ;
   private String lblTxt_grd_kngn_08_Internalname ;
   private String lblTxt_grd_kngn_09_Internalname ;
   private String lblTxt_grd_kngn_10_Internalname ;
   private String edtavD_grd_last_upd_datetime_vc_Internalname ;
   private String edtavD_grd_upd_user_nm_Internalname ;
   private String lblTxt_grd_upd_kngn_Internalname ;
   private String edtavD_grd_dm_Internalname ;
   private String edtavD_grd_data_kote_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String AV156Pgmname ;
   private String AV153Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_subject_id_Internalname ;
   private String edtavH_input_end_flg_sv_Internalname ;
   private String edtavH_sel_tbt02_crf_id_Internalname ;
   private String edtavH_sel_tbt02_subject_id_Internalname ;
   private String edtavH_sel_tbt02_upd_cnt_Internalname ;
   private String edtavH_popup_err_cd_Internalname ;
   private String edtavH_err_msg_Internalname ;
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
   private String edtavCtlpage_disp_area_Internalname ;
   private String edtavH_device_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String tblTbl_grd_kngn_01_Internalname ;
   private String tblTbl_grd_kngn_02_Internalname ;
   private String tblTbl_grd_kngn_03_Internalname ;
   private String tblTbl_grd_kngn_04_Internalname ;
   private String tblTbl_grd_kngn_05_Internalname ;
   private String tblTbl_grd_kngn_06_Internalname ;
   private String tblTbl_grd_kngn_07_Internalname ;
   private String tblTbl_grd_kngn_08_Internalname ;
   private String tblTbl_grd_kngn_09_Internalname ;
   private String tblTbl_grd_kngn_10_Internalname ;
   private String tblTbl_grd_upd_kngn_Internalname ;
   private String lblTxt_grd_upd_kngn_Caption ;
   private String GXEncryptionTmp ;
   private String GXv_char8[] ;
   private String GXv_char6[] ;
   private String lblBtn_crf_teisyutu_Internalname ;
   private String lblBtn_dm_kaijo_Internalname ;
   private String lblBtn_data_kotei_Internalname ;
   private String lblBtn_crf_del_Internalname ;
   private String lblBtn_csv_out_Internalname ;
   private String tblTbl_ol_disp_Internalname ;
   private String sGXsfl_189_fel_idx="0001" ;
   private String tblTbl_icon_info_01_Internalname ;
   private String tblTbl_icon_info_02_Internalname ;
   private String tblTbl_icon_info_03_Internalname ;
   private String tblTbl_icon_info_04_Internalname ;
   private String tblTbl_icon_info_05_Internalname ;
   private String tblTbl_icon_info_06_Internalname ;
   private String tblTbl_icon_info_07_Internalname ;
   private String tblTbl_icon_info_08_Internalname ;
   private String tblTbl_icon_info_09_Internalname ;
   private String tblTbl_icon_info_10_Internalname ;
   private String lblTxt_grd_kngn_01_Caption ;
   private String lblTxt_icon_01_Caption ;
   private String lblTxt_icon_01_Internalname ;
   private String tblTbl_icon_01_Internalname ;
   private String lblTxt_auth_01_Caption ;
   private String lblTxt_auth_01_Internalname ;
   private String lblTxt_grd_kngn_02_Caption ;
   private String lblTxt_icon_02_Caption ;
   private String lblTxt_icon_02_Internalname ;
   private String tblTbl_icon_02_Internalname ;
   private String lblTxt_auth_02_Caption ;
   private String lblTxt_auth_02_Internalname ;
   private String lblTxt_grd_kngn_03_Caption ;
   private String lblTxt_icon_03_Caption ;
   private String lblTxt_icon_03_Internalname ;
   private String tblTbl_icon_03_Internalname ;
   private String lblTxt_auth_03_Caption ;
   private String lblTxt_auth_03_Internalname ;
   private String lblTxt_grd_kngn_04_Caption ;
   private String lblTxt_icon_04_Caption ;
   private String lblTxt_icon_04_Internalname ;
   private String tblTbl_icon_04_Internalname ;
   private String lblTxt_auth_04_Caption ;
   private String lblTxt_auth_04_Internalname ;
   private String lblTxt_grd_kngn_05_Caption ;
   private String lblTxt_icon_05_Caption ;
   private String lblTxt_icon_05_Internalname ;
   private String tblTbl_icon_05_Internalname ;
   private String lblTxt_auth_05_Caption ;
   private String lblTxt_auth_05_Internalname ;
   private String lblTxt_grd_kngn_06_Caption ;
   private String lblTxt_icon_06_Caption ;
   private String lblTxt_icon_06_Internalname ;
   private String tblTbl_icon_06_Internalname ;
   private String lblTxt_auth_06_Caption ;
   private String lblTxt_auth_06_Internalname ;
   private String lblTxt_grd_kngn_07_Caption ;
   private String lblTxt_icon_07_Caption ;
   private String lblTxt_icon_07_Internalname ;
   private String tblTbl_icon_07_Internalname ;
   private String lblTxt_auth_07_Caption ;
   private String lblTxt_auth_07_Internalname ;
   private String lblTxt_grd_kngn_08_Caption ;
   private String lblTxt_icon_08_Caption ;
   private String lblTxt_icon_08_Internalname ;
   private String tblTbl_icon_08_Internalname ;
   private String lblTxt_auth_08_Caption ;
   private String lblTxt_auth_08_Internalname ;
   private String lblTxt_grd_kngn_09_Caption ;
   private String lblTxt_icon_09_Caption ;
   private String lblTxt_icon_09_Internalname ;
   private String tblTbl_icon_09_Internalname ;
   private String lblTxt_auth_09_Caption ;
   private String lblTxt_auth_09_Internalname ;
   private String lblTxt_grd_kngn_10_Caption ;
   private String lblTxt_icon_10_Caption ;
   private String lblTxt_icon_10_Internalname ;
   private String tblTbl_icon_10_Internalname ;
   private String lblTxt_auth_10_Caption ;
   private String lblTxt_auth_10_Internalname ;
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
   private String GXv_char10[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_crf_del_exec_Internalname ;
   private String lblTxt_btn_crf_del_exec_Jsonclick ;
   private String lblTxt_btn_data_ktei_exec_Internalname ;
   private String lblTxt_btn_data_ktei_exec_Jsonclick ;
   private String lblTxt_btn_csv_out_exec_Internalname ;
   private String lblTxt_btn_csv_out_exec_Jsonclick ;
   private String lblTxt_btn_crf_teisyutu_exec_Internalname ;
   private String lblTxt_btn_crf_teisyutu_exec_Jsonclick ;
   private String lblTxt_btn_dm_kaijo_exec_Internalname ;
   private String lblTxt_btn_dm_kaijo_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_subject_id_Jsonclick ;
   private String edtavH_input_end_flg_sv_Jsonclick ;
   private String edtavH_sel_tbt02_crf_id_Jsonclick ;
   private String edtavH_sel_tbt02_subject_id_Jsonclick ;
   private String edtavH_sel_tbt02_upd_cnt_Jsonclick ;
   private String edtavH_popup_err_cd_Jsonclick ;
   private String edtavH_err_msg_Jsonclick ;
   private String edtavH_device_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavCtlmax_page_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
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
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtavCtlpage09_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtavCtlpage10_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtavCtlpage_disp01_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavCtlpage_disp02_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavCtlpage_disp03_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavCtlpage_disp04_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtavCtlpage_disp05_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtavCtlpage_disp06_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtavCtlpage_disp07_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtavCtlpage_disp08_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtavCtlpage_disp09_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtavCtlpage_disp10_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtavCtlpage_disp_back_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtavCtlpage_disp_next_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtavCtlpage_disp_area_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTable6_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String lblTxt_auth_10_Jsonclick ;
   private String lblTxt_icon_10_Jsonclick ;
   private String lblTxt_auth_09_Jsonclick ;
   private String lblTxt_icon_09_Jsonclick ;
   private String lblTxt_auth_08_Jsonclick ;
   private String lblTxt_icon_08_Jsonclick ;
   private String lblTxt_auth_07_Jsonclick ;
   private String lblTxt_icon_07_Jsonclick ;
   private String lblTxt_auth_06_Jsonclick ;
   private String lblTxt_icon_06_Jsonclick ;
   private String lblTxt_auth_05_Jsonclick ;
   private String lblTxt_icon_05_Jsonclick ;
   private String lblTxt_auth_04_Jsonclick ;
   private String lblTxt_icon_04_Jsonclick ;
   private String lblTxt_auth_03_Jsonclick ;
   private String lblTxt_icon_03_Jsonclick ;
   private String lblTxt_auth_02_Jsonclick ;
   private String lblTxt_icon_02_Jsonclick ;
   private String lblTxt_auth_01_Jsonclick ;
   private String lblTxt_icon_01_Jsonclick ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
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
   private String tblTbl_upd_btnset_Internalname ;
   private String lblBtn_crf_open_Internalname ;
   private String lblBtn_crf_open_Jsonclick ;
   private String lblBtn_chg_reki_Internalname ;
   private String lblBtn_chg_reki_Jsonclick ;
   private String lblBtn_ssai_hyoj_Internalname ;
   private String lblBtn_ssai_hyoj_Jsonclick ;
   private String lblBtn_crf_teisyutu_Jsonclick ;
   private String lblBtn_dm_kaijo_Jsonclick ;
   private String lblBtn_data_kotei_Jsonclick ;
   private String lblBtn_crf_del_Jsonclick ;
   private String lblBtn_csv_out_Jsonclick ;
   private String lblBtn_search_back_Internalname ;
   private String lblBtn_search_back_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavD_grd_subject_id_Jsonclick ;
   private String edtavD_grd_site_snm_Jsonclick ;
   private String edtavD_grd_site_id_Jsonclick ;
   private String tblTable8_Internalname ;
   private String edtavD_grd_crf_id_Jsonclick ;
   private String edtavD_grd_crf_snm_Jsonclick ;
   private String tblTable5_Internalname ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String lblTxt_grd_kngn_01_Jsonclick ;
   private String lblTxt_grd_kngn_02_Jsonclick ;
   private String lblTxt_grd_kngn_03_Jsonclick ;
   private String lblTxt_grd_kngn_04_Jsonclick ;
   private String lblTxt_grd_kngn_05_Jsonclick ;
   private String lblTxt_grd_kngn_06_Jsonclick ;
   private String lblTxt_grd_kngn_07_Jsonclick ;
   private String lblTxt_grd_kngn_08_Jsonclick ;
   private String lblTxt_grd_kngn_09_Jsonclick ;
   private String lblTxt_grd_kngn_10_Jsonclick ;
   private String edtavD_grd_last_upd_datetime_vc_Jsonclick ;
   private String edtavD_grd_upd_user_nm_Jsonclick ;
   private String GXt_char3 ;
   private String lblTxt_grd_upd_kngn_Jsonclick ;
   private String edtavD_grd_dm_Jsonclick ;
   private String GXt_char13 ;
   private String edtavD_grd_data_kote_Jsonclick ;
   private String GXt_char14 ;
   private String Gx_emsg ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV19D_GRD_SEL_FLG ;
   private boolean AV12D_GRD_ALL_SEL_FLG ;
   private boolean returnInSub ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean AV82W_ERRFLG ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean AV70W_CHK_STUDY_UPD_FLG ;
   private boolean AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG ;
   private boolean AV67W_CHK_ALLOFF_INPUT_END_FLG ;
   private boolean AV68W_CHK_ALLON_DM_ARRIVAL_FLG ;
   private boolean AV69W_CHK_INPUT_END_KONZAI_FLG ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n561TBT02_UPLOAD_USER_ID ;
   private boolean n562TBT02_UPLOAD_AUTH_CD ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean AV76W_DATA_GET_FLG ;
   private boolean n331TBT14_CRF_ID ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean AV73W_CRF_AUTH_FLG ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n150TAS01_CHAR_1 ;
   private boolean n149TAS01_SORT_NO ;
   private boolean n463TBM34_DEL_FLG ;
   private boolean n462TBM34_DISPLAY_FLG ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n221TBM31_ORDER ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n2TAM07_USER_NM ;
   private boolean n513TBM21_STATUS ;
   private String AV13D_GRD_CHG ;
   private String AV21D_GRD_SITE_SNM ;
   private String AV20D_GRD_SITE_ID ;
   private String AV15D_GRD_CRF_SNM ;
   private String AV18D_GRD_LAST_UPD_DATETIME_VC ;
   private String AV23D_GRD_UPD_USER_NM ;
   private String AV17D_GRD_DM ;
   private String AV16D_GRD_DATA_KOTE ;
   private String AV24D_OL_DISP ;
   private String AV27D_SORT ;
   private String AV33H_INIT_FLG ;
   private String AV40H_SRCH_FLG ;
   private String AV35H_KNGN_FLG ;
   private String AV41H_SUBJECT_ID ;
   private String AV34H_INPUT_END_FLG_SV ;
   private String AV32H_ERR_MSG ;
   private String AV31H_DEVICE ;
   private String AV8C_APP_ID ;
   private String AV9C_GAMEN_TITLE ;
   private String AV42P_AUTH_CD ;
   private String A189TBM21_DEL_FLG ;
   private String A187TBM21_STUDY_NM ;
   private String AV99W_STUDY_NM ;
   private String A18TAM04_DEL_FLG ;
   private String A17TAM04_AUTH_CD ;
   private String A98TAM04_AUTH_NM ;
   private String AV56W_AUTH_NM ;
   private String AV77W_DATA_KBN ;
   private String AV98W_STUDY_ID ;
   private String AV100W_SUBJECT_ID ;
   private String AV74W_CRF_ID ;
   private String AV75W_CRF_INPUT_LEVEL ;
   private String AV119W_UPD_CNT ;
   private String AV89W_MSG ;
   private String AV123W_SYS_VALUE ;
   private String AV96W_SESSION_KEY ;
   private String AV97W_STR ;
   private String AV120W_URL ;
   private String A307TBT11_DEL_FLG ;
   private String AV92W_RTN_CD ;
   private String AV55W_A821_JS ;
   private String AV80W_ERR_MSG ;
   private String AV121W_ZIP_FILE_PATH ;
   private String AV122W_ZIP_FILENAME ;
   private String AV90W_P_KANI_KENSAKU ;
   private String AV102W_SUBJECT_ID_EDT ;
   private String AV103W_SUBJECT_ID_GET ;
   private String AV83W_FLG ;
   private String AV84W_FLG2[] ;
   private String A613TBT01_SITE_ID ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A295TBT02_DEL_FLG ;
   private String A284TBT01_DEL_FLG ;
   private String A561TBT02_UPLOAD_USER_ID ;
   private String A562TBT02_UPLOAD_AUTH_CD ;
   private String A337TBT14_DEL_FLG ;
   private String A924TBT14_KANRYO_FLG ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String AV5W_TAM07_USER_ID ;
   private String AV104W_TAM07_USER_NM ;
   private String AV6W_TAM08_SITE_ID ;
   private String AV105W_TAM08_SITE_SNM ;
   private String AV111W_TBM31_CRF_SNM ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String AV85W_GAMENNM_KENSAKU ;
   private String AV109W_TBM01_SAGYOJOHO_VALUE ;
   private String AV107W_TBM01_DM_VALUE ;
   private String AV106W_TBM01_CRC_VALUE ;
   private String AV108W_TBM01_RESEARCHER_VALUE ;
   private String AV110W_TBM01_SITE_MG_VALUE ;
   private String A54TAS01_DATA_KIND ;
   private String A113TAS01_DEL_FLG ;
   private String A19TAS01_ITEM_NM ;
   private String A150TAS01_CHAR_1 ;
   private String A463TBM34_DEL_FLG ;
   private String A462TBM34_DISPLAY_FLG ;
   private String A461TBM34_STYDY_AUTH_CD ;
   private String A139TAM08_DEL_FLG ;
   private String A132TAM08_SITE_ID ;
   private String A134TAM08_SITE_SNM ;
   private String A223TBM31_DEL_FLG ;
   private String A550TBM31_CRF_SNM ;
   private String A16TAM07_DEL_FLG ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A513TBM21_STATUS ;
   private String AV81W_ERRCD ;
   private String AV54W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.internet.HttpRequest AV86W_HTTPREQUEST ;
   private com.genexus.webpanels.WebSession AV95W_SESSION ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV51SD_B792_SD00_HTML5_EXEC_INFO ;
   private HTMLChoice cmbavD_ol_disp ;
   private HTMLChoice cmbavD_sort ;
   private ICheckbox chkavD_grd_all_sel_flg ;
   private ICheckbox chkavD_grd_sel_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H001H2_A189TBM21_DEL_FLG ;
   private boolean[] H001H2_n189TBM21_DEL_FLG ;
   private long[] H001H2_A186TBM21_STUDY_ID ;
   private String[] H001H2_A187TBM21_STUDY_NM ;
   private boolean[] H001H2_n187TBM21_STUDY_NM ;
   private String[] H001H3_A18TAM04_DEL_FLG ;
   private boolean[] H001H3_n18TAM04_DEL_FLG ;
   private String[] H001H3_A17TAM04_AUTH_CD ;
   private String[] H001H3_A98TAM04_AUTH_NM ;
   private boolean[] H001H3_n98TAM04_AUTH_NM ;
   private String[] H001H4_A307TBT11_DEL_FLG ;
   private boolean[] H001H4_n307TBT11_DEL_FLG ;
   private java.util.Date[] H001H4_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001H4_n578TBT11_DM_ARRIVAL_DATETIME ;
   private short[] H001H4_A305TBT11_CRF_ID ;
   private int[] H001H4_A304TBT11_SUBJECT_ID ;
   private long[] H001H4_A303TBT11_STUDY_ID ;
   private long[] H001H4_A314TBT11_UPD_CNT ;
   private boolean[] H001H4_n314TBT11_UPD_CNT ;
   private short[] H001H4_A306TBT11_CRF_VERSION ;
   private short[] H001H5_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001H5_n370TBT02_CRF_LATEST_VERSION ;
   private java.util.Date[] H001H5_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] H001H5_n564TBT02_DM_ARRIVAL_DATETIME ;
   private short[] H001H5_A294TBT02_CRF_ID ;
   private int[] H001H5_A293TBT02_SUBJECT_ID ;
   private long[] H001H5_A292TBT02_STUDY_ID ;
   private String[] H001H5_A284TBT01_DEL_FLG ;
   private boolean[] H001H5_n284TBT01_DEL_FLG ;
   private String[] H001H5_A295TBT02_DEL_FLG ;
   private boolean[] H001H5_n295TBT02_DEL_FLG ;
   private String[] H001H5_A569TBT02_INPUT_END_FLG ;
   private boolean[] H001H5_n569TBT02_INPUT_END_FLG ;
   private String[] H001H5_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] H001H5_n563TBT02_DM_ARRIVAL_FLG ;
   private String[] H001H5_A613TBT01_SITE_ID ;
   private boolean[] H001H5_n613TBT01_SITE_ID ;
   private byte[] H001H5_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] H001H5_n371TBT02_CRF_INPUT_LEVEL ;
   private java.util.Date[] H001H5_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] H001H5_n560TBT02_UPLOAD_DATETIME ;
   private String[] H001H5_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] H001H5_n561TBT02_UPLOAD_USER_ID ;
   private String[] H001H5_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] H001H5_n562TBT02_UPLOAD_AUTH_CD ;
   private long[] H001H5_A302TBT02_UPD_CNT ;
   private boolean[] H001H5_n302TBT02_UPD_CNT ;
   private short[] H001H6_A922TBT14_MEMO_NO ;
   private long[] H001H6_A329TBT14_STUDY_ID ;
   private int[] H001H6_A330TBT14_SUBJECT_ID ;
   private short[] H001H6_A331TBT14_CRF_ID ;
   private boolean[] H001H6_n331TBT14_CRF_ID ;
   private String[] H001H6_A337TBT14_DEL_FLG ;
   private boolean[] H001H6_n337TBT14_DEL_FLG ;
   private String[] H001H6_A924TBT14_KANRYO_FLG ;
   private boolean[] H001H6_n924TBT14_KANRYO_FLG ;
   private String[] H001H6_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001H6_n927TBT14_KAKUNIN_FLG ;
   private String[] H001H6_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001H6_n929TBT14_REQUEST_AUTH_CD ;
   private int[] H001H7_A304TBT11_SUBJECT_ID ;
   private short[] H001H7_A305TBT11_CRF_ID ;
   private String[] H001H7_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] H001H7_n577TBT11_DM_ARRIVAL_FLG ;
   private long[] H001H7_A303TBT11_STUDY_ID ;
   private java.util.Date[] H001H7_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001H7_n578TBT11_DM_ARRIVAL_DATETIME ;
   private short[] H001H7_A306TBT11_CRF_VERSION ;
   private String[] H001H8_A55TAS01_ITEM_CD ;
   private String[] H001H8_A54TAS01_DATA_KIND ;
   private String[] H001H8_A113TAS01_DEL_FLG ;
   private boolean[] H001H8_n113TAS01_DEL_FLG ;
   private String[] H001H8_A19TAS01_ITEM_NM ;
   private boolean[] H001H8_n19TAS01_ITEM_NM ;
   private String[] H001H8_A150TAS01_CHAR_1 ;
   private boolean[] H001H8_n150TAS01_CHAR_1 ;
   private short[] H001H8_A149TAS01_SORT_NO ;
   private boolean[] H001H8_n149TAS01_SORT_NO ;
   private String[] H001H9_A463TBM34_DEL_FLG ;
   private boolean[] H001H9_n463TBM34_DEL_FLG ;
   private String[] H001H9_A462TBM34_DISPLAY_FLG ;
   private boolean[] H001H9_n462TBM34_DISPLAY_FLG ;
   private String[] H001H9_A461TBM34_STYDY_AUTH_CD ;
   private short[] H001H9_A460TBM34_CRF_ID ;
   private long[] H001H9_A459TBM34_STUDY_ID ;
   private String[] H001H10_A139TAM08_DEL_FLG ;
   private boolean[] H001H10_n139TAM08_DEL_FLG ;
   private String[] H001H10_A132TAM08_SITE_ID ;
   private String[] H001H10_A134TAM08_SITE_SNM ;
   private boolean[] H001H10_n134TAM08_SITE_SNM ;
   private String[] H001H11_A223TBM31_DEL_FLG ;
   private boolean[] H001H11_n223TBM31_DEL_FLG ;
   private short[] H001H11_A218TBM31_CRF_ID ;
   private long[] H001H11_A217TBM31_STUDY_ID ;
   private String[] H001H11_A550TBM31_CRF_SNM ;
   private boolean[] H001H11_n550TBM31_CRF_SNM ;
   private int[] H001H11_A221TBM31_ORDER ;
   private boolean[] H001H11_n221TBM31_ORDER ;
   private String[] H001H12_A16TAM07_DEL_FLG ;
   private boolean[] H001H12_n16TAM07_DEL_FLG ;
   private String[] H001H12_A8TAM07_USER_ID ;
   private String[] H001H12_A2TAM07_USER_NM ;
   private boolean[] H001H12_n2TAM07_USER_NM ;
   private String[] H001H13_A189TBM21_DEL_FLG ;
   private boolean[] H001H13_n189TBM21_DEL_FLG ;
   private long[] H001H13_A186TBM21_STUDY_ID ;
   private String[] H001H13_A513TBM21_STATUS ;
   private boolean[] H001H13_n513TBM21_STATUS ;
   private GxObjectCollection AV49SD_B712_SD08_ICON_INFO ;
   private GxObjectCollection AV47SD_B712_SD07_INPUT_DISP ;
   private GxObjectCollection AV10D_B712_SD06_RESULT_CRF ;
   private GxObjectCollection GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem4[] ;
   private GxObjectCollection GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem5[] ;
   private GxObjectCollection AV62W_B714_SD1_CRF_INFO ;
   private GxObjectCollection AV64W_B716_SD1_CRF_INFO ;
   private GxObjectCollection AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   private GxObjectCollection AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   private GxObjectCollection AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   private GxObjectCollection AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   private SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem AV11D_B712_SD06_RESULT_CRF_Item ;
   private SdtA_PAGING_SDT AV30H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT12[] ;
   private SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem AV48SD_B712_SD07_INPUT_DISP_I ;
   private SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem AV50SD_B712_SD08_ICON_INFO_I ;
   private SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem AV52SD_B792_SD03_OL_DISP_INFO_I ;
   private SdtA_LOGIN_SDT AV53W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT11[] ;
   private SdtB712_SD05_MULTI_SEL_LIST AV61W_B712_SD05_SEL4 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV57W_B712_SD05_SEL_W ;
   private SdtB712_SD05_MULTI_SEL_LIST AV58W_B712_SD05_SEL1 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV59W_B712_SD05_SEL2 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV60W_B712_SD05_SEL3 ;
   private SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem AV63W_B714_SD1_CRF_INFO_Item ;
   private SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem AV65W_B716_SD1_CRF_INFO_Item ;
}

final  class b712_wp02_result_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001H5( com.genexus.internet.HttpContext httpContext ,
                                          String A613TBT01_SITE_ID ,
                                          int A293TBT02_SUBJECT_ID ,
                                          short A294TBT02_CRF_ID ,
                                          int AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ,
                                          int AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ,
                                          int AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ,
                                          int AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ,
                                          String AV90W_P_KANI_KENSAKU ,
                                          short AV94W_SEL_PTN ,
                                          GxObjectCollection AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ,
                                          GxObjectCollection AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ,
                                          GxObjectCollection AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ,
                                          GxObjectCollection AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ,
                                          String A563TBT02_DM_ARRIVAL_FLG ,
                                          java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ,
                                          String A569TBT02_INPUT_END_FLG ,
                                          long A292TBT02_STUDY_ID ,
                                          long AV44P_STUDY_ID ,
                                          String A295TBT02_DEL_FLG ,
                                          String A284TBT01_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int15 ;
      GXv_int15 = new byte [1] ;
      Object[] GXv_Object16 ;
      GXv_Object16 = new Object [2] ;
      scmdbuf = "SELECT T1.`TBT02_CRF_LATEST_VERSION`, T1.`TBT02_DM_ARRIVAL_DATETIME`, T1.`TBT02_CRF_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID," ;
      scmdbuf = scmdbuf + " T2.`TBT01_DEL_FLG`, T1.`TBT02_DEL_FLG`, T1.`TBT02_INPUT_END_FLG`, T1.`TBT02_DM_ARRIVAL_FLG`," ;
      scmdbuf = scmdbuf + " T2.`TBT01_SITE_ID`, T1.`TBT02_CRF_INPUT_LEVEL`, T1.`TBT02_UPLOAD_DATETIME`, T1.`TBT02_UPLOAD_USER_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_UPLOAD_AUTH_CD`, T1.`TBT02_UPD_CNT` FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT`" ;
      scmdbuf = scmdbuf + " T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBT02_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T1.`TBT02_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + " and (T2.`TBT01_DEL_FLG` = '0')" ;
      if ( AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size != 0 )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code, "T2.`TBT01_SITE_ID` IN (", ")") + ")" ;
      }
      if ( ( AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size != 0 ) && ( AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size == 0 ) )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV59W_B712_SD05_SEL2_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code, "T1.`TBT02_SUBJECT_ID` IN (", ")") + ")" ;
      }
      if ( AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size != 0 )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV57W_B712_SD05_SEL_W_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code, "T1.`TBT02_SUBJECT_ID` IN (", ")") + ")" ;
      }
      if ( AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size != 0 )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV60W_B712_SD05_SEL3_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code, "T1.`TBT02_CRF_ID` IN (", ")") + ")" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 1 ) )
      {
         sWhereString = sWhereString + " and (( T1.`TBT02_DM_ARRIVAL_FLG` = '0' and (T1.`TBT02_DM_ARRIVAL_DATETIME` = '1000-01-01')))" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 2 ) )
      {
         sWhereString = sWhereString + " and (( ( T1.`TBT02_DM_ARRIVAL_FLG` = '0' and (T1.`TBT02_DM_ARRIVAL_DATETIME` = '1000-01-01')) or T1.`TBT02_DM_ARRIVAL_FLG` = '1'))" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 4 ) )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = '0')" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 5 ) )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = '1')" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 6 ) )
      {
         sWhereString = sWhereString + " and (( T1.`TBT02_DM_ARRIVAL_FLG` = '1' or ( T1.`TBT02_DM_ARRIVAL_FLG` = '0' and Not (T1.`TBT02_DM_ARRIVAL_DATETIME` = '1000-01-01'))))" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 7 ) )
      {
         sWhereString = sWhereString + " and (( T1.`TBT02_DM_ARRIVAL_FLG` = '0' and Not (T1.`TBT02_DM_ARRIVAL_DATETIME` = '1000-01-01')))" ;
      }
      if ( ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 ) && ( AV94W_SEL_PTN == 8 ) )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = 'Z')" ;
      }
      if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_INPUT_END_FLG` = '0')" ;
      }
      if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "5") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_INPUT_END_FLG` = '1')" ;
      }
      if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "6") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_INPUT_END_FLG` = '0')" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID`" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 3 :
                  return conditional_H001H5(httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (GxObjectCollection)dynConstraints[9] , (GxObjectCollection)dynConstraints[10] , (GxObjectCollection)dynConstraints[11] , (GxObjectCollection)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001H2", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H3", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H4", "SELECT `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (Not (`TBT11_DM_ARRIVAL_DATETIME` = '1000-01-01')) AND (`TBT11_STUDY_ID` = ?) AND (`TBT11_SUBJECT_ID` = ?) AND (`TBT11_CRF_ID` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_CRF_VERSION` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001H5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001H6", "SELECT `TBT14_MEMO_NO`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_CRF_ID`, `TBT14_DEL_FLG`, `TBT14_KANRYO_FLG`, `TBT14_KAKUNIN_FLG`, `TBT14_REQUEST_AUTH_CD` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?) AND (`TBT14_CRF_ID` = ?) AND (`TBT14_REQUEST_AUTH_CD` = ?) AND (`TBT14_KAKUNIN_FLG` = '0') AND (`TBT14_KANRYO_FLG` = '0') AND (`TBT14_DEL_FLG` = '0') ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H7", "SELECT `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_STUDY_ID`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?) AND (`TBT11_DM_ARRIVAL_FLG` = '1') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H8", "SELECT `TAS01_ITEM_CD`, `TAS01_DATA_KIND`, `TAS01_DEL_FLG`, `TAS01_ITEM_NM`, `TAS01_CHAR_1`, `TAS01_SORT_NO` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B10') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_SORT_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001H9", "SELECT `TBM34_DEL_FLG`, `TBM34_DISPLAY_FLG`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRF_ID`, `TBM34_STUDY_ID` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? and `TBM34_STYDY_AUTH_CD` = '01') AND (`TBM34_DISPLAY_FLG` = '0') AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H10", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H11", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM`, `TBM31_ORDER` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H12", "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001H13", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               break;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               break;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 2);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

