/*
               File: b717_wp01_rekiinfo_crf_impl
        Description: CRF履歴詳細情報画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:8:8.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b717_wp01_rekiinfo_crf_impl extends GXWebPanel
{
   public b717_wp01_rekiinfo_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b717_wp01_rekiinfo_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b717_wp01_rekiinfo_crf_impl.class ));
   }

   public b717_wp01_rekiinfo_crf_impl( int remoteHandle ,
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
            nGXsfl_178_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_178_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_178_idx, sGXsfl_178_idx) ;
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
            AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
               AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
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
         pa1I2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1I2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1I2( ) ;
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
      httpContext.writeText( "CRF履歴詳細情報画面") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_CRF_ID,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b717_wp01_rekiinfo_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1I2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b717_sd01_rekiinfo_crf_list", AV22W_B717_SD01_REKIINFO_CRF_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b717_sd01_rekiinfo_crf_list", AV22W_B717_SD01_REKIINFO_CRF_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV13H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV13H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( AV18P_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV16P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public void wb1I0( )
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
         wb_table1_2_1I2( true) ;
      }
      else
      {
         wb_table1_2_1I2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_193_1I2( true) ;
      }
      else
      {
         wb_table2_193_1I2( false) ;
      }
      return  ;
   }

   public void wb_table2_193_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "CRF履歴詳細情報画面", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1I0( ) ;
   }

   public void ws1I2( )
   {
      start1I2( ) ;
      evt1I2( ) ;
   }

   public void evt1I2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_EXIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111I2 */
                        e111I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121I2 */
                        e121I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131I2 */
                        e131I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141I2 */
                        e141I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151I2 */
                        e151I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161I2 */
                        e161I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171I2 */
                        e171I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181I2 */
                        e181I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191I2 */
                        e191I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201I2 */
                        e201I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211I2 */
                        e211I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221I2 */
                        e221I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231I2 */
                        e231I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241I2 */
                        e241I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251I2 */
                        e251I2 ();
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
                        nGXsfl_178_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_178_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_idx, 4, 0)), (short)(4), "0") ;
                        edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
                        edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
                        edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
                        edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
                        edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
                        edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
                        AV36GXV1 = (short)(nGXsfl_178_idx+GRID1_nFirstRecordOnPage) ;
                        if ( AV22W_B717_SD01_REKIINFO_CRF_LIST.size() >= AV36GXV1 )
                        {
                           Currentitem0 = (((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)));
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt11_crf_version_Internalname), ".", ",")) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( httpContext.cgiGet( edtavCtldm_arrival_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( httpContext.cgiGet( edtavCtlinput_end_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( httpContext.cgiGet( edtavCtltbt11_upload_datetime_vc_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( httpContext.cgiGet( edtavCtltam07_user_nm_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( httpContext.cgiGet( edtavCtltbt11_upd_riyu_Internalname) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e261I2 */
                              e261I2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e271I2 */
                              e271I2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281I2 */
                              e281I2 ();
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
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1I2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1I2( ) ;
         }
      }
   }

   public void pa1I2( )
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
                  AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
                     AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
                  }
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
                                 short nGXsfl_178_idx ,
                                 String sGXsfl_178_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
      edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
      edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
      edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
      edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
      while ( nGXsfl_178_idx <= nRC_Grid1 )
      {
         sendrow_1782( ) ;
         nGXsfl_178_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_178_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_178_idx+1)) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_idx, 4, 0)), (short)(4), "0") ;
         edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
         edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
         edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
         edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
         edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
         edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1I2( ) ;
      /* End function Refresh */
   }

   public void rf1I2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(178) ;
      nGXsfl_178_idx = (short)(1) ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_idx, 4, 0)), (short)(4), "0") ;
      edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
      edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
      edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
      edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
      edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
      /* Execute user event: e271I2 */
      e271I2 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
         edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
         edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
         edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
         edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
         edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
         /* Execute user event: e281I2 */
         e281I2 ();
         wbEnd = (short)(178) ;
         wb1I0( ) ;
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
      return AV22W_B717_SD01_REKIINFO_CRF_LIST.size() ;
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

   public void strup1I0( )
   {
      /* Before Start, stand alone formulas. */
      AV70Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV69Pgmdesc = "CRF履歴詳細情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_nm_Enabled, 5, 0)));
      edtavD_subject_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_subject_id_Enabled, 5, 0)));
      edtavD_crf_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_id_Enabled, 5, 0)));
      edtavD_crf_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_nm_Enabled, 5, 0)));
      edtavD_crf_snm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_snm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_snm_Enabled, 5, 0)));
      edtavD_site_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_site_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_site_nm_Enabled, 5, 0)));
      edtavCtltbt11_crf_version_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e261I2 */
      e261I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b717_sd01_rekiinfo_crf_list"), AV22W_B717_SD01_REKIINFO_CRF_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV13H_A_PAGING_SDT);
         /* Read variables values. */
         AV11D_STUDY_NM = httpContext.cgiGet( edtavD_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_STUDY_NM", AV11D_STUDY_NM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_SUBJECT_ID");
            GX_FocusControl = edtavD_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12D_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV12D_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV12D_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV12D_SUBJECT_ID, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_CRF_ID");
            GX_FocusControl = edtavD_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7D_CRF_ID = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         }
         else
         {
            AV7D_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_crf_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         }
         AV8D_CRF_NM = httpContext.cgiGet( edtavD_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRF_NM", AV8D_CRF_NM);
         AV9D_CRF_SNM = httpContext.cgiGet( edtavD_crf_snm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         AV10D_SITE_NM = httpContext.cgiGet( edtavD_site_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_NM", AV10D_SITE_NM);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV15H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV17P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV18P_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "vP_SUBJECT_ID"), ".", ",")) ;
         AV16P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         subGrid1_Rows = (short)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_178_fel_idx = (short)(0) ;
         while ( nGXsfl_178_fel_idx < nRC_Grid1 )
         {
            nGXsfl_178_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_178_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_178_fel_idx+1)) ;
            sGXsfl_178_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_fel_idx, 4, 0)), (short)(4), "0") ;
            edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_fel_idx ;
            edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_fel_idx ;
            edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_fel_idx ;
            edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_fel_idx ;
            edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_fel_idx ;
            edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_fel_idx ;
            AV36GXV1 = (short)(nGXsfl_178_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV36GXV1 = (short)(nGXsfl_178_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( AV22W_B717_SD01_REKIINFO_CRF_LIST.size() >= AV36GXV1 )
            {
               Currentitem0 = (((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)));
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt11_crf_version_Internalname), ".", ",")) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( httpContext.cgiGet( edtavCtldm_arrival_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( httpContext.cgiGet( edtavCtlinput_end_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( httpContext.cgiGet( edtavCtltbt11_upload_datetime_vc_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( httpContext.cgiGet( edtavCtltam07_user_nm_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( httpContext.cgiGet( edtavCtltbt11_upd_riyu_Internalname) );
            }
            Currentitem0 = (((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)));
         }
         if ( nGXsfl_178_fel_idx == 0 )
         {
            nGXsfl_178_idx = (short)(1) ;
            sGXsfl_178_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_idx, 4, 0)), (short)(4), "0") ;
            edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
            edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
            edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
            edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
            edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
            edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
         }
         nGXsfl_178_fel_idx = (short)(1) ;
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
      /* Execute user event: e261I2 */
      e261I2 ();
      if (returnInSub) return;
   }

   public void e261I2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B717" ;
      AV6C_GAMEN_TITLE = AV69Pgmdesc ;
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
   }

   public void e271I2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV70Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV14H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   private void e281I2( )
   {
      /* Grid1_Load Routine */
      AV36GXV1 = (short)(1) ;
      while ( AV36GXV1 <= AV22W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         Currentitem0 = ( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(178) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1782( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
         AV36GXV1 = (short)(AV36GXV1+1) ;
      }
   }

   public void e111I2( )
   {
      /* 'BTN_EXIT' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
   }

   public void S142( )
   {
      /* 'SUB_SRCH' Routine */
      /* Using cursor H001I2 */
      pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189TBM21_DEL_FLG = H001I2_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001I2_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = H001I2_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H001I2_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001I2_n187TBM21_STUDY_NM[0] ;
         AV11D_STUDY_NM = A187TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_STUDY_NM", AV11D_STUDY_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV12D_SUBJECT_ID = AV18P_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV12D_SUBJECT_ID, 6, 0)));
      /* Using cursor H001I3 */
      pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A223TBM31_DEL_FLG = H001I3_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001I3_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = H001I3_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A217TBM31_STUDY_ID = H001I3_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A219TBM31_CRF_NM = H001I3_A219TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         n219TBM31_CRF_NM = H001I3_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = H001I3_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = H001I3_n550TBM31_CRF_SNM[0] ;
         AV7D_CRF_ID = A218TBM31_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         AV8D_CRF_NM = A219TBM31_CRF_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRF_NM", AV8D_CRF_NM);
         AV9D_CRF_SNM = A550TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor H001I4 */
      pr_default.execute(2, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A284TBT01_DEL_FLG = H001I4_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = H001I4_n284TBT01_DEL_FLG[0] ;
         A283TBT01_SUBJECT_ID = H001I4_A283TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
         A282TBT01_STUDY_ID = H001I4_A282TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A613TBT01_SITE_ID = H001I4_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = H001I4_n613TBT01_SITE_ID[0] ;
         AV28W_SITE_ID = A613TBT01_SITE_ID ;
         /* Using cursor H001I5 */
         pr_default.execute(3, new Object[] {AV28W_SITE_ID});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A139TAM08_DEL_FLG = H001I5_A139TAM08_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
            n139TAM08_DEL_FLG = H001I5_n139TAM08_DEL_FLG[0] ;
            A132TAM08_SITE_ID = H001I5_A132TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            A133TAM08_SITE_NM = H001I5_A133TAM08_SITE_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
            n133TAM08_SITE_NM = H001I5_n133TAM08_SITE_NM[0] ;
            AV10D_SITE_NM = A133TAM08_SITE_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_NM", AV10D_SITE_NM);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV22W_B717_SD01_REKIINFO_CRF_LIST.clear();
      gx_BV178 = true ;
      /* Using cursor H001I6 */
      pr_default.execute(4, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID), new Short(AV16P_CRF_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A307TBT11_DEL_FLG = H001I6_A307TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
         n307TBT11_DEL_FLG = H001I6_n307TBT11_DEL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = H001I6_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n578TBT11_DM_ARRIVAL_DATETIME = H001I6_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A305TBT11_CRF_ID = H001I6_A305TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         A304TBT11_SUBJECT_ID = H001I6_A304TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         A303TBT11_STUDY_ID = H001I6_A303TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         A577TBT11_DM_ARRIVAL_FLG = H001I6_A577TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
         n577TBT11_DM_ARRIVAL_FLG = H001I6_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A583TBT11_INPUT_END_FLG = H001I6_A583TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
         n583TBT11_INPUT_END_FLG = H001I6_n583TBT11_INPUT_END_FLG[0] ;
         A574TBT11_UPLOAD_DATETIME = H001I6_A574TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n574TBT11_UPLOAD_DATETIME = H001I6_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = H001I6_A575TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
         n575TBT11_UPLOAD_USER_ID = H001I6_n575TBT11_UPLOAD_USER_ID[0] ;
         A884TBT11_UPD_RIYU = H001I6_A884TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
         n884TBT11_UPD_RIYU = H001I6_n884TBT11_UPD_RIYU[0] ;
         A306TBT11_CRF_VERSION = H001I6_A306TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
         AV30W_TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         if ( GXutil.strcmp(A577TBT11_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV24W_DM_ARRIVAL = "済" ;
         }
         else
         {
            AV24W_DM_ARRIVAL = "差戻" ;
         }
         if ( GXutil.strcmp(A583TBT11_INPUT_END_FLG, "1") == 0 )
         {
            AV26W_INPUT_END = "済" ;
         }
         else
         {
            AV26W_INPUT_END = "未" ;
         }
         AV31W_TBT11_UPLOAD_DATETIME = A574TBT11_UPLOAD_DATETIME ;
         AV32W_TBT11_UPLOAD_USER_ID = A575TBT11_UPLOAD_USER_ID ;
         /* Using cursor H001I7 */
         pr_default.execute(5, new Object[] {AV32W_TBT11_UPLOAD_USER_ID});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A8TAM07_USER_ID = H001I7_A8TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            A2TAM07_USER_NM = H001I7_A2TAM07_USER_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
            n2TAM07_USER_NM = H001I7_n2TAM07_USER_NM[0] ;
            AV29W_TAM07_USER_NM = A2TAM07_USER_NM ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( AV30W_TBT11_CRF_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( AV24W_DM_ARRIVAL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( AV26W_INPUT_END );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime( AV31W_TBT11_UPLOAD_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         if ( ! GXutil.nullDate().equals(AV31W_TBT11_UPLOAD_DATETIME) )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV31W_TBT11_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char3) ;
            b717_wp01_rekiinfo_crf_impl.this.GXt_char2 = GXv_char3[0] ;
            AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( GXt_char2 );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         }
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( AV29W_TAM07_USER_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( A884TBT11_UPD_RIYU );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV22W_B717_SD01_REKIINFO_CRF_LIST.add(AV23W_B717_SD01_REKIINFO_CRF_LIST_Item, 0);
         gx_BV178 = true ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV30W_TBT11_CRF_VERSION = (short)(AV22W_B717_SD01_REKIINFO_CRF_LIST.size()) ;
      AV77GXV35 = 1 ;
      while ( AV77GXV35 <= AV22W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV77GXV35));
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( AV30W_TBT11_CRF_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV30W_TBT11_CRF_VERSION = (short)(AV30W_TBT11_CRF_VERSION-1) ;
         AV77GXV35 = (int)(AV77GXV35+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV19W_A_LOGIN_SDT;
      GXv_char3[0] = AV25W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b717_wp01_rekiinfo_crf_impl.this.AV25W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
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
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      AV20W_A819_JS = "" ;
      AV33W_JS = "" ;
   }

   public void S152( )
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
      if ( ! (GXutil.strcmp("", AV21W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV21W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV33W_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV33W_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S17347( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV70Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b717_wp01_rekiinfo_crf");
   }

   public void e121I2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e131I2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      else
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e141I2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e151I2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161I2( )
   {
      /* 'PAGE01' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e171I2( )
   {
      /* 'PAGE02' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181I2( )
   {
      /* 'PAGE03' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191I2( )
   {
      /* 'PAGE04' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201I2( )
   {
      /* 'PAGE05' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211I2( )
   {
      /* 'PAGE06' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221I2( )
   {
      /* 'PAGE07' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231I2( )
   {
      /* 'PAGE08' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241I2( )
   {
      /* 'PAGE09' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251I2( )
   {
      /* 'PAGE10' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT5[0] = AV13H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV13H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void wb_table2_193_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(197);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(198);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         wb_table3_199_1I2( true) ;
      }
      else
      {
         wb_table3_199_1I2( false) ;
      }
      return  ;
   }

   public void wb_table3_199_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_193_1I2e( true) ;
      }
      else
      {
         wb_table2_193_1I2e( false) ;
      }
   }

   public void wb_table3_199_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:23px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(204);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:21px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "REC_CNT", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(209);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "PAGE_KBN", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(219);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(224);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(229);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(234);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(239);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(244);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(249);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(254);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(259);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "PAGE09", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(264);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE10", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(269);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE_DISP01", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(274);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "PAGE_DISP02", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(279);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP03", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(284);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "PAGE_DISP04", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(289);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP05", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(294);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP06", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(299);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP07", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(304);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP08", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(309);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP09", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(314);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP10", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(319);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(324);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(329);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(334);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_199_1I2e( true) ;
      }
      else
      {
         wb_table3_199_1I2e( false) ;
      }
   }

   public void wb_table1_2_1I2( boolean wbgen )
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
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table4_6_1I2( true) ;
      }
      else
      {
         wb_table4_6_1I2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1I2e( boolean wbgen )
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
         wb_table1_2_1I2e( true) ;
      }
      else
      {
         wb_table1_2_1I2e( false) ;
      }
   }

   public void wb_table4_6_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 855, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_11_1I2( true) ;
      }
      else
      {
         wb_table5_11_1I2( false) ;
      }
      return  ;
   }

   public void wb_table5_11_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table6_26_1I2( true) ;
      }
      else
      {
         wb_table6_26_1I2( false) ;
      }
      return  ;
   }

   public void wb_table6_26_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_6_1I2e( true) ;
      }
      else
      {
         wb_table4_6_1I2e( false) ;
      }
   }

   public void wb_table6_26_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 460, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table7_29_1I2( true) ;
      }
      else
      {
         wb_table7_29_1I2( false) ;
      }
      return  ;
   }

   public void wb_table7_29_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_1I2e( true) ;
      }
      else
      {
         wb_table6_26_1I2e( false) ;
      }
   }

   public void wb_table7_29_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 178, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 850, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table8_32_1I2( true) ;
      }
      else
      {
         wb_table8_32_1I2( false) ;
      }
      return  ;
   }

   public void wb_table8_32_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr valign=\"top\" >") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_67_1I2( true) ;
      }
      else
      {
         wb_table9_67_1I2( false) ;
      }
      return  ;
   }

   public void wb_table9_67_1I2e( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         wb_table10_162_1I2( true) ;
      }
      else
      {
         wb_table10_162_1I2( false) ;
      }
      return  ;
   }

   public void wb_table10_162_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"178\">") ;
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_crf_version_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldm_arrival_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlinput_end_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_upload_datetime_vc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltam07_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_upd_riyu_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 178 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_178_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV36GXV1 = nGXsfl_178_idx ;
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
         wb_table7_29_1I2e( true) ;
      }
      else
      {
         wb_table7_29_1I2e( false) ;
      }
   }

   public void wb_table10_162_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px;width:60px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "更新Ver", "", "", lblTextblock34_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "DM到着", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, "データ固定", "", "", lblTextblock38_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:155px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "更新日", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:210px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "更新者", "", "", lblTextblock37_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:255px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "変更理由", "", "", lblTextblock39_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_162_1I2e( true) ;
      }
      else
      {
         wb_table10_162_1I2e( false) ;
      }
   }

   public void wb_table9_67_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_73_1I2( true) ;
      }
      else
      {
         wb_table11_73_1I2( false) ;
      }
      return  ;
   }

   public void wb_table11_73_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_67_1I2e( true) ;
      }
      else
      {
         wb_table9_67_1I2e( false) ;
      }
   }

   public void wb_table11_73_1I2( boolean wbgen )
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
         wb_table12_76_1I2( true) ;
      }
      else
      {
         wb_table12_76_1I2( false) ;
      }
      return  ;
   }

   public void wb_table12_76_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table13_82_1I2( true) ;
      }
      else
      {
         wb_table13_82_1I2( false) ;
      }
      return  ;
   }

   public void wb_table13_82_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_88_1I2( true) ;
      }
      else
      {
         wb_table14_88_1I2( false) ;
      }
      return  ;
   }

   public void wb_table14_88_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_94_1I2( true) ;
      }
      else
      {
         wb_table15_94_1I2( false) ;
      }
      return  ;
   }

   public void wb_table15_94_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_100_1I2( true) ;
      }
      else
      {
         wb_table16_100_1I2( false) ;
      }
      return  ;
   }

   public void wb_table16_100_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_106_1I2( true) ;
      }
      else
      {
         wb_table17_106_1I2( false) ;
      }
      return  ;
   }

   public void wb_table17_106_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_112_1I2( true) ;
      }
      else
      {
         wb_table18_112_1I2( false) ;
      }
      return  ;
   }

   public void wb_table18_112_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_118_1I2( true) ;
      }
      else
      {
         wb_table19_118_1I2( false) ;
      }
      return  ;
   }

   public void wb_table19_118_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_124_1I2( true) ;
      }
      else
      {
         wb_table20_124_1I2( false) ;
      }
      return  ;
   }

   public void wb_table20_124_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_130_1I2( true) ;
      }
      else
      {
         wb_table21_130_1I2( false) ;
      }
      return  ;
   }

   public void wb_table21_130_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_136_1I2( true) ;
      }
      else
      {
         wb_table22_136_1I2( false) ;
      }
      return  ;
   }

   public void wb_table22_136_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_142_1I2( true) ;
      }
      else
      {
         wb_table23_142_1I2( false) ;
      }
      return  ;
   }

   public void wb_table23_142_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_148_1I2( true) ;
      }
      else
      {
         wb_table24_148_1I2( false) ;
      }
      return  ;
   }

   public void wb_table24_148_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_154_1I2( true) ;
      }
      else
      {
         wb_table25_154_1I2( false) ;
      }
      return  ;
   }

   public void wb_table25_154_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_73_1I2e( true) ;
      }
      else
      {
         wb_table11_73_1I2e( false) ;
      }
   }

   public void wb_table25_154_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_154_1I2e( true) ;
      }
      else
      {
         wb_table25_154_1I2e( false) ;
      }
   }

   public void wb_table24_148_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_148_1I2e( true) ;
      }
      else
      {
         wb_table24_148_1I2e( false) ;
      }
   }

   public void wb_table23_142_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_142_1I2e( true) ;
      }
      else
      {
         wb_table23_142_1I2e( false) ;
      }
   }

   public void wb_table22_136_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_136_1I2e( true) ;
      }
      else
      {
         wb_table22_136_1I2e( false) ;
      }
   }

   public void wb_table21_130_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_130_1I2e( true) ;
      }
      else
      {
         wb_table21_130_1I2e( false) ;
      }
   }

   public void wb_table20_124_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_124_1I2e( true) ;
      }
      else
      {
         wb_table20_124_1I2e( false) ;
      }
   }

   public void wb_table19_118_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_118_1I2e( true) ;
      }
      else
      {
         wb_table19_118_1I2e( false) ;
      }
   }

   public void wb_table18_112_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_112_1I2e( true) ;
      }
      else
      {
         wb_table18_112_1I2e( false) ;
      }
   }

   public void wb_table17_106_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_106_1I2e( true) ;
      }
      else
      {
         wb_table17_106_1I2e( false) ;
      }
   }

   public void wb_table16_100_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_100_1I2e( true) ;
      }
      else
      {
         wb_table16_100_1I2e( false) ;
      }
   }

   public void wb_table15_94_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_94_1I2e( true) ;
      }
      else
      {
         wb_table15_94_1I2e( false) ;
      }
   }

   public void wb_table14_88_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_88_1I2e( true) ;
      }
      else
      {
         wb_table14_88_1I2e( false) ;
      }
   }

   public void wb_table13_82_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_82_1I2e( true) ;
      }
      else
      {
         wb_table13_82_1I2e( false) ;
      }
   }

   public void wb_table12_76_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_76_1I2e( true) ;
      }
      else
      {
         wb_table12_76_1I2e( false) ;
      }
   }

   public void wb_table8_32_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"FormTitle\" colspan=\"4\" >") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "font-family:'ＭＳ Ｐゴシック'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#FFFFFF;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "▼CRF情報", "", "", lblTextblock72_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "試験名", "", "", lblTextblock67_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:260px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_STUDY_NM", AV11D_STUDY_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV11D_STUDY_NM), GXutil.rtrim( localUtil.format( AV11D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "", "", "", "", edtavD_study_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_study_nm_Enabled, 0, 250, "px", 16, "px", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "患者No", "", "", lblTextblock71_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:260px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV12D_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV12D_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtavD_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12D_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12D_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "", "", "", "", edtavD_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_subject_id_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "CRFID", "", "", lblTextblock68_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_ID", GXutil.ltrim( GXutil.str( AV7D_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV7D_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtavD_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7D_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7D_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "", "", "", "", edtavD_crf_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crf_id_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, "CRF名", "", "", lblTextblock69_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRF_NM", AV8D_CRF_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_nm_Internalname, GXutil.rtrim( AV8D_CRF_NM), GXutil.rtrim( localUtil.format( AV8D_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtavD_crf_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crf_nm_Enabled, 0, 190, "px", 17, "px", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "CRF略称", "", "", lblTextblock70_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_snm_Internalname, GXutil.rtrim( AV9D_CRF_SNM), GXutil.rtrim( localUtil.format( AV9D_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtavD_crf_snm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crf_snm_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlock_s" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, "施設名", "", "", lblTextblock66_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_NM", AV10D_SITE_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_178_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_site_nm_Internalname, GXutil.rtrim( AV10D_SITE_NM), GXutil.rtrim( localUtil.format( AV10D_SITE_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(62);\"", "", "", "", "", edtavD_site_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_site_nm_Enabled, 0, 190, "px", 17, "px", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_32_1I2e( true) ;
      }
      else
      {
         wb_table8_32_1I2e( false) ;
      }
   }

   public void wb_table5_11_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockPTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "詳細情報", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table26_17_1I2( true) ;
      }
      else
      {
         wb_table26_17_1I2( false) ;
      }
      return  ;
   }

   public void wb_table26_17_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_11_1I2e( true) ;
      }
      else
      {
         wb_table5_11_1I2e( false) ;
      }
   }

   public void wb_table26_17_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:125px\">") ;
         /* Text block */
         ClassString = "TextBlockBtn080" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_exit_Internalname, "閉じる", "", "", lblTxt_btn_exit_Jsonclick, "E\\'BTN_EXIT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"6\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_17_1I2e( true) ;
      }
      else
      {
         wb_table26_17_1I2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
      AV18P_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
      AV16P_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
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
      pa1I2( ) ;
      ws1I2( ) ;
      we1I2( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1582510");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b717_wp01_rekiinfo_crf.js", "?1582510");
      /* End function include_jscripts */
   }

   public void sendrow_1782( )
   {
      wb1I0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_178_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_178_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_178_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_178_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_178_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_178_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:25px;width:60px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbt11_crf_version_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbt11_crf_version_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version()), "ZZZ9")),"","","","","",edtavCtltbt11_crf_version_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbt11_crf_version_Enabled),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(178),new Integer(1),new Integer(1),new Boolean(true),"right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:60px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtldm_arrival_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival()),"","","","","","",edtavCtldm_arrival_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtldm_arrival_Enabled),new Integer(0),new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(178),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:70px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtlinput_end_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end()),"","","","","","",edtavCtlinput_end_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtlinput_end_Enabled),new Integer(0),new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(178),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:155px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbt11_upload_datetime_vc_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc()),"","","","","","",edtavCtltbt11_upload_datetime_vc_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbt11_upload_datetime_vc_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(178),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:210px\""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltam07_user_nm_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm()),"","","","","","",edtavCtltam07_user_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltam07_user_nm_Enabled),new Integer(0),new Integer(210),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(178),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:255px\""});
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("html_textarea", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbt11_upd_riyu_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu()),"","",new Integer(0),new Integer(1),new Integer(edtavCtltbt11_upd_riyu_Enabled),new Integer(0),new Integer(250),"px",new Integer(3),"row",StyleString,ClassString,"2000",new Integer(1),"",new Boolean(true)});
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
               if ( ((int)(nGXsfl_178_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_178_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_178_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_178_idx+1)) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_178_idx, 4, 0)), (short)(4), "0") ;
         edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_178_idx ;
         edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_178_idx ;
         edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_178_idx ;
         edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_178_idx ;
         edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_178_idx ;
         edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_178_idx ;
      }
      /* End function sendrow_1782 */
   }

   public void init_default_properties( )
   {
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTxt_btn_exit_Internalname = "TXT_BTN_EXIT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      tblTable6_Internalname = "TABLE6" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavD_study_nm_Internalname = "vD_STUDY_NM" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavD_crf_id_Internalname = "vD_CRF_ID" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtavD_crf_nm_Internalname = "vD_CRF_NM" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crf_snm_Internalname = "vD_CRF_SNM" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtavD_site_nm_Internalname = "vD_SITE_NM" ;
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
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
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
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtltam07_user_nm_Jsonclick = "" ;
      edtavCtltbt11_upload_datetime_vc_Jsonclick = "" ;
      edtavCtlinput_end_Jsonclick = "" ;
      edtavCtldm_arrival_Jsonclick = "" ;
      edtavCtltbt11_crf_version_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      edtavD_site_nm_Jsonclick = "" ;
      edtavD_site_nm_Enabled = 1 ;
      edtavD_crf_snm_Jsonclick = "" ;
      edtavD_crf_snm_Enabled = 1 ;
      edtavD_crf_nm_Jsonclick = "" ;
      edtavD_crf_nm_Enabled = 1 ;
      edtavD_crf_id_Jsonclick = "" ;
      edtavD_crf_id_Enabled = 1 ;
      edtavD_subject_id_Jsonclick = "" ;
      edtavD_subject_id_Enabled = 1 ;
      edtavD_study_nm_Jsonclick = "" ;
      edtavD_study_nm_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavCtltbt11_crf_version_Enabled = 0 ;
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
      edtavH_kngn_flg_Jsonclick = "" ;
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
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Rows = (short)(10) ;
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
                  /* Execute user subroutine: S17347 */
                  S17347 ();
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
      AV22W_B717_SD01_REKIINFO_CRF_LIST = new GxObjectCollection(SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem.class, "B717_SD01_REKIINFO_CRF_LIST.B717_SD01_REKIINFO_CRF_LISTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV13H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavCtltbt11_crf_version_Internalname = "" ;
      edtavCtldm_arrival_Internalname = "" ;
      edtavCtlinput_end_Internalname = "" ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "" ;
      edtavCtltam07_user_nm_Internalname = "" ;
      edtavCtltbt11_upd_riyu_Internalname = "" ;
      Currentitem0 = new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV70Pgmname = "" ;
      AV69Pgmdesc = "" ;
      AV11D_STUDY_NM = "" ;
      AV8D_CRF_NM = "" ;
      AV9D_CRF_SNM = "" ;
      AV10D_SITE_NM = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      scmdbuf = "" ;
      H001I2_A189TBM21_DEL_FLG = new String[] {""} ;
      H001I2_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001I2_A186TBM21_STUDY_ID = new long[1] ;
      H001I2_A187TBM21_STUDY_NM = new String[] {""} ;
      H001I2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A187TBM21_STUDY_NM = "" ;
      H001I3_A223TBM31_DEL_FLG = new String[] {""} ;
      H001I3_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001I3_A218TBM31_CRF_ID = new short[1] ;
      H001I3_A217TBM31_STUDY_ID = new long[1] ;
      H001I3_A219TBM31_CRF_NM = new String[] {""} ;
      H001I3_n219TBM31_CRF_NM = new boolean[] {false} ;
      H001I3_A550TBM31_CRF_SNM = new String[] {""} ;
      H001I3_n550TBM31_CRF_SNM = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A219TBM31_CRF_NM = "" ;
      A550TBM31_CRF_SNM = "" ;
      H001I4_A284TBT01_DEL_FLG = new String[] {""} ;
      H001I4_n284TBT01_DEL_FLG = new boolean[] {false} ;
      H001I4_A283TBT01_SUBJECT_ID = new int[1] ;
      H001I4_A282TBT01_STUDY_ID = new long[1] ;
      H001I4_A613TBT01_SITE_ID = new String[] {""} ;
      H001I4_n613TBT01_SITE_ID = new boolean[] {false} ;
      A284TBT01_DEL_FLG = "" ;
      A613TBT01_SITE_ID = "" ;
      AV28W_SITE_ID = "" ;
      H001I5_A139TAM08_DEL_FLG = new String[] {""} ;
      H001I5_n139TAM08_DEL_FLG = new boolean[] {false} ;
      H001I5_A132TAM08_SITE_ID = new String[] {""} ;
      H001I5_A133TAM08_SITE_NM = new String[] {""} ;
      H001I5_n133TAM08_SITE_NM = new boolean[] {false} ;
      A139TAM08_DEL_FLG = "" ;
      A132TAM08_SITE_ID = "" ;
      A133TAM08_SITE_NM = "" ;
      H001I6_A307TBT11_DEL_FLG = new String[] {""} ;
      H001I6_n307TBT11_DEL_FLG = new boolean[] {false} ;
      H001I6_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001I6_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001I6_A305TBT11_CRF_ID = new short[1] ;
      H001I6_A304TBT11_SUBJECT_ID = new int[1] ;
      H001I6_A303TBT11_STUDY_ID = new long[1] ;
      H001I6_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      H001I6_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001I6_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      H001I6_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      H001I6_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001I6_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      H001I6_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      H001I6_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      H001I6_A884TBT11_UPD_RIYU = new String[] {""} ;
      H001I6_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      H001I6_A306TBT11_CRF_VERSION = new short[1] ;
      A307TBT11_DEL_FLG = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      A583TBT11_INPUT_END_FLG = "" ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A575TBT11_UPLOAD_USER_ID = "" ;
      A884TBT11_UPD_RIYU = "" ;
      AV24W_DM_ARRIVAL = "" ;
      AV26W_INPUT_END = "" ;
      AV31W_TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_TBT11_UPLOAD_USER_ID = "" ;
      H001I7_A8TAM07_USER_ID = new String[] {""} ;
      H001I7_A2TAM07_USER_NM = new String[] {""} ;
      H001I7_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      AV29W_TAM07_USER_NM = "" ;
      AV23W_B717_SD01_REKIINFO_CRF_LIST_Item = new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV25W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      AV20W_A819_JS = "" ;
      AV33W_JS = "" ;
      AV21W_A821_JS = "" ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
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
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
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
      lblTextblock72_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTxt_btn_exit_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      GXt_char1 = "" ;
      ROClassString = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b717_wp01_rekiinfo_crf__default(),
         new Object[] {
             new Object[] {
            H001I2_A189TBM21_DEL_FLG, H001I2_n189TBM21_DEL_FLG, H001I2_A186TBM21_STUDY_ID, H001I2_A187TBM21_STUDY_NM, H001I2_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H001I3_A223TBM31_DEL_FLG, H001I3_n223TBM31_DEL_FLG, H001I3_A218TBM31_CRF_ID, H001I3_A217TBM31_STUDY_ID, H001I3_A219TBM31_CRF_NM, H001I3_n219TBM31_CRF_NM, H001I3_A550TBM31_CRF_SNM, H001I3_n550TBM31_CRF_SNM
            }
            , new Object[] {
            H001I4_A284TBT01_DEL_FLG, H001I4_n284TBT01_DEL_FLG, H001I4_A283TBT01_SUBJECT_ID, H001I4_A282TBT01_STUDY_ID, H001I4_A613TBT01_SITE_ID, H001I4_n613TBT01_SITE_ID
            }
            , new Object[] {
            H001I5_A139TAM08_DEL_FLG, H001I5_n139TAM08_DEL_FLG, H001I5_A132TAM08_SITE_ID, H001I5_A133TAM08_SITE_NM, H001I5_n133TAM08_SITE_NM
            }
            , new Object[] {
            H001I6_A307TBT11_DEL_FLG, H001I6_n307TBT11_DEL_FLG, H001I6_A578TBT11_DM_ARRIVAL_DATETIME, H001I6_n578TBT11_DM_ARRIVAL_DATETIME, H001I6_A305TBT11_CRF_ID, H001I6_A304TBT11_SUBJECT_ID, H001I6_A303TBT11_STUDY_ID, H001I6_A577TBT11_DM_ARRIVAL_FLG, H001I6_n577TBT11_DM_ARRIVAL_FLG, H001I6_A583TBT11_INPUT_END_FLG,
            H001I6_n583TBT11_INPUT_END_FLG, H001I6_A574TBT11_UPLOAD_DATETIME, H001I6_n574TBT11_UPLOAD_DATETIME, H001I6_A575TBT11_UPLOAD_USER_ID, H001I6_n575TBT11_UPLOAD_USER_ID, H001I6_A884TBT11_UPD_RIYU, H001I6_n884TBT11_UPD_RIYU, H001I6_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            H001I7_A8TAM07_USER_ID, H001I7_A2TAM07_USER_NM, H001I7_n2TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV70Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV69Pgmdesc = "CRF履歴詳細情報画面" ;
      /* GeneXus formulas. */
      AV70Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV69Pgmdesc = "CRF履歴詳細情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      edtavD_subject_id_Enabled = 0 ;
      edtavD_crf_id_Enabled = 0 ;
      edtavD_crf_nm_Enabled = 0 ;
      edtavD_crf_snm_Enabled = 0 ;
      edtavD_site_nm_Enabled = 0 ;
      edtavCtltbt11_crf_version_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short wcpOAV16P_CRF_ID ;
   private short nRC_Grid1 ;
   private short nGXsfl_178_idx=1 ;
   private short AV16P_CRF_ID ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36GXV1 ;
   private short Gx_err ;
   private short AV7D_CRF_ID ;
   private short nGXsfl_178_fel_idx=1 ;
   private short A218TBM31_CRF_ID ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short AV30W_TBT11_CRF_VERSION ;
   private short subGrid1_Borderwidth ;
   private int wcpOAV18P_SUBJECT_ID ;
   private int AV18P_SUBJECT_ID ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrid1_Islastpage ;
   private int GRID1_nRecordCount ;
   private int edtavD_study_nm_Enabled ;
   private int edtavD_subject_id_Enabled ;
   private int edtavD_crf_id_Enabled ;
   private int edtavD_crf_nm_Enabled ;
   private int edtavD_crf_snm_Enabled ;
   private int edtavD_site_nm_Enabled ;
   private int edtavCtltbt11_crf_version_Enabled ;
   private int edtavCtldm_arrival_Enabled ;
   private int edtavCtlinput_end_Enabled ;
   private int edtavCtltbt11_upload_datetime_vc_Enabled ;
   private int edtavCtltam07_user_nm_Enabled ;
   private int edtavCtltbt11_upd_riyu_Enabled ;
   private int AV12D_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int GRID1_nCurrentRecord ;
   private int A283TBT01_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int AV77GXV35 ;
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
   private long wcpOAV17P_STUDY_ID ;
   private long AV17P_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_178_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtltbt11_crf_version_Internalname ;
   private String edtavCtldm_arrival_Internalname ;
   private String edtavCtlinput_end_Internalname ;
   private String edtavCtltbt11_upload_datetime_vc_Internalname ;
   private String edtavCtltam07_user_nm_Internalname ;
   private String edtavCtltbt11_upd_riyu_Internalname ;
   private String GXDecQS ;
   private String AV70Pgmname ;
   private String AV69Pgmdesc ;
   private String edtavD_study_nm_Internalname ;
   private String edtavD_subject_id_Internalname ;
   private String edtavD_crf_id_Internalname ;
   private String edtavD_crf_nm_Internalname ;
   private String edtavD_crf_snm_Internalname ;
   private String edtavD_site_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
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
   private String sGXsfl_178_fel_idx="0001" ;
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
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
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
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
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
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavD_study_nm_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtavD_subject_id_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtavD_crf_id_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtavD_crf_nm_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtavD_crf_snm_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtavD_site_nm_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_exit_Internalname ;
   private String lblTxt_btn_exit_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXt_char1 ;
   private String ROClassString ;
   private String edtavCtltbt11_crf_version_Jsonclick ;
   private String edtavCtldm_arrival_Jsonclick ;
   private String edtavCtlinput_end_Jsonclick ;
   private String edtavCtltbt11_upload_datetime_vc_Jsonclick ;
   private String edtavCtltam07_user_nm_Jsonclick ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private java.util.Date AV31W_TBT11_UPLOAD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n133TAM08_SITE_NM ;
   private boolean gx_BV178 ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n575TBT11_UPLOAD_USER_ID ;
   private boolean n884TBT11_UPD_RIYU ;
   private boolean n2TAM07_USER_NM ;
   private String AV11D_STUDY_NM ;
   private String AV8D_CRF_NM ;
   private String AV9D_CRF_SNM ;
   private String AV10D_SITE_NM ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String A189TBM21_DEL_FLG ;
   private String A187TBM21_STUDY_NM ;
   private String A223TBM31_DEL_FLG ;
   private String A219TBM31_CRF_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A284TBT01_DEL_FLG ;
   private String A613TBT01_SITE_ID ;
   private String AV28W_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A132TAM08_SITE_ID ;
   private String A133TAM08_SITE_NM ;
   private String A307TBT11_DEL_FLG ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String A583TBT11_INPUT_END_FLG ;
   private String A575TBT11_UPLOAD_USER_ID ;
   private String A884TBT11_UPD_RIYU ;
   private String AV24W_DM_ARRIVAL ;
   private String AV26W_INPUT_END ;
   private String AV32W_TBT11_UPLOAD_USER_ID ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String AV29W_TAM07_USER_NM ;
   private String AV25W_ERRCD ;
   private String AV20W_A819_JS ;
   private String AV33W_JS ;
   private String AV21W_A821_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H001I2_A189TBM21_DEL_FLG ;
   private boolean[] H001I2_n189TBM21_DEL_FLG ;
   private long[] H001I2_A186TBM21_STUDY_ID ;
   private String[] H001I2_A187TBM21_STUDY_NM ;
   private boolean[] H001I2_n187TBM21_STUDY_NM ;
   private String[] H001I3_A223TBM31_DEL_FLG ;
   private boolean[] H001I3_n223TBM31_DEL_FLG ;
   private short[] H001I3_A218TBM31_CRF_ID ;
   private long[] H001I3_A217TBM31_STUDY_ID ;
   private String[] H001I3_A219TBM31_CRF_NM ;
   private boolean[] H001I3_n219TBM31_CRF_NM ;
   private String[] H001I3_A550TBM31_CRF_SNM ;
   private boolean[] H001I3_n550TBM31_CRF_SNM ;
   private String[] H001I4_A284TBT01_DEL_FLG ;
   private boolean[] H001I4_n284TBT01_DEL_FLG ;
   private int[] H001I4_A283TBT01_SUBJECT_ID ;
   private long[] H001I4_A282TBT01_STUDY_ID ;
   private String[] H001I4_A613TBT01_SITE_ID ;
   private boolean[] H001I4_n613TBT01_SITE_ID ;
   private String[] H001I5_A139TAM08_DEL_FLG ;
   private boolean[] H001I5_n139TAM08_DEL_FLG ;
   private String[] H001I5_A132TAM08_SITE_ID ;
   private String[] H001I5_A133TAM08_SITE_NM ;
   private boolean[] H001I5_n133TAM08_SITE_NM ;
   private String[] H001I6_A307TBT11_DEL_FLG ;
   private boolean[] H001I6_n307TBT11_DEL_FLG ;
   private java.util.Date[] H001I6_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001I6_n578TBT11_DM_ARRIVAL_DATETIME ;
   private short[] H001I6_A305TBT11_CRF_ID ;
   private int[] H001I6_A304TBT11_SUBJECT_ID ;
   private long[] H001I6_A303TBT11_STUDY_ID ;
   private String[] H001I6_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] H001I6_n577TBT11_DM_ARRIVAL_FLG ;
   private String[] H001I6_A583TBT11_INPUT_END_FLG ;
   private boolean[] H001I6_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] H001I6_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] H001I6_n574TBT11_UPLOAD_DATETIME ;
   private String[] H001I6_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] H001I6_n575TBT11_UPLOAD_USER_ID ;
   private String[] H001I6_A884TBT11_UPD_RIYU ;
   private boolean[] H001I6_n884TBT11_UPD_RIYU ;
   private short[] H001I6_A306TBT11_CRF_VERSION ;
   private String[] H001I7_A8TAM07_USER_ID ;
   private String[] H001I7_A2TAM07_USER_NM ;
   private boolean[] H001I7_n2TAM07_USER_NM ;
   private GxObjectCollection AV22W_B717_SD01_REKIINFO_CRF_LIST ;
   private SdtA_PAGING_SDT AV13H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem Currentitem0 ;
   private SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem AV23W_B717_SD01_REKIINFO_CRF_LIST_Item ;
}

final  class b717_wp01_rekiinfo_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001I2", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001I3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001I4", "SELECT `TBT01_DEL_FLG`, `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE (`TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?) AND (`TBT01_DEL_FLG` = '0') ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001I5", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001I6", "SELECT `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_INPUT_END_FLG`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPD_RIYU`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?) AND (Not (`TBT11_DM_ARRIVAL_DATETIME` = '1000-01-01')) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001I7", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
      }
   }

}

