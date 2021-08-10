/*
               File: b712_wp01_search_crf_impl
        Description: CRF��������
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:27:9.29
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
      chkavD_grd2_all_sel_flg = UIFactory.getCheckbox(this);
      chkavD_grd3_all_sel_flg = UIFactory.getCheckbox(this);
      cmbavD_group = new HTMLChoice();
      chkavCtlsel_flg1 = UIFactory.getCheckbox(this);
      chkavCtlsel_flg2 = UIFactory.getCheckbox(this);
      chkavCtlsel_flg = UIFactory.getCheckbox(this);
      chkavD_subject_crf_chk = UIFactory.getCheckbox(this);
      chkavCtlsel_flg4 = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_96 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_96_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_96_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_96, nGXsfl_96_idx, sGXsfl_96_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_104 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_104_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_104_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_104, nGXsfl_104_idx, sGXsfl_104_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
         {
            nRC_GXsfl_115 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_115_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_115_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid3_newrow( nRC_GXsfl_115, nGXsfl_115_idx, sGXsfl_115_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
         {
            nRC_GXsfl_154 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_154_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_154_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid4_newrow( nRC_GXsfl_154, nGXsfl_154_idx, sGXsfl_154_idx) ;
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
         pa1K2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1K2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1K2( ) ;
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
      httpContext.writeValue( "CRF��������") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151327992");
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
      GXEncryptionTmp = "b712_wp01_search_crf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b712_wp01_search_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1K2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
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
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_96", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_96, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_104", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_104, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_115", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_115, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_154", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_154, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV137Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A140TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_REQUEST_SITE_ID", GXutil.rtrim( A929TBT14_REQUEST_SITE_ID));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT14_REQUEST_AUTH_CD", GXutil.rtrim( A930TBT14_REQUEST_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KAKUNIN_FLG", GXutil.rtrim( A927TBT14_KAKUNIN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KANRYO_FLG", GXutil.rtrim( A902TBT14_KANRYO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_DEL_FLG", GXutil.rtrim( A479TBT14_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vW_SESSION_KEY_SUBJECT_CRF", GXutil.rtrim( AV105W_SESSION_KEY_SUBJECT_CRF));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vW_SESSION_KEY_SUBJECT_CRF", GetHash( "", String.valueOf(AV105W_SESSION_KEY_SUBJECT_CRF)));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILTER_NO", GXutil.ltrim( localUtil.ntoc( A978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_DEL_FLG", GXutil.rtrim( A982TBM45_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILETR_NM", GXutil.rtrim( A980TBM45_FILETR_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_MEMO_DISP_FLG", GXutil.rtrim( AV52W_MEMO_DISP_FLG));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vW_MEMO_DISP_FLG", GetHash( "", String.valueOf(AV52W_MEMO_DISP_FLG)));
      GxWebStd.gx_hidden_field( httpContext, "vW_SESSION_KEY_CRF_BASE", GXutil.rtrim( AV104W_SESSION_KEY_CRF_BASE));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vW_SESSION_KEY_CRF_BASE", GetHash( "", String.valueOf(AV104W_SESSION_KEY_CRF_BASE)));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD03_CRF_LIST", AV30W_B712_SD03_CRF_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD03_CRF_LIST", AV30W_B712_SD03_CRF_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM45_IN_CRF_ID", GXutil.rtrim( A981TBM45_IN_CRF_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV24W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD02_SUBJECT_LIST", AV28W_B712_SD02_SUBJECT_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD02_SUBJECT_LIST", AV28W_B712_SD02_SUBJECT_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( A91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( A498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SITE_ID", GXutil.rtrim( A698TBT01_SITE_ID));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL1", AV34W_B712_SD05_SEL1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL1", AV34W_B712_SD05_SEL1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL2", AV35W_B712_SD05_SEL2);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL2", AV35W_B712_SD05_SEL2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL3", AV36W_B712_SD05_SEL3);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL3", AV36W_B712_SD05_SEL3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL4", AV37W_B712_SD05_SEL4);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL4", AV37W_B712_SD05_SEL4);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD04_KANI_LIST", AV32W_B712_SD04_KANI_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD04_KANI_LIST", AV32W_B712_SD04_KANI_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B712_SD11_C", AV92SD_B712_SD11_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B712_SD11_C", AV92SD_B712_SD11_C);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM07_AUTH_CD", GXutil.rtrim( A50TBM07_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM07_DEL_FLG", GXutil.rtrim( A626TBM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM07_OTHER_SITE_VIEW_FLG", GXutil.rtrim( A625TBM07_OTHER_SITE_VIEW_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A17TBM22_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_SITE_ID", GXutil.rtrim( A18TBM22_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_DEL_FLG", GXutil.rtrim( A377TBM22_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_SNM", GXutil.rtrim( A320TAM08_SITE_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DM_EXCP_NO_DISP_FLG", GXutil.rtrim( A979TBM31_DM_EXCP_NO_DISP_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_TBM34_FLG", AV69W_TBM34_FLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM31_REPEAT_FLG", GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_SIYO_FLG", AV79W_SIYO_FLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEF_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STATUS", GXutil.rtrim( A643TBM31_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_SORT_NO", GXutil.ltrim( localUtil.ntoc( A335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_DATA_KIND", GXutil.rtrim( A7TAS01_DATA_KIND));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_DEL_FLG", GXutil.rtrim( A300TAS01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_ITEM_CD", GXutil.rtrim( A8TAS01_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_ITEM_RYAK", GXutil.rtrim( A247TAS01_ITEM_RYAK));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A87TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A88TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_DEL_FLG", GXutil.rtrim( A441TBT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A28TBM34_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_STYDY_AUTH_CD", GXutil.rtrim( A30TBM34_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_CRF_ID", GXutil.ltrim( localUtil.ntoc( A29TBM34_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV67W_TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_DISPLAY_FLG", GXutil.rtrim( A571TBM34_DISPLAY_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_DEL_FLG", GXutil.rtrim( A572TBM34_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV80W_TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV81W_TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBT02_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( AV82W_TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_DEL_FLG", GXutil.rtrim( A449TBT02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
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
      return "B712_WP01_SEARCH_CRF" ;
   }

   public String getPgmdesc( )
   {
      return "CRF��������" ;
   }

   public void wb1K0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1K2( true) ;
      }
      else
      {
         wb_table1_2_1K2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_169_1K2( true) ;
      }
      else
      {
         wb_table2_169_1K2( false) ;
      }
      return  ;
   }

   public void wb_table2_169_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF��������", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0167") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0167", "");
         }
      }
      wbErr = false ;
      strup1K0( ) ;
   }

   public void ws1K2( )
   {
      start1K2( ) ;
      evt1K2( ) ;
   }

   public void evt1K2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_FILTER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111K2 */
                        e111K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD1_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121K2 */
                        e121K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD2_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131K2 */
                        e131K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD3_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141K2 */
                        e141K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_NEW_SUBJECT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151K2 */
                        e151K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DELETE_SUBJECT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161K2 */
                        e161K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DELETE_SUBJECT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171K2 */
                        e171K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CHG_SUBJECT_SITE'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181K2 */
                        e181K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191K2 */
                        e191K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_MEMO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201K2 */
                        e201K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GROUP.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211K2 */
                        e211K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SUBJECT_ID_SEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221K2 */
                        e221K2 ();
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
                     else if ( GXutil.strcmp(sEvt, "GRID4PAGING") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        sEvt = httpContext.cgiGet( "GRID4PAGING") ;
                        if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                        {
                           subgrid4_firstpage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                        {
                           subgrid4_previouspage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                        {
                           subgrid4_nextpage( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                        {
                           subgrid4_lastpage( ) ;
                        }
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID4.LOAD") == 0 )
                     {
                        nGXsfl_154_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_15421( ) ;
                        AV130GXV11 = (short)(nGXsfl_154_idx+GRID4_nFirstRecordOnPage) ;
                        if ( ( AV32W_B712_SD04_KANI_LIST.size() >= AV130GXV11 ) && ( AV130GXV11 > 0 ) )
                        {
                           AV32W_B712_SD04_KANI_LIST.currentItem( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)) );
                           ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg4.getInternalname())) );
                           ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( httpContext.cgiGet( edtavCtltas01_item_ryak_Internalname) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID4.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e231K21 */
                              e231K21 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "CTLSEL_FLG1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "CTLSEL_FLG1.CLICK") == 0 ) )
                     {
                        nGXsfl_96_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_962( ) ;
                        AV120GXV1 = (short)(nGXsfl_96_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV26W_B712_SD01_SITE_LIST.size() >= AV120GXV1 ) && ( AV120GXV1 > 0 ) )
                        {
                           AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
                           ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
                           ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0167") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0167", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0167") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0167", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e241K2 */
                              e241K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e251K2 */
                              e251K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "CTLSEL_FLG1.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e261K2 */
                              e261K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e271K2 */
                              e271K2 ();
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
                     else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 )
                     {
                        nGXsfl_115_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_11520( ) ;
                        AV126GXV7 = nGXsfl_115_idx ;
                        if ( ( AV30W_B712_SD03_CRF_LIST.size() >= AV126GXV7 ) && ( AV126GXV7 > 0 ) )
                        {
                           AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
                           ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
                           ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                              GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
                           }
                           else
                           {
                              ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
                           }
                           AV87D_SUBJECT_CRF_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_crf_chk.getInternalname())) ;
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281K20 */
                              e281K20 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 16), "'CRF_OPEN_CLOSE'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "'CRF_OPEN_CLOSE_RESET'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'CRF_OPEN_CLOSE'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "'CRF_OPEN_CLOSE_RESET'") == 0 ) )
                     {
                        nGXsfl_104_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_10419( ) ;
                        AV123GXV4 = nGXsfl_104_idx ;
                        if ( ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV123GXV4 ) && ( AV123GXV4 > 0 ) )
                        {
                           AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
                           ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                              GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
                           }
                           else
                           {
                              ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
                           }
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "'CRF_OPEN_CLOSE'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291K2 */
                              e291K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'CRF_OPEN_CLOSE_RESET'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301K2 */
                              e301K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311K19 */
                              e311K19 ();
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
                  else if ( nCmpId == 167 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0167") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0167", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1K2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1K2( ) ;
         }
      }
   }

   public void pa1K2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b712_wp01_search_crf")), "b712_wp01_search_crf") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b712_wp01_search_crf"))) ;
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
         cmbavD_sort.addItem("1", "����No�{CRF�\����", (short)(0));
         cmbavD_sort.addItem("2", "CRF�\�����{����No��", (short)(0));
         cmbavD_sort.addItem("3", "���͌������x���{CRF�\�����{����No��", (short)(0));
         cmbavD_sort.addItem("4", "DM���iDM�� �~���{����No�{CRF�\�����j", (short)(0));
         cmbavD_sort.addItem("5", "�f�[�^�Œ�i�f�[�^�Œ� �~���{����No�{CRF�\�����j", (short)(0));
         if ( cmbavD_sort.getItemCount() > 0 )
         {
            AV10D_SORT = cmbavD_sort.getValidValue(AV10D_SORT) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
         }
         chkavD_grd1_all_sel_flg.setName( "vD_GRD1_ALL_SEL_FLG" );
         chkavD_grd1_all_sel_flg.setWebtags( "" );
         chkavD_grd1_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd1_all_sel_flg.getInternalname(), "Caption", chkavD_grd1_all_sel_flg.getCaption());
         chkavD_grd1_all_sel_flg.setCheckedValue( "false" );
         chkavD_grd2_all_sel_flg.setName( "vD_GRD2_ALL_SEL_FLG" );
         chkavD_grd2_all_sel_flg.setWebtags( "" );
         chkavD_grd2_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd2_all_sel_flg.getInternalname(), "Caption", chkavD_grd2_all_sel_flg.getCaption());
         chkavD_grd2_all_sel_flg.setCheckedValue( "false" );
         chkavD_grd3_all_sel_flg.setName( "vD_GRD3_ALL_SEL_FLG" );
         chkavD_grd3_all_sel_flg.setWebtags( "" );
         chkavD_grd3_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd3_all_sel_flg.getInternalname(), "Caption", chkavD_grd3_all_sel_flg.getCaption());
         chkavD_grd3_all_sel_flg.setCheckedValue( "false" );
         cmbavD_group.setName( "vD_GROUP" );
         cmbavD_group.setWebtags( "" );
         if ( cmbavD_group.getItemCount() > 0 )
         {
            AV84D_GROUP = (short)(GXutil.lval( cmbavD_group.getValidValue(GXutil.trim( GXutil.str( AV84D_GROUP, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84D_GROUP", GXutil.ltrim( GXutil.str( AV84D_GROUP, 4, 0)));
         }
         GXCCtl = "CTLSEL_FLG1_" + sGXsfl_96_idx ;
         chkavCtlsel_flg1.setName( GXCCtl );
         chkavCtlsel_flg1.setWebtags( "" );
         chkavCtlsel_flg1.setCaption( "" );
         chkavCtlsel_flg1.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG2_" + sGXsfl_104_idx ;
         chkavCtlsel_flg2.setName( GXCCtl );
         chkavCtlsel_flg2.setWebtags( "" );
         chkavCtlsel_flg2.setCaption( "" );
         chkavCtlsel_flg2.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG_" + sGXsfl_115_idx ;
         chkavCtlsel_flg.setName( GXCCtl );
         chkavCtlsel_flg.setWebtags( "" );
         chkavCtlsel_flg.setCaption( "" );
         chkavCtlsel_flg.setCheckedValue( "false" );
         GXCCtl = "vD_SUBJECT_CRF_CHK_" + sGXsfl_115_idx ;
         chkavD_subject_crf_chk.setName( GXCCtl );
         chkavD_subject_crf_chk.setWebtags( "" );
         chkavD_subject_crf_chk.setCaption( "" );
         chkavD_subject_crf_chk.setCheckedValue( "false" );
         GXCCtl = "CTLSEL_FLG4_" + sGXsfl_154_idx ;
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_96 ,
                                 short nGXsfl_96_idx ,
                                 String sGXsfl_96_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_962( ) ;
      while ( nGXsfl_96_idx <= nRC_GXsfl_96 )
      {
         sendrow_962( ) ;
         nGXsfl_96_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_96_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_96_idx+1)) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_962( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_104 ,
                                 short nGXsfl_104_idx ,
                                 String sGXsfl_104_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_10419( ) ;
      while ( nGXsfl_104_idx <= nRC_GXsfl_104 )
      {
         sendrow_10419( ) ;
         nGXsfl_104_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_104_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_104_idx+1)) ;
         sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_10419( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( short nRC_GXsfl_115 ,
                                 short nGXsfl_115_idx ,
                                 String sGXsfl_115_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_11520( ) ;
      while ( nGXsfl_115_idx <= nRC_GXsfl_115 )
      {
         sendrow_11520( ) ;
         nGXsfl_115_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_idx+1)) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11520( ) ;
      }
      httpContext.GX_webresponse.addString(Grid3Container.ToJavascriptSource());
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( short nRC_GXsfl_154 ,
                                 short nGXsfl_154_idx ,
                                 String sGXsfl_154_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_15421( ) ;
      while ( nGXsfl_154_idx <= nRC_GXsfl_154 )
      {
         sendrow_15421( ) ;
         nGXsfl_154_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_154_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_154_idx+1)) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_15421( ) ;
      }
      httpContext.GX_webresponse.addString(Grid4Container.ToJavascriptSource());
      /* End function gxnrGrid4_newrow */
   }

   public void refresh( )
   {
      rf1K2( ) ;
      rf1K19( ) ;
      rf1K20( ) ;
      rf1K21( ) ;
      /* End function Refresh */
   }

   public void rf1K2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 183, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(96) ;
      nGXsfl_96_idx = (short)(1) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_962( ) ;
      nGXsfl_96_Refreshing = (short)(1) ;
      /* Execute user event: e251K2 */
      e251K2 ();
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
         subsflControlProps_962( ) ;
         /* Execute user event: e271K2 */
         e271K2 ();
         wbEnd = (short)(96) ;
         wb1K0( ) ;
      }
      nGXsfl_96_Refreshing = (short)(0) ;
   }

   public void rf1K19( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTMs"));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 100, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGridTMs");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcoloreven", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcoloreven, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid2_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(104) ;
      nGXsfl_104_idx = (short)(1) ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_10419( ) ;
      nGXsfl_104_Refreshing = (short)(1) ;
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_10419( ) ;
         /* Execute user event: e311K19 */
         e311K19 ();
         wbEnd = (short)(104) ;
         wb1K0( ) ;
      }
      nGXsfl_104_Refreshing = (short)(0) ;
   }

   public void rf1K20( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
      Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 320, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid3Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid3_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(115) ;
      nGXsfl_115_idx = (short)(1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11520( ) ;
      nGXsfl_115_Refreshing = (short)(1) ;
      Grid3Container.setPageSize( subgrid3_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_11520( ) ;
         /* Execute user event: e281K20 */
         e281K20 ();
         wbEnd = (short)(115) ;
         wb1K0( ) ;
      }
      nGXsfl_115_Refreshing = (short)(0) ;
   }

   public void rf1K21( )
   {
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("CmpContext", "");
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
      Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 200, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid4Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid4_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid4_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(154) ;
      nGXsfl_154_idx = (short)(1) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_15421( ) ;
      nGXsfl_154_Refreshing = (short)(1) ;
      Grid4Container.setPageSize( subgrid4_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_15421( ) ;
         /* Execute user event: e231K21 */
         e231K21 ();
         wbEnd = (short)(154) ;
         wb1K0( ) ;
      }
      nGXsfl_154_Refreshing = (short)(0) ;
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
      return AV26W_B712_SD01_SITE_LIST.size() ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( 0 > 0 )
      {
         return 0*1 ;
      }
      else
      {
         return -1 ;
      }
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

   public int subgrid4_pagecount( )
   {
      GRID4_nRecordCount = subgrid4_recordcount( ) ;
      if ( ((int)((GRID4_nRecordCount) % (subgrid4_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID4_nRecordCount/ (double) (subgrid4_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID4_nRecordCount/ (double) (subgrid4_recordsperpage( )))+1) ;
   }

   public int subgrid4_recordcount( )
   {
      return AV32W_B712_SD04_KANI_LIST.size() ;
   }

   public int subgrid4_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid4_currentpage( )
   {
      return (int)(GXutil.Int( GRID4_nFirstRecordOnPage/ (double) (subgrid4_recordsperpage( )))+1) ;
   }

   public short subgrid4_firstpage( )
   {
      GRID4_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid4_nextpage( )
   {
      GRID4_nRecordCount = subgrid4_recordcount( ) ;
      if ( ( GRID4_nRecordCount >= subgrid4_recordsperpage( ) ) && ( GRID4_nEOF == 0 ) )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage+subgrid4_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(((GRID4_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid4_previouspage( )
   {
      if ( GRID4_nFirstRecordOnPage >= subgrid4_recordsperpage( ) )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage-subgrid4_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid4_lastpage( )
   {
      GRID4_nRecordCount = subgrid4_recordcount( ) ;
      if ( GRID4_nRecordCount > subgrid4_recordsperpage( ) )
      {
         if ( ((int)((GRID4_nRecordCount) % (subgrid4_recordsperpage( )))) == 0 )
         {
            GRID4_nFirstRecordOnPage = (long)(GRID4_nRecordCount-subgrid4_recordsperpage( )) ;
         }
         else
         {
            GRID4_nFirstRecordOnPage = (long)(GRID4_nRecordCount-((int)((GRID4_nRecordCount) % (subgrid4_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID4_nFirstRecordOnPage = 0 ;
      }
      return (short)(0) ;
   }

   public int subgrid4_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID4_nFirstRecordOnPage = (long)(subgrid4_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID4_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup1K0( )
   {
      /* Before Start, stand alone formulas. */
      AV137Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV134Pgmdesc = "CRF��������" ;
      Gx_err = (short)(0) ;
      edtavH_subject_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavH_subject_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavH_subject_id_Enabled, 5, 0)));
      edtavCtltam08_site_snm_Enabled = 0 ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e241K2 */
      e241K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd04_kani_list"), AV32W_B712_SD04_KANI_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV12H_A_PAGING_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd01_site_list"), AV26W_B712_SD01_SITE_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd03_crf_list"), AV30W_B712_SD03_CRF_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd02_subject_list"), AV28W_B712_SD02_SUBJECT_LIST);
         /* Read variables values. */
         cmbavD_sort.setName( cmbavD_sort.getInternalname() );
         cmbavD_sort.setValue( httpContext.cgiGet( cmbavD_sort.getInternalname()) );
         AV10D_SORT = httpContext.cgiGet( cmbavD_sort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
         AV7D_GRD1_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", AV7D_GRD1_ALL_SEL_FLG);
         AV8D_GRD2_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_GRD2_ALL_SEL_FLG", AV8D_GRD2_ALL_SEL_FLG);
         AV9D_GRD3_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd3_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", AV9D_GRD3_ALL_SEL_FLG);
         cmbavD_group.setName( cmbavD_group.getInternalname() );
         cmbavD_group.setValue( httpContext.cgiGet( cmbavD_group.getInternalname()) );
         AV84D_GROUP = (short)(GXutil.lval( httpContext.cgiGet( cmbavD_group.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84D_GROUP", GXutil.ltrim( GXutil.str( AV84D_GROUP, 4, 0)));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SUBJECT_ID");
            GX_FocusControl = edtavH_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86H_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV86H_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
         }
         AV11D_SUBJECT_ID = httpContext.cgiGet( edtavD_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV16H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_FLG", AV16H_SRCH_FLG);
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_POPUP_KBN");
            GX_FocusControl = edtavH_popup_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78H_POPUP_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
         }
         else
         {
            AV78H_POPUP_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
         }
         AV117H_DMFLG = httpContext.cgiGet( edtavH_dmflg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117H_DMFLG", AV117H_DMFLG);
         /* Read saved values. */
         nRC_GXsfl_96 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_96"), ".", ",")) ;
         nRC_GXsfl_104 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_104"), ".", ",")) ;
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         nRC_GXsfl_154 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_154"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID4_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID4_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         GRID4_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID4_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0167") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0167", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_96 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_96"), ".", ",")) ;
         nGXsfl_96_fel_idx = (short)(0) ;
         while ( nGXsfl_96_fel_idx < nRC_GXsfl_96 )
         {
            nGXsfl_96_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_96_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_96_fel_idx+1)) ;
            sGXsfl_96_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_962( ) ;
            AV120GXV1 = (short)(nGXsfl_96_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV120GXV1 = (short)(nGXsfl_96_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV26W_B712_SD01_SITE_LIST.size() >= AV120GXV1 ) && ( AV120GXV1 > 0 ) )
            {
               AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0167") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0167", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0167") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0167", "");
            }
            AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
         }
         if ( nGXsfl_96_fel_idx == 0 )
         {
            nGXsfl_96_idx = (short)(1) ;
            sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_962( ) ;
         }
         nGXsfl_96_fel_idx = (short)(1) ;
         nRC_GXsfl_104 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_104"), ".", ",")) ;
         nGXsfl_104_fel_idx = (short)(0) ;
         while ( nGXsfl_104_fel_idx < nRC_GXsfl_104 )
         {
            nGXsfl_104_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_104_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_104_fel_idx+1)) ;
            sGXsfl_104_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_10419( ) ;
            AV123GXV4 = nGXsfl_104_fel_idx ;
            AV123GXV4 = nGXsfl_104_fel_idx ;
            if ( ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV123GXV4 ) && ( AV123GXV4 > 0 ) )
            {
               AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
               ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                  GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                  wbErr = true ;
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
               }
               else
               {
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
               }
            }
            AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
         }
         if ( nGXsfl_104_fel_idx == 0 )
         {
            nGXsfl_104_idx = (short)(1) ;
            sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_10419( ) ;
         }
         nGXsfl_104_fel_idx = (short)(1) ;
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         nGXsfl_115_fel_idx = (short)(0) ;
         while ( nGXsfl_115_fel_idx < nRC_GXsfl_115 )
         {
            nGXsfl_115_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_fel_idx+1)) ;
            sGXsfl_115_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_11520( ) ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            if ( ( AV30W_B712_SD03_CRF_LIST.size() >= AV126GXV7 ) && ( AV126GXV7 > 0 ) )
            {
               AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                  GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                  wbErr = true ;
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
               }
               else
               {
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               }
               AV87D_SUBJECT_CRF_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_crf_chk.getInternalname())) ;
            }
            AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
         }
         if ( nGXsfl_115_fel_idx == 0 )
         {
            nGXsfl_115_idx = (short)(1) ;
            sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_11520( ) ;
         }
         nGXsfl_115_fel_idx = (short)(1) ;
         nRC_GXsfl_154 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_154"), ".", ",")) ;
         nGXsfl_154_fel_idx = (short)(0) ;
         while ( nGXsfl_154_fel_idx < nRC_GXsfl_154 )
         {
            nGXsfl_154_fel_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_154_fel_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_154_fel_idx+1)) ;
            sGXsfl_154_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_15421( ) ;
            AV130GXV11 = (short)(nGXsfl_154_fel_idx+GRID4_nFirstRecordOnPage) ;
            AV130GXV11 = (short)(nGXsfl_154_fel_idx+GRID4_nFirstRecordOnPage) ;
            if ( ( AV32W_B712_SD04_KANI_LIST.size() >= AV130GXV11 ) && ( AV130GXV11 > 0 ) )
            {
               AV32W_B712_SD04_KANI_LIST.currentItem( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)) );
               ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg4.getInternalname())) );
               ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( httpContext.cgiGet( edtavCtltas01_item_ryak_Internalname) );
            }
            AV32W_B712_SD04_KANI_LIST.currentItem( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)) );
         }
         if ( nGXsfl_154_fel_idx == 0 )
         {
            nGXsfl_154_idx = (short)(1) ;
            sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_15421( ) ;
         }
         nGXsfl_154_fel_idx = (short)(1) ;
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
      /* Execute user event: e241K2 */
      e241K2 ();
      if (returnInSub) return;
   }

   public void e241K2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B712" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV134Pgmdesc ;
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
      /* Using cursor H001K2 */
      pr_default.execute(0, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63TBM21_STUDY_ID = H001K2_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001K2_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001K2_n367TBM21_STUDY_NM[0] ;
         AV62W_STUDY_NM = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62W_STUDY_NM", AV62W_STUDY_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H001K3 */
      pr_default.execute(1, new Object[] {AV18P_AUTH_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13TAM04_AUTH_CD = H001K3_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A285TAM04_AUTH_NM = H001K3_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = H001K3_n285TAM04_AUTH_NM[0] ;
         AV25W_AUTH_NM = A285TAM04_AUTH_NM + "����" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_AUTH_NM", AV25W_AUTH_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomp1_Component), GXutil.lower( "B791_WP01_HEADER")) != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "b791_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "B791_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV22W_A_LOGIN_SDT,AV5C_APP_ID,AV62W_STUDY_NM,AV25W_AUTH_NM,""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","",""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0167",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      edtavCtltbm31_crf_id_Visible = 0 ;
      AV105W_SESSION_KEY_SUBJECT_CRF = "B712_WP01_KEY_SUBJECT_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105W_SESSION_KEY_SUBJECT_CRF", AV105W_SESSION_KEY_SUBJECT_CRF);
      AV104W_SESSION_KEY_CRF_BASE = "B712_WP01_CRF_SEL_LIST" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104W_SESSION_KEY_CRF_BASE", AV104W_SESSION_KEY_CRF_BASE);
   }

   public void e251K2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV137Pgmname, "INFO", "��ʋN��") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         AV15H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         AV78H_POPUP_KBN = (short)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
         AV52W_MEMO_DISP_FLG = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52W_MEMO_DISP_FLG", AV52W_MEMO_DISP_FLG);
         if ( AV19P_MOVE_KBN == 0 )
         {
            /* Using cursor H001K4 */
            pr_default.execute(2, new Object[] {new Long(AV20P_STUDY_ID), AV18P_AUTH_CD, AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A479TBT14_DEL_FLG = H001K4_A479TBT14_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
               n479TBT14_DEL_FLG = H001K4_n479TBT14_DEL_FLG[0] ;
               A902TBT14_KANRYO_FLG = H001K4_A902TBT14_KANRYO_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
               n902TBT14_KANRYO_FLG = H001K4_n902TBT14_KANRYO_FLG[0] ;
               A927TBT14_KAKUNIN_FLG = H001K4_A927TBT14_KAKUNIN_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
               n927TBT14_KAKUNIN_FLG = H001K4_n927TBT14_KAKUNIN_FLG[0] ;
               A930TBT14_REQUEST_AUTH_CD = H001K4_A930TBT14_REQUEST_AUTH_CD[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
               n930TBT14_REQUEST_AUTH_CD = H001K4_n930TBT14_REQUEST_AUTH_CD[0] ;
               A929TBT14_REQUEST_SITE_ID = H001K4_A929TBT14_REQUEST_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
               n929TBT14_REQUEST_SITE_ID = H001K4_n929TBT14_REQUEST_SITE_ID[0] ;
               A140TBT14_STUDY_ID = H001K4_A140TBT14_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
               AV52W_MEMO_DISP_FLG = "1" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52W_MEMO_DISP_FLG", AV52W_MEMO_DISP_FLG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV60W_SESSION.remove(AV105W_SESSION_KEY_SUBJECT_CRF);
            httpContext.ajax_rsp_assign_attri("", false, "AV105W_SESSION_KEY_SUBJECT_CRF", AV105W_SESSION_KEY_SUBJECT_CRF);
            AV92SD_B712_SD11_C.clear();
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
            /* Execute user subroutine: S142 */
            S142 ();
            if (returnInSub) return;
            if ( AV78H_POPUP_KBN == 3 )
            {
               GXt_char1 = AV53W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00031", "", "", "", "", "", GXv_char2) ;
               b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV53W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
               GXt_char1 = AV24W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV53W_MSG, "", "BTN_END", "", GXv_char2) ;
               b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
               AV24W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
            }
         }
         AV15H_POPUP_ERR_CD = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_POPUP_ERR_CD", GXutil.str( AV15H_POPUP_ERR_CD, 1, 0));
         AV78H_POPUP_KBN = (short)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
      }
      cmbavD_group.removeAllItems();
      cmbavD_group.addItem("0", "�S�\��", (short)(0));
      /* Using cursor H001K5 */
      pr_default.execute(3, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A982TBM45_DEL_FLG = H001K5_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = H001K5_n982TBM45_DEL_FLG[0] ;
         A977TBM45_STUDY_ID = H001K5_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A980TBM45_FILETR_NM = H001K5_A980TBM45_FILETR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
         n980TBM45_FILETR_NM = H001K5_n980TBM45_FILETR_NM[0] ;
         A978TBM45_FILTER_NO = H001K5_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         cmbavD_group.addItem(GXutil.trim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)), A980TBM45_FILETR_NM, (short)(0));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      AV70W_TOP_LINE_NO = (long)(subGrid1_Rows*(subgrid1_currentpage( )-1)+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70W_TOP_LINE_NO", GXutil.ltrim( GXutil.str( AV70W_TOP_LINE_NO, 10, 0)));
      AV38W_CNT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
      if ( GXutil.strcmp(AV13H_AUTO_SENI_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
      }
      if ( GXutil.strcmp(AV52W_MEMO_DISP_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         AV52W_MEMO_DISP_FLG = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52W_MEMO_DISP_FLG", AV52W_MEMO_DISP_FLG);
      }
      AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
   }

   public void e111K2( )
   {
      /* 'BTN_CRF_FILTER' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b712_wp03_crf_filter_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) ;
      httpContext.popup(formatLink("b712_wp03_crf_filter_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void e121K2( )
   {
      /* D_grd1_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( AV7D_GRD1_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV86H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
   }

   public void e131K2( )
   {
      /* D_grd2_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( AV8D_GRD2_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
   }

   public void e141K2( )
   {
      /* D_grd3_all_sel_flg_Click Routine */
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV9D_GRD3_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
   }

   public void e151K2( )
   {
      /* 'BTN_NEW_SUBJECT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV43W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
      AV46W_INPCHK_FLG1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_INPCHK_FLG1", AV46W_INPCHK_FLG1);
      AV47W_INPCHK_FLG2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47W_INPCHK_FLG2", AV47W_INPCHK_FLG2);
      AV48W_INPCHK_FLG3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48W_INPCHK_FLG3", AV48W_INPCHK_FLG3);
      AV49W_INPCHK_FLG4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49W_INPCHK_FLG4", AV49W_INPCHK_FLG4);
      AV50W_INPCHK_FLG5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50W_INPCHK_FLG5", AV50W_INPCHK_FLG5);
      AV51W_INPCHK_FLG6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51W_INPCHK_FLG6", AV51W_INPCHK_FLG6);
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV78H_POPUP_KBN = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b713_wp01_subject_sink"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.popup(formatLink("b713_wp01_subject_sink") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV15H_POPUP_ERR_CD"});
         httpContext.doAjaxRefresh();
      }
   }

   public void e161K2( )
   {
      /* 'BTN_DELETE_SUBJECT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV43W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
      AV46W_INPCHK_FLG1 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_INPCHK_FLG1", AV46W_INPCHK_FLG1);
      AV47W_INPCHK_FLG2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47W_INPCHK_FLG2", AV47W_INPCHK_FLG2);
      AV48W_INPCHK_FLG3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48W_INPCHK_FLG3", AV48W_INPCHK_FLG3);
      AV49W_INPCHK_FLG4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49W_INPCHK_FLG4", AV49W_INPCHK_FLG4);
      AV50W_INPCHK_FLG5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50W_INPCHK_FLG5", AV50W_INPCHK_FLG5);
      AV51W_INPCHK_FLG6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51W_INPCHK_FLG6", AV51W_INPCHK_FLG6);
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         GXt_char1 = AV53W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AG00028", GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0), "", "", "", "", GXv_char2) ;
         b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
         GXt_char1 = AV24W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV53W_MSG, "", "BTN_DELETE_SUBJECT_EXEC", "", GXv_char2) ;
         b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
         AV24W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
      }
   }

   public void e171K2( )
   {
      /* 'BTN_DELETE_SUBJECT_EXEC' Routine */
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      GXv_int3[0] = AV40W_ERR_CD ;
      GXv_char2[0] = AV41W_ERR_MSG ;
      new b713_pc02_subject_delete(remoteHandle, context).execute( AV20P_STUDY_ID, AV17H_SUBJECT_ID_SENTAKU, GXv_int3, GXv_char2) ;
      b712_wp01_search_crf_impl.this.AV40W_ERR_CD = GXv_int3[0] ;
      b712_wp01_search_crf_impl.this.AV41W_ERR_MSG = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV40W_ERR_CD", GXutil.str( AV40W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV41W_ERR_MSG", AV41W_ERR_MSG);
      if ( AV40W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV41W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         httpContext.doAjaxRefresh();
      }
   }

   public void e181K2( )
   {
      /* 'BTN_CHG_SUBJECT_SITE' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV43W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
      AV46W_INPCHK_FLG1 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_INPCHK_FLG1", AV46W_INPCHK_FLG1);
      AV47W_INPCHK_FLG2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47W_INPCHK_FLG2", AV47W_INPCHK_FLG2);
      AV48W_INPCHK_FLG3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48W_INPCHK_FLG3", AV48W_INPCHK_FLG3);
      AV49W_INPCHK_FLG4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49W_INPCHK_FLG4", AV49W_INPCHK_FLG4);
      AV50W_INPCHK_FLG5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50W_INPCHK_FLG5", AV50W_INPCHK_FLG5);
      AV51W_INPCHK_FLG6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51W_INPCHK_FLG6", AV51W_INPCHK_FLG6);
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV78H_POPUP_KBN = (short)(3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV78H_POPUP_KBN, 4, 0)));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b713_wp02_subject_site_chg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17H_SUBJECT_ID_SENTAKU,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.popup(formatLink("b713_wp02_subject_site_chg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV15H_POPUP_ERR_CD"});
         httpContext.doAjaxRefresh();
      }
   }

   public void e191K2( )
   {
      /* 'BTN_SRCH' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV43W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
      AV46W_INPCHK_FLG1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_INPCHK_FLG1", AV46W_INPCHK_FLG1);
      AV47W_INPCHK_FLG2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47W_INPCHK_FLG2", AV47W_INPCHK_FLG2);
      AV48W_INPCHK_FLG3 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48W_INPCHK_FLG3", AV48W_INPCHK_FLG3);
      AV49W_INPCHK_FLG4 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49W_INPCHK_FLG4", AV49W_INPCHK_FLG4);
      AV50W_INPCHK_FLG5 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50W_INPCHK_FLG5", AV50W_INPCHK_FLG5);
      AV51W_INPCHK_FLG6 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51W_INPCHK_FLG6", AV51W_INPCHK_FLG6);
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( ! AV43W_ERRFLG )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         AV60W_SESSION.setValue("B712_WP02_STUDY_ID", GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
         AV60W_SESSION.setValue("B712_WP02_AUTH_CD", AV18P_AUTH_CD);
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_AUTH_CD", AV18P_AUTH_CD);
         httpContext.wjLoc = formatLink("b712_wp02_result_crf")  ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e201K2( )
   {
      /* 'BTN_MEMO' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV19P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      GX_FocusControl = cmbavD_sort.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      AV60W_SESSION.setValue(AV104W_SESSION_KEY_CRF_BASE, AV30W_B712_SD03_CRF_LIST.toJSonString(false));
   }

   public void S242( )
   {
      /* 'SUB_SET_SDT_DB' Routine */
      AV26W_B712_SD01_SITE_LIST.clear();
      gx_BV96 = true ;
      AV30W_B712_SD03_CRF_LIST.clear();
      gx_BV115 = true ;
      AV32W_B712_SD04_KANI_LIST.clear();
      gx_BV154 = true ;
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
      /* Using cursor H001K6 */
      pr_default.execute(4, new Object[] {AV18P_AUTH_CD});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A626TBM07_DEL_FLG = H001K6_A626TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBM07_DEL_FLG", A626TBM07_DEL_FLG);
         n626TBM07_DEL_FLG = H001K6_n626TBM07_DEL_FLG[0] ;
         A50TBM07_AUTH_CD = H001K6_A50TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
         A625TBM07_OTHER_SITE_VIEW_FLG = H001K6_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBM07_OTHER_SITE_VIEW_FLG", A625TBM07_OTHER_SITE_VIEW_FLG);
         n625TBM07_OTHER_SITE_VIEW_FLG = H001K6_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         AV59W_OTHER_SITE_VIEW_FLG = A625TBM07_OTHER_SITE_VIEW_FLG ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59W_OTHER_SITE_VIEW_FLG", AV59W_OTHER_SITE_VIEW_FLG);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV59W_OTHER_SITE_VIEW_FLG ,
                                           A18TBM22_SITE_ID ,
                                           AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id() ,
                                           A377TBM22_DEL_FLG ,
                                           new Long(AV20P_STUDY_ID) ,
                                           new Long(A17TBM22_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor H001K7 */
      pr_default.execute(5, new Object[] {new Long(AV20P_STUDY_ID), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A377TBM22_DEL_FLG = H001K7_A377TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM22_DEL_FLG", A377TBM22_DEL_FLG);
         n377TBM22_DEL_FLG = H001K7_n377TBM22_DEL_FLG[0] ;
         A18TBM22_SITE_ID = H001K7_A18TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TBM22_SITE_ID", A18TBM22_SITE_ID);
         A17TBM22_STUDY_ID = H001K7_A17TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)));
         A320TAM08_SITE_SNM = H001K7_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = H001K7_n320TAM08_SITE_SNM[0] ;
         A320TAM08_SITE_SNM = H001K7_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = H001K7_n320TAM08_SITE_SNM[0] ;
         AV27W_B712_SD01_SITE_LIST_Item = (SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)new SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem(remoteHandle, context);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id( A18TBM22_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( A320TAM08_SITE_SNM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         if ( AV19P_MOVE_KBN == 0 )
         {
            AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
         }
         else
         {
            AV45W_IDX = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
            while ( AV45W_IDX <= AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
            {
               if ( GXutil.strcmp((String)AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), AV27W_B712_SD01_SITE_LIST_Item.getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id()) == 0 )
               {
                  AV27W_B712_SD01_SITE_LIST_Item.setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B712_SD01_SITE_LIST_Item", AV27W_B712_SD01_SITE_LIST_Item);
               }
               AV45W_IDX = (long)(AV45W_IDX+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
            }
         }
         AV26W_B712_SD01_SITE_LIST.add(AV27W_B712_SD01_SITE_LIST_Item, 0);
         gx_BV96 = true ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
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
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), AV18P_AUTH_CD) == 0 )
      {
         AV88W_DM_KBN_CRF = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88W_DM_KBN_CRF", AV88W_DM_KBN_CRF);
      }
      else
      {
         AV88W_DM_KBN_CRF = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88W_DM_KBN_CRF", AV88W_DM_KBN_CRF);
      }
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A643TBM31_STATUS ,
                                           AV117H_DMFLG ,
                                           AV88W_DM_KBN_CRF ,
                                           A979TBM31_DM_EXCP_NO_DISP_FLG ,
                                           new Long(A68TBM31_STUDY_ID) ,
                                           new Long(AV20P_STUDY_ID) ,
                                           A397TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001K8 */
      pr_default.execute(6, new Object[] {AV88W_DM_KBN_CRF, AV88W_DM_KBN_CRF, new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A69TBM31_CRF_ID = H001K8_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001K8_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A642TBM31_CRF_SNM = H001K8_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H001K8_n642TBM31_CRF_SNM[0] ;
         A395TBM31_ORDER = H001K8_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = H001K8_n395TBM31_ORDER[0] ;
         A643TBM31_STATUS = H001K8_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = H001K8_n643TBM31_STATUS[0] ;
         A979TBM31_DM_EXCP_NO_DISP_FLG = H001K8_A979TBM31_DM_EXCP_NO_DISP_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A979TBM31_DM_EXCP_NO_DISP_FLG", A979TBM31_DM_EXCP_NO_DISP_FLG);
         n979TBM31_DM_EXCP_NO_DISP_FLG = H001K8_n979TBM31_DM_EXCP_NO_DISP_FLG[0] ;
         A397TBM31_DEL_FLG = H001K8_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001K8_n397TBM31_DEL_FLG[0] ;
         A943TBM31_REPEAT_FLG = H001K8_A943TBM31_REPEAT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
         n943TBM31_REPEAT_FLG = H001K8_n943TBM31_REPEAT_FLG[0] ;
         A528TBM31_DEF_VISIT_NO = H001K8_A528TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
         n528TBM31_DEF_VISIT_NO = H001K8_n528TBM31_DEF_VISIT_NO[0] ;
         AV68W_TBM31_STUDY_ID = A68TBM31_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68W_TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( AV68W_TBM31_STUDY_ID, 10, 0)));
         AV67W_TBM31_CRF_ID = A69TBM31_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67W_TBM31_CRF_ID", GXutil.ltrim( GXutil.str( AV67W_TBM31_CRF_ID, 4, 0)));
         /* Execute user subroutine: S269 */
         S269 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( ! AV69W_TBM34_FLG )
         {
            if ( A943TBM31_REPEAT_FLG == 0 )
            {
               AV80W_TBT02_STUDY_ID = A68TBM31_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80W_TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( AV80W_TBT02_STUDY_ID, 10, 0)));
               AV81W_TBT02_CRF_ID = A69TBM31_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81W_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV81W_TBT02_CRF_ID, 4, 0)));
               AV82W_TBT02_CRF_EDA_NO = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV82W_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV82W_TBT02_CRF_EDA_NO, 2, 0)));
               /* Execute user subroutine: S279 */
               S279 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV79W_SIYO_FLG )
               {
                  AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( false );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( A69TBM31_CRF_ID );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no( (byte)(1) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no( A528TBM31_DEF_VISIT_NO );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( A642TBM31_CRF_SNM+"("+GXutil.trim( GXutil.str( A528TBM31_DEF_VISIT_NO, 10, 0))+")" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order( A395TBM31_ORDER );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status( A643TBM31_STATUS );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id( A68TBM31_STUDY_ID );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  AV30W_B712_SD03_CRF_LIST.add(AV31W_B712_SD03_CRF_LIST_Item, 0);
                  gx_BV115 = true ;
               }
            }
            else
            {
               /* Using cursor H001K9 */
               pr_default.execute(7, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A945TBM44_STUDY_ID = H001K9_A945TBM44_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
                  A946TBM44_CRF_ID = H001K9_A946TBM44_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
                  A947TBM44_CRF_EDA_NO = H001K9_A947TBM44_CRF_EDA_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
                  A948TBM44_VISIT_NO = H001K9_A948TBM44_VISIT_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
                  n948TBM44_VISIT_NO = H001K9_n948TBM44_VISIT_NO[0] ;
                  AV80W_TBT02_STUDY_ID = A945TBM44_STUDY_ID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV80W_TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( AV80W_TBT02_STUDY_ID, 10, 0)));
                  AV81W_TBT02_CRF_ID = A946TBM44_CRF_ID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV81W_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV81W_TBT02_CRF_ID, 4, 0)));
                  AV82W_TBT02_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV82W_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV82W_TBT02_CRF_EDA_NO, 2, 0)));
                  /* Execute user subroutine: S279 */
                  S279 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(6);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( AV79W_SIYO_FLG )
                  {
                     AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( false );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( A946TBM44_CRF_ID );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no( A947TBM44_CRF_EDA_NO );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no( A948TBM44_VISIT_NO );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( A642TBM31_CRF_SNM+"("+GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0))+")" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order( A395TBM31_ORDER );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status( A643TBM31_STATUS );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id( A945TBM44_STUDY_ID );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                     AV30W_B712_SD03_CRF_LIST.add(AV31W_B712_SD03_CRF_LIST_Item, 0);
                     gx_BV115 = true ;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV144GXV15 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV144GXV15", GXutil.ltrim( GXutil.str( AV144GXV15, 8, 0)));
      while ( AV144GXV15 <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV144GXV15));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
         {
            AV76W_SELECT_CD = GXutil.trim( GXutil.str( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), 10, 0)) + "_" + GXutil.trim( GXutil.str( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no(), 10, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_SELECT_CD", AV76W_SELECT_CD);
            if ( GXutil.strcmp((String)AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), AV76W_SELECT_CD) == 0 )
            {
               AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         AV144GXV15 = (int)(AV144GXV15+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV144GXV15", GXutil.ltrim( GXutil.str( AV144GXV15, 8, 0)));
      }
      AV30W_B712_SD03_CRF_LIST.sort("TBM44_VISIT_NO, TBM31_ORDER");
      gx_BV115 = true ;
      /* Using cursor H001K10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A300TAS01_DEL_FLG = H001K10_A300TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         n300TAS01_DEL_FLG = H001K10_n300TAS01_DEL_FLG[0] ;
         A7TAS01_DATA_KIND = H001K10_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = H001K10_A8TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A247TAS01_ITEM_RYAK = H001K10_A247TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         n247TAS01_ITEM_RYAK = H001K10_n247TAS01_ITEM_RYAK[0] ;
         A335TAS01_SORT_NO = H001K10_A335TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
         n335TAS01_SORT_NO = H001K10_n335TAS01_SORT_NO[0] ;
         AV33W_B712_SD04_KANI_LIST_Item = (SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)new SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem(remoteHandle, context);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd( A8TAS01_ITEM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( A247TAS01_ITEM_RYAK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no( A335TAS01_SORT_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
         {
            if ( GXutil.strcmp((String)AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), AV33W_B712_SD04_KANI_LIST_Item.getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd()) == 0 )
            {
               AV33W_B712_SD04_KANI_LIST_Item.setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33W_B712_SD04_KANI_LIST_Item", AV33W_B712_SD04_KANI_LIST_Item);
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         AV32W_B712_SD04_KANI_LIST.add(AV33W_B712_SD04_KANI_LIST_Item, 0);
         gx_BV154 = true ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV19P_MOVE_KBN == 0 )
      {
         AV7D_GRD1_ALL_SEL_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", AV7D_GRD1_ALL_SEL_FLG);
      }
      else
      {
      }
   }

   public void S279( )
   {
      /* 'SUB_CRF_SIYO_CHK' Routine */
      AV79W_SIYO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_SIYO_FLG", AV79W_SIYO_FLG);
      /* Using cursor H001K11 */
      pr_default.execute(9, new Object[] {new Long(AV80W_TBT02_STUDY_ID), new Short(AV81W_TBT02_CRF_ID), new Byte(AV82W_TBT02_CRF_EDA_NO)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A449TBT02_DEL_FLG = H001K11_A449TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
         n449TBT02_DEL_FLG = H001K11_n449TBT02_DEL_FLG[0] ;
         A935TBT02_CRF_EDA_NO = H001K11_A935TBT02_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
         A91TBT02_CRF_ID = H001K11_A91TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A89TBT02_STUDY_ID = H001K11_A89TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = H001K11_A90TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         AV147GXV16 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV147GXV16", GXutil.ltrim( GXutil.str( AV147GXV16, 8, 0)));
         while ( AV147GXV16 <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            AV29W_B712_SD02_SUBJECT_LIST_Item = (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV147GXV16));
            if ( AV29W_B712_SD02_SUBJECT_LIST_Item.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == A90TBT02_SUBJECT_ID )
            {
               AV79W_SIYO_FLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV79W_SIYO_FLG", AV79W_SIYO_FLG);
               if (true) break;
            }
            AV147GXV16 = (int)(AV147GXV16+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV147GXV16", GXutil.ltrim( GXutil.str( AV147GXV16, 8, 0)));
         }
         if ( AV79W_SIYO_FLG )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_SORT", AV10D_SORT);
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG", (AV7D_GRD1_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG", (AV8D_GRD2_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG", (AV9D_GRD3_ALL_SEL_FLG ? "1" : "0"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_SUBJECT_ID", AV11D_SUBJECT_ID);
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GROUP", GXutil.trim( GXutil.str( AV84D_GROUP, 10, 0)));
      AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         if ( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
         {
            AV34W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id(), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
      AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
         {
            AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(GXutil.str( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), 6, 0), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
      AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV148GXV17 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV148GXV17", GXutil.ltrim( GXutil.str( AV148GXV17, 8, 0)));
      while ( AV148GXV17 <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV148GXV17));
         if ( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() )
         {
            AV76W_SELECT_CD = GXutil.trim( GXutil.str( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), 10, 0)) + "_" + GXutil.trim( GXutil.str( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no(), 10, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76W_SELECT_CD", AV76W_SELECT_CD);
            AV36W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(AV76W_SELECT_CD, 0);
         }
         AV148GXV17 = (int)(AV148GXV17+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV148GXV17", GXutil.ltrim( GXutil.str( AV148GXV17, 8, 0)));
      }
      AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV32W_B712_SD04_KANI_LIST.size() )
      {
         if ( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg() )
         {
            AV37W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd(), 0);
         }
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID1_SEL", AV34W_B712_SD05_SEL1.toxml(false, true, "B712_SD05_MULTI_SEL_LIST", "tablet-EDC_GXXEV3U3"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID2_SEL", AV35W_B712_SD05_SEL2.toxml(false, true, "B712_SD05_MULTI_SEL_LIST", "tablet-EDC_GXXEV3U3"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID3_SEL", AV36W_B712_SD05_SEL3.toxml(false, true, "B712_SD05_MULTI_SEL_LIST", "tablet-EDC_GXXEV3U3"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID4_SEL", AV37W_B712_SD05_SEL4.toxml(false, true, "B712_SD05_MULTI_SEL_LIST", "tablet-EDC_GXXEV3U3"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_GRID3_SUBJECT", AV92SD_B712_SD11_C.toxml(false, true, "B712_SD11_SUBJECT_CRF", "tablet-EDC_GXXEV3U3"));
   }

   public void S232( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV10D_SORT = AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_D_SORT") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_SORT", AV10D_SORT);
      AV7D_GRD1_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_GRD1_ALL_SEL_FLG", AV7D_GRD1_ALL_SEL_FLG);
      AV8D_GRD2_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_GRD2_ALL_SEL_FLG", AV8D_GRD2_ALL_SEL_FLG);
      AV9D_GRD3_ALL_SEL_FLG = ((GXutil.strcmp(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG"), "1")==0) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", AV9D_GRD3_ALL_SEL_FLG);
      AV11D_SUBJECT_ID = AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_SUBJECT_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
      AV84D_GROUP = (short)(GXutil.lval( AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GROUP"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84D_GROUP", GXutil.ltrim( GXutil.str( AV84D_GROUP, 4, 0)));
      AV34W_B712_SD05_SEL1.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID1_SEL"), "");
      AV35W_B712_SD05_SEL2.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID2_SEL"), "");
      AV36W_B712_SD05_SEL3.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID3_SEL"), "");
      AV37W_B712_SD05_SEL4.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID4_SEL"), "");
      AV92SD_B712_SD11_C.fromxml(AV60W_SESSION.getValue("B712_WP01_SEARCH_CRF_GRID3_SUBJECT"), "");
      AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV92SD_B712_SD11_C.toJSonString(false));
   }

   public void S252( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_D_SORT");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD1_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD2_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRD3_ALL_SEL_FLG");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_SUBJECT_ID");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GROUP");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID1_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID2_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID3_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID4_SEL");
      AV60W_SESSION.remove("B712_WP01_SEARCH_CRF_GRID3_SUBJECT");
   }

   public void S202( )
   {
      /* 'SUB_GRID2_SDT_SET_SD02' Routine */
      AV28W_B712_SD02_SUBJECT_LIST.clear();
      gx_BV104 = true ;
      AV149GXV18 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149GXV18", GXutil.ltrim( GXutil.str( AV149GXV18, 8, 0)));
      while ( AV149GXV18 <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         AV27W_B712_SD01_SITE_LIST_Item = (SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV149GXV18));
         if ( AV27W_B712_SD01_SITE_LIST_Item.getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
         {
            AV66W_TBM22_SITE_ID = AV27W_B712_SD01_SITE_LIST_Item.getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66W_TBM22_SITE_ID", AV66W_TBM22_SITE_ID);
            /* Using cursor H001K12 */
            pr_default.execute(10, new Object[] {new Long(AV20P_STUDY_ID), AV66W_TBM22_SITE_ID});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A441TBT01_DEL_FLG = H001K12_A441TBT01_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A441TBT01_DEL_FLG", A441TBT01_DEL_FLG);
               n441TBT01_DEL_FLG = H001K12_n441TBT01_DEL_FLG[0] ;
               A698TBT01_SITE_ID = H001K12_A698TBT01_SITE_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
               n698TBT01_SITE_ID = H001K12_n698TBT01_SITE_ID[0] ;
               A87TBT01_STUDY_ID = H001K12_A87TBT01_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
               A88TBT01_SUBJECT_ID = H001K12_A88TBT01_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
               AV29W_B712_SD02_SUBJECT_LIST_Item = (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)new SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem(remoteHandle, context);
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( false );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id( A698TBT01_SITE_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id( A87TBT01_STUDY_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( A88TBT01_SUBJECT_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
               AV45W_IDX = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
               while ( AV45W_IDX <= AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
               {
                  if ( GXutil.strcmp((String)AV35W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV45W_IDX)), GXutil.str( AV29W_B712_SD02_SUBJECT_LIST_Item.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), 6, 0)) == 0 )
                  {
                     AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( true );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
                  }
                  AV45W_IDX = (long)(AV45W_IDX+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
               }
               AV28W_B712_SD02_SUBJECT_LIST.add(AV29W_B712_SD02_SUBJECT_LIST_Item, 0);
               gx_BV104 = true ;
               pr_default.readNext(10);
            }
            pr_default.close(10);
         }
         AV149GXV18 = (int)(AV149GXV18+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149GXV18", GXutil.ltrim( GXutil.str( AV149GXV18, 8, 0)));
      }
      AV28W_B712_SD02_SUBJECT_LIST.sort("TBT01_SUBJECT_ID");
      gx_BV104 = true ;
   }

   public void S269( )
   {
      /* 'SUB_TBM34_HANTEI' Routine */
      AV69W_TBM34_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69W_TBM34_FLG", AV69W_TBM34_FLG);
      /* Using cursor H001K13 */
      pr_default.execute(11, new Object[] {new Long(AV20P_STUDY_ID), new Short(AV67W_TBM31_CRF_ID), AV18P_AUTH_CD});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A572TBM34_DEL_FLG = H001K13_A572TBM34_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572TBM34_DEL_FLG", A572TBM34_DEL_FLG);
         n572TBM34_DEL_FLG = H001K13_n572TBM34_DEL_FLG[0] ;
         A571TBM34_DISPLAY_FLG = H001K13_A571TBM34_DISPLAY_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571TBM34_DISPLAY_FLG", A571TBM34_DISPLAY_FLG);
         n571TBM34_DISPLAY_FLG = H001K13_n571TBM34_DISPLAY_FLG[0] ;
         A29TBM34_CRF_ID = H001K13_A29TBM34_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A29TBM34_CRF_ID, 4, 0)));
         A30TBM34_STYDY_AUTH_CD = H001K13_A30TBM34_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30TBM34_STYDY_AUTH_CD", A30TBM34_STYDY_AUTH_CD);
         A28TBM34_STUDY_ID = H001K13_A28TBM34_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)));
         AV69W_TBM34_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69W_TBM34_FLG", AV69W_TBM34_FLG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S212( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV152GXLvl921 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152GXLvl921", GXutil.str( AV152GXLvl921, 1, 0));
      /* Using cursor H001K14 */
      pr_default.execute(12, new Object[] {new Long(AV20P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV152GXLvl921 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152GXLvl921", GXutil.str( AV152GXLvl921, 1, 0));
      }
      while ( (pr_default.getStatus(12) != 101) )
      {
         A369TBM21_DEL_FLG = H001K14_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001K14_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H001K14_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A607TBM21_STATUS = H001K14_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H001K14_n607TBM21_STATUS[0] ;
         AV152GXLvl921 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152GXLvl921", GXutil.str( AV152GXLvl921, 1, 0));
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�����̏��", "�u�I���v", "����", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�����̏��", "�u���~�v", "����", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      if ( AV152GXLvl921 == 0 )
      {
         GXt_char1 = AV53W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�I�����ꂽ����", "���p�s��", "����", "", "", GXv_char2) ;
         b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
         httpContext.GX_msglist.addItem(AV53W_MSG);
         AV43W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
      }
      if ( AV43W_ERRFLG )
      {
         AV46W_INPCHK_FLG1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46W_INPCHK_FLG1", AV46W_INPCHK_FLG1);
         AV47W_INPCHK_FLG2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47W_INPCHK_FLG2", AV47W_INPCHK_FLG2);
         AV48W_INPCHK_FLG3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48W_INPCHK_FLG3", AV48W_INPCHK_FLG3);
         AV49W_INPCHK_FLG4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49W_INPCHK_FLG4", AV49W_INPCHK_FLG4);
         AV50W_INPCHK_FLG5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50W_INPCHK_FLG5", AV50W_INPCHK_FLG5);
         AV51W_INPCHK_FLG6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51W_INPCHK_FLG6", AV51W_INPCHK_FLG6);
      }
      if ( AV46W_INPCHK_FLG1 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV17H_SUBJECT_ID_SENTAKU = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
               AV38W_CNT = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( AV38W_CNT == 0 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "����", "", "", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
      }
      if ( AV47W_INPCHK_FLG2 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV38W_CNT = (long)(AV38W_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( AV38W_CNT > 1 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "����", "1�l", "", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
      }
      if ( AV48W_INPCHK_FLG3 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV26W_B712_SD01_SITE_LIST.size() )
         {
            if ( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
            {
               AV38W_CNT = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( AV38W_CNT == 0 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "�{��", "", "", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
      }
      if ( AV49W_INPCHK_FLG4 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
         {
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
            {
               AV17H_SUBJECT_ID_SENTAKU = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17H_SUBJECT_ID_SENTAKU", GXutil.ltrim( GXutil.str( AV17H_SUBJECT_ID_SENTAKU, 6, 0)));
               AV38W_CNT = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( ( AV38W_CNT == 0 ) && (GXutil.strcmp("", AV11D_SUBJECT_ID)==0) )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "����", "", "", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
         if ( ! (GXutil.strcmp("", AV11D_SUBJECT_ID)==0) )
         {
            AV63W_SUBJECT_ID_CNT = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV63W_SUBJECT_ID_CNT, 2, 0)));
            while ( AV40W_ERR_CD == 0 )
            {
               AV63W_SUBJECT_ID_CNT = (byte)(AV63W_SUBJECT_ID_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV63W_SUBJECT_ID_CNT, 2, 0)));
               GXv_char2[0] = AV64W_SUBJECT_ID_GET ;
               GXv_int3[0] = AV40W_ERR_CD ;
               new a822_pc01_str_token(remoteHandle, context).execute( AV11D_SUBJECT_ID, ",", AV63W_SUBJECT_ID_CNT, GXv_char2, GXv_int3) ;
               b712_wp01_search_crf_impl.this.AV64W_SUBJECT_ID_GET = GXv_char2[0] ;
               b712_wp01_search_crf_impl.this.AV40W_ERR_CD = GXv_int3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
               httpContext.ajax_rsp_assign_attri("", false, "AV63W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV63W_SUBJECT_ID_CNT, 2, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV64W_SUBJECT_ID_GET", AV64W_SUBJECT_ID_GET);
               httpContext.ajax_rsp_assign_attri("", false, "AV40W_ERR_CD", GXutil.str( AV40W_ERR_CD, 1, 0));
               if ( AV40W_ERR_CD != 9 )
               {
                  if ( GxRegex.IsMatch(AV64W_SUBJECT_ID_GET,"[^0-9]") )
                  {
                     GXt_char1 = AV53W_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc02_msg_get(remoteHandle, context).execute( "AE00019", "����ID", "", "", "", "", GXv_char2) ;
                     b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
                     AV53W_MSG = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
                     httpContext.GX_msglist.addItem(AV53W_MSG);
                     AV40W_ERR_CD = (byte)(9) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV40W_ERR_CD", GXutil.str( AV40W_ERR_CD, 1, 0));
                     AV43W_ERRFLG = true ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
                  }
               }
            }
         }
      }
      if ( AV50W_INPCHK_FLG5 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
         {
            if ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() )
            {
               AV38W_CNT = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
               if (true) break;
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( AV38W_CNT == 0 )
         {
            AV116W_CHK_CRF_EXIT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116W_CHK_CRF_EXIT", AV116W_CHK_CRF_EXIT);
            AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
            AV45W_IDX = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
            while ( AV45W_IDX <= AV28W_B712_SD02_SUBJECT_LIST.size() )
            {
               if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg() )
               {
                  AV115W_CHK_SUBJECT_ID = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV115W_CHK_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV115W_CHK_SUBJECT_ID, 6, 0)));
                  /* Execute user subroutine: S282 */
                  S282 ();
                  if (returnInSub) return;
                  if ( ! AV114W_CRF_SEL_FLG )
                  {
                  }
                  else
                  {
                     AV116W_CHK_CRF_EXIT = true ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV116W_CHK_CRF_EXIT", AV116W_CHK_CRF_EXIT);
                     if (true) break;
                  }
               }
               AV45W_IDX = (long)(AV45W_IDX+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
            }
            if ( ! AV116W_CHK_CRF_EXIT )
            {
               GXt_char1 = AV53W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF�iVISIT�ԍ��j��I�����邩�A���Ҏg�pCRF�Ŋ��Ҍʂ�CRF", "", "", "", "", GXv_char2) ;
               b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV53W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
               httpContext.GX_msglist.addItem(AV53W_MSG);
               AV43W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
            }
         }
      }
      if ( AV51W_INPCHK_FLG6 )
      {
         AV38W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
         AV45W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         while ( AV45W_IDX <= AV32W_B712_SD04_KANI_LIST.size() )
         {
            if ( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+(int)(AV45W_IDX))).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg() )
            {
               AV38W_CNT = (long)(AV38W_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT", GXutil.ltrim( GXutil.str( AV38W_CNT, 10, 0)));
            }
            AV45W_IDX = (long)(AV45W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
         }
         if ( AV38W_CNT > 1 )
         {
            GXt_char1 = AV53W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "�ȈՌ���", "1��", "", "", "", GXv_char2) ;
            b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV53W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53W_MSG", AV53W_MSG);
            httpContext.GX_msglist.addItem(AV53W_MSG);
            AV43W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43W_ERRFLG", AV43W_ERRFLG);
         }
      }
   }

   public void S282( )
   {
      /* 'SUB_SUBJECT_CRF_CHK' Routine */
      AV114W_CRF_SEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114W_CRF_SEL_FLG", AV114W_CRF_SEL_FLG);
      AV153GXV19 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153GXV19", GXutil.ltrim( GXutil.str( AV153GXV19, 8, 0)));
      while ( AV153GXV19 <= AV92SD_B712_SD11_C.size() )
      {
         AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV153GXV19));
         if ( AV115W_CHK_SUBJECT_ID == AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() )
         {
            AV97W_SD_B712_SD03_C.fromJSonString(AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
            AV154GXV20 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154GXV20", GXutil.ltrim( GXutil.str( AV154GXV20, 8, 0)));
            while ( AV154GXV20 <= AV97W_SD_B712_SD03_C.size() )
            {
               AV98W_SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV97W_SD_B712_SD03_C.elementAt(-1+AV154GXV20));
               if ( ( AV98W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() ) && ! (0==AV98W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()) )
               {
                  AV114W_CRF_SEL_FLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV114W_CRF_SEL_FLG", AV114W_CRF_SEL_FLG);
                  if (true) break;
               }
               AV154GXV20 = (int)(AV154GXV20+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV154GXV20", GXutil.ltrim( GXutil.str( AV154GXV20, 8, 0)));
            }
            if (true) break;
         }
         AV153GXV19 = (int)(AV153GXV19+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV153GXV19", GXutil.ltrim( GXutil.str( AV153GXV19, 8, 0)));
      }
   }

   public void S172( )
   {
      /* 'SUB_OPEN_CRF' Routine */
      AV72SD_OPEN_CRF_C.fromxml(AV60W_SESSION.getValue("B719_OPEN_CRF_SDT"), "");
      AV60W_SESSION.remove("B719_OPEN_CRF_SDT");
      AV56W_OPEN_STUDY_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56W_OPEN_STUDY_ID", AV56W_OPEN_STUDY_ID);
      AV57W_OPEN_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57W_OPEN_SUBJECT_ID", AV57W_OPEN_SUBJECT_ID);
      AV77W_OPEN_CRF_ID_EDA_NO = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77W_OPEN_CRF_ID_EDA_NO", AV77W_OPEN_CRF_ID_EDA_NO);
      AV55W_OPEN_CRF_INPUT_LEVEL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55W_OPEN_CRF_INPUT_LEVEL", AV55W_OPEN_CRF_INPUT_LEVEL);
      AV58W_OPEN_UPD_CNT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58W_OPEN_UPD_CNT", AV58W_OPEN_UPD_CNT);
      AV155GXV21 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155GXV21", GXutil.ltrim( GXutil.str( AV155GXV21, 8, 0)));
      while ( AV155GXV21 <= AV72SD_OPEN_CRF_C.size() )
      {
         AV73SD_OPEN_CRF_I = (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)((SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)AV72SD_OPEN_CRF_C.elementAt(-1+AV155GXV21));
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_96 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_96"), ".", ",")) ;
         nGXsfl_96_fel_idx = (short)(0) ;
         while ( nGXsfl_96_fel_idx < nRC_GXsfl_96 )
         {
            nGXsfl_96_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_96_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_96_fel_idx+1)) ;
            sGXsfl_96_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_962( ) ;
            AV120GXV1 = (short)(nGXsfl_96_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV120GXV1 = (short)(nGXsfl_96_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV26W_B712_SD01_SITE_LIST.size() >= AV120GXV1 ) && ( AV120GXV1 > 0 ) )
            {
               AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg1.getInternalname())) );
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm( httpContext.cgiGet( edtavCtltam08_site_snm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0167") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0167", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0167") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0167", "");
            }
            AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
            if ( GXutil.strcmp(((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)(AV26W_B712_SD01_SITE_LIST.currentItem())).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id(), AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id()) == 0 )
            {
               ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)(AV26W_B712_SD01_SITE_LIST.currentItem())).setgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_96_fel_idx == 0 )
         {
            nGXsfl_96_idx = (short)(1) ;
            sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_962( ) ;
         }
         nGXsfl_96_fel_idx = (short)(1) ;
         /* Start For Each Line in Grid2 */
         nRC_GXsfl_104 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_104"), ".", ",")) ;
         nGXsfl_104_fel_idx = (short)(0) ;
         while ( nGXsfl_104_fel_idx < nRC_GXsfl_104 )
         {
            nGXsfl_104_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_104_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_104_fel_idx+1)) ;
            sGXsfl_104_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_10419( ) ;
            AV123GXV4 = nGXsfl_104_fel_idx ;
            AV123GXV4 = nGXsfl_104_fel_idx ;
            if ( ( AV28W_B712_SD02_SUBJECT_LIST.size() >= AV123GXV4 ) && ( AV123GXV4 > 0 ) )
            {
               AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
               ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg2.getInternalname())) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",") > 999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT01_SUBJECT_ID");
                  GX_FocusControl = edtavCtltbt01_subject_id_Internalname ;
                  wbErr = true ;
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( 0 );
               }
               else
               {
                  ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt01_subject_id_Internalname), ".", ",")) );
               }
            }
            AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
            if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)(AV28W_B712_SD02_SUBJECT_LIST.currentItem())).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id() )
            {
               ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)(AV28W_B712_SD02_SUBJECT_LIST.currentItem())).setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_104_fel_idx == 0 )
         {
            nGXsfl_104_idx = (short)(1) ;
            sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_10419( ) ;
         }
         nGXsfl_104_fel_idx = (short)(1) ;
         /* Start For Each Line in Grid3 */
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         nGXsfl_115_fel_idx = (short)(0) ;
         while ( nGXsfl_115_fel_idx < nRC_GXsfl_115 )
         {
            nGXsfl_115_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_fel_idx+1)) ;
            sGXsfl_115_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_11520( ) ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            if ( ( AV30W_B712_SD03_CRF_LIST.size() >= AV126GXV7 ) && ( AV126GXV7 > 0 ) )
            {
               AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                  GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                  wbErr = true ;
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
               }
               else
               {
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               }
               AV87D_SUBJECT_CRF_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_crf_chk.getInternalname())) ;
            }
            AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
            if ( ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id() ) && ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no() == AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no() ) )
            {
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( true );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_115_fel_idx == 0 )
         {
            nGXsfl_115_idx = (short)(1) ;
            sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_11520( ) ;
         }
         nGXsfl_115_fel_idx = (short)(1) ;
         if ( (GXutil.strcmp("", AV56W_OPEN_STUDY_ID)==0) )
         {
            AV56W_OPEN_STUDY_ID = "&STUDY_ID=" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56W_OPEN_STUDY_ID", AV56W_OPEN_STUDY_ID);
         }
         else
         {
            AV56W_OPEN_STUDY_ID = AV56W_OPEN_STUDY_ID + "," ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56W_OPEN_STUDY_ID", AV56W_OPEN_STUDY_ID);
         }
         AV56W_OPEN_STUDY_ID = AV56W_OPEN_STUDY_ID + GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56W_OPEN_STUDY_ID", AV56W_OPEN_STUDY_ID);
         if ( (GXutil.strcmp("", AV57W_OPEN_SUBJECT_ID)==0) )
         {
            AV57W_OPEN_SUBJECT_ID = "&SUBJECT_ID=" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57W_OPEN_SUBJECT_ID", AV57W_OPEN_SUBJECT_ID);
         }
         else
         {
            AV57W_OPEN_SUBJECT_ID = AV57W_OPEN_SUBJECT_ID + "," ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57W_OPEN_SUBJECT_ID", AV57W_OPEN_SUBJECT_ID);
         }
         AV57W_OPEN_SUBJECT_ID = AV57W_OPEN_SUBJECT_ID + GXutil.trim( GXutil.str( AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(), 6, 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57W_OPEN_SUBJECT_ID", AV57W_OPEN_SUBJECT_ID);
         if ( (GXutil.strcmp("", AV77W_OPEN_CRF_ID_EDA_NO)==0) )
         {
            AV77W_OPEN_CRF_ID_EDA_NO = "&CRFID=" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77W_OPEN_CRF_ID_EDA_NO", AV77W_OPEN_CRF_ID_EDA_NO);
         }
         else
         {
            AV77W_OPEN_CRF_ID_EDA_NO = AV77W_OPEN_CRF_ID_EDA_NO + "," ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77W_OPEN_CRF_ID_EDA_NO", AV77W_OPEN_CRF_ID_EDA_NO);
         }
         AV77W_OPEN_CRF_ID_EDA_NO = AV77W_OPEN_CRF_ID_EDA_NO + GXutil.trim( GXutil.str( AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id(), 4, 0)) + "_" + GXutil.trim( GXutil.str( AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no(), 2, 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77W_OPEN_CRF_ID_EDA_NO", AV77W_OPEN_CRF_ID_EDA_NO);
         /* Using cursor H001K15 */
         pr_default.execute(13, new Object[] {new Long(AV20P_STUDY_ID), new Integer(AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id()), new Short(AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id()), new Byte(AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no())});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A935TBT02_CRF_EDA_NO = H001K15_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            A91TBT02_CRF_ID = H001K15_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A90TBT02_SUBJECT_ID = H001K15_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            A89TBT02_STUDY_ID = H001K15_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A498TBT02_CRF_LATEST_VERSION = H001K15_A498TBT02_CRF_LATEST_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
            n498TBT02_CRF_LATEST_VERSION = H001K15_n498TBT02_CRF_LATEST_VERSION[0] ;
            A456TBT02_UPD_CNT = H001K15_A456TBT02_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
            n456TBT02_UPD_CNT = H001K15_n456TBT02_UPD_CNT[0] ;
            A698TBT01_SITE_ID = H001K15_A698TBT01_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
            n698TBT01_SITE_ID = H001K15_n698TBT01_SITE_ID[0] ;
            A698TBT01_SITE_ID = H001K15_A698TBT01_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
            n698TBT01_SITE_ID = H001K15_n698TBT01_SITE_ID[0] ;
            if ( (GXutil.strcmp("", AV55W_OPEN_CRF_INPUT_LEVEL)==0) )
            {
               AV55W_OPEN_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55W_OPEN_CRF_INPUT_LEVEL", AV55W_OPEN_CRF_INPUT_LEVEL);
            }
            else
            {
               AV55W_OPEN_CRF_INPUT_LEVEL = AV55W_OPEN_CRF_INPUT_LEVEL + "," ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55W_OPEN_CRF_INPUT_LEVEL", AV55W_OPEN_CRF_INPUT_LEVEL);
            }
            AV55W_OPEN_CRF_INPUT_LEVEL = AV55W_OPEN_CRF_INPUT_LEVEL + GXutil.trim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_OPEN_CRF_INPUT_LEVEL", AV55W_OPEN_CRF_INPUT_LEVEL);
            if ( (GXutil.strcmp("", AV58W_OPEN_UPD_CNT)==0) )
            {
               AV58W_OPEN_UPD_CNT = "&CRF_UPD_CNT=" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58W_OPEN_UPD_CNT", AV58W_OPEN_UPD_CNT);
            }
            else
            {
               AV58W_OPEN_UPD_CNT = AV58W_OPEN_UPD_CNT + "," ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58W_OPEN_UPD_CNT", AV58W_OPEN_UPD_CNT);
            }
            AV58W_OPEN_UPD_CNT = AV58W_OPEN_UPD_CNT + GXutil.trim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58W_OPEN_UPD_CNT", AV58W_OPEN_UPD_CNT);
            AV73SD_OPEN_CRF_I.setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( A698TBT01_SITE_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
         new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV20P_STUDY_ID, AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(), AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id(), AV73SD_OPEN_CRF_I.getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV73SD_OPEN_CRF_I", AV73SD_OPEN_CRF_I);
         AV155GXV21 = (int)(AV155GXV21+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155GXV21", GXutil.ltrim( GXutil.str( AV155GXV21, 8, 0)));
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      AV60W_SESSION.setValue("B712_WP02_STUDY_ID", GXutil.trim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
      AV60W_SESSION.setValue("B712_WP02_AUTH_CD", AV18P_AUTH_CD);
      GXt_char1 = AV61W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      AV61W_SESSION_KEY = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61W_SESSION_KEY", AV61W_SESSION_KEY);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( GXutil.today( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( GXutil.now( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV21SD_B792_SD00_HTML5_EXEC_INFO.setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( AV18P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21SD_B792_SD00_HTML5_EXEC_INFO", AV21SD_B792_SD00_HTML5_EXEC_INFO);
      AV60W_SESSION.setValue(AV61W_SESSION_KEY, AV21SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, true, "B792_SD00_HTML5_EXEC_INFO", "tablet-EDC_GXXEV3U3"));
      AV60W_SESSION.setValue("B712_WP01_SEARCH_CRF_D_OL_DISP", "4");
      GXt_char1 = AV61W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      b712_wp01_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_A_LOGIN_SDT", AV22W_A_LOGIN_SDT);
      AV61W_SESSION_KEY = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61W_SESSION_KEY", AV61W_SESSION_KEY);
      AV60W_SESSION.remove(AV61W_SESSION_KEY);
      AV71W_URL = AV44W_HTTPREQUEST.getBaseURL() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = GXutil.strReplace( AV71W_URL, "servlet/", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + "static/b701_wp01_crf_inp.jsp?" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + AV56W_OPEN_STUDY_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + AV57W_OPEN_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + AV77W_OPEN_CRF_ID_EDA_NO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + AV55W_OPEN_CRF_INPUT_LEVEL ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      AV71W_URL = AV71W_URL + AV58W_OPEN_UPD_CNT ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71W_URL", AV71W_URL);
      httpContext.wjLoc = formatLink(AV71W_URL)  ;
      httpContext.wjLocDisableFrm = (byte)(0) ;
   }

   public void S182( )
   {
      /* 'SUB_MEMO_POPUP' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b719_wp01_memo_info"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.popup(formatLink("b719_wp01_memo_info") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV13H_AUTO_SENI_FLG"});
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV22W_A_LOGIN_SDT;
      GXv_char2[0] = AV42W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b712_wp01_search_crf_impl.this.AV42W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42W_ERRCD", AV42W_ERRCD);
      if ( GXutil.strcmp(AV42W_ERRCD, "0") != 0 )
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

   public void S292( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV137Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_wp01_search_crf");
   }

   public void e211K2( )
   {
      /* D_group_Click Routine */
      AV9D_GRD3_ALL_SEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD3_ALL_SEL_FLG", AV9D_GRD3_ALL_SEL_FLG);
      AV45W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      while ( AV45W_IDX <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+(int)(AV45W_IDX))).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV9D_GRD3_ALL_SEL_FLG );
         AV45W_IDX = (long)(AV45W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_IDX", GXutil.ltrim( GXutil.str( AV45W_IDX, 10, 0)));
      }
      AV92SD_B712_SD11_C.clear();
      AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV92SD_B712_SD11_C.toJSonString(false));
      httpContext.ajax_rsp_assign_attri("", false, "AV105W_SESSION_KEY_SUBJECT_CRF", AV105W_SESSION_KEY_SUBJECT_CRF);
      AV86H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
   }

   public void S152( )
   {
      /* 'SUB_CRF_GRID3_FILTER' Routine */
      AV89SD_C712_SD10_C.clear();
      /* Using cursor H001K16 */
      pr_default.execute(14, new Object[] {new Long(AV20P_STUDY_ID), new Short(AV84D_GROUP)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A982TBM45_DEL_FLG = H001K16_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = H001K16_n982TBM45_DEL_FLG[0] ;
         A978TBM45_FILTER_NO = H001K16_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         A977TBM45_STUDY_ID = H001K16_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A981TBM45_IN_CRF_ID = H001K16_A981TBM45_IN_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
         n981TBM45_IN_CRF_ID = H001K16_n981TBM45_IN_CRF_ID[0] ;
         AV89SD_C712_SD10_C.fromJSonString(A981TBM45_IN_CRF_ID);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
      AV111SD_CRF_LIST_SV2.clear();
      AV111SD_CRF_LIST_SV2.fromJSonString(AV30W_B712_SD03_CRF_LIST.toJSonString(false));
      AV30W_B712_SD03_CRF_LIST.clear();
      gx_BV115 = true ;
      AV85SD_CRF_LIST_SV.fromJSonString(AV60W_SESSION.getValue(AV104W_SESSION_KEY_CRF_BASE));
      if ( AV85SD_CRF_LIST_SV.size() > 0 )
      {
         AV163GXV22 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV163GXV22", GXutil.ltrim( GXutil.str( AV163GXV22, 8, 0)));
         while ( AV163GXV22 <= AV85SD_CRF_LIST_SV.size() )
         {
            AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV85SD_CRF_LIST_SV.elementAt(-1+AV163GXV22));
            AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( false );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
            AV164GXV23 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV164GXV23", GXutil.ltrim( GXutil.str( AV164GXV23, 8, 0)));
            while ( AV164GXV23 <= AV111SD_CRF_LIST_SV2.size() )
            {
               AV112SD_CRF_LIST_SV2_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV111SD_CRF_LIST_SV2.elementAt(-1+AV164GXV23));
               if ( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV112SD_CRF_LIST_SV2_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() )
               {
                  AV31W_B712_SD03_CRF_LIST_Item.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV112SD_CRF_LIST_SV2_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31W_B712_SD03_CRF_LIST_Item", AV31W_B712_SD03_CRF_LIST_Item);
                  if (true) break;
               }
               AV164GXV23 = (int)(AV164GXV23+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV164GXV23", GXutil.ltrim( GXutil.str( AV164GXV23, 8, 0)));
            }
            if ( AV84D_GROUP == 0 )
            {
               AV30W_B712_SD03_CRF_LIST.add(AV31W_B712_SD03_CRF_LIST_Item, 0);
               gx_BV115 = true ;
            }
            else
            {
               AV165GXV24 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV165GXV24", GXutil.ltrim( GXutil.str( AV165GXV24, 8, 0)));
               while ( AV165GXV24 <= AV89SD_C712_SD10_C.size() )
               {
                  AV90SD_C712_SD10_I = (SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV89SD_C712_SD10_C.elementAt(-1+AV165GXV24));
                  if ( AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV90SD_C712_SD10_I.getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid() )
                  {
                     AV30W_B712_SD03_CRF_LIST.add(AV31W_B712_SD03_CRF_LIST_Item, 0);
                     gx_BV115 = true ;
                     if (true) break;
                  }
                  AV165GXV24 = (int)(AV165GXV24+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV165GXV24", GXutil.ltrim( GXutil.str( AV165GXV24, 8, 0)));
               }
            }
            AV163GXV22 = (int)(AV163GXV22+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV163GXV22", GXutil.ltrim( GXutil.str( AV163GXV22, 8, 0)));
         }
      }
      AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
      AV166GXV25 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV166GXV25", GXutil.ltrim( GXutil.str( AV166GXV25, 8, 0)));
      while ( AV166GXV25 <= AV92SD_B712_SD11_C.size() )
      {
         AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV166GXV25));
         AV97W_SD_B712_SD03_C.fromJSonString(AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
         AV167GXV26 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV167GXV26", GXutil.ltrim( GXutil.str( AV167GXV26, 8, 0)));
         while ( AV167GXV26 <= AV97W_SD_B712_SD03_C.size() )
         {
            AV98W_SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV97W_SD_B712_SD03_C.elementAt(-1+AV167GXV26));
            AV113W_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113W_CRF_FLG", AV113W_CRF_FLG);
            AV168GXV27 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV168GXV27", GXutil.ltrim( GXutil.str( AV168GXV27, 8, 0)));
            while ( AV168GXV27 <= AV30W_B712_SD03_CRF_LIST.size() )
            {
               AV31W_B712_SD03_CRF_LIST_Item = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV168GXV27));
               if ( AV98W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV31W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() )
               {
                  AV113W_CRF_FLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV113W_CRF_FLG", AV113W_CRF_FLG);
                  if (true) break;
               }
               AV168GXV27 = (int)(AV168GXV27+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV168GXV27", GXutil.ltrim( GXutil.str( AV168GXV27, 8, 0)));
            }
            if ( ! AV113W_CRF_FLG )
            {
               AV98W_SD_B712_SD03_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( false );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV98W_SD_B712_SD03_I", AV98W_SD_B712_SD03_I);
            }
            AV167GXV26 = (int)(AV167GXV26+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167GXV26", GXutil.ltrim( GXutil.str( AV167GXV26, 8, 0)));
         }
         AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
         AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( AV97W_SD_B712_SD03_C.toJSonString(false) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
         AV166GXV25 = (int)(AV166GXV25+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV166GXV25", GXutil.ltrim( GXutil.str( AV166GXV25, 8, 0)));
      }
      AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV92SD_B712_SD11_C.toJSonString(false));
   }

   public void e261K2( )
   {
      /* Ctlsel_flg1_Click Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV86H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
      if ( ! ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)(AV26W_B712_SD01_SITE_LIST.currentItem())).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg() )
      {
         AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
         AV102SD_B712_SD11_C2.clear();
         AV169GXV28 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV169GXV28", GXutil.ltrim( GXutil.str( AV169GXV28, 8, 0)));
         while ( AV169GXV28 <= AV92SD_B712_SD11_C.size() )
         {
            AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV169GXV28));
            AV170GXV29 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV170GXV29", GXutil.ltrim( GXutil.str( AV170GXV29, 8, 0)));
            while ( AV170GXV29 <= AV28W_B712_SD02_SUBJECT_LIST.size() )
            {
               AV29W_B712_SD02_SUBJECT_LIST_Item = (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV170GXV29));
               if ( AV29W_B712_SD02_SUBJECT_LIST_Item.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() )
               {
                  AV102SD_B712_SD11_C2.add(AV93SD_B712_SD11_I, 0);
                  if (true) break;
               }
               AV170GXV29 = (int)(AV170GXV29+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV170GXV29", GXutil.ltrim( GXutil.str( AV170GXV29, 8, 0)));
            }
            AV169GXV28 = (int)(AV169GXV28+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV169GXV28", GXutil.ltrim( GXutil.str( AV169GXV28, 8, 0)));
         }
         AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV102SD_B712_SD11_C2.toJSonString(false));
         httpContext.ajax_rsp_assign_attri("", false, "AV105W_SESSION_KEY_SUBJECT_CRF", AV105W_SESSION_KEY_SUBJECT_CRF);
      }
   }

   public void e221K2( )
   {
      /* 'BTN_SUBJECT_ID_SEL' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV107W_SUBJECT_ID_C.clear();
      AV109W_SUBJECT_LEN = (short)(GXutil.len( AV11D_SUBJECT_ID)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109W_SUBJECT_LEN", GXutil.ltrim( GXutil.str( AV109W_SUBJECT_LEN, 4, 0)));
      AV106W_SUBJECT_EDIT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106W_SUBJECT_EDIT", AV106W_SUBJECT_EDIT);
      AV103W_IX1 = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103W_IX1", GXutil.ltrim( GXutil.str( AV103W_IX1, 4, 0)));
      while ( AV103W_IX1 <= AV109W_SUBJECT_LEN )
      {
         AV110W_SUBJECT_VC = GXutil.substring( AV11D_SUBJECT_ID, AV103W_IX1, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110W_SUBJECT_VC", AV110W_SUBJECT_VC);
         if ( GXutil.strcmp(AV110W_SUBJECT_VC, ",") == 0 )
         {
            AV108W_SUBJECT_ID_I = (int)(GXutil.lval( GXutil.trim( AV106W_SUBJECT_EDIT))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV108W_SUBJECT_ID_I, 6, 0)));
            if ( AV108W_SUBJECT_ID_I != 0 )
            {
               AV107W_SUBJECT_ID_C.add((int)(AV108W_SUBJECT_ID_I), 0);
            }
            AV106W_SUBJECT_EDIT = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106W_SUBJECT_EDIT", AV106W_SUBJECT_EDIT);
         }
         else
         {
            AV106W_SUBJECT_EDIT = AV106W_SUBJECT_EDIT + AV110W_SUBJECT_VC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106W_SUBJECT_EDIT", AV106W_SUBJECT_EDIT);
         }
         AV103W_IX1 = (short)(AV103W_IX1+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103W_IX1", GXutil.ltrim( GXutil.str( AV103W_IX1, 4, 0)));
      }
      if ( ! (GXutil.strcmp("", AV106W_SUBJECT_EDIT)==0) )
      {
         AV108W_SUBJECT_ID_I = (int)(GXutil.lval( GXutil.trim( AV106W_SUBJECT_EDIT))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV108W_SUBJECT_ID_I, 6, 0)));
         if ( AV108W_SUBJECT_ID_I != 0 )
         {
            AV107W_SUBJECT_ID_C.add((int)(AV108W_SUBJECT_ID_I), 0);
         }
      }
      AV171GXV30 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171GXV30", GXutil.ltrim( GXutil.str( AV171GXV30, 8, 0)));
      while ( AV171GXV30 <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         AV29W_B712_SD02_SUBJECT_LIST_Item = (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV171GXV30));
         AV172GXV31 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV172GXV31", GXutil.ltrim( GXutil.str( AV172GXV31, 8, 0)));
         while ( AV172GXV31 <= AV107W_SUBJECT_ID_C.size() )
         {
            AV108W_SUBJECT_ID_I = ((Number) AV107W_SUBJECT_ID_C.elementAt(-1+AV172GXV31)).intValue() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV108W_SUBJECT_ID_I, 6, 0)));
            if ( AV29W_B712_SD02_SUBJECT_LIST_Item.getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == AV108W_SUBJECT_ID_I )
            {
               AV29W_B712_SD02_SUBJECT_LIST_Item.setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29W_B712_SD02_SUBJECT_LIST_Item", AV29W_B712_SD02_SUBJECT_LIST_Item);
               if (true) break;
            }
            AV172GXV31 = (int)(AV172GXV31+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172GXV31", GXutil.ltrim( GXutil.str( AV172GXV31, 8, 0)));
         }
         AV171GXV30 = (int)(AV171GXV30+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV171GXV30", GXutil.ltrim( GXutil.str( AV171GXV30, 8, 0)));
      }
   }

   public void e291K2( )
   {
      /* 'CRF_OPEN_CLOSE' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV86H_SUBJECT_ID = ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)(AV28W_B712_SD02_SUBJECT_LIST.currentItem())).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
      AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
      AV94W_SD11_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94W_SD11_FLG", AV94W_SD11_FLG);
      AV173GXV32 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV173GXV32", GXutil.ltrim( GXutil.str( AV173GXV32, 8, 0)));
      while ( AV173GXV32 <= AV92SD_B712_SD11_C.size() )
      {
         AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV173GXV32));
         if ( AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() == AV86H_SUBJECT_ID )
         {
            AV94W_SD11_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94W_SD11_FLG", AV94W_SD11_FLG);
            if (true) break;
         }
         AV173GXV32 = (int)(AV173GXV32+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173GXV32", GXutil.ltrim( GXutil.str( AV173GXV32, 8, 0)));
      }
      if ( ! AV94W_SD11_FLG )
      {
         AV111SD_CRF_LIST_SV2.clear();
         /* Using cursor H001K17 */
         pr_default.execute(15, new Object[] {new Long(AV20P_STUDY_ID), new Integer(AV86H_SUBJECT_ID)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A449TBT02_DEL_FLG = H001K17_A449TBT02_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
            n449TBT02_DEL_FLG = H001K17_n449TBT02_DEL_FLG[0] ;
            A90TBT02_SUBJECT_ID = H001K17_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            A89TBT02_STUDY_ID = H001K17_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A91TBT02_CRF_ID = H001K17_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A935TBT02_CRF_EDA_NO = H001K17_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            AV112SD_CRF_LIST_SV2_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
            AV112SD_CRF_LIST_SV2_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( A91TBT02_CRF_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV112SD_CRF_LIST_SV2_I", AV112SD_CRF_LIST_SV2_I);
            AV112SD_CRF_LIST_SV2_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no( A935TBT02_CRF_EDA_NO );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV112SD_CRF_LIST_SV2_I", AV112SD_CRF_LIST_SV2_I);
            /* Start For Each Line in Grid3 */
            nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
            nGXsfl_115_fel_idx = (short)(0) ;
            while ( nGXsfl_115_fel_idx < nRC_GXsfl_115 )
            {
               nGXsfl_115_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_fel_idx+1)) ;
               sGXsfl_115_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_fel_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_fel_11520( ) ;
               AV126GXV7 = nGXsfl_115_fel_idx ;
               AV126GXV7 = nGXsfl_115_fel_idx ;
               if ( ( AV30W_B712_SD03_CRF_LIST.size() >= AV126GXV7 ) && ( AV126GXV7 > 0 ) )
               {
                  AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
                  if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                     GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                     wbErr = true ;
                     ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
                  }
                  else
                  {
                     ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
                  }
                  AV87D_SUBJECT_CRF_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_crf_chk.getInternalname())) ;
               }
               AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
               if ( ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == A91TBT02_CRF_ID ) && ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no() == A935TBT02_CRF_EDA_NO ) )
               {
                  AV112SD_CRF_LIST_SV2_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV112SD_CRF_LIST_SV2_I", AV112SD_CRF_LIST_SV2_I);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* End For Each Line */
            }
            if ( nGXsfl_115_fel_idx == 0 )
            {
               nGXsfl_115_idx = (short)(1) ;
               sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
               subsflControlProps_11520( ) ;
            }
            nGXsfl_115_fel_idx = (short)(1) ;
            AV111SD_CRF_LIST_SV2.add(AV112SD_CRF_LIST_SV2_I, 0);
            pr_default.readNext(15);
         }
         pr_default.close(15);
         AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)new SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem(remoteHandle, context);
         AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id( AV86H_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
         AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( AV111SD_CRF_LIST_SV2.toJSonString(false) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
         AV92SD_B712_SD11_C.add(AV93SD_B712_SD11_I, 0);
      }
      AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV92SD_B712_SD11_C.toJSonString(false));
      httpContext.ajax_rsp_assign_attri("", false, "AV105W_SESSION_KEY_SUBJECT_CRF", AV105W_SESSION_KEY_SUBJECT_CRF);
   }

   public void e301K2( )
   {
      /* 'CRF_OPEN_CLOSE_RESET' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      AV86H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV86H_SUBJECT_ID, 6, 0)));
   }

   public void S192( )
   {
      /* 'SUB_SUBJECT_CRF_SAVE' Routine */
      if ( ! (0==AV86H_SUBJECT_ID) )
      {
         AV92SD_B712_SD11_C.fromJSonString(AV60W_SESSION.getValue(AV105W_SESSION_KEY_SUBJECT_CRF));
         AV97W_SD_B712_SD03_C.clear();
         /* Start For Each Line in Grid3 */
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         nGXsfl_115_fel_idx = (short)(0) ;
         while ( nGXsfl_115_fel_idx < nRC_GXsfl_115 )
         {
            nGXsfl_115_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_fel_idx+1)) ;
            sGXsfl_115_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_11520( ) ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            AV126GXV7 = nGXsfl_115_fel_idx ;
            if ( ( AV30W_B712_SD03_CRF_LIST.size() >= AV126GXV7 ) && ( AV126GXV7 > 0 ) )
            {
               AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
               ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
                  GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
                  wbErr = true ;
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(0) );
               }
               else
               {
                  ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               }
               AV87D_SUBJECT_CRF_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_crf_chk.getInternalname())) ;
            }
            AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
            AV98W_SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
            AV98W_SD_B712_SD03_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV98W_SD_B712_SD03_I", AV98W_SD_B712_SD03_I);
            AV98W_SD_B712_SD03_I.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV87D_SUBJECT_CRF_CHK );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV98W_SD_B712_SD03_I", AV98W_SD_B712_SD03_I);
            AV97W_SD_B712_SD03_C.add(AV98W_SD_B712_SD03_I, 0);
            /* End For Each Line */
         }
         if ( nGXsfl_115_fel_idx == 0 )
         {
            nGXsfl_115_idx = (short)(1) ;
            sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_11520( ) ;
         }
         nGXsfl_115_fel_idx = (short)(1) ;
         AV94W_SD11_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94W_SD11_FLG", AV94W_SD11_FLG);
         AV177GXV33 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV177GXV33", GXutil.ltrim( GXutil.str( AV177GXV33, 8, 0)));
         while ( AV177GXV33 <= AV92SD_B712_SD11_C.size() )
         {
            AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV177GXV33));
            if ( AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() == AV86H_SUBJECT_ID )
            {
               AV94W_SD11_FLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV94W_SD11_FLG", AV94W_SD11_FLG);
               AV99W_SD_B712_SD03_C2.fromJSonString(AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
               AV178GXV34 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV178GXV34", GXutil.ltrim( GXutil.str( AV178GXV34, 8, 0)));
               while ( AV178GXV34 <= AV99W_SD_B712_SD03_C2.size() )
               {
                  AV100W_SD_B712_SD03_I2 = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV99W_SD_B712_SD03_C2.elementAt(-1+AV178GXV34));
                  AV101W_SD11_CRF_FLG = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV101W_SD11_CRF_FLG", AV101W_SD11_CRF_FLG);
                  AV179GXV35 = 1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV179GXV35", GXutil.ltrim( GXutil.str( AV179GXV35, 8, 0)));
                  while ( AV179GXV35 <= AV97W_SD_B712_SD03_C.size() )
                  {
                     AV98W_SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV97W_SD_B712_SD03_C.elementAt(-1+AV179GXV35));
                     if ( AV100W_SD_B712_SD03_I2.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV98W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() )
                     {
                        AV101W_SD11_CRF_FLG = true ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV101W_SD11_CRF_FLG", AV101W_SD11_CRF_FLG);
                        AV100W_SD_B712_SD03_I2.setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( AV98W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV100W_SD_B712_SD03_I2", AV100W_SD_B712_SD03_I2);
                        if (true) break;
                     }
                     AV179GXV35 = (int)(AV179GXV35+1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV179GXV35", GXutil.ltrim( GXutil.str( AV179GXV35, 8, 0)));
                  }
                  if ( ! AV101W_SD11_CRF_FLG )
                  {
                     AV99W_SD_B712_SD03_C2.add(AV98W_SD_B712_SD03_I, 0);
                  }
                  AV178GXV34 = (int)(AV178GXV34+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV178GXV34", GXutil.ltrim( GXutil.str( AV178GXV34, 8, 0)));
               }
               AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( "" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
               AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( AV99W_SD_B712_SD03_C2.toJSonString(false) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
               if (true) break;
            }
            AV177GXV33 = (int)(AV177GXV33+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV177GXV33", GXutil.ltrim( GXutil.str( AV177GXV33, 8, 0)));
         }
         if ( ! AV94W_SD11_FLG )
         {
            AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)new SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem(remoteHandle, context);
            AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id( AV86H_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
            AV93SD_B712_SD11_I.setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( AV97W_SD_B712_SD03_C.toJSonString(false) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
            AV92SD_B712_SD11_C.add(AV93SD_B712_SD11_I, 0);
         }
         AV60W_SESSION.setValue(AV105W_SESSION_KEY_SUBJECT_CRF, AV92SD_B712_SD11_C.toJSonString(false));
      }
   }

   public void S132( )
   {
      /* 'SUB_AUTH_CHECK' Routine */
      AV117H_DMFLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117H_DMFLG", AV117H_DMFLG);
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), AV22W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn()) == 0 )
      {
         AV117H_DMFLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117H_DMFLG", AV117H_DMFLG);
      }
   }

   private void e271K2( )
   {
      /* Grid1_Load Routine */
      AV120GXV1 = (short)(1) ;
      while ( AV120GXV1 <= AV26W_B712_SD01_SITE_LIST.size() )
      {
         AV26W_B712_SD01_SITE_LIST.currentItem( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_B712_SD01_SITE_LIST", AV26W_B712_SD01_SITE_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(96) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 0 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_962( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV120GXV1 = (short)(AV120GXV1+1) ;
      }
   }

   private void e311K19( )
   {
      /* Grid2_Load Routine */
      AV123GXV4 = (short)(1) ;
      while ( AV123GXV4 <= AV28W_B712_SD02_SUBJECT_LIST.size() )
      {
         AV28W_B712_SD02_SUBJECT_LIST.currentItem( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B712_SD02_SUBJECT_LIST", AV28W_B712_SD02_SUBJECT_LIST);
         if ( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)(AV28W_B712_SD02_SUBJECT_LIST.currentItem())).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id() == AV86H_SUBJECT_ID )
         {
            imgCrf_open_Visible = 0 ;
            imgCrf_close_Visible = 1 ;
         }
         else
         {
            imgCrf_open_Visible = 1 ;
            imgCrf_close_Visible = 0 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(104) ;
         }
         sendrow_10419( ) ;
         AV123GXV4 = (short)(AV123GXV4+1) ;
      }
   }

   private void e281K20( )
   {
      /* Grid3_Load Routine */
      AV126GXV7 = (short)(1) ;
      while ( AV126GXV7 <= AV30W_B712_SD03_CRF_LIST.size() )
      {
         AV30W_B712_SD03_CRF_LIST.currentItem( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30W_B712_SD03_CRF_LIST", AV30W_B712_SD03_CRF_LIST);
         chkavD_subject_crf_chk.setVisible( 0 );
         if ( ! (0==AV86H_SUBJECT_ID) )
         {
            AV180GXV36 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV180GXV36", GXutil.ltrim( GXutil.str( AV180GXV36, 8, 0)));
            while ( AV180GXV36 <= AV92SD_B712_SD11_C.size() )
            {
               AV93SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV92SD_B712_SD11_C.elementAt(-1+AV180GXV36));
               if ( AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() == AV86H_SUBJECT_ID )
               {
                  AV95SD_B712_SD03_C.clear();
                  AV95SD_B712_SD03_C.fromJSonString(AV93SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SD_B712_SD11_I", AV93SD_B712_SD11_I);
                  AV181GXV37 = 1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV181GXV37", GXutil.ltrim( GXutil.str( AV181GXV37, 8, 0)));
                  while ( AV181GXV37 <= AV95SD_B712_SD03_C.size() )
                  {
                     AV96SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV95SD_B712_SD03_C.elementAt(-1+AV181GXV37));
                     if ( ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() == AV96SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id() ) && ( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(AV30W_B712_SD03_CRF_LIST.currentItem())).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no() == AV96SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no() ) )
                     {
                        chkavD_subject_crf_chk.setVisible( 1 );
                        AV87D_SUBJECT_CRF_CHK = AV96SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() ;
                        if (true) break;
                     }
                     AV181GXV37 = (int)(AV181GXV37+1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV181GXV37", GXutil.ltrim( GXutil.str( AV181GXV37, 8, 0)));
                  }
               }
               AV180GXV36 = (int)(AV180GXV36+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV180GXV36", GXutil.ltrim( GXutil.str( AV180GXV36, 8, 0)));
            }
         }
         else
         {
            chkavD_subject_crf_chk.setVisible( 0 );
            AV87D_SUBJECT_CRF_CHK = false ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(115) ;
         }
         sendrow_11520( ) ;
         AV126GXV7 = (short)(AV126GXV7+1) ;
      }
   }

   private void e231K21( )
   {
      /* Grid4_Load Routine */
      AV130GXV11 = (short)(1) ;
      while ( AV130GXV11 <= AV32W_B712_SD04_KANI_LIST.size() )
      {
         AV32W_B712_SD04_KANI_LIST.currentItem( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32W_B712_SD04_KANI_LIST", AV32W_B712_SD04_KANI_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(154) ;
         }
         if ( ( subGrid4_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage ) && ( GRID4_nCurrentRecord < GRID4_nFirstRecordOnPage + subgrid4_recordsperpage( ) ) ) )
         {
            sendrow_15421( ) ;
            GRID4_nEOF = (byte)(0) ;
            if ( GRID4_nCurrentRecord + 1 >= subgrid4_recordcount( ) )
            {
               GRID4_nEOF = (byte)(1) ;
            }
         }
         GRID4_nCurrentRecord = (long)(GRID4_nCurrentRecord+1) ;
         AV130GXV11 = (short)(AV130GXV11+1) ;
      }
   }

   public void wb_table2_169_1K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_delete_subject_exec_Internalname, "TXT_BTN_DELETE_SUBJECT_EXEC", "", "", lblTxt_btn_delete_subject_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DELETE_SUBJECT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV16H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV16H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavP_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV20P_STUDY_ID, (byte)(10), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV20P_STUDY_ID), "ZZZZZZZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavP_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, 0, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavP_auth_cd_Internalname, GXutil.rtrim( AV18P_AUTH_CD), GXutil.rtrim( localUtil.format( AV18P_AUTH_CD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavP_auth_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 0, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavP_move_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV19P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV19P_MOVE_KBN), "9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavP_move_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_other_site_view_flg_Internalname, GXutil.rtrim( AV59W_OTHER_SITE_VIEW_FLG), GXutil.rtrim( localUtil.format( AV59W_OTHER_SITE_VIEW_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_other_site_view_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_tbm01_sys_value_Internalname, GXutil.rtrim( AV65W_TBM01_SYS_VALUE), GXutil.rtrim( localUtil.format( AV65W_TBM01_SYS_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_tbm01_sys_value_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_dm_kbn_Internalname, GXutil.rtrim( AV39W_DM_KBN), GXutil.rtrim( localUtil.format( AV39W_DM_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_dm_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_err_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_POPUP_ERR_CD, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_POPUP_ERR_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_popup_err_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_auto_seni_flg_Internalname, GXutil.rtrim( AV13H_AUTO_SENI_FLG), GXutil.rtrim( localUtil.format( AV13H_AUTO_SENI_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_auto_seni_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_sentaku_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_SUBJECT_ID_SENTAKU, (byte)(6), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_SUBJECT_ID_SENTAKU), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_subject_id_sentaku_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV78H_POPUP_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78H_POPUP_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_popup_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dmflg_Internalname, GXutil.rtrim( AV117H_DMFLG), GXutil.rtrim( localUtil.format( AV117H_DMFLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dmflg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_169_1K2e( true) ;
      }
      else
      {
         wb_table2_169_1K2e( false) ;
      }
   }

   public void wb_table1_2_1K2( boolean wbgen )
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
         httpContext.writeText( "<td align=\"center\"  style=\"height:100%\">") ;
         wb_table3_6_1K2( true) ;
      }
      else
      {
         wb_table3_6_1K2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1K2e( boolean wbgen )
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
         wb_table1_2_1K2e( true) ;
      }
      else
      {
         wb_table1_2_1K2e( false) ;
      }
   }

   public void wb_table3_6_1K2( boolean wbgen )
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
         wb_table4_12_1K2( true) ;
      }
      else
      {
         wb_table4_12_1K2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_33_1K2( true) ;
      }
      else
      {
         wb_table5_33_1K2( false) ;
      }
      return  ;
   }

   public void wb_table5_33_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0167"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0167"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0167"+"");
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
         wb_table3_6_1K2e( true) ;
      }
      else
      {
         wb_table3_6_1K2e( false) ;
      }
   }

   public void wb_table5_33_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_36_1K2( true) ;
      }
      else
      {
         wb_table6_36_1K2( false) ;
      }
      return  ;
   }

   public void wb_table6_36_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_33_1K2e( true) ;
      }
      else
      {
         wb_table5_33_1K2e( false) ;
      }
   }

   public void wb_table6_36_1K2( boolean wbgen )
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
         wb_table7_42_1K2( true) ;
      }
      else
      {
         wb_table7_42_1K2( false) ;
      }
      return  ;
   }

   public void wb_table7_42_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:715px\">") ;
         wb_table8_52_1K2( true) ;
      }
      else
      {
         wb_table8_52_1K2( false) ;
      }
      return  ;
   }

   public void wb_table8_52_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table9_125_1K2( true) ;
      }
      else
      {
         wb_table9_125_1K2( false) ;
      }
      return  ;
   }

   public void wb_table9_125_1K2e( boolean wbgen )
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
         wb_table6_36_1K2e( true) ;
      }
      else
      {
         wb_table6_36_1K2e( false) ;
      }
   }

   public void wb_table9_125_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable14_Internalname, tblTable14_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_128_1K2( true) ;
      }
      else
      {
         wb_table10_128_1K2( false) ;
      }
      return  ;
   }

   public void wb_table10_128_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:15px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_150_1K2( true) ;
      }
      else
      {
         wb_table11_150_1K2( false) ;
      }
      return  ;
   }

   public void wb_table11_150_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid4Container.SetIsFreestyle(true);
         Grid4Container.SetWrapped(nGXWrapped);
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid4Container"+"DivS\" gxgridid=\"154\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 200, 10, 0)) + "px" + ";" ;
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
            Grid4Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 200, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid4Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid4_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid4_Width, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("CmpContext", "");
            Grid4Container.AddObjectProperty("InMasterPage", "false");
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltas01_item_ryak_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid4Container.AddColumnProperties(Grid4Column);
            Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 154 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_154 = (short)(nGXsfl_154_idx-1) ;
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid4Container.AddObjectProperty("GRID4_nEOF", GRID4_nEOF);
            Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
            AV130GXV11 = nGXsfl_154_idx ;
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid4", Grid4Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData", Grid4Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
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
         wb_table9_125_1K2e( true) ;
      }
      else
      {
         wb_table9_125_1K2e( false) ;
      }
   }

   public void wb_table11_150_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 200, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header4_Internalname, tblTbl_grid_header4_Internalname, "", "TableForm_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "�ȈՌ���", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FFFFFF;", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_150_1K2e( true) ;
      }
      else
      {
         wb_table11_150_1K2e( false) ;
      }
   }

   public void wb_table10_128_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 200, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable15_Internalname, tblTable15_Internalname, "", "TableForm_s", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "����ID�I��", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FFFFFF;", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_134_1K2( true) ;
      }
      else
      {
         wb_table12_134_1K2( false) ;
      }
      return  ;
   }

   public void wb_table12_134_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_128_1K2e( true) ;
      }
      else
      {
         wb_table10_128_1K2e( false) ;
      }
   }

   public void wb_table12_134_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         wb_table13_137_1K2( true) ;
      }
      else
      {
         wb_table13_137_1K2( false) ;
      }
      return  ;
   }

   public void wb_table13_137_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:220px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "���J���}��؂�ŕ����w��\", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_134_1K2e( true) ;
      }
      else
      {
         wb_table12_134_1K2e( false) ;
      }
   }

   public void wb_table13_137_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.rtrim( AV11D_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV11D_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_subject_id_Jsonclick, 0, "AttributeImeOff_s", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:45px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_filter_Internalname, "���s", "", "", lblBtn_filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SUBJECT_ID_SEL\\'."+"'", "", "TextBlockBtn040s", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_137_1K2e( true) ;
      }
      else
      {
         wb_table13_137_1K2e( false) ;
      }
   }

   public void wb_table8_52_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 700, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "TableForm_s", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:200px\">") ;
         wb_table14_55_1K2( true) ;
      }
      else
      {
         wb_table14_55_1K2( false) ;
      }
      return  ;
   }

   public void wb_table14_55_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:120px\">") ;
         wb_table15_62_1K2( true) ;
      }
      else
      {
         wb_table15_62_1K2( false) ;
      }
      return  ;
   }

   public void wb_table15_62_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:270px\">") ;
         wb_table16_69_1K2( true) ;
      }
      else
      {
         wb_table16_69_1K2( false) ;
      }
      return  ;
   }

   public void wb_table16_69_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         wb_table17_81_1K2( true) ;
      }
      else
      {
         wb_table17_81_1K2( false) ;
      }
      return  ;
   }

   public void wb_table17_81_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:460px;width:200px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection3_Internalname, 1, 100, "%", 444, "px", "SectionScroll_NoLineY", "");
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"96\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 183, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 183, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltam08_site_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 96 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_96 = (short)(nGXsfl_96_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            AV120GXV1 = nGXsfl_96_idx ;
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection2_Internalname, 1, 100, "%", 444, "px", "SectionScroll_NoLineY", "");
         /*  Grid Control  */
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"104\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleGridTMs", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTMs"));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 100, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid2Container.AddObjectProperty("Class", "FreeStyleGridTMs");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcoloreven", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcoloreven, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid2_Width, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt01_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", httpContext.convertURL( context.getHttpContext().getImagePath( "4470d1a5-9b4f-4695-9c0b-75f564bc21b3", "", context.getHttpContext().getTheme( ))));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", httpContext.convertURL( context.getHttpContext().getImagePath( "7e4fe736-219e-4822-a29b-5b3344711318", "", context.getHttpContext().getTheme( ))));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 104 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_104 = (short)(nGXsfl_104_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV123GXV4 = nGXsfl_104_idx ;
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"vertical-align:top\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 100, "%", 444, "px", "SectionScroll_NoLineY", "");
         /*  Grid Control  */
         Grid3Container.SetIsFreestyle(true);
         Grid3Container.SetWrapped(nGXWrapped);
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" gxgridid=\"115\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 320, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid3Container.AddObjectProperty("GridName", "Grid3");
         }
         else
         {
            Grid3Container.AddObjectProperty("GridName", "Grid3");
            Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 320, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid3Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid3_Width, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("CmpContext", "");
            Grid3Container.AddObjectProperty("InMasterPage", "false");
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Value", GXutil.booltostr( AV87D_SUBJECT_CRF_CHK));
            Grid3Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavD_subject_crf_chk.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 115 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_115 = (short)(nGXsfl_115_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV126GXV7 = nGXsfl_115_idx ;
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
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
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_52_1K2e( true) ;
      }
      else
      {
         wb_table8_52_1K2e( false) ;
      }
   }

   public void wb_table17_81_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xF0F8FF)) + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 70, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         wb_table18_84_1K2( true) ;
      }
      else
      {
         wb_table18_84_1K2( false) ;
      }
      return  ;
   }

   public void wb_table18_84_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "�g�pCRF", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_81_1K2e( true) ;
      }
      else
      {
         wb_table17_81_1K2e( false) ;
      }
   }

   public void wb_table18_84_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable17_Internalname, tblTable17_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "���ҁF", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV86H_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtavH_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86H_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV86H_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_subject_id_Jsonclick, 0, "Attribute_s", "", "", "", 1, edtavH_subject_id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_84_1K2e( true) ;
      }
      else
      {
         wb_table18_84_1K2e( false) ;
      }
   }

   public void wb_table16_69_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable13_Internalname, tblTable13_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:26px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd3_all_sel_flg.getInternalname(), GXutil.booltostr( AV9D_GRD3_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(72, this, 'true', 'false');gx.ajax.executeCliEvent('e141k2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(72);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "CRF �iVISIT�ԍ��j", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:20px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "a91e53c7-c730-4fc5-8f10-727f2fba0aea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_group, cmbavD_group.getInternalname(), GXutil.trim( GXutil.str( AV84D_GROUP, 4, 0)), 1, cmbavD_group.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_GROUP.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 110, "px", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "", true, "HLP_B712_WP01_SEARCH_CRF.htm");
         cmbavD_group.setValue( GXutil.trim( GXutil.str( AV84D_GROUP, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_group.getInternalname(), "Values", cmbavD_group.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_69_1K2e( true) ;
      }
      else
      {
         wb_table16_69_1K2e( false) ;
      }
   }

   public void wb_table15_62_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable12_Internalname, tblTable12_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:26px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd2_all_sel_flg.getInternalname(), GXutil.booltostr( AV8D_GRD2_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(65, this, 'true', 'false');gx.ajax.executeCliEvent('e131k2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(65);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "����No", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_62_1K2e( true) ;
      }
      else
      {
         wb_table15_62_1K2e( false) ;
      }
   }

   public void wb_table14_55_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:26px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd1_all_sel_flg.getInternalname(), GXutil.booltostr( AV7D_GRD1_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(58, this, 'true', 'false');gx.ajax.executeCliEvent('e121k2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(58);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "�{��", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_55_1K2e( true) ;
      }
      else
      {
         wb_table14_55_1K2e( false) ;
      }
   }

   public void wb_table7_42_1K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_kensaku_Internalname, "����", "", "", lblBtn_kensaku_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:180px\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_96_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_sort, cmbavD_sort.getInternalname(), GXutil.rtrim( AV10D_SORT), 1, cmbavD_sort.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(47);\"", "", true, "HLP_B712_WP01_SEARCH_CRF.htm");
         cmbavD_sort.setValue( GXutil.rtrim( AV10D_SORT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_sort.getInternalname(), "Values", cmbavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_42_1K2e( true) ;
      }
      else
      {
         wb_table7_42_1K2e( false) ;
      }
   }

   public void wb_table4_12_1K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table19_15_1K2( true) ;
      }
      else
      {
         wb_table19_15_1K2( false) ;
      }
      return  ;
   }

   public void wb_table19_15_1K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_memo_Internalname, "�������", "", "", lblBtn_memo_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_MEMO\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1K2e( true) ;
      }
      else
      {
         wb_table4_12_1K2e( false) ;
      }
   }

   public void wb_table19_15_1K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_new_subject_Internalname, "���ҐV�K", "", "", lblBtn_new_subject_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_NEW_SUBJECT\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_delete_subject_Internalname, "���ҍ폜", "", "", lblBtn_delete_subject_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DELETE_SUBJECT\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_chg_subject_site_Internalname, "���Ҏ{�ݕύX", "", "", lblBtn_chg_subject_site_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CHG_SUBJECT_SITE\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_filter_Internalname, "CRF�t�B���^�ҏW", "", "", lblBtn_crf_filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_FILTER\\'."+"'", "", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_B712_WP01_SEARCH_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_15_1K2e( true) ;
      }
      else
      {
         wb_table19_15_1K2e( false) ;
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
      httpContext.setDefaultTheme("Style2");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1K2( ) ;
      ws1K2( ) ;
      we1K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151327430");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b712_wp01_search_crf.js", "?20207151327431");
      /* End function include_jscripts */
   }

   public void subsflControlProps_962( )
   {
      chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_96_idx );
      edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_96_idx ;
   }

   public void subsflControlProps_fel_962( )
   {
      chkavCtlsel_flg1.setInternalname( "CTLSEL_FLG1_"+sGXsfl_96_fel_idx );
      edtavCtltam08_site_snm_Internalname = "CTLTAM08_SITE_SNM_"+sGXsfl_96_fel_idx ;
   }

   public void sendrow_962( )
   {
      subsflControlProps_962( ) ;
      wb1K0( ) ;
      if ( ( 0 * 1 == 0 ) || ( nGXsfl_96_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_96_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_96_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_96_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_96_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_96_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:26px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_96_idx+"',96)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlsel_flg1.getInternalname(),GXutil.booltostr( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(99, this, 'true', 'false');gx.ajax.executeCliEvent('e261k2_client',this);gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg1.getEnabled()!=0)&&(chkavCtlsel_flg1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(99);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltam08_site_snm_Internalname,GXutil.rtrim( ((SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem)AV26W_B712_SD01_SITE_LIST.elementAt(-1+AV120GXV1)).getgxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltam08_site_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavCtltam08_site_snm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_96_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_96_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_96_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_96_idx+1)) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_962( ) ;
      }
      /* End function sendrow_962 */
   }

   public void subsflControlProps_10419( )
   {
      chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_104_idx );
      edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_104_idx ;
      imgCrf_open_Internalname = "CRF_OPEN_"+sGXsfl_104_idx ;
      imgCrf_close_Internalname = "CRF_CLOSE_"+sGXsfl_104_idx ;
   }

   public void subsflControlProps_fel_10419( )
   {
      chkavCtlsel_flg2.setInternalname( "CTLSEL_FLG2_"+sGXsfl_104_fel_idx );
      edtavCtltbt01_subject_id_Internalname = "CTLTBT01_SUBJECT_ID_"+sGXsfl_104_fel_idx ;
      imgCrf_open_Internalname = "CRF_OPEN_"+sGXsfl_104_fel_idx ;
      imgCrf_close_Internalname = "CRF_CLOSE_"+sGXsfl_104_fel_idx ;
   }

   public void sendrow_10419( )
   {
      subsflControlProps_10419( ) ;
      wb1K0( ) ;
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
         if ( ((int)(((nGXsfl_104_idx-1)/ (double) (1)) % (2))) == 0 )
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
         if ( ( 1 == 0 ) && ( nGXsfl_104_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_104_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_104_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_104_idx+"\">") ;
            }
         }
      }
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:26px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlsel_flg2.getInternalname(),GXutil.booltostr( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(107, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg2.getEnabled()!=0)&&(chkavCtlsel_flg2.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(107);\"" : " ")});
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("cell");
      }
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ROClassString = "Attribute_s" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt01_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(), (byte)(6), (byte)(0), ".", "")),((edtavCtltbt01_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id()), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)AV28W_B712_SD02_SUBJECT_LIST.elementAt(-1+AV123GXV4)).getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id()), "ZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt01_subject_id_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt01_subject_id_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("cell");
      }
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:20px\""});
      /* Active images/pictures */
      TempTags = " " + ((imgCrf_open_Enabled!=0)&&(imgCrf_open_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" : " ") ;
      ClassString = "Image" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgCrf_open_Internalname,context.getHttpContext().getImagePath( "4470d1a5-9b4f-4695-9c0b-75f564bc21b3", "", context.getHttpContext().getTheme( )),"","","",context.getHttpContext().getTheme( ),new Integer(imgCrf_open_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(15),"px",new Integer(15),"px",new Integer(0),new Integer(0),new Integer(5),imgCrf_open_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'CRF_OPEN_CLOSE\\'."+"'",StyleString,ClassString,"","","",""+TempTags,"","",new Integer(1),new Boolean(false),new Boolean(false)});
      /* Active images/pictures */
      TempTags = " " + ((imgCrf_close_Enabled!=0)&&(imgCrf_close_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" : " ") ;
      ClassString = "Image" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgCrf_close_Internalname,context.getHttpContext().getImagePath( "7e4fe736-219e-4822-a29b-5b3344711318", "", context.getHttpContext().getTheme( )),"","","",context.getHttpContext().getTheme( ),new Integer(imgCrf_close_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(15),"px",new Integer(15),"px",new Integer(0),new Integer(0),new Integer(5),imgCrf_close_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'CRF_OPEN_CLOSE_RESET\\'."+"'",StyleString,ClassString,"","","",""+TempTags,"","",new Integer(1),new Boolean(false),new Boolean(false)});
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
            if ( ((int)((nGXsfl_104_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_104_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_104_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_104_idx+1)) ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_10419( ) ;
      /* End function sendrow_10419 */
   }

   public void subsflControlProps_11520( )
   {
      chkavCtlsel_flg.setInternalname( "CTLSEL_FLG_"+sGXsfl_115_idx );
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_115_idx ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_115_idx ;
      chkavD_subject_crf_chk.setInternalname( "vD_SUBJECT_CRF_CHK_"+sGXsfl_115_idx );
   }

   public void subsflControlProps_fel_11520( )
   {
      chkavCtlsel_flg.setInternalname( "CTLSEL_FLG_"+sGXsfl_115_fel_idx );
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_115_fel_idx ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_115_fel_idx ;
      chkavD_subject_crf_chk.setInternalname( "vD_SUBJECT_CRF_CHK_"+sGXsfl_115_fel_idx );
   }

   public void sendrow_11520( )
   {
      subsflControlProps_11520( ) ;
      wb1K0( ) ;
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
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_115_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xF5F5F5) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_115_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_115_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_115_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_115_idx+"\">") ;
            }
         }
      }
      Grid3Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid3_Linesclass,""});
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:26px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'',false,'"+sGXsfl_115_idx+"',115)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid3Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlsel_flg.getInternalname(),GXutil.booltostr( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(118, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(118);\"" : " ")});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:240px\""});
      /* Single line edit */
      ROClassString = "Attribute_s" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_snm_Internalname,GXutil.rtrim( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_snm_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(115),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Single line edit */
      ROClassString = "Attribute_s" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbm31_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV30W_B712_SD03_CRF_LIST.elementAt(-1+AV126GXV7)).getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_id_Jsonclick,new Integer(0),"Attribute_s","color:#FF0000;",ROClassString,"",new Integer(edtavCtltbm31_crf_id_Visible),new Integer(edtavCtltbm31_crf_id_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(115),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
      /* Check box */
      TempTags = " " + ((chkavD_subject_crf_chk.getEnabled()!=0)&&(chkavD_subject_crf_chk.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'',false,'"+sGXsfl_115_idx+"',115)\"" : " ") ;
      ClassString = "ReadonlyAttribute_s" ;
      StyleString = "" ;
      Grid3Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_subject_crf_chk.getInternalname(),GXutil.booltostr( AV87D_SUBJECT_CRF_CHK),"",new Integer(chkavD_subject_crf_chk.getVisible()),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_subject_crf_chk.getEnabled()!=0)&&(chkavD_subject_crf_chk.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(123, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_subject_crf_chk.getEnabled()!=0)&&(chkavD_subject_crf_chk.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(123);\"" : " ")});
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
            if ( ((int)((nGXsfl_115_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid3Container.AddRow(Grid3Row);
      nGXsfl_115_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_115_idx+1)) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11520( ) ;
      /* End function sendrow_11520 */
   }

   public void subsflControlProps_15421( )
   {
      chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_154_idx );
      edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_154_idx ;
   }

   public void subsflControlProps_fel_15421( )
   {
      chkavCtlsel_flg4.setInternalname( "CTLSEL_FLG4_"+sGXsfl_154_fel_idx );
      edtavCtltas01_item_ryak_Internalname = "CTLTAS01_ITEM_RYAK_"+sGXsfl_154_fel_idx ;
   }

   public void sendrow_15421( )
   {
      subsflControlProps_15421( ) ;
      wb1K0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_154_idx <= subgrid4_recordsperpage( ) * 1 ) )
      {
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
         }
         else if ( subGrid4_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid4_Backstyle = (byte)(1) ;
            if ( ((int)(((nGXsfl_154_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid4_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Odd" ;
               }
            }
            else
            {
               subGrid4_Backcolor = (int)(0xF5F5F5) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_154_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_154_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_154_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_154_idx+"\">") ;
               }
            }
         }
         Grid4Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid4_Linesclass,""});
         Grid4Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid4Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable16_Internalname+"_"+sGXsfl_154_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid4Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid4Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:26px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 160,'',false,'"+sGXsfl_154_idx+"',154)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid4Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlsel_flg4.getInternalname(),GXutil.booltostr( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(160, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg4.getEnabled()!=0)&&(chkavCtlsel_flg4.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(160);\"" : " ")});
         if ( Grid4Container.GetWrapped() == 1 )
         {
            Grid4Container.CloseTag("cell");
         }
         Grid4Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltas01_item_ryak_Internalname,GXutil.rtrim( ((SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)AV32W_B712_SD04_KANI_LIST.elementAt(-1+AV130GXV11)).getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltas01_item_ryak_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavCtltas01_item_ryak_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(154),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid4Container.GetWrapped() == 1 )
         {
            Grid4Container.CloseTag("cell");
         }
         if ( Grid4Container.GetWrapped() == 1 )
         {
            Grid4Container.CloseTag("row");
         }
         if ( Grid4Container.GetWrapped() == 1 )
         {
            Grid4Container.CloseTag("table");
         }
         /* End of table */
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
               if ( ((int)((nGXsfl_154_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid4Container.AddRow(Grid4Row);
         nGXsfl_154_idx = (short)(((subGrid4_Islastpage==1)&&(nGXsfl_154_idx+1>subgrid4_recordsperpage( )) ? 1 : nGXsfl_154_idx+1)) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_15421( ) ;
      }
      /* End function sendrow_15421 */
   }

   public void init_default_properties( )
   {
      lblBtn_new_subject_Internalname = "BTN_NEW_SUBJECT" ;
      lblBtn_delete_subject_Internalname = "BTN_DELETE_SUBJECT" ;
      lblBtn_chg_subject_site_Internalname = "BTN_CHG_SUBJECT_SITE" ;
      lblBtn_crf_filter_Internalname = "BTN_CRF_FILTER" ;
      tblTbl_btn_subject_Internalname = "TBL_BTN_SUBJECT" ;
      lblBtn_memo_Internalname = "BTN_MEMO" ;
      tblTable10_Internalname = "TABLE10" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblBtn_kensaku_Internalname = "BTN_KENSAKU" ;
      cmbavD_sort.setInternalname( "vD_SORT" );
      tblTable6_Internalname = "TABLE6" ;
      chkavD_grd1_all_sel_flg.setInternalname( "vD_GRD1_ALL_SEL_FLG" );
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      tblTable8_Internalname = "TABLE8" ;
      chkavD_grd2_all_sel_flg.setInternalname( "vD_GRD2_ALL_SEL_FLG" );
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTable12_Internalname = "TABLE12" ;
      chkavD_grd3_all_sel_flg.setInternalname( "vD_GRD3_ALL_SEL_FLG" );
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      imgImage1_Internalname = "IMAGE1" ;
      cmbavD_group.setInternalname( "vD_GROUP" );
      tblTable13_Internalname = "TABLE13" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtavH_subject_id_Internalname = "vH_SUBJECT_ID" ;
      tblTable17_Internalname = "TABLE17" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      tblTable9_Internalname = "TABLE9" ;
      divSection3_Internalname = "SECTION3" ;
      divSection2_Internalname = "SECTION2" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      lblBtn_filter_Internalname = "BTN_FILTER" ;
      tblTable11_Internalname = "TABLE11" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable15_Internalname = "TABLE15" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTbl_grid_header4_Internalname = "TBL_GRID_HEADER4" ;
      tblTable16_Internalname = "TABLE16" ;
      tblTable14_Internalname = "TABLE14" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_delete_subject_exec_Internalname = "TXT_BTN_DELETE_SUBJECT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavP_study_id_Internalname = "vP_STUDY_ID" ;
      edtavP_auth_cd_Internalname = "vP_AUTH_CD" ;
      edtavP_move_kbn_Internalname = "vP_MOVE_KBN" ;
      edtavW_other_site_view_flg_Internalname = "vW_OTHER_SITE_VIEW_FLG" ;
      edtavW_tbm01_sys_value_Internalname = "vW_TBM01_SYS_VALUE" ;
      edtavW_dm_kbn_Internalname = "vW_DM_KBN" ;
      edtavH_popup_err_cd_Internalname = "vH_POPUP_ERR_CD" ;
      edtavH_auto_seni_flg_Internalname = "vH_AUTO_SENI_FLG" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      edtavH_subject_id_sentaku_Internalname = "vH_SUBJECT_ID_SENTAKU" ;
      edtavH_popup_kbn_Internalname = "vH_POPUP_KBN" ;
      edtavH_dmflg_Internalname = "vH_DMFLG" ;
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
      chkavD_subject_crf_chk.setEnabled( 1 );
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      edtavCtltbm31_crf_snm_Jsonclick = "" ;
      chkavCtlsel_flg.setVisible( 1 );
      chkavCtlsel_flg.setEnabled( 1 );
      subGrid3_Class = "FreeStyleGridTM-1s" ;
      imgCrf_close_Visible = 1 ;
      imgCrf_open_Visible = 1 ;
      edtavCtltbt01_subject_id_Jsonclick = "" ;
      chkavCtlsel_flg2.setVisible( 1 );
      chkavCtlsel_flg2.setEnabled( 1 );
      subGrid2_Class = "FreeStyleGridTMs" ;
      edtavCtltam08_site_snm_Jsonclick = "" ;
      chkavCtlsel_flg1.setVisible( 1 );
      chkavCtlsel_flg1.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      cmbavD_sort.setJsonclick( "" );
      cmbavD_group.setJsonclick( "" );
      edtavH_subject_id_Jsonclick = "" ;
      edtavH_subject_id_Enabled = 1 ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      chkavD_subject_crf_chk.setVisible( 1 );
      edtavCtltbm31_crf_id_Visible = 1 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltam08_site_snm_Enabled = 0 ;
      edtavD_subject_id_Jsonclick = "" ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      edtavH_dmflg_Jsonclick = "" ;
      edtavH_popup_kbn_Jsonclick = "" ;
      edtavH_subject_id_sentaku_Jsonclick = "" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_auto_seni_flg_Jsonclick = "" ;
      edtavH_popup_err_cd_Jsonclick = "" ;
      edtavW_dm_kbn_Jsonclick = "" ;
      edtavW_tbm01_sys_value_Jsonclick = "" ;
      edtavW_other_site_view_flg_Jsonclick = "" ;
      edtavP_move_kbn_Jsonclick = "" ;
      edtavP_auth_cd_Jsonclick = "" ;
      edtavP_study_id_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_btn_subject_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid4_Width = 200 ;
      subGrid4_Borderwidth = (short)(0) ;
      subGrid4_Backcolorstyle = (byte)(3) ;
      subGrid3_Width = 320 ;
      subGrid3_Borderwidth = (short)(0) ;
      subGrid3_Backcolorstyle = (byte)(3) ;
      subGrid2_Width = 100 ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcoloreven = (int)(0xF5F5F5) ;
      subGrid2_Backcolorstyle = (byte)(3) ;
      subGrid1_Width = 183 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      chkavD_grd3_all_sel_flg.setCaption( "" );
      chkavD_grd2_all_sel_flg.setCaption( "" );
      chkavD_grd1_all_sel_flg.setCaption( "" );
      subGrid1_Rows = 0 ;
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
                  /* Execute user subroutine: S292 */
                  S292 ();
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
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV32W_B712_SD04_KANI_LIST = new GxObjectCollection(SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem.class, "B712_SD04_KANI_LIST.B712_SD04_KANI_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV12H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV26W_B712_SD01_SITE_LIST = new GxObjectCollection(SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem.class, "B712_SD01_SITE_LIST.B712_SD01_SITE_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV30W_B712_SD03_CRF_LIST = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV28W_B712_SD02_SUBJECT_LIST = new GxObjectCollection(SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem.class, "B712_SD02_SUBJECT_LIST.B712_SD02_SUBJECT_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV137Pgmname = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      AV105W_SESSION_KEY_SUBJECT_CRF = "" ;
      A982TBM45_DEL_FLG = "" ;
      A980TBM45_FILETR_NM = "" ;
      AV52W_MEMO_DISP_FLG = "" ;
      AV104W_SESSION_KEY_CRF_BASE = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      AV24W_A821_JS = "" ;
      A698TBT01_SITE_ID = "" ;
      AV21SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV34W_B712_SD05_SEL1 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV35W_B712_SD05_SEL2 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV36W_B712_SD05_SEL3 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV37W_B712_SD05_SEL4 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV92SD_B712_SD11_C = new GxObjectCollection(SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem.class, "B712_SD11_SUBJECT_CRF.B712_SD11_SUBJECT_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A50TBM07_AUTH_CD = "" ;
      A626TBM07_DEL_FLG = "" ;
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      A320TAM08_SITE_SNM = "" ;
      A397TBM31_DEL_FLG = "" ;
      A979TBM31_DM_EXCP_NO_DISP_FLG = "" ;
      A642TBM31_CRF_SNM = "" ;
      A643TBM31_STATUS = "" ;
      A7TAS01_DATA_KIND = "" ;
      A300TAS01_DEL_FLG = "" ;
      A8TAS01_ITEM_CD = "" ;
      A247TAS01_ITEM_RYAK = "" ;
      A441TBT01_DEL_FLG = "" ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A449TBT02_DEL_FLG = "" ;
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
      edtavCtltas01_item_ryak_Internalname = "" ;
      edtavCtltam08_site_snm_Internalname = "" ;
      edtavCtltbm31_crf_snm_Internalname = "" ;
      edtavCtltbm31_crf_id_Internalname = "" ;
      edtavCtltbt01_subject_id_Internalname = "" ;
      GXDecQS = "" ;
      AV10D_SORT = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      AV134Pgmdesc = "" ;
      AV11D_SUBJECT_ID = "" ;
      AV14H_INIT_FLG = "" ;
      AV16H_SRCH_FLG = "" ;
      AV59W_OTHER_SITE_VIEW_FLG = "" ;
      AV65W_TBM01_SYS_VALUE = "" ;
      AV39W_DM_KBN = "" ;
      AV13H_AUTO_SENI_FLG = "" ;
      AV117H_DMFLG = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      scmdbuf = "" ;
      H001K2_A63TBM21_STUDY_ID = new long[1] ;
      H001K2_A367TBM21_STUDY_NM = new String[] {""} ;
      H001K2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      AV62W_STUDY_NM = "" ;
      H001K3_A13TAM04_AUTH_CD = new String[] {""} ;
      H001K3_A285TAM04_AUTH_NM = new String[] {""} ;
      H001K3_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      AV25W_AUTH_NM = "" ;
      H001K4_A142TBT14_SUBJECT_ID = new int[1] ;
      H001K4_A198TBT14_MEMO_NO = new short[1] ;
      H001K4_A479TBT14_DEL_FLG = new String[] {""} ;
      H001K4_n479TBT14_DEL_FLG = new boolean[] {false} ;
      H001K4_A902TBT14_KANRYO_FLG = new String[] {""} ;
      H001K4_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001K4_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001K4_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001K4_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001K4_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      H001K4_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      H001K4_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      H001K4_A140TBT14_STUDY_ID = new long[1] ;
      AV60W_SESSION = httpContext.getWebSession();
      AV53W_MSG = "" ;
      H001K5_A982TBM45_DEL_FLG = new String[] {""} ;
      H001K5_n982TBM45_DEL_FLG = new boolean[] {false} ;
      H001K5_A977TBM45_STUDY_ID = new long[1] ;
      H001K5_A980TBM45_FILETR_NM = new String[] {""} ;
      H001K5_n980TBM45_FILETR_NM = new boolean[] {false} ;
      H001K5_A978TBM45_FILTER_NO = new short[1] ;
      AV41W_ERR_MSG = "" ;
      H001K6_A626TBM07_DEL_FLG = new String[] {""} ;
      H001K6_n626TBM07_DEL_FLG = new boolean[] {false} ;
      H001K6_A50TBM07_AUTH_CD = new String[] {""} ;
      H001K6_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      H001K6_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      H001K7_A377TBM22_DEL_FLG = new String[] {""} ;
      H001K7_n377TBM22_DEL_FLG = new boolean[] {false} ;
      H001K7_A18TBM22_SITE_ID = new String[] {""} ;
      H001K7_A17TBM22_STUDY_ID = new long[1] ;
      H001K7_A320TAM08_SITE_SNM = new String[] {""} ;
      H001K7_n320TAM08_SITE_SNM = new boolean[] {false} ;
      AV27W_B712_SD01_SITE_LIST_Item = new SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem(remoteHandle, context);
      AV88W_DM_KBN_CRF = "" ;
      H001K8_A69TBM31_CRF_ID = new short[1] ;
      H001K8_A68TBM31_STUDY_ID = new long[1] ;
      H001K8_A642TBM31_CRF_SNM = new String[] {""} ;
      H001K8_n642TBM31_CRF_SNM = new boolean[] {false} ;
      H001K8_A395TBM31_ORDER = new int[1] ;
      H001K8_n395TBM31_ORDER = new boolean[] {false} ;
      H001K8_A643TBM31_STATUS = new String[] {""} ;
      H001K8_n643TBM31_STATUS = new boolean[] {false} ;
      H001K8_A979TBM31_DM_EXCP_NO_DISP_FLG = new String[] {""} ;
      H001K8_n979TBM31_DM_EXCP_NO_DISP_FLG = new boolean[] {false} ;
      H001K8_A397TBM31_DEL_FLG = new String[] {""} ;
      H001K8_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001K8_A943TBM31_REPEAT_FLG = new byte[1] ;
      H001K8_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      H001K8_A528TBM31_DEF_VISIT_NO = new int[1] ;
      H001K8_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      AV31W_B712_SD03_CRF_LIST_Item = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      H001K9_A945TBM44_STUDY_ID = new long[1] ;
      H001K9_A946TBM44_CRF_ID = new short[1] ;
      H001K9_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001K9_A948TBM44_VISIT_NO = new int[1] ;
      H001K9_n948TBM44_VISIT_NO = new boolean[] {false} ;
      AV76W_SELECT_CD = "" ;
      H001K10_A300TAS01_DEL_FLG = new String[] {""} ;
      H001K10_n300TAS01_DEL_FLG = new boolean[] {false} ;
      H001K10_A7TAS01_DATA_KIND = new String[] {""} ;
      H001K10_A8TAS01_ITEM_CD = new String[] {""} ;
      H001K10_A247TAS01_ITEM_RYAK = new String[] {""} ;
      H001K10_n247TAS01_ITEM_RYAK = new boolean[] {false} ;
      H001K10_A335TAS01_SORT_NO = new short[1] ;
      H001K10_n335TAS01_SORT_NO = new boolean[] {false} ;
      AV33W_B712_SD04_KANI_LIST_Item = new SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem(remoteHandle, context);
      H001K11_A449TBT02_DEL_FLG = new String[] {""} ;
      H001K11_n449TBT02_DEL_FLG = new boolean[] {false} ;
      H001K11_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001K11_A91TBT02_CRF_ID = new short[1] ;
      H001K11_A89TBT02_STUDY_ID = new long[1] ;
      H001K11_A90TBT02_SUBJECT_ID = new int[1] ;
      AV29W_B712_SD02_SUBJECT_LIST_Item = new SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem(remoteHandle, context);
      AV66W_TBM22_SITE_ID = "" ;
      H001K12_A441TBT01_DEL_FLG = new String[] {""} ;
      H001K12_n441TBT01_DEL_FLG = new boolean[] {false} ;
      H001K12_A698TBT01_SITE_ID = new String[] {""} ;
      H001K12_n698TBT01_SITE_ID = new boolean[] {false} ;
      H001K12_A87TBT01_STUDY_ID = new long[1] ;
      H001K12_A88TBT01_SUBJECT_ID = new int[1] ;
      H001K13_A572TBM34_DEL_FLG = new String[] {""} ;
      H001K13_n572TBM34_DEL_FLG = new boolean[] {false} ;
      H001K13_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      H001K13_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      H001K13_A29TBM34_CRF_ID = new short[1] ;
      H001K13_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H001K13_A28TBM34_STUDY_ID = new long[1] ;
      A607TBM21_STATUS = "" ;
      H001K14_A369TBM21_DEL_FLG = new String[] {""} ;
      H001K14_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001K14_A63TBM21_STUDY_ID = new long[1] ;
      H001K14_A607TBM21_STATUS = new String[] {""} ;
      H001K14_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      AV64W_SUBJECT_ID_GET = "" ;
      GXv_int3 = new byte [1] ;
      AV93SD_B712_SD11_I = new SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem(remoteHandle, context);
      AV97W_SD_B712_SD03_C = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV98W_SD_B712_SD03_I = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      AV72SD_OPEN_CRF_C = new GxObjectCollection(SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem.class, "B719_SD02_OPEN_CRF.B719_SD02_OPEN_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV56W_OPEN_STUDY_ID = "" ;
      AV57W_OPEN_SUBJECT_ID = "" ;
      AV77W_OPEN_CRF_ID_EDA_NO = "" ;
      AV55W_OPEN_CRF_INPUT_LEVEL = "" ;
      AV58W_OPEN_UPD_CNT = "" ;
      AV73SD_OPEN_CRF_I = new SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem(remoteHandle, context);
      H001K15_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001K15_A91TBT02_CRF_ID = new short[1] ;
      H001K15_A90TBT02_SUBJECT_ID = new int[1] ;
      H001K15_A89TBT02_STUDY_ID = new long[1] ;
      H001K15_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001K15_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      H001K15_A456TBT02_UPD_CNT = new long[1] ;
      H001K15_n456TBT02_UPD_CNT = new boolean[] {false} ;
      H001K15_A698TBT01_SITE_ID = new String[] {""} ;
      H001K15_n698TBT01_SITE_ID = new boolean[] {false} ;
      AV61W_SESSION_KEY = "" ;
      GXt_char1 = "" ;
      AV71W_URL = "" ;
      AV44W_HTTPREQUEST = httpContext.getHttpRequest();
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV42W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV89SD_C712_SD10_C = new GxObjectCollection(SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem.class, "C712_SD10_IN_CRF_ID.C712_SD10_IN_CRF_IDItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      H001K16_A982TBM45_DEL_FLG = new String[] {""} ;
      H001K16_n982TBM45_DEL_FLG = new boolean[] {false} ;
      H001K16_A978TBM45_FILTER_NO = new short[1] ;
      H001K16_A977TBM45_STUDY_ID = new long[1] ;
      H001K16_A981TBM45_IN_CRF_ID = new String[] {""} ;
      H001K16_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      AV111SD_CRF_LIST_SV2 = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV85SD_CRF_LIST_SV = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV112SD_CRF_LIST_SV2_I = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      AV90SD_C712_SD10_I = new SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem(remoteHandle, context);
      AV102SD_B712_SD11_C2 = new GxObjectCollection(SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem.class, "B712_SD11_SUBJECT_CRF.B712_SD11_SUBJECT_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV107W_SUBJECT_ID_C = new GxObjectCollection(Integer.class, "internal", "");
      AV106W_SUBJECT_EDIT = "" ;
      AV110W_SUBJECT_VC = "" ;
      H001K17_A449TBT02_DEL_FLG = new String[] {""} ;
      H001K17_n449TBT02_DEL_FLG = new boolean[] {false} ;
      H001K17_A90TBT02_SUBJECT_ID = new int[1] ;
      H001K17_A89TBT02_STUDY_ID = new long[1] ;
      H001K17_A91TBT02_CRF_ID = new short[1] ;
      H001K17_A935TBT02_CRF_EDA_NO = new byte[1] ;
      AV99W_SD_B712_SD03_C2 = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV100W_SD_B712_SD03_I2 = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      AV95SD_B712_SD03_C = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV96SD_B712_SD03_I = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_delete_subject_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock33_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblBtn_filter_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblBtn_kensaku_Jsonclick = "" ;
      lblBtn_memo_Jsonclick = "" ;
      lblBtn_new_subject_Jsonclick = "" ;
      lblBtn_delete_subject_Jsonclick = "" ;
      lblBtn_chg_subject_site_Jsonclick = "" ;
      lblBtn_crf_filter_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      imgCrf_open_Internalname = "" ;
      imgCrf_close_Internalname = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      imgCrf_open_Jsonclick = "" ;
      imgCrf_close_Jsonclick = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp01_search_crf__default(),
         new Object[] {
             new Object[] {
            H001K2_A63TBM21_STUDY_ID, H001K2_A367TBM21_STUDY_NM, H001K2_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H001K3_A13TAM04_AUTH_CD, H001K3_A285TAM04_AUTH_NM, H001K3_n285TAM04_AUTH_NM
            }
            , new Object[] {
            H001K4_A142TBT14_SUBJECT_ID, H001K4_A198TBT14_MEMO_NO, H001K4_A479TBT14_DEL_FLG, H001K4_n479TBT14_DEL_FLG, H001K4_A902TBT14_KANRYO_FLG, H001K4_n902TBT14_KANRYO_FLG, H001K4_A927TBT14_KAKUNIN_FLG, H001K4_n927TBT14_KAKUNIN_FLG, H001K4_A930TBT14_REQUEST_AUTH_CD, H001K4_n930TBT14_REQUEST_AUTH_CD,
            H001K4_A929TBT14_REQUEST_SITE_ID, H001K4_n929TBT14_REQUEST_SITE_ID, H001K4_A140TBT14_STUDY_ID
            }
            , new Object[] {
            H001K5_A982TBM45_DEL_FLG, H001K5_n982TBM45_DEL_FLG, H001K5_A977TBM45_STUDY_ID, H001K5_A980TBM45_FILETR_NM, H001K5_n980TBM45_FILETR_NM, H001K5_A978TBM45_FILTER_NO
            }
            , new Object[] {
            H001K6_A626TBM07_DEL_FLG, H001K6_n626TBM07_DEL_FLG, H001K6_A50TBM07_AUTH_CD, H001K6_A625TBM07_OTHER_SITE_VIEW_FLG, H001K6_n625TBM07_OTHER_SITE_VIEW_FLG
            }
            , new Object[] {
            H001K7_A377TBM22_DEL_FLG, H001K7_n377TBM22_DEL_FLG, H001K7_A18TBM22_SITE_ID, H001K7_A17TBM22_STUDY_ID, H001K7_A320TAM08_SITE_SNM, H001K7_n320TAM08_SITE_SNM
            }
            , new Object[] {
            H001K8_A69TBM31_CRF_ID, H001K8_A68TBM31_STUDY_ID, H001K8_A642TBM31_CRF_SNM, H001K8_n642TBM31_CRF_SNM, H001K8_A395TBM31_ORDER, H001K8_n395TBM31_ORDER, H001K8_A643TBM31_STATUS, H001K8_n643TBM31_STATUS, H001K8_A979TBM31_DM_EXCP_NO_DISP_FLG, H001K8_n979TBM31_DM_EXCP_NO_DISP_FLG,
            H001K8_A397TBM31_DEL_FLG, H001K8_n397TBM31_DEL_FLG, H001K8_A943TBM31_REPEAT_FLG, H001K8_n943TBM31_REPEAT_FLG, H001K8_A528TBM31_DEF_VISIT_NO, H001K8_n528TBM31_DEF_VISIT_NO
            }
            , new Object[] {
            H001K9_A945TBM44_STUDY_ID, H001K9_A946TBM44_CRF_ID, H001K9_A947TBM44_CRF_EDA_NO, H001K9_A948TBM44_VISIT_NO, H001K9_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001K10_A300TAS01_DEL_FLG, H001K10_n300TAS01_DEL_FLG, H001K10_A7TAS01_DATA_KIND, H001K10_A8TAS01_ITEM_CD, H001K10_A247TAS01_ITEM_RYAK, H001K10_n247TAS01_ITEM_RYAK, H001K10_A335TAS01_SORT_NO, H001K10_n335TAS01_SORT_NO
            }
            , new Object[] {
            H001K11_A449TBT02_DEL_FLG, H001K11_n449TBT02_DEL_FLG, H001K11_A935TBT02_CRF_EDA_NO, H001K11_A91TBT02_CRF_ID, H001K11_A89TBT02_STUDY_ID, H001K11_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            H001K12_A441TBT01_DEL_FLG, H001K12_n441TBT01_DEL_FLG, H001K12_A698TBT01_SITE_ID, H001K12_n698TBT01_SITE_ID, H001K12_A87TBT01_STUDY_ID, H001K12_A88TBT01_SUBJECT_ID
            }
            , new Object[] {
            H001K13_A572TBM34_DEL_FLG, H001K13_n572TBM34_DEL_FLG, H001K13_A571TBM34_DISPLAY_FLG, H001K13_n571TBM34_DISPLAY_FLG, H001K13_A29TBM34_CRF_ID, H001K13_A30TBM34_STYDY_AUTH_CD, H001K13_A28TBM34_STUDY_ID
            }
            , new Object[] {
            H001K14_A369TBM21_DEL_FLG, H001K14_n369TBM21_DEL_FLG, H001K14_A63TBM21_STUDY_ID, H001K14_A607TBM21_STATUS, H001K14_n607TBM21_STATUS
            }
            , new Object[] {
            H001K15_A935TBT02_CRF_EDA_NO, H001K15_A91TBT02_CRF_ID, H001K15_A90TBT02_SUBJECT_ID, H001K15_A89TBT02_STUDY_ID, H001K15_A498TBT02_CRF_LATEST_VERSION, H001K15_n498TBT02_CRF_LATEST_VERSION, H001K15_A456TBT02_UPD_CNT, H001K15_n456TBT02_UPD_CNT, H001K15_A698TBT01_SITE_ID, H001K15_n698TBT01_SITE_ID
            }
            , new Object[] {
            H001K16_A982TBM45_DEL_FLG, H001K16_n982TBM45_DEL_FLG, H001K16_A978TBM45_FILTER_NO, H001K16_A977TBM45_STUDY_ID, H001K16_A981TBM45_IN_CRF_ID, H001K16_n981TBM45_IN_CRF_ID
            }
            , new Object[] {
            H001K17_A449TBT02_DEL_FLG, H001K17_n449TBT02_DEL_FLG, H001K17_A90TBT02_SUBJECT_ID, H001K17_A89TBT02_STUDY_ID, H001K17_A91TBT02_CRF_ID, H001K17_A935TBT02_CRF_EDA_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV137Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV134Pgmdesc = "CRF��������" ;
      /* GeneXus formulas. */
      AV137Pgmname = "B712_WP01_SEARCH_CRF" ;
      AV134Pgmdesc = "CRF��������" ;
      Gx_err = (short)(0) ;
      edtavH_subject_id_Enabled = 0 ;
      edtavCtltam08_site_snm_Enabled = 0 ;
      edtavCtltbt01_subject_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltas01_item_ryak_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV19P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV19P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte GRID4_nEOF ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte AV82W_TBT02_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte AV15H_POPUP_ERR_CD ;
   private byte AV40W_ERR_CD ;
   private byte AV152GXLvl921 ;
   private byte AV63W_SUBJECT_ID_CNT ;
   private byte GXv_int3[] ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backstyle ;
   private byte GRID2_nEOF ;
   private byte GRID3_nEOF ;
   private short nRC_GXsfl_96 ;
   private short nGXsfl_96_idx=1 ;
   private short nRC_GXsfl_104 ;
   private short nGXsfl_104_idx=1 ;
   private short nRC_GXsfl_115 ;
   private short nGXsfl_115_idx=1 ;
   private short nRC_GXsfl_154 ;
   private short nGXsfl_154_idx=1 ;
   private short A978TBM45_FILTER_NO ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A335TAS01_SORT_NO ;
   private short A29TBM34_CRF_ID ;
   private short AV67W_TBM31_CRF_ID ;
   private short AV81W_TBT02_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV130GXV11 ;
   private short AV120GXV1 ;
   private short AV126GXV7 ;
   private short AV123GXV4 ;
   private short nCmpId ;
   private short AV84D_GROUP ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_96_Refreshing=0 ;
   private short subGrid2_Borderwidth ;
   private short nGXsfl_104_Refreshing=0 ;
   private short subGrid3_Borderwidth ;
   private short nGXsfl_115_Refreshing=0 ;
   private short subGrid4_Borderwidth ;
   private short nGXsfl_154_Refreshing=0 ;
   private short Gx_err ;
   private short AV78H_POPUP_KBN ;
   private short nGXsfl_96_fel_idx=1 ;
   private short nGXsfl_104_fel_idx=1 ;
   private short nGXsfl_115_fel_idx=1 ;
   private short nGXsfl_154_fel_idx=1 ;
   private short AV109W_SUBJECT_LEN ;
   private short AV103W_IX1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int A395TBM31_ORDER ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int A948TBM44_VISIT_NO ;
   private int A88TBT01_SUBJECT_ID ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid4_Islastpage ;
   private int subGrid1_Width ;
   private int subGrid2_Backcoloreven ;
   private int subGrid2_Width ;
   private int subGrid3_Width ;
   private int subGrid4_Width ;
   private int edtavH_subject_id_Enabled ;
   private int edtavCtltam08_site_snm_Enabled ;
   private int edtavCtltbt01_subject_id_Enabled ;
   private int edtavCtltbm31_crf_snm_Enabled ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltas01_item_ryak_Enabled ;
   private int AV86H_SUBJECT_ID ;
   private int AV17H_SUBJECT_ID_SENTAKU ;
   private int tblTbl_hidden_Visible ;
   private int edtavCtltbm31_crf_id_Visible ;
   private int tblTbl_btn_subject_Visible ;
   private int AV144GXV15 ;
   private int AV147GXV16 ;
   private int AV148GXV17 ;
   private int AV149GXV18 ;
   private int AV115W_CHK_SUBJECT_ID ;
   private int AV153GXV19 ;
   private int AV154GXV20 ;
   private int AV155GXV21 ;
   private int GXActiveErrHndl ;
   private int AV163GXV22 ;
   private int AV164GXV23 ;
   private int AV165GXV24 ;
   private int AV166GXV25 ;
   private int AV167GXV26 ;
   private int AV168GXV27 ;
   private int AV169GXV28 ;
   private int AV170GXV29 ;
   private int AV108W_SUBJECT_ID_I ;
   private int AV171GXV30 ;
   private int AV172GXV31 ;
   private int AV173GXV32 ;
   private int AV177GXV33 ;
   private int AV178GXV34 ;
   private int AV179GXV35 ;
   private int imgCrf_open_Visible ;
   private int imgCrf_close_Visible ;
   private int AV180GXV36 ;
   private int AV181GXV37 ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int imgCrf_open_Enabled ;
   private int imgCrf_close_Enabled ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int subGrid4_Rows ;
   private long wcpOAV20P_STUDY_ID ;
   private long AV20P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long A140TBT14_STUDY_ID ;
   private long A977TBM45_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A17TBM22_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long A28TBM34_STUDY_ID ;
   private long AV80W_TBT02_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID4_nRecordCount ;
   private long A63TBM21_STUDY_ID ;
   private long AV70W_TOP_LINE_NO ;
   private long AV38W_CNT ;
   private long AV45W_IDX ;
   private long AV68W_TBM31_STUDY_ID ;
   private long GRID1_nCurrentRecord ;
   private long GRID4_nCurrentRecord ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_96_idx="0001" ;
   private String sGXsfl_104_idx="0001" ;
   private String sGXsfl_115_idx="0001" ;
   private String sGXsfl_154_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV137Pgmname ;
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
   private String edtavCtltas01_item_ryak_Internalname ;
   private String edtavCtltam08_site_snm_Internalname ;
   private String edtavCtltbm31_crf_snm_Internalname ;
   private String edtavCtltbm31_crf_id_Internalname ;
   private String edtavCtltbt01_subject_id_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV134Pgmdesc ;
   private String edtavH_subject_id_Internalname ;
   private String edtavD_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavW_other_site_view_flg_Internalname ;
   private String edtavW_tbm01_sys_value_Internalname ;
   private String edtavW_dm_kbn_Internalname ;
   private String edtavH_popup_err_cd_Internalname ;
   private String edtavH_auto_seni_flg_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavH_subject_id_sentaku_Internalname ;
   private String edtavH_popup_kbn_Internalname ;
   private String edtavH_dmflg_Internalname ;
   private String sGXsfl_96_fel_idx="0001" ;
   private String sGXsfl_104_fel_idx="0001" ;
   private String sGXsfl_115_fel_idx="0001" ;
   private String sGXsfl_154_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String tblTbl_btn_subject_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_delete_subject_exec_Internalname ;
   private String lblTxt_btn_delete_subject_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
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
   private String edtavCtlmax_row_Jsonclick ;
   private String edtavH_subject_id_sentaku_Jsonclick ;
   private String edtavH_popup_kbn_Jsonclick ;
   private String edtavH_dmflg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable14_Internalname ;
   private String subGrid4_Internalname ;
   private String tblTbl_grid_header4_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTable15_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String tblTable5_Internalname ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String tblTable11_Internalname ;
   private String edtavD_subject_id_Jsonclick ;
   private String lblBtn_filter_Internalname ;
   private String lblBtn_filter_Jsonclick ;
   private String tblTable7_Internalname ;
   private String divSection3_Internalname ;
   private String subGrid1_Internalname ;
   private String divSection2_Internalname ;
   private String subGrid2_Internalname ;
   private String divSection1_Internalname ;
   private String subGrid3_Internalname ;
   private String tblTable9_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String tblTable17_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtavH_subject_id_Jsonclick ;
   private String tblTable13_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String imgImage1_Internalname ;
   private String tblTable12_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String tblTable8_Internalname ;
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
   private String lblBtn_chg_subject_site_Internalname ;
   private String lblBtn_chg_subject_site_Jsonclick ;
   private String lblBtn_crf_filter_Internalname ;
   private String lblBtn_crf_filter_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtltam08_site_snm_Jsonclick ;
   private String imgCrf_open_Internalname ;
   private String imgCrf_close_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavCtltbt01_subject_id_Jsonclick ;
   private String imgCrf_open_Jsonclick ;
   private String imgCrf_close_Jsonclick ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavCtltbm31_crf_snm_Jsonclick ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String tblTable16_Internalname ;
   private String edtavCtltas01_item_ryak_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV69W_TBM34_FLG ;
   private boolean AV79W_SIYO_FLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV87D_SUBJECT_CRF_CHK ;
   private boolean AV7D_GRD1_ALL_SEL_FLG ;
   private boolean AV8D_GRD2_ALL_SEL_FLG ;
   private boolean AV9D_GRD3_ALL_SEL_FLG ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean AV43W_ERRFLG ;
   private boolean AV46W_INPCHK_FLG1 ;
   private boolean AV47W_INPCHK_FLG2 ;
   private boolean AV48W_INPCHK_FLG3 ;
   private boolean AV49W_INPCHK_FLG4 ;
   private boolean AV50W_INPCHK_FLG5 ;
   private boolean AV51W_INPCHK_FLG6 ;
   private boolean gx_BV96 ;
   private boolean gx_BV115 ;
   private boolean gx_BV154 ;
   private boolean n626TBM07_DEL_FLG ;
   private boolean n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n395TBM31_ORDER ;
   private boolean n643TBM31_STATUS ;
   private boolean n979TBM31_DM_EXCP_NO_DISP_FLG ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n247TAS01_ITEM_RYAK ;
   private boolean n335TAS01_SORT_NO ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean gx_BV104 ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private boolean AV116W_CHK_CRF_EXIT ;
   private boolean AV114W_CRF_SEL_FLG ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean AV113W_CRF_FLG ;
   private boolean AV94W_SD11_FLG ;
   private boolean AV101W_SD11_CRF_FLG ;
   private String wcpOAV18P_AUTH_CD ;
   private String AV18P_AUTH_CD ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String AV105W_SESSION_KEY_SUBJECT_CRF ;
   private String A982TBM45_DEL_FLG ;
   private String A980TBM45_FILETR_NM ;
   private String AV52W_MEMO_DISP_FLG ;
   private String AV104W_SESSION_KEY_CRF_BASE ;
   private String A981TBM45_IN_CRF_ID ;
   private String AV24W_A821_JS ;
   private String A698TBT01_SITE_ID ;
   private String A50TBM07_AUTH_CD ;
   private String A626TBM07_DEL_FLG ;
   private String A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A320TAM08_SITE_SNM ;
   private String A397TBM31_DEL_FLG ;
   private String A979TBM31_DM_EXCP_NO_DISP_FLG ;
   private String A642TBM31_CRF_SNM ;
   private String A643TBM31_STATUS ;
   private String A7TAS01_DATA_KIND ;
   private String A300TAS01_DEL_FLG ;
   private String A8TAS01_ITEM_CD ;
   private String A247TAS01_ITEM_RYAK ;
   private String A441TBT01_DEL_FLG ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String AV10D_SORT ;
   private String AV11D_SUBJECT_ID ;
   private String AV14H_INIT_FLG ;
   private String AV16H_SRCH_FLG ;
   private String AV59W_OTHER_SITE_VIEW_FLG ;
   private String AV65W_TBM01_SYS_VALUE ;
   private String AV39W_DM_KBN ;
   private String AV13H_AUTO_SENI_FLG ;
   private String AV117H_DMFLG ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String A367TBM21_STUDY_NM ;
   private String AV62W_STUDY_NM ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String AV25W_AUTH_NM ;
   private String AV53W_MSG ;
   private String AV41W_ERR_MSG ;
   private String AV22W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   private String AV88W_DM_KBN_CRF ;
   private String AV76W_SELECT_CD ;
   private String AV66W_TBM22_SITE_ID ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String AV64W_SUBJECT_ID_GET ;
   private String AV56W_OPEN_STUDY_ID ;
   private String AV57W_OPEN_SUBJECT_ID ;
   private String AV77W_OPEN_CRF_ID_EDA_NO ;
   private String AV55W_OPEN_CRF_INPUT_LEVEL ;
   private String AV58W_OPEN_UPD_CNT ;
   private String AV61W_SESSION_KEY ;
   private String AV71W_URL ;
   private String AV42W_ERRCD ;
   private String AV106W_SUBJECT_EDIT ;
   private String AV110W_SUBJECT_VC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.internet.HttpRequest AV44W_HTTPREQUEST ;
   private HTMLChoice cmbavD_sort ;
   private ICheckbox chkavD_grd1_all_sel_flg ;
   private ICheckbox chkavD_grd2_all_sel_flg ;
   private ICheckbox chkavD_grd3_all_sel_flg ;
   private HTMLChoice cmbavD_group ;
   private ICheckbox chkavCtlsel_flg1 ;
   private ICheckbox chkavCtlsel_flg2 ;
   private ICheckbox chkavCtlsel_flg ;
   private ICheckbox chkavD_subject_crf_chk ;
   private ICheckbox chkavCtlsel_flg4 ;
   private IDataStoreProvider pr_default ;
   private long[] H001K2_A63TBM21_STUDY_ID ;
   private String[] H001K2_A367TBM21_STUDY_NM ;
   private boolean[] H001K2_n367TBM21_STUDY_NM ;
   private String[] H001K3_A13TAM04_AUTH_CD ;
   private String[] H001K3_A285TAM04_AUTH_NM ;
   private boolean[] H001K3_n285TAM04_AUTH_NM ;
   private int[] H001K4_A142TBT14_SUBJECT_ID ;
   private short[] H001K4_A198TBT14_MEMO_NO ;
   private String[] H001K4_A479TBT14_DEL_FLG ;
   private boolean[] H001K4_n479TBT14_DEL_FLG ;
   private String[] H001K4_A902TBT14_KANRYO_FLG ;
   private boolean[] H001K4_n902TBT14_KANRYO_FLG ;
   private String[] H001K4_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001K4_n927TBT14_KAKUNIN_FLG ;
   private String[] H001K4_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001K4_n930TBT14_REQUEST_AUTH_CD ;
   private String[] H001K4_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] H001K4_n929TBT14_REQUEST_SITE_ID ;
   private long[] H001K4_A140TBT14_STUDY_ID ;
   private String[] H001K5_A982TBM45_DEL_FLG ;
   private boolean[] H001K5_n982TBM45_DEL_FLG ;
   private long[] H001K5_A977TBM45_STUDY_ID ;
   private String[] H001K5_A980TBM45_FILETR_NM ;
   private boolean[] H001K5_n980TBM45_FILETR_NM ;
   private short[] H001K5_A978TBM45_FILTER_NO ;
   private String[] H001K6_A626TBM07_DEL_FLG ;
   private boolean[] H001K6_n626TBM07_DEL_FLG ;
   private String[] H001K6_A50TBM07_AUTH_CD ;
   private String[] H001K6_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] H001K6_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] H001K7_A377TBM22_DEL_FLG ;
   private boolean[] H001K7_n377TBM22_DEL_FLG ;
   private String[] H001K7_A18TBM22_SITE_ID ;
   private long[] H001K7_A17TBM22_STUDY_ID ;
   private String[] H001K7_A320TAM08_SITE_SNM ;
   private boolean[] H001K7_n320TAM08_SITE_SNM ;
   private short[] H001K8_A69TBM31_CRF_ID ;
   private long[] H001K8_A68TBM31_STUDY_ID ;
   private String[] H001K8_A642TBM31_CRF_SNM ;
   private boolean[] H001K8_n642TBM31_CRF_SNM ;
   private int[] H001K8_A395TBM31_ORDER ;
   private boolean[] H001K8_n395TBM31_ORDER ;
   private String[] H001K8_A643TBM31_STATUS ;
   private boolean[] H001K8_n643TBM31_STATUS ;
   private String[] H001K8_A979TBM31_DM_EXCP_NO_DISP_FLG ;
   private boolean[] H001K8_n979TBM31_DM_EXCP_NO_DISP_FLG ;
   private String[] H001K8_A397TBM31_DEL_FLG ;
   private boolean[] H001K8_n397TBM31_DEL_FLG ;
   private byte[] H001K8_A943TBM31_REPEAT_FLG ;
   private boolean[] H001K8_n943TBM31_REPEAT_FLG ;
   private int[] H001K8_A528TBM31_DEF_VISIT_NO ;
   private boolean[] H001K8_n528TBM31_DEF_VISIT_NO ;
   private long[] H001K9_A945TBM44_STUDY_ID ;
   private short[] H001K9_A946TBM44_CRF_ID ;
   private byte[] H001K9_A947TBM44_CRF_EDA_NO ;
   private int[] H001K9_A948TBM44_VISIT_NO ;
   private boolean[] H001K9_n948TBM44_VISIT_NO ;
   private String[] H001K10_A300TAS01_DEL_FLG ;
   private boolean[] H001K10_n300TAS01_DEL_FLG ;
   private String[] H001K10_A7TAS01_DATA_KIND ;
   private String[] H001K10_A8TAS01_ITEM_CD ;
   private String[] H001K10_A247TAS01_ITEM_RYAK ;
   private boolean[] H001K10_n247TAS01_ITEM_RYAK ;
   private short[] H001K10_A335TAS01_SORT_NO ;
   private boolean[] H001K10_n335TAS01_SORT_NO ;
   private String[] H001K11_A449TBT02_DEL_FLG ;
   private boolean[] H001K11_n449TBT02_DEL_FLG ;
   private byte[] H001K11_A935TBT02_CRF_EDA_NO ;
   private short[] H001K11_A91TBT02_CRF_ID ;
   private long[] H001K11_A89TBT02_STUDY_ID ;
   private int[] H001K11_A90TBT02_SUBJECT_ID ;
   private String[] H001K12_A441TBT01_DEL_FLG ;
   private boolean[] H001K12_n441TBT01_DEL_FLG ;
   private String[] H001K12_A698TBT01_SITE_ID ;
   private boolean[] H001K12_n698TBT01_SITE_ID ;
   private long[] H001K12_A87TBT01_STUDY_ID ;
   private int[] H001K12_A88TBT01_SUBJECT_ID ;
   private String[] H001K13_A572TBM34_DEL_FLG ;
   private boolean[] H001K13_n572TBM34_DEL_FLG ;
   private String[] H001K13_A571TBM34_DISPLAY_FLG ;
   private boolean[] H001K13_n571TBM34_DISPLAY_FLG ;
   private short[] H001K13_A29TBM34_CRF_ID ;
   private String[] H001K13_A30TBM34_STYDY_AUTH_CD ;
   private long[] H001K13_A28TBM34_STUDY_ID ;
   private String[] H001K14_A369TBM21_DEL_FLG ;
   private boolean[] H001K14_n369TBM21_DEL_FLG ;
   private long[] H001K14_A63TBM21_STUDY_ID ;
   private String[] H001K14_A607TBM21_STATUS ;
   private boolean[] H001K14_n607TBM21_STATUS ;
   private byte[] H001K15_A935TBT02_CRF_EDA_NO ;
   private short[] H001K15_A91TBT02_CRF_ID ;
   private int[] H001K15_A90TBT02_SUBJECT_ID ;
   private long[] H001K15_A89TBT02_STUDY_ID ;
   private short[] H001K15_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001K15_n498TBT02_CRF_LATEST_VERSION ;
   private long[] H001K15_A456TBT02_UPD_CNT ;
   private boolean[] H001K15_n456TBT02_UPD_CNT ;
   private String[] H001K15_A698TBT01_SITE_ID ;
   private boolean[] H001K15_n698TBT01_SITE_ID ;
   private String[] H001K16_A982TBM45_DEL_FLG ;
   private boolean[] H001K16_n982TBM45_DEL_FLG ;
   private short[] H001K16_A978TBM45_FILTER_NO ;
   private long[] H001K16_A977TBM45_STUDY_ID ;
   private String[] H001K16_A981TBM45_IN_CRF_ID ;
   private boolean[] H001K16_n981TBM45_IN_CRF_ID ;
   private String[] H001K17_A449TBT02_DEL_FLG ;
   private boolean[] H001K17_n449TBT02_DEL_FLG ;
   private int[] H001K17_A90TBT02_SUBJECT_ID ;
   private long[] H001K17_A89TBT02_STUDY_ID ;
   private short[] H001K17_A91TBT02_CRF_ID ;
   private byte[] H001K17_A935TBT02_CRF_EDA_NO ;
   private com.genexus.webpanels.WebSession AV60W_SESSION ;
   private GxObjectCollection AV32W_B712_SD04_KANI_LIST ;
   private GxObjectCollection AV26W_B712_SD01_SITE_LIST ;
   private GxObjectCollection AV30W_B712_SD03_CRF_LIST ;
   private GxObjectCollection AV28W_B712_SD02_SUBJECT_LIST ;
   private GxObjectCollection AV92SD_B712_SD11_C ;
   private GxObjectCollection AV97W_SD_B712_SD03_C ;
   private GxObjectCollection AV72SD_OPEN_CRF_C ;
   private GxObjectCollection AV89SD_C712_SD10_C ;
   private GxObjectCollection AV111SD_CRF_LIST_SV2 ;
   private GxObjectCollection AV85SD_CRF_LIST_SV ;
   private GxObjectCollection AV102SD_B712_SD11_C2 ;
   private GxObjectCollection AV107W_SUBJECT_ID_C ;
   private GxObjectCollection AV99W_SD_B712_SD03_C2 ;
   private GxObjectCollection AV95SD_B712_SD03_C ;
   private SdtA_PAGING_SDT AV12H_A_PAGING_SDT ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV31W_B712_SD03_CRF_LIST_Item ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV98W_SD_B712_SD03_I ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV112SD_CRF_LIST_SV2_I ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV100W_SD_B712_SD03_I2 ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV96SD_B712_SD03_I ;
   private SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem AV93SD_B712_SD11_I ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV21SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem AV90SD_C712_SD10_I ;
   private SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem AV73SD_OPEN_CRF_I ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem AV27W_B712_SD01_SITE_LIST_Item ;
   private SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem AV29W_B712_SD02_SUBJECT_LIST_Item ;
   private SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem AV33W_B712_SD04_KANI_LIST_Item ;
   private SdtB712_SD05_MULTI_SEL_LIST AV34W_B712_SD05_SEL1 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV35W_B712_SD05_SEL2 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV36W_B712_SD05_SEL3 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV37W_B712_SD05_SEL4 ;
}

final  class b712_wp01_search_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001K7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV59W_OTHER_SITE_VIEW_FLG ,
                                          String A18TBM22_SITE_ID ,
                                          String AV22W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_site_id ,
                                          String A377TBM22_DEL_FLG ,
                                          long AV20P_STUDY_ID ,
                                          long A17TBM22_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [2] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
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
         GXv_int5[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID`" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_H001K8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A643TBM31_STATUS ,
                                          String AV117H_DMFLG ,
                                          String AV88W_DM_KBN_CRF ,
                                          String A979TBM31_DM_EXCP_NO_DISP_FLG ,
                                          long A68TBM31_STUDY_ID ,
                                          long AV20P_STUDY_ID ,
                                          String A397TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int7 ;
      GXv_int7 = new byte [3] ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM`, `TBM31_ORDER`, `TBM31_STATUS`," ;
      scmdbuf = scmdbuf + " `TBM31_DM_EXCP_NO_DISP_FLG`, `TBM31_DEL_FLG`, `TBM31_REPEAT_FLG`, `TBM31_DEF_VISIT_NO`" ;
      scmdbuf = scmdbuf + " FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (( ? = '0') or ( ? = '1' and `TBM31_DM_EXCP_NO_DISP_FLG` <> '1'))" ;
      scmdbuf = scmdbuf + " and (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV117H_DMFLG, "1") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` IN ('0','1'))" ;
      }
      if ( GXutil.strcmp(AV117H_DMFLG, "0") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` IN ('1'))" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_ORDER`" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 5 :
                  return conditional_H001K7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
            case 6 :
                  return conditional_H001K8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001K2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K4", "SELECT `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_DEL_FLG`, `TBT14_KANRYO_FLG`, `TBT14_KAKUNIN_FLG`, `TBT14_REQUEST_AUTH_CD`, `TBT14_REQUEST_SITE_ID`, `TBT14_STUDY_ID` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ?) AND (( `TBT14_REQUEST_AUTH_CD` = ? or `TBT14_REQUEST_AUTH_CD` = 'XX')) AND (`TBT14_REQUEST_SITE_ID` = ?) AND (`TBT14_KAKUNIN_FLG` = '0') AND (`TBT14_KANRYO_FLG` = '0') AND (`TBT14_DEL_FLG` = '0') ORDER BY `TBT14_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K5", "SELECT `TBM45_DEL_FLG`, `TBM45_STUDY_ID`, `TBM45_FILETR_NM`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE (`TBM45_STUDY_ID` = ?) AND (`TBM45_DEL_FLG` = '0') ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K6", "SELECT `TBM07_DEL_FLG`, `TBM07_AUTH_CD`, `TBM07_OTHER_SITE_VIEW_FLG` FROM `TBM07_AUTH_BEHAVIOR` WHERE (`TBM07_AUTH_CD` = ?) AND (`TBM07_DEL_FLG` = '0') ORDER BY `TBM07_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K9", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K10", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_ITEM_RYAK`, `TAS01_SORT_NO` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B08') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_SORT_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K11", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ?) AND (`TBT02_CRF_ID` = ?) AND (`TBT02_CRF_EDA_NO` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K12", "SELECT `TBT01_DEL_FLG`, `TBT01_SITE_ID`, `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE (`TBT01_STUDY_ID` = ?) AND (`TBT01_SITE_ID` = ?) AND (`TBT01_DEL_FLG` = '0') ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001K13", "SELECT `TBM34_DEL_FLG`, `TBM34_DISPLAY_FLG`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_STUDY_ID` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? and `TBM34_STYDY_AUTH_CD` = ?) AND (`TBM34_DISPLAY_FLG` = '0') AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K14", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K15", "SELECT T1.`TBT02_CRF_EDA_NO`, T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, T1.`TBT02_CRF_LATEST_VERSION`, T1.`TBT02_UPD_CNT`, T2.`TBT01_SITE_ID` FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`) WHERE T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ? and T1.`TBT02_CRF_ID` = ? and T1.`TBT02_CRF_EDA_NO` = ? ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_CRF_ID`, T1.`TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K16", "SELECT `TBM45_DEL_FLG`, `TBM45_FILTER_NO`, `TBM45_STUDY_ID`, `TBM45_IN_CRF_ID` FROM `TBM45_CRF_FILETR` WHERE (`TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` = ?) AND (`TBM45_DEL_FLG` = '0') ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001K17", "SELECT `TBT02_DEL_FLG`, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 20);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 5 :
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
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

