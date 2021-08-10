/*
               File: b719_wp01_memo_info_impl
        Description: メモ情報画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:29:13.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b719_wp01_memo_info_impl extends GXWebPanel
{
   public b719_wp01_memo_info_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b719_wp01_memo_info_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b719_wp01_memo_info_impl.class ));
   }

   public b719_wp01_memo_info_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_sort = new HTMLChoice();
      chkavD_grd_all_chk = UIFactory.getCheckbox(this);
      chkavD_grd_sel = UIFactory.getCheckbox(this);
      chkavD_grd2_all_chk = UIFactory.getCheckbox(this);
      chkavD_grd2_sel = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_187 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_187_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_187_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_187, nGXsfl_187_idx, sGXsfl_187_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_346 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_346_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_346_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_346, nGXsfl_346_idx, sGXsfl_346_idx) ;
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
            AV42P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42P_STUDY_ID", GXutil.ltrim( GXutil.str( AV42P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV41P_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41P_AUTH_CD", AV41P_AUTH_CD);
               AV53W_AUTO_SENI_FLG = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53W_AUTO_SENI_FLG", AV53W_AUTO_SENI_FLG);
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
         pa1N2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1N2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1N2( ) ;
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
      httpContext.writeValue( "メモ情報画面") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513291390");
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-ja.js", "?"+httpContext.getBuildNumber( 92797));
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
      GXEncryptionTmp = "b719_wp01_memo_info"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV42P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV41P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV53W_AUTO_SENI_FLG)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b719_wp01_memo_info") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1N2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV35H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV35H_A_PAGING_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt2", AV36H_A_PAGING_SDT2);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt2", AV36H_A_PAGING_SDT2);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_187", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_187, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_346", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_346, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV82Pgmname));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV51W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_RNRK_MEMO_C", AV47SD_RNRK_MEMO_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_RNRK_MEMO_C", AV47SD_RNRK_MEMO_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_EDIT_MEMO_C", AV43SD_EDIT_MEMO_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_EDIT_MEMO_C", AV43SD_EDIT_MEMO_C);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A149TBT15_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV42P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_REQUEST_SITE_ID", GXutil.rtrim( A929TBT14_REQUEST_SITE_ID));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV49W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV49W_A_LOGIN_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_AUTH_CD", GXutil.rtrim( AV41P_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_REQUEST_AUTH_CD", GXutil.rtrim( A930TBT14_REQUEST_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KAKUNIN_FLG", GXutil.rtrim( A927TBT14_KAKUNIN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KANRYO_FLG", GXutil.rtrim( A902TBT14_KANRYO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_DEL_FLG", GXutil.rtrim( A479TBT14_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_DEL_FLG", GXutil.rtrim( A488TBT15_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_CRF_ID", GXutil.ltrim( localUtil.ntoc( A155TBT15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A942TBT15_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A151TBT15_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_CRF_ITEM_GRP_CD", GXutil.rtrim( A904TBT15_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT15_MEMO_NO", GXutil.ltrim( localUtil.ntoc( A199TBT15_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_MEMO", GXutil.rtrim( A477TBT14_MEMO));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_CRT_USER_ID", GXutil.rtrim( A481TBT14_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_CRT_AUTH_CD", GXutil.rtrim( A931TBT14_CRT_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SITE_ID", GXutil.rtrim( A698TBT01_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_MEMO_KBN", GXutil.rtrim( A901TBT14_MEMO_KBN));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KAKUNIN_USER_ID", GXutil.rtrim( A928TBT14_KAKUNIN_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_CRF_SNM", GXutil.rtrim( AV6W_TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM32_CRF_ITEM_NM", GXutil.rtrim( AV75W_TBM32_CRF_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_NM", GXutil.rtrim( AV68W_TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV5W_TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM32_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A70TBM32_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM32_CRF_ID", GXutil.ltrim( localUtil.ntoc( A71TBM32_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM32_CRF_ITEM_CD", GXutil.rtrim( A72TBM32_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM32_CRF_ITEM_CD", GXutil.rtrim( AV74W_TBM32_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM32_CRF_ITEM_NM", GXutil.rtrim( A405TBM32_CRF_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_ID", GXutil.rtrim( AV67W_TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_DEL_FLG", GXutil.rtrim( A214TAM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_AUTO_SENI_FLG", GXutil.rtrim( AV53W_AUTO_SENI_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
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
      return "B719_WP01_MEMO_INFO" ;
   }

   public String getPgmdesc( )
   {
      return "メモ情報画面" ;
   }

   public void wb1N0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1N2( true) ;
      }
      else
      {
         wb_table1_2_1N2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_389_1N2( true) ;
      }
      else
      {
         wb_table2_389_1N2( false) ;
      }
      return  ;
   }

   public void wb_table2_389_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "メモ情報画面", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1N0( ) ;
   }

   public void ws1N2( )
   {
      start1N2( ) ;
      evt1N2( ) ;
   }

   public void evt1N2( )
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
                     else if ( GXutil.strcmp(sEvt, "'TAB_TUTI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111N2 */
                        e111N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'TAB_EDIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121N2 */
                        e121N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_CHK.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131N2 */
                        e131N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD2_ALL_CHK.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141N2 */
                        e141N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_SORT.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151N2 */
                        e151N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_MEMO_KANRYO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161N2 */
                        e161N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_MEMO_KANRYO_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171N2 */
                        e171N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181N2 */
                        e181N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191N2 */
                        e191N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201N2 */
                        e201N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EXIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211N2 */
                        e211N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221N2 */
                        e221N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231N2 */
                        e231N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241N2 */
                        e241N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251N2 */
                        e251N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261N2 */
                        e261N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271N2 */
                        e271N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281N2 */
                        e281N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291N2 */
                        e291N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301N2 */
                        e301N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311N2 */
                        e311N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e321N2 */
                        e321N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e331N2 */
                        e331N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e341N2 */
                        e341N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e351N2 */
                        e351N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE2_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e361N2 */
                        e361N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE2_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e371N2 */
                        e371N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE2_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e381N2 */
                        e381N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE2_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e391N2 */
                        e391N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE201'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e401N2 */
                        e401N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE202'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e411N2 */
                        e411N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE203'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e421N2 */
                        e421N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE204'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e431N2 */
                        e431N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE205'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e441N2 */
                        e441N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE206'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e451N2 */
                        e451N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE207'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e461N2 */
                        e461N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE208'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e471N2 */
                        e471N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE209'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e481N2 */
                        e481N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE210'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e491N2 */
                        e491N2 ();
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
                        nGXsfl_187_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_187_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1872( ) ;
                        AV16D_GRD_SEL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_sel.getInternalname())) ;
                        if ( localUtil.vcdtime( httpContext.cgiGet( edtavD_grd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vD_GRD_DATETIME");
                           GX_FocusControl = edtavD_grd_datetime_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV13D_GRD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
                        }
                        else
                        {
                           AV13D_GRD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtavD_grd_datetime_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",") > 999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_MEMO_NO");
                           GX_FocusControl = edtavD_grd_memo_no_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV15D_GRD_MEMO_NO = (short)(0) ;
                        }
                        else
                        {
                           AV15D_GRD_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",")) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_ID");
                           GX_FocusControl = edtavD_grd_crf_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV11D_GRD_CRF_ID = (short)(0) ;
                        }
                        else
                        {
                           AV11D_GRD_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",")) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") > 999999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_SUBJECT_ID");
                           GX_FocusControl = edtavD_grd_subject_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV17D_GRD_SUBJECT_ID = 0 ;
                        }
                        else
                        {
                           AV17D_GRD_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",")) ;
                        }
                        AV12D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
                        AV72D_GRD_CRF_ITEM_NM = httpContext.cgiGet( edtavD_grd_crf_item_nm_Internalname) ;
                        AV14D_GRD_MEMO = httpContext.cgiGet( edtavD_grd_memo_Internalname) ;
                        AV18D_GRD_USER_NM = httpContext.cgiGet( edtavD_grd_user_nm_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e501N2 */
                              e501N2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e511N2 */
                              e511N2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e521N2 */
                              e521N2 ();
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
                     else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                     {
                        nGXsfl_346_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_346_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_3463( ) ;
                        AV29D_GRD2_SEL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_sel.getInternalname())) ;
                        if ( localUtil.vcdate( httpContext.cgiGet( edtavD_grd2_date_Internalname), (byte)(0)) == 0 )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vD_GRD2_DATE");
                           GX_FocusControl = edtavD_grd2_date_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV22D_GRD2_DATE = GXutil.nullDate() ;
                        }
                        else
                        {
                           AV22D_GRD2_DATE = localUtil.ctod( httpContext.cgiGet( edtavD_grd2_date_Internalname), 0) ;
                        }
                        AV31D_GRD2_TIME = httpContext.cgiGet( edtavD_grd2_time_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",") > 999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_MEMO_NO");
                           GX_FocusControl = edtavD_grd2_memo_no_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV28D_GRD2_MEMO_NO = (short)(0) ;
                        }
                        else
                        {
                           AV28D_GRD2_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",")) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_CRF_ID");
                           GX_FocusControl = edtavD_grd2_crf_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV20D_GRD2_CRF_ID = (short)(0) ;
                        }
                        else
                        {
                           AV20D_GRD2_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",")) ;
                        }
                        AV27D_GRD2_MEMO_KBN = httpContext.cgiGet( edtavD_grd2_memo_kbn_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",") > 999999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_SUBJECT_ID");
                           GX_FocusControl = edtavD_grd2_subject_id_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV30D_GRD2_SUBJECT_ID = 0 ;
                        }
                        else
                        {
                           AV30D_GRD2_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",")) ;
                        }
                        AV21D_GRD2_CRF_SNM = httpContext.cgiGet( edtavD_grd2_crf_snm_Internalname) ;
                        AV73D_GRD2_CRF_ITEM_NM = httpContext.cgiGet( edtavD_grd2_crf_item_nm_Internalname) ;
                        AV26D_GRD2_MEMO = httpContext.cgiGet( edtavD_grd2_memo_Internalname) ;
                        AV32D_GRD2_USER_NM = httpContext.cgiGet( edtavD_grd2_user_nm_Internalname) ;
                        AV23D_GRD2_KAKUNIN = httpContext.cgiGet( edtavD_grd2_kakunin_Internalname) ;
                        AV24D_GRD2_KAKUNIN_USER_NM = httpContext.cgiGet( edtavD_grd2_kakunin_user_nm_Internalname) ;
                        AV25D_GRD2_KANRYO = httpContext.cgiGet( edtavD_grd2_kanryo_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e531N3 */
                              e531N3 ();
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

   public void we1N2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1N2( ) ;
         }
      }
   }

   public void pa1N2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b719_wp01_memo_info")), "b719_wp01_memo_info") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b719_wp01_memo_info"))) ;
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
                  AV42P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42P_STUDY_ID", GXutil.ltrim( GXutil.str( AV42P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV41P_AUTH_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV41P_AUTH_CD", AV41P_AUTH_CD);
                     AV53W_AUTO_SENI_FLG = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV53W_AUTO_SENI_FLG", AV53W_AUTO_SENI_FLG);
                  }
               }
            }
         }
         cmbavD_sort.setName( "vD_SORT" );
         cmbavD_sort.setWebtags( "" );
         cmbavD_sort.addItem("0", "登録日時（降順）", (short)(0));
         cmbavD_sort.addItem("1", "患者No", (short)(0));
         if ( cmbavD_sort.getItemCount() > 0 )
         {
            AV33D_SORT = (byte)(GXutil.lval( cmbavD_sort.getValidValue(GXutil.trim( GXutil.str( AV33D_SORT, 1, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33D_SORT", GXutil.str( AV33D_SORT, 1, 0));
         }
         chkavD_grd_all_chk.setName( "vD_GRD_ALL_CHK" );
         chkavD_grd_all_chk.setWebtags( "" );
         chkavD_grd_all_chk.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_chk.getInternalname(), "Caption", chkavD_grd_all_chk.getCaption());
         chkavD_grd_all_chk.setCheckedValue( "false" );
         GXCCtl = "vD_GRD_SEL_" + sGXsfl_187_idx ;
         chkavD_grd_sel.setName( GXCCtl );
         chkavD_grd_sel.setWebtags( "" );
         chkavD_grd_sel.setCaption( "" );
         chkavD_grd_sel.setCheckedValue( "false" );
         chkavD_grd2_all_chk.setName( "vD_GRD2_ALL_CHK" );
         chkavD_grd2_all_chk.setWebtags( "" );
         chkavD_grd2_all_chk.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd2_all_chk.getInternalname(), "Caption", chkavD_grd2_all_chk.getCaption());
         chkavD_grd2_all_chk.setCheckedValue( "false" );
         GXCCtl = "vD_GRD2_SEL_" + sGXsfl_346_idx ;
         chkavD_grd2_sel.setName( GXCCtl );
         chkavD_grd2_sel.setWebtags( "" );
         chkavD_grd2_sel.setCaption( "" );
         chkavD_grd2_sel.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_187 ,
                                 short nGXsfl_187_idx ,
                                 String sGXsfl_187_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1872( ) ;
      while ( nGXsfl_187_idx <= nRC_GXsfl_187 )
      {
         sendrow_1872( ) ;
         nGXsfl_187_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_187_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_187_idx+1)) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_346 ,
                                 short nGXsfl_346_idx ,
                                 String sGXsfl_346_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_3463( ) ;
      while ( nGXsfl_346_idx <= nRC_GXsfl_346 )
      {
         sendrow_3463( ) ;
         nGXsfl_346_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_346_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_346_idx+1)) ;
         sGXsfl_346_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_3463( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf1N2( ) ;
      rf1N3( ) ;
      /* End function Refresh */
   }

   public void rf1N2( )
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
      wbStart = (short)(187) ;
      nGXsfl_187_idx = (short)(1) ;
      sGXsfl_187_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1872( ) ;
      nGXsfl_187_Refreshing = (short)(1) ;
      /* Execute user event: e511N2 */
      e511N2 ();
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1872( ) ;
         /* Execute user event: e521N2 */
         e521N2 ();
         wbEnd = (short)(187) ;
         wb1N0( ) ;
      }
      nGXsfl_187_Refreshing = (short)(0) ;
   }

   public void rf1N3( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(346) ;
      nGXsfl_346_idx = (short)(1) ;
      sGXsfl_346_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_3463( ) ;
      nGXsfl_346_Refreshing = (short)(1) ;
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_3463( ) ;
         /* Execute user event: e531N3 */
         e531N3 ();
         wbEnd = (short)(346) ;
         wb1N0( ) ;
      }
      nGXsfl_346_Refreshing = (short)(0) ;
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
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 8*1 ;
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
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
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
      subGrid1_Islastpage = 1 ;
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

   public int subgrid2_pagecount( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( ((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))+1) ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return 8*1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      if ( GRID2_nEOF == 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_recordsperpage( )) ;
      }
      return (short)(((GRID2_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid2_previouspage( )
   {
      if ( GRID2_nFirstRecordOnPage >= subgrid2_recordsperpage( ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage-subgrid2_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      subGrid2_Islastpage = 1 ;
      return (short)(0) ;
   }

   public int subgrid2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(subgrid2_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup1N0( )
   {
      /* Before Start, stand alone formulas. */
      AV82Pgmname = "B719_WP01_MEMO_INFO" ;
      AV81Pgmdesc = "メモ情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_grd_datetime_Enabled = 0 ;
      edtavD_grd_crf_id_Enabled = 0 ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_crf_item_nm_Enabled = 0 ;
      edtavD_grd_memo_Enabled = 0 ;
      edtavD_grd_user_nm_Enabled = 0 ;
      edtavD_grd2_date_Enabled = 0 ;
      edtavD_grd2_time_Enabled = 0 ;
      edtavD_grd2_crf_id_Enabled = 0 ;
      edtavD_grd2_memo_kbn_Enabled = 0 ;
      edtavD_grd2_subject_id_Enabled = 0 ;
      edtavD_grd2_crf_snm_Enabled = 0 ;
      edtavD_grd2_crf_item_nm_Enabled = 0 ;
      edtavD_grd2_memo_Enabled = 0 ;
      edtavD_grd2_user_nm_Enabled = 0 ;
      edtavD_grd2_kakunin_Enabled = 0 ;
      edtavD_grd2_kakunin_user_nm_Enabled = 0 ;
      edtavD_grd2_kanryo_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e501N2 */
      e501N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV35H_A_PAGING_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt2"), AV36H_A_PAGING_SDT2);
         /* Read variables values. */
         cmbavD_sort.setName( cmbavD_sort.getInternalname() );
         cmbavD_sort.setValue( httpContext.cgiGet( cmbavD_sort.getInternalname()) );
         AV33D_SORT = (byte)(GXutil.lval( httpContext.cgiGet( cmbavD_sort.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33D_SORT", GXutil.str( AV33D_SORT, 1, 0));
         AV10D_GRD_ALL_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_GRD_ALL_CHK", AV10D_GRD_ALL_CHK);
         AV19D_GRD2_ALL_CHk = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_all_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19D_GRD2_ALL_CHk", AV19D_GRD2_ALL_CHk);
         AV38H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38H_INIT_FLG", AV38H_INIT_FLG);
         AV39H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39H_KNGN_FLG", AV39H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_tab_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_tab_kbn_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_TAB_KBN");
            GX_FocusControl = edtavH_tab_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40H_TAB_KBN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40H_TAB_KBN", GXutil.str( AV40H_TAB_KBN, 1, 0));
         }
         else
         {
            AV40H_TAB_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_tab_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40H_TAB_KBN", GXutil.str( AV40H_TAB_KBN, 1, 0));
         }
         AV37H_DEVICE = httpContext.cgiGet( edtavH_device_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37H_DEVICE", AV37H_DEVICE);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row1_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row1_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW1");
            GX_FocusControl = edtavCtlmax_row1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row1_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_GXsfl_187 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_187"), ".", ",")) ;
         nRC_GXsfl_346 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_346"), ".", ",")) ;
         AV42P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV41P_AUTH_CD = httpContext.cgiGet( "vP_AUTH_CD") ;
         AV53W_AUTO_SENI_FLG = httpContext.cgiGet( "vW_AUTO_SENI_FLG") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID2_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID2_nEOF"), ".", ",")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         subGrid2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e501N2 */
      e501N2 ();
      if (returnInSub) return;
   }

   public void e501N2( )
   {
      /* Start Routine */
      AV8C_APP_ID = "B719" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_APP_ID", AV8C_APP_ID);
      AV9C_GAMEN_TITLE = AV81Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_GAMEN_TITLE", AV9C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV38H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_INIT_FLG", AV38H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      tblTbl_grd1_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd1_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd1_hidden_Visible, 5, 0)));
      tblTbl_grd2_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd2_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd2_hidden_Visible, 5, 0)));
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e511N2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV38H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV82Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV38H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_INIT_FLG", AV38H_INIT_FLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV40H_TAB_KBN == 0 )
      {
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   private void e521N2( )
   {
      /* Grid1_Load Routine */
      if ( AV40H_TAB_KBN == 0 )
      {
         AV83GXV3 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83GXV3", GXutil.ltrim( GXutil.str( AV83GXV3, 8, 0)));
         while ( AV83GXV3 <= AV47SD_RNRK_MEMO_C.size() )
         {
            AV48SD_RNRK_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV47SD_RNRK_MEMO_C.elementAt(-1+AV83GXV3));
            AV16D_GRD_SEL = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() ;
            AV15D_GRD_MEMO_NO = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no() ;
            AV13D_GRD_DATETIME = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime() ;
            AV17D_GRD_SUBJECT_ID = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() ;
            AV11D_GRD_CRF_ID = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ;
            AV5W_TBM31_CRF_ID = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5W_TBM31_CRF_ID", GXutil.ltrim( GXutil.str( AV5W_TBM31_CRF_ID, 4, 0)));
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
            AV12D_GRD_CRF_SNM = AV6W_TBM31_CRF_SNM + "(" + GXutil.trim( GXutil.str( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no(), 6, 0)) + ")" ;
            AV74W_TBM32_CRF_ITEM_CD = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74W_TBM32_CRF_ITEM_CD", AV74W_TBM32_CRF_ITEM_CD);
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            AV72D_GRD_CRF_ITEM_NM = AV75W_TBM32_CRF_ITEM_NM ;
            AV67W_TAM07_USER_ID = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67W_TAM07_USER_ID", AV67W_TAM07_USER_ID);
            /* Execute user subroutine: S222 */
            S222 ();
            if (returnInSub) return;
            AV18D_GRD_USER_NM = AV68W_TAM07_USER_NM ;
            if ( GXutil.len( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo()) > 30 )
            {
               AV14D_GRD_MEMO = GXutil.substring( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo(), 1, 30) + "…" ;
            }
            else
            {
               AV14D_GRD_MEMO = AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo() ;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(187) ;
            }
            if ( ( subGrid1_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
            {
               sendrow_1872( ) ;
               GRID1_nEOF = (byte)(1) ;
               if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
               {
                  GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
               }
            }
            if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
            {
               GRID1_nEOF = (byte)(0) ;
            }
            GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
            AV83GXV3 = (int)(AV83GXV3+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83GXV3", GXutil.ltrim( GXutil.str( AV83GXV3, 8, 0)));
         }
      }
   }

   public void e111N2( )
   {
      /* 'TAB_TUTI' Routine */
      if ( AV40H_TAB_KBN == 0 )
      {
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         /* Execute user subroutine: S262 */
         S262 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S272 */
         S272 ();
         if (returnInSub) return;
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
      }
      lblTab_tuti_Class = "TextBlockTabSel" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_tuti_Internalname, "Class", lblTab_tuti_Class);
      lblTab_edit_Class = "TextBlockTab" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_edit_Internalname, "Class", lblTab_edit_Class);
      tblTbl_tuti_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_tuti_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_tuti_Visible, 5, 0)));
      tblTbl_edit_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
      lblTxt_btn_memo_kanryo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_memo_kanryo_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_memo_kanryo_Visible, 5, 0)));
      AV40H_TAB_KBN = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_TAB_KBN", GXutil.str( AV40H_TAB_KBN, 1, 0));
      httpContext.doAjaxRefresh();
   }

   public void e121N2( )
   {
      /* 'TAB_EDIT' Routine */
      if ( AV40H_TAB_KBN == 0 )
      {
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         /* Execute user subroutine: S262 */
         S262 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S272 */
         S272 ();
         if (returnInSub) return;
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
      }
      lblTab_tuti_Class = "TextBlockTab" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_tuti_Internalname, "Class", lblTab_tuti_Class);
      lblTab_edit_Class = "TextBlockTabSel" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_edit_Internalname, "Class", lblTab_edit_Class);
      tblTbl_tuti_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_tuti_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_tuti_Visible, 5, 0)));
      tblTbl_edit_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
      lblTxt_btn_memo_kanryo_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_memo_kanryo_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_memo_kanryo_Visible, 5, 0)));
      AV40H_TAB_KBN = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_TAB_KBN", GXutil.str( AV40H_TAB_KBN, 1, 0));
      httpContext.doAjaxRefresh();
   }

   public void e131N2( )
   {
      /* D_grd_all_chk_Click Routine */
      AV85GXV5 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85GXV5", GXutil.ltrim( GXutil.str( AV85GXV5, 8, 0)));
      while ( AV85GXV5 <= AV47SD_RNRK_MEMO_C.size() )
      {
         AV48SD_RNRK_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV47SD_RNRK_MEMO_C.elementAt(-1+AV85GXV5));
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( AV10D_GRD_ALL_CHK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV85GXV5 = (int)(AV85GXV5+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85GXV5", GXutil.ltrim( GXutil.str( AV85GXV5, 8, 0)));
      }
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e141N2( )
   {
      /* D_grd2_all_chk_Click Routine */
      AV86GXV6 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86GXV6", GXutil.ltrim( GXutil.str( AV86GXV6, 8, 0)));
      while ( AV86GXV6 <= AV43SD_EDIT_MEMO_C.size() )
      {
         AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV86GXV6));
         if ( GXutil.strcmp(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg(), "1") != 0 )
         {
            AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( AV19D_GRD2_ALL_CHk );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         }
         AV86GXV6 = (int)(AV86GXV6+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86GXV6", GXutil.ltrim( GXutil.str( AV86GXV6, 8, 0)));
      }
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e151N2( )
   {
      /* D_sort_Click Routine */
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      if ( AV33D_SORT == 0 )
      {
         AV47SD_RNRK_MEMO_C.sort("[CRT_DATETIME]");
         AV43SD_EDIT_MEMO_C.sort("[CRT_DATETIME]");
      }
      else if ( AV33D_SORT == 1 )
      {
         AV47SD_RNRK_MEMO_C.sort("SUBJECT_ID, [CRT_DATETIME]");
         AV43SD_EDIT_MEMO_C.sort("SUBJECT_ID, [CRT_DATETIME]");
      }
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void e161N2( )
   {
      /* 'BTN_MEMO_KANRYO' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      AV58W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
      AV62W_SEL_CNT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62W_SEL_CNT", GXutil.ltrim( GXutil.str( AV62W_SEL_CNT, 10, 0)));
      AV59W_MI_KAKUNIN_CNT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59W_MI_KAKUNIN_CNT", GXutil.ltrim( GXutil.str( AV59W_MI_KAKUNIN_CNT, 10, 0)));
      AV87GXV7 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87GXV7", GXutil.ltrim( GXutil.str( AV87GXV7, 8, 0)));
      while ( AV87GXV7 <= AV43SD_EDIT_MEMO_C.size() )
      {
         AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV87GXV7));
         if ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() )
         {
            AV62W_SEL_CNT = (long)(AV62W_SEL_CNT+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62W_SEL_CNT", GXutil.ltrim( GXutil.str( AV62W_SEL_CNT, 10, 0)));
            if ( GXutil.strcmp(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg(), "0") == 0 )
            {
               AV59W_MI_KAKUNIN_CNT = (long)(AV59W_MI_KAKUNIN_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59W_MI_KAKUNIN_CNT", GXutil.ltrim( GXutil.str( AV59W_MI_KAKUNIN_CNT, 10, 0)));
            }
         }
         AV87GXV7 = (int)(AV87GXV7+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87GXV7", GXutil.ltrim( GXutil.str( AV87GXV7, 8, 0)));
      }
      if ( AV62W_SEL_CNT == 0 )
      {
         GXt_char1 = AV60W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "メモ", "", "", "", "", GXv_char2) ;
         b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         httpContext.GX_msglist.addItem(AV60W_MSG);
         AV58W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
      }
      if ( ! AV58W_ERRFLG )
      {
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
         if ( AV59W_MI_KAKUNIN_CNT == 0 )
         {
            GXt_char1 = AV60W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00026", "選択したメモ", "完了", "", "", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            AV60W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         }
         else
         {
            GXt_char1 = AV60W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00030", "", "", "", "", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            AV60W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         }
         GXt_char1 = AV51W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV60W_MSG, "", "BTN_MEMO_KANRYO_EXEC", "", GXv_char2) ;
         b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         AV51W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51W_A821_JS", AV51W_A821_JS);
      }
   }

   public void e171N2( )
   {
      /* 'BTN_MEMO_KANRYO_EXEC' Routine */
      AV58W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
      AV88GXV8 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88GXV8", GXutil.ltrim( GXutil.str( AV88GXV8, 8, 0)));
      while ( AV88GXV8 <= AV43SD_EDIT_MEMO_C.size() )
      {
         AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV88GXV8));
         if ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() )
         {
            AV7BC_TBT14_CRF_MEMO.Load(AV42P_STUDY_ID, AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id(), AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no());
            if ( AV7BC_TBT14_CRF_MEMO.Fail() )
            {
               AV58W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
               GXt_char1 = AV60W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
               AV60W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
               if (true) break;
            }
            else
            {
               if ( AV7BC_TBT14_CRF_MEMO.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt() != AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt() )
               {
                  AV58W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
                  GXt_char1 = AV60W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc02_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV60W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
                  if (true) break;
               }
               AV7BC_TBT14_CRF_MEMO.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBT14_CRF_MEMO", AV7BC_TBT14_CRF_MEMO);
               AV7BC_TBT14_CRF_MEMO.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm( AV82Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBT14_CRF_MEMO", AV7BC_TBT14_CRF_MEMO);
               AV7BC_TBT14_CRF_MEMO.Save();
               if ( AV7BC_TBT14_CRF_MEMO.Success() )
               {
               }
               else
               {
                  AV58W_ERRFLG = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
                  GXt_char1 = AV60W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV7BC_TBT14_CRF_MEMO.GetMessages(), (byte)(0), GXv_char2) ;
                  b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV60W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
                  if (true) break;
               }
            }
         }
         AV88GXV8 = (int)(AV88GXV8+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88GXV8", GXutil.ltrim( GXutil.str( AV88GXV8, 8, 0)));
      }
      if ( ! AV58W_ERRFLG )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b719_wp01_memo_info");
         /* Execute user subroutine: S292 */
         S292 ();
         if (returnInSub) return;
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
         AV19D_GRD2_ALL_CHk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19D_GRD2_ALL_CHk", AV19D_GRD2_ALL_CHk);
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b719_wp01_memo_info");
         httpContext.GX_msglist.addItem(AV60W_MSG);
      }
   }

   public void e181N2( )
   {
      /* 'BTN_CRF' Routine */
      AV45SD_OPEN_CRF_C.clear();
      if ( AV40H_TAB_KBN == 0 )
      {
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         AV89GXV9 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89GXV9", GXutil.ltrim( GXutil.str( AV89GXV9, 8, 0)));
         while ( AV89GXV9 <= AV47SD_RNRK_MEMO_C.size() )
         {
            AV48SD_RNRK_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV47SD_RNRK_MEMO_C.elementAt(-1+AV89GXV9));
            if ( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() )
            {
               AV55W_DATA_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55W_DATA_FLG", AV55W_DATA_FLG);
               AV90GXV10 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV90GXV10", GXutil.ltrim( GXutil.str( AV90GXV10, 8, 0)));
               while ( AV90GXV10 <= AV45SD_OPEN_CRF_C.size() )
               {
                  AV46SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)((SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)AV45SD_OPEN_CRF_C.elementAt(-1+AV90GXV10));
                  if ( ( AV46SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id() == AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() ) && ( AV46SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id() == AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ) && ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no() == AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no() ) )
                  {
                     AV55W_DATA_FLG = true ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV55W_DATA_FLG", AV55W_DATA_FLG);
                     if (true) break;
                  }
                  AV90GXV10 = (int)(AV90GXV10+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV90GXV10", GXutil.ltrim( GXutil.str( AV90GXV10, 8, 0)));
               }
               if ( ! AV55W_DATA_FLG )
               {
                  AV46SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)new SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem(remoteHandle, context);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV45SD_OPEN_CRF_C.add(AV46SD_OPEN_CRF_I, 0);
               }
            }
            AV89GXV9 = (int)(AV89GXV9+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GXV9", GXutil.ltrim( GXutil.str( AV89GXV9, 8, 0)));
         }
      }
      else
      {
         /* Execute user subroutine: S272 */
         S272 ();
         if (returnInSub) return;
         AV91GXV11 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91GXV11", GXutil.ltrim( GXutil.str( AV91GXV11, 8, 0)));
         while ( AV91GXV11 <= AV43SD_EDIT_MEMO_C.size() )
         {
            AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV91GXV11));
            if ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() )
            {
               AV55W_DATA_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55W_DATA_FLG", AV55W_DATA_FLG);
               AV92GXV12 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV92GXV12", GXutil.ltrim( GXutil.str( AV92GXV12, 8, 0)));
               while ( AV92GXV12 <= AV45SD_OPEN_CRF_C.size() )
               {
                  AV46SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)((SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)AV45SD_OPEN_CRF_C.elementAt(-1+AV92GXV12));
                  if ( ( AV46SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id() == AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() ) && ( AV46SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id() == AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ) && ( AV46SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no() == AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no() ) )
                  {
                     AV55W_DATA_FLG = true ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV55W_DATA_FLG", AV55W_DATA_FLG);
                     if (true) break;
                  }
                  AV92GXV12 = (int)(AV92GXV12+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV92GXV12", GXutil.ltrim( GXutil.str( AV92GXV12, 8, 0)));
               }
               if ( ! AV55W_DATA_FLG )
               {
                  AV46SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)new SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem(remoteHandle, context);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV46SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SD_OPEN_CRF_I", AV46SD_OPEN_CRF_I);
                  AV45SD_OPEN_CRF_C.add(AV46SD_OPEN_CRF_I, 0);
               }
            }
            AV91GXV11 = (int)(AV91GXV11+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91GXV11", GXutil.ltrim( GXutil.str( AV91GXV11, 8, 0)));
         }
      }
      if ( AV45SD_OPEN_CRF_C.size() == 0 )
      {
         GXt_char1 = AV60W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "メモ", "", "", "", "", GXv_char2) ;
         b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         httpContext.GX_msglist.addItem(AV60W_MSG);
      }
      else
      {
         AV53W_AUTO_SENI_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53W_AUTO_SENI_FLG", AV53W_AUTO_SENI_FLG);
         AV64W_SESSION.setValue("B719_OPEN_CRF_SDT", AV45SD_OPEN_CRF_C.toxml(false, true, "B719_SD02_OPEN_CRF", "tablet-EDC_GXXEV3U3"));
         /* Execute user subroutine: S302 */
         S302 ();
         if (returnInSub) return;
         httpContext.setWebReturnParms(new Object[] {AV53W_AUTO_SENI_FLG});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void e191N2( )
   {
      /* 'BTN_CSV' Routine */
      if ( GXutil.strcmp(AV37H_DEVICE, "other") == 0 )
      {
         AV60W_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         if ( AV40H_TAB_KBN == 0 )
         {
            if ( AV47SD_RNRK_MEMO_C.size() > 0 )
            {
            }
            else
            {
               GXt_char1 = AV60W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
               b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
               AV60W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
            }
         }
         else
         {
            if ( AV43SD_EDIT_MEMO_C.size() > 0 )
            {
            }
            else
            {
               GXt_char1 = AV60W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
               b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
               AV60W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
            }
         }
         if ( ! (GXutil.strcmp("", AV60W_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV60W_MSG);
         }
         else
         {
            GXt_char1 = AV60W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00026", "CSV", "出力", GXutil.trim( GXutil.str( AV62W_SEL_CNT, 10, 0)), "　", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            AV60W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
            GXt_char1 = AV51W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV60W_MSG, "", "BTN_CSV_OUT_EXEC", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
            AV51W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51W_A821_JS", AV51W_A821_JS);
         }
      }
      else
      {
         GXt_char1 = AV60W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00092", "", "", "", "", "", GXv_char2) ;
         b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         httpContext.GX_msglist.addItem(AV60W_MSG);
      }
   }

   public void e201N2( )
   {
      /* 'BTN_CSV_OUT_EXEC' Routine */
      if ( AV40H_TAB_KBN == 0 )
      {
         if ( AV47SD_RNRK_MEMO_C.size() > 0 )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "ab719_pc01_rnrk_memo_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV42P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV41P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV60W_MSG)) ;
            httpContext.wjLoc = formatLink("ab719_pc01_rnrk_memo_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            GXt_char1 = AV60W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            AV60W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         }
      }
      else
      {
         if ( AV43SD_EDIT_MEMO_C.size() > 0 )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "ab719_pc02_edit_memo_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV42P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV41P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV60W_MSG)) ;
            httpContext.wjLoc = formatLink("ab719_pc02_edit_memo_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            GXt_char1 = AV60W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            AV60W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60W_MSG", AV60W_MSG);
         }
      }
      if ( ! (GXutil.strcmp("", AV60W_MSG)==0) )
      {
         httpContext.GX_msglist.addItem(AV60W_MSG);
      }
   }

   public void e211N2( )
   {
      /* 'BTN_EXIT' Routine */
      AV53W_AUTO_SENI_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53W_AUTO_SENI_FLG", AV53W_AUTO_SENI_FLG);
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
      httpContext.setWebReturnParms(new Object[] {AV53W_AUTO_SENI_FLG});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Execute user subroutine: S312 */
      S312 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV40H_TAB_KBN = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_TAB_KBN", GXutil.str( AV40H_TAB_KBN, 1, 0));
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      lblTab_tuti_Class = "TextBlockTabSel" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_tuti_Internalname, "Class", lblTab_tuti_Class);
      lblTab_edit_Class = "TextBlockTab" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTab_edit_Internalname, "Class", lblTab_edit_Class);
      tblTbl_tuti_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_tuti_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_tuti_Visible, 5, 0)));
      tblTbl_edit_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
      lblTxt_btn_memo_kanryo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_memo_kanryo_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_memo_kanryo_Visible, 5, 0)));
   }

   public void S162( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
   }

   public void S312( )
   {
      /* 'SUB_SRCH' Routine */
      AV58W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58W_ERRFLG", AV58W_ERRFLG);
      /* Execute user subroutine: S322 */
      S322 ();
      if (returnInSub) return;
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void S322( )
   {
      /* 'SUB_MEMO_GET_RNRK' Routine */
      AV47SD_RNRK_MEMO_C.clear();
      GXt_char1 = AV52W_ALL_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "023", GXv_char2) ;
      b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52W_ALL_AUTH_CD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52W_ALL_AUTH_CD", AV52W_ALL_AUTH_CD);
      /* Using cursor H001N2 */
      pr_default.execute(0, new Object[] {AV41P_AUTH_CD, AV52W_ALL_AUTH_CD, new Long(AV42P_STUDY_ID), AV49W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A149TBT15_STUDY_ID = H001N2_A149TBT15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A149TBT15_STUDY_ID, 10, 0)));
         A929TBT14_REQUEST_SITE_ID = H001N2_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = H001N2_n929TBT14_REQUEST_SITE_ID[0] ;
         A927TBT14_KAKUNIN_FLG = H001N2_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = H001N2_n927TBT14_KAKUNIN_FLG[0] ;
         A902TBT14_KANRYO_FLG = H001N2_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = H001N2_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = H001N2_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = H001N2_n479TBT14_DEL_FLG[0] ;
         A488TBT15_DEL_FLG = H001N2_A488TBT15_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TBT15_DEL_FLG", A488TBT15_DEL_FLG);
         n488TBT15_DEL_FLG = H001N2_n488TBT15_DEL_FLG[0] ;
         A942TBT15_CRF_EDA_NO = H001N2_A942TBT15_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TBT15_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A942TBT15_CRF_EDA_NO, 2, 0)));
         n942TBT15_CRF_EDA_NO = H001N2_n942TBT15_CRF_EDA_NO[0] ;
         A155TBT15_CRF_ID = H001N2_A155TBT15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A155TBT15_CRF_ID, 4, 0)));
         n155TBT15_CRF_ID = H001N2_n155TBT15_CRF_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = H001N2_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = H001N2_n930TBT14_REQUEST_AUTH_CD[0] ;
         A151TBT15_SUBJECT_ID = H001N2_A151TBT15_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A151TBT15_SUBJECT_ID, 6, 0)));
         A904TBT15_CRF_ITEM_GRP_CD = H001N2_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A904TBT15_CRF_ITEM_GRP_CD", A904TBT15_CRF_ITEM_GRP_CD);
         n904TBT15_CRF_ITEM_GRP_CD = H001N2_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A199TBT15_MEMO_NO = H001N2_A199TBT15_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A199TBT15_MEMO_NO, 3, 0)));
         A477TBT14_MEMO = H001N2_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = H001N2_n477TBT14_MEMO[0] ;
         A481TBT14_CRT_USER_ID = H001N2_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = H001N2_n481TBT14_CRT_USER_ID[0] ;
         A486TBT14_UPD_CNT = H001N2_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = H001N2_n486TBT14_UPD_CNT[0] ;
         A480TBT14_CRT_DATETIME = H001N2_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = H001N2_n480TBT14_CRT_DATETIME[0] ;
         A929TBT14_REQUEST_SITE_ID = H001N2_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = H001N2_n929TBT14_REQUEST_SITE_ID[0] ;
         A927TBT14_KAKUNIN_FLG = H001N2_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = H001N2_n927TBT14_KAKUNIN_FLG[0] ;
         A902TBT14_KANRYO_FLG = H001N2_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = H001N2_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = H001N2_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = H001N2_n479TBT14_DEL_FLG[0] ;
         A930TBT14_REQUEST_AUTH_CD = H001N2_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = H001N2_n930TBT14_REQUEST_AUTH_CD[0] ;
         A477TBT14_MEMO = H001N2_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = H001N2_n477TBT14_MEMO[0] ;
         A481TBT14_CRT_USER_ID = H001N2_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = H001N2_n481TBT14_CRT_USER_ID[0] ;
         A486TBT14_UPD_CNT = H001N2_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = H001N2_n486TBT14_UPD_CNT[0] ;
         A480TBT14_CRT_DATETIME = H001N2_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = H001N2_n480TBT14_CRT_DATETIME[0] ;
         AV94GXLvl720 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94GXLvl720", GXutil.str( AV94GXLvl720, 1, 0));
         /* Using cursor H001N3 */
         pr_default.execute(1, new Object[] {new Long(A149TBT15_STUDY_ID), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO)});
         if ( Gx_err != 0 )
         {
            AV94GXLvl720 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94GXLvl720", GXutil.str( AV94GXLvl720, 1, 0));
         }
         while ( (pr_default.getStatus(1) != 101) )
         {
            A945TBM44_STUDY_ID = H001N3_A945TBM44_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
            A946TBM44_CRF_ID = H001N3_A946TBM44_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
            A947TBM44_CRF_EDA_NO = H001N3_A947TBM44_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
            A948TBM44_VISIT_NO = H001N3_A948TBM44_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
            n948TBM44_VISIT_NO = H001N3_n948TBM44_VISIT_NO[0] ;
            AV94GXLvl720 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94GXLvl720", GXutil.str( AV94GXLvl720, 1, 0));
            AV76W_TBM44_VISIT_NO = A948TBM44_VISIT_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( AV76W_TBM44_VISIT_NO, 6, 0)));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV94GXLvl720 == 0 )
         {
            AV76W_TBM44_VISIT_NO = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( AV76W_TBM44_VISIT_NO, 6, 0)));
         }
         AV48SD_RNRK_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)new SdtB719_SD01_MEMO_B719_SD01_MEMOItem(remoteHandle, context);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( A151TBT15_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( A155TBT15_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no( A942TBT15_CRF_EDA_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no( AV76W_TBM44_VISIT_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( A904TBT15_CRF_ITEM_GRP_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( A199TBT15_MEMO_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( A477TBT14_MEMO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( A480TBT14_CRT_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( A481TBT14_CRT_USER_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( A486TBT14_UPD_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
         AV47SD_RNRK_MEMO_C.add(AV48SD_RNRK_MEMO_I, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S292( )
   {
      /* 'SUB_MEMO_GET_EDIT' Routine */
      AV43SD_EDIT_MEMO_C.clear();
      GXt_char1 = AV56W_DM_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char2) ;
      b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56W_DM_AUTH_CD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56W_DM_AUTH_CD", AV56W_DM_AUTH_CD);
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV41P_AUTH_CD ,
                                           AV56W_DM_AUTH_CD ,
                                           A698TBT01_SITE_ID ,
                                           AV49W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id() ,
                                           new Long(A149TBT15_STUDY_ID) ,
                                           new Long(AV42P_STUDY_ID) ,
                                           A931TBT14_CRT_AUTH_CD ,
                                           A479TBT14_DEL_FLG ,
                                           A488TBT15_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001N4 */
      pr_default.execute(2, new Object[] {new Long(AV42P_STUDY_ID), AV41P_AUTH_CD, AV49W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A87TBT01_STUDY_ID = H001N4_A87TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
         A88TBT01_SUBJECT_ID = H001N4_A88TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
         A149TBT15_STUDY_ID = H001N4_A149TBT15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A149TBT15_STUDY_ID, 10, 0)));
         A931TBT14_CRT_AUTH_CD = H001N4_A931TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
         n931TBT14_CRT_AUTH_CD = H001N4_n931TBT14_CRT_AUTH_CD[0] ;
         A479TBT14_DEL_FLG = H001N4_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = H001N4_n479TBT14_DEL_FLG[0] ;
         A488TBT15_DEL_FLG = H001N4_A488TBT15_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TBT15_DEL_FLG", A488TBT15_DEL_FLG);
         n488TBT15_DEL_FLG = H001N4_n488TBT15_DEL_FLG[0] ;
         A942TBT15_CRF_EDA_NO = H001N4_A942TBT15_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TBT15_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A942TBT15_CRF_EDA_NO, 2, 0)));
         n942TBT15_CRF_EDA_NO = H001N4_n942TBT15_CRF_EDA_NO[0] ;
         A155TBT15_CRF_ID = H001N4_A155TBT15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A155TBT15_CRF_ID, 4, 0)));
         n155TBT15_CRF_ID = H001N4_n155TBT15_CRF_ID[0] ;
         A698TBT01_SITE_ID = H001N4_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H001N4_n698TBT01_SITE_ID[0] ;
         A151TBT15_SUBJECT_ID = H001N4_A151TBT15_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A151TBT15_SUBJECT_ID, 6, 0)));
         A904TBT15_CRF_ITEM_GRP_CD = H001N4_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A904TBT15_CRF_ITEM_GRP_CD", A904TBT15_CRF_ITEM_GRP_CD);
         n904TBT15_CRF_ITEM_GRP_CD = H001N4_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A199TBT15_MEMO_NO = H001N4_A199TBT15_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A199TBT15_MEMO_NO, 3, 0)));
         A901TBT14_MEMO_KBN = H001N4_A901TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
         n901TBT14_MEMO_KBN = H001N4_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = H001N4_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = H001N4_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = H001N4_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = H001N4_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = H001N4_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = H001N4_n930TBT14_REQUEST_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = H001N4_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = H001N4_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = H001N4_A928TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
         n928TBT14_KAKUNIN_USER_ID = H001N4_n928TBT14_KAKUNIN_USER_ID[0] ;
         A902TBT14_KANRYO_FLG = H001N4_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = H001N4_n902TBT14_KANRYO_FLG[0] ;
         A481TBT14_CRT_USER_ID = H001N4_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = H001N4_n481TBT14_CRT_USER_ID[0] ;
         A486TBT14_UPD_CNT = H001N4_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = H001N4_n486TBT14_UPD_CNT[0] ;
         A480TBT14_CRT_DATETIME = H001N4_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = H001N4_n480TBT14_CRT_DATETIME[0] ;
         A698TBT01_SITE_ID = H001N4_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H001N4_n698TBT01_SITE_ID[0] ;
         A931TBT14_CRT_AUTH_CD = H001N4_A931TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
         n931TBT14_CRT_AUTH_CD = H001N4_n931TBT14_CRT_AUTH_CD[0] ;
         A479TBT14_DEL_FLG = H001N4_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = H001N4_n479TBT14_DEL_FLG[0] ;
         A901TBT14_MEMO_KBN = H001N4_A901TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
         n901TBT14_MEMO_KBN = H001N4_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = H001N4_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = H001N4_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = H001N4_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = H001N4_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = H001N4_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = H001N4_n930TBT14_REQUEST_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = H001N4_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = H001N4_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = H001N4_A928TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
         n928TBT14_KAKUNIN_USER_ID = H001N4_n928TBT14_KAKUNIN_USER_ID[0] ;
         A902TBT14_KANRYO_FLG = H001N4_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = H001N4_n902TBT14_KANRYO_FLG[0] ;
         A481TBT14_CRT_USER_ID = H001N4_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = H001N4_n481TBT14_CRT_USER_ID[0] ;
         A486TBT14_UPD_CNT = H001N4_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = H001N4_n486TBT14_UPD_CNT[0] ;
         A480TBT14_CRT_DATETIME = H001N4_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = H001N4_n480TBT14_CRT_DATETIME[0] ;
         AV96GXLvl769 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96GXLvl769", GXutil.str( AV96GXLvl769, 1, 0));
         /* Using cursor H001N5 */
         pr_default.execute(3, new Object[] {new Long(A149TBT15_STUDY_ID), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO)});
         if ( Gx_err != 0 )
         {
            AV96GXLvl769 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96GXLvl769", GXutil.str( AV96GXLvl769, 1, 0));
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A945TBM44_STUDY_ID = H001N5_A945TBM44_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
            A946TBM44_CRF_ID = H001N5_A946TBM44_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
            A947TBM44_CRF_EDA_NO = H001N5_A947TBM44_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
            A948TBM44_VISIT_NO = H001N5_A948TBM44_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
            n948TBM44_VISIT_NO = H001N5_n948TBM44_VISIT_NO[0] ;
            AV96GXLvl769 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96GXLvl769", GXutil.str( AV96GXLvl769, 1, 0));
            AV76W_TBM44_VISIT_NO = A948TBM44_VISIT_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( AV76W_TBM44_VISIT_NO, 6, 0)));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV96GXLvl769 == 0 )
         {
            AV76W_TBM44_VISIT_NO = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( AV76W_TBM44_VISIT_NO, 6, 0)));
         }
         AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)new SdtB719_SD01_MEMO_B719_SD01_MEMOItem(remoteHandle, context);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( A151TBT15_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( A155TBT15_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no( A942TBT15_CRF_EDA_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no( AV76W_TBM44_VISIT_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( A904TBT15_CRF_ITEM_GRP_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( A199TBT15_MEMO_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn( A901TBT14_MEMO_KBN );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( A477TBT14_MEMO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id( A929TBT14_REQUEST_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd( A930TBT14_REQUEST_AUTH_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg( A927TBT14_KAKUNIN_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id( A928TBT14_KAKUNIN_USER_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg( A902TBT14_KANRYO_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( A480TBT14_CRT_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( A481TBT14_CRT_USER_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( A486TBT14_UPD_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
         AV43SD_EDIT_MEMO_C.add(AV44SD_EDIT_MEMO_I, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S202( )
   {
      /* 'SUB_CRF_NM_GET' Routine */
      AV6W_TBM31_CRF_SNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6W_TBM31_CRF_SNM", AV6W_TBM31_CRF_SNM);
      /* Using cursor H001N6 */
      pr_default.execute(4, new Object[] {new Long(AV42P_STUDY_ID), new Short(AV5W_TBM31_CRF_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A69TBM31_CRF_ID = H001N6_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001N6_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A642TBM31_CRF_SNM = H001N6_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H001N6_n642TBM31_CRF_SNM[0] ;
         AV6W_TBM31_CRF_SNM = A642TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6W_TBM31_CRF_SNM", AV6W_TBM31_CRF_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S212( )
   {
      /* 'SUB_CRF_ITEM_NM_GET' Routine */
      AV75W_TBM32_CRF_ITEM_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75W_TBM32_CRF_ITEM_NM", AV75W_TBM32_CRF_ITEM_NM);
      /* Using cursor H001N7 */
      pr_default.execute(5, new Object[] {new Long(AV42P_STUDY_ID), new Short(AV5W_TBM31_CRF_ID), AV74W_TBM32_CRF_ITEM_CD});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A72TBM32_CRF_ITEM_CD = H001N7_A72TBM32_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
         A71TBM32_CRF_ID = H001N7_A71TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         A70TBM32_STUDY_ID = H001N7_A70TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A405TBM32_CRF_ITEM_NM = H001N7_A405TBM32_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM32_CRF_ITEM_NM", A405TBM32_CRF_ITEM_NM);
         n405TBM32_CRF_ITEM_NM = H001N7_n405TBM32_CRF_ITEM_NM[0] ;
         AV75W_TBM32_CRF_ITEM_NM = A405TBM32_CRF_ITEM_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75W_TBM32_CRF_ITEM_NM", AV75W_TBM32_CRF_ITEM_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S233( )
   {
      /* 'SUB_SITE_NM_GET' Routine */
      AV70W_TAM08_SITE_SNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70W_TAM08_SITE_SNM", AV70W_TAM08_SITE_SNM);
      /* Using cursor H001N8 */
      pr_default.execute(6, new Object[] {AV69W_TAM08_SITE_ID});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A57TAM08_SITE_ID = H001N8_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
         A320TAM08_SITE_SNM = H001N8_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = H001N8_n320TAM08_SITE_SNM[0] ;
         AV70W_TAM08_SITE_SNM = A320TAM08_SITE_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70W_TAM08_SITE_SNM", AV70W_TAM08_SITE_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S243( )
   {
      /* 'SUB_AUTH_NM_GET' Routine */
      AV66W_TAM04_AUTH_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66W_TAM04_AUTH_NM", AV66W_TAM04_AUTH_NM);
      if ( GXutil.strcmp(AV65W_TAM04_AUTH_CD, "XX") == 0 )
      {
         AV66W_TAM04_AUTH_NM = "全員" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66W_TAM04_AUTH_NM", AV66W_TAM04_AUTH_NM);
      }
      else
      {
         /* Using cursor H001N9 */
         pr_default.execute(7, new Object[] {AV65W_TAM04_AUTH_CD});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A13TAM04_AUTH_CD = H001N9_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            A285TAM04_AUTH_NM = H001N9_A285TAM04_AUTH_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
            n285TAM04_AUTH_NM = H001N9_n285TAM04_AUTH_NM[0] ;
            AV66W_TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66W_TAM04_AUTH_NM", AV66W_TAM04_AUTH_NM);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S222( )
   {
      /* 'SUB_USER_NM_GET' Routine */
      AV68W_TAM07_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68W_TAM07_USER_NM", AV68W_TAM07_USER_NM);
      /* Using cursor H001N10 */
      pr_default.execute(8, new Object[] {AV67W_TAM07_USER_ID});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A214TAM07_DEL_FLG = H001N10_A214TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
         n214TAM07_DEL_FLG = H001N10_n214TAM07_DEL_FLG[0] ;
         A55TAM07_USER_ID = H001N10_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A205TAM07_USER_NM = H001N10_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = H001N10_n205TAM07_USER_NM[0] ;
         AV68W_TAM07_USER_NM = A205TAM07_USER_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68W_TAM07_USER_NM", AV68W_TAM07_USER_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S252( )
   {
      /* 'SUB_SDT_UPD_RNRK' Routine */
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_187 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_187"), ".", ",")) ;
      nGXsfl_187_fel_idx = (short)(0) ;
      while ( nGXsfl_187_fel_idx < nRC_GXsfl_187 )
      {
         nGXsfl_187_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_187_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_187_fel_idx+1)) ;
         sGXsfl_187_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_1872( ) ;
         AV16D_GRD_SEL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_sel.getInternalname())) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavD_grd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vD_GRD_DATETIME");
            GX_FocusControl = edtavD_grd_datetime_Internalname ;
            wbErr = true ;
            AV13D_GRD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         }
         else
         {
            AV13D_GRD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtavD_grd_datetime_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_MEMO_NO");
            GX_FocusControl = edtavD_grd_memo_no_Internalname ;
            wbErr = true ;
            AV15D_GRD_MEMO_NO = (short)(0) ;
         }
         else
         {
            AV15D_GRD_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_memo_no_Internalname), ".", ",")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_ID");
            GX_FocusControl = edtavD_grd_crf_id_Internalname ;
            wbErr = true ;
            AV11D_GRD_CRF_ID = (short)(0) ;
         }
         else
         {
            AV11D_GRD_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_SUBJECT_ID");
            GX_FocusControl = edtavD_grd_subject_id_Internalname ;
            wbErr = true ;
            AV17D_GRD_SUBJECT_ID = 0 ;
         }
         else
         {
            AV17D_GRD_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",")) ;
         }
         AV12D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
         AV72D_GRD_CRF_ITEM_NM = httpContext.cgiGet( edtavD_grd_crf_item_nm_Internalname) ;
         AV14D_GRD_MEMO = httpContext.cgiGet( edtavD_grd_memo_Internalname) ;
         AV18D_GRD_USER_NM = httpContext.cgiGet( edtavD_grd_user_nm_Internalname) ;
         AV103GXV13 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103GXV13", GXutil.ltrim( GXutil.str( AV103GXV13, 8, 0)));
         while ( AV103GXV13 <= AV47SD_RNRK_MEMO_C.size() )
         {
            AV48SD_RNRK_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV47SD_RNRK_MEMO_C.elementAt(-1+AV103GXV13));
            if ( ( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() == AV17D_GRD_SUBJECT_ID ) && ( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no() == AV15D_GRD_MEMO_NO ) && ( AV48SD_RNRK_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() == AV11D_GRD_CRF_ID ) )
            {
               AV48SD_RNRK_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( AV16D_GRD_SEL );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48SD_RNRK_MEMO_I", AV48SD_RNRK_MEMO_I);
               if (true) break;
            }
            AV103GXV13 = (int)(AV103GXV13+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103GXV13", GXutil.ltrim( GXutil.str( AV103GXV13, 8, 0)));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_187_fel_idx == 0 )
      {
         nGXsfl_187_idx = (short)(1) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
      }
      nGXsfl_187_fel_idx = (short)(1) ;
   }

   public void S262( )
   {
      /* 'SUB_SDT_SAVE_RNRK' Routine */
      AV64W_SESSION.setValue("B719_SD01_RNRK_MEMO", AV47SD_RNRK_MEMO_C.toxml(false, true, "B719_SD01_MEMO", "tablet-EDC_GXXEV3U3"));
   }

   public void S132( )
   {
      /* 'SUB_SDT_GET_RNRK' Routine */
      AV47SD_RNRK_MEMO_C.fromxml(AV64W_SESSION.getValue("B719_SD01_RNRK_MEMO"), "");
   }

   public void S272( )
   {
      /* 'SUB_SDT_UPD_EDIT' Routine */
      /* Start For Each Line in Grid2 */
      nRC_GXsfl_346 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_346"), ".", ",")) ;
      nGXsfl_346_fel_idx = (short)(0) ;
      while ( nGXsfl_346_fel_idx < nRC_GXsfl_346 )
      {
         nGXsfl_346_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_346_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_346_fel_idx+1)) ;
         sGXsfl_346_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_3463( ) ;
         AV29D_GRD2_SEL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_sel.getInternalname())) ;
         if ( localUtil.vcdate( httpContext.cgiGet( edtavD_grd2_date_Internalname), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vD_GRD2_DATE");
            GX_FocusControl = edtavD_grd2_date_Internalname ;
            wbErr = true ;
            AV22D_GRD2_DATE = GXutil.nullDate() ;
         }
         else
         {
            AV22D_GRD2_DATE = localUtil.ctod( httpContext.cgiGet( edtavD_grd2_date_Internalname), 0) ;
         }
         AV31D_GRD2_TIME = httpContext.cgiGet( edtavD_grd2_time_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_MEMO_NO");
            GX_FocusControl = edtavD_grd2_memo_no_Internalname ;
            wbErr = true ;
            AV28D_GRD2_MEMO_NO = (short)(0) ;
         }
         else
         {
            AV28D_GRD2_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_memo_no_Internalname), ".", ",")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_CRF_ID");
            GX_FocusControl = edtavD_grd2_crf_id_Internalname ;
            wbErr = true ;
            AV20D_GRD2_CRF_ID = (short)(0) ;
         }
         else
         {
            AV20D_GRD2_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_crf_id_Internalname), ".", ",")) ;
         }
         AV27D_GRD2_MEMO_KBN = httpContext.cgiGet( edtavD_grd2_memo_kbn_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD2_SUBJECT_ID");
            GX_FocusControl = edtavD_grd2_subject_id_Internalname ;
            wbErr = true ;
            AV30D_GRD2_SUBJECT_ID = 0 ;
         }
         else
         {
            AV30D_GRD2_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd2_subject_id_Internalname), ".", ",")) ;
         }
         AV21D_GRD2_CRF_SNM = httpContext.cgiGet( edtavD_grd2_crf_snm_Internalname) ;
         AV73D_GRD2_CRF_ITEM_NM = httpContext.cgiGet( edtavD_grd2_crf_item_nm_Internalname) ;
         AV26D_GRD2_MEMO = httpContext.cgiGet( edtavD_grd2_memo_Internalname) ;
         AV32D_GRD2_USER_NM = httpContext.cgiGet( edtavD_grd2_user_nm_Internalname) ;
         AV23D_GRD2_KAKUNIN = httpContext.cgiGet( edtavD_grd2_kakunin_Internalname) ;
         AV24D_GRD2_KAKUNIN_USER_NM = httpContext.cgiGet( edtavD_grd2_kakunin_user_nm_Internalname) ;
         AV25D_GRD2_KANRYO = httpContext.cgiGet( edtavD_grd2_kanryo_Internalname) ;
         AV105GXV14 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105GXV14", GXutil.ltrim( GXutil.str( AV105GXV14, 8, 0)));
         while ( AV105GXV14 <= AV43SD_EDIT_MEMO_C.size() )
         {
            AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV105GXV14));
            if ( ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() == AV30D_GRD2_SUBJECT_ID ) && ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no() == AV28D_GRD2_MEMO_NO ) && ( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() == AV20D_GRD2_CRF_ID ) )
            {
               AV44SD_EDIT_MEMO_I.setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( AV29D_GRD2_SEL );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
               if (true) break;
            }
            AV105GXV14 = (int)(AV105GXV14+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105GXV14", GXutil.ltrim( GXutil.str( AV105GXV14, 8, 0)));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_346_fel_idx == 0 )
      {
         nGXsfl_346_idx = (short)(1) ;
         sGXsfl_346_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_3463( ) ;
      }
      nGXsfl_346_fel_idx = (short)(1) ;
   }

   public void S282( )
   {
      /* 'SUB_SDT_SAVE_EDIT' Routine */
      AV64W_SESSION.setValue("B719_SD02_EDIT_MEMO", AV43SD_EDIT_MEMO_C.toxml(false, true, "B719_SD01_MEMO", "tablet-EDC_GXXEV3U3"));
   }

   public void S142( )
   {
      /* 'SUB_SDT_GET_EDIT' Routine */
      AV43SD_EDIT_MEMO_C.fromxml(AV64W_SESSION.getValue("B719_SD02_EDIT_MEMO"), "");
   }

   public void S302( )
   {
      /* 'SUB_SDT_SESSION_REMOVE' Routine */
      AV64W_SESSION.remove("B719_SD01_RNRK_MEMO");
      AV64W_SESSION.remove("B719_SD02_EDIT_MEMO");
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV49W_A_LOGIN_SDT;
      GXv_char2[0] = AV57W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV49W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b719_wp01_memo_info_impl.this.AV57W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57W_ERRCD", AV57W_ERRCD);
      if ( GXutil.strcmp(AV57W_ERRCD, "0") != 0 )
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
      if ( ! (GXutil.strcmp("", AV51W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV51W_A821_JS ;
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

   public void S332( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV82Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b719_wp01_memo_info");
   }

   public void e221N2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231N2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241N2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e251N2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e261N2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271N2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281N2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291N2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e301N2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e311N2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e321N2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e331N2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e341N2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e351N2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      AV35H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV47SD_RNRK_MEMO_C.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35H_A_PAGING_SDT", AV35H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT4[0] = AV35H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV35H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( AV47SD_RNRK_MEMO_C.size() <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid1_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid1_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid1_header_Visible, 5, 0)));
         lblTxt_info_Caption = "連絡メモはありません。" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_info_Internalname, "Caption", lblTxt_info_Caption);
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid1_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid1_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid1_header_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( AV47SD_RNRK_MEMO_C.size(), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void e361N2( )
   {
      /* 'PAGE2_FIRST' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e371N2( )
   {
      /* 'PAGE2_LAST' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e381N2( )
   {
      /* 'PAGE2_BACK' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      }
      httpContext.doAjaxRefresh();
   }

   public void e391N2( )
   {
      /* 'PAGE2_NEXT' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() < AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      }
      httpContext.doAjaxRefresh();
   }

   public void e401N2( )
   {
      /* 'PAGE201' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e411N2( )
   {
      /* 'PAGE202' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e421N2( )
   {
      /* 'PAGE203' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e431N2( )
   {
      /* 'PAGE204' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e441N2( )
   {
      /* 'PAGE205' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e451N2( )
   {
      /* 'PAGE206' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e461N2( )
   {
      /* 'PAGE207' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e471N2( )
   {
      /* 'PAGE208' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e481N2( )
   {
      /* 'PAGE209' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void e491N2( )
   {
      /* 'PAGE210' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Page_no( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE2' Routine */
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid2_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      AV36H_A_PAGING_SDT2.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV43SD_EDIT_MEMO_C.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36H_A_PAGING_SDT2", AV36H_A_PAGING_SDT2);
      GXv_SdtA_PAGING_SDT4[0] = AV36H_A_PAGING_SDT2;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV36H_A_PAGING_SDT2 = GXv_SdtA_PAGING_SDT4[0] ;
      lblTxt_page201_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page201_Internalname, "Caption", lblTxt_page201_Caption);
      lblTxt_page202_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page202_Internalname, "Caption", lblTxt_page202_Caption);
      lblTxt_page203_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page203_Internalname, "Caption", lblTxt_page203_Caption);
      lblTxt_page204_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page204_Internalname, "Caption", lblTxt_page204_Caption);
      lblTxt_page205_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page205_Internalname, "Caption", lblTxt_page205_Caption);
      lblTxt_page206_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page206_Internalname, "Caption", lblTxt_page206_Caption);
      lblTxt_page207_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page207_Internalname, "Caption", lblTxt_page207_Caption);
      lblTxt_page208_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page208_Internalname, "Caption", lblTxt_page208_Caption);
      lblTxt_page209_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page209_Internalname, "Caption", lblTxt_page209_Caption);
      lblTxt_page210_Caption = GXutil.trim( GXutil.str( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page210_Internalname, "Caption", lblTxt_page210_Caption);
      tblTbl_page201_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page201_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page201_Visible, 5, 0)));
      tblTbl_page202_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page202_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page202_Visible, 5, 0)));
      tblTbl_page203_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page203_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page203_Visible, 5, 0)));
      tblTbl_page204_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page204_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page204_Visible, 5, 0)));
      tblTbl_page205_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page205_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page205_Visible, 5, 0)));
      tblTbl_page206_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page206_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page206_Visible, 5, 0)));
      tblTbl_page207_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page207_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page207_Visible, 5, 0)));
      tblTbl_page208_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page208_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page208_Visible, 5, 0)));
      tblTbl_page209_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page209_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page209_Visible, 5, 0)));
      tblTbl_page210_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page210_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page210_Visible, 5, 0)));
      tblTbl_page2_Visible = AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page2_Visible, 5, 0)));
      lblTxt_page201_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page201_Internalname, "Class", lblTxt_page201_Class);
      lblTxt_page202_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page202_Internalname, "Class", lblTxt_page202_Class);
      lblTxt_page203_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page203_Internalname, "Class", lblTxt_page203_Class);
      lblTxt_page204_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page204_Internalname, "Class", lblTxt_page204_Class);
      lblTxt_page205_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page205_Internalname, "Class", lblTxt_page205_Class);
      lblTxt_page206_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page206_Internalname, "Class", lblTxt_page206_Class);
      lblTxt_page207_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page207_Internalname, "Class", lblTxt_page207_Class);
      lblTxt_page208_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page208_Internalname, "Class", lblTxt_page208_Class);
      lblTxt_page209_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page209_Internalname, "Class", lblTxt_page209_Class);
      lblTxt_page210_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page210_Internalname, "Class", lblTxt_page210_Class);
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page201_Caption, ".") )
      {
         lblTxt_page201_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page201_Internalname, "Class", lblTxt_page201_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page202_Caption, ".") )
      {
         lblTxt_page202_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page202_Internalname, "Class", lblTxt_page202_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page203_Caption, ".") )
      {
         lblTxt_page203_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page203_Internalname, "Class", lblTxt_page203_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page204_Caption, ".") )
      {
         lblTxt_page204_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page204_Internalname, "Class", lblTxt_page204_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page205_Caption, ".") )
      {
         lblTxt_page205_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page205_Internalname, "Class", lblTxt_page205_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page206_Caption, ".") )
      {
         lblTxt_page206_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page206_Internalname, "Class", lblTxt_page206_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page207_Caption, ".") )
      {
         lblTxt_page207_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page207_Internalname, "Class", lblTxt_page207_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page208_Caption, ".") )
      {
         lblTxt_page208_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page208_Internalname, "Class", lblTxt_page208_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page209_Caption, ".") )
      {
         lblTxt_page209_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page209_Internalname, "Class", lblTxt_page209_Class);
      }
      else if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page210_Caption, ".") )
      {
         lblTxt_page210_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page210_Internalname, "Class", lblTxt_page210_Class);
      }
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back2_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back2_Internalname, "Class", lblTxt_back2_Class);
      }
      else
      {
         lblTxt_back2_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back2_Internalname, "Class", lblTxt_back2_Class);
      }
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next2_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next2_Internalname, "Class", lblTxt_next2_Class);
      }
      else
      {
         lblTxt_next2_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next2_Internalname, "Class", lblTxt_next2_Class);
      }
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first2_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first2_Internalname, "Class", lblTxt_first2_Class);
      }
      else
      {
         lblTxt_first2_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first2_Internalname, "Class", lblTxt_first2_Class);
      }
      if ( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last2_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last2_Internalname, "Class", lblTxt_last2_Class);
      }
      else
      {
         lblTxt_last2_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last2_Internalname, "Class", lblTxt_last2_Class);
      }
      subgrid2_gotopage( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( AV43SD_EDIT_MEMO_C.size() <= 0 )
      {
         tblTbl_page_area2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area2_Visible, 5, 0)));
         tblTbl_grid2_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid2_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid2_header_Visible, 5, 0)));
         lblTxt_info2_Caption = "作成メモはありません。" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_info2_Internalname, "Caption", lblTxt_info2_Caption);
      }
      else
      {
         tblTbl_page_area2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area2_Visible, 5, 0)));
         tblTbl_grid2_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid2_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid2_header_Visible, 5, 0)));
         lblTxt_info2_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_info2_Internalname, "Caption", lblTxt_info2_Caption);
         lblTxt_rec_cnt2_Caption = "(全"+GXutil.trim( GXutil.str( AV43SD_EDIT_MEMO_C.size(), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt2_Internalname, "Caption", lblTxt_rec_cnt2_Caption);
      }
   }

   private void e531N3( )
   {
      /* Grid2_Load Routine */
      if ( AV40H_TAB_KBN == 1 )
      {
         AV84GXV4 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84GXV4", GXutil.ltrim( GXutil.str( AV84GXV4, 8, 0)));
         while ( AV84GXV4 <= AV43SD_EDIT_MEMO_C.size() )
         {
            AV44SD_EDIT_MEMO_I = (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)((SdtB719_SD01_MEMO_B719_SD01_MEMOItem)AV43SD_EDIT_MEMO_C.elementAt(-1+AV84GXV4));
            AV29D_GRD2_SEL = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg() ;
            AV30D_GRD2_SUBJECT_ID = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id() ;
            AV28D_GRD2_MEMO_NO = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no() ;
            AV20D_GRD2_CRF_ID = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ;
            AV22D_GRD2_DATE = GXutil.resetTime(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime()) ;
            GXt_char1 = AV31D_GRD2_TIME ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime(), "HH:MI:SS", GXv_char2) ;
            b719_wp01_memo_info_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SD_EDIT_MEMO_I", AV44SD_EDIT_MEMO_I);
            AV31D_GRD2_TIME = GXt_char1 ;
            AV5W_TBM31_CRF_ID = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5W_TBM31_CRF_ID", GXutil.ltrim( GXutil.str( AV5W_TBM31_CRF_ID, 4, 0)));
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
            AV21D_GRD2_CRF_SNM = AV6W_TBM31_CRF_SNM + "(" + GXutil.trim( GXutil.str( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no(), 6, 0)) + ")" ;
            AV74W_TBM32_CRF_ITEM_CD = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74W_TBM32_CRF_ITEM_CD", AV74W_TBM32_CRF_ITEM_CD);
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            AV73D_GRD2_CRF_ITEM_NM = AV75W_TBM32_CRF_ITEM_NM ;
            if ( GXutil.len( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo()) > 20 )
            {
               AV26D_GRD2_MEMO = GXutil.substring( AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo(), 1, 20) + "…" ;
            }
            else
            {
               AV26D_GRD2_MEMO = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo() ;
            }
            if ( GXutil.strcmp(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg(), "1") == 0 )
            {
               AV25D_GRD2_KANRYO = "済" ;
               chkavD_grd2_sel.setVisible( 0 );
            }
            else
            {
               AV25D_GRD2_KANRYO = "未" ;
               chkavD_grd2_sel.setVisible( 1 );
            }
            if ( GXutil.strcmp(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn(), "1") == 0 )
            {
               AV27D_GRD2_MEMO_KBN = "個人" ;
               AV32D_GRD2_USER_NM = "" ;
               AV23D_GRD2_KAKUNIN = "" ;
               AV24D_GRD2_KAKUNIN_USER_NM = "" ;
            }
            else
            {
               AV27D_GRD2_MEMO_KBN = "連絡" ;
               AV69W_TAM08_SITE_ID = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV69W_TAM08_SITE_ID", AV69W_TAM08_SITE_ID);
               /* Execute user subroutine: S233 */
               S233 ();
               if (returnInSub) return;
               AV32D_GRD2_USER_NM = AV70W_TAM08_SITE_SNM + "：" ;
               AV65W_TAM04_AUTH_CD = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65W_TAM04_AUTH_CD", AV65W_TAM04_AUTH_CD);
               /* Execute user subroutine: S243 */
               S243 ();
               if (returnInSub) return;
               AV32D_GRD2_USER_NM = AV32D_GRD2_USER_NM + AV66W_TAM04_AUTH_NM ;
               if ( ! (GXutil.strcmp("", AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id())==0) )
               {
                  AV67W_TAM07_USER_ID = AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV67W_TAM07_USER_ID", AV67W_TAM07_USER_ID);
                  /* Execute user subroutine: S222 */
                  S222 ();
                  if (returnInSub) return;
                  AV24D_GRD2_KAKUNIN_USER_NM = AV68W_TAM07_USER_NM ;
               }
               else
               {
                  AV24D_GRD2_KAKUNIN_USER_NM = "" ;
               }
               if ( GXutil.strcmp(AV44SD_EDIT_MEMO_I.getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg(), "1") == 0 )
               {
                  AV23D_GRD2_KAKUNIN = "済" ;
               }
               else
               {
                  AV23D_GRD2_KAKUNIN = "未" ;
               }
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(346) ;
            }
            if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
            {
               sendrow_3463( ) ;
               GRID2_nEOF = (byte)(1) ;
               if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
               {
                  GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
               }
            }
            if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
            {
               GRID2_nEOF = (byte)(0) ;
            }
            GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
            AV84GXV4 = (int)(AV84GXV4+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84GXV4", GXutil.ltrim( GXutil.str( AV84GXV4, 8, 0)));
         }
      }
   }

   public void wb_table2_389_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B719_WP01_MEMO_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_memo_kanryo_exec_Internalname, "BTN_MEMO_KANRYO_EXEC", "", "", lblBtn_memo_kanryo_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_MEMO_KANRYO_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_csv_out_exec_Internalname, "BTN_CSV_OUT_EXEC", "", "", lblBtn_csv_out_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 395,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV38H_INIT_FLG), GXutil.rtrim( localUtil.format( AV38H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(395);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B719_WP01_MEMO_INFO.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV39H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV39H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B719_WP01_MEMO_INFO.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 397,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_tab_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV40H_TAB_KBN, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40H_TAB_KBN), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(397);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_tab_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B719_WP01_MEMO_INFO.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 398,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_device_Internalname, GXutil.rtrim( AV37H_DEVICE), GXutil.rtrim( localUtil.format( AV37H_DEVICE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(398);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_device_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<span></span>") ;
         wb_table3_399_1N2( true) ;
      }
      else
      {
         wb_table3_399_1N2( false) ;
      }
      return  ;
   }

   public void wb_table3_399_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_405_1N2( true) ;
      }
      else
      {
         wb_table4_405_1N2( false) ;
      }
      return  ;
   }

   public void wb_table4_405_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_389_1N2e( true) ;
      }
      else
      {
         wb_table2_389_1N2e( false) ;
      }
   }

   public void wb_table4_405_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 410,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row1_Internalname, GXutil.ltrim( localUtil.ntoc( AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36H_A_PAGING_SDT2.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(410);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row1_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_405_1N2e( true) ;
      }
      else
      {
         wb_table4_405_1N2e( false) ;
      }
   }

   public void wb_table3_399_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "MAX_ROW", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 404,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(404);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_399_1N2e( true) ;
      }
      else
      {
         wb_table3_399_1N2e( false) ;
      }
   }

   public void wb_table1_2_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 500, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 900, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_6_1N2( true) ;
      }
      else
      {
         wb_table5_6_1N2( false) ;
      }
      return  ;
   }

   public void wb_table5_6_1N2e( boolean wbgen )
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
         wb_table1_2_1N2e( true) ;
      }
      else
      {
         wb_table1_2_1N2e( false) ;
      }
   }

   public void wb_table5_6_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table6_9_1N2( true) ;
      }
      else
      {
         wb_table6_9_1N2( false) ;
      }
      return  ;
   }

   public void wb_table6_9_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_6_1N2e( true) ;
      }
      else
      {
         wb_table5_6_1N2e( false) ;
      }
   }

   public void wb_table6_9_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table7_14_1N2( true) ;
      }
      else
      {
         wb_table7_14_1N2( false) ;
      }
      return  ;
   }

   public void wb_table7_14_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:25px\">") ;
         wb_table8_41_1N2( true) ;
      }
      else
      {
         wb_table8_41_1N2( false) ;
      }
      return  ;
   }

   public void wb_table8_41_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td bgcolor=\"#B0E0E6\" colspan=\"3\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"vertical-align:top\">") ;
         wb_table9_59_1N2( true) ;
      }
      else
      {
         wb_table9_59_1N2( false) ;
      }
      return  ;
   }

   public void wb_table9_59_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table10_212_1N2( true) ;
      }
      else
      {
         wb_table10_212_1N2( false) ;
      }
      return  ;
   }

   public void wb_table10_212_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_9_1N2e( true) ;
      }
      else
      {
         wb_table6_9_1N2e( false) ;
      }
   }

   public void wb_table10_212_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_edit_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_edit_Internalname, tblTbl_edit_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_215_1N2( true) ;
      }
      else
      {
         wb_table11_215_1N2( false) ;
      }
      return  ;
   }

   public void wb_table11_215_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_212_1N2e( true) ;
      }
      else
      {
         wb_table10_212_1N2e( false) ;
      }
   }

   public void wb_table11_215_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_test_Internalname, tblTbl_test_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:10px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_info2_Internalname, lblTxt_info2_Caption, "", "", lblTxt_info2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_223_1N2( true) ;
      }
      else
      {
         wb_table12_223_1N2( false) ;
      }
      return  ;
   }

   public void wb_table12_223_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table13_319_1N2( true) ;
      }
      else
      {
         wb_table13_319_1N2( false) ;
      }
      return  ;
   }

   public void wb_table13_319_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /*  Grid Control  */
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"346\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid2Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.booltostr( AV29D_GRD2_SEL));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavD_grd2_sel.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", localUtil.format(AV22D_GRD2_DATE, "9999/99/99"));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_date_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV31D_GRD2_TIME));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_time_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28D_GRD2_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20D_GRD2_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV27D_GRD2_MEMO_KBN));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_memo_kbn_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV30D_GRD2_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV21D_GRD2_CRF_SNM));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV73D_GRD2_CRF_ITEM_NM));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_crf_item_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV26D_GRD2_MEMO));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_memo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV32D_GRD2_USER_NM));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV23D_GRD2_KAKUNIN));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_kakunin_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV24D_GRD2_KAKUNIN_USER_NM));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_kakunin_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV25D_GRD2_KANRYO));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_kanryo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 346 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_346 = (short)(nGXsfl_346_idx-1) ;
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
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
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
         wb_table11_215_1N2e( true) ;
      }
      else
      {
         wb_table11_215_1N2e( false) ;
      }
   }

   public void wb_table13_319_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid2_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid2_header_Internalname, tblTbl_grid2_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 322,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd2_all_chk.getInternalname(), GXutil.booltostr( AV19D_GRD2_ALL_CHk), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(322, this, 'true', 'false');gx.ajax.executeCliEvent('e141n2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(322);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "選択", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "作成日時", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, "メモ<br>区分", "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(1), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "患者No", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:140px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "CRF (VISIT番号)", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "CRF項目名", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:140px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "メモ内容", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "連絡先", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "確認", "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "確認者", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "完了", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_319_1N2e( true) ;
      }
      else
      {
         wb_table13_319_1N2e( false) ;
      }
   }

   public void wb_table12_223_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_area2_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area2_Internalname, tblTbl_page_area2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt2_Internalname, lblTxt_rec_cnt2_Caption, "", "", lblTxt_rec_cnt2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_229_1N2( true) ;
      }
      else
      {
         wb_table14_229_1N2( false) ;
      }
      return  ;
   }

   public void wb_table14_229_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_223_1N2e( true) ;
      }
      else
      {
         wb_table12_223_1N2e( false) ;
      }
   }

   public void wb_table14_229_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page2_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page2_Internalname, tblTbl_page2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:9px\">") ;
         wb_table15_232_1N2( true) ;
      }
      else
      {
         wb_table15_232_1N2( false) ;
      }
      return  ;
   }

   public void wb_table15_232_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table16_238_1N2( true) ;
      }
      else
      {
         wb_table16_238_1N2( false) ;
      }
      return  ;
   }

   public void wb_table16_238_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_244_1N2( true) ;
      }
      else
      {
         wb_table17_244_1N2( false) ;
      }
      return  ;
   }

   public void wb_table17_244_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_250_1N2( true) ;
      }
      else
      {
         wb_table18_250_1N2( false) ;
      }
      return  ;
   }

   public void wb_table18_250_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_256_1N2( true) ;
      }
      else
      {
         wb_table19_256_1N2( false) ;
      }
      return  ;
   }

   public void wb_table19_256_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_262_1N2( true) ;
      }
      else
      {
         wb_table20_262_1N2( false) ;
      }
      return  ;
   }

   public void wb_table20_262_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_268_1N2( true) ;
      }
      else
      {
         wb_table21_268_1N2( false) ;
      }
      return  ;
   }

   public void wb_table21_268_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_274_1N2( true) ;
      }
      else
      {
         wb_table22_274_1N2( false) ;
      }
      return  ;
   }

   public void wb_table22_274_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_280_1N2( true) ;
      }
      else
      {
         wb_table23_280_1N2( false) ;
      }
      return  ;
   }

   public void wb_table23_280_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_286_1N2( true) ;
      }
      else
      {
         wb_table24_286_1N2( false) ;
      }
      return  ;
   }

   public void wb_table24_286_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_292_1N2( true) ;
      }
      else
      {
         wb_table25_292_1N2( false) ;
      }
      return  ;
   }

   public void wb_table25_292_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_298_1N2( true) ;
      }
      else
      {
         wb_table26_298_1N2( false) ;
      }
      return  ;
   }

   public void wb_table26_298_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_304_1N2( true) ;
      }
      else
      {
         wb_table27_304_1N2( false) ;
      }
      return  ;
   }

   public void wb_table27_304_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table28_310_1N2( true) ;
      }
      else
      {
         wb_table28_310_1N2( false) ;
      }
      return  ;
   }

   public void wb_table28_310_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_229_1N2e( true) ;
      }
      else
      {
         wb_table14_229_1N2e( false) ;
      }
   }

   public void wb_table28_310_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_last2_Internalname, tblTbl_last2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:52px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last2_Internalname, "最後へ", "", "", lblTxt_last2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE2_LAST\\'."+"'", "", lblTxt_last2_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_310_1N2e( true) ;
      }
      else
      {
         wb_table28_310_1N2e( false) ;
      }
   }

   public void wb_table27_304_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_next2_Internalname, tblTbl_next2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next2_Internalname, "次へ", "", "", lblTxt_next2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE2_NEXT\\'."+"'", "", lblTxt_next2_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_304_1N2e( true) ;
      }
      else
      {
         wb_table27_304_1N2e( false) ;
      }
   }

   public void wb_table26_298_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page210_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page210_Internalname, tblTbl_page210_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page210_Internalname, lblTxt_page210_Caption, "", "", lblTxt_page210_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE210\\'."+"'", "", lblTxt_page210_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_298_1N2e( true) ;
      }
      else
      {
         wb_table26_298_1N2e( false) ;
      }
   }

   public void wb_table25_292_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page209_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page209_Internalname, tblTbl_page209_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page209_Internalname, lblTxt_page209_Caption, "", "", lblTxt_page209_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE209\\'."+"'", "", lblTxt_page209_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_292_1N2e( true) ;
      }
      else
      {
         wb_table25_292_1N2e( false) ;
      }
   }

   public void wb_table24_286_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page208_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page208_Internalname, tblTbl_page208_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page208_Internalname, lblTxt_page208_Caption, "", "", lblTxt_page208_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE208\\'."+"'", "", lblTxt_page208_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_286_1N2e( true) ;
      }
      else
      {
         wb_table24_286_1N2e( false) ;
      }
   }

   public void wb_table23_280_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page207_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page207_Internalname, tblTbl_page207_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page207_Internalname, lblTxt_page207_Caption, "", "", lblTxt_page207_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE207\\'."+"'", "", lblTxt_page207_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_280_1N2e( true) ;
      }
      else
      {
         wb_table23_280_1N2e( false) ;
      }
   }

   public void wb_table22_274_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page206_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page206_Internalname, tblTbl_page206_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page206_Internalname, lblTxt_page206_Caption, "", "", lblTxt_page206_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE206\\'."+"'", "", lblTxt_page206_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_274_1N2e( true) ;
      }
      else
      {
         wb_table22_274_1N2e( false) ;
      }
   }

   public void wb_table21_268_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page205_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page205_Internalname, tblTbl_page205_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page205_Internalname, lblTxt_page205_Caption, "", "", lblTxt_page205_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE205\\'."+"'", "", lblTxt_page205_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_268_1N2e( true) ;
      }
      else
      {
         wb_table21_268_1N2e( false) ;
      }
   }

   public void wb_table20_262_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page204_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page204_Internalname, tblTbl_page204_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page204_Internalname, lblTxt_page204_Caption, "", "", lblTxt_page204_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE204\\'."+"'", "", lblTxt_page204_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_262_1N2e( true) ;
      }
      else
      {
         wb_table20_262_1N2e( false) ;
      }
   }

   public void wb_table19_256_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page203_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page203_Internalname, tblTbl_page203_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page203_Internalname, lblTxt_page203_Caption, "", "", lblTxt_page203_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE203\\'."+"'", "", lblTxt_page203_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_256_1N2e( true) ;
      }
      else
      {
         wb_table19_256_1N2e( false) ;
      }
   }

   public void wb_table18_250_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page202_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page202_Internalname, tblTbl_page202_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page202_Internalname, lblTxt_page202_Caption, "", "", lblTxt_page202_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE202\\'."+"'", "", lblTxt_page202_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_250_1N2e( true) ;
      }
      else
      {
         wb_table18_250_1N2e( false) ;
      }
   }

   public void wb_table17_244_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page201_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page201_Internalname, tblTbl_page201_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page201_Internalname, lblTxt_page201_Caption, "", "", lblTxt_page201_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE201\\'."+"'", "", lblTxt_page201_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_244_1N2e( true) ;
      }
      else
      {
         wb_table17_244_1N2e( false) ;
      }
   }

   public void wb_table16_238_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_back2_Internalname, tblTbl_back2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back2_Internalname, "前へ", "", "", lblTxt_back2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE2_BACK\\'."+"'", "", lblTxt_back2_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_238_1N2e( true) ;
      }
      else
      {
         wb_table16_238_1N2e( false) ;
      }
   }

   public void wb_table15_232_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 52, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_first2_Internalname, tblTbl_first2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first2_Internalname, "最初へ", "", "", lblTxt_first2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE2_FIRST\\'."+"'", "", lblTxt_first2_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_232_1N2e( true) ;
      }
      else
      {
         wb_table15_232_1N2e( false) ;
      }
   }

   public void wb_table9_59_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_tuti_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_tuti_Internalname, tblTbl_tuti_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table29_62_1N2( true) ;
      }
      else
      {
         wb_table29_62_1N2( false) ;
      }
      return  ;
   }

   public void wb_table29_62_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_59_1N2e( true) ;
      }
      else
      {
         wb_table9_59_1N2e( false) ;
      }
   }

   public void wb_table29_62_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:22px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_info_Internalname, lblTxt_info_Caption, "", "", lblTxt_info_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table30_72_1N2( true) ;
      }
      else
      {
         wb_table30_72_1N2( false) ;
      }
      return  ;
   }

   public void wb_table30_72_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table31_168_1N2( true) ;
      }
      else
      {
         wb_table31_168_1N2( false) ;
      }
      return  ;
   }

   public void wb_table31_168_1N2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"187\">") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV16D_GRD_SEL));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV13D_GRD_DATETIME, "9999/99/99 99:99:99"));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_datetime_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15D_GRD_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV12D_GRD_CRF_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV72D_GRD_CRF_ITEM_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_item_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV14D_GRD_MEMO));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_memo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV18D_GRD_USER_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 187 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_187 = (short)(nGXsfl_187_idx-1) ;
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
         wb_table29_62_1N2e( true) ;
      }
      else
      {
         wb_table29_62_1N2e( false) ;
      }
   }

   public void wb_table31_168_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid1_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid1_header_Internalname, tblTbl_grid1_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_chk.getInternalname(), GXutil.booltostr( AV10D_GRD_ALL_CHK), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(171, this, 'true', 'false');gx.ajax.executeCliEvent('e131n2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(171);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "選択", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:125px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "登録日時", "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "患者No", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:160px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "CRF (VISIT番号)", "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:125px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "CRF項目名", "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:190px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "メモ内容", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:105px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, "記入者", "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table31_168_1N2e( true) ;
      }
      else
      {
         wb_table31_168_1N2e( false) ;
      }
   }

   public void wb_table30_72_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table32_78_1N2( true) ;
      }
      else
      {
         wb_table32_78_1N2( false) ;
      }
      return  ;
   }

   public void wb_table32_78_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table30_72_1N2e( true) ;
      }
      else
      {
         wb_table30_72_1N2e( false) ;
      }
   }

   public void wb_table32_78_1N2( boolean wbgen )
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
         wb_table33_81_1N2( true) ;
      }
      else
      {
         wb_table33_81_1N2( false) ;
      }
      return  ;
   }

   public void wb_table33_81_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table34_87_1N2( true) ;
      }
      else
      {
         wb_table34_87_1N2( false) ;
      }
      return  ;
   }

   public void wb_table34_87_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table35_93_1N2( true) ;
      }
      else
      {
         wb_table35_93_1N2( false) ;
      }
      return  ;
   }

   public void wb_table35_93_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table36_99_1N2( true) ;
      }
      else
      {
         wb_table36_99_1N2( false) ;
      }
      return  ;
   }

   public void wb_table36_99_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table37_105_1N2( true) ;
      }
      else
      {
         wb_table37_105_1N2( false) ;
      }
      return  ;
   }

   public void wb_table37_105_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table38_111_1N2( true) ;
      }
      else
      {
         wb_table38_111_1N2( false) ;
      }
      return  ;
   }

   public void wb_table38_111_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table39_117_1N2( true) ;
      }
      else
      {
         wb_table39_117_1N2( false) ;
      }
      return  ;
   }

   public void wb_table39_117_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table40_123_1N2( true) ;
      }
      else
      {
         wb_table40_123_1N2( false) ;
      }
      return  ;
   }

   public void wb_table40_123_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table41_129_1N2( true) ;
      }
      else
      {
         wb_table41_129_1N2( false) ;
      }
      return  ;
   }

   public void wb_table41_129_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table42_135_1N2( true) ;
      }
      else
      {
         wb_table42_135_1N2( false) ;
      }
      return  ;
   }

   public void wb_table42_135_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table43_141_1N2( true) ;
      }
      else
      {
         wb_table43_141_1N2( false) ;
      }
      return  ;
   }

   public void wb_table43_141_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table44_147_1N2( true) ;
      }
      else
      {
         wb_table44_147_1N2( false) ;
      }
      return  ;
   }

   public void wb_table44_147_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table45_153_1N2( true) ;
      }
      else
      {
         wb_table45_153_1N2( false) ;
      }
      return  ;
   }

   public void wb_table45_153_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table46_159_1N2( true) ;
      }
      else
      {
         wb_table46_159_1N2( false) ;
      }
      return  ;
   }

   public void wb_table46_159_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table32_78_1N2e( true) ;
      }
      else
      {
         wb_table32_78_1N2e( false) ;
      }
   }

   public void wb_table46_159_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table46_159_1N2e( true) ;
      }
      else
      {
         wb_table46_159_1N2e( false) ;
      }
   }

   public void wb_table45_153_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table45_153_1N2e( true) ;
      }
      else
      {
         wb_table45_153_1N2e( false) ;
      }
   }

   public void wb_table44_147_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table44_147_1N2e( true) ;
      }
      else
      {
         wb_table44_147_1N2e( false) ;
      }
   }

   public void wb_table43_141_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table43_141_1N2e( true) ;
      }
      else
      {
         wb_table43_141_1N2e( false) ;
      }
   }

   public void wb_table42_135_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table42_135_1N2e( true) ;
      }
      else
      {
         wb_table42_135_1N2e( false) ;
      }
   }

   public void wb_table41_129_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table41_129_1N2e( true) ;
      }
      else
      {
         wb_table41_129_1N2e( false) ;
      }
   }

   public void wb_table40_123_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table40_123_1N2e( true) ;
      }
      else
      {
         wb_table40_123_1N2e( false) ;
      }
   }

   public void wb_table39_117_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table39_117_1N2e( true) ;
      }
      else
      {
         wb_table39_117_1N2e( false) ;
      }
   }

   public void wb_table38_111_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table38_111_1N2e( true) ;
      }
      else
      {
         wb_table38_111_1N2e( false) ;
      }
   }

   public void wb_table37_105_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table37_105_1N2e( true) ;
      }
      else
      {
         wb_table37_105_1N2e( false) ;
      }
   }

   public void wb_table36_99_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table36_99_1N2e( true) ;
      }
      else
      {
         wb_table36_99_1N2e( false) ;
      }
   }

   public void wb_table35_93_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table35_93_1N2e( true) ;
      }
      else
      {
         wb_table35_93_1N2e( false) ;
      }
   }

   public void wb_table34_87_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table34_87_1N2e( true) ;
      }
      else
      {
         wb_table34_87_1N2e( false) ;
      }
   }

   public void wb_table33_81_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table33_81_1N2e( true) ;
      }
      else
      {
         wb_table33_81_1N2e( false) ;
      }
   }

   public void wb_table8_41_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTab_tuti_Internalname, "連絡メモ", "", "", lblTab_tuti_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'TAB_TUTI\\'."+"'", "", lblTab_tuti_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTab_edit_Internalname, "作成メモ", "", "", lblTab_edit_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'TAB_EDIT\\'."+"'", "", lblTab_edit_Class, 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:650px\">") ;
         wb_table47_49_1N2( true) ;
      }
      else
      {
         wb_table47_49_1N2( false) ;
      }
      return  ;
   }

   public void wb_table47_49_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_41_1N2e( true) ;
      }
      else
      {
         wb_table8_41_1N2e( false) ;
      }
   }

   public void wb_table47_49_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable12_Internalname, tblTable12_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "ソート順：", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_sort, cmbavD_sort.getInternalname(), GXutil.trim( GXutil.str( AV33D_SORT, 1, 0)), 1, cmbavD_sort.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_SORT.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 1, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "", true, "HLP_B719_WP01_MEMO_INFO.htm");
         cmbavD_sort.setValue( GXutil.trim( GXutil.str( AV33D_SORT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_sort.getInternalname(), "Values", cmbavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table47_49_1N2e( true) ;
      }
      else
      {
         wb_table47_49_1N2e( false) ;
      }
   }

   public void wb_table7_14_1N2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "メモ情報", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table48_20_1N2( true) ;
      }
      else
      {
         wb_table48_20_1N2( false) ;
      }
      return  ;
   }

   public void wb_table48_20_1N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_14_1N2e( true) ;
      }
      else
      {
         wb_table7_14_1N2e( false) ;
      }
   }

   public void wb_table48_20_1N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_memo_kanryo_Internalname, "メモ完了", "", "", lblTxt_btn_memo_kanryo_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_MEMO_KANRYO\\'."+"'", "", "TextBlockBtn080", 5, "", lblTxt_btn_memo_kanryo_Visible, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_Internalname, "CRFを開く", "", "", lblTxt_btn_crf_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_Internalname, "CSV出力", "", "", lblTxt_btn_csv_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:105px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_exit_Internalname, "閉じる", "", "", lblTxt_btn_exit_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EXIT\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B719_WP01_MEMO_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"6\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table48_20_1N2e( true) ;
      }
      else
      {
         wb_table48_20_1N2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV42P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42P_STUDY_ID", GXutil.ltrim( GXutil.str( AV42P_STUDY_ID, 10, 0)));
      AV41P_AUTH_CD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41P_AUTH_CD", AV41P_AUTH_CD);
      AV53W_AUTO_SENI_FLG = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53W_AUTO_SENI_FLG", AV53W_AUTO_SENI_FLG);
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
      pa1N2( ) ;
      ws1N2( ) ;
      we1N2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513293996");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b719_wp01_memo_info.js", "?202071513293998");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1872( )
   {
      chkavD_grd_sel.setInternalname( "vD_GRD_SEL_"+sGXsfl_187_idx );
      edtavD_grd_datetime_Internalname = "vD_GRD_DATETIME_"+sGXsfl_187_idx ;
      edtavD_grd_memo_no_Internalname = "vD_GRD_MEMO_NO_"+sGXsfl_187_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_187_idx ;
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_187_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_187_idx ;
      edtavD_grd_crf_item_nm_Internalname = "vD_GRD_CRF_ITEM_NM_"+sGXsfl_187_idx ;
      edtavD_grd_memo_Internalname = "vD_GRD_MEMO_"+sGXsfl_187_idx ;
      edtavD_grd_user_nm_Internalname = "vD_GRD_USER_NM_"+sGXsfl_187_idx ;
   }

   public void subsflControlProps_fel_1872( )
   {
      chkavD_grd_sel.setInternalname( "vD_GRD_SEL_"+sGXsfl_187_fel_idx );
      edtavD_grd_datetime_Internalname = "vD_GRD_DATETIME_"+sGXsfl_187_fel_idx ;
      edtavD_grd_memo_no_Internalname = "vD_GRD_MEMO_NO_"+sGXsfl_187_fel_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_187_fel_idx ;
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_187_fel_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_187_fel_idx ;
      edtavD_grd_crf_item_nm_Internalname = "vD_GRD_CRF_ITEM_NM_"+sGXsfl_187_fel_idx ;
      edtavD_grd_memo_Internalname = "vD_GRD_MEMO_"+sGXsfl_187_fel_idx ;
      edtavD_grd_user_nm_Internalname = "vD_GRD_USER_NM_"+sGXsfl_187_fel_idx ;
   }

   public void sendrow_1872( )
   {
      subsflControlProps_1872( ) ;
      wb1N0( ) ;
      if ( ( 8 * 1 == 0 ) || ( nGXsfl_187_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_187_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_187_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_187_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_187_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_187_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd_sel.getEnabled()!=0)&&(chkavD_grd_sel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 190,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd_sel.getInternalname(),GXutil.booltostr( AV16D_GRD_SEL),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd_sel.getEnabled()!=0)&&(chkavD_grd_sel.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(190, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd_sel.getEnabled()!=0)&&(chkavD_grd_sel.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(190);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:125px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_datetime_Enabled!=0)&&(edtavD_grd_datetime_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 192,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_datetime_Internalname,localUtil.format(AV13D_GRD_DATETIME, "9999/99/99 99:99:99"),localUtil.format( AV13D_GRD_DATETIME, "9999/99/99 99:99:99"),TempTags+((edtavD_grd_datetime_Enabled!=0)&&(edtavD_grd_datetime_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_datetime_Enabled!=0)&&(edtavD_grd_datetime_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(192);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_datetime_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_datetime_Enabled),new Integer(0),"text","",new Integer(19),"chr",new Integer(1),"row",new Integer(19),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD_HMS","right"});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd1_hidden_Internalname+"_"+sGXsfl_187_idx,new Integer(tblTbl_grd1_hidden_Visible),"TableHidden","","","","","","",new Integer(1),new Integer(2),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_memo_no_Enabled!=0)&&(edtavD_grd_memo_no_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 196,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_memo_no_Internalname,GXutil.ltrim( localUtil.ntoc( AV15D_GRD_MEMO_NO, (byte)(3), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15D_GRD_MEMO_NO), "ZZ9")),TempTags+((edtavD_grd_memo_no_Enabled!=0)&&(edtavD_grd_memo_no_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_memo_no_Enabled!=0)&&(edtavD_grd_memo_no_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(196);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_memo_no_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(3),"chr",new Integer(1),"row",new Integer(3),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 197,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV11D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(197);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_id_Jsonclick,new Integer(0),"Attribute_s","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(edtavD_grd_crf_id_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 199,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV17D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")),((edtavD_grd_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17D_GRD_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17D_GRD_SUBJECT_ID), "ZZZZZ9")),TempTags+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(199);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_subject_id_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_subject_id_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:160px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection9_Internalname+"_"+sGXsfl_187_idx,new Integer(1),new Integer(158),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 202,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_snm_Internalname,GXutil.rtrim( AV12D_GRD_CRF_SNM),"",TempTags+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(202);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_crf_snm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:125px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection3_Internalname+"_"+sGXsfl_187_idx,new Integer(1),new Integer(123),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Multiple line edit */
         TempTags = " " + ((edtavD_grd_crf_item_nm_Enabled!=0)&&(edtavD_grd_crf_item_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 205,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_item_nm_Internalname,GXutil.rtrim( AV72D_GRD_CRF_ITEM_NM),"",TempTags+((edtavD_grd_crf_item_nm_Enabled!=0)&&(edtavD_grd_crf_item_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_item_nm_Enabled!=0)&&(edtavD_grd_crf_item_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(205);\"" : " "),new Integer(0),new Integer(1),new Integer(edtavD_grd_crf_item_nm_Enabled),new Integer(0),new Integer(80),"chr",new Integer(3),"row",StyleString,ClassString,"","200",new Integer(-1),"","",new Integer(-1),new Boolean(true),""});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:190px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection2_Internalname+"_"+sGXsfl_187_idx,new Integer(1),new Integer(188),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_memo_Enabled!=0)&&(edtavD_grd_memo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 208,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_memo_Internalname,GXutil.rtrim( AV14D_GRD_MEMO),"",TempTags+((edtavD_grd_memo_Enabled!=0)&&(edtavD_grd_memo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_memo_Enabled!=0)&&(edtavD_grd_memo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(208);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_memo_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_memo_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:105px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection8_Internalname+"_"+sGXsfl_187_idx,new Integer(1),new Integer(103),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 211,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_user_nm_Internalname,GXutil.rtrim( AV18D_GRD_USER_NM),"",TempTags+((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(211);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_user_nm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_user_nm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(187),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_NAME","left"});
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
               if ( ((int)((nGXsfl_187_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_187_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_187_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_187_idx+1)) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_187_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
      }
      /* End function sendrow_1872 */
   }

   public void subsflControlProps_3463( )
   {
      chkavD_grd2_sel.setInternalname( "vD_GRD2_SEL_"+sGXsfl_346_idx );
      edtavD_grd2_date_Internalname = "vD_GRD2_DATE_"+sGXsfl_346_idx ;
      edtavD_grd2_time_Internalname = "vD_GRD2_TIME_"+sGXsfl_346_idx ;
      edtavD_grd2_memo_no_Internalname = "vD_GRD2_MEMO_NO_"+sGXsfl_346_idx ;
      edtavD_grd2_crf_id_Internalname = "vD_GRD2_CRF_ID_"+sGXsfl_346_idx ;
      edtavD_grd2_memo_kbn_Internalname = "vD_GRD2_MEMO_KBN_"+sGXsfl_346_idx ;
      edtavD_grd2_subject_id_Internalname = "vD_GRD2_SUBJECT_ID_"+sGXsfl_346_idx ;
      edtavD_grd2_crf_snm_Internalname = "vD_GRD2_CRF_SNM_"+sGXsfl_346_idx ;
      edtavD_grd2_crf_item_nm_Internalname = "vD_GRD2_CRF_ITEM_NM_"+sGXsfl_346_idx ;
      edtavD_grd2_memo_Internalname = "vD_GRD2_MEMO_"+sGXsfl_346_idx ;
      edtavD_grd2_user_nm_Internalname = "vD_GRD2_USER_NM_"+sGXsfl_346_idx ;
      edtavD_grd2_kakunin_Internalname = "vD_GRD2_KAKUNIN_"+sGXsfl_346_idx ;
      edtavD_grd2_kakunin_user_nm_Internalname = "vD_GRD2_KAKUNIN_USER_NM_"+sGXsfl_346_idx ;
      edtavD_grd2_kanryo_Internalname = "vD_GRD2_KANRYO_"+sGXsfl_346_idx ;
   }

   public void subsflControlProps_fel_3463( )
   {
      chkavD_grd2_sel.setInternalname( "vD_GRD2_SEL_"+sGXsfl_346_fel_idx );
      edtavD_grd2_date_Internalname = "vD_GRD2_DATE_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_time_Internalname = "vD_GRD2_TIME_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_memo_no_Internalname = "vD_GRD2_MEMO_NO_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_crf_id_Internalname = "vD_GRD2_CRF_ID_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_memo_kbn_Internalname = "vD_GRD2_MEMO_KBN_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_subject_id_Internalname = "vD_GRD2_SUBJECT_ID_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_crf_snm_Internalname = "vD_GRD2_CRF_SNM_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_crf_item_nm_Internalname = "vD_GRD2_CRF_ITEM_NM_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_memo_Internalname = "vD_GRD2_MEMO_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_user_nm_Internalname = "vD_GRD2_USER_NM_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_kakunin_Internalname = "vD_GRD2_KAKUNIN_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_kakunin_user_nm_Internalname = "vD_GRD2_KAKUNIN_USER_NM_"+sGXsfl_346_fel_idx ;
      edtavD_grd2_kanryo_Internalname = "vD_GRD2_KANRYO_"+sGXsfl_346_fel_idx ;
   }

   public void sendrow_3463( )
   {
      subsflControlProps_3463( ) ;
      wb1N0( ) ;
      if ( ( 8 * 1 == 0 ) || ( nGXsfl_346_idx <= subgrid2_recordsperpage( ) * 1 ) )
      {
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
         }
         else if ( subGrid2_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( ((int)(((nGXsfl_346_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid2_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Odd" ;
               }
            }
            else
            {
               subGrid2_Backcolor = (int)(0xF5F5F5) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_346_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_346_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_346_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_346_idx+"\">") ;
               }
            }
         }
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd2_sel.getEnabled()!=0)&&(chkavD_grd2_sel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 349,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd2_sel.getInternalname(),GXutil.booltostr( AV29D_GRD2_SEL),"",new Integer(chkavD_grd2_sel.getVisible()),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd2_sel.getEnabled()!=0)&&(chkavD_grd2_sel.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(349, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd2_sel.getEnabled()!=0)&&(chkavD_grd2_sel.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(349);\"" : " ")});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         /* Table start */
         Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable4_Internalname+"_"+sGXsfl_346_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"",new Integer(100),"","px","%"});
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_date_Enabled!=0)&&(edtavD_grd2_date_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 354,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_date_Internalname,localUtil.format(AV22D_GRD2_DATE, "9999/99/99"),localUtil.format( AV22D_GRD2_DATE, "9999/99/99"),TempTags+((edtavD_grd2_date_Enabled!=0)&&(edtavD_grd2_date_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_date_Enabled!=0)&&(edtavD_grd2_date_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(354);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_date_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_date_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD","right"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("row");
         }
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_time_Enabled!=0)&&(edtavD_grd2_time_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 357,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_time_Internalname,GXutil.rtrim( AV31D_GRD2_TIME),"",TempTags+((edtavD_grd2_time_Enabled!=0)&&(edtavD_grd2_time_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_time_Enabled!=0)&&(edtavD_grd2_time_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(357);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_time_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_time_Enabled),new Integer(0),"text","",new Integer(8),"chr",new Integer(1),"row",new Integer(8),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("row");
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("table");
         }
         /* End of table */
         /* Table start */
         Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd2_hidden_Internalname+"_"+sGXsfl_346_idx,new Integer(tblTbl_grd2_hidden_Visible),"TableHidden","","","","","","",new Integer(1),new Integer(2),"","","","px","px"});
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_memo_no_Enabled!=0)&&(edtavD_grd2_memo_no_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 361,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_memo_no_Internalname,GXutil.ltrim( localUtil.ntoc( AV28D_GRD2_MEMO_NO, (byte)(3), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28D_GRD2_MEMO_NO), "ZZ9")),TempTags+((edtavD_grd2_memo_no_Enabled!=0)&&(edtavD_grd2_memo_no_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_memo_no_Enabled!=0)&&(edtavD_grd2_memo_no_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(361);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_memo_no_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(3),"chr",new Integer(1),"row",new Integer(3),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_crf_id_Enabled!=0)&&(edtavD_grd2_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 362,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV20D_GRD2_CRF_ID, (byte)(4), (byte)(0), ".", "")),((edtavD_grd2_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20D_GRD2_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV20D_GRD2_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd2_crf_id_Enabled!=0)&&(edtavD_grd2_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_crf_id_Enabled!=0)&&(edtavD_grd2_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(362);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_crf_id_Jsonclick,new Integer(0),"Attribute_s","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_crf_id_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("row");
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("table");
         }
         /* End of table */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:30px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_memo_kbn_Enabled!=0)&&(edtavD_grd2_memo_kbn_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 364,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_memo_kbn_Internalname,GXutil.rtrim( AV27D_GRD2_MEMO_KBN),"",TempTags+((edtavD_grd2_memo_kbn_Enabled!=0)&&(edtavD_grd2_memo_kbn_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_memo_kbn_Enabled!=0)&&(edtavD_grd2_memo_kbn_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(364);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_memo_kbn_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_memo_kbn_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_subject_id_Enabled!=0)&&(edtavD_grd2_subject_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 366,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV30D_GRD2_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")),((edtavD_grd2_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30D_GRD2_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV30D_GRD2_SUBJECT_ID), "ZZZZZ9")),TempTags+((edtavD_grd2_subject_id_Enabled!=0)&&(edtavD_grd2_subject_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_subject_id_Enabled!=0)&&(edtavD_grd2_subject_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(366);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_subject_id_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_subject_id_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:140px\""});
         /* Div Control */
         Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection7_Internalname+"_"+sGXsfl_346_idx,new Integer(1),new Integer(138),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_crf_snm_Enabled!=0)&&(edtavD_grd2_crf_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 369,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_crf_snm_Internalname,GXutil.rtrim( AV21D_GRD2_CRF_SNM),"",TempTags+((edtavD_grd2_crf_snm_Enabled!=0)&&(edtavD_grd2_crf_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_crf_snm_Enabled!=0)&&(edtavD_grd2_crf_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(369);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_crf_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_crf_snm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Div Control */
         Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection6_Internalname+"_"+sGXsfl_346_idx,new Integer(1),new Integer(98),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Multiple line edit */
         TempTags = " " + ((edtavD_grd2_crf_item_nm_Enabled!=0)&&(edtavD_grd2_crf_item_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 372,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         ClassString = "Attribute_s" ;
         StyleString = "" ;
         Grid2Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_crf_item_nm_Internalname,GXutil.rtrim( AV73D_GRD2_CRF_ITEM_NM),"",TempTags+((edtavD_grd2_crf_item_nm_Enabled!=0)&&(edtavD_grd2_crf_item_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_crf_item_nm_Enabled!=0)&&(edtavD_grd2_crf_item_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(372);\"" : " "),new Integer(0),new Integer(1),new Integer(edtavD_grd2_crf_item_nm_Enabled),new Integer(0),new Integer(80),"chr",new Integer(3),"row",StyleString,ClassString,"","200",new Integer(-1),"","",new Integer(-1),new Boolean(true),""});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:140px\""});
         /* Div Control */
         Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection1_Internalname+"_"+sGXsfl_346_idx,new Integer(1),new Integer(138),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_memo_Enabled!=0)&&(edtavD_grd2_memo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 375,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_memo_Internalname,GXutil.rtrim( AV26D_GRD2_MEMO),"",TempTags+((edtavD_grd2_memo_Enabled!=0)&&(edtavD_grd2_memo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_memo_Enabled!=0)&&(edtavD_grd2_memo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(375);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_memo_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_memo_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:90px\""});
         /* Div Control */
         Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection5_Internalname+"_"+sGXsfl_346_idx,new Integer(1),new Integer(88),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_user_nm_Enabled!=0)&&(edtavD_grd2_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 378,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_user_nm_Internalname,GXutil.rtrim( AV32D_GRD2_USER_NM),"",TempTags+((edtavD_grd2_user_nm_Enabled!=0)&&(edtavD_grd2_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_user_nm_Enabled!=0)&&(edtavD_grd2_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(378);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_user_nm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_user_nm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_NAME","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:20px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_kakunin_Enabled!=0)&&(edtavD_grd2_kakunin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 380,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_kakunin_Internalname,GXutil.rtrim( AV23D_GRD2_KAKUNIN),"",TempTags+((edtavD_grd2_kakunin_Enabled!=0)&&(edtavD_grd2_kakunin_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_kakunin_Enabled!=0)&&(edtavD_grd2_kakunin_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(380);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_kakunin_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_kakunin_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:80px\""});
         /* Div Control */
         Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection4_Internalname+"_"+sGXsfl_346_idx,new Integer(1),new Integer(78),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_kakunin_user_nm_Enabled!=0)&&(edtavD_grd2_kakunin_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 383,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_kakunin_user_nm_Internalname,GXutil.rtrim( AV24D_GRD2_KAKUNIN_USER_NM),"",TempTags+((edtavD_grd2_kakunin_user_nm_Enabled!=0)&&(edtavD_grd2_kakunin_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_kakunin_user_nm_Enabled!=0)&&(edtavD_grd2_kakunin_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(383);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_kakunin_user_nm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_kakunin_user_nm_Enabled),new Integer(0),"text","",new Integer(30),"chr",new Integer(1),"row",new Integer(30),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:20px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd2_kanryo_Enabled!=0)&&(edtavD_grd2_kanryo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 385,'',false,'"+sGXsfl_346_idx+"',346)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_kanryo_Internalname,GXutil.rtrim( AV25D_GRD2_KANRYO),"",TempTags+((edtavD_grd2_kanryo_Enabled!=0)&&(edtavD_grd2_kanryo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd2_kanryo_Enabled!=0)&&(edtavD_grd2_kanryo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(385);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_kanryo_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_kanryo_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(346),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_346_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_346_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_346_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_346_idx+1)) ;
         sGXsfl_346_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_346_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_3463( ) ;
      }
      /* End function sendrow_3463 */
   }

   public void init_default_properties( )
   {
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTxt_btn_memo_kanryo_Internalname = "TXT_BTN_MEMO_KANRYO" ;
      lblTxt_btn_crf_Internalname = "TXT_BTN_CRF" ;
      lblTxt_btn_csv_Internalname = "TXT_BTN_CSV" ;
      lblTxt_btn_exit_Internalname = "TXT_BTN_EXIT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      tblTable6_Internalname = "TABLE6" ;
      lblTab_tuti_Internalname = "TAB_TUTI" ;
      lblTab_edit_Internalname = "TAB_EDIT" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      cmbavD_sort.setInternalname( "vD_SORT" );
      tblTable12_Internalname = "TABLE12" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_info_Internalname = "TXT_INFO" ;
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
      chkavD_grd_all_chk.setInternalname( "vD_GRD_ALL_CHK" );
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      tblTbl_grid1_header_Internalname = "TBL_GRID1_HEADER" ;
      tblTbl_grd1_hidden_Internalname = "TBL_GRD1_HIDDEN" ;
      divSection9_Internalname = "SECTION9" ;
      divSection3_Internalname = "SECTION3" ;
      divSection2_Internalname = "SECTION2" ;
      divSection8_Internalname = "SECTION8" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTbl_tuti_Internalname = "TBL_TUTI" ;
      lblTxt_info2_Internalname = "TXT_INFO2" ;
      lblTxt_rec_cnt2_Internalname = "TXT_REC_CNT2" ;
      lblTxt_first2_Internalname = "TXT_FIRST2" ;
      tblTbl_first2_Internalname = "TBL_FIRST2" ;
      lblTxt_back2_Internalname = "TXT_BACK2" ;
      tblTbl_back2_Internalname = "TBL_BACK2" ;
      lblTxt_page201_Internalname = "TXT_PAGE201" ;
      tblTbl_page201_Internalname = "TBL_PAGE201" ;
      lblTxt_page202_Internalname = "TXT_PAGE202" ;
      tblTbl_page202_Internalname = "TBL_PAGE202" ;
      lblTxt_page203_Internalname = "TXT_PAGE203" ;
      tblTbl_page203_Internalname = "TBL_PAGE203" ;
      lblTxt_page204_Internalname = "TXT_PAGE204" ;
      tblTbl_page204_Internalname = "TBL_PAGE204" ;
      lblTxt_page205_Internalname = "TXT_PAGE205" ;
      tblTbl_page205_Internalname = "TBL_PAGE205" ;
      lblTxt_page206_Internalname = "TXT_PAGE206" ;
      tblTbl_page206_Internalname = "TBL_PAGE206" ;
      lblTxt_page207_Internalname = "TXT_PAGE207" ;
      tblTbl_page207_Internalname = "TBL_PAGE207" ;
      lblTxt_page208_Internalname = "TXT_PAGE208" ;
      tblTbl_page208_Internalname = "TBL_PAGE208" ;
      lblTxt_page209_Internalname = "TXT_PAGE209" ;
      tblTbl_page209_Internalname = "TBL_PAGE209" ;
      lblTxt_page210_Internalname = "TXT_PAGE210" ;
      tblTbl_page210_Internalname = "TBL_PAGE210" ;
      lblTxt_next2_Internalname = "TXT_NEXT2" ;
      tblTbl_next2_Internalname = "TBL_NEXT2" ;
      lblTxt_last2_Internalname = "TXT_LAST2" ;
      tblTbl_last2_Internalname = "TBL_LAST2" ;
      tblTbl_page2_Internalname = "TBL_PAGE2" ;
      tblTbl_page_area2_Internalname = "TBL_PAGE_AREA2" ;
      chkavD_grd2_all_chk.setInternalname( "vD_GRD2_ALL_CHK" );
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      tblTbl_grid2_header_Internalname = "TBL_GRID2_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTbl_grd2_hidden_Internalname = "TBL_GRD2_HIDDEN" ;
      divSection7_Internalname = "SECTION7" ;
      divSection6_Internalname = "SECTION6" ;
      divSection1_Internalname = "SECTION1" ;
      divSection5_Internalname = "SECTION5" ;
      divSection4_Internalname = "SECTION4" ;
      tblTbl_test_Internalname = "TBL_TEST" ;
      tblTbl_edit_Internalname = "TBL_EDIT" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable11_Internalname = "TABLE11" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_memo_kanryo_exec_Internalname = "BTN_MEMO_KANRYO_EXEC" ;
      lblBtn_csv_out_exec_Internalname = "BTN_CSV_OUT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_tab_kbn_Internalname = "vH_TAB_KBN" ;
      edtavH_device_Internalname = "vH_DEVICE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row1_Internalname = "CTLMAX_ROW1" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd2_kanryo_Jsonclick = "" ;
      edtavD_grd2_kanryo_Visible = 1 ;
      edtavD_grd2_kakunin_user_nm_Jsonclick = "" ;
      edtavD_grd2_kakunin_user_nm_Visible = 1 ;
      edtavD_grd2_kakunin_Jsonclick = "" ;
      edtavD_grd2_kakunin_Visible = 1 ;
      edtavD_grd2_user_nm_Jsonclick = "" ;
      edtavD_grd2_user_nm_Visible = 1 ;
      edtavD_grd2_memo_Jsonclick = "" ;
      edtavD_grd2_memo_Visible = 1 ;
      edtavD_grd2_crf_item_nm_Visible = 1 ;
      edtavD_grd2_crf_snm_Jsonclick = "" ;
      edtavD_grd2_crf_snm_Visible = 1 ;
      edtavD_grd2_subject_id_Jsonclick = "" ;
      edtavD_grd2_subject_id_Visible = 1 ;
      edtavD_grd2_memo_kbn_Jsonclick = "" ;
      edtavD_grd2_memo_kbn_Visible = 1 ;
      edtavD_grd2_crf_id_Jsonclick = "" ;
      edtavD_grd2_crf_id_Visible = 1 ;
      edtavD_grd2_memo_no_Jsonclick = "" ;
      edtavD_grd2_memo_no_Visible = 1 ;
      edtavD_grd2_memo_no_Enabled = 1 ;
      edtavD_grd2_time_Jsonclick = "" ;
      edtavD_grd2_time_Visible = 1 ;
      edtavD_grd2_date_Jsonclick = "" ;
      edtavD_grd2_date_Visible = 1 ;
      chkavD_grd2_sel.setEnabled( 1 );
      subGrid2_Class = "FreeStyleGridTM-1s" ;
      edtavD_grd_user_nm_Jsonclick = "" ;
      edtavD_grd_user_nm_Visible = 1 ;
      edtavD_grd_memo_Jsonclick = "" ;
      edtavD_grd_memo_Visible = 1 ;
      edtavD_grd_crf_item_nm_Visible = 1 ;
      edtavD_grd_crf_snm_Jsonclick = "" ;
      edtavD_grd_crf_snm_Visible = 1 ;
      edtavD_grd_subject_id_Jsonclick = "" ;
      edtavD_grd_subject_id_Visible = 1 ;
      edtavD_grd_crf_id_Jsonclick = "" ;
      edtavD_grd_crf_id_Visible = 1 ;
      edtavD_grd_memo_no_Jsonclick = "" ;
      edtavD_grd_memo_no_Visible = 1 ;
      edtavD_grd_memo_no_Enabled = 1 ;
      edtavD_grd_datetime_Jsonclick = "" ;
      edtavD_grd_datetime_Visible = 1 ;
      chkavD_grd_sel.setVisible( 1 );
      chkavD_grd_sel.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      lblTxt_btn_memo_kanryo_Visible = 1 ;
      cmbavD_sort.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_user_nm_Enabled = 1 ;
      edtavD_grd_memo_Enabled = 1 ;
      edtavD_grd_crf_item_nm_Enabled = 1 ;
      edtavD_grd_crf_snm_Enabled = 1 ;
      edtavD_grd_subject_id_Enabled = 1 ;
      edtavD_grd_crf_id_Enabled = 1 ;
      edtavD_grd_datetime_Enabled = 1 ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtavD_grd2_kanryo_Enabled = 1 ;
      edtavD_grd2_kakunin_user_nm_Enabled = 1 ;
      edtavD_grd2_kakunin_Enabled = 1 ;
      edtavD_grd2_user_nm_Enabled = 1 ;
      edtavD_grd2_memo_Enabled = 1 ;
      edtavD_grd2_crf_item_nm_Enabled = 1 ;
      edtavD_grd2_crf_snm_Enabled = 1 ;
      edtavD_grd2_subject_id_Enabled = 1 ;
      edtavD_grd2_memo_kbn_Enabled = 1 ;
      edtavD_grd2_crf_id_Enabled = 1 ;
      edtavD_grd2_time_Enabled = 1 ;
      edtavD_grd2_date_Enabled = 1 ;
      chkavD_grd2_sel.setVisible( 1 );
      edtavCtlmax_row_Jsonclick = "" ;
      edtavCtlmax_row1_Jsonclick = "" ;
      edtavH_device_Jsonclick = "" ;
      edtavH_tab_kbn_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt2_Caption = "TXT_REC_CNT2" ;
      lblTxt_info2_Caption = "以下のメモが作成されています。" ;
      tblTbl_grid2_header_Visible = 1 ;
      tblTbl_page_area2_Visible = 1 ;
      lblTxt_last2_Class = "TextBlockPage" ;
      lblTxt_first2_Class = "TextBlockPage" ;
      lblTxt_next2_Class = "TextBlockPage" ;
      lblTxt_back2_Class = "TextBlockPage" ;
      lblTxt_page210_Class = "TextBlockPage" ;
      lblTxt_page209_Class = "TextBlockPage" ;
      lblTxt_page208_Class = "TextBlockPage" ;
      lblTxt_page207_Class = "TextBlockPage" ;
      lblTxt_page206_Class = "TextBlockPage" ;
      lblTxt_page205_Class = "TextBlockPage" ;
      lblTxt_page204_Class = "TextBlockPage" ;
      lblTxt_page203_Class = "TextBlockPage" ;
      lblTxt_page202_Class = "TextBlockPage" ;
      lblTxt_page201_Class = "TextBlockPage" ;
      tblTbl_page2_Visible = 1 ;
      tblTbl_page210_Visible = 1 ;
      tblTbl_page209_Visible = 1 ;
      tblTbl_page208_Visible = 1 ;
      tblTbl_page207_Visible = 1 ;
      tblTbl_page206_Visible = 1 ;
      tblTbl_page205_Visible = 1 ;
      tblTbl_page204_Visible = 1 ;
      tblTbl_page203_Visible = 1 ;
      tblTbl_page202_Visible = 1 ;
      tblTbl_page201_Visible = 1 ;
      lblTxt_page210_Caption = "10" ;
      lblTxt_page209_Caption = "9" ;
      lblTxt_page208_Caption = "8" ;
      lblTxt_page207_Caption = "7" ;
      lblTxt_page206_Caption = "6" ;
      lblTxt_page205_Caption = "5" ;
      lblTxt_page204_Caption = "4" ;
      lblTxt_page203_Caption = "3" ;
      lblTxt_page202_Caption = "2" ;
      lblTxt_page201_Caption = "1" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
      lblTxt_info_Caption = "連絡メモが記入されています。" ;
      tblTbl_grid1_header_Visible = 1 ;
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
      tblTbl_edit_Visible = 1 ;
      tblTbl_tuti_Visible = 1 ;
      lblTab_edit_Class = "TextBlockTab" ;
      lblTab_tuti_Class = "TextBlockTabSel" ;
      tblTbl_grd2_hidden_Visible = 1 ;
      tblTbl_grd1_hidden_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcolorstyle = (byte)(3) ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      chkavD_grd2_all_chk.setCaption( "" );
      chkavD_grd_all_chk.setCaption( "" );
      subGrid2_Rows = 8 ;
      subGrid1_Rows = 8 ;
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
                  /* Execute user subroutine: S332 */
                  S332 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV41P_AUTH_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV41P_AUTH_CD = "" ;
      AV53W_AUTO_SENI_FLG = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV35H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV36H_A_PAGING_SDT2 = new SdtA_PAGING_SDT(remoteHandle, context);
      AV82Pgmname = "" ;
      AV51W_A821_JS = "" ;
      AV47SD_RNRK_MEMO_C = new GxObjectCollection(SdtB719_SD01_MEMO_B719_SD01_MEMOItem.class, "B719_SD01_MEMO.B719_SD01_MEMOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV43SD_EDIT_MEMO_C = new GxObjectCollection(SdtB719_SD01_MEMO_B719_SD01_MEMOItem.class, "B719_SD01_MEMO.B719_SD01_MEMOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A929TBT14_REQUEST_SITE_ID = "" ;
      AV49W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A488TBT15_DEL_FLG = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      A477TBT14_MEMO = "" ;
      A481TBT14_CRT_USER_ID = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A698TBT01_SITE_ID = "" ;
      A901TBT14_MEMO_KBN = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      AV6W_TBM31_CRF_SNM = "" ;
      AV75W_TBM32_CRF_ITEM_NM = "" ;
      AV68W_TAM07_USER_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      AV74W_TBM32_CRF_ITEM_CD = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      A55TAM07_USER_ID = "" ;
      AV67W_TAM07_USER_ID = "" ;
      A214TAM07_DEL_FLG = "" ;
      A205TAM07_USER_NM = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavD_grd_datetime_Internalname = "" ;
      AV13D_GRD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      edtavD_grd_memo_no_Internalname = "" ;
      edtavD_grd_crf_id_Internalname = "" ;
      edtavD_grd_subject_id_Internalname = "" ;
      AV12D_GRD_CRF_SNM = "" ;
      edtavD_grd_crf_snm_Internalname = "" ;
      AV72D_GRD_CRF_ITEM_NM = "" ;
      edtavD_grd_crf_item_nm_Internalname = "" ;
      AV14D_GRD_MEMO = "" ;
      edtavD_grd_memo_Internalname = "" ;
      AV18D_GRD_USER_NM = "" ;
      edtavD_grd_user_nm_Internalname = "" ;
      edtavD_grd2_date_Internalname = "" ;
      AV22D_GRD2_DATE = GXutil.nullDate() ;
      AV31D_GRD2_TIME = "" ;
      edtavD_grd2_time_Internalname = "" ;
      edtavD_grd2_memo_no_Internalname = "" ;
      edtavD_grd2_crf_id_Internalname = "" ;
      AV27D_GRD2_MEMO_KBN = "" ;
      edtavD_grd2_memo_kbn_Internalname = "" ;
      edtavD_grd2_subject_id_Internalname = "" ;
      AV21D_GRD2_CRF_SNM = "" ;
      edtavD_grd2_crf_snm_Internalname = "" ;
      AV73D_GRD2_CRF_ITEM_NM = "" ;
      edtavD_grd2_crf_item_nm_Internalname = "" ;
      AV26D_GRD2_MEMO = "" ;
      edtavD_grd2_memo_Internalname = "" ;
      AV32D_GRD2_USER_NM = "" ;
      edtavD_grd2_user_nm_Internalname = "" ;
      AV23D_GRD2_KAKUNIN = "" ;
      edtavD_grd2_kakunin_Internalname = "" ;
      AV24D_GRD2_KAKUNIN_USER_NM = "" ;
      edtavD_grd2_kakunin_user_nm_Internalname = "" ;
      AV25D_GRD2_KANRYO = "" ;
      edtavD_grd2_kanryo_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      AV81Pgmdesc = "" ;
      AV38H_INIT_FLG = "" ;
      AV39H_KNGN_FLG = "" ;
      AV37H_DEVICE = "" ;
      AV8C_APP_ID = "" ;
      AV9C_GAMEN_TITLE = "" ;
      AV48SD_RNRK_MEMO_I = new SdtB719_SD01_MEMO_B719_SD01_MEMOItem(remoteHandle, context);
      AV44SD_EDIT_MEMO_I = new SdtB719_SD01_MEMO_B719_SD01_MEMOItem(remoteHandle, context);
      AV60W_MSG = "" ;
      AV7BC_TBT14_CRF_MEMO = new SdtTBT14_CRF_MEMO(remoteHandle);
      AV45SD_OPEN_CRF_C = new GxObjectCollection(SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem.class, "B719_SD02_OPEN_CRF.B719_SD02_OPEN_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV46SD_OPEN_CRF_I = new SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem(remoteHandle, context);
      AV64W_SESSION = httpContext.getWebSession();
      AV52W_ALL_AUTH_CD = "" ;
      scmdbuf = "" ;
      H001N2_A149TBT15_STUDY_ID = new long[1] ;
      H001N2_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      H001N2_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      H001N2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001N2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001N2_A902TBT14_KANRYO_FLG = new String[] {""} ;
      H001N2_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001N2_A479TBT14_DEL_FLG = new String[] {""} ;
      H001N2_n479TBT14_DEL_FLG = new boolean[] {false} ;
      H001N2_A488TBT15_DEL_FLG = new String[] {""} ;
      H001N2_n488TBT15_DEL_FLG = new boolean[] {false} ;
      H001N2_A942TBT15_CRF_EDA_NO = new byte[1] ;
      H001N2_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      H001N2_A155TBT15_CRF_ID = new short[1] ;
      H001N2_n155TBT15_CRF_ID = new boolean[] {false} ;
      H001N2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001N2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      H001N2_A151TBT15_SUBJECT_ID = new int[1] ;
      H001N2_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      H001N2_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      H001N2_A199TBT15_MEMO_NO = new short[1] ;
      H001N2_A477TBT14_MEMO = new String[] {""} ;
      H001N2_n477TBT14_MEMO = new boolean[] {false} ;
      H001N2_A481TBT14_CRT_USER_ID = new String[] {""} ;
      H001N2_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      H001N2_A486TBT14_UPD_CNT = new long[1] ;
      H001N2_n486TBT14_UPD_CNT = new boolean[] {false} ;
      H001N2_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001N2_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      H001N3_A945TBM44_STUDY_ID = new long[1] ;
      H001N3_A946TBM44_CRF_ID = new short[1] ;
      H001N3_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001N3_A948TBM44_VISIT_NO = new int[1] ;
      H001N3_n948TBM44_VISIT_NO = new boolean[] {false} ;
      AV56W_DM_AUTH_CD = "" ;
      H001N4_A87TBT01_STUDY_ID = new long[1] ;
      H001N4_A88TBT01_SUBJECT_ID = new int[1] ;
      H001N4_A149TBT15_STUDY_ID = new long[1] ;
      H001N4_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      H001N4_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      H001N4_A479TBT14_DEL_FLG = new String[] {""} ;
      H001N4_n479TBT14_DEL_FLG = new boolean[] {false} ;
      H001N4_A488TBT15_DEL_FLG = new String[] {""} ;
      H001N4_n488TBT15_DEL_FLG = new boolean[] {false} ;
      H001N4_A942TBT15_CRF_EDA_NO = new byte[1] ;
      H001N4_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      H001N4_A155TBT15_CRF_ID = new short[1] ;
      H001N4_n155TBT15_CRF_ID = new boolean[] {false} ;
      H001N4_A698TBT01_SITE_ID = new String[] {""} ;
      H001N4_n698TBT01_SITE_ID = new boolean[] {false} ;
      H001N4_A151TBT15_SUBJECT_ID = new int[1] ;
      H001N4_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      H001N4_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      H001N4_A199TBT15_MEMO_NO = new short[1] ;
      H001N4_A901TBT14_MEMO_KBN = new String[] {""} ;
      H001N4_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      H001N4_A477TBT14_MEMO = new String[] {""} ;
      H001N4_n477TBT14_MEMO = new boolean[] {false} ;
      H001N4_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      H001N4_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      H001N4_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001N4_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      H001N4_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001N4_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001N4_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      H001N4_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      H001N4_A902TBT14_KANRYO_FLG = new String[] {""} ;
      H001N4_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001N4_A481TBT14_CRT_USER_ID = new String[] {""} ;
      H001N4_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      H001N4_A486TBT14_UPD_CNT = new long[1] ;
      H001N4_n486TBT14_UPD_CNT = new boolean[] {false} ;
      H001N4_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001N4_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      H001N5_A945TBM44_STUDY_ID = new long[1] ;
      H001N5_A946TBM44_CRF_ID = new short[1] ;
      H001N5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001N5_A948TBM44_VISIT_NO = new int[1] ;
      H001N5_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H001N6_A69TBM31_CRF_ID = new short[1] ;
      H001N6_A68TBM31_STUDY_ID = new long[1] ;
      H001N6_A642TBM31_CRF_SNM = new String[] {""} ;
      H001N6_n642TBM31_CRF_SNM = new boolean[] {false} ;
      H001N7_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      H001N7_A71TBM32_CRF_ID = new short[1] ;
      H001N7_A70TBM32_STUDY_ID = new long[1] ;
      H001N7_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      H001N7_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      AV70W_TAM08_SITE_SNM = "" ;
      AV69W_TAM08_SITE_ID = "" ;
      H001N8_A57TAM08_SITE_ID = new String[] {""} ;
      H001N8_A320TAM08_SITE_SNM = new String[] {""} ;
      H001N8_n320TAM08_SITE_SNM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A320TAM08_SITE_SNM = "" ;
      AV66W_TAM04_AUTH_NM = "" ;
      AV65W_TAM04_AUTH_CD = "" ;
      H001N9_A13TAM04_AUTH_CD = new String[] {""} ;
      H001N9_A285TAM04_AUTH_NM = new String[] {""} ;
      H001N9_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      H001N10_A214TAM07_DEL_FLG = new String[] {""} ;
      H001N10_n214TAM07_DEL_FLG = new boolean[] {false} ;
      H001N10_A55TAM07_USER_ID = new String[] {""} ;
      H001N10_A205TAM07_USER_NM = new String[] {""} ;
      H001N10_n205TAM07_USER_NM = new boolean[] {false} ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV57W_ERRCD = "" ;
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_memo_kanryo_exec_Jsonclick = "" ;
      lblBtn_csv_out_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_info2_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock44_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTxt_rec_cnt2_Jsonclick = "" ;
      lblTxt_last2_Jsonclick = "" ;
      lblTxt_next2_Jsonclick = "" ;
      lblTxt_page210_Jsonclick = "" ;
      lblTxt_page209_Jsonclick = "" ;
      lblTxt_page208_Jsonclick = "" ;
      lblTxt_page207_Jsonclick = "" ;
      lblTxt_page206_Jsonclick = "" ;
      lblTxt_page205_Jsonclick = "" ;
      lblTxt_page204_Jsonclick = "" ;
      lblTxt_page203_Jsonclick = "" ;
      lblTxt_page202_Jsonclick = "" ;
      lblTxt_page201_Jsonclick = "" ;
      lblTxt_back2_Jsonclick = "" ;
      lblTxt_first2_Jsonclick = "" ;
      lblTxt_info_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock35_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
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
      lblTab_tuti_Jsonclick = "" ;
      lblTab_edit_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTxt_btn_memo_kanryo_Jsonclick = "" ;
      lblTxt_btn_crf_Jsonclick = "" ;
      lblTxt_btn_csv_Jsonclick = "" ;
      lblTxt_btn_exit_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b719_wp01_memo_info__default(),
         new Object[] {
             new Object[] {
            H001N2_A149TBT15_STUDY_ID, H001N2_A929TBT14_REQUEST_SITE_ID, H001N2_n929TBT14_REQUEST_SITE_ID, H001N2_A927TBT14_KAKUNIN_FLG, H001N2_n927TBT14_KAKUNIN_FLG, H001N2_A902TBT14_KANRYO_FLG, H001N2_n902TBT14_KANRYO_FLG, H001N2_A479TBT14_DEL_FLG, H001N2_n479TBT14_DEL_FLG, H001N2_A488TBT15_DEL_FLG,
            H001N2_n488TBT15_DEL_FLG, H001N2_A942TBT15_CRF_EDA_NO, H001N2_n942TBT15_CRF_EDA_NO, H001N2_A155TBT15_CRF_ID, H001N2_n155TBT15_CRF_ID, H001N2_A930TBT14_REQUEST_AUTH_CD, H001N2_n930TBT14_REQUEST_AUTH_CD, H001N2_A151TBT15_SUBJECT_ID, H001N2_A904TBT15_CRF_ITEM_GRP_CD, H001N2_n904TBT15_CRF_ITEM_GRP_CD,
            H001N2_A199TBT15_MEMO_NO, H001N2_A477TBT14_MEMO, H001N2_n477TBT14_MEMO, H001N2_A481TBT14_CRT_USER_ID, H001N2_n481TBT14_CRT_USER_ID, H001N2_A486TBT14_UPD_CNT, H001N2_n486TBT14_UPD_CNT, H001N2_A480TBT14_CRT_DATETIME, H001N2_n480TBT14_CRT_DATETIME
            }
            , new Object[] {
            H001N3_A945TBM44_STUDY_ID, H001N3_A946TBM44_CRF_ID, H001N3_A947TBM44_CRF_EDA_NO, H001N3_A948TBM44_VISIT_NO, H001N3_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001N4_A87TBT01_STUDY_ID, H001N4_A88TBT01_SUBJECT_ID, H001N4_A149TBT15_STUDY_ID, H001N4_A931TBT14_CRT_AUTH_CD, H001N4_n931TBT14_CRT_AUTH_CD, H001N4_A479TBT14_DEL_FLG, H001N4_n479TBT14_DEL_FLG, H001N4_A488TBT15_DEL_FLG, H001N4_n488TBT15_DEL_FLG, H001N4_A942TBT15_CRF_EDA_NO,
            H001N4_n942TBT15_CRF_EDA_NO, H001N4_A155TBT15_CRF_ID, H001N4_n155TBT15_CRF_ID, H001N4_A698TBT01_SITE_ID, H001N4_n698TBT01_SITE_ID, H001N4_A151TBT15_SUBJECT_ID, H001N4_A904TBT15_CRF_ITEM_GRP_CD, H001N4_n904TBT15_CRF_ITEM_GRP_CD, H001N4_A199TBT15_MEMO_NO, H001N4_A901TBT14_MEMO_KBN,
            H001N4_n901TBT14_MEMO_KBN, H001N4_A477TBT14_MEMO, H001N4_n477TBT14_MEMO, H001N4_A929TBT14_REQUEST_SITE_ID, H001N4_n929TBT14_REQUEST_SITE_ID, H001N4_A930TBT14_REQUEST_AUTH_CD, H001N4_n930TBT14_REQUEST_AUTH_CD, H001N4_A927TBT14_KAKUNIN_FLG, H001N4_n927TBT14_KAKUNIN_FLG, H001N4_A928TBT14_KAKUNIN_USER_ID,
            H001N4_n928TBT14_KAKUNIN_USER_ID, H001N4_A902TBT14_KANRYO_FLG, H001N4_n902TBT14_KANRYO_FLG, H001N4_A481TBT14_CRT_USER_ID, H001N4_n481TBT14_CRT_USER_ID, H001N4_A486TBT14_UPD_CNT, H001N4_n486TBT14_UPD_CNT, H001N4_A480TBT14_CRT_DATETIME, H001N4_n480TBT14_CRT_DATETIME
            }
            , new Object[] {
            H001N5_A945TBM44_STUDY_ID, H001N5_A946TBM44_CRF_ID, H001N5_A947TBM44_CRF_EDA_NO, H001N5_A948TBM44_VISIT_NO, H001N5_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001N6_A69TBM31_CRF_ID, H001N6_A68TBM31_STUDY_ID, H001N6_A642TBM31_CRF_SNM, H001N6_n642TBM31_CRF_SNM
            }
            , new Object[] {
            H001N7_A72TBM32_CRF_ITEM_CD, H001N7_A71TBM32_CRF_ID, H001N7_A70TBM32_STUDY_ID, H001N7_A405TBM32_CRF_ITEM_NM, H001N7_n405TBM32_CRF_ITEM_NM
            }
            , new Object[] {
            H001N8_A57TAM08_SITE_ID, H001N8_A320TAM08_SITE_SNM, H001N8_n320TAM08_SITE_SNM
            }
            , new Object[] {
            H001N9_A13TAM04_AUTH_CD, H001N9_A285TAM04_AUTH_NM, H001N9_n285TAM04_AUTH_NM
            }
            , new Object[] {
            H001N10_A214TAM07_DEL_FLG, H001N10_n214TAM07_DEL_FLG, H001N10_A55TAM07_USER_ID, H001N10_A205TAM07_USER_NM, H001N10_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV82Pgmname = "B719_WP01_MEMO_INFO" ;
      AV81Pgmdesc = "メモ情報画面" ;
      /* GeneXus formulas. */
      AV82Pgmname = "B719_WP01_MEMO_INFO" ;
      AV81Pgmdesc = "メモ情報画面" ;
      Gx_err = (short)(0) ;
      edtavD_grd_datetime_Enabled = 0 ;
      edtavD_grd_crf_id_Enabled = 0 ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_crf_item_nm_Enabled = 0 ;
      edtavD_grd_memo_Enabled = 0 ;
      edtavD_grd_user_nm_Enabled = 0 ;
      edtavD_grd2_date_Enabled = 0 ;
      edtavD_grd2_time_Enabled = 0 ;
      edtavD_grd2_crf_id_Enabled = 0 ;
      edtavD_grd2_memo_kbn_Enabled = 0 ;
      edtavD_grd2_subject_id_Enabled = 0 ;
      edtavD_grd2_crf_snm_Enabled = 0 ;
      edtavD_grd2_crf_item_nm_Enabled = 0 ;
      edtavD_grd2_memo_Enabled = 0 ;
      edtavD_grd2_user_nm_Enabled = 0 ;
      edtavD_grd2_kakunin_Enabled = 0 ;
      edtavD_grd2_kakunin_user_nm_Enabled = 0 ;
      edtavD_grd2_kanryo_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A942TBT15_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte AV33D_SORT ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte AV40H_TAB_KBN ;
   private byte AV94GXLvl720 ;
   private byte AV96GXLvl769 ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private short nRC_GXsfl_187 ;
   private short nGXsfl_187_idx=1 ;
   private short nRC_GXsfl_346 ;
   private short nGXsfl_346_idx=1 ;
   private short A946TBM44_CRF_ID ;
   private short A155TBT15_CRF_ID ;
   private short A199TBT15_MEMO_NO ;
   private short A69TBM31_CRF_ID ;
   private short AV5W_TBM31_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV15D_GRD_MEMO_NO ;
   private short AV11D_GRD_CRF_ID ;
   private short AV28D_GRD2_MEMO_NO ;
   private short AV20D_GRD2_CRF_ID ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_187_Refreshing=0 ;
   private short subGrid2_Borderwidth ;
   private short nGXsfl_346_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_187_fel_idx=1 ;
   private short nGXsfl_346_fel_idx=1 ;
   private int A948TBM44_VISIT_NO ;
   private int A151TBT15_SUBJECT_ID ;
   private int subGrid1_Rows ;
   private int subGrid2_Rows ;
   private int AV17D_GRD_SUBJECT_ID ;
   private int AV30D_GRD2_SUBJECT_ID ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int edtavD_grd_datetime_Enabled ;
   private int edtavD_grd_crf_id_Enabled ;
   private int edtavD_grd_subject_id_Enabled ;
   private int edtavD_grd_crf_snm_Enabled ;
   private int edtavD_grd_crf_item_nm_Enabled ;
   private int edtavD_grd_memo_Enabled ;
   private int edtavD_grd_user_nm_Enabled ;
   private int edtavD_grd2_date_Enabled ;
   private int edtavD_grd2_time_Enabled ;
   private int edtavD_grd2_crf_id_Enabled ;
   private int edtavD_grd2_memo_kbn_Enabled ;
   private int edtavD_grd2_subject_id_Enabled ;
   private int edtavD_grd2_crf_snm_Enabled ;
   private int edtavD_grd2_crf_item_nm_Enabled ;
   private int edtavD_grd2_memo_Enabled ;
   private int edtavD_grd2_user_nm_Enabled ;
   private int edtavD_grd2_kakunin_Enabled ;
   private int edtavD_grd2_kakunin_user_nm_Enabled ;
   private int edtavD_grd2_kanryo_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_grd1_hidden_Visible ;
   private int tblTbl_grd2_hidden_Visible ;
   private int AV83GXV3 ;
   private int tblTbl_tuti_Visible ;
   private int tblTbl_edit_Visible ;
   private int lblTxt_btn_memo_kanryo_Visible ;
   private int AV85GXV5 ;
   private int AV86GXV6 ;
   private int AV87GXV7 ;
   private int AV88GXV8 ;
   private int AV89GXV9 ;
   private int AV90GXV10 ;
   private int AV91GXV11 ;
   private int AV92GXV12 ;
   private int AV76W_TBM44_VISIT_NO ;
   private int A88TBT01_SUBJECT_ID ;
   private int AV103GXV13 ;
   private int AV105GXV14 ;
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
   private int tblTbl_grid1_header_Visible ;
   private int tblTbl_page201_Visible ;
   private int tblTbl_page202_Visible ;
   private int tblTbl_page203_Visible ;
   private int tblTbl_page204_Visible ;
   private int tblTbl_page205_Visible ;
   private int tblTbl_page206_Visible ;
   private int tblTbl_page207_Visible ;
   private int tblTbl_page208_Visible ;
   private int tblTbl_page209_Visible ;
   private int tblTbl_page210_Visible ;
   private int tblTbl_page2_Visible ;
   private int tblTbl_page_area2_Visible ;
   private int tblTbl_grid2_header_Visible ;
   private int AV84GXV4 ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_datetime_Visible ;
   private int edtavD_grd_memo_no_Enabled ;
   private int edtavD_grd_memo_no_Visible ;
   private int edtavD_grd_crf_id_Visible ;
   private int edtavD_grd_subject_id_Visible ;
   private int edtavD_grd_crf_snm_Visible ;
   private int edtavD_grd_crf_item_nm_Visible ;
   private int edtavD_grd_memo_Visible ;
   private int edtavD_grd_user_nm_Visible ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavD_grd2_date_Visible ;
   private int edtavD_grd2_time_Visible ;
   private int edtavD_grd2_memo_no_Enabled ;
   private int edtavD_grd2_memo_no_Visible ;
   private int edtavD_grd2_crf_id_Visible ;
   private int edtavD_grd2_memo_kbn_Visible ;
   private int edtavD_grd2_subject_id_Visible ;
   private int edtavD_grd2_crf_snm_Visible ;
   private int edtavD_grd2_crf_item_nm_Visible ;
   private int edtavD_grd2_memo_Visible ;
   private int edtavD_grd2_user_nm_Visible ;
   private int edtavD_grd2_kakunin_Visible ;
   private int edtavD_grd2_kakunin_user_nm_Visible ;
   private int edtavD_grd2_kanryo_Visible ;
   private long wcpOAV42P_STUDY_ID ;
   private long AV42P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long A149TBT15_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A486TBT14_UPD_CNT ;
   private long A68TBM31_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID2_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private long AV62W_SEL_CNT ;
   private long AV59W_MI_KAKUNIN_CNT ;
   private long A87TBT01_STUDY_ID ;
   private long GRID2_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_187_idx="0001" ;
   private String sGXsfl_346_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV82Pgmname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavD_grd_datetime_Internalname ;
   private String edtavD_grd_memo_no_Internalname ;
   private String edtavD_grd_crf_id_Internalname ;
   private String edtavD_grd_subject_id_Internalname ;
   private String edtavD_grd_crf_snm_Internalname ;
   private String edtavD_grd_crf_item_nm_Internalname ;
   private String edtavD_grd_memo_Internalname ;
   private String edtavD_grd_user_nm_Internalname ;
   private String edtavD_grd2_date_Internalname ;
   private String edtavD_grd2_time_Internalname ;
   private String edtavD_grd2_memo_no_Internalname ;
   private String edtavD_grd2_crf_id_Internalname ;
   private String edtavD_grd2_memo_kbn_Internalname ;
   private String edtavD_grd2_subject_id_Internalname ;
   private String edtavD_grd2_crf_snm_Internalname ;
   private String edtavD_grd2_crf_item_nm_Internalname ;
   private String edtavD_grd2_memo_Internalname ;
   private String edtavD_grd2_user_nm_Internalname ;
   private String edtavD_grd2_kakunin_Internalname ;
   private String edtavD_grd2_kakunin_user_nm_Internalname ;
   private String edtavD_grd2_kanryo_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV81Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_tab_kbn_Internalname ;
   private String edtavH_device_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavCtlmax_row1_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String tblTbl_grd1_hidden_Internalname ;
   private String tblTbl_grd2_hidden_Internalname ;
   private String lblTab_tuti_Class ;
   private String lblTab_tuti_Internalname ;
   private String lblTab_edit_Class ;
   private String lblTab_edit_Internalname ;
   private String tblTbl_tuti_Internalname ;
   private String tblTbl_edit_Internalname ;
   private String lblTxt_btn_memo_kanryo_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_187_fel_idx="0001" ;
   private String sGXsfl_346_fel_idx="0001" ;
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
   private String tblTbl_grid1_header_Internalname ;
   private String lblTxt_info_Caption ;
   private String lblTxt_info_Internalname ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_page201_Caption ;
   private String lblTxt_page201_Internalname ;
   private String lblTxt_page202_Caption ;
   private String lblTxt_page202_Internalname ;
   private String lblTxt_page203_Caption ;
   private String lblTxt_page203_Internalname ;
   private String lblTxt_page204_Caption ;
   private String lblTxt_page204_Internalname ;
   private String lblTxt_page205_Caption ;
   private String lblTxt_page205_Internalname ;
   private String lblTxt_page206_Caption ;
   private String lblTxt_page206_Internalname ;
   private String lblTxt_page207_Caption ;
   private String lblTxt_page207_Internalname ;
   private String lblTxt_page208_Caption ;
   private String lblTxt_page208_Internalname ;
   private String lblTxt_page209_Caption ;
   private String lblTxt_page209_Internalname ;
   private String lblTxt_page210_Caption ;
   private String lblTxt_page210_Internalname ;
   private String tblTbl_page201_Internalname ;
   private String tblTbl_page202_Internalname ;
   private String tblTbl_page203_Internalname ;
   private String tblTbl_page204_Internalname ;
   private String tblTbl_page205_Internalname ;
   private String tblTbl_page206_Internalname ;
   private String tblTbl_page207_Internalname ;
   private String tblTbl_page208_Internalname ;
   private String tblTbl_page209_Internalname ;
   private String tblTbl_page210_Internalname ;
   private String tblTbl_page2_Internalname ;
   private String lblTxt_page201_Class ;
   private String lblTxt_page202_Class ;
   private String lblTxt_page203_Class ;
   private String lblTxt_page204_Class ;
   private String lblTxt_page205_Class ;
   private String lblTxt_page206_Class ;
   private String lblTxt_page207_Class ;
   private String lblTxt_page208_Class ;
   private String lblTxt_page209_Class ;
   private String lblTxt_page210_Class ;
   private String lblTxt_back2_Class ;
   private String lblTxt_back2_Internalname ;
   private String lblTxt_next2_Class ;
   private String lblTxt_next2_Internalname ;
   private String lblTxt_first2_Class ;
   private String lblTxt_first2_Internalname ;
   private String lblTxt_last2_Class ;
   private String lblTxt_last2_Internalname ;
   private String tblTbl_page_area2_Internalname ;
   private String tblTbl_grid2_header_Internalname ;
   private String lblTxt_info2_Caption ;
   private String lblTxt_info2_Internalname ;
   private String lblTxt_rec_cnt2_Caption ;
   private String lblTxt_rec_cnt2_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_memo_kanryo_exec_Internalname ;
   private String lblBtn_memo_kanryo_exec_Jsonclick ;
   private String lblBtn_csv_out_exec_Internalname ;
   private String lblBtn_csv_out_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_tab_kbn_Jsonclick ;
   private String edtavH_device_Jsonclick ;
   private String tblTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row1_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable11_Internalname ;
   private String tblTable2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTbl_test_Internalname ;
   private String lblTxt_info2_Jsonclick ;
   private String subGrid2_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTxt_rec_cnt2_Jsonclick ;
   private String tblTbl_last2_Internalname ;
   private String lblTxt_last2_Jsonclick ;
   private String tblTbl_next2_Internalname ;
   private String lblTxt_next2_Jsonclick ;
   private String lblTxt_page210_Jsonclick ;
   private String lblTxt_page209_Jsonclick ;
   private String lblTxt_page208_Jsonclick ;
   private String lblTxt_page207_Jsonclick ;
   private String lblTxt_page206_Jsonclick ;
   private String lblTxt_page205_Jsonclick ;
   private String lblTxt_page204_Jsonclick ;
   private String lblTxt_page203_Jsonclick ;
   private String lblTxt_page202_Jsonclick ;
   private String lblTxt_page201_Jsonclick ;
   private String tblTbl_back2_Internalname ;
   private String lblTxt_back2_Jsonclick ;
   private String tblTbl_first2_Internalname ;
   private String lblTxt_first2_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTxt_info_Jsonclick ;
   private String subGrid1_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
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
   private String lblTab_tuti_Jsonclick ;
   private String lblTab_edit_Jsonclick ;
   private String tblTable12_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_memo_kanryo_Jsonclick ;
   private String lblTxt_btn_crf_Internalname ;
   private String lblTxt_btn_crf_Jsonclick ;
   private String lblTxt_btn_csv_Internalname ;
   private String lblTxt_btn_csv_Jsonclick ;
   private String lblTxt_btn_exit_Internalname ;
   private String lblTxt_btn_exit_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavD_grd_datetime_Jsonclick ;
   private String edtavD_grd_memo_no_Jsonclick ;
   private String edtavD_grd_crf_id_Jsonclick ;
   private String edtavD_grd_subject_id_Jsonclick ;
   private String divSection9_Internalname ;
   private String edtavD_grd_crf_snm_Jsonclick ;
   private String divSection3_Internalname ;
   private String divSection2_Internalname ;
   private String edtavD_grd_memo_Jsonclick ;
   private String divSection8_Internalname ;
   private String edtavD_grd_user_nm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTable4_Internalname ;
   private String edtavD_grd2_date_Jsonclick ;
   private String edtavD_grd2_time_Jsonclick ;
   private String edtavD_grd2_memo_no_Jsonclick ;
   private String edtavD_grd2_crf_id_Jsonclick ;
   private String edtavD_grd2_memo_kbn_Jsonclick ;
   private String edtavD_grd2_subject_id_Jsonclick ;
   private String divSection7_Internalname ;
   private String edtavD_grd2_crf_snm_Jsonclick ;
   private String divSection6_Internalname ;
   private String divSection1_Internalname ;
   private String edtavD_grd2_memo_Jsonclick ;
   private String divSection5_Internalname ;
   private String edtavD_grd2_user_nm_Jsonclick ;
   private String edtavD_grd2_kakunin_Jsonclick ;
   private String divSection4_Internalname ;
   private String edtavD_grd2_kakunin_user_nm_Jsonclick ;
   private String edtavD_grd2_kanryo_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date AV13D_GRD_DATETIME ;
   private java.util.Date AV22D_GRD2_DATE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV16D_GRD_SEL ;
   private boolean AV29D_GRD2_SEL ;
   private boolean AV10D_GRD_ALL_CHK ;
   private boolean AV19D_GRD2_ALL_CHk ;
   private boolean returnInSub ;
   private boolean AV58W_ERRFLG ;
   private boolean AV55W_DATA_FLG ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n477TBT14_MEMO ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n205TAM07_USER_NM ;
   private String wcpOAV41P_AUTH_CD ;
   private String AV41P_AUTH_CD ;
   private String AV53W_AUTO_SENI_FLG ;
   private String AV51W_A821_JS ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A488TBT15_DEL_FLG ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A477TBT14_MEMO ;
   private String A481TBT14_CRT_USER_ID ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A698TBT01_SITE_ID ;
   private String A901TBT14_MEMO_KBN ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String AV6W_TBM31_CRF_SNM ;
   private String AV75W_TBM32_CRF_ITEM_NM ;
   private String AV68W_TAM07_USER_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV74W_TBM32_CRF_ITEM_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A55TAM07_USER_ID ;
   private String AV67W_TAM07_USER_ID ;
   private String A214TAM07_DEL_FLG ;
   private String A205TAM07_USER_NM ;
   private String AV12D_GRD_CRF_SNM ;
   private String AV72D_GRD_CRF_ITEM_NM ;
   private String AV14D_GRD_MEMO ;
   private String AV18D_GRD_USER_NM ;
   private String AV31D_GRD2_TIME ;
   private String AV27D_GRD2_MEMO_KBN ;
   private String AV21D_GRD2_CRF_SNM ;
   private String AV73D_GRD2_CRF_ITEM_NM ;
   private String AV26D_GRD2_MEMO ;
   private String AV32D_GRD2_USER_NM ;
   private String AV23D_GRD2_KAKUNIN ;
   private String AV24D_GRD2_KAKUNIN_USER_NM ;
   private String AV25D_GRD2_KANRYO ;
   private String AV38H_INIT_FLG ;
   private String AV39H_KNGN_FLG ;
   private String AV37H_DEVICE ;
   private String AV8C_APP_ID ;
   private String AV9C_GAMEN_TITLE ;
   private String AV60W_MSG ;
   private String AV52W_ALL_AUTH_CD ;
   private String AV56W_DM_AUTH_CD ;
   private String AV49W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   private String AV70W_TAM08_SITE_SNM ;
   private String AV69W_TAM08_SITE_ID ;
   private String A57TAM08_SITE_ID ;
   private String A320TAM08_SITE_SNM ;
   private String AV66W_TAM04_AUTH_NM ;
   private String AV65W_TAM04_AUTH_CD ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String AV57W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavD_sort ;
   private ICheckbox chkavD_grd_all_chk ;
   private ICheckbox chkavD_grd_sel ;
   private ICheckbox chkavD_grd2_all_chk ;
   private ICheckbox chkavD_grd2_sel ;
   private IDataStoreProvider pr_default ;
   private long[] H001N2_A149TBT15_STUDY_ID ;
   private String[] H001N2_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] H001N2_n929TBT14_REQUEST_SITE_ID ;
   private String[] H001N2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001N2_n927TBT14_KAKUNIN_FLG ;
   private String[] H001N2_A902TBT14_KANRYO_FLG ;
   private boolean[] H001N2_n902TBT14_KANRYO_FLG ;
   private String[] H001N2_A479TBT14_DEL_FLG ;
   private boolean[] H001N2_n479TBT14_DEL_FLG ;
   private String[] H001N2_A488TBT15_DEL_FLG ;
   private boolean[] H001N2_n488TBT15_DEL_FLG ;
   private byte[] H001N2_A942TBT15_CRF_EDA_NO ;
   private boolean[] H001N2_n942TBT15_CRF_EDA_NO ;
   private short[] H001N2_A155TBT15_CRF_ID ;
   private boolean[] H001N2_n155TBT15_CRF_ID ;
   private String[] H001N2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001N2_n930TBT14_REQUEST_AUTH_CD ;
   private int[] H001N2_A151TBT15_SUBJECT_ID ;
   private String[] H001N2_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] H001N2_n904TBT15_CRF_ITEM_GRP_CD ;
   private short[] H001N2_A199TBT15_MEMO_NO ;
   private String[] H001N2_A477TBT14_MEMO ;
   private boolean[] H001N2_n477TBT14_MEMO ;
   private String[] H001N2_A481TBT14_CRT_USER_ID ;
   private boolean[] H001N2_n481TBT14_CRT_USER_ID ;
   private long[] H001N2_A486TBT14_UPD_CNT ;
   private boolean[] H001N2_n486TBT14_UPD_CNT ;
   private java.util.Date[] H001N2_A480TBT14_CRT_DATETIME ;
   private boolean[] H001N2_n480TBT14_CRT_DATETIME ;
   private long[] H001N3_A945TBM44_STUDY_ID ;
   private short[] H001N3_A946TBM44_CRF_ID ;
   private byte[] H001N3_A947TBM44_CRF_EDA_NO ;
   private int[] H001N3_A948TBM44_VISIT_NO ;
   private boolean[] H001N3_n948TBM44_VISIT_NO ;
   private long[] H001N4_A87TBT01_STUDY_ID ;
   private int[] H001N4_A88TBT01_SUBJECT_ID ;
   private long[] H001N4_A149TBT15_STUDY_ID ;
   private String[] H001N4_A931TBT14_CRT_AUTH_CD ;
   private boolean[] H001N4_n931TBT14_CRT_AUTH_CD ;
   private String[] H001N4_A479TBT14_DEL_FLG ;
   private boolean[] H001N4_n479TBT14_DEL_FLG ;
   private String[] H001N4_A488TBT15_DEL_FLG ;
   private boolean[] H001N4_n488TBT15_DEL_FLG ;
   private byte[] H001N4_A942TBT15_CRF_EDA_NO ;
   private boolean[] H001N4_n942TBT15_CRF_EDA_NO ;
   private short[] H001N4_A155TBT15_CRF_ID ;
   private boolean[] H001N4_n155TBT15_CRF_ID ;
   private String[] H001N4_A698TBT01_SITE_ID ;
   private boolean[] H001N4_n698TBT01_SITE_ID ;
   private int[] H001N4_A151TBT15_SUBJECT_ID ;
   private String[] H001N4_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] H001N4_n904TBT15_CRF_ITEM_GRP_CD ;
   private short[] H001N4_A199TBT15_MEMO_NO ;
   private String[] H001N4_A901TBT14_MEMO_KBN ;
   private boolean[] H001N4_n901TBT14_MEMO_KBN ;
   private String[] H001N4_A477TBT14_MEMO ;
   private boolean[] H001N4_n477TBT14_MEMO ;
   private String[] H001N4_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] H001N4_n929TBT14_REQUEST_SITE_ID ;
   private String[] H001N4_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001N4_n930TBT14_REQUEST_AUTH_CD ;
   private String[] H001N4_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001N4_n927TBT14_KAKUNIN_FLG ;
   private String[] H001N4_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] H001N4_n928TBT14_KAKUNIN_USER_ID ;
   private String[] H001N4_A902TBT14_KANRYO_FLG ;
   private boolean[] H001N4_n902TBT14_KANRYO_FLG ;
   private String[] H001N4_A481TBT14_CRT_USER_ID ;
   private boolean[] H001N4_n481TBT14_CRT_USER_ID ;
   private long[] H001N4_A486TBT14_UPD_CNT ;
   private boolean[] H001N4_n486TBT14_UPD_CNT ;
   private java.util.Date[] H001N4_A480TBT14_CRT_DATETIME ;
   private boolean[] H001N4_n480TBT14_CRT_DATETIME ;
   private long[] H001N5_A945TBM44_STUDY_ID ;
   private short[] H001N5_A946TBM44_CRF_ID ;
   private byte[] H001N5_A947TBM44_CRF_EDA_NO ;
   private int[] H001N5_A948TBM44_VISIT_NO ;
   private boolean[] H001N5_n948TBM44_VISIT_NO ;
   private short[] H001N6_A69TBM31_CRF_ID ;
   private long[] H001N6_A68TBM31_STUDY_ID ;
   private String[] H001N6_A642TBM31_CRF_SNM ;
   private boolean[] H001N6_n642TBM31_CRF_SNM ;
   private String[] H001N7_A72TBM32_CRF_ITEM_CD ;
   private short[] H001N7_A71TBM32_CRF_ID ;
   private long[] H001N7_A70TBM32_STUDY_ID ;
   private String[] H001N7_A405TBM32_CRF_ITEM_NM ;
   private boolean[] H001N7_n405TBM32_CRF_ITEM_NM ;
   private String[] H001N8_A57TAM08_SITE_ID ;
   private String[] H001N8_A320TAM08_SITE_SNM ;
   private boolean[] H001N8_n320TAM08_SITE_SNM ;
   private String[] H001N9_A13TAM04_AUTH_CD ;
   private String[] H001N9_A285TAM04_AUTH_NM ;
   private boolean[] H001N9_n285TAM04_AUTH_NM ;
   private String[] H001N10_A214TAM07_DEL_FLG ;
   private boolean[] H001N10_n214TAM07_DEL_FLG ;
   private String[] H001N10_A55TAM07_USER_ID ;
   private String[] H001N10_A205TAM07_USER_NM ;
   private boolean[] H001N10_n205TAM07_USER_NM ;
   private com.genexus.webpanels.WebSession AV64W_SESSION ;
   private GxObjectCollection AV47SD_RNRK_MEMO_C ;
   private GxObjectCollection AV43SD_EDIT_MEMO_C ;
   private GxObjectCollection AV45SD_OPEN_CRF_C ;
   private SdtTBT14_CRF_MEMO AV7BC_TBT14_CRF_MEMO ;
   private SdtA_PAGING_SDT AV35H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT AV36H_A_PAGING_SDT2 ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtB719_SD01_MEMO_B719_SD01_MEMOItem AV48SD_RNRK_MEMO_I ;
   private SdtB719_SD01_MEMO_B719_SD01_MEMOItem AV44SD_EDIT_MEMO_I ;
   private SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem AV46SD_OPEN_CRF_I ;
   private SdtA_LOGIN_SDT AV49W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b719_wp01_memo_info__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001N4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV41P_AUTH_CD ,
                                          String AV56W_DM_AUTH_CD ,
                                          String A698TBT01_SITE_ID ,
                                          String AV49W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ,
                                          long A149TBT15_STUDY_ID ,
                                          long AV42P_STUDY_ID ,
                                          String A931TBT14_CRT_AUTH_CD ,
                                          String A479TBT14_DEL_FLG ,
                                          String A488TBT15_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [3] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT T2.`TBT01_STUDY_ID`, T2.`TBT01_SUBJECT_ID`, T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID," ;
      scmdbuf = scmdbuf + " T3.`TBT14_CRT_AUTH_CD`, T3.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T1.`TBT15_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " T1.`TBT15_CRF_ID`, T2.`TBT01_SITE_ID`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID," ;
      scmdbuf = scmdbuf + " T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO, T3.`TBT14_MEMO_KBN`," ;
      scmdbuf = scmdbuf + " T3.`TBT14_MEMO`, T3.`TBT14_REQUEST_SITE_ID`, T3.`TBT14_REQUEST_AUTH_CD`, T3.`TBT14_KAKUNIN_FLG`," ;
      scmdbuf = scmdbuf + " T3.`TBT14_KAKUNIN_USER_ID`, T3.`TBT14_KANRYO_FLG`, T3.`TBT14_CRT_USER_ID`, T3.`TBT14_UPD_CNT`," ;
      scmdbuf = scmdbuf + " T3.`TBT14_CRT_DATETIME` FROM ((`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT01_SUBJECT`" ;
      scmdbuf = scmdbuf + " T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID`)" ;
      scmdbuf = scmdbuf + " INNER JOIN `TBT14_CRF_MEMO` T3 ON T3.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND" ;
      scmdbuf = scmdbuf + " T3.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T3.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBT15_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T3.`TBT14_CRT_AUTH_CD` = ?)" ;
      scmdbuf = scmdbuf + " and (T3.`TBT14_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + " and (T1.`TBT15_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV41P_AUTH_CD, AV56W_DM_AUTH_CD) != 0 )
      {
         sWhereString = sWhereString + " and (T2.`TBT01_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T3.`TBT14_CRT_DATETIME` DESC" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_H001N4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001N2", "SELECT T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, T2.`TBT14_REQUEST_SITE_ID`, T2.`TBT14_KAKUNIN_FLG`, T2.`TBT14_KANRYO_FLG`, T2.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T1.`TBT15_CRF_EDA_NO`, T1.`TBT15_CRF_ID`, T2.`TBT14_REQUEST_AUTH_CD`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO, T2.`TBT14_MEMO`, T2.`TBT14_CRT_USER_ID`, T2.`TBT14_UPD_CNT`, T2.`TBT14_CRT_DATETIME` FROM (`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT14_CRF_MEMO` T2 ON T2.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T2.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`) WHERE (( T2.`TBT14_REQUEST_AUTH_CD` = ? or T2.`TBT14_REQUEST_AUTH_CD` = ?)) AND (T1.`TBT15_STUDY_ID` = ?) AND (T2.`TBT14_REQUEST_SITE_ID` = ?) AND (T2.`TBT14_KAKUNIN_FLG` = '0') AND (T2.`TBT14_KANRYO_FLG` = '0') AND (T2.`TBT14_DEL_FLG` = '0') AND (T1.`TBT15_DEL_FLG` = '0') ORDER BY T2.`TBT14_CRT_DATETIME` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001N3", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001N5", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N6", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N7", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N8", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N9", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001N10", "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 20);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 20);
               }
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

