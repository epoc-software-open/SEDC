/*
               File: b712_wp01_search_crf_impl
        Description: CRFåüçıèåè
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:5:42.91
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp01_search_crf_impl extends GXWebPanel
{
   public b712_wp01_search_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b712_wp01_search_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_wp01_search_crf_impl.class ));
   }

   public b712_wp01_search_crf_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_sort = new HTMLChoice();
      chkavD_grd1_all_sel_flg = UIFactory.getCheckbox(this);
      chkavCtlsel_flg1 = UIFactory.getCheckbox(this);
      chkavD_grd2_all_sel_flg = UIFactory.getCheckbox(this);
      chkavCtlsel_flg2 = UIFactory.getCheckbox(this);
      chkavD_grd3_all_sel_flg = UIFactory.getCheckbox(this);
      chkavCtlsel_flg3 = UIFactory.getCheckbox(this);
      chkavCtlsel_flg4 = UIFactory.getCheckbox(this);
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
            nGXsfl_59_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_59_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_59_idx, sGXsfl_59_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_Grid2 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_88_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_88_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_Grid2, nGXsfl_88_idx, sGXsfl_88_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
         {
            nRC_Grid3 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_102_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_102_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid3_newrow( nRC_Grid3, nGXsfl_102_idx, sGXsfl_102_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
         {
            nRC_Grid4 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_121_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_121_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid4_newrow( nRC_Grid4, nGXsfl_121_idx, sGXsfl_121_idx) ;
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
            AV20P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
               AV19P_MOVE_KBN = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
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
         pa1G2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1G2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1G2( ) ;
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
      httpContext.writeText( "CRFåüçıèåè") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b712_wp01_search_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1G2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b712_sd01_site_list", AV26W_B712_SD01_SITE_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b712_sd01_site_list", AV26W_B712_SD01_SITE_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b712_sd04_kani_list", AV32W_B712_SD04_KANI_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b712_sd04_kani_list", AV32W_B712_SD04_KANI_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b712_sd03_crf_list", AV30W_B712_SD03_CRF_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b712_sd03_crf_list", AV30W_B712_SD03_CRF_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b712_sd02_subject_list", AV28W_B712_SD02_SUBJECT_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b712_sd02_subject_list", AV28W_B712_SD02_SUBJECT_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid2", GXutil.ltrim( localUtil.ntoc( nRC_Grid2, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid3", GXutil.ltrim( localUtil.ntoc( nRC_Grid3, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid4", GXutil.ltrim( localUtil.ntoc( nRC_Grid4, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
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

   public void wb1G0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1G2( true) ;
      }
      else
      {
         wb_table1_2_1G2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_133_1G2( true) ;
      }
      else
      {
         wb_table2_133_1G2( false) ;
      }
      return  ;
   }

   public void wb_table2_133_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "CRFåüçıèåè", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0131") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0131", "");
         }
      }
      wbErr = false ;
      strup1G0( ) ;
   }

   public void ws1G2( )
   {
      start1G2( ) ;
      evt1G2( ) ;
   }

   public void evt1G2( )
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
                     else if ( GXutil.strcmp(sEvt, "VD_GRD1_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111G2 */
                        e111G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD2_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121G2 */
                        e121G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD3_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131G2 */
                        e131G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_NEW_SUBJECT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141G2 */
                        e141G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DELETE_SUBJECT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151G2 */
                        e151G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DELETE_SUBJECT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161G2 */
                        e161G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171G2 */
                        e171G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_MEMO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181G2 */
                        e181G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                        if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                        {
                           subgrid1_firstpage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                        {
                           subgrid1_previouspage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                        {
                           subgrid1_nextpage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                        {
                           subgrid1_lastpage( ) ;
                        }
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_59_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
                        chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
                        edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
                        AV76GXV1 = (short)(nGXsfl_59_idx+GRID1_nFirstRecordOnPage) ;
                        if ( AV26W_B712_SD01_SITE_LIST.size() >= AV76GXV1 )
                        {
                           Currentitem0 = (((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)));
                           ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
                           ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0131") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0131", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0131") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0131", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e191G2 */
                              e191G2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e201G2 */
                              e201G2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e211G2 */
                              e211G2 ();
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
                        nGXsfl_121_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_121_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_idx, 4, 0)), (short)(4), "0") ;
                        chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
                        edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
                        AV86GXV11 = nGXsfl_121_idx ;
                        if ( AV32W_B712_SD04_KANI_LIST.size() >= AV86GXV11 )
                        {
                           Currentitem1 = (((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)));
                           ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg4.getInternalname())) );
                           ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( httpContext.cgiGet( edtavCtltas01_item_ryak_Internalname) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID4.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e221G8 */
                              e221G8 ();
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
                     else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 )
                     {
                        nGXsfl_102_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
                        chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
                        edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
                        edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
                        AV82GXV7 = nGXsfl_102_idx ;
                        if ( AV30W_B712_SD03_CRF_LIST.size() >= AV82GXV7 )
                        {
                           Currentitem2 = (((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)));
                           ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg3.getInternalname())) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                              GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
                           }
                           else
                           {
                              ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
                           }
                           ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e231G7 */
                              e231G7 ();
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
                     else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                     {
                        nGXsfl_88_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
                        chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
                        edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
                        AV79GXV4 = nGXsfl_88_idx ;
                        if ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV79GXV4 )
                        {
                           Currentitem3 = (((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)));
                           ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                              GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
                           }
                           else
                           {
                              ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
                           }
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e241G6 */
                              e241G6 ();
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
                  else if ( nCmpId == 131 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0131") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0131", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1G2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1G2( ) ;
         }
      }
   }

   public void pa1G2( )
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
                  AV20P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_AUTH_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
                     AV19P_MOVE_KBN = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
                  }
               }
            }
         }
         cmbavD_sort.setName( "vD_SORT" );
         cmbavD_sort.setWebtags( "" );
         cmbavD_sort.addItem("1", "ä≥é“NoÅ{CRFï\é¶èá", (short)(0));
         cmbavD_sort.addItem("2", "CRFï\é¶èáÅ{ä≥é“Noèá", (short)(0));
         cmbavD_sort.addItem("3", "ì¸óÕå†å¿ÉåÉxÉãÅ{CRFï\é¶èáÅ{ä≥é“Noèá", (short)(0));
         cmbavD_sort.addItem("4", "DMíÖÅiDMíÖ ç~èáÅ{ä≥é“NoÅ{CRFï\é¶èáÅj", (short)(0));
         cmbavD_sort.addItem("5", "ÉfÅ[É^å≈íËÅiÉfÅ[É^å≈íË ç~èáÅ{ä≥é“NoÅ{CRFï\é¶èáÅj", (short)(0));
         if ( ( cmbavD_sort.getItemCount() > 0 ) && (GXutil.strcmp("", AV10D_SORT)==0) )
         {
            AV10D_SORT = cmbavD_sort.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
         }
         chkavD_grd1_all_sel_flg.setName( "vD_GRD1_ALL_SEL_FLG" );
         chkavD_grd1_all_sel_flg.setWebtags( "" );
         chkavD_grd1_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd1_all_sel_flg.getInternalname(), "Caption", chkavD_grd1_all_sel_flg.getCaption());
         chkavD_grd1_all_sel_flg.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG1_" + sGXsfl_59_idx ;
         chkavCtlsel_flg1.setName( GXCCtl );
         chkavCtlsel_flg1.setWebtags( "" );
         chkavCtlsel_flg1.setCaption( "" );
         chkavCtlsel_flg1.setCheckedValue( "false" );
         chkavD_grd2_all_sel_flg.setName( "vD_GRD2_ALL_SEL_FLG" );
         chkavD_grd2_all_sel_flg.setWebtags( "" );
         chkavD_grd2_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd2_all_sel_flg.getInternalname(), "Caption", chkavD_grd2_all_sel_flg.getCaption());
         chkavD_grd2_all_sel_flg.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG2_" + sGXsfl_88_idx ;
         chkavCtlsel_flg2.setName( GXCCtl );
         chkavCtlsel_flg2.setWebtags( "" );
         chkavCtlsel_flg2.setCaption( "" );
         chkavCtlsel_flg2.setCheckedValue( "false" );
         chkavD_grd3_all_sel_flg.setName( "vD_GRD3_ALL_SEL_FLG" );
         chkavD_grd3_all_sel_flg.setWebtags( "" );
         chkavD_grd3_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd3_all_sel_flg.getInternalname(), "Caption", chkavD_grd3_all_sel_flg.getCaption());
         chkavD_grd3_all_sel_flg.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG3_" + sGXsfl_102_idx ;
         chkavCtlsel_flg3.setName( GXCCtl );
         chkavCtlsel_flg3.setWebtags( "" );
         chkavCtlsel_flg3.setCaption( "" );
         chkavCtlsel_flg3.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG4_" + sGXsfl_121_idx ;
         chkavCtlsel_flg4.setName( GXCCtl );
         chkavCtlsel_flg4.setWebtags( "" );
         chkavCtlsel_flg4.setCaption( "" );
         chkavCtlsel_flg4.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_59_idx ,
                                 String sGXsfl_59_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
      edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
      while ( nGXsfl_59_idx <= nRC_Grid1 )
      {
         sendrow_592( ) ;
         nGXsfl_59_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_59_idx+1)) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
         edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_Grid2 ,
                                 short nGXsfl_88_idx ,
                                 String sGXsfl_88_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
      edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
      while ( nGXsfl_88_idx <= nRC_Grid2 )
      {
         sendrow_886( ) ;
         nGXsfl_88_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_idx+1)) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
         edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( short nRC_Grid3 ,
                                 short nGXsfl_102_idx ,
                                 String sGXsfl_102_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
      while ( nGXsfl_102_idx <= nRC_Grid3 )
      {
         sendrow_1027( ) ;
         nGXsfl_102_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_102_idx+1)) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
         edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
         edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
      }
      httpContext.GX_webresponse.addString(Grid3Container.ToJavascriptSource());
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( short nRC_Grid4 ,
                                 short nGXsfl_121_idx ,
                                 String sGXsfl_121_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
      edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
      while ( nGXsfl_121_idx <= nRC_Grid4 )
      {
         sendrow_1218( ) ;
         nGXsfl_121_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_121_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_121_idx+1)) ;
         sGXsfl_121_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
         edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
      }
      httpContext.GX_webresponse.addString(Grid4Container.ToJavascriptSource());
      /* End function gxnrGrid4_newrow */
   }

   public void refresh( )
   {
      rf1G2( ) ;
      rf1G6( ) ;
      rf1G7( ) ;
      rf1G8( ) ;
      /* End function Refresh */
   }

   public void rf1G2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(59) ;
      nGXsfl_59_idx = (short)(1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
      edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
      /* Execute user event: e201G2 */
      e201G2 ();
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
         chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
         edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
         /* Execute user event: e211G2 */
         e211G2 ();
         wbEnd = (short)(59) ;
         wb1G0( ) ;
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
      return AV26W_B712_SD01_SITE_LIST.size() ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( 0 > 0 )
      {
         if ( 1 > 0 )
         {
            return 0*1 ;
         }
         else
         {
            return 0 ;
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

   public void rf1G6( )
   {
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      wbStart = (short)(88) ;
      nGXsfl_88_idx = (short)(1) ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
      edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
         edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
         /* Execute user event: e241G6 */
         e241G6 ();
         wbEnd = (short)(88) ;
         wb1G0( ) ;
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

   public void rf1G7( )
   {
      Grid3Container.setPageSize( subgrid3_recordsperpage( ) );
      wbStart = (short)(102) ;
      nGXsfl_102_idx = (short)(1) ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
         edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
         edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
         /* Execute user event: e231G7 */
         e231G7 ();
         wbEnd = (short)(102) ;
         wb1G0( ) ;
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

   public void rf1G8( )
   {
      Grid4Container.setPageSize( subgrid4_recordsperpage( ) );
      wbStart = (short)(121) ;
      nGXsfl_121_idx = (short)(1) ;
      sGXsfl_121_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
      edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
         edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
         /* Execute user event: e221G8 */
         e221G8 ();
         wbEnd = (short)(121) ;
         wb1G0( ) ;
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

   public void strup1G0( )
   {
      /* Before Start, stand alone formulas. */
      AV118Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV115Pgmdesc = "CRFåüçıèåè" ;
      Gx_err = (short)(0) ;
      edtavCtltam08_site_snm_Enabled = 0 ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e191G2 */
      e191G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd01_site_list"), AV26W_B712_SD01_SITE_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV12H_A_PAGING_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd04_kani_list"), AV32W_B712_SD04_KANI_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd03_crf_list"), AV30W_B712_SD03_CRF_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd02_subject_list"), AV28W_B712_SD02_SUBJECT_LIST);
         /* Read variables values. */
         cmbavD_sort.setName( cmbavD_sort.getInternalname() );
         cmbavD_sort.setValue( httpContext.cgiGet( cmbavD_sort.getInternalname()) );
         AV10D_SORT = httpContext.cgiGet( cmbavD_sort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
         AV7D_GRD1_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG));
         AV8D_GRD2_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_GRD2_ALL_SEL_FLG", GXutil.booltostr( AV8D_GRD2_ALL_SEL_FLG));
         AV11D_SUBJECT_ID = httpContext.cgiGet( edtavD_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
         AV9D_GRD3_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd3_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", GXutil.booltostr( AV9D_GRD3_ALL_SEL_FLG));
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV16H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_FLG", AV16H_SRCH_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_sentaku_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_sentaku_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SUBJECT_ID_SENTAKU");
            GX_FocusControl = edtavH_subject_id_sentaku_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_SUBJECT_ID_SENTAKU = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
         }
         else
         {
            AV17H_SUBJECT_ID_SENTAKU = (int)(localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_sentaku_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
         }
         AV59W_OTHER_SITE_VIEW_FLG = httpContext.cgiGet( edtavW_other_site_view_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59W_OTHER_SITE_VIEW_FLG", AV59W_OTHER_SITE_VIEW_FLG);
         AV65W_TBM01_SYS_VALUE = httpContext.cgiGet( edtavW_tbm01_sys_value_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65W_TBM01_SYS_VALUE", AV65W_TBM01_SYS_VALUE);
         AV39W_DM_KBN = httpContext.cgiGet( edtavW_dm_kbn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39W_DM_KBN", AV39W_DM_KBN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_POPUP_ERR_CD");
            GX_FocusControl = edtavH_popup_err_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_POPUP_ERR_CD = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         }
         else
         {
            AV15H_POPUP_ERR_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_popup_err_cd_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         }
         AV13H_AUTO_SENI_FLG = httpContext.cgiGet( edtavH_auto_seni_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_AUTO_SENI_FLG", AV13H_AUTO_SENI_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nRC_Grid2 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid2"), ".", ",")) ;
         nRC_Grid3 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid3"), ".", ",")) ;
         nRC_Grid4 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid4"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0131") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0131", "");
         }
         subGrid1_Rows = (short)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_59_fel_idx = (short)(0) ;
         while ( nGXsfl_59_fel_idx < nRC_Grid1 )
         {
            nGXsfl_59_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_59_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_59_fel_idx+1)) ;
            sGXsfl_59_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_fel_idx );
            edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_fel_idx ;
            AV76GXV1 = (short)(nGXsfl_59_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV76GXV1 = (short)(nGXsfl_59_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( AV26W_B712_SD01_SITE_LIST.size() >= AV76GXV1 )
            {
               Currentitem0 = (((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)));
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0131") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0131", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0131") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0131", "");
            }
            Currentitem0 = (((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)));
         }
         if ( nGXsfl_59_fel_idx == 0 )
         {
            nGXsfl_59_idx = (short)(1) ;
            sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
            edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
         }
         nGXsfl_59_fel_idx = (short)(1) ;
         nRC_Grid2 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid2"), ".", ",")) ;
         nGXsfl_88_fel_idx = (short)(0) ;
         while ( nGXsfl_88_fel_idx < nRC_Grid2 )
         {
            nGXsfl_88_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_fel_idx+1)) ;
            sGXsfl_88_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_fel_idx );
            edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_fel_idx ;
            AV79GXV4 = nGXsfl_88_fel_idx ;
            AV79GXV4 = nGXsfl_88_fel_idx ;
            if ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV79GXV4 )
            {
               Currentitem3 = (((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)));
               ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                  GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
               }
               else
               {
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
               }
            }
            Currentitem3 = (((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)));
         }
         if ( nGXsfl_88_fel_idx == 0 )
         {
            nGXsfl_88_idx = (short)(1) ;
            sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
            edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
         }
         nGXsfl_88_fel_idx = (short)(1) ;
         nRC_Grid3 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid3"), ".", ",")) ;
         nGXsfl_102_fel_idx = (short)(0) ;
         while ( nGXsfl_102_fel_idx < nRC_Grid3 )
         {
            nGXsfl_102_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_102_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_102_fel_idx+1)) ;
            sGXsfl_102_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_fel_idx );
            edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_fel_idx ;
            edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_fel_idx ;
            AV82GXV7 = nGXsfl_102_fel_idx ;
            AV82GXV7 = nGXsfl_102_fel_idx ;
            if ( AV30W_B712_SD03_CRF_LIST.size() >= AV82GXV7 )
            {
               Currentitem2 = (((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)));
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg3.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                  GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
               }
               else
               {
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               }
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
            }
            Currentitem2 = (((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)));
         }
         if ( nGXsfl_102_fel_idx == 0 )
         {
            nGXsfl_102_idx = (short)(1) ;
            sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
            edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
            edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
         }
         nGXsfl_102_fel_idx = (short)(1) ;
         nRC_Grid4 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid4"), ".", ",")) ;
         nGXsfl_121_fel_idx = (short)(0) ;
         while ( nGXsfl_121_fel_idx < nRC_Grid4 )
         {
            nGXsfl_121_fel_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_121_fel_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_121_fel_idx+1)) ;
            sGXsfl_121_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_fel_idx );
            edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_fel_idx ;
            AV86GXV11 = nGXsfl_121_fel_idx ;
            AV86GXV11 = nGXsfl_121_fel_idx ;
            if ( AV32W_B712_SD04_KANI_LIST.size() >= AV86GXV11 )
            {
               Currentitem1 = (((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)));
               ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg4.getInternalname())) );
               ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( httpContext.cgiGet( edtavCtltas01_item_ryak_Internalname) );
            }
            Currentitem1 = (((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)));
         }
         if ( nGXsfl_121_fel_idx == 0 )
         {
            nGXsfl_121_idx = (short)(1) ;
            sGXsfl_121_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
            edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
         }
         nGXsfl_121_fel_idx = (short)(1) ;
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
      /* Execute user event: e191G2 */
      e191G2 ();
      if (returnInSub) return;
   }

   public void e191G2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B712" ;
      AV6C_GAMEN_TITLE = AV115Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV14H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Using cursor H001G2 */
      pr_default.execute(0, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A186TBM21_STUDY_ID = H001G2_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H001G2_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001G2_n187TBM21_STUDY_NM[0] ;
         AV62W_STUDY_NM = A187TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H001G3 */
      pr_default.execute(1, new Object[] {AV18P_AUTH_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A17TAM04_AUTH_CD = H001G3_A17TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
         A98TAM04_AUTH_NM = H001G3_A98TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
         n98TAM04_AUTH_NM = H001G3_n98TAM04_AUTH_NM[0] ;
         AV25W_AUTH_NM = A98TAM04_AUTH_NM + "å†å¿" ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV22W_A_LOGIN_SDT,AV5C_APP_ID,AV62W_STUDY_NM,AV25W_AUTH_NM,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0131",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e201G2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV118Pgmname, "INFO", "âÊñ ãNìÆ") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         AV15H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         AV52W_MEMO_DISP_FLG = "0" ;
         if ( AV19P_MOVE_KBN == 0 )
         {
            /* Using cursor H001G4 */
            pr_default.execute(2, new Object[] {new Long(AV20P_STUDY_ID), AV18P_AUTH_CD, AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A337TBT14_DEL_FLG = H001G4_A337TBT14_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
               n337TBT14_DEL_FLG = H001G4_n337TBT14_DEL_FLG[0] ;
               A924TBT14_KANRYO_FLG = H001G4_A924TBT14_KANRYO_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
               n924TBT14_KANRYO_FLG = H001G4_n924TBT14_KANRYO_FLG[0] ;
               A927TBT14_KAKUNIN_FLG = H001G4_A927TBT14_KAKUNIN_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
               n927TBT14_KAKUNIN_FLG = H001G4_n927TBT14_KAKUNIN_FLG[0] ;
               A929TBT14_REQUEST_AUTH_CD = H001G4_A929TBT14_REQUEST_AUTH_CD[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
               n929TBT14_REQUEST_AUTH_CD = H001G4_n929TBT14_REQUEST_AUTH_CD[0] ;
               A928TBT14_REQUEST_SITE_ID = H001G4_A928TBT14_REQUEST_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
               n928TBT14_REQUEST_SITE_ID = H001G4_n928TBT14_REQUEST_SITE_ID[0] ;
               A329TBT14_STUDY_ID = H001G4_A329TBT14_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
               AV52W_MEMO_DISP_FLG = "1" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
      }
      AV14H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      if ( AV15H_POPUP_ERR_CD != 9 )
      {
         if ( AV15H_POPUP_ERR_CD == 1 )
         {
         }
         else
         {
            /* Execute user subroutine: S132 */
            S132 ();
            if (returnInSub) return;
         }
         AV15H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
      }
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      AV70W_TOP_LINE_NO = (long)(subGrid1_Rows*(subgrid1_currentpage( )-1)+1) ;
      AV38W_CNT = 0 ;
      if ( GXutil.strcmp(AV13H_AUTO_SENI_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      if ( GXutil.strcmp(AV52W_MEMO_DISP_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         AV52W_MEMO_DISP_FLG = "0" ;
      }
   }

   private void e211G2( )
   {
      /* Grid1_Load Routine */
      AV76GXV1 = (short)(1) ;
      while ( AV76GXV1 <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         Currentitem0 = ( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(59) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 0 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_592( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
         AV76GXV1 = (short)(AV76GXV1+1) ;
      }
   }

   public void e111G2( )
   {
      /* D_grd1_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( AV7D_GRD1_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
   }

   public void e121G2( )
   {
      /* D_grd2_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( AV8D_GRD2_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
   }

   public void e131G2( )
   {
      /* D_grd3_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV9D_GRD3_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
   }

   public void e141G2( )
   {
      /* 'BTN_NEW_SUBJECT' Routine */
      AV43W_ERRFLG = false ;
      AV46W_INPCHK_FLG1 = false ;
      AV47W_INPCHK_FLG2 = false ;
      AV48W_INPCHK_FLG3 = false ;
      AV49W_INPCHK_FLG4 = false ;
      AV50W_INPCHK_FLG5 = false ;
      AV51W_INPCHK_FLG6 = false ;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15H_POPUP_ERR_CD,1,0))) ;
         httpContext.popup(formatLink("b713_wp01_subject_sink") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV15H_POPUP_ERR_CD"});
         httpContext.doAjaxRefresh();
      }
   }

   public void e151G2( )
   {
      /* 'BTN_DELETE_SUBJECT' Routine */
      AV43W_ERRFLG = false ;
      AV46W_INPCHK_FLG1 = true ;
      AV47W_INPCHK_FLG2 = true ;
      AV48W_INPCHK_FLG3 = false ;
      AV49W_INPCHK_FLG4 = false ;
      AV50W_INPCHK_FLG5 = false ;
      AV51W_INPCHK_FLG6 = false ;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         GXt_char2 = AV53W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AG00028", GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0), "", "", "", "", GXv_char3) ;
         b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
         AV53W_MSG = GXt_char2 ;
         GXt_char2 = AV24W_A821_JS ;
         GXv_char3[0] = GXt_char2 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV53W_MSG, "", "BTN_DELETE_SUBJECT_EXEC", "", GXv_char3) ;
         b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
         AV24W_A821_JS = GXt_char2 ;
      }
   }

   public void e161G2( )
   {
      /* 'BTN_DELETE_SUBJECT_EXEC' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      GXv_int4[0] = AV40W_ERR_CD ;
      GXv_char3[0] = AV41W_ERR_MSG ;
      new b713_pc02_subject_delete(remoteHandle, context).execute( AV20P_STUDY_ID, AV17H_SUBJECT_ID_SENTAKU, GXv_int4, GXv_char3) ;
      b712_wp01_search_crf_impl.this.AV40W_ERR_CD = GXv_int4[0] ;
      b712_wp01_search_crf_impl.this.AV41W_ERR_MSG = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
      if ( AV40W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV41W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         httpContext.doAjaxRefresh();
      }
   }

   public void e171G2( )
   {
      /* 'BTN_SRCH' Routine */
      AV43W_ERRFLG = false ;
      AV46W_INPCHK_FLG1 = false ;
      AV47W_INPCHK_FLG2 = false ;
      AV48W_INPCHK_FLG3 = true ;
      AV49W_INPCHK_FLG4 = true ;
      AV50W_INPCHK_FLG5 = true ;
      AV51W_INPCHK_FLG6 = true ;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         AV60W_SESSION.setValue("B712_WP02_STUDY_ID", GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
         AV60W_SESSION.setValue("B712_WP02_AUTH_CD", AV18P_AUTH_CD);
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
         httpContext.wjLoc = formatLink("b712_wp02_result_crf")  ;
      }
   }

   public void e181G2( )
   {
      /* 'BTN_MEMO' Routine */
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV19P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      GX_FocusControl = cmbavD_sort.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void S202( )
   {
      /* 'SUB_SET_SDT_DB' Routine */
      AV26W_B712_SD01_SITE_LIST.clear();
      gx_BV59 = true ;
      AV28W_B712_SD02_SUBJECT_LIST.clear();
      gx_BV88 = true ;
      AV30W_B712_SD03_CRF_LIST.clear();
      gx_BV102 = true ;
      AV32W_B712_SD04_KANI_LIST.clear();
      gx_BV121 = true ;
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), AV18P_AUTH_CD) == 0 )
      {
         tblTbl_btn_subject_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_btn_subject_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_btn_subject_Visible, 5, 0)));
      }
      else
      {
         tblTbl_btn_subject_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_btn_subject_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_btn_subject_Visible, 5, 0)));
      }
      AV59W_OTHER_SITE_VIEW_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59W_OTHER_SITE_VIEW_FLG", AV59W_OTHER_SITE_VIEW_FLG);
      /* Using cursor H001G5 */
      pr_default.execute(3, new Object[] {AV18P_AUTH_CD});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A534TBM07_DEL_FLG = H001G5_A534TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
         n534TBM07_DEL_FLG = H001G5_n534TBM07_DEL_FLG[0] ;
         A530TBM07_AUTH_CD = H001G5_A530TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
         A533TBM07_OTHER_SITE_VIEW_FLG = H001G5_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
         n533TBM07_OTHER_SITE_VIEW_FLG = H001G5_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         AV59W_OTHER_SITE_VIEW_FLG = A533TBM07_OTHER_SITE_VIEW_FLG ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59W_OTHER_SITE_VIEW_FLG", AV59W_OTHER_SITE_VIEW_FLG);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV59W_OTHER_SITE_VIEW_FLG ,
                                           A198TBM22_SITE_ID ,
                                           AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id() ,
                                           A199TBM22_DEL_FLG ,
                                           new Long(AV20P_STUDY_ID) ,
                                           new Long(A197TBM22_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor H001G6 */
      pr_default.execute(4, new Object[] {new Long(AV20P_STUDY_ID), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A199TBM22_DEL_FLG = H001G6_A199TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
         n199TBM22_DEL_FLG = H001G6_n199TBM22_DEL_FLG[0] ;
         A198TBM22_SITE_ID = H001G6_A198TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
         A197TBM22_STUDY_ID = H001G6_A197TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         A134TAM08_SITE_SNM = H001G6_A134TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         n134TAM08_SITE_SNM = H001G6_n134TAM08_SITE_SNM[0] ;
         A134TAM08_SITE_SNM = H001G6_A134TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         n134TAM08_SITE_SNM = H001G6_n134TAM08_SITE_SNM[0] ;
         AV27W_B712_SD01_SITE_LIST_Item = (SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)new SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem(remoteHandle, context);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id( A198TBM22_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( A134TAM08_SITE_SNM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         if ( AV19P_MOVE_KBN == 0 )
         {
            AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         }
         else
         {
            AV45W_IDX = 1 ;
            while ( AV45W_IDX <= AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
            {
               if ( GXutil.strcmp((String)AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), AV27W_B712_SD01_SITE_LIST_Item.getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id()) == 0 )
               {
                  AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
               }
               AV45W_IDX = (long)(AV45W_IDX+1) ;
            }
         }
         AV26W_B712_SD01_SITE_LIST.add(AV27W_B712_SD01_SITE_LIST_Item, 0);
         gx_BV59 = true ;
         AV66W_TBM22_SITE_ID = A198TBM22_SITE_ID ;
         /* Execute user subroutine: S2210 */
         S2210 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV28W_B712_SD02_SUBJECT_LIST.sort("TBT01_SUBJECT_ID");
      gx_BV88 = true ;
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn()) == 0 )
      {
         AV39W_DM_KBN = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39W_DM_KBN", AV39W_DM_KBN);
      }
      else
      {
         AV39W_DM_KBN = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39W_DM_KBN", AV39W_DM_KBN);
      }
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A551TBM31_STATUS ,
                                           AV39W_DM_KBN ,
                                           new Long(A217TBM31_STUDY_ID) ,
                                           new Long(AV20P_STUDY_ID) ,
                                           A223TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001G7 */
      pr_default.execute(5, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A217TBM31_STUDY_ID = H001G7_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A223TBM31_DEL_FLG = H001G7_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001G7_n223TBM31_DEL_FLG[0] ;
         A551TBM31_STATUS = H001G7_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = H001G7_n551TBM31_STATUS[0] ;
         A218TBM31_CRF_ID = H001G7_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A550TBM31_CRF_SNM = H001G7_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = H001G7_n550TBM31_CRF_SNM[0] ;
         A221TBM31_ORDER = H001G7_A221TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         n221TBM31_ORDER = H001G7_n221TBM31_ORDER[0] ;
         AV68W_TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
         AV67W_TBM31_CRF_ID = A218TBM31_CRF_ID ;
         /* Execute user subroutine: S2311 */
         S2311 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( ! AV69W_TBM34_FLG )
         {
            AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( false );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( A218TBM31_CRF_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( A550TBM31_CRF_SNM );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order( A221TBM31_ORDER );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status( A551TBM31_STATUS );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id( A217TBM31_STUDY_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV45W_IDX = 1 ;
            while ( AV45W_IDX <= AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
            {
               if ( GXutil.strcmp((String)AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), GXutil.str( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), 4, 0)) == 0 )
               {
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
               }
               AV45W_IDX = (long)(AV45W_IDX+1) ;
            }
            AV30W_B712_SD03_CRF_LIST.add(AV31W_B712_SD03_CRF_LIST_Item, 0);
            gx_BV102 = true ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor H001G8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A54TAS01_DATA_KIND = H001G8_A54TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A113TAS01_DEL_FLG = H001G8_A113TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         n113TAS01_DEL_FLG = H001G8_n113TAS01_DEL_FLG[0] ;
         A55TAS01_ITEM_CD = H001G8_A55TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         A53TAS01_ITEM_RYAK = H001G8_A53TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         n53TAS01_ITEM_RYAK = H001G8_n53TAS01_ITEM_RYAK[0] ;
         A149TAS01_SORT_NO = H001G8_A149TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
         n149TAS01_SORT_NO = H001G8_n149TAS01_SORT_NO[0] ;
         AV33W_B712_SD04_KANI_LIST_Item = (SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)new SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem(remoteHandle, context);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd( A55TAS01_ITEM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( A53TAS01_ITEM_RYAK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no( A149TAS01_SORT_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
         {
            if ( GXutil.strcmp((String)AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), AV33W_B712_SD04_KANI_LIST_Item.getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd()) == 0 )
            {
               AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         AV32W_B712_SD04_KANI_LIST.add(AV33W_B712_SD04_KANI_LIST_Item, 0);
         gx_BV121 = true ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV19P_MOVE_KBN == 0 )
      {
         AV7D_GRD1_ALL_SEL_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG));
      }
      else
      {
      }
   }

   public void S182( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_SORT", AV10D_SORT);
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG", (AV7D_GRD1_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG", (AV8D_GRD2_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG", (AV9D_GRD3_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_SUBJECT_ID", AV11D_SUBJECT_ID);
      AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         if ( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
         {
            AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id(), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
      AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
         {
            AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(GXutil.str( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), 6, 0), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
      AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         if ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() )
         {
            AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(GXutil.str( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), 4, 0), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
      AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      while ( AV45W_IDX <= AV32W_B712_SD04_KANI_LIST.size() )
      {
         if ( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg() )
         {
            AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd(), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
      }
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID1_SEL", AV34W_B712_SD05_SEL1.toxml(false, "B712_SD05_MULTI_SEL_LIST", "SmartEDC_SHIZUOKA"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID2_SEL", AV35W_B712_SD05_SEL2.toxml(false, "B712_SD05_MULTI_SEL_LIST", "SmartEDC_SHIZUOKA"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID3_SEL", AV36W_B712_SD05_SEL3.toxml(false, "B712_SD05_MULTI_SEL_LIST", "SmartEDC_SHIZUOKA"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID4_SEL", AV37W_B712_SD05_SEL4.toxml(false, "B712_SD05_MULTI_SEL_LIST", "SmartEDC_SHIZUOKA"));
   }

   public void S192( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV10D_SORT = AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_D_SORT") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
      AV7D_GRD1_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG));
      AV8D_GRD2_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_GRD2_ALL_SEL_FLG", GXutil.booltostr( AV8D_GRD2_ALL_SEL_FLG));
      AV9D_GRD3_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", GXutil.booltostr( AV9D_GRD3_ALL_SEL_FLG));
      AV11D_SUBJECT_ID = AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_SUBJECT_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
      AV34W_B712_SD05_SEL1.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID1_SEL"), "");
      AV35W_B712_SD05_SEL2.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID2_SEL"), "");
      AV36W_B712_SD05_SEL3.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID3_SEL"), "");
      AV37W_B712_SD05_SEL4.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID4_SEL"), "");
   }

   public void S212( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_D_SORT");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_SUBJECT_ID");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID1_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID2_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID3_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID4_SEL");
   }

   public void S2210( )
   {
      /* 'SUB_GRID2_SDT_SET' Routine */
      /* Using cursor H001G9 */
      pr_default.execute(7, new Object[] {new Long(AV20P_STUDY_ID), AV66W_TBM22_SITE_ID});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A284TBT01_DEL_FLG = H001G9_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = H001G9_n284TBT01_DEL_FLG[0] ;
         A613TBT01_SITE_ID = H001G9_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = H001G9_n613TBT01_SITE_ID[0] ;
         A282TBT01_STUDY_ID = H001G9_A282TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A283TBT01_SUBJECT_ID = H001G9_A283TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
         AV29W_B712_SD02_SUBJECT_LIST_Item = (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)new SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem(remoteHandle, context);
         AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
         AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id( A613TBT01_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
         AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id( A282TBT01_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
         AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( A283TBT01_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
         {
            if ( GXutil.strcmp((String)AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), GXutil.str( AV29W_B712_SD02_SUBJECT_LIST_Item.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), 6, 0)) == 0 )
            {
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         AV28W_B712_SD02_SUBJECT_LIST.add(AV29W_B712_SD02_SUBJECT_LIST_Item, 0);
         gx_BV88 = true ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S2311( )
   {
      /* 'SUB_TBM34_HANTEI' Routine */
      AV69W_TBM34_FLG = false ;
      /* Using cursor H001G10 */
      pr_default.execute(8, new Object[] {new Long(AV20P_STUDY_ID), new Short(AV67W_TBM31_CRF_ID), AV18P_AUTH_CD});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A463TBM34_DEL_FLG = H001G10_A463TBM34_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A463TBM34_DEL_FLG", A463TBM34_DEL_FLG);
         n463TBM34_DEL_FLG = H001G10_n463TBM34_DEL_FLG[0] ;
         A462TBM34_DISPLAY_FLG = H001G10_A462TBM34_DISPLAY_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462TBM34_DISPLAY_FLG", A462TBM34_DISPLAY_FLG);
         n462TBM34_DISPLAY_FLG = H001G10_n462TBM34_DISPLAY_FLG[0] ;
         A460TBM34_CRF_ID = H001G10_A460TBM34_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A460TBM34_CRF_ID, 4, 0)));
         A461TBM34_STYDY_AUTH_CD = H001G10_A461TBM34_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A461TBM34_STYDY_AUTH_CD", A461TBM34_STYDY_AUTH_CD);
         A459TBM34_STUDY_ID = H001G10_A459TBM34_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A459TBM34_STUDY_ID, 10, 0)));
         AV69W_TBM34_FLG = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S172( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV126GXLvl638 = (byte)(0) ;
      /* Using cursor H001G11 */
      pr_default.execute(9, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A189TBM21_DEL_FLG = H001G11_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001G11_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = H001G11_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A513TBM21_STATUS = H001G11_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = H001G11_n513TBM21_STATUS[0] ;
         AV126GXLvl638 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuèIóπÅv", "ëÄçÏ", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuíÜé~Åv", "ëÄçÏ", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      if ( AV126GXLvl638 == 0 )
      {
         GXt_char2 = AV53W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ëIëÇ≥ÇÍÇΩééå±", "óòópïsâ¬", "ëÄçÏ", "", "", GXv_char3) ;
         b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
         AV53W_MSG = GXt_char2 ;
         httpContext.GX_msglist.addItem(AV53W_MSG);
         AV43W_ERRFLG = true ;
      }
      if ( AV43W_ERRFLG )
      {
         AV46W_INPCHK_FLG1 = false ;
         AV47W_INPCHK_FLG2 = false ;
         AV48W_INPCHK_FLG3 = false ;
         AV49W_INPCHK_FLG4 = false ;
         AV50W_INPCHK_FLG5 = false ;
         AV51W_INPCHK_FLG6 = false ;
      }
      if ( AV46W_INPCHK_FLG1 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV17H_SUBJECT_ID_SENTAKU = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
               AV38W_CNT = 1 ;
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( AV38W_CNT == 0 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "ä≥é“", "", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
      }
      if ( AV47W_INPCHK_FLG2 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV38W_CNT = (long)(AV38W_CNT+1) ;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( AV38W_CNT > 1 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "ä≥é“", "1êl", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
      }
      if ( AV48W_INPCHK_FLG3 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
         {
            if ( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
            {
               AV38W_CNT = 1 ;
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( AV38W_CNT == 0 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "é{ê›", "", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
      }
      if ( AV49W_INPCHK_FLG4 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV17H_SUBJECT_ID_SENTAKU = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
               AV38W_CNT = 1 ;
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( ( AV38W_CNT == 0 ) && (GXutil.strcmp("", AV11D_SUBJECT_ID)==0) )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "ä≥é“", "", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
         if ( ! (GXutil.strcmp("", AV11D_SUBJECT_ID)==0) )
         {
            AV63W_SUBJECT_ID_CNT = (byte)(0) ;
            while ( AV40W_ERR_CD == 0 )
            {
               AV63W_SUBJECT_ID_CNT = (byte)(AV63W_SUBJECT_ID_CNT+1) ;
               GXv_char3[0] = AV64W_SUBJECT_ID_GET ;
               GXv_int4[0] = AV40W_ERR_CD ;
               new a822_pc01_str_token(remoteHandle, context).execute( AV11D_SUBJECT_ID, ",", AV63W_SUBJECT_ID_CNT, GXv_char3, GXv_int4) ;
               b712_wp01_search_crf_impl.this.AV64W_SUBJECT_ID_GET = GXv_char3[0] ;
               b712_wp01_search_crf_impl.this.AV40W_ERR_CD = GXv_int4[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
               if ( AV40W_ERR_CD != 9 )
               {
                  if ( GxRegex.IsMatch(AV64W_SUBJECT_ID_GET,"[^0-9]") )
                  {
                     GXt_char2 = AV53W_MSG ;
                     GXv_char3[0] = GXt_char2 ;
                     new a805_pc02_msg_get(remoteHandle, context).execute( "AE00019", "ä≥é“ID", "", "", "", "", GXv_char3) ;
                     b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
                     AV53W_MSG = GXt_char2 ;
                     httpContext.GX_msglist.addItem(AV53W_MSG);
                     AV40W_ERR_CD = (byte)(9) ;
                     AV43W_ERRFLG = true ;
                  }
               }
            }
         }
      }
      if ( AV50W_INPCHK_FLG5 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
         {
            if ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() )
            {
               AV38W_CNT = 1 ;
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( AV38W_CNT == 0 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
      }
      if ( AV51W_INPCHK_FLG6 )
      {
         AV38W_CNT = 0 ;
         AV45W_IDX = 1 ;
         while ( AV45W_IDX <= AV32W_B712_SD04_KANI_LIST.size() )
         {
            if ( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg() )
            {
               AV38W_CNT = (long)(AV38W_CNT+1) ;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
         }
         if ( AV38W_CNT > 1 )
         {
            GXt_char2 = AV53W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "ä»à’åüçı", "1åè", "", "", "", GXv_char3) ;
            b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV53W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
         }
      }
   }

   public void S152( )
   {
      /* 'SUB_OPEN_CRF' Routine */
      AV72SD_OPEN_CRF_C.fromxml(AV60W_SESSION.getValue("B719_OPEN_CRF_SDT"), "");
      AV60W_SESSION.remove("B719_OPEN_CRF_SDT");
      AV56W_OPEN_STUDY_ID = "" ;
      AV57W_OPEN_SUBJECT_ID = "" ;
      AV54W_OPEN_CRF_ID = "" ;
      AV55W_OPEN_CRF_INPUT_LEVEL = "" ;
      AV58W_OPEN_UPD_CNT = "" ;
      AV127GXV41 = 1 ;
      while ( AV127GXV41 <= AV72SD_OPEN_CRF_C.size() )
      {
         AV73SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)((SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)AV72SD_OPEN_CRF_C.elementAt(-1+AV127GXV41));
         /* Start For Each Line in Grid1 */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_59_fel_idx = (short)(0) ;
         while ( nGXsfl_59_fel_idx < nRC_Grid1 )
         {
            nGXsfl_59_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_59_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_59_fel_idx+1)) ;
            sGXsfl_59_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_fel_idx );
            edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_fel_idx ;
            AV76GXV1 = (short)(nGXsfl_59_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV76GXV1 = (short)(nGXsfl_59_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( AV26W_B712_SD01_SITE_LIST.size() >= AV76GXV1 )
            {
               Currentitem0 = (((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)));
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0131") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0131", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0131") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0131", "");
            }
            Currentitem0 = (((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)));
            if ( GXutil.strcmp(Currentitem0.getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id(), AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id()) == 0 )
            {
               Currentitem0.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_59_fel_idx == 0 )
         {
            nGXsfl_59_idx = (short)(1) ;
            sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
            edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
         }
         nGXsfl_59_fel_idx = (short)(1) ;
         /* Start For Each Line in Grid2 */
         nRC_Grid2 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid2"), ".", ",")) ;
         nGXsfl_88_fel_idx = (short)(0) ;
         while ( nGXsfl_88_fel_idx < nRC_Grid2 )
         {
            nGXsfl_88_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_fel_idx+1)) ;
            sGXsfl_88_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_fel_idx );
            edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_fel_idx ;
            AV79GXV4 = nGXsfl_88_fel_idx ;
            AV79GXV4 = nGXsfl_88_fel_idx ;
            if ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV79GXV4 )
            {
               Currentitem3 = (((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)));
               ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                  GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
               }
               else
               {
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
               }
            }
            Currentitem3 = (((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)));
            if ( Currentitem3.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id() )
            {
               Currentitem3.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_88_fel_idx == 0 )
         {
            nGXsfl_88_idx = (short)(1) ;
            sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
            edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
         }
         nGXsfl_88_fel_idx = (short)(1) ;
         /* Start For Each Line in Grid3 */
         nRC_Grid3 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid3"), ".", ",")) ;
         nGXsfl_102_fel_idx = (short)(0) ;
         while ( nGXsfl_102_fel_idx < nRC_Grid3 )
         {
            nGXsfl_102_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_102_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_102_fel_idx+1)) ;
            sGXsfl_102_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_fel_idx );
            edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_fel_idx ;
            edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_fel_idx ;
            AV82GXV7 = nGXsfl_102_fel_idx ;
            AV82GXV7 = nGXsfl_102_fel_idx ;
            if ( AV30W_B712_SD03_CRF_LIST.size() >= AV82GXV7 )
            {
               Currentitem2 = (((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)));
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg3.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                  GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
               }
               else
               {
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               }
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
            }
            Currentitem2 = (((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)));
            if ( Currentitem2.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id() )
            {
               Currentitem2.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_102_fel_idx == 0 )
         {
            nGXsfl_102_idx = (short)(1) ;
            sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
            edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
            edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
         }
         nGXsfl_102_fel_idx = (short)(1) ;
         if ( (GXutil.strcmp("", AV56W_OPEN_STUDY_ID)==0) )
         {
            AV56W_OPEN_STUDY_ID = "&STUDY_ID=" ;
         }
         else
         {
            AV56W_OPEN_STUDY_ID = AV56W_OPEN_STUDY_ID + "," ;
         }
         AV56W_OPEN_STUDY_ID = AV56W_OPEN_STUDY_ID + GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)) ;
         if ( (GXutil.strcmp("", AV57W_OPEN_SUBJECT_ID)==0) )
         {
            AV57W_OPEN_SUBJECT_ID = "&SUBJECT_ID=" ;
         }
         else
         {
            AV57W_OPEN_SUBJECT_ID = AV57W_OPEN_SUBJECT_ID + "," ;
         }
         AV57W_OPEN_SUBJECT_ID = AV57W_OPEN_SUBJECT_ID + GXutil.trim( GXutil.str( AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(), 6, 0)) ;
         if ( (GXutil.strcmp("", AV54W_OPEN_CRF_ID)==0) )
         {
            AV54W_OPEN_CRF_ID = "&CRFID=" ;
         }
         else
         {
            AV54W_OPEN_CRF_ID = AV54W_OPEN_CRF_ID + "," ;
         }
         AV54W_OPEN_CRF_ID = AV54W_OPEN_CRF_ID + GXutil.trim( GXutil.str( AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id(), 4, 0)) ;
         /* Using cursor H001G12 */
         pr_default.execute(10, new Object[] {new Long(AV20P_STUDY_ID), new Integer(AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id()), new Short(AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id())});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A294TBT02_CRF_ID = H001G12_A294TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            A293TBT02_SUBJECT_ID = H001G12_A293TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            A292TBT02_STUDY_ID = H001G12_A292TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            A370TBT02_CRF_LATEST_VERSION = H001G12_A370TBT02_CRF_LATEST_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
            n370TBT02_CRF_LATEST_VERSION = H001G12_n370TBT02_CRF_LATEST_VERSION[0] ;
            A302TBT02_UPD_CNT = H001G12_A302TBT02_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
            n302TBT02_UPD_CNT = H001G12_n302TBT02_UPD_CNT[0] ;
            A613TBT01_SITE_ID = H001G12_A613TBT01_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
            n613TBT01_SITE_ID = H001G12_n613TBT01_SITE_ID[0] ;
            A613TBT01_SITE_ID = H001G12_A613TBT01_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
            n613TBT01_SITE_ID = H001G12_n613TBT01_SITE_ID[0] ;
            if ( (GXutil.strcmp("", AV55W_OPEN_CRF_INPUT_LEVEL)==0) )
            {
               AV55W_OPEN_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" ;
            }
            else
            {
               AV55W_OPEN_CRF_INPUT_LEVEL = AV55W_OPEN_CRF_INPUT_LEVEL + "," ;
            }
            AV55W_OPEN_CRF_INPUT_LEVEL = AV55W_OPEN_CRF_INPUT_LEVEL + GXutil.trim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)) ;
            if ( (GXutil.strcmp("", AV58W_OPEN_UPD_CNT)==0) )
            {
               AV58W_OPEN_UPD_CNT = "&CRF_UPD_CNT=" ;
            }
            else
            {
               AV58W_OPEN_UPD_CNT = AV58W_OPEN_UPD_CNT + "," ;
            }
            AV58W_OPEN_UPD_CNT = AV58W_OPEN_UPD_CNT + GXutil.trim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)) ;
            AV73SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( A613TBT01_SITE_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
         new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV20P_STUDY_ID, AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(), AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
         AV127GXV41 = (int)(AV127GXV41+1) ;
      }
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV60W_SESSION.setValue("B712_WP02_STUDY_ID", GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
      AV60W_SESSION.setValue("B712_WP02_AUTH_CD", AV18P_AUTH_CD);
      GXt_char2 = AV61W_SESSION_KEY ;
      GXv_char3[0] = GXt_char2 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char3) ;
      b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      AV61W_SESSION_KEY = GXt_char2 ;
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( GXutil.today( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( GXutil.now( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( AV18P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV60W_SESSION.setValue(AV61W_SESSION_KEY, AV21SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, "B792_SD00_HTML5_EXEC_INFO", "SmartEDC_SHIZUOKA"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_OL_DISP", "4");
      GXt_char2 = AV61W_SESSION_KEY ;
      GXv_char3[0] = GXt_char2 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char3) ;
      b712_wp01_search_crf_impl.this.GXt_char2 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      AV61W_SESSION_KEY = GXt_char2 ;
      AV60W_SESSION.remove(AV61W_SESSION_KEY);
      AV71W_URL = AV44W_HTTPREQUEST.getBaseURL() ;
      AV71W_URL = GXutil.strReplace( AV71W_URL, "servlet/", "") ;
      AV71W_URL = AV71W_URL + "static/b701_wp01_crf_inp.jsp?" ;
      AV71W_URL = AV71W_URL + AV56W_OPEN_STUDY_ID ;
      AV71W_URL = AV71W_URL + AV57W_OPEN_SUBJECT_ID ;
      AV71W_URL = AV71W_URL + AV54W_OPEN_CRF_ID ;
      AV71W_URL = AV71W_URL + AV55W_OPEN_CRF_INPUT_LEVEL ;
      AV71W_URL = AV71W_URL + AV58W_OPEN_UPD_CNT ;
      httpContext.wjLoc = formatLink(AV71W_URL)  ;
   }

   public void S162( )
   {
      /* 'SUB_MEMO_POPUP' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13H_AUTO_SENI_FLG)) ;
      httpContext.popup(formatLink("b719_wp01_memo_info") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV13H_AUTO_SENI_FLG"});
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV22W_A_LOGIN_SDT;
      GXv_char3[0] = AV42W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b712_wp01_search_crf_impl.this.AV42W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV42W_ERRCD, "0") != 0 )
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

   public void S241029( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV118Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_wp01_search_crf");
   }

   private void e241G6( )
   {
      /* Grid2_Load Routine */
      AV79GXV4 = (short)(1) ;
      while ( AV79GXV4 <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         Currentitem3 = ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B712_SD02_SUBJECT_LIST", AV28W_B712_SD02_SUBJECT_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(88) ;
         }
         sendrow_886( ) ;
         AV79GXV4 = (short)(AV79GXV4+1) ;
      }
   }

   private void e231G7( )
   {
      /* Grid3_Load Routine */
      AV82GXV7 = (short)(1) ;
      while ( AV82GXV7 <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         Currentitem2 = ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30W_B712_SD03_CRF_LIST", AV30W_B712_SD03_CRF_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(102) ;
         }
         sendrow_1027( ) ;
         AV82GXV7 = (short)(AV82GXV7+1) ;
      }
   }

   private void e221G8( )
   {
      /* Grid4_Load Routine */
      AV86GXV11 = (short)(1) ;
      while ( AV86GXV11 <= AV32W_B712_SD04_KANI_LIST.size() )
      {
         Currentitem1 = ( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32W_B712_SD04_KANI_LIST", AV32W_B712_SD04_KANI_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(121) ;
         }
         sendrow_1218( ) ;
         AV86GXV11 = (short)(AV86GXV11+1) ;
      }
   }

   public void wb_table2_133_1G2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_delete_subject_exec_Internalname, "TXT_BTN_DELETE_SUBJECT_EXEC", "", "", lblTxt_btn_delete_subject_exec_Jsonclick, "E\\'BTN_DELETE_SUBJECT_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(1), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(138);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_FLG", AV16H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV16H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV16H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_sentaku_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_SUBJECT_ID_SENTAKU, (byte)(6), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_SUBJECT_ID_SENTAKU), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_SUBJECT_ID_SENTAKU), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(140);\"", "", "", "", "", edtavH_subject_id_sentaku_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavP_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV20P_STUDY_ID, (byte)(10), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV20P_STUDY_ID), "ZZZZZZZZZ9"), "", "", "", "", "", edtavP_study_id_Jsonclick, 0, ClassString, StyleString, "", 1, 0, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavP_auth_cd_Internalname, GXutil.rtrim( AV18P_AUTH_CD), GXutil.rtrim( localUtil.format( AV18P_AUTH_CD, "")), "", "", "", "", "", edtavP_auth_cd_Jsonclick, 0, ClassString, StyleString, "", 1, 0, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavP_move_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV19P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV19P_MOVE_KBN), "9"), "", "", "", "", "", edtavP_move_kbn_Jsonclick, 0, ClassString, StyleString, "", 1, 0, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV59W_OTHER_SITE_VIEW_FLG", AV59W_OTHER_SITE_VIEW_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_other_site_view_flg_Internalname, GXutil.rtrim( AV59W_OTHER_SITE_VIEW_FLG), GXutil.rtrim( localUtil.format( AV59W_OTHER_SITE_VIEW_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "", "", "", "", edtavW_other_site_view_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV65W_TBM01_SYS_VALUE", AV65W_TBM01_SYS_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_tbm01_sys_value_Internalname, GXutil.rtrim( AV65W_TBM01_SYS_VALUE), GXutil.rtrim( localUtil.format( AV65W_TBM01_SYS_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(145);\"", "", "", "", "", edtavW_tbm01_sys_value_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV39W_DM_KBN", AV39W_DM_KBN);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_dm_kbn_Internalname, GXutil.rtrim( AV39W_DM_KBN), GXutil.rtrim( localUtil.format( AV39W_DM_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(146);\"", "", "", "", "", edtavW_dm_kbn_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_err_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_POPUP_ERR_CD, (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_POPUP_ERR_CD), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV15H_POPUP_ERR_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(147);\"", "", "", "", "", edtavH_popup_err_cd_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_AUTO_SENI_FLG", AV13H_AUTO_SENI_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_auto_seni_flg_Internalname, GXutil.rtrim( AV13H_AUTO_SENI_FLG), GXutil.rtrim( localUtil.format( AV13H_AUTO_SENI_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(148);\"", "", "", "", "", edtavH_auto_seni_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</p>") ;
         wb_table3_149_1G2( true) ;
      }
      else
      {
         wb_table3_149_1G2( false) ;
      }
      return  ;
   }

   public void wb_table3_149_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_133_1G2e( true) ;
      }
      else
      {
         wb_table2_133_1G2e( false) ;
      }
   }

   public void wb_table3_149_1G2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(154);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "REC_CNT", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(159);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "PAGE_KBN", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(169);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(174);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(179);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(184);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(189);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(194);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(199);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(204);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(209);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "PAGE09", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(214);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE10", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(219);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE_DISP01", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(224);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "PAGE_DISP02", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(229);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP03", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(234);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "PAGE_DISP04", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(239);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP05", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(244);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP06", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(249);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP07", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(254);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP08", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(259);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP09", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(264);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP10", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(269);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(274);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(279);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(284);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_149_1G2e( true) ;
      }
      else
      {
         wb_table3_149_1G2e( false) ;
      }
   }

   public void wb_table1_2_1G2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:100%\">") ;
         wb_table4_6_1G2( true) ;
      }
      else
      {
         wb_table4_6_1G2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1G2e( boolean wbgen )
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
         wb_table1_2_1G2e( true) ;
      }
      else
      {
         wb_table1_2_1G2e( false) ;
      }
   }

   public void wb_table4_6_1G2( boolean wbgen )
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
         wb_table5_12_1G2( true) ;
      }
      else
      {
         wb_table5_12_1G2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table6_28_1G2( true) ;
      }
      else
      {
         wb_table6_28_1G2( false) ;
      }
      return  ;
   }

   public void wb_table6_28_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0131"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0131"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0131"+"");
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
         wb_table4_6_1G2e( true) ;
      }
      else
      {
         wb_table4_6_1G2e( false) ;
      }
   }

   public void wb_table6_28_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_31_1G2( true) ;
      }
      else
      {
         wb_table7_31_1G2( false) ;
      }
      return  ;
   }

   public void wb_table7_31_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_28_1G2e( true) ;
      }
      else
      {
         wb_table6_28_1G2e( false) ;
      }
   }

   public void wb_table7_31_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_37_1G2( true) ;
      }
      else
      {
         wb_table8_37_1G2( false) ;
      }
      return  ;
   }

   public void wb_table8_37_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:46px\">") ;
         wb_table9_50_1G2( true) ;
      }
      else
      {
         wb_table9_50_1G2( false) ;
      }
      return  ;
   }

   public void wb_table9_50_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_31_1G2e( true) ;
      }
      else
      {
         wb_table7_31_1G2e( false) ;
      }
   }

   public void wb_table9_50_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"width:180px\">") ;
         wb_table10_53_1G2( true) ;
      }
      else
      {
         wb_table10_53_1G2( false) ;
      }
      return  ;
   }

   public void wb_table10_53_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"59\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
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
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 100, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltam08_site_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 59 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_59_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            AV76GXV1 = nGXsfl_59_idx ;
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
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table11_67_1G2( true) ;
      }
      else
      {
         wb_table11_67_1G2( false) ;
      }
      return  ;
   }

   public void wb_table11_67_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"width:260px\">") ;
         wb_table12_96_1G2( true) ;
      }
      else
      {
         wb_table12_96_1G2( false) ;
      }
      return  ;
   }

   public void wb_table12_96_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "<div style=\"HEIGHT: 444px; WIDTH: 248px\" class=\"SectionScroll_NoLineY\" id=\"Section1\">") ;
         /*  Grid Control  */
         Grid3Container.SetIsFreestyle(true);
         Grid3Container.SetWrapped(nGXWrapped);
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" gxgridid=\"102\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid3Container.AddObjectProperty("GridName", "Grid3");
         }
         else
         {
            Grid3Container.AddObjectProperty("GridName", "Grid3");
            Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid3Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("CmpContext", "");
            Grid3Container.AddObjectProperty("InMasterPage", "false");
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Container.AddObjectProperty("Allowselection", "true");
            Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowhover", "true");
            Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowcollapsing", ((subGrid3_Allowcollapsing==1) ? "true" : "false"));
            Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 102 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid3 = (short)(nGXsfl_102_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV82GXV7 = nGXsfl_102_idx ;
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:7px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table13_116_1G2( true) ;
      }
      else
      {
         wb_table13_116_1G2( false) ;
      }
      return  ;
   }

   public void wb_table13_116_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid4Container.SetIsFreestyle(true);
         Grid4Container.SetWrapped(nGXWrapped);
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid4Container"+"DivS\" gxgridid=\"121\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid4_Internalname, subGrid4_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid4Container.AddObjectProperty("GridName", "Grid4");
         }
         else
         {
            Grid4Container.AddObjectProperty("GridName", "Grid4");
            Grid4Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid4Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid4_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("CmpContext", "");
            Grid4Container.AddObjectProperty("InMasterPage", "false");
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltas01_item_ryak_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Container.AddObjectProperty("Allowselection", "true");
            Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowhover", "true");
            Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowcollapsing", ((subGrid4_Allowcollapsing==1) ? "true" : "false"));
            Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 121 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid4 = (short)(nGXsfl_121_idx-1) ;
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV86GXV11 = nGXsfl_121_idx ;
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
         wb_table9_50_1G2e( true) ;
      }
      else
      {
         wb_table9_50_1G2e( false) ;
      }
   }

   public void wb_table13_116_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header4_Internalname, tblTbl_grid_header4_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:24px;width:32px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:250px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "ä»à’åüçı", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_116_1G2e( true) ;
      }
      else
      {
         wb_table13_116_1G2e( false) ;
      }
   }

   public void wb_table12_96_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header3_Internalname, tblTbl_grid_header3_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", GXutil.booltostr( AV9D_GRD3_ALL_SEL_FLG));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd3_all_sel_flg.getInternalname(), GXutil.booltostr( AV9D_GRD3_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(99, this, 'true', 'false');gx.ajax.executeCliEvent('e131g2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(99);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:190px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "CRF", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_96_1G2e( true) ;
      }
      else
      {
         wb_table12_96_1G2e( false) ;
      }
   }

   public void wb_table11_67_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_70_1G2( true) ;
      }
      else
      {
         wb_table14_70_1G2( false) ;
      }
      return  ;
   }

   public void wb_table14_70_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_78_1G2( true) ;
      }
      else
      {
         wb_table15_78_1G2( false) ;
      }
      return  ;
   }

   public void wb_table15_78_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:26px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         httpContext.writeText( "<div style=\"HEIGHT: 394px; WIDTH: 165px\" class=\"SectionScroll_NoLineY\" id=\"Section2\">") ;
         /*  Grid Control  */
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"88\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleGridTM0s", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM0s"));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid2Container.AddObjectProperty("Class", "FreeStyleGridTM0s");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcoloreven", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcoloreven, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt01_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", "true");
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", "true");
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", ((subGrid2_Allowcollapsing==1) ? "true" : "false"));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 88 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid2 = (short)(nGXsfl_88_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV79GXV4 = nGXsfl_88_idx ;
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_67_1G2e( true) ;
      }
      else
      {
         wb_table11_67_1G2e( false) ;
      }
   }

   public void wb_table15_78_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 24, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 150, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "ä≥é“IDéwíË", "", "", lblTextblock28_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.rtrim( AV11D_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV11D_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtavD_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 75, "px", 16, "px", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_78_1G2e( true) ;
      }
      else
      {
         wb_table15_78_1G2e( false) ;
      }
   }

   public void wb_table14_70_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header2_Internalname, tblTbl_grid_header2_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_GRD2_ALL_SEL_FLG", GXutil.booltostr( AV8D_GRD2_ALL_SEL_FLG));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd2_all_sel_flg.getInternalname(), GXutil.booltostr( AV8D_GRD2_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(73, this, 'true', 'false');gx.ajax.executeCliEvent('e121g2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(73);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:110px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ä≥é“No", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_70_1G2e( true) ;
      }
      else
      {
         wb_table14_70_1G2e( false) ;
      }
   }

   public void wb_table10_53_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd1_all_sel_flg.getInternalname(), GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(56, this, 'true', 'false');gx.ajax.executeCliEvent('e111g2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(56);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "é{ê›", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_53_1G2e( true) ;
      }
      else
      {
         wb_table10_53_1G2e( false) ;
      }
   }

   public void wb_table8_37_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableForm_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_kensaku_Internalname, "åüçı", "", "", lblBtn_kensaku_Jsonclick, "E\\'BTN_SRCH\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:180px\">") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_sort, cmbavD_sort.getInternalname(), AV10D_SORT, 1, cmbavD_sort.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "", true, "HLP_B712_WP01_SEARCH_CRF.htm");
         cmbavD_sort.setValue( AV10D_SORT );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_sort.getInternalname(), "Values", cmbavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_37_1G2e( true) ;
      }
      else
      {
         wb_table8_37_1G2e( false) ;
      }
   }

   public void wb_table5_12_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_15_1G2( true) ;
      }
      else
      {
         wb_table16_15_1G2( false) ;
      }
      return  ;
   }

   public void wb_table16_15_1G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_memo_Internalname, "ÉÅÉÇèÓïÒ", "", "", lblBtn_memo_Jsonclick, "E\\'BTN_MEMO\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1G2e( true) ;
      }
      else
      {
         wb_table5_12_1G2e( false) ;
      }
   }

   public void wb_table16_15_1G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_btn_subject_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_btn_subject_Internalname, tblTbl_btn_subject_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_new_subject_Internalname, "ä≥é“êVãK", "", "", lblBtn_new_subject_Jsonclick, "E\\'BTN_NEW_SUBJECT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_delete_subject_Internalname, "ä≥é“çÌèú", "", "", lblBtn_delete_subject_Jsonclick, "E\\'BTN_DELETE_SUBJECT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_15_1G2e( true) ;
      }
      else
      {
         wb_table16_15_1G2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV20P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
      AV18P_AUTH_CD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
      AV19P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
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
      pa1G2( ) ;
      ws1G2( ) ;
      we1G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1561592");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b712_wp01_search_crf.js", "?1561593");
      /* End function include_jscripts */
   }

   public void sendrow_592( )
   {
      wb1G0( ) ;
      if ( ( 0 * 1 == 0 ) || ( nGXsfl_59_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_59_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_59_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_59_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_59_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_59_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:30px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavCtlsel_flg1.getInternalname(),GXutil.booltostr( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(62, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(62);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltam08_site_snm_Internalname,GXutil.rtrim( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV76GXV1)).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm()),"","","","","","",edtavCtltam08_site_snm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltam08_site_snm_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
               if ( ((int)(nGXsfl_59_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_59_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_59_idx+1)) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_59_idx );
         edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_59_idx ;
      }
      /* End function sendrow_592 */
   }

   public void sendrow_886( )
   {
      wb1G0( ) ;
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
         if ( ((int)(nGXsfl_88_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid2_Backcolor = (int)(0xF5F5F5) ;
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
         if ( ( 1 == 0 ) && ( nGXsfl_88_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_88_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_88_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_88_idx+"\">") ;
            }
         }
      }
      Grid2Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:30px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 91,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavCtlsel_flg2.getInternalname(),GXutil.booltostr( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(91, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(91);\"" : " ")});
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("cell");
      }
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:110px\""});
      /* Single line edit */
      ClassString = "Attribute_s" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbt01_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), (byte)(6), (byte)(0), ".", "")),((edtavCtltbt01_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id()), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV79GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id()), "ZZZZZ9")),"","","","","",edtavCtltbt01_subject_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbt01_subject_id_Enabled),new Integer(0),new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(1),new Boolean(true),"right"});
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
            if ( ((int)(nGXsfl_88_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_88_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_idx+1)) ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_88_idx );
      edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_88_idx ;
      /* End function sendrow_886 */
   }

   public void sendrow_1027( )
   {
      wb1G0( ) ;
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
         if ( ((int)(nGXsfl_102_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid3_Backcolor = (int)(0xF5F5F5) ;
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
         if ( ( 1 == 0 ) && ( nGXsfl_102_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_102_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_102_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_102_idx+"\">") ;
            }
         }
      }
      Grid3Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid3_Linesclass,""});
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:30px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlsel_flg3.getEnabled()!=0)&&(chkavCtlsel_flg3.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_102_idx+"',102)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid3Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavCtlsel_flg3.getInternalname(),GXutil.booltostr( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavCtlsel_flg3.getEnabled()!=0)&&(chkavCtlsel_flg3.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(105, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg3.getEnabled()!=0)&&(chkavCtlsel_flg3.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(105);\"" : " ")});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:190px\""});
      /* Table start */
      Grid3Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTable8_Internalname+"_"+sGXsfl_102_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
      Grid3Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ClassString = "Attribute_s" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbm31_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()), "ZZZ9")),"","","","","",edtavCtltbm31_crf_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbm31_crf_id_Enabled),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(102),new Integer(1),new Integer(1),new Boolean(true),"right"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:2px\""});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ClassString = "Attribute_s" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid3Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_snm_Internalname,GXutil.rtrim( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV82GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm()),"","","","","","",edtavCtltbm31_crf_snm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbm31_crf_snm_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(102),new Integer(1),new Integer(1),new Boolean(true),"left"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("row");
      }
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("table");
      }
      /* End of table */
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
            if ( ((int)(nGXsfl_102_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid3Container.AddRow(Grid3Row);
      nGXsfl_102_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_102_idx+1)) ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_102_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg3.setInternalname( "CTLSEL_FLG3_"+sGXsfl_102_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_102_idx ;
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_102_idx ;
      /* End function sendrow_1027 */
   }

   public void sendrow_1218( )
   {
      wb1G0( ) ;
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
         if ( ((int)(nGXsfl_121_idx/ (double) (1)) % (2)) == 0 )
         {
            subGrid4_Backcolor = (int)(0xF5F5F5) ;
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
         if ( ( 1 == 0 ) && ( nGXsfl_121_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_121_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_121_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_121_idx+"\">") ;
            }
         }
      }
      Grid4Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid4_Linesclass,""});
      Grid4Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:32px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 124,'',false,'"+sGXsfl_121_idx+"',121)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid4Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavCtlsel_flg4.getInternalname(),GXutil.booltostr( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(124, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(124);\"" : " ")});
      if ( Grid4Container.GetWrapped() == 1 )
      {
         Grid4Container.CloseTag("cell");
      }
      Grid4Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:250px\""});
      /* Single line edit */
      ClassString = "Attribute_s" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid4Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltas01_item_ryak_Internalname,GXutil.rtrim( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV86GXV11)).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak()),"","","","","","",edtavCtltas01_item_ryak_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltas01_item_ryak_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(121),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
            if ( ((int)(nGXsfl_121_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid4Container.AddRow(Grid4Row);
      nGXsfl_121_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_121_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_121_idx+1)) ;
      sGXsfl_121_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_121_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_121_idx );
      edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_121_idx ;
      /* End function sendrow_1218 */
   }

   public void init_default_properties( )
   {
      lblBtn_new_subject_Internalname = "BTN_NEW_SUBJECT" ;
      lblBtn_delete_subject_Internalname = "BTN_DELETE_SUBJECT" ;
      tblTbl_btn_subject_Internalname = "TBL_BTN_SUBJECT" ;
      lblBtn_memo_Internalname = "BTN_MEMO" ;
      tblTable10_Internalname = "TABLE10" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblBtn_kensaku_Internalname = "BTN_KENSAKU" ;
      cmbavD_sort.setInternalname( "vD_SORT" );
      tblTable6_Internalname = "TABLE6" ;
      chkavD_grd1_all_sel_flg.setInternalname( "vD_GRD1_ALL_SEL_FLG" );
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      chkavD_grd2_all_sel_flg.setInternalname( "vD_GRD2_ALL_SEL_FLG" );
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTbl_grid_header2_Internalname = "TBL_GRID_HEADER2" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      tblTable11_Internalname = "TABLE11" ;
      tblTable9_Internalname = "TABLE9" ;
      chkavD_grd3_all_sel_flg.setInternalname( "vD_GRD3_ALL_SEL_FLG" );
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      tblTbl_grid_header3_Internalname = "TBL_GRID_HEADER3" ;
      tblTable8_Internalname = "TABLE8" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTbl_grid_header4_Internalname = "TBL_GRID_HEADER4" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_delete_subject_exec_Internalname = "TXT_BTN_DELETE_SUBJECT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_subject_id_sentaku_Internalname = "vH_SUBJECT_ID_SENTAKU" ;
      edtavP_study_id_Internalname = "vP_STUDY_ID" ;
      edtavP_auth_cd_Internalname = "vP_AUTH_CD" ;
      edtavP_move_kbn_Internalname = "vP_MOVE_KBN" ;
      edtavW_other_site_view_flg_Internalname = "vW_OTHER_SITE_VIEW_FLG" ;
      edtavW_tbm01_sys_value_Internalname = "vW_TBM01_SYS_VALUE" ;
      edtavW_dm_kbn_Internalname = "vW_DM_KBN" ;
      edtavH_popup_err_cd_Internalname = "vH_POPUP_ERR_CD" ;
      edtavH_auto_seni_flg_Internalname = "vH_AUTO_SENI_FLG" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
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
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
      subGrid3_Internalname = "GRID3" ;
      subGrid4_Internalname = "GRID4" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtltas01_item_ryak_Jsonclick = "" ;
      chkavCtlsel_flg4.setVisible( 1 );
      chkavCtlsel_flg4.setEnabled( 1 );
      subGrid4_Class = "FreeStyleGridTM-1s" ;
      edtavCtltbm31_crf_snm_Jsonclick = "" ;
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      chkavCtlsel_flg3.setVisible( 1 );
      chkavCtlsel_flg3.setEnabled( 1 );
      subGrid3_Class = "FreeStyleGridTM-1s" ;
      edtavCtltbt01_subject_id_Jsonclick = "" ;
      chkavCtlsel_flg2.setVisible( 1 );
      chkavCtlsel_flg2.setEnabled( 1 );
      subGrid2_Class = "FreeStyleGridTM0s" ;
      edtavCtltam08_site_snm_Jsonclick = "" ;
      chkavCtlsel_flg1.setVisible( 1 );
      chkavCtlsel_flg1.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      cmbavD_sort.setJsonclick( "" );
      edtavD_subject_id_Jsonclick = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcoloreven = (int)(0xF5F5F5) ;
      subGrid2_Backcolorstyle = (byte)(3) ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      subGrid4_Borderwidth = (short)(0) ;
      subGrid4_Backcolorstyle = (byte)(3) ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      subGrid3_Borderwidth = (short)(0) ;
      subGrid3_Backcolorstyle = (byte)(3) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltam08_site_snm_Enabled = 0 ;
      subGrid1_Width = 100 ;
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
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_auto_seni_flg_Jsonclick = "" ;
      edtavH_popup_err_cd_Jsonclick = "" ;
      edtavW_dm_kbn_Jsonclick = "" ;
      edtavW_tbm01_sys_value_Jsonclick = "" ;
      edtavW_other_site_view_flg_Jsonclick = "" ;
      edtavP_move_kbn_Jsonclick = "" ;
      edtavP_auth_cd_Jsonclick = "" ;
      edtavP_study_id_Jsonclick = "" ;
      edtavH_subject_id_sentaku_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_btn_subject_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      chkavD_grd3_all_sel_flg.setCaption( "" );
      chkavD_grd2_all_sel_flg.setCaption( "" );
      chkavD_grd1_all_sel_flg.setCaption( "" );
      subGrid1_Rows = (short)(0) ;
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
                  /* Execute user subroutine: S241029 */
                  S241029 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV18P_AUTH_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV18P_AUTH_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV26W_B712_SD01_SITE_LIST = new GxObjectCollection(SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem.class, "B712_SD01_SITE_LIST.B712_SD01_SITE_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV12H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV32W_B712_SD04_KANI_LIST = new GxObjectCollection(SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem.class, "B712_SD04_KANI_LIST.B712_SD04_KANI_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV30W_B712_SD03_CRF_LIST = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV28W_B712_SD02_SUBJECT_LIST = new GxObjectCollection(SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem.class, "B712_SD02_SUBJECT_LIST.B712_SD02_SUBJECT_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
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
      edtavCtltam08_site_snm_Internalname = "" ;
      Currentitem0 = new SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem(remoteHandle, context);
      edtavCtltas01_item_ryak_Internalname = "" ;
      Currentitem1 = new SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem(remoteHandle, context);
      edtavCtltbm31_crf_id_Internalname = "" ;
      edtavCtltbm31_crf_snm_Internalname = "" ;
      Currentitem2 = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      edtavCtltbt01_subject_id_Internalname = "" ;
      Currentitem3 = new SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem(remoteHandle, context);
      GXDecQS = "" ;
      AV10D_SORT = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      AV118Pgmname = "" ;
      AV115Pgmdesc = "" ;
      AV11D_SUBJECT_ID = "" ;
      AV14H_INIT_FLG = "" ;
      AV16H_SRCH_FLG = "" ;
      AV59W_OTHER_SITE_VIEW_FLG = "" ;
      AV65W_TBM01_SYS_VALUE = "" ;
      AV39W_DM_KBN = "" ;
      AV13H_AUTO_SENI_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      scmdbuf = "" ;
      H001G2_A186TBM21_STUDY_ID = new long[1] ;
      H001G2_A187TBM21_STUDY_NM = new String[] {""} ;
      H001G2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      AV62W_STUDY_NM = "" ;
      H001G3_A17TAM04_AUTH_CD = new String[] {""} ;
      H001G3_A98TAM04_AUTH_NM = new String[] {""} ;
      H001G3_n98TAM04_AUTH_NM = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      A98TAM04_AUTH_NM = "" ;
      AV25W_AUTH_NM = "" ;
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV52W_MEMO_DISP_FLG = "" ;
      H001G4_A330TBT14_SUBJECT_ID = new int[1] ;
      H001G4_A922TBT14_MEMO_NO = new short[1] ;
      H001G4_A337TBT14_DEL_FLG = new String[] {""} ;
      H001G4_n337TBT14_DEL_FLG = new boolean[] {false} ;
      H001G4_A924TBT14_KANRYO_FLG = new String[] {""} ;
      H001G4_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001G4_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001G4_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001G4_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001G4_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      H001G4_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      H001G4_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      H001G4_A329TBT14_STUDY_ID = new long[1] ;
      A337TBT14_DEL_FLG = "" ;
      A924TBT14_KANRYO_FLG = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      AV53W_MSG = "" ;
      AV24W_A821_JS = "" ;
      AV41W_ERR_MSG = "" ;
      AV60W_SESSION = httpContext.getWebSession();
      H001G5_A534TBM07_DEL_FLG = new String[] {""} ;
      H001G5_n534TBM07_DEL_FLG = new boolean[] {false} ;
      H001G5_A530TBM07_AUTH_CD = new String[] {""} ;
      H001G5_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      H001G5_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      A534TBM07_DEL_FLG = "" ;
      A530TBM07_AUTH_CD = "" ;
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A198TBM22_SITE_ID = "" ;
      A199TBM22_DEL_FLG = "" ;
      H001G6_A199TBM22_DEL_FLG = new String[] {""} ;
      H001G6_n199TBM22_DEL_FLG = new boolean[] {false} ;
      H001G6_A198TBM22_SITE_ID = new String[] {""} ;
      H001G6_A197TBM22_STUDY_ID = new long[1] ;
      H001G6_A134TAM08_SITE_SNM = new String[] {""} ;
      H001G6_n134TAM08_SITE_SNM = new boolean[] {false} ;
      A134TAM08_SITE_SNM = "" ;
      AV27W_B712_SD01_SITE_LIST_Item = new SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem(remoteHandle, context);
      AV34W_B712_SD05_SEL1 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV66W_TBM22_SITE_ID = "" ;
      A551TBM31_STATUS = "" ;
      A223TBM31_DEL_FLG = "" ;
      H001G7_A217TBM31_STUDY_ID = new long[1] ;
      H001G7_A223TBM31_DEL_FLG = new String[] {""} ;
      H001G7_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001G7_A551TBM31_STATUS = new String[] {""} ;
      H001G7_n551TBM31_STATUS = new boolean[] {false} ;
      H001G7_A218TBM31_CRF_ID = new short[1] ;
      H001G7_A550TBM31_CRF_SNM = new String[] {""} ;
      H001G7_n550TBM31_CRF_SNM = new boolean[] {false} ;
      H001G7_A221TBM31_ORDER = new int[1] ;
      H001G7_n221TBM31_ORDER = new boolean[] {false} ;
      A550TBM31_CRF_SNM = "" ;
      AV31W_B712_SD03_CRF_LIST_Item = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      AV36W_B712_SD05_SEL3 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      H001G8_A54TAS01_DATA_KIND = new String[] {""} ;
      H001G8_A113TAS01_DEL_FLG = new String[] {""} ;
      H001G8_n113TAS01_DEL_FLG = new boolean[] {false} ;
      H001G8_A55TAS01_ITEM_CD = new String[] {""} ;
      H001G8_A53TAS01_ITEM_RYAK = new String[] {""} ;
      H001G8_n53TAS01_ITEM_RYAK = new boolean[] {false} ;
      H001G8_A149TAS01_SORT_NO = new short[1] ;
      H001G8_n149TAS01_SORT_NO = new boolean[] {false} ;
      A54TAS01_DATA_KIND = "" ;
      A113TAS01_DEL_FLG = "" ;
      A55TAS01_ITEM_CD = "" ;
      A53TAS01_ITEM_RYAK = "" ;
      AV33W_B712_SD04_KANI_LIST_Item = new SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem(remoteHandle, context);
      AV37W_B712_SD05_SEL4 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV35W_B712_SD05_SEL2 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      H001G9_A284TBT01_DEL_FLG = new String[] {""} ;
      H001G9_n284TBT01_DEL_FLG = new boolean[] {false} ;
      H001G9_A613TBT01_SITE_ID = new String[] {""} ;
      H001G9_n613TBT01_SITE_ID = new boolean[] {false} ;
      H001G9_A282TBT01_STUDY_ID = new long[1] ;
      H001G9_A283TBT01_SUBJECT_ID = new int[1] ;
      A284TBT01_DEL_FLG = "" ;
      A613TBT01_SITE_ID = "" ;
      AV29W_B712_SD02_SUBJECT_LIST_Item = new SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem(remoteHandle, context);
      H001G10_A463TBM34_DEL_FLG = new String[] {""} ;
      H001G10_n463TBM34_DEL_FLG = new boolean[] {false} ;
      H001G10_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      H001G10_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      H001G10_A460TBM34_CRF_ID = new short[1] ;
      H001G10_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H001G10_A459TBM34_STUDY_ID = new long[1] ;
      A463TBM34_DEL_FLG = "" ;
      A462TBM34_DISPLAY_FLG = "" ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      H001G11_A189TBM21_DEL_FLG = new String[] {""} ;
      H001G11_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001G11_A186TBM21_STUDY_ID = new long[1] ;
      H001G11_A513TBM21_STATUS = new String[] {""} ;
      H001G11_n513TBM21_STATUS = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      AV64W_SUBJECT_ID_GET = "" ;
      GXv_int4 = new byte [1] ;
      AV72SD_OPEN_CRF_C = new GxObjectCollection(SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem.class, "B719_SD02_OPEN_CRF.B719_SD02_OPEN_CRFItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV56W_OPEN_STUDY_ID = "" ;
      AV57W_OPEN_SUBJECT_ID = "" ;
      AV54W_OPEN_CRF_ID = "" ;
      AV55W_OPEN_CRF_INPUT_LEVEL = "" ;
      AV58W_OPEN_UPD_CNT = "" ;
      AV73SD_OPEN_CRF_I = new SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem(remoteHandle, context);
      H001G12_A294TBT02_CRF_ID = new short[1] ;
      H001G12_A293TBT02_SUBJECT_ID = new int[1] ;
      H001G12_A292TBT02_STUDY_ID = new long[1] ;
      H001G12_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001G12_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      H001G12_A302TBT02_UPD_CNT = new long[1] ;
      H001G12_n302TBT02_UPD_CNT = new boolean[] {false} ;
      H001G12_A613TBT01_SITE_ID = new String[] {""} ;
      H001G12_n613TBT01_SITE_ID = new boolean[] {false} ;
      AV61W_SESSION_KEY = "" ;
      AV21SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV71W_URL = "" ;
      AV44W_HTTPREQUEST = httpContext.getHttpRequest();
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV42W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_delete_subject_exec_Jsonclick = "" ;
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
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock33_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock28_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblBtn_kensaku_Jsonclick = "" ;
      lblBtn_memo_Jsonclick = "" ;
      lblBtn_new_subject_Jsonclick = "" ;
      lblBtn_delete_subject_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp01_search_crf__default(),
         new Object[] {
             new Object[] {
            H001G2_A186TBM21_STUDY_ID, H001G2_A187TBM21_STUDY_NM, H001G2_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H001G3_A17TAM04_AUTH_CD, H001G3_A98TAM04_AUTH_NM, H001G3_n98TAM04_AUTH_NM
            }
            , new Object[] {
            H001G4_A330TBT14_SUBJECT_ID, H001G4_A922TBT14_MEMO_NO, H001G4_A337TBT14_DEL_FLG, H001G4_n337TBT14_DEL_FLG, H001G4_A924TBT14_KANRYO_FLG, H001G4_n924TBT14_KANRYO_FLG, H001G4_A927TBT14_KAKUNIN_FLG, H001G4_n927TBT14_KAKUNIN_FLG, H001G4_A929TBT14_REQUEST_AUTH_CD, H001G4_n929TBT14_REQUEST_AUTH_CD,
            H001G4_A928TBT14_REQUEST_SITE_ID, H001G4_n928TBT14_REQUEST_SITE_ID, H001G4_A329TBT14_STUDY_ID
            }
            , new Object[] {
            H001G5_A534TBM07_DEL_FLG, H001G5_n534TBM07_DEL_FLG, H001G5_A530TBM07_AUTH_CD, H001G5_A533TBM07_OTHER_SITE_VIEW_FLG, H001G5_n533TBM07_OTHER_SITE_VIEW_FLG
            }
            , new Object[] {
            H001G6_A199TBM22_DEL_FLG, H001G6_n199TBM22_DEL_FLG, H001G6_A198TBM22_SITE_ID, H001G6_A197TBM22_STUDY_ID, H001G6_A134TAM08_SITE_SNM, H001G6_n134TAM08_SITE_SNM
            }
            , new Object[] {
            H001G7_A217TBM31_STUDY_ID, H001G7_A223TBM31_DEL_FLG, H001G7_n223TBM31_DEL_FLG, H001G7_A551TBM31_STATUS, H001G7_n551TBM31_STATUS, H001G7_A218TBM31_CRF_ID, H001G7_A550TBM31_CRF_SNM, H001G7_n550TBM31_CRF_SNM, H001G7_A221TBM31_ORDER, H001G7_n221TBM31_ORDER
            }
            , new Object[] {
            H001G8_A54TAS01_DATA_KIND, H001G8_A113TAS01_DEL_FLG, H001G8_n113TAS01_DEL_FLG, H001G8_A55TAS01_ITEM_CD, H001G8_A53TAS01_ITEM_RYAK, H001G8_n53TAS01_ITEM_RYAK, H001G8_A149TAS01_SORT_NO, H001G8_n149TAS01_SORT_NO
            }
            , new Object[] {
            H001G9_A284TBT01_DEL_FLG, H001G9_n284TBT01_DEL_FLG, H001G9_A613TBT01_SITE_ID, H001G9_n613TBT01_SITE_ID, H001G9_A282TBT01_STUDY_ID, H001G9_A283TBT01_SUBJECT_ID
            }
            , new Object[] {
            H001G10_A463TBM34_DEL_FLG, H001G10_n463TBM34_DEL_FLG, H001G10_A462TBM34_DISPLAY_FLG, H001G10_n462TBM34_DISPLAY_FLG, H001G10_A460TBM34_CRF_ID, H001G10_A461TBM34_STYDY_AUTH_CD, H001G10_A459TBM34_STUDY_ID
            }
            , new Object[] {
            H001G11_A189TBM21_DEL_FLG, H001G11_n189TBM21_DEL_FLG, H001G11_A186TBM21_STUDY_ID, H001G11_A513TBM21_STATUS, H001G11_n513TBM21_STATUS
            }
            , new Object[] {
            H001G12_A294TBT02_CRF_ID, H001G12_A293TBT02_SUBJECT_ID, H001G12_A292TBT02_STUDY_ID, H001G12_A370TBT02_CRF_LATEST_VERSION, H001G12_n370TBT02_CRF_LATEST_VERSION, H001G12_A302TBT02_UPD_CNT, H001G12_n302TBT02_UPD_CNT, H001G12_A613TBT01_SITE_ID, H001G12_n613TBT01_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV118Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV115Pgmdesc = "CRFåüçıèåè" ;
      /* GeneXus formulas. */
      AV118Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV115Pgmdesc = "CRFåüçıèåè" ;
      Gx_err = (short)(0) ;
      edtavCtltam08_site_snm_Enabled = 0 ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV19P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV19P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte AV15H_POPUP_ERR_CD ;
   private byte AV40W_ERR_CD ;
   private byte AV126GXLvl638 ;
   private byte AV63W_SUBJECT_ID_CNT ;
   private byte GXv_int4[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_59_idx=1 ;
   private short nRC_Grid2 ;
   private short nGXsfl_88_idx=1 ;
   private short nRC_Grid3 ;
   private short nGXsfl_102_idx=1 ;
   private short nRC_Grid4 ;
   private short nGXsfl_121_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short AV76GXV1 ;
   private short AV86GXV11 ;
   private short AV82GXV7 ;
   private short AV79GXV4 ;
   private short nCmpId ;
   private short Gx_err ;
   private short nGXsfl_59_fel_idx=1 ;
   private short nGXsfl_88_fel_idx=1 ;
   private short nGXsfl_102_fel_idx=1 ;
   private short nGXsfl_121_fel_idx=1 ;
   private short A218TBM31_CRF_ID ;
   private short AV67W_TBM31_CRF_ID ;
   private short A149TAS01_SORT_NO ;
   private short A460TBM34_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short subGrid1_Borderwidth ;
   private short subGrid3_Borderwidth ;
   private short subGrid4_Borderwidth ;
   private short subGrid2_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid4_Islastpage ;
   private int GRID1_nRecordCount ;
   private int edtavCtltam08_site_snm_Enabled ;
   private int edtavCtltbt01_subject_id_Enabled ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltbm31_crf_snm_Enabled ;
   private int edtavCtltas01_item_ryak_Enabled ;
   private int AV17H_SUBJECT_ID_SENTAKU ;
   private int tblTbl_hidden_Visible ;
   private int GRID1_nCurrentRecord ;
   private int tblTbl_btn_subject_Visible ;
   private int A221TBM31_ORDER ;
   private int A283TBT01_SUBJECT_ID ;
   private int AV127GXV41 ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int subGrid1_Width ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid2_Backcoloreven ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private long wcpOAV20P_STUDY_ID ;
   private long AV20P_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A329TBT14_STUDY_ID ;
   private long AV70W_TOP_LINE_NO ;
   private long AV38W_CNT ;
   private long AV45W_IDX ;
   private long A197TBM22_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long AV68W_TBM31_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private long A459TBM34_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_59_idx="0001" ;
   private String sGXsfl_88_idx="0001" ;
   private String sGXsfl_102_idx="0001" ;
   private String sGXsfl_121_idx="0001" ;
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
   private String edtavCtltam08_site_snm_Internalname ;
   private String edtavCtltas01_item_ryak_Internalname ;
   private String edtavCtltbm31_crf_id_Internalname ;
   private String edtavCtltbm31_crf_snm_Internalname ;
   private String edtavCtltbt01_subject_id_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV118Pgmname ;
   private String AV115Pgmdesc ;
   private String edtavD_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_subject_id_sentaku_Internalname ;
   private String edtavW_other_site_view_flg_Internalname ;
   private String edtavW_tbm01_sys_value_Internalname ;
   private String edtavW_dm_kbn_Internalname ;
   private String edtavH_popup_err_cd_Internalname ;
   private String edtavH_auto_seni_flg_Internalname ;
   private String edtavCtlmax_row_Internalname ;
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
   private String sGXsfl_59_fel_idx="0001" ;
   private String sGXsfl_88_fel_idx="0001" ;
   private String sGXsfl_102_fel_idx="0001" ;
   private String sGXsfl_121_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String tblTbl_btn_subject_Internalname ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_delete_subject_exec_Internalname ;
   private String lblTxt_btn_delete_subject_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_subject_id_sentaku_Jsonclick ;
   private String edtavP_study_id_Internalname ;
   private String edtavP_study_id_Jsonclick ;
   private String edtavP_auth_cd_Internalname ;
   private String edtavP_auth_cd_Jsonclick ;
   private String edtavP_move_kbn_Internalname ;
   private String edtavP_move_kbn_Jsonclick ;
   private String edtavW_other_site_view_flg_Jsonclick ;
   private String edtavW_tbm01_sys_value_Jsonclick ;
   private String edtavW_dm_kbn_Jsonclick ;
   private String edtavH_popup_err_cd_Jsonclick ;
   private String edtavH_auto_seni_flg_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
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
   private String tblTable5_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid3_Internalname ;
   private String subGrid4_Internalname ;
   private String tblTbl_grid_header4_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTbl_grid_header3_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String tblTable9_Internalname ;
   private String subGrid2_Internalname ;
   private String tblTable11_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavD_subject_id_Jsonclick ;
   private String tblTbl_grid_header2_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblBtn_kensaku_Internalname ;
   private String lblBtn_kensaku_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblBtn_memo_Internalname ;
   private String lblBtn_memo_Jsonclick ;
   private String lblBtn_new_subject_Internalname ;
   private String lblBtn_new_subject_Jsonclick ;
   private String lblBtn_delete_subject_Internalname ;
   private String lblBtn_delete_subject_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtltam08_site_snm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavCtltbt01_subject_id_Jsonclick ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String tblTable8_Internalname ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String edtavCtltbm31_crf_snm_Jsonclick ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String GXt_char1 ;
   private String edtavCtltas01_item_ryak_Jsonclick ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV7D_GRD1_ALL_SEL_FLG ;
   private boolean AV8D_GRD2_ALL_SEL_FLG ;
   private boolean AV9D_GRD3_ALL_SEL_FLG ;
   private boolean returnInSub ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean n928TBT14_REQUEST_SITE_ID ;
   private boolean AV43W_ERRFLG ;
   private boolean AV46W_INPCHK_FLG1 ;
   private boolean AV47W_INPCHK_FLG2 ;
   private boolean AV48W_INPCHK_FLG3 ;
   private boolean AV49W_INPCHK_FLG4 ;
   private boolean AV50W_INPCHK_FLG5 ;
   private boolean AV51W_INPCHK_FLG6 ;
   private boolean gx_BV59 ;
   private boolean gx_BV88 ;
   private boolean gx_BV102 ;
   private boolean gx_BV121 ;
   private boolean n534TBM07_DEL_FLG ;
   private boolean n533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n199TBM22_DEL_FLG ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n551TBM31_STATUS ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n221TBM31_ORDER ;
   private boolean AV69W_TBM34_FLG ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n53TAS01_ITEM_RYAK ;
   private boolean n149TAS01_SORT_NO ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n463TBM34_DEL_FLG ;
   private boolean n462TBM34_DISPLAY_FLG ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n302TBT02_UPD_CNT ;
   private String wcpOAV18P_AUTH_CD ;
   private String AV18P_AUTH_CD ;
   private String AV10D_SORT ;
   private String AV11D_SUBJECT_ID ;
   private String AV14H_INIT_FLG ;
   private String AV16H_SRCH_FLG ;
   private String AV59W_OTHER_SITE_VIEW_FLG ;
   private String AV65W_TBM01_SYS_VALUE ;
   private String AV39W_DM_KBN ;
   private String AV13H_AUTO_SENI_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String A187TBM21_STUDY_NM ;
   private String AV62W_STUDY_NM ;
   private String A17TAM04_AUTH_CD ;
   private String A98TAM04_AUTH_NM ;
   private String AV25W_AUTH_NM ;
   private String AV52W_MEMO_DISP_FLG ;
   private String A337TBT14_DEL_FLG ;
   private String A924TBT14_KANRYO_FLG ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String A928TBT14_REQUEST_SITE_ID ;
   private String AV53W_MSG ;
   private String AV24W_A821_JS ;
   private String AV41W_ERR_MSG ;
   private String A534TBM07_DEL_FLG ;
   private String A530TBM07_AUTH_CD ;
   private String A533TBM07_OTHER_SITE_VIEW_FLG ;
   private String AV22W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   private String A198TBM22_SITE_ID ;
   private String A199TBM22_DEL_FLG ;
   private String A134TAM08_SITE_SNM ;
   private String AV66W_TBM22_SITE_ID ;
   private String A551TBM31_STATUS ;
   private String A223TBM31_DEL_FLG ;
   private String A550TBM31_CRF_SNM ;
   private String A54TAS01_DATA_KIND ;
   private String A113TAS01_DEL_FLG ;
   private String A55TAS01_ITEM_CD ;
   private String A53TAS01_ITEM_RYAK ;
   private String A284TBT01_DEL_FLG ;
   private String A613TBT01_SITE_ID ;
   private String A463TBM34_DEL_FLG ;
   private String A462TBM34_DISPLAY_FLG ;
   private String A461TBM34_STYDY_AUTH_CD ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private String AV64W_SUBJECT_ID_GET ;
   private String AV56W_OPEN_STUDY_ID ;
   private String AV57W_OPEN_SUBJECT_ID ;
   private String AV54W_OPEN_CRF_ID ;
   private String AV55W_OPEN_CRF_INPUT_LEVEL ;
   private String AV58W_OPEN_UPD_CNT ;
   private String AV61W_SESSION_KEY ;
   private String AV71W_URL ;
   private String AV42W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.internet.HttpRequest AV44W_HTTPREQUEST ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV21SD_B792_SD00_HTML5_EXEC_INFO ;
   private HTMLChoice cmbavD_sort ;
   private ICheckbox chkavD_grd1_all_sel_flg ;
   private ICheckbox chkavCtlsel_flg1 ;
   private ICheckbox chkavD_grd2_all_sel_flg ;
   private ICheckbox chkavCtlsel_flg2 ;
   private ICheckbox chkavD_grd3_all_sel_flg ;
   private ICheckbox chkavCtlsel_flg3 ;
   private ICheckbox chkavCtlsel_flg4 ;
   private IDataStoreProvider pr_default ;
   private long[] H001G2_A186TBM21_STUDY_ID ;
   private String[] H001G2_A187TBM21_STUDY_NM ;
   private boolean[] H001G2_n187TBM21_STUDY_NM ;
   private String[] H001G3_A17TAM04_AUTH_CD ;
   private String[] H001G3_A98TAM04_AUTH_NM ;
   private boolean[] H001G3_n98TAM04_AUTH_NM ;
   private int[] H001G4_A330TBT14_SUBJECT_ID ;
   private short[] H001G4_A922TBT14_MEMO_NO ;
   private String[] H001G4_A337TBT14_DEL_FLG ;
   private boolean[] H001G4_n337TBT14_DEL_FLG ;
   private String[] H001G4_A924TBT14_KANRYO_FLG ;
   private boolean[] H001G4_n924TBT14_KANRYO_FLG ;
   private String[] H001G4_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001G4_n927TBT14_KAKUNIN_FLG ;
   private String[] H001G4_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001G4_n929TBT14_REQUEST_AUTH_CD ;
   private String[] H001G4_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] H001G4_n928TBT14_REQUEST_SITE_ID ;
   private long[] H001G4_A329TBT14_STUDY_ID ;
   private String[] H001G5_A534TBM07_DEL_FLG ;
   private boolean[] H001G5_n534TBM07_DEL_FLG ;
   private String[] H001G5_A530TBM07_AUTH_CD ;
   private String[] H001G5_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] H001G5_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] H001G6_A199TBM22_DEL_FLG ;
   private boolean[] H001G6_n199TBM22_DEL_FLG ;
   private String[] H001G6_A198TBM22_SITE_ID ;
   private long[] H001G6_A197TBM22_STUDY_ID ;
   private String[] H001G6_A134TAM08_SITE_SNM ;
   private boolean[] H001G6_n134TAM08_SITE_SNM ;
   private long[] H001G7_A217TBM31_STUDY_ID ;
   private String[] H001G7_A223TBM31_DEL_FLG ;
   private boolean[] H001G7_n223TBM31_DEL_FLG ;
   private String[] H001G7_A551TBM31_STATUS ;
   private boolean[] H001G7_n551TBM31_STATUS ;
   private short[] H001G7_A218TBM31_CRF_ID ;
   private String[] H001G7_A550TBM31_CRF_SNM ;
   private boolean[] H001G7_n550TBM31_CRF_SNM ;
   private int[] H001G7_A221TBM31_ORDER ;
   private boolean[] H001G7_n221TBM31_ORDER ;
   private String[] H001G8_A54TAS01_DATA_KIND ;
   private String[] H001G8_A113TAS01_DEL_FLG ;
   private boolean[] H001G8_n113TAS01_DEL_FLG ;
   private String[] H001G8_A55TAS01_ITEM_CD ;
   private String[] H001G8_A53TAS01_ITEM_RYAK ;
   private boolean[] H001G8_n53TAS01_ITEM_RYAK ;
   private short[] H001G8_A149TAS01_SORT_NO ;
   private boolean[] H001G8_n149TAS01_SORT_NO ;
   private String[] H001G9_A284TBT01_DEL_FLG ;
   private boolean[] H001G9_n284TBT01_DEL_FLG ;
   private String[] H001G9_A613TBT01_SITE_ID ;
   private boolean[] H001G9_n613TBT01_SITE_ID ;
   private long[] H001G9_A282TBT01_STUDY_ID ;
   private int[] H001G9_A283TBT01_SUBJECT_ID ;
   private String[] H001G10_A463TBM34_DEL_FLG ;
   private boolean[] H001G10_n463TBM34_DEL_FLG ;
   private String[] H001G10_A462TBM34_DISPLAY_FLG ;
   private boolean[] H001G10_n462TBM34_DISPLAY_FLG ;
   private short[] H001G10_A460TBM34_CRF_ID ;
   private String[] H001G10_A461TBM34_STYDY_AUTH_CD ;
   private long[] H001G10_A459TBM34_STUDY_ID ;
   private String[] H001G11_A189TBM21_DEL_FLG ;
   private boolean[] H001G11_n189TBM21_DEL_FLG ;
   private long[] H001G11_A186TBM21_STUDY_ID ;
   private String[] H001G11_A513TBM21_STATUS ;
   private boolean[] H001G11_n513TBM21_STATUS ;
   private short[] H001G12_A294TBT02_CRF_ID ;
   private int[] H001G12_A293TBT02_SUBJECT_ID ;
   private long[] H001G12_A292TBT02_STUDY_ID ;
   private short[] H001G12_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001G12_n370TBT02_CRF_LATEST_VERSION ;
   private long[] H001G12_A302TBT02_UPD_CNT ;
   private boolean[] H001G12_n302TBT02_UPD_CNT ;
   private String[] H001G12_A613TBT01_SITE_ID ;
   private boolean[] H001G12_n613TBT01_SITE_ID ;
   private com.genexus.webpanels.WebSession AV60W_SESSION ;
   private GxObjectCollection AV26W_B712_SD01_SITE_LIST ;
   private GxObjectCollection AV32W_B712_SD04_KANI_LIST ;
   private GxObjectCollection AV30W_B712_SD03_CRF_LIST ;
   private GxObjectCollection AV28W_B712_SD02_SUBJECT_LIST ;
   private GxObjectCollection AV72SD_OPEN_CRF_C ;
   private SdtA_PAGING_SDT AV12H_A_PAGING_SDT ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem Currentitem0 ;
   private SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem AV27W_B712_SD01_SITE_LIST_Item ;
   private SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem Currentitem3 ;
   private SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem AV29W_B712_SD02_SUBJECT_LIST_Item ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem Currentitem2 ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV31W_B712_SD03_CRF_LIST_Item ;
   private SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem Currentitem1 ;
   private SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem AV33W_B712_SD04_KANI_LIST_Item ;
   private SdtB712_SD05_MULTI_SEL_LIST AV34W_B712_SD05_SEL1 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV36W_B712_SD05_SEL3 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV37W_B712_SD05_SEL4 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV35W_B712_SD05_SEL2 ;
   private SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem AV73SD_OPEN_CRF_I ;
}

final  class b712_wp01_search_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001G6( com.genexus.internet.HttpContext httpContext ,
                                          String AV59W_OTHER_SITE_VIEW_FLG ,
                                          String A198TBM22_SITE_ID ,
                                          String AV22W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ,
                                          String A199TBM22_DEL_FLG ,
                                          long AV20P_STUDY_ID ,
                                          long A197TBM22_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [2] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      scmdbuf = "SELECT T1.`TBM22_DEL_FLG`, T1.`TBM22_SITE_ID` AS TBM22_SITE_ID, T1.`TBM22_STUDY_ID`," ;
      scmdbuf = scmdbuf + " T2.`TAM08_SITE_SNM` FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID`" ;
      scmdbuf = scmdbuf + " = T1.`TBM22_SITE_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBM22_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T1.`TBM22_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV59W_OTHER_SITE_VIEW_FLG, "0") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBM22_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID`" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_H001G7( com.genexus.internet.HttpContext httpContext ,
                                          String A551TBM31_STATUS ,
                                          String AV39W_DM_KBN ,
                                          long A217TBM31_STUDY_ID ,
                                          long AV20P_STUDY_ID ,
                                          String A223TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [1] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_STUDY_ID`, `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_CRF_SNM`," ;
      scmdbuf = scmdbuf + " `TBM31_ORDER` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV39W_DM_KBN, "0") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` IN ('0','1'))" ;
      }
      if ( GXutil.strcmp(AV39W_DM_KBN, "1") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` IN ('1'))" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_ORDER`" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 4 :
                  return conditional_H001G6(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
            case 5 :
                  return conditional_H001G7(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001G2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G4", "SELECT `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_DEL_FLG`, `TBT14_KANRYO_FLG`, `TBT14_KAKUNIN_FLG`, `TBT14_REQUEST_AUTH_CD`, `TBT14_REQUEST_SITE_ID`, `TBT14_STUDY_ID` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ?) AND (( `TBT14_REQUEST_AUTH_CD` = ? or `TBT14_REQUEST_AUTH_CD` = 'XX')) AND (`TBT14_REQUEST_SITE_ID` = ?) AND (`TBT14_KAKUNIN_FLG` = '0') AND (`TBT14_KANRYO_FLG` = '0') AND (`TBT14_DEL_FLG` = '0') ORDER BY `TBT14_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G5", "SELECT `TBM07_DEL_FLG`, `TBM07_AUTH_CD`, `TBM07_OTHER_SITE_VIEW_FLG` FROM `TBM07_AUTH_BEHAVIOR` WHERE (`TBM07_AUTH_CD` = ?) AND (`TBM07_DEL_FLG` = '0') ORDER BY `TBM07_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001G7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001G8", "SELECT `TAS01_DATA_KIND`, `TAS01_DEL_FLG`, `TAS01_ITEM_CD`, `TAS01_ITEM_RYAK`, `TAS01_SORT_NO` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B08') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_SORT_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001G9", "SELECT `TBT01_DEL_FLG`, `TBT01_SITE_ID`, `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE (`TBT01_STUDY_ID` = ?) AND (`TBT01_SITE_ID` = ?) AND (`TBT01_DEL_FLG` = '0') ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001G10", "SELECT `TBM34_DEL_FLG`, `TBM34_DISPLAY_FLG`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_STUDY_ID` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? and `TBM34_STYDY_AUTH_CD` = ?) AND (`TBM34_DISPLAY_FLG` = '0') AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G11", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001G12", "SELECT T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, T1.`TBT02_CRF_LATEST_VERSION`, T1.`TBT02_UPD_CNT`, T2.`TBT01_SITE_ID` FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`) WHERE T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ? and T1.`TBT02_CRF_ID` = ? ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(8) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 20);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 20);
               }
               break;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

