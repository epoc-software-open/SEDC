/*
               File: b717_wp01_rekiinfo_crf_impl
        Description: CRF履歴詳細情報画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:28:2.95
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
            nRC_GXsfl_182 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_182_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_182_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_182, nGXsfl_182_idx, sGXsfl_182_idx) ;
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
            AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
               AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
               AV34P_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34P_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV34P_CRF_EDA_NO, 2, 0)));
            }
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
         pa1L2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1L2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1L2( ) ;
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
      httpContext.writeValue( "CRF履歴詳細情報画面") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2020715132834");
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
      GXEncryptionTmp = "b717_wp01_rekiinfo_crf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV34P_CRF_EDA_NO,2,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b717_wp01_rekiinfo_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1L2( )
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
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_182", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_182, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV52Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_DEL_FLG", GXutil.rtrim( A369TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vP_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( AV18P_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV16P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_NM", GXutil.rtrim( A393TBM31_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( AV34P_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A87TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A88TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_DEL_FLG", GXutil.rtrim( A441TBT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SITE_ID", GXutil.rtrim( A698TBT01_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_ID", GXutil.rtrim( A57TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_DEL_FLG", GXutil.rtrim( A325TAM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_NM", GXutil.rtrim( A319TAM08_SITE_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A92TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A93TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_ID", GXutil.ltrim( localUtil.ntoc( A94TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( A95TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A936TBT11_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_DEL_FLG", GXutil.rtrim( A457TBT11_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_DM_ARRIVAL_FLG", GXutil.rtrim( A669TBT11_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_INPUT_END_FLG", GXutil.rtrim( A675TBT11_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_UPLOAD_USER_ID", GXutil.rtrim( A667TBT11_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_NM", GXutil.rtrim( AV29W_TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_UPD_RIYU", GXutil.rtrim( A891TBT11_UPD_RIYU));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_SIGNATURE_FLG", GXutil.rtrim( A993TBT11_SIGNATURE_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_SIGNATURE_USER_ID", GXutil.rtrim( A995TBT11_SIGNATURE_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV21W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vW_JS", GXutil.rtrim( AV33W_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_ID", GXutil.rtrim( AV40W_TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
      }
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "B717_WP01_REKIINFO_CRF" ;
   }

   public String getPgmdesc( )
   {
      return "CRF履歴詳細情報画面" ;
   }

   public void wb1L0( )
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
         wb_table1_2_1L2( true) ;
      }
      else
      {
         wb_table1_2_1L2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_203_1L2( true) ;
      }
      else
      {
         wb_table2_203_1L2( false) ;
      }
      return  ;
   }

   public void wb_table2_203_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1L2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF履歴詳細情報画面", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1L0( ) ;
   }

   public void ws1L2( )
   {
      start1L2( ) ;
      evt1L2( ) ;
   }

   public void evt1L2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_EXIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111L2 */
                        e111L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121L2 */
                        e121L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131L2 */
                        e131L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141L2 */
                        e141L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151L2 */
                        e151L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161L2 */
                        e161L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171L2 */
                        e171L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181L2 */
                        e181L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191L2 */
                        e191L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201L2 */
                        e201L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211L2 */
                        e211L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221L2 */
                        e221L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231L2 */
                        e231L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241L2 */
                        e241L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251L2 */
                        e251L2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_182_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1822( ) ;
                        AV43GXV1 = (short)(nGXsfl_182_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV22W_B717_SD01_REKIINFO_CRF_LIST.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
                        {
                           AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt11_crf_version_Internalname), ".", ",")) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( httpContext.cgiGet( edtavCtldm_arrival_Internalname) );
                           AV39D_GRD_SIGN = httpContext.cgiGet( edtavD_grd_sign_Internalname) ;
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( httpContext.cgiGet( edtavCtlinput_end_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( httpContext.cgiGet( edtavCtltam07_user_nm_Internalname) );
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( httpContext.cgiGet( edtavCtltbt11_upload_datetime_vc_Internalname) );
                           AV37D_SYOMEI_NM = httpContext.cgiGet( edtavD_syomei_nm_Internalname) ;
                           AV38D_SYOMEI_DTTM = httpContext.cgiGet( edtavD_syomei_dttm_Internalname) ;
                           ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( httpContext.cgiGet( edtavCtltbt11_upd_riyu_Internalname) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e261L2 */
                              e261L2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e271L2 */
                              e271L2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281L2 */
                              e281L2 ();
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

   public void we1L2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1L2( ) ;
         }
      }
   }

   public void pa1L2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b717_wp01_rekiinfo_crf")), "b717_wp01_rekiinfo_crf") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b717_wp01_rekiinfo_crf"))) ;
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
                  AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV18P_SUBJECT_ID, 6, 0)));
                     AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
                     AV34P_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV34P_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV34P_CRF_EDA_NO, 2, 0)));
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_182 ,
                                 short nGXsfl_182_idx ,
                                 String sGXsfl_182_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1822( ) ;
      while ( nGXsfl_182_idx <= nRC_GXsfl_182 )
      {
         sendrow_1822( ) ;
         nGXsfl_182_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_182_idx+1)) ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1L2( ) ;
      /* End function Refresh */
   }

   public void rf1L2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
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
      wbStart = (short)(182) ;
      nGXsfl_182_idx = (short)(1) ;
      sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1822( ) ;
      nGXsfl_182_Refreshing = (short)(1) ;
      /* Execute user event: e271L2 */
      e271L2 ();
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1822( ) ;
         /* Execute user event: e281L2 */
         e281L2 ();
         wbEnd = (short)(182) ;
         wb1L0( ) ;
      }
      nGXsfl_182_Refreshing = (short)(0) ;
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
      return AV22W_B717_SD01_REKIINFO_CRF_LIST.size() ;
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

   public void strup1L0( )
   {
      /* Before Start, stand alone formulas. */
      AV52Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV51Pgmdesc = "CRF履歴詳細情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_nm_Enabled, 5, 0)));
      edtavD_subject_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_subject_id_Enabled, 5, 0)));
      edtavD_crf_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_nm_Enabled, 5, 0)));
      edtavD_crf_snm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crf_snm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crf_snm_Enabled, 5, 0)));
      edtavD_visit_no_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_visit_no_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_visit_no_Enabled, 5, 0)));
      edtavD_site_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_site_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_site_nm_Enabled, 5, 0)));
      edtavCtltbt11_crf_version_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavD_grd_sign_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavD_syomei_nm_Enabled = 0 ;
      edtavD_syomei_dttm_Enabled = 0 ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e261L2 */
      e261L2 ();
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
         AV8D_CRF_NM = httpContext.cgiGet( edtavD_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRF_NM", AV8D_CRF_NM);
         AV9D_CRF_SNM = httpContext.cgiGet( edtavD_crf_snm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_visit_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_visit_no_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_VISIT_NO");
            GX_FocusControl = edtavD_visit_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35D_VISIT_NO = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35D_VISIT_NO", GXutil.ltrim( GXutil.str( AV35D_VISIT_NO, 6, 0)));
         }
         else
         {
            AV35D_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_visit_no_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35D_VISIT_NO", GXutil.ltrim( GXutil.str( AV35D_VISIT_NO, 6, 0)));
         }
         AV10D_SITE_NM = httpContext.cgiGet( edtavD_site_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_NM", AV10D_SITE_NM);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV15H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
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
         /* Read saved values. */
         nRC_GXsfl_182 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_182"), ".", ",")) ;
         AV17P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV18P_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "vP_SUBJECT_ID"), ".", ",")) ;
         AV16P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
         AV34P_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_EDA_NO"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_182 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_182"), ".", ",")) ;
         nGXsfl_182_fel_idx = (short)(0) ;
         while ( nGXsfl_182_fel_idx < nRC_GXsfl_182 )
         {
            nGXsfl_182_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_182_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_182_fel_idx+1)) ;
            sGXsfl_182_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1822( ) ;
            AV43GXV1 = (short)(nGXsfl_182_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV43GXV1 = (short)(nGXsfl_182_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV22W_B717_SD01_REKIINFO_CRF_LIST.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
            {
               AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt11_crf_version_Internalname), ".", ",")) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( httpContext.cgiGet( edtavCtldm_arrival_Internalname) );
               AV39D_GRD_SIGN = httpContext.cgiGet( edtavD_grd_sign_Internalname) ;
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( httpContext.cgiGet( edtavCtlinput_end_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( httpContext.cgiGet( edtavCtltam07_user_nm_Internalname) );
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( httpContext.cgiGet( edtavCtltbt11_upload_datetime_vc_Internalname) );
               AV37D_SYOMEI_NM = httpContext.cgiGet( edtavD_syomei_nm_Internalname) ;
               AV38D_SYOMEI_DTTM = httpContext.cgiGet( edtavD_syomei_dttm_Internalname) ;
               ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( httpContext.cgiGet( edtavCtltbt11_upd_riyu_Internalname) );
            }
            AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)) );
         }
         if ( nGXsfl_182_fel_idx == 0 )
         {
            nGXsfl_182_idx = (short)(1) ;
            sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1822( ) ;
         }
         nGXsfl_182_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e261L2 */
      e261L2 ();
      if (returnInSub) return;
   }

   public void e261L2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B717" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV51Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
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

   public void e271L2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV52Pgmname, "INFO", "画面起動") ;
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

   public void e111L2( )
   {
      /* 'BTN_EXIT' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
      /* Using cursor H001L2 */
      pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A369TBM21_DEL_FLG = H001L2_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001L2_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H001L2_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001L2_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001L2_n367TBM21_STUDY_NM[0] ;
         AV11D_STUDY_NM = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_STUDY_NM", AV11D_STUDY_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV12D_SUBJECT_ID = AV18P_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV12D_SUBJECT_ID, 6, 0)));
      /* Using cursor H001L3 */
      pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A397TBM31_DEL_FLG = H001L3_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001L3_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = H001L3_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001L3_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A393TBM31_CRF_NM = H001L3_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = H001L3_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = H001L3_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H001L3_n642TBM31_CRF_SNM[0] ;
         AV8D_CRF_NM = A393TBM31_CRF_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRF_NM", AV8D_CRF_NM);
         AV9D_CRF_SNM = A642TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_CRF_SNM", AV9D_CRF_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor H001L4 */
      pr_default.execute(2, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID), new Byte(AV34P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A947TBM44_CRF_EDA_NO = H001L4_A947TBM44_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
         A946TBM44_CRF_ID = H001L4_A946TBM44_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
         A945TBM44_STUDY_ID = H001L4_A945TBM44_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
         A948TBM44_VISIT_NO = H001L4_A948TBM44_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
         n948TBM44_VISIT_NO = H001L4_n948TBM44_VISIT_NO[0] ;
         AV35D_VISIT_NO = A948TBM44_VISIT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35D_VISIT_NO", GXutil.ltrim( GXutil.str( AV35D_VISIT_NO, 6, 0)));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor H001L5 */
      pr_default.execute(3, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A441TBT01_DEL_FLG = H001L5_A441TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441TBT01_DEL_FLG", A441TBT01_DEL_FLG);
         n441TBT01_DEL_FLG = H001L5_n441TBT01_DEL_FLG[0] ;
         A88TBT01_SUBJECT_ID = H001L5_A88TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
         A87TBT01_STUDY_ID = H001L5_A87TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
         A698TBT01_SITE_ID = H001L5_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H001L5_n698TBT01_SITE_ID[0] ;
         AV28W_SITE_ID = A698TBT01_SITE_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_SITE_ID", AV28W_SITE_ID);
         /* Using cursor H001L6 */
         pr_default.execute(4, new Object[] {AV28W_SITE_ID});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A325TAM08_DEL_FLG = H001L6_A325TAM08_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
            n325TAM08_DEL_FLG = H001L6_n325TAM08_DEL_FLG[0] ;
            A57TAM08_SITE_ID = H001L6_A57TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
            A319TAM08_SITE_NM = H001L6_A319TAM08_SITE_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
            n319TAM08_SITE_NM = H001L6_n319TAM08_SITE_NM[0] ;
            AV10D_SITE_NM = A319TAM08_SITE_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_NM", AV10D_SITE_NM);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV22W_B717_SD01_REKIINFO_CRF_LIST.clear();
      gx_BV182 = true ;
      /* Using cursor H001L7 */
      pr_default.execute(5, new Object[] {new Long(AV17P_STUDY_ID), new Integer(AV18P_SUBJECT_ID), new Short(AV16P_CRF_ID), new Byte(AV34P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A92TBT11_STUDY_ID = H001L7_A92TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
         A93TBT11_SUBJECT_ID = H001L7_A93TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
         A94TBT11_CRF_ID = H001L7_A94TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
         A936TBT11_CRF_EDA_NO = H001L7_A936TBT11_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
         A457TBT11_DEL_FLG = H001L7_A457TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
         n457TBT11_DEL_FLG = H001L7_n457TBT11_DEL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = H001L7_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n670TBT11_DM_ARRIVAL_DATETIME = H001L7_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A669TBT11_DM_ARRIVAL_FLG = H001L7_A669TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
         n669TBT11_DM_ARRIVAL_FLG = H001L7_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A675TBT11_INPUT_END_FLG = H001L7_A675TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675TBT11_INPUT_END_FLG", A675TBT11_INPUT_END_FLG);
         n675TBT11_INPUT_END_FLG = H001L7_n675TBT11_INPUT_END_FLG[0] ;
         A666TBT11_UPLOAD_DATETIME = H001L7_A666TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n666TBT11_UPLOAD_DATETIME = H001L7_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = H001L7_A667TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667TBT11_UPLOAD_USER_ID", A667TBT11_UPLOAD_USER_ID);
         n667TBT11_UPLOAD_USER_ID = H001L7_n667TBT11_UPLOAD_USER_ID[0] ;
         A891TBT11_UPD_RIYU = H001L7_A891TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A891TBT11_UPD_RIYU", A891TBT11_UPD_RIYU);
         n891TBT11_UPD_RIYU = H001L7_n891TBT11_UPD_RIYU[0] ;
         A993TBT11_SIGNATURE_FLG = H001L7_A993TBT11_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A993TBT11_SIGNATURE_FLG", A993TBT11_SIGNATURE_FLG);
         n993TBT11_SIGNATURE_FLG = H001L7_n993TBT11_SIGNATURE_FLG[0] ;
         A994TBT11_SIGNATURE_DATETIME = H001L7_A994TBT11_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n994TBT11_SIGNATURE_DATETIME = H001L7_n994TBT11_SIGNATURE_DATETIME[0] ;
         A995TBT11_SIGNATURE_USER_ID = H001L7_A995TBT11_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A995TBT11_SIGNATURE_USER_ID", A995TBT11_SIGNATURE_USER_ID);
         n995TBT11_SIGNATURE_USER_ID = H001L7_n995TBT11_SIGNATURE_USER_ID[0] ;
         A95TBT11_CRF_VERSION = H001L7_A95TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
         AV30W_TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( AV30W_TBT11_CRF_VERSION, 4, 0)));
         if ( GXutil.strcmp(A669TBT11_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV24W_DM_ARRIVAL = "済" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_DM_ARRIVAL", AV24W_DM_ARRIVAL);
         }
         else
         {
            AV24W_DM_ARRIVAL = "差戻" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_DM_ARRIVAL", AV24W_DM_ARRIVAL);
         }
         if ( GXutil.strcmp(A675TBT11_INPUT_END_FLG, "1") == 0 )
         {
            AV26W_INPUT_END = "済" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_INPUT_END", AV26W_INPUT_END);
         }
         else
         {
            AV26W_INPUT_END = "未" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_INPUT_END", AV26W_INPUT_END);
         }
         AV31W_TBT11_UPLOAD_DATETIME = A666TBT11_UPLOAD_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31W_TBT11_UPLOAD_DATETIME", localUtil.ttoc( AV31W_TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         AV32W_TBT11_UPLOAD_USER_ID = A667TBT11_UPLOAD_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32W_TBT11_UPLOAD_USER_ID", AV32W_TBT11_UPLOAD_USER_ID);
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
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV31W_TBT11_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
            b717_wp01_rekiinfo_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_TBT11_UPLOAD_DATETIME", localUtil.ttoc( AV31W_TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( GXt_char1 );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         }
         AV40W_TAM07_USER_ID = AV32W_TBT11_UPLOAD_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40W_TAM07_USER_ID", AV40W_TAM07_USER_ID);
         /* Execute user subroutine: S178 */
         S178 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( AV29W_TAM07_USER_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( A891TBT11_UPD_RIYU );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg( A993TBT11_SIGNATURE_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime( A994TBT11_SIGNATURE_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV40W_TAM07_USER_ID = A995TBT11_SIGNATURE_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40W_TAM07_USER_ID", AV40W_TAM07_USER_ID);
         /* Execute user subroutine: S178 */
         S178 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm( AV29W_TAM07_USER_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV22W_B717_SD01_REKIINFO_CRF_LIST.add(AV23W_B717_SD01_REKIINFO_CRF_LIST_Item, 0);
         gx_BV182 = true ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV30W_TBT11_CRF_VERSION = (short)(AV22W_B717_SD01_REKIINFO_CRF_LIST.size()) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( AV30W_TBT11_CRF_VERSION, 4, 0)));
      AV59GXV9 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59GXV9", GXutil.ltrim( GXutil.str( AV59GXV9, 8, 0)));
      while ( AV59GXV9 <= AV22W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV59GXV9));
         AV23W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( AV30W_TBT11_CRF_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_B717_SD01_REKIINFO_CRF_LIST_Item", AV23W_B717_SD01_REKIINFO_CRF_LIST_Item);
         AV30W_TBT11_CRF_VERSION = (short)(AV30W_TBT11_CRF_VERSION-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( AV30W_TBT11_CRF_VERSION, 4, 0)));
         AV59GXV9 = (int)(AV59GXV9+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59GXV9", GXutil.ltrim( GXutil.str( AV59GXV9, 8, 0)));
      }
   }

   public void S178( )
   {
      /* 'SUB_USER_NM_GET' Routine */
      AV29W_TAM07_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_TAM07_USER_NM", AV29W_TAM07_USER_NM);
      /* Using cursor H001L8 */
      pr_default.execute(6, new Object[] {AV40W_TAM07_USER_ID});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A55TAM07_USER_ID = H001L8_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A205TAM07_USER_NM = H001L8_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = H001L8_n205TAM07_USER_NM[0] ;
         AV29W_TAM07_USER_NM = A205TAM07_USER_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_TAM07_USER_NM", AV29W_TAM07_USER_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV19W_A_LOGIN_SDT;
      GXv_char2[0] = AV25W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b717_wp01_rekiinfo_crf_impl.this.AV25W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERRCD", AV25W_ERRCD);
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      AV20W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_A819_JS", AV20W_A819_JS);
      AV33W_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33W_JS", AV33W_JS);
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

   public void S182( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV52Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b717_wp01_rekiinfo_crf");
   }

   public void e121L2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e131L2( )
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

   public void e141L2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e151L2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161L2( )
   {
      /* 'PAGE01' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e171L2( )
   {
      /* 'PAGE02' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181L2( )
   {
      /* 'PAGE03' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191L2( )
   {
      /* 'PAGE04' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201L2( )
   {
      /* 'PAGE05' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211L2( )
   {
      /* 'PAGE06' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221L2( )
   {
      /* 'PAGE07' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231L2( )
   {
      /* 'PAGE08' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241L2( )
   {
      /* 'PAGE09' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251L2( )
   {
      /* 'PAGE10' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      AV13H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13H_A_PAGING_SDT", AV13H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT4[0] = AV13H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV13H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
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

   private void e281L2( )
   {
      /* Grid1_Load Routine */
      AV43GXV1 = (short)(1) ;
      while ( AV43GXV1 <= AV22W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_B717_SD01_REKIINFO_CRF_LIST", AV22W_B717_SD01_REKIINFO_CRF_LIST);
         if ( GXutil.strcmp(((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)(AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem())).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg(), "1") == 0 )
         {
            AV39D_GRD_SIGN = "済" ;
            AV37D_SYOMEI_NM = ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)(AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem())).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm() ;
            GXt_char1 = AV38D_SYOMEI_DTTM ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)(AV22W_B717_SD01_REKIINFO_CRF_LIST.currentItem())).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime(), "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
            b717_wp01_rekiinfo_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV38D_SYOMEI_DTTM = GXt_char1 ;
         }
         else
         {
            AV39D_GRD_SIGN = "未" ;
            AV37D_SYOMEI_NM = "" ;
            AV38D_SYOMEI_DTTM = "" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(182) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1822( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV43GXV1 = (short)(AV43GXV1+1) ;
      }
   }

   public void wb_table2_203_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(207);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(208);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_203_1L2e( true) ;
      }
      else
      {
         wb_table2_203_1L2e( false) ;
      }
   }

   public void wb_table1_2_1L2( boolean wbgen )
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"vertical-align:top\">") ;
         wb_table3_6_1L2( true) ;
      }
      else
      {
         wb_table3_6_1L2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1L2e( boolean wbgen )
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
         wb_table1_2_1L2e( true) ;
      }
      else
      {
         wb_table1_2_1L2e( false) ;
      }
   }

   public void wb_table3_6_1L2( boolean wbgen )
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
         wb_table4_11_1L2( true) ;
      }
      else
      {
         wb_table4_11_1L2( false) ;
      }
      return  ;
   }

   public void wb_table4_11_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"vertical-align:top\">") ;
         wb_table5_26_1L2( true) ;
      }
      else
      {
         wb_table5_26_1L2( false) ;
      }
      return  ;
   }

   public void wb_table5_26_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_6_1L2e( true) ;
      }
      else
      {
         wb_table3_6_1L2e( false) ;
      }
   }

   public void wb_table5_26_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 460, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 900, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table6_29_1L2( true) ;
      }
      else
      {
         wb_table6_29_1L2( false) ;
      }
      return  ;
   }

   public void wb_table6_29_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_26_1L2e( true) ;
      }
      else
      {
         wb_table5_26_1L2e( false) ;
      }
   }

   public void wb_table6_29_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table7_32_1L2( true) ;
      }
      else
      {
         wb_table7_32_1L2( false) ;
      }
      return  ;
   }

   public void wb_table7_32_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr style=\"vertical-align:top\">") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_67_1L2( true) ;
      }
      else
      {
         wb_table8_67_1L2( false) ;
      }
      return  ;
   }

   public void wb_table8_67_1L2e( boolean wbgen )
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
         wb_table9_162_1L2( true) ;
      }
      else
      {
         wb_table9_162_1L2( false) ;
      }
      return  ;
   }

   public void wb_table9_162_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"182\">") ;
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
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_crf_version_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldm_arrival_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV39D_GRD_SIGN));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_sign_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlinput_end_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltam07_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_upload_datetime_vc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV37D_SYOMEI_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_syomei_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV38D_SYOMEI_DTTM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_syomei_dttm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt11_upd_riyu_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 182 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_182 = (short)(nGXsfl_182_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV43GXV1 = nGXsfl_182_idx ;
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
         wb_table6_29_1L2e( true) ;
      }
      else
      {
         wb_table6_29_1L2e( false) ;
      }
   }

   public void wb_table9_162_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px;width:55px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "更新Ver", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "DM<br>到着", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(1), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "署名", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, "データ<br>固定", "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(1), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "更新者", "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "更新日時", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, "署名者", "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "署名日時", "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:225px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "変更理由", "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_162_1L2e( true) ;
      }
      else
      {
         wb_table9_162_1L2e( false) ;
      }
   }

   public void wb_table8_67_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_73_1L2( true) ;
      }
      else
      {
         wb_table10_73_1L2( false) ;
      }
      return  ;
   }

   public void wb_table10_73_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_67_1L2e( true) ;
      }
      else
      {
         wb_table8_67_1L2e( false) ;
      }
   }

   public void wb_table10_73_1L2( boolean wbgen )
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
         wb_table11_76_1L2( true) ;
      }
      else
      {
         wb_table11_76_1L2( false) ;
      }
      return  ;
   }

   public void wb_table11_76_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table12_82_1L2( true) ;
      }
      else
      {
         wb_table12_82_1L2( false) ;
      }
      return  ;
   }

   public void wb_table12_82_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_88_1L2( true) ;
      }
      else
      {
         wb_table13_88_1L2( false) ;
      }
      return  ;
   }

   public void wb_table13_88_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_94_1L2( true) ;
      }
      else
      {
         wb_table14_94_1L2( false) ;
      }
      return  ;
   }

   public void wb_table14_94_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_100_1L2( true) ;
      }
      else
      {
         wb_table15_100_1L2( false) ;
      }
      return  ;
   }

   public void wb_table15_100_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_106_1L2( true) ;
      }
      else
      {
         wb_table16_106_1L2( false) ;
      }
      return  ;
   }

   public void wb_table16_106_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_112_1L2( true) ;
      }
      else
      {
         wb_table17_112_1L2( false) ;
      }
      return  ;
   }

   public void wb_table17_112_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_118_1L2( true) ;
      }
      else
      {
         wb_table18_118_1L2( false) ;
      }
      return  ;
   }

   public void wb_table18_118_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_124_1L2( true) ;
      }
      else
      {
         wb_table19_124_1L2( false) ;
      }
      return  ;
   }

   public void wb_table19_124_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_130_1L2( true) ;
      }
      else
      {
         wb_table20_130_1L2( false) ;
      }
      return  ;
   }

   public void wb_table20_130_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_136_1L2( true) ;
      }
      else
      {
         wb_table21_136_1L2( false) ;
      }
      return  ;
   }

   public void wb_table21_136_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_142_1L2( true) ;
      }
      else
      {
         wb_table22_142_1L2( false) ;
      }
      return  ;
   }

   public void wb_table22_142_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_148_1L2( true) ;
      }
      else
      {
         wb_table23_148_1L2( false) ;
      }
      return  ;
   }

   public void wb_table23_148_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_154_1L2( true) ;
      }
      else
      {
         wb_table24_154_1L2( false) ;
      }
      return  ;
   }

   public void wb_table24_154_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_73_1L2e( true) ;
      }
      else
      {
         wb_table10_73_1L2e( false) ;
      }
   }

   public void wb_table24_154_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_154_1L2e( true) ;
      }
      else
      {
         wb_table24_154_1L2e( false) ;
      }
   }

   public void wb_table23_148_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_148_1L2e( true) ;
      }
      else
      {
         wb_table23_148_1L2e( false) ;
      }
   }

   public void wb_table22_142_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_142_1L2e( true) ;
      }
      else
      {
         wb_table22_142_1L2e( false) ;
      }
   }

   public void wb_table21_136_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_136_1L2e( true) ;
      }
      else
      {
         wb_table21_136_1L2e( false) ;
      }
   }

   public void wb_table20_130_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_130_1L2e( true) ;
      }
      else
      {
         wb_table20_130_1L2e( false) ;
      }
   }

   public void wb_table19_124_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_124_1L2e( true) ;
      }
      else
      {
         wb_table19_124_1L2e( false) ;
      }
   }

   public void wb_table18_118_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_118_1L2e( true) ;
      }
      else
      {
         wb_table18_118_1L2e( false) ;
      }
   }

   public void wb_table17_112_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_112_1L2e( true) ;
      }
      else
      {
         wb_table17_112_1L2e( false) ;
      }
   }

   public void wb_table16_106_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_106_1L2e( true) ;
      }
      else
      {
         wb_table16_106_1L2e( false) ;
      }
   }

   public void wb_table15_100_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_100_1L2e( true) ;
      }
      else
      {
         wb_table15_100_1L2e( false) ;
      }
   }

   public void wb_table14_94_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_94_1L2e( true) ;
      }
      else
      {
         wb_table14_94_1L2e( false) ;
      }
   }

   public void wb_table13_88_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_88_1L2e( true) ;
      }
      else
      {
         wb_table13_88_1L2e( false) ;
      }
   }

   public void wb_table12_82_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_82_1L2e( true) ;
      }
      else
      {
         wb_table12_82_1L2e( false) ;
      }
   }

   public void wb_table11_76_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_76_1L2e( true) ;
      }
      else
      {
         wb_table11_76_1L2e( false) ;
      }
   }

   public void wb_table7_32_1L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "▼CRF情報", "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#FFFFFF;", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "試験名", "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:320px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV11D_STUDY_NM), GXutil.rtrim( localUtil.format( AV11D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_study_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "患者No", "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:320px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV12D_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtavD_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12D_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12D_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_subject_id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, "CRF名", "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_nm_Internalname, GXutil.rtrim( AV8D_CRF_NM), GXutil.rtrim( localUtil.format( AV8D_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crf_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_crf_nm_Enabled, 0, "text", "", 190, "px", 17, "px", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "CRF略称", "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_snm_Internalname, GXutil.rtrim( AV9D_CRF_SNM), GXutil.rtrim( localUtil.format( AV9D_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crf_snm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_crf_snm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "VISIT番号", "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_visit_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV35D_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtavD_visit_no_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35D_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV35D_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_visit_no_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_visit_no_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, "施設名", "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_site_nm_Internalname, GXutil.rtrim( AV10D_SITE_NM), GXutil.rtrim( localUtil.format( AV10D_SITE_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_site_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_site_nm_Enabled, 0, "text", "", 190, "px", 17, "px", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_32_1L2e( true) ;
      }
      else
      {
         wb_table7_32_1L2e( false) ;
      }
   }

   public void wb_table4_11_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "詳細情報", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table25_17_1L2( true) ;
      }
      else
      {
         wb_table25_17_1L2( false) ;
      }
      return  ;
   }

   public void wb_table25_17_1L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_11_1L2e( true) ;
      }
      else
      {
         wb_table4_11_1L2e( false) ;
      }
   }

   public void wb_table25_17_1L2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_exit_Internalname, "閉じる", "", "", lblTxt_btn_exit_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EXIT\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B717_WP01_REKIINFO_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"6\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_17_1L2e( true) ;
      }
      else
      {
         wb_table25_17_1L2e( false) ;
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
      AV34P_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34P_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV34P_CRF_EDA_NO, 2, 0)));
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
      pa1L2( ) ;
      ws1L2( ) ;
      we1L2( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151328818");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b717_wp01_rekiinfo_crf.js", "?20207151328820");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1822( )
   {
      edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_182_idx ;
      edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_182_idx ;
      edtavD_grd_sign_Internalname = "vD_GRD_SIGN_"+sGXsfl_182_idx ;
      edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_182_idx ;
      edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_182_idx ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_182_idx ;
      edtavD_syomei_nm_Internalname = "vD_SYOMEI_NM_"+sGXsfl_182_idx ;
      edtavD_syomei_dttm_Internalname = "vD_SYOMEI_DTTM_"+sGXsfl_182_idx ;
      edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_182_idx ;
   }

   public void subsflControlProps_fel_1822( )
   {
      edtavCtltbt11_crf_version_Internalname = "CTLTBT11_CRF_VERSION_"+sGXsfl_182_fel_idx ;
      edtavCtldm_arrival_Internalname = "CTLDM_ARRIVAL_"+sGXsfl_182_fel_idx ;
      edtavD_grd_sign_Internalname = "vD_GRD_SIGN_"+sGXsfl_182_fel_idx ;
      edtavCtlinput_end_Internalname = "CTLINPUT_END_"+sGXsfl_182_fel_idx ;
      edtavCtltam07_user_nm_Internalname = "CTLTAM07_USER_NM_"+sGXsfl_182_fel_idx ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "CTLTBT11_UPLOAD_DATETIME_VC_"+sGXsfl_182_fel_idx ;
      edtavD_syomei_nm_Internalname = "vD_SYOMEI_NM_"+sGXsfl_182_fel_idx ;
      edtavD_syomei_dttm_Internalname = "vD_SYOMEI_DTTM_"+sGXsfl_182_fel_idx ;
      edtavCtltbt11_upd_riyu_Internalname = "CTLTBT11_UPD_RIYU_"+sGXsfl_182_fel_idx ;
   }

   public void sendrow_1822( )
   {
      subsflControlProps_1822( ) ;
      wb1L0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_182_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_182_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xF5F5F5) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_182_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_182_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_182_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_182_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:25px;width:55px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt11_crf_version_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbt11_crf_version_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt11_crf_version_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt11_crf_version_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:40px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldm_arrival_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldm_arrival_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldm_arrival_Enabled),new Integer(0),"text","",new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:40px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_sign_Internalname,GXutil.rtrim( AV39D_GRD_SIGN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_sign_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_sign_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:40px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlinput_end_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlinput_end_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtlinput_end_Enabled),new Integer(0),"text","",new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltam07_user_nm_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltam07_user_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltam07_user_nm_Enabled),new Integer(0),"text","",new Integer(210),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt11_upload_datetime_vc_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt11_upload_datetime_vc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt11_upload_datetime_vc_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_syomei_nm_Internalname,GXutil.rtrim( AV37D_SYOMEI_NM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_syomei_nm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_syomei_nm_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_syomei_dttm_Internalname,GXutil.rtrim( AV38D_SYOMEI_DTTM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_syomei_dttm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_syomei_dttm_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:225px\""});
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt11_upd_riyu_Internalname,GXutil.rtrim( ((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV22W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV43GXV1)).getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu()),"","",new Integer(0),new Integer(1),new Integer(edtavCtltbt11_upd_riyu_Enabled),new Integer(0),new Integer(220),"px",new Integer(3),"row",StyleString,ClassString,"","2000",new Integer(1),"","",new Integer(-1),new Boolean(true),""});
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
               if ( ((int)((nGXsfl_182_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_182_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_182_idx+1)) ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
      }
      /* End function sendrow_1822 */
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
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtavD_crf_nm_Internalname = "vD_CRF_NM" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crf_snm_Internalname = "vD_CRF_SNM" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavD_visit_no_Internalname = "vD_VISIT_NO" ;
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
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_syomei_dttm_Jsonclick = "" ;
      edtavD_syomei_nm_Jsonclick = "" ;
      edtavCtltbt11_upload_datetime_vc_Jsonclick = "" ;
      edtavCtltam07_user_nm_Jsonclick = "" ;
      edtavCtlinput_end_Jsonclick = "" ;
      edtavD_grd_sign_Jsonclick = "" ;
      edtavCtldm_arrival_Jsonclick = "" ;
      edtavCtltbt11_crf_version_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      edtavD_site_nm_Jsonclick = "" ;
      edtavD_site_nm_Enabled = 1 ;
      edtavD_visit_no_Jsonclick = "" ;
      edtavD_visit_no_Enabled = 1 ;
      edtavD_crf_snm_Jsonclick = "" ;
      edtavD_crf_snm_Enabled = 1 ;
      edtavD_crf_nm_Jsonclick = "" ;
      edtavD_crf_nm_Enabled = 1 ;
      edtavD_subject_id_Jsonclick = "" ;
      edtavD_subject_id_Enabled = 1 ;
      edtavD_study_nm_Jsonclick = "" ;
      edtavD_study_nm_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
      edtavD_syomei_dttm_Enabled = 0 ;
      edtavD_syomei_nm_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavD_grd_sign_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavCtltbt11_crf_version_Enabled = 0 ;
      edtavCtlrec_cnt_Jsonclick = "" ;
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
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      subGrid1_Rows = 10 ;
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
                  /* Execute user subroutine: S182 */
                  S182 ();
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
      AV22W_B717_SD01_REKIINFO_CRF_LIST = new GxObjectCollection(SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem.class, "B717_SD01_REKIINFO_CRF_LIST.B717_SD01_REKIINFO_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV13H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV52Pgmname = "" ;
      A369TBM21_DEL_FLG = "" ;
      A367TBM21_STUDY_NM = "" ;
      A397TBM31_DEL_FLG = "" ;
      A393TBM31_CRF_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A441TBT01_DEL_FLG = "" ;
      A698TBT01_SITE_ID = "" ;
      A57TAM08_SITE_ID = "" ;
      A325TAM08_DEL_FLG = "" ;
      A319TAM08_SITE_NM = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A457TBT11_DEL_FLG = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A667TBT11_UPLOAD_USER_ID = "" ;
      AV29W_TAM07_USER_NM = "" ;
      A891TBT11_UPD_RIYU = "" ;
      A993TBT11_SIGNATURE_FLG = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A995TBT11_SIGNATURE_USER_ID = "" ;
      AV21W_A821_JS = "" ;
      AV33W_JS = "" ;
      A55TAM07_USER_ID = "" ;
      AV40W_TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavCtltbt11_crf_version_Internalname = "" ;
      edtavCtldm_arrival_Internalname = "" ;
      AV39D_GRD_SIGN = "" ;
      edtavD_grd_sign_Internalname = "" ;
      edtavCtlinput_end_Internalname = "" ;
      edtavCtltam07_user_nm_Internalname = "" ;
      edtavCtltbt11_upload_datetime_vc_Internalname = "" ;
      AV37D_SYOMEI_NM = "" ;
      edtavD_syomei_nm_Internalname = "" ;
      AV38D_SYOMEI_DTTM = "" ;
      edtavD_syomei_dttm_Internalname = "" ;
      edtavCtltbt11_upd_riyu_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV51Pgmdesc = "" ;
      AV11D_STUDY_NM = "" ;
      AV8D_CRF_NM = "" ;
      AV9D_CRF_SNM = "" ;
      AV10D_SITE_NM = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      scmdbuf = "" ;
      H001L2_A369TBM21_DEL_FLG = new String[] {""} ;
      H001L2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001L2_A63TBM21_STUDY_ID = new long[1] ;
      H001L2_A367TBM21_STUDY_NM = new String[] {""} ;
      H001L2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H001L3_A397TBM31_DEL_FLG = new String[] {""} ;
      H001L3_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001L3_A69TBM31_CRF_ID = new short[1] ;
      H001L3_A68TBM31_STUDY_ID = new long[1] ;
      H001L3_A393TBM31_CRF_NM = new String[] {""} ;
      H001L3_n393TBM31_CRF_NM = new boolean[] {false} ;
      H001L3_A642TBM31_CRF_SNM = new String[] {""} ;
      H001L3_n642TBM31_CRF_SNM = new boolean[] {false} ;
      H001L4_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001L4_A946TBM44_CRF_ID = new short[1] ;
      H001L4_A945TBM44_STUDY_ID = new long[1] ;
      H001L4_A948TBM44_VISIT_NO = new int[1] ;
      H001L4_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H001L5_A441TBT01_DEL_FLG = new String[] {""} ;
      H001L5_n441TBT01_DEL_FLG = new boolean[] {false} ;
      H001L5_A88TBT01_SUBJECT_ID = new int[1] ;
      H001L5_A87TBT01_STUDY_ID = new long[1] ;
      H001L5_A698TBT01_SITE_ID = new String[] {""} ;
      H001L5_n698TBT01_SITE_ID = new boolean[] {false} ;
      AV28W_SITE_ID = "" ;
      H001L6_A325TAM08_DEL_FLG = new String[] {""} ;
      H001L6_n325TAM08_DEL_FLG = new boolean[] {false} ;
      H001L6_A57TAM08_SITE_ID = new String[] {""} ;
      H001L6_A319TAM08_SITE_NM = new String[] {""} ;
      H001L6_n319TAM08_SITE_NM = new boolean[] {false} ;
      H001L7_A92TBT11_STUDY_ID = new long[1] ;
      H001L7_A93TBT11_SUBJECT_ID = new int[1] ;
      H001L7_A94TBT11_CRF_ID = new short[1] ;
      H001L7_A936TBT11_CRF_EDA_NO = new byte[1] ;
      H001L7_A457TBT11_DEL_FLG = new String[] {""} ;
      H001L7_n457TBT11_DEL_FLG = new boolean[] {false} ;
      H001L7_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L7_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001L7_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      H001L7_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001L7_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      H001L7_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      H001L7_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L7_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      H001L7_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      H001L7_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      H001L7_A891TBT11_UPD_RIYU = new String[] {""} ;
      H001L7_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      H001L7_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      H001L7_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      H001L7_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001L7_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      H001L7_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      H001L7_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      H001L7_A95TBT11_CRF_VERSION = new short[1] ;
      AV24W_DM_ARRIVAL = "" ;
      AV26W_INPUT_END = "" ;
      AV31W_TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_TBT11_UPLOAD_USER_ID = "" ;
      AV23W_B717_SD01_REKIINFO_CRF_LIST_Item = new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
      H001L8_A55TAM07_USER_ID = new String[] {""} ;
      H001L8_A205TAM07_USER_NM = new String[] {""} ;
      H001L8_n205TAM07_USER_NM = new boolean[] {false} ;
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV25W_ERRCD = "" ;
      AV20W_A819_JS = "" ;
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
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
      lblTextblock69_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTxt_btn_exit_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b717_wp01_rekiinfo_crf__default(),
         new Object[] {
             new Object[] {
            H001L2_A369TBM21_DEL_FLG, H001L2_n369TBM21_DEL_FLG, H001L2_A63TBM21_STUDY_ID, H001L2_A367TBM21_STUDY_NM, H001L2_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H001L3_A397TBM31_DEL_FLG, H001L3_n397TBM31_DEL_FLG, H001L3_A69TBM31_CRF_ID, H001L3_A68TBM31_STUDY_ID, H001L3_A393TBM31_CRF_NM, H001L3_n393TBM31_CRF_NM, H001L3_A642TBM31_CRF_SNM, H001L3_n642TBM31_CRF_SNM
            }
            , new Object[] {
            H001L4_A947TBM44_CRF_EDA_NO, H001L4_A946TBM44_CRF_ID, H001L4_A945TBM44_STUDY_ID, H001L4_A948TBM44_VISIT_NO, H001L4_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001L5_A441TBT01_DEL_FLG, H001L5_n441TBT01_DEL_FLG, H001L5_A88TBT01_SUBJECT_ID, H001L5_A87TBT01_STUDY_ID, H001L5_A698TBT01_SITE_ID, H001L5_n698TBT01_SITE_ID
            }
            , new Object[] {
            H001L6_A325TAM08_DEL_FLG, H001L6_n325TAM08_DEL_FLG, H001L6_A57TAM08_SITE_ID, H001L6_A319TAM08_SITE_NM, H001L6_n319TAM08_SITE_NM
            }
            , new Object[] {
            H001L7_A92TBT11_STUDY_ID, H001L7_A93TBT11_SUBJECT_ID, H001L7_A94TBT11_CRF_ID, H001L7_A936TBT11_CRF_EDA_NO, H001L7_A457TBT11_DEL_FLG, H001L7_n457TBT11_DEL_FLG, H001L7_A670TBT11_DM_ARRIVAL_DATETIME, H001L7_n670TBT11_DM_ARRIVAL_DATETIME, H001L7_A669TBT11_DM_ARRIVAL_FLG, H001L7_n669TBT11_DM_ARRIVAL_FLG,
            H001L7_A675TBT11_INPUT_END_FLG, H001L7_n675TBT11_INPUT_END_FLG, H001L7_A666TBT11_UPLOAD_DATETIME, H001L7_n666TBT11_UPLOAD_DATETIME, H001L7_A667TBT11_UPLOAD_USER_ID, H001L7_n667TBT11_UPLOAD_USER_ID, H001L7_A891TBT11_UPD_RIYU, H001L7_n891TBT11_UPD_RIYU, H001L7_A993TBT11_SIGNATURE_FLG, H001L7_n993TBT11_SIGNATURE_FLG,
            H001L7_A994TBT11_SIGNATURE_DATETIME, H001L7_n994TBT11_SIGNATURE_DATETIME, H001L7_A995TBT11_SIGNATURE_USER_ID, H001L7_n995TBT11_SIGNATURE_USER_ID, H001L7_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            H001L8_A55TAM07_USER_ID, H001L8_A205TAM07_USER_NM, H001L8_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV52Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV51Pgmdesc = "CRF履歴詳細情報画面" ;
      /* GeneXus formulas. */
      AV52Pgmname = "B717_WP01_REKIINFO_CRF" ;
      AV51Pgmdesc = "CRF履歴詳細情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      edtavD_subject_id_Enabled = 0 ;
      edtavD_crf_nm_Enabled = 0 ;
      edtavD_crf_snm_Enabled = 0 ;
      edtavD_visit_no_Enabled = 0 ;
      edtavD_site_nm_Enabled = 0 ;
      edtavCtltbt11_crf_version_Enabled = 0 ;
      edtavCtldm_arrival_Enabled = 0 ;
      edtavD_grd_sign_Enabled = 0 ;
      edtavCtlinput_end_Enabled = 0 ;
      edtavCtltam07_user_nm_Enabled = 0 ;
      edtavCtltbt11_upload_datetime_vc_Enabled = 0 ;
      edtavD_syomei_nm_Enabled = 0 ;
      edtavD_syomei_dttm_Enabled = 0 ;
      edtavCtltbt11_upd_riyu_Enabled = 0 ;
   }

   private byte wcpOAV34P_CRF_EDA_NO ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV34P_CRF_EDA_NO ;
   private byte GRID1_nEOF ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short wcpOAV16P_CRF_ID ;
   private short nRC_GXsfl_182 ;
   private short nGXsfl_182_idx=1 ;
   private short AV16P_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short wbEnd ;
   private short wbStart ;
   private short AV43GXV1 ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_182_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_182_fel_idx=1 ;
   private short AV30W_TBT11_CRF_VERSION ;
   private int wcpOAV18P_SUBJECT_ID ;
   private int AV18P_SUBJECT_ID ;
   private int A948TBM44_VISIT_NO ;
   private int A88TBT01_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavD_study_nm_Enabled ;
   private int edtavD_subject_id_Enabled ;
   private int edtavD_crf_nm_Enabled ;
   private int edtavD_crf_snm_Enabled ;
   private int edtavD_visit_no_Enabled ;
   private int edtavD_site_nm_Enabled ;
   private int edtavCtltbt11_crf_version_Enabled ;
   private int edtavCtldm_arrival_Enabled ;
   private int edtavD_grd_sign_Enabled ;
   private int edtavCtlinput_end_Enabled ;
   private int edtavCtltam07_user_nm_Enabled ;
   private int edtavCtltbt11_upload_datetime_vc_Enabled ;
   private int edtavD_syomei_nm_Enabled ;
   private int edtavD_syomei_dttm_Enabled ;
   private int edtavCtltbt11_upd_riyu_Enabled ;
   private int AV12D_SUBJECT_ID ;
   private int AV35D_VISIT_NO ;
   private int tblTbl_hidden_Visible ;
   private int AV59GXV9 ;
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
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_182_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV52Pgmname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtltbt11_crf_version_Internalname ;
   private String edtavCtldm_arrival_Internalname ;
   private String edtavD_grd_sign_Internalname ;
   private String edtavCtlinput_end_Internalname ;
   private String edtavCtltam07_user_nm_Internalname ;
   private String edtavCtltbt11_upload_datetime_vc_Internalname ;
   private String edtavD_syomei_nm_Internalname ;
   private String edtavD_syomei_dttm_Internalname ;
   private String edtavCtltbt11_upd_riyu_Internalname ;
   private String GXDecQS ;
   private String AV51Pgmdesc ;
   private String edtavD_study_nm_Internalname ;
   private String edtavD_subject_id_Internalname ;
   private String edtavD_crf_nm_Internalname ;
   private String edtavD_crf_snm_Internalname ;
   private String edtavD_visit_no_Internalname ;
   private String edtavD_site_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String sGXsfl_182_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
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
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
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
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtavD_crf_nm_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtavD_crf_snm_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtavD_visit_no_Jsonclick ;
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
   private String ROClassString ;
   private String edtavCtltbt11_crf_version_Jsonclick ;
   private String edtavCtldm_arrival_Jsonclick ;
   private String edtavD_grd_sign_Jsonclick ;
   private String edtavCtlinput_end_Jsonclick ;
   private String edtavCtltam07_user_nm_Jsonclick ;
   private String edtavCtltbt11_upload_datetime_vc_Jsonclick ;
   private String edtavD_syomei_nm_Jsonclick ;
   private String edtavD_syomei_dttm_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Gx_emsg ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date AV31W_TBT11_UPLOAD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean gx_BV182 ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n993TBT11_SIGNATURE_FLG ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n205TAM07_USER_NM ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String A397TBM31_DEL_FLG ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A441TBT01_DEL_FLG ;
   private String A698TBT01_SITE_ID ;
   private String A57TAM08_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A319TAM08_SITE_NM ;
   private String A457TBT11_DEL_FLG ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String AV29W_TAM07_USER_NM ;
   private String A891TBT11_UPD_RIYU ;
   private String A993TBT11_SIGNATURE_FLG ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String AV21W_A821_JS ;
   private String AV33W_JS ;
   private String A55TAM07_USER_ID ;
   private String AV40W_TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String AV39D_GRD_SIGN ;
   private String AV37D_SYOMEI_NM ;
   private String AV38D_SYOMEI_DTTM ;
   private String AV11D_STUDY_NM ;
   private String AV8D_CRF_NM ;
   private String AV9D_CRF_SNM ;
   private String AV10D_SITE_NM ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String AV28W_SITE_ID ;
   private String AV24W_DM_ARRIVAL ;
   private String AV26W_INPUT_END ;
   private String AV32W_TBT11_UPLOAD_USER_ID ;
   private String AV25W_ERRCD ;
   private String AV20W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H001L2_A369TBM21_DEL_FLG ;
   private boolean[] H001L2_n369TBM21_DEL_FLG ;
   private long[] H001L2_A63TBM21_STUDY_ID ;
   private String[] H001L2_A367TBM21_STUDY_NM ;
   private boolean[] H001L2_n367TBM21_STUDY_NM ;
   private String[] H001L3_A397TBM31_DEL_FLG ;
   private boolean[] H001L3_n397TBM31_DEL_FLG ;
   private short[] H001L3_A69TBM31_CRF_ID ;
   private long[] H001L3_A68TBM31_STUDY_ID ;
   private String[] H001L3_A393TBM31_CRF_NM ;
   private boolean[] H001L3_n393TBM31_CRF_NM ;
   private String[] H001L3_A642TBM31_CRF_SNM ;
   private boolean[] H001L3_n642TBM31_CRF_SNM ;
   private byte[] H001L4_A947TBM44_CRF_EDA_NO ;
   private short[] H001L4_A946TBM44_CRF_ID ;
   private long[] H001L4_A945TBM44_STUDY_ID ;
   private int[] H001L4_A948TBM44_VISIT_NO ;
   private boolean[] H001L4_n948TBM44_VISIT_NO ;
   private String[] H001L5_A441TBT01_DEL_FLG ;
   private boolean[] H001L5_n441TBT01_DEL_FLG ;
   private int[] H001L5_A88TBT01_SUBJECT_ID ;
   private long[] H001L5_A87TBT01_STUDY_ID ;
   private String[] H001L5_A698TBT01_SITE_ID ;
   private boolean[] H001L5_n698TBT01_SITE_ID ;
   private String[] H001L6_A325TAM08_DEL_FLG ;
   private boolean[] H001L6_n325TAM08_DEL_FLG ;
   private String[] H001L6_A57TAM08_SITE_ID ;
   private String[] H001L6_A319TAM08_SITE_NM ;
   private boolean[] H001L6_n319TAM08_SITE_NM ;
   private long[] H001L7_A92TBT11_STUDY_ID ;
   private int[] H001L7_A93TBT11_SUBJECT_ID ;
   private short[] H001L7_A94TBT11_CRF_ID ;
   private byte[] H001L7_A936TBT11_CRF_EDA_NO ;
   private String[] H001L7_A457TBT11_DEL_FLG ;
   private boolean[] H001L7_n457TBT11_DEL_FLG ;
   private java.util.Date[] H001L7_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001L7_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] H001L7_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] H001L7_n669TBT11_DM_ARRIVAL_FLG ;
   private String[] H001L7_A675TBT11_INPUT_END_FLG ;
   private boolean[] H001L7_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] H001L7_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] H001L7_n666TBT11_UPLOAD_DATETIME ;
   private String[] H001L7_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] H001L7_n667TBT11_UPLOAD_USER_ID ;
   private String[] H001L7_A891TBT11_UPD_RIYU ;
   private boolean[] H001L7_n891TBT11_UPD_RIYU ;
   private String[] H001L7_A993TBT11_SIGNATURE_FLG ;
   private boolean[] H001L7_n993TBT11_SIGNATURE_FLG ;
   private java.util.Date[] H001L7_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] H001L7_n994TBT11_SIGNATURE_DATETIME ;
   private String[] H001L7_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] H001L7_n995TBT11_SIGNATURE_USER_ID ;
   private short[] H001L7_A95TBT11_CRF_VERSION ;
   private String[] H001L8_A55TAM07_USER_ID ;
   private String[] H001L8_A205TAM07_USER_NM ;
   private boolean[] H001L8_n205TAM07_USER_NM ;
   private GxObjectCollection AV22W_B717_SD01_REKIINFO_CRF_LIST ;
   private SdtA_PAGING_SDT AV13H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem AV23W_B717_SD01_REKIINFO_CRF_LIST_Item ;
}

final  class b717_wp01_rekiinfo_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001L2", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L4", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L5", "SELECT `TBT01_DEL_FLG`, `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE (`TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?) AND (`TBT01_DEL_FLG` = '0') ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L6", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001L7", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_INPUT_END_FLG`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPD_RIYU`, `TBT11_SIGNATURE_FLG`, `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?) AND (Not (`TBT11_DM_ARRIVAL_DATETIME` = '1000-01-01')) AND (`TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001L8", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

